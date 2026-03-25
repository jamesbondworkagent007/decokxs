package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
class RTLUpLayouter extends AbstractLayouter implements ILayouter {
    private static final String TAG = "RTLUpLayouter";

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public boolean isReverseOrder() {
        return true;
    }

    private RTLUpLayouter(Builder builder) {
        super(builder);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public void onPreLayout() {
        int i = -(getCanvasRightBorder() - this.viewLeft);
        this.viewLeft = this.rowViews.size() > 0 ? Integer.MAX_VALUE : 0;
        Iterator<Pair<Rect, View>> it = this.rowViews.iterator();
        while (it.hasNext()) {
            Rect rect = (Rect) it.next().first;
            int i2 = rect.left - i;
            rect.left = i2;
            rect.right -= i;
            this.viewLeft = Math.min(this.viewLeft, i2);
            this.viewTop = Math.min(this.viewTop, rect.top);
            this.viewBottom = Math.max(this.viewBottom, rect.bottom);
        }
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public void onAfterLayout() {
        this.viewLeft = getCanvasLeftBorder();
        this.viewBottom = this.viewTop;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public boolean isAttachedViewFromNewRow(View view) {
        return this.viewTop >= getLayoutManager().getDecoratedBottom(view) && getLayoutManager().getDecoratedLeft(view) < this.viewLeft;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public Rect createViewRect(View view) {
        int i = this.viewLeft;
        int currentViewWidth = getCurrentViewWidth();
        Rect rect = new Rect(this.viewLeft, this.viewBottom - getCurrentViewHeight(), i + currentViewWidth, this.viewBottom);
        this.viewLeft = rect.right;
        return rect;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public void onInterceptAttachView(View view) {
        if (this.viewLeft != getCanvasLeftBorder() && this.viewLeft + getCurrentViewWidth() > getCanvasRightBorder()) {
            this.viewLeft = getCanvasLeftBorder();
            this.viewBottom = this.viewTop;
        } else {
            this.viewLeft = getLayoutManager().getDecoratedRight(view);
        }
        this.viewTop = Math.min(this.viewTop, getLayoutManager().getDecoratedTop(view));
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
        return getCanvasRightBorder() - this.viewLeft;
    }

    public static final class Builder extends AbstractLayouter.Builder {
        private Builder() {
        }

        /* JADX DEBUG: Method merged with bridge method: createLayouter()Lcom/beloo/widget/chipslayoutmanager/layouter/AbstractLayouter; */
        @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter.Builder
        public RTLUpLayouter createLayouter() {
            return new RTLUpLayouter(this);
        }
    }
}
