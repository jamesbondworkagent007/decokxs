package com.okinc.business.defi.common.utils;

import com.okinc.business.defi.biz.net.bean.DeviceRefCodeCacheBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager$updateReferralDeviceCodeInfoWithString$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $codeInfoJsonString;
    int label;
    final /* synthetic */ ReferralManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$updateReferralDeviceCodeInfoWithString$1(ReferralManager referralManager, String str, Continuation<? super ReferralManager$updateReferralDeviceCodeInfoWithString$1> continuation) {
        super(2, continuation);
        this.this$0 = referralManager;
        this.$codeInfoJsonString = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralManager$updateReferralDeviceCodeInfoWithString$1(this.this$0, this.$codeInfoJsonString, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReferralManager$updateReferralDeviceCodeInfoWithString$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        DeviceRefCodeCacheBean deviceRefCodeCacheBeanCopydefault;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                DeviceRefCodeCacheBean deviceRefCodeCacheBeanValues = this.this$0.values();
                pUU.KWHzl("DexReferral", "updateReferralDeviceCodeInfoWithString, start, codeInfoJsonString=" + this.$codeInfoJsonString);
                try {
                    deviceRefCodeCacheBeanCopydefault = DeviceRefCodeCacheBean.Companion.copydefault(this.$codeInfoJsonString);
                } catch (Exception e) {
                    pUU.AEQbTJ("DexReferral", "updateReferralDeviceCodeInfoWithString parse failed", e);
                    deviceRefCodeCacheBeanCopydefault = null;
                }
                if (deviceRefCodeCacheBeanCopydefault != null && !Intrinsics.EZpvd(deviceRefCodeCacheBeanValues, deviceRefCodeCacheBeanCopydefault)) {
                    this.this$0.OLrzqt(deviceRefCodeCacheBeanCopydefault);
                }
            } catch (Exception e2) {
                pUU.AEQbTJ("DexReferral", "updateReferralDeviceCodeInfoWithString failed", e2);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
