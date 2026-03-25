package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.premarket.PreMarketLandingFaq;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class kNX extends AbstractC59533zio<PreMarketLandingFaq, TaskDescription> {
    public final Function0<Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> OLrzqt() {
        return this.KWHzl;
    }

    public kNX(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.LinearLayout AEQbTJ;
        public final android.widget.ImageView AYXKKw;
        public final android.widget.LinearLayout AhwBna;
        public final android.widget.ImageView DbNXlk;
        public final android.widget.TextView EZpvd;
        public final android.widget.TextView KWHzl;
        public final android.widget.TextView OLrzqt;
        public final android.widget.TextView copydefault;
        public final C52794wYp djBIcL;
        public final android.widget.ImageView fetchVPNInfo;
        public final android.widget.LinearLayout gEmmrt;
        public final android.widget.LinearLayout valueOf;
        public final android.widget.ImageView values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView AkhnZx() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C52794wYp djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView fetchVPNInfo() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView isConnected() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.LinearLayout valueOf() {
            return this.gEmmrt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AYXKKw = (android.widget.ImageView) view.findViewById(qZH.StateListAnimator.DFbvW);
            this.values = (android.widget.ImageView) view.findViewById(qZH.StateListAnimator.DztXDE);
            this.DbNXlk = (android.widget.ImageView) view.findViewById(qZH.StateListAnimator.apAOXX);
            this.fetchVPNInfo = (android.widget.ImageView) view.findViewById(qZH.StateListAnimator.hfdhUn);
            this.AEQbTJ = (android.widget.LinearLayout) view.findViewById(qZH.StateListAnimator.OgHfcT);
            this.AhwBna = (android.widget.LinearLayout) view.findViewById(qZH.StateListAnimator.DQnQnb);
            this.valueOf = (android.widget.LinearLayout) view.findViewById(qZH.StateListAnimator.QiTXOm);
            this.gEmmrt = (android.widget.LinearLayout) view.findViewById(qZH.StateListAnimator.QnnRaN);
            this.KWHzl = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.dXhJGx);
            this.EZpvd = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.haRtnV);
            this.OLrzqt = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.zagaMW);
            this.copydefault = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.DtA);
            this.djBIcL = (C52794wYp) view.findViewById(qZH.StateListAnimator.DjwCMv);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.iRxXKY, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new TaskDescription(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final TaskDescription taskDescription, @NotNull PreMarketLandingFaq preMarketLandingFaq) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(preMarketLandingFaq, "");
        taskDescription.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.kNW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                kNX.copydefault(this.EZpvd, taskDescription, view);
            }
        });
        taskDescription.AYXKKw().setOnClickListener(new View.OnClickListener() { // from class: o.kOa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                kNX.AhwBna(this.KWHzl, taskDescription, view);
            }
        });
        taskDescription.AhwBna().setOnClickListener(new View.OnClickListener() { // from class: o.kOd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                kNX.AYXKKw(this.EZpvd, taskDescription, view);
            }
        });
        taskDescription.valueOf().setOnClickListener(new View.OnClickListener() { // from class: o.kOb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                kNX.valueOf(this.KWHzl, taskDescription, view);
            }
        });
        C52794wYp c52794wYpDjBIcL = taskDescription.djBIcL();
        c52794wYpDjBIcL.setOnClickListener(new Activity(c52794wYpDjBIcL, 1000L, this));
    }

    public static final void copydefault(kNX knx, TaskDescription taskDescription, android.view.View view) {
        android.widget.ImageView imageViewGEmmrt = taskDescription.gEmmrt();
        Intrinsics.checkNotNullExpressionValue(imageViewGEmmrt, "");
        android.widget.TextView textViewAEQbTJ = taskDescription.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(textViewAEQbTJ, "");
        knx.copydefault(imageViewGEmmrt, textViewAEQbTJ);
    }

    public static final void AhwBna(kNX knx, TaskDescription taskDescription, android.view.View view) {
        android.widget.ImageView imageViewFetchVPNInfo = taskDescription.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(imageViewFetchVPNInfo, "");
        android.widget.TextView textViewOLrzqt = taskDescription.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(textViewOLrzqt, "");
        knx.copydefault(imageViewFetchVPNInfo, textViewOLrzqt);
    }

    public static final void AYXKKw(kNX knx, TaskDescription taskDescription, android.view.View view) {
        android.widget.ImageView imageViewIsConnected = taskDescription.isConnected();
        Intrinsics.checkNotNullExpressionValue(imageViewIsConnected, "");
        android.widget.TextView textViewCopydefault = taskDescription.copydefault();
        Intrinsics.checkNotNullExpressionValue(textViewCopydefault, "");
        knx.copydefault(imageViewIsConnected, textViewCopydefault);
    }

    public static final void valueOf(kNX knx, TaskDescription taskDescription, android.view.View view) {
        android.widget.ImageView imageViewAkhnZx = taskDescription.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(imageViewAkhnZx, "");
        android.widget.TextView textViewEZpvd = taskDescription.EZpvd();
        Intrinsics.checkNotNullExpressionValue(textViewEZpvd, "");
        knx.copydefault(imageViewAkhnZx, textViewEZpvd);
    }

    public final void copydefault(android.view.View view, android.view.View view2) {
        view.setSelected(!view.isSelected());
        view2.setVisibility(view.isSelected() ? 0 : 8);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ kNX KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, kNX knx) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = knx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.OLrzqt().invoke();
            }
        }
    }
}
