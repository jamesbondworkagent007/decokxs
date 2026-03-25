package com.okinc.business.invest_biz.data.usecase.generate_content;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem;
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
import o.iGG;
import o.iXB;
import o.iXC;

/* JADX INFO: loaded from: classes6.dex */
public final class GenerateBabylonRedeemContentUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super InterfaceC24182iXy.Activity<iXC>>, Object> {
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
    final /* synthetic */ iGG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBabylonRedeemContentUseCase$invoke$2(InitialInfoModel initialInfoModel, TransactionConfig transactionConfig, iGG igg, iXB ixb, Continuation<? super GenerateBabylonRedeemContentUseCase$invoke$2> continuation) {
        super(1, continuation);
        this.$initialInfo = initialInfoModel;
        this.$transactionConfig = transactionConfig;
        this.this$0 = igg;
        this.$userInput = ixb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new GenerateBabylonRedeemContentUseCase$invoke$2(this.$initialInfo, this.$transactionConfig, this.this$0, this.$userInput, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InterfaceC24182iXy.Activity<iXC>> continuation) {
        return ((GenerateBabylonRedeemContentUseCase$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0281 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0303  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InitialInfoModel.RedeemInitialInfo redeemInitialInfo;
        InvestOrder investOrderAhwBna;
        Object objOLrzqt;
        iXC ixcKWHzl;
        List<TransactionStep> newProxyInstance;
        InvestGasPriceConfig investGasPriceConfigValueOf;
        Object next;
        TransactionStep transactionStep;
        long j;
        InvestGasPriceConfig investGasPriceConfig;
        long j2;
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        iCG icg;
        int i3;
        Object objOLrzqt2;
        iXB ixb;
        List<TransactionStep> list;
        long j3;
        int i4;
        int i5;
        int i6;
        RedeemDetailsAndGasFee redeemDetailsAndGasFee;
        int i7;
        int i8;
        iXB ixb2;
        int i9;
        Object objAEQbTJ;
        InterfaceC9738bbJ interfaceC9738bbJ;
        iXB ixb3;
        iCG icg2;
        TransactionStep transactionStep2;
        String str;
        TransactionConfig transactionConfig;
        InitialInfoModel.RedeemInitialInfo redeemInitialInfo2;
        RedeemDetailsAndGasFee redeemDetailsAndGasFee2;
        String str2;
        InvestGasPriceConfig investGasPriceConfig2;
        int i10;
        InvestGasPriceConfig investGasPriceConfig3;
        InvestTxModel investTxModel;
        iXC ixc;
        int i11;
        List<TransactionStep> list2;
        boolean z4;
        long j4;
        long j5;
        boolean z5;
        int i12;
        InvestTxModel investTxModelKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i13 = this.label;
        if (i13 == 0) {
            C56391yDq.AEQbTJ(obj);
            InitialInfoModel initialInfoModel = this.$initialInfo;
            redeemInitialInfo = initialInfoModel instanceof InitialInfoModel.RedeemInitialInfo ? (InitialInfoModel.RedeemInitialInfo) initialInfoModel : null;
            if (redeemInitialInfo == null) {
                throw new IllegalArgumentException("InitialInfo must be RedeemInitial Info");
            }
            investOrderAhwBna = this.$transactionConfig.AhwBna();
            if (investOrderAhwBna == null) {
                throw new IllegalArgumentException("Selected Order must not be empty");
            }
            iGG igg = this.this$0;
            TransactionConfig transactionConfig2 = this.$transactionConfig;
            InitialInfoModel.RedeemInitialInfo redeemInitialInfo3 = (InitialInfoModel.RedeemInitialInfo) this.$initialInfo;
            this.L$0 = redeemInitialInfo;
            this.L$1 = investOrderAhwBna;
            this.label = 1;
            objOLrzqt = igg.OLrzqt(transactionConfig2, redeemInitialInfo3, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i14 = this.I$4;
                    int i15 = this.I$3;
                    long j6 = this.J$1;
                    int i16 = this.I$2;
                    long j7 = this.J$0;
                    int i17 = this.I$1;
                    int i18 = this.I$0;
                    String str3 = (String) this.L$14;
                    String str4 = (String) this.L$13;
                    iXB ixb4 = (iXB) this.L$12;
                    InvestGasPriceConfig investGasPriceConfig4 = (InvestGasPriceConfig) this.L$11;
                    RedeemDetailsAndGasFee redeemDetailsAndGasFee3 = (RedeemDetailsAndGasFee) this.L$10;
                    InitialInfoModel.RedeemInitialInfo redeemInitialInfo4 = (InitialInfoModel.RedeemInitialInfo) this.L$9;
                    TransactionConfig transactionConfig3 = (TransactionConfig) this.L$8;
                    interfaceC9738bbJ = (InterfaceC9738bbJ) this.L$7;
                    TransactionStep transactionStep3 = (TransactionStep) this.L$6;
                    iCG icg3 = (iCG) this.L$5;
                    InvestGasPriceConfig investGasPriceConfig5 = (InvestGasPriceConfig) this.L$4;
                    List<TransactionStep> list3 = (List) this.L$3;
                    iXC ixc2 = (iXC) this.L$2;
                    iXB ixb5 = (iXB) this.L$1;
                    RedeemDetailsAndGasFee redeemDetailsAndGasFee4 = (RedeemDetailsAndGasFee) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    str = str3;
                    ixb3 = ixb4;
                    list = list3;
                    investGasPriceConfig2 = investGasPriceConfig4;
                    i10 = i16;
                    ixb2 = ixb5;
                    str2 = str4;
                    i3 = i18;
                    objAEQbTJ = obj;
                    redeemDetailsAndGasFee = redeemDetailsAndGasFee4;
                    i = i15;
                    i9 = i14;
                    icg2 = icg3;
                    ixcKWHzl = ixc2;
                    redeemInitialInfo2 = redeemInitialInfo4;
                    i8 = i17;
                    j = j7;
                    j2 = j6;
                    redeemDetailsAndGasFee2 = redeemDetailsAndGasFee3;
                    investGasPriceConfigValueOf = investGasPriceConfig5;
                    transactionConfig = transactionConfig3;
                    transactionStep2 = transactionStep3;
                    z2 = i3 == 0;
                    z3 = i8 == 0;
                    boolean z6 = i9 == 0;
                    String str5 = (String) objAEQbTJ;
                    InvestNetworkFeeItem investNetworkFeeItemValueOf = ixb2.valueOf();
                    String gasPrice = investNetworkFeeItemValueOf == null ? investNetworkFeeItemValueOf.getGasPrice() : null;
                    investTxModelKWHzl = icg2.KWHzl(transactionStep2, interfaceC9738bbJ, transactionConfig, redeemInitialInfo2, redeemDetailsAndGasFee2, investGasPriceConfig2, ixb3, str2, str, (1024 & 256) != 0 ? null : str5, (1024 & 512) != 0 ? null : (gasPrice != null || gasPrice.length() == 0) ? redeemDetailsAndGasFee.valueOf().getAverageGear().getGasPrice() : gasPrice, (1024 & 1024) != 0 ? null : null);
                    if (investTxModelKWHzl == null) {
                        investTxModel = investTxModelKWHzl;
                        ixc = ixcKWHzl;
                        i11 = i;
                        i12 = i10;
                        investGasPriceConfig3 = investGasPriceConfigValueOf;
                        j4 = j2;
                        j5 = j;
                        z5 = z2;
                        list2 = list;
                        z4 = z6;
                        return new InterfaceC24182iXy.Activity(ixc.KWHzl((16777087 & 1) != 0 ? ixc.AkhnZx : z5, (16777087 & 2) != 0 ? ixc.fetchVPNInfo : z3, (16777087 & 4) != 0 ? ixc.valueOf : null, (16777087 & 8) != 0 ? ixc.values : j5, (16777087 & 16) != 0 ? ixc.djBIcL : i12, (16777087 & 32) != 0 ? ixc.EZpvd : j4, (16777087 & 64) != 0 ? ixc.DbNXlk : i11, (16777087 & 128) != 0 ? ixc.fARcdN : null, (16777087 & 256) != 0 ? ixc.fIwbmz : null, (16777087 & 512) != 0 ? ixc.KWHzl : null, (16777087 & 1024) != 0 ? ixc.gEmmrt : null, (16777087 & 2048) != 0 ? ixc.AYXKKw : null, (16777087 & 4096) != 0 ? ixc.iwGUEr : null, (16777087 & 8192) != 0 ? ixc.OLrzqt : null, (16777087 & 16384) != 0 ? ixc.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixc.getFieldNames : null, (16777087 & 65536) != 0 ? ixc.ejfBZ : null, (16777087 & 131072) != 0 ? ixc.isConnected : z4, (16777087 & 262144) != 0 ? ixc.uzCIH : list2, (16777087 & 524288) != 0 ? ixc.AhwBna : investGasPriceConfig3, (16777087 & 1048576) != 0 ? ixc.copydefault : investTxModel, (16777087 & 2097152) != 0 ? ixc.AuCTel : null, (16777087 & 4194304) != 0 ? ixc.fJNWhG : null, (16777087 & 8388608) != 0 ? ixc.AEQbTJ : 0));
                    }
                    investGasPriceConfig = investGasPriceConfigValueOf;
                    newProxyInstance = list;
                    z = z6;
                    i2 = i10;
                    investGasPriceConfig3 = investGasPriceConfig;
                    investTxModel = new InvestTxModel(0, (String) null, (String) null, (List) null, (Long) null, 0L, (String) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -1, 65535, (DefaultConstructorMarker) null);
                    ixc = ixcKWHzl;
                    i11 = i;
                    list2 = newProxyInstance;
                    z4 = z;
                    j4 = j2;
                    j5 = j;
                    z5 = z2;
                    i12 = i2;
                    return new InterfaceC24182iXy.Activity(ixc.KWHzl((16777087 & 1) != 0 ? ixc.AkhnZx : z5, (16777087 & 2) != 0 ? ixc.fetchVPNInfo : z3, (16777087 & 4) != 0 ? ixc.valueOf : null, (16777087 & 8) != 0 ? ixc.values : j5, (16777087 & 16) != 0 ? ixc.djBIcL : i12, (16777087 & 32) != 0 ? ixc.EZpvd : j4, (16777087 & 64) != 0 ? ixc.DbNXlk : i11, (16777087 & 128) != 0 ? ixc.fARcdN : null, (16777087 & 256) != 0 ? ixc.fIwbmz : null, (16777087 & 512) != 0 ? ixc.KWHzl : null, (16777087 & 1024) != 0 ? ixc.gEmmrt : null, (16777087 & 2048) != 0 ? ixc.AYXKKw : null, (16777087 & 4096) != 0 ? ixc.iwGUEr : null, (16777087 & 8192) != 0 ? ixc.OLrzqt : null, (16777087 & 16384) != 0 ? ixc.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixc.getFieldNames : null, (16777087 & 65536) != 0 ? ixc.ejfBZ : null, (16777087 & 131072) != 0 ? ixc.isConnected : z4, (16777087 & 262144) != 0 ? ixc.uzCIH : list2, (16777087 & 524288) != 0 ? ixc.AhwBna : investGasPriceConfig3, (16777087 & 1048576) != 0 ? ixc.copydefault : investTxModel, (16777087 & 2097152) != 0 ? ixc.AuCTel : null, (16777087 & 4194304) != 0 ? ixc.fJNWhG : null, (16777087 & 8388608) != 0 ? ixc.AEQbTJ : 0));
                }
                int i19 = this.I$4;
                int i20 = this.I$3;
                long j8 = this.J$1;
                int i21 = this.I$2;
                long j9 = this.J$0;
                int i22 = this.I$1;
                int i23 = this.I$0;
                TransactionStep transactionStep4 = (TransactionStep) this.L$6;
                iCG icg4 = (iCG) this.L$5;
                InvestGasPriceConfig investGasPriceConfig6 = (InvestGasPriceConfig) this.L$4;
                list = (List) this.L$3;
                ixcKWHzl = (iXC) this.L$2;
                iXB ixb6 = (iXB) this.L$1;
                RedeemDetailsAndGasFee redeemDetailsAndGasFee5 = (RedeemDetailsAndGasFee) this.L$0;
                C56391yDq.AEQbTJ(obj);
                j3 = j9;
                i5 = i22;
                transactionStep = transactionStep4;
                icg = icg4;
                i6 = i21;
                investGasPriceConfigValueOf = investGasPriceConfig6;
                i3 = i23;
                j = j8;
                redeemDetailsAndGasFee = redeemDetailsAndGasFee5;
                i7 = i20;
                i4 = i19;
                objOLrzqt2 = obj;
                ixb = ixb6;
                InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) objOLrzqt2;
                TransactionConfig transactionConfig4 = this.$transactionConfig;
                int i24 = i4;
                InitialInfoModel.RedeemInitialInfo redeemInitialInfo5 = (InitialInfoModel.RedeemInitialInfo) this.$initialInfo;
                int i25 = i7;
                InvestGasPriceConfig investGasPriceConfigValueOf2 = redeemDetailsAndGasFee.valueOf();
                long j10 = j;
                String strEZpvd = this.this$0.copydefault.EZpvd(C33129mqd.gEmmrt(C56443yFo.KWHzl(this.$transactionConfig.copydefault())));
                String strAEQbTJ = ixb.AEQbTJ();
                int i26 = i6;
                i8 = i5;
                String strEZpvd2 = strAEQbTJ.length() != 0 ? this.this$0.EZpvd(this.$transactionConfig, redeemDetailsAndGasFee.valueOf()) : strAEQbTJ;
                iGG igg2 = this.this$0;
                String str6 = strEZpvd2;
                long jCopydefault = this.$transactionConfig.copydefault();
                this.L$0 = redeemDetailsAndGasFee;
                ixb2 = ixb;
                this.L$1 = ixb2;
                this.L$2 = ixcKWHzl;
                this.L$3 = list;
                this.L$4 = investGasPriceConfigValueOf;
                this.L$5 = icg;
                this.L$6 = transactionStep;
                this.L$7 = interfaceC9738bbJ2;
                this.L$8 = transactionConfig4;
                this.L$9 = redeemInitialInfo5;
                this.L$10 = redeemDetailsAndGasFee;
                this.L$11 = investGasPriceConfigValueOf2;
                this.L$12 = ixb2;
                this.L$13 = strEZpvd;
                this.L$14 = str6;
                this.I$0 = i3;
                this.I$1 = i8;
                long j11 = j3;
                this.J$0 = j11;
                this.I$2 = i26;
                this.J$1 = j10;
                this.I$3 = i25;
                i9 = i24;
                this.I$4 = i9;
                this.label = 3;
                objAEQbTJ = igg2.AEQbTJ(jCopydefault, this);
                if (objAEQbTJ != objCopydefault) {
                    return objCopydefault;
                }
                interfaceC9738bbJ = interfaceC9738bbJ2;
                ixb3 = ixb2;
                icg2 = icg;
                transactionStep2 = transactionStep;
                i = i25;
                j2 = j10;
                str = str6;
                transactionConfig = transactionConfig4;
                redeemInitialInfo2 = redeemInitialInfo5;
                redeemDetailsAndGasFee2 = redeemDetailsAndGasFee;
                str2 = strEZpvd;
                j = j11;
                investGasPriceConfig2 = investGasPriceConfigValueOf2;
                i10 = i26;
                if (i3 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                String str52 = (String) objAEQbTJ;
                InvestNetworkFeeItem investNetworkFeeItemValueOf2 = ixb2.valueOf();
                if (investNetworkFeeItemValueOf2 == null) {
                }
                if (gasPrice != null) {
                    investTxModelKWHzl = icg2.KWHzl(transactionStep2, interfaceC9738bbJ, transactionConfig, redeemInitialInfo2, redeemDetailsAndGasFee2, investGasPriceConfig2, ixb3, str2, str, (1024 & 256) != 0 ? null : str52, (1024 & 512) != 0 ? null : (gasPrice != null || gasPrice.length() == 0) ? redeemDetailsAndGasFee.valueOf().getAverageGear().getGasPrice() : gasPrice, (1024 & 1024) != 0 ? null : null);
                    if (investTxModelKWHzl == null) {
                    }
                }
                return new InterfaceC24182iXy.Activity(ixc.KWHzl((16777087 & 1) != 0 ? ixc.AkhnZx : z5, (16777087 & 2) != 0 ? ixc.fetchVPNInfo : z3, (16777087 & 4) != 0 ? ixc.valueOf : null, (16777087 & 8) != 0 ? ixc.values : j5, (16777087 & 16) != 0 ? ixc.djBIcL : i12, (16777087 & 32) != 0 ? ixc.EZpvd : j4, (16777087 & 64) != 0 ? ixc.DbNXlk : i11, (16777087 & 128) != 0 ? ixc.fARcdN : null, (16777087 & 256) != 0 ? ixc.fIwbmz : null, (16777087 & 512) != 0 ? ixc.KWHzl : null, (16777087 & 1024) != 0 ? ixc.gEmmrt : null, (16777087 & 2048) != 0 ? ixc.AYXKKw : null, (16777087 & 4096) != 0 ? ixc.iwGUEr : null, (16777087 & 8192) != 0 ? ixc.OLrzqt : null, (16777087 & 16384) != 0 ? ixc.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixc.getFieldNames : null, (16777087 & 65536) != 0 ? ixc.ejfBZ : null, (16777087 & 131072) != 0 ? ixc.isConnected : z4, (16777087 & 262144) != 0 ? ixc.uzCIH : list2, (16777087 & 524288) != 0 ? ixc.AhwBna : investGasPriceConfig3, (16777087 & 1048576) != 0 ? ixc.copydefault : investTxModel, (16777087 & 2097152) != 0 ? ixc.AuCTel : null, (16777087 & 4194304) != 0 ? ixc.fJNWhG : null, (16777087 & 8388608) != 0 ? ixc.AEQbTJ : 0));
            }
            investOrderAhwBna = (InvestOrder) this.L$1;
            redeemInitialInfo = (InitialInfoModel.RedeemInitialInfo) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        RedeemDetailsAndGasFee redeemDetailsAndGasFee6 = (RedeemDetailsAndGasFee) objOLrzqt;
        String stakedAmount = investOrderAhwBna.getStakedAmount();
        InvestTokenWithAmount investTokenWithAmountFIwbmz = ((InitialInfoModel.RedeemInitialInfo) this.$initialInfo).fIwbmz();
        iXB ixb7 = this.$userInput;
        String strAEQbTJ2 = ixb7 != null ? ixb7.AEQbTJ() : null;
        if (strAEQbTJ2 == null) {
            strAEQbTJ2 = "";
        }
        iXB ixb8 = new iXB(stakedAmount, investTokenWithAmountFIwbmz, TransactionStage.CONFIRMATION, strAEQbTJ2, null, null, 0L, null, 0, false, false, false, 4080, null);
        ixcKWHzl = this.this$0.AEQbTJ.KWHzl(this.$transactionConfig, redeemInitialInfo, ixb8, redeemDetailsAndGasFee6);
        newProxyInstance = redeemDetailsAndGasFee6.getNewProxyInstance();
        investGasPriceConfigValueOf = redeemDetailsAndGasFee6.valueOf();
        Iterator<T> it = redeemDetailsAndGasFee6.getNewProxyInstance().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((TransactionStep) next).fetchVPNInfo()) {
                break;
            }
        }
        transactionStep = (TransactionStep) next;
        j = 0;
        if (transactionStep != null) {
            icg = iCG.copydefault;
            iGG igg3 = this.this$0;
            this.L$0 = redeemDetailsAndGasFee6;
            this.L$1 = ixb8;
            this.L$2 = ixcKWHzl;
            this.L$3 = newProxyInstance;
            this.L$4 = investGasPriceConfigValueOf;
            this.L$5 = icg;
            this.L$6 = transactionStep;
            i3 = 0;
            this.I$0 = 0;
            this.I$1 = 0;
            this.J$0 = 0L;
            this.I$2 = 0;
            this.J$1 = 0L;
            this.I$3 = 0;
            this.I$4 = 0;
            this.label = 2;
            objOLrzqt2 = igg3.OLrzqt((Continuation<? super InterfaceC9738bbJ>) this);
            if (objOLrzqt2 == objCopydefault) {
                return objCopydefault;
            }
            ixb = ixb8;
            list = newProxyInstance;
            j3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            redeemDetailsAndGasFee = redeemDetailsAndGasFee6;
            i7 = 0;
            InterfaceC9738bbJ interfaceC9738bbJ22 = (InterfaceC9738bbJ) objOLrzqt2;
            TransactionConfig transactionConfig42 = this.$transactionConfig;
            int i242 = i4;
            InitialInfoModel.RedeemInitialInfo redeemInitialInfo52 = (InitialInfoModel.RedeemInitialInfo) this.$initialInfo;
            int i252 = i7;
            InvestGasPriceConfig investGasPriceConfigValueOf22 = redeemDetailsAndGasFee.valueOf();
            long j102 = j;
            String strEZpvd3 = this.this$0.copydefault.EZpvd(C33129mqd.gEmmrt(C56443yFo.KWHzl(this.$transactionConfig.copydefault())));
            String strAEQbTJ3 = ixb.AEQbTJ();
            int i262 = i6;
            i8 = i5;
            if (strAEQbTJ3.length() != 0) {
            }
            iGG igg22 = this.this$0;
            String str62 = strEZpvd2;
            long jCopydefault2 = this.$transactionConfig.copydefault();
            this.L$0 = redeemDetailsAndGasFee;
            ixb2 = ixb;
            this.L$1 = ixb2;
            this.L$2 = ixcKWHzl;
            this.L$3 = list;
            this.L$4 = investGasPriceConfigValueOf;
            this.L$5 = icg;
            this.L$6 = transactionStep;
            this.L$7 = interfaceC9738bbJ22;
            this.L$8 = transactionConfig42;
            this.L$9 = redeemInitialInfo52;
            this.L$10 = redeemDetailsAndGasFee;
            this.L$11 = investGasPriceConfigValueOf22;
            this.L$12 = ixb2;
            this.L$13 = strEZpvd3;
            this.L$14 = str62;
            this.I$0 = i3;
            this.I$1 = i8;
            long j112 = j3;
            this.J$0 = j112;
            this.I$2 = i262;
            this.J$1 = j102;
            this.I$3 = i252;
            i9 = i242;
            this.I$4 = i9;
            this.label = 3;
            objAEQbTJ = igg22.AEQbTJ(jCopydefault2, this);
            if (objAEQbTJ != objCopydefault) {
            }
        } else {
            investGasPriceConfig = investGasPriceConfigValueOf;
            j2 = 0;
            i = 0;
            z = false;
            z2 = false;
            i2 = 0;
            z3 = false;
            investGasPriceConfig3 = investGasPriceConfig;
            investTxModel = new InvestTxModel(0, (String) null, (String) null, (List) null, (Long) null, 0L, (String) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -1, 65535, (DefaultConstructorMarker) null);
            ixc = ixcKWHzl;
            i11 = i;
            list2 = newProxyInstance;
            z4 = z;
            j4 = j2;
            j5 = j;
            z5 = z2;
            i12 = i2;
            return new InterfaceC24182iXy.Activity(ixc.KWHzl((16777087 & 1) != 0 ? ixc.AkhnZx : z5, (16777087 & 2) != 0 ? ixc.fetchVPNInfo : z3, (16777087 & 4) != 0 ? ixc.valueOf : null, (16777087 & 8) != 0 ? ixc.values : j5, (16777087 & 16) != 0 ? ixc.djBIcL : i12, (16777087 & 32) != 0 ? ixc.EZpvd : j4, (16777087 & 64) != 0 ? ixc.DbNXlk : i11, (16777087 & 128) != 0 ? ixc.fARcdN : null, (16777087 & 256) != 0 ? ixc.fIwbmz : null, (16777087 & 512) != 0 ? ixc.KWHzl : null, (16777087 & 1024) != 0 ? ixc.gEmmrt : null, (16777087 & 2048) != 0 ? ixc.AYXKKw : null, (16777087 & 4096) != 0 ? ixc.iwGUEr : null, (16777087 & 8192) != 0 ? ixc.OLrzqt : null, (16777087 & 16384) != 0 ? ixc.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixc.getFieldNames : null, (16777087 & 65536) != 0 ? ixc.ejfBZ : null, (16777087 & 131072) != 0 ? ixc.isConnected : z4, (16777087 & 262144) != 0 ? ixc.uzCIH : list2, (16777087 & 524288) != 0 ? ixc.AhwBna : investGasPriceConfig3, (16777087 & 1048576) != 0 ? ixc.copydefault : investTxModel, (16777087 & 2097152) != 0 ? ixc.AuCTel : null, (16777087 & 4194304) != 0 ? ixc.fJNWhG : null, (16777087 & 8388608) != 0 ? ixc.AEQbTJ : 0));
        }
    }
}
