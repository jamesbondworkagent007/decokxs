package o;

import android.view.View;
import com.okinc.share.bean.text.TextDefaultPreviewConfig;
import com.okinc.share.bean.text.TextShareParams;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.umc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49335umc extends AbstractC48908ueZ<TextDefaultPreviewConfig, TextShareParams> {
    public final int AEQbTJ = C48931uew.Application.ejfBZ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setOnClickListener(new View.OnClickListener() { // from class: o.umb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49335umc.copydefault(this.KWHzl, view2);
            }
        });
        notifyPreviewFirstLoaded();
        view.post(new java.lang.Runnable() { // from class: o.uma
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49335umc.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final void copydefault(C49335umc c49335umc, android.view.View view) {
        androidx.fragment.app.DialogFragment dialogFragmentEZpvd;
        InterfaceC48892ueJ shareDialog = c49335umc.getShareDialog();
        if (shareDialog == null || (dialogFragmentEZpvd = shareDialog.EZpvd()) == null) {
            return;
        }
        dialogFragmentEZpvd.dismiss();
    }

    public static final void AEQbTJ(C49335umc c49335umc) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c49335umc, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
