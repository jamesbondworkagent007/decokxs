package o;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vnu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51487vnu extends AbstractC59533zio<C51484vnr, C51489vnw> {
    public final Function1<C51484vnr, Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51487vnu() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super o.vnr, kotlin.Unit>):void (m)] (LINE:11) call: o.vnu.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C51487vnu(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.vnr, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51487vnu(Function1<? super C51484vnr, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C51489vnw onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C51962vws c51962vws = new C51962vws(context, null, 0, 6, null);
        c51962vws.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new C51489vnw(c51962vws);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51489vnw c51489vnw, @NotNull C51484vnr c51484vnr) {
        Intrinsics.checkNotNullParameter(c51489vnw, "");
        Intrinsics.checkNotNullParameter(c51484vnr, "");
        android.view.View view = c51489vnw.itemView;
        C51962vws c51962vws = view instanceof C51962vws ? (C51962vws) view : null;
        if (c51962vws != null) {
            c51962vws.setData(c51484vnr.copydefault(), c51484vnr.KWHzl());
            c51962vws.setOnClickListener(new ActionBar(c51962vws, 1000L, this, c51484vnr));
        }
    }

    /* JADX INFO: renamed from: o.vnu$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C51487vnu EZpvd;
        public final /* synthetic */ C51484vnr KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51487vnu c51487vnu, C51484vnr c51484vnr) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c51487vnu;
            this.KWHzl = c51484vnr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.EZpvd;
                if (function1 != null) {
                    function1.invoke(this.KWHzl);
                }
            }
        }
    }
}
