package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.SuggestedActionBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sif, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45060sif extends RecyclerView.Adapter<StateListAnimator> {
    public java.util.List<SuggestedActionBean> AEQbTJ;
    public Activity copydefault;

    /* JADX INFO: renamed from: o.sif$Activity */
    public interface Activity {
        void EZpvd(SelfServiceToolBean selfServiceToolBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C45060sif() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.copydefault = activity;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.okex.center.bean.SuggestedActionBean>):void (m)] (LINE:14) call: o.sif.<init>(java.util.List):void type: THIS */
    public /* synthetic */ C45060sif(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }

    public C45060sif(@NotNull java.util.List<SuggestedActionBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC47391tpE abstractC47391tpEOLrzqt = AbstractC47391tpE.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47391tpEOLrzqt, "");
        return new StateListAnimator(this, abstractC47391tpEOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.copydefault(this.AEQbTJ.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    public final void OLrzqt(@NotNull java.util.List<SuggestedActionBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.sif$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final AbstractC47391tpE KWHzl;
        public final /* synthetic */ C45060sif OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C45060sif c45060sif, AbstractC47391tpE abstractC47391tpE) {
            super(abstractC47391tpE.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47391tpE, "");
            this.OLrzqt = c45060sif;
            this.KWHzl = abstractC47391tpE;
        }

        public final void copydefault(@NotNull SuggestedActionBean suggestedActionBean) {
            Intrinsics.checkNotNullParameter(suggestedActionBean, "");
            AbstractC47391tpE abstractC47391tpE = this.KWHzl;
            C45060sif c45060sif = this.OLrzqt;
            abstractC47391tpE.AEQbTJ.setText(suggestedActionBean.getActionTitle());
            abstractC47391tpE.KWHzl.setText(suggestedActionBean.getActionDescription());
            if (suggestedActionBean.getSelfServiceTool() != null) {
                abstractC47391tpE.EZpvd.setText(suggestedActionBean.getSelfServiceTool().getTitle());
                C52794wYp c52794wYp = abstractC47391tpE.EZpvd;
                c52794wYp.setOnClickListener(new ViewOnClickListenerC0948StateListAnimator(c52794wYp, 1000L, c45060sif, suggestedActionBean));
                C52794wYp c52794wYp2 = abstractC47391tpE.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
                c52794wYp2.setVisibility(0);
                return;
            }
            C52794wYp c52794wYp3 = abstractC47391tpE.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
            c52794wYp3.setVisibility(8);
        }

        /* JADX INFO: renamed from: o.sif$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0948StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ SuggestedActionBean AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ C45060sif copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0948StateListAnimator(android.view.View view, long j, C45060sif c45060sif, SuggestedActionBean suggestedActionBean) {
                this.EZpvd = view;
                this.OLrzqt = j;
                this.copydefault = c45060sif;
                this.AEQbTJ = suggestedActionBean;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    Activity activity = this.copydefault.copydefault;
                    if (activity != null) {
                        activity.EZpvd(this.AEQbTJ.getSelfServiceTool());
                    }
                }
            }
        }
    }
}
