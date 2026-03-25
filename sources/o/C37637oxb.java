package o;

import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.rxutils.RxBus;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareType;
import com.okinc.share.platforms.SharePlatform;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37637oxb implements InterfaceC49121uia {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public final SharePlatform EZpvd = SharePlatform.SHARE_TO_IM;
    public java.util.List<java.lang.String> KWHzl;

    /* JADX INFO: renamed from: o.oxb$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ShareType.values().length];
            try {
                iArr[ShareType.SHARE_WEBPAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ShareType.SHARE_IMAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public SharePlatform EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public void KWHzl(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public void OLrzqt(java.util.List<java.lang.String> list) {
        this.KWHzl = list;
    }

    @Override // o.InterfaceC49121uia
    public java.lang.CharSequence OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33070mpX.OLrzqt(C35399nuc.LoaderManager.ITrustedWebActivityCallback, context);
    }

    @Override // o.InterfaceC49121uia
    public android.graphics.drawable.Drawable AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33070mpX.EZpvd(C35399nuc.ActionBar.hDKMBd, context);
    }

    @Override // o.InterfaceC49121uia
    public java.util.Set<ShareType> AEQbTJ() {
        return yEE.AhwBna(ShareType.SHARE_IMAGE, ShareType.SHARE_WEBPAGE);
    }

    @Override // o.InterfaceC49121uia
    public boolean EZpvd(@NotNull ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        return shareConfig.getShareParams().getExtras().getBoolean("isEnableIMShare", false) && sDZ.AEQbTJ.uzCIH();
    }

    @Override // o.InterfaceC49121uia
    public void OLrzqt(@NotNull android.app.Activity activity, @NotNull IShareParams iShareParams, InterfaceC49121uia.Activity activity2) {
        IMMessageShareModel iMMessageShareModel;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        int i = Activity.copydefault[iShareParams.getShareType().ordinal()];
        if (i == 1 || i == 2) {
            IMMessageShareModel iMMessageShareModel2 = (IMMessageShareModel) BundleCompat.getParcelable(iShareParams.getExtras(), "imMessageShare", IMMessageShareModel.class);
            if (iMMessageShareModel2 != null) {
                AEQbTJ(activity, iMMessageShareModel2, activity2);
                return;
            }
            java.lang.String string = iShareParams.getExtras().getString("imMessageShareStringParam");
            java.lang.String str = string != null ? string : "";
            if (str.length() > 0 && (iMMessageShareModel = (IMMessageShareModel) C33490mxT.EZpvd(str, IMMessageShareModel.class)) != null) {
                AEQbTJ(activity, iMMessageShareModel, activity2);
                return;
            }
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("invalid parameters for IM share");
            pUU.AEQbTJ("OKIMSharePerformer", "performShare", unsupportedOperationException);
            if (activity2 != null) {
                activity2.EZpvd(SharePlatform.SHARE_TO_IM, unsupportedOperationException);
            }
            RxBus.AEQbTJ(new C49286ulg("false", SharePlatform.SHARE_TO_IM.getPlatformName()));
            return;
        }
        java.lang.UnsupportedOperationException unsupportedOperationException2 = new java.lang.UnsupportedOperationException("unsupported share types");
        pUU.AEQbTJ("OKIMSharePerformer", "performShare", unsupportedOperationException2);
        if (activity2 != null) {
            activity2.EZpvd(SharePlatform.SHARE_TO_IM, unsupportedOperationException2);
        }
        RxBus.AEQbTJ(new C49286ulg("false", SharePlatform.SHARE_TO_IM.getPlatformName()));
    }

    public final void AEQbTJ(android.app.Activity activity, IMMessageShareModel iMMessageShareModel, InterfaceC49121uia.Activity activity2) {
        if ((activity instanceof FragmentActivity ? (FragmentActivity) activity : null) != null) {
            C37638oxc c37638oxcAEQbTJ = C37638oxc.Companion.AEQbTJ(iMMessageShareModel);
            androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c37638oxcAEQbTJ.show(supportFragmentManager);
        }
        if (activity2 != null) {
            activity2.KWHzl(SharePlatform.SHARE_TO_IM);
        }
        RxBus.AEQbTJ(new C49286ulg("true", SharePlatform.SHARE_TO_IM.getPlatformName()));
    }

    /* JADX INFO: renamed from: o.oxb$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oxb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
