package com.okinc.business.defi.common.utils;

import com.okinc.business.defi.biz.net.bean.BlockAddressCheckResp;
import com.okinc.network.okg.response.OKServerException;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager$handleWalletNotFound$2$voidCallback$1$checkResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends BlockAddressCheckResp, ? extends OKServerException>>, Object> {
    final /* synthetic */ Map<String, String> $curenentWalletAddressMap;
    int label;
    final /* synthetic */ ReferralManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$handleWalletNotFound$2$voidCallback$1$checkResponse$1(ReferralManager referralManager, Map<String, String> map, Continuation<? super ReferralManager$handleWalletNotFound$2$voidCallback$1$checkResponse$1> continuation) {
        super(2, continuation);
        this.this$0 = referralManager;
        this.$curenentWalletAddressMap = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralManager$handleWalletNotFound$2$voidCallback$1$checkResponse$1(this.this$0, this.$curenentWalletAddressMap, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends BlockAddressCheckResp, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<BlockAddressCheckResp, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<BlockAddressCheckResp, OKServerException>> continuation) {
        return ((ReferralManager$handleWalletNotFound$2$voidCallback$1$checkResponse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbu = this.this$0.isConnected;
            Map<String, String> map = this.$curenentWalletAddressMap;
            this.label = 1;
            obj = c13934dbu.AEQbTJ(map, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
