package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.unify_trade.biz.CustomerServiceAndChatItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51503voJ extends AbstractC59533zio<CustomerServiceAndChatItem, Activity> {
    public final Function0<Unit> OLrzqt;
    public final Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51503voJ() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.voJ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C51503voJ KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51503voJ c51503voJ) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c51503voJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0<Unit> function0AEQbTJ = this.KWHzl.AEQbTJ();
                if (function0AEQbTJ != null) {
                    function0AEQbTJ.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.voJ$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C51503voJ AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51503voJ c51503voJ) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c51503voJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0<Unit> function0EZpvd = this.AEQbTJ.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                }
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r2v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r3v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:233) call: o.voJ.<init>(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C51503voJ(Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? null : function02);
    }

    public C51503voJ(Function0<Unit> function0, Function0<Unit> function02) {
        this.copydefault = function0;
        this.OLrzqt = function02;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC48514uUf abstractC48514uUfAEQbTJ = AbstractC48514uUf.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC48514uUfAEQbTJ, "");
        return new Activity(abstractC48514uUfAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull CustomerServiceAndChatItem customerServiceAndChatItem) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(customerServiceAndChatItem, "");
        C32866mlf.onEvent$default("trading_bot_cs_home_page_bottom_view", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        AbstractC48514uUf abstractC48514uUfKWHzl = activity.KWHzl();
        ConstraintLayout constraintLayout = abstractC48514uUfKWHzl.copydefault;
        constraintLayout.setOnClickListener(new TaskDescription(constraintLayout, 1000L, this));
        ConstraintLayout constraintLayout2 = abstractC48514uUfKWHzl.EZpvd;
        constraintLayout2.setOnClickListener(new ActionBar(constraintLayout2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.voJ$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final AbstractC48514uUf AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC48514uUf KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull AbstractC48514uUf abstractC48514uUf) {
            super(abstractC48514uUf.getRoot());
            Intrinsics.checkNotNullParameter(abstractC48514uUf, "");
            this.AEQbTJ = abstractC48514uUf;
        }
    }
}
