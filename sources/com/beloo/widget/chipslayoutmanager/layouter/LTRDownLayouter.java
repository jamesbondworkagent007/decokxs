package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import android.view.View;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

/* JADX INFO: loaded from: classes21.dex */
class LTRDownLayouter extends AbstractLayouter {
    private boolean isPurged;

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public boolean isReverseOrder() {
        return false;
    }

    private LTRDownLayouter(Builder builder) {
        super(builder);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public Rect createViewRect(View view) {
        int i = this.viewLeft;
        Rect rect = new Rect(i, this.viewTop, getCurrentViewWidth() + i, this.viewTop + getCurrentViewHeight());
        this.viewLeft = rect.right;
        this.viewBottom = Math.max(this.viewBottom, rect.bottom);
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
        this.viewLeft = getCanvasLeftBorder();
        this.viewTop = this.viewBottom;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public boolean isAttachedViewFromNewRow(View view) {
        return this.viewBottom <= getLayoutManager().getDecoratedTop(view) && getLayoutManager().getDecoratedLeft(view) < this.viewLeft;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public void onInterceptAttachView(View view) {
        this.viewTop = getLayoutManager().getDecoratedTop(view);
        this.viewLeft = getLayoutManager().getDecoratedRight(view);
        this.viewBottom = Math.max(this.viewBottom, getLayoutManager().getDecoratedBottom(view));
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public int getStartRowBorder() {
        return getViewTop();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public int getEndRowBorder() {
        return getViewBottom();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public int getRowLength() {
        return this.viewLeft - getCanvasLeftBorder();
    }

    public static final class Builder extends AbstractLayouter.Builder {
        private Builder() {
        }

        /* JADX DEBUG: Method merged with bridge method: createLayouter()Lcom/beloo/widget/chipslayoutmanager/layouter/AbstractLayouter; */
        @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter.Builder
        public LTRDownLayouter createLayouter() {
            return new LTRDownLayouter(this);
        }
    }
}
