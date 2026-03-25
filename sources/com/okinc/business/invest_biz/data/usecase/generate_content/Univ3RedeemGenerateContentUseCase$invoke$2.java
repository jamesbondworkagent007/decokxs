package com.okinc.business.invest_biz.data.usecase.generate_content;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
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
import o.InterfaceC24182iXy;
import o.InterfaceC9738bbJ;
import o.iCG;
import o.iGR;
import o.iXB;
import o.iXC;

/* JADX INFO: loaded from: classes6.dex */
public final class Univ3RedeemGenerateContentUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InterfaceC24182iXy.Activity<iXC>>>, Object> {
    final /* synthetic */ InitialInfoModel $initialInfo;
    final /* synthetic */ TransactionConfig $transactionConfig;
    final /* synthetic */ iXB $userInput;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ iGR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Univ3RedeemGenerateContentUseCase$invoke$2(InitialInfoModel initialInfoModel, iXB ixb, iGR igr, TransactionConfig transactionConfig, Continuation<? super Univ3RedeemGenerateContentUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$initialInfo = initialInfoModel;
        this.$userInput = ixb;
        this.this$0 = igr;
        this.$transactionConfig = transactionConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Univ3RedeemGenerateContentUseCase$invoke$2(this.$initialInfo, this.$userInput, this.this$0, this.$transactionConfig, continuation);
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
        return ((Univ3RedeemGenerateContentUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0106 A[Catch: all -> 0x0264, CancellationException -> 0x0274, TryCatch #4 {CancellationException -> 0x0274, all -> 0x0264, blocks: (B:7:0x0024, B:41:0x0100, B:43:0x0106, B:44:0x0117, B:46:0x011d, B:50:0x012c, B:52:0x0139, B:53:0x013d, B:55:0x014c, B:59:0x01d7, B:66:0x0238, B:68:0x023e, B:70:0x0250, B:69:0x024c, B:58:0x0169, B:60:0x0219, B:12:0x004c, B:26:0x0094, B:28:0x009f, B:30:0x00a5, B:35:0x00ba, B:37:0x00e5, B:34:0x00ae, B:36:0x00e2, B:15:0x0060, B:18:0x0068, B:22:0x007d, B:20:0x0074, B:65:0x022e, B:72:0x025b, B:73:0x025c, B:74:0x0263, B:62:0x021e), top: B:81:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0219 A[Catch: all -> 0x0264, CancellationException -> 0x0274, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0274, all -> 0x0264, blocks: (B:7:0x0024, B:41:0x0100, B:43:0x0106, B:44:0x0117, B:46:0x011d, B:50:0x012c, B:52:0x0139, B:53:0x013d, B:55:0x014c, B:59:0x01d7, B:66:0x0238, B:68:0x023e, B:70:0x0250, B:69:0x024c, B:58:0x0169, B:60:0x0219, B:12:0x004c, B:26:0x0094, B:28:0x009f, B:30:0x00a5, B:35:0x00ba, B:37:0x00e5, B:34:0x00ae, B:36:0x00e2, B:15:0x0060, B:18:0x0068, B:22:0x007d, B:20:0x0074, B:65:0x022e, B:72:0x025b, B:73:0x025c, B:74:0x0263, B:62:0x021e), top: B:81:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023e A[Catch: all -> 0x0264, CancellationException -> 0x0274, TryCatch #4 {CancellationException -> 0x0274, all -> 0x0264, blocks: (B:7:0x0024, B:41:0x0100, B:43:0x0106, B:44:0x0117, B:46:0x011d, B:50:0x012c, B:52:0x0139, B:53:0x013d, B:55:0x014c, B:59:0x01d7, B:66:0x0238, B:68:0x023e, B:70:0x0250, B:69:0x024c, B:58:0x0169, B:60:0x0219, B:12:0x004c, B:26:0x0094, B:28:0x009f, B:30:0x00a5, B:35:0x00ba, B:37:0x00e5, B:34:0x00ae, B:36:0x00e2, B:15:0x0060, B:18:0x0068, B:22:0x007d, B:20:0x0074, B:65:0x022e, B:72:0x025b, B:73:0x025c, B:74:0x0263, B:62:0x021e), top: B:81:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024c A[Catch: all -> 0x0264, CancellationException -> 0x0274, TryCatch #4 {CancellationException -> 0x0274, all -> 0x0264, blocks: (B:7:0x0024, B:41:0x0100, B:43:0x0106, B:44:0x0117, B:46:0x011d, B:50:0x012c, B:52:0x0139, B:53:0x013d, B:55:0x014c, B:59:0x01d7, B:66:0x0238, B:68:0x023e, B:70:0x0250, B:69:0x024c, B:58:0x0169, B:60:0x0219, B:12:0x004c, B:26:0x0094, B:28:0x009f, B:30:0x00a5, B:35:0x00ba, B:37:0x00e5, B:34:0x00ae, B:36:0x00e2, B:15:0x0060, B:18:0x0068, B:22:0x007d, B:20:0x0074, B:65:0x022e, B:72:0x025b, B:73:0x025c, B:74:0x0263, B:62:0x021e), top: B:81:0x000a, inners: #3 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        iGR igr;
        Object objM7377constructorimpl2;
        Object objOLrzqt;
        InitialInfoModel initialInfoModel;
        TransactionConfig transactionConfig;
        iXB ixb;
        TransactionConfig transactionConfig2;
        InterfaceC9738bbJ interfaceC9738bbJ;
        iGR igr2;
        iXB ixb2;
        Object objM7386unboximpl;
        String coinAmount;
        Object objM7377constructorimpl3;
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
            InitialInfoModel initialInfoModel2 = this.$initialInfo;
            iXB ixb3 = this.$userInput;
            igr = this.this$0;
            TransactionConfig transactionConfig3 = this.$transactionConfig;
            Result.Application application2 = Result.Companion;
            if (!(initialInfoModel2 instanceof InitialInfoModel.RedeemInitialInfo)) {
                throw new IllegalArgumentException("initialInfo must be InvestRedeemInitialInfo");
            }
            if ((ixb3 != null && C33129mqd.AEQbTJ(ixb3.EZpvd(), "0")) || ((InitialInfoModel.RedeemInitialInfo) initialInfoModel2).valueOf()) {
                this.L$0 = initialInfoModel2;
                this.L$1 = ixb3;
                this.L$2 = igr;
                this.L$3 = transactionConfig3;
                this.label = 1;
                objOLrzqt = igr.OLrzqt(this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                initialInfoModel = initialInfoModel2;
                transactionConfig = transactionConfig3;
                ixb = ixb3;
            } else {
                try {
                    objM7377constructorimpl2 = Result.m7377constructorimpl(igr.AEQbTJ.EZpvd(transactionConfig3, (InitialInfoModel.RedeemInitialInfo) initialInfoModel2, ixb3));
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                }
                C56391yDq.AEQbTJ(objM7377constructorimpl3);
                objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC24182iXy.Activity) objM7377constructorimpl3);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iXB ixb4 = (iXB) this.L$4;
                InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) this.L$3;
                TransactionConfig transactionConfig4 = (TransactionConfig) this.L$2;
                igr2 = (iGR) this.L$1;
                initialInfoModel = (InitialInfoModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                ixb2 = ixb4;
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
                    String strAEQbTJ = ixb2.AEQbTJ();
                    if (strAEQbTJ.length() == 0) {
                        strAEQbTJ = igr2.EZpvd(transactionConfig2, investGasPriceConfigValueOf);
                    }
                    String str = strAEQbTJ;
                    iXC ixcEZpvd = igr2.AEQbTJ.EZpvd(transactionConfig2, (InitialInfoModel.RedeemInitialInfo) initialInfoModel, ixb2, redeemDetailsAndGasFee);
                    if (transactionStep == null || (investTxModel = iCG.copydefault.copydefault(transactionStep, interfaceC9738bbJ, transactionConfig2, (InitialInfoModel.RedeemInitialInfo) initialInfoModel, redeemDetailsAndGasFee, investGasPriceConfigValueOf, ixb2, str, str, (256 & 256) != 0 ? null : null, (256 & 512) != 0 ? null : transactionConfig2.ejfBZ(), (256 & 1024) != 0 ? null : redeemDetailsAndGasFee.uzCIH())) == null) {
                        investTxModel = new InvestTxModel(0, (String) null, (String) null, (List) null, (Long) null, 0L, (String) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -1, 65535, (DefaultConstructorMarker) null);
                    }
                    objM7377constructorimpl2 = Result.m7377constructorimpl(ixcEZpvd.KWHzl((16777087 & 1) != 0 ? ixcEZpvd.AkhnZx : false, (16777087 & 2) != 0 ? ixcEZpvd.fetchVPNInfo : false, (16777087 & 4) != 0 ? ixcEZpvd.valueOf : null, (16777087 & 8) != 0 ? ixcEZpvd.values : 0L, (16777087 & 16) != 0 ? ixcEZpvd.djBIcL : 0, (16777087 & 32) != 0 ? ixcEZpvd.EZpvd : 0L, (16777087 & 64) != 0 ? ixcEZpvd.DbNXlk : 0, (16777087 & 128) != 0 ? ixcEZpvd.fARcdN : null, (16777087 & 256) != 0 ? ixcEZpvd.fIwbmz : null, (16777087 & 512) != 0 ? ixcEZpvd.KWHzl : null, (16777087 & 1024) != 0 ? ixcEZpvd.gEmmrt : null, (16777087 & 2048) != 0 ? ixcEZpvd.AYXKKw : null, (16777087 & 4096) != 0 ? ixcEZpvd.iwGUEr : null, (16777087 & 8192) != 0 ? ixcEZpvd.OLrzqt : null, (16777087 & 16384) != 0 ? ixcEZpvd.getNewProxyInstance : null, (16777087 & 32768) != 0 ? ixcEZpvd.getFieldNames : null, (16777087 & 65536) != 0 ? ixcEZpvd.ejfBZ : null, (16777087 & 131072) != 0 ? ixcEZpvd.isConnected : false, (16777087 & 262144) != 0 ? ixcEZpvd.uzCIH : newProxyInstance, (16777087 & 524288) != 0 ? ixcEZpvd.AhwBna : investGasPriceConfigValueOf, (16777087 & 1048576) != 0 ? ixcEZpvd.copydefault : investTxModel, (16777087 & 2097152) != 0 ? ixcEZpvd.AuCTel : null, (16777087 & 4194304) != 0 ? ixcEZpvd.fJNWhG : null, (16777087 & 8388608) != 0 ? ixcEZpvd.AEQbTJ : ((InitialInfoModel.RedeemInitialInfo) initialInfoModel).getNewProxyInstance()));
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                    Result.Application application5 = Result.Companion;
                    objM7377constructorimpl3 = Result.m7377constructorimpl(new InterfaceC24182iXy.Activity((iXC) objM7377constructorimpl2));
                } else {
                    objM7377constructorimpl3 = Result.m7377constructorimpl(objM7377constructorimpl2);
                }
                C56391yDq.AEQbTJ(objM7377constructorimpl3);
                objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC24182iXy.Activity) objM7377constructorimpl3);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            transactionConfig = (TransactionConfig) this.L$3;
            iGR igr3 = (iGR) this.L$2;
            iXB ixb5 = (iXB) this.L$1;
            InitialInfoModel initialInfoModel3 = (InitialInfoModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            ixb = ixb5;
            initialInfoModel = initialInfoModel3;
            igr = igr3;
            objOLrzqt = obj;
        }
        InterfaceC9738bbJ interfaceC9738bbJ3 = (InterfaceC9738bbJ) objOLrzqt;
        if (((InitialInfoModel.RedeemInitialInfo) initialInfoModel).valueOf()) {
            InvestOrder investOrderAhwBna = transactionConfig.AhwBna();
            if (investOrderAhwBna == null || (coinAmount = investOrderAhwBna.getStakedAmount()) == null) {
                coinAmount = ((InitialInfoModel.RedeemInitialInfo) initialInfoModel).fIwbmz().getCoinAmount();
            }
            ixb = new iXB(coinAmount, ((InitialInfoModel.RedeemInitialInfo) initialInfoModel).fIwbmz(), TransactionStage.CONFIRMATION, null, null, null, 0L, ((InitialInfoModel.RedeemInitialInfo) initialInfoModel).fIwbmz(), 0, false, false, false, 3960, null);
        } else {
            Intrinsics.copydefault(ixb);
        }
        this.L$0 = initialInfoModel;
        this.L$1 = igr;
        this.L$2 = transactionConfig;
        this.L$3 = interfaceC9738bbJ3;
        this.L$4 = ixb;
        this.label = 2;
        Object objKWHzl = igr.KWHzl(transactionConfig, (InitialInfoModel.RedeemInitialInfo) initialInfoModel, ixb, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        transactionConfig2 = transactionConfig;
        interfaceC9738bbJ = interfaceC9738bbJ3;
        igr2 = igr;
        ixb2 = ixb;
        objM7386unboximpl = objKWHzl;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl3);
        objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC24182iXy.Activity) objM7377constructorimpl3);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
