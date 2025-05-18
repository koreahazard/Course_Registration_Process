package com.hyoungjun.Course_Registration_Process.lecture.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class LectureModifyDto {
    Long lectureId;
    String lectureName;
}
