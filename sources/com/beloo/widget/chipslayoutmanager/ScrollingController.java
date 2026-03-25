package com.beloo.widget.chipslayoutmanager;

import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.layouter.ICanvas;
import com.beloo.widget.chipslayoutmanager.layouter.IStateFactory;

/* JADX INFO: loaded from: classes21.dex */
abstract class ScrollingController implements IScrollingController {
    ICanvas canvas;
    private ChipsLayoutManager lm;
    private IScrollerListener scrollerListener;
    private IStateFactory stateFactory;

    public interface IScrollerListener {
        void onScrolled(IScrollingController iScrollingController, RecyclerView.Recycler recycler, RecyclerView.State state);
    }

    public abstract void offsetChildren(int i);

    public ScrollingController(ChipsLayoutManager chipsLayoutManager, IStateFactory iStateFactory, IScrollerListener iScrollerListener) {
        this.lm = chipsLayoutManager;
        this.scrollerListener = iScrollerListener;
        this.stateFactory = iStateFactory;
        this.canvas = chipsLayoutManager.getCanvas();
    }

    public final int calculateEndGap() {
        if (this.lm.getChildCount() == 0 || this.lm.getCompletelyVisibleViewsCount() == this.lm.getItemCount()) {
            return 0;
        }
        int endAfterPadding = this.stateFactory.getEndAfterPadding() - this.stateFactory.getEndViewBound();
        if (endAfterPadding < 0) {
            return 0;
        }
        return endAfterPadding;
    }

    public final int calculateStartGap() {
        int startViewBound;
        if (this.lm.getChildCount() != 0 && (startViewBound = this.stateFactory.getStartViewBound() - this.stateFactory.getStartAfterPadding()) >= 0) {
            return startViewBound;
        }
        return 0;
    }

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public final boolean normalizeGaps(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iCalculateStartGap = calculateStartGap();
        if (iCalculateStartGap > 0) {
            offsetChildren(-iCalculateStartGap);
            return true;
        }
        int iCalculateEndGap = calculateEndGap();
        if (iCalculateEndGap <= 0) {
            return false;
        }
        scrollBy(-iCalculateEndGap, recycler, state);
        return true;
    }

    public final int calcOffset(int i) {
        if (this.lm.getChildCount() == 0) {
            return 0;
        }
        if (i < 0) {
            return onContentScrolledBackward(i);
        }
        if (i > 0) {
            return onContentScrolledForward(i);
        }
        return 0;
    }

    public final int onContentScrolledBackward(int i) {
        AnchorViewState anchor = this.lm.getAnchor();
        if (anchor.getAnchorViewRect() == null) {
            return 0;
        }
        if (anchor.getPosition().intValue() != 0) {
            return i;
        }
        int start = this.stateFactory.getStart(anchor) - this.stateFactory.getStartAfterPadding();
        return start >= 0 ? start : Math.max(start, i);
    }

    public final int onContentScrolledForward(int i) {
        return this.lm.getPosition(this.lm.getChildAt(this.lm.getChildCount() + (-1))) < this.lm.getItemCount() + (-1) ? i : Math.min(this.stateFactory.getEndViewBound() - this.stateFactory.getEndAfterPadding(), i);
    }

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return scrollBy(i, recycler, state);
        }
        return 0;
    }

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollVertically()) {
            return scrollBy(i, recycler, state);
        }
        return 0;
    }

    private int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iCalcOffset = calcOffset(i);
        offsetChildren(-iCalcOffset);
        this.scrollerListener.onScrolled(this, recycler, state);
        return iCalcOffset;
    }

    private int getLaidOutArea() {
        return this.stateFactory.getEndViewBound() - this.stateFactory.getStartViewBound();
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (this.lm.getChildCount() == 0 || state.getItemCount() == 0) {
            return 0;
        }
        int iFindFirstVisibleItemPosition = this.lm.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.lm.findLastVisibleItemPosition();
        int iMax = Math.max(0, iFindFirstVisibleItemPosition);
        if (!this.lm.isSmoothScrollbarEnabled()) {
            return iMax;
        }
        return Math.round((iMax * (getLaidOutArea() / (Math.abs(iFindFirstVisibleItemPosition - iFindLastVisibleItemPosition) + 1))) + (this.stateFactory.getStartAfterPadding() - this.stateFactory.getStartViewBound()));
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (this.lm.getChildCount() == 0 || state.getItemCount() == 0) {
            return 0;
        }
        int iFindFirstVisibleItemPosition = this.lm.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.lm.findLastVisibleItemPosition();
        if (!this.lm.isSmoothScrollbarEnabled()) {
            return Math.abs(iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1;
        }
        return Math.min(this.stateFactory.getTotalSpace(), getLaidOutArea());
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (this.lm.getChildCount() == 0 || state.getItemCount() == 0) {
            return 0;
        }
        if (!this.lm.isSmoothScrollbarEnabled()) {
            return state.getItemCount();
        }
        return (int) ((getLaidOutArea() / (Math.abs(this.lm.findFirstVisibleItemPosition() - this.lm.findLastVisibleItemPosition()) + 1)) * state.getItemCount());
    }

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        if (canScrollVertically()) {
            return computeScrollExtent(state);
        }
        return 0;
    }

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        if (canScrollVertically()) {
            return computeScrollRange(state);
        }
        return 0;
    }

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        if (canScrollVertically()) {
            return computeScrollOffset(state);
        }
        return 0;
    }

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return computeScrollRange(state);
        }
        return 0;
    }

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return computeScrollOffset(state);
        }
        return 0;
    }

    @Override // com.beloo.widget.chipslayoutmanager.IScrollingController
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return computeScrollExtent(state);
        }
        return 0;
    }
}
