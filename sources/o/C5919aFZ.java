package o;

import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.PasskeyRemovalUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.PasskeyRemovalUseCase$invoke$2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5919aFZ {
    public final PasskeyApiService KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C5919aFZ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull PasskeyApiService passkeyApiService) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = passkeyApiService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<Unit>> continuation) {
        PasskeyRemovalUseCase$invoke$1 passkeyRemovalUseCase$invoke$1;
        if (continuation instanceof PasskeyRemovalUseCase$invoke$1) {
            passkeyRemovalUseCase$invoke$1 = (PasskeyRemovalUseCase$invoke$1) continuation;
            int i = passkeyRemovalUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyRemovalUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyRemovalUseCase$invoke$1 = new PasskeyRemovalUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = passkeyRemovalUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyRemovalUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            PasskeyRemovalUseCase$invoke$2 passkeyRemovalUseCase$invoke$2 = new PasskeyRemovalUseCase$invoke$2(this, str, str2, null);
            passkeyRemovalUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, passkeyRemovalUseCase$invoke$2, passkeyRemovalUseCase$invoke$1);
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
