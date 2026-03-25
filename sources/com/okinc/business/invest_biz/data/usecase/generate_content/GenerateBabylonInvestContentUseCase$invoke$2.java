package com.okinc.business.invest_biz.data.usecase.generate_content;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.bean.request.ValidatorRequestParam;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C27164jpy;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC24182iXy;
import o.InterfaceC9738bbJ;
import o.iCG;
import o.iDH;
import o.iGD;
import o.iXB;
import o.iXC;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class GenerateBabylonInvestContentUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super InterfaceC24182iXy.Activity<iXC>>, Object> {
    final /* synthetic */ InitialInfoModel $initialInfo;
    final /* synthetic */ TransactionConfig $transactionConfig;
    final /* synthetic */ iXB $userInput;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ iGD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBabylonInvestContentUseCase$invoke$2(InitialInfoModel initialInfoModel, iGD igd, TransactionConfig transactionConfig, iXB ixb, Continuation<? super GenerateBabylonInvestContentUseCase$invoke$2> continuation) {
        super(1, continuation);
        this.$initialInfo = initialInfoModel;
        this.this$0 = igd;
        this.$transactionConfig = transactionConfig;
        this.$userInput = ixb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new GenerateBabylonInvestContentUseCase$invoke$2(this.$initialInfo, this.this$0, this.$transactionConfig, this.$userInput, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InterfaceC24182iXy.Activity<iXC>> continuation) {
        return ((GenerateBabylonInvestContentUseCase$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v17, resolved type: java.lang.Integer */
    /* JADX DEBUG: Multi-variable search result rejected for r10v6, resolved type: java.lang.Integer */
    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: java.lang.Integer */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InitialInfoModel.InvestInitialInfo investInitialInfo;
        InitialInfoModel.InvestInitialInfo investInitialInfo2;
        Object objOLrzqt;
        Object objEZpvd;
        InitialInfoModel.InvestInitialInfo investInitialInfo3;
        iGD igd;
        List listAhwBna;
        List list;
        InvestValidatorListItems investValidatorListItems;
        InitialInfoModel.InvestInitialInfo investInitialInfoAEQbTJ;
        iXC ixcOLrzqt;
        String str;
        Object objOLrzqt2;
        Object next;
        String strAEQbTJ;
        iXC ixcEZpvd;
        List<TransactionStep> listAhwBna2;
        InvestGasPriceConfig investGasPriceConfigGEmmrt;
        Iterator<T> it;
        Object next2;
        TransactionStep transactionStep;
        long j;
        long j2;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        iCG icg;
        Object objOLrzqt3;
        Object obj2;
        InvestDetailsAndGasFee investDetailsAndGasFee;
        String str2;
        iXC ixc;
        List<TransactionStep> list2;
        int i3;
        int i4;
        long j3;
        long j4;
        int i5;
        InvestGasPriceConfig investGasPriceConfig;
        int i6;
        InitialInfoModel.InvestInitialInfo investInitialInfo4;
        int i7;
        InvestDetailsAndGasFee investDetailsAndGasFee2;
        int i8;
        int i9;
        Object objAEQbTJ;
        Object obj3;
        InterfaceC9738bbJ interfaceC9738bbJ;
        String str3;
        iCG icg2;
        TransactionStep transactionStep2;
        TransactionConfig transactionConfig;
        int i10;
        String str4;
        String str5;
        int i11;
        InvestGasPriceConfig investGasPriceConfig2;
        long j5;
        InitialInfoModel.InvestInitialInfo investInitialInfo5;
        InvestDetailsAndGasFee investDetailsAndGasFee3;
        int i12;
        long j6;
        int i13;
        InvestTxModel investTxModel;
        iXC ixc2;
        List<TransactionStep> list3;
        InvestGasPriceConfig investGasPriceConfig3;
        long j7;
        boolean z4;
        boolean z5;
        InvestValidatorListItems investValidatorListItemsAYXKKw;
        InvestTxModel investTxModelEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i14 = this.label;
        if (i14 == 0) {
            C56391yDq.AEQbTJ(obj);
            InitialInfoModel initialInfoModel = this.$initialInfo;
            investInitialInfo = initialInfoModel instanceof InitialInfoModel.InvestInitialInfo ? (InitialInfoModel.InvestInitialInfo) initialInfoModel : null;
            if (investInitialInfo != null) {
                if (this.this$0.djBIcL == null) {
                    iGD igd2 = this.this$0;
                    this.L$0 = investInitialInfo;
                    this.label = 1;
                    objOLrzqt = igd2.OLrzqt((Continuation<? super InterfaceC9738bbJ>) this);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    investInitialInfo2 = investInitialInfo;
                    listAhwBna = this.this$0.djBIcL;
                    if (listAhwBna == null) {
                    }
                    List list4 = listAhwBna;
                    list = this.this$0.djBIcL;
                    if (list != null) {
                    }
                    return new InterfaceC24182iXy.Activity(ixcOLrzqt);
                }
            } else {
                throw new IllegalArgumentException("Initial Info must be InvestSubscriptionInfo");
            }
        } else if (i14 == 1) {
            investInitialInfo = (InitialInfoModel.InvestInitialInfo) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        } else {
            if (i14 == 2) {
                igd = (iGD) this.L$1;
                investInitialInfo3 = (InitialInfoModel.InvestInitialInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objEZpvd)) {
                    objEZpvd = null;
                }
                igd.djBIcL = (List) objEZpvd;
                investInitialInfo2 = investInitialInfo3;
                listAhwBna = this.this$0.djBIcL;
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                List list42 = listAhwBna;
                list = this.this$0.djBIcL;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (((InvestValidatorListItems) next).getRecommended()) {
                            break;
                        }
                    }
                    InvestValidatorListItems investValidatorListItems2 = (InvestValidatorListItems) next;
                    if (investValidatorListItems2 == null) {
                        List list5 = this.this$0.djBIcL;
                        investValidatorListItems = list5 != null ? (InvestValidatorListItems) CollectionsKt___CollectionsKt.firstOrNull(list5) : null;
                    } else {
                        investValidatorListItems = investValidatorListItems2;
                    }
                    investInitialInfoAEQbTJ = investInitialInfo2.AEQbTJ((1744830463 & 1) != 0 ? investInitialInfo2.chainId : 0L, (1744830463 & 2) != 0 ? investInitialInfo2.investType : null, (1744830463 & 4) != 0 ? investInitialInfo2.investmentId : 0L, (1744830463 & 8) != 0 ? investInitialInfo2.investmentName : null, (1744830463 & 16) != 0 ? investInitialInfo2.analysisPlatformId : 0L, (1744830463 & 32) != 0 ? investInitialInfo2.isSupportSwap : false, (1744830463 & 64) != 0 ? investInitialInfo2.network : null, (1744830463 & 128) != 0 ? investInitialInfo2.networkLogo : null, (1744830463 & 256) != 0 ? investInitialInfo2.platformLogo : null, (1744830463 & 512) != 0 ? investInitialInfo2.platformName : null, (1744830463 & 1024) != 0 ? investInitialInfo2.rateDesc : null, (1744830463 & 2048) != 0 ? investInitialInfo2.gainsTokenList : null, (1744830463 & 4096) != 0 ? investInitialInfo2.investWithTokenList : null, (1744830463 & 8192) != 0 ? investInitialInfo2.receiveTokenInfo : null, (1744830463 & 16384) != 0 ? investInitialInfo2.reserveFee : null, (1744830463 & 32768) != 0 ? investInitialInfo2.sourceInvestmentId : 0L, (1744830463 & 65536) != 0 ? investInitialInfo2.swapToTokenList : null, (131072 & 1744830463) != 0 ? investInitialInfo2.subscriptionMethod : null, (1744830463 & 262144) != 0 ? investInitialInfo2.isLp : false, (1744830463 & 524288) != 0 ? investInitialInfo2.lockRedeemTip : null, (1744830463 & 1048576) != 0 ? investInitialInfo2.promptInformation : null, (1744830463 & 2097152) != 0 ? investInitialInfo2.inputPrecision : 0, (1744830463 & 4194304) != 0 ? investInitialInfo2.isSingleValidator : false, (1744830463 & 8388608) != 0 ? investInitialInfo2.validatorName : null, (1744830463 & 16777216) != 0 ? investInitialInfo2.mode : 0, (1744830463 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investInitialInfo2.collateralRatioInfo : null, (1744830463 & 67108864) != 0 ? investInitialInfo2.btcMode : null, (1744830463 & 134217728) != 0 ? investInitialInfo2.validatorList : list42, (1744830463 & 268435456) != 0 ? investInitialInfo2.selectedValidator : investValidatorListItems, (1744830463 & 536870912) != 0 ? investInitialInfo2.pointsList : null, (1744830463 & 1073741824) != 0 ? investInitialInfo2.tvl : null);
                    iXB ixb = this.$userInput;
                    if (ixb == null || !C33129mqd.AEQbTJ(ixb.EZpvd(), "0")) {
                        ixcOLrzqt = this.this$0.KWHzl.OLrzqt(this.$transactionConfig, investInitialInfoAEQbTJ, this.$userInput);
                    } else {
                        iGD igd3 = this.this$0;
                        TransactionConfig transactionConfig2 = this.$transactionConfig;
                        iXB ixb2 = this.$userInput;
                        this.L$0 = investInitialInfoAEQbTJ;
                        str = null;
                        this.L$1 = null;
                        this.label = 3;
                        objOLrzqt2 = igd3.OLrzqt(transactionConfig2, investInitialInfoAEQbTJ, ixb2, this);
                        if (objOLrzqt2 == objCopydefault) {
                            return objCopydefault;
                        }
                        C56391yDq.AEQbTJ(objOLrzqt2);
                        InvestDetailsAndGasFee investDetailsAndGasFee4 = (InvestDetailsAndGasFee) objOLrzqt2;
                        strAEQbTJ = this.$userInput.AEQbTJ();
                        iGD igd4 = this.this$0;
                        TransactionConfig transactionConfig3 = this.$transactionConfig;
                        if (strAEQbTJ.length() == 0) {
                        }
                        ixcEZpvd = this.this$0.KWHzl.EZpvd(this.$transactionConfig, investInitialInfoAEQbTJ, this.$userInput, investDetailsAndGasFee4);
                        if (!this.$userInput.values()) {
                        }
                        investGasPriceConfigGEmmrt = investDetailsAndGasFee4.gEmmrt();
                        it = investDetailsAndGasFee4.getFieldNames().iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        transactionStep = (TransactionStep) next2;
                        if (transactionStep == null) {
                        }
                    }
                }
                return new InterfaceC24182iXy.Activity(ixcOLrzqt);
            }
            if (i14 != 3) {
                if (i14 != 4) {
                    if (i14 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i15 = this.I$4;
                    int i16 = this.I$3;
                    long j8 = this.J$1;
                    int i17 = this.I$2;
                    j2 = this.J$0;
                    int i18 = this.I$1;
                    i10 = this.I$0;
                    String str6 = (String) this.L$14;
                    String str7 = (String) this.L$13;
                    String str8 = (String) this.L$12;
                    InvestGasPriceConfig investGasPriceConfig4 = (InvestGasPriceConfig) this.L$11;
                    InvestDetailsAndGasFee investDetailsAndGasFee5 = (InvestDetailsAndGasFee) this.L$10;
                    InitialInfoModel.InvestInitialInfo investInitialInfo6 = (InitialInfoModel.InvestInitialInfo) this.L$9;
                    TransactionConfig transactionConfig4 = (TransactionConfig) this.L$8;
                    interfaceC9738bbJ = (InterfaceC9738bbJ) this.L$7;
                    TransactionStep transactionStep3 = (TransactionStep) this.L$6;
                    iCG icg3 = (iCG) this.L$5;
                    InvestGasPriceConfig investGasPriceConfig5 = (InvestGasPriceConfig) this.L$4;
                    List<TransactionStep> list6 = (List) this.L$3;
                    iXC ixc3 = (iXC) this.L$2;
                    InvestDetailsAndGasFee investDetailsAndGasFee6 = (InvestDetailsAndGasFee) this.L$1;
                    InitialInfoModel.InvestInitialInfo investInitialInfo7 = (InitialInfoModel.InvestInitialInfo) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    i8 = i18;
                    str4 = str6;
                    objAEQbTJ = obj;
                    investInitialInfo4 = investInitialInfo7;
                    i2 = i16;
                    i9 = i15;
                    icg2 = icg3;
                    ixc = ixc3;
                    investInitialInfo5 = investInitialInfo6;
                    str3 = str8;
                    list2 = list6;
                    i11 = i17;
                    investGasPriceConfig2 = investGasPriceConfig4;
                    investDetailsAndGasFee2 = investDetailsAndGasFee6;
                    j5 = j8;
                    str5 = str7;
                    investGasPriceConfig = investGasPriceConfig5;
                    investDetailsAndGasFee3 = investDetailsAndGasFee5;
                    transactionConfig = transactionConfig4;
                    transactionStep2 = transactionStep3;
                    z = i10 == 0;
                    z2 = i8 == 0;
                    z3 = i9 == 0;
                    String str9 = (String) objAEQbTJ;
                    investValidatorListItemsAYXKKw = this.$userInput.AYXKKw();
                    if (investValidatorListItemsAYXKKw == null) {
                        investValidatorListItemsAYXKKw = investInitialInfo4.getFieldNames();
                    }
                    String providerPubkey = investValidatorListItemsAYXKKw == null ? investValidatorListItemsAYXKKw.getProviderPubkey() : null;
                    InvestNetworkFeeItem investNetworkFeeItemValueOf = this.$userInput.valueOf();
                    String gasPrice = investNetworkFeeItemValueOf == null ? investNetworkFeeItemValueOf.getGasPrice() : null;
                    investTxModelEZpvd = icg2.EZpvd(transactionStep2, interfaceC9738bbJ, transactionConfig, investInitialInfo5, investDetailsAndGasFee3, investGasPriceConfig2, str3, str5, str4, str9, providerPubkey, (gasPrice != null || gasPrice.length() == 0) ? investDetailsAndGasFee2.gEmmrt().getAverageGear().getGasPrice() : gasPrice);
                    if (investTxModelEZpvd == null) {
                        investTxModel = investTxModelEZpvd;
                        ixc2 = ixc;
                        i13 = i2;
                        j6 = j5;
                        i12 = i11;
                        j7 = j2;
                        z4 = z;
                        z5 = z2;
                        investGasPriceConfig3 = investGasPriceConfig;
                        list3 = list2;
                        ixcOLrzqt = ixc2.KWHzl((16777087 & 1) != 0 ? ixc2.AkhnZx : z4, (16777087 & 2) != 0 ? ixc2.fetchVPNInfo : z5, (16777087 & 4) != 0 ? ixc2.valueOf : null, (16777087 & 8) != 0 ? ixc2.values : j7, (16777087 & 16) != 0 ? ixc2.djBIcL : i12, (16777087 & 32) != 0 ? ixc2.EZpvd : j6, (16777087 & 64) != 0 ? ixc2.DbNXlk : i13, (16777087 & 128) != 0 ? ixc2.fARcdN : null, (16777087 & 256) != 0 ? ixc2.fIwbmz : null, (16777087 & 512) != 0 ? ixc2.KWHzl : null, (16777087 & 1024) != 0 ? ixc2.gEmmrt : null, (16777087 & 2048) != 0 ? ixc2.AYXKKw : null, (16777087 & 4096) != 0 ? ixc2.iwGUEr : null, (16777087 & 8192) != 0 ? ixc2.OLrzqt : null, (16777087 & 16384) != 0 ? ixc2.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixc2.getFieldNames : null, (16777087 & 65536) != 0 ? ixc2.ejfBZ : null, (16777087 & 131072) != 0 ? ixc2.isConnected : z3, (16777087 & 262144) != 0 ? ixc2.uzCIH : list3, (16777087 & 524288) != 0 ? ixc2.AhwBna : investGasPriceConfig3, (16777087 & 1048576) != 0 ? ixc2.copydefault : investTxModel, (16777087 & 2097152) != 0 ? ixc2.AuCTel : null, (16777087 & 4194304) != 0 ? ixc2.fJNWhG : null, (16777087 & 8388608) != 0 ? ixc2.AEQbTJ : 0);
                        return new InterfaceC24182iXy.Activity(ixcOLrzqt);
                    }
                    i = i11;
                    investGasPriceConfigGEmmrt = investGasPriceConfig;
                    listAhwBna2 = list2;
                    ixcEZpvd = ixc;
                    j = j5;
                    i12 = i;
                    j6 = j;
                    i13 = i2;
                    investTxModel = new InvestTxModel(0, (String) null, (String) null, (List) null, (Long) null, 0L, (String) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -1, 65535, (DefaultConstructorMarker) null);
                    ixc2 = ixcEZpvd;
                    list3 = listAhwBna2;
                    investGasPriceConfig3 = investGasPriceConfigGEmmrt;
                    j7 = j2;
                    z4 = z;
                    z5 = z2;
                    ixcOLrzqt = ixc2.KWHzl((16777087 & 1) != 0 ? ixc2.AkhnZx : z4, (16777087 & 2) != 0 ? ixc2.fetchVPNInfo : z5, (16777087 & 4) != 0 ? ixc2.valueOf : null, (16777087 & 8) != 0 ? ixc2.values : j7, (16777087 & 16) != 0 ? ixc2.djBIcL : i12, (16777087 & 32) != 0 ? ixc2.EZpvd : j6, (16777087 & 64) != 0 ? ixc2.DbNXlk : i13, (16777087 & 128) != 0 ? ixc2.fARcdN : null, (16777087 & 256) != 0 ? ixc2.fIwbmz : null, (16777087 & 512) != 0 ? ixc2.KWHzl : null, (16777087 & 1024) != 0 ? ixc2.gEmmrt : null, (16777087 & 2048) != 0 ? ixc2.AYXKKw : null, (16777087 & 4096) != 0 ? ixc2.iwGUEr : null, (16777087 & 8192) != 0 ? ixc2.OLrzqt : null, (16777087 & 16384) != 0 ? ixc2.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixc2.getFieldNames : null, (16777087 & 65536) != 0 ? ixc2.ejfBZ : null, (16777087 & 131072) != 0 ? ixc2.isConnected : z3, (16777087 & 262144) != 0 ? ixc2.uzCIH : list3, (16777087 & 524288) != 0 ? ixc2.AhwBna : investGasPriceConfig3, (16777087 & 1048576) != 0 ? ixc2.copydefault : investTxModel, (16777087 & 2097152) != 0 ? ixc2.AuCTel : null, (16777087 & 4194304) != 0 ? ixc2.fJNWhG : null, (16777087 & 8388608) != 0 ? ixc2.AEQbTJ : 0);
                    return new InterfaceC24182iXy.Activity(ixcOLrzqt);
                }
                int i19 = this.I$4;
                int i20 = this.I$3;
                long j9 = this.J$1;
                int i21 = this.I$2;
                long j10 = this.J$0;
                int i22 = this.I$1;
                int i23 = this.I$0;
                TransactionStep transactionStep4 = (TransactionStep) this.L$7;
                iCG icg4 = (iCG) this.L$6;
                investGasPriceConfig = (InvestGasPriceConfig) this.L$5;
                list2 = (List) this.L$4;
                ixc = (iXC) this.L$3;
                String str10 = (String) this.L$2;
                InvestDetailsAndGasFee investDetailsAndGasFee7 = (InvestDetailsAndGasFee) this.L$1;
                InitialInfoModel.InvestInitialInfo investInitialInfo8 = (InitialInfoModel.InvestInitialInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                j4 = j10;
                investInitialInfo4 = investInitialInfo8;
                i6 = i21;
                i7 = i19;
                obj2 = objCopydefault;
                j3 = j9;
                str2 = str10;
                i3 = i20;
                objOLrzqt3 = obj;
                investDetailsAndGasFee = investDetailsAndGasFee7;
                i5 = i22;
                icg = icg4;
                i4 = i23;
                transactionStep = transactionStep4;
                InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) objOLrzqt3;
                int i24 = i7;
                TransactionConfig transactionConfig5 = this.$transactionConfig;
                int i25 = i3;
                InvestGasPriceConfig investGasPriceConfigGEmmrt2 = investDetailsAndGasFee.gEmmrt();
                long j11 = j3;
                String strEZpvd = this.$userInput.EZpvd();
                int i26 = i6;
                String strEZpvd2 = this.this$0.AEQbTJ.EZpvd(C33129mqd.gEmmrt(C56443yFo.KWHzl(this.$transactionConfig.copydefault())));
                iGD igd5 = this.this$0;
                int i27 = i4;
                int i28 = i5;
                long jCopydefault = this.$transactionConfig.copydefault();
                this.L$0 = investInitialInfo4;
                investDetailsAndGasFee2 = investDetailsAndGasFee;
                this.L$1 = investDetailsAndGasFee2;
                this.L$2 = ixc;
                this.L$3 = list2;
                this.L$4 = investGasPriceConfig;
                this.L$5 = icg;
                this.L$6 = transactionStep;
                this.L$7 = interfaceC9738bbJ2;
                this.L$8 = transactionConfig5;
                this.L$9 = investInitialInfo4;
                this.L$10 = investDetailsAndGasFee2;
                this.L$11 = investGasPriceConfigGEmmrt2;
                this.L$12 = strEZpvd;
                this.L$13 = strEZpvd2;
                this.L$14 = str2;
                String str11 = str2;
                this.I$0 = i27;
                this.I$1 = i28;
                i8 = i28;
                long j12 = j4;
                this.J$0 = j12;
                this.I$2 = i26;
                this.J$1 = j11;
                this.I$3 = i25;
                i9 = i24;
                this.I$4 = i9;
                this.label = 5;
                objAEQbTJ = igd5.AEQbTJ(jCopydefault, (Continuation<? super String>) this);
                obj3 = obj2;
                if (objAEQbTJ != obj3) {
                    return obj3;
                }
                interfaceC9738bbJ = interfaceC9738bbJ2;
                str3 = strEZpvd;
                icg2 = icg;
                transactionStep2 = transactionStep;
                i2 = i25;
                transactionConfig = transactionConfig5;
                i10 = i27;
                str4 = str11;
                j2 = j12;
                str5 = strEZpvd2;
                i11 = i26;
                investGasPriceConfig2 = investGasPriceConfigGEmmrt2;
                j5 = j11;
                investInitialInfo5 = investInitialInfo4;
                investDetailsAndGasFee3 = investDetailsAndGasFee2;
                if (i10 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                String str92 = (String) objAEQbTJ;
                investValidatorListItemsAYXKKw = this.$userInput.AYXKKw();
                if (investValidatorListItemsAYXKKw == null) {
                }
                if (investValidatorListItemsAYXKKw == null) {
                }
                InvestNetworkFeeItem investNetworkFeeItemValueOf2 = this.$userInput.valueOf();
                if (investNetworkFeeItemValueOf2 == null) {
                }
                if (gasPrice != null) {
                    investTxModelEZpvd = icg2.EZpvd(transactionStep2, interfaceC9738bbJ, transactionConfig, investInitialInfo5, investDetailsAndGasFee3, investGasPriceConfig2, str3, str5, str4, str92, providerPubkey, (gasPrice != null || gasPrice.length() == 0) ? investDetailsAndGasFee2.gEmmrt().getAverageGear().getGasPrice() : gasPrice);
                    if (investTxModelEZpvd == null) {
                    }
                }
                return new InterfaceC24182iXy.Activity(ixcOLrzqt);
            }
            investInitialInfoAEQbTJ = (InitialInfoModel.InvestInitialInfo) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt2 = ((Result) obj).m7386unboximpl();
            str = null;
            C56391yDq.AEQbTJ(objOLrzqt2);
            InvestDetailsAndGasFee investDetailsAndGasFee42 = (InvestDetailsAndGasFee) objOLrzqt2;
            strAEQbTJ = this.$userInput.AEQbTJ();
            iGD igd42 = this.this$0;
            TransactionConfig transactionConfig32 = this.$transactionConfig;
            if (strAEQbTJ.length() == 0) {
                C27164jpy c27164jpy = igd42.AEQbTJ;
                String strAYXKKw = C33129mqd.AYXKKw(C56443yFo.KWHzl(transactionConfig32.copydefault()));
                InvestSlippageConfig investSlippage = investDetailsAndGasFee42.gEmmrt().getInvestSlippage();
                String automaticValue = investSlippage != null ? investSlippage.getAutomaticValue() : str;
                InvestSlippageConfig investSlippage2 = investDetailsAndGasFee42.gEmmrt().getInvestSlippage();
                String customMax = investSlippage2 != null ? investSlippage2.getCustomMax() : str;
                InvestSlippageConfig investSlippage3 = investDetailsAndGasFee42.gEmmrt().getInvestSlippage();
                strAEQbTJ = c27164jpy.AEQbTJ(strAYXKKw, automaticValue, customMax, investSlippage3 != null ? C56443yFo.AEQbTJ(investSlippage3.getType()) : str).getFirst();
            }
            ixcEZpvd = this.this$0.KWHzl.EZpvd(this.$transactionConfig, investInitialInfoAEQbTJ, this.$userInput, investDetailsAndGasFee42);
            listAhwBna2 = !this.$userInput.values() ? yDY.AhwBna() : investDetailsAndGasFee42.getFieldNames();
            investGasPriceConfigGEmmrt = investDetailsAndGasFee42.gEmmrt();
            it = investDetailsAndGasFee42.getFieldNames().iterator();
            while (true) {
                if (it.hasNext()) {
                    next2 = str;
                    break;
                }
                next2 = it.next();
                if (((TransactionStep) next2).fetchVPNInfo()) {
                    break;
                }
            }
            transactionStep = (TransactionStep) next2;
            if (transactionStep == null) {
                icg = iCG.copydefault;
                iGD igd6 = this.this$0;
                this.L$0 = investInitialInfoAEQbTJ;
                this.L$1 = investDetailsAndGasFee42;
                this.L$2 = strAEQbTJ;
                this.L$3 = ixcEZpvd;
                this.L$4 = listAhwBna2;
                this.L$5 = investGasPriceConfigGEmmrt;
                this.L$6 = icg;
                this.L$7 = transactionStep;
                this.I$0 = 0;
                this.I$1 = 0;
                this.J$0 = 0L;
                this.I$2 = 0;
                this.J$1 = 0L;
                this.I$3 = 0;
                this.I$4 = 0;
                this.label = 4;
                objOLrzqt3 = igd6.OLrzqt((Continuation<? super InterfaceC9738bbJ>) this);
                if (objOLrzqt3 == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objCopydefault;
                investDetailsAndGasFee = investDetailsAndGasFee42;
                str2 = strAEQbTJ;
                ixc = ixcEZpvd;
                list2 = listAhwBna2;
                i3 = 0;
                i4 = 0;
                j3 = 0;
                j4 = 0;
                i5 = 0;
                investGasPriceConfig = investGasPriceConfigGEmmrt;
                i6 = 0;
                investInitialInfo4 = investInitialInfoAEQbTJ;
                i7 = 0;
                InterfaceC9738bbJ interfaceC9738bbJ22 = (InterfaceC9738bbJ) objOLrzqt3;
                int i242 = i7;
                TransactionConfig transactionConfig52 = this.$transactionConfig;
                int i252 = i3;
                InvestGasPriceConfig investGasPriceConfigGEmmrt22 = investDetailsAndGasFee.gEmmrt();
                long j112 = j3;
                String strEZpvd3 = this.$userInput.EZpvd();
                int i262 = i6;
                String strEZpvd22 = this.this$0.AEQbTJ.EZpvd(C33129mqd.gEmmrt(C56443yFo.KWHzl(this.$transactionConfig.copydefault())));
                iGD igd52 = this.this$0;
                int i272 = i4;
                int i282 = i5;
                long jCopydefault2 = this.$transactionConfig.copydefault();
                this.L$0 = investInitialInfo4;
                investDetailsAndGasFee2 = investDetailsAndGasFee;
                this.L$1 = investDetailsAndGasFee2;
                this.L$2 = ixc;
                this.L$3 = list2;
                this.L$4 = investGasPriceConfig;
                this.L$5 = icg;
                this.L$6 = transactionStep;
                this.L$7 = interfaceC9738bbJ22;
                this.L$8 = transactionConfig52;
                this.L$9 = investInitialInfo4;
                this.L$10 = investDetailsAndGasFee2;
                this.L$11 = investGasPriceConfigGEmmrt22;
                this.L$12 = strEZpvd3;
                this.L$13 = strEZpvd22;
                this.L$14 = str2;
                String str112 = str2;
                this.I$0 = i272;
                this.I$1 = i282;
                i8 = i282;
                long j122 = j4;
                this.J$0 = j122;
                this.I$2 = i262;
                this.J$1 = j112;
                this.I$3 = i252;
                i9 = i242;
                this.I$4 = i9;
                this.label = 5;
                objAEQbTJ = igd52.AEQbTJ(jCopydefault2, (Continuation<? super String>) this);
                obj3 = obj2;
                if (objAEQbTJ != obj3) {
                }
            } else {
                j = 0;
                j2 = 0;
                i = 0;
                i2 = 0;
                z = false;
                z2 = false;
                z3 = false;
                i12 = i;
                j6 = j;
                i13 = i2;
                investTxModel = new InvestTxModel(0, (String) null, (String) null, (List) null, (Long) null, 0L, (String) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -1, 65535, (DefaultConstructorMarker) null);
                ixc2 = ixcEZpvd;
                list3 = listAhwBna2;
                investGasPriceConfig3 = investGasPriceConfigGEmmrt;
                j7 = j2;
                z4 = z;
                z5 = z2;
                ixcOLrzqt = ixc2.KWHzl((16777087 & 1) != 0 ? ixc2.AkhnZx : z4, (16777087 & 2) != 0 ? ixc2.fetchVPNInfo : z5, (16777087 & 4) != 0 ? ixc2.valueOf : null, (16777087 & 8) != 0 ? ixc2.values : j7, (16777087 & 16) != 0 ? ixc2.djBIcL : i12, (16777087 & 32) != 0 ? ixc2.EZpvd : j6, (16777087 & 64) != 0 ? ixc2.DbNXlk : i13, (16777087 & 128) != 0 ? ixc2.fARcdN : null, (16777087 & 256) != 0 ? ixc2.fIwbmz : null, (16777087 & 512) != 0 ? ixc2.KWHzl : null, (16777087 & 1024) != 0 ? ixc2.gEmmrt : null, (16777087 & 2048) != 0 ? ixc2.AYXKKw : null, (16777087 & 4096) != 0 ? ixc2.iwGUEr : null, (16777087 & 8192) != 0 ? ixc2.OLrzqt : null, (16777087 & 16384) != 0 ? ixc2.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixc2.getFieldNames : null, (16777087 & 65536) != 0 ? ixc2.ejfBZ : null, (16777087 & 131072) != 0 ? ixc2.isConnected : z3, (16777087 & 262144) != 0 ? ixc2.uzCIH : list3, (16777087 & 524288) != 0 ? ixc2.AhwBna : investGasPriceConfig3, (16777087 & 1048576) != 0 ? ixc2.copydefault : investTxModel, (16777087 & 2097152) != 0 ? ixc2.AuCTel : null, (16777087 & 4194304) != 0 ? ixc2.fJNWhG : null, (16777087 & 8388608) != 0 ? ixc2.AEQbTJ : 0);
                return new InterfaceC24182iXy.Activity(ixcOLrzqt);
            }
        }
        InterfaceC9738bbJ interfaceC9738bbJ3 = (InterfaceC9738bbJ) objOLrzqt;
        String strEZpvd4 = interfaceC9738bbJ3 != null ? interfaceC9738bbJ3.EZpvd(this.$transactionConfig.copydefault()) : null;
        if (strEZpvd4 == null) {
            strEZpvd4 = "";
        }
        iGD igd7 = this.this$0;
        iDH idh = igd7.AhwBna;
        ValidatorRequestParam validatorRequestParam = new ValidatorRequestParam(investInitialInfo.gEmmrt(), 1, strEZpvd4);
        this.L$0 = investInitialInfo;
        this.L$1 = igd7;
        this.label = 2;
        objEZpvd = idh.EZpvd(validatorRequestParam, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        investInitialInfo3 = investInitialInfo;
        igd = igd7;
        if (Result.m7383isFailureimpl(objEZpvd)) {
        }
        igd.djBIcL = (List) objEZpvd;
        investInitialInfo2 = investInitialInfo3;
        listAhwBna = this.this$0.djBIcL;
        if (listAhwBna == null) {
        }
        List list422 = listAhwBna;
        list = this.this$0.djBIcL;
        if (list != null) {
        }
        return new InterfaceC24182iXy.Activity(ixcOLrzqt);
    }
}
