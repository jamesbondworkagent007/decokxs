package com.okinc.business.defi.common.utils;

import com.okinc.business.defi.biz.net.bean.DeviceRefCodeCacheBean;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32856mlV;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager$checkAttributionCodeAndSaveDeviceCode$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ReferralManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$checkAttributionCodeAndSaveDeviceCode$2(ReferralManager referralManager, Continuation<? super ReferralManager$checkAttributionCodeAndSaveDeviceCode$2> continuation) {
        super(2, continuation);
        this.this$0 = referralManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralManager$checkAttributionCodeAndSaveDeviceCode$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReferralManager$checkAttributionCodeAndSaveDeviceCode$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("DexReferral", "checkAttributionCodeAndSaveDeviceCode: start");
                String strAEQbTJ = C32856mlV.OLrzqt.AEQbTJ("ref");
                if (C33129mqd.OLrzqt((CharSequence) strAEQbTJ)) {
                    pUU.KWHzl("DexReferral", "checkAttributionCodeAndSaveDeviceCode: referralCode=" + strAEQbTJ);
                    String upperCase = strAEQbTJ.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    DeviceRefCodeCacheBean deviceRefCodeCacheBeanValues = this.this$0.values();
                    if (deviceRefCodeCacheBeanValues != null) {
                        pUU.KWHzl("DexReferral", "checkAttributionCodeAndSaveDeviceCode: has device code, need check and save=" + upperCase);
                        ReferralManager referralManager = this.this$0;
                        String code = deviceRefCodeCacheBeanValues.getCode();
                        this.label = 1;
                        obj = ReferralManager.tryUpdateDeviceCodeWhenExist$default(referralManager, code, deviceRefCodeCacheBeanValues, false, this, 4, null);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        pUU.KWHzl("DexReferral", "checkAttributionCodeAndSaveDeviceCode: don't have device code, need check and save=" + upperCase);
                        ReferralManager referralManager2 = this.this$0;
                        this.label = 2;
                        obj = referralManager2.EZpvd(upperCase, true, (Continuation<? super Unit>) this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "checkAttributionCodeAndSaveDeviceCode failed", e);
        }
        return Unit.INSTANCE;
    }
}
