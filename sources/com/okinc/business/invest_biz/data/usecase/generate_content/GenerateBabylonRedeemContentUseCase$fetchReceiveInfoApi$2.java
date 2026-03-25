package com.okinc.business.invest_biz.data.usecase.generate_content;

import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;
import o.iFL;
import o.iGG;

/* JADX INFO: loaded from: classes6.dex */
public final class GenerateBabylonRedeemContentUseCase$fetchReceiveInfoApi$2 extends SuspendLambda implements Function1<Continuation<? super RedeemDetailsAndGasFee>, Object> {
    final /* synthetic */ InitialInfoModel.RedeemInitialInfo $initialInfo;
    final /* synthetic */ TransactionConfig $transactionConfig;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;
    final /* synthetic */ iGG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBabylonRedeemContentUseCase$fetchReceiveInfoApi$2(InitialInfoModel.RedeemInitialInfo redeemInitialInfo, iGG igg, TransactionConfig transactionConfig, Continuation<? super GenerateBabylonRedeemContentUseCase$fetchReceiveInfoApi$2> continuation) {
        super(1, continuation);
        this.$initialInfo = redeemInitialInfo;
        this.this$0 = igg;
        this.$transactionConfig = transactionConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new GenerateBabylonRedeemContentUseCase$fetchReceiveInfoApi$2(this.$initialInfo, this.this$0, this.$transactionConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super RedeemDetailsAndGasFee> continuation) {
        return ((GenerateBabylonRedeemContentUseCase$fetchReceiveInfoApi$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestTokenWithAmount investTokenWithAmountFIwbmz;
        Object objOLrzqt;
        boolean zAwvSrB;
        Object objAEQbTJ;
        String str;
        int i;
        Boolean bool;
        long j;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Object objKWHzl;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            investTokenWithAmountFIwbmz = this.$initialInfo.fIwbmz();
            iGG igg = this.this$0;
            this.L$0 = investTokenWithAmountFIwbmz;
            this.label = 1;
            objOLrzqt = igg.OLrzqt((Continuation<? super InterfaceC9738bbJ>) this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7386unboximpl = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objM7386unboximpl);
                    return objM7386unboximpl;
                }
                boolean z = this.Z$0;
                int i3 = this.I$0;
                long j2 = this.J$0;
                Boolean bool2 = (Boolean) this.L$6;
                String str7 = (String) this.L$5;
                String str8 = (String) this.L$4;
                String str9 = (String) this.L$3;
                String str10 = (String) this.L$2;
                String str11 = (String) this.L$1;
                String str12 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                i = i3;
                bool = bool2;
                j = j2;
                str6 = str7;
                str = str8;
                str2 = str9;
                str3 = str10;
                str4 = str11;
                str5 = str12;
                zAwvSrB = z;
                objAEQbTJ = obj;
                InvestRedeemReceiveReq investRedeemReceiveReq = new InvestRedeemReceiveReq(str5, str4, str3, j, i, str2, str, C56443yFo.KWHzl(zAwvSrB), (String) null, str6, (Integer) null, (String) null, bool, (String) objAEQbTJ, (Long) null, 19712, (DefaultConstructorMarker) null);
                iFL ifl = this.this$0.KWHzl;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 3;
                objKWHzl = ifl.KWHzl(investRedeemReceiveReq, this);
                if (objKWHzl != objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objKWHzl;
                C56391yDq.AEQbTJ(objM7386unboximpl);
                return objM7386unboximpl;
            }
            investTokenWithAmountFIwbmz = (InvestTokenWithAmount) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objOLrzqt;
        String strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
        String str13 = strDbNXlk == null ? "" : strDbNXlk;
        String strEZpvd = interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(this.$transactionConfig.copydefault()) : null;
        String str14 = strEZpvd == null ? "" : strEZpvd;
        InvestOrder investOrderAhwBna = this.$transactionConfig.AhwBna();
        String stakedAmount = investOrderAhwBna != null ? investOrderAhwBna.getStakedAmount() : null;
        String str15 = stakedAmount == null ? "" : stakedAmount;
        long jIsConnected = this.$transactionConfig.isConnected();
        int iAkhnZx = this.$transactionConfig.AkhnZx();
        zAwvSrB = this.$transactionConfig.AwvSrB();
        String tokenAddress = investTokenWithAmountFIwbmz.getTokenAddress();
        String tokenPrecision = investTokenWithAmountFIwbmz.getTokenPrecision();
        InvestOrder investOrderAhwBna2 = this.$transactionConfig.AhwBna();
        String redeemId = investOrderAhwBna2 != null ? investOrderAhwBna2.getRedeemId() : null;
        if (redeemId == null) {
            redeemId = "";
        }
        InvestOrder investOrderAhwBna3 = this.$transactionConfig.AhwBna();
        Boolean redeemNeedUnbond = investOrderAhwBna3 != null ? investOrderAhwBna3.getRedeemNeedUnbond() : null;
        iGG igg2 = this.this$0;
        long jCopydefault = this.$transactionConfig.copydefault();
        this.L$0 = str13;
        this.L$1 = str14;
        this.L$2 = str15;
        this.L$3 = tokenAddress;
        this.L$4 = tokenPrecision;
        this.L$5 = redeemId;
        this.L$6 = redeemNeedUnbond;
        this.J$0 = jIsConnected;
        this.I$0 = iAkhnZx;
        this.Z$0 = zAwvSrB;
        this.label = 2;
        objAEQbTJ = igg2.AEQbTJ(jCopydefault, this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        str = tokenPrecision;
        i = iAkhnZx;
        bool = redeemNeedUnbond;
        j = jIsConnected;
        str2 = tokenAddress;
        str3 = str15;
        str4 = str14;
        str5 = str13;
        str6 = redeemId;
        InvestRedeemReceiveReq investRedeemReceiveReq2 = new InvestRedeemReceiveReq(str5, str4, str3, j, i, str2, str, C56443yFo.KWHzl(zAwvSrB), (String) null, str6, (Integer) null, (String) null, bool, (String) objAEQbTJ, (Long) null, 19712, (DefaultConstructorMarker) null);
        iFL ifl2 = this.this$0.KWHzl;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.label = 3;
        objKWHzl = ifl2.KWHzl(investRedeemReceiveReq2, this);
        if (objKWHzl != objCopydefault) {
        }
    }
}
