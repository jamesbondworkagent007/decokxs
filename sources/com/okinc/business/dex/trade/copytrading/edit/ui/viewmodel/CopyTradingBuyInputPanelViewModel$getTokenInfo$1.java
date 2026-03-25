package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C19866gSf;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingBuyInputPanelViewModel$getTokenInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexMultiTokenInfoBean $token;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CopyTradingBuyInputPanelViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingBuyInputPanelViewModel$getTokenInfo$1(CopyTradingBuyInputPanelViewModel copyTradingBuyInputPanelViewModel, DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super CopyTradingBuyInputPanelViewModel$getTokenInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingBuyInputPanelViewModel;
        this.$token = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingBuyInputPanelViewModel$getTokenInfo$1(this.this$0, this.$token, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingBuyInputPanelViewModel$getTokenInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        AbstractC43419rot abstractC43419rot2;
        CopyTradingBuyInputPanelViewModel copyTradingBuyInputPanelViewModel;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C19866gSf c19866gSf = this.this$0.fetchVPNInfo;
            DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.$token;
            this.label = 1;
            obj = c19866gSf.KWHzl(dexMultiTokenInfoBean2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC43419rot2 = (AbstractC43419rot) this.L$2;
                dexMultiTokenInfoBean = (DexMultiTokenInfoBean) this.L$1;
                copyTradingBuyInputPanelViewModel = (CopyTradingBuyInputPanelViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                copyTradingBuyInputPanelViewModel.OLrzqt(dexMultiTokenInfoBean);
                abstractC43419rot = abstractC43419rot2;
                CopyTradingBuyInputPanelViewModel copyTradingBuyInputPanelViewModel2 = this.this$0;
                DexMultiTokenInfoBean dexMultiTokenInfoBean3 = this.$token;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    copyTradingBuyInputPanelViewModel2.KWHzl.setValue(C56390yDp.OLrzqt(dexMultiTokenInfoBean3.getChainId() + dexMultiTokenInfoBean3.getTokenContractAddress(), ""));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        CopyTradingBuyInputPanelViewModel copyTradingBuyInputPanelViewModel3 = this.this$0;
        DexMultiTokenInfoBean dexMultiTokenInfoBean4 = this.$token;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            copyTradingBuyInputPanelViewModel3.isConnected = dexMultiTokenInfoBean5.getChainId();
            copyTradingBuyInputPanelViewModel3.AuCTel = dexMultiTokenInfoBean5.getTokenContractAddress();
            copyTradingBuyInputPanelViewModel3.KWHzl.setValue(C56390yDp.OLrzqt(dexMultiTokenInfoBean5.getChainId() + dexMultiTokenInfoBean5.getTokenContractAddress(), dexMultiTokenInfoBean5.getAmountNum()));
            MutableStateFlow mutableStateFlow = copyTradingBuyInputPanelViewModel3.AYXKKw;
            this.L$0 = copyTradingBuyInputPanelViewModel3;
            this.L$1 = dexMultiTokenInfoBean4;
            this.L$2 = abstractC43419rot;
            this.label = 2;
            if (mutableStateFlow.emit(dexMultiTokenInfoBean4, this) == objCopydefault) {
                return objCopydefault;
            }
            abstractC43419rot2 = abstractC43419rot;
            copyTradingBuyInputPanelViewModel = copyTradingBuyInputPanelViewModel3;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean4;
            copyTradingBuyInputPanelViewModel.OLrzqt(dexMultiTokenInfoBean);
            abstractC43419rot = abstractC43419rot2;
        }
        CopyTradingBuyInputPanelViewModel copyTradingBuyInputPanelViewModel22 = this.this$0;
        DexMultiTokenInfoBean dexMultiTokenInfoBean32 = this.$token;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
