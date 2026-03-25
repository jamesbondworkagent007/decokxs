package com.okinc.business.defi.wallet.connect.viewmodel;

import com.okinc.business.defi.biz.net.bean.CheckAddressResp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C10854bwM;
import o.C13934dbu;
import o.C16103edc;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletTrackerAddressViewModel$checkNearAddressAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $address;
    int label;
    final /* synthetic */ C16103edc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletTrackerAddressViewModel$checkNearAddressAsync$1(C16103edc c16103edc, String str, Continuation<? super DefiWalletTrackerAddressViewModel$checkNearAddressAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = c16103edc;
        this.$address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletTrackerAddressViewModel$checkNearAddressAsync$1(this.this$0, this.$address, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((DefiWalletTrackerAddressViewModel$checkNearAddressAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean zEZpvd = false;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C10854bwM c10854bwMAuCTel = this.this$0.OLrzqt.AuCTel();
            Long lKWHzl = c10854bwMAuCTel != null ? C56443yFo.KWHzl(c10854bwMAuCTel.AhwBna()) : null;
            if (lKWHzl != null && this.$address.length() != 0) {
                C13934dbu c13934dbu = this.this$0.gEmmrt;
                long jLongValue = lKWHzl.longValue();
                String str = this.$address;
                this.label = 1;
                obj = c13934dbu.EZpvd(jLongValue, str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                return C56443yFo.KWHzl(false);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            zEZpvd = Intrinsics.EZpvd(((CheckAddressResp) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getRes(), C56443yFo.KWHzl(true));
        } else if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56443yFo.KWHzl(zEZpvd);
    }
}
