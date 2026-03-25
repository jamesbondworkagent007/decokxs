package o;

import com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.ProtocolType;
import com.okinc.business.invest_biz.data.contants.TransactionType;
import com.okinc.business.invest_biz.ui.screens.token.use_case.TokenMakeInvestTransactionUseCase$execute$1;
import com.okinc.business.invest_biz.ui.screens.token.use_case.TokenMakeInvestTransactionUseCase$hasViewedRiskReminder$1;
import com.okinc.business.invest_biz.ui.screens.token.use_case.TokenMakeInvestTransactionUseCase$invoke$1;
import com.okinc.business.invest_biz.ui.screens.token.use_case.TokenMakeInvestTransactionUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC26561jee;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jfK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26594jfK {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC23636iDs OLrzqt;

    @yCM
    public C26594jfK(@NotNull InterfaceC23636iDs interfaceC23636iDs, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23636iDs, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC23636iDs;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(long j, boolean z, @NotNull TokenInvestDetail tokenInvestDetail, @NotNull Continuation<? super Result<? extends InterfaceC26561jee>> continuation) {
        TokenMakeInvestTransactionUseCase$invoke$1 tokenMakeInvestTransactionUseCase$invoke$1;
        if (continuation instanceof TokenMakeInvestTransactionUseCase$invoke$1) {
            tokenMakeInvestTransactionUseCase$invoke$1 = (TokenMakeInvestTransactionUseCase$invoke$1) continuation;
            int i = tokenMakeInvestTransactionUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenMakeInvestTransactionUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenMakeInvestTransactionUseCase$invoke$1 = new TokenMakeInvestTransactionUseCase$invoke$1(this, continuation);
            }
        }
        TokenMakeInvestTransactionUseCase$invoke$1 tokenMakeInvestTransactionUseCase$invoke$12 = tokenMakeInvestTransactionUseCase$invoke$1;
        java.lang.Object obj = tokenMakeInvestTransactionUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenMakeInvestTransactionUseCase$invoke$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
        TokenMakeInvestTransactionUseCase$invoke$2 tokenMakeInvestTransactionUseCase$invoke$2 = new TokenMakeInvestTransactionUseCase$invoke$2(this, j, z, tokenInvestDetail, null);
        tokenMakeInvestTransactionUseCase$invoke$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, tokenMakeInvestTransactionUseCase$invoke$2, tokenMakeInvestTransactionUseCase$invoke$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(long j, boolean z, TokenInvestDetail tokenInvestDetail, Continuation<? super InterfaceC26561jee> continuation) throws java.lang.Throwable {
        TokenMakeInvestTransactionUseCase$execute$1 tokenMakeInvestTransactionUseCase$execute$1;
        C26594jfK c26594jfK;
        InterfaceC26561jee interfaceC26561jee;
        if (continuation instanceof TokenMakeInvestTransactionUseCase$execute$1) {
            tokenMakeInvestTransactionUseCase$execute$1 = (TokenMakeInvestTransactionUseCase$execute$1) continuation;
            int i = tokenMakeInvestTransactionUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenMakeInvestTransactionUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenMakeInvestTransactionUseCase$execute$1 = new TokenMakeInvestTransactionUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = tokenMakeInvestTransactionUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenMakeInvestTransactionUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            InvestDetailPagePromptInformation investDetailPagePromptInformationOLrzqt = tokenInvestDetail.OLrzqt();
            InvestTipInfoVo unableSubscribeTip = investDetailPagePromptInformationOLrzqt != null ? investDetailPagePromptInformationOLrzqt.getUnableSubscribeTip() : null;
            if (unableSubscribeTip != null) {
                return new InterfaceC26561jee.PendingIntent(unableSubscribeTip);
            }
            tokenMakeInvestTransactionUseCase$execute$1.L$0 = this;
            tokenMakeInvestTransactionUseCase$execute$1.J$0 = j;
            tokenMakeInvestTransactionUseCase$execute$1.label = 1;
            objAEQbTJ = AEQbTJ(j, z, tokenInvestDetail, tokenMakeInvestTransactionUseCase$execute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c26594jfK = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = tokenMakeInvestTransactionUseCase$execute$1.J$0;
                interfaceC26561jee = (InterfaceC26561jee) tokenMakeInvestTransactionUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                return ((java.lang.Boolean) objAEQbTJ).booleanValue() ? new InterfaceC26561jee.Application(null, C56443yFo.KWHzl(j)) : interfaceC26561jee;
            }
            j = tokenMakeInvestTransactionUseCase$execute$1.J$0;
            c26594jfK = (C26594jfK) tokenMakeInvestTransactionUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        InterfaceC26561jee interfaceC26561jee2 = (InterfaceC26561jee) objAEQbTJ;
        if (!(interfaceC26561jee2 instanceof InterfaceC26561jee.ActionBar)) {
            return interfaceC26561jee2;
        }
        tokenMakeInvestTransactionUseCase$execute$1.L$0 = interfaceC26561jee2;
        tokenMakeInvestTransactionUseCase$execute$1.J$0 = j;
        tokenMakeInvestTransactionUseCase$execute$1.label = 2;
        objAEQbTJ = c26594jfK.AEQbTJ(tokenMakeInvestTransactionUseCase$execute$1);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        interfaceC26561jee = interfaceC26561jee2;
        if (((java.lang.Boolean) objAEQbTJ).booleanValue()) {
        }
    }

    public final java.lang.Object AEQbTJ(long j, boolean z, @NotNull TokenInvestDetail tokenInvestDetail, @NotNull Continuation<? super InterfaceC26561jee> continuation) {
        if (tokenInvestDetail.AYXKKw() == ProtocolType.LSDFI) {
            return new InterfaceC26561jee.ActionBar(TransactionType.LybraInvest, tokenInvestDetail.copydefault(), j, InvestmentKind.Lybra, tokenInvestDetail.EZpvd(), null, null, true, null, null, null, null, true, null, z, null, null, null, 241504, null);
        }
        return new InterfaceC26561jee.ActionBar(TransactionType.Invest, tokenInvestDetail.copydefault(), j, null, tokenInvestDetail.EZpvd(), null, null, true, null, null, null, null, true, null, z, null, null, null, 241512, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        TokenMakeInvestTransactionUseCase$hasViewedRiskReminder$1 tokenMakeInvestTransactionUseCase$hasViewedRiskReminder$1;
        java.lang.Object objOLrzqt;
        if (continuation instanceof TokenMakeInvestTransactionUseCase$hasViewedRiskReminder$1) {
            tokenMakeInvestTransactionUseCase$hasViewedRiskReminder$1 = (TokenMakeInvestTransactionUseCase$hasViewedRiskReminder$1) continuation;
            int i = tokenMakeInvestTransactionUseCase$hasViewedRiskReminder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenMakeInvestTransactionUseCase$hasViewedRiskReminder$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenMakeInvestTransactionUseCase$hasViewedRiskReminder$1 = new TokenMakeInvestTransactionUseCase$hasViewedRiskReminder$1(this, continuation);
            }
        }
        java.lang.Object obj = tokenMakeInvestTransactionUseCase$hasViewedRiskReminder$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenMakeInvestTransactionUseCase$hasViewedRiskReminder$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23636iDs interfaceC23636iDs = this.OLrzqt;
            tokenMakeInvestTransactionUseCase$hasViewedRiskReminder$1.label = 1;
            objOLrzqt = interfaceC23636iDs.OLrzqt("sp_invest_friendlyreminder_dialog_never_show", false, tokenMakeInvestTransactionUseCase$hasViewedRiskReminder$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        return objOLrzqt;
    }
}
