package com.okinc.kline.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.okinc.kline.data.KlineChangeScreenVo;
import kotlin.jvm.internal.Intrinsics;
import o.C36236oUh;
import o.oLT;
import o.pDX;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineTimeAnchorViewModel extends ViewModel {
    public KlineChangeScreenVo AEQbTJ;
    public long EZpvd;
    public MutableLiveData<Boolean> KWHzl = new MutableLiveData<>(Boolean.FALSE);
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(KlineChangeScreenVo klineChangeScreenVo) {
        this.AEQbTJ = klineChangeScreenVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(long j) {
        this.EZpvd = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineChangeScreenVo KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt() {
        this.EZpvd = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    @yCM
    public KlineTimeAnchorViewModel() {
    }

    public final boolean KWHzl(@NotNull String str, long j, int i, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return (Intrinsics.EZpvd((Object) str2, (Object) oLT.DbNXlk()) || !C36236oUh.EZpvd.KWHzl(str) || j <= 0 || i == 0 || i == -2 || i2 == 0 || i2 == -2 || !pDX.AEQbTJ.djBIcL()) ? false : true;
    }

    public final boolean AEQbTJ(@NotNull String str, long j, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return !Intrinsics.EZpvd((Object) str2, (Object) oLT.DbNXlk()) && C36236oUh.EZpvd.OLrzqt(str) && j > 0 && i != 0 && i != -2 && pDX.AEQbTJ.djBIcL();
    }
}
