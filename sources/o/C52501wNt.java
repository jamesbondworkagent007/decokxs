package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.ProDetailData;
import com.okinc.web.WebActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52501wNt extends AbstractC59533zio<ProDetailData, Activity> {

    /* JADX INFO: renamed from: o.wNt$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final android.widget.TextView KWHzl;
        public final android.widget.TextView OLrzqt;
        public final C55258xgZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55258xgZ AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault = (C55258xgZ) view.findViewById(C48033uCm.Application.onNothingSelected);
            this.OLrzqt = (android.widget.TextView) view.findViewById(C48033uCm.Application.onItemSelected);
            this.KWHzl = (android.widget.TextView) view.findViewById(C48033uCm.Application.cleanupAutoManagers);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.gwwfep, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Activity(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull ProDetailData proDetailData) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(proDetailData, "");
        boolean z = !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) proDetailData.getDoubtMsg());
        C55258xgZ c55258xgZAEQbTJ = activity.AEQbTJ();
        c55258xgZAEQbTJ.setTextValue(proDetailData.getTitle());
        c55258xgZAEQbTJ.setHelperLabelType(z ? 1 : 2);
        c55258xgZAEQbTJ.setOnClickListener(new Application(c55258xgZAEQbTJ, 1000L, z, activity, proDetailData));
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) proDetailData.getFirstContent())) {
            activity.EZpvd().setText(proDetailData.getFirstContent());
            activity.EZpvd().setVisibility(0);
        } else {
            activity.EZpvd().setVisibility(8);
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) proDetailData.getSecondContent())) {
            activity.copydefault().setText(proDetailData.getSecondContent());
            activity.copydefault().setVisibility(0);
        } else {
            activity.copydefault().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o.wNt$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ProDetailData AEQbTJ;
        public final /* synthetic */ C55390xiz EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(ProDetailData proDetailData, C55390xiz c55390xiz) {
            this.AEQbTJ = proDetailData;
            this.EZpvd = c55390xiz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", this.AEQbTJ.getHyperLink()));
            C55390xiz c55390xiz = this.EZpvd;
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            Intrinsics.copydefault(c55390xiz);
            WebActivity.TaskDescription.openPage$default(taskDescription, C35334ntP.KWHzl(c55390xiz), bundleBundleOf, null, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.wNt$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.wNt$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ ProDetailData OLrzqt;
        public final /* synthetic */ Activity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, boolean z, Activity activity, ProDetailData proDetailData) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = z;
            this.copydefault = activity;
            this.OLrzqt = proDetailData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.KWHzl) {
                    android.view.View viewInflate = android.view.LayoutInflater.from(this.copydefault.itemView.getContext()).inflate(C48033uCm.Activity.djSkpj, (android.view.ViewGroup) null, false);
                    C55390xiz c55390xiz = (C55390xiz) viewInflate.findViewById(C48033uCm.Application.onAudioInfoChanged);
                    c55390xiz.setOnClickListener(new StateListAnimator(this.OLrzqt, c55390xiz));
                    android.content.Context context = this.copydefault.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    Intrinsics.copydefault(viewInflate);
                    viewOnClickListenerC54939xaY.EZpvd(viewInflate);
                    viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.trackPipAnimationHintView), (View.OnClickListener) new ActionBar(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }
}
