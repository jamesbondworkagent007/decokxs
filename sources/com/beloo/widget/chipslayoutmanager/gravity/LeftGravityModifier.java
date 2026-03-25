package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes21.dex */
class LeftGravityModifier implements IGravityModifier {
    @Override // com.beloo.widget.chipslayoutmanager.gravity.IGravityModifier
    public Rect modifyChildRect(int i, int i2, Rect rect) {
        Rect rect2 = new Rect(rect);
        int i3 = rect2.left;
        if (i3 > i) {
            rect2.right -= i3 - i;
            rect2.left = i;
        }
        return rect2;
    }
}
