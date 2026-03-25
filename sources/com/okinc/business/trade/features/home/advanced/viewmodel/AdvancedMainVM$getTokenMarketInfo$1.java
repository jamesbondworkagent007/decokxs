package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C28158kRa;
import o.C28200kSp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMainVM$getTokenMarketInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexMultiTokenInfoBean $token;
    Object L$0;
    int label;
    final /* synthetic */ AdvancedMainVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMainVM$getTokenMarketInfo$1(AdvancedMainVM advancedMainVM, DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super AdvancedMainVM$getTokenMarketInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedMainVM;
        this.$token = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMainVM$getTokenMarketInfo$1(this.this$0, this.$token, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMainVM$getTokenMarketInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28158kRa c28158kRa = this.this$0.fARcdN;
            String chainId = this.$token.getChainId();
            String tokenContractAddress = this.$token.getTokenContractAddress();
            this.label = 1;
            obj = c28158kRa.EZpvd(chainId, tokenContractAddress, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                abstractC43419rot = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                AdvancedMainVM advancedMainVM = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    MutableSharedFlow mutableSharedFlow = advancedMainVM.OLrzqt;
                    C28200kSp c28200kSp = new C28200kSp(false, "");
                    this.L$0 = abstractC43419rot;
                    this.label = 3;
                    if (mutableSharedFlow.emit(c28200kSp, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        AdvancedMainVM advancedMainVM2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            LatestMarketInfoBean latestMarketInfoBean = (LatestMarketInfoBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            MutableSharedFlow mutableSharedFlow2 = advancedMainVM2.OLrzqt;
            C28200kSp c28200kSp2 = new C28200kSp(latestMarketInfoBean.hasMarketCapData(), latestMarketInfoBean.getCirculatingSupply());
            this.L$0 = abstractC43419rot;
            this.label = 2;
            if (mutableSharedFlow2.emit(c28200kSp2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        AdvancedMainVM advancedMainVM3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
