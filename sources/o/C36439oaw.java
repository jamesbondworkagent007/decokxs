package o;

import com.okinc.core.util.SPUtils;
import com.okinc.core.widget.tipswindow.AnchorPopupWindow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oaw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36439oaw extends AbstractC43215rlA implements InterfaceC35176nqQ {
    public nFS EZpvd;

    public void AEQbTJ(@NotNull android.app.Activity activity, @NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (this.EZpvd == null) {
            this.EZpvd = nFS.Companion.KWHzl(activity, C33070mpX.AYXKKw(C35399nuc.LoaderManager.fAklCm), new Function0() { // from class: o.oau
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C36439oaw.AEQbTJ(this.EZpvd);
                }
            });
        }
        nFS nfs = this.EZpvd;
        if (nfs != null) {
            nfs.KWHzl(view, AnchorPopupWindow.VerticalPosition.BELOW, AnchorPopupWindow.HorizontalPosition.RIGHT);
        }
    }

    public static final Unit AEQbTJ(C36439oaw c36439oaw) {
        c36439oaw.AEQbTJ(true);
        return Unit.INSTANCE;
    }

    public void AEQbTJ(boolean z) {
        if (z) {
            SPUtils.put("im_is_shown_First_by_affiliate", java.lang.Boolean.FALSE);
        }
        nFS nfs = this.EZpvd;
        if (nfs != null) {
            nfs.dismiss();
        }
    }

    public final void AEQbTJ(final android.app.Activity activity, final android.view.View view, boolean z) {
        if (z && SPUtils.getBoolean("im_is_shown_First_by_affiliate", true)) {
            C33570myu.copydefault(view, new java.lang.Runnable() { // from class: o.oas
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C36439oaw.OLrzqt(this.EZpvd, activity, view);
                }
            });
        }
    }

    public static final void OLrzqt(C36439oaw c36439oaw, android.app.Activity activity, android.view.View view) {
        c36439oaw.AEQbTJ(activity, view);
    }
}
