package com.beloo.widget.chipslayoutmanager;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.ScrollingController;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.layouter.IStateFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes21.dex */
public class VerticalScrollingController extends ScrollingController implements IScrollingController {
    private ChipsLayoutManager lm;

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public boolean canScrollHorizontally() {
        return false;
    }

    public VerticalScrollingController(ChipsLayoutManager chipsLayoutManager, IStateFactory iStateFactory, ScrollingController.IScrollerListener iScrollerListener) {
        super(chipsLayoutManager, iStateFactory, iScrollerListener);
        this.lm = chipsLayoutManager;
    }

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public RecyclerView.SmoothScroller createSmoothScroller(@NonNull Context context, final int i, final int i2, final AnchorViewState anchorViewState) {
        return new LinearSmoothScroller(context) { // from class: com.beloo.widget.chipslayoutmanager.VerticalScrollingController.1
            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public PointF computeScrollVectorForPosition(int i3) {
                return new PointF(0.0f, i > anchorViewState.getPosition().intValue() ? 1.0f : -1.0f);
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                super.onTargetFound(view, state, action);
                int paddingTop = VerticalScrollingController.this.lm.getPaddingTop();
                action.update(0, VerticalScrollingController.this.lm.getDecoratedTop(view) - paddingTop, i2, new LinearInterpolator());
            }
        };
    }

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public boolean canScrollVertically() {
        this.canvas.findBorderViews();
        if (this.lm.getChildCount() <= 0) {
            return false;
        }
        int decoratedTop = this.lm.getDecoratedTop(this.canvas.getTopView());
        int decoratedBottom = this.lm.getDecoratedBottom(this.canvas.getBottomView());
        if (this.canvas.getMinPositionOnScreen().intValue() != 0 || this.canvas.getMaxPositionOnScreen().intValue() != this.lm.getItemCount() - 1 || decoratedTop < this.lm.getPaddingTop() || decoratedBottom > this.lm.getHeight() - this.lm.getPaddingBottom()) {
            return this.lm.isScrollingEnabledContract();
        }
        return false;
    }

    @Override // com.beloo.widget.chipslayoutmanager.ScrollingController
    public void offsetChildren(int i) {
        this.lm.offsetChildrenVertical(i);
    }
}
