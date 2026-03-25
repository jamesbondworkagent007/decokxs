package com.okinc.business.defi.common.utils;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C11286cIp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager$deleteReferralInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $walletAddress;
    final /* synthetic */ String $walletType;
    boolean Z$0;
    int label;
    final /* synthetic */ ReferralManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$deleteReferralInfo$2(String str, String str2, ReferralManager referralManager, Continuation<? super ReferralManager$deleteReferralInfo$2> continuation) {
        super(2, continuation);
        this.$walletType = str;
        this.$walletAddress = str2;
        this.this$0 = referralManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralManager$deleteReferralInfo$2(this.$walletType, this.$walletAddress, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((ReferralManager$deleteReferralInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("DexReferral", "deleteReferralInfo: Starting save for walletType=" + this.$walletType + ", walletAddress=" + this.$walletAddress);
                C11286cIp c11286cIp = this.this$0.gEmmrt;
                String str = this.$walletType;
                String str2 = this.$walletAddress;
                this.label = 1;
                obj = c11286cIp.KWHzl(str, str2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = this.Z$0;
                    C56391yDq.AEQbTJ(obj);
                    return C56443yFo.KWHzl(z);
                }
                C56391yDq.AEQbTJ(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                ReferralManager referralManager = this.this$0;
                this.Z$0 = zBooleanValue;
                this.label = 2;
                if (referralManager.djBIcL((Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            z = zBooleanValue;
            return C56443yFo.KWHzl(z);
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "deleteReferralInfo: Exception occurred", e);
            return C56443yFo.KWHzl(false);
        }
    }
}
