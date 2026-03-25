package o;

import com.okinc.business.market.features.smart_money.signal.domain.SignalFilterCacheUseCase$getSelectedChainId$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.smart_money.signal.domain.SignalFilterCacheUseCase$getSelectedChainId$1;
import com.okinc.business.market.features.smart_money.signal.domain.SignalFilterCacheUseCase$setSelectedChainId$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.smart_money.signal.domain.SignalFilterCacheUseCase$setSelectedChainId$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29464kuD {
    public final CoroutineDispatcher AEQbTJ;

    @yCM
    public C29464kuD(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        SignalFilterCacheUseCase$getSelectedChainId$1 signalFilterCacheUseCase$getSelectedChainId$1;
        if (continuation instanceof SignalFilterCacheUseCase$getSelectedChainId$1) {
            signalFilterCacheUseCase$getSelectedChainId$1 = (SignalFilterCacheUseCase$getSelectedChainId$1) continuation;
            int i = signalFilterCacheUseCase$getSelectedChainId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signalFilterCacheUseCase$getSelectedChainId$1.label = i - Integer.MIN_VALUE;
            } else {
                signalFilterCacheUseCase$getSelectedChainId$1 = new SignalFilterCacheUseCase$getSelectedChainId$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = signalFilterCacheUseCase$getSelectedChainId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = signalFilterCacheUseCase$getSelectedChainId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            SignalFilterCacheUseCase$getSelectedChainId$$inlined$dexRunCatching$1 signalFilterCacheUseCase$getSelectedChainId$$inlined$dexRunCatching$1 = new SignalFilterCacheUseCase$getSelectedChainId$$inlined$dexRunCatching$1(null);
            signalFilterCacheUseCase$getSelectedChainId$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, signalFilterCacheUseCase$getSelectedChainId$$inlined$dexRunCatching$1, signalFilterCacheUseCase$getSelectedChainId$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.lang.Object objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
        return Result.m7383isFailureimpl(objM7386unboximpl) ? "501" : objM7386unboximpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SignalFilterCacheUseCase$setSelectedChainId$1 signalFilterCacheUseCase$setSelectedChainId$1;
        if (continuation instanceof SignalFilterCacheUseCase$setSelectedChainId$1) {
            signalFilterCacheUseCase$setSelectedChainId$1 = (SignalFilterCacheUseCase$setSelectedChainId$1) continuation;
            int i = signalFilterCacheUseCase$setSelectedChainId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signalFilterCacheUseCase$setSelectedChainId$1.label = i - Integer.MIN_VALUE;
            } else {
                signalFilterCacheUseCase$setSelectedChainId$1 = new SignalFilterCacheUseCase$setSelectedChainId$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = signalFilterCacheUseCase$setSelectedChainId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = signalFilterCacheUseCase$setSelectedChainId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            SignalFilterCacheUseCase$setSelectedChainId$$inlined$dexRunCatching$1 signalFilterCacheUseCase$setSelectedChainId$$inlined$dexRunCatching$1 = new SignalFilterCacheUseCase$setSelectedChainId$$inlined$dexRunCatching$1(null, str);
            signalFilterCacheUseCase$setSelectedChainId$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, signalFilterCacheUseCase$setSelectedChainId$$inlined$dexRunCatching$1, signalFilterCacheUseCase$setSelectedChainId$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        ((Result) objWithContext).m7386unboximpl();
        return Unit.INSTANCE;
    }
}
