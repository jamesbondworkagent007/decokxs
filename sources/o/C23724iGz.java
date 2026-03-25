package o;

import com.google.gson.JsonObject;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.usecase.SubmitTransactionUseCase$invoke$1;
import com.okinc.business.invest_biz.data.usecase.SubmitTransactionUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iGz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23724iGz implements InterfaceC25465ixI {
    public final CoroutineDispatcher AEQbTJ;
    public final iNW KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25465ixI
    public CoroutineDispatcher OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public C23724iGz(@NotNull iNW inw, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(inw, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = inw;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject, @NotNull InvestTxModel investTxModel, @NotNull Continuation<? super Result<iGH>> continuation) {
        SubmitTransactionUseCase$invoke$1 submitTransactionUseCase$invoke$1;
        if (continuation instanceof SubmitTransactionUseCase$invoke$1) {
            submitTransactionUseCase$invoke$1 = (SubmitTransactionUseCase$invoke$1) continuation;
            int i = submitTransactionUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                submitTransactionUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                submitTransactionUseCase$invoke$1 = new SubmitTransactionUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = submitTransactionUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = submitTransactionUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        SubmitTransactionUseCase$invoke$2 submitTransactionUseCase$invoke$2 = new SubmitTransactionUseCase$invoke$2(this, investTxModel, map, C27539jxB.OLrzqt.copydefault(jsonObject), jsonObject, null);
        submitTransactionUseCase$invoke$1.label = 1;
        java.lang.Object objEZpvd = EZpvd(submitTransactionUseCase$invoke$2, submitTransactionUseCase$invoke$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }
}
