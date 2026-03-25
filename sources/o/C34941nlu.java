package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.find_ui.features.opportunity.overall.domain.usecase.FormatMarketOverallStatsValueUseCase$onExecute$1;
import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nlu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C34941nlu extends AbstractC49400uno<java.lang.String, java.lang.String> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC54577xNn AEQbTJ;
    public final boolean EZpvd;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation) {
        return copydefault(this, str, continuation);
    }

    @yCM
    public C34941nlu(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = interfaceC54577xNn;
        this.EZpvd = true;
    }

    /* JADX INFO: renamed from: o.nlu$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nlu.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object copydefault(C34941nlu c34941nlu, java.lang.String str, Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        FormatMarketOverallStatsValueUseCase$onExecute$1 formatMarketOverallStatsValueUseCase$onExecute$1;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        xMW xmwKWHzl;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        if (continuation instanceof FormatMarketOverallStatsValueUseCase$onExecute$1) {
            formatMarketOverallStatsValueUseCase$onExecute$1 = (FormatMarketOverallStatsValueUseCase$onExecute$1) continuation;
            int i = formatMarketOverallStatsValueUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                formatMarketOverallStatsValueUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                formatMarketOverallStatsValueUseCase$onExecute$1 = new FormatMarketOverallStatsValueUseCase$onExecute$1(c34941nlu, continuation);
            }
        }
        FormatMarketOverallStatsValueUseCase$onExecute$1 formatMarketOverallStatsValueUseCase$onExecute$12 = formatMarketOverallStatsValueUseCase$onExecute$1;
        java.lang.Object obj = formatMarketOverallStatsValueUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = formatMarketOverallStatsValueUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNn = c34941nlu.AEQbTJ;
            if (interfaceC54577xNn != null) {
                formatMarketOverallStatsValueUseCase$onExecute$12.L$0 = c34941nlu;
                formatMarketOverallStatsValueUseCase$onExecute$12.L$1 = str;
                formatMarketOverallStatsValueUseCase$onExecute$12.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, formatMarketOverallStatsValueUseCase$onExecute$12, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
            }
            InterfaceC54577xNn interfaceC54577xNn2 = c34941nlu.AEQbTJ;
            java.lang.String isoCode = null;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = interfaceC54577xNn2 == null ? interfaceC54577xNn2.OLrzqt() : null;
            xmwKWHzl = interfaceC54581xNrOLrzqt == null ? interfaceC54581xNrOLrzqt.KWHzl() : null;
            if (xmwKWHzl != null) {
                return "--";
            }
            xOW newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance();
            if (newProxyInstance != null && (mutableLiveDataBG_ = newProxyInstance.bG_()) != null && (value = mutableLiveDataBG_.getValue()) != null) {
                isoCode = value.getIsoCode();
            }
            return isoCode == null ? "--" : c34941nlu.KWHzl(str, isoCode, xmwKWHzl);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (java.lang.String) formatMarketOverallStatsValueUseCase$onExecute$12.L$1;
        c34941nlu = (C34941nlu) formatMarketOverallStatsValueUseCase$onExecute$12.L$0;
        C56391yDq.AEQbTJ(obj);
        objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        InterfaceC54577xNn interfaceC54577xNn22 = c34941nlu.AEQbTJ;
        java.lang.String isoCode2 = null;
        if (interfaceC54577xNn22 == null) {
        }
        if (interfaceC54581xNrOLrzqt == null) {
        }
        if (xmwKWHzl != null) {
        }
    }

    private final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, xMW xmw) {
        if (str.length() == 0) {
            return "--";
        }
        if (KWHzl() && !Intrinsics.EZpvd(C33129mqd.EZpvd(xmw.AhwBna("1")), BigDecimal.ZERO)) {
            str = xmw.AhwBna(str);
        }
        return C38305pTw.formatFiatSymbol$default(pTB.OLrzqt((java.lang.Object) str), str2, RoundingMode.HALF_DOWN, C38307pTy.Companion.EZpvd(2), DisplaySign.AUTO, Notation.COMPACT_SHORT, null, 32, null);
    }
}
