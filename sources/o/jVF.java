package o;

import com.okinc.business.market.features.filter.ui.binder.NoFilterBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jVF extends AbstractC25436iwg<jVG, hDY> {
    public jVF() {
        super(NoFilterBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hDY> c25435iwf, @NotNull jVG jvg) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(jvg, "");
        ((hDY) c25435iwf.EZpvd()).copydefault.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.fmdvVn));
        ((hDY) c25435iwf.EZpvd()).copydefault.setEmptyTypeImage(6);
    }
}
