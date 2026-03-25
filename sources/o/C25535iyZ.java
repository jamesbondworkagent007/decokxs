package o;

import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25535iyZ {
    @yCM
    public C25535iyZ() {
    }

    public static /* synthetic */ boolean checkIfDeFiIsLimited$default(C25535iyZ c25535iyZ, android.content.Context context, iBC ibc, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            ibc = null;
        }
        return c25535iyZ.KWHzl(context, ibc);
    }

    public final boolean OLrzqt(@NotNull final android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) str, (java.lang.CharSequence) "investmentId", true) && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) str, (java.lang.CharSequence) "chainId", true)) {
            return false;
        }
        return KWHzl(context, new iBC(0, 0, 0, null, new Function0() { // from class: o.iza
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25535iyZ.EZpvd(this.AEQbTJ, context);
            }
        }, 15, null));
    }

    public static final Unit EZpvd(C25535iyZ c25535iyZ, android.content.Context context) {
        routeToDeFiMain$default(c25535iyZ, context, false, 2, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void routeToDeFiMain$default(C25535iyZ c25535iyZ, android.content.Context context, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c25535iyZ.KWHzl(context, z);
    }

    public final boolean AEQbTJ() {
        return ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).OLrzqt(OKComplianceRestrictionService.Feature.WEB3DEFI);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jwL.showDialog$default(o.jwL, android.content.Context, java.lang.CharSequence, java.lang.CharSequence, android.view.View, boolean, boolean, java.lang.CharSequence, kotlin.jvm.functions.Function0, java.lang.CharSequence, android.view.View$OnClickListener, boolean, int, java.lang.Object):o.xaY */
    public final boolean KWHzl(@NotNull android.content.Context context, iBC ibc) {
        Intrinsics.checkNotNullParameter(context, "");
        FeatureRestrictionInfo featureRestrictionInfoEZpvd = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).EZpvd(OKComplianceRestrictionService.Feature.WEB3DEFI);
        boolean zEZpvd = featureRestrictionInfoEZpvd != null ? Intrinsics.EZpvd(featureRestrictionInfoEZpvd.getRestricted(), java.lang.Boolean.TRUE) : false;
        if (zEZpvd && ibc != null) {
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || !activity.isFinishing()) {
                C27496jwL c27496jwL = C27496jwL.EZpvd;
                java.lang.String string = context.getString(ibc.copydefault());
                int iAEQbTJ = ibc.AEQbTJ();
                java.lang.String countryName = featureRestrictionInfoEZpvd != null ? featureRestrictionInfoEZpvd.getCountryName() : null;
                C27496jwL.showDialog$default(c27496jwL, context, string, C33069mpW.KWHzl(context, iAEQbTJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("location", countryName != null ? countryName : ""))), null, false, false, context.getString(ibc.KWHzl()), ibc.OLrzqt(), null, null, false, 1816, null);
            }
        }
        return zEZpvd;
    }

    public final void KWHzl(android.content.Context context, boolean z) {
        ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).KWHzl(context, z, (android.os.Bundle) null);
    }
}
