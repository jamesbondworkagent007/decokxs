package com.okinc.business.invest_biz.data.usecase.generate_content;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC24182iXy;
import o.InterfaceC9738bbJ;
import o.iCG;
import o.iFL;
import o.iGM;
import o.iXA;
import o.iXB;
import o.iXC;

/* JADX INFO: loaded from: classes6.dex */
public final class GenerateLybraRedeemContentUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InterfaceC24182iXy.Activity<iXC>>>, Object> {
    final /* synthetic */ InitialInfoModel $initialInfo;
    final /* synthetic */ TransactionConfig $transactionConfig;
    final /* synthetic */ iXB $userInput;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ iGM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateLybraRedeemContentUseCase$invoke$2(InitialInfoModel initialInfoModel, iXB ixb, iGM igm, TransactionConfig transactionConfig, Continuation<? super GenerateLybraRedeemContentUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$initialInfo = initialInfoModel;
        this.$userInput = ixb;
        this.this$0 = igm;
        this.$transactionConfig = transactionConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenerateLybraRedeemContentUseCase$invoke$2(this.$initialInfo, this.$userInput, this.this$0, this.$transactionConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends InterfaceC24182iXy.Activity<iXC>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<InterfaceC24182iXy.Activity<iXC>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<InterfaceC24182iXy.Activity<iXC>>> continuation) {
        return ((GenerateLybraRedeemContentUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0148 A[Catch: all -> 0x0303, CancellationException -> 0x0313, TryCatch #4 {CancellationException -> 0x0313, all -> 0x0303, blocks: (B:7:0x0024, B:52:0x0142, B:54:0x0148, B:55:0x0159, B:57:0x015f, B:61:0x016e, B:63:0x017b, B:64:0x017f, B:66:0x018e, B:69:0x0216, B:76:0x0271, B:78:0x0277, B:82:0x028b, B:83:0x02eb, B:68:0x01a8, B:70:0x0252, B:12:0x004b, B:24:0x008b, B:27:0x0097, B:31:0x00a0, B:34:0x00ab, B:36:0x00c8, B:41:0x00de, B:43:0x00e4, B:48:0x00fa, B:47:0x00ee, B:40:0x00d2, B:15:0x005c, B:18:0x0064, B:20:0x0070, B:75:0x0267, B:85:0x02fa, B:86:0x02fb, B:87:0x0302, B:72:0x0257), top: B:94:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0252 A[Catch: all -> 0x0303, CancellationException -> 0x0313, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0313, all -> 0x0303, blocks: (B:7:0x0024, B:52:0x0142, B:54:0x0148, B:55:0x0159, B:57:0x015f, B:61:0x016e, B:63:0x017b, B:64:0x017f, B:66:0x018e, B:69:0x0216, B:76:0x0271, B:78:0x0277, B:82:0x028b, B:83:0x02eb, B:68:0x01a8, B:70:0x0252, B:12:0x004b, B:24:0x008b, B:27:0x0097, B:31:0x00a0, B:34:0x00ab, B:36:0x00c8, B:41:0x00de, B:43:0x00e4, B:48:0x00fa, B:47:0x00ee, B:40:0x00d2, B:15:0x005c, B:18:0x0064, B:20:0x0070, B:75:0x0267, B:85:0x02fa, B:86:0x02fb, B:87:0x0302, B:72:0x0257), top: B:94:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0277 A[Catch: all -> 0x0303, CancellationException -> 0x0313, TryCatch #4 {CancellationException -> 0x0313, all -> 0x0303, blocks: (B:7:0x0024, B:52:0x0142, B:54:0x0148, B:55:0x0159, B:57:0x015f, B:61:0x016e, B:63:0x017b, B:64:0x017f, B:66:0x018e, B:69:0x0216, B:76:0x0271, B:78:0x0277, B:82:0x028b, B:83:0x02eb, B:68:0x01a8, B:70:0x0252, B:12:0x004b, B:24:0x008b, B:27:0x0097, B:31:0x00a0, B:34:0x00ab, B:36:0x00c8, B:41:0x00de, B:43:0x00e4, B:48:0x00fa, B:47:0x00ee, B:40:0x00d2, B:15:0x005c, B:18:0x0064, B:20:0x0070, B:75:0x0267, B:85:0x02fa, B:86:0x02fb, B:87:0x0302, B:72:0x0257), top: B:94:0x000a, inners: #3 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        iXB ixb;
        Object objM7377constructorimpl2;
        Object objOLrzqt;
        InitialInfoModel initialInfoModel;
        TransactionConfig transactionConfig;
        iXB ixb2;
        iGM igm;
        String strDbNXlk;
        String strEZpvd;
        String tokenAddress;
        String tokenPrecision;
        TransactionConfig transactionConfig2;
        InterfaceC9738bbJ interfaceC9738bbJ;
        Object objM7386unboximpl;
        iGM igm2;
        InitialInfoModel initialInfoModel2;
        Object next;
        InvestTxModel investTxModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InitialInfoModel initialInfoModel3 = this.$initialInfo;
            ixb = this.$userInput;
            iGM igm3 = this.this$0;
            TransactionConfig transactionConfig3 = this.$transactionConfig;
            Result.Application application2 = Result.Companion;
            if (!(initialInfoModel3 instanceof InitialInfoModel.RedeemInitialInfo)) {
                throw new IllegalArgumentException("initialInfo must be InvestRedeemInitialInfo");
            }
            if (ixb != null && C33129mqd.AEQbTJ(ixb.EZpvd(), "0")) {
                this.L$0 = initialInfoModel3;
                this.L$1 = ixb;
                this.L$2 = igm3;
                this.L$3 = transactionConfig3;
                this.label = 1;
                objOLrzqt = igm3.OLrzqt((Continuation<? super InterfaceC9738bbJ>) this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                initialInfoModel = initialInfoModel3;
                transactionConfig = transactionConfig3;
                ixb2 = ixb;
                igm = igm3;
            } else {
                try {
                    objM7377constructorimpl2 = Result.m7377constructorimpl(igm3.EZpvd.EZpvd(transactionConfig3, (InitialInfoModel.RedeemInitialInfo) initialInfoModel3, ixb));
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                }
                Object objM7377constructorimpl3 = Result.m7377constructorimpl(objM7377constructorimpl2);
                C56391yDq.AEQbTJ(objM7377constructorimpl3);
                objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC24182iXy.Activity) objM7377constructorimpl3);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) this.L$4;
                TransactionConfig transactionConfig4 = (TransactionConfig) this.L$3;
                igm2 = (iGM) this.L$2;
                ixb = (iXB) this.L$1;
                initialInfoModel2 = (InitialInfoModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                interfaceC9738bbJ = interfaceC9738bbJ2;
                transactionConfig2 = transactionConfig4;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    objM7377constructorimpl2 = Result.m7377constructorimpl(objM7386unboximpl);
                } else {
                    Result.Application application4 = Result.Companion;
                    RedeemDetailsAndGasFee redeemDetailsAndGasFee = (RedeemDetailsAndGasFee) objM7386unboximpl;
                    InvestGasPriceConfig investGasPriceConfigValueOf = redeemDetailsAndGasFee.valueOf();
                    List<TransactionStep> newProxyInstance = redeemDetailsAndGasFee.getNewProxyInstance();
                    Iterator<T> it = newProxyInstance.iterator();
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
                    TransactionStep transactionStep = (TransactionStep) next;
                    String strAEQbTJ = ixb.AEQbTJ();
                    if (strAEQbTJ.length() == 0) {
                        strAEQbTJ = igm2.EZpvd(transactionConfig2, investGasPriceConfigValueOf);
                    }
                    String str = strAEQbTJ;
                    iXC ixcKWHzl = igm2.EZpvd.KWHzl(transactionConfig2, (InitialInfoModel.RedeemInitialInfo) initialInfoModel2, ixb, redeemDetailsAndGasFee);
                    if (transactionStep == null || (investTxModel = iCG.copydefault.KWHzl(transactionStep, interfaceC9738bbJ, transactionConfig2, (InitialInfoModel.RedeemInitialInfo) initialInfoModel2, redeemDetailsAndGasFee, investGasPriceConfigValueOf, ixb, str, str, (1024 & 256) != 0 ? null : null, (1024 & 512) != 0 ? null : null, (1024 & 1024) != 0 ? null : null)) == null) {
                        investTxModel = new InvestTxModel(0, (String) null, (String) null, (List) null, (Long) null, 0L, (String) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -1, 65535, (DefaultConstructorMarker) null);
                    }
                    objM7377constructorimpl2 = Result.m7377constructorimpl(ixcKWHzl.KWHzl((16777087 & 1) != 0 ? ixcKWHzl.AkhnZx : false, (16777087 & 2) != 0 ? ixcKWHzl.fetchVPNInfo : false, (16777087 & 4) != 0 ? ixcKWHzl.valueOf : null, (16777087 & 8) != 0 ? ixcKWHzl.values : 0L, (16777087 & 16) != 0 ? ixcKWHzl.djBIcL : 0, (16777087 & 32) != 0 ? ixcKWHzl.EZpvd : 0L, (16777087 & 64) != 0 ? ixcKWHzl.DbNXlk : 0, (16777087 & 128) != 0 ? ixcKWHzl.fARcdN : null, (16777087 & 256) != 0 ? ixcKWHzl.fIwbmz : null, (16777087 & 512) != 0 ? ixcKWHzl.KWHzl : null, (16777087 & 1024) != 0 ? ixcKWHzl.gEmmrt : null, (16777087 & 2048) != 0 ? ixcKWHzl.AYXKKw : null, (16777087 & 4096) != 0 ? ixcKWHzl.iwGUEr : null, (16777087 & 8192) != 0 ? ixcKWHzl.OLrzqt : null, (16777087 & 16384) != 0 ? ixcKWHzl.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixcKWHzl.getFieldNames : null, (16777087 & 65536) != 0 ? ixcKWHzl.ejfBZ : null, (16777087 & 131072) != 0 ? ixcKWHzl.isConnected : false, (16777087 & 262144) != 0 ? ixcKWHzl.uzCIH : newProxyInstance, (16777087 & 524288) != 0 ? ixcKWHzl.AhwBna : investGasPriceConfigValueOf, (16777087 & 1048576) != 0 ? ixcKWHzl.copydefault : investTxModel, (16777087 & 2097152) != 0 ? ixcKWHzl.AuCTel : null, (16777087 & 4194304) != 0 ? ixcKWHzl.fJNWhG : null, (16777087 & 8388608) != 0 ? ixcKWHzl.AEQbTJ : 0));
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                    Result.Application application5 = Result.Companion;
                    iXC ixc = (iXC) objM7377constructorimpl2;
                    iXA ixaEZpvd = ixc.EZpvd();
                    objM7377constructorimpl2 = new InterfaceC24182iXy.Activity(ixc.KWHzl((16777087 & 1) != 0 ? ixc.AkhnZx : false, (16777087 & 2) != 0 ? ixc.fetchVPNInfo : false, (16777087 & 4) != 0 ? ixc.valueOf : null, (16777087 & 8) != 0 ? ixc.values : 0L, (16777087 & 16) != 0 ? ixc.djBIcL : 0, (16777087 & 32) != 0 ? ixc.EZpvd : 0L, (16777087 & 64) != 0 ? ixc.DbNXlk : 0, (16777087 & 128) != 0 ? ixc.fARcdN : null, (16777087 & 256) != 0 ? ixc.fIwbmz : null, (16777087 & 512) != 0 ? ixc.KWHzl : ixaEZpvd.AEQbTJ((1032191 & 1) != 0 ? ixaEZpvd.AuCTel : null, (1032191 & 2) != 0 ? ixaEZpvd.DbNXlk : false, (1032191 & 4) != 0 ? ixaEZpvd.copydefault : null, (1032191 & 8) != 0 ? ixaEZpvd.AYXKKw : null, (1032191 & 16) != 0 ? ixaEZpvd.ejfBZ : null, (1032191 & 32) != 0 ? ixaEZpvd.fARcdN : null, (1032191 & 64) != 0 ? ixaEZpvd.djBIcL : null, (1032191 & 128) != 0 ? ixaEZpvd.EZpvd : 0, (1032191 & 256) != 0 ? ixaEZpvd.fIwbmz : 0, (1032191 & 512) != 0 ? ixaEZpvd.AkhnZx : false, (1032191 & 1024) != 0 ? ixaEZpvd.values : false, (1032191 & 2048) != 0 ? ixaEZpvd.fJNWhG : null, (1032191 & 4096) != 0 ? ixaEZpvd.KWHzl : null, (1032191 & 8192) != 0 ? ixaEZpvd.AEQbTJ : null, (1032191 & 16384) != 0 ? ixaEZpvd.isConnected : null, (1032191 & 32768) != 0 ? ixaEZpvd.AhwBna : ixb == null, (1032191 & 65536) != 0 ? ixaEZpvd.valueOf : false, (1032191 & 131072) != 0 ? ixaEZpvd.OLrzqt : false, (1032191 & 262144) != 0 ? ixaEZpvd.fetchVPNInfo : false, (1032191 & 524288) != 0 ? ixaEZpvd.gEmmrt : false), (16777087 & 1024) != 0 ? ixc.gEmmrt : null, (16777087 & 2048) != 0 ? ixc.AYXKKw : null, (16777087 & 4096) != 0 ? ixc.iwGUEr : null, (16777087 & 8192) != 0 ? ixc.OLrzqt : null, (16777087 & 16384) != 0 ? ixc.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixc.getFieldNames : null, (16777087 & 65536) != 0 ? ixc.ejfBZ : null, (16777087 & 131072) != 0 ? ixc.isConnected : false, (16777087 & 262144) != 0 ? ixc.uzCIH : null, (16777087 & 524288) != 0 ? ixc.AhwBna : null, (16777087 & 1048576) != 0 ? ixc.copydefault : null, (16777087 & 2097152) != 0 ? ixc.AuCTel : null, (16777087 & 4194304) != 0 ? ixc.fJNWhG : null, (16777087 & 8388608) != 0 ? ixc.AEQbTJ : 0));
                }
                Object objM7377constructorimpl32 = Result.m7377constructorimpl(objM7377constructorimpl2);
                C56391yDq.AEQbTJ(objM7377constructorimpl32);
                objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC24182iXy.Activity) objM7377constructorimpl32);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            transactionConfig = (TransactionConfig) this.L$3;
            igm = (iGM) this.L$2;
            ixb2 = (iXB) this.L$1;
            initialInfoModel = (InitialInfoModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        InterfaceC9738bbJ interfaceC9738bbJ3 = (InterfaceC9738bbJ) objOLrzqt;
        iFL ifl = igm.OLrzqt;
        if (interfaceC9738bbJ3 == null || (strDbNXlk = interfaceC9738bbJ3.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        if (interfaceC9738bbJ3 == null || (strEZpvd = interfaceC9738bbJ3.EZpvd(transactionConfig.copydefault())) == null) {
            strEZpvd = "";
        }
        String plainString = C33129mqd.EZpvd(ixb2.EZpvd()).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        long jIsConnected = transactionConfig.isConnected();
        int iAkhnZx = transactionConfig.AkhnZx();
        InvestTokenWithAmount investTokenWithAmountDjBIcL = ixb2.djBIcL();
        if (investTokenWithAmountDjBIcL == null || (tokenAddress = investTokenWithAmountDjBIcL.getTokenAddress()) == null) {
            tokenAddress = ((InitialInfoModel.RedeemInitialInfo) initialInfoModel).fIwbmz().getTokenAddress();
        }
        String str2 = tokenAddress;
        InvestTokenWithAmount investTokenWithAmountDjBIcL2 = ixb2.djBIcL();
        if (investTokenWithAmountDjBIcL2 == null || (tokenPrecision = investTokenWithAmountDjBIcL2.getTokenPrecision()) == null) {
            tokenPrecision = ((InitialInfoModel.RedeemInitialInfo) initialInfoModel).fIwbmz().getTokenPrecision();
        }
        InvestRedeemReceiveReq investRedeemReceiveReq = new InvestRedeemReceiveReq(strDbNXlk, strEZpvd, plainString, jIsConnected, iAkhnZx, str2, tokenPrecision, C56443yFo.KWHzl(transactionConfig.AwvSrB()), "", (String) null, transactionConfig.fJNWhG(), (String) null, (Boolean) null, (String) null, (Long) null, 31232, (DefaultConstructorMarker) null);
        this.L$0 = initialInfoModel;
        this.L$1 = ixb2;
        this.L$2 = igm;
        this.L$3 = transactionConfig;
        this.L$4 = interfaceC9738bbJ3;
        this.label = 2;
        Object objKWHzl = ifl.KWHzl(investRedeemReceiveReq, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        transactionConfig2 = transactionConfig;
        interfaceC9738bbJ = interfaceC9738bbJ3;
        InitialInfoModel initialInfoModel4 = initialInfoModel;
        objM7386unboximpl = objKWHzl;
        igm2 = igm;
        ixb = ixb2;
        initialInfoModel2 = initialInfoModel4;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
        }
        Object objM7377constructorimpl322 = Result.m7377constructorimpl(objM7377constructorimpl2);
        C56391yDq.AEQbTJ(objM7377constructorimpl322);
        objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC24182iXy.Activity) objM7377constructorimpl322);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
