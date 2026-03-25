package o;

import com.okinc.business.dexui.main.swap.trade.savings.data.SavingsSummaryResponse;
import com.okinc.business.dexui.main.swap.trade.savings.domain.GetSavingsSummaryUseCase$invoke$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ilj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24857ilj {
    public final InterfaceC24852ile KWHzl;
    public final kKG copydefault;

    @yCM
    public C24857ilj(@NotNull InterfaceC24852ile interfaceC24852ile, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(interfaceC24852ile, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.KWHzl = interfaceC24852ile;
        this.copydefault = kkg;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Result<SavingsSummaryResponse>> continuation) throws java.lang.Throwable {
        GetSavingsSummaryUseCase$invoke$1 getSavingsSummaryUseCase$invoke$1;
        C24857ilj c24857ilj;
        java.lang.Object objOLrzqt;
        if (continuation instanceof GetSavingsSummaryUseCase$invoke$1) {
            getSavingsSummaryUseCase$invoke$1 = (GetSavingsSummaryUseCase$invoke$1) continuation;
            int i = getSavingsSummaryUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSavingsSummaryUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getSavingsSummaryUseCase$invoke$1 = new GetSavingsSummaryUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getSavingsSummaryUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSavingsSummaryUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            kKG kkg = this.copydefault;
            getSavingsSummaryUseCase$invoke$1.L$0 = this;
            getSavingsSummaryUseCase$invoke$1.label = 1;
            objAEQbTJ = kkg.AEQbTJ(getSavingsSummaryUseCase$invoke$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c24857ilj = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
                objOLrzqt = ((Result) objAEQbTJ).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objOLrzqt)) {
                    try {
                        Result.Application application = Result.Companion;
                        SavingsSummaryResponse savingsSummaryResponse = (SavingsSummaryResponse) objOLrzqt;
                        if (savingsSummaryResponse != null) {
                            return Result.m7377constructorimpl(savingsSummaryResponse);
                        }
                        throw new java.lang.IllegalStateException("Savings summary data is null");
                    } catch (java.lang.Throwable th) {
                        Result.Application application2 = Result.Companion;
                        objOLrzqt = C56391yDq.EZpvd(th);
                    }
                }
                return Result.m7377constructorimpl(objOLrzqt);
            }
            c24857ilj = (C24857ilj) getSavingsSummaryUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        java.lang.String str = (java.lang.String) objAEQbTJ;
        if (str.length() == 0) {
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.IllegalStateException("No wallet found")));
        }
        InterfaceC24852ile interfaceC24852ile = c24857ilj.KWHzl;
        getSavingsSummaryUseCase$invoke$1.L$0 = null;
        getSavingsSummaryUseCase$invoke$1.label = 2;
        objOLrzqt = interfaceC24852ile.OLrzqt(str, getSavingsSummaryUseCase$invoke$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
        }
        return Result.m7377constructorimpl(objOLrzqt);
    }
}
