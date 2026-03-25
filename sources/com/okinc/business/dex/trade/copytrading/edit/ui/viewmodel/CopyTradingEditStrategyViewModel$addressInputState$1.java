package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;
import o.C19881gSu;
import o.gTA;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class CopyTradingEditStrategyViewModel$addressInputState$1 extends AdaptedFunctionReference implements yHO<DefiChainInfo, String, Continuation<? super gTA>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyTradingEditStrategyViewModel$addressInputState$1(Object obj) {
        super(3, obj, C19881gSu.class, "validateAddressInput", "validateAddressInput(Lcom/okinc/business/dexlogic/bean/DefiChainInfo;Ljava/lang/String;)Lcom/okinc/business/dex/trade/copytrading/edit/ui/model/AddressInputState;", 4);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(DefiChainInfo defiChainInfo, String str, Continuation<? super gTA> continuation) {
        return CopyTradingEditStrategyViewModel.AEQbTJ((C19881gSu) this.receiver, defiChainInfo, str, continuation);
    }
}
