package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import com.beloo.widget.chipslayoutmanager.IBorder;
import com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage;
import com.beloo.widget.chipslayoutmanager.gravity.IChildGravityResolver;
import com.beloo.widget.chipslayoutmanager.gravity.IGravityModifiersFactory;
import com.beloo.widget.chipslayoutmanager.gravity.IRowStrategy;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.ILayoutRowBreaker;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.IFinishingCriteria;
import com.beloo.widget.chipslayoutmanager.layouter.placer.IPlacer;
import com.beloo.widget.chipslayoutmanager.util.AssertionUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractLayouter implements ILayouter, IBorder {
    private IBorder border;
    private ILayoutRowBreaker breaker;
    private IViewCacheStorage cacheStorage;
    private IChildGravityResolver childGravityResolver;
    private int currentViewHeight;
    private int currentViewPosition;
    private int currentViewWidth;
    private IFinishingCriteria finishingCriteria;
    private IGravityModifiersFactory gravityModifiersFactory;
    private boolean isRowCompleted;
    private ChipsLayoutManager layoutManager;
    private Set<ILayouterListener> layouterListeners;
    private IPlacer placer;
    private AbstractPositionIterator positionIterator;
    private int previousRowSize;
    private IRowStrategy rowStrategy;
    int viewBottom;
    int viewLeft;
    int viewRight;
    int viewTop;
    List<Pair<Rect, View>> rowViews = new LinkedList();
    private int rowSize = 0;

    public abstract Rect createViewRect(View view);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IViewCacheStorage getCacheStorage() {
        return this.cacheStorage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentViewHeight() {
        return this.currentViewHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentViewPosition() {
        return this.currentViewPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentViewWidth() {
        return this.currentViewWidth;
    }

    public abstract int getEndRowBorder();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChipsLayoutManager getLayoutManager() {
        return this.layoutManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouter
    public final int getPreviousRowSize() {
        return this.previousRowSize;
    }

    public abstract int getRowLength();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouter
    public int getRowSize() {
        return this.rowSize;
    }

    public abstract int getStartRowBorder();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouter
    public int getViewBottom() {
        return this.viewBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getViewLeft() {
        return this.viewLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getViewRight() {
        return this.viewRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouter
    public int getViewTop() {
        return this.viewTop;
    }

    public abstract boolean isAttachedViewFromNewRow(View view);

    public abstract boolean isReverseOrder();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isRowCompleted() {
        return this.isRowCompleted;
    }

    public abstract void onAfterLayout();

    public abstract void onInterceptAttachView(View view);

    public abstract void onPreLayout();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouter
    public AbstractPositionIterator positionIterator() {
        return this.positionIterator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFinishingCriteria(@NonNull IFinishingCriteria iFinishingCriteria) {
        this.finishingCriteria = iFinishingCriteria;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPlacer(@NonNull IPlacer iPlacer) {
        this.placer = iPlacer;
    }

    public AbstractLayouter(Builder builder) {
        this.layouterListeners = new HashSet();
        this.layoutManager = builder.layoutManager;
        this.cacheStorage = builder.cacheStorage;
        this.border = builder.border;
        this.childGravityResolver = builder.childGravityResolver;
        this.finishingCriteria = builder.finishingCriteria;
        this.placer = builder.placer;
        this.viewTop = builder.offsetRect.top;
        this.viewBottom = builder.offsetRect.bottom;
        this.viewRight = builder.offsetRect.right;
        this.viewLeft = builder.offsetRect.left;
        this.layouterListeners = builder.layouterListeners;
        this.breaker = builder.breaker;
        this.gravityModifiersFactory = builder.gravityModifiersFactory;
        this.rowStrategy = builder.rowStrategy;
        this.positionIterator = builder.positionIterator;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouter
    public List<Item> getCurrentRowItems() {
        LinkedList linkedList = new LinkedList();
        LinkedList<Pair> linkedList2 = new LinkedList(this.rowViews);
        if (isReverseOrder()) {
            Collections.reverse(linkedList2);
        }
        for (Pair pair : linkedList2) {
            linkedList.add(new Item((Rect) pair.first, this.layoutManager.getPosition((View) pair.second)));
        }
        return linkedList;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouter
    public void addLayouterListener(ILayouterListener iLayouterListener) {
        if (iLayouterListener != null) {
            this.layouterListeners.add(iLayouterListener);
        }
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouter
    public void removeLayouterListener(ILayouterListener iLayouterListener) {
        this.layouterListeners.remove(iLayouterListener);
    }

    private void notifyLayouterListeners() {
        Iterator<ILayouterListener> it = this.layouterListeners.iterator();
        while (it.hasNext()) {
            it.next().onLayoutRow(this);
        }
    }

    private void calculateView(View view) {
        this.currentViewHeight = this.layoutManager.getDecoratedMeasuredHeight(view);
        this.currentViewWidth = this.layoutManager.getDecoratedMeasuredWidth(view);
        this.currentViewPosition = this.layoutManager.getPosition(view);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouter
    public final boolean placeView(View view) {
        this.layoutManager.measureChildWithMargins(view, 0, 0);
        calculateView(view);
        if (canNotBePlacedInCurrentRow()) {
            this.isRowCompleted = true;
            layoutRow();
        }
        if (isFinishedLayouting()) {
            return false;
        }
        this.rowSize++;
        this.rowViews.add(new Pair<>(createViewRect(view), view));
        return true;
    }

    public final boolean isFinishedLayouting() {
        return this.finishingCriteria.isFinishedLayouting(this);
    }

    public final boolean canNotBePlacedInCurrentRow() {
        return this.breaker.isRowBroke(this);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouter
    public final boolean onAttachView(View view) {
        calculateView(view);
        if (isAttachedViewFromNewRow(view)) {
            notifyLayouterListeners();
            this.rowSize = 0;
        }
        onInterceptAttachView(view);
        if (isFinishedLayouting()) {
            return false;
        }
        this.rowSize++;
        this.layoutManager.attachView(view);
        return true;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouter
    public final void layoutRow() {
        onPreLayout();
        if (this.rowViews.size() > 0) {
            this.rowStrategy.applyStrategy(this, getCurrentRowItems());
        }
        for (Pair<Rect, View> pair : this.rowViews) {
            Rect rect = (Rect) pair.first;
            View view = (View) pair.second;
            Rect rectApplyChildGravity = applyChildGravity(view, rect);
            this.placer.addView(view);
            this.layoutManager.layoutDecorated(view, rectApplyChildGravity.left, rectApplyChildGravity.top, rectApplyChildGravity.right, rectApplyChildGravity.bottom);
        }
        onAfterLayout();
        notifyLayouterListeners();
        this.previousRowSize = this.rowSize;
        this.rowSize = 0;
        this.rowViews.clear();
        this.isRowCompleted = false;
    }

    private Rect applyChildGravity(View view, Rect rect) {
        return this.gravityModifiersFactory.getGravityModifier(this.childGravityResolver.getItemGravity(getLayoutManager().getPosition(view))).modifyChildRect(getStartRowBorder(), getEndRowBorder(), rect);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ILayouter
    public Rect getRowRect() {
        return new Rect(getCanvasLeftBorder(), getViewTop(), getCanvasRightBorder(), getViewBottom());
    }

    public final Rect getOffsetRect() {
        return new Rect(this.viewLeft, this.viewTop, this.viewRight, this.viewBottom);
    }

    public static abstract class Builder {
        private IBorder border;
        private ILayoutRowBreaker breaker;
        private IViewCacheStorage cacheStorage;
        private IChildGravityResolver childGravityResolver;
        private IFinishingCriteria finishingCriteria;
        private IGravityModifiersFactory gravityModifiersFactory;
        private ChipsLayoutManager layoutManager;
        private HashSet<ILayouterListener> layouterListeners = new HashSet<>();
        private Rect offsetRect;
        private IPlacer placer;
        private AbstractPositionIterator positionIterator;
        private IRowStrategy rowStrategy;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder cacheStorage(@NonNull IViewCacheStorage iViewCacheStorage) {
            this.cacheStorage = iViewCacheStorage;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder canvas(@NonNull IBorder iBorder) {
            this.border = iBorder;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder childGravityResolver(@NonNull IChildGravityResolver iChildGravityResolver) {
            this.childGravityResolver = iChildGravityResolver;
            return this;
        }

        public abstract AbstractLayouter createLayouter();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder finishingCriteria(@NonNull IFinishingCriteria iFinishingCriteria) {
            this.finishingCriteria = iFinishingCriteria;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder gravityModifiersFactory(@NonNull IGravityModifiersFactory iGravityModifiersFactory) {
            this.gravityModifiersFactory = iGravityModifiersFactory;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder layoutManager(@NonNull ChipsLayoutManager chipsLayoutManager) {
            this.layoutManager = chipsLayoutManager;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder offsetRect(@NonNull Rect rect) {
            this.offsetRect = rect;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder placer(@NonNull IPlacer iPlacer) {
            this.placer = iPlacer;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder positionIterator(AbstractPositionIterator abstractPositionIterator) {
            this.positionIterator = abstractPositionIterator;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder rowStrategy(IRowStrategy iRowStrategy) {
            this.rowStrategy = iRowStrategy;
            return this;
        }

        public final Builder addLayouterListener(@Nullable ILayouterListener iLayouterListener) {
            if (iLayouterListener != null) {
                this.layouterListeners.add(iLayouterListener);
            }
            return this;
        }

        public final Builder breaker(@NonNull ILayoutRowBreaker iLayoutRowBreaker) {
            AssertionUtils.assertNotNull(iLayoutRowBreaker, "breaker shouldn't be null");
            this.breaker = iLayoutRowBreaker;
            return this;
        }

        public final Builder addLayouterListeners(@NonNull List<ILayouterListener> list) {
            this.layouterListeners.addAll(list);
            return this;
        }

        public final AbstractLayouter build() {
            if (this.layoutManager == null) {
                throw new IllegalStateException("layoutManager can't be null, call #layoutManager()");
            }
            if (this.breaker == null) {
                throw new IllegalStateException("breaker can't be null, call #breaker()");
            }
            if (this.border == null) {
                throw new IllegalStateException("border can't be null, call #border()");
            }
            if (this.cacheStorage == null) {
                throw new IllegalStateException("cacheStorage can't be null, call #cacheStorage()");
            }
            if (this.rowStrategy == null) {
                throw new IllegalStateException("rowStrategy can't be null, call #rowStrategy()");
            }
            if (this.offsetRect == null) {
                throw new IllegalStateException("offsetRect can't be null, call #offsetRect()");
            }
            if (this.finishingCriteria == null) {
                throw new IllegalStateException("finishingCriteria can't be null, call #finishingCriteria()");
            }
            if (this.placer == null) {
                throw new IllegalStateException("placer can't be null, call #placer()");
            }
            if (this.gravityModifiersFactory == null) {
                throw new IllegalStateException("gravityModifiersFactory can't be null, call #gravityModifiersFactory()");
            }
            if (this.childGravityResolver == null) {
                throw new IllegalStateException("childGravityResolver can't be null, call #childGravityResolver()");
            }
            if (this.positionIterator == null) {
                throw new IllegalStateException("positionIterator can't be null, call #positionIterator()");
            }
            return createLayouter();
        }
    }

    @Override // com.beloo.widget.chipslayoutmanager.IBorder
    public final int getCanvasRightBorder() {
        return this.border.getCanvasRightBorder();
    }

    @Override // com.beloo.widget.chipslayoutmanager.IBorder
    public final int getCanvasBottomBorder() {
        return this.border.getCanvasBottomBorder();
    }

    @Override // com.beloo.widget.chipslayoutmanager.IBorder
    public final int getCanvasLeftBorder() {
        return this.border.getCanvasLeftBorder();
    }

    @Override // com.beloo.widget.chipslayoutmanager.IBorder
    public final int getCanvasTopBorder() {
        return this.border.getCanvasTopBorder();
    }
}
