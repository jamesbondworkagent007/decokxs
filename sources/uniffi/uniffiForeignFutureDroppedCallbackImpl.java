package uniffi;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class uniffiForeignFutureDroppedCallbackImpl implements UniffiForeignFutureDroppedCallback {
    public static final int $stable = 0;
    public static final uniffiForeignFutureDroppedCallbackImpl INSTANCE = new uniffiForeignFutureDroppedCallbackImpl();

    private uniffiForeignFutureDroppedCallbackImpl() {
    }

    @Override // uniffi.UniffiForeignFutureDroppedCallback
    public void callback(long j) throws InternalException {
        Job jobAEQbTJ = C60173zxj.getUniffiForeignFutureHandleMap().AEQbTJ(j);
        if (jobAEQbTJ.isCompleted()) {
            return;
        }
        Job.DefaultImpls.cancel$default(jobAEQbTJ, (CancellationException) null, 1, (Object) null);
    }
}
