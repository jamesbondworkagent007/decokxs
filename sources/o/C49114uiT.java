package o;

import android.provider.Telephony;
import androidx.core.content.ContextCompat;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.rxutils.RxBus;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.link.LinkShareParams;
import com.okinc.share.platforms.SharePlatform;
import kotlin.jvm.internal.Intrinsics;
import o.C48894ueL;
import o.C48931uew;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uiT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49114uiT extends AbstractC49096uiB {
    public static java.util.List<java.lang.String> AEQbTJ;
    public static java.lang.String AhwBna;
    public static final C49114uiT copydefault = new C49114uiT();
    public static final SharePlatform valueOf = SharePlatform.SMS;
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49121uia
    public SharePlatform EZpvd() {
        return valueOf;
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

    private C49114uiT() {
    }

    @Override // o.InterfaceC49121uia
    public java.lang.CharSequence OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return context.getResources().getString(C48931uew.Activity.OLrzqt);
    }

    @Override // o.InterfaceC49121uia
    public android.graphics.drawable.Drawable AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getDrawable(context, C48894ueL.ActionBar.AkhnZx);
    }

    @Override // o.InterfaceC49121uia
    public java.util.Set<ShareType> AEQbTJ() {
        return yEE.AhwBna(ShareType.SHARE_TEXT, ShareType.SHARE_IMAGE, ShareType.SHARE_WEBPAGE);
    }

    @Override // o.AbstractC49096uiB
    public android.content.Intent copydefault(@NotNull android.app.Activity activity, @NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND", android.net.Uri.parse("smsto:"));
        java.lang.String string = iShareParams.getExtras().getString("sms_address");
        if (string != null && string.length() != 0) {
            intent.putExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, string);
        }
        java.lang.String smsBody = iShareParams.getSmsBody();
        if (smsBody == null || smsBody.length() == 0) {
            smsBody = iShareParams.getBody();
        }
        if (iShareParams.getShareType() == ShareType.SHARE_IMAGE) {
            intent.setType("image/*");
            ImageShareParams imageShareParams = (ImageShareParams) iShareParams;
            intent.putExtra("android.intent.extra.STREAM", ShareFileProvider.Companion.copydefault(activity, imageShareParams.requirePendingShareImagePath()));
            intent.addFlags(1);
            java.lang.String strOLrzqt = copydefault.OLrzqt(imageShareParams.getTitle(), smsBody, (java.lang.String) null);
            intent.putExtra("android.intent.extra.TEXT", strOLrzqt);
            intent.putExtra("sms_body", strOLrzqt);
        } else if (iShareParams.getShareType() == ShareType.SHARE_WEBPAGE) {
            LinkShareParams linkShareParams = (LinkShareParams) iShareParams;
            java.lang.String strOLrzqt2 = copydefault.OLrzqt(linkShareParams.getTitle(), smsBody, linkShareParams.getLinkUrl());
            intent.putExtra("android.intent.extra.TEXT", strOLrzqt2);
            intent.putExtra("sms_body", strOLrzqt2);
            intent.setType("text/plain");
        } else {
            java.lang.String strOLrzqt3 = copydefault.OLrzqt(iShareParams.getTitle(), smsBody, (java.lang.String) null);
            intent.putExtra("android.intent.extra.TEXT", strOLrzqt3);
            intent.putExtra("sms_body", strOLrzqt3);
            intent.setType("text/plain");
        }
        return intent;
    }

    public final void KWHzl(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        java.lang.String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(C32979mnm.EZpvd.OLrzqt());
        pUU.KWHzl("SMSSharePerformer", "setupSMSPackage->defaultSmsPackage:" + defaultSmsPackage);
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) defaultSmsPackage)) {
            defaultSmsPackage = "com.android.mms";
        }
        intent.setPackage(defaultSmsPackage);
    }

    @Override // o.InterfaceC49121uia
    public void OLrzqt(@NotNull android.app.Activity activity, @NotNull IShareParams iShareParams, InterfaceC49121uia.Activity activity2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        try {
            android.content.Intent intentCopydefault = copydefault(activity, iShareParams);
            KWHzl(intentCopydefault);
            intentCopydefault.addFlags(268435456);
            activity.startActivity(intentCopydefault);
            if (activity2 != null) {
                activity2.KWHzl(EZpvd());
            }
            RxBus.AEQbTJ(new C49286ulg("true", EZpvd().getPlatformName()));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            java.lang.String string = activity.getResources().getString(C48931uew.Activity.gHZMYf);
            Intrinsics.checkNotNullExpressionValue(string, "");
            OLrzqt(iShareParams, string);
            if (activity2 != null) {
                activity2.EZpvd(EZpvd(), e);
            }
            RxBus.AEQbTJ(new C49286ulg("false", EZpvd().getPlatformName()));
            java.lang.String str = "sms share occur error:" + e.getMessage();
            C6777aVl.Companion.EZpvd(new java.lang.IllegalArgumentException(str, e));
            pUU.copydefault("SMSSharePerformer", str);
        }
    }
}
