package o;

import com.okinc.business.invest_biz.ui.screens.transaction.itembinder.NetworkAndSlippageItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26719jhd extends AbstractC27119jpF<InterfaceC24178iXu.Dialog, iIJ> {
    public final Function0<Unit> KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C26719jhd() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r1v0 kotlin.jvm.functions.Function0))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>, boolean):void (m)] (LINE:7) call: o.jhd.<init>(kotlin.jvm.functions.Function0, boolean):void type: THIS */
    public /* synthetic */ C26719jhd(Function0 function0, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? false : z);
    }

    public C26719jhd(Function0<Unit> function0, boolean z) {
        super(NetworkAndSlippageItemBinder$1.INSTANCE);
        this.KWHzl = function0;
        this.copydefault = z;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iIJ iij, @NotNull InterfaceC24178iXu.Dialog dialog) {
        Intrinsics.checkNotNullParameter(iij, "");
        Intrinsics.checkNotNullParameter(dialog, "");
        iij.copydefault.AEQbTJ(this.copydefault);
        C27206jqn c27206jqn = iij.copydefault;
        int iValueOf = dialog.valueOf();
        java.lang.String strKWHzl = dialog.KWHzl();
        java.lang.String strOLrzqt = dialog.OLrzqt();
        java.lang.String strCopydefault = dialog.copydefault();
        boolean zDjBIcL = dialog.djBIcL();
        c27206jqn.AEQbTJ(iValueOf, true, strKWHzl, strOLrzqt, strCopydefault, java.lang.Boolean.valueOf(zDjBIcL), dialog.AhwBna(), dialog.gEmmrt(), dialog.AYXKKw(), dialog.AEQbTJ());
        iij.copydefault.setSlippageClickListener(new Function0() { // from class: o.jhc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26719jhd.KWHzl(this.KWHzl);
            }
        });
        iij.copydefault.setSlippageText(dialog.copydefault());
    }

    public static final Unit KWHzl(C26719jhd c26719jhd) {
        Function0<Unit> function0 = c26719jhd.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
