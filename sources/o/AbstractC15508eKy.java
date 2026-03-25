package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.okinc.business.defi.biz.net.bean.TxRecord;
import com.okinc.business.dex.api.bean.TradeDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC10049bhC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eKy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC15508eKy<T, VH extends RecyclerView.ViewHolder> extends AbstractC59533zio<T, VH> {
    public AbstractC16746epj AEQbTJ;
    public final Function1<TxRecord, Unit> EZpvd;
    public final Function1<TxRecord, Unit> KWHzl;
    public AbstractC16867ery OLrzqt;
    public final Function1<TxRecord, Unit> copydefault;
    public final Function1<TxRecord, Unit> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC15508eKy() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull AbstractC16867ery abstractC16867ery) {
        Intrinsics.checkNotNullParameter(abstractC16867ery, "");
        this.OLrzqt = abstractC16867ery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<TxRecord, Unit> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r3v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r4v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r5v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit>):void (m)] (LINE:47) call: o.eKy.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ AbstractC15508eKy(Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function14);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.TxRecord, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC15508eKy(Function1<? super TxRecord, Unit> function1, Function1<? super TxRecord, Unit> function12, Function1<? super TxRecord, Unit> function13, Function1<? super TxRecord, Unit> function14) {
        this.gEmmrt = function1;
        this.EZpvd = function12;
        this.copydefault = function13;
        this.KWHzl = function14;
    }

    public static /* synthetic */ void initPending$default(AbstractC15508eKy abstractC15508eKy, AbstractC16867ery abstractC16867ery, AbstractC16746epj abstractC16746epj, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initPending");
        }
        if ((i & 2) != 0) {
            abstractC16746epj = null;
        }
        abstractC15508eKy.KWHzl(abstractC16867ery, abstractC16746epj);
    }

    public final void KWHzl(@NotNull final AbstractC16867ery abstractC16867ery, AbstractC16746epj abstractC16746epj) {
        Intrinsics.checkNotNullParameter(abstractC16867ery, "");
        KWHzl(abstractC16867ery);
        this.AEQbTJ = abstractC16746epj;
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16867ery.OLrzqt);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        java.lang.Object context = abstractC16867ery.OLrzqt.getContext();
        Intrinsics.copydefault(context, "");
        Lifecycle.Event event = Lifecycle.Event.ON_DESTROY;
        C58156yvv.OLrzqt(abstractC58247yxgThrottleFirst, (LifecycleOwner) context, event).subscribe(new InterfaceC58227yxM() { // from class: o.eKA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC15508eKy.EZpvd(abstractC16867ery, this, obj);
            }
        });
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst2 = C8003auW.copydefault(abstractC16867ery.EZpvd).throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst2, "");
        java.lang.Object context2 = abstractC16867ery.OLrzqt.getContext();
        Intrinsics.copydefault(context2, "");
        C58156yvv.OLrzqt(abstractC58247yxgThrottleFirst2, (LifecycleOwner) context2, event).subscribe(new InterfaceC58227yxM() { // from class: o.eKB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC15508eKy.OLrzqt(abstractC16867ery, this, obj);
            }
        });
    }

    public static final void EZpvd(AbstractC16867ery abstractC16867ery, AbstractC15508eKy abstractC15508eKy, java.lang.Object obj) {
        C15489eKf c15489eKfOLrzqt = abstractC16867ery.OLrzqt();
        TxRecord txRecordAuCTel = c15489eKfOLrzqt != null ? c15489eKfOLrzqt.AuCTel() : null;
        if (txRecordAuCTel != null) {
            if (txRecordAuCTel.getRepeatTxType() < 2) {
                Function1<TxRecord, Unit> function1 = abstractC15508eKy.gEmmrt;
                if (function1 != null) {
                    function1.invoke(txRecordAuCTel);
                    return;
                }
                return;
            }
            Function1<TxRecord, Unit> function12 = abstractC15508eKy.copydefault;
            if (function12 != null) {
                function12.invoke(txRecordAuCTel);
            }
        }
    }

    public static final void OLrzqt(AbstractC16867ery abstractC16867ery, AbstractC15508eKy abstractC15508eKy, java.lang.Object obj) {
        Function1<TxRecord, Unit> function1;
        C15489eKf c15489eKfOLrzqt = abstractC16867ery.OLrzqt();
        TxRecord txRecordAuCTel = c15489eKfOLrzqt != null ? c15489eKfOLrzqt.AuCTel() : null;
        if (txRecordAuCTel == null || (function1 = abstractC15508eKy.EZpvd) == null) {
            return;
        }
        function1.invoke(txRecordAuCTel);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(@NotNull android.content.Context context, TxRecord txRecord) {
        InterfaceC25429iwZ interfaceC25429iwZ;
        Intrinsics.checkNotNullParameter(context, "");
        if (txRecord != null) {
            int txType = txRecord.getTxType();
            if (txType == 5) {
                if (!C14687dqE.OLrzqt.djBIcL() && (context instanceof AppCompatActivity) && C33129mqd.OLrzqt((java.lang.CharSequence) txRecord.getDexOrderId())) {
                    ((gKO) C43251rlk.copydefault(gKO.class)).AEQbTJ((android.app.Activity) context, new TradeDetails(txRecord.getDexOrderId()), (LifecycleOwner) context);
                    return;
                } else {
                    EZpvd(context, txRecord);
                    return;
                }
            }
            if (txType != 84 && txType != 85) {
                switch (txType) {
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                        break;
                    default:
                        switch (txType) {
                            case 40:
                            case 41:
                                if (!C14687dqE.OLrzqt.djBIcL() && (context instanceof AppCompatActivity)) {
                                    ((gKO) C43251rlk.copydefault(gKO.class)).AEQbTJ((android.app.Activity) context, new TradeDetails(txRecord.getOrderId()), (LifecycleOwner) context);
                                    break;
                                }
                                break;
                            case 42:
                                if (!C14687dqE.OLrzqt.djBIcL() && (context instanceof AppCompatActivity)) {
                                    ((gKO) C43251rlk.copydefault(gKO.class)).EZpvd((android.app.Activity) context, new TradeDetails(txRecord.getOrderId()), (LifecycleOwner) context);
                                    break;
                                }
                                break;
                            default:
                                EZpvd(context, txRecord);
                                break;
                        }
                        break;
                }
                return;
            }
            if (C14687dqE.OLrzqt.isConnected() || !(context instanceof AppCompatActivity) || (interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class))) == null) {
                return;
            }
            interfaceC25429iwZ.AEQbTJ(context, txRecord.getTxhash(), txRecord.getUOpHash());
        }
    }

    public final void EZpvd(android.content.Context context, TxRecord txRecord) {
        if (txRecord != null) {
            ActivityC10049bhC.ActionBar actionBar = ActivityC10049bhC.Companion;
            java.lang.String txId = txRecord.getTxId();
            java.lang.String txhash = txRecord.getTxhash();
            java.lang.String uOpHash = txRecord.getUOpHash();
            if (uOpHash == null) {
                uOpHash = "";
            }
            java.lang.String address = txRecord.getAddress();
            java.lang.String orderId = txRecord.getOrderId();
            java.lang.String walletId = txRecord.getWalletId();
            long coinId = txRecord.getCoinId();
            actionBar.KWHzl(context, (1544 & 2) != 0 ? "" : txId, (1544 & 4) != 0 ? "" : txhash, (1544 & 8) != 0 ? "" : uOpHash, address, walletId, orderId, (1544 & 128) != 0 ? 0L : coinId, txRecord.getOrderType(), (1544 & 512) != 0 ? false : false, (1544 & 1024) != 0 ? "" : null);
        }
    }
}
