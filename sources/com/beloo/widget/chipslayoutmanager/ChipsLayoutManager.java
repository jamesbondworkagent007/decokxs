package com.beloo.widget.chipslayoutmanager;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.DisappearingViewsManager;
import com.beloo.widget.chipslayoutmanager.ScrollingController;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.anchor.IAnchorFactory;
import com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage;
import com.beloo.widget.chipslayoutmanager.cache.ViewCacheFactory;
import com.beloo.widget.chipslayoutmanager.gravity.CenterChildGravity;
import com.beloo.widget.chipslayoutmanager.gravity.CustomGravityResolver;
import com.beloo.widget.chipslayoutmanager.gravity.IChildGravityResolver;
import com.beloo.widget.chipslayoutmanager.layouter.AbstractPositionIterator;
import com.beloo.widget.chipslayoutmanager.layouter.ColumnsStateFactory;
import com.beloo.widget.chipslayoutmanager.layouter.ICanvas;
import com.beloo.widget.chipslayoutmanager.layouter.ILayouter;
import com.beloo.widget.chipslayoutmanager.layouter.IMeasureSupporter;
import com.beloo.widget.chipslayoutmanager.layouter.IStateFactory;
import com.beloo.widget.chipslayoutmanager.layouter.LayouterFactory;
import com.beloo.widget.chipslayoutmanager.layouter.MeasureSupporter;
import com.beloo.widget.chipslayoutmanager.layouter.RowsStateFactory;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.EmptyRowBreaker;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.IRowBreaker;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.AbstractCriteriaFactory;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.InfiniteCriteriaFactory;
import com.beloo.widget.chipslayoutmanager.layouter.placer.PlacerFactory;
import com.beloo.widget.chipslayoutmanager.util.AssertionUtils;
import com.beloo.widget.chipslayoutmanager.util.LayoutManagerUtil;
import com.beloo.widget.chipslayoutmanager.util.log.IFillLogger;
import com.beloo.widget.chipslayoutmanager.util.log.Log;
import com.beloo.widget.chipslayoutmanager.util.log.LoggerFactory;
import com.beloo.widget.chipslayoutmanager.util.testing.EmptySpy;
import com.beloo.widget.chipslayoutmanager.util.testing.ISpy;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class ChipsLayoutManager extends RecyclerView.LayoutManager implements IChipsLayoutManagerContract, IStateHolder, ScrollingController.IScrollerListener {
    private static final int APPROXIMATE_ADDITIONAL_ROWS_COUNT = 5;
    private static final float FAST_SCROLLING_COEFFICIENT = 2.0f;
    public static final int HORIZONTAL = 1;
    private static final int INT_ROW_SIZE_APPROXIMATELY_FOR_CACHE = 10;
    public static final int STRATEGY_CENTER = 5;
    public static final int STRATEGY_CENTER_DENSE = 6;
    public static final int STRATEGY_DEFAULT = 1;
    public static final int STRATEGY_FILL_SPACE = 4;
    public static final int STRATEGY_FILL_VIEW = 2;
    private static final String TAG = "ChipsLayoutManager";
    public static final int VERTICAL = 2;
    private IAnchorFactory anchorFactory;
    private AnchorViewState anchorView;
    private ICanvas canvas;
    private IChildGravityResolver childGravityResolver;
    private IDisappearingViewsManager disappearingViewsManager;
    private boolean isAfterPreLayout;
    private boolean isStrategyAppliedWithLastRow;
    private int orientation;
    private IScrollingController scrollingController;
    private IStateFactory stateFactory;
    private ChildViewsIterable childViews = new ChildViewsIterable(this);
    private SparseArray<View> childViewPositions = new SparseArray<>();
    private boolean isScrollingEnabledContract = true;
    private Integer maxViewsInRow = null;
    private IRowBreaker rowBreaker = new EmptyRowBreaker();
    private int layoutOrientation = 1;
    private int rowStrategy = 1;
    private boolean isSmoothScrollbarEnabled = false;
    private Integer cacheNormalizationPosition = null;
    private SparseArray<View> viewCache = new SparseArray<>();
    private ParcelableContainer container = new ParcelableContainer();
    private boolean isLayoutRTL = false;
    private PlacerFactory placerFactory = new PlacerFactory(this);
    private ISpy spy = new EmptySpy();
    private IFillLogger logger = new LoggerFactory().getFillLogger(this.viewCache);
    private IViewCacheStorage viewPositionsStorage = new ViewCacheFactory(this).createCacheStorage();
    private IMeasureSupporter measureSupporter = new MeasureSupporter(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnchorViewState getAnchor() {
        return this.anchorView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ICanvas getCanvas() {
        return this.canvas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IChildGravityResolver getChildGravityResolver() {
        return this.childGravityResolver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.IChipsLayoutManagerContract
    public Integer getMaxViewsInRow() {
        return this.maxViewsInRow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.IChipsLayoutManagerContract
    public IRowBreaker getRowBreaker() {
        return this.rowBreaker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.IChipsLayoutManagerContract
    public int getRowStrategyType() {
        return this.rowStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IViewCacheStorage getViewPositionsStorage() {
        return this.viewPositionsStorage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.IChipsLayoutManagerContract, com.beloo.widget.chipslayoutmanager.IScrollingContract
    public boolean isScrollingEnabledContract() {
        return this.isScrollingEnabledContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.IScrollingContract
    public boolean isSmoothScrollbarEnabled() {
        return this.isSmoothScrollbarEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isStrategyAppliedWithLastRow() {
        return this.isStrategyAppliedWithLastRow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.IChipsLayoutManagerContract, com.beloo.widget.chipslayoutmanager.IStateHolder
    public int layoutOrientation() {
        return this.layoutOrientation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.IChipsLayoutManagerContract, com.beloo.widget.chipslayoutmanager.IScrollingContract
    public void setScrollingEnabledContract(boolean z) {
        this.isScrollingEnabledContract = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.IScrollingContract
    public void setSmoothScrollbarEnabled(boolean z) {
        this.isSmoothScrollbarEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSpy(ISpy iSpy) {
        this.spy = iSpy;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return true;
    }

    public ChipsLayoutManager(Context context) {
        this.orientation = context.getResources().getConfiguration().orientation;
        setAutoMeasureEnabled(true);
    }

    public static Builder newBuilder(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("you have passed null context to builder");
        }
        return new ChipsLayoutManager(context).new StrategyBuilder();
    }

    @Override // com.beloo.widget.chipslayoutmanager.IChipsLayoutManagerContract
    public void setMaxViewsInRow(@IntRange(from = 1) Integer num) {
        if (num.intValue() < 1) {
            throw new IllegalArgumentException("maxViewsInRow should be positive, but is = " + num);
        }
        this.maxViewsInRow = num;
        onRuntimeLayoutChanges();
    }

    private void onRuntimeLayoutChanges() {
        this.cacheNormalizationPosition = 0;
        this.viewPositionsStorage.purge();
        requestLayoutWithAnimations();
    }

    public class StrategyBuilder extends Builder {
        public StrategyBuilder() {
            super();
        }

        public Builder withLastRow(boolean z) {
            ChipsLayoutManager.this.isStrategyAppliedWithLastRow = z;
            return this;
        }
    }

    public class Builder {
        private Integer gravity;

        private Builder() {
        }

        public Builder setChildGravity(int i) {
            this.gravity = Integer.valueOf(i);
            return this;
        }

        public Builder setGravityResolver(@NonNull IChildGravityResolver iChildGravityResolver) {
            AssertionUtils.assertNotNull(iChildGravityResolver, "gravity resolver couldn't be null");
            ChipsLayoutManager.this.childGravityResolver = iChildGravityResolver;
            return this;
        }

        public Builder setScrollingEnabled(boolean z) {
            ChipsLayoutManager.this.setScrollingEnabledContract(z);
            return this;
        }

        public StrategyBuilder setRowStrategy(int i) {
            ChipsLayoutManager.this.rowStrategy = i;
            return (StrategyBuilder) this;
        }

        public Builder setMaxViewsInRow(@IntRange(from = 1) int i) {
            if (i >= 1) {
                ChipsLayoutManager.this.maxViewsInRow = Integer.valueOf(i);
                return this;
            }
            throw new IllegalArgumentException("maxViewsInRow should be positive, but is = " + i);
        }

        public Builder setRowBreaker(@NonNull IRowBreaker iRowBreaker) {
            AssertionUtils.assertNotNull(iRowBreaker, "breaker couldn't be null");
            ChipsLayoutManager.this.rowBreaker = iRowBreaker;
            return this;
        }

        public Builder setOrientation(@Orientation int i) {
            if (i != 1 && i != 2) {
                return this;
            }
            ChipsLayoutManager.this.layoutOrientation = i;
            return this;
        }

        public ChipsLayoutManager build() {
            if (ChipsLayoutManager.this.childGravityResolver == null) {
                Integer num = this.gravity;
                if (num != null) {
                    ChipsLayoutManager.this.childGravityResolver = new CustomGravityResolver(num.intValue());
                } else {
                    ChipsLayoutManager.this.childGravityResolver = new CenterChildGravity();
                }
            }
            ChipsLayoutManager chipsLayoutManager = ChipsLayoutManager.this;
            chipsLayoutManager.stateFactory = chipsLayoutManager.layoutOrientation == 1 ? new RowsStateFactory(ChipsLayoutManager.this) : new ColumnsStateFactory(ChipsLayoutManager.this);
            ChipsLayoutManager chipsLayoutManager2 = ChipsLayoutManager.this;
            chipsLayoutManager2.canvas = chipsLayoutManager2.stateFactory.createCanvas();
            ChipsLayoutManager chipsLayoutManager3 = ChipsLayoutManager.this;
            chipsLayoutManager3.anchorFactory = chipsLayoutManager3.stateFactory.anchorFactory();
            ChipsLayoutManager chipsLayoutManager4 = ChipsLayoutManager.this;
            chipsLayoutManager4.scrollingController = chipsLayoutManager4.stateFactory.scrollingController();
            ChipsLayoutManager chipsLayoutManager5 = ChipsLayoutManager.this;
            chipsLayoutManager5.anchorView = chipsLayoutManager5.anchorFactory.createNotFound();
            ChipsLayoutManager chipsLayoutManager6 = ChipsLayoutManager.this;
            chipsLayoutManager6.disappearingViewsManager = new DisappearingViewsManager(chipsLayoutManager6.canvas, ChipsLayoutManager.this.childViews, ChipsLayoutManager.this.stateFactory);
            return ChipsLayoutManager.this;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    private void requestLayoutWithAnimations() {
        LayoutManagerUtil.requestLayoutWithAnimations(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        ParcelableContainer parcelableContainer = (ParcelableContainer) parcelable;
        this.container = parcelableContainer;
        this.anchorView = parcelableContainer.getAnchorViewState();
        if (this.orientation != this.container.getOrientation()) {
            int iIntValue = this.anchorView.getPosition().intValue();
            AnchorViewState anchorViewStateCreateNotFound = this.anchorFactory.createNotFound();
            this.anchorView = anchorViewStateCreateNotFound;
            anchorViewStateCreateNotFound.setPosition(Integer.valueOf(iIntValue));
        }
        this.viewPositionsStorage.onRestoreInstanceState(this.container.getPositionsCache(this.orientation));
        this.cacheNormalizationPosition = this.container.getNormalizationPosition(this.orientation);
        String str = TAG;
        Log.d(str, "RESTORE. last cache position before cleanup = " + this.viewPositionsStorage.getLastCachePosition());
        Integer num = this.cacheNormalizationPosition;
        if (num != null) {
            this.viewPositionsStorage.purgeCacheFromPosition(num.intValue());
        }
        this.viewPositionsStorage.purgeCacheFromPosition(this.anchorView.getPosition().intValue());
        Log.d(str, "RESTORE. anchor position =" + this.anchorView.getPosition());
        Log.d(str, "RESTORE. layoutOrientation = " + this.orientation + " normalizationPos = " + this.cacheNormalizationPosition);
        StringBuilder sb = new StringBuilder();
        sb.append("RESTORE. last cache position = ");
        sb.append(this.viewPositionsStorage.getLastCachePosition());
        Log.d(str, sb.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        this.container.putAnchorViewState(this.anchorView);
        this.container.putPositionsCache(this.orientation, this.viewPositionsStorage.onSaveInstanceState());
        this.container.putOrientation(this.orientation);
        String str = TAG;
        Log.d(str, "STORE. last cache position =" + this.viewPositionsStorage.getLastCachePosition());
        Integer lastCachePosition = this.cacheNormalizationPosition;
        if (lastCachePosition == null) {
            lastCachePosition = this.viewPositionsStorage.getLastCachePosition();
        }
        Log.d(str, "STORE. layoutOrientation = " + this.orientation + " normalizationPos = " + lastCachePosition);
        this.container.putNormalizationPosition(this.orientation, lastCachePosition);
        return this.container;
    }

    public int getCompletelyVisibleViewsCount() {
        Iterator<View> it = this.childViews.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.canvas.isFullyVisible(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // com.beloo.widget.chipslayoutmanager.IPositionsContract
    public int findFirstVisibleItemPosition() {
        if (getChildCount() == 0) {
            return -1;
        }
        return this.canvas.getMinPositionOnScreen().intValue();
    }

    @Override // com.beloo.widget.chipslayoutmanager.IPositionsContract
    public int findFirstCompletelyVisibleItemPosition() {
        for (View view : this.childViews) {
            Rect viewRect = this.canvas.getViewRect(view);
            if (this.canvas.isFullyVisible(viewRect) && this.canvas.isInside(viewRect)) {
                return getPosition(view);
            }
        }
        return -1;
    }

    @Override // com.beloo.widget.chipslayoutmanager.IPositionsContract
    public int findLastVisibleItemPosition() {
        if (getChildCount() == 0) {
            return -1;
        }
        return this.canvas.getMaxPositionOnScreen().intValue();
    }

    @Override // com.beloo.widget.chipslayoutmanager.IPositionsContract
    public int findLastCompletelyVisibleItemPosition() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.canvas.isFullyVisible(this.canvas.getViewRect(childAt)) && this.canvas.isInside(childAt)) {
                return getPosition(childAt);
            }
        }
        return -1;
    }

    public View getChildWithPosition(int i) {
        return this.childViewPositions.get(i);
    }

    @Override // com.beloo.widget.chipslayoutmanager.IStateHolder
    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getItemCount() {
        return super.getItemCount() + this.disappearingViewsManager.getDeletingItemsOnScreenCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        this.spy.onLayoutChildren(recycler, state);
        String str = TAG;
        Log.d(str, "onLayoutChildren. State =" + state);
        if (getItemCount() == 0) {
            detachAndScrapAttachedViews(recycler);
            return;
        }
        Log.i("onLayoutChildren", "isPreLayout = " + state.isPreLayout(), 4);
        if (isLayoutRTL() != this.isLayoutRTL) {
            this.isLayoutRTL = isLayoutRTL();
            detachAndScrapAttachedViews(recycler);
        }
        calcRecyclerCacheSize(recycler);
        if (state.isPreLayout()) {
            int iCalcDisappearingViewsLength = this.disappearingViewsManager.calcDisappearingViewsLength(recycler);
            Log.d("LayoutManager", "height =" + getHeight(), 4);
            Log.d("onDeletingHeightCalc", "additional height  = " + iCalcDisappearingViewsLength, 4);
            AnchorViewState anchor = this.anchorFactory.getAnchor();
            this.anchorView = anchor;
            this.anchorFactory.resetRowCoordinates(anchor);
            Log.w(str, "anchor state in pre-layout = " + this.anchorView);
            detachAndScrapAttachedViews(recycler);
            AbstractCriteriaFactory abstractCriteriaFactoryCreateDefaultFinishingCriteriaFactory = this.stateFactory.createDefaultFinishingCriteriaFactory();
            abstractCriteriaFactoryCreateDefaultFinishingCriteriaFactory.setAdditionalRowsCount(5);
            abstractCriteriaFactoryCreateDefaultFinishingCriteriaFactory.setAdditionalLength(iCalcDisappearingViewsLength);
            LayouterFactory layouterFactoryCreateLayouterFactory = this.stateFactory.createLayouterFactory(abstractCriteriaFactoryCreateDefaultFinishingCriteriaFactory, this.placerFactory.createRealPlacerFactory());
            this.logger.onBeforeLayouter(this.anchorView);
            fill(recycler, layouterFactoryCreateLayouterFactory.getBackwardLayouter(this.anchorView), layouterFactoryCreateLayouterFactory.getForwardLayouter(this.anchorView));
            this.isAfterPreLayout = true;
        } else {
            detachAndScrapAttachedViews(recycler);
            this.viewPositionsStorage.purgeCacheFromPosition(this.anchorView.getPosition().intValue());
            if (this.cacheNormalizationPosition != null && this.anchorView.getPosition().intValue() <= this.cacheNormalizationPosition.intValue()) {
                this.cacheNormalizationPosition = null;
            }
            AbstractCriteriaFactory abstractCriteriaFactoryCreateDefaultFinishingCriteriaFactory2 = this.stateFactory.createDefaultFinishingCriteriaFactory();
            abstractCriteriaFactoryCreateDefaultFinishingCriteriaFactory2.setAdditionalRowsCount(5);
            LayouterFactory layouterFactoryCreateLayouterFactory2 = this.stateFactory.createLayouterFactory(abstractCriteriaFactoryCreateDefaultFinishingCriteriaFactory2, this.placerFactory.createRealPlacerFactory());
            ILayouter backwardLayouter = layouterFactoryCreateLayouterFactory2.getBackwardLayouter(this.anchorView);
            ILayouter forwardLayouter = layouterFactoryCreateLayouterFactory2.getForwardLayouter(this.anchorView);
            fill(recycler, backwardLayouter, forwardLayouter);
            if (this.scrollingController.normalizeGaps(recycler, null)) {
                Log.d(str, "normalize gaps");
                this.anchorView = this.anchorFactory.getAnchor();
                requestLayoutWithAnimations();
            }
            if (this.isAfterPreLayout) {
                layoutDisappearingViews(recycler, backwardLayouter, forwardLayouter);
            }
            this.isAfterPreLayout = false;
        }
        this.disappearingViewsManager.reset();
        if (state.isMeasuring()) {
            return;
        }
        this.measureSupporter.onSizeChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachAndScrapAttachedViews(RecyclerView.Recycler recycler) {
        super.detachAndScrapAttachedViews(recycler);
        this.childViewPositions.clear();
    }

    private void layoutDisappearingViews(RecyclerView.Recycler recycler, @NonNull ILayouter iLayouter, ILayouter iLayouter2) {
        LayouterFactory layouterFactoryCreateLayouterFactory = this.stateFactory.createLayouterFactory(new InfiniteCriteriaFactory(), this.placerFactory.createDisappearingPlacerFactory());
        DisappearingViewsManager.DisappearingViewsContainer disappearingViews = this.disappearingViewsManager.getDisappearingViews(recycler);
        if (disappearingViews.size() > 0) {
            Log.d("disappearing views", "count = " + disappearingViews.size());
            Log.d("fill disappearing views", "");
            ILayouter iLayouterBuildForwardLayouter = layouterFactoryCreateLayouterFactory.buildForwardLayouter(iLayouter2);
            for (int i = 0; i < disappearingViews.getForwardViews().size(); i++) {
                iLayouterBuildForwardLayouter.placeView(recycler.getViewForPosition(disappearingViews.getForwardViews().keyAt(i)));
            }
            iLayouterBuildForwardLayouter.layoutRow();
            ILayouter iLayouterBuildBackwardLayouter = layouterFactoryCreateLayouterFactory.buildBackwardLayouter(iLayouter);
            for (int i2 = 0; i2 < disappearingViews.getBackwardViews().size(); i2++) {
                iLayouterBuildBackwardLayouter.placeView(recycler.getViewForPosition(disappearingViews.getBackwardViews().keyAt(i2)));
            }
            iLayouterBuildBackwardLayouter.layoutRow();
        }
    }

    private void fillCache() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            this.viewCache.put(getPosition(childAt), childAt);
        }
    }

    private void fill(RecyclerView.Recycler recycler, ILayouter iLayouter, ILayouter iLayouter2) {
        int iIntValue = this.anchorView.getPosition().intValue();
        fillCache();
        for (int i = 0; i < this.viewCache.size(); i++) {
            detachView(this.viewCache.valueAt(i));
        }
        int i2 = iIntValue - 1;
        this.logger.onStartLayouter(i2);
        if (this.anchorView.getAnchorViewRect() != null) {
            fillWithLayouter(recycler, iLayouter, i2);
        }
        this.logger.onStartLayouter(iIntValue);
        fillWithLayouter(recycler, iLayouter2, iIntValue);
        this.logger.onAfterLayouter();
        for (int i3 = 0; i3 < this.viewCache.size(); i3++) {
            removeAndRecycleView(this.viewCache.valueAt(i3), recycler);
            this.logger.onRemovedAndRecycled(i3);
        }
        this.canvas.findBorderViews();
        buildChildWithPositionsMap();
        this.viewCache.clear();
        this.logger.onAfterRemovingViews();
    }

    private void buildChildWithPositionsMap() {
        this.childViewPositions.clear();
        for (View view : this.childViews) {
            this.childViewPositions.put(getPosition(view), view);
        }
    }

    private void fillWithLayouter(RecyclerView.Recycler recycler, ILayouter iLayouter, int i) {
        if (i < 0) {
            return;
        }
        AbstractPositionIterator abstractPositionIteratorPositionIterator = iLayouter.positionIterator();
        abstractPositionIteratorPositionIterator.move(i);
        while (true) {
            if (!abstractPositionIteratorPositionIterator.hasNext()) {
                break;
            }
            int iIntValue = abstractPositionIteratorPositionIterator.next().intValue();
            View view = this.viewCache.get(iIntValue);
            if (view == null) {
                try {
                    View viewForPosition = recycler.getViewForPosition(iIntValue);
                    this.logger.onItemRequested();
                    if (!iLayouter.placeView(viewForPosition)) {
                        recycler.recycleView(viewForPosition);
                        this.logger.onItemRecycled();
                        break;
                    }
                } catch (IndexOutOfBoundsException unused) {
                }
            } else if (!iLayouter.onAttachView(view)) {
                break;
            } else {
                this.viewCache.remove(iIntValue);
            }
        }
        this.logger.onFinishedLayouter();
        iLayouter.layoutRow();
    }

    private void calcRecyclerCacheSize(RecyclerView.Recycler recycler) {
        recycler.setViewCacheSize((int) ((this.maxViewsInRow == null ? 10 : r0.intValue()) * FAST_SCROLLING_COEFFICIENT));
    }

    private void performNormalizationIfNeeded() {
        if (this.cacheNormalizationPosition == null || getChildCount() <= 0) {
            return;
        }
        int position = getPosition(getChildAt(0));
        if (position < this.cacheNormalizationPosition.intValue() || (this.cacheNormalizationPosition.intValue() == 0 && this.cacheNormalizationPosition.intValue() == position)) {
            Log.d("normalization", "position = " + this.cacheNormalizationPosition + " top view position = " + position);
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("cache purged from position ");
            sb.append(position);
            Log.d(str, sb.toString());
            this.viewPositionsStorage.purgeCacheFromPosition(position);
            this.cacheNormalizationPosition = null;
            requestLayoutWithAnimations();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(int i, int i2) {
        this.measureSupporter.measure(i, i2);
        Log.i(TAG, "measured dimension = " + i2);
        super.setMeasuredDimension(this.measureSupporter.getMeasuredWidth(), this.measureSupporter.getMeasuredHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        if (adapter != null && this.measureSupporter.isRegistered()) {
            try {
                this.measureSupporter.setRegistered(false);
                adapter.unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver) this.measureSupporter);
            } catch (IllegalStateException unused) {
            }
        }
        if (adapter2 != null) {
            this.measureSupporter.setRegistered(true);
            adapter2.registerAdapterDataObserver((RecyclerView.AdapterDataObserver) this.measureSupporter);
        }
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        Log.d("onItemsRemoved", "starts from = " + i + ", item count = " + i2, 1);
        super.onItemsRemoved(recyclerView, i, i2);
        onLayoutUpdatedFromPosition(i);
        this.measureSupporter.onItemsRemoved(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        Log.d("onItemsAdded", "starts from = " + i + ", item count = " + i2, 1);
        super.onItemsAdded(recyclerView, i, i2);
        onLayoutUpdatedFromPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        Log.d("onItemsChanged", "", 1);
        super.onItemsChanged(recyclerView);
        this.viewPositionsStorage.purge();
        onLayoutUpdatedFromPosition(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        Log.d("onItemsUpdated", "starts from = " + i + ", item count = " + i2, 1);
        super.onItemsUpdated(recyclerView, i, i2);
        onLayoutUpdatedFromPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        onItemsUpdated(recyclerView, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        Log.d("onItemsMoved", String.format(Locale.US, "from = %d, to = %d, itemCount = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)), 1);
        super.onItemsMoved(recyclerView, i, i2, i3);
        onLayoutUpdatedFromPosition(Math.min(i, i2));
    }

    private void onLayoutUpdatedFromPosition(int i) {
        Log.d(TAG, "cache purged from position " + i);
        this.viewPositionsStorage.purgeCacheFromPosition(i);
        int startOfRow = this.viewPositionsStorage.getStartOfRow(i);
        Integer num = this.cacheNormalizationPosition;
        if (num != null) {
            startOfRow = Math.min(num.intValue(), startOfRow);
        }
        this.cacheNormalizationPosition = Integer.valueOf(startOfRow);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        if (i >= getItemCount() || i < 0) {
            Log.e("span layout manager", "Cannot scroll to " + i + ", item count " + getItemCount());
            return;
        }
        Integer lastCachePosition = this.viewPositionsStorage.getLastCachePosition();
        Integer num = this.cacheNormalizationPosition;
        if (num == null) {
            num = lastCachePosition;
        }
        this.cacheNormalizationPosition = num;
        if (lastCachePosition != null && i < lastCachePosition.intValue()) {
            i = this.viewPositionsStorage.getStartOfRow(i);
        }
        AnchorViewState anchorViewStateCreateNotFound = this.anchorFactory.createNotFound();
        this.anchorView = anchorViewStateCreateNotFound;
        anchorViewStateCreateNotFound.setPosition(Integer.valueOf(i));
        super.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        if (i >= getItemCount() || i < 0) {
            Log.e("span layout manager", "Cannot scroll to " + i + ", item count " + getItemCount());
            return;
        }
        RecyclerView.SmoothScroller smoothScrollerCreateSmoothScroller = this.scrollingController.createSmoothScroller(recyclerView.getContext(), i, 150, this.anchorView);
        smoothScrollerCreateSmoothScroller.setTargetPosition(i);
        startSmoothScroll(smoothScrollerCreateSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.scrollingController.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.scrollingController.canScrollVertically();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return this.scrollingController.scrollVerticallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return this.scrollingController.scrollHorizontallyBy(i, recycler, state);
    }

    public VerticalScrollingController verticalScrollingController() {
        return new VerticalScrollingController(this, this.stateFactory, this);
    }

    public HorizontalScrollingController horizontalScrollingController() {
        return new HorizontalScrollingController(this, this.stateFactory, this);
    }

    @Override // com.beloo.widget.chipslayoutmanager.ScrollingController.IScrollerListener
    public void onScrolled(IScrollingController iScrollingController, RecyclerView.Recycler recycler, RecyclerView.State state) {
        performNormalizationIfNeeded();
        this.anchorView = this.anchorFactory.getAnchor();
        AbstractCriteriaFactory abstractCriteriaFactoryCreateDefaultFinishingCriteriaFactory = this.stateFactory.createDefaultFinishingCriteriaFactory();
        abstractCriteriaFactoryCreateDefaultFinishingCriteriaFactory.setAdditionalRowsCount(1);
        LayouterFactory layouterFactoryCreateLayouterFactory = this.stateFactory.createLayouterFactory(abstractCriteriaFactoryCreateDefaultFinishingCriteriaFactory, this.placerFactory.createRealPlacerFactory());
        fill(recycler, layouterFactoryCreateLayouterFactory.getBackwardLayouter(this.anchorView), layouterFactoryCreateLayouterFactory.getForwardLayouter(this.anchorView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return this.scrollingController.computeVerticalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return this.scrollingController.computeVerticalScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return this.scrollingController.computeVerticalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return this.scrollingController.computeHorizontalScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return this.scrollingController.computeHorizontalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return this.scrollingController.computeHorizontalScrollRange(state);
    }
}
