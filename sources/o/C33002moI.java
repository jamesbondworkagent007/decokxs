package o;

import com.okinc.core.base.LoadingDialogType;
import kotlin.jvm.internal.Intrinsics;
import o.C6697aUI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.moI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C33002moI {
    public final android.app.Activity AEQbTJ;
    public boolean EZpvd;
    public final LoadingDialogType KWHzl;
    public C33622mzt OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.EZpvd = z;
    }

    public C33002moI(@NotNull android.app.Activity activity, @NotNull LoadingDialogType loadingDialogType) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(loadingDialogType, "");
        this.AEQbTJ = activity;
        this.KWHzl = loadingDialogType;
        this.EZpvd = true;
        this.copydefault = true;
    }

    public static /* synthetic */ void showLoading$default(C33002moI c33002moI, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c33002moI.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        EZpvd();
        C33622mzt c33622mzt = this.OLrzqt;
        if (c33622mzt != null) {
            android.app.Activity activity = this.AEQbTJ;
            c33622mzt.OLrzqt(activity, (50 & 2) != 0 ? true : this.copydefault, (50 & 4) != 0 ? true : true, (50 & 8) == 0 ? this.EZpvd : true, (50 & 16) != 0 ? 500L : 0L, (50 & 32) != 0 ? activity.getResources().getString(C6697aUI.Activity.OLrzqt) : null);
        }
    }

    public static /* synthetic */ void showLoading$default(C33002moI c33002moI, boolean z, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            j = 500;
        }
        c33002moI.OLrzqt(z, j);
    }

    public final void OLrzqt(boolean z, long j) {
        EZpvd();
        C33622mzt c33622mzt = this.OLrzqt;
        if (c33622mzt != null) {
            android.app.Activity activity = this.AEQbTJ;
            c33622mzt.OLrzqt(activity, (50 & 2) != 0 ? true : this.copydefault, (50 & 4) != 0 ? true : z, (50 & 8) == 0 ? this.EZpvd : true, (50 & 16) != 0 ? 500L : j, (50 & 32) != 0 ? activity.getResources().getString(C6697aUI.Activity.OLrzqt) : null);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mzt.showLoading$default(o.mzt, android.content.Context, boolean, boolean, boolean, long, java.lang.String, int, java.lang.Object):void */
    public final void KWHzl() {
        EZpvd();
        C33622mzt c33622mzt = this.OLrzqt;
        if (c33622mzt != null) {
            android.app.Activity activity = this.AEQbTJ;
            c33622mzt.OLrzqt(activity, (50 & 2) != 0, (50 & 4) != 0 ? true : true, (50 & 8) == 0 ? this.EZpvd : true, (50 & 16) != 0 ? 500L : 0L, (50 & 32) != 0 ? activity.getResources().getString(C6697aUI.Activity.OLrzqt) : null);
        }
    }

    public final void djBIcL() {
        EZpvd();
        C33622mzt c33622mzt = this.OLrzqt;
        if (c33622mzt != null) {
            android.app.Activity activity = this.AEQbTJ;
            c33622mzt.OLrzqt(activity, (50 & 2) != 0, (50 & 4) != 0 ? true : true, (50 & 8) == 0 ? this.EZpvd : true, (50 & 16) != 0 ? 500L : 0L, (50 & 32) != 0 ? activity.getResources().getString(C6697aUI.Activity.OLrzqt) : null);
        }
    }

    public final void OLrzqt() {
        C33622mzt c33622mzt = this.OLrzqt;
        if (c33622mzt != null) {
            c33622mzt.copydefault();
        }
    }

    public final void copydefault() {
        C33622mzt c33622mzt = this.OLrzqt;
        if (c33622mzt != null) {
            c33622mzt.OLrzqt();
        }
    }

    public final void AEQbTJ() {
        OLrzqt();
    }

    public final void EZpvd() {
        if (this.OLrzqt == null) {
            this.OLrzqt = new C33622mzt();
        }
    }
}
