package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
class LTRUpLayouter extends AbstractLayouter implements ILayouter {
    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public boolean isReverseOrder() {
        return true;
    }

    private LTRUpLayouter(Builder builder) {
        super(builder);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public Rect createViewRect(View view) {
        Rect rect = new Rect(this.viewRight - getCurrentViewWidth(), this.viewBottom - getCurrentViewHeight(), this.viewRight, this.viewBottom);
        this.viewRight = rect.left;
        return rect;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public void onPreLayout() {
        int canvasLeftBorder = this.viewRight - getCanvasLeftBorder();
        this.viewLeft = 0;
        Iterator<Pair<Rect, View>> it = this.rowViews.iterator();
        while (it.hasNext()) {
            Rect rect = (Rect) it.next().first;
            rect.left -= canvasLeftBorder;
            int i = rect.right - canvasLeftBorder;
            rect.right = i;
            this.viewLeft = Math.max(i, this.viewLeft);
            this.viewTop = Math.min(this.viewTop, rect.top);
            this.viewBottom = Math.max(this.viewBottom, rect.bottom);
        }
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public void onAfterLayout() {
        this.viewRight = getCanvasRightBorder();
        this.viewBottom = this.viewTop;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public boolean isAttachedViewFromNewRow(View view) {
        return this.viewTop >= getLayoutManager().getDecoratedBottom(view) && getLayoutManager().getDecoratedRight(view) > this.viewRight;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter
    public void onInterceptAttachView(View view) {
        if (this.viewRight != getCanvasRightBorder() && this.viewRight - getCurrentViewWidth() < getCanvasLeftBorder()) {
            this.viewRight = getCanvasRightBorder();
            this.viewBottom = this.viewTop;
        } else {
            this.viewRight = getLayoutManager().getDecoratedLeft(view);
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
        return getCanvasRightBorder() - this.viewRight;
    }

    public static final class Builder extends AbstractLayouter.Builder {
        private Builder() {
        }

        /* JADX DEBUG: Method merged with bridge method: createLayouter()Lcom/beloo/widget/chipslayoutmanager/layouter/AbstractLayouter; */
        @Override // com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter.Builder
        public LTRUpLayouter createLayouter() {
            return new LTRUpLayouter(this);
        }
    }
}
