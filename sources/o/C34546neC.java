package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.neC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34546neC extends C55372xih {
    public java.util.List<? extends android.view.View> EZpvd;
    public android.view.View KWHzl;
    public boolean OLrzqt;
    public C55251xgS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34546neC(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:12) call: o.neC.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C34546neC(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34546neC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setItems(@NotNull java.util.List<? extends android.view.View> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty() && this.KWHzl == null) {
            setVisibility(8);
            requestLayout();
            return;
        }
        setVisibility(0);
        setVerticalSpacing(C55298xhM.dp2px$default(4.0f, null, 1, null));
        setHorizontalSpacing(C55298xhM.dp2px$default(4.0f, null, 1, null));
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.View view = this.KWHzl;
        if (view != null) {
            arrayList.add(view);
        }
        arrayList.addAll(list);
        addViewsToLayout$default(this, arrayList, 0, 2, null);
        KWHzl();
        setExpand(this.OLrzqt);
        setVisibility(0);
        setOnFirstTimeMeasureCallback(new Function1() { // from class: o.neA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34546neC.OLrzqt(this.copydefault, arrayList, ((java.lang.Integer) obj).intValue());
            }
        });
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55251xgS c55251xgS = new C55251xgS(context, null, 0, 6, null);
        c55251xgS.setShowIcon(true);
        c55251xgS.setTagIcon(C33070mpX.KWHzl(C52761wXj.TaskDescription.DCUTEIddSDPG));
        copydefault(this.OLrzqt);
        c55251xgS.setOnClickListener(new View.OnClickListener() { // from class: o.neD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C34546neC.setItems$lambda$5$lambda$4(this.KWHzl, arrayList, view2);
            }
        });
        this.copydefault = c55251xgS;
        setOnMeasureCallback(new Function1() { // from class: o.neF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34546neC.AEQbTJ(this.OLrzqt, arrayList, ((java.lang.Integer) obj).intValue());
            }
        });
        this.EZpvd = list;
    }

    public static final Unit OLrzqt(C34546neC c34546neC, java.util.List list, int i) {
        if (i > 2) {
            c34546neC.copydefault(list, c34546neC.OLrzqt ? list.size() : c34546neC.OLrzqt());
            c34546neC.addView(c34546neC.copydefault);
        }
        return Unit.INSTANCE;
    }

    public static final void setItems$lambda$5$lambda$4(C34546neC c34546neC, java.util.List list, android.view.View view) {
        c34546neC.removeAllViews();
        c34546neC.setExpand(!c34546neC.AEQbTJ());
        c34546neC.OLrzqt = c34546neC.AEQbTJ();
        if (c34546neC.AEQbTJ()) {
            addViewsToLayout$default(c34546neC, list, 0, 2, null);
            c34546neC.copydefault(true);
        } else {
            c34546neC.copydefault(list, c34546neC.OLrzqt());
            c34546neC.copydefault(false);
        }
        c34546neC.addView(c34546neC.copydefault);
    }

    public static final Unit AEQbTJ(C34546neC c34546neC, java.util.List list, int i) {
        if (i > 2) {
            c34546neC.copydefault(list, c34546neC.OLrzqt ? list.size() : c34546neC.OLrzqt());
            c34546neC.addView(c34546neC.copydefault);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void addViewsToLayout$default(C34546neC c34546neC, java.util.List list, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = list.size();
        }
        c34546neC.copydefault(list, i);
    }

    public final void copydefault(java.util.List<? extends android.view.View> list, int i) {
        removeAllViews();
        setVisibility(0);
        for (int i2 = 0; i2 < i; i2++) {
            addView(list.get(i2));
        }
    }

    private final void copydefault(boolean z) {
        C55251xgS c55251xgS = this.copydefault;
        if (c55251xgS != null) {
            c55251xgS.setTagIcon(C33070mpX.KWHzl(z ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG));
        }
    }

    public final void setFirstIcon(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl = view;
        if (this.EZpvd == null || getChildCount() == 0) {
            return;
        }
        addView(view, 0);
    }
}
