package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27197jqe extends ConstraintLayout {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public InterfaceC27122jpI AEQbTJ;
    public boolean AYXKKw;
    public View.OnClickListener KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public TaskDescription djBIcL;
    public Activity gEmmrt;

    /* JADX INFO: renamed from: o.jqe$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public interface Activity {
        void OLrzqt();
    }

    /* JADX INFO: renamed from: o.jqe$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public interface TaskDescription {
        void EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27197jqe(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27197jqe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.KWHzl = onClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedFundTips(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTipClickCallback(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.djBIcL = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnWarningTipClickCallback(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.gEmmrt = activity;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:33) call: o.jqe.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27197jqe(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27197jqe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = true;
        copydefault();
    }

    private final InterfaceC27122jpI OLrzqt() {
        InterfaceC27122jpI c27318jst;
        if (this.AEQbTJ == null) {
            if (this.copydefault) {
                iLZ ilzCopydefault = iLZ.copydefault(android.view.LayoutInflater.from(getContext()), this, false);
                Intrinsics.checkNotNullExpressionValue(ilzCopydefault, "");
                c27318jst = new C27317jss(ilzCopydefault);
            } else {
                C23866iMf c23866iMfCopydefault = C23866iMf.copydefault(android.view.LayoutInflater.from(getContext()), this, false);
                Intrinsics.checkNotNullExpressionValue(c23866iMfCopydefault, "");
                c27318jst = new C27318jst(c23866iMfCopydefault);
            }
            this.AEQbTJ = c27318jst;
        }
        InterfaceC27122jpI interfaceC27122jpI = this.AEQbTJ;
        Intrinsics.copydefault(interfaceC27122jpI);
        return interfaceC27122jpI;
    }

    /* JADX INFO: renamed from: o.jqe$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jqe.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final void copydefault() {
        removeAllViews();
        addView(OLrzqt().EZpvd());
        OLrzqt().OLrzqt().setOnClickListener(new View.OnClickListener() { // from class: o.jqf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27197jqe.AEQbTJ(this.copydefault, view);
            }
        });
        OLrzqt().AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.jqd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27197jqe.EZpvd(this.KWHzl, view);
            }
        });
        OLrzqt().copydefault().setOnClickListener(new View.OnClickListener() { // from class: o.jqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27197jqe.djBIcL(this.KWHzl, view);
            }
        });
    }

    public static final void AEQbTJ(C27197jqe c27197jqe, android.view.View view) {
        View.OnClickListener onClickListener = c27197jqe.KWHzl;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static final void EZpvd(C27197jqe c27197jqe, android.view.View view) {
        TaskDescription taskDescription = c27197jqe.djBIcL;
        if (taskDescription != null) {
            taskDescription.EZpvd();
        }
    }

    public static final void djBIcL(C27197jqe c27197jqe, android.view.View view) {
        Activity activity = c27197jqe.gEmmrt;
        if (activity != null) {
            activity.OLrzqt();
        }
    }

    public final void setUseNewLayout(boolean z) {
        if (this.copydefault != z) {
            this.copydefault = z;
            this.AEQbTJ = null;
            copydefault();
        }
    }

    public final void setData(@NotNull C25481ixY c25481ixY) {
        Intrinsics.checkNotNullParameter(c25481ixY, "");
        InterfaceC27122jpI interfaceC27122jpIOLrzqt = OLrzqt();
        interfaceC27122jpIOLrzqt.gEmmrt().setVisibility(c25481ixY.EZpvd() ? 0 : 8);
        OLrzqt().AYXKKw().setVisibility(c25481ixY.EZpvd() ^ true ? 0 : 8);
        OLrzqt().OLrzqt().setVisibility((!this.AYXKKw || c25481ixY.EZpvd()) ? 8 : 0);
        if (!c25481ixY.EZpvd()) {
            OLrzqt().AYXKKw().setVisibility(0);
            OLrzqt().gEmmrt().setVisibility(8);
            OLrzqt().KWHzl().setText(C27492jwH.limitFmtNoZeroWithKMBMoreThanMillion$default(C27492jwH.OLrzqt, c25481ixY.OLrzqt(), 6, 2, false, false, 24, null));
            OLrzqt().AhwBna().setText("");
            if (this.OLrzqt) {
                OLrzqt().OLrzqt().setVisibility(0);
                if (c25481ixY.valueOf()) {
                    if (C33129mqd.OLrzqt((java.lang.Object) c25481ixY.OLrzqt(), (java.lang.Object) 0)) {
                        if (!c25481ixY.AYXKKw()) {
                            OLrzqt().OLrzqt().setTag(3);
                            OLrzqt().OLrzqt().setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.cBPFI));
                        } else {
                            OLrzqt().OLrzqt().setVisibility(8);
                        }
                    } else {
                        OLrzqt().OLrzqt().setTag(1);
                        OLrzqt().OLrzqt().setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF));
                    }
                } else if (C33129mqd.gEmmrt(c25481ixY.OLrzqt(), java.lang.Double.valueOf(1.0E-6d)) || c25481ixY.djBIcL()) {
                    OLrzqt().OLrzqt().setTag(2);
                    OLrzqt().OLrzqt().setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.hrjNmC));
                } else {
                    OLrzqt().OLrzqt().setTag(1);
                    OLrzqt().OLrzqt().setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF));
                }
            } else {
                OLrzqt().OLrzqt().setTag(1);
                OLrzqt().OLrzqt().setVisibility((this.AYXKKw && C33129mqd.AEQbTJ(C33129mqd.gEmmrt(c25481ixY.OLrzqt()), 0)) ? 0 : 8);
                OLrzqt().OLrzqt().setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF));
            }
            if (c25481ixY.copydefault() != null) {
                if (this.copydefault) {
                    interfaceC27122jpIOLrzqt.AEQbTJ().setVisibility(8);
                    interfaceC27122jpIOLrzqt.KWHzl().setVisibility(8);
                    interfaceC27122jpIOLrzqt.AhwBna().setVisibility(8);
                    interfaceC27122jpIOLrzqt.djBIcL().setTextValue(((java.lang.Object) interfaceC27122jpIOLrzqt.djBIcL().AkhnZx()) + " " + ((java.lang.Object) interfaceC27122jpIOLrzqt.KWHzl().getText()) + " " + ((java.lang.Object) interfaceC27122jpIOLrzqt.AhwBna().getText()));
                    interfaceC27122jpIOLrzqt.djBIcL().setHelperLabelType(2);
                }
                interfaceC27122jpIOLrzqt.AEQbTJ().setVisibility((this.copydefault || c25481ixY.copydefault().getClickAction().equals(InvestClickActionType.NO_ACTION)) ? 8 : 0);
                if (!this.copydefault) {
                    C27569jxf c27569jxf = C27569jxf.OLrzqt;
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    c27569jxf.AEQbTJ(context, null, interfaceC27122jpIOLrzqt.AEQbTJ(), c25481ixY.copydefault(), (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
                }
            }
            int iCopydefault = C33070mpX.copydefault(c25481ixY.gEmmrt() ? C52761wXj.Activity.DQzvGN : C52761wXj.Activity.QwvEab);
            interfaceC27122jpIOLrzqt.KWHzl().setTextColor(iCopydefault);
            interfaceC27122jpIOLrzqt.AhwBna().setTextColor(iCopydefault);
            interfaceC27122jpIOLrzqt.djBIcL().setTextColor(iCopydefault);
        }
        interfaceC27122jpIOLrzqt.copydefault().setVisibility(c25481ixY.AhwBna() ? 0 : 8);
        if (this.copydefault) {
            interfaceC27122jpIOLrzqt.OLrzqt().setVisibility(this.AYXKKw ? 0 : 8);
            interfaceC27122jpIOLrzqt.OLrzqt().setText("");
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(interfaceC27122jpIOLrzqt.OLrzqt().getContext(), C25493ixk.StateListAnimator.KWHzl);
            if (drawable != null) {
                drawable.setBounds(0, 0, C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null));
            } else {
                drawable = null;
            }
            interfaceC27122jpIOLrzqt.OLrzqt().setTag((!c25481ixY.valueOf() || c25481ixY.AYXKKw()) ? 2 : 3);
            interfaceC27122jpIOLrzqt.OLrzqt().setCompoundDrawablesRelative(drawable, null, null, null);
            android.widget.TextView textViewOLrzqt = interfaceC27122jpIOLrzqt.OLrzqt();
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            textViewOLrzqt.setCompoundDrawablePadding(C55298xhM.copydefault(2.0f, context2));
        }
    }

    public final void setTitleText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt().djBIcL().setText(str);
    }

    public final void setMaxViewVisible(boolean z) {
        this.AYXKKw = z;
        OLrzqt().OLrzqt().setVisibility(this.AYXKKw ? 0 : 8);
    }
}
