package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hYn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22117hYn extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public boolean EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22117hYn(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22117hYn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpand(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.hYn.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C22117hYn(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22117hYn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hYp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22117hYn.DbNXlk(this.AEQbTJ);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.hYu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22117hYn.fJNWhG(this.AEQbTJ);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.hYv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22117hYn.ejfBZ(this.OLrzqt);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hYr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22117hYn.AkhnZx(this.copydefault);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hYt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22117hYn.fetchVPNInfo(this.KWHzl);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.hYy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22117hYn.uzCIH(this.OLrzqt);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.hYw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22117hYn.fARcdN(this.copydefault);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.hYz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22117hYn.fIwbmz(this.OLrzqt);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.hYq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22117hYn.AuCTel(this.AEQbTJ);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.hYo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22117hYn.iwGUEr(this.KWHzl);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hYs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22117hYn.isConnected(this.OLrzqt);
            }
        });
        this.EZpvd = true;
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.onProviderEnabled, (android.view.ViewGroup) this, true);
    }

    private final hXF AEQbTJ() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (hXF) value;
    }

    public static final hXF DbNXlk(C22117hYn c22117hYn) {
        return (hXF) c22117hYn.findViewById(C23274hvD.Application.QYNZmZ);
    }

    public static final AppCompatTextView fJNWhG(C22117hYn c22117hYn) {
        return (AppCompatTextView) c22117hYn.findViewById(C23274hvD.Application.populateOptionsMenu);
    }

    private final AppCompatTextView gEmmrt() {
        java.lang.Object value = this.AYXKKw.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    private final AppCompatImageView djBIcL() {
        java.lang.Object value = this.AhwBna.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final AppCompatImageView ejfBZ(C22117hYn c22117hYn) {
        return (AppCompatImageView) c22117hYn.findViewById(C23274hvD.Application.MediaBrowserCompatMediaBrowserImpl);
    }

    private final AppCompatImageView AhwBna() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final AppCompatImageView AkhnZx(C22117hYn c22117hYn) {
        return (AppCompatImageView) c22117hYn.findViewById(C23274hvD.Application.ICustomTabsServiceStub);
    }

    private final AppCompatImageView AYXKKw() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final AppCompatImageView fetchVPNInfo(C22117hYn c22117hYn) {
        return (AppCompatImageView) c22117hYn.findViewById(C23274hvD.Application.INotificationSideChannelDefault);
    }

    private final C22092hXp AkhnZx() {
        java.lang.Object value = this.values.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22092hXp) value;
    }

    public static final C22092hXp uzCIH(C22117hYn c22117hYn) {
        return (C22092hXp) c22117hYn.findViewById(C23274hvD.Application.getNumericShortcut);
    }

    public static final AppCompatTextView fARcdN(C22117hYn c22117hYn) {
        return (AppCompatTextView) c22117hYn.findViewById(C23274hvD.Application.removeAllTabs);
    }

    private final AppCompatTextView valueOf() {
        java.lang.Object value = this.valueOf.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final android.view.View fIwbmz(C22117hYn c22117hYn) {
        return c22117hYn.findViewById(C23274hvD.Application.MediaSessionCompatCallback);
    }

    private final android.view.View isConnected() {
        java.lang.Object value = this.djBIcL.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.view.View) value;
    }

    public static final android.view.View AuCTel(C22117hYn c22117hYn) {
        return c22117hYn.findViewById(C23274hvD.Application.onCommand);
    }

    private final android.view.View fetchVPNInfo() {
        java.lang.Object value = this.gEmmrt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.view.View) value;
    }

    public static final C24331ibn iwGUEr(C22117hYn c22117hYn) {
        return (C24331ibn) c22117hYn.findViewById(C23274hvD.Application.dispatchGenericMotionEvent);
    }

    private final C24331ibn values() {
        java.lang.Object value = this.DbNXlk.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C24331ibn) value;
    }

    private final C22073hWx copydefault() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22073hWx) value;
    }

    public static final C22073hWx isConnected(C22117hYn c22117hYn) {
        return (C22073hWx) c22117hYn.findViewById(C23274hvD.Application.putInt);
    }

    public static /* synthetic */ void showOrHideDecView$default(C22117hYn c22117hYn, java.lang.String str, boolean z, boolean z2, java.lang.String str2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z3 = true;
        }
        c22117hYn.EZpvd(str, z, z2, str2, z3);
    }

    public final void EZpvd(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull java.lang.String str2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C22822hmc.EZpvd(str2) || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "100") || ((!z && str.length() == 0) || !z3)) {
            values().setVisibility(8);
        } else {
            values().EZpvd(str, z, z2, str2, true);
            copydefault(this.EZpvd, str2);
        }
    }

    public final void copydefault(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = 8;
        if (C22822hmc.EZpvd(str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "100")) {
            if (values().getVisibility() == 0) {
                values().setVisibility(8);
            }
        } else {
            C24331ibn c24331ibnValues = values();
            if (z && this.EZpvd) {
                i = 0;
            }
            c24331ibnValues.setVisibility(i);
        }
    }

    public final void OLrzqt() {
        values().setVisibility(8);
    }

    public final void KWHzl(boolean z) {
        int i;
        hXF hxfAEQbTJ = AEQbTJ();
        if (z) {
            i = 0;
            fetchVPNInfo().setVisibility(0);
        } else {
            i = 8;
            fetchVPNInfo().setVisibility(8);
        }
        hxfAEQbTJ.setVisibility(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hYn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setProgress$default(C22117hYn c22117hYn, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pair = null;
        }
        c22117hYn.setProgress(pair);
    }

    public final void setProgress(kotlin.Pair<java.lang.Long, java.lang.Long> pair) {
        AEQbTJ().setProgress(pair);
    }

    public final void AEQbTJ(boolean z) {
        AYXKKw().setVisibility(z ? 0 : 8);
    }

    public final void AEQbTJ(@NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        OLrzqt(this.EZpvd);
        KWHzl(this.EZpvd);
        C25352ivB.setOnDoubleCheckClickListener$default(AYXKKw(), 0L, new Function1() { // from class: o.hYm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22117hYn.AEQbTJ(this.EZpvd, function1, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(C22117hYn c22117hYn, Function1 function1, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        boolean z = !c22117hYn.EZpvd;
        c22117hYn.EZpvd = z;
        c22117hYn.KWHzl(z);
        c22117hYn.OLrzqt(c22117hYn.EZpvd);
        function1.invoke(java.lang.Boolean.valueOf(c22117hYn.EZpvd));
        return Unit.INSTANCE;
    }

    private final void OLrzqt(boolean z) {
        if (z) {
            AYXKKw().setImageResource(C52761wXj.TaskDescription.DlABUU);
        } else {
            AYXKKw().setImageResource(C52761wXj.TaskDescription.DcMfJKsuEgdN);
        }
    }

    public final void AEQbTJ(int i) {
        isConnected().setVisibility(i);
    }

    public final void setOrderSideMessage(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        gEmmrt().setText(str);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25386ivj.loadImageWithBorder$default(djBIcL(), str, null, 2, null);
    }

    public final AppCompatImageView KWHzl() {
        return AhwBna();
    }

    public final void EZpvd(boolean z) {
        AhwBna().setVisibility(z ? 0 : 8);
    }

    public final void copydefault(boolean z) {
        gEmmrt().setVisibility(z ? 0 : 8);
    }

    public final void setSideOrderAlpha(float f) {
        gEmmrt().setAlpha(f);
    }

    public final void setCoinIconAlpha(float f) {
        djBIcL().setAlpha(f);
    }

    public final void setChainViewTextColor(int i) {
        valueOf().setTextColor(i);
    }

    public final void setFinalOrderState(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AkhnZx().setFinalOrderState(str);
    }

    public final void setValue(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AkhnZx().setValue(str, str2);
    }

    public final void setValueColor(int i) {
        AkhnZx().setValueColor(i);
    }

    public final void setChainName(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        valueOf().setText(str);
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C25352ivB.setErrorCodeMsgView$default(copydefault(), dexMultiChildOrderInfoVo, function2, false, 4, null);
    }

    public final void setAccelerateViewSize(int i) {
        values().EZpvd().setAccelerateSize(i);
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        values().copydefault(fragmentManager, walletTxDetailBean, yho);
    }

    public static /* synthetic */ void updateAccelerateState$default(C22117hYn c22117hYn, AccelerateBean accelerateBean, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        c22117hYn.EZpvd(accelerateBean, str, z, str2);
    }

    public final void EZpvd(@NotNull AccelerateBean accelerateBean, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(accelerateBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        values().EZpvd().copydefault(accelerateBean, str, z, str2);
    }
}
