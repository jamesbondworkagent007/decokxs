package o;

import com.okinc.business.invest_biz.data.repository.InvestSpRepositoryImpl$clear$1;
import com.okinc.business.invest_biz.data.repository.InvestSpRepositoryImpl$cleargIAlus$$inlined$runOnIogIAlus$1;
import com.okinc.business.invest_biz.data.repository.InvestSpRepositoryImpl$getBoolean$1;
import com.okinc.business.invest_biz.data.repository.InvestSpRepositoryImpl$getBoolean0E7RQCE$$inlined$runOnIogIAlus$1;
import com.okinc.business.invest_biz.data.repository.InvestSpRepositoryImpl$getInt$1;
import com.okinc.business.invest_biz.data.repository.InvestSpRepositoryImpl$getInt0E7RQCE$$inlined$runOnIogIAlus$1;
import com.okinc.business.invest_biz.data.repository.InvestSpRepositoryImpl$putBoolean$1;
import com.okinc.business.invest_biz.data.repository.InvestSpRepositoryImpl$putBoolean0E7RQCE$$inlined$runOnIogIAlus$1;
import com.okinc.business.invest_biz.data.repository.InvestSpRepositoryImpl$putInt$1;
import com.okinc.business.invest_biz.data.repository.InvestSpRepositoryImpl$putInt0E7RQCE$$inlined$runOnIogIAlus$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23642iDy implements InterfaceC23639iDv {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC56387yDm OLrzqt;
    public final Json copydefault;

    @yCM
    public C23642iDy(@NotNull Json json, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = json;
        this.AEQbTJ = coroutineDispatcher;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.iDu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23642iDy.KWHzl(context);
            }
        });
    }

    public final android.content.SharedPreferences copydefault() {
        return (android.content.SharedPreferences) this.OLrzqt.getValue();
    }

    public static final android.content.SharedPreferences KWHzl(android.content.Context context) {
        return context.getSharedPreferences("OKWalletInvest", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        InvestSpRepositoryImpl$putBoolean$1 investSpRepositoryImpl$putBoolean$1;
        if (continuation instanceof InvestSpRepositoryImpl$putBoolean$1) {
            investSpRepositoryImpl$putBoolean$1 = (InvestSpRepositoryImpl$putBoolean$1) continuation;
            int i = investSpRepositoryImpl$putBoolean$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investSpRepositoryImpl$putBoolean$1.label = i - Integer.MIN_VALUE;
            } else {
                investSpRepositoryImpl$putBoolean$1 = new InvestSpRepositoryImpl$putBoolean$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = investSpRepositoryImpl$putBoolean$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investSpRepositoryImpl$putBoolean$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            InvestSpRepositoryImpl$putBoolean0E7RQCE$$inlined$runOnIogIAlus$1 investSpRepositoryImpl$putBoolean0E7RQCE$$inlined$runOnIogIAlus$1 = new InvestSpRepositoryImpl$putBoolean0E7RQCE$$inlined$runOnIogIAlus$1(null, this, str, z);
            investSpRepositoryImpl$putBoolean$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, investSpRepositoryImpl$putBoolean0E7RQCE$$inlined$runOnIogIAlus$1, investSpRepositoryImpl$putBoolean$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC23639iDv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        InvestSpRepositoryImpl$getBoolean$1 investSpRepositoryImpl$getBoolean$1;
        if (continuation instanceof InvestSpRepositoryImpl$getBoolean$1) {
            investSpRepositoryImpl$getBoolean$1 = (InvestSpRepositoryImpl$getBoolean$1) continuation;
            int i = investSpRepositoryImpl$getBoolean$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investSpRepositoryImpl$getBoolean$1.label = i - Integer.MIN_VALUE;
            } else {
                investSpRepositoryImpl$getBoolean$1 = new InvestSpRepositoryImpl$getBoolean$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = investSpRepositoryImpl$getBoolean$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investSpRepositoryImpl$getBoolean$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            InvestSpRepositoryImpl$getBoolean0E7RQCE$$inlined$runOnIogIAlus$1 investSpRepositoryImpl$getBoolean0E7RQCE$$inlined$runOnIogIAlus$1 = new InvestSpRepositoryImpl$getBoolean0E7RQCE$$inlined$runOnIogIAlus$1(null, this, str, z);
            investSpRepositoryImpl$getBoolean$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, investSpRepositoryImpl$getBoolean0E7RQCE$$inlined$runOnIogIAlus$1, investSpRepositoryImpl$getBoolean$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, int i, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        InvestSpRepositoryImpl$putInt$1 investSpRepositoryImpl$putInt$1;
        if (continuation instanceof InvestSpRepositoryImpl$putInt$1) {
            investSpRepositoryImpl$putInt$1 = (InvestSpRepositoryImpl$putInt$1) continuation;
            int i2 = investSpRepositoryImpl$putInt$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                investSpRepositoryImpl$putInt$1.label = i2 - Integer.MIN_VALUE;
            } else {
                investSpRepositoryImpl$putInt$1 = new InvestSpRepositoryImpl$putInt$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = investSpRepositoryImpl$putInt$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = investSpRepositoryImpl$putInt$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            InvestSpRepositoryImpl$putInt0E7RQCE$$inlined$runOnIogIAlus$1 investSpRepositoryImpl$putInt0E7RQCE$$inlined$runOnIogIAlus$1 = new InvestSpRepositoryImpl$putInt0E7RQCE$$inlined$runOnIogIAlus$1(null, this, str, i);
            investSpRepositoryImpl$putInt$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, investSpRepositoryImpl$putInt0E7RQCE$$inlined$runOnIogIAlus$1, investSpRepositoryImpl$putInt$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC23639iDv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, int i, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) throws java.lang.Throwable {
        InvestSpRepositoryImpl$getInt$1 investSpRepositoryImpl$getInt$1;
        if (continuation instanceof InvestSpRepositoryImpl$getInt$1) {
            investSpRepositoryImpl$getInt$1 = (InvestSpRepositoryImpl$getInt$1) continuation;
            int i2 = investSpRepositoryImpl$getInt$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                investSpRepositoryImpl$getInt$1.label = i2 - Integer.MIN_VALUE;
            } else {
                investSpRepositoryImpl$getInt$1 = new InvestSpRepositoryImpl$getInt$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = investSpRepositoryImpl$getInt$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = investSpRepositoryImpl$getInt$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            InvestSpRepositoryImpl$getInt0E7RQCE$$inlined$runOnIogIAlus$1 investSpRepositoryImpl$getInt0E7RQCE$$inlined$runOnIogIAlus$1 = new InvestSpRepositoryImpl$getInt0E7RQCE$$inlined$runOnIogIAlus$1(null, this, str, i);
            investSpRepositoryImpl$getInt$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, investSpRepositoryImpl$getInt0E7RQCE$$inlined$runOnIogIAlus$1, investSpRepositoryImpl$getInt$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        InvestSpRepositoryImpl$clear$1 investSpRepositoryImpl$clear$1;
        if (continuation instanceof InvestSpRepositoryImpl$clear$1) {
            investSpRepositoryImpl$clear$1 = (InvestSpRepositoryImpl$clear$1) continuation;
            int i = investSpRepositoryImpl$clear$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investSpRepositoryImpl$clear$1.label = i - Integer.MIN_VALUE;
            } else {
                investSpRepositoryImpl$clear$1 = new InvestSpRepositoryImpl$clear$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = investSpRepositoryImpl$clear$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investSpRepositoryImpl$clear$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            InvestSpRepositoryImpl$cleargIAlus$$inlined$runOnIogIAlus$1 investSpRepositoryImpl$cleargIAlus$$inlined$runOnIogIAlus$1 = new InvestSpRepositoryImpl$cleargIAlus$$inlined$runOnIogIAlus$1(null, this, str);
            investSpRepositoryImpl$clear$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, investSpRepositoryImpl$cleargIAlus$$inlined$runOnIogIAlus$1, investSpRepositoryImpl$clear$1);
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
}
