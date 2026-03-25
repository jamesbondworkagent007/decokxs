package com.okinc.business.market.features.home.ui;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25983jNp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeSharedFilterViewModel$changeNetworkByValidChainId$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ HomeSharedFilterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeSharedFilterViewModel$changeNetworkByValidChainId$1(HomeSharedFilterViewModel homeSharedFilterViewModel, String str, Continuation<? super HomeSharedFilterViewModel$changeNetworkByValidChainId$1> continuation) {
        super(2, continuation);
        this.this$0 = homeSharedFilterViewModel;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeSharedFilterViewModel$changeNetworkByValidChainId$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeSharedFilterViewModel$changeNetworkByValidChainId$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25983jNp c25983jNp = this.this$0.copydefault;
            this.label = 1;
            obj = c25983jNp.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        String str = this.$chainId;
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((MarketChainBean) next).getChainId(), (Object) str)) {
                break;
            }
        }
        MarketChainBean marketChainBean = (MarketChainBean) next;
        if (marketChainBean != null) {
            this.this$0.AEQbTJ(new HomeChainFilterUiModel(marketChainBean.getChainId(), marketChainBean.getChainName(), null, 4, null));
        }
        return Unit.INSTANCE;
    }
}
