package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ptw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39525ptw extends AbstractC59533zio<oLN, Activity> {
    public final android.content.Context AEQbTJ;
    public final Function1<oLN, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.oLN, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39525ptw(@NotNull android.content.Context context, @NotNull Function1<? super oLN, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = context;
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.getPostValueLengthLimit, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new Activity(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull final oLN oln) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(oln, "");
        activity.copydefault().setSelected(oln.copydefault());
        activity.AEQbTJ().setText(oln.EZpvd() + "px");
        int iEZpvd = oln.EZpvd();
        if (iEZpvd == 1) {
            activity.OLrzqt().setImageResource(C35964oKf.Activity.dNCPSb);
        } else if (iEZpvd == 2) {
            activity.OLrzqt().setImageResource(C35964oKf.Activity.RcXXUw);
        } else if (iEZpvd == 3) {
            activity.OLrzqt().setImageResource(C35964oKf.Activity.fFgQHt);
        } else if (iEZpvd == 4) {
            activity.OLrzqt().setImageResource(C35964oKf.Activity.dvKsVJ);
        }
        activity.copydefault().setOnClickListener(new View.OnClickListener() { // from class: o.ptt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39525ptw.copydefault(this.EZpvd, oln, view);
            }
        });
    }

    public static final void copydefault(C39525ptw c39525ptw, oLN oln, android.view.View view) {
        c39525ptw.copydefault.invoke(oln);
    }

    /* JADX INFO: renamed from: o.ptw$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public android.widget.TextView AEQbTJ;
        public android.widget.ImageView OLrzqt;
        public android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault = view;
            android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.UJEglR);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (android.widget.ImageView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C35964oKf.StateListAnimator.fromMediaItem);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById2;
        }
    }
}
