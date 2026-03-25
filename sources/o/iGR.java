package o;

import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemReceiveReq;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.data.usecase.generate_content.Univ3RedeemGenerateContentUseCase$getReceiveInfo$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.Univ3RedeemGenerateContentUseCase$invoke$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.Univ3RedeemGenerateContentUseCase$invoke$2;
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
public final class iGR extends iXE {
    public final C23620iDc AEQbTJ;
    public final iFR EZpvd;
    public final InterfaceC23916iOb KWHzl;
    public final C27164jpy OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public iGR(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iFR ifr, @NotNull C27164jpy c27164jpy, @NotNull C23620iDc c23620iDc, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(interfaceC23916iOb, c27164jpy);
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(ifr, "");
        Intrinsics.checkNotNullParameter(c27164jpy, "");
        Intrinsics.checkNotNullParameter(c23620iDc, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC23916iOb;
        this.EZpvd = ifr;
        this.OLrzqt = c27164jpy;
        this.AEQbTJ = c23620iDc;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iXE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel initialInfoModel, iXB ixb, @NotNull Continuation<? super Result<? extends InterfaceC24182iXy>> continuation) throws java.lang.Throwable {
        Univ3RedeemGenerateContentUseCase$invoke$1 univ3RedeemGenerateContentUseCase$invoke$1;
        if (continuation instanceof Univ3RedeemGenerateContentUseCase$invoke$1) {
            univ3RedeemGenerateContentUseCase$invoke$1 = (Univ3RedeemGenerateContentUseCase$invoke$1) continuation;
            int i = univ3RedeemGenerateContentUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                univ3RedeemGenerateContentUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                univ3RedeemGenerateContentUseCase$invoke$1 = new Univ3RedeemGenerateContentUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = univ3RedeemGenerateContentUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = univ3RedeemGenerateContentUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            Univ3RedeemGenerateContentUseCase$invoke$2 univ3RedeemGenerateContentUseCase$invoke$2 = new Univ3RedeemGenerateContentUseCase$invoke$2(initialInfoModel, ixb, this, transactionConfig, null);
            univ3RedeemGenerateContentUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, univ3RedeemGenerateContentUseCase$invoke$2, univ3RedeemGenerateContentUseCase$invoke$1);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(TransactionConfig transactionConfig, InitialInfoModel.RedeemInitialInfo redeemInitialInfo, iXB ixb, Continuation<? super Result<RedeemDetailsAndGasFee>> continuation) throws java.lang.Throwable {
        Univ3RedeemGenerateContentUseCase$getReceiveInfo$1 univ3RedeemGenerateContentUseCase$getReceiveInfo$1;
        TransactionConfig transactionConfig2;
        InitialInfoModel.RedeemInitialInfo redeemInitialInfo2;
        iXB ixb2;
        java.lang.Object objOLrzqt;
        iGR igr;
        java.lang.String tokenAddress;
        java.lang.String tokenPrecision;
        java.lang.String strEZpvd;
        java.lang.String strDbNXlk;
        if (continuation instanceof Univ3RedeemGenerateContentUseCase$getReceiveInfo$1) {
            univ3RedeemGenerateContentUseCase$getReceiveInfo$1 = (Univ3RedeemGenerateContentUseCase$getReceiveInfo$1) continuation;
            int i = univ3RedeemGenerateContentUseCase$getReceiveInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                univ3RedeemGenerateContentUseCase$getReceiveInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                univ3RedeemGenerateContentUseCase$getReceiveInfo$1 = new Univ3RedeemGenerateContentUseCase$getReceiveInfo$1(this, continuation);
            }
        }
        java.lang.Object obj = univ3RedeemGenerateContentUseCase$getReceiveInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = univ3RedeemGenerateContentUseCase$getReceiveInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            univ3RedeemGenerateContentUseCase$getReceiveInfo$1.L$0 = this;
            transactionConfig2 = transactionConfig;
            univ3RedeemGenerateContentUseCase$getReceiveInfo$1.L$1 = transactionConfig2;
            redeemInitialInfo2 = redeemInitialInfo;
            univ3RedeemGenerateContentUseCase$getReceiveInfo$1.L$2 = redeemInitialInfo2;
            ixb2 = ixb;
            univ3RedeemGenerateContentUseCase$getReceiveInfo$1.L$3 = ixb2;
            univ3RedeemGenerateContentUseCase$getReceiveInfo$1.label = 1;
            objOLrzqt = OLrzqt(univ3RedeemGenerateContentUseCase$getReceiveInfo$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            igr = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            iXB ixb3 = (iXB) univ3RedeemGenerateContentUseCase$getReceiveInfo$1.L$3;
            InitialInfoModel.RedeemInitialInfo redeemInitialInfo3 = (InitialInfoModel.RedeemInitialInfo) univ3RedeemGenerateContentUseCase$getReceiveInfo$1.L$2;
            TransactionConfig transactionConfig3 = (TransactionConfig) univ3RedeemGenerateContentUseCase$getReceiveInfo$1.L$1;
            igr = (iGR) univ3RedeemGenerateContentUseCase$getReceiveInfo$1.L$0;
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
        java.lang.String str = (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) ? "" : strDbNXlk;
        java.lang.String str2 = (interfaceC9738bbJ == null || (strEZpvd = interfaceC9738bbJ.EZpvd(transactionConfig2.copydefault())) == null) ? "" : strEZpvd;
        long jIsConnected = transactionConfig2.isConnected();
        java.lang.String strMulS$default = C33129mqd.mulS$default(ixb2.EZpvd(), C56443yFo.AEQbTJ(0.01d), null, null, null, 14, null);
        java.lang.String strEjfBZ = transactionConfig2.ejfBZ();
        java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(transactionConfig2.AwvSrB());
        InvestTokenWithAmount investTokenWithAmountOLrzqt = ixb2.OLrzqt();
        if (investTokenWithAmountOLrzqt == null || (tokenAddress = investTokenWithAmountOLrzqt.getTokenAddress()) == null) {
            tokenAddress = investTokenWithAmountFIwbmz.getTokenAddress();
        }
        java.lang.String str3 = tokenAddress;
        InvestTokenWithAmount investTokenWithAmountOLrzqt2 = ixb2.OLrzqt();
        if (investTokenWithAmountOLrzqt2 == null || (tokenPrecision = investTokenWithAmountOLrzqt2.getTokenPrecision()) == null) {
            tokenPrecision = investTokenWithAmountFIwbmz.getTokenPrecision();
        }
        InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq = new InvestUniv3RedeemReceiveReq(str, str2, jIsConnected, strMulS$default, strEjfBZ, boolKWHzl, str3, tokenPrecision, (java.lang.String) null, C56443yFo.KWHzl(transactionConfig2.copydefault()), transactionConfig2.values(), 256, (DefaultConstructorMarker) null);
        iFR ifr = igr.EZpvd;
        univ3RedeemGenerateContentUseCase$getReceiveInfo$1.L$0 = null;
        univ3RedeemGenerateContentUseCase$getReceiveInfo$1.L$1 = null;
        univ3RedeemGenerateContentUseCase$getReceiveInfo$1.L$2 = null;
        univ3RedeemGenerateContentUseCase$getReceiveInfo$1.L$3 = null;
        univ3RedeemGenerateContentUseCase$getReceiveInfo$1.label = 2;
        java.lang.Object objKWHzl = ifr.KWHzl(investUniv3RedeemReceiveReq, univ3RedeemGenerateContentUseCase$getReceiveInfo$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }
}
