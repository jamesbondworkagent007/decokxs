package com.okinc.business.dexui.main.market.detail.fragment.chart;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C21916hRb;
import o.C25392ivp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketLandscapeFragment$initLandView$1$5$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenBase $token;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C21916hRb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketLandscapeFragment$initLandView$1$5$1$1$1(TokenBase tokenBase, C21916hRb c21916hRb, Continuation<? super MarketLandscapeFragment$initLandView$1$5$1$1$1> continuation) {
        super(2, continuation);
        this.$token = tokenBase;
        this.this$0 = c21916hRb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketLandscapeFragment$initLandView$1$5$1$1$1 marketLandscapeFragment$initLandView$1$5$1$1$1 = new MarketLandscapeFragment$initLandView$1$5$1$1$1(this.$token, this.this$0, continuation);
        marketLandscapeFragment$initLandView$1$5$1$1$1.L$0 = obj;
        return marketLandscapeFragment$initLandView$1$5$1$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketLandscapeFragment$initLandView$1$5$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractActivityC33041mov abstractActivityC33041mov;
        String tokenContractAddress;
        String str;
        String str2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Object obj2 = (CoroutineScope) this.L$0;
            abstractActivityC33041mov = obj2 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) obj2 : null;
            if (abstractActivityC33041mov != null) {
                String chainId = this.$token.getChainId();
                tokenContractAddress = this.$token.getTokenContractAddress();
                MarketCoinDetailViewModel marketCoinDetailViewModelEjfBZ = this.this$0.ejfBZ();
                this.L$0 = abstractActivityC33041mov;
                this.L$1 = chainId;
                this.L$2 = tokenContractAddress;
                this.L$3 = "DEX_Market_Tokendetail";
                this.label = 1;
                Object objCopydefault2 = marketCoinDetailViewModelEjfBZ.copydefault(this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                str = "DEX_Market_Tokendetail";
                str2 = chainId;
                obj = objCopydefault2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) this.L$3;
        tokenContractAddress = (String) this.L$2;
        str2 = (String) this.L$1;
        abstractActivityC33041mov = (AbstractActivityC33041mov) this.L$0;
        C56391yDq.AEQbTJ(obj);
        C25392ivp.KWHzl(abstractActivityC33041mov, str2, tokenContractAddress, str, (String) obj);
        return Unit.INSTANCE;
    }
}
