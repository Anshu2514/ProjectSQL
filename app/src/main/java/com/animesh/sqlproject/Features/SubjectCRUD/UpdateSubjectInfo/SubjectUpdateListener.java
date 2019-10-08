package com.animesh.sqlproject.Features.SubjectCRUD.UpdateSubjectInfo;

import com.animesh.sqlproject.Features.SubjectCRUD.CreateSubject.Subject;

public interface SubjectUpdateListener {
    void onSubjectInfoUpdate(Subject subject, int position);
}
