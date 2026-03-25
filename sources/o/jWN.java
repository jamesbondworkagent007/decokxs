package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jWN extends androidx.recyclerview.widget.ListAdapter<HoldingAsset, Activity> {
    public final boolean AEQbTJ;
    public Function2<? super java.lang.Integer, ? super HoldingAsset, Unit> EZpvd;
    public final int KWHzl;
    public final boolean OLrzqt;
    public final int copydefault;
    public Function2<? super java.lang.Integer, ? super HoldingAsset, Unit> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function2<? super java.lang.Integer, ? super HoldingAsset, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.gEmmrt = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function2<? super java.lang.Integer, ? super HoldingAsset, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = function2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (r2v0 int)
  (r3v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(boolean, int, int, boolean):void (m)] (LINE:22) call: o.jWN.<init>(boolean, int, int, boolean):void type: THIS */
    public /* synthetic */ jWN(boolean z, int i, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, i, i2, (i3 & 8) != 0 ? true : z2);
    }

    public jWN(boolean z, int i, int i2, boolean z2) {
        super(new TaskDescription());
        this.OLrzqt = z;
        this.copydefault = i;
        this.KWHzl = i2;
        this.AEQbTJ = z2;
    }

    public static final class ActionBar {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
        }
    }

    public static /* synthetic */ void updateColorByCached$default(jWN jwn, android.widget.TextView textView, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        jwn.AEQbTJ(textView, str, z);
    }

    public final void AEQbTJ(android.widget.TextView textView, java.lang.String str, boolean z) {
        int iKWHzl;
        java.lang.Float fFIwbmz;
        float fFloatValue = (str == null || (fFIwbmz = C59443zhD.fIwbmz(str)) == null) ? 0.0f : fFIwbmz.floatValue();
        if (fFloatValue > 0.0f) {
            iKWHzl = this.copydefault;
        } else if (fFloatValue < 0.0f) {
            iKWHzl = this.KWHzl;
        } else {
            iKWHzl = (z && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "")) ? C25382ivf.KWHzl(C52761wXj.Activity.cBPFI) : C25382ivf.KWHzl(C52761wXj.Activity.zblBkD);
        }
        textView.setTextColor(iKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (this.OLrzqt) {
            C21520hCk c21520hCkAEQbTJ = C21520hCk.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c21520hCkAEQbTJ, "");
            return new Application(this, c21520hCkAEQbTJ);
        }
        C21517hCh c21517hChAEQbTJ = C21517hCh.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21517hChAEQbTJ, "");
        return new StateListAnimator(this, c21517hChAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        HoldingAsset item = getItem(i);
        Intrinsics.copydefault(item);
        activity.KWHzl(item, i);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            HoldingAsset item = getItem(i);
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd(it.next(), ActionBar.EZpvd)) {
                    Intrinsics.copydefault(item);
                    activity.copydefault(item);
                }
            }
            return;
        }
        super.onBindViewHolder(activity, i, list);
    }

    public static final class TaskDescription extends DiffUtil.ItemCallback<HoldingAsset> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull HoldingAsset holdingAsset, @NotNull HoldingAsset holdingAsset2) {
            Intrinsics.checkNotNullParameter(holdingAsset, "");
            Intrinsics.checkNotNullParameter(holdingAsset2, "");
            return Intrinsics.EZpvd((java.lang.Object) holdingAsset.fetchVPNInfo(), (java.lang.Object) holdingAsset2.fetchVPNInfo());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull HoldingAsset holdingAsset, @NotNull HoldingAsset holdingAsset2) {
            Intrinsics.checkNotNullParameter(holdingAsset, "");
            Intrinsics.checkNotNullParameter(holdingAsset2, "");
            return Intrinsics.EZpvd(holdingAsset, holdingAsset2);
        }

        /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public java.lang.Object getChangePayload(@NotNull HoldingAsset holdingAsset, @NotNull HoldingAsset holdingAsset2) {
            Intrinsics.checkNotNullParameter(holdingAsset, "");
            Intrinsics.checkNotNullParameter(holdingAsset2, "");
            if (Intrinsics.EZpvd((java.lang.Object) holdingAsset.KWHzl(), (java.lang.Object) holdingAsset2.KWHzl()) && Intrinsics.EZpvd((java.lang.Object) holdingAsset.fARcdN(), (java.lang.Object) holdingAsset2.fARcdN())) {
                return null;
            }
            return ActionBar.EZpvd;
        }
    }

    public abstract class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ jWN EZpvd;

        public abstract void KWHzl(@NotNull HoldingAsset holdingAsset, int i);

        public abstract void copydefault(@NotNull HoldingAsset holdingAsset);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull jWN jwn, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = jwn;
        }
    }

    public final class StateListAnimator extends Activity {
        public final /* synthetic */ jWN AEQbTJ;
        public final C21517hCh copydefault;

        /* JADX WARN: Illegal instructions before constructor call */
        public StateListAnimator(@NotNull jWN jwn, C21517hCh c21517hCh) {
            Intrinsics.checkNotNullParameter(c21517hCh, "");
            this.AEQbTJ = jwn;
            android.widget.LinearLayout root = c21517hCh.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(jwn, root);
            this.copydefault = c21517hCh;
        }

        @Override // o.jWN.Activity
        public void KWHzl(@NotNull HoldingAsset holdingAsset, int i) {
            Intrinsics.checkNotNullParameter(holdingAsset, "");
            this.copydefault.KWHzl.setText(holdingAsset.AkhnZx());
            copydefault(holdingAsset);
        }

        @Override // o.jWN.Activity
        public void copydefault(@NotNull HoldingAsset holdingAsset) {
            Intrinsics.checkNotNullParameter(holdingAsset, "");
            android.widget.TextView textView = this.copydefault.copydefault;
            jWN jwn = this.AEQbTJ;
            textView.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, holdingAsset.KWHzl(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null));
            Intrinsics.copydefault(textView);
            jWN.updateColorByCached$default(jwn, textView, holdingAsset.fARcdN(), false, 2, null);
            android.widget.TextView textView2 = this.copydefault.AEQbTJ;
            jWN jwn2 = this.AEQbTJ;
            Intrinsics.copydefault(textView2);
            kLY.formatPercentage$default(textView2, holdingAsset.AuCTel(), DisplaySign.EXCEPT_ZERO, null, null, null, 28, null);
            jwn2.AEQbTJ(textView2, holdingAsset.fARcdN(), true);
        }
    }

    public final class Application extends Activity {
        public final /* synthetic */ jWN AEQbTJ;
        public final C21520hCk KWHzl;

        /* JADX WARN: Illegal instructions before constructor call */
        public Application(@NotNull jWN jwn, C21520hCk c21520hCk) {
            Intrinsics.checkNotNullParameter(c21520hCk, "");
            this.AEQbTJ = jwn;
            android.widget.LinearLayout root = c21520hCk.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(jwn, root);
            this.KWHzl = c21520hCk;
        }

        @Override // o.jWN.Activity
        public void KWHzl(@NotNull HoldingAsset holdingAsset, int i) {
            Intrinsics.checkNotNullParameter(holdingAsset, "");
            C21520hCk c21520hCk = this.KWHzl;
            jWN jwn = this.AEQbTJ;
            c21520hCk.AhwBna.setText(holdingAsset.AkhnZx());
            C25386ivj.loadCircleImage$default(c21520hCk.OLrzqt.OLrzqt(), holdingAsset.isConnected(), false, 2, null);
            C21983hTo.loadSmallImage$default(c21520hCk.OLrzqt, holdingAsset.AEQbTJ(), null, 2, null);
            copydefault(holdingAsset);
            android.widget.LinearLayout root = c21520hCk.getRoot();
            root.setOnClickListener(new Activity(root, 1000L, jwn, i, holdingAsset));
            android.widget.ImageView imageView = c21520hCk.copydefault;
            imageView.setEnabled(jwn.AEQbTJ);
            if (jwn.AEQbTJ) {
                imageView.setImageTintList(C25382ivf.copydefault(C23274hvD.StateListAnimator.valueOf));
                imageView.setBackgroundTintList(C25382ivf.copydefault(C23274hvD.StateListAnimator.KWHzl));
                imageView.setOnClickListener(new ViewOnClickListenerC0861Application(imageView, 1000L, jwn, i, holdingAsset));
            } else {
                imageView.setImageTintList(C25382ivf.copydefault(C23274hvD.StateListAnimator.gEmmrt));
                imageView.setBackgroundTintList(C25382ivf.copydefault(C23274hvD.StateListAnimator.OLrzqt));
                imageView.setOnClickListener(new StateListAnimator(imageView, 1000L));
            }
        }

        @Override // o.jWN.Activity
        public void copydefault(@NotNull HoldingAsset holdingAsset) {
            Intrinsics.checkNotNullParameter(holdingAsset, "");
            android.widget.TextView textView = this.KWHzl.AEQbTJ;
            jWN jwn = this.AEQbTJ;
            textView.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, holdingAsset.KWHzl(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null));
            Intrinsics.copydefault(textView);
            jWN.updateColorByCached$default(jwn, textView, holdingAsset.fARcdN(), false, 2, null);
            android.widget.TextView textView2 = this.KWHzl.EZpvd;
            jWN jwn2 = this.AEQbTJ;
            Intrinsics.copydefault(textView2);
            kLY.formatPercentage$default(textView2, holdingAsset.AuCTel(), DisplaySign.EXCEPT_ZERO, null, null, null, 28, null);
            jwn2.AEQbTJ(textView2, holdingAsset.fARcdN(), true);
        }

        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ jWN AEQbTJ;
            public final /* synthetic */ int EZpvd;
            public final /* synthetic */ HoldingAsset KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, jWN jwn, int i, HoldingAsset holdingAsset) {
                this.copydefault = view;
                this.OLrzqt = j;
                this.AEQbTJ = jwn;
                this.EZpvd = i;
                this.KWHzl = holdingAsset;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    Function2 function2 = this.AEQbTJ.EZpvd;
                    if (function2 != null) {
                        function2.invoke(java.lang.Integer.valueOf(this.EZpvd), this.KWHzl);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.jWN$Application$Application, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0861Application implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ HoldingAsset KWHzl;
            public final /* synthetic */ int OLrzqt;
            public final /* synthetic */ jWN copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0861Application(android.view.View view, long j, jWN jwn, int i, HoldingAsset holdingAsset) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.copydefault = jwn;
                this.OLrzqt = i;
                this.KWHzl = holdingAsset;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    Function2 function2 = this.copydefault.gEmmrt;
                    if (function2 != null) {
                        function2.invoke(java.lang.Integer.valueOf(this.OLrzqt), this.KWHzl);
                    }
                }
            }
        }

        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j) {
                this.KWHzl = view;
                this.AEQbTJ = j;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                }
            }
        }
    }
}
