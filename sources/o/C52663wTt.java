package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wTt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52663wTt implements RecyclerView.OnChildAttachStateChangeListener {
    public C52661wTr AYXKKw;
    public RecyclerView DbNXlk;
    public boolean EZpvd;
    public boolean copydefault;
    public boolean djBIcL;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public int valueOf = 1;
    public int AkhnZx = -1;
    public int OLrzqt = -1;
    public boolean AhwBna = true;
    public boolean KWHzl = true;
    public final android.graphics.Rect gEmmrt = new android.graphics.Rect();
    public final TaskDescription fetchVPNInfo = new TaskDescription();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna() {
        this.copydefault = false;
        this.OLrzqt = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl(int i) {
        return this.OLrzqt == i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    /* JADX INFO: renamed from: o.wTt$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wTt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.wTt$TaskDescription */
    public static final class TaskDescription extends RecyclerView.OnScrollListener {
        public boolean copydefault;

        public TaskDescription() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (recyclerView.isShown() && i == 0 && this.copydefault) {
                this.copydefault = false;
                android.util.Pair pairAEQbTJ = C52663wTt.this.AEQbTJ();
                if (pairAEQbTJ.first == null) {
                    return;
                }
                C52663wTt c52663wTt = C52663wTt.this;
                java.lang.Object obj = pairAEQbTJ.second;
                Intrinsics.checkNotNullExpressionValue(obj, "");
                if (c52663wTt.KWHzl(((java.lang.Number) obj).intValue())) {
                    int iKWHzl = C52663wTt.this.KWHzl((android.view.View) pairAEQbTJ.first);
                    pUU.OLrzqt("Found item was activated, visible percent is " + iKWHzl + "%.");
                    if (iKWHzl < 50) {
                        C52663wTt c52663wTt2 = C52663wTt.this;
                        java.lang.Object obj2 = pairAEQbTJ.first;
                        Intrinsics.checkNotNullExpressionValue(obj2, "");
                        java.lang.Object obj3 = pairAEQbTJ.second;
                        Intrinsics.checkNotNullExpressionValue(obj3, "");
                        c52663wTt2.KWHzl((android.view.View) obj2, ((java.lang.Number) obj3).intValue());
                        return;
                    }
                    C52663wTt c52663wTt3 = C52663wTt.this;
                    java.lang.Object obj4 = pairAEQbTJ.first;
                    Intrinsics.checkNotNullExpressionValue(obj4, "");
                    java.lang.Object obj5 = pairAEQbTJ.second;
                    Intrinsics.checkNotNullExpressionValue(obj5, "");
                    c52663wTt3.OLrzqt((android.view.View) obj4, ((java.lang.Number) obj5).intValue());
                    return;
                }
                C52663wTt c52663wTt4 = C52663wTt.this;
                android.view.View viewAEQbTJ = c52663wTt4.AEQbTJ(c52663wTt4.OLrzqt);
                int iKWHzl2 = C52663wTt.this.KWHzl(viewAEQbTJ);
                if (C52663wTt.this.KWHzl) {
                    if (iKWHzl2 < 50) {
                        C52663wTt c52663wTt5 = C52663wTt.this;
                        android.view.View view = (android.view.View) pairAEQbTJ.first;
                        java.lang.Object obj6 = pairAEQbTJ.second;
                        Intrinsics.checkNotNullExpressionValue(obj6, "");
                        c52663wTt5.KWHzl(view, ((java.lang.Number) obj6).intValue(), C52663wTt.this.OLrzqt);
                        return;
                    }
                    pUU.OLrzqt("Current item visible percent >=50%, do nothing.");
                    return;
                }
                pUU.OLrzqt("No other item need to be activated.");
                if (iKWHzl2 < 50) {
                    if (viewAEQbTJ != null) {
                        C52663wTt c52663wTt6 = C52663wTt.this;
                        c52663wTt6.KWHzl(viewAEQbTJ, c52663wTt6.OLrzqt);
                        return;
                    }
                    return;
                }
                if (viewAEQbTJ != null) {
                    C52663wTt c52663wTt7 = C52663wTt.this;
                    c52663wTt7.OLrzqt(viewAEQbTJ, c52663wTt7.OLrzqt);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (i != 0 || i2 != 0) {
                this.copydefault = true;
            }
            if (C52663wTt.this.copydefault()) {
                C52663wTt c52663wTt = C52663wTt.this;
                android.view.View viewAEQbTJ = c52663wTt.AEQbTJ(c52663wTt.OLrzqt);
                if (viewAEQbTJ != null) {
                    int iKWHzl = C52663wTt.this.KWHzl(viewAEQbTJ);
                    pUU.OLrzqt("Current item visible percent is " + iKWHzl + "%.");
                    if (iKWHzl == 0) {
                        C52663wTt c52663wTt2 = C52663wTt.this;
                        c52663wTt2.copydefault(viewAEQbTJ, c52663wTt2.OLrzqt);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(@NotNull android.view.View view) {
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        Intrinsics.checkNotNullParameter(view, "");
        if (copydefault()) {
            RecyclerView recyclerView = this.DbNXlk;
            int adapterPosition = (recyclerView == null || (viewHolderFindContainingViewHolder = recyclerView.findContainingViewHolder(view)) == null) ? -1 : viewHolderFindContainingViewHolder.getAdapterPosition();
            if (KWHzl(adapterPosition)) {
                copydefault(view, adapterPosition);
            }
        }
    }

    public static /* synthetic */ void attachToRecyclerView$default(C52663wTt c52663wTt, RecyclerView recyclerView, int i, boolean z, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        c52663wTt.AEQbTJ(recyclerView, i, z, function1);
    }

    public final void AEQbTJ(@NotNull RecyclerView recyclerView, @androidx.annotation.IdRes int i, boolean z, @NotNull Function1<? super C52661wTr, Unit> function1) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (this.DbNXlk == recyclerView) {
            return;
        }
        EZpvd();
        this.DbNXlk = recyclerView;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager2, "");
            this.valueOf = ((LinearLayoutManager) layoutManager2).getOrientation();
            RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager3, "");
            this.djBIcL = ((LinearLayoutManager) layoutManager3).getReverseLayout();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            RecyclerView.LayoutManager layoutManager4 = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager4, "");
            this.valueOf = ((StaggeredGridLayoutManager) layoutManager4).getOrientation();
            RecyclerView.LayoutManager layoutManager5 = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager5, "");
            this.djBIcL = ((StaggeredGridLayoutManager) layoutManager5).getReverseLayout();
        } else {
            throw new java.lang.RuntimeException("Only support RecyclerView with LinearLayoutManager, GridLayoutManager or StaggeredGridLayoutManager.");
        }
        this.AkhnZx = i;
        this.KWHzl = z;
        KWHzl(function1);
        pUU.AEQbTJ("ItemVisibilityHelper was attached to RecyclerView.\nHas targetViewId: " + (i != -1) + ".\nAutoActivate: " + z + JwtUtilsKt.JWT_DELIMITER);
    }

    public final void OLrzqt() {
        if (copydefault()) {
            pUU.OLrzqt("Current has an activated item.");
            return;
        }
        android.util.Pair<android.view.View, java.lang.Integer> pairAEQbTJ = AEQbTJ();
        if (AEQbTJ(pairAEQbTJ)) {
            this.copydefault = true;
        }
        android.view.View view = (android.view.View) pairAEQbTJ.first;
        java.lang.Object obj = pairAEQbTJ.second;
        Intrinsics.checkNotNullExpressionValue(obj, "");
        KWHzl(view, ((java.lang.Number) obj).intValue(), this.OLrzqt);
    }

    public final boolean AEQbTJ(android.util.Pair<android.view.View, java.lang.Integer> pair) {
        return pair.first != null && ((java.lang.Number) pair.second).intValue() >= 0;
    }

    public final void KWHzl(android.view.View view, int i, int i2) {
        if (KWHzl(view) < 50 || view == null) {
            pUU.OLrzqt("Prepared item visible percent <50%, shouldn't activate it.");
            return;
        }
        android.view.View viewAEQbTJ = AEQbTJ(i2);
        if (viewAEQbTJ != null) {
            copydefault(viewAEQbTJ, i2);
        }
        this.OLrzqt = i;
        C52661wTr c52661wTr = this.AYXKKw;
        if (c52661wTr != null) {
            c52661wTr.KWHzl(view, i);
        }
        pUU.AEQbTJ("Activated item with position " + i + JwtUtilsKt.JWT_DELIMITER);
    }

    public final void copydefault(android.view.View view, int i) {
        this.OLrzqt = -1;
        this.EZpvd = false;
        C52661wTr c52661wTr = this.AYXKKw;
        if (c52661wTr != null) {
            c52661wTr.AEQbTJ(view, i);
        }
        pUU.AEQbTJ("Deactivated item with position " + i + JwtUtilsKt.JWT_DELIMITER);
    }

    public final void KWHzl(android.view.View view, int i) {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        C52661wTr c52661wTr = this.AYXKKw;
        if (c52661wTr != null) {
            c52661wTr.EZpvd(view, i);
        }
        pUU.AEQbTJ("Paused item with position " + i + JwtUtilsKt.JWT_DELIMITER);
    }

    public final void OLrzqt(android.view.View view, int i) {
        if (this.EZpvd) {
            this.EZpvd = false;
            C52661wTr c52661wTr = this.AYXKKw;
            if (c52661wTr != null) {
                c52661wTr.OLrzqt(view, i);
            }
            pUU.AEQbTJ("Resumed item with position " + i + JwtUtilsKt.JWT_DELIMITER);
        }
    }

    public final android.util.Pair<android.view.View, java.lang.Integer> copydefault(int i, int i2) {
        pUU.OLrzqt("Find next: from " + i + " to " + i2 + JwtUtilsKt.JWT_DELIMITER);
        int i3 = 0;
        int i4 = -1;
        if (i <= i2) {
            while (true) {
                android.view.View viewAEQbTJ = AEQbTJ(i);
                int iKWHzl = KWHzl(viewAEQbTJ);
                if (iKWHzl == 100) {
                    pUU.OLrzqt("Find next: position=" + i + " max=100 return.");
                    android.util.Pair<android.view.View, java.lang.Integer> pairCreate = android.util.Pair.create(viewAEQbTJ, java.lang.Integer.valueOf(i));
                    Intrinsics.checkNotNullExpressionValue(pairCreate, "");
                    return pairCreate;
                }
                if (i3 < iKWHzl) {
                    i4 = i;
                    i3 = iKWHzl;
                }
                pUU.OLrzqt("Find next: position=" + i + " max=" + iKWHzl + JwtUtilsKt.JWT_DELIMITER);
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        if (i3 > 0) {
            pUU.OLrzqt("Find next: return position " + i4 + JwtUtilsKt.JWT_DELIMITER);
            android.util.Pair<android.view.View, java.lang.Integer> pairCreate2 = android.util.Pair.create(AEQbTJ(i4), java.lang.Integer.valueOf(i4));
            Intrinsics.checkNotNullExpressionValue(pairCreate2, "");
            return pairCreate2;
        }
        pUU.OLrzqt("Find next: not found.");
        android.util.Pair<android.view.View, java.lang.Integer> pairCreate3 = android.util.Pair.create(null, java.lang.Integer.valueOf(i4));
        Intrinsics.checkNotNullExpressionValue(pairCreate3, "");
        return pairCreate3;
    }

    public final android.util.Pair<android.view.View, java.lang.Integer> KWHzl(int i, int i2) {
        pUU.OLrzqt("Find last: from " + i + " to " + i2 + JwtUtilsKt.JWT_DELIMITER);
        int i3 = 0;
        int i4 = -1;
        if (i2 <= i) {
            while (true) {
                android.view.View viewAEQbTJ = AEQbTJ(i);
                int iKWHzl = KWHzl(viewAEQbTJ);
                if (iKWHzl == 100) {
                    pUU.OLrzqt("Find last: position=" + i + " max=100 return.");
                    android.util.Pair<android.view.View, java.lang.Integer> pairCreate = android.util.Pair.create(viewAEQbTJ, java.lang.Integer.valueOf(i));
                    Intrinsics.checkNotNullExpressionValue(pairCreate, "");
                    return pairCreate;
                }
                if (i3 < iKWHzl) {
                    i4 = i;
                    i3 = iKWHzl;
                }
                pUU.OLrzqt("Find last: position=" + i + " max=" + iKWHzl + JwtUtilsKt.JWT_DELIMITER);
                if (i == i2) {
                    break;
                }
                i--;
            }
        }
        if (i3 > 0) {
            pUU.OLrzqt("Find last: return position " + i4 + JwtUtilsKt.JWT_DELIMITER);
            android.util.Pair<android.view.View, java.lang.Integer> pairCreate2 = android.util.Pair.create(AEQbTJ(i4), java.lang.Integer.valueOf(i4));
            Intrinsics.checkNotNullExpressionValue(pairCreate2, "");
            return pairCreate2;
        }
        pUU.OLrzqt("Find last: not found.");
        android.util.Pair<android.view.View, java.lang.Integer> pairCreate3 = android.util.Pair.create(null, java.lang.Integer.valueOf(i4));
        Intrinsics.checkNotNullExpressionValue(pairCreate3, "");
        return pairCreate3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int EZpvd(android.view.View view, int i) {
        int iComputeVerticalScrollExtent;
        boolean z = false;
        if (view == null || !view.getLocalVisibleRect(this.gEmmrt)) {
            return 0;
        }
        int width = i == 0 ? view.getWidth() : view.getHeight();
        if (i == 0) {
            RecyclerView recyclerView = this.DbNXlk;
            iComputeVerticalScrollExtent = recyclerView != null ? recyclerView.computeHorizontalScrollExtent() : 0;
        } else {
            RecyclerView recyclerView2 = this.DbNXlk;
            if (recyclerView2 != null) {
                iComputeVerticalScrollExtent = recyclerView2.computeVerticalScrollExtent();
            }
        }
        android.graphics.Rect rect = this.gEmmrt;
        int i2 = i == 0 ? rect.left : rect.top;
        int i3 = i == 0 ? this.gEmmrt.right : this.gEmmrt.bottom;
        if (!this.djBIcL ? i2 >= width - i3 : i2 < width - i3) {
            z = true;
        }
        this.AhwBna = z;
        if (width >= iComputeVerticalScrollExtent) {
            return ((i3 - i2) * 100) / iComputeVerticalScrollExtent;
        }
        if (i2 > 0) {
            return ((width - i2) * 100) / width;
        }
        if (width - i3 > 0) {
            return (i3 * 100) / width;
        }
        return 100;
    }

    public final android.util.Pair<android.view.View, java.lang.Integer> AEQbTJ() {
        int iIntValue;
        int iFindFirstVisibleItemPosition;
        RecyclerView recyclerView = this.DbNXlk;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            iIntValue = linearLayoutManager.findLastVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArrFindFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
            Intrinsics.checkNotNullExpressionValue(iArrFindFirstVisibleItemPositions, "");
            java.lang.Integer numZsXlph = yDV.zsXlph(iArrFindFirstVisibleItemPositions);
            int iIntValue2 = numZsXlph != null ? numZsXlph.intValue() : -1;
            int[] iArrFindLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
            Intrinsics.checkNotNullExpressionValue(iArrFindLastVisibleItemPositions, "");
            java.lang.Integer numHDKMBd = yDV.hDKMBd(iArrFindLastVisibleItemPositions);
            iIntValue = numHDKMBd != null ? numHDKMBd.intValue() : -1;
            iFindFirstVisibleItemPosition = iIntValue2;
        } else {
            iIntValue = -1;
            iFindFirstVisibleItemPosition = -1;
        }
        if (this.AhwBna) {
            return copydefault(iFindFirstVisibleItemPosition, iIntValue);
        }
        return KWHzl(iIntValue, iFindFirstVisibleItemPosition);
    }

    public final android.view.View AEQbTJ(int i) {
        RecyclerView.LayoutManager layoutManager;
        RecyclerView recyclerView = this.DbNXlk;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return null;
        }
        return layoutManager.findViewByPosition(i);
    }

    public final int KWHzl(android.view.View view) {
        int i = this.AkhnZx;
        if (i != -1) {
            return EZpvd(view != null ? view.findViewById(i) : null, this.valueOf);
        }
        return EZpvd(view, this.valueOf);
    }

    public final void KWHzl(Function1<? super C52661wTr, Unit> function1) {
        RecyclerView recyclerView = this.DbNXlk;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.fetchVPNInfo);
        }
        RecyclerView recyclerView2 = this.DbNXlk;
        if (recyclerView2 != null) {
            recyclerView2.addOnChildAttachStateChangeListener(this);
        }
        C52661wTr c52661wTr = new C52661wTr();
        function1.invoke(c52661wTr);
        this.AYXKKw = c52661wTr;
    }

    public final void EZpvd() {
        RecyclerView recyclerView = this.DbNXlk;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.fetchVPNInfo);
        }
        RecyclerView recyclerView2 = this.DbNXlk;
        if (recyclerView2 != null) {
            recyclerView2.removeOnChildAttachStateChangeListener(this);
        }
        this.AYXKKw = null;
    }

    public final java.util.List<java.lang.Integer> EZpvd(int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i2 != 0 && i <= i2 - 1) {
            int i3 = 0;
            if (i == 0) {
                while (i3 < i2 && i3 < 5) {
                    arrayList.add(java.lang.Integer.valueOf(i3));
                    i3++;
                }
            } else {
                int i4 = 0;
                for (int i5 = i - 1; -1 < i5 && i4 < 2; i5--) {
                    arrayList.add(java.lang.Integer.valueOf(i5));
                    i4++;
                }
                arrayList.add(java.lang.Integer.valueOf(i));
                while (true) {
                    i++;
                    if (i >= i2 || i3 >= 2) {
                        break;
                    }
                    arrayList.add(java.lang.Integer.valueOf(i));
                    i3++;
                }
            }
            pUU.KWHzl("ItemVisibilityHelper", "scroll active list: " + arrayList);
        }
        return arrayList;
    }

    public final java.util.List<java.lang.Integer> AEQbTJ(@NotNull java.util.List<java.lang.Integer> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            if (!list.contains(java.lang.Integer.valueOf(i2))) {
                arrayList.add(java.lang.Integer.valueOf(i2));
            }
        }
        pUU.KWHzl("ItemVisibilityHelper", "scroll deActive list: " + arrayList);
        return arrayList;
    }
}
