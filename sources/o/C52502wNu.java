package o;

import android.view.View;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C52502wNu extends AbstractC59533zio<TransDetailsData, C52500wNs> {
    public final Function1<TransDetailsData, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C52502wNu() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<TransDetailsData, Unit> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.TransDetailsData, kotlin.Unit>):void (m)] (LINE:26) call: o.wNu.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C52502wNu(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.TransDetailsData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52502wNu(Function1<? super TransDetailsData, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C52500wNs onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.onReceive, (android.view.ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C52500wNs(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52500wNs c52500wNs, @NotNull TransDetailsData transDetailsData) {
        Intrinsics.checkNotNullParameter(c52500wNs, "");
        Intrinsics.checkNotNullParameter(transDetailsData, "");
        c52500wNs.AEQbTJ().setText(transDetailsData.getTitle());
        C55251xgS c55251xgSCopydefault = c52500wNs.copydefault();
        c55251xgSCopydefault.setText(transDetailsData.getTradeType());
        c55251xgSCopydefault.setOKDSSize(-5);
        c55251xgSCopydefault.setOKDSStyle(transDetailsData.getTradeTypeTagStyle());
        c52500wNs.OLrzqt().setText(transDetailsData.getTime());
        android.widget.TextView textViewEZpvd = c52500wNs.EZpvd();
        textViewEZpvd.setOnClickListener(new Application(textViewEZpvd, 1000L, this, transDetailsData));
        C59534zip c59534zip = new C59534zip();
        android.content.Context context = c52500wNs.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c59534zip.register(TacticsInsideItemData.class, new C52518wOj(context, null, true, 0, false, null, null, null, 250, null));
        c59534zip.setItems(transDetailsData.getList());
        c52500wNs.KWHzl().setLayoutManager(C33047mpA.copydefault(c52500wNs.itemView.getContext(), 2));
        c52500wNs.KWHzl().setAdapter(c59534zip);
    }

    /* JADX INFO: renamed from: o.wNu$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C52502wNu KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ TransDetailsData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52502wNu c52502wNu, TransDetailsData transDetailsData) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c52502wNu;
            this.copydefault = transDetailsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1<TransDetailsData, Unit> function1OLrzqt = this.KWHzl.OLrzqt();
                if (function1OLrzqt != null) {
                    function1OLrzqt.invoke(this.copydefault);
                }
            }
        }
    }
}
