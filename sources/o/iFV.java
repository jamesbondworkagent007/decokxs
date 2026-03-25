package o;

import com.okinc.business.invest_biz.data.bean.HomeTokensResponse;
import com.okinc.business.invest_biz.data.usecase.HomeV2TokensUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.HomeV2TokensUseCaseImpl$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iFV implements iFW {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC23589iBz copydefault;

    @yCM
    public iFV(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC23589iBz;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iFW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(boolean z, @NotNull Continuation<? super Result<HomeTokensResponse>> continuation) {
        HomeV2TokensUseCaseImpl$invoke$1 homeV2TokensUseCaseImpl$invoke$1;
        if (continuation instanceof HomeV2TokensUseCaseImpl$invoke$1) {
            homeV2TokensUseCaseImpl$invoke$1 = (HomeV2TokensUseCaseImpl$invoke$1) continuation;
            int i = homeV2TokensUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeV2TokensUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                homeV2TokensUseCaseImpl$invoke$1 = new HomeV2TokensUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = homeV2TokensUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = homeV2TokensUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            HomeV2TokensUseCaseImpl$invoke$2 homeV2TokensUseCaseImpl$invoke$2 = new HomeV2TokensUseCaseImpl$invoke$2(z, this, null);
            homeV2TokensUseCaseImpl$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, homeV2TokensUseCaseImpl$invoke$2, homeV2TokensUseCaseImpl$invoke$1);
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
