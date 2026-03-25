package o;

import androidx.lifecycle.ViewModel;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenSchedule;
import com.okinc.kline.ui.unlock.ui.viewmodel.UnlockScheduleViewModel$fetchScheduleData$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pyb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39769pyb extends ViewModel {
    public java.lang.String copydefault = "ALL";
    public java.lang.String OLrzqt = "";
    public java.util.List<C39709pxU> AEQbTJ = yDY.AhwBna();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.util.List<C39709pxU> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C39709pxU> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<UnlockTokenSchedule>> continuation) throws java.lang.Throwable {
        UnlockScheduleViewModel$fetchScheduleData$1 unlockScheduleViewModel$fetchScheduleData$1;
        if (continuation instanceof UnlockScheduleViewModel$fetchScheduleData$1) {
            unlockScheduleViewModel$fetchScheduleData$1 = (UnlockScheduleViewModel$fetchScheduleData$1) continuation;
            int i = unlockScheduleViewModel$fetchScheduleData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unlockScheduleViewModel$fetchScheduleData$1.label = i - Integer.MIN_VALUE;
            } else {
                unlockScheduleViewModel$fetchScheduleData$1 = new UnlockScheduleViewModel$fetchScheduleData$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = unlockScheduleViewModel$fetchScheduleData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unlockScheduleViewModel$fetchScheduleData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C39654pwS c39654pwS = new C39654pwS();
            java.lang.String str = this.OLrzqt;
            java.lang.String str2 = this.copydefault;
            unlockScheduleViewModel$fetchScheduleData$1.label = 1;
            objEZpvd = c39654pwS.EZpvd(str, str2, unlockScheduleViewModel$fetchScheduleData$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.List list = (java.util.List) ((ResponseData) objEZpvd).getData();
        return list == null ? yDY.AhwBna() : list;
    }
}
