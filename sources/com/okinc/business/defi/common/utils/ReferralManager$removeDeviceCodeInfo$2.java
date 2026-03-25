package com.okinc.business.defi.common.utils;

import com.okinc.business.defi.biz.net.bean.DeviceRefCodeCacheBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59449zhJ;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager$removeDeviceCodeInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ ReferralManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$removeDeviceCodeInfo$2(String str, ReferralManager referralManager, Continuation<? super ReferralManager$removeDeviceCodeInfo$2> continuation) {
        super(2, continuation);
        this.$code = str;
        this.this$0 = referralManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralManager$removeDeviceCodeInfo$2(this.$code, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((ReferralManager$removeDeviceCodeInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zCopydefault;
        DeviceRefCodeCacheBean deviceRefCodeCacheBeanValues;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                pUU.KWHzl("DexReferral", "removeDeviceCodeInfo, start, code=" + this.$code);
                deviceRefCodeCacheBeanValues = this.this$0.values();
            } catch (Exception e) {
                pUU.AEQbTJ("DexReferral", "removeDeviceCodeInfo failed", e);
            }
            if (deviceRefCodeCacheBeanValues != null && C59449zhJ.gEmmrt(deviceRefCodeCacheBeanValues.getCode(), this.$code, true)) {
                pUU.KWHzl("DexReferral", "removeDeviceCodeInfo: code matches, removing device code");
                zCopydefault = this.this$0.AYXKKw.copydefault();
                return C56443yFo.KWHzl(zCopydefault);
            }
            String code = deviceRefCodeCacheBeanValues != null ? deviceRefCodeCacheBeanValues.getCode() : null;
            pUU.KWHzl("DexReferral", "removeDeviceCodeInfo: code mismatch or not found. Stored code: " + code + ", Requested code: " + this.$code);
            zCopydefault = false;
            return C56443yFo.KWHzl(zCopydefault);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
