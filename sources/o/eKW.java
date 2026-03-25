package o;

import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.biz.net.bean.TxRecord;
import com.okinc.business.dex.api.bean.BridgeRedeemStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eKW extends AbstractC15508eKy<C15499eKp, C15514eLd> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public eKW() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r3v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r4v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r5v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>):void (m)] (LINE:22) call: o.eKW.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ eKW(Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function14);
    }

    public eKW(Function1<? super TxRecord, Unit> function1, Function1<? super TxRecord, Unit> function12, Function1<? super TxRecord, Unit> function13, Function1<? super TxRecord, Unit> function14) {
        super(function1, function12, function13, function14);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C15514eLd onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull final android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        final AbstractC16905esj abstractC16905esjCopydefault = AbstractC16905esj.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16905esjCopydefault, "");
        AbstractC16867ery abstractC16867ery = abstractC16905esjCopydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(abstractC16867ery, "");
        KWHzl(abstractC16867ery, abstractC16905esjCopydefault.AEQbTJ);
        AbstractC16867ery abstractC16867ery2 = abstractC16905esjCopydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(abstractC16867ery2, "");
        copydefault(abstractC16867ery2);
        abstractC16905esjCopydefault.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.eLb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eKW.EZpvd(abstractC16905esjCopydefault, this, viewGroup, view);
            }
        });
        return new C15514eLd(abstractC16905esjCopydefault);
    }

    public static final void EZpvd(AbstractC16905esj abstractC16905esj, eKW ekw, android.view.ViewGroup viewGroup, android.view.View view) {
        C15489eKf c15489eKfKWHzl = abstractC16905esj.KWHzl();
        TxRecord txRecordAuCTel = c15489eKfKWHzl != null ? c15489eKfKWHzl.AuCTel() : null;
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ekw.KWHzl(context, txRecordAuCTel);
    }

    public final void copydefault(final AbstractC16867ery abstractC16867ery) {
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(abstractC16867ery.AEQbTJ).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        java.lang.Object context = abstractC16867ery.AEQbTJ.getContext();
        Intrinsics.copydefault(context, "");
        C58156yvv.OLrzqt(abstractC58247yxgThrottleFirst, (LifecycleOwner) context, Lifecycle.Event.ON_DESTROY).subscribe(new InterfaceC58227yxM() { // from class: o.eLa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eKW.OLrzqt(abstractC16867ery, obj);
            }
        });
    }

    public static final void OLrzqt(AbstractC16867ery abstractC16867ery, java.lang.Object obj) {
        TxRecord txRecordAuCTel;
        C15489eKf c15489eKfOLrzqt = abstractC16867ery.OLrzqt();
        if (c15489eKfOLrzqt == null || (txRecordAuCTel = c15489eKfOLrzqt.AuCTel()) == null || txRecordAuCTel.getTxType() != 40) {
            return;
        }
        C15489eKf c15489eKfOLrzqt2 = abstractC16867ery.OLrzqt();
        TxRecord txRecordAuCTel2 = c15489eKfOLrzqt2 != null ? c15489eKfOLrzqt2.AuCTel() : null;
        if (txRecordAuCTel2 != null) {
            gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
            android.content.Context context = abstractC16867ery.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            android.content.Context context2 = abstractC16867ery.AEQbTJ.getContext();
            ComponentActivity componentActivity = context2 instanceof ComponentActivity ? (ComponentActivity) context2 : null;
            if (componentActivity == null) {
                return;
            }
            java.lang.String orderId = txRecordAuCTel2.getOrderId();
            gko.copydefault(context, componentActivity, orderId == null ? "" : orderId, C33129mqd.gEmmrt(txRecordAuCTel2.getToChainId()), true, new Function1() { // from class: o.eLe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return eKW.AEQbTJ((BridgeRedeemStatus) obj2);
                }
            });
        }
    }

    public static final Unit AEQbTJ(BridgeRedeemStatus bridgeRedeemStatus) {
        Intrinsics.checkNotNullParameter(bridgeRedeemStatus, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C15514eLd c15514eLd, @NotNull C15499eKp c15499eKp) {
        Intrinsics.checkNotNullParameter(c15514eLd, "");
        Intrinsics.checkNotNullParameter(c15499eKp, "");
        c15514eLd.copydefault(c15499eKp);
    }
}
