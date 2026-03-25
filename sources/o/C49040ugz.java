package o;

import com.okinc.share.mln.OKShareEditor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ugz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49040ugz extends AbstractC48904ueV {
    public final boolean OLrzqt;
    public final OKShareEditor copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48901ueS
    public android.view.View KWHzl(@NotNull android.content.Context context, @NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC48969ufh, "");
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C49040ugz(@NotNull OKShareEditor oKShareEditor) {
        Intrinsics.checkNotNullParameter(oKShareEditor, "");
        java.lang.String strOLrzqt = oKShareEditor.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
        super(strOLrzqt, oKShareEditor.AYXKKw(), null, oKShareEditor.AhwBna());
        this.copydefault = oKShareEditor;
        this.OLrzqt = oKShareEditor.AhwBna();
    }

    @Override // o.InterfaceC48901ueS
    public boolean KWHzl() {
        return isChecked() != this.OLrzqt;
    }

    @Override // o.AbstractC48896ueN
    public boolean OLrzqt() {
        return this.copydefault.gEmmrt();
    }

    @Override // o.InterfaceC48901ueS
    public void EZpvd(@NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        Intrinsics.checkNotNullParameter(interfaceC48969ufh, "");
        this.copydefault.AEQbTJ();
    }

    @Override // o.InterfaceC48901ueS
    public void copydefault(@NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        Intrinsics.checkNotNullParameter(interfaceC48969ufh, "");
        this.copydefault.KWHzl();
    }

    @Override // o.AbstractC48904ueV, android.widget.Checkable
    public boolean isChecked() {
        return this.copydefault.AhwBna();
    }
}
