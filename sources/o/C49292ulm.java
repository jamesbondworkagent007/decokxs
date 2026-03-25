package o;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.view.ViewGroup;
import androidx.core.content.res.ResourcesCompat;
import com.just.agentweb.DefaultWebClient;
import com.okinc.biz.bean.ShareInfo;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.bean.link.LinkDefaultPreviewConfig;
import com.okinc.share.bean.link.LinkShareParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C33625mzw;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ulm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49292ulm {
    public static final C49292ulm EZpvd = new C49292ulm();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ulo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49292ulm.copydefault();
        }
    });
    public static final int copydefault = 8;

    private C49292ulm() {
    }

    public final ShareConfig copydefault(@NotNull final ShareInfo shareInfo, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(shareInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Integer shareType = shareInfo.getShareType();
        int type = ShareType.SHARE_IMAGE.getType();
        if (shareType != null && shareType.intValue() == type) {
            ShareConfig.ActionBar actionBar = ShareConfig.Companion;
            ImageShareParams.ActionBar actionBar2 = ImageShareParams.Companion;
            java.lang.String shareImageUrl = shareInfo.getShareImageUrl();
            return ShareConfig.ActionBar.create$default(actionBar, ImageShareParams.ActionBar.create$default(actionBar2, shareImageUrl != null ? shareImageUrl : "", null, 2, null), null, 2, null);
        }
        LinkShareParams.Activity activity = LinkShareParams.Companion;
        java.lang.String shareLink = shareInfo.getShareLink();
        return ShareConfig.Companion.copydefault(activity.AEQbTJ(shareLink != null ? shareLink : "", new Function1() { // from class: o.ull
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49292ulm.OLrzqt(shareInfo, str, (LinkShareParams) obj);
            }
        }), new Function1() { // from class: o.ulp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49292ulm.EZpvd(shareInfo, (ShareConfig) obj);
            }
        });
    }

    public static final Unit OLrzqt(ShareInfo shareInfo, java.lang.String str, LinkShareParams linkShareParams) {
        Intrinsics.checkNotNullParameter(linkShareParams, "");
        java.lang.String str2 = shareInfo.getShareTitle() + "\n " + shareInfo.getShareLink();
        linkShareParams.setBody(str2);
        linkShareParams.setEmailBody(str2);
        linkShareParams.setSmsBody(str2);
        java.lang.String shareText = shareInfo.getShareText();
        if (shareText == null) {
            shareText = "";
        }
        linkShareParams.setSubtitle(shareText);
        java.lang.String shareTitle = shareInfo.getShareTitle();
        linkShareParams.setTitle(shareTitle != null ? shareTitle : "");
        linkShareParams.setShareFrom(str);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final ShareInfo shareInfo, ShareConfig shareConfig) {
        ImageSource imageSourceOLrzqt;
        Intrinsics.checkNotNullParameter(shareConfig, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) shareInfo.getShareImageUrl())) {
            ImageSource.StateListAnimator stateListAnimator = ImageSource.Companion;
            java.lang.String shareImageUrl = shareInfo.getShareImageUrl();
            Intrinsics.copydefault((java.lang.Object) shareImageUrl);
            imageSourceOLrzqt = stateListAnimator.OLrzqt(shareImageUrl);
        } else {
            imageSourceOLrzqt = null;
        }
        shareConfig.setPreviewConfig(LinkDefaultPreviewConfig.Activity.create$default(LinkDefaultPreviewConfig.Companion, null, null, imageSourceOLrzqt, null, null, new Function1() { // from class: o.uln
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49292ulm.copydefault(shareInfo, (LinkDefaultPreviewConfig) obj);
            }
        }, 27, null));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ShareInfo shareInfo, LinkDefaultPreviewConfig linkDefaultPreviewConfig) {
        Intrinsics.checkNotNullParameter(linkDefaultPreviewConfig, "");
        linkDefaultPreviewConfig.setPreviewTitle(shareInfo.getShareTitle());
        linkDefaultPreviewConfig.setPreviewContent(shareInfo.getShareLink());
        return Unit.INSTANCE;
    }

    public static final android.graphics.Typeface copydefault() {
        return ResourcesCompat.getFont(C32979mnm.EZpvd.OLrzqt(), C52761wXj.Dialog.AhwBna);
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return (str == null || str.length() == 0) ? str : C59449zhJ.replace$default(C59449zhJ.replace$default(str, DefaultWebClient.HTTPS_SCHEME, "", false, 4, (java.lang.Object) null), "http", "", false, 4, (java.lang.Object) null);
    }

    public final void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (Build.VERSION.SDK_INT < 29) {
            abstractActivityC33041mov.getPermissionHelper().copydefault(abstractActivityC33041mov, 1, new Application(function1));
        } else {
            function1.invoke(java.lang.Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: o.ulm$Application */
    public static final class Application implements C33625mzw.Activity {
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> AEQbTJ;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function1<? super java.lang.Boolean, Unit> function1) {
            this.AEQbTJ = function1;
        }

        @Override // o.C33625mzw.Activity
        public void EZpvd() {
            pUU.KWHzl("OKShare", "ensureReadWritePermissionIfNeed->hasPermissions");
            this.AEQbTJ.invoke(java.lang.Boolean.TRUE);
        }

        @Override // o.C33625mzw.Activity
        public void EZpvd(java.util.List<java.lang.String> list) {
            pUU.KWHzl("OKShare", "ensureReadWritePermissionIfNeed->noPermissions:" + list);
            this.AEQbTJ.invoke(java.lang.Boolean.FALSE);
        }
    }

    public final android.graphics.Bitmap AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            byte[] bArrDecode = android.util.Base64.decode(C59449zhJ.replace$default(C59449zhJ.replace$default(C59449zhJ.replace$default(str, "data:image/png;base64,", "", false, 4, (java.lang.Object) null), "data:image/jpeg;base64,", "", false, 4, (java.lang.Object) null), "data:image/webp;base64,", "", false, 4, (java.lang.Object) null), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
            return null;
        }
    }

    public final void KWHzl(@NotNull android.view.View view, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
        Intrinsics.checkNotNullParameter(view, "");
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (num != null) {
                marginLayoutParams.leftMargin = num.intValue();
            }
            if (num2 != null) {
                marginLayoutParams.topMargin = num2.intValue();
            }
            if (num3 != null) {
                marginLayoutParams.rightMargin = num3.intValue();
            }
            if (num4 != null) {
                marginLayoutParams.bottomMargin = num4.intValue();
            }
        }
    }
}
