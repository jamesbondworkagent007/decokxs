package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.skJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45144skJ {
    public static final int OLrzqt = C55173xeu.EZpvd;
    public final C55173xeu EZpvd;

    public C45144skJ(@NotNull C55173xeu c55173xeu) {
        Intrinsics.checkNotNullParameter(c55173xeu, "");
        this.EZpvd = c55173xeu;
        AEQbTJ(C47315tni.Application.fetchVPNInfo);
        KWHzl(C33070mpX.AYXKKw(C47315tni.PendingIntent.DcqEDu));
        copydefault(C33070mpX.AYXKKw(C47315tni.PendingIntent.KDccX));
        EZpvd(C33070mpX.AYXKKw(C47315tni.PendingIntent.UrRBLY));
    }

    public final C45144skJ AEQbTJ(int i) {
        C52794wYp c52794wYpAEQbTJ = this.EZpvd.AEQbTJ();
        c52794wYpAEQbTJ.setPadding(C33070mpX.OLrzqt(C52761wXj.StateListAnimator.zuWLRA), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.zuWLRA));
        c52794wYpAEQbTJ.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
        c52794wYpAEQbTJ.setCompoundDrawablePadding(c52794wYpAEQbTJ.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ffGIBT));
        return this;
    }

    public final C45144skJ EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.setRetry(str);
        return this;
    }

    public final C45144skJ KWHzl(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.EZpvd.setRetryClickListener(onClickListener);
        return this;
    }

    public final C45144skJ KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.setTitle(str);
        return this;
    }

    public final C45144skJ copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.setSubTitle((java.lang.CharSequence) str);
        return this;
    }
}
