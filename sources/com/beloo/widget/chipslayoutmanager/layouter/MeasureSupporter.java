package com.beloo.widget.chipslayoutmanager.layouter;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes21.dex */
public class MeasureSupporter extends RecyclerView.AdapterDataObserver implements IMeasureSupporter {
    private boolean isAfterRemoving;
    private boolean isRegistered;
    private RecyclerView.LayoutManager lm;
    private int measuredHeight;
    private int measuredWidth;
    private Integer beforeRemovingWidth = null;
    private int autoMeasureWidth = 0;
    private Integer beforeRemovingHeight = null;
    private int autoMeasureHeight = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void setMeasuredHeight(int i) {
        this.measuredHeight = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void setMeasuredWidth(int i) {
        this.measuredWidth = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.IMeasureSupporter
    public int getMeasuredHeight() {
        return this.measuredHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.IMeasureSupporter
    public int getMeasuredWidth() {
        return this.measuredWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isAfterRemoving() {
        return this.isAfterRemoving;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.IMeasureSupporter
    public boolean isRegistered() {
        return this.isRegistered;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.layouter.IMeasureSupporter
    public void setRegistered(boolean z) {
        this.isRegistered = z;
    }

    public MeasureSupporter(RecyclerView.LayoutManager layoutManager) {
        this.lm = layoutManager;
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IMeasureSupporter
    public void onSizeChanged() {
        this.autoMeasureWidth = this.lm.getWidth();
        this.autoMeasureHeight = this.lm.getHeight();
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IMeasureSupporter
    public void measure(int i, int i2) {
        if (isAfterRemoving()) {
            setMeasuredWidth(Math.max(i, this.beforeRemovingWidth.intValue()));
            setMeasuredHeight(Math.max(i2, this.beforeRemovingHeight.intValue()));
        } else {
            setMeasuredWidth(i);
            setMeasuredHeight(i2);
        }
    }

    @Override // com.beloo.widget.chipslayoutmanager.layouter.IMeasureSupporter
    public void onItemsRemoved(final RecyclerView recyclerView) {
        this.lm.postOnAnimation(new Runnable() { // from class: com.beloo.widget.chipslayoutmanager.layouter.MeasureSupporter.1
            /* JADX INFO: Access modifiers changed from: private */
            public void onFinished() {
                MeasureSupporter.this.isAfterRemoving = false;
                MeasureSupporter.this.lm.requestLayout();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (recyclerView.getItemAnimator() != null) {
                    recyclerView.getItemAnimator().isRunning(new RecyclerView.ItemAnimator.ItemAnimatorFinishedListener() { // from class: com.beloo.widget.chipslayoutmanager.layouter.MeasureSupporter.1.1
                        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener
                        public void onAnimationsFinished() {
                            onFinished();
                        }
                    });
                } else {
                    onFinished();
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeRemoved(int i, int i2) {
        super.onItemRangeRemoved(i, i2);
        this.isAfterRemoving = true;
        this.beforeRemovingWidth = Integer.valueOf(this.autoMeasureWidth);
        this.beforeRemovingHeight = Integer.valueOf(this.autoMeasureHeight);
    }
}
