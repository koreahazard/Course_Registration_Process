package com.hyoungjun.Course_Registration_Process.lecture.service;

import com.hyoungjun.Course_Registration_Process.lecture.dto.requestDto.LectureCreateDto;
import com.hyoungjun.Course_Registration_Process.lecture.entity.Lecture;
import com.hyoungjun.Course_Registration_Process.lecture.repository.LectureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class LectureService {
    private final LectureRepository lectureRepository;

    public List<Lecture> getLectureList() {
        return lectureRepository.getLectureList();
    }
    public Lecture getLectureById(Long id) {
        return lectureRepository.getLectureById(id);
    }

    public boolean createLecture(LectureCreateDto lectureCreateDto) {
        Lecture lecture = lectureRepository.getLectureById(lectureCreateDto.getLectureId());

        if(Objects.isNull(lecture)) {
            //진짜로 만들고
            lectureRepository.addLecture(lectureCreateDto);
            return true;
        }
        return false;
    }
}
