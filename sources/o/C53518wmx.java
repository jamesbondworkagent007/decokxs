package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import o.InterfaceC49496upe;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wmx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53518wmx extends C52794wYp {
    public boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public boolean AhwBna;
    public int EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53518wmx(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53518wmx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoginCheck(boolean z, java.lang.String str) {
        this.AhwBna = z;
        if (str != null) {
            this.valueOf = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeLevelCheck(boolean z, java.lang.String str, java.lang.String str2) {
        this.AEQbTJ = z;
        if (str != null) {
            this.djBIcL = str;
        }
        if (str2 != null) {
            this.gEmmrt = str2;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.wmx.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53518wmx(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53518wmx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0);
        this.AhwBna = true;
        this.valueOf = C33070mpX.AYXKKw(C55688xof.Application.access001);
        this.AEQbTJ = true;
        this.gEmmrt = C33070mpX.AYXKKw(C55688xof.Application.init);
        this.djBIcL = "2";
        this.copydefault = "";
        this.EZpvd = 259;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wmA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53518wmx.EZpvd();
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wmE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53518wmx.copydefault(this.OLrzqt);
            }
        });
        setOKDSSize(52);
        setOKDSType(257);
        setOKDSPill(-1);
        setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
        marginLayoutParams.bottomMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        setLayoutParams(marginLayoutParams);
        OLrzqt();
        setContentDescription("BotOrderOKButton");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xLY EZpvd() {
        return new xLY(BizInfoConfig.DefaultBizConfig.copydefault);
    }

    private final xLY iwGUEr() {
        return (xLY) this.KWHzl.getValue();
    }

    private final C55887xsS getFieldNames() {
        return (C55887xsS) this.OLrzqt.getValue();
    }

    public static final C55887xsS copydefault(C53518wmx c53518wmx) {
        return new C55887xsS(c53518wmx.iwGUEr().copydefault(), c53518wmx.iwGUEr().KWHzl());
    }

    @Override // o.C52794wYp, android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, TextView.BufferType bufferType) {
        java.lang.String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        this.copydefault = string;
        super.setText(hDKMBd(), bufferType);
    }

    @Override // android.view.View
    public void setOnClickListener(final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() { // from class: o.wmw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53518wmx.setOnClickListener$lambda$3(this.KWHzl, onClickListener, view);
            }
        });
    }

    public static final void setOnClickListener$lambda$3(C53518wmx c53518wmx, View.OnClickListener onClickListener, android.view.View view) {
        if (c53518wmx.KWHzl()) {
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
            if (interfaceC8104awT != null) {
                android.content.Context context = c53518wmx.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
                return;
            }
            return;
        }
        if (!c53518wmx.copydefault()) {
            if (onClickListener != null) {
                onClickListener.onClick(c53518wmx);
            }
        } else {
            InterfaceC49496upe interfaceC49496upeCopydefault = C53685wqE.copydefault.copydefault();
            android.content.Context context2 = c53518wmx.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            InterfaceC49496upe.Application.startAccountModeActivity$default(interfaceC49496upeCopydefault, context2, c53518wmx.djBIcL, null, 4, null);
        }
    }

    private final java.lang.String hDKMBd() {
        if (KWHzl()) {
            return this.valueOf;
        }
        if (copydefault()) {
            return this.gEmmrt;
        }
        java.lang.String str = this.copydefault;
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? this.AYXKKw : str;
    }

    public static /* synthetic */ void setLoginCheck$default(C53518wmx c53518wmx, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        c53518wmx.setLoginCheck(z, str);
    }

    public static /* synthetic */ void setTradeLevelCheck$default(C53518wmx c53518wmx, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        c53518wmx.setTradeLevelCheck(z, str, str2);
    }

    public final void setButtonType(int i) {
        this.EZpvd = i;
        if (KWHzl() || copydefault()) {
            return;
        }
        setOKDSType(i);
    }

    /* JADX DEBUG: Possible override for method o.wYp.OLrzqt()I */
    public final void OLrzqt() {
        setText(this.copydefault);
        setButtonType(this.EZpvd);
    }

    /* JADX DEBUG: Possible override for method o.wYp.KWHzl()Landroid/graphics/Rect; */
    public final boolean KWHzl() {
        return this.AhwBna && !C55697xoo.OLrzqt.isConnected();
    }

    public final boolean copydefault() {
        AbstractC54531xLw abstractC54531xLwAEQbTJ;
        return (!this.AEQbTJ || (abstractC54531xLwAEQbTJ = getFieldNames().AEQbTJ()) == null || abstractC54531xLwAEQbTJ.getFieldNames()) ? false : true;
    }
}
