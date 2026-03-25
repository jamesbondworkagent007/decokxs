package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class LTRRowsCreator implements ILayouterCreator {
    private RecyclerView.LayoutManager layoutManager;

    public LTRRowsCreator(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouterCreator
    public Rect createOffsetRectForBackwardLayouter(AnchorViewState anchorViewState) {
        Rect anchorViewRect = anchorViewState.getAnchorViewRect();
        return new Rect(0, anchorViewRect == null ? 0 : anchorViewRect.top, anchorViewRect == null ? 0 : anchorViewRect.left, anchorViewRect == null ? 0 : anchorViewRect.bottom);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouterCreator
    public Rect createOffsetRectForForwardLayouter(AnchorViewState anchorViewState) {
        int paddingTop;
        int paddingBottom;
        Rect anchorViewRect = anchorViewState.getAnchorViewRect();
        int paddingLeft = anchorViewRect == null ? this.layoutManager.getPaddingLeft() : anchorViewRect.left;
        if (anchorViewRect == null) {
            paddingTop = anchorViewState.getPosition().intValue() == 0 ? this.layoutManager.getPaddingTop() : 0;
        } else {
            paddingTop = anchorViewRect.top;
        }
        if (anchorViewRect == null) {
            paddingBottom = anchorViewState.getPosition().intValue() == 0 ? this.layoutManager.getPaddingBottom() : 0;
        } else {
            paddingBottom = anchorViewRect.bottom;
        }
        return new Rect(paddingLeft, paddingTop, 0, paddingBottom);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouterCreator
    public AbstractLayouter.Builder createBackwardBuilder() {
        return LTRUpLayouter.newBuilder();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouterCreator
    public AbstractLayouter.Builder createForwardBuilder() {
        return LTRDownLayouter.newBuilder();
    }
}
