package com.beloo.widget.chipslayoutmanager.layouter;

import android.view.View;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import com.beloo.widget.chipslayoutmanager.IScrollingController;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.anchor.ColumnsAnchorFactory;
import com.beloo.widget.chipslayoutmanager.anchor.IAnchorFactory;
import com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage;
import com.beloo.widget.chipslayoutmanager.gravity.ColumnGravityModifiersFactory;
import com.beloo.widget.chipslayoutmanager.gravity.ColumnStrategyFactory;
import com.beloo.widget.chipslayoutmanager.gravity.IRowStrategyFactory;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.ColumnBreakerFactory;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.DecoratorBreakerFactory;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.AbstractCriteriaFactory;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.ColumnsCriteriaFactory;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.ICriteriaFactory;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.InfiniteCriteriaFactory;
import com.beloo.widget.chipslayoutmanager.layouter.placer.IPlacerFactory;
import com.beloo.widget.chipslayoutmanager.util.StateHelper;

/* JADX INFO: loaded from: classes21.dex */
public class ColumnsStateFactory implements IStateFactory {
    private ChipsLayoutManager lm;
    private IRowStrategyFactory rowStrategyFactory = new ColumnStrategyFactory();

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getStart() {
        return 0;
    }

    public ColumnsStateFactory(ChipsLayoutManager chipsLayoutManager) {
        this.lm = chipsLayoutManager;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public LayouterFactory createLayouterFactory(ICriteriaFactory iCriteriaFactory, IPlacerFactory iPlacerFactory) {
        return createColumnLayouterFactory(iCriteriaFactory, iPlacerFactory, this.lm.getViewPositionsStorage());
    }

    private LayouterFactory createColumnLayouterFactory(ICriteriaFactory iCriteriaFactory, IPlacerFactory iPlacerFactory, IViewCacheStorage iViewCacheStorage) {
        ChipsLayoutManager chipsLayoutManager = this.lm;
        return new LayouterFactory(chipsLayoutManager, new ColumnsCreator(chipsLayoutManager), new DecoratorBreakerFactory(iViewCacheStorage, this.lm.getRowBreaker(), this.lm.getMaxViewsInRow(), new ColumnBreakerFactory()), iCriteriaFactory, iPlacerFactory, new ColumnGravityModifiersFactory(), this.rowStrategyFactory.createRowStrategy(this.lm.getRowStrategyType()));
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public AbstractCriteriaFactory createDefaultFinishingCriteriaFactory() {
        return StateHelper.isInfinite(this) ? new InfiniteCriteriaFactory() : new ColumnsCriteriaFactory();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public IAnchorFactory anchorFactory() {
        ChipsLayoutManager chipsLayoutManager = this.lm;
        return new ColumnsAnchorFactory(chipsLayoutManager, chipsLayoutManager.getCanvas());
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public IScrollingController scrollingController() {
        return this.lm.horizontalScrollingController();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public ICanvas createCanvas() {
        return new ColumnSquare(this.lm);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getSizeMode() {
        return this.lm.getWidthMode();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getStart(View view) {
        return this.lm.getDecoratedLeft(view);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getStart(AnchorViewState anchorViewState) {
        return anchorViewState.getAnchorViewRect().left;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getEnd() {
        return this.lm.getWidth();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getEnd(View view) {
        return this.lm.getDecoratedRight(view);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getEnd(AnchorViewState anchorViewState) {
        return anchorViewState.getAnchorViewRect().right;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getEndViewPosition() {
        ChipsLayoutManager chipsLayoutManager = this.lm;
        return chipsLayoutManager.getPosition(chipsLayoutManager.getCanvas().getBottomView());
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getStartAfterPadding() {
        return this.lm.getPaddingLeft();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getStartViewPosition() {
        ChipsLayoutManager chipsLayoutManager = this.lm;
        return chipsLayoutManager.getPosition(chipsLayoutManager.getCanvas().getTopView());
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getEndAfterPadding() {
        return this.lm.getWidth() - this.lm.getPaddingRight();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getStartViewBound() {
        return getStart(this.lm.getCanvas().getLeftView());
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getEndViewBound() {
        return getEnd(this.lm.getCanvas().getRightView());
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getTotalSpace() {
        return (this.lm.getWidth() - this.lm.getPaddingLeft()) - this.lm.getPaddingRight();
    }
}
