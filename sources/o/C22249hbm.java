package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hbm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22249hbm extends AbstractC59533zio<C20050gZa, Activity> {
    public static final Application Companion = new Application(null);
    public final Function1<C20050gZa, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.gZa, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C22249hbm(@NotNull Function1<? super C20050gZa, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX INFO: renamed from: o.hbm$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hbm.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21534hCy c21534hCyOLrzqt = C21534hCy.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21534hCyOLrzqt, "");
        return new Activity(c21534hCyOLrzqt, this.EZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull C20050gZa c20050gZa) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c20050gZa, "");
        activity.KWHzl(c20050gZa);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull C20050gZa c20050gZa, @NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c20050gZa, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(activity, c20050gZa, list);
            return;
        }
        for (java.lang.Object obj : list) {
            if (Intrinsics.EZpvd(obj, (java.lang.Object) "payload_pnl")) {
                activity.EZpvd(c20050gZa);
            } else if (Intrinsics.EZpvd(obj, (java.lang.Object) "payload_balance")) {
                activity.copydefault(c20050gZa);
            }
        }
    }

    /* JADX INFO: renamed from: o.hbm$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final C21534hCy AEQbTJ;
        public final Function1<C20050gZa, Unit> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.gZa, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull C21534hCy c21534hCy, @NotNull Function1<? super C20050gZa, Unit> function1) {
            super(c21534hCy.getRoot());
            Intrinsics.checkNotNullParameter(c21534hCy, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = c21534hCy;
            this.OLrzqt = function1;
        }

        public final void KWHzl(@NotNull C20050gZa c20050gZa) {
            Intrinsics.checkNotNullParameter(c20050gZa, "");
            C21534hCy c21534hCy = this.AEQbTJ;
            c21534hCy.djBIcL.AEQbTJ(c20050gZa.copydefault().getTokenLogoUrl(), c20050gZa.copydefault().getChainLogoUrl());
            c21534hCy.EZpvd.setText(c20050gZa.copydefault().getTokenSymbol());
            c21534hCy.KWHzl.setText(C23271hvA.formatTokenCode$default(C23271hvA.copydefault, c20050gZa.OLrzqt(), false, null, false, null, null, 31, null));
            c21534hCy.AhwBna.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c20050gZa.KWHzl(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, 496, null));
            OLrzqt(c21534hCy, c20050gZa, c20050gZa.djBIcL(), c20050gZa.gEmmrt());
            ConstraintLayout root = c21534hCy.getRoot();
            root.setOnClickListener(new TaskDescription(root, 1000L, this, c20050gZa));
        }

        public final void OLrzqt(C21534hCy c21534hCy, C20050gZa c20050gZa, java.lang.String str, java.lang.String str2) {
            boolean zValueOf = c20050gZa.valueOf();
            AEQbTJ(c21534hCy, zValueOf);
            C55258xgZ c55258xgZ = c21534hCy.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
            c55258xgZ.setVisibility(zValueOf ? 0 : 8);
            if (zValueOf) {
                copydefault(c21534hCy, str, str2, c20050gZa.gEmmrt());
            }
        }

        public final void AEQbTJ(C21534hCy c21534hCy, boolean z) {
            ViewGroup.LayoutParams layoutParams = c21534hCy.AhwBna.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToTop = 0;
            if (z) {
                layoutParams2.bottomToBottom = -1;
            } else {
                layoutParams2.bottomToBottom = 0;
            }
            c21534hCy.AhwBna.setLayoutParams(layoutParams2);
        }

        public final void copydefault(C21534hCy c21534hCy, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            int i;
            C55320xhi c55320xhiKWHzl;
            java.lang.String scientificCurrency$default = str != null ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, true, false, false, false, DisplaySign.EXCEPT_ZERO, false, false, 432, null) : null;
            java.lang.String percentWithSymbol$default = str2 != null ? C23311hvo.formatPercentWithSymbol$default(str2, true, 0, 0, null, null, 30, null) : null;
            c21534hCy.AEQbTJ.setTextValue(scientificCurrency$default + " (" + percentWithSymbol$default + ")");
            if (C23313hvq.OLrzqt(str3, 0)) {
                i = C52761wXj.ActionBar.sVXHln;
            } else {
                i = C23313hvq.KWHzl(str3, 0) ? C52761wXj.ActionBar.UscePu : C52761wXj.Activity.fdOvFl;
            }
            c21534hCy.AEQbTJ.setTextColor(C25382ivf.KWHzl(i));
            C55312xha c55312xhaValueOf = c21534hCy.AEQbTJ.valueOf();
            if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
                return;
            }
            c55320xhiKWHzl.setUnderlineColor(C25382ivf.KWHzl(i));
        }

        public final void EZpvd(@NotNull C20050gZa c20050gZa) {
            Intrinsics.checkNotNullParameter(c20050gZa, "");
            OLrzqt(this.AEQbTJ, c20050gZa, c20050gZa.djBIcL(), c20050gZa.gEmmrt());
            this.AEQbTJ.AhwBna.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c20050gZa.KWHzl(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, 496, null));
        }

        public final void copydefault(@NotNull C20050gZa c20050gZa) {
            Intrinsics.checkNotNullParameter(c20050gZa, "");
            this.AEQbTJ.KWHzl.setText(C23271hvA.formatTokenCode$default(C23271hvA.copydefault, c20050gZa.OLrzqt(), false, null, false, null, null, 31, null));
            this.AEQbTJ.AhwBna.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c20050gZa.KWHzl(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, 496, null));
        }

        /* JADX INFO: renamed from: o.hbm$Activity$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C20050gZa EZpvd;
            public final /* synthetic */ Activity OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, Activity activity, C20050gZa c20050gZa) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.OLrzqt = activity;
                this.EZpvd = c20050gZa;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.OLrzqt.OLrzqt.invoke(this.EZpvd);
                }
            }
        }
    }
}
