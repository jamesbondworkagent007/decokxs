package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okex.lite.navigation.impl.LiteNavigationServiceImpl$1;
import com.okinc.okex.lite.ukbanner.UKBannerType;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.swf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45760swf extends AbstractC43215rlA implements InterfaceC45752swP {
    public volatile int EZpvd;
    public final OKComplianceRestrictionService OLrzqt = (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);

    public C45760swf() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new LiteNavigationServiceImpl$1(this, null), 3, null);
    }

    public final void KWHzl() {
        boolean z = this.OLrzqt.fIwbmz().size() > 1;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            InterfaceC33171mrS.Activity.autoSwitchMode$default((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class), activityAEQbTJ, z, false, null, null, 28, null);
        }
    }

    @Override // o.InterfaceC45752swP
    public OKAlertBanner copydefault(@NotNull android.content.Context context, @NotNull UKBannerType uKBannerType) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uKBannerType, "");
        return C45776swv.KWHzl.KWHzl(context, uKBannerType);
    }

    @Override // o.InterfaceC45752swP
    public void AEQbTJ(@NotNull android.app.Activity activity, @NotNull UKBannerType uKBannerType) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(uKBannerType, "");
        if (activity instanceof AbstractActivityC33041mov) {
            C45776swv.KWHzl.KWHzl((AbstractActivityC33041mov) activity, uKBannerType);
        }
    }

    @Override // o.InterfaceC45752swP
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull android.view.ViewGroup viewGroup, @NotNull UKBannerType uKBannerType) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(uKBannerType, "");
        C45768swn.OLrzqt.AEQbTJ(fragmentManager, viewGroup, uKBannerType);
    }
}
