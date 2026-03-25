package o;

import android.provider.MediaStore;
import androidx.core.content.ContextCompat;
import com.okinc.rxutils.RxBus;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.platforms.SharePlatform;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48894ueL;
import o.C48931uew;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uiS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49113uiS extends AbstractC49105uiK {
    public static java.lang.String AhwBna;
    public static final C49113uiS AEQbTJ = new C49113uiS();
    public static final SharePlatform OLrzqt = SharePlatform.SAVE_IMAGE;
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public SharePlatform EZpvd() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public java.lang.String KWHzl() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public void KWHzl(java.lang.String str) {
        AhwBna = str;
    }

    private C49113uiS() {
    }

    @Override // o.InterfaceC49121uia
    public java.lang.CharSequence OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return context.getResources().getString(C48931uew.Activity.AkhnZx);
    }

    @Override // o.InterfaceC49121uia
    public android.graphics.drawable.Drawable AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getDrawable(context, C48894ueL.ActionBar.isConnected);
    }

    @Override // o.InterfaceC49121uia
    public java.util.Set<ShareType> AEQbTJ() {
        return yED.AEQbTJ(ShareType.SHARE_IMAGE);
    }

    @Override // o.InterfaceC49121uia
    public void OLrzqt(@NotNull final android.app.Activity activity, @NotNull final IShareParams iShareParams, final InterfaceC49121uia.Activity activity2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        if (activity instanceof AbstractActivityC33041mov) {
            C49292ulm.EZpvd.KWHzl((AbstractActivityC33041mov) activity, new Function1() { // from class: o.uiU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49113uiS.AEQbTJ(iShareParams, activity, activity2, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            return;
        }
        java.lang.String string = activity.getResources().getString(C48931uew.Activity.EZpvd);
        Intrinsics.checkNotNullExpressionValue(string, "");
        OLrzqt(iShareParams, string);
        if (activity2 != null) {
            activity2.EZpvd(EZpvd(), new java.lang.RuntimeException("context is not BaseActivity"));
        }
        RxBus.AEQbTJ(new C49286ulg("false", SharePlatform.SAVE_IMAGE.getPlatformName()));
    }

    public static final Unit AEQbTJ(IShareParams iShareParams, android.app.Activity activity, InterfaceC49121uia.Activity activity2, boolean z) {
        if (z) {
            try {
                Intrinsics.copydefault(iShareParams, "");
                java.lang.String str = C34703nhO.OLrzqt(activity) + "_" + java.lang.System.currentTimeMillis();
                java.lang.String strRequirePendingShareImagePath = ((ImageShareParams) iShareParams).requirePendingShareImagePath();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) strRequirePendingShareImagePath)) {
                    java.lang.String strInsertImage = MediaStore.Images.Media.insertImage(((AbstractActivityC33041mov) activity).getContentResolver(), strRequirePendingShareImagePath, str, (java.lang.String) null);
                    C33610mzh c33610mzh = C33610mzh.OLrzqt;
                    android.net.Uri uri = android.net.Uri.parse(strInsertImage);
                    Intrinsics.checkNotNullExpressionValue(uri, "");
                    activity.sendBroadcast(new android.content.Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", android.net.Uri.fromFile(new java.io.File(c33610mzh.EZpvd(activity, uri)))));
                    C49113uiS c49113uiS = AEQbTJ;
                    java.lang.String string = ((AbstractActivityC33041mov) activity).getResources().getString(C48931uew.Activity.uzCIH);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    c49113uiS.AEQbTJ(iShareParams, string);
                    if (activity2 != null) {
                        activity2.KWHzl(c49113uiS.EZpvd());
                    }
                    RxBus.AEQbTJ(new C49286ulg("true", SharePlatform.SAVE_IMAGE.getPlatformName()));
                } else {
                    C49113uiS c49113uiS2 = AEQbTJ;
                    java.lang.String string2 = ((AbstractActivityC33041mov) activity).getResources().getString(C48931uew.Activity.EZpvd);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    c49113uiS2.OLrzqt(iShareParams, string2);
                    if (activity2 != null) {
                        activity2.EZpvd(c49113uiS2.EZpvd(), new java.lang.IllegalArgumentException("bitmap or imagePath is null!"));
                    }
                    RxBus.AEQbTJ(new C49286ulg("false", SharePlatform.SAVE_IMAGE.getPlatformName()));
                    return Unit.INSTANCE;
                }
            } catch (java.lang.Exception e) {
                C49113uiS c49113uiS3 = AEQbTJ;
                java.lang.String string3 = ((AbstractActivityC33041mov) activity).getResources().getString(C48931uew.Activity.EZpvd);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                c49113uiS3.OLrzqt(iShareParams, string3);
                if (activity2 != null) {
                    activity2.EZpvd(c49113uiS3.EZpvd(), e);
                }
                RxBus.AEQbTJ(new C49286ulg("false", SharePlatform.SAVE_IMAGE.getPlatformName()));
            } catch (java.lang.OutOfMemoryError e2) {
                C49113uiS c49113uiS4 = AEQbTJ;
                java.lang.String string4 = ((AbstractActivityC33041mov) activity).getResources().getString(C48931uew.Activity.EZpvd);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                c49113uiS4.OLrzqt(iShareParams, string4);
                if (activity2 != null) {
                    activity2.EZpvd(c49113uiS4.EZpvd(), e2);
                }
                RxBus.AEQbTJ(new C49286ulg("false", SharePlatform.SAVE_IMAGE.getPlatformName()));
            }
        }
        return Unit.INSTANCE;
    }
}
