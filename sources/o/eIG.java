package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eIG extends AbstractC59533zio<C15496eKm, Activity> {
    public final Function1<java.util.Map<java.lang.String, java.lang.String>, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.String>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public eIG(@NotNull Function1<? super java.util.Map<java.lang.String, java.lang.String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55173xeu c55173xeu = new C55173xeu(context, null, 0, 6, null);
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.getOnBackPressedDispatcher));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.isThumbUp));
        c55173xeu.setEmptyTypeImage(6);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        c55173xeu.setGravity(17);
        android.content.Context context2 = c55173xeu.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) C55298xhM.AEQbTJ(100, context2);
        c55173xeu.setLayoutParams(layoutParams);
        return new Activity(this, c55173xeu);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull final C15496eKm c15496eKm) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c15496eKm, "");
        android.view.View view = activity.itemView;
        Intrinsics.copydefault(view, "");
        C55173xeu c55173xeu = (C55173xeu) view;
        if (c15496eKm.getFieldNames()) {
            strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKtviewModels1);
        } else {
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.ActivityViewModelLazyKtviewModels4, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "90")));
        }
        c55173xeu.setTitle(strCopydefault);
        c55173xeu.setSubTitle((java.lang.CharSequence) "");
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.eII
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                eIG.copydefault(this.AEQbTJ, c15496eKm, view2);
            }
        });
    }

    public static final void copydefault(eIG eig, C15496eKm c15496eKm, android.view.View view) {
        eig.KWHzl.invoke(c15496eKm.getNewProxyInstance());
    }

    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ eIG AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull eIG eig, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = eig;
        }
    }
}
