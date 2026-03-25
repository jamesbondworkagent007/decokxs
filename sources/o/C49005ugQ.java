package o;

import com.okinc.share.bean.ShareData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ugQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49005ugQ implements InterfaceC49000ugL {
    public ShareData EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull ShareData shareData) {
        Intrinsics.checkNotNullParameter(shareData, "");
        this.EZpvd = shareData;
    }

    public C49005ugQ(@NotNull ShareData shareData) {
        Intrinsics.checkNotNullParameter(shareData, "");
        this.EZpvd = shareData;
    }

    @Override // o.InterfaceC49000ugL
    public java.lang.CharSequence AYXKKw() {
        return this.EZpvd.getFootViewData().getTitle();
    }

    @Override // o.InterfaceC49000ugL
    public android.graphics.drawable.Drawable gEmmrt() {
        return this.EZpvd.getFootViewData().getLogo();
    }

    @Override // o.InterfaceC49000ugL
    public java.lang.CharSequence AhwBna() {
        return this.EZpvd.getFootViewData().getSubtitle();
    }

    @Override // o.InterfaceC49000ugL
    public java.lang.String djBIcL() {
        return this.EZpvd.getFootViewData().getQrcode();
    }
}
