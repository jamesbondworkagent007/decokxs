package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
class LeftLayouter extends AbstractLayouter {
    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public boolean isReverseOrder() {
        return true;
    }

    private LeftLayouter(Builder builder) {
        super(builder);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public Rect createViewRect(View view) {
        Rect rect = new Rect(this.viewRight - getCurrentViewWidth(), this.viewBottom - getCurrentViewHeight(), this.viewRight, this.viewBottom);
        this.viewBottom = rect.top;
        return rect;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public void onPreLayout() {
        int canvasTopBorder = this.viewBottom - getCanvasTopBorder();
        this.viewBottom = 0;
        Iterator<Pair<Rect, View>> it = this.rowViews.iterator();
        while (it.hasNext()) {
            Rect rect = (Rect) it.next().first;
            rect.top -= canvasTopBorder;
            int i = rect.bottom - canvasTopBorder;
            rect.bottom = i;
            this.viewBottom = Math.max(this.viewBottom, i);
            this.viewLeft = Math.min(this.viewLeft, rect.left);
            this.viewRight = Math.max(this.viewRight, rect.right);
        }
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public void onAfterLayout() {
        this.viewBottom = getCanvasBottomBorder();
        this.viewRight = this.viewLeft;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public boolean isAttachedViewFromNewRow(View view) {
        return this.viewLeft >= getLayoutManager().getDecoratedRight(view) && getLayoutManager().getDecoratedBottom(view) > this.viewBottom;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public void onInterceptAttachView(View view) {
        if (this.viewBottom != getCanvasBottomBorder() && this.viewBottom - getCurrentViewHeight() < getCanvasTopBorder()) {
            this.viewBottom = getCanvasBottomBorder();
            this.viewRight = this.viewLeft;
        } else {
            this.viewBottom = getLayoutManager().getDecoratedTop(view);
        }
        this.viewLeft = Math.min(this.viewLeft, getLayoutManager().getDecoratedLeft(view));
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
        return this.viewBottom - getCanvasTopBorder();
    }

    public static final class Builder extends AbstractLayouter.Builder {
        private Builder() {
        }

        /* JADX DEBUG: Method merged with bridge method: createLayouter()Lcom/beloo/widget/chipslayoutmanager/layouter/AbstractLayouter; */
        @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter.Builder
        public LeftLayouter createLayouter() {
            return new LeftLayouter(this);
        }
    }
}
