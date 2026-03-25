package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C30762lhK;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30762lhK extends AbstractC59533zio<C30765lhN, Activity> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final Function1<C30765lhN, Unit> AEQbTJ;
    public boolean EZpvd;
    public final Function1<C30765lhN, Unit> KWHzl;
    public final Function0<Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        this.EZpvd = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.lhN, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.lhN, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C30762lhK(@NotNull Function0<Unit> function0, @NotNull Function1<? super C30765lhN, Unit> function1, @NotNull Function1<? super C30765lhN, Unit> function12) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.OLrzqt = function0;
        this.AEQbTJ = function1;
        this.KWHzl = function12;
    }

    /* JADX INFO: renamed from: o.lhK$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lhK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCO hcoCopydefault = hCO.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hcoCopydefault, "");
        return new Activity(hcoCopydefault, this.AEQbTJ, this.KWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull C30765lhN c30765lhN) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c30765lhN, "");
        activity.AEQbTJ(c30765lhN);
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        activity.itemView.post(new java.lang.Runnable() { // from class: o.lhG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C30762lhK.OLrzqt(this.KWHzl);
            }
        });
    }

    public static final void OLrzqt(C30762lhK c30762lhK) {
        c30762lhK.OLrzqt.invoke();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull C30765lhN c30765lhN, @NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c30765lhN, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(activity, c30765lhN, list);
            return;
        }
        for (java.lang.Object obj : list) {
            if (Intrinsics.EZpvd(obj, (java.lang.Object) "payload_pnl")) {
                activity.copydefault(c30765lhN);
            } else if (Intrinsics.EZpvd(obj, (java.lang.Object) "payload_balance")) {
                activity.EZpvd(c30765lhN);
            }
        }
    }

    /* JADX INFO: renamed from: o.lhK$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final hCO EZpvd;
        public final Function1<C30765lhN, Unit> OLrzqt;
        public final Function1<C30765lhN, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.lhN, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.lhN, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull hCO hco, @NotNull Function1<? super C30765lhN, Unit> function1, @NotNull Function1<? super C30765lhN, Unit> function12) {
            super(hco.getRoot());
            Intrinsics.checkNotNullParameter(hco, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            this.EZpvd = hco;
            this.OLrzqt = function1;
            this.copydefault = function12;
        }

        public final void AEQbTJ(@NotNull final C30765lhN c30765lhN) {
            Intrinsics.checkNotNullParameter(c30765lhN, "");
            hCO hco = this.EZpvd;
            hco.AYXKKw.AEQbTJ(c30765lhN.valueOf(), c30765lhN.KWHzl());
            hco.EZpvd.setText(c30765lhN.AhwBna());
            hco.KWHzl.setText(C23271hvA.formatTokenCode$default(C23271hvA.copydefault, c30765lhN.copydefault(), false, null, false, null, null, 31, null));
            hco.gEmmrt.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c30765lhN.OLrzqt(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, 496, null));
            AEQbTJ(hco, c30765lhN, c30765lhN.values(), c30765lhN.AkhnZx());
            C25352ivB.setOnDoubleCheckClickListener$default(hco.AhwBna, 0L, new Function1() { // from class: o.lhJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C30762lhK.Activity.KWHzl(c30765lhN, this, (android.view.View) obj);
                }
            }, 1, null);
            android.view.View view = hco.copydefault;
            view.setOnClickListener(new StateListAnimator(view, 1000L, this, c30765lhN));
        }

        public static final Unit KWHzl(C30765lhN c30765lhN, Activity activity, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            if (c30765lhN.isConnected()) {
                activity.copydefault.invoke(c30765lhN);
            }
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(hCO hco, C30765lhN c30765lhN, java.lang.String str, java.lang.String str2) {
            boolean zIsConnected = c30765lhN.isConnected();
            OLrzqt(hco, zIsConnected);
            C55258xgZ c55258xgZ = hco.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
            c55258xgZ.setVisibility(zIsConnected ? 0 : 8);
            if (zIsConnected) {
                OLrzqt(hco, str, str2, c30765lhN.AkhnZx());
            }
        }

        public final void OLrzqt(hCO hco, boolean z) {
            ViewGroup.LayoutParams layoutParams = hco.gEmmrt.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToTop = 0;
            if (z) {
                layoutParams2.bottomToBottom = -1;
            } else {
                layoutParams2.bottomToBottom = 0;
            }
            hco.gEmmrt.setLayoutParams(layoutParams2);
        }

        public final void OLrzqt(hCO hco, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            int i;
            C55320xhi c55320xhiKWHzl;
            java.lang.String scientificCurrency$default = str != null ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, true, false, false, false, DisplaySign.EXCEPT_ZERO, false, false, 432, null) : null;
            java.lang.String percentWithSymbol$default = str2 != null ? C23311hvo.formatPercentWithSymbol$default(str2, true, 0, 0, null, null, 30, null) : null;
            hco.AhwBna.setTextValue(scientificCurrency$default + " (" + percentWithSymbol$default + ")");
            if (C23313hvq.OLrzqt(str3, 0)) {
                i = C52761wXj.ActionBar.sVXHln;
            } else {
                i = C23313hvq.KWHzl(str3, 0) ? C52761wXj.ActionBar.UscePu : C52761wXj.Activity.fdOvFl;
            }
            hco.AhwBna.setTextColor(C25382ivf.KWHzl(i));
            C55312xha c55312xhaValueOf = hco.AhwBna.valueOf();
            if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
                return;
            }
            c55320xhiKWHzl.setUnderlineColor(C25382ivf.KWHzl(i));
        }

        public final void copydefault(@NotNull C30765lhN c30765lhN) {
            Intrinsics.checkNotNullParameter(c30765lhN, "");
            AEQbTJ(this.EZpvd, c30765lhN, c30765lhN.values(), c30765lhN.AkhnZx());
            this.EZpvd.gEmmrt.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c30765lhN.OLrzqt(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, 496, null));
        }

        public final void EZpvd(@NotNull C30765lhN c30765lhN) {
            Intrinsics.checkNotNullParameter(c30765lhN, "");
            this.EZpvd.KWHzl.setText(C23271hvA.formatTokenCode$default(C23271hvA.copydefault, c30765lhN.copydefault(), false, null, false, null, null, 31, null));
            this.EZpvd.gEmmrt.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c30765lhN.OLrzqt(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, 496, null));
        }

        /* JADX INFO: renamed from: o.lhK$Activity$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ Activity AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ C30765lhN copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, Activity activity, C30765lhN c30765lhN) {
                this.OLrzqt = view;
                this.EZpvd = j;
                this.AEQbTJ = activity;
                this.copydefault = c30765lhN;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.AEQbTJ.OLrzqt.invoke(this.copydefault);
                }
            }
        }
    }
}
