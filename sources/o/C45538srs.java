package o;

import androidx.core.os.BundleKt;
import com.okinc.okapm.okqpl.util.QPLConstants;
import com.okinc.okex.center.ui.SupportFullSelfToolsActivity;
import com.okinc.okex.deeplink.e2e.SupportE2EDeeplinkHelper$handleE2EPages$1;
import com.okinc.okex.deeplink.e2e.SupportE2EDeeplinkHelper$handleE2EPages$4;
import com.okinc.okex.rating.net.RatingResult;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC44878sfI;
import o.ActivityC44946sgX;
import o.ActivityC45440spo;
import o.ActivityC45850szP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.srs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45538srs {
    public static final C45538srs AEQbTJ = new C45538srs();

    private C45538srs() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [45=13] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void copydefault(@NotNull android.content.Context context, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("pageKey");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String str2 = str != null ? str : "";
        switch (str2.hashCode()) {
            case -1468632984:
                if (str2.equals("bugs_and_security")) {
                    C45357soK.KWHzl.copydefault(context, new SupportE2EDeeplinkHelper$handleE2EPages$4(context, null));
                    return;
                }
                break;
            case -1212813062:
                if (str2.equals("rating_submit")) {
                    C45357soK.KWHzl.copydefault(context, new SupportE2EDeeplinkHelper$handleE2EPages$1(context, null));
                    return;
                }
                break;
            case -1167873269:
                if (str2.equals("web_article")) {
                    ActivityC45850szP.ActionBar.openPage$default(ActivityC45850szP.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", "https://www.okx.com/help/category/product-documentation")), null, 4, null);
                    return;
                }
                break;
            case -245018474:
                if (str2.equals("announcement_list")) {
                    context.startActivity(sAV.Companion.EZpvd(context, QPLConstants.ENV_DEBUG));
                    return;
                }
                break;
            case -197926433:
                if (str2.equals("debug_box")) {
                    context.startActivity(ActivityC45440spo.Activity.createIntent$default(ActivityC45440spo.Companion, context, false, 2, null));
                    return;
                }
                break;
            case 288288281:
                if (str2.equals("support_center_home")) {
                    context.startActivity(((InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class)).KWHzl(context, null));
                    return;
                }
                break;
            case 395492858:
                if (str2.equals("popup_announcement")) {
                    try {
                        context.startActivity(ActivityC45440spo.Companion.copydefault(context, true));
                        return;
                    } catch (java.lang.Throwable unused) {
                        return;
                    }
                }
                break;
            case 530017545:
                if (str2.equals("quick_tools")) {
                    context.startActivity(SupportFullSelfToolsActivity.Companion.copydefault(context));
                    return;
                }
                break;
            case 1058122593:
                if (str2.equals("rating_success")) {
                    android.content.Intent intent$default = RatingResult.toIntent$default(RatingResult.SubmittedAlready.copydefault, context, null, null, 6, null);
                    if (intent$default != null) {
                        context.startActivity(intent$default);
                        return;
                    }
                    return;
                }
                break;
            case 1132749299:
                if (str2.equals("error_log_upload")) {
                    context.startActivity(sBJ.Companion.KWHzl(context, "1110001362", "460017800671", "460017801982"));
                    return;
                }
                break;
            case 1616056963:
                if (str2.equals("rating_expired")) {
                    android.content.Intent intent$default2 = RatingResult.toIntent$default(RatingResult.Expired.OLrzqt, context, null, null, 6, null);
                    if (intent$default2 != null) {
                        context.startActivity(intent$default2);
                        return;
                    }
                    return;
                }
                break;
            case 1967725159:
                if (str2.equals("check_deposit")) {
                    context.startActivity(ActivityC44946sgX.ActionBar.createIntent$default(ActivityC44946sgX.Companion, context, null, 2, null));
                    return;
                }
                break;
            case 2052150353:
                if (str2.equals("recent_activities")) {
                    context.startActivity(ActivityC44878sfI.StateListAnimator.createIntent$default(ActivityC44878sfI.Companion, context, null, 2, null));
                    return;
                }
                break;
        }
        ((InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class)).EZpvd(context, map);
        pUU.EZpvd("oksupport", "not specify e2e page need handle==");
    }
}
