package com.okinc.business.dex.trade.copytrading.edit.ui.activity;

import com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingEditStrategyViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9740bbL;
import o.gTB;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingEditStrategyActivity$submitOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CopyTradingEditStrategyActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyActivity$submitOrder$1(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, Continuation<? super CopyTradingEditStrategyActivity$submitOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyActivity$submitOrder$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyActivity$submitOrder$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel;
        String str;
        SellSettings sellSettings;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CopyTradingEditStrategyActivity copyTradingEditStrategyActivity = this.this$0;
            this.label = 1;
            obj = copyTradingEditStrategyActivity.copydefault((Continuation<? super SellSettings>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) this.L$2;
                CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel2 = (CopyTradingEditStrategyViewModel) this.L$1;
                SellSettings sellSettings2 = (SellSettings) this.L$0;
                C56391yDq.AEQbTJ(obj);
                sellSettings = sellSettings2;
                str = str2;
                copyTradingEditStrategyViewModel = copyTradingEditStrategyViewModel2;
                TokenFilter tokenFilterDjBIcL = this.this$0.AhwBna().DbNXlk.djBIcL();
                final CopyTradingEditStrategyActivity copyTradingEditStrategyActivity2 = this.this$0;
                copyTradingEditStrategyViewModel.KWHzl(str, (BuySettings) obj, sellSettings, tokenFilterDjBIcL, copyTradingEditStrategyActivity2, (32 & 32) != 0 ? false : false, new InterfaceC9740bbL.TaskDescription() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$submitOrder$1.3
                    @Override // o.InterfaceC9740bbL.TaskDescription
                    public void copydefault() {
                        copyTradingEditStrategyActivity2.showLoading();
                    }

                    @Override // o.InterfaceC9740bbL.TaskDescription
                    public void EZpvd() {
                        copyTradingEditStrategyActivity2.dismissLoading();
                    }
                });
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        SellSettings sellSettings3 = (SellSettings) obj;
        if (sellSettings3 == null) {
            return Unit.INSTANCE;
        }
        CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModelGEmmrt = this.this$0.gEmmrt();
        gTB gtbFARcdN = this.this$0.gEmmrt().fARcdN();
        String strEZpvd = gtbFARcdN != null ? gtbFARcdN.EZpvd(this.this$0) : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        CopyTradingEditStrategyActivity copyTradingEditStrategyActivity3 = this.this$0;
        this.L$0 = sellSettings3;
        this.L$1 = copyTradingEditStrategyViewModelGEmmrt;
        this.L$2 = strEZpvd;
        this.label = 2;
        Object objKWHzl = copyTradingEditStrategyActivity3.KWHzl((Continuation<? super BuySettings>) this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        copyTradingEditStrategyViewModel = copyTradingEditStrategyViewModelGEmmrt;
        str = strEZpvd;
        sellSettings = sellSettings3;
        obj = objKWHzl;
        TokenFilter tokenFilterDjBIcL2 = this.this$0.AhwBna().DbNXlk.djBIcL();
        final CopyTradingEditStrategyActivity copyTradingEditStrategyActivity22 = this.this$0;
        copyTradingEditStrategyViewModel.KWHzl(str, (BuySettings) obj, sellSettings, tokenFilterDjBIcL2, copyTradingEditStrategyActivity22, (32 & 32) != 0 ? false : false, new InterfaceC9740bbL.TaskDescription() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$submitOrder$1.3
            @Override // o.InterfaceC9740bbL.TaskDescription
            public void copydefault() {
                copyTradingEditStrategyActivity22.showLoading();
            }

            @Override // o.InterfaceC9740bbL.TaskDescription
            public void EZpvd() {
                copyTradingEditStrategyActivity22.dismissLoading();
            }
        });
        return Unit.INSTANCE;
    }
}
