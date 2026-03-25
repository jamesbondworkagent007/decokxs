package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.google.gson.JsonArray;
import com.okinc.biz.bean.ShareInfo;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.api.screenshot.ScreenshotListenerHolder;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareData;
import com.okinc.share.bean.ShareFooterInfo;
import com.okinc.share.bean.ShareType;
import com.okinc.share.impl.ShareServiceImpl$showWebSharePopup$1;
import com.okinc.share.platforms.SharePlatform;
import com.okinc.web.bean.WebShareInfo;
import com.okinc.web.web.IWebActivityAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C48931uew;
import o.C49300ulu;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ugY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49013ugY extends AbstractC43215rlA implements InterfaceC48893ueK {
    public C49005ugQ copydefault;

    @Override // o.InterfaceC48893ueK
    public boolean uzCIH() {
        return false;
    }

    @Override // o.InterfaceC48893ueK
    public void EZpvd(@NotNull InterfaceC49121uia interfaceC49121uia) {
        Intrinsics.checkNotNullParameter(interfaceC49121uia, "");
        C49098uiD.registerSharePerformer$default(C49098uiD.OLrzqt, interfaceC49121uia, null, 2, null);
    }

    @Override // o.InterfaceC48893ueK
    public InterfaceC49121uia copydefault(@NotNull SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        return C49098uiD.OLrzqt.AEQbTJ(sharePlatform);
    }

    @Override // o.InterfaceC48893ueK
    public boolean AEQbTJ(@NotNull SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        return C49125uie.OLrzqt(sharePlatform);
    }

    @Override // o.InterfaceC48893ueK
    public void KWHzl(@NotNull android.app.Activity activity, @NotNull IShareParams iShareParams, @NotNull SharePlatform sharePlatform, InterfaceC49121uia.Activity activity2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        C49098uiD.OLrzqt.AEQbTJ(activity, iShareParams, sharePlatform, activity2);
    }

    @Override // o.InterfaceC48893ueK
    public InterfaceC49000ugL DTwDnp() {
        ShareData shareDataCopydefault = C49004ugP.OLrzqt.copydefault();
        C49005ugQ c49005ugQ = this.copydefault;
        if (c49005ugQ == null) {
            this.copydefault = new C49005ugQ(shareDataCopydefault);
        } else {
            Intrinsics.copydefault(c49005ugQ);
            c49005ugQ.OLrzqt(shareDataCopydefault);
        }
        C49005ugQ c49005ugQ2 = this.copydefault;
        Intrinsics.copydefault(c49005ugQ2);
        return c49005ugQ2;
    }

    @Override // o.InterfaceC48893ueK
    public void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, IWebActivityAPI iWebActivityAPI, WebShareInfo webShareInfo) {
        ShareInfo shareInfo;
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        if (iWebActivityAPI == null) {
            return;
        }
        JsonArray unifiedMultiShareConfigJson = webShareInfo != null ? webShareInfo.getUnifiedMultiShareConfigJson() : null;
        if (unifiedMultiShareConfigJson != null) {
            java.lang.String string = unifiedMultiShareConfigJson.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            OLrzqt(abstractActivityC33041mov, string);
            C48954ufS.KWHzl.OLrzqt(webShareInfo != null ? webShareInfo.getTrackingData() : null);
            return;
        }
        if (webShareInfo != null) {
            if (!ShareType.CREATOR.isValid(webShareInfo.getShareType()) || webShareInfo.getShareType() == ShareType.SHARE_TEXT.getType()) {
                pUU.copydefault("ShareService", "unsupported share type:" + webShareInfo.getShareType());
                return;
            }
            shareInfo = new ShareInfo(webShareInfo.getShareLink(), webShareInfo.getShareImageUrl(), webShareInfo.getShareTitle(), webShareInfo.getShareText(), webShareInfo.getTrackingData(), java.lang.Integer.valueOf(webShareInfo.getShareType()));
        } else {
            shareInfo = new ShareInfo(iWebActivityAPI.getWebUrl(), null, iWebActivityAPI.getWebTitle(), null, null, null, 58, null);
        }
        copydefault(abstractActivityC33041mov, C49292ulm.EZpvd.copydefault(shareInfo, "webview"));
        C48954ufS.KWHzl.OLrzqt(shareInfo.getTrackingData());
    }

    public final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), Dispatchers.getIO(), null, new ShareServiceImpl$showWebSharePopup$1(str, abstractActivityC33041mov, null), 2, null);
    }

    @Override // o.InterfaceC48893ueK
    public void copydefault(IWebActivityAPI iWebActivityAPI, WebShareInfo webShareInfo) {
        C48954ufS.KWHzl.AEQbTJ(webShareInfo != null ? webShareInfo.getTrackingData() : null);
    }

    @Override // o.InterfaceC48893ueK
    public InterfaceC48895ueM KWHzl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "");
        return new C49355umw(context, attributeSet);
    }

    @Override // o.InterfaceC48893ueK
    public <T extends AbstractActivityC33041mov> InterfaceC48892ueJ copydefault(@NotNull T t, @NotNull ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(shareConfig, "");
        return OLrzqt(t, shareConfig, null);
    }

    @Override // o.InterfaceC48893ueK
    public <T extends AbstractActivityC33041mov> InterfaceC48892ueJ OLrzqt(@NotNull T t, @NotNull ShareConfig shareConfig, InterfaceC49097uiC interfaceC49097uiC) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(shareConfig, "");
        return EZpvd(t, MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, C56402yEa.EZpvd(shareConfig), false, 0.0f, false, null, null, 60, null), interfaceC49097uiC);
    }

    @Override // o.InterfaceC48893ueK
    public <T extends AbstractActivityC33041mov> InterfaceC48892ueJ OLrzqt(@NotNull T t, @NotNull MultiShareConfig multiShareConfig) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(multiShareConfig, "");
        return EZpvd(t, multiShareConfig, (InterfaceC49097uiC) null);
    }

    @Override // o.InterfaceC48893ueK
    public <T extends AbstractActivityC33041mov> InterfaceC48892ueJ EZpvd(@NotNull T t, @NotNull MultiShareConfig multiShareConfig, InterfaceC49097uiC interfaceC49097uiC) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(multiShareConfig, "");
        C49300ulu.TaskDescription taskDescription = C49300ulu.Companion;
        if (taskDescription.AEQbTJ()) {
            taskDescription.OLrzqt();
        }
        if (t.isDestroyed()) {
            return null;
        }
        C49300ulu c49300uluAEQbTJ = taskDescription.AEQbTJ(multiShareConfig);
        c49300uluAEQbTJ.EZpvd(interfaceC49097uiC);
        androidx.fragment.app.FragmentManager supportFragmentManager = t.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c49300uluAEQbTJ.show(supportFragmentManager, "SharePanelFragment");
        return c49300uluAEQbTJ;
    }

    @Override // o.InterfaceC48893ueK
    public ISharePreviewConfig KWHzl(@NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(iShareParams, "");
        return C49285ulf.EZpvd.KWHzl(iShareParams);
    }

    @Override // o.InterfaceC48893ueK
    public java.lang.String AubY() {
        java.lang.String string = C32979mnm.EZpvd.OLrzqt().getResources().getString(C48931uew.Activity.ORxRYg);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.InterfaceC48893ueK
    public void EZpvd(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) ActivityC49223ukW.class));
    }

    @Override // o.InterfaceC48893ueK
    public SharePlatform KWHzl(int i) {
        return SharePlatform.CREATOR.valueOf(i);
    }

    @Override // o.InterfaceC48893ueK
    public boolean UeEOUB() {
        return C49180ujg.EZpvd.EZpvd();
    }

    @Override // o.InterfaceC48893ueK
    public void AEQbTJ(boolean z, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        C49180ujg.EZpvd.OLrzqt(z, function1);
    }

    @Override // o.InterfaceC48893ueK
    public java.lang.CharSequence sSMYrx() {
        return C49180ujg.EZpvd.KWHzl();
    }

    @Override // o.InterfaceC48893ueK
    public ViewOnClickListenerC54939xaY AEQbTJ(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return C49180ujg.EZpvd.copydefault(activity);
    }

    @Override // o.InterfaceC48893ueK
    public InterfaceC48901ueS copydefault(java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, java.lang.Integer num, java.lang.Float f, boolean z) {
        return new C49039ugy(charSequence, drawable, num, f, z);
    }

    @Override // o.InterfaceC48893ueK
    public void OLrzqt(@NotNull InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        Intrinsics.checkNotNullParameter(interfaceC48969ufh, "");
        IShareParams iShareParamsRequireShareParams = interfaceC48969ufh.requireShareParams();
        C48992ugD.KWHzl.KWHzl(iShareParamsRequireShareParams.getTriggerSource(), iShareParamsRequireShareParams.getShareFrom(), interfaceC48969ufh.isMultiShare() ? java.lang.Integer.valueOf(interfaceC48969ufh.requirePageIndex()) : null);
    }

    @Override // o.InterfaceC48893ueK
    public boolean aKErDB() {
        return C49300ulu.Companion.AEQbTJ();
    }

    @Override // o.InterfaceC48893ueK
    public AbstractC58185ywX<C48887ueE> AEQbTJ(@NotNull java.lang.String str, @NotNull C48891ueI c48891ueI) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c48891ueI, "");
        return C49129uii.AEQbTJ.copydefault(str, c48891ueI);
    }

    @Override // o.InterfaceC48893ueK
    public ShareFooterInfo ORxRYg() {
        return C49004ugP.OLrzqt.copydefault().getReferralFooterInfo();
    }

    @Override // o.InterfaceC48893ueK
    public AbstractC49065uhX OLrzqt(@NotNull ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        return C49256ulC.Companion.KWHzl(shareConfig);
    }

    @Override // o.InterfaceC48893ueK
    public void KWHzl(@NotNull androidx.fragment.app.Fragment fragment, @NotNull InterfaceC48970ufi interfaceC48970ufi) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(interfaceC48970ufi, "");
        ScreenshotListenerHolder.KWHzl.OLrzqt(fragment, interfaceC48970ufi);
    }

    @Override // o.InterfaceC48893ueK
    public void AEQbTJ(@NotNull InterfaceC49001ugM interfaceC49001ugM) {
        Intrinsics.checkNotNullParameter(interfaceC49001ugM, "");
        C49004ugP.OLrzqt.EZpvd(interfaceC49001ugM);
    }

    @Override // o.InterfaceC48893ueK
    public ShareData zuBGHE() {
        return C49004ugP.OLrzqt.copydefault();
    }

    @Override // o.InterfaceC48893ueK
    public boolean fZBcTu() {
        return (!((InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class)).AkhnZx() || C49004ugP.OLrzqt.EZpvd().isReferralRestriction() || ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz()) ? false : true;
    }

    @Override // o.InterfaceC48893ueK
    public java.lang.String iwGUEr() {
        return fZBcTu() ? "referral" : "others";
    }

    @Override // o.InterfaceC48893ueK
    public void copydefault(@NotNull java.lang.String str, @NotNull InterfaceC49002ugN interfaceC49002ugN) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC49002ugN, "");
        C49006ugR.KWHzl.OLrzqt(str, interfaceC49002ugN);
    }
}
