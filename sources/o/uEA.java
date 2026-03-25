package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uEA extends RecyclerView.Adapter<StateListAnimator> {
    public final java.util.List<uCB> AEQbTJ;
    public int KWHzl;
    public final Function1<java.lang.Integer, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public uEA() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>):void (m)] (LINE:15) call: o.uEA.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ uEA(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public uEA(Function1<? super java.lang.Integer, Unit> function1) {
        this.copydefault = function1;
        this.AEQbTJ = new java.util.ArrayList();
        this.KWHzl = 1;
    }

    public final void EZpvd(@NotNull java.util.List<uCB> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.clear();
        this.AEQbTJ.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C48440uRm c48440uRmKWHzl = C48440uRm.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c48440uRmKWHzl, "");
        return new StateListAnimator(this, c48440uRmKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.KWHzl(this.AEQbTJ.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C48440uRm KWHzl;
        public final /* synthetic */ uEA copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull uEA uea, C48440uRm c48440uRm) {
            super(c48440uRm.getRoot());
            Intrinsics.checkNotNullParameter(c48440uRm, "");
            this.copydefault = uea;
            this.KWHzl = c48440uRm;
        }

        public final void KWHzl(@NotNull uCB ucb) {
            Intrinsics.checkNotNullParameter(ucb, "");
            C48440uRm c48440uRm = this.KWHzl;
            uEA uea = this.copydefault;
            LinearLayoutCompat root = c48440uRm.getRoot();
            root.setOnClickListener(new TaskDescription(root, 1000L, uea, this));
            Glide.AEQbTJ(this.itemView.getContext()).EZpvd(ucb.EZpvd()).EZpvd((android.widget.ImageView) c48440uRm.AEQbTJ);
            c48440uRm.EZpvd.setText(ucb.KWHzl());
            android.widget.ImageView imageView = c48440uRm.KWHzl;
            imageView.setImageTintList(android.content.res.ColorStateList.valueOf(uea.getItemCount() <= uea.OLrzqt() ? C33070mpX.copydefault(C52761wXj.Activity.UlJrfe) : C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
            Intrinsics.copydefault(imageView);
            imageView.setVisibility(uea.copydefault != null ? 0 : 8);
        }

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ StateListAnimator AEQbTJ;
            public final /* synthetic */ uEA EZpvd;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, uEA uea, StateListAnimator stateListAnimator) {
                this.copydefault = view;
                this.OLrzqt = j;
                this.EZpvd = uea;
                this.AEQbTJ = stateListAnimator;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    Function1 function1 = this.EZpvd.copydefault;
                    if (function1 != null) {
                        function1.invoke(java.lang.Integer.valueOf(this.AEQbTJ.getBindingAdapterPosition()));
                    }
                }
            }
        }
    }
}
