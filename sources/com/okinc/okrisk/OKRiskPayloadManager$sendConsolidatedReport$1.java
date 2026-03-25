package com.okinc.okrisk;

import com.okinc.core.util.SPUtils;
import com.okinc.okrisk.service.DidResponse;
import com.okinc.okrisk.service.ProfileStatus;
import com.okinc.okrisk.signals.p0.SyncSignal;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C43292rmY;
import o.C46998thj;
import o.C47004thp;
import o.C47029tiN;
import o.C47220tlt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC47027tiL;

/* JADX INFO: loaded from: classes10.dex */
public final class OKRiskPayloadManager$sendConsolidatedReport$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC47027tiL $callback;
    final /* synthetic */ String $did;
    final /* synthetic */ Payload $payload;
    final /* synthetic */ OKRiskLibrarySource $riskLibrarySource;
    final /* synthetic */ boolean $shouldForceRetry;
    final /* synthetic */ ConcurrentMap<String, String> $signals;
    int label;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FingerprintIdStatus.values().length];
            try {
                iArr[FingerprintIdStatus.FAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FingerprintIdStatus.INTERNAL_NETWORK_ABORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRiskPayloadManager$sendConsolidatedReport$1(ConcurrentMap<String, String> concurrentMap, InterfaceC47027tiL interfaceC47027tiL, OKRiskLibrarySource oKRiskLibrarySource, Payload payload, boolean z, String str, Continuation<? super OKRiskPayloadManager$sendConsolidatedReport$1> continuation) {
        super(2, continuation);
        this.$signals = concurrentMap;
        this.$callback = interfaceC47027tiL;
        this.$riskLibrarySource = oKRiskLibrarySource;
        this.$payload = payload;
        this.$shouldForceRetry = z;
        this.$did = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKRiskPayloadManager$sendConsolidatedReport$1(this.$signals, this.$callback, this.$riskLibrarySource, this.$payload, this.$shouldForceRetry, this.$did, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKRiskPayloadManager$sendConsolidatedReport$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Action actionEZpvd;
        Object objWithContext;
        OKRiskLibrarySource oKRiskLibrarySourceAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$signals.get("page");
            if (str == null || (oKRiskLibrarySourceAEQbTJ = OKRiskLibrarySource.Companion.AEQbTJ(str)) == null || (actionEZpvd = OKRiskPayloadManager.copydefault.EZpvd(oKRiskLibrarySourceAEQbTJ)) == null) {
                actionEZpvd = Action.EVENT;
            }
            Action action = actionEZpvd;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            OKRiskPayloadManager$sendConsolidatedReport$1$result$1 oKRiskPayloadManager$sendConsolidatedReport$1$result$1 = new OKRiskPayloadManager$sendConsolidatedReport$1$result$1(this.$payload, action, this.$shouldForceRetry, this.$did, null);
            this.label = 1;
            objWithContext = BuildersKt.withContext(io2, oKRiskPayloadManager$sendConsolidatedReport$1$result$1, this);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objWithContext = obj;
        }
        DidResponse didResponse = (DidResponse) objWithContext;
        FingerprintIdStatus status = didResponse.getStatus();
        String fingerprintId = didResponse.getFingerprintId();
        String efp = didResponse.getEfp();
        String e_deviceToken = didResponse.getE_deviceToken();
        ProfileStatus profileStatus = !this.$signals.containsKey(SyncSignal.SignalKey.ALIFD_DEVICETOEKN_ID.getKey()) ? ProfileStatus.ALI_TOKEN_FETCH_FAILED : null;
        int i2 = ActionBar.AEQbTJ[status.ordinal()];
        if (i2 == 1) {
            C47004thp c47004thp = C47004thp.EZpvd;
            FingerprintIdStatus fingerprintIdStatus = FingerprintIdStatus.FAIL;
            c47004thp.EZpvd(fingerprintIdStatus);
            InterfaceC47027tiL interfaceC47027tiL = this.$callback;
            if (interfaceC47027tiL != null) {
                if (profileStatus == null) {
                    profileStatus = ProfileStatus.FAILURE;
                }
                interfaceC47027tiL.onDeviceTokenReturned(new C47029tiN(null, e_deviceToken, profileStatus, null, 9, null));
            }
            String str2 = this.$signals.get(SyncSignal.SignalKey.FINGERPRINT_ID.getKey());
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            C43292rmY.OLrzqt.OLrzqt(new C46998thj(str3, "fp-status=" + fingerprintIdStatus.getStatus() + "&fingerprint-id=" + str3 + "&session-id=" + ((Object) this.$signals.get(SyncSignal.SignalKey.TRANSACTION_ID.getKey())), null, 4, null));
        } else if (i2 != 2) {
            SPUtils.put("OKRLFP", fingerprintId);
            C47004thp.EZpvd.EZpvd(status);
            InterfaceC47027tiL interfaceC47027tiL2 = this.$callback;
            if (interfaceC47027tiL2 != null) {
                if (profileStatus == null) {
                    profileStatus = ProfileStatus.SUCCESS;
                }
                interfaceC47027tiL2.onDeviceTokenReturned(new C47029tiN(null, e_deviceToken, profileStatus, null, 9, null));
            }
            C43292rmY.OLrzqt.OLrzqt(new C46998thj(fingerprintId, "fp-status=" + status.getStatus() + "&fingerprint-id=" + fingerprintId + "&session-id=" + ((Object) this.$signals.get(SyncSignal.SignalKey.TRANSACTION_ID.getKey())), efp));
        } else {
            InterfaceC47027tiL interfaceC47027tiL3 = this.$callback;
            if (interfaceC47027tiL3 != null) {
                if (profileStatus == null) {
                    profileStatus = ProfileStatus.TIMEOUT;
                }
                interfaceC47027tiL3.onDeviceTokenReturned(new C47029tiN(null, e_deviceToken, profileStatus, null, 9, null));
            }
        }
        C47220tlt.log$default(C47220tlt.KWHzl, this.$riskLibrarySource.getTag(), "profileInHouseSignals END " + this.$riskLibrarySource, String.valueOf(System.currentTimeMillis()), null, 8, null);
        return Unit.INSTANCE;
    }
}
