package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.BotNoticeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52483wNb extends AbstractC59533zio<BotNoticeData, Application> {
    public final Function0<Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> KWHzl() {
        return this.AEQbTJ;
    }

    public C52483wNb(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
    }

    /* JADX INFO: renamed from: o.wNb$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public android.widget.TextView AEQbTJ;
        public android.widget.ImageView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.generateConfigDelta_locale);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.getSmallIconId);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.OLrzqt = (android.widget.ImageView) viewFindViewById2;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.sElUiK, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Application(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull BotNoticeData botNoticeData) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(botNoticeData, "");
        android.view.View view = application.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        application.copydefault().setLineSpacing(20.0f, 1.0f);
        application.copydefault().setText(botNoticeData.getText());
        android.widget.ImageView imageViewKWHzl = application.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, application, this));
    }

    /* JADX INFO: renamed from: o.wNb$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Application KWHzl;
        public final /* synthetic */ C52483wNb OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Application application, C52483wNb c52483wNb) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = application;
            this.OLrzqt = c52483wNb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.view.View view2 = this.KWHzl.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                view2.setVisibility(8);
                this.OLrzqt.KWHzl().invoke();
            }
        }
    }
}
