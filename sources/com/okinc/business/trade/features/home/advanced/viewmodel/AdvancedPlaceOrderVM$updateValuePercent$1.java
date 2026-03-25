package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C23311hvo;
import o.C23313hvq;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C6961aZJ;
import o.InterfaceC30639leu;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$updateValuePercent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DefiChainInfo $chainInfo;
    final /* synthetic */ String $percent;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$updateValuePercent$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, DefiChainInfo defiChainInfo, String str, Continuation<? super AdvancedPlaceOrderVM$updateValuePercent$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
        this.$chainInfo = defiChainInfo;
        this.$percent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$updateValuePercent$1(this.this$0, this.$chainInfo, this.$percent, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$updateValuePercent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v42, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v46, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        T tMulCheckS$default;
        DexMultiTokenInfoBean value;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String value2 = this.this$0.gEmmrt().getValue();
            AdvancedQuoteUiData value3 = this.this$0.AuCTelauCTel().getValue();
            String strAuCTelauCTel = (value3 == null || (advancedQuoteAndCallDataKWHzl = value3.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl.AuCTelauCTel();
            DefiChainInfo defiChainInfo = this.$chainInfo;
            String reserveGas = defiChainInfo != null ? defiChainInfo.getReserveGas() : null;
            if (reserveGas == null || reserveGas.length() == 0) {
                reserveGas = "0.01";
            }
            String str = (strAuCTelauCTel == null || strAuCTelauCTel.length() == 0) ? reserveGas : strAuCTelauCTel;
            boolean zOLrzqt = C33129mqd.OLrzqt(this.$percent, C56443yFo.AEQbTJ(1.0d));
            DexMultiTokenInfoBean value4 = this.this$0.ejfBZ().getValue();
            String strGEmmrt = C33129mqd.gEmmrt(value4 != null ? value4.getDecimals() : null);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            if (C33129mqd.OLrzqt(this.$percent, C56443yFo.AEQbTJ(0))) {
                tMulCheckS$default = "";
            } else {
                tMulCheckS$default = zOLrzqt ? value2 : C23313hvq.mulCheckS$default(value2, this.$percent, null, null, null, 14, null);
            }
            objectRef.element = tMulCheckS$default;
            if (zOLrzqt && (value = this.this$0.ejfBZ().getValue()) != null) {
                if (value.isMainChainCoin()) {
                    objectRef.element = C23313hvq.OLrzqt(C23313hvq.subCheckS$default(value2, str, null, null, null, 14, null), C56443yFo.AEQbTJ(0)) ? C23313hvq.subCheckS$default(value2, str, null, null, null, 14, null) : "";
                    C6961aZJ c6961aZJ = this.this$0.copydefault;
                    DexMultiTokenInfoBean value5 = this.this$0.ejfBZ().getValue();
                    String tokenSymbol = value5 != null ? value5.getTokenSymbol() : null;
                    c6961aZJ.postValue(new InterfaceC30639leu.Dialog(str, tokenSymbol != null ? tokenSymbol : "", ((CharSequence) objectRef.element).length() > 0));
                }
            }
            String strOLrzqt = (String) objectRef.element;
            if (C33129mqd.OLrzqt((CharSequence) strOLrzqt) && C33129mqd.AhwBna(strOLrzqt, C56443yFo.AEQbTJ(0))) {
                strOLrzqt = C23311hvo.OLrzqt((String) objectRef.element, strGEmmrt);
            }
            this.this$0.AEQbTJ(strOLrzqt);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
