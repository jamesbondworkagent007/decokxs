package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28163kRf;
import o.C56391yDq;
import o.C56442yFn;
import o.kQF;
import o.kQQ;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$updateTradeType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AdvancedTradeType $tradeType;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$updateTradeType$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, AdvancedTradeType advancedTradeType, Continuation<? super AdvancedPlaceOrderVM$updateTradeType$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
        this.$tradeType = advancedTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$updateTradeType$1(this.this$0, this.$tradeType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$updateTradeType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        DexMultiTokenInfoBean value;
        AdvancedPlaceOrderVM advancedPlaceOrderVM;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        AdvancedPlaceOrderVM advancedPlaceOrderVM2;
        DexMultiTokenInfoBean dexMultiTokenInfoBean3;
        C28163kRf c28163kRf;
        String str;
        String chainId;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AdvancedPlaceOrderVM.stopCheckingQuote$default(this.this$0, false, false, 3, null);
            this.this$0.fARcdN.setValue(this.$tradeType);
            this.this$0.AEQbTJ("");
            value = this.this$0.ejfBZ().getValue();
            if (value == null) {
                return Unit.INSTANCE;
            }
            DexMultiTokenInfoBean value2 = this.this$0.AwvSrB().getValue();
            if (value2 != null) {
                advancedPlaceOrderVM = this.this$0;
                if (advancedPlaceOrderVM.DCJXGO.KWHzl(value2)) {
                    advancedPlaceOrderVM.DTwDnp.copydefault();
                    kQQ kqq = advancedPlaceOrderVM.zsXlph;
                    this.L$0 = value;
                    this.L$1 = advancedPlaceOrderVM;
                    this.L$2 = value2;
                    this.label = 1;
                    if (kqq.KWHzl(value2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    dexMultiTokenInfoBean = value;
                    dexMultiTokenInfoBean2 = value2;
                    advancedPlaceOrderVM2 = advancedPlaceOrderVM;
                }
                if (advancedPlaceOrderVM.DCJXGO.AEQbTJ(value)) {
                }
            }
            this.this$0.dNCPSb.OLrzqt(this.this$0.accept);
            c28163kRf = this.this$0.dNCPSb;
            str = this.this$0.accept;
            chainId = value.getChainId();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (c28163kRf.OLrzqt(str, chainId, this) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                return Unit.INSTANCE;
            }
            advancedPlaceOrderVM2 = (AdvancedPlaceOrderVM) this.L$1;
            dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) this.L$0;
            C56391yDq.AEQbTJ(obj);
            advancedPlaceOrderVM = advancedPlaceOrderVM2;
            value = dexMultiTokenInfoBean3;
            if (advancedPlaceOrderVM.DCJXGO.AEQbTJ(value)) {
                advancedPlaceOrderVM.DTwDnp.copydefault();
            }
            this.this$0.dNCPSb.OLrzqt(this.this$0.accept);
            c28163kRf = this.this$0.dNCPSb;
            str = this.this$0.accept;
            chainId = value.getChainId();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (c28163kRf.OLrzqt(str, chainId, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) this.L$2;
        AdvancedPlaceOrderVM advancedPlaceOrderVM3 = (AdvancedPlaceOrderVM) this.L$1;
        dexMultiTokenInfoBean = (DexMultiTokenInfoBean) this.L$0;
        C56391yDq.AEQbTJ(obj);
        dexMultiTokenInfoBean2 = dexMultiTokenInfoBean4;
        advancedPlaceOrderVM2 = advancedPlaceOrderVM3;
        kQF kqf = advancedPlaceOrderVM2.hDKMBd;
        String str2 = (String) advancedPlaceOrderVM2.ejfBZ.getValue();
        String strEZpvd = advancedPlaceOrderVM2.DTwDnp.EZpvd();
        if (strEZpvd.length() == 0) {
            strEZpvd = "11";
        }
        this.L$0 = dexMultiTokenInfoBean;
        this.L$1 = advancedPlaceOrderVM2;
        this.L$2 = null;
        this.label = 2;
        if (kqf.copydefault(str2, dexMultiTokenInfoBean2, strEZpvd, this) == objCopydefault) {
            return objCopydefault;
        }
        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean;
        advancedPlaceOrderVM = advancedPlaceOrderVM2;
        value = dexMultiTokenInfoBean3;
        if (advancedPlaceOrderVM.DCJXGO.AEQbTJ(value)) {
        }
        this.this$0.dNCPSb.OLrzqt(this.this$0.accept);
        c28163kRf = this.this$0.dNCPSb;
        str = this.this$0.accept;
        chainId = value.getChainId();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        if (c28163kRf.OLrzqt(str, chainId, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
