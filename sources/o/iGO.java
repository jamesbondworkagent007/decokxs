package o;

import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.data.usecase.generate_content.RedeemGenerateContentUseCase$getReceiveInfo$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.RedeemGenerateContentUseCase$invoke$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.RedeemGenerateContentUseCase$invoke$2;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iGO extends iXE {
    public final InterfaceC23916iOb AEQbTJ;
    public final C27164jpy EZpvd;
    public final iFL KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final iCU copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public iGO(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iFL ifl, @NotNull C27164jpy c27164jpy, @NotNull iCU icu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(interfaceC23916iOb, c27164jpy);
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(ifl, "");
        Intrinsics.checkNotNullParameter(c27164jpy, "");
        Intrinsics.checkNotNullParameter(icu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC23916iOb;
        this.KWHzl = ifl;
        this.EZpvd = c27164jpy;
        this.copydefault = icu;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iXE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel initialInfoModel, iXB ixb, @NotNull Continuation<? super Result<? extends InterfaceC24182iXy>> continuation) throws java.lang.Throwable {
        RedeemGenerateContentUseCase$invoke$1 redeemGenerateContentUseCase$invoke$1;
        if (continuation instanceof RedeemGenerateContentUseCase$invoke$1) {
            redeemGenerateContentUseCase$invoke$1 = (RedeemGenerateContentUseCase$invoke$1) continuation;
            int i = redeemGenerateContentUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redeemGenerateContentUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                redeemGenerateContentUseCase$invoke$1 = new RedeemGenerateContentUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = redeemGenerateContentUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = redeemGenerateContentUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            RedeemGenerateContentUseCase$invoke$2 redeemGenerateContentUseCase$invoke$2 = new RedeemGenerateContentUseCase$invoke$2(initialInfoModel, ixb, this, transactionConfig, null);
            redeemGenerateContentUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, redeemGenerateContentUseCase$invoke$2, redeemGenerateContentUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(TransactionConfig transactionConfig, InitialInfoModel.RedeemInitialInfo redeemInitialInfo, iXB ixb, Continuation<? super Result<RedeemDetailsAndGasFee>> continuation) throws java.lang.Throwable {
        RedeemGenerateContentUseCase$getReceiveInfo$1 redeemGenerateContentUseCase$getReceiveInfo$1;
        TransactionConfig transactionConfig2;
        InitialInfoModel.RedeemInitialInfo redeemInitialInfo2;
        iXB ixb2;
        java.lang.Object objOLrzqt;
        iGO igo;
        java.lang.String tokenAddress;
        java.lang.String tokenPrecision;
        java.lang.String strEjfBZ;
        java.lang.String strEZpvd;
        java.lang.String strDbNXlk;
        if (continuation instanceof RedeemGenerateContentUseCase$getReceiveInfo$1) {
            redeemGenerateContentUseCase$getReceiveInfo$1 = (RedeemGenerateContentUseCase$getReceiveInfo$1) continuation;
            int i = redeemGenerateContentUseCase$getReceiveInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redeemGenerateContentUseCase$getReceiveInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                redeemGenerateContentUseCase$getReceiveInfo$1 = new RedeemGenerateContentUseCase$getReceiveInfo$1(this, continuation);
            }
        }
        java.lang.Object obj = redeemGenerateContentUseCase$getReceiveInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = redeemGenerateContentUseCase$getReceiveInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            redeemGenerateContentUseCase$getReceiveInfo$1.L$0 = this;
            transactionConfig2 = transactionConfig;
            redeemGenerateContentUseCase$getReceiveInfo$1.L$1 = transactionConfig2;
            redeemInitialInfo2 = redeemInitialInfo;
            redeemGenerateContentUseCase$getReceiveInfo$1.L$2 = redeemInitialInfo2;
            ixb2 = ixb;
            redeemGenerateContentUseCase$getReceiveInfo$1.L$3 = ixb2;
            redeemGenerateContentUseCase$getReceiveInfo$1.label = 1;
            objOLrzqt = OLrzqt(redeemGenerateContentUseCase$getReceiveInfo$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            igo = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            iXB ixb3 = (iXB) redeemGenerateContentUseCase$getReceiveInfo$1.L$3;
            InitialInfoModel.RedeemInitialInfo redeemInitialInfo3 = (InitialInfoModel.RedeemInitialInfo) redeemGenerateContentUseCase$getReceiveInfo$1.L$2;
            TransactionConfig transactionConfig3 = (TransactionConfig) redeemGenerateContentUseCase$getReceiveInfo$1.L$1;
            igo = (iGO) redeemGenerateContentUseCase$getReceiveInfo$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
            transactionConfig2 = transactionConfig3;
            ixb2 = ixb3;
            redeemInitialInfo2 = redeemInitialInfo3;
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objOLrzqt;
        InvestTokenWithAmount investTokenWithAmountFIwbmz = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(redeemInitialInfo2.iwGUEr());
        if (investTokenWithAmountFIwbmz == null) {
            investTokenWithAmountFIwbmz = redeemInitialInfo2.fIwbmz();
        }
        iFL ifl = igo.KWHzl;
        java.lang.String str = (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) ? "" : strDbNXlk;
        java.lang.String str2 = (interfaceC9738bbJ == null || (strEZpvd = interfaceC9738bbJ.EZpvd(transactionConfig2.copydefault())) == null) ? "" : strEZpvd;
        java.lang.String plainString = C33129mqd.EZpvd(ixb2.EZpvd()).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        long jIsConnected = transactionConfig2.isConnected();
        int iAkhnZx = transactionConfig2.AkhnZx();
        InvestTokenWithAmount investTokenWithAmountOLrzqt = ixb2.OLrzqt();
        if (investTokenWithAmountOLrzqt == null || (tokenAddress = investTokenWithAmountOLrzqt.getTokenAddress()) == null) {
            tokenAddress = investTokenWithAmountFIwbmz.getTokenAddress();
        }
        java.lang.String str3 = tokenAddress;
        InvestTokenWithAmount investTokenWithAmountOLrzqt2 = ixb2.OLrzqt();
        if (investTokenWithAmountOLrzqt2 == null || (tokenPrecision = investTokenWithAmountOLrzqt2.getTokenPrecision()) == null) {
            tokenPrecision = investTokenWithAmountFIwbmz.getTokenPrecision();
        }
        java.lang.String str4 = tokenPrecision;
        boolean zAwvSrB = transactionConfig2.AwvSrB();
        java.lang.Integer numFJNWhG = transactionConfig2.fJNWhG();
        InvestOrder investOrderAhwBna = transactionConfig2.AhwBna();
        if (investOrderAhwBna == null || (strEjfBZ = investOrderAhwBna.getRedeemId()) == null) {
            strEjfBZ = transactionConfig2.ejfBZ();
        }
        InvestRedeemReceiveReq investRedeemReceiveReq = new InvestRedeemReceiveReq(str, str2, plainString, jIsConnected, iAkhnZx, str3, str4, C56443yFo.KWHzl(zAwvSrB), "", strEjfBZ, numFJNWhG, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, transactionConfig2.fARcdN(), 14336, (DefaultConstructorMarker) null);
        redeemGenerateContentUseCase$getReceiveInfo$1.L$0 = null;
        redeemGenerateContentUseCase$getReceiveInfo$1.L$1 = null;
        redeemGenerateContentUseCase$getReceiveInfo$1.L$2 = null;
        redeemGenerateContentUseCase$getReceiveInfo$1.L$3 = null;
        redeemGenerateContentUseCase$getReceiveInfo$1.label = 2;
        java.lang.Object objKWHzl = ifl.KWHzl(investRedeemReceiveReq, redeemGenerateContentUseCase$getReceiveInfo$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }
}
