package o;

import com.okinc.dexkline.market.features.identity.domain.DexUserIdentity;
import com.okinc.dexkline.market.features.identity.domain.KlineGetUserIdentityUseCase$invoke$1;
import com.okinc.dexkline.market.features.identity.domain.KlineGetUserIdentityUseCase$invokeIoAF18A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nat, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34377nat {
    public final C34587ner EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C34377nat(@NotNull C34587ner c34587ner, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c34587ner, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c34587ner;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Result<DexUserIdentity>> continuation) throws java.lang.Throwable {
        KlineGetUserIdentityUseCase$invoke$1 klineGetUserIdentityUseCase$invoke$1;
        if (continuation instanceof KlineGetUserIdentityUseCase$invoke$1) {
            klineGetUserIdentityUseCase$invoke$1 = (KlineGetUserIdentityUseCase$invoke$1) continuation;
            int i = klineGetUserIdentityUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                klineGetUserIdentityUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                klineGetUserIdentityUseCase$invoke$1 = new KlineGetUserIdentityUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = klineGetUserIdentityUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = klineGetUserIdentityUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            KlineGetUserIdentityUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 klineGetUserIdentityUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 = new KlineGetUserIdentityUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(null, this);
            klineGetUserIdentityUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, klineGetUserIdentityUseCase$invokeIoAF18A$$inlined$dexRunCatching$1, klineGetUserIdentityUseCase$invoke$1);
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
