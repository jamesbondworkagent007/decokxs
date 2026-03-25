package o;

import com.okinc.business.defi.biz.net.bean.TeeUpgradeStatus;
import com.okinc.business.defi.wallet.tee.repository.TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fVT implements fVP {
    public final C13934dbu copydefault;

    @yCM
    public fVT(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.copydefault = c13934dbu;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.fVP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<TeeUpgradeStatus>> continuation) {
        TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1 teeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1;
        if (continuation instanceof TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1) {
            teeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1 = (TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1) continuation;
            int i = teeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                teeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1 = new TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1(this, continuation);
            }
        }
        java.lang.Object obj = teeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C13934dbu c13934dbu = this.copydefault;
        teeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.label = 1;
        java.lang.Object objFetchVPNInfo = c13934dbu.fetchVPNInfo(str, teeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1);
        return objFetchVPNInfo == objCopydefault ? objCopydefault : objFetchVPNInfo;
    }
}
