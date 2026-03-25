package o;

import com.okinc.kline.ui.formula.domain.HistoryFormulaKlineUseCase$onExecute$1;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.prL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39384prL extends AbstractC49400uno<StateListAnimator, java.util.List<? extends java.util.List<? extends java.lang.String>>> {
    public final CoroutineDispatcher AEQbTJ;
    public final KlineBizMarketService KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((StateListAnimator) obj, (Continuation<? super java.util.List<? extends java.util.List<java.lang.String>>>) continuation);
    }

    @yCM
    public C39384prL(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull KlineBizMarketService klineBizMarketService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(klineBizMarketService, "");
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = klineBizMarketService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull StateListAnimator stateListAnimator, @NotNull Continuation<? super java.util.List<? extends java.util.List<java.lang.String>>> continuation) throws java.lang.Throwable {
        HistoryFormulaKlineUseCase$onExecute$1 historyFormulaKlineUseCase$onExecute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator2;
        ResponseData responseData;
        if (continuation instanceof HistoryFormulaKlineUseCase$onExecute$1) {
            historyFormulaKlineUseCase$onExecute$1 = (HistoryFormulaKlineUseCase$onExecute$1) continuation;
            int i = historyFormulaKlineUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                historyFormulaKlineUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                historyFormulaKlineUseCase$onExecute$1 = new HistoryFormulaKlineUseCase$onExecute$1(this, continuation);
            }
        }
        HistoryFormulaKlineUseCase$onExecute$1 historyFormulaKlineUseCase$onExecute$12 = historyFormulaKlineUseCase$onExecute$1;
        java.lang.Object historyFormulaCandles = historyFormulaKlineUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = historyFormulaKlineUseCase$onExecute$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(historyFormulaCandles);
                KlineBizMarketService klineBizMarketService = this.KWHzl;
                java.lang.String strKWHzl = stateListAnimator.KWHzl();
                java.lang.String strCopydefault = stateListAnimator.copydefault();
                java.lang.String strAYXKKw = oLT.AYXKKw();
                historyFormulaKlineUseCase$onExecute$12.label = 1;
                historyFormulaCandles = klineBizMarketService.getHistoryFormulaCandles(strKWHzl, strCopydefault, null, null, null, strAYXKKw, historyFormulaKlineUseCase$onExecute$12);
                if (historyFormulaCandles == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(historyFormulaCandles);
            }
            responseData = (ResponseData) historyFormulaCandles;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator2 = new AbstractC43419rot.StateListAnimator(data);
            return stateListAnimator2.AEQbTJ();
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator2 = actionBar;
        return stateListAnimator2.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.prL$StateListAnimator */
    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(calcExpression=" + this.KWHzl + ", instIdArray=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.AEQbTJ = str2;
        }
    }
}
