package com.okinc.business.defi.common.utils;

import com.okinc.business.defi.biz.net.bean.DeviceRefCodeCacheBean;
import com.okinc.business.defi.biz.net.bean.PreferRefCodeInfoResponse;
import kotlin.Pair;
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
public final class ReferralManager$tryUpdateDeviceCodeWhenExist$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ boolean $forceUpdate;
    final /* synthetic */ DeviceRefCodeCacheBean $oldDeviceRefCodeCacheBean;
    int label;
    final /* synthetic */ ReferralManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$tryUpdateDeviceCodeWhenExist$2(String str, DeviceRefCodeCacheBean deviceRefCodeCacheBean, boolean z, ReferralManager referralManager, Continuation<? super ReferralManager$tryUpdateDeviceCodeWhenExist$2> continuation) {
        super(2, continuation);
        this.$code = str;
        this.$oldDeviceRefCodeCacheBean = deviceRefCodeCacheBean;
        this.$forceUpdate = z;
        this.this$0 = referralManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralManager$tryUpdateDeviceCodeWhenExist$2(this.$code, this.$oldDeviceRefCodeCacheBean, this.$forceUpdate, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReferralManager$tryUpdateDeviceCodeWhenExist$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("DexReferral", "tryUpdateDeviceCodeWhenExist: starting, code=" + this.$code + ", oldDeviceRefCodeCacheBean=" + this.$oldDeviceRefCodeCacheBean + ", forceUpdate=" + this.$forceUpdate);
                ReferralManager referralManager = this.this$0;
                String str = this.$code;
                this.label = 1;
                obj = referralManager.AhwBna(str, (Continuation<? super Pair<Integer, PreferRefCodeInfoResponse>>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Pair pair = (Pair) obj;
            PreferRefCodeInfoResponse preferRefCodeInfoResponse = (PreferRefCodeInfoResponse) pair.getSecond();
            if (preferRefCodeInfoResponse == null) {
                return null;
            }
            ReferralManager referralManager2 = this.this$0;
            boolean z = this.$forceUpdate;
            String str2 = this.$code;
            DeviceRefCodeCacheBean deviceRefCodeCacheBean = this.$oldDeviceRefCodeCacheBean;
            pUU.KWHzl("DexReferral", "tryUpdateDeviceCodeWhenExist: result=" + pair.getSecond());
            boolean zAEQbTJ = referralManager2.AEQbTJ(preferRefCodeInfoResponse);
            if ((zAEQbTJ || z) && (!Intrinsics.EZpvd((Object) str2, (Object) deviceRefCodeCacheBean.getCode()) || !Intrinsics.EZpvd(deviceRefCodeCacheBean.getBean(), preferRefCodeInfoResponse))) {
                pUU.KWHzl("DexReferral", "tryUpdateDeviceCodeWhenExist: updateReferralDeviceCodeInfo=" + pair.getSecond());
                referralManager2.OLrzqt(new DeviceRefCodeCacheBean(str2, preferRefCodeInfoResponse));
            } else {
                pUU.KWHzl("DexReferral", "tryUpdateDeviceCodeWhenExist: no need update, allowed=" + zAEQbTJ + ", forceUpdate=" + z + ", result.second=" + pair.getSecond());
            }
            return Unit.INSTANCE;
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "tryUpdateDeviceCodeWhenExist failed", e);
            return Unit.INSTANCE;
        }
    }
}
