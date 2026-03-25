package com.okinc.business.invest_biz.ui.screens.dex_entrance;

import com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceProductListVM$traceDexEarnItemClick$1;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27570jxg;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class DexEntranceProductListVM$traceDexEarnItemClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chain;
    final /* synthetic */ String $tabName;
    int label;
    final /* synthetic */ DexEntranceProductListVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexEntranceProductListVM$traceDexEarnItemClick$1(DexEntranceProductListVM dexEntranceProductListVM, long j, String str, Continuation<? super DexEntranceProductListVM$traceDexEarnItemClick$1> continuation) {
        super(2, continuation);
        this.this$0 = dexEntranceProductListVM;
        this.$chain = j;
        this.$tabName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexEntranceProductListVM$traceDexEarnItemClick$1(this.this$0, this.$chain, this.$tabName, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexEntranceProductListVM$traceDexEarnItemClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                DexEntranceProductListVM dexEntranceProductListVM = this.this$0;
                long j = this.$chain;
                this.label = 1;
                obj = dexEntranceProductListVM.copydefault(j, (Continuation<? super String>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            final String str = (String) obj;
            final String str2 = this.$tabName;
            C27570jxg.investEvent$default("DEXMarket_Earn_Item_Click", null, new Function1() { // from class: o.jbb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return DexEntranceProductListVM$traceDexEarnItemClick$1.invokeSuspend$lambda$0(str2, str, (EventParamsList) obj2);
                }
            }, 1, null);
        } catch (Exception e) {
            pUU.AEQbTJ("Error tracking DexEntrancePage event", e);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(String str, String str2, EventParamsList eventParamsList) {
        eventParamsList.put("source", "android", false);
        eventParamsList.put("tab", str, false);
        eventParamsList.put("wallet_address", str2, false);
        return Unit.INSTANCE;
    }
}
