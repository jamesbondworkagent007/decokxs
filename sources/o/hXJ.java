package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class hXJ extends ConstraintLayout {
    public long AEQbTJ;
    public long AYXKKw;
    public boolean AhwBna;
    public boolean EZpvd;
    public Function1<? super java.lang.String, Unit> KWHzl;
    public Function2<? super java.lang.Long, ? super java.lang.Long, Unit> OLrzqt;
    public ActionBar copydefault;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXJ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<java.lang.String, Unit> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit>, kotlin.jvm.functions.Function2<java.lang.Long, java.lang.Long, kotlin.Unit> */
    public final Function2<java.lang.Long, java.lang.Long, Unit> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountDownCallback(Function2<? super java.lang.Long, ? super java.lang.Long, Unit> function2) {
        this.OLrzqt = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountDownListener(Function1<? super java.lang.String, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedTime(long j) {
        this.AEQbTJ = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCountDownFinish(Function1<? super java.lang.String, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCountDownFinish(Function2<? super java.lang.Long, ? super java.lang.Long, Unit> function2) {
        this.OLrzqt = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUntilEstimatedTime(long j) {
        this.AYXKKw = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.hXJ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hXJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hXJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.hXL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hXJ.copydefault(this.copydefault);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C57406yhn.TaskDescription.KWHzl, (android.view.ViewGroup) this, true);
    }

    public static final AppCompatTextView copydefault(hXJ hxj) {
        return (AppCompatTextView) hxj.findViewById(C23274hvD.Application.setSplitBackgroundDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatTextView gEmmrt() {
        java.lang.Object value = this.gEmmrt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public final void setCountDownEstimatedTime(long j, long j2) {
        this.AEQbTJ = j;
        this.AYXKKw = j2;
        long jValueOf = C33129mqd.valueOf(C23313hvq.addCheckS$default(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), null, null, null, 14, null));
        if (!C22370heA.KWHzl().containsKey(java.lang.Long.valueOf(j))) {
            C22370heA.KWHzl().clear();
            C22370heA.KWHzl().put(java.lang.Long.valueOf(j), java.lang.Long.valueOf(jValueOf));
        }
        java.util.Collection<java.lang.Long> collectionValues = C22370heA.KWHzl().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.lang.Long l = (java.lang.Long) CollectionsKt___CollectionsKt.RcXXUw(collectionValues);
        ActionBar actionBar = this.copydefault;
        if (actionBar != null) {
            if (actionBar != null) {
                actionBar.cancel();
            }
            this.copydefault = null;
        }
        this.copydefault = new ActionBar(l != null ? l.longValue() : 0L, 1000L);
        if (C23313hvq.EZpvd(java.lang.Long.valueOf(jValueOf), 0)) {
            copydefault();
        }
    }

    public final void copydefault() {
        ActionBar actionBar = this.copydefault;
        if (actionBar != null) {
            actionBar.cancel();
        }
        ActionBar actionBar2 = this.copydefault;
        if (actionBar2 != null) {
            actionBar2.start();
        }
    }

    public final void KWHzl() {
        ActionBar actionBar = this.copydefault;
        if (actionBar != null) {
            actionBar.cancel();
        }
        C22370heA.KWHzl().clear();
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class ActionBar extends android.os.CountDownTimer {
        public ActionBar(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            java.lang.String strSubCheckS$default = C23313hvq.subCheckS$default(java.lang.Long.valueOf(j), java.lang.Long.valueOf(hXJ.this.AEQbTJ()), null, null, null, 14, null);
            if (!C33129mqd.copydefault((java.lang.Object) strSubCheckS$default, (java.lang.Object) 0)) {
                if (C23313hvq.valueOf(java.lang.Integer.valueOf(C33129mqd.AhwBna(C23313hvq.divCheckS$default(C23311hvo.copydefault(strSubCheckS$default), 1000, null, null, null, 14, null))), 0)) {
                    hXJ.this.setVisibility(8);
                    Function2<java.lang.Long, java.lang.Long, Unit> function2OLrzqt = hXJ.this.OLrzqt();
                    if (function2OLrzqt != null) {
                        function2OLrzqt.invoke(-1L, java.lang.Long.valueOf(j));
                    }
                }
            } else {
                hXJ.this.gEmmrt().setText(C23311hvo.KWHzl(C33129mqd.AhwBna(C23313hvq.divCheckS$default(strSubCheckS$default, 1000, null, null, null, 14, null)), true));
            }
            Function1<java.lang.String, Unit> function1EZpvd = hXJ.this.EZpvd();
            if (function1EZpvd != null) {
                function1EZpvd.invoke(C23313hvq.divCheckS$default(strSubCheckS$default, 1000, null, null, null, 14, null));
            }
            java.util.Set<java.lang.Long> setKeySet = C22370heA.KWHzl().keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "");
            java.lang.Long l = (java.lang.Long) CollectionsKt___CollectionsKt.RcXXUw(setKeySet);
            if (l != null) {
                C22370heA.KWHzl().put(l, java.lang.Long.valueOf(j));
            }
            hXJ.this.EZpvd = true;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Function2<java.lang.Long, java.lang.Long, Unit> function2OLrzqt = hXJ.this.OLrzqt();
            if (function2OLrzqt != null) {
                function2OLrzqt.invoke(-1L, -1L);
            }
            hXJ.this.AhwBna = true;
            hXJ.this.setVisibility(8);
            C22370heA.KWHzl().clear();
            hXJ.this.EZpvd = false;
        }
    }
}
