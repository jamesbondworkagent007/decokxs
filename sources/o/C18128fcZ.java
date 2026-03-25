package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingDividerTileBinder$1;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fcZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18128fcZ extends AbstractC14584doH<DefiOnboardingTile.Application, C16731epU> {
    public C18128fcZ() {
        super(DefiOnboardingDividerTileBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16731epU c16731epU, @NotNull DefiOnboardingTile.Application application) {
        Intrinsics.checkNotNullParameter(c16731epU, "");
        Intrinsics.checkNotNullParameter(application, "");
        android.view.View root = c16731epU.getRoot();
        root.getLayoutParams().height = C55298xhM.dp2px$default(application.copydefault(), null, 1, null);
        root.setBackgroundColor(ContextCompat.getColor(root.getContext(), application.KWHzl()));
    }
}
