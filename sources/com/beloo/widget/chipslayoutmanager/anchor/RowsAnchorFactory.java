package com.beloo.widget.chipslayoutmanager.anchor;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.ChildViewsIterable;
import com.beloo.widget.chipslayoutmanager.layouter.ICanvas;

/* JADX INFO: loaded from: classes21.dex */
public class RowsAnchorFactory extends AbstractAnchorFactory {
    private ChildViewsIterable childViews;

    @Override // com.beloo.widget.chipslayoutmanager.anchor.AbstractAnchorFactory, com.beloo.widget.chipslayoutmanager.anchor.IAnchorFactory
    public /* bridge */ /* synthetic */ AnchorViewState createNotFound() {
        return super.createNotFound();
    }

    public RowsAnchorFactory(RecyclerView.LayoutManager layoutManager, ICanvas iCanvas) {
        super(layoutManager, iCanvas);
        this.childViews = new ChildViewsIterable(layoutManager);
    }

    @Override // com.beloo.widget.chipslayoutmanager.anchor.IAnchorFactory
    public AnchorViewState getAnchor() {
        AnchorViewState notFoundState = AnchorViewState.getNotFoundState();
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (View view : this.childViews) {
            AnchorViewState anchorViewStateCreateAnchorState = createAnchorState(view);
            int position = this.lm.getPosition(view);
            int decoratedTop = this.lm.getDecoratedTop(view);
            if (getCanvas().isInside(new Rect(anchorViewStateCreateAnchorState.getAnchorViewRect())) && !anchorViewStateCreateAnchorState.isRemoving()) {
                if (i2 > position) {
                    notFoundState = anchorViewStateCreateAnchorState;
                    i2 = position;
                }
                if (i > decoratedTop) {
                    i = decoratedTop;
                }
            }
        }
        if (!notFoundState.isNotFoundState()) {
            notFoundState.getAnchorViewRect().top = i;
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
        anchorViewRect.left = getCanvas().getCanvasLeftBorder();
        anchorViewRect.right = getCanvas().getCanvasRightBorder();
    }
}
