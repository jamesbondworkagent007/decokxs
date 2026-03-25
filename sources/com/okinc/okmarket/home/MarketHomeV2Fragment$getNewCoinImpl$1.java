package com.okinc.okmarket.home;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.okmarket.home.MarketHomeV2Fragment$getNewCoinImpl$1;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.framework.constant.TradeKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49425uoM;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;

/* JADX INFO: loaded from: classes19.dex */
public final class MarketHomeV2Fragment$getNewCoinImpl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MarketHomeV2Fragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2Fragment$getNewCoinImpl$1(MarketHomeV2Fragment marketHomeV2Fragment, Continuation<? super MarketHomeV2Fragment$getNewCoinImpl$1> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeV2Fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeV2Fragment$getNewCoinImpl$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeV2Fragment$getNewCoinImpl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final MarketHomeV2Fragment marketHomeV2Fragment = this.this$0;
            Function1 function1 = new Function1() { // from class: o.tay
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MarketHomeV2Fragment$getNewCoinImpl$1.invokeSuspend$lambda$5(marketHomeV2Fragment, (java.util.List) obj2);
                }
            };
            this.label = 1;
            if (marketHomeV2Fragment.OLrzqt((Function1<? super List<NewCoinInfo>, Unit>) function1, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5(MarketHomeV2Fragment marketHomeV2Fragment, List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        InterfaceC54577xNn interfaceC54577xNn;
        if (!list.isEmpty()) {
            NewCoinInfo newCoinInfo = (NewCoinInfo) list.get(0);
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                NewCoinInfo newCoinInfo2 = new NewCoinInfo();
                List<String> coinName = newCoinInfo.getCoinName();
                if (coinName != null) {
                    arrayList = new ArrayList();
                    for (Object obj : coinName) {
                        if (interfaceC54581xNrOLrzqt.fetchVPNInfo((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = null;
                }
                newCoinInfo2.setCoinName(arrayList);
                newCoinInfo2.setNewCoin(newCoinInfo.getNewCoin());
                List<String> futuresName = newCoinInfo.getFuturesName();
                if (futuresName != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj2 : futuresName) {
                        if (interfaceC54581xNrOLrzqt.fetchVPNInfo((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                newCoinInfo2.setFuturesName(arrayList2);
                newCoinInfo2.setFuturesNum(newCoinInfo.getFuturesNum());
                newCoinInfo = newCoinInfo2;
            }
            marketHomeV2Fragment.hDKMBd = newCoinInfo;
            if (marketHomeV2Fragment.hDKMBd != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(marketHomeV2Fragment), null, null, new MarketHomeV2Fragment$getNewCoinImpl$1$1$2$1(marketHomeV2Fragment, null), 3, null);
            }
            RxBus.KWHzl(NewCoinInfo.class.getSimpleName());
        }
        return Unit.INSTANCE;
    }
}
