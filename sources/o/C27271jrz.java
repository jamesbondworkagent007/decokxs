package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.invest_biz.ui.widget.InvestUniv3CurrentPriceViewMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27271jrz extends ConstraintLayout {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public InterfaceC27126jpM EZpvd;
    public InvestUniv3CurrentPriceViewMode OLrzqt;

    /* JADX INFO: renamed from: o.jrz$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestUniv3CurrentPriceViewMode.values().length];
            try {
                iArr[InvestUniv3CurrentPriceViewMode.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InvestUniv3CurrentPriceViewMode.V2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27271jrz(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27271jrz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.jrz.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27271jrz(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27271jrz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = InvestUniv3CurrentPriceViewMode.DEFAULT;
        copydefault();
    }

    /* JADX INFO: renamed from: o.jrz$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jrz.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final InterfaceC27126jpM AEQbTJ() {
        return EZpvd();
    }

    private final InterfaceC27126jpM EZpvd() {
        InterfaceC27126jpM c27129jpP;
        if (this.EZpvd == null) {
            int i = TaskDescription.AEQbTJ[this.OLrzqt.ordinal()];
            if (i == 1) {
                iMV imvAEQbTJ = iMV.AEQbTJ(android.view.LayoutInflater.from(getContext()), this);
                Intrinsics.checkNotNullExpressionValue(imvAEQbTJ, "");
                c27129jpP = new C27129jpP(imvAEQbTJ);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iMX imxOLrzqt = iMX.OLrzqt(android.view.LayoutInflater.from(getContext()), this);
                Intrinsics.checkNotNullExpressionValue(imxOLrzqt, "");
                c27129jpP = new C27273jsA(imxOLrzqt);
            }
            this.EZpvd = c27129jpP;
        }
        InterfaceC27126jpM interfaceC27126jpM = this.EZpvd;
        Intrinsics.copydefault(interfaceC27126jpM);
        return interfaceC27126jpM;
    }

    private final void copydefault() {
        removeAllViews();
        EZpvd();
        AEQbTJ().copydefault().setText(getContext().getString(C25493ixk.FragmentManager.sCB));
    }

    public final void setData(@NotNull C23955iPn c23955iPn) {
        Intrinsics.checkNotNullParameter(c23955iPn, "");
        InterfaceC27126jpM interfaceC27126jpMAEQbTJ = AEQbTJ();
        interfaceC27126jpMAEQbTJ.copydefault().setText(getContext().getString(C25493ixk.FragmentManager.sCB));
        if (c23955iPn.AYXKKw()) {
            interfaceC27126jpMAEQbTJ.EZpvd().setText("0");
        } else if (c23955iPn.KWHzl()) {
            interfaceC27126jpMAEQbTJ.EZpvd().setText("--");
        } else {
            java.lang.String str = this.OLrzqt == InvestUniv3CurrentPriceViewMode.V2 ? " = " : " ≈ ";
            interfaceC27126jpMAEQbTJ.EZpvd().setText("1 " + c23955iPn.AEQbTJ() + str + C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, c23955iPn.EZpvd(), 6, 2, false, false, 24, null) + " " + c23955iPn.OLrzqt());
        }
        EZpvd(c23955iPn.copydefault());
    }

    public static /* synthetic */ void setCurrentPriceText$default(C27271jrz c27271jrz, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        c27271jrz.setCurrentPriceText(str, i);
    }

    public final void setCurrentPriceText(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().EZpvd().setText(str);
        EZpvd(i);
    }

    public final void EZpvd(int i) {
        InterfaceC27126jpM interfaceC27126jpMAEQbTJ = AEQbTJ();
        if (i == 1) {
            interfaceC27126jpMAEQbTJ.copydefault().setTextSize(16.0f);
            interfaceC27126jpMAEQbTJ.EZpvd().setTextSize(16.0f);
            TextViewCompat.setTextAppearance(interfaceC27126jpMAEQbTJ.EZpvd(), C32113mPz.Dialog.QOLQEE);
        } else {
            if (i != 2) {
                return;
            }
            interfaceC27126jpMAEQbTJ.copydefault().setTextSize(15.0f);
            interfaceC27126jpMAEQbTJ.EZpvd().setTextSize(15.0f);
            TextViewCompat.setTextAppearance(interfaceC27126jpMAEQbTJ.EZpvd(), C32113mPz.Dialog.AwvSrB);
        }
    }

    public final void KWHzl(@NotNull InvestUniv3CurrentPriceViewMode investUniv3CurrentPriceViewMode) {
        Intrinsics.checkNotNullParameter(investUniv3CurrentPriceViewMode, "");
        if (this.OLrzqt != investUniv3CurrentPriceViewMode) {
            this.OLrzqt = investUniv3CurrentPriceViewMode;
            this.EZpvd = null;
            copydefault();
        }
    }
}
