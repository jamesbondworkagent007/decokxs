package o;

import com.google.gson.JsonObject;
import com.okinc.business.invest_biz.ui.claim.Web3ClaimSubmitTransactionUseCase$invoke$1;
import com.okinc.business.invest_biz.ui.claim.Web3ClaimSubmitTransactionUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iPA implements InterfaceC25465ixI {
    public final iDH AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25465ixI
    public CoroutineDispatcher OLrzqt() {
        return this.OLrzqt;
    }

    @yCM
    public iPA(@NotNull iDH idh, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(idh, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = idh;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject, @NotNull Continuation<? super Result<iGH>> continuation) {
        Web3ClaimSubmitTransactionUseCase$invoke$1 web3ClaimSubmitTransactionUseCase$invoke$1;
        if (continuation instanceof Web3ClaimSubmitTransactionUseCase$invoke$1) {
            web3ClaimSubmitTransactionUseCase$invoke$1 = (Web3ClaimSubmitTransactionUseCase$invoke$1) continuation;
            int i = web3ClaimSubmitTransactionUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                web3ClaimSubmitTransactionUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                web3ClaimSubmitTransactionUseCase$invoke$1 = new Web3ClaimSubmitTransactionUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = web3ClaimSubmitTransactionUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = web3ClaimSubmitTransactionUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        Web3ClaimSubmitTransactionUseCase$invoke$2 web3ClaimSubmitTransactionUseCase$invoke$2 = new Web3ClaimSubmitTransactionUseCase$invoke$2(this, map, C27539jxB.OLrzqt.copydefault(jsonObject), jsonObject, null);
        web3ClaimSubmitTransactionUseCase$invoke$1.label = 1;
        java.lang.Object objEZpvd = EZpvd(web3ClaimSubmitTransactionUseCase$invoke$2, web3ClaimSubmitTransactionUseCase$invoke$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }
}
