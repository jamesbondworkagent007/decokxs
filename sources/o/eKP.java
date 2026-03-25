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
public final class eKP extends AbstractC59533zio<C15498eKo, Activity> {
    public final Function1<android.view.View, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull C15498eKo c15498eKo) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c15498eKo, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public eKP(@NotNull Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    public static final class Activity extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55173xeu c55173xeu = new C55173xeu(context, null, 0, 6, null);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendQueue));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.isEnabled));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk));
        c55173xeu.setEmptyTypeImage(8);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.eKQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eKP.OLrzqt(this.copydefault, view);
            }
        });
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C33052mpF.dp2px$default(96.0f, null, 1, null);
        c55173xeu.setLayoutParams(layoutParams);
        return new Activity(c55173xeu);
    }

    public static final void OLrzqt(eKP ekp, android.view.View view) {
        Function1<android.view.View, Unit> function1 = ekp.OLrzqt;
        Intrinsics.copydefault(view);
        function1.invoke(view);
    }
}
