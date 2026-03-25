package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wOG extends AbstractC59533zio<wOI, Activity> {
    public final Function0<Unit> KWHzl;

    public wOG(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ wOG KWHzl;
        public final C52794wYp OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C52794wYp KWHzl() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull wOG wog, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl = wog;
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.addTransition);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (C52794wYp) viewFindViewById;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.gtdfxv, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new Activity(this, viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull wOI woi) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(woi, "");
        activity.KWHzl().setText(woi.OLrzqt());
        activity.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.wOF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                wOG.KWHzl(this.copydefault, view);
            }
        });
    }

    public static final void KWHzl(wOG wog, android.view.View view) {
        wog.KWHzl.invoke();
    }
}
