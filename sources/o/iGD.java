package o;

import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateBabylonInvestContentUseCase$fetchReceiveInfoApi$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateBabylonInvestContentUseCase$invoke$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateBabylonInvestContentUseCase$invoke$2;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.iDD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iGD extends iXE {
    public final C27164jpy AEQbTJ;
    public final iDH AhwBna;
    public final iFN EZpvd;
    public final iCN KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC23916iOb copydefault;
    public java.util.List<InvestValidatorListItems> djBIcL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public iGD(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iFN ifn, @NotNull C27164jpy c27164jpy, @NotNull iDH idh, @NotNull iCN icn, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(interfaceC23916iOb, c27164jpy);
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(ifn, "");
        Intrinsics.checkNotNullParameter(c27164jpy, "");
        Intrinsics.checkNotNullParameter(idh, "");
        Intrinsics.checkNotNullParameter(icn, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC23916iOb;
        this.EZpvd = ifn;
        this.AEQbTJ = c27164jpy;
        this.AhwBna = idh;
        this.KWHzl = icn;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iXE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel initialInfoModel, iXB ixb, @NotNull Continuation<? super Result<? extends InterfaceC24182iXy>> continuation) throws java.lang.Throwable {
        GenerateBabylonInvestContentUseCase$invoke$1 generateBabylonInvestContentUseCase$invoke$1;
        if (continuation instanceof GenerateBabylonInvestContentUseCase$invoke$1) {
            generateBabylonInvestContentUseCase$invoke$1 = (GenerateBabylonInvestContentUseCase$invoke$1) continuation;
            int i = generateBabylonInvestContentUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateBabylonInvestContentUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                generateBabylonInvestContentUseCase$invoke$1 = new GenerateBabylonInvestContentUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = generateBabylonInvestContentUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateBabylonInvestContentUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
        GenerateBabylonInvestContentUseCase$invoke$2 generateBabylonInvestContentUseCase$invoke$2 = new GenerateBabylonInvestContentUseCase$invoke$2(initialInfoModel, this, transactionConfig, ixb, null);
        generateBabylonInvestContentUseCase$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, generateBabylonInvestContentUseCase$invoke$2, generateBabylonInvestContentUseCase$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(TransactionConfig transactionConfig, InitialInfoModel.InvestInitialInfo investInitialInfo, iXB ixb, Continuation<? super Result<InvestDetailsAndGasFee>> continuation) throws java.lang.Throwable {
        GenerateBabylonInvestContentUseCase$fetchReceiveInfoApi$1 generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1;
        TransactionConfig transactionConfig2;
        InitialInfoModel.InvestInitialInfo investInitialInfo2;
        iXB ixb2;
        java.lang.Object objOLrzqt;
        iGD igd;
        if (continuation instanceof GenerateBabylonInvestContentUseCase$fetchReceiveInfoApi$1) {
            generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1 = (GenerateBabylonInvestContentUseCase$fetchReceiveInfoApi$1) continuation;
            int i = generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.label = i - Integer.MIN_VALUE;
            } else {
                generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1 = new GenerateBabylonInvestContentUseCase$fetchReceiveInfoApi$1(this, continuation);
            }
        }
        java.lang.Object obj = generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.L$0 = this;
                transactionConfig2 = transactionConfig;
                generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.L$1 = transactionConfig2;
                investInitialInfo2 = investInitialInfo;
                generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.L$2 = investInitialInfo2;
                ixb2 = ixb;
                generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.L$3 = ixb2;
                generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.label = 1;
                objOLrzqt = OLrzqt(generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                igd = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return ((Result) obj).m7386unboximpl();
                }
                iXB ixb3 = (iXB) generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.L$3;
                InitialInfoModel.InvestInitialInfo investInitialInfo3 = (InitialInfoModel.InvestInitialInfo) generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.L$2;
                TransactionConfig transactionConfig3 = (TransactionConfig) generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.L$1;
                igd = (iGD) generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                transactionConfig2 = transactionConfig3;
                ixb2 = ixb3;
                investInitialInfo2 = investInitialInfo3;
            }
            InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objOLrzqt;
            java.lang.String strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
            java.lang.String str = strDbNXlk == null ? "" : strDbNXlk;
            java.lang.String strEZpvd = interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(transactionConfig2.copydefault()) : null;
            java.lang.String str2 = strEZpvd == null ? "" : strEZpvd;
            iFN ifn = igd.EZpvd;
            iDD.TaskDescription taskDescription = iDD.Companion;
            java.lang.String plainString = C33129mqd.EZpvd(ixb2.EZpvd()).toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "");
            java.lang.String strAEQbTJ = ixb2.AEQbTJ();
            InvestTokenWithAmount investTokenWithAmountDjBIcL = ixb2.djBIcL();
            InvestSubscriptionReceiveReq investSubscriptionReceiveReqKWHzl = taskDescription.KWHzl(transactionConfig2, plainString, strAEQbTJ, str, str2, investTokenWithAmountDjBIcL == null ? (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investInitialInfo2.AYXKKw()) : investTokenWithAmountDjBIcL);
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(transactionConfig2.copydefault()));
            generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.L$0 = null;
            generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.L$1 = null;
            generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.L$2 = null;
            generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.L$3 = null;
            generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1.label = 2;
            java.lang.Object objEZpvd = ifn.EZpvd(investSubscriptionReceiveReqKWHzl, strGEmmrt, transactionConfig2, generateBabylonInvestContentUseCase$fetchReceiveInfoApi$1);
            return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
