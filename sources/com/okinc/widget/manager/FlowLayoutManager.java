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
public final class FlowLayoutManager extends RecyclerView.LayoutManager {
    public int AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public int KWHzl;
    public int copydefault;
    public int gEmmrt;
    public int valueOf;
    public ActionBar djBIcL = new ActionBar();
    public final List<ActionBar> EZpvd = new ArrayList();
    public final SparseArray<Rect> OLrzqt = new SparseArray<>();

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
        int i2 = this.AkhnZx;
        int i3 = i2 + i;
        if (i3 < 0) {
            i = -i2;
        } else if (i3 > this.AYXKKw - EZpvd()) {
            i = (this.AYXKKw - EZpvd()) - this.AkhnZx;
        }
        this.AkhnZx += i;
        offsetChildrenVertical(-i);
        OLrzqt(recycler, state);
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
        this.AYXKKw = 0;
        int i2 = this.AhwBna;
        this.djBIcL = new ActionBar();
        this.EZpvd.clear();
        this.OLrzqt.clear();
        removeAllViews();
        boolean z2 = true;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        if (getItemCount() == 0) {
            detachAndScrapAttachedViews(recycler);
            this.AkhnZx = 0;
            return;
        }
        if (getChildCount() == 0 && state.isPreLayout()) {
            return;
        }
        detachAndScrapAttachedViews(recycler);
        if (getChildCount() == 0) {
            this.copydefault = getWidth();
            this.KWHzl = getHeight();
            this.AEQbTJ = getPaddingStart();
            this.valueOf = getPaddingEnd();
            this.AhwBna = getPaddingTop();
            this.gEmmrt = (getWidth() - this.AEQbTJ) - this.valueOf;
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
                if (i6 <= this.gEmmrt) {
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
                    ActionBar actionBar = this.djBIcL;
                    actionBar.EZpvd(new Application(this, decoratedMeasuredHeight, viewForPosition, rect2));
                    actionBar.OLrzqt(i2);
                    actionBar.copydefault(iCopydefault);
                    i5 = iCopydefault;
                    i4 = i6;
                } else {
                    str = str2;
                    KWHzl();
                    i2 += i5;
                    this.AYXKKw += i5;
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
                    ActionBar actionBar2 = this.djBIcL;
                    actionBar2.EZpvd(new Application(this, decoratedMeasuredHeight, viewForPosition, rect4));
                    actionBar2.OLrzqt(i2);
                    actionBar2.copydefault(decoratedMeasuredHeight);
                    i4 = decoratedMeasuredWidth;
                    i5 = decoratedMeasuredHeight;
                }
                z = true;
                if (i3 == getItemCount() - 1) {
                    KWHzl();
                    this.AYXKKw += i5;
                }
            }
            i3++;
            recycler2 = recycler;
            z2 = z;
            str2 = str;
            i = 0;
        }
        this.AYXKKw = C56548yJl.copydefault(this.AYXKKw, EZpvd());
        OLrzqt(recycler, state);
    }

    public final void OLrzqt(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.isPreLayout() || getItemCount() == 0) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        int width = getWidth();
        int size = this.EZpvd.size();
        for (int i = 0; i < size; i++) {
            List<Application> listOLrzqt = this.EZpvd.get(i).OLrzqt();
            int size2 = listOLrzqt.size();
            for (int i2 = 0; i2 < size2; i2++) {
                View viewOLrzqt = listOLrzqt.get(i2).OLrzqt();
                measureChildWithMargins(viewOLrzqt, 0, 0);
                addView(viewOLrzqt);
                Rect rectAEQbTJ = listOLrzqt.get(i2).AEQbTJ();
                if (rectAEQbTJ != null) {
                    if (z) {
                        int paddingEnd = (width - getPaddingEnd()) - (this.gEmmrt - rectAEQbTJ.right);
                        int iWidth = rectAEQbTJ.width();
                        int i3 = rectAEQbTJ.top;
                        int i4 = this.AkhnZx;
                        layoutDecoratedWithMargins(viewOLrzqt, paddingEnd - iWidth, i3 - i4, paddingEnd, rectAEQbTJ.bottom - i4);
                    } else {
                        int i5 = rectAEQbTJ.left;
                        int i6 = rectAEQbTJ.top;
                        int i7 = this.AkhnZx;
                        layoutDecoratedWithMargins(viewOLrzqt, i5, i6 - i7, rectAEQbTJ.right, rectAEQbTJ.bottom - i7);
                    }
                }
            }
        }
    }

    public final void KWHzl() {
        List<Application> listOLrzqt = this.djBIcL.OLrzqt();
        int size = listOLrzqt.size();
        for (int i = 0; i < size; i++) {
            Application application = listOLrzqt.get(i);
            int position = getPosition(application.OLrzqt());
            float f = 2;
            if (this.OLrzqt.get(position).top < this.djBIcL.KWHzl() + ((this.djBIcL.EZpvd() - listOLrzqt.get(i).EZpvd()) / f)) {
                Rect rect = this.OLrzqt.get(position);
                if (rect == null) {
                    rect = new Rect();
                }
                rect.set(this.OLrzqt.get(position).left, (int) (this.djBIcL.KWHzl() + ((this.djBIcL.EZpvd() - listOLrzqt.get(i).EZpvd()) / f)), this.OLrzqt.get(position).right, (int) (this.djBIcL.KWHzl() + ((this.djBIcL.EZpvd() - listOLrzqt.get(i).EZpvd()) / f) + getDecoratedMeasuredHeight(r4)));
                this.OLrzqt.put(position, rect);
                application.copydefault(rect);
                listOLrzqt.set(i, application);
            }
        }
        this.djBIcL.KWHzl(listOLrzqt);
        this.EZpvd.add(this.djBIcL);
        this.djBIcL = new ActionBar();
    }

    private final int EZpvd() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    public final class ActionBar {
        public float AEQbTJ;
        public float OLrzqt;
        public List<Application> copydefault = new ArrayList();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull List<Application> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Application> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(float f) {
            this.OLrzqt = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(float f) {
            this.AEQbTJ = f;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }

        public final void EZpvd(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            this.copydefault.add(application);
        }
    }

    public final class Application {
        public Rect AEQbTJ;
        public View KWHzl;
        public final /* synthetic */ FlowLayoutManager OLrzqt;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Rect AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final View OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(Rect rect) {
            this.AEQbTJ = rect;
        }

        public Application(FlowLayoutManager flowLayoutManager, @NotNull int i, View view, Rect rect) {
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = flowLayoutManager;
            this.copydefault = i;
            this.KWHzl = view;
            this.AEQbTJ = rect;
        }
    }
}
