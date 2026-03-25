package o;

import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.CheckReadOnlyWalletUseCase$invoke$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.CheckReadOnlyWalletUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jeM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C26543jeM {
    public final InterfaceC23916iOb EZpvd;
    public final CoroutineDispatcher OLrzqt;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        CheckReadOnlyWalletUseCase$invoke$1 checkReadOnlyWalletUseCase$invoke$1;
        if (continuation instanceof CheckReadOnlyWalletUseCase$invoke$1) {
            checkReadOnlyWalletUseCase$invoke$1 = (CheckReadOnlyWalletUseCase$invoke$1) continuation;
            int i = checkReadOnlyWalletUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkReadOnlyWalletUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkReadOnlyWalletUseCase$invoke$1 = new CheckReadOnlyWalletUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = checkReadOnlyWalletUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkReadOnlyWalletUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
        CheckReadOnlyWalletUseCase$invoke$2 checkReadOnlyWalletUseCase$invoke$2 = new CheckReadOnlyWalletUseCase$invoke$2(this, null);
        checkReadOnlyWalletUseCase$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, checkReadOnlyWalletUseCase$invoke$2, checkReadOnlyWalletUseCase$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
