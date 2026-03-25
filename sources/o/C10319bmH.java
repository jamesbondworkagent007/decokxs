package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.defi.assets.utxo.widget.UtxoAssetListState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bmH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10319bmH extends LinearLayoutCompat {
    public InterfaceC10325bmN KWHzl;
    public final C16976euA OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10319bmH(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10319bmH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(@NotNull InterfaceC10325bmN interfaceC10325bmN) {
        Intrinsics.checkNotNullParameter(interfaceC10325bmN, "");
        this.KWHzl = interfaceC10325bmN;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:11) call: o.bmH.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C10319bmH(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10319bmH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C16976euA c16976euACopydefault = C16976euA.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c16976euACopydefault, "");
        this.OLrzqt = c16976euACopydefault;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.bmK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10319bmH.OLrzqt();
            }
        });
        c16976euACopydefault.EZpvd.setAdapter(AEQbTJ());
        c16976euACopydefault.getRoot().djBIcL(false);
        c16976euACopydefault.getRoot().KWHzl(new InterfaceC57900yrD() { // from class: o.bmP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C10319bmH.OLrzqt(this.copydefault, interfaceC57934yrl);
            }
        });
    }

    private final C10320bmI AEQbTJ() {
        return (C10320bmI) this.copydefault.getValue();
    }

    public static final C10320bmI OLrzqt() {
        return new C10320bmI();
    }

    public static final void OLrzqt(C10319bmH c10319bmH, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        InterfaceC10325bmN interfaceC10325bmN = c10319bmH.KWHzl;
        if (interfaceC10325bmN != null) {
            interfaceC10325bmN.AEQbTJ();
        }
    }

    public final void setData(@NotNull UtxoAssetListState utxoAssetListState) {
        Intrinsics.checkNotNullParameter(utxoAssetListState, "");
        if (utxoAssetListState.EZpvd().isEmpty()) {
            return;
        }
        this.OLrzqt.getRoot().valueOf();
        AEQbTJ().OLrzqt(utxoAssetListState.EZpvd());
        if (utxoAssetListState.copydefault()) {
            C33546myW c33546myWAEQbTJ = this.OLrzqt.getRoot();
            c33546myWAEQbTJ.setNoMoreDataEffective(true);
            c33546myWAEQbTJ.KWHzl(true);
        }
    }
}
