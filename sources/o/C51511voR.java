package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.NmpBotSquareGuideItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51511voR extends AbstractC59533zio<NmpBotSquareGuideItem, TaskDescription> {
    public final Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51511voR() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.voR$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C51511voR EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51511voR c51511voR) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c51511voR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0<Unit> function0Copydefault = this.EZpvd.copydefault();
                if (function0Copydefault != null) {
                    function0Copydefault.invoke();
                }
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:276) call: o.voR.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C51511voR(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    public C51511voR(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC48587uWy abstractC48587uWyAEQbTJ = AbstractC48587uWy.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC48587uWyAEQbTJ, "");
        return new TaskDescription(abstractC48587uWyAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull NmpBotSquareGuideItem nmpBotSquareGuideItem) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(nmpBotSquareGuideItem, "");
        android.view.View view = taskDescription.itemView;
        view.setOnClickListener(new Activity(view, 1000L, this));
        taskDescription.EZpvd().AEQbTJ.setText(nmpBotSquareGuideItem.getTitle());
        taskDescription.EZpvd().copydefault.setText(nmpBotSquareGuideItem.getDesc());
    }

    /* JADX INFO: renamed from: o.voR$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final AbstractC48587uWy EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC48587uWy EZpvd() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull AbstractC48587uWy abstractC48587uWy) {
            super(abstractC48587uWy.getRoot());
            Intrinsics.checkNotNullParameter(abstractC48587uWy, "");
            this.EZpvd = abstractC48587uWy;
        }
    }
}
