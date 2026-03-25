package o;

import com.okinc.business.invest_biz.data.bean.TokenInvestDetailResponse;
import com.okinc.business.invest_biz.data.usecase.TokenInvestDetailUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.TokenInvestDetailUseCaseImpl$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iGE implements iGF {
    public final InterfaceC23589iBz EZpvd;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public iGE(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC23589iBz;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iGF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Result<TokenInvestDetailResponse>> continuation) {
        TokenInvestDetailUseCaseImpl$invoke$1 tokenInvestDetailUseCaseImpl$invoke$1;
        if (continuation instanceof TokenInvestDetailUseCaseImpl$invoke$1) {
            tokenInvestDetailUseCaseImpl$invoke$1 = (TokenInvestDetailUseCaseImpl$invoke$1) continuation;
            int i = tokenInvestDetailUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenInvestDetailUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenInvestDetailUseCaseImpl$invoke$1 = new TokenInvestDetailUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tokenInvestDetailUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenInvestDetailUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            TokenInvestDetailUseCaseImpl$invoke$2 tokenInvestDetailUseCaseImpl$invoke$2 = new TokenInvestDetailUseCaseImpl$invoke$2(this, list, null);
            tokenInvestDetailUseCaseImpl$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tokenInvestDetailUseCaseImpl$invoke$2, tokenInvestDetailUseCaseImpl$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
