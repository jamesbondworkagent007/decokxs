package o;

import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.CheckProductAvailabilityUseCase$invoke$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.CheckProductAvailabilityUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jeL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C26542jeL {
    public final C26543jeM OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C23673iFb c23673iFb, @NotNull Continuation<? super Result<C23676iFe>> continuation) {
        CheckProductAvailabilityUseCase$invoke$1 checkProductAvailabilityUseCase$invoke$1;
        if (continuation instanceof CheckProductAvailabilityUseCase$invoke$1) {
            checkProductAvailabilityUseCase$invoke$1 = (CheckProductAvailabilityUseCase$invoke$1) continuation;
            int i = checkProductAvailabilityUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkProductAvailabilityUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkProductAvailabilityUseCase$invoke$1 = new CheckProductAvailabilityUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = checkProductAvailabilityUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkProductAvailabilityUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.copydefault;
        CheckProductAvailabilityUseCase$invoke$2 checkProductAvailabilityUseCase$invoke$2 = new CheckProductAvailabilityUseCase$invoke$2(this, c23673iFb, null);
        checkProductAvailabilityUseCase$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, checkProductAvailabilityUseCase$invoke$2, checkProductAvailabilityUseCase$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
