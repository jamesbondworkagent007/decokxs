package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.localization.util.format.OKDateEnum;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qIH extends ConstraintLayout {
    public final C42929rfg AEQbTJ;
    public java.util.List<java.lang.Long> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qIH(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qIH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: o.qIH.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ qIH(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qIH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42929rfg c42929rfgAEQbTJ = C42929rfg.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42929rfgAEQbTJ, "");
        this.AEQbTJ = c42929rfgAEQbTJ;
        if (isInEditMode()) {
            long time = new Date().getTime();
            java.util.ArrayList arrayList = new java.util.ArrayList(10);
            for (int i2 = 0; i2 < 10; i2++) {
                arrayList.add(java.lang.Long.valueOf(((long) (86400000 * i2)) + time));
            }
            setPeriods(arrayList, 0, new Function1() { // from class: o.qIN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return qIH.AEQbTJ(((java.lang.Long) obj).longValue());
                }
            });
            setTradeOptionEnable$default(this, true, null, 2, null);
        }
    }

    public static final Unit AEQbTJ(long j) {
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static /* synthetic */ void setPeriods$default(qIH qih, java.util.List list, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        qih.setPeriods(list, i, function1);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.rgO.setItems$default(o.rgO, java.util.ArrayList, int, java.lang.Boolean, int, java.lang.Object):void */
    public final void setPeriods(@NotNull java.util.List<java.lang.Long> list, int i, @NotNull final Function1<? super java.lang.Long, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (Intrinsics.EZpvd(this.OLrzqt, list)) {
            return;
        }
        this.OLrzqt = list;
        final java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Date(((java.lang.Number) it.next()).longValue()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(pTA.formatDate$default((Date) it2.next(), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null));
        }
        final java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
        C42964rgO.setItems$default(this.AEQbTJ.OLrzqt, arrayList3, i, null, 4, null);
        this.AEQbTJ.OLrzqt.setOnClickItemListener(new Function1() { // from class: o.qIL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qIH.KWHzl(arrayList3, function1, arrayList, (java.lang.String) obj);
            }
        });
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qIH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTradeOptionEnable$default(qIH qih, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.qIG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return qIH.copydefault();
                }
            };
        }
        qih.setTradeOptionEnable(z, function0);
    }

    public final void setTradeOptionEnable(boolean z, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        android.widget.TextView textView = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        AppCompatImageView appCompatImageView = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
        C42929rfg c42929rfg = this.AEQbTJ;
        C41431qqg.EZpvd(new android.view.View[]{c42929rfg.KWHzl, c42929rfg.AEQbTJ}, (Function0<Unit>) new Function0() { // from class: o.qIF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qIH.copydefault(function0);
            }
        });
    }

    public static final Unit copydefault(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.util.ArrayList arrayList, Function1 function1, java.util.List list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.EZpvd(it.next(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            Date date = (Date) CollectionsKt___CollectionsKt.AkhnZx(list, numValueOf.intValue());
            function1.invoke(java.lang.Long.valueOf(date != null ? date.getTime() : 0L));
        }
        return Unit.INSTANCE;
    }
}
