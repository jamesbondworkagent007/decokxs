package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hWf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C22055hWf extends AbstractC59533zio<C22026hVd, Activity> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21477hAv c21477hAvAEQbTJ = C21477hAv.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21477hAvAEQbTJ, "");
        return new Activity(c21477hAvAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull C22026hVd c22026hVd) {
        java.lang.String toSwapMevInfo;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c22026hVd, "");
        if (!Intrinsics.EZpvd((java.lang.Object) c22026hVd.KWHzl().getSwapTradeType(), (java.lang.Object) "3") || Intrinsics.EZpvd((java.lang.Object) c22026hVd.KWHzl().getStatus(), (java.lang.Object) "1")) {
            java.lang.String fromSwapMevInfo = c22026hVd.KWHzl().getFromSwapMevInfo();
            if (fromSwapMevInfo != null && fromSwapMevInfo.length() > 0 && (toSwapMevInfo = c22026hVd.KWHzl().getToSwapMevInfo()) != null && toSwapMevInfo.length() > 0) {
                AEQbTJ(activity, c22026hVd, false);
                copydefault(activity, c22026hVd);
                return;
            }
            java.lang.String fromSwapMevInfo2 = c22026hVd.KWHzl().getFromSwapMevInfo();
            if (fromSwapMevInfo2 != null && fromSwapMevInfo2.length() > 0) {
                AEQbTJ(activity, c22026hVd, false);
                activity.KWHzl().gEmmrt.setVisibility(8);
                return;
            }
            java.lang.String toSwapMevInfo2 = c22026hVd.KWHzl().getToSwapMevInfo();
            if (toSwapMevInfo2 != null && toSwapMevInfo2.length() > 0) {
                copydefault(activity, c22026hVd);
                activity.KWHzl().copydefault.setVisibility(8);
                return;
            } else if (c22026hVd.KWHzl().getMevInfo().length() > 0) {
                AEQbTJ(activity, c22026hVd, true);
                activity.KWHzl().gEmmrt.setVisibility(8);
                return;
            } else {
                KWHzl(activity);
                return;
            }
        }
        KWHzl(activity);
    }

    public final void copydefault(Activity activity, C22026hVd c22026hVd) {
        activity.KWHzl().gEmmrt.setVisibility(0);
        android.widget.ImageView imageView = activity.KWHzl().KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        android.widget.ImageView imageView2 = activity.KWHzl().KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C25386ivj.loadImageWithBorder$default(imageView2, c22026hVd.KWHzl().getToChainLogoUrl(), null, 2, null);
        android.widget.TextView textView = activity.KWHzl().AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        activity.KWHzl().AhwBna.setText(c22026hVd.KWHzl().getToSwapMevInfo());
    }

    public final void AEQbTJ(Activity activity, C22026hVd c22026hVd, boolean z) {
        activity.KWHzl().copydefault.setVisibility(0);
        android.widget.ImageView imageView = activity.KWHzl().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        android.widget.ImageView imageView2 = activity.KWHzl().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C25386ivj.loadImageWithBorder$default(imageView2, c22026hVd.KWHzl().getFromChainLogoUrl(), null, 2, null);
        OrderDetailBean orderDetailBeanKWHzl = c22026hVd.KWHzl();
        java.lang.String mevInfo = z ? orderDetailBeanKWHzl.getMevInfo() : orderDetailBeanKWHzl.getFromSwapMevInfo();
        android.widget.TextView textView = activity.KWHzl().EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        activity.KWHzl().EZpvd.setText(mevInfo);
    }

    public final void KWHzl(Activity activity) {
        activity.KWHzl().AEQbTJ.setVisibility(8);
        activity.KWHzl().gEmmrt.setVisibility(8);
        LinearLayoutCompat linearLayoutCompat = activity.KWHzl().copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(0);
        android.widget.TextView textView = activity.KWHzl().EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        activity.KWHzl().EZpvd.setText("--");
    }

    /* JADX INFO: renamed from: o.hWf$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final C21477hAv AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21477hAv KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C21477hAv c21477hAv) {
            super(c21477hAv.getRoot());
            Intrinsics.checkNotNullParameter(c21477hAv, "");
            this.AEQbTJ = c21477hAv;
        }
    }
}
