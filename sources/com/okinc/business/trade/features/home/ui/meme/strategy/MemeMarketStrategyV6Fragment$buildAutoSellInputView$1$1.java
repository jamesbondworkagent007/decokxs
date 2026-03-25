package com.okinc.business.trade.features.home.ui.meme.strategy;

import com.okinc.business.dex.tee.common.viewmodel.TradeAutoSellViewModel;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$buildAutoSellInputView$1$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C30567ldb;
import o.C32866mlf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeMarketStrategyV6Fragment$buildAutoSellInputView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ MemeMarketStrategyV6Fragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeMarketStrategyV6Fragment$buildAutoSellInputView$1$1(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, Continuation<? super MemeMarketStrategyV6Fragment$buildAutoSellInputView$1$1> continuation) {
        super(2, continuation);
        this.this$0 = memeMarketStrategyV6Fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeMarketStrategyV6Fragment$buildAutoSellInputView$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeMarketStrategyV6Fragment$buildAutoSellInputView$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment2 = this.this$0;
            C32866mlf.onEvent$default("DEXTrade_Home_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.loc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MemeMarketStrategyV6Fragment$buildAutoSellInputView$1$1.invokeSuspend$lambda$0(memeMarketStrategyV6Fragment2, (EventParamsList) obj2);
                }
            }, 1, (Object) null);
            C30567ldb c30567ldbAubY = this.this$0.AubY();
            if (c30567ldbAubY != null && !c30567ldbAubY.copydefault()) {
                TradeAutoSellViewModel tradeAutoSellViewModelEjfBZ = this.this$0.ejfBZ();
                String chainId = this.this$0.iwGUEr().getChainId();
                this.label = 1;
                obj = tradeAutoSellViewModelEjfBZ.OLrzqt(chainId, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            TradeAutoSellViewModel tradeAutoSellViewModelEjfBZ2 = this.this$0.ejfBZ();
            C30567ldb c30567ldbAubY2 = this.this$0.AubY();
            tradeAutoSellViewModelEjfBZ2.EZpvd((c30567ldbAubY2 == null || c30567ldbAubY2.copydefault()) ? false : true, this.this$0.iwGUEr().getChainId());
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                memeMarketStrategyV6Fragment = (MemeMarketStrategyV6Fragment) this.L$0;
                C56391yDq.AEQbTJ(obj);
                memeMarketStrategyV6Fragment.AEQbTJ((List<? extends AdvancedAutoSellStrategy>) obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            if (((List) obj).isEmpty()) {
                MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment3 = this.this$0;
                TradeAutoSellViewModel tradeAutoSellViewModelEjfBZ3 = memeMarketStrategyV6Fragment3.ejfBZ();
                this.L$0 = memeMarketStrategyV6Fragment3;
                this.label = 3;
                Object objKWHzl = tradeAutoSellViewModelEjfBZ3.KWHzl(this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                memeMarketStrategyV6Fragment = memeMarketStrategyV6Fragment3;
                obj = objKWHzl;
                memeMarketStrategyV6Fragment.AEQbTJ((List<? extends AdvancedAutoSellStrategy>) obj);
                return Unit.INSTANCE;
            }
            TradeAutoSellViewModel tradeAutoSellViewModelEjfBZ22 = this.this$0.ejfBZ();
            C30567ldb c30567ldbAubY22 = this.this$0.AubY();
            tradeAutoSellViewModelEjfBZ22.EZpvd((c30567ldbAubY22 == null || c30567ldbAubY22.copydefault()) ? false : true, this.this$0.iwGUEr().getChainId());
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        if (((Boolean) obj).booleanValue()) {
            TradeAutoSellViewModel tradeAutoSellViewModelEjfBZ4 = this.this$0.ejfBZ();
            this.label = 2;
            obj = tradeAutoSellViewModelEjfBZ4.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            if (((List) obj).isEmpty()) {
            }
        }
        TradeAutoSellViewModel tradeAutoSellViewModelEjfBZ222 = this.this$0.ejfBZ();
        C30567ldb c30567ldbAubY222 = this.this$0.AubY();
        tradeAutoSellViewModelEjfBZ222.EZpvd((c30567ldbAubY222 == null || c30567ldbAubY222.copydefault()) ? false : true, this.this$0.iwGUEr().getChainId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "business_type", "quick", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "quick", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "auto_sell_click", false, 4, null);
        C30567ldb c30567ldbAubY = memeMarketStrategyV6Fragment.AubY();
        EventParamsList.put$default(eventParamsList, "is_tpsl", (c30567ldbAubY == null || c30567ldbAubY.copydefault()) ? "no" : "yes", false, 4, null);
        return Unit.INSTANCE;
    }
}
