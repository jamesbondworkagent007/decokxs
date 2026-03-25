package com.okinc.widget.manager;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56548yJl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class MaxLineFlowLayoutManager extends RecyclerView.LayoutManager {
    public int AEQbTJ;
    public int AYXKKw;
    public int DbNXlk;
    public int EZpvd;
    public int KWHzl;
    public int djBIcL;
    public int fetchVPNInfo;
    public int gEmmrt;
    public TaskDescription AhwBna = new TaskDescription();
    public final List<TaskDescription> copydefault = new ArrayList();
    public final SparseArray<Rect> OLrzqt = new SparseArray<>();
    public int valueOf = -1;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, @NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "");
        Intrinsics.checkNotNullParameter(state, "");
        int i2 = this.fetchVPNInfo;
        int i3 = i2 + i;
        if (i3 < 0) {
            i = -i2;
        } else if (i3 > this.djBIcL - OLrzqt()) {
            i = (this.djBIcL - OLrzqt()) - this.fetchVPNInfo;
        }
        this.fetchVPNInfo += i;
        offsetChildrenVertical(-i);
        EZpvd(recycler, state);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(@NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        String str;
        int paddingStart;
        boolean z;
        int paddingStart2;
        RecyclerView.Recycler recycler2 = recycler;
        String str2 = "";
        Intrinsics.checkNotNullParameter(recycler2, "");
        Intrinsics.checkNotNullParameter(state, "");
        int i = 0;
        this.djBIcL = 0;
        int i2 = this.gEmmrt;
        this.AhwBna = new TaskDescription();
        this.copydefault.clear();
        this.OLrzqt.clear();
        removeAllViews();
        boolean z2 = true;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        if (getItemCount() == 0) {
            detachAndScrapAttachedViews(recycler);
            this.fetchVPNInfo = 0;
            return;
        }
        if (getChildCount() == 0 && state.isPreLayout()) {
            return;
        }
        detachAndScrapAttachedViews(recycler);
        if (getChildCount() == 0) {
            this.AEQbTJ = getWidth();
            this.KWHzl = getHeight();
            this.EZpvd = getPaddingStart();
            this.AYXKKw = getPaddingEnd();
            this.gEmmrt = getPaddingTop();
            this.DbNXlk = (getWidth() - this.EZpvd) - this.AYXKKw;
        }
        int itemCount = getItemCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < itemCount) {
            View viewForPosition = recycler2.getViewForPosition(i3);
            Intrinsics.checkNotNullExpressionValue(viewForPosition, str2);
            if (8 == viewForPosition.getVisibility()) {
                str = str2;
                z = z2;
            } else {
                measureChildWithMargins(viewForPosition, i, i);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
                int i6 = i4 + decoratedMeasuredWidth;
                if (i6 <= this.DbNXlk) {
                    if (z3) {
                        paddingStart2 = ((width - getPaddingEnd()) - i4) - decoratedMeasuredWidth;
                    } else {
                        paddingStart2 = getPaddingStart() + i4;
                    }
                    Rect rect = this.OLrzqt.get(i3);
                    if (rect == null) {
                        rect = new Rect();
                    }
                    Rect rect2 = rect;
                    str = str2;
                    rect2.set(paddingStart2, i2, decoratedMeasuredWidth + paddingStart2, i2 + decoratedMeasuredHeight);
                    this.OLrzqt.put(i3, rect);
                    int iCopydefault = C56548yJl.copydefault(i5, decoratedMeasuredHeight);
                    TaskDescription taskDescription = this.AhwBna;
                    taskDescription.OLrzqt(new ActionBar(this, decoratedMeasuredHeight, viewForPosition, rect2));
                    taskDescription.AEQbTJ(i2);
                    taskDescription.KWHzl(iCopydefault);
                    i5 = iCopydefault;
                    i4 = i6;
                } else {
                    str = str2;
                    EZpvd();
                    i2 += i5;
                    this.djBIcL += i5;
                    if (this.valueOf != -1 && this.copydefault.size() >= this.valueOf) {
                        break;
                    }
                    if (z3) {
                        paddingStart = (width - getPaddingEnd()) - decoratedMeasuredWidth;
                    } else {
                        paddingStart = getPaddingStart();
                    }
                    Rect rect3 = this.OLrzqt.get(i3);
                    if (rect3 == null) {
                        rect3 = new Rect();
                    }
                    Rect rect4 = rect3;
                    rect4.set(paddingStart, i2, paddingStart + decoratedMeasuredWidth, i2 + decoratedMeasuredHeight);
                    this.OLrzqt.put(i3, rect3);
                    TaskDescription taskDescription2 = this.AhwBna;
                    taskDescription2.OLrzqt(new ActionBar(this, decoratedMeasuredHeight, viewForPosition, rect4));
                    taskDescription2.AEQbTJ(i2);
                    taskDescription2.KWHzl(decoratedMeasuredHeight);
                    i4 = decoratedMeasuredWidth;
                    i5 = decoratedMeasuredHeight;
                }
                z = true;
                if (i3 == getItemCount() - 1) {
                    EZpvd();
                    this.djBIcL += i5;
                }
            }
            i3++;
            recycler2 = recycler;
            z2 = z;
            str2 = str;
            i = 0;
        }
        this.djBIcL = C56548yJl.copydefault(this.djBIcL, OLrzqt());
        EZpvd(recycler, state);
    }

    private final void EZpvd(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.isPreLayout() || getItemCount() == 0) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        int width = getWidth();
        int size = this.copydefault.size();
        for (int i = 0; i < size; i++) {
            List<ActionBar> listCopydefault = this.copydefault.get(i).copydefault();
            int size2 = listCopydefault.size();
            for (int i2 = 0; i2 < size2; i2++) {
                View viewKWHzl = listCopydefault.get(i2).KWHzl();
                measureChildWithMargins(viewKWHzl, 0, 0);
                addView(viewKWHzl);
                Rect rectAEQbTJ = listCopydefault.get(i2).AEQbTJ();
                if (rectAEQbTJ != null) {
                    if (z) {
                        int paddingEnd = (width - getPaddingEnd()) - (this.DbNXlk - rectAEQbTJ.right);
                        int iWidth = rectAEQbTJ.width();
                        int i3 = rectAEQbTJ.top;
                        int i4 = this.fetchVPNInfo;
                        layoutDecoratedWithMargins(viewKWHzl, paddingEnd - iWidth, i3 - i4, paddingEnd, rectAEQbTJ.bottom - i4);
                    } else {
                        int i5 = rectAEQbTJ.left;
                        int i6 = rectAEQbTJ.top;
                        int i7 = this.fetchVPNInfo;
                        layoutDecoratedWithMargins(viewKWHzl, i5, i6 - i7, rectAEQbTJ.right, rectAEQbTJ.bottom - i7);
                    }
                }
            }
        }
    }

    private final void EZpvd() {
        List<ActionBar> listCopydefault = this.AhwBna.copydefault();
        int size = listCopydefault.size();
        for (int i = 0; i < size; i++) {
            ActionBar actionBar = listCopydefault.get(i);
            int position = getPosition(actionBar.KWHzl());
            float f = 2;
            if (this.OLrzqt.get(position).top < this.AhwBna.EZpvd() + ((this.AhwBna.OLrzqt() - listCopydefault.get(i).OLrzqt()) / f)) {
                Rect rect = this.OLrzqt.get(position);
                if (rect == null) {
                    rect = new Rect();
                }
                rect.set(this.OLrzqt.get(position).left, (int) (this.AhwBna.EZpvd() + ((this.AhwBna.OLrzqt() - listCopydefault.get(i).OLrzqt()) / f)), this.OLrzqt.get(position).right, (int) (this.AhwBna.EZpvd() + ((this.AhwBna.OLrzqt() - listCopydefault.get(i).OLrzqt()) / f) + getDecoratedMeasuredHeight(r4)));
                this.OLrzqt.put(position, rect);
                actionBar.EZpvd(rect);
                listCopydefault.set(i, actionBar);
            }
        }
        this.AhwBna.OLrzqt(listCopydefault);
        this.copydefault.add(this.AhwBna);
        this.AhwBna = new TaskDescription();
    }

    private final int OLrzqt() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    public final class TaskDescription {
        public List<ActionBar> AEQbTJ = new ArrayList();
        public float EZpvd;
        public float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(float f) {
            this.EZpvd = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(float f) {
            this.copydefault = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull List<ActionBar> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ActionBar> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        public final void OLrzqt(@NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            this.AEQbTJ.add(actionBar);
        }
    }

    public final class ActionBar {
        public View AEQbTJ;
        public int EZpvd;
        public Rect KWHzl;
        public final /* synthetic */ MaxLineFlowLayoutManager OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Rect AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(Rect rect) {
            this.KWHzl = rect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final View KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        public ActionBar(MaxLineFlowLayoutManager maxLineFlowLayoutManager, @NotNull int i, View view, Rect rect) {
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = maxLineFlowLayoutManager;
            this.EZpvd = i;
            this.AEQbTJ = view;
            this.KWHzl = rect;
        }
    }
}
