package o;

import com.okinc.business.defi.assets.utxo.utxomanagement.InvestSpUtil$getBoolean$1;
import com.okinc.business.defi.assets.utxo.utxomanagement.InvestSpUtil$getBoolean0E7RQCE$$inlined$runOnIogIAlus$1;
import com.okinc.business.defi.assets.utxo.utxomanagement.InvestSpUtil$putBoolean$1;
import com.okinc.business.defi.assets.utxo.utxomanagement.InvestSpUtil$putBoolean0E7RQCE$$inlined$runOnIogIAlus$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bmn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C10351bmn {
    public static final C10351bmn OLrzqt = new C10351bmn();

    private C10351bmn() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        InvestSpUtil$putBoolean$1 investSpUtil$putBoolean$1;
        if (continuation instanceof InvestSpUtil$putBoolean$1) {
            investSpUtil$putBoolean$1 = (InvestSpUtil$putBoolean$1) continuation;
            int i = investSpUtil$putBoolean$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investSpUtil$putBoolean$1.label = i - Integer.MIN_VALUE;
            } else {
                investSpUtil$putBoolean$1 = new InvestSpUtil$putBoolean$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = investSpUtil$putBoolean$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investSpUtil$putBoolean$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            InvestSpUtil$putBoolean0E7RQCE$$inlined$runOnIogIAlus$1 investSpUtil$putBoolean0E7RQCE$$inlined$runOnIogIAlus$1 = new InvestSpUtil$putBoolean0E7RQCE$$inlined$runOnIogIAlus$1(null, str, z);
            investSpUtil$putBoolean$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, investSpUtil$putBoolean0E7RQCE$$inlined$runOnIogIAlus$1, investSpUtil$putBoolean$1);
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
    public final java.lang.Object copydefault(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        InvestSpUtil$getBoolean$1 investSpUtil$getBoolean$1;
        if (continuation instanceof InvestSpUtil$getBoolean$1) {
            investSpUtil$getBoolean$1 = (InvestSpUtil$getBoolean$1) continuation;
            int i = investSpUtil$getBoolean$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investSpUtil$getBoolean$1.label = i - Integer.MIN_VALUE;
            } else {
                investSpUtil$getBoolean$1 = new InvestSpUtil$getBoolean$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = investSpUtil$getBoolean$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investSpUtil$getBoolean$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            InvestSpUtil$getBoolean0E7RQCE$$inlined$runOnIogIAlus$1 investSpUtil$getBoolean0E7RQCE$$inlined$runOnIogIAlus$1 = new InvestSpUtil$getBoolean0E7RQCE$$inlined$runOnIogIAlus$1(null, str, z);
            investSpUtil$getBoolean$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, investSpUtil$getBoolean0E7RQCE$$inlined$runOnIogIAlus$1, investSpUtil$getBoolean$1);
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
