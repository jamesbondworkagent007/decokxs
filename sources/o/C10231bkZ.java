package o;

import com.okinc.business.defi.assets.utxo.explanation.InvestUtxoExplanationUseCase$markExplanationViewed$1;
import com.okinc.business.defi.assets.utxo.explanation.InvestUtxoExplanationUseCase$shouldShowExplanation$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bkZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10231bkZ {
    public static final Application Companion = new Application(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault(long j) {
        return j == 0 ? "sp.key.viewed_explanation" : "sp.key.viewed_explanation_for_doge";
    }

    @yCM
    public C10231bkZ() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(long j, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        InvestUtxoExplanationUseCase$shouldShowExplanation$1 investUtxoExplanationUseCase$shouldShowExplanation$1;
        java.lang.Object objCopydefault;
        if (continuation instanceof InvestUtxoExplanationUseCase$shouldShowExplanation$1) {
            investUtxoExplanationUseCase$shouldShowExplanation$1 = (InvestUtxoExplanationUseCase$shouldShowExplanation$1) continuation;
            int i = investUtxoExplanationUseCase$shouldShowExplanation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investUtxoExplanationUseCase$shouldShowExplanation$1.label = i - Integer.MIN_VALUE;
            } else {
                investUtxoExplanationUseCase$shouldShowExplanation$1 = new InvestUtxoExplanationUseCase$shouldShowExplanation$1(this, continuation);
            }
        }
        java.lang.Object obj = investUtxoExplanationUseCase$shouldShowExplanation$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = investUtxoExplanationUseCase$shouldShowExplanation$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C10351bmn c10351bmn = C10351bmn.OLrzqt;
            java.lang.String strCopydefault = copydefault(j);
            investUtxoExplanationUseCase$shouldShowExplanation$1.label = 1;
            objCopydefault = c10351bmn.copydefault(strCopydefault, false, investUtxoExplanationUseCase$shouldShowExplanation$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            Result.Application application = Result.Companion;
            objCopydefault = C56443yFo.KWHzl(!((java.lang.Boolean) objCopydefault).booleanValue());
        }
        return Result.m7377constructorimpl(objCopydefault);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(long j, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        InvestUtxoExplanationUseCase$markExplanationViewed$1 investUtxoExplanationUseCase$markExplanationViewed$1;
        if (continuation instanceof InvestUtxoExplanationUseCase$markExplanationViewed$1) {
            investUtxoExplanationUseCase$markExplanationViewed$1 = (InvestUtxoExplanationUseCase$markExplanationViewed$1) continuation;
            int i = investUtxoExplanationUseCase$markExplanationViewed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investUtxoExplanationUseCase$markExplanationViewed$1.label = i - Integer.MIN_VALUE;
            } else {
                investUtxoExplanationUseCase$markExplanationViewed$1 = new InvestUtxoExplanationUseCase$markExplanationViewed$1(this, continuation);
            }
        }
        java.lang.Object obj = investUtxoExplanationUseCase$markExplanationViewed$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investUtxoExplanationUseCase$markExplanationViewed$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C10351bmn c10351bmn = C10351bmn.OLrzqt;
        java.lang.String strCopydefault = copydefault(j);
        investUtxoExplanationUseCase$markExplanationViewed$1.label = 1;
        java.lang.Object objEZpvd = c10351bmn.EZpvd(strCopydefault, true, investUtxoExplanationUseCase$markExplanationViewed$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    /* JADX INFO: renamed from: o.bkZ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bkZ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
