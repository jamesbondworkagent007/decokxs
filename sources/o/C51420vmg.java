package o;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vmg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51420vmg extends AbstractC59533zio<C51484vnr, C51419vmf> {
    public final Function1<C51484vnr, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51420vmg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super o.vnr, kotlin.Unit>):void (m)] (LINE:12) call: o.vmg.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C51420vmg(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.vnr, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51420vmg(Function1<? super C51484vnr, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C51419vmf onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C51425vml c51425vml = new C51425vml(context, null, 0, 6, null);
        c51425vml.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new C51419vmf(c51425vml);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51419vmf c51419vmf, @NotNull C51484vnr c51484vnr) {
        Intrinsics.checkNotNullParameter(c51419vmf, "");
        Intrinsics.checkNotNullParameter(c51484vnr, "");
        android.view.View view = c51419vmf.itemView;
        C51425vml c51425vml = view instanceof C51425vml ? (C51425vml) view : null;
        if (c51425vml != null) {
            c51425vml.setData(c51484vnr.copydefault(), c51484vnr.KWHzl(), c51484vnr.AEQbTJ());
            c51425vml.setOnClickListener(new ActionBar(c51425vml, 1000L, this, c51484vnr));
        }
    }

    /* JADX INFO: renamed from: o.vmg$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C51484vnr EZpvd;
        public final /* synthetic */ C51420vmg KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51420vmg c51420vmg, C51484vnr c51484vnr) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c51420vmg;
            this.EZpvd = c51484vnr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.KWHzl.OLrzqt;
                if (function1 != null) {
                    function1.invoke(this.EZpvd);
                }
            }
        }
    }
}
