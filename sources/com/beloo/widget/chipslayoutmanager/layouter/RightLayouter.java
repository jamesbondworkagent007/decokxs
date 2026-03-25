package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import android.view.View;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class RightLayouter extends AbstractLayouter {
    private boolean isPurged;

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public boolean isReverseOrder() {
        return false;
    }

    private RightLayouter(Builder builder) {
        super(builder);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public Rect createViewRect(View view) {
        int i = this.viewLeft;
        Rect rect = new Rect(i, this.viewTop, getCurrentViewWidth() + i, this.viewTop + getCurrentViewHeight());
        int i2 = rect.bottom;
        this.viewBottom = i2;
        this.viewTop = i2;
        this.viewRight = Math.max(this.viewRight, rect.right);
        return rect;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public void onPreLayout() {
        if (this.rowViews.isEmpty()) {
            return;
        }
        if (!this.isPurged) {
            this.isPurged = true;
            getCacheStorage().purgeCacheFromPosition(getLayoutManager().getPosition((View) this.rowViews.get(0).second));
        }
        getCacheStorage().storeRow(this.rowViews);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public void onAfterLayout() {
        this.viewLeft = getViewRight();
        this.viewTop = getCanvasTopBorder();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public boolean isAttachedViewFromNewRow(View view) {
        return this.viewRight <= getLayoutManager().getDecoratedLeft(view) && getLayoutManager().getDecoratedTop(view) < this.viewTop;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public void onInterceptAttachView(View view) {
        this.viewTop = getLayoutManager().getDecoratedBottom(view);
        this.viewLeft = getLayoutManager().getDecoratedLeft(view);
        this.viewRight = Math.max(this.viewRight, getLayoutManager().getDecoratedRight(view));
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public int getStartRowBorder() {
        return getViewLeft();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public int getEndRowBorder() {
        return getViewRight();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public int getRowLength() {
        return this.viewTop - getCanvasTopBorder();
    }

    public static final class Builder extends AbstractLayouter.Builder {
        private Builder() {
        }

        /* JADX DEBUG: Method merged with bridge method: createLayouter()Lcom/beloo/widget/chipslayoutmanager/layouter/AbstractLayouter; */
        @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter.Builder
        public RightLayouter createLayouter() {
            return new RightLayouter(this);
        }
    }
}
