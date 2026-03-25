package com.okinc.tradingbot.impl.market_place.home.presenter;

import com.okinc.social_trade_api.data.BannerDisplayPlace;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49318umL;
import o.yDY;

/* JADX INFO: loaded from: classes16.dex */
public final class MarketPlaceHomeHeaderPresenter$fetchBanner$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MarketPlaceHomeHeaderPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketPlaceHomeHeaderPresenter$fetchBanner$1(MarketPlaceHomeHeaderPresenter marketPlaceHomeHeaderPresenter, Continuation<? super MarketPlaceHomeHeaderPresenter$fetchBanner$1> continuation) {
        super(2, continuation);
        this.this$0 = marketPlaceHomeHeaderPresenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketPlaceHomeHeaderPresenter$fetchBanner$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketPlaceHomeHeaderPresenter$fetchBanner$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49318umL interfaceC49318umL = (InterfaceC49318umL) C43251rlk.copydefault(InterfaceC49318umL.class);
            BannerDisplayPlace bannerDisplayPlace = BannerDisplayPlace.BOT;
            this.label = 1;
            obj = interfaceC49318umL.EZpvd(null, bannerDisplayPlace, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        List listAhwBna = (List) obj;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        MutableStateFlow mutableStateFlow = this.this$0.copydefault;
        this.label = 2;
        if (mutableStateFlow.emit(listAhwBna, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
