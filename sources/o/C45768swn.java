package o;

import android.view.View;
import android.view.ViewGroup;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okex.lite.ukbanner.UKBannerType;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.swn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45768swn {
    public static final C45768swn OLrzqt = new C45768swn();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sws
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45768swn.AEQbTJ();
        }
    });
    public static final int KWHzl = 8;

    private C45768swn() {
    }

    public final InterfaceC47278tmy copydefault() {
        return (InterfaceC47278tmy) AEQbTJ.getValue();
    }

    public static final InterfaceC47278tmy AEQbTJ() {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB();
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull android.view.ViewGroup viewGroup, @NotNull UKBannerType uKBannerType) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(uKBannerType, "");
        if (fragmentManager.isDestroyed() || fragmentManager.isStateSaved()) {
            return;
        }
        if (!copydefault().values()) {
            AEQbTJ(viewGroup);
        } else if (((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.BANNER)) {
            KWHzl(viewGroup, uKBannerType);
        } else {
            AEQbTJ(viewGroup);
        }
    }

    public final void KWHzl(android.view.ViewGroup viewGroup, UKBannerType uKBannerType) {
        InterfaceC45752swP interfaceC45752swP = (InterfaceC45752swP) C43251rlk.OLrzqt(InterfaceC45752swP.class);
        if (interfaceC45752swP != null) {
            android.content.Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            OKAlertBanner oKAlertBannerCopydefault = interfaceC45752swP.copydefault(context, uKBannerType);
            if (oKAlertBannerCopydefault == null) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            viewGroup.removeAllViews();
            viewGroup.addView(oKAlertBannerCopydefault, marginLayoutParams);
            android.content.Context context2 = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            android.app.Activity activityCopydefault = copydefault(context2);
            if (activityCopydefault != null) {
                C45776swv.KWHzl.KWHzl(activityCopydefault, true);
                oKAlertBannerCopydefault.addOnAttachStateChangeListener(new ActionBar(activityCopydefault));
            }
        }
    }

    /* JADX INFO: renamed from: o.swn$ActionBar */
    public static final class ActionBar implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.app.Activity AEQbTJ;

        public ActionBar(android.app.Activity activity) {
            this.AEQbTJ = activity;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C45776swv.KWHzl.KWHzl(this.AEQbTJ, true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            if (C45768swn.OLrzqt.copydefault().values()) {
                return;
            }
            C45776swv.KWHzl.KWHzl(this.AEQbTJ, false);
        }
    }

    public final void AEQbTJ(android.view.ViewGroup viewGroup) {
        viewGroup.removeAllViews();
    }

    public final android.app.Activity copydefault(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
