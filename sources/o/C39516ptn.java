package o;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ptn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39516ptn extends AbstractC59533zio<oLO, StateListAnimator> {
    public final android.content.Context EZpvd;
    public final Function1<oLO, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.oLO, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39516ptn(@NotNull android.content.Context context, @NotNull Function1<? super oLO, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = context;
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.OqFWZa, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull final oLO olo) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(olo, "");
        stateListAnimator.OLrzqt().setSelected(olo.AEQbTJ());
        if (Intrinsics.EZpvd((java.lang.Object) olo.copydefault(), (java.lang.Object) pDT.Companion.KWHzl().DbNXlk())) {
            stateListAnimator.AEQbTJ().setBackground(C33070mpX.KWHzl(C35964oKf.Activity.valueOf));
        } else {
            stateListAnimator.AEQbTJ().setBackground(C33070mpX.KWHzl(C35964oKf.Activity.AhwBna));
        }
        android.graphics.drawable.Drawable background = stateListAnimator.AEQbTJ().getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(Color.parseColor(Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_dark") ? olo.EZpvd() : olo.OLrzqt()));
        }
        stateListAnimator.OLrzqt().setOnClickListener(new View.OnClickListener() { // from class: o.ptr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39516ptn.AEQbTJ(this.AEQbTJ, olo, view);
            }
        });
    }

    public static final void AEQbTJ(C39516ptn c39516ptn, oLO olo, android.view.View view) {
        c39516ptn.copydefault.invoke(olo);
    }

    /* JADX INFO: renamed from: o.ptn$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public android.view.View AEQbTJ;
        public android.widget.ImageView KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = view;
            android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.UJEglR);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.KWHzl = (android.widget.ImageView) viewFindViewById;
        }
    }
}
