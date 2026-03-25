package o;

import androidx.core.content.ContextCompat;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.link.LinkShareParams;
import com.okinc.share.platforms.SharePlatform;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48894ueL;
import o.C48931uew;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uiR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49112uiR extends AbstractC49105uiK {
    public static java.lang.String valueOf;
    public static final C49112uiR AEQbTJ = new C49112uiR();
    public static final SharePlatform copydefault = SharePlatform.MORE;
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public SharePlatform EZpvd() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public java.lang.String KWHzl() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public void KWHzl(java.lang.String str) {
        valueOf = str;
    }

    private C49112uiR() {
    }

    @Override // o.InterfaceC49121uia
    public java.lang.CharSequence OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return context.getResources().getString(C48931uew.Activity.fetchVPNInfo);
    }

    @Override // o.InterfaceC49121uia
    public android.graphics.drawable.Drawable AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getDrawable(context, C48894ueL.ActionBar.AYXKKw);
    }

    @Override // o.InterfaceC49121uia
    public java.util.Set<ShareType> AEQbTJ() {
        return yEE.AhwBna(ShareType.SHARE_TEXT, ShareType.SHARE_IMAGE, ShareType.SHARE_WEBPAGE);
    }

    @Override // o.InterfaceC49121uia
    public void OLrzqt(@NotNull android.app.Activity activity, @NotNull IShareParams iShareParams, InterfaceC49121uia.Activity activity2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
            if (iShareParams.getShareType() == ShareType.SHARE_IMAGE) {
                intent.setType("image/*");
                Intrinsics.copydefault(intent.putExtra("android.intent.extra.STREAM", ShareFileProvider.Companion.copydefault(activity, ((ImageShareParams) iShareParams).requirePendingShareImagePath())));
            } else if (iShareParams.getShareType() == ShareType.SHARE_WEBPAGE) {
                java.lang.String linkUrl = ((LinkShareParams) iShareParams).getLinkUrl();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) linkUrl) && !StringsKt__StringsKt.contains$default((java.lang.CharSequence) ((LinkShareParams) iShareParams).getBody(), (java.lang.CharSequence) linkUrl, false, 2, (java.lang.Object) null)) {
                    ((LinkShareParams) iShareParams).setBody(((LinkShareParams) iShareParams).getBody() + " " + linkUrl);
                }
                intent.putExtra("android.intent.extra.TEXT", ((LinkShareParams) iShareParams).getBody());
                intent.setType("text/plain");
            } else {
                intent.putExtra("android.intent.extra.TEXT", iShareParams.getBody());
                intent.setType("text/plain");
            }
            intent.addFlags(1);
            intent.addFlags(268435456);
            activity.startActivity(intent);
            if (activity2 != null) {
                activity2.KWHzl(EZpvd());
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            if (activity2 != null) {
                activity2.EZpvd(EZpvd(), e);
            }
        }
    }
}
