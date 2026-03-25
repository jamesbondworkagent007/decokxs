package o;

import com.okinc.business.defi.wallet.mine.walletbind.usecase.BaseUseCase$execute$1;
import com.okinc.business.defi.wallet.mine.walletbind.usecase.BaseUseCase$execute$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fzE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19325fzE<Input, Output> {
    public final CoroutineDispatcher KWHzl;

    public abstract java.lang.Object copydefault(Input input, @NotNull Continuation<? super Output> continuation);

    public AbstractC19325fzE(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Input input, @NotNull Continuation<? super Result<? extends Output>> continuation) throws java.lang.Throwable {
        BaseUseCase$execute$1 baseUseCase$execute$1;
        if (continuation instanceof BaseUseCase$execute$1) {
            baseUseCase$execute$1 = (BaseUseCase$execute$1) continuation;
            int i = baseUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                baseUseCase$execute$1 = new BaseUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = baseUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = baseUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            BaseUseCase$execute$2 baseUseCase$execute$2 = new BaseUseCase$execute$2(this, input, null);
            baseUseCase$execute$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, baseUseCase$execute$2, baseUseCase$execute$1);
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
