package com.okinc.okpush.sdk.utils;

import android.content.Context;
import android.os.SystemClock;
import com.google.firebase.installations.InstallationTokenResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import o.C46996thh;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class PushServiceCapabilityDetector$isFcmAvailable$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    long J$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushServiceCapabilityDetector$isFcmAvailable$2(Context context, Continuation<? super PushServiceCapabilityDetector$isFcmAvailable$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PushServiceCapabilityDetector$isFcmAvailable$2(this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((PushServiceCapabilityDetector$isFcmAvailable$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jElapsedRealtime;
        long j;
        String token;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        boolean z2 = false;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!C46996thh.KWHzl.AEQbTJ(this.$context)) {
                    pUU.valueOf(C46996thh.EZpvd, "Google Play Services is not available on this device");
                    return C56443yFo.KWHzl(false);
                }
                jElapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    PushServiceCapabilityDetector$isFcmAvailable$2$tokenResult$1 pushServiceCapabilityDetector$isFcmAvailable$2$tokenResult$1 = new PushServiceCapabilityDetector$isFcmAvailable$2$tokenResult$1(null);
                    this.J$0 = jElapsedRealtime;
                    this.label = 1;
                    obj = TimeoutKt.withTimeout(8000L, pushServiceCapabilityDetector$isFcmAvailable$2$tokenResult$1, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    j = jElapsedRealtime;
                } catch (Exception e) {
                    e = e;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    C46996thh.KWHzl.KWHzl(jElapsedRealtime2, false, "exception");
                    pUU.valueOf(C46996thh.EZpvd, "FCM not truly available (blocked/offline): " + e.getMessage() + ", costMs : " + jElapsedRealtime2);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                } catch (Exception e2) {
                    e = e2;
                    jElapsedRealtime = j;
                    long jElapsedRealtime22 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    C46996thh.KWHzl.KWHzl(jElapsedRealtime22, false, "exception");
                    pUU.valueOf(C46996thh.EZpvd, "FCM not truly available (blocked/offline): " + e.getMessage() + ", costMs : " + jElapsedRealtime22);
                }
            }
            InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - j;
            if (installationTokenResult == null || (token = installationTokenResult.getToken()) == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) token))) {
                z = false;
            }
            pUU.KWHzl(C46996thh.EZpvd, "FCM truly available: " + z + " (via FirebaseInstallations forced refresh), costMs: " + jElapsedRealtime3);
            C46996thh.KWHzl.KWHzl(jElapsedRealtime3, z, "");
            z2 = z;
        } catch (TimeoutCancellationException unused) {
            C46996thh.KWHzl.KWHzl(8000L, false, "timeout");
            pUU.valueOf(C46996thh.EZpvd, "FCM token retrieval timed out after 8000 ms");
        }
        return C56443yFo.KWHzl(z2);
    }
}
