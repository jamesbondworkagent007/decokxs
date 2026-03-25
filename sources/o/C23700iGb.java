package o;

import com.okinc.business.invest_biz.data.usecase.InvestHomeInitUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.InvestHomeInitUseCaseImpl$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iGb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23700iGb implements iFZ {
    public final CoroutineDispatcher AEQbTJ;

    @yCM
    public C23700iGb(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iFZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super Result<C25542iyg>> continuation) {
        InvestHomeInitUseCaseImpl$invoke$1 investHomeInitUseCaseImpl$invoke$1;
        if (continuation instanceof InvestHomeInitUseCaseImpl$invoke$1) {
            investHomeInitUseCaseImpl$invoke$1 = (InvestHomeInitUseCaseImpl$invoke$1) continuation;
            int i = investHomeInitUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investHomeInitUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                investHomeInitUseCaseImpl$invoke$1 = new InvestHomeInitUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = investHomeInitUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investHomeInitUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            InvestHomeInitUseCaseImpl$invoke$2 investHomeInitUseCaseImpl$invoke$2 = new InvestHomeInitUseCaseImpl$invoke$2(null);
            investHomeInitUseCaseImpl$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, investHomeInitUseCaseImpl$invoke$2, investHomeInitUseCaseImpl$invoke$1);
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
