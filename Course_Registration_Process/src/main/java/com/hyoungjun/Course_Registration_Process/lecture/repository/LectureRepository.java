package com.hyoungjun.Course_Registration_Process.lecture.repository;

import com.hyoungjun.Course_Registration_Process.lecture.dto.requestDto.LectureCreateDto;
import com.hyoungjun.Course_Registration_Process.lecture.entity.Lecture;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LectureRepository {
    static List<Lecture> lectureList = new ArrayList<>();

    public LectureRepository() {
        lectureList.add(new Lecture(1L,"math"));
        lectureList.add(new Lecture(10L,"english"));
        lectureList.add(new Lecture(20L,"history"));
    }
    public List<Lecture> getLectureList() {
        return lectureList;
    }

    public Lecture getLectureById(Long id) {
        for(Lecture lecture : lectureList){
            if ( id.equals(lecture.getLectureId())) {
                return lecture;
            }
        }
        return null;
    }
    public boolean addLecture(LectureCreateDto lectureCreateDto) {
        lectureList.add(new Lecture(lectureCreateDto.getLectureId(),lectureCreateDto.getLectureName()));
        return true;
    }

}
