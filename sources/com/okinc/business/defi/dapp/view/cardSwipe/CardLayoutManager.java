package com.okinc.business.defi.dapp.view.cardSwipe;

import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.CardItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes14.dex */
public class CardLayoutManager extends RecyclerView.LayoutManager {
    public RecyclerView AEQbTJ;
    public CardItemTouchHelper KWHzl;
    public View.OnTouchListener OLrzqt = new View.OnTouchListener() { // from class: com.okinc.business.defi.dapp.view.cardSwipe.CardLayoutManager.4
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            RecyclerView.ViewHolder childViewHolder = CardLayoutManager.this.AEQbTJ.getChildViewHolder(view);
            if (motionEvent.getAction() != 0) {
                return false;
            }
            CardLayoutManager.this.KWHzl.startSwipe(childViewHolder);
            return false;
        }
    };

    public CardLayoutManager(@NonNull RecyclerView recyclerView, @NonNull CardItemTouchHelper cardItemTouchHelper) {
        this.AEQbTJ = (RecyclerView) KWHzl(recyclerView);
        this.KWHzl = cardItemTouchHelper;
    }

    public final <T> T KWHzl(T t) {
        t.getClass();
        return t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        detachAndScrapAttachedViews(recycler);
        for (int itemCount = getItemCount() - 1; itemCount >= 0; itemCount--) {
            View viewForPosition = recycler.getViewForPosition(itemCount);
            addView(viewForPosition);
            measureChildWithMargins(viewForPosition, 0, 0);
            int width = (getWidth() - getDecoratedMeasuredWidth(viewForPosition)) / 2;
            int height = (getHeight() - getDecoratedMeasuredHeight(viewForPosition)) / 2;
            layoutDecoratedWithMargins(viewForPosition, width, height, width + getDecoratedMeasuredWidth(viewForPosition), height + getDecoratedMeasuredHeight(viewForPosition));
            viewForPosition.setOnTouchListener(this.OLrzqt);
        }
    }
}
