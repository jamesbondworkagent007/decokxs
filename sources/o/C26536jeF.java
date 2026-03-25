package o;

import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.CheckEligibilityUseCase$invoke$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.CheckEligibilityUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jeF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26536jeF {
    public final CoroutineDispatcher AEQbTJ;
    public final C23580iBq KWHzl;

    public C26536jeF(@NotNull C23580iBq c23580iBq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c23580iBq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c23580iBq;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yCM
    public C26536jeF(@NotNull CoroutineDispatcher coroutineDispatcher) {
        this(C23580iBq.AEQbTJ, coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull ProductDetailsByChain productDetailsByChain, boolean z, @NotNull Continuation<? super Result<? extends InterfaceC26557jea>> continuation) {
        CheckEligibilityUseCase$invoke$1 checkEligibilityUseCase$invoke$1;
        if (continuation instanceof CheckEligibilityUseCase$invoke$1) {
            checkEligibilityUseCase$invoke$1 = (CheckEligibilityUseCase$invoke$1) continuation;
            int i = checkEligibilityUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkEligibilityUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkEligibilityUseCase$invoke$1 = new CheckEligibilityUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = checkEligibilityUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkEligibilityUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        long jOLrzqt = productDetailsByChain.AEQbTJ().OLrzqt();
        CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
        CheckEligibilityUseCase$invoke$2 checkEligibilityUseCase$invoke$2 = new CheckEligibilityUseCase$invoke$2(this, productDetailsByChain, jOLrzqt, z, null);
        checkEligibilityUseCase$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, checkEligibilityUseCase$invoke$2, checkEligibilityUseCase$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
