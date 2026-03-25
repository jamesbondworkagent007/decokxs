package com.beloo.widget.chipslayoutmanager.gravity;

import android.graphics.Rect;
import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes21.dex */
public interface IGravityModifier {
    Rect modifyChildRect(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, Rect rect);
}
