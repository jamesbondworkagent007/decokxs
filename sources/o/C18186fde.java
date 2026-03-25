package o;

import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingSpacerTileBinder$1;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fde, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18186fde extends AbstractC14584doH<DefiOnboardingTile.Activity, C16736epZ> {
    public C18186fde() {
        super(DefiOnboardingSpacerTileBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    public void OLrzqt(@NotNull C16736epZ c16736epZ, @NotNull DefiOnboardingTile.Activity activity) {
        Intrinsics.checkNotNullParameter(c16736epZ, "");
        Intrinsics.checkNotNullParameter(activity, "");
        c16736epZ.getRoot().getLayoutParams().height = C55298xhM.dp2px$default(activity.OLrzqt(), null, 1, null);
    }
}
