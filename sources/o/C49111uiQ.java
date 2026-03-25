package o;

import androidx.core.content.ContextCompat;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.ShareType;
import com.okinc.share.platforms.SharePlatform;
import kotlin.jvm.internal.Intrinsics;
import o.C48894ueL;
import o.C48931uew;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uiQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49111uiQ extends AbstractC49096uiB {
    public static final C49111uiQ AEQbTJ = new C49111uiQ();
    public static final SharePlatform AYXKKw = SharePlatform.QQ;
    public static java.lang.String djBIcL = "com.tencent.mobileqq";
    public static java.util.List<java.lang.String> OLrzqt = C56402yEa.EZpvd("com.tencent.mobileqq.activity.JumpActivity");
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public SharePlatform EZpvd() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public java.lang.String KWHzl() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public void KWHzl(java.lang.String str) {
        djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49105uiK, o.InterfaceC49121uia
    public void OLrzqt(java.util.List<java.lang.String> list) {
        OLrzqt = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49105uiK
    public java.util.List<java.lang.String> copydefault() {
        return OLrzqt;
    }

    private C49111uiQ() {
    }

    @Override // o.InterfaceC49121uia
    public java.lang.CharSequence OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return context.getResources().getString(C48931uew.Activity.zsXlph);
    }

    @Override // o.InterfaceC49121uia
    public android.graphics.drawable.Drawable AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getDrawable(context, C48894ueL.ActionBar.fetchVPNInfo);
    }

    @Override // o.InterfaceC49121uia
    public java.util.Set<ShareType> AEQbTJ() {
        return yEE.AhwBna(ShareType.SHARE_TEXT, ShareType.SHARE_WEBPAGE, ShareType.SHARE_IMAGE);
    }

    @Override // o.InterfaceC49121uia
    public void OLrzqt(@NotNull android.app.Activity activity, @NotNull IShareParams iShareParams, InterfaceC49121uia.Activity activity2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        EZpvd(activity, iShareParams, false, activity2);
    }
}
