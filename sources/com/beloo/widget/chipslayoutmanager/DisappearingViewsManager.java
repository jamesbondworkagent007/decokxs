package com.beloo.widget.chipslayoutmanager;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.layouter.ICanvas;
import com.beloo.widget.chipslayoutmanager.layouter.IStateFactory;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
class DisappearingViewsManager implements IDisappearingViewsManager {
    private ICanvas canvas;
    private ChildViewsIterable childViews;
    private int deletingItemsOnScreenCount;
    private IStateFactory stateFactory;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.IDisappearingViewsManager
    public int getDeletingItemsOnScreenCount() {
        return this.deletingItemsOnScreenCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.IDisappearingViewsManager
    public void reset() {
        this.deletingItemsOnScreenCount = 0;
    }

    public DisappearingViewsManager(ICanvas iCanvas, ChildViewsIterable childViewsIterable, IStateFactory iStateFactory) {
        this.canvas = iCanvas;
        this.childViews = childViewsIterable;
        this.stateFactory = iStateFactory;
    }

    public class DisappearingViewsContainer {
        private SparseArray<View> backwardViews = new SparseArray<>();
        private SparseArray<View> forwardViews = new SparseArray<>();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SparseArray<View> getBackwardViews() {
            return this.backwardViews;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SparseArray<View> getForwardViews() {
            return this.forwardViews;
        }

        public DisappearingViewsContainer() {
        }

        public int size() {
            return this.backwardViews.size() + this.forwardViews.size();
        }
    }

    @Override // com.beloo.widget.chipslayoutmanager.IDisappearingViewsManager
    public DisappearingViewsContainer getDisappearingViews(RecyclerView.Recycler recycler) {
        List<RecyclerView.ViewHolder> scrapList = recycler.getScrapList();
        DisappearingViewsContainer disappearingViewsContainer = new DisappearingViewsContainer();
        Iterator<RecyclerView.ViewHolder> it = scrapList.iterator();
        while (it.hasNext()) {
            View view = it.next().itemView;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.isItemRemoved()) {
                if (layoutParams.getViewAdapterPosition() < this.canvas.getMinPositionOnScreen().intValue()) {
                    disappearingViewsContainer.backwardViews.put(layoutParams.getViewAdapterPosition(), view);
                } else if (layoutParams.getViewAdapterPosition() > this.canvas.getMaxPositionOnScreen().intValue()) {
                    disappearingViewsContainer.forwardViews.put(layoutParams.getViewAdapterPosition(), view);
                }
            }
        }
        return disappearingViewsContainer;
    }

    @Override // com.beloo.widget.chipslayoutmanager.IDisappearingViewsManager
    public int calcDisappearingViewsLength(RecyclerView.Recycler recycler) {
        int iConvertPreLayoutPositionToPostLayout;
        Integer numValueOf = Integer.MAX_VALUE;
        Integer numValueOf2 = Integer.MIN_VALUE;
        Iterator<View> it = this.childViews.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) next.getLayoutParams();
            if (!layoutParams.isItemRemoved() && ((iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(layoutParams.getViewLayoutPosition())) < this.canvas.getMinPositionOnScreen().intValue() || iConvertPreLayoutPositionToPostLayout > this.canvas.getMaxPositionOnScreen().intValue())) {
                z = true;
            }
            if (layoutParams.isItemRemoved() || z) {
                this.deletingItemsOnScreenCount++;
                numValueOf = Integer.valueOf(Math.min(numValueOf.intValue(), this.stateFactory.getStart(next)));
                numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), this.stateFactory.getEnd(next)));
            }
        }
        if (numValueOf.intValue() != Integer.MAX_VALUE) {
            return numValueOf2.intValue() - numValueOf.intValue();
        }
        return 0;
    }
}
