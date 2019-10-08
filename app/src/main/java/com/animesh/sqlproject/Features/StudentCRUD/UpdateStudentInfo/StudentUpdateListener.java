package com.animesh.sqlproject.Features.StudentCRUD.UpdateStudentInfo;

import com.animesh.sqlproject.Features.StudentCRUD.CreateStudent.Student;

public interface StudentUpdateListener {
    void onStudentInfoUpdated(Student student, int position);
}
