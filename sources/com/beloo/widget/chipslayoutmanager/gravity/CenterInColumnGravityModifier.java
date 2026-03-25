package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes21.dex */
class CenterInColumnGravityModifier implements IGravityModifier {
    @Override // com.beloo.widget.chipslayoutmanager.gravity.IGravityModifier
    public Rect modifyChildRect(int i, int i2, Rect rect) {
        Rect rect2 = new Rect(rect);
        int i3 = ((i2 - i) - (rect2.right - rect2.left)) / 2;
        rect2.left = i + i3;
        rect2.right = i2 - i3;
        return rect2;
    }
}
