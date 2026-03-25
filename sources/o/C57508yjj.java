package o;

import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57512yjn;
import o.C57519yju;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57508yjj extends LinearLayoutCompat {
    public final java.util.List<android.view.View> AEQbTJ;
    public C57519yju OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57508yjj(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57508yjj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.yjj.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57508yjj(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57508yjj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new java.util.ArrayList();
        setOrientation(1);
    }

    public static /* synthetic */ void setData$default(C57508yjj c57508yjj, java.util.List list, int i, java.lang.String str, java.lang.String str2, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        int i3 = i;
        java.lang.String str3 = (i2 & 4) != 0 ? "" : str;
        java.lang.String str4 = (i2 & 8) != 0 ? "" : str2;
        if ((i2 & 16) != 0) {
            z = true;
        }
        c57508yjj.setData(list, i3, str3, str4, z);
    }

    public final void setData(@NotNull java.util.List<? extends java.util.List<C57512yjn.ActionBar>> list, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        removeAllViews();
        this.AEQbTJ.clear();
        this.OLrzqt = null;
        if (list.isEmpty()) {
            setVisibility(8);
            return;
        }
        int i2 = 0;
        setVisibility(0);
        java.util.Iterator it = CollectionsKt___CollectionsKt.QfsBiF(list).iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((java.util.List) it.next()).size();
        }
        boolean z2 = size > i && i > 0;
        int i3 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            java.util.List<C57512yjn.ActionBar> list2 = (java.util.List) obj;
            if (list2 == null) {
                android.view.View viewEZpvd = EZpvd();
                if (z2 && i3 >= i) {
                    this.AEQbTJ.add(viewEZpvd);
                }
                addView(viewEZpvd);
            } else if (!list2.isEmpty()) {
                for (android.view.View view : EZpvd(list2, i2, list)) {
                    if (z2 && i3 >= i) {
                        this.AEQbTJ.add(view);
                    }
                    addView(view);
                    i3++;
                }
            }
            i2++;
        }
        if (z2 && (!this.AEQbTJ.isEmpty())) {
            copydefault(str, str2, z);
        }
    }

    public final android.view.View EZpvd() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C57473yjA c57473yjA = new C57473yjA(context, null, 0, 6, null);
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, -2);
        layoutParams.setMarginStart(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
        c57473yjA.setLayoutParams(layoutParams);
        return c57473yjA;
    }

    public final java.util.List<android.view.View> EZpvd(java.util.List<C57512yjn.ActionBar> list, int i, java.util.List<? extends java.util.List<C57512yjn.ActionBar>> list2) {
        int iDpInt$default;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = i > 0 && list2.get(i + (-1)) == null;
        boolean z2 = i < list2.size() - 1 && list2.get(i + 1) == null;
        boolean z3 = i == 0;
        boolean z4 = i == list2.size() - 1;
        int i2 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            C57512yjn.ActionBar actionBar = (C57512yjn.ActionBar) obj;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C57512yjn c57512yjn = new C57512yjn(context, null, 0, false, 6, null);
            c57512yjn.setData(actionBar);
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, -2);
            if (i2 == 0) {
                if (z3) {
                    iDpInt$default = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
                } else if (z) {
                    iDpInt$default = 0;
                } else {
                    ((LinearLayout.LayoutParams) layoutParams).topMargin = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
                }
                ((LinearLayout.LayoutParams) layoutParams).topMargin = iDpInt$default;
            } else {
                ((LinearLayout.LayoutParams) layoutParams).topMargin = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
            }
            if (actionBar.EZpvd() != null && actionBar.KWHzl() == null && actionBar.AEQbTJ() == null && actionBar.OLrzqt() == null) {
                ((LinearLayout.LayoutParams) layoutParams).bottomMargin = 0;
            } else if (i2 == list.size() - 1) {
                if (z4) {
                    ((LinearLayout.LayoutParams) layoutParams).bottomMargin = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
                } else if (z2) {
                    ((LinearLayout.LayoutParams) layoutParams).bottomMargin = 0;
                } else {
                    ((LinearLayout.LayoutParams) layoutParams).bottomMargin = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
                }
            }
            c57512yjn.setLayoutParams(layoutParams);
            arrayList.add(c57512yjn);
            i2++;
        }
        return arrayList;
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, boolean z) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C57519yju c57519yju = new C57519yju(context, null, 0, 6, null);
        c57519yju.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -2));
        c57519yju.setData(new C57519yju.ActionBar(str, str2, false, null, z, 8, null));
        c57519yju.setAssociatedViews(this.AEQbTJ);
        this.OLrzqt = c57519yju;
        android.view.View view = (android.view.View) CollectionsKt___CollectionsKt.wlaJM(this.AEQbTJ);
        addView(this.OLrzqt, view != null ? indexOfChild(view) + 1 : getChildCount());
    }
}
