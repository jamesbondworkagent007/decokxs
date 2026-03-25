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
public final class OrderTypeSelectPresenter extends AbsPresenter {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public String AEQbTJ;
    public String AYXKKw;
    public String EZpvd;
    public String KWHzl;
    public String copydefault;
    public String gEmmrt;

    public final int AEQbTJ() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return "%";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTypeSelectPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AYXKKw = "2";
        this.KWHzl = "0.05";
        this.AEQbTJ = "0";
        this.copydefault = "0.9999";
        this.EZpvd = "0.05";
        this.gEmmrt = "0.10";
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.signalbot.viewmodel.OrderTypeSelectPresenter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final String copydefault() {
        return C33070mpX.AYXKKw(C55688xof.Application.asInterface);
    }

    public final String EZpvd() {
        return xMR.formatPercent$default(xMR.copydefault, this.EZpvd, 2, 0, null, 8, null);
    }

    public final String valueOf() {
        return xMR.formatPercent$default(xMR.copydefault, this.gEmmrt, 2, 0, null, 8, null);
    }

    public final String KWHzl() {
        return C33129mqd.mulS$default(this.EZpvd, 100, 2, null, null, 12, null);
    }

    public final String gEmmrt() {
        return C33129mqd.mulS$default(this.gEmmrt, 100, 2, null, null, 12, null);
    }

    public final String copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.fARcdN((CharSequence) str) ? "" : C33129mqd.mulS$default(str, 100, 2, null, null, 12, null);
    }

    public final Pair<Boolean, String> OLrzqt() {
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.KWHzl)) {
            return new Pair<>(Boolean.TRUE, "");
        }
        if (C33129mqd.valueOf(this.KWHzl, this.AEQbTJ)) {
            return new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickMultipleVisualMediaCompanion, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.asInterface)), C56390yDp.OLrzqt("lowLimit", xMR.formatPercent$default(xMR.copydefault, this.AEQbTJ, 2, 0, null, 8, null)))));
        }
        if (C33129mqd.copydefault(this.KWHzl, this.copydefault)) {
            return new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.isPhotoPickerAvailable, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.asInterface)), C56390yDp.OLrzqt("upLimit", xMR.formatPercent$default(xMR.copydefault, this.copydefault, 2, 0, null, 8, null)))));
        }
        return new Pair<>(Boolean.TRUE, "");
    }

    public final Pair<Boolean, String> isConnected() {
        String str = this.AYXKKw;
        int iHashCode = str.hashCode();
        if (iHashCode != 49) {
            return iHashCode != 50 ? new Pair<>(Boolean.TRUE, "") : new Pair<>(Boolean.TRUE, "");
        }
        if (str.equals("1")) {
            if (StringsKt__StringsKt.fARcdN((CharSequence) this.KWHzl)) {
                return new Pair<>(Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.asInterface)))));
            }
            return OLrzqt();
        }
        return new Pair<>(Boolean.TRUE, "");
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
