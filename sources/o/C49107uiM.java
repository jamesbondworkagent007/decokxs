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

/* JADX INFO: renamed from: o.uiM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49107uiM extends AbstractC49096uiB {
    public static final C49107uiM OLrzqt = new C49107uiM();
    public static final SharePlatform valueOf = SharePlatform.LINE;
    public static java.lang.String djBIcL = "jp.naver.line.android";
    public static java.util.List<java.lang.String> AEQbTJ = C56402yEa.EZpvd("com.linecorp.line.share.common.view.FullPickerLaunchActivity");
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public SharePlatform EZpvd() {
        return valueOf;
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
        AEQbTJ = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49105uiK
    public java.util.List<java.lang.String> copydefault() {
        return AEQbTJ;
    }

    private C49107uiM() {
    }

    @Override // o.InterfaceC49121uia
    public java.lang.CharSequence OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return context.getResources().getString(C48931uew.Activity.AhwBna);
    }

    @Override // o.InterfaceC49121uia
    public android.graphics.drawable.Drawable AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getDrawable(context, C48894ueL.ActionBar.AhwBna);
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
