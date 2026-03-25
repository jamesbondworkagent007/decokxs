package com.beloo.widget.chipslayoutmanager.anchor;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.ChildViewsIterable;
import com.beloo.widget.chipslayoutmanager.layouter.ICanvas;

/* JADX INFO: loaded from: classes21.dex */
public class ColumnsAnchorFactory extends AbstractAnchorFactory {
    private ChildViewsIterable childViews;

    @Override // com.beloo.widget.chipslayoutmanager.anchor.AbstractAnchorFactory, com.beloo.widget.chipslayoutmanager.anchor.IAnchorFactory
    public /* bridge */ /* synthetic */ AnchorViewState createNotFound() {
        return super.createNotFound();
    }

    public ColumnsAnchorFactory(RecyclerView.LayoutManager layoutManager, ICanvas iCanvas) {
        super(layoutManager, iCanvas);
        this.childViews = new ChildViewsIterable(layoutManager);
    }

    @Override // com.beloo.widget.chipslayoutmanager.anchor.IAnchorFactory
    public AnchorViewState getAnchor() {
        AnchorViewState notFoundState = AnchorViewState.getNotFoundState();
        int i = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (View view : this.childViews) {
            AnchorViewState anchorViewStateCreateAnchorState = createAnchorState(view);
            int position = this.lm.getPosition(view);
            int decoratedLeft = this.lm.getDecoratedLeft(view);
            int decoratedRight = this.lm.getDecoratedRight(view);
            if (getCanvas().isInside(new Rect(anchorViewStateCreateAnchorState.getAnchorViewRect())) && !anchorViewStateCreateAnchorState.isRemoving()) {
                if (i2 > position) {
                    notFoundState = anchorViewStateCreateAnchorState;
                    i2 = position;
                }
                if (i > decoratedLeft) {
                    iMax = decoratedRight;
                    i = decoratedLeft;
                } else if (i == decoratedLeft) {
                    iMax = Math.max(iMax, decoratedRight);
                }
            }
        }
        if (!notFoundState.isNotFoundState()) {
            notFoundState.getAnchorViewRect().left = i;
            notFoundState.getAnchorViewRect().right = iMax;
            notFoundState.setPosition(Integer.valueOf(i2));
        }
        return notFoundState;
    }

    @Override // com.beloo.widget.chipslayoutmanager.anchor.IAnchorFactory
    public void resetRowCoordinates(AnchorViewState anchorViewState) {
        if (anchorViewState.isNotFoundState()) {
            return;
        }
        Rect anchorViewRect = anchorViewState.getAnchorViewRect();
        anchorViewRect.top = getCanvas().getCanvasTopBorder();
        anchorViewRect.bottom = getCanvas().getCanvasBottomBorder();
    }
}
