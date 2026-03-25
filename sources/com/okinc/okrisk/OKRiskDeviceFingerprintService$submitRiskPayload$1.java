package com.okinc.okrisk;

import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okrisk.service.DeviceProfileResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43292rmY;
import o.C43401rob;
import o.C43422row;
import o.C46998thj;
import o.C47004thp;
import o.C47025tiJ;
import o.C47136tkO;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC47028tiM;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class OKRiskDeviceFingerprintService$submitRiskPayload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $payload;
    final /* synthetic */ String $transactionId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRiskDeviceFingerprintService$submitRiskPayload$1(String str, Map<String, String> map, Continuation<? super OKRiskDeviceFingerprintService$submitRiskPayload$1> continuation) {
        super(2, continuation);
        this.$transactionId = str;
        this.$payload = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKRiskDeviceFingerprintService$submitRiskPayload$1 oKRiskDeviceFingerprintService$submitRiskPayload$1 = new OKRiskDeviceFingerprintService$submitRiskPayload$1(this.$transactionId, this.$payload, continuation);
        oKRiskDeviceFingerprintService$submitRiskPayload$1.L$0 = obj;
        return oKRiskDeviceFingerprintService$submitRiskPayload$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKRiskDeviceFingerprintService$submitRiskPayload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String str = this.$transactionId;
                Map<String, String> map = this.$payload;
                InterfaceC47028tiM interfaceC47028tiMEZpvd = InterfaceC47028tiM.Companion.EZpvd();
                C47025tiJ c47025tiJ = new C47025tiJ(map);
                this.label = 1;
                obj = interfaceC47028tiMEZpvd.KWHzl(str, c47025tiJ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        String str2 = this.$transactionId;
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            DeviceProfileResponse deviceProfileResponse = (DeviceProfileResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            SPUtils.put("OKRLFP", deviceProfileResponse.getFingerprintId());
            if (Intrinsics.EZpvd((Object) deviceProfileResponse.getStatus(), (Object) "success")) {
                C47004thp c47004thp = C47004thp.EZpvd;
                FingerprintIdStatus fingerprintIdStatus = FingerprintIdStatus.SUCCESS;
                c47004thp.EZpvd(fingerprintIdStatus);
                C43292rmY.OLrzqt.OLrzqt(new C46998thj(deviceProfileResponse.getFingerprintId(), "fp-status=" + fingerprintIdStatus.getStatus() + "&fingerprint-id=" + deviceProfileResponse.getFingerprintId() + "&session-id=" + str2, null, 4, null));
            }
        }
        String str3 = this.$transactionId;
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            C47004thp c47004thp2 = C47004thp.EZpvd;
            FingerprintIdStatus fingerprintIdStatus2 = FingerprintIdStatus.FAIL;
            c47004thp2.EZpvd(fingerprintIdStatus2);
            String strEZpvd = C47136tkO.AEQbTJ.EZpvd();
            C43292rmY.OLrzqt.OLrzqt(new C46998thj(strEZpvd, "fp-status=" + fingerprintIdStatus2.getStatus() + "&fingerprint-id=" + strEZpvd + "&session-id=" + str3, null, 4, null));
        }
        return Unit.INSTANCE;
    }
}
