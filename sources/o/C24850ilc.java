package o;

import com.okinc.business.dexui.main.swap.trade.savings.data.SavingsSummaryRepositoryImpl$getSavingsSummary$1;
import com.okinc.business.dexui.main.swap.trade.savings.data.SavingsSummaryRepositoryImpl$getSavingsSummarygIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.dexui.main.swap.trade.savings.data.SavingsSummaryResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ilc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24850ilc implements InterfaceC24852ile {
    public final InterfaceC23234huQ EZpvd;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C24850ilc(@NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC23234huQ;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC24852ile
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Result<SavingsSummaryResponse>> continuation) {
        SavingsSummaryRepositoryImpl$getSavingsSummary$1 savingsSummaryRepositoryImpl$getSavingsSummary$1;
        if (continuation instanceof SavingsSummaryRepositoryImpl$getSavingsSummary$1) {
            savingsSummaryRepositoryImpl$getSavingsSummary$1 = (SavingsSummaryRepositoryImpl$getSavingsSummary$1) continuation;
            int i = savingsSummaryRepositoryImpl$getSavingsSummary$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                savingsSummaryRepositoryImpl$getSavingsSummary$1.label = i - Integer.MIN_VALUE;
            } else {
                savingsSummaryRepositoryImpl$getSavingsSummary$1 = new SavingsSummaryRepositoryImpl$getSavingsSummary$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = savingsSummaryRepositoryImpl$getSavingsSummary$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = savingsSummaryRepositoryImpl$getSavingsSummary$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            SavingsSummaryRepositoryImpl$getSavingsSummarygIAlus$$inlined$dexRunCatching$1 savingsSummaryRepositoryImpl$getSavingsSummarygIAlus$$inlined$dexRunCatching$1 = new SavingsSummaryRepositoryImpl$getSavingsSummarygIAlus$$inlined$dexRunCatching$1(null, this, str);
            savingsSummaryRepositoryImpl$getSavingsSummary$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, savingsSummaryRepositoryImpl$getSavingsSummarygIAlus$$inlined$dexRunCatching$1, savingsSummaryRepositoryImpl$getSavingsSummary$1);
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
