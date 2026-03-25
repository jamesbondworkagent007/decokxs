package o;

import android.view.ViewGroup;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.urJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49581urJ extends android.widget.FrameLayout implements InterfaceC49583urL {
    public boolean AEQbTJ;
    public BizInstrument EZpvd;
    public final /* synthetic */ InterfaceC49583urL KWHzl;
    public InterfaceC49582urK OLrzqt;
    public android.app.Activity copydefault;
    public InterfaceC49574urC valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49581urJ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49581urJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49583urL
    public InterfaceC49582urK AEQbTJ(@NotNull android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, BizInstrument bizInstrument, boolean z, InterfaceC49574urC interfaceC49574urC) {
        Intrinsics.checkNotNullParameter(context, "");
        return this.KWHzl.AEQbTJ(context, fragmentManager, bizInstrument, z, interfaceC49574urC);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivity(android.app.Activity activity) {
        this.copydefault = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftLegal(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVmFactory(InterfaceC49574urC interfaceC49574urC) {
        this.valueOf = interfaceC49574urC;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:43) call: o.urJ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C49581urJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49581urJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = ((InterfaceC49510ups) C43251rlk.copydefault(InterfaceC49510ups.class)).AEQbTJ();
    }

    public static /* synthetic */ void onVisible$default(C49581urJ c49581urJ, BizInstrument bizInstrument, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bizInstrument = null;
        }
        c49581urJ.EZpvd(bizInstrument);
    }

    public final void EZpvd(BizInstrument bizInstrument) {
        this.EZpvd = bizInstrument;
        if (bizInstrument != null) {
            bizInstrument.getInstId();
        }
        InterfaceC49582urK interfaceC49582urK = this.OLrzqt;
        if (interfaceC49582urK != null) {
            interfaceC49582urK.KWHzl();
        }
        KWHzl();
        copydefault(this.EZpvd);
        InterfaceC49582urK interfaceC49582urK2 = this.OLrzqt;
        if (interfaceC49582urK2 != null) {
            interfaceC49582urK2.AEQbTJ();
        }
    }

    public final void copydefault() {
        InterfaceC49582urK interfaceC49582urK = this.OLrzqt;
        if (interfaceC49582urK != null) {
            interfaceC49582urK.KWHzl();
        }
    }

    public final void EZpvd() {
        InterfaceC49582urK interfaceC49582urK = this.OLrzqt;
        if (interfaceC49582urK != null) {
            interfaceC49582urK.EZpvd();
        }
    }

    public final void KWHzl() {
        if (this.OLrzqt != null) {
            removeAllViews();
            this.OLrzqt = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: o.urK */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(BizInstrument bizInstrument) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        InterfaceC49582urK interfaceC49582urKAEQbTJ = AEQbTJ(context, null, bizInstrument, this.AEQbTJ, this.valueOf);
        this.OLrzqt = interfaceC49582urKAEQbTJ;
        if (interfaceC49582urKAEQbTJ != 0) {
            addView((android.view.ViewGroup) interfaceC49582urKAEQbTJ, new ViewGroup.LayoutParams(-1, -2));
        }
    }
}
