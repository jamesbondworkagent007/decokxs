package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ibn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24331ibn extends android.widget.FrameLayout {
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24331ibn(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24331ibn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.ibn.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C24331ibn(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24331ibn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ibl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24331ibn.KWHzl(this.OLrzqt);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ibo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24331ibn.djBIcL(this.AEQbTJ);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ibp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24331ibn.EZpvd(this.AEQbTJ);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.DzOuPm, (android.view.ViewGroup) this, true);
    }

    private final AppCompatTextView KWHzl() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView KWHzl(C24331ibn c24331ibn) {
        return (AppCompatTextView) c24331ibn.findViewById(C23274hvD.Application.select);
    }

    private final C24328ibk OLrzqt() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C24328ibk) value;
    }

    public static final C24328ibk djBIcL(C24331ibn c24331ibn) {
        return (C24328ibk) c24331ibn.findViewById(C23274hvD.Application.SupportMenuInflaterInflatedOnMenuItemClickListener);
    }

    public static final ConstraintLayout EZpvd(C24331ibn c24331ibn) {
        return (ConstraintLayout) c24331ibn.findViewById(C23274hvD.Application.gsvlRV);
    }

    private final ConstraintLayout copydefault() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (ConstraintLayout) value;
    }

    public static /* synthetic */ void setTimeOutDec$default(C24331ibn c24331ibn, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c24331ibn.setTimeOutDec(str);
    }

    public final void setTimeOutDec(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl().setText(str);
        setDecBackgroundStyle();
    }

    public final C24328ibk EZpvd() {
        return OLrzqt();
    }

    private final void OLrzqt(boolean z) {
        if (z) {
            setDecBackgroundStyle();
        } else {
            setAccelerateBackgroundStyle();
        }
    }

    public final void setOnlyShowDecView(boolean z) {
        if (z) {
            OLrzqt().setVisibility(8);
            OLrzqt(true);
        } else {
            setVisibility(8);
        }
    }

    public static /* synthetic */ void showOrHideDecView$default(C24331ibn c24331ibn, java.lang.String str, boolean z, boolean z2, java.lang.String str2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z3 = true;
        }
        c24331ibn.EZpvd(str, z, z2, str2, z3);
    }

    public final void EZpvd(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull java.lang.String str2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C22822hmc.EZpvd(str2) || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "100") || !z3 || C22822hmc.AEQbTJ(str2)) {
            setVisibility(8);
            return;
        }
        if (z2) {
            setVisibility(0);
            setDecBackgroundStyle();
            KWHzl().setText(str);
        } else {
            if (z) {
                setVisibility(0);
                if (str.length() > 0) {
                    setDecBackgroundStyle();
                    return;
                } else {
                    setAccelerateBackgroundStyle();
                    return;
                }
            }
            if (str.length() == 0) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            EZpvd().setVisibility(8);
            setDecBackgroundStyle();
            KWHzl().setText(str);
        }
    }

    public final void setAccelerateBackgroundStyle() {
        copydefault().setPaddingRelative(0, 0, 0, 0);
        copydefault().setBackground(null);
        KWHzl().setVisibility(8);
    }

    public final void setDecBackgroundStyle() {
        ConstraintLayout constraintLayoutCopydefault = copydefault();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(8.0f, context);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iCopydefault2 = C55298xhM.copydefault(8.0f, context2);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iCopydefault3 = C55298xhM.copydefault(8.0f, context3);
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        constraintLayoutCopydefault.setPaddingRelative(iCopydefault, iCopydefault2, iCopydefault3, C55298xhM.copydefault(8.0f, context4));
        copydefault().setBackground(ContextCompat.getDrawable(getContext(), C23274hvD.ActionBar.fIwbmz));
        KWHzl().setVisibility(0);
    }

    public final void setAccelerateSize(int i) {
        OLrzqt().setAccelerateSize(i);
    }

    public static /* synthetic */ void updateAccelerateState$default(C24331ibn c24331ibn, AccelerateBean accelerateBean, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        c24331ibn.OLrzqt(accelerateBean, str, z, str2);
    }

    public final void OLrzqt(@NotNull AccelerateBean accelerateBean, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(accelerateBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt().copydefault(accelerateBean, str, z, str2);
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        C24328ibk.startSpeedUpTx$default(OLrzqt(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
        C24328ibk.startCancelTx$default(OLrzqt(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
        C24328ibk.startSpeedUpCancelTx$default(OLrzqt(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
    }
}
