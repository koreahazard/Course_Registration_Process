package com.hyoungjun.Course_Registration_Process.lecture.controller;

import com.hyoungjun.Course_Registration_Process.lecture.dto.requestDto.LectureCreateDto;
import com.hyoungjun.Course_Registration_Process.lecture.entity.Lecture;
import com.hyoungjun.Course_Registration_Process.lecture.service.LectureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@RestController
@RequestMapping("lecture")
public class LectureController {
    private final LectureService lectureService;
    @GetMapping
    public ResponseEntity<List<Lecture>> getLecture(@RequestParam(name="id",required = false) Long id) {
        if (Objects.isNull(id)) {
            return ResponseEntity.status(HttpStatus.OK).body(lectureService.getLectureList());
        } else {
            /**
             *  내가 해야될 곳
             *  getLectureById...
             */

            Lecture lecture = lectureService.getLectureById(id);
            if (!Objects.isNull(lecture)) {
                List<Lecture> lectureList = List.of(lecture);
                return ResponseEntity.status(HttpStatus.OK).body(lectureList);
            }

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
    @PostMapping("/create")
    public ResponseEntity<String> createLecture(@RequestBody LectureCreateDto lectureCreateDto) {
        if(lectureService.createLecture(lectureCreateDto)) {
            return ResponseEntity.status(HttpStatus.CREATED).body("created");

        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("rejected");
    }


}
