package o;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.repository.InvestTokenListRepositoryImpl$getEligibleTokenListForInvest$1;
import com.okinc.business.invest_biz.data.repository.InvestTokenListRepositoryImpl$getEligibleTokenListForInvest$2;
import com.okinc.business.invest_biz.data.repository.InvestTokenListRepositoryImpl$getEligibleTokenListForRedeem$1;
import com.okinc.business.invest_biz.data.repository.InvestTokenListRepositoryImpl$getEligibleTokenListForRedeem$2;
import com.okinc.business.invest_biz.data.repository.InvestTokenListRepositoryImpl$searchEligibleTokenListForRedeem$1;
import com.okinc.business.invest_biz.data.repository.InvestTokenListRepositoryImpl$searchEligibleTokenListForRedeem$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDB implements iDA {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC23916iOb KWHzl;
    public final InterfaceC23589iBz copydefault;

    @yCM
    public iDB(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC23589iBz;
        this.KWHzl = interfaceC23916iOb;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.iDA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(long j, @NotNull java.lang.String str, long j2, @NotNull Continuation<? super Result<? extends java.util.List<InvestTokenWithAmount>>> continuation) {
        InvestTokenListRepositoryImpl$getEligibleTokenListForInvest$1 investTokenListRepositoryImpl$getEligibleTokenListForInvest$1;
        if (continuation instanceof InvestTokenListRepositoryImpl$getEligibleTokenListForInvest$1) {
            investTokenListRepositoryImpl$getEligibleTokenListForInvest$1 = (InvestTokenListRepositoryImpl$getEligibleTokenListForInvest$1) continuation;
            int i = investTokenListRepositoryImpl$getEligibleTokenListForInvest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investTokenListRepositoryImpl$getEligibleTokenListForInvest$1.label = i - Integer.MIN_VALUE;
            } else {
                investTokenListRepositoryImpl$getEligibleTokenListForInvest$1 = new InvestTokenListRepositoryImpl$getEligibleTokenListForInvest$1(this, continuation);
            }
        }
        InvestTokenListRepositoryImpl$getEligibleTokenListForInvest$1 investTokenListRepositoryImpl$getEligibleTokenListForInvest$12 = investTokenListRepositoryImpl$getEligibleTokenListForInvest$1;
        java.lang.Object obj = investTokenListRepositoryImpl$getEligibleTokenListForInvest$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investTokenListRepositoryImpl$getEligibleTokenListForInvest$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.EZpvd;
        InvestTokenListRepositoryImpl$getEligibleTokenListForInvest$2 investTokenListRepositoryImpl$getEligibleTokenListForInvest$2 = new InvestTokenListRepositoryImpl$getEligibleTokenListForInvest$2(this, str, j2, j, null);
        investTokenListRepositoryImpl$getEligibleTokenListForInvest$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, investTokenListRepositoryImpl$getEligibleTokenListForInvest$2, investTokenListRepositoryImpl$getEligibleTokenListForInvest$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.iDA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(long j, @NotNull java.lang.String str, long j2, @NotNull Continuation<? super Result<? extends java.util.List<InvestTokenWithAmount>>> continuation) {
        InvestTokenListRepositoryImpl$getEligibleTokenListForRedeem$1 investTokenListRepositoryImpl$getEligibleTokenListForRedeem$1;
        if (continuation instanceof InvestTokenListRepositoryImpl$getEligibleTokenListForRedeem$1) {
            investTokenListRepositoryImpl$getEligibleTokenListForRedeem$1 = (InvestTokenListRepositoryImpl$getEligibleTokenListForRedeem$1) continuation;
            int i = investTokenListRepositoryImpl$getEligibleTokenListForRedeem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investTokenListRepositoryImpl$getEligibleTokenListForRedeem$1.label = i - Integer.MIN_VALUE;
            } else {
                investTokenListRepositoryImpl$getEligibleTokenListForRedeem$1 = new InvestTokenListRepositoryImpl$getEligibleTokenListForRedeem$1(this, continuation);
            }
        }
        InvestTokenListRepositoryImpl$getEligibleTokenListForRedeem$1 investTokenListRepositoryImpl$getEligibleTokenListForRedeem$12 = investTokenListRepositoryImpl$getEligibleTokenListForRedeem$1;
        java.lang.Object obj = investTokenListRepositoryImpl$getEligibleTokenListForRedeem$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investTokenListRepositoryImpl$getEligibleTokenListForRedeem$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.EZpvd;
        InvestTokenListRepositoryImpl$getEligibleTokenListForRedeem$2 investTokenListRepositoryImpl$getEligibleTokenListForRedeem$2 = new InvestTokenListRepositoryImpl$getEligibleTokenListForRedeem$2(this, str, j2, j, null);
        investTokenListRepositoryImpl$getEligibleTokenListForRedeem$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, investTokenListRepositoryImpl$getEligibleTokenListForRedeem$2, investTokenListRepositoryImpl$getEligibleTokenListForRedeem$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.iDA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.util.List<InvestTokenWithAmount>>> continuation) {
        InvestTokenListRepositoryImpl$searchEligibleTokenListForRedeem$1 investTokenListRepositoryImpl$searchEligibleTokenListForRedeem$1;
        if (continuation instanceof InvestTokenListRepositoryImpl$searchEligibleTokenListForRedeem$1) {
            investTokenListRepositoryImpl$searchEligibleTokenListForRedeem$1 = (InvestTokenListRepositoryImpl$searchEligibleTokenListForRedeem$1) continuation;
            int i = investTokenListRepositoryImpl$searchEligibleTokenListForRedeem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investTokenListRepositoryImpl$searchEligibleTokenListForRedeem$1.label = i - Integer.MIN_VALUE;
            } else {
                investTokenListRepositoryImpl$searchEligibleTokenListForRedeem$1 = new InvestTokenListRepositoryImpl$searchEligibleTokenListForRedeem$1(this, continuation);
            }
        }
        InvestTokenListRepositoryImpl$searchEligibleTokenListForRedeem$1 investTokenListRepositoryImpl$searchEligibleTokenListForRedeem$12 = investTokenListRepositoryImpl$searchEligibleTokenListForRedeem$1;
        java.lang.Object obj = investTokenListRepositoryImpl$searchEligibleTokenListForRedeem$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investTokenListRepositoryImpl$searchEligibleTokenListForRedeem$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.EZpvd;
        InvestTokenListRepositoryImpl$searchEligibleTokenListForRedeem$2 investTokenListRepositoryImpl$searchEligibleTokenListForRedeem$2 = new InvestTokenListRepositoryImpl$searchEligibleTokenListForRedeem$2(this, j, str, str2, null);
        investTokenListRepositoryImpl$searchEligibleTokenListForRedeem$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, investTokenListRepositoryImpl$searchEligibleTokenListForRedeem$2, investTokenListRepositoryImpl$searchEligibleTokenListForRedeem$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    public final java.lang.String EZpvd(java.lang.String str, long j) {
        java.lang.String strEZpvd;
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = this.KWHzl.gEmmrt().OLrzqt(str);
        return (interfaceC9738bbJOLrzqt == null || (strEZpvd = interfaceC9738bbJOLrzqt.EZpvd(j)) == null) ? "" : strEZpvd;
    }
}
