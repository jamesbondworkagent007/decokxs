package o;

import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateDotSwapInvestContentUseCase$invoke$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateDotSwapInvestContentUseCase$invoke$2;
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
public final class iGI extends iXE {
    public final CoroutineDispatcher AEQbTJ;
    public final iCR EZpvd;
    public final iFN KWHzl;
    public final InterfaceC23916iOb OLrzqt;
    public final C27164jpy copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iGI(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iFN ifn, @NotNull C27164jpy c27164jpy, @NotNull iCR icr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(interfaceC23916iOb, c27164jpy);
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(ifn, "");
        Intrinsics.checkNotNullParameter(c27164jpy, "");
        Intrinsics.checkNotNullParameter(icr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC23916iOb;
        this.KWHzl = ifn;
        this.copydefault = c27164jpy;
        this.EZpvd = icr;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iXE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel initialInfoModel, iXB ixb, @NotNull Continuation<? super Result<? extends InterfaceC24182iXy>> continuation) throws java.lang.Throwable {
        GenerateDotSwapInvestContentUseCase$invoke$1 generateDotSwapInvestContentUseCase$invoke$1;
        if (continuation instanceof GenerateDotSwapInvestContentUseCase$invoke$1) {
            generateDotSwapInvestContentUseCase$invoke$1 = (GenerateDotSwapInvestContentUseCase$invoke$1) continuation;
            int i = generateDotSwapInvestContentUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateDotSwapInvestContentUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                generateDotSwapInvestContentUseCase$invoke$1 = new GenerateDotSwapInvestContentUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = generateDotSwapInvestContentUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateDotSwapInvestContentUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
        GenerateDotSwapInvestContentUseCase$invoke$2 generateDotSwapInvestContentUseCase$invoke$2 = new GenerateDotSwapInvestContentUseCase$invoke$2(initialInfoModel, ixb, this, transactionConfig, null);
        generateDotSwapInvestContentUseCase$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, generateDotSwapInvestContentUseCase$invoke$2, generateDotSwapInvestContentUseCase$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(TransactionConfig transactionConfig, InitialInfoModel.InvestInitialInfo investInitialInfo, iXB ixb, Continuation<? super Result<InvestDetailsAndGasFee>> continuation) throws java.lang.Throwable {
        GenerateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1 generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1;
        TransactionConfig transactionConfig2;
        InitialInfoModel.InvestInitialInfo investInitialInfo2;
        iXB ixb2;
        java.lang.Object objOLrzqt;
        iGI igi;
        if (continuation instanceof GenerateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1) {
            generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1 = (GenerateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1) continuation;
            int i = generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.label = i - Integer.MIN_VALUE;
            } else {
                generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1 = new GenerateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1(this, continuation);
            }
        }
        java.lang.Object obj = generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.L$0 = this;
                transactionConfig2 = transactionConfig;
                generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.L$1 = transactionConfig2;
                investInitialInfo2 = investInitialInfo;
                generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.L$2 = investInitialInfo2;
                ixb2 = ixb;
                generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.L$3 = ixb2;
                generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.label = 1;
                objOLrzqt = OLrzqt(generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                igi = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return ((Result) obj).m7386unboximpl();
                }
                iXB ixb3 = (iXB) generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.L$3;
                InitialInfoModel.InvestInitialInfo investInitialInfo3 = (InitialInfoModel.InvestInitialInfo) generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.L$2;
                TransactionConfig transactionConfig3 = (TransactionConfig) generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.L$1;
                igi = (iGI) generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.L$0;
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
            iFN ifn = igi.KWHzl;
            iDD.TaskDescription taskDescription = iDD.Companion;
            java.lang.String plainString = C33129mqd.EZpvd(ixb2.EZpvd()).toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "");
            java.lang.String strAEQbTJ = ixb2.AEQbTJ();
            InvestTokenWithAmount investTokenWithAmountDjBIcL = ixb2.djBIcL();
            InvestSubscriptionReceiveReq investSubscriptionReceiveReqKWHzl = taskDescription.KWHzl(transactionConfig2, plainString, strAEQbTJ, str, str2, investTokenWithAmountDjBIcL == null ? (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investInitialInfo2.AYXKKw()) : investTokenWithAmountDjBIcL);
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(transactionConfig2.copydefault()));
            generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.L$0 = null;
            generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.L$1 = null;
            generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.L$2 = null;
            generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.L$3 = null;
            generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1.label = 2;
            java.lang.Object objEZpvd = ifn.EZpvd(investSubscriptionReceiveReqKWHzl, strGEmmrt, transactionConfig2, generateDotSwapInvestContentUseCase$fetchReceiveInfoApi$1);
            return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
