package o;

import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.bean.link.LinkDefaultPreviewConfig;
import com.okinc.share.bean.link.LinkShareParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ulV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49275ulV extends AbstractC48908ueZ<LinkDefaultPreviewConfig, LinkShareParams> {
    public C49018ugd KWHzl;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.AbstractC48908ueZ, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return layoutInflater.inflate(C48931uew.Application.djBIcL, viewGroup, false);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.KWHzl = C49018ugd.AEQbTJ(view);
        LinkShareParams linkShareParamsRequireShareParams = requireShareParams();
        LinkDefaultPreviewConfig linkDefaultPreviewConfigRequirePreviewConfig = requirePreviewConfig();
        java.lang.String body = linkShareParamsRequireShareParams.getBody();
        ImageSource previewImage = linkDefaultPreviewConfigRequirePreviewConfig.getPreviewImage();
        java.lang.CharSequence previewStyleBody = linkDefaultPreviewConfigRequirePreviewConfig.getPreviewStyleBody();
        if (previewStyleBody == null || previewStyleBody.length() == 0) {
            previewStyleBody = AEQbTJ(body, linkShareParamsRequireShareParams.getLinkUrl());
        } else {
            Intrinsics.copydefault(previewStyleBody);
        }
        C49018ugd c49018ugd = this.KWHzl;
        C49018ugd c49018ugd2 = null;
        if (c49018ugd == null) {
            Intrinsics.gEmmrt("");
            c49018ugd = null;
        }
        c49018ugd.copydefault.setText(previewStyleBody);
        C49018ugd c49018ugd3 = this.KWHzl;
        if (c49018ugd3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49018ugd2 = c49018ugd3;
        }
        C55064xcr c55064xcr = c49018ugd2.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55064xcr, "");
        KWHzl(c55064xcr, previewImage);
        view.post(new java.lang.Runnable() { // from class: o.umd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49275ulV.AEQbTJ(this.EZpvd);
            }
        });
    }

    public static final void AEQbTJ(C49275ulV c49275ulV) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c49275ulV, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl(final android.widget.ImageView imageView, ImageSource imageSource) {
        C49018ugd c49018ugd = this.KWHzl;
        if (c49018ugd == null) {
            Intrinsics.gEmmrt("");
            c49018ugd = null;
        }
        final C55113xdn c55113xdn = c49018ugd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        if (imageSource != null) {
            imageView.setVisibility(4);
            c55113xdn.setVisibility(0);
            loadImageSource(imageSource, imageView, new Function1() { // from class: o.ulW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49275ulV.OLrzqt(imageView, c55113xdn, this, (android.graphics.drawable.Drawable) obj);
                }
            }, new Function1() { // from class: o.ulY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49275ulV.KWHzl(imageView, c55113xdn, this, (java.lang.Throwable) obj);
                }
            });
        } else {
            imageView.setVisibility(8);
            c55113xdn.setVisibility(8);
            notifyPreviewFirstLoaded();
        }
    }

    public static final Unit OLrzqt(android.widget.ImageView imageView, C55113xdn c55113xdn, C49275ulV c49275ulV, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "");
        imageView.setVisibility(0);
        c55113xdn.setVisibility(8);
        c49275ulV.notifyPreviewFirstLoaded();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(android.widget.ImageView imageView, C55113xdn c55113xdn, C49275ulV c49275ulV, java.lang.Throwable th) {
        imageView.setVisibility(8);
        c55113xdn.setVisibility(8);
        c49275ulV.notifyPreviewFirstLoaded();
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        if (str2 != null && str2.length() != 0 && !StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) str2, false, 2, (java.lang.Object) null)) {
            if (str != null && str.length() != 0) {
                sb.append("\n");
            }
            sb.append(str2);
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
