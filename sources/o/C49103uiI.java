package o;

import androidx.core.content.ContextCompat;
import com.okinc.rxutils.RxBus;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.link.LinkShareParams;
import com.okinc.share.platforms.SharePlatform;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C48894ueL;
import o.C48931uew;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uiI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49103uiI extends AbstractC49105uiK {
    public static java.lang.String AYXKKw;
    public static final C49103uiI AEQbTJ = new C49103uiI();
    public static final SharePlatform OLrzqt = SharePlatform.LINK;
    public static final int copydefault = 8;

    /* JADX INFO: renamed from: o.uiI$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ShareType.values().length];
            try {
                iArr[ShareType.SHARE_TEXT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ShareType.SHARE_WEBPAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareType.SHARE_IMAGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public SharePlatform EZpvd() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public java.lang.String KWHzl() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public void KWHzl(java.lang.String str) {
        AYXKKw = str;
    }

    private C49103uiI() {
    }

    @Override // o.InterfaceC49121uia
    public java.lang.CharSequence OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return context.getResources().getString(C48931uew.Activity.values);
    }

    @Override // o.InterfaceC49121uia
    public android.graphics.drawable.Drawable AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getDrawable(context, C48894ueL.ActionBar.AEQbTJ);
    }

    @Override // o.InterfaceC49121uia
    public java.util.Set<ShareType> AEQbTJ() {
        return yEE.AhwBna(ShareType.SHARE_TEXT, ShareType.SHARE_WEBPAGE, ShareType.SHARE_IMAGE);
    }

    @Override // o.AbstractC49105uiK, o.InterfaceC49121uia
    public boolean EZpvd(@NotNull ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        int i = StateListAnimator.AEQbTJ[shareConfig.getShareParams().getShareType().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C33129mqd.OLrzqt((java.lang.CharSequence) shareConfig.getShareParams().getBody());
    }

    @Override // o.InterfaceC49121uia
    public void OLrzqt(@NotNull android.app.Activity activity, @NotNull IShareParams iShareParams, InterfaceC49121uia.Activity activity2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        RxBus.AEQbTJ(new C49286ulg("true", "CopyLink"));
        java.lang.String body = iShareParams.getBody();
        if (iShareParams.getShareType() == ShareType.SHARE_WEBPAGE) {
            body = ((LinkShareParams) iShareParams).getLinkUrl();
        }
        try {
            C49281ulb.copyToClipboard$default(C49281ulb.OLrzqt, body, null, 2, null);
            java.lang.String string = activity.getResources().getString(C48931uew.Activity.fIwbmz);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AEQbTJ(iShareParams, string);
            if (activity2 != null) {
                activity2.KWHzl(EZpvd());
            }
            RxBus.AEQbTJ(new C49286ulg("true", EZpvd().getPlatformName()));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            java.lang.String string2 = activity.getResources().getString(C48931uew.Activity.gHZMYf);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            OLrzqt(iShareParams, string2);
            if (activity2 != null) {
                activity2.EZpvd(EZpvd(), e);
            }
            RxBus.AEQbTJ(new C49286ulg("false", EZpvd().getPlatformName()));
        }
    }
}
