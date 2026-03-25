package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.ui.IntroductionDataFrom;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pbr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38568pbr extends AbstractC59533zio<IntroductionDataFrom, Activity> {
    public Function0<Unit> OLrzqt;

    public C38568pbr(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
    }

    /* JADX INFO: renamed from: o.pbr$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public android.widget.TextView EZpvd;
        public android.widget.TextView KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.MediaControllerCompatCallbackMessageHandler);
            this.KWHzl = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.onPlaybackStateChanged);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.AxsJAYsNCnLh, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Activity(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull IntroductionDataFrom introductionDataFrom) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(introductionDataFrom, "");
        android.widget.TextView textViewKWHzl = activity.KWHzl();
        if (textViewKWHzl != null) {
            textViewKWHzl.setText(introductionDataFrom.getText());
        }
        android.widget.TextView textViewCopydefault = activity.copydefault();
        if (textViewCopydefault != null) {
            textViewCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.pby
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C38568pbr.EZpvd(this.KWHzl, view);
                }
            });
        }
    }

    public static final void EZpvd(C38568pbr c38568pbr, android.view.View view) {
        c38568pbr.OLrzqt.invoke();
    }
}
