package o;

import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.OnlyHaveFireIconHeaderBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class iYV extends AbstractC27119jpF<iYS, C23794iJo> {
    public iYV() {
        super(OnlyHaveFireIconHeaderBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23794iJo c23794iJo, @NotNull iYS iys) {
        Intrinsics.checkNotNullParameter(c23794iJo, "");
        Intrinsics.checkNotNullParameter(iys, "");
        c23794iJo.AEQbTJ.setText(iys.AEQbTJ());
        android.widget.ImageView imageView = c23794iJo.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(iys.copydefault() ? 0 : 8);
    }
}
