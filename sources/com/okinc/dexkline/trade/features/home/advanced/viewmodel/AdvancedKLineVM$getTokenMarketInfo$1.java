package com.okinc.dexkline.trade.features.home.advanced.viewmodel;

import com.okinc.dexkline.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC34688ngn;
import o.AbstractC43419rot;
import o.C34679nge;
import o.C34680ngf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class AdvancedKLineVM$getTokenMarketInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexMultiTokenInfoBean $token;
    int label;
    final /* synthetic */ AdvancedKLineVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedKLineVM$getTokenMarketInfo$1(AdvancedKLineVM advancedKLineVM, DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super AdvancedKLineVM$getTokenMarketInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedKLineVM;
        this.$token = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedKLineVM$getTokenMarketInfo$1(this.this$0, this.$token, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedKLineVM$getTokenMarketInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
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
            this.this$0.copydefault.setValue(AbstractC34688ngn.TaskDescription.copydefault);
            AdvancedKLineVM advancedKLineVM = this.this$0;
            this.label = 1;
            if (advancedKLineVM.EZpvd(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                AdvancedKLineVM advancedKLineVM2 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    LatestMarketInfoBean latestMarketInfoBean = (LatestMarketInfoBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    advancedKLineVM2.values = new C34679nge(latestMarketInfoBean.hasMarketCapData(), latestMarketInfoBean.getCirculatingSupply(), advancedKLineVM2.gEmmrt);
                    DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) advancedKLineVM2.EZpvd.getValue();
                    if (dexMultiTokenInfoBean != null) {
                        dexMultiTokenInfoBean.setWTokenAddress(latestMarketInfoBean.getWrapperTokenContractAddress());
                    }
                    advancedKLineVM2.gEmmrt();
                    advancedKLineVM2.AhwBna();
                    advancedKLineVM2.copydefault.setValue(new AbstractC34688ngn.Application(advancedKLineVM2.values));
                }
                AdvancedKLineVM advancedKLineVM3 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    advancedKLineVM3.values = null;
                    advancedKLineVM3.copydefault.setValue(new AbstractC34688ngn.StateListAnimator(false));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C34680ngf c34680ngf = this.this$0.AuCTel;
        String chainId = this.$token.getChainId();
        String tokenContractAddress = this.$token.getTokenContractAddress();
        this.label = 2;
        obj = c34680ngf.AEQbTJ(chainId, tokenContractAddress, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        AdvancedKLineVM advancedKLineVM22 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
        }
        AdvancedKLineVM advancedKLineVM32 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
