package com.okinc.business.invest_biz.data.usecase.generate_content;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
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
import o.C27164jpy;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC24182iXy;
import o.InterfaceC9738bbJ;
import o.iCG;
import o.iGL;
import o.iXB;
import o.iXC;

/* JADX INFO: loaded from: classes6.dex */
public final class GenerateDotSwapRedeemContentUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super InterfaceC24182iXy.Activity<iXC>>, Object> {
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
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ iGL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateDotSwapRedeemContentUseCase$invoke$2(InitialInfoModel initialInfoModel, iXB ixb, iGL igl, TransactionConfig transactionConfig, Continuation<? super GenerateDotSwapRedeemContentUseCase$invoke$2> continuation) {
        super(1, continuation);
        this.$initialInfo = initialInfoModel;
        this.$userInput = ixb;
        this.this$0 = igl;
        this.$transactionConfig = transactionConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new GenerateDotSwapRedeemContentUseCase$invoke$2(this.$initialInfo, this.$userInput, this.this$0, this.$transactionConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InterfaceC24182iXy.Activity<iXC>> continuation) {
        return ((GenerateDotSwapRedeemContentUseCase$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x028a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02fc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InitialInfoModel.RedeemInitialInfo redeemInitialInfo;
        iXC ixcKWHzl;
        Object objOLrzqt;
        iXC ixcEZpvd;
        List<TransactionStep> newProxyInstance;
        InvestGasPriceConfig investGasPriceConfigValueOf;
        Object next;
        TransactionStep transactionStep;
        long j;
        long j2;
        long j3;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        iCG icg;
        int i3;
        Object objOLrzqt2;
        Object obj2;
        String str;
        List<TransactionStep> list;
        long j4;
        int i4;
        int i5;
        int i6;
        RedeemDetailsAndGasFee redeemDetailsAndGasFee;
        int i7;
        int i8;
        int i9;
        Object objAEQbTJ;
        Object obj3;
        InterfaceC9738bbJ interfaceC9738bbJ;
        iCG icg2;
        TransactionStep transactionStep2;
        TransactionConfig transactionConfig;
        iXC ixc;
        iXB ixb;
        int i10;
        String str2;
        String str3;
        InitialInfoModel.RedeemInitialInfo redeemInitialInfo2;
        RedeemDetailsAndGasFee redeemDetailsAndGasFee2;
        InvestGasPriceConfig investGasPriceConfig;
        InvestTxModel investTxModel;
        InvestGasPriceConfig investGasPriceConfig2;
        List<TransactionStep> list2;
        int i11;
        long j5;
        int i12;
        long j6;
        boolean z4;
        boolean z5;
        iXC ixc2;
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
            iXB ixb2 = this.$userInput;
            if (ixb2 == null || !C33129mqd.AEQbTJ(ixb2.EZpvd(), "0")) {
                ixcKWHzl = this.this$0.AEQbTJ.KWHzl(this.$transactionConfig, redeemInitialInfo, this.$userInput);
                return new InterfaceC24182iXy.Activity(ixcKWHzl);
            }
            iGL igl = this.this$0;
            TransactionConfig transactionConfig2 = this.$transactionConfig;
            InitialInfoModel.RedeemInitialInfo redeemInitialInfo3 = (InitialInfoModel.RedeemInitialInfo) this.$initialInfo;
            iXB ixb3 = this.$userInput;
            this.L$0 = redeemInitialInfo;
            this.label = 1;
            objOLrzqt = igl.OLrzqt(transactionConfig2, redeemInitialInfo3, ixb3, this);
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
                    long j7 = this.J$1;
                    int i16 = this.I$2;
                    long j8 = this.J$0;
                    int i17 = this.I$1;
                    i10 = this.I$0;
                    String str4 = (String) this.L$13;
                    String str5 = (String) this.L$12;
                    iXB ixb4 = (iXB) this.L$11;
                    InvestGasPriceConfig investGasPriceConfig3 = (InvestGasPriceConfig) this.L$10;
                    RedeemDetailsAndGasFee redeemDetailsAndGasFee3 = (RedeemDetailsAndGasFee) this.L$9;
                    InitialInfoModel.RedeemInitialInfo redeemInitialInfo4 = (InitialInfoModel.RedeemInitialInfo) this.L$8;
                    TransactionConfig transactionConfig3 = (TransactionConfig) this.L$7;
                    interfaceC9738bbJ = (InterfaceC9738bbJ) this.L$6;
                    TransactionStep transactionStep3 = (TransactionStep) this.L$5;
                    iCG icg3 = (iCG) this.L$4;
                    InvestGasPriceConfig investGasPriceConfig4 = (InvestGasPriceConfig) this.L$3;
                    List<TransactionStep> list3 = (List) this.L$2;
                    iXC ixc3 = (iXC) this.L$1;
                    RedeemDetailsAndGasFee redeemDetailsAndGasFee4 = (RedeemDetailsAndGasFee) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    i8 = i17;
                    str2 = str4;
                    str3 = str5;
                    j3 = j8;
                    objAEQbTJ = obj;
                    redeemDetailsAndGasFee = redeemDetailsAndGasFee4;
                    i = i15;
                    i9 = i14;
                    icg2 = icg3;
                    ixc = ixc3;
                    redeemInitialInfo2 = redeemInitialInfo4;
                    i2 = i16;
                    ixb = ixb4;
                    list = list3;
                    j2 = j7;
                    investGasPriceConfig = investGasPriceConfig3;
                    redeemDetailsAndGasFee2 = redeemDetailsAndGasFee3;
                    investGasPriceConfigValueOf = investGasPriceConfig4;
                    transactionConfig = transactionConfig3;
                    transactionStep2 = transactionStep3;
                    z = i10 == 0;
                    z2 = i8 == 0;
                    z3 = i9 == 0;
                    String str6 = (String) objAEQbTJ;
                    InvestNetworkFeeItem investNetworkFeeItemValueOf = this.$userInput.valueOf();
                    String gasPrice = investNetworkFeeItemValueOf == null ? investNetworkFeeItemValueOf.getGasPrice() : null;
                    investTxModelKWHzl = icg2.KWHzl(transactionStep2, interfaceC9738bbJ, transactionConfig, redeemInitialInfo2, redeemDetailsAndGasFee2, investGasPriceConfig, ixb, str3, str2, (1024 & 256) != 0 ? null : str6, (1024 & 512) != 0 ? null : (gasPrice != null || gasPrice.length() == 0) ? redeemDetailsAndGasFee.valueOf().getAverageGear().getGasPrice() : gasPrice, (1024 & 1024) != 0 ? null : null);
                    if (investTxModelKWHzl == null) {
                        investTxModel = investTxModelKWHzl;
                        ixc2 = ixc;
                        i11 = i;
                        i12 = i2;
                        investGasPriceConfig2 = investGasPriceConfigValueOf;
                        j5 = j2;
                        j6 = j3;
                        z5 = z;
                        z4 = z2;
                        list2 = list;
                        ixcKWHzl = ixc2.KWHzl((16777087 & 1) != 0 ? ixc2.AkhnZx : z5, (16777087 & 2) != 0 ? ixc2.fetchVPNInfo : z4, (16777087 & 4) != 0 ? ixc2.valueOf : null, (16777087 & 8) != 0 ? ixc2.values : j6, (16777087 & 16) != 0 ? ixc2.djBIcL : i12, (16777087 & 32) != 0 ? ixc2.EZpvd : j5, (16777087 & 64) != 0 ? ixc2.DbNXlk : i11, (16777087 & 128) != 0 ? ixc2.fARcdN : null, (16777087 & 256) != 0 ? ixc2.fIwbmz : null, (16777087 & 512) != 0 ? ixc2.KWHzl : null, (16777087 & 1024) != 0 ? ixc2.gEmmrt : null, (16777087 & 2048) != 0 ? ixc2.AYXKKw : null, (16777087 & 4096) != 0 ? ixc2.iwGUEr : null, (16777087 & 8192) != 0 ? ixc2.OLrzqt : null, (16777087 & 16384) != 0 ? ixc2.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixc2.getFieldNames : null, (16777087 & 65536) != 0 ? ixc2.ejfBZ : null, (16777087 & 131072) != 0 ? ixc2.isConnected : z3, (16777087 & 262144) != 0 ? ixc2.uzCIH : list2, (16777087 & 524288) != 0 ? ixc2.AhwBna : investGasPriceConfig2, (16777087 & 1048576) != 0 ? ixc2.copydefault : investTxModel, (16777087 & 2097152) != 0 ? ixc2.AuCTel : null, (16777087 & 4194304) != 0 ? ixc2.fJNWhG : null, (16777087 & 8388608) != 0 ? ixc2.AEQbTJ : 0);
                        return new InterfaceC24182iXy.Activity(ixcKWHzl);
                    }
                    ixcEZpvd = ixc;
                    newProxyInstance = list;
                    investTxModel = new InvestTxModel(0, (String) null, (String) null, (List) null, (Long) null, 0L, (String) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -1, 65535, (DefaultConstructorMarker) null);
                    ixc2 = ixcEZpvd;
                    i11 = i;
                    i12 = i2;
                    list2 = newProxyInstance;
                    investGasPriceConfig2 = investGasPriceConfigValueOf;
                    j5 = j2;
                    j6 = j3;
                    z5 = z;
                    z4 = z2;
                    ixcKWHzl = ixc2.KWHzl((16777087 & 1) != 0 ? ixc2.AkhnZx : z5, (16777087 & 2) != 0 ? ixc2.fetchVPNInfo : z4, (16777087 & 4) != 0 ? ixc2.valueOf : null, (16777087 & 8) != 0 ? ixc2.values : j6, (16777087 & 16) != 0 ? ixc2.djBIcL : i12, (16777087 & 32) != 0 ? ixc2.EZpvd : j5, (16777087 & 64) != 0 ? ixc2.DbNXlk : i11, (16777087 & 128) != 0 ? ixc2.fARcdN : null, (16777087 & 256) != 0 ? ixc2.fIwbmz : null, (16777087 & 512) != 0 ? ixc2.KWHzl : null, (16777087 & 1024) != 0 ? ixc2.gEmmrt : null, (16777087 & 2048) != 0 ? ixc2.AYXKKw : null, (16777087 & 4096) != 0 ? ixc2.iwGUEr : null, (16777087 & 8192) != 0 ? ixc2.OLrzqt : null, (16777087 & 16384) != 0 ? ixc2.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixc2.getFieldNames : null, (16777087 & 65536) != 0 ? ixc2.ejfBZ : null, (16777087 & 131072) != 0 ? ixc2.isConnected : z3, (16777087 & 262144) != 0 ? ixc2.uzCIH : list2, (16777087 & 524288) != 0 ? ixc2.AhwBna : investGasPriceConfig2, (16777087 & 1048576) != 0 ? ixc2.copydefault : investTxModel, (16777087 & 2097152) != 0 ? ixc2.AuCTel : null, (16777087 & 4194304) != 0 ? ixc2.fJNWhG : null, (16777087 & 8388608) != 0 ? ixc2.AEQbTJ : 0);
                    return new InterfaceC24182iXy.Activity(ixcKWHzl);
                }
                int i18 = this.I$4;
                int i19 = this.I$3;
                long j9 = this.J$1;
                int i20 = this.I$2;
                long j10 = this.J$0;
                int i21 = this.I$1;
                int i22 = this.I$0;
                TransactionStep transactionStep4 = (TransactionStep) this.L$6;
                iCG icg4 = (iCG) this.L$5;
                InvestGasPriceConfig investGasPriceConfig5 = (InvestGasPriceConfig) this.L$4;
                list = (List) this.L$3;
                iXC ixc4 = (iXC) this.L$2;
                String str7 = (String) this.L$1;
                RedeemDetailsAndGasFee redeemDetailsAndGasFee5 = (RedeemDetailsAndGasFee) this.L$0;
                C56391yDq.AEQbTJ(obj);
                j4 = j10;
                i5 = i21;
                transactionStep = transactionStep4;
                icg = icg4;
                i6 = i20;
                investGasPriceConfigValueOf = investGasPriceConfig5;
                i3 = i22;
                j = j9;
                redeemDetailsAndGasFee = redeemDetailsAndGasFee5;
                ixcEZpvd = ixc4;
                i4 = i19;
                i7 = i18;
                objOLrzqt2 = obj;
                obj2 = objCopydefault;
                str = str7;
                InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) objOLrzqt2;
                int i23 = i7;
                TransactionConfig transactionConfig4 = this.$transactionConfig;
                int i24 = i4;
                InitialInfoModel.RedeemInitialInfo redeemInitialInfo5 = (InitialInfoModel.RedeemInitialInfo) this.$initialInfo;
                long j11 = j;
                InvestGasPriceConfig investGasPriceConfigValueOf2 = redeemDetailsAndGasFee.valueOf();
                iXB ixb5 = this.$userInput;
                int i25 = i6;
                int i26 = i5;
                String strEZpvd = this.this$0.KWHzl.EZpvd(C33129mqd.gEmmrt(C56443yFo.KWHzl(this.$transactionConfig.copydefault())));
                iGL igl2 = this.this$0;
                int i27 = i3;
                long jCopydefault = this.$transactionConfig.copydefault();
                this.L$0 = redeemDetailsAndGasFee;
                this.L$1 = ixcEZpvd;
                this.L$2 = list;
                this.L$3 = investGasPriceConfigValueOf;
                this.L$4 = icg;
                this.L$5 = transactionStep;
                this.L$6 = interfaceC9738bbJ2;
                this.L$7 = transactionConfig4;
                this.L$8 = redeemInitialInfo5;
                this.L$9 = redeemDetailsAndGasFee;
                this.L$10 = investGasPriceConfigValueOf2;
                this.L$11 = ixb5;
                this.L$12 = strEZpvd;
                this.L$13 = str;
                String str8 = str;
                this.I$0 = i27;
                this.I$1 = i26;
                i8 = i26;
                iXC ixc5 = ixcEZpvd;
                this.J$0 = j4;
                this.I$2 = i25;
                this.J$1 = j11;
                this.I$3 = i24;
                i9 = i23;
                this.I$4 = i9;
                this.label = 3;
                objAEQbTJ = igl2.AEQbTJ(jCopydefault, this);
                obj3 = obj2;
                if (objAEQbTJ != obj3) {
                    return obj3;
                }
                interfaceC9738bbJ = interfaceC9738bbJ2;
                icg2 = icg;
                transactionStep2 = transactionStep;
                i = i24;
                transactionConfig = transactionConfig4;
                ixc = ixc5;
                ixb = ixb5;
                i10 = i27;
                long j12 = j4;
                str2 = str8;
                str3 = strEZpvd;
                j2 = j11;
                redeemInitialInfo2 = redeemInitialInfo5;
                redeemDetailsAndGasFee2 = redeemDetailsAndGasFee;
                i2 = i25;
                investGasPriceConfig = investGasPriceConfigValueOf2;
                j3 = j12;
                if (i10 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                String str62 = (String) objAEQbTJ;
                InvestNetworkFeeItem investNetworkFeeItemValueOf2 = this.$userInput.valueOf();
                if (investNetworkFeeItemValueOf2 == null) {
                }
                if (gasPrice != null) {
                    investTxModelKWHzl = icg2.KWHzl(transactionStep2, interfaceC9738bbJ, transactionConfig, redeemInitialInfo2, redeemDetailsAndGasFee2, investGasPriceConfig, ixb, str3, str2, (1024 & 256) != 0 ? null : str62, (1024 & 512) != 0 ? null : (gasPrice != null || gasPrice.length() == 0) ? redeemDetailsAndGasFee.valueOf().getAverageGear().getGasPrice() : gasPrice, (1024 & 1024) != 0 ? null : null);
                    if (investTxModelKWHzl == null) {
                    }
                }
                return new InterfaceC24182iXy.Activity(ixcKWHzl);
            }
            redeemInitialInfo = (InitialInfoModel.RedeemInitialInfo) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        RedeemDetailsAndGasFee redeemDetailsAndGasFee6 = (RedeemDetailsAndGasFee) objOLrzqt;
        String strAEQbTJ = this.$userInput.AEQbTJ();
        iGL igl3 = this.this$0;
        TransactionConfig transactionConfig5 = this.$transactionConfig;
        if (strAEQbTJ.length() == 0) {
            C27164jpy c27164jpy = igl3.KWHzl;
            String strAYXKKw = C33129mqd.AYXKKw(C56443yFo.KWHzl(transactionConfig5.copydefault()));
            InvestSlippageConfig investSlippage = redeemDetailsAndGasFee6.valueOf().getInvestSlippage();
            String automaticValue = investSlippage != null ? investSlippage.getAutomaticValue() : null;
            InvestSlippageConfig investSlippage2 = redeemDetailsAndGasFee6.valueOf().getInvestSlippage();
            String customMax = investSlippage2 != null ? investSlippage2.getCustomMax() : null;
            InvestSlippageConfig investSlippage3 = redeemDetailsAndGasFee6.valueOf().getInvestSlippage();
            strAEQbTJ = c27164jpy.AEQbTJ(strAYXKKw, automaticValue, customMax, investSlippage3 != null ? C56443yFo.AEQbTJ(investSlippage3.getType()) : null).getFirst();
        }
        ixcEZpvd = this.this$0.AEQbTJ.EZpvd(this.$transactionConfig, redeemInitialInfo, this.$userInput, redeemDetailsAndGasFee6);
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
            iGL igl4 = this.this$0;
            this.L$0 = redeemDetailsAndGasFee6;
            this.L$1 = strAEQbTJ;
            this.L$2 = ixcEZpvd;
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
            objOLrzqt2 = igl4.OLrzqt(this);
            if (objOLrzqt2 == objCopydefault) {
                return objCopydefault;
            }
            obj2 = objCopydefault;
            str = strAEQbTJ;
            list = newProxyInstance;
            j4 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            redeemDetailsAndGasFee = redeemDetailsAndGasFee6;
            i7 = 0;
            InterfaceC9738bbJ interfaceC9738bbJ22 = (InterfaceC9738bbJ) objOLrzqt2;
            int i232 = i7;
            TransactionConfig transactionConfig42 = this.$transactionConfig;
            int i242 = i4;
            InitialInfoModel.RedeemInitialInfo redeemInitialInfo52 = (InitialInfoModel.RedeemInitialInfo) this.$initialInfo;
            long j112 = j;
            InvestGasPriceConfig investGasPriceConfigValueOf22 = redeemDetailsAndGasFee.valueOf();
            iXB ixb52 = this.$userInput;
            int i252 = i6;
            int i262 = i5;
            String strEZpvd2 = this.this$0.KWHzl.EZpvd(C33129mqd.gEmmrt(C56443yFo.KWHzl(this.$transactionConfig.copydefault())));
            iGL igl22 = this.this$0;
            int i272 = i3;
            long jCopydefault2 = this.$transactionConfig.copydefault();
            this.L$0 = redeemDetailsAndGasFee;
            this.L$1 = ixcEZpvd;
            this.L$2 = list;
            this.L$3 = investGasPriceConfigValueOf;
            this.L$4 = icg;
            this.L$5 = transactionStep;
            this.L$6 = interfaceC9738bbJ22;
            this.L$7 = transactionConfig42;
            this.L$8 = redeemInitialInfo52;
            this.L$9 = redeemDetailsAndGasFee;
            this.L$10 = investGasPriceConfigValueOf22;
            this.L$11 = ixb52;
            this.L$12 = strEZpvd2;
            this.L$13 = str;
            String str82 = str;
            this.I$0 = i272;
            this.I$1 = i262;
            i8 = i262;
            iXC ixc52 = ixcEZpvd;
            this.J$0 = j4;
            this.I$2 = i252;
            this.J$1 = j112;
            this.I$3 = i242;
            i9 = i232;
            this.I$4 = i9;
            this.label = 3;
            objAEQbTJ = igl22.AEQbTJ(jCopydefault2, this);
            obj3 = obj2;
            if (objAEQbTJ != obj3) {
            }
        } else {
            j2 = 0;
            j3 = 0;
            i = 0;
            i2 = 0;
            z = false;
            z2 = false;
            z3 = false;
            investTxModel = new InvestTxModel(0, (String) null, (String) null, (List) null, (Long) null, 0L, (String) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -1, 65535, (DefaultConstructorMarker) null);
            ixc2 = ixcEZpvd;
            i11 = i;
            i12 = i2;
            list2 = newProxyInstance;
            investGasPriceConfig2 = investGasPriceConfigValueOf;
            j5 = j2;
            j6 = j3;
            z5 = z;
            z4 = z2;
            ixcKWHzl = ixc2.KWHzl((16777087 & 1) != 0 ? ixc2.AkhnZx : z5, (16777087 & 2) != 0 ? ixc2.fetchVPNInfo : z4, (16777087 & 4) != 0 ? ixc2.valueOf : null, (16777087 & 8) != 0 ? ixc2.values : j6, (16777087 & 16) != 0 ? ixc2.djBIcL : i12, (16777087 & 32) != 0 ? ixc2.EZpvd : j5, (16777087 & 64) != 0 ? ixc2.DbNXlk : i11, (16777087 & 128) != 0 ? ixc2.fARcdN : null, (16777087 & 256) != 0 ? ixc2.fIwbmz : null, (16777087 & 512) != 0 ? ixc2.KWHzl : null, (16777087 & 1024) != 0 ? ixc2.gEmmrt : null, (16777087 & 2048) != 0 ? ixc2.AYXKKw : null, (16777087 & 4096) != 0 ? ixc2.iwGUEr : null, (16777087 & 8192) != 0 ? ixc2.OLrzqt : null, (16777087 & 16384) != 0 ? ixc2.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixc2.getFieldNames : null, (16777087 & 65536) != 0 ? ixc2.ejfBZ : null, (16777087 & 131072) != 0 ? ixc2.isConnected : z3, (16777087 & 262144) != 0 ? ixc2.uzCIH : list2, (16777087 & 524288) != 0 ? ixc2.AhwBna : investGasPriceConfig2, (16777087 & 1048576) != 0 ? ixc2.copydefault : investTxModel, (16777087 & 2097152) != 0 ? ixc2.AuCTel : null, (16777087 & 4194304) != 0 ? ixc2.fJNWhG : null, (16777087 & 8388608) != 0 ? ixc2.AEQbTJ : 0);
            return new InterfaceC24182iXy.Activity(ixcKWHzl);
        }
    }
}
