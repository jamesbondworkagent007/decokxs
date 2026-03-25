package com.beloo.widget.chipslayoutmanager.layouter;

import android.view.View;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import com.beloo.widget.chipslayoutmanager.IScrollingController;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.anchor.IAnchorFactory;
import com.beloo.widget.chipslayoutmanager.anchor.RowsAnchorFactory;
import com.beloo.widget.chipslayoutmanager.gravity.RowGravityModifiersFactory;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.DecoratorBreakerFactory;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.AbstractCriteriaFactory;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.ICriteriaFactory;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.InfiniteCriteriaFactory;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.RowsCriteriaFactory;
import com.beloo.widget.chipslayoutmanager.layouter.placer.IPlacerFactory;
import com.beloo.widget.chipslayoutmanager.util.StateHelper;

/* JADX INFO: loaded from: classes21.dex */
public class RowsStateFactory implements IStateFactory {
    private ChipsLayoutManager lm;

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getStart() {
        return 0;
    }

    public RowsStateFactory(ChipsLayoutManager chipsLayoutManager) {
        this.lm = chipsLayoutManager;
    }

    private IOrientationStateFactory createOrientationStateFactory() {
        return this.lm.isLayoutRTL() ? new RTLRowsOrientationStateFactory() : new LTRRowsOrientationStateFactory();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public LayouterFactory createLayouterFactory(ICriteriaFactory iCriteriaFactory, IPlacerFactory iPlacerFactory) {
        IOrientationStateFactory iOrientationStateFactoryCreateOrientationStateFactory = createOrientationStateFactory();
        ChipsLayoutManager chipsLayoutManager = this.lm;
        return new LayouterFactory(chipsLayoutManager, iOrientationStateFactoryCreateOrientationStateFactory.createLayouterCreator(chipsLayoutManager), new DecoratorBreakerFactory(this.lm.getViewPositionsStorage(), this.lm.getRowBreaker(), this.lm.getMaxViewsInRow(), iOrientationStateFactoryCreateOrientationStateFactory.createDefaultBreaker()), iCriteriaFactory, iPlacerFactory, new RowGravityModifiersFactory(), iOrientationStateFactoryCreateOrientationStateFactory.createRowStrategyFactory().createRowStrategy(this.lm.getRowStrategyType()));
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public AbstractCriteriaFactory createDefaultFinishingCriteriaFactory() {
        return StateHelper.isInfinite(this) ? new InfiniteCriteriaFactory() : new RowsCriteriaFactory();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public IAnchorFactory anchorFactory() {
        ChipsLayoutManager chipsLayoutManager = this.lm;
        return new RowsAnchorFactory(chipsLayoutManager, chipsLayoutManager.getCanvas());
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public IScrollingController scrollingController() {
        return this.lm.verticalScrollingController();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public ICanvas createCanvas() {
        return new RowSquare(this.lm);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getSizeMode() {
        return this.lm.getHeightMode();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getStart(View view) {
        return this.lm.getDecoratedTop(view);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getStart(AnchorViewState anchorViewState) {
        return anchorViewState.getAnchorViewRect().top;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getEnd() {
        return this.lm.getHeight();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getEnd(View view) {
        return this.lm.getDecoratedBottom(view);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getEnd(AnchorViewState anchorViewState) {
        return anchorViewState.getAnchorViewRect().bottom;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getEndViewPosition() {
        ChipsLayoutManager chipsLayoutManager = this.lm;
        return chipsLayoutManager.getPosition(chipsLayoutManager.getCanvas().getRightView());
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getStartAfterPadding() {
        return this.lm.getPaddingTop();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getStartViewPosition() {
        ChipsLayoutManager chipsLayoutManager = this.lm;
        return chipsLayoutManager.getPosition(chipsLayoutManager.getCanvas().getLeftView());
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getEndAfterPadding() {
        return this.lm.getHeight() - this.lm.getPaddingBottom();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getStartViewBound() {
        return getStart(this.lm.getCanvas().getTopView());
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getEndViewBound() {
        return getEnd(this.lm.getCanvas().getBottomView());
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IStateFactory
    public int getTotalSpace() {
        return (this.lm.getHeight() - this.lm.getPaddingTop()) - this.lm.getPaddingBottom();
    }
}
