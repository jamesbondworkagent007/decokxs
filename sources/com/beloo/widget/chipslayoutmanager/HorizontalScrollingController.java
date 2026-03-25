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
public class HorizontalScrollingController extends ScrollingController implements IScrollingController {
    private ChipsLayoutManager layoutManager;

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public boolean canScrollVertically() {
        return false;
    }

    public HorizontalScrollingController(ChipsLayoutManager chipsLayoutManager, IStateFactory iStateFactory, ScrollingController.IScrollerListener iScrollerListener) {
        super(chipsLayoutManager, iStateFactory, iScrollerListener);
        this.layoutManager = chipsLayoutManager;
    }

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public RecyclerView.SmoothScroller createSmoothScroller(@NonNull Context context, final int i, final int i2, final AnchorViewState anchorViewState) {
        return new LinearSmoothScroller(context) { // from class: com.beloo.widget.chipslayoutmanager.HorizontalScrollingController.1
            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public PointF computeScrollVectorForPosition(int i3) {
                return new PointF(i > anchorViewState.getPosition().intValue() ? 1.0f : -1.0f, 0.0f);
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                super.onTargetFound(view, state, action);
                int paddingLeft = HorizontalScrollingController.this.layoutManager.getPaddingLeft();
                action.update(HorizontalScrollingController.this.layoutManager.getDecoratedLeft(view) - paddingLeft, 0, i2, new LinearInterpolator());
            }
        };
    }

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public boolean canScrollHorizontally() {
        this.canvas.findBorderViews();
        if (this.layoutManager.getChildCount() <= 0) {
            return false;
        }
        int decoratedLeft = this.layoutManager.getDecoratedLeft(this.canvas.getLeftView());
        int decoratedRight = this.layoutManager.getDecoratedRight(this.canvas.getRightView());
        if (this.canvas.getMinPositionOnScreen().intValue() != 0 || this.canvas.getMaxPositionOnScreen().intValue() != this.layoutManager.getItemCount() - 1 || decoratedLeft < this.layoutManager.getPaddingLeft() || decoratedRight > this.layoutManager.getWidth() - this.layoutManager.getPaddingRight()) {
            return this.layoutManager.isScrollingEnabledContract();
        }
        return false;
    }

    @Override // com.beloo.widget.chipslayoutmanager.ScrollingController
    public void offsetChildren(int i) {
        this.layoutManager.offsetChildrenHorizontal(i);
    }
}
