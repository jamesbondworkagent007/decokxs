package o;

import com.okinc.business.defi.wallet.home.onboarding.ui.ItemBinder$1;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fcU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18123fcU extends AbstractC14584doH<DefiOnboardingTile.TokenGroupTile.TokenInfo, C16734epX> {
    public C18123fcU() {
        super(ItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16734epX c16734epX, @NotNull DefiOnboardingTile.TokenGroupTile.TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(c16734epX, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        android.widget.ImageView imageView = c16734epX.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C57659ymb.EZpvd(imageView, tokenInfo.getLogo(), C13754dXa.Activity.DTwDnp);
        c16734epX.EZpvd.setText(tokenInfo.getName());
    }
}
