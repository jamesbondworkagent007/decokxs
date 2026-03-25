package o;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vnn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51480vnn extends AbstractC59533zio<C51484vnr, C51481vno> {
    public final Function1<C51484vnr, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51480vnn() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super o.vnr, kotlin.Unit>):void (m)] (LINE:11) call: o.vnn.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C51480vnn(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.vnr, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51480vnn(Function1<? super C51484vnr, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C51481vno onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C51958vwo c51958vwo = new C51958vwo(context, null, 0, 6, null);
        c51958vwo.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new C51481vno(c51958vwo);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51481vno c51481vno, @NotNull C51484vnr c51484vnr) {
        Intrinsics.checkNotNullParameter(c51481vno, "");
        Intrinsics.checkNotNullParameter(c51484vnr, "");
        android.view.View view = c51481vno.itemView;
        C51958vwo c51958vwo = view instanceof C51958vwo ? (C51958vwo) view : null;
        if (c51958vwo != null) {
            c51958vwo.setData(c51484vnr.copydefault(), c51484vnr.KWHzl(), c51484vnr.AEQbTJ());
            c51958vwo.setOnClickListener(new TaskDescription(c51958vwo, 1000L, this, c51484vnr));
        }
    }

    /* JADX INFO: renamed from: o.vnn$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C51484vnr AEQbTJ;
        public final /* synthetic */ C51480vnn KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51480vnn c51480vnn, C51484vnr c51484vnr) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c51480vnn;
            this.AEQbTJ = c51484vnr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.KWHzl.copydefault;
                if (function1 != null) {
                    function1.invoke(this.AEQbTJ);
                }
            }
        }
    }
}
