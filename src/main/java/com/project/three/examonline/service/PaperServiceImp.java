package com.project.three.examonline.service;

import com.project.three.examonline.dao.PaperMapper;
import com.project.three.examonline.dao.QuestionMapper;
import com.project.three.examonline.domain.Paper;
import com.project.three.examonline.domain.PaperQuestion;
import com.project.three.examonline.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImp implements PaperService {
  @Autowired
  private PaperMapper paperMapper;
  @Autowired
  private QuestionMapper questionMapper;
  @Override
  public void insertPaper(Paper paper) {
    //新的试卷没有试题，自动生成试题
    PaperQuestion pq = new PaperQuestion(paper.getId(), generatePaper(paper.getCourseId()));
    paperMapper.updateQuestion(pq);
    paperMapper.insertPaper(paper);
  }

  @Override
  public void deletePaper(Paper paper) {
    paperMapper.deletePaper(paper);
  }

  @Override
  public void updatePaper(Paper paper) {
    if(paperMapper.queryQuestion(paper.getId())==null){
      //新试卷没有试题自动生成一份试题，更新
      PaperQuestion pq = new PaperQuestion(paper.getId(), generatePaper(paper.getCourseId()));
      paperMapper.updateQuestion(pq);
    }
    paperMapper.updatePaper(paper);
  }

  @Override
  public List<Paper> queryPaper(Paper paper) {
   return paperMapper.queryPaper(paper);
  }

  @Override
  public void updateQuestion(PaperQuestion paperquestion) {
    //paper是paperquestion对应的paper。
    Paper paper = paperMapper.queryPaper(
        new Paper(paperquestion.getPaper(), null, null, null, null)).get(0);
    //设置新试题。
    paperquestion.setQuestion(generatePaper(paper.getCourseId()));
  }
  private String generatePaper(Integer course){
    StringBuilder question = new StringBuilder();
    List<Question> questions1 = questionMapper.queryQuestion(new Question(null,"single","exam",
        null,null,null,null,null,course,null));
    assert questions1.size()>=10;
    for(int i=0; i<10; i++){
      questions1.get(i).setPurpose("practice");
      question.append(questions1.get(i));
      question.append("=::=");  //questionId的分隔符就是"=::="
    }
    List<Question> questions2 = questionMapper.queryQuestion(new Question(null,"subjective","exam",
        null,null,null,null,null,course,null));
    assert questions2.size()>=5;
    for(int i=0; i<5; i++){
      questions2.get(i).setPurpose("practice");
      question.append(questions2.get(i));
      question.append("=::=");
    }
    question.subSequence(0,question.length()-4);
    return String.valueOf(question);
  }
}
