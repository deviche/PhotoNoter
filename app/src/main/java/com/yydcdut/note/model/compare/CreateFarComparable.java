package com.yydcdut.note.model.compare;

import com.yydcdut.note.entity.PhotoNote;

import java.util.Comparator;

/**
 * Created by yuyidong on 15/7/23.
 */
class CreateFarComparable implements Comparator<PhotoNote> {
    @Override
    public int compare(PhotoNote lhs, PhotoNote rhs) {
        return (-(int) (lhs.getCreatedPhotoTime() - rhs.getCreatedPhotoTime()));
    }
}
