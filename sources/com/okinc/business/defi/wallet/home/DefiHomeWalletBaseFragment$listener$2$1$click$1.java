package com.okinc.business.defi.wallet.home;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C10854bwM;
import o.C10953byF;
import o.C10954byG;
import o.C15625ePg;
import o.C18272ffK;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.eUG;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeWalletBaseFragment$listener$2$1$click$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ eUG $groupItem;
    final /* synthetic */ String $walletId;
    Object L$0;
    int label;
    final /* synthetic */ C15625ePg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeWalletBaseFragment$listener$2$1$click$1(eUG eug, C15625ePg c15625ePg, String str, Continuation<? super DefiHomeWalletBaseFragment$listener$2$1$click$1> continuation) {
        super(2, continuation);
        this.$groupItem = eug;
        this.this$0 = c15625ePg;
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeWalletBaseFragment$listener$2$1$click$1(this.$groupItem, this.this$0, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeWalletBaseFragment$listener$2$1$click$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C10854bwM c10854bwM;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(C56443yFo.KWHzl(C10953byF.KWHzl.EZpvd(this.$groupItem.djBIcL())));
            if (c10854bwMKWHzl == null) {
                return Unit.INSTANCE;
            }
            this.this$0.showLoading();
            C18272ffK c18272ffKEjfBZ = this.this$0.ejfBZ();
            long jFetchVPNInfo = c10854bwMKWHzl.fetchVPNInfo();
            this.L$0 = c10854bwMKWHzl;
            this.label = 1;
            Object objOLrzqt = c18272ffKEjfBZ.OLrzqt(jFetchVPNInfo, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c10854bwM = c10854bwMKWHzl;
            obj = objOLrzqt;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10854bwM = (C10854bwM) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.dismissLoading();
        if (Intrinsics.EZpvd((Boolean) obj, C56443yFo.KWHzl(true))) {
            C15625ePg.Application.OLrzqt(this.this$0, c10854bwM);
        } else {
            C15625ePg.Application.AEQbTJ(this.this$0, this.$groupItem, this.$walletId);
        }
        return Unit.INSTANCE;
    }
}
