package com.okinc.business.invest_biz.data.usecase.generate_content;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC24182iXy;
import o.InterfaceC9738bbJ;
import o.iCG;
import o.iGQ;
import o.iXB;
import o.iXC;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestGenerateContentUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super InterfaceC24182iXy.Activity<iXC>>, Object> {
    final /* synthetic */ InitialInfoModel $initialInfo;
    final /* synthetic */ TransactionConfig $transactionConfig;
    final /* synthetic */ iXB $userInput;
    Object L$0;
    int label;
    final /* synthetic */ iGQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestGenerateContentUseCase$invoke$2(InitialInfoModel initialInfoModel, iGQ igq, iXB ixb, TransactionConfig transactionConfig, Continuation<? super InvestGenerateContentUseCase$invoke$2> continuation) {
        super(1, continuation);
        this.$initialInfo = initialInfoModel;
        this.this$0 = igq;
        this.$userInput = ixb;
        this.$transactionConfig = transactionConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InvestGenerateContentUseCase$invoke$2(this.$initialInfo, this.this$0, this.$userInput, this.$transactionConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InterfaceC24182iXy.Activity<iXC>> continuation) {
        return ((InvestGenerateContentUseCase$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae A[EDGE_INSN: B:47:0x00ae->B:35:0x00ae BREAK  A[LOOP:0: B:30:0x009a->B:48:?], SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        iXC ixcEZpvd;
        InterfaceC9738bbJ interfaceC9738bbJ;
        Object objM7386unboximpl;
        String strAEQbTJ;
        Iterator<T> it;
        TransactionStep transactionStep;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Object obj2 = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InitialInfoModel initialInfoModel = this.$initialInfo;
            if ((initialInfoModel instanceof InitialInfoModel.InvestInitialInfo ? (InitialInfoModel.InvestInitialInfo) initialInfoModel : null) != null) {
                iGQ igq = this.this$0;
                this.label = 1;
                objOLrzqt = igq.OLrzqt(this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                throw new IllegalArgumentException("OKWalletInvest: InitialInfo must be InvestSubscriptionInfo!");
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                interfaceC9738bbJ = interfaceC9738bbJ2;
                C56391yDq.AEQbTJ(objM7386unboximpl);
                InvestDetailsAndGasFee investDetailsAndGasFee = (InvestDetailsAndGasFee) objM7386unboximpl;
                InvestGasPriceConfig investGasPriceConfigGEmmrt = investDetailsAndGasFee.gEmmrt();
                strAEQbTJ = this.$userInput.AEQbTJ();
                iGQ igq2 = this.this$0;
                TransactionConfig transactionConfig = this.$transactionConfig;
                if (strAEQbTJ.length() == 0) {
                    strAEQbTJ = igq2.EZpvd(transactionConfig, investGasPriceConfigGEmmrt);
                }
                String str = strAEQbTJ;
                it = investDetailsAndGasFee.getFieldNames().iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((TransactionStep) next).fetchVPNInfo()) {
                        obj2 = next;
                        break;
                    }
                }
                transactionStep = (TransactionStep) obj2;
                iXC ixcAEQbTJ = this.this$0.EZpvd.AEQbTJ(this.$transactionConfig, (InitialInfoModel.InvestInitialInfo) this.$initialInfo, this.$userInput, investDetailsAndGasFee);
                List<TransactionStep> fieldNames = investDetailsAndGasFee.getFieldNames();
                if (transactionStep != null || (investTxModel = iCG.copydefault.EZpvd(transactionStep, interfaceC9738bbJ, this.$transactionConfig, (InitialInfoModel.InvestInitialInfo) this.$initialInfo, investDetailsAndGasFee, investGasPriceConfigGEmmrt, this.$userInput.EZpvd(), this.this$0.OLrzqt.EZpvd(C33129mqd.gEmmrt(C56443yFo.KWHzl(this.$transactionConfig.copydefault()))), str, (1792 & 256) != 0 ? null : null, (1792 & 512) != 0 ? null : null, (1792 & 1024) != 0 ? null : null)) == null) {
                    InvestTxModel investTxModel = new InvestTxModel(0, (String) null, (String) null, (List) null, (Long) null, 0L, (String) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -1, 65535, (DefaultConstructorMarker) null);
                }
                ixcEZpvd = ixcAEQbTJ.KWHzl((16777087 & 1) != 0 ? ixcAEQbTJ.AkhnZx : false, (16777087 & 2) != 0 ? ixcAEQbTJ.fetchVPNInfo : false, (16777087 & 4) != 0 ? ixcAEQbTJ.valueOf : null, (16777087 & 8) != 0 ? ixcAEQbTJ.values : 0L, (16777087 & 16) != 0 ? ixcAEQbTJ.djBIcL : 0, (16777087 & 32) != 0 ? ixcAEQbTJ.EZpvd : 0L, (16777087 & 64) != 0 ? ixcAEQbTJ.DbNXlk : 0, (16777087 & 128) != 0 ? ixcAEQbTJ.fARcdN : null, (16777087 & 256) != 0 ? ixcAEQbTJ.fIwbmz : null, (16777087 & 512) != 0 ? ixcAEQbTJ.KWHzl : null, (16777087 & 1024) != 0 ? ixcAEQbTJ.gEmmrt : null, (16777087 & 2048) != 0 ? ixcAEQbTJ.AYXKKw : null, (16777087 & 4096) != 0 ? ixcAEQbTJ.iwGUEr : null, (16777087 & 8192) != 0 ? ixcAEQbTJ.OLrzqt : null, (16777087 & 16384) != 0 ? ixcAEQbTJ.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixcAEQbTJ.getFieldNames : null, (16777087 & 65536) != 0 ? ixcAEQbTJ.ejfBZ : null, (16777087 & 131072) != 0 ? ixcAEQbTJ.isConnected : false, (16777087 & 262144) != 0 ? ixcAEQbTJ.uzCIH : fieldNames, (16777087 & 524288) != 0 ? ixcAEQbTJ.AhwBna : investGasPriceConfigGEmmrt, (16777087 & 1048576) != 0 ? ixcAEQbTJ.copydefault : investTxModel, (16777087 & 2097152) != 0 ? ixcAEQbTJ.AuCTel : null, (16777087 & 4194304) != 0 ? ixcAEQbTJ.fJNWhG : null, (16777087 & 8388608) != 0 ? ixcAEQbTJ.AEQbTJ : 0);
                return new InterfaceC24182iXy.Activity(ixcEZpvd);
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        InterfaceC9738bbJ interfaceC9738bbJ3 = (InterfaceC9738bbJ) objOLrzqt;
        iXB ixb = this.$userInput;
        if (ixb == null || !C33129mqd.AEQbTJ(ixb.EZpvd(), "0")) {
            ixcEZpvd = this.this$0.EZpvd.EZpvd(this.$transactionConfig, (InitialInfoModel.InvestInitialInfo) this.$initialInfo, this.$userInput);
            return new InterfaceC24182iXy.Activity(ixcEZpvd);
        }
        iGQ igq3 = this.this$0;
        InitialInfoModel.InvestInitialInfo investInitialInfo = (InitialInfoModel.InvestInitialInfo) this.$initialInfo;
        TransactionConfig transactionConfig2 = this.$transactionConfig;
        iXB ixb2 = this.$userInput;
        this.L$0 = interfaceC9738bbJ3;
        this.label = 2;
        Object objOLrzqt2 = igq3.OLrzqt(investInitialInfo, transactionConfig2, ixb2, this);
        if (objOLrzqt2 == objCopydefault) {
            return objCopydefault;
        }
        interfaceC9738bbJ = interfaceC9738bbJ3;
        objM7386unboximpl = objOLrzqt2;
        C56391yDq.AEQbTJ(objM7386unboximpl);
        InvestDetailsAndGasFee investDetailsAndGasFee2 = (InvestDetailsAndGasFee) objM7386unboximpl;
        InvestGasPriceConfig investGasPriceConfigGEmmrt2 = investDetailsAndGasFee2.gEmmrt();
        strAEQbTJ = this.$userInput.AEQbTJ();
        iGQ igq22 = this.this$0;
        TransactionConfig transactionConfig3 = this.$transactionConfig;
        if (strAEQbTJ.length() == 0) {
        }
        String str2 = strAEQbTJ;
        it = investDetailsAndGasFee2.getFieldNames().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        transactionStep = (TransactionStep) obj2;
        iXC ixcAEQbTJ2 = this.this$0.EZpvd.AEQbTJ(this.$transactionConfig, (InitialInfoModel.InvestInitialInfo) this.$initialInfo, this.$userInput, investDetailsAndGasFee2);
        List<TransactionStep> fieldNames2 = investDetailsAndGasFee2.getFieldNames();
        if (transactionStep != null) {
            InvestTxModel investTxModel2 = new InvestTxModel(0, (String) null, (String) null, (List) null, (Long) null, 0L, (String) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -1, 65535, (DefaultConstructorMarker) null);
            ixcEZpvd = ixcAEQbTJ2.KWHzl((16777087 & 1) != 0 ? ixcAEQbTJ2.AkhnZx : false, (16777087 & 2) != 0 ? ixcAEQbTJ2.fetchVPNInfo : false, (16777087 & 4) != 0 ? ixcAEQbTJ2.valueOf : null, (16777087 & 8) != 0 ? ixcAEQbTJ2.values : 0L, (16777087 & 16) != 0 ? ixcAEQbTJ2.djBIcL : 0, (16777087 & 32) != 0 ? ixcAEQbTJ2.EZpvd : 0L, (16777087 & 64) != 0 ? ixcAEQbTJ2.DbNXlk : 0, (16777087 & 128) != 0 ? ixcAEQbTJ2.fARcdN : null, (16777087 & 256) != 0 ? ixcAEQbTJ2.fIwbmz : null, (16777087 & 512) != 0 ? ixcAEQbTJ2.KWHzl : null, (16777087 & 1024) != 0 ? ixcAEQbTJ2.gEmmrt : null, (16777087 & 2048) != 0 ? ixcAEQbTJ2.AYXKKw : null, (16777087 & 4096) != 0 ? ixcAEQbTJ2.iwGUEr : null, (16777087 & 8192) != 0 ? ixcAEQbTJ2.OLrzqt : null, (16777087 & 16384) != 0 ? ixcAEQbTJ2.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixcAEQbTJ2.getFieldNames : null, (16777087 & 65536) != 0 ? ixcAEQbTJ2.ejfBZ : null, (16777087 & 131072) != 0 ? ixcAEQbTJ2.isConnected : false, (16777087 & 262144) != 0 ? ixcAEQbTJ2.uzCIH : fieldNames2, (16777087 & 524288) != 0 ? ixcAEQbTJ2.AhwBna : investGasPriceConfigGEmmrt2, (16777087 & 1048576) != 0 ? ixcAEQbTJ2.copydefault : investTxModel2, (16777087 & 2097152) != 0 ? ixcAEQbTJ2.AuCTel : null, (16777087 & 4194304) != 0 ? ixcAEQbTJ2.fJNWhG : null, (16777087 & 8388608) != 0 ? ixcAEQbTJ2.AEQbTJ : 0);
        }
        return new InterfaceC24182iXy.Activity(ixcEZpvd);
    }
}
