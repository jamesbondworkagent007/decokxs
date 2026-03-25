package uniffi;

import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import o.C60173zxj;

/* JADX INFO: loaded from: classes14.dex */
public final class uniffiRustFutureContinuationCallbackImpl implements UniffiRustFutureContinuationCallback {
    public static final int $stable = 0;
    public static final uniffiRustFutureContinuationCallbackImpl INSTANCE = new uniffiRustFutureContinuationCallbackImpl();

    private uniffiRustFutureContinuationCallbackImpl() {
    }

    @Override // uniffi.UniffiRustFutureContinuationCallback
    public void callback(long j, byte b) throws InternalException {
        CancellableContinuation<Byte> cancellableContinuationAEQbTJ = C60173zxj.getUniffiContinuationHandleMap().AEQbTJ(j);
        Result.Application application = Result.Companion;
        cancellableContinuationAEQbTJ.resumeWith(Result.m7377constructorimpl(Byte.valueOf(b)));
    }
}
