package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.ChildViewsIterable;

/* JADX INFO: loaded from: classes21.dex */
abstract class Square implements ICanvas {
    private View bottomView;
    private ChildViewsIterable childViews;
    private boolean isFirstItemAdded;
    private View leftView;
    RecyclerView.LayoutManager lm;
    private Integer maxPositionOnScreen;
    private Integer minPositionOnScreen;
    private View rightView;
    private View topView;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.ICanvas
    public View getBottomView() {
        return this.bottomView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.ICanvas
    public View getLeftView() {
        return this.leftView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.ICanvas
    public Integer getMaxPositionOnScreen() {
        return this.maxPositionOnScreen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.ICanvas
    public Integer getMinPositionOnScreen() {
        return this.minPositionOnScreen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.ICanvas
    public View getRightView() {
        return this.rightView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.ICanvas
    public View getTopView() {
        return this.topView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.ICanvas
    public boolean isFirstItemAdded() {
        return this.isFirstItemAdded;
    }

    public Square(RecyclerView.LayoutManager layoutManager) {
        this.lm = layoutManager;
        this.childViews = new ChildViewsIterable(layoutManager);
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ICanvas
    public Rect getCanvasRect() {
        return new Rect(getCanvasLeftBorder(), getCanvasTopBorder(), getCanvasRightBorder(), getCanvasBottomBorder());
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ICanvas
    public Rect getViewRect(View view) {
        return new Rect(this.lm.getDecoratedLeft(view), this.lm.getDecoratedTop(view), this.lm.getDecoratedRight(view), this.lm.getDecoratedBottom(view));
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ICanvas
    public boolean isInside(Rect rect) {
        return getCanvasRect().intersect(new Rect(rect));
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ICanvas
    public boolean isInside(View view) {
        return isInside(getViewRect(view));
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ICanvas
    public boolean isFullyVisible(View view) {
        return isFullyVisible(getViewRect(view));
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ICanvas
    public boolean isFullyVisible(Rect rect) {
        return rect.top >= getCanvasTopBorder() && rect.bottom <= getCanvasBottomBorder() && rect.left >= getCanvasLeftBorder() && rect.right <= getCanvasRightBorder();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.ICanvas
    public void findBorderViews() {
        this.topView = null;
        this.bottomView = null;
        this.leftView = null;
        this.rightView = null;
        this.minPositionOnScreen = -1;
        this.maxPositionOnScreen = -1;
        this.isFirstItemAdded = false;
        if (this.lm.getChildCount() > 0) {
            View childAt = this.lm.getChildAt(0);
            this.topView = childAt;
            this.bottomView = childAt;
            this.leftView = childAt;
            this.rightView = childAt;
            for (View view : this.childViews) {
                int position = this.lm.getPosition(view);
                if (isInside(view)) {
                    if (this.lm.getDecoratedTop(view) < this.lm.getDecoratedTop(this.topView)) {
                        this.topView = view;
                    }
                    if (this.lm.getDecoratedBottom(view) > this.lm.getDecoratedBottom(this.bottomView)) {
                        this.bottomView = view;
                    }
                    if (this.lm.getDecoratedLeft(view) < this.lm.getDecoratedLeft(this.leftView)) {
                        this.leftView = view;
                    }
                    if (this.lm.getDecoratedRight(view) > this.lm.getDecoratedRight(this.rightView)) {
                        this.rightView = view;
                    }
                    if (this.minPositionOnScreen.intValue() == -1 || position < this.minPositionOnScreen.intValue()) {
                        this.minPositionOnScreen = Integer.valueOf(position);
                    }
                    if (this.maxPositionOnScreen.intValue() == -1 || position > this.maxPositionOnScreen.intValue()) {
                        this.maxPositionOnScreen = Integer.valueOf(position);
                    }
                    if (position == 0) {
                        this.isFirstItemAdded = true;
                    }
                }
            }
        }
    }
}
