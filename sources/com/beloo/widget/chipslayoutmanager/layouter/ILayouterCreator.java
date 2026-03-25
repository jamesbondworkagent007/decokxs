package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
interface ILayouterCreator {
    AbstractLayouter.Builder createBackwardBuilder();

    AbstractLayouter.Builder createForwardBuilder();

    Rect createOffsetRectForBackwardLayouter(@NonNull AnchorViewState anchorViewState);

    Rect createOffsetRectForForwardLayouter(AnchorViewState anchorViewState);
}
