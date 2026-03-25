package o;

import android.view.View;
import com.okinc.tradeuilib.widget.oktinputlayout.MaxValueJudgeListener;
import com.okinc.tradeuilib.widget.oktinputlayout.appendview.InputLayoutBothSidesViewState;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uAn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C47980uAn extends android.widget.LinearLayout {
    public final uBH AEQbTJ;
    public View.OnClickListener AhwBna;
    public Function0<Unit> EZpvd;
    public boolean KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public java.lang.String copydefault;
    public final InterfaceC56387yDm djBIcL;
    public java.lang.String gEmmrt;
    public Function1<? super java.lang.Boolean, Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBBOCheckedTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketSelectChange(Function1<? super java.lang.Boolean, Unit> function1) {
        this.valueOf = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketSelectListener(View.OnClickListener onClickListener) {
        this.AhwBna = onClickListener;
    }

    private final C47988uAv valueOf() {
        return (C47988uAv) this.OLrzqt.getValue();
    }

    public static final C47988uAv EZpvd(C47980uAn c47980uAn) {
        return (C47988uAv) c47980uAn.findViewById(C49511upt.Application.QVsKAR);
    }

    private final android.widget.TextView AYXKKw() {
        return (android.widget.TextView) this.djBIcL.getValue();
    }

    public static final android.widget.TextView djBIcL(C47980uAn c47980uAn) {
        return (android.widget.TextView) c47980uAn.findViewById(C49511upt.Application.zSsVtY);
    }

    public C47980uAn(android.content.Context context) {
        super(context);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.uAs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47980uAn.EZpvd(this.copydefault);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.uAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47980uAn.djBIcL(this.AEQbTJ);
            }
        });
        this.copydefault = "";
        this.gEmmrt = "";
        this.KWHzl = true;
        this.AEQbTJ = new uBH(new Function0() { // from class: o.uAu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47980uAn.KWHzl(this.OLrzqt);
            }
        });
        if (context != null) {
            AEQbTJ(context);
        }
    }

    public C47980uAn(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.uAs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47980uAn.EZpvd(this.copydefault);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.uAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47980uAn.djBIcL(this.AEQbTJ);
            }
        });
        this.copydefault = "";
        this.gEmmrt = "";
        this.KWHzl = true;
        this.AEQbTJ = new uBH(new Function0() { // from class: o.uAu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47980uAn.KWHzl(this.OLrzqt);
            }
        });
        if (context != null) {
            AEQbTJ(context);
        }
    }

    public C47980uAn(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.uAs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47980uAn.EZpvd(this.copydefault);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.uAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47980uAn.djBIcL(this.AEQbTJ);
            }
        });
        this.copydefault = "";
        this.gEmmrt = "";
        this.KWHzl = true;
        this.AEQbTJ = new uBH(new Function0() { // from class: o.uAu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47980uAn.KWHzl(this.OLrzqt);
            }
        });
        if (context != null) {
            AEQbTJ(context);
        }
    }

    public final void AEQbTJ(android.content.Context context) {
        android.view.View.inflate(context, C49511upt.StateListAnimator.RcXXUw, this);
        copydefault();
        valueOf().setEnableClickCallback(new Function1() { // from class: o.uAq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47980uAn.KWHzl(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        valueOf().setOnFocusChangeCallback(new Function2() { // from class: o.uAw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C47980uAn.EZpvd(this.copydefault, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
    }

    public static final Unit KWHzl(C47980uAn c47980uAn, boolean z) {
        c47980uAn.EZpvd(false);
        C47988uAv.setInputContent$default(c47980uAn.valueOf(), "", false, false, 6, null);
        c47980uAn.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C47980uAn c47980uAn, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (z) {
            c47980uAn.EZpvd(false);
            c47980uAn.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        C8003auW.copydefault(AYXKKw()).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.uAr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C47980uAn.KWHzl(this.KWHzl, obj);
            }
        });
    }

    public static final void KWHzl(C47980uAn c47980uAn, java.lang.Object obj) {
        if (c47980uAn.isEnabled()) {
            c47980uAn.OLrzqt();
            View.OnClickListener onClickListener = c47980uAn.AhwBna;
            if (onClickListener != null) {
                onClickListener.onClick(c47980uAn.AYXKKw());
            }
        }
    }

    public final void OLrzqt() {
        EZpvd(!AYXKKw().isSelected());
        C47988uAv.setInputLayoutState$default(valueOf(), AYXKKw().isSelected() ? InputLayoutState.JUST_READ_CLICKABLE : InputLayoutState.NORMAL, false, 2, null);
        valueOf().setInputUnitVisible(!AYXKKw().isSelected());
        C47988uAv.setInputContent$default(valueOf(), "", false, false, 6, null);
        AEQbTJ();
    }

    public final void AEQbTJ() {
        if (AYXKKw().isSelected() && C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault)) {
            valueOf().AEQbTJ(this.copydefault, InputLayoutBothSidesViewState.READ_ONLY);
        } else {
            valueOf().AEQbTJ(this.gEmmrt, InputLayoutBothSidesViewState.NORMAL);
        }
    }

    public final void setUnitVisible(boolean z) {
        valueOf().setInputUnitVisible(z);
    }

    public final boolean EZpvd() {
        return AYXKKw().isSelected();
    }

    public final void setNormalTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C47988uAv.setInputLabel$default(valueOf(), str, null, 2, null);
        this.gEmmrt = str;
    }

    public final void setLabel(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        valueOf().setInputUnit(str);
    }

    public final void setMaxPrice(@NotNull MaxValueJudgeListener maxValueJudgeListener) {
        Intrinsics.checkNotNullParameter(maxValueJudgeListener, "");
        valueOf().setMaxValueJudgeListener(maxValueJudgeListener);
    }

    public final void setMaxDecimal(int i) {
        valueOf().setMaxDecimal(i);
    }

    public final void setInputErrorMsg(java.lang.String[] strArr) {
        valueOf().setInputErrorMsg(strArr);
    }

    public static final Unit KWHzl(C47980uAn c47980uAn) {
        Function0<Unit> function0 = c47980uAn.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl() {
        return valueOf().AkhnZx();
    }

    public static /* synthetic */ void setText$default(C47980uAn c47980uAn, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c47980uAn.setText(str, z);
    }

    public final void setText(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (EZpvd()) {
            setMarketSelect(false);
        }
        EZpvd(false);
        C47988uAv.setInputContent$default(valueOf(), str, z, false, 4, null);
        AEQbTJ();
    }

    public final void EZpvd(boolean z) {
        Function1<? super java.lang.Boolean, Unit> function1;
        boolean zIsSelected = AYXKKw().isSelected();
        AYXKKw().setSelected(z);
        if (z == zIsSelected || (function1 = this.valueOf) == null) {
            return;
        }
        function1.invoke(java.lang.Boolean.valueOf(z));
    }

    public final void setFocusListener(Function2<? super C47988uAv, ? super java.lang.Boolean, Unit> function2) {
        valueOf().setOnFocusChangeCallback(function2);
    }

    public final void setInputFocus() {
        valueOf().setInputFocus();
    }

    public final void setMarketSelect(boolean z) {
        if (z && !AYXKKw().isSelected()) {
            AYXKKw().performClick();
            C47988uAv.setInputLayoutState$default(valueOf(), InputLayoutState.JUST_READ_CLICKABLE, false, 2, null);
            valueOf().setInputUnitVisible(false);
            C47988uAv.setInputContent$default(valueOf(), "", false, false, 6, null);
        }
        if (z || !AYXKKw().isSelected()) {
            return;
        }
        AYXKKw().performClick();
        C47988uAv.setInputLayoutState$default(valueOf(), InputLayoutState.NORMAL, false, 2, null);
        valueOf().setInputUnitVisible(true);
    }

    public final void setMarketText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AYXKKw().setText(str);
    }

    public final void KWHzl(@NotNull uBH ubh) {
        Intrinsics.checkNotNullParameter(ubh, "");
        valueOf().copydefault(ubh);
    }

    public final void copydefault(@NotNull uBH ubh) {
        Intrinsics.checkNotNullParameter(ubh, "");
        valueOf().AEQbTJ(ubh);
    }

    public final void setInputPop(java.lang.String str) {
        valueOf().setInputPop(str);
    }
}
