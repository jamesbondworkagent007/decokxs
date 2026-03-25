package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Exit;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep;
import com.okinc.ok_kyc_core.data.remote.networkmodel.IllustrationAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Polling;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Quit;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment;
import com.okinc.ok_kyc_core_api.model.UrlVendorTokenResp;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rIE {
    public static final rIE KWHzl = new rIE();

    private rIE() {
    }

    public final ProcessingAppModel OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull UrlVendorTokenResp urlVendorTokenResp, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(urlVendorTokenResp, "");
        Intrinsics.checkNotNullParameter(map, "");
        UIAlignment uIAlignment = UIAlignment.Center;
        java.lang.String title = urlVendorTokenResp.getTitle();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.Float fValueOf = java.lang.Float.valueOf(28.0f);
        java.util.ArrayList arrayListCopydefault = yDY.copydefault(new IllustrationAppModel(TtmlNode.TAG_IMAGE, "processing", (java.lang.String) null, (java.lang.String) null, "200", "200", (UIAlignment) null, (java.lang.String) null, (java.lang.Boolean) null, "", (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, java.lang.Float.valueOf(32.0f), (java.lang.Float) null, 24012, (DefaultConstructorMarker) null), new FreeTextAppModel("free-text", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, title, (RichTextContent) null, (FreetextStep) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) 24, (java.lang.String) null, (java.lang.Float) null, bool, uIAlignment, (UIAlignment) null, (java.lang.Boolean) null, "", (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, fValueOf, (java.lang.Float) null, 49078014, (DefaultConstructorMarker) null), new FreeTextAppModel("free-text", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, urlVendorTokenResp.getSubtitle(), (RichTextContent) null, (FreetextStep) null, "graySecondary", (java.lang.String) null, (java.lang.Integer) 16, (java.lang.String) null, (java.lang.Float) null, bool, uIAlignment, (UIAlignment) null, (java.lang.Boolean) null, "", (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, fValueOf, (java.lang.Float) null, 49075966, (DefaultConstructorMarker) null));
        CtaAppModel ctaAppModel = new CtaAppModel(yDY.copydefault(new FreeTextAppModel("free-text", "security_solid", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, urlVendorTokenResp.getHelperText(), (RichTextContent) null, (FreetextStep) null, "grayDisable", (java.lang.String) null, (java.lang.Integer) 12, (java.lang.String) null, (java.lang.Float) null, (java.lang.Boolean) null, uIAlignment, (UIAlignment) null, (java.lang.Boolean) null, "", (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Float) null, (java.lang.Float) null, 65918716, (DefaultConstructorMarker) null)), (java.lang.String) null, "", (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Float) null, (java.lang.Float) null, (java.lang.Boolean) null, TypedValues.PositionType.TYPE_PERCENT_X, (DefaultConstructorMarker) null);
        Onboarding onboarding = new Onboarding(str2, map);
        Polling polling = new Polling(urlVendorTokenResp.getPollingUrl(), (java.util.HashMap) null, 2, (DefaultConstructorMarker) null);
        java.lang.Long pollingTimeout = urlVendorTokenResp.getPollingTimeout();
        return new ProcessingAppModel(arrayListCopydefault, ctaAppModel, (Quit) null, (Exit) null, polling, onboarding, (java.lang.String) null, java.lang.Long.valueOf(pollingTimeout != null ? pollingTimeout.longValue() : 120000L), bool, str, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.HashMap) null, bool, 130124, (DefaultConstructorMarker) null);
    }
}
