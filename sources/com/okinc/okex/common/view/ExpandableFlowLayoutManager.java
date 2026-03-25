package com.okinc.okex.common.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okex.common.view.ExpandableFlowLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56548yJl;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ExpandableFlowLayoutManager extends RecyclerView.LayoutManager {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public int AYXKKw;
    public int EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public int djBIcL;
    public final List<Integer> AEQbTJ = new ArrayList();
    public final Set<Integer> valueOf = new LinkedHashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return !this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.KWHzl;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.KWHzl;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.view.ExpandableFlowLayoutManager.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isConnected() {
        return getLayoutDirection() == 1;
    }

    public final int KWHzl() {
        if (isConnected()) {
            return getChildCount() - 1;
        }
        return 0;
    }

    public final int copydefault() {
        if (isConnected()) {
            return 0;
        }
        return getChildCount() - 1;
    }

    public final void EZpvd(boolean z) {
        AYXKKw();
        this.KWHzl = z;
        this.valueOf.clear();
        requestLayout();
        gEmmrt();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        return BundleKt.bundleOf(C56390yDp.OLrzqt("SCROLL_X", Integer.valueOf(this.EZpvd)), C56390yDp.OLrzqt("SCROLL_Y", Integer.valueOf(this.djBIcL)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle != null) {
            this.EZpvd = bundle.getInt("SCROLL_X");
            this.djBIcL = bundle.getInt("SCROLL_Y");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final int AhwBna() {
        if (this.valueOf.size() == 2) {
            return Math.abs(((Number) CollectionsKt___CollectionsKt.aKErDB(this.valueOf)).intValue() - ((Number) CollectionsKt___CollectionsKt.dNCPSb(this.valueOf)).intValue());
        }
        return 0;
    }

    public final int djBIcL() {
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        Set<Integer> set = this.valueOf;
        set.add(Integer.valueOf(width));
        if (set.size() > 2) {
            set.remove(CollectionsKt___CollectionsKt.dNCPSb(set));
        }
        return width;
    }

    public final int AEQbTJ() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public final int EZpvd() {
        return !isConnected() ? getPaddingStart() : getWidth() - getPaddingEnd();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(@NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "");
        Intrinsics.checkNotNullParameter(state, "");
        AYXKKw();
        detachAndScrapAttachedViews(recycler);
        if (getItemCount() == 0) {
            return;
        }
        if (this.KWHzl) {
            EZpvd(recycler);
        } else {
            copydefault(recycler);
        }
        gEmmrt();
    }

    public final void copydefault(RecyclerView.Recycler recycler) {
        int iEZpvd = EZpvd();
        this.AEQbTJ.clear();
        int itemCount = getItemCount();
        int i = iEZpvd;
        for (int i2 = 0; i2 < itemCount; i2++) {
            View viewForPosition = recycler.getViewForPosition(i2);
            Intrinsics.checkNotNullExpressionValue(viewForPosition, "");
            addView(viewForPosition);
            measureChildWithMargins(viewForPosition, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
            this.AEQbTJ.add(Integer.valueOf(decoratedMeasuredWidth));
            if (!isConnected()) {
                int paddingTop = getPaddingTop();
                int paddingTop2 = getPaddingTop() + decoratedMeasuredHeight;
                int i3 = i;
                i += decoratedMeasuredWidth;
                layoutDecorated(viewForPosition, i3, paddingTop, i, paddingTop2);
            } else {
                int i4 = i - decoratedMeasuredWidth;
                layoutDecorated(viewForPosition, i4, getPaddingTop(), i, getPaddingTop() + decoratedMeasuredHeight);
                i = i4;
            }
        }
    }

    public final void EZpvd(RecyclerView.Recycler recycler) {
        int iEZpvd;
        int paddingTop = getPaddingTop();
        int iEZpvd2 = EZpvd();
        int itemCount = getItemCount();
        int iMax = 0;
        for (int i = 0; i < itemCount; i++) {
            View viewForPosition = recycler.getViewForPosition(i);
            Intrinsics.checkNotNullExpressionValue(viewForPosition, "");
            addView(viewForPosition);
            measureChildWithMargins(viewForPosition, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
            iMax = Math.max(iMax, decoratedMeasuredHeight);
            if (!isConnected()) {
                if (iEZpvd2 + decoratedMeasuredWidth > djBIcL()) {
                    iEZpvd2 = EZpvd();
                    paddingTop += iMax;
                    iMax = decoratedMeasuredHeight;
                }
                int i2 = iEZpvd2 + decoratedMeasuredWidth;
                layoutDecorated(viewForPosition, iEZpvd2, paddingTop, i2, paddingTop + decoratedMeasuredHeight);
                iEZpvd2 = i2;
            } else {
                if (iEZpvd2 - decoratedMeasuredWidth < getPaddingEnd()) {
                    paddingTop += iMax;
                    iEZpvd = EZpvd();
                    iMax = decoratedMeasuredHeight;
                } else {
                    iEZpvd = iEZpvd2;
                }
                iEZpvd2 = iEZpvd - decoratedMeasuredWidth;
                layoutDecorated(viewForPosition, iEZpvd2, paddingTop, iEZpvd, paddingTop + decoratedMeasuredHeight);
            }
        }
    }

    public final void AYXKKw() {
        if (this.OLrzqt) {
            return;
        }
        if (!isConnected()) {
            View childAt = getChildAt(KWHzl());
            if (childAt != null) {
                if (this.KWHzl) {
                    this.djBIcL = getDecoratedTop(childAt);
                } else {
                    this.EZpvd = getDecoratedLeft(childAt) - getPaddingStart();
                }
            }
        } else {
            View childAt2 = getChildAt(copydefault());
            if (childAt2 != null) {
                if (this.KWHzl) {
                    this.djBIcL = getDecoratedTop(childAt2);
                } else {
                    this.EZpvd = (getDecoratedRight(childAt2) - djBIcL()) + AhwBna();
                }
            }
        }
        pUU.OLrzqt("saveScrollPositions: rvWidth: " + djBIcL() + ", isRtl: " + isConnected());
        pUU.OLrzqt("saveScrollPositions: horizontalScroll: " + this.EZpvd + ", isRtl: " + isConnected());
        pUU.OLrzqt("saveScrollPositions: ======== ");
    }

    public final void gEmmrt() {
        this.OLrzqt = true;
        if (this.KWHzl) {
            offsetChildrenVertical(this.djBIcL);
        } else {
            offsetChildrenHorizontal(this.EZpvd);
        }
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.postDelayed(new Runnable() { // from class: o.spg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ExpandableFlowLayoutManager.AEQbTJ(this.copydefault);
                }
            }, 300L);
        }
    }

    public static final void AEQbTJ(ExpandableFlowLayoutManager expandableFlowLayoutManager) {
        expandableFlowLayoutManager.OLrzqt = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(state, "");
        AYXKKw();
        return this.EZpvd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(state, "");
        return CollectionsKt___CollectionsKt.RlQdEF(this.AEQbTJ) - ((djBIcL() - getPaddingStart()) - getPaddingEnd());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(@NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(state, "");
        return djBIcL();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, @NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        int decoratedTop;
        int paddingTop;
        Intrinsics.checkNotNullParameter(recycler, "");
        Intrinsics.checkNotNullParameter(state, "");
        if (!this.KWHzl || getChildCount() == 0) {
            return 0;
        }
        if (i > 0) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt == null) {
                return 0;
            }
            decoratedTop = getDecoratedBottom(childAt);
            if (decoratedTop - i < AEQbTJ()) {
                paddingTop = AEQbTJ();
                i = decoratedTop - paddingTop;
            }
        } else if (i < 0) {
            View childAt2 = getChildAt(0);
            if (childAt2 == null) {
                return 0;
            }
            decoratedTop = getDecoratedTop(childAt2);
            if (decoratedTop - i > getPaddingTop()) {
                paddingTop = getPaddingTop();
                i = decoratedTop - paddingTop;
            }
        }
        offsetChildrenVertical(-i);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, @NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        int decoratedLeft;
        int paddingLeft;
        Intrinsics.checkNotNullParameter(recycler, "");
        Intrinsics.checkNotNullParameter(state, "");
        if (this.KWHzl || getChildCount() == 0) {
            return 0;
        }
        if (i > 0) {
            View childAt = getChildAt(copydefault());
            if (childAt == null) {
                return 0;
            }
            decoratedLeft = getDecoratedRight(childAt);
            if (decoratedLeft - i < djBIcL()) {
                paddingLeft = djBIcL();
                i = decoratedLeft - paddingLeft;
            }
        } else if (i < 0) {
            View childAt2 = getChildAt(KWHzl());
            if (childAt2 == null) {
                return 0;
            }
            decoratedLeft = getDecoratedLeft(childAt2);
            if (decoratedLeft - i > getPaddingLeft()) {
                paddingLeft = getPaddingLeft();
                i = decoratedLeft - paddingLeft;
            }
        }
        offsetChildrenHorizontal(-i);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        View viewFindViewByPosition;
        View childAt;
        View childAt2;
        int iIntValue;
        if (i < 0 || i >= getItemCount() || this.KWHzl || (viewFindViewByPosition = findViewByPosition(i)) == null || (childAt = getChildAt(KWHzl())) == null || (childAt2 = getChildAt(copydefault())) == null) {
            return;
        }
        int decoratedLeft = getDecoratedLeft(viewFindViewByPosition);
        int decoratedLeft2 = getDecoratedLeft(childAt);
        int paddingLeft = getPaddingLeft();
        int decoratedRight = getDecoratedRight(childAt2);
        int iDjBIcL = djBIcL();
        int width = (getWidth() + this.AYXKKw) / 2;
        if (!isConnected()) {
            iIntValue = width - (this.AEQbTJ.get(i).intValue() / 2);
        } else {
            iIntValue = (width - (this.AEQbTJ.get(i).intValue() / 2)) - this.AYXKKw;
        }
        int i2 = decoratedLeft - iIntValue;
        int iEZpvd = C56548yJl.EZpvd(i2, decoratedLeft2 - paddingLeft, decoratedRight - iDjBIcL);
        pUU.OLrzqt("scrollToPosition: targetLeft: " + decoratedLeft);
        pUU.OLrzqt("scrollToPosition: midPoint: " + width + ", itemWidthMidpoint: " + (this.AEQbTJ.get(i).intValue() / 2));
        StringBuilder sb = new StringBuilder();
        sb.append("scrollToPosition: offset: ");
        sb.append(iIntValue);
        pUU.OLrzqt(sb.toString());
        pUU.OLrzqt("scrollToPosition: absResult: " + i2 + ", result: " + iEZpvd);
        pUU.OLrzqt("scrollToPosition: ======== ");
        offsetChildrenHorizontal(-iEZpvd);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        if (i < 0 || i >= getItemCount() || recyclerView == null || state == null || this.KWHzl) {
            return;
        }
        StateListAnimator stateListAnimator = new StateListAnimator(i, recyclerView.getContext());
        stateListAnimator.setTargetPosition(i);
        startSmoothScroll(stateListAnimator);
    }

    public static final class StateListAnimator extends LinearSmoothScroller {
        public final /* synthetic */ int EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(int i, Context context) {
            super(context);
            this.EZpvd = i;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDxToMakeVisible(View view, int i) {
            if (view == null) {
                return 0;
            }
            int iCalculateDxToMakeVisible = super.calculateDxToMakeVisible(view, -1);
            int width = (-ExpandableFlowLayoutManager.this.getPaddingLeft()) + ((ExpandableFlowLayoutManager.this.getWidth() + ExpandableFlowLayoutManager.this.OLrzqt()) / 2);
            int iIntValue = !ExpandableFlowLayoutManager.this.isConnected() ? width - (((Number) ExpandableFlowLayoutManager.this.AEQbTJ.get(this.EZpvd)).intValue() / 2) : (width - (((Number) ExpandableFlowLayoutManager.this.AEQbTJ.get(this.EZpvd)).intValue() / 2)) - ExpandableFlowLayoutManager.this.OLrzqt();
            pUU.OLrzqt("smoothScrollToPosition: originalDx: " + iCalculateDxToMakeVisible);
            pUU.OLrzqt("smoothScrollToPosition: midPoint: " + width + ", itemWidthMidpoint: " + (((Number) ExpandableFlowLayoutManager.this.AEQbTJ.get(this.EZpvd)).intValue() / 2));
            StringBuilder sb = new StringBuilder();
            sb.append("smoothScrollToPosition: offset: ");
            sb.append(iIntValue);
            pUU.OLrzqt(sb.toString());
            int i2 = iCalculateDxToMakeVisible + iIntValue;
            pUU.OLrzqt("smoothScrollToPosition: result: " + i2);
            pUU.OLrzqt("smoothScrollToPosition: ======== ");
            return i2;
        }
    }
}
