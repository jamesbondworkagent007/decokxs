package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C41216qmd implements InterfaceC49405unt<java.lang.String, java.lang.String> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC54577xNn AEQbTJ;
    public final boolean OLrzqt = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public C41216qmd(InterfaceC54577xNn interfaceC54577xNn) {
        this.AEQbTJ = interfaceC54577xNn;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    public java.lang.String KWHzl(@NotNull java.lang.String str) {
        return (java.lang.String) InterfaceC49405unt.Activity.EZpvd(this, str);
    }

    /* JADX INFO: renamed from: o.qmd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qmd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    public java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        java.lang.String isoCode;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54577xNn interfaceC54577xNn = this.AEQbTJ;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = interfaceC54577xNn != null ? interfaceC54577xNn.OLrzqt() : null;
        if (interfaceC54581xNrOLrzqt == null) {
            return "--";
        }
        xMW xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl();
        xOW newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance();
        return (newProxyInstance == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null || (isoCode = value.getIsoCode()) == null) ? "--" : EZpvd(str, isoCode, xmwKWHzl);
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, xMW xmw) {
        if (str.length() == 0) {
            return "--";
        }
        if (AEQbTJ() && !Intrinsics.EZpvd(C33129mqd.EZpvd(xmw.AhwBna("1")), BigDecimal.ZERO)) {
            str = xmw.AhwBna(str);
        }
        return C38305pTw.formatFiatSymbol$default(pTB.OLrzqt((java.lang.Object) str), str2, RoundingMode.HALF_DOWN, C38307pTy.Companion.EZpvd(2), DisplaySign.AUTO, Notation.COMPACT_SHORT, null, 32, null);
    }
}
