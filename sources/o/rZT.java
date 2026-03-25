package o;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SystemNotificationExample;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rZT extends AbstractC42594rYq<SystemNotificationExample, rYH> {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.rZR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(rZT.AEQbTJ());
        }
    });

    public static final boolean AEQbTJ() {
        return C33492mxV.OLrzqt();
    }

    public final boolean EZpvd() {
        return ((java.lang.Boolean) this.KWHzl.getValue()).booleanValue();
    }

    public final void EZpvd(android.widget.ImageView imageView, SystemNotificationExample systemNotificationExample) {
        java.lang.String lightIconLink;
        C42592rYo c42592rYo = C42592rYo.KWHzl;
        if (!EZpvd() ? (lightIconLink = systemNotificationExample.getLightIconLink()) == null : (lightIconLink = systemNotificationExample.getDarkIconLink()) == null) {
            lightIconLink = "";
        }
        c42592rYo.copydefault(imageView, lightIconLink);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC42594rYq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public rYH KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        rYH ryhKWHzl = rYH.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ryhKWHzl, "");
        return ryhKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC42594rYq<SystemNotificationExample, rYH>.StateListAnimator<rYH> stateListAnimator, @NotNull SystemNotificationExample systemNotificationExample) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(systemNotificationExample, "");
        rYH ryh = (rYH) stateListAnimator.AEQbTJ();
        android.widget.ImageView imageView = ryh.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        EZpvd(imageView, systemNotificationExample);
        ryh.EZpvd.setText(systemNotificationExample.getTitle());
        ryh.copydefault.setText(systemNotificationExample.getContent());
    }
}
