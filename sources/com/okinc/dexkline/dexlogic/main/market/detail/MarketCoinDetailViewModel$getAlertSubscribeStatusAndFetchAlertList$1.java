package com.okinc.dexkline.dexlogic.main.market.detail;

import androidx.lifecycle.MutableLiveData;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32277mWa;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenBase $tokenBase;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketCoinDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1(MarketCoinDetailViewModel marketCoinDetailViewModel, TokenBase tokenBase, Continuation<? super MarketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1> continuation) {
        super(2, continuation);
        this.this$0 = marketCoinDetailViewModel;
        this.$tokenBase = tokenBase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1 marketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1 = new MarketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1(this.this$0, this.$tokenBase, continuation);
        marketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1.L$0 = obj;
        return marketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z2 = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                MarketCoinDetailViewModel marketCoinDetailViewModel = this.this$0;
                Result.Application application = Result.Companion;
                C32277mWa c32277mWa = marketCoinDetailViewModel.isConnected;
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                obj = c32277mWa.EZpvd(unit, (Continuation) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        MarketCoinDetailViewModel marketCoinDetailViewModel2 = this.this$0;
        TokenBase tokenBase = this.$tokenBase;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            List<AlertRemindPo> list = (List) objM7377constructorimpl;
            MutableLiveData mutableLiveData = marketCoinDetailViewModel2.OLrzqt;
            Boolean boolKWHzl = null;
            if (list != null) {
                if (!list.isEmpty()) {
                    for (AlertRemindPo alertRemindPo : list) {
                        if (Intrinsics.EZpvd((Object) alertRemindPo.getChainId(), (Object) (tokenBase != null ? tokenBase.getChainId() : null)) && Intrinsics.EZpvd((Object) alertRemindPo.getTokenAddress(), (Object) tokenBase.getTokenContractAddress())) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    boolKWHzl = C56443yFo.KWHzl(z);
                } else {
                    z = false;
                    boolKWHzl = C56443yFo.KWHzl(z);
                }
            }
            mutableLiveData.setValue(boolKWHzl);
            if (list != null && !list.isEmpty()) {
                z2 = false;
            }
            marketCoinDetailViewModel2.fARcdN = z2;
        }
        MarketCoinDetailViewModel marketCoinDetailViewModel3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            marketCoinDetailViewModel3.OLrzqt.setValue(C56443yFo.KWHzl(false));
        }
        return Unit.INSTANCE;
    }
}
