package o;

import android.view.View;
import com.okinc.business.defi.biz.net.bean.TxRecord;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eKK extends AbstractC15508eKy<C15494eKk, eKO> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public eKK() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r3v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r4v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r5v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>):void (m)] (LINE:17) call: o.eKK.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ eKK(Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function14);
    }

    public eKK(Function1<? super TxRecord, Unit> function1, Function1<? super TxRecord, Unit> function12, Function1<? super TxRecord, Unit> function13, Function1<? super TxRecord, Unit> function14) {
        super(function1, function12, function13, function14);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public eKO onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull final android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        final AbstractC16861ers abstractC16861ersAEQbTJ = AbstractC16861ers.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16861ersAEQbTJ, "");
        AbstractC16867ery abstractC16867ery = abstractC16861ersAEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(abstractC16867ery, "");
        KWHzl(abstractC16867ery, abstractC16861ersAEQbTJ.EZpvd);
        abstractC16861ersAEQbTJ.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.eKG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eKK.EZpvd(abstractC16861ersAEQbTJ, this, viewGroup, view);
            }
        });
        return new eKO(abstractC16861ersAEQbTJ);
    }

    public static final void EZpvd(AbstractC16861ers abstractC16861ers, eKK ekk, android.view.ViewGroup viewGroup, android.view.View view) {
        C15489eKf c15489eKfOLrzqt = abstractC16861ers.OLrzqt();
        TxRecord txRecordAuCTel = c15489eKfOLrzqt != null ? c15489eKfOLrzqt.AuCTel() : null;
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ekk.KWHzl(context, txRecordAuCTel);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull eKO eko, @NotNull C15494eKk c15494eKk) {
        Intrinsics.checkNotNullParameter(eko, "");
        Intrinsics.checkNotNullParameter(c15494eKk, "");
        eko.copydefault(c15494eKk);
    }
}
