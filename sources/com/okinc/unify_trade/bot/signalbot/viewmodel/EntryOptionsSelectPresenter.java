package com.okinc.unify_trade.bot.signalbot.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C55688xof;
import o.C56390yDp;
import o.C56423yEv;
import o.C56424yEw;
import o.xKK;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class EntryOptionsSelectPresenter extends AbsPresenter {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public String AEQbTJ;
    public String AYXKKw;
    public String AhwBna;
    public String AkhnZx;
    public String DbNXlk;
    public boolean EZpvd;
    public String KWHzl;
    public String copydefault;
    public String djBIcL;
    public String fetchVPNInfo;
    public int gEmmrt;
    public String isConnected;
    public String valueOf;
    public String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return "%";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void DbNXlk(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.EZpvd = z;
    }

    public final int OLrzqt() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    public final int ejfBZ() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldNames() {
        return "%";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void values(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk = str;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.signalbot.viewmodel.EntryOptionsSelectPresenter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntryOptionsSelectPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.gEmmrt = 4;
        this.valueOf = "USDT";
        this.AEQbTJ = "1";
        this.AhwBna = "";
        this.AYXKKw = "";
        this.djBIcL = "";
        this.fetchVPNInfo = "0.0001";
        this.values = "1";
        this.AkhnZx = "0.0001";
        this.isConnected = "1";
        this.copydefault = "0.05";
        this.DbNXlk = "0.10";
        this.KWHzl = "";
    }

    public final String fIwbmz() {
        return xMR.formatPercent$default(xMR.copydefault, this.copydefault, 2, 0, null, 8, null);
    }

    public final String iwGUEr() {
        return xMR.formatPercent$default(xMR.copydefault, this.DbNXlk, 2, 0, null, 8, null);
    }

    public final String fJNWhG() {
        return C33129mqd.mulS$default(this.copydefault, 100, 2, null, null, 12, null);
    }

    public final String uzCIH() {
        return C33129mqd.mulS$default(this.DbNXlk, 100, 2, null, null, 12, null);
    }

    public final String AEQbTJ() {
        return xMR.formatPercent$default(xMR.copydefault, this.copydefault, 2, 0, null, 8, null);
    }

    public final String djBIcL() {
        return xMR.formatPercent$default(xMR.copydefault, this.DbNXlk, 2, 0, null, 8, null);
    }

    public final String gEmmrt() {
        return C33129mqd.mulS$default(this.copydefault, 100, 2, null, null, 12, null);
    }

    public final String AYXKKw() {
        return C33129mqd.mulS$default(this.DbNXlk, 100, 2, null, null, 12, null);
    }

    public final String hDKMBd() {
        return StringsKt__StringsKt.fARcdN((CharSequence) this.AYXKKw) ? "" : C33129mqd.mulS$default(this.AYXKKw, 100, 2, null, null, 12, null);
    }

    public final String valueOf() {
        return StringsKt__StringsKt.fARcdN((CharSequence) this.djBIcL) ? "" : C33129mqd.mulS$default(this.djBIcL, 100, 2, null, null, 12, null);
    }

    public final String getNewProxyInstance() {
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.AhwBna)) {
            return "--";
        }
        return xMR.copydefault.copydefault(C33129mqd.mulS$default(this.AhwBna, this.KWHzl, null, null, null, 14, null), this.gEmmrt) + " " + this.valueOf;
    }

    public final Pair<Boolean, String> KWHzl() {
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.AhwBna)) {
            return new Pair<>(Boolean.TRUE, "");
        }
        if (C33129mqd.valueOf(this.AhwBna, "0")) {
            return new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickMultipleVisualMediaCompanion, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.requestPostMessageChannel)), C56390yDp.OLrzqt("lowLimit", xMR.copydefault.copydefault("0")))));
        }
        return new Pair<>(Boolean.TRUE, "");
    }

    public final Pair<Boolean, String> EZpvd() {
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.AYXKKw)) {
            return new Pair<>(Boolean.TRUE, "");
        }
        if (C33129mqd.gEmmrt(this.AYXKKw, this.fetchVPNInfo)) {
            return new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickVisualMediaCompanion, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.postMessage)), C56390yDp.OLrzqt("lowLimit", xMR.formatPercent$default(xMR.copydefault, this.fetchVPNInfo, 2, 0, null, 8, null)))));
        }
        if (C33129mqd.AEQbTJ(this.AYXKKw, this.values)) {
            return new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.isSystemPickerAvailableactivity_release, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.postMessage)), C56390yDp.OLrzqt("upLimit", xMR.formatPercent$default(xMR.copydefault, this.values, 2, 0, null, 8, null)))));
        }
        return new Pair<>(Boolean.TRUE, "");
    }

    public final Pair<Boolean, String> copydefault() {
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.djBIcL)) {
            return new Pair<>(Boolean.TRUE, "");
        }
        if (C33129mqd.gEmmrt(this.djBIcL, this.AkhnZx)) {
            return new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickVisualMediaCompanion, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.updateVisuals)), C56390yDp.OLrzqt("lowLimit", xMR.formatPercent$default(xMR.copydefault, this.AkhnZx, 2, 0, null, 8, null)))));
        }
        if (C33129mqd.AEQbTJ(this.djBIcL, this.isConnected)) {
            return new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.isSystemPickerAvailableactivity_release, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.updateVisuals)), C56390yDp.OLrzqt("upLimit", xMR.formatPercent$default(xMR.copydefault, this.isConnected, 2, 0, null, 8, null)))));
        }
        return new Pair<>(Boolean.TRUE, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [159=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Pair<Boolean, String> AubY() {
        String str = this.AEQbTJ;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    return new Pair<>(Boolean.TRUE, "");
                }
                break;
            case 50:
                if (str.equals("2")) {
                    return StringsKt__StringsKt.fARcdN((CharSequence) this.AhwBna) ? new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.requestPostMessageChannel))))) : KWHzl();
                }
                break;
            case 52:
                if (str.equals("4")) {
                    return StringsKt__StringsKt.fARcdN((CharSequence) this.AYXKKw) ? new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.postMessage))))) : EZpvd();
                }
                break;
            case 53:
                if (str.equals("5")) {
                    return StringsKt__StringsKt.fARcdN((CharSequence) this.djBIcL) ? new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.updateVisuals))))) : copydefault();
                }
                break;
        }
        return new Pair<>(Boolean.TRUE, "");
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
