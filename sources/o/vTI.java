package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vTI extends AbstractC59533zio<vTA, TaskDescription> {
    public final Function1<java.lang.String, Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public vTI() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>):void (m)] (LINE:12) call: o.vTI.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ vTI(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public vTI(Function1<? super java.lang.String, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C48484uTc c48484uTcOLrzqt = C48484uTc.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c48484uTcOLrzqt, "");
        return new TaskDescription(c48484uTcOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull vTA vta) {
        BizInstrument bizInstrumentValueOf;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(vta, "");
        C48484uTc c48484uTcOLrzqt = taskDescription.OLrzqt();
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.OLrzqt(vta.EZpvd()) : null;
        java.util.List<java.lang.String> listCopydefault = vta.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        java.util.Iterator<T> it = listCopydefault.iterator();
        while (it.hasNext()) {
            java.lang.String tradeSymbol = (abstractC54531xLwOLrzqt == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf((java.lang.String) it.next())) == null) ? null : bizInstrumentValueOf.getTradeSymbol();
            if (tradeSymbol == null) {
                tradeSymbol = "";
            }
            arrayList.add(tradeSymbol);
        }
        C51601vqB.refreshCircleCoins$default(c48484uTcOLrzqt.AEQbTJ, arrayList, 0, 0, 6, null);
        LinearLayoutCompat linearLayoutCompat = c48484uTcOLrzqt.OLrzqt;
        linearLayoutCompat.setOnClickListener(new Activity(linearLayoutCompat, 1000L, this));
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C48484uTc KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C48484uTc OLrzqt() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C48484uTc c48484uTc) {
            super(c48484uTc.getRoot());
            Intrinsics.checkNotNullParameter(c48484uTc, "");
            this.KWHzl = c48484uTc;
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ vTI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vTI vti) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = vti;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1<java.lang.String, Unit> function1Copydefault = this.copydefault.copydefault();
                if (function1Copydefault != null) {
                    function1Copydefault.invoke("");
                }
            }
        }
    }
}
