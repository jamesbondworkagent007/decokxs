package o;

import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hNI extends android.widget.LinearLayout {
    public Function1<? super java.lang.String, java.lang.String> AEQbTJ;
    public final java.util.List<java.lang.String> KWHzl;
    public Function2<? super java.lang.String, ? super java.lang.Integer, Unit> OLrzqt;
    public hDI copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceCallback(@NotNull Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = function2;
    }

    public final void setDisplayTextFormatter(@NotNull Function1<? super java.lang.String, java.lang.String> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
        AEQbTJ();
    }

    public static final java.lang.String KWHzl(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C23311hvo.formatPercentWithSymbol$default(str, false, 0, 0, null, null, 31, null);
    }

    public final void KWHzl() {
        setDisplayTextFormatter(new Function1() { // from class: o.hNS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hNI.KWHzl((java.lang.String) obj);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hNI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = yDY.copydefault("0.25", SlippageConfigVo.MAX_SLIP, "0.75", "1");
        copydefault();
        AEQbTJ();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hNI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hNI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hNI(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void copydefault() {
        hDI hdiKWHzl = hDI.KWHzl(android.view.LayoutInflater.from(getContext()), this, true);
        this.copydefault = hdiKWHzl;
        if (hdiKWHzl != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(hdiKWHzl.EZpvd, 0L, new Function1() { // from class: o.hNP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hNI.OLrzqt(this.KWHzl, (android.view.View) obj);
                }
            }, 1, null);
            C25352ivB.setOnDoubleCheckClickListener$default(hdiKWHzl.KWHzl, 0L, new Function1() { // from class: o.hNN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hNI.AYXKKw(this.AEQbTJ, (android.view.View) obj);
                }
            }, 1, null);
            C25352ivB.setOnDoubleCheckClickListener$default(hdiKWHzl.AEQbTJ, 0L, new Function1() { // from class: o.hNO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hNI.djBIcL(this.EZpvd, (android.view.View) obj);
                }
            }, 1, null);
            C25352ivB.setOnDoubleCheckClickListener$default(hdiKWHzl.OLrzqt, 0L, new Function1() { // from class: o.hNQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hNI.AhwBna(this.EZpvd, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit OLrzqt(hNI hni, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2 = hni.OLrzqt;
        if (function2 != null) {
            function2.invoke(hni.KWHzl.get(0), 0);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(hNI hni, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2 = hni.OLrzqt;
        if (function2 != null) {
            function2.invoke(hni.KWHzl.get(1), 1);
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(hNI hni, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2 = hni.OLrzqt;
        if (function2 != null) {
            function2.invoke(hni.KWHzl.get(2), 2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(hNI hni, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2 = hni.OLrzqt;
        if (function2 != null) {
            function2.invoke(hni.KWHzl.get(3), 3);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        hDI hdi = this.copydefault;
        if (hdi != null) {
            hdi.EZpvd.setText(OLrzqt(this.KWHzl.get(0)));
            hdi.KWHzl.setText(OLrzqt(this.KWHzl.get(1)));
            hdi.AEQbTJ.setText(OLrzqt(this.KWHzl.get(2)));
            hdi.OLrzqt.setText(OLrzqt(this.KWHzl.get(3)));
        }
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.IResultReceiverDefault);
        }
        Function1<? super java.lang.String, java.lang.String> function1 = this.AEQbTJ;
        return function1 != null ? function1.invoke(str) : C23311hvo.formatPercent$default(str, false, 0, 0, null, null, 31, null);
    }

    public final void copydefault(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty() || list.size() != 4) {
            return;
        }
        this.KWHzl.clear();
        this.KWHzl.addAll(list);
        AEQbTJ();
    }

    public final void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("DexSwapLimit_Full_Balance_Click", (TrackChannel[]) null, new Function1() { // from class: o.hNR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hNI.AEQbTJ(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "balance_bracket", str + "%", false, 4, null);
        return Unit.INSTANCE;
    }
}
