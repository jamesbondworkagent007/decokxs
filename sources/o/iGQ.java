package o;

import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.usecase.generate_content.InvestGenerateContentUseCase$callReceiveInfoApi$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.InvestGenerateContentUseCase$invoke$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.InvestGenerateContentUseCase$invoke$2;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.iDD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iGQ extends iXE {
    public final InterfaceC23916iOb AEQbTJ;
    public final iCS EZpvd;
    public final iFN KWHzl;
    public final C27164jpy OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public iGQ(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iFN ifn, @NotNull C27164jpy c27164jpy, @NotNull iCS ics, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(interfaceC23916iOb, c27164jpy);
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(ifn, "");
        Intrinsics.checkNotNullParameter(c27164jpy, "");
        Intrinsics.checkNotNullParameter(ics, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC23916iOb;
        this.KWHzl = ifn;
        this.OLrzqt = c27164jpy;
        this.EZpvd = ics;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iXE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel initialInfoModel, iXB ixb, @NotNull Continuation<? super Result<? extends InterfaceC24182iXy>> continuation) throws java.lang.Throwable {
        InvestGenerateContentUseCase$invoke$1 investGenerateContentUseCase$invoke$1;
        if (continuation instanceof InvestGenerateContentUseCase$invoke$1) {
            investGenerateContentUseCase$invoke$1 = (InvestGenerateContentUseCase$invoke$1) continuation;
            int i = investGenerateContentUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investGenerateContentUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                investGenerateContentUseCase$invoke$1 = new InvestGenerateContentUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = investGenerateContentUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investGenerateContentUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.copydefault;
        InvestGenerateContentUseCase$invoke$2 investGenerateContentUseCase$invoke$2 = new InvestGenerateContentUseCase$invoke$2(initialInfoModel, this, ixb, transactionConfig, null);
        investGenerateContentUseCase$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, investGenerateContentUseCase$invoke$2, investGenerateContentUseCase$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018b A[PHI: r1
  0x018b: PHI (r1v3 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) = 
  (r1v2 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount)
  (r1v8 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount)
 binds: [B:39:0x0138, B:41:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(InitialInfoModel.InvestInitialInfo investInitialInfo, TransactionConfig transactionConfig, iXB ixb, Continuation<? super Result<InvestDetailsAndGasFee>> continuation) throws java.lang.Throwable {
        InvestGenerateContentUseCase$callReceiveInfoApi$1 investGenerateContentUseCase$callReceiveInfoApi$1;
        java.lang.String plainString;
        InitialInfoModel.InvestInitialInfo investInitialInfo2;
        java.lang.Object objOLrzqt;
        iGQ igq;
        iFN ifn;
        iXB ixb2;
        TransactionConfig transactionConfig2;
        iDD.TaskDescription taskDescription;
        java.lang.String str;
        java.lang.String strDbNXlk;
        TransactionConfig transactionConfig3;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        iDD.TaskDescription taskDescription2;
        iFN ifn2;
        InitialInfoModel.InvestInitialInfo investInitialInfo3;
        iXB ixb3;
        java.lang.String strEZpvd;
        TransactionConfig transactionConfig4 = transactionConfig;
        if (continuation instanceof InvestGenerateContentUseCase$callReceiveInfoApi$1) {
            investGenerateContentUseCase$callReceiveInfoApi$1 = (InvestGenerateContentUseCase$callReceiveInfoApi$1) continuation;
            int i = investGenerateContentUseCase$callReceiveInfoApi$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investGenerateContentUseCase$callReceiveInfoApi$1.label = i - Integer.MIN_VALUE;
            } else {
                investGenerateContentUseCase$callReceiveInfoApi$1 = new InvestGenerateContentUseCase$callReceiveInfoApi$1(this, continuation);
            }
        }
        java.lang.Object obj = investGenerateContentUseCase$callReceiveInfoApi$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investGenerateContentUseCase$callReceiveInfoApi$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            iFN ifn3 = this.KWHzl;
            iDD.TaskDescription taskDescription3 = iDD.Companion;
            plainString = C33129mqd.EZpvd(ixb.EZpvd()).toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "");
            java.lang.String strAEQbTJ = ixb.AEQbTJ();
            investGenerateContentUseCase$callReceiveInfoApi$1.L$0 = this;
            investInitialInfo2 = investInitialInfo;
            investGenerateContentUseCase$callReceiveInfoApi$1.L$1 = investInitialInfo2;
            investGenerateContentUseCase$callReceiveInfoApi$1.L$2 = transactionConfig4;
            investGenerateContentUseCase$callReceiveInfoApi$1.L$3 = ixb;
            investGenerateContentUseCase$callReceiveInfoApi$1.L$4 = ifn3;
            investGenerateContentUseCase$callReceiveInfoApi$1.L$5 = taskDescription3;
            investGenerateContentUseCase$callReceiveInfoApi$1.L$6 = transactionConfig4;
            investGenerateContentUseCase$callReceiveInfoApi$1.L$7 = plainString;
            investGenerateContentUseCase$callReceiveInfoApi$1.L$8 = strAEQbTJ;
            investGenerateContentUseCase$callReceiveInfoApi$1.label = 1;
            objOLrzqt = OLrzqt(investGenerateContentUseCase$callReceiveInfoApi$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            igq = this;
            ifn = ifn3;
            ixb2 = ixb;
            transactionConfig2 = transactionConfig4;
            taskDescription = taskDescription3;
            str = strAEQbTJ;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return ((Result) obj).m7386unboximpl();
                }
                java.lang.String str5 = (java.lang.String) investGenerateContentUseCase$callReceiveInfoApi$1.L$8;
                java.lang.String str6 = (java.lang.String) investGenerateContentUseCase$callReceiveInfoApi$1.L$7;
                java.lang.String str7 = (java.lang.String) investGenerateContentUseCase$callReceiveInfoApi$1.L$6;
                TransactionConfig transactionConfig5 = (TransactionConfig) investGenerateContentUseCase$callReceiveInfoApi$1.L$5;
                iDD.TaskDescription taskDescription4 = (iDD.TaskDescription) investGenerateContentUseCase$callReceiveInfoApi$1.L$4;
                ifn2 = (iFN) investGenerateContentUseCase$callReceiveInfoApi$1.L$3;
                ixb3 = (iXB) investGenerateContentUseCase$callReceiveInfoApi$1.L$2;
                transactionConfig2 = (TransactionConfig) investGenerateContentUseCase$callReceiveInfoApi$1.L$1;
                investInitialInfo3 = (InitialInfoModel.InvestInitialInfo) investGenerateContentUseCase$callReceiveInfoApi$1.L$0;
                C56391yDq.AEQbTJ(obj);
                str3 = str5;
                str2 = str6;
                str4 = str7;
                transactionConfig3 = transactionConfig5;
                taskDescription2 = taskDescription4;
                InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
                java.lang.String str8 = (interfaceC9738bbJ != null || (strEZpvd = interfaceC9738bbJ.EZpvd(transactionConfig2.copydefault())) == null) ? "" : strEZpvd;
                InvestTokenWithAmount investTokenWithAmountDjBIcL = ixb3.djBIcL();
                InvestSubscriptionReceiveReq investSubscriptionReceiveReqKWHzl = taskDescription2.KWHzl(transactionConfig3, str4, str2, str3, str8, (investTokenWithAmountDjBIcL == null || (investTokenWithAmountDjBIcL = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investInitialInfo3.AYXKKw())) != null) ? investTokenWithAmountDjBIcL : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null));
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(transactionConfig2.copydefault()));
                investGenerateContentUseCase$callReceiveInfoApi$1.L$0 = null;
                investGenerateContentUseCase$callReceiveInfoApi$1.L$1 = null;
                investGenerateContentUseCase$callReceiveInfoApi$1.L$2 = null;
                investGenerateContentUseCase$callReceiveInfoApi$1.L$3 = null;
                investGenerateContentUseCase$callReceiveInfoApi$1.L$4 = null;
                investGenerateContentUseCase$callReceiveInfoApi$1.L$5 = null;
                investGenerateContentUseCase$callReceiveInfoApi$1.L$6 = null;
                investGenerateContentUseCase$callReceiveInfoApi$1.L$7 = null;
                investGenerateContentUseCase$callReceiveInfoApi$1.L$8 = null;
                investGenerateContentUseCase$callReceiveInfoApi$1.label = 3;
                java.lang.Object objEZpvd = ifn2.EZpvd(investSubscriptionReceiveReqKWHzl, strGEmmrt, transactionConfig2, investGenerateContentUseCase$callReceiveInfoApi$1);
                return objEZpvd != objCopydefault ? objCopydefault : objEZpvd;
            }
            java.lang.String str9 = (java.lang.String) investGenerateContentUseCase$callReceiveInfoApi$1.L$8;
            java.lang.String str10 = (java.lang.String) investGenerateContentUseCase$callReceiveInfoApi$1.L$7;
            TransactionConfig transactionConfig6 = (TransactionConfig) investGenerateContentUseCase$callReceiveInfoApi$1.L$6;
            iDD.TaskDescription taskDescription5 = (iDD.TaskDescription) investGenerateContentUseCase$callReceiveInfoApi$1.L$5;
            iFN ifn4 = (iFN) investGenerateContentUseCase$callReceiveInfoApi$1.L$4;
            iXB ixb4 = (iXB) investGenerateContentUseCase$callReceiveInfoApi$1.L$3;
            transactionConfig2 = (TransactionConfig) investGenerateContentUseCase$callReceiveInfoApi$1.L$2;
            InitialInfoModel.InvestInitialInfo investInitialInfo4 = (InitialInfoModel.InvestInitialInfo) investGenerateContentUseCase$callReceiveInfoApi$1.L$1;
            igq = (iGQ) investGenerateContentUseCase$callReceiveInfoApi$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str = str9;
            transactionConfig4 = transactionConfig6;
            objOLrzqt = obj;
            ixb2 = ixb4;
            investInitialInfo2 = investInitialInfo4;
            ifn = ifn4;
            taskDescription = taskDescription5;
            plainString = str10;
        }
        InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) objOLrzqt;
        if (interfaceC9738bbJ2 == null || (strDbNXlk = interfaceC9738bbJ2.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        investGenerateContentUseCase$callReceiveInfoApi$1.L$0 = investInitialInfo2;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$1 = transactionConfig2;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$2 = ixb2;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$3 = ifn;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$4 = taskDescription;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$5 = transactionConfig4;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$6 = plainString;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$7 = str;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$8 = strDbNXlk;
        investGenerateContentUseCase$callReceiveInfoApi$1.label = 2;
        java.lang.Object objOLrzqt2 = igq.OLrzqt(investGenerateContentUseCase$callReceiveInfoApi$1);
        if (objOLrzqt2 == objCopydefault) {
            return objCopydefault;
        }
        transactionConfig3 = transactionConfig4;
        str2 = str;
        str3 = strDbNXlk;
        str4 = plainString;
        taskDescription2 = taskDescription;
        ifn2 = ifn;
        investInitialInfo3 = investInitialInfo2;
        ixb3 = ixb2;
        obj = objOLrzqt2;
        InterfaceC9738bbJ interfaceC9738bbJ3 = (InterfaceC9738bbJ) obj;
        if (interfaceC9738bbJ3 != null) {
        }
        InvestTokenWithAmount investTokenWithAmountDjBIcL2 = ixb3.djBIcL();
        InvestSubscriptionReceiveReq investSubscriptionReceiveReqKWHzl2 = taskDescription2.KWHzl(transactionConfig3, str4, str2, str3, str8, (investTokenWithAmountDjBIcL2 == null || (investTokenWithAmountDjBIcL2 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investInitialInfo3.AYXKKw())) != null) ? investTokenWithAmountDjBIcL2 : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null));
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(C56443yFo.KWHzl(transactionConfig2.copydefault()));
        investGenerateContentUseCase$callReceiveInfoApi$1.L$0 = null;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$1 = null;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$2 = null;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$3 = null;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$4 = null;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$5 = null;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$6 = null;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$7 = null;
        investGenerateContentUseCase$callReceiveInfoApi$1.L$8 = null;
        investGenerateContentUseCase$callReceiveInfoApi$1.label = 3;
        java.lang.Object objEZpvd2 = ifn2.EZpvd(investSubscriptionReceiveReqKWHzl2, strGEmmrt2, transactionConfig2, investGenerateContentUseCase$callReceiveInfoApi$1);
        if (objEZpvd2 != objCopydefault) {
        }
    }
}
