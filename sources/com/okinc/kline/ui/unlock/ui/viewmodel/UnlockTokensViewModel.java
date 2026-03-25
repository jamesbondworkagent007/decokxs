package com.okinc.kline.ui.unlock.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.AbstractC49411unz;
import o.C39652pwQ;
import o.C39656pwU;
import o.C39659pwX;
import o.C39660pwY;
import o.C39661pwZ;
import o.C39713pxY;
import o.C55608xnE;
import o.InterfaceC49371unL;
import o.pDX;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class UnlockTokensViewModel extends AbstractC49411unz<C39713pxY> {
    public Job AEQbTJ;
    public final C39652pwQ AYXKKw;
    public final C39661pwZ AhwBna;
    public Map<String, Pair<Integer, Integer>> EZpvd;
    public String KWHzl;
    public String OLrzqt;
    public String copydefault;
    public final C39660pwY djBIcL;
    public boolean gEmmrt;
    public final C39656pwU isConnected;
    public Job valueOf;
    public final C39659pwX values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Job OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.gEmmrt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public UnlockTokensViewModel(@NotNull C39656pwU c39656pwU, @NotNull C39652pwQ c39652pwQ, @NotNull C39659pwX c39659pwX, @NotNull C39660pwY c39660pwY, @NotNull C39661pwZ c39661pwZ) {
        super(new C39713pxY(new InterfaceC49371unL.ActionBar(null, 1, null), new InterfaceC49371unL.ActionBar(null, 1, null), new InterfaceC49371unL.ActionBar(null, 1, null), new InterfaceC49371unL.ActionBar(null, 1, null), new InterfaceC49371unL.ActionBar(null, 1, null), null, 32, null));
        Intrinsics.checkNotNullParameter(c39656pwU, "");
        Intrinsics.checkNotNullParameter(c39652pwQ, "");
        Intrinsics.checkNotNullParameter(c39659pwX, "");
        Intrinsics.checkNotNullParameter(c39660pwY, "");
        Intrinsics.checkNotNullParameter(c39661pwZ, "");
        this.isConnected = c39656pwU;
        this.AYXKKw = c39652pwQ;
        this.values = c39659pwX;
        this.djBIcL = c39660pwY;
        this.AhwBna = c39661pwZ;
        this.KWHzl = "1W";
        this.copydefault = "";
        this.gEmmrt = pDX.AEQbTJ.gEmmrt() && !C55608xnE.OLrzqt();
        this.EZpvd = new LinkedHashMap();
    }

    public final void copydefault() {
        String str = (String) CollectionsKt___CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default((CharSequence) this.copydefault, new String[]{"-"}, false, 0, 6, (Object) null));
        this.OLrzqt = str;
        if (str == null || str.length() == 0) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UnlockTokensViewModel$fetchPreData$1(this, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UnlockTokensViewModel$fetchPreData$2(this, null), 3, null);
        }
    }

    public final void EZpvd(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UnlockTokensViewModel$fetchTokenProgress$1(this, str, null), 3, null);
    }

    public final void OLrzqt(String str) {
        this.AEQbTJ = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UnlockTokensViewModel$fetchUnlockAllocation$1(this, str, null), 3, null);
    }

    public final void EZpvd(String str, String str2) {
        Job job = this.valueOf;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.valueOf = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UnlockTokensViewModel$fetchUnlockSchedule$1(this, str, str2, null), 3, null);
    }

    public final void copydefault(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UnlockTokensViewModel$fetchUnlockStageCards$1(this, str, null), 3, null);
    }

    public final void EZpvd() {
        String str = (String) CollectionsKt___CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default((CharSequence) this.copydefault, new String[]{"-"}, false, 0, 6, (Object) null));
        this.OLrzqt = str;
        if (str == null || str.length() == 0) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UnlockTokensViewModel$fetchPageInfo$1(this, null), 3, null);
            return;
        }
        this.EZpvd.clear();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UnlockTokensViewModel$fetchPageInfo$2(this, null), 3, null);
        String str2 = this.OLrzqt;
        if (str2 == null) {
            str2 = "";
        }
        EZpvd(str2);
    }

    public static /* synthetic */ void fetchScheduleData$default(UnlockTokensViewModel unlockTokensViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unlockTokensViewModel.KWHzl;
        }
        unlockTokensViewModel.KWHzl(str);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UnlockTokensViewModel$fetchScheduleData$1(this, str, null), 3, null);
    }
}
