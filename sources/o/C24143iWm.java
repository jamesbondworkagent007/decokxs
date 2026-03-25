package o;

import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.widget.ImageViewCompat;
import com.okinc.business.invest_biz.ui.page.order.details.viewbinder.InvestOrderDetailsPlusIconBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.iVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iWm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24143iWm extends AbstractC27119jpF<iVX.FragmentManager, iIT> {
    public static final C24143iWm EZpvd = new C24143iWm();

    private C24143iWm() {
        super(InvestOrderDetailsPlusIconBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    public void KWHzl(@NotNull iIT iit, @NotNull iVX.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(iit, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        ImageViewCompat.setImageTintList(iit.getRoot(), android.content.res.ColorStateList.valueOf(ColorUtils.setAlphaComponent(ContextCompat.getColor(iit.getRoot().getContext(), C52761wXj.Activity.gLWkOL), 102)));
    }
}
