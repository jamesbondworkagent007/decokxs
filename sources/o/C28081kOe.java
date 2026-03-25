package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.premarket.PreMarketLandingIntroduce;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kOe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C28081kOe extends AbstractC59533zio<PreMarketLandingIntroduce, StateListAnimator> {
    public final Function0<Unit> KWHzl;
    public final Function0<Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.KWHzl;
    }

    public C28081kOe(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.KWHzl = function0;
        this.OLrzqt = function02;
    }

    /* JADX INFO: renamed from: o.kOe$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C52794wYp AEQbTJ;
        public final C52794wYp KWHzl;
        public final android.widget.ImageView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C52794wYp OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C52794wYp copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl = (C52794wYp) view.findViewById(qZH.StateListAnimator.unregisterCallbackMessenger);
            this.AEQbTJ = (C52794wYp) view.findViewById(qZH.StateListAnimator.reset);
            this.OLrzqt = (android.widget.ImageView) view.findViewById(qZH.StateListAnimator.GiPPlLgiPPlL);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.fvQaOB, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull PreMarketLandingIntroduce preMarketLandingIntroduce) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(preMarketLandingIntroduce, "");
        C52794wYp c52794wYpOLrzqt = stateListAnimator.OLrzqt();
        c52794wYpOLrzqt.setOnClickListener(new Application(c52794wYpOLrzqt, 1000L, this));
        C52794wYp c52794wYpCopydefault = stateListAnimator.copydefault();
        c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        if (C33492mxV.OLrzqt()) {
            android.widget.ImageView imageViewAEQbTJ = stateListAnimator.AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(imageViewAEQbTJ, "");
            C33054mpH.AEQbTJ(imageViewAEQbTJ, C27992kKx.copydefault.EZpvd("img_premarket_landing_header_dark.webp"));
        } else {
            android.widget.ImageView imageViewAEQbTJ2 = stateListAnimator.AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(imageViewAEQbTJ2, "");
            C33054mpH.AEQbTJ(imageViewAEQbTJ2, C27992kKx.copydefault.EZpvd("img_premarket_landing_header.webp"));
        }
    }

    /* JADX INFO: renamed from: o.kOe$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C28081kOe KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C28081kOe c28081kOe) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c28081kOe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.KWHzl().invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.kOe$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C28081kOe copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C28081kOe c28081kOe) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c28081kOe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.copydefault().invoke();
            }
        }
    }
}
