package com.okinc.dexkline.market.features.position.ui;

import com.okinc.dexkline.dexlogic.txs.TxType;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.filter.ui.TypeOptionParams;
import com.okinc.dexkline.market.features.position.ui.transaction_filter.TransactionFilterSheetParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33070mpX;
import o.C34476ncm;
import o.C34483nct;
import o.C34528ndl;
import o.C35964oKf;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class PositionHeaderFragment$openFilter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenFilter $presetFilter;
    int label;
    final /* synthetic */ C34483nct this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionHeaderFragment$openFilter$1(C34483nct c34483nct, TokenFilter tokenFilter, Continuation<? super PositionHeaderFragment$openFilter$1> continuation) {
        super(2, continuation);
        this.this$0 = c34483nct;
        this.$presetFilter = tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionHeaderFragment$openFilter$1(this.this$0, this.$presetFilter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionHeaderFragment$openFilter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<TxType> listGEmmrt = yDY.gEmmrt(TxType.ALL, TxType.BUY, TxType.SELL, TxType.TRANSFER_IN, TxType.TRANSFER_OUT);
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
            for (TxType txType : listGEmmrt) {
                arrayList.add(new TypeOptionParams(txType.getValue(), C34476ncm.Companion.copydefault(txType)));
            }
            C34528ndl.Application application = C34528ndl.Companion;
            String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.sendBehavioSecData);
            TokenFilter tokenFilterGEmmrt = this.this$0.AhwBna().gEmmrt();
            TokenFilter tokenFilter = this.$presetFilter;
            PositionDetailsParam positionDetailsParamOLrzqt = this.this$0.OLrzqt();
            String tokenSymbol = positionDetailsParamOLrzqt != null ? positionDetailsParamOLrzqt.getTokenSymbol() : null;
            if (tokenSymbol == null) {
                tokenSymbol = "";
            }
            application.OLrzqt(new TransactionFilterSheetParams(strAYXKKw, arrayList, tokenFilterGEmmrt, tokenFilter, "DEXMarket_Token_MyPositionFilter_Click", tokenSymbol)).show(this.this$0.getChildFragmentManager(), "tag.FilterBottomSheet");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
