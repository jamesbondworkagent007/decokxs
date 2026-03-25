package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hXq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22093hXq extends LinearLayoutCompat {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22093hXq(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22093hXq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.hXq.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C22093hXq(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22093hXq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hXu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22093hXq.djBIcL(this.KWHzl);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hXv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22093hXq.copydefault(this.OLrzqt);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hXx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22093hXq.AEQbTJ(this.AEQbTJ);
            }
        });
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.OqCbbx, (android.view.ViewGroup) this, true);
        setOrientation(0);
        setGravity(16);
    }

    private final C52794wYp KWHzl() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C52794wYp) value;
    }

    public static final C52794wYp djBIcL(C22093hXq c22093hXq) {
        return (C52794wYp) c22093hXq.findViewById(C23274hvD.Application.R);
    }

    private final C52794wYp copydefault() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C52794wYp) value;
    }

    public static final C52794wYp copydefault(C22093hXq c22093hXq) {
        return (C52794wYp) c22093hXq.findViewById(C23274hvD.Application.onViewAttachedToWindow);
    }

    public static final C52794wYp AEQbTJ(C22093hXq c22093hXq) {
        return (C52794wYp) c22093hXq.findViewById(C23274hvD.Application.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0);
    }

    private final C52794wYp OLrzqt() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C52794wYp) value;
    }

    public final void EZpvd(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final java.lang.String str, final long j, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C25352ivB.setOnDoubleCheckClickListener$default(KWHzl(), 0L, new Function1() { // from class: o.hXt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22093hXq.KWHzl(fragmentManager, this, str, j, str2, str3, yho, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(androidx.fragment.app.FragmentManager fragmentManager, C22093hXq c22093hXq, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, yHO yho, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class)).AEQbTJ(fragmentManager, c22093hXq.KWHzl(str, j, str2, str3), yho);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final java.lang.String str, final long j, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C25352ivB.setOnDoubleCheckClickListener$default(copydefault(), 0L, new Function1() { // from class: o.hXw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22093hXq.AhwBna(fragmentManager, this, str, j, str2, str3, yho, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit AhwBna(androidx.fragment.app.FragmentManager fragmentManager, C22093hXq c22093hXq, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, yHO yho, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class)).copydefault(fragmentManager, c22093hXq.KWHzl(str, j, str2, str3), (yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit>) yho);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final java.lang.String str, final long j, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C25352ivB.setOnDoubleCheckClickListener$default(OLrzqt(), 0L, new Function1() { // from class: o.hXC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22093hXq.copydefault(fragmentManager, this, str, j, str2, str3, yho, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(androidx.fragment.app.FragmentManager fragmentManager, C22093hXq c22093hXq, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, yHO yho, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class)).KWHzl(fragmentManager, c22093hXq.KWHzl(str, j, str2, str3), yho);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull OrderDetailBean orderDetailBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        DexMultiChildOrderInfoVo fromChildOrderDetailVo = orderDetailBean.getFromChildOrderDetailVo();
        if (fromChildOrderDetailVo != null) {
            boolean z = true;
            AccelerateBean accelerateBean = new AccelerateBean(fromChildOrderDetailVo.isShowSpeedUp(), fromChildOrderDetailVo.isShowCancel(), fromChildOrderDetailVo.isShowSpeedUpCancel(), (java.lang.String) null, !C22420hey.OLrzqt(orderDetailBean.getSwapTradeType()), 8, (DefaultConstructorMarker) null);
            InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(str).fARcdN().valueOf();
            if (interfaceC9738bbJValueOf != null && !interfaceC9738bbJValueOf.QfsBiF() && interfaceC9738bbJValueOf != null && !interfaceC9738bbJValueOf.zsXlph()) {
                z = false;
            }
            if (accelerateBean.isNeedDismiss() || C22822hmc.EZpvd(fromChildOrderDetailVo.getStatus()) || z || accelerateBean.isNotSingleSwap()) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            KWHzl().setVisibility(accelerateBean.isShowCancel() ? 0 : 8);
            copydefault().setVisibility(accelerateBean.isShowSpeedUp() ? 0 : 8);
            OLrzqt().setVisibility(accelerateBean.isShowSpeedUpCancel() ? 0 : 8);
        }
    }

    public final WalletTxDetailBean KWHzl(java.lang.String str, long j, java.lang.String str2, java.lang.String str3) {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(str).fARcdN().valueOf();
        return new WalletTxDetailBean("", str3, str2, j, interfaceC9738bbJValueOf != null ? interfaceC9738bbJValueOf.DbNXlk() : null, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
    }
}
