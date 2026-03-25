package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.order.strategy.data.SpotDcaConfirmMoreData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wNG extends AbstractC59533zio<SpotDcaConfirmMoreData, Application> {
    public final Function0<Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.KWHzl;
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ wNG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, wNG wng) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = wng;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.EZpvd().invoke();
            }
        }
    }

    public wNG(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    public static final class Application extends RecyclerView.ViewHolder {
        public AppCompatImageView KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppCompatImageView AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.hDKMBd);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.KWHzl = (AppCompatImageView) viewFindViewById;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.AxsJAY, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Application(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull SpotDcaConfirmMoreData spotDcaConfirmMoreData) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(spotDcaConfirmMoreData, "");
        android.view.View view = application.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        application.AEQbTJ().setImageResource(Intrinsics.EZpvd((java.lang.Object) spotDcaConfirmMoreData.KWHzl(), (java.lang.Object) "more") ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG);
        android.view.View view2 = application.itemView;
        view2.setOnClickListener(new StateListAnimator(view2, 1000L, this));
    }
}
