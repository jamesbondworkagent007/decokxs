package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.net.bean.TxRecord;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eKS extends AbstractC15508eKy<C15500eKq, eKU> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public eKS() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r3v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r4v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r5v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>):void (m)] (LINE:31) call: o.eKS.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ eKS(Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function14);
    }

    public eKS(Function1<? super TxRecord, Unit> function1, Function1<? super TxRecord, Unit> function12, Function1<? super TxRecord, Unit> function13, Function1<? super TxRecord, Unit> function14) {
        super(function1, function12, function13, function14);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public eKU onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull final android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        final AbstractC16857ero abstractC16857eroEZpvd = AbstractC16857ero.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16857eroEZpvd, "");
        AbstractC16867ery abstractC16867ery = abstractC16857eroEZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(abstractC16867ery, "");
        KWHzl(abstractC16867ery, abstractC16857eroEZpvd.OLrzqt);
        abstractC16857eroEZpvd.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.eKT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eKS.copydefault(abstractC16857eroEZpvd, this, viewGroup, view);
            }
        });
        abstractC16857eroEZpvd.KWHzl.addOnItemTouchListener(new ActionBar(abstractC16857eroEZpvd, this, viewGroup));
        return new eKU(abstractC16857eroEZpvd);
    }

    public static final void copydefault(AbstractC16857ero abstractC16857ero, eKS eks, android.view.ViewGroup viewGroup, android.view.View view) {
        C15489eKf c15489eKfOLrzqt = abstractC16857ero.OLrzqt();
        TxRecord txRecordAuCTel = c15489eKfOLrzqt != null ? c15489eKfOLrzqt.AuCTel() : null;
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        eks.KWHzl(context, txRecordAuCTel);
    }

    public static final class ActionBar implements RecyclerView.OnItemTouchListener {
        public final /* synthetic */ AbstractC16857ero AEQbTJ;
        public final /* synthetic */ eKS KWHzl;
        public final /* synthetic */ android.view.ViewGroup copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        public ActionBar(AbstractC16857ero abstractC16857ero, eKS eks, android.view.ViewGroup viewGroup) {
            this.AEQbTJ = abstractC16857ero;
            this.KWHzl = eks;
            this.copydefault = viewGroup;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
            if (motionEvent.getAction() == 1) {
                C15489eKf c15489eKfOLrzqt = this.AEQbTJ.OLrzqt();
                TxRecord txRecordAuCTel = c15489eKfOLrzqt != null ? c15489eKfOLrzqt.AuCTel() : null;
                eKS eks = this.KWHzl;
                android.content.Context context = this.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                eks.KWHzl(context, txRecordAuCTel);
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull eKU eku, @NotNull C15500eKq c15500eKq) {
        Intrinsics.checkNotNullParameter(eku, "");
        Intrinsics.checkNotNullParameter(c15500eKq, "");
        eku.copydefault(c15500eKq);
    }
}
