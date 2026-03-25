package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class ColumnsCreator implements ILayouterCreator {
    private RecyclerView.LayoutManager layoutManager;

    public ColumnsCreator(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouterCreator
    public AbstractLayouter.Builder createBackwardBuilder() {
        return LeftLayouter.newBuilder();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouterCreator
    public AbstractLayouter.Builder createForwardBuilder() {
        return RightLayouter.newBuilder();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouterCreator
    public Rect createOffsetRectForBackwardLayouter(@NonNull AnchorViewState anchorViewState) {
        Rect anchorViewRect = anchorViewState.getAnchorViewRect();
        return new Rect(anchorViewRect == null ? 0 : anchorViewRect.left, 0, anchorViewRect == null ? 0 : anchorViewRect.right, anchorViewRect == null ? 0 : anchorViewRect.top);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouterCreator
    public Rect createOffsetRectForForwardLayouter(@NonNull AnchorViewState anchorViewState) {
        int paddingLeft;
        int paddingRight;
        Rect anchorViewRect = anchorViewState.getAnchorViewRect();
        if (anchorViewRect == null) {
            paddingLeft = anchorViewState.getPosition().intValue() == 0 ? this.layoutManager.getPaddingLeft() : 0;
        } else {
            paddingLeft = anchorViewRect.left;
        }
        int paddingTop = anchorViewRect == null ? this.layoutManager.getPaddingTop() : anchorViewRect.top;
        if (anchorViewRect == null) {
            paddingRight = anchorViewState.getPosition().intValue() == 0 ? this.layoutManager.getPaddingRight() : 0;
        } else {
            paddingRight = anchorViewRect.right;
        }
        return new Rect(paddingLeft, paddingTop, paddingRight, 0);
    }
}
