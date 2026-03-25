package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes21.dex */
class TopGravityModifier implements IGravityModifier {
    @Override // com.beloo.widget.chipslayoutmanager.gravity.IGravityModifier
    public Rect modifyChildRect(int i, int i2, Rect rect) {
        if (rect.left < i) {
            throw new IllegalArgumentException("top point of input rect can't be lower than minTop");
        }
        if (rect.right > i2) {
            throw new IllegalArgumentException("bottom point of input rect can't be bigger than maxTop");
        }
        Rect rect2 = new Rect(rect);
        int i3 = rect2.top;
        if (i3 > i) {
            rect2.bottom -= i3 - i;
            rect2.top = i;
        }
        return rect2;
    }
}
