package o;

import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.CheckProductRestrictionUseCase$invoke$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.CheckProductRestrictionUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jeN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C26544jeN {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC23916iOb KWHzl;
    public final iEM copydefault;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(long j, long j2, @NotNull Continuation<? super Result<kotlin.Pair<java.lang.Boolean, java.lang.String>>> continuation) {
        CheckProductRestrictionUseCase$invoke$1 checkProductRestrictionUseCase$invoke$1;
        if (continuation instanceof CheckProductRestrictionUseCase$invoke$1) {
            checkProductRestrictionUseCase$invoke$1 = (CheckProductRestrictionUseCase$invoke$1) continuation;
            int i = checkProductRestrictionUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkProductRestrictionUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkProductRestrictionUseCase$invoke$1 = new CheckProductRestrictionUseCase$invoke$1(this, continuation);
            }
        }
        CheckProductRestrictionUseCase$invoke$1 checkProductRestrictionUseCase$invoke$12 = checkProductRestrictionUseCase$invoke$1;
        java.lang.Object obj = checkProductRestrictionUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkProductRestrictionUseCase$invoke$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.EZpvd;
        CheckProductRestrictionUseCase$invoke$2 checkProductRestrictionUseCase$invoke$2 = new CheckProductRestrictionUseCase$invoke$2(this, j, j2, null);
        checkProductRestrictionUseCase$invoke$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, checkProductRestrictionUseCase$invoke$2, checkProductRestrictionUseCase$invoke$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
