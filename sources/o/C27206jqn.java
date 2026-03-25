package o;

import android.view.View;
import com.okinc.business.invest_biz.data.bean.DisplayText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27206jqn extends android.widget.LinearLayout {
    public java.lang.String AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public java.lang.String EZpvd;
    public InterfaceC27309jsk KWHzl;
    public int OLrzqt;
    public java.lang.String copydefault;
    public int gEmmrt;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27206jqn(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27206jqn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:33) call: o.jqn.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27206jqn(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27206jqn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = true;
        this.AhwBna = true;
        AEQbTJ();
    }

    private final InterfaceC27309jsk OLrzqt() {
        InterfaceC27309jsk c27319jsu;
        if (this.KWHzl == null) {
            if (this.valueOf) {
                C23755iIc c23755iIcOLrzqt = C23755iIc.OLrzqt(android.view.LayoutInflater.from(getContext()), this, false);
                Intrinsics.checkNotNullExpressionValue(c23755iIcOLrzqt, "");
                c27319jsu = new C27322jsx(c23755iIcOLrzqt);
            } else {
                iHY ihyCopydefault = iHY.copydefault(android.view.LayoutInflater.from(getContext()), this, false);
                Intrinsics.checkNotNullExpressionValue(ihyCopydefault, "");
                c27319jsu = new C27319jsu(ihyCopydefault);
            }
            this.KWHzl = c27319jsu;
        }
        InterfaceC27309jsk interfaceC27309jsk = this.KWHzl;
        Intrinsics.copydefault(interfaceC27309jsk);
        return interfaceC27309jsk;
    }

    public final void AEQbTJ(boolean z) {
        if (this.valueOf != z) {
            this.valueOf = z;
            this.KWHzl = null;
            AEQbTJ();
        }
    }

    public final void AEQbTJ() {
        removeAllViews();
        addView(OLrzqt().copydefault());
        setOrientation(1);
    }

    public final void setNetworkVisible(int i) {
        OLrzqt().AEQbTJ().setVisibility(i);
        this.OLrzqt = i;
    }

    public final void setNetworkText(java.lang.String str) {
        OLrzqt().djBIcL().setText(str);
        this.AEQbTJ = str;
    }

    public final void setNetworkLogo(java.lang.String str) {
        this.copydefault = str;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        C27569jxf.loadCircleWithBorder$default(c27569jxf, OLrzqt().EZpvd(), str, c27569jxf.AEQbTJ(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
    }

    public final void setSlippageVisible(int i) {
        OLrzqt().OLrzqt().setVisibility(i);
        this.gEmmrt = i;
    }

    public final void setSlippageText(java.lang.String str) {
        OLrzqt().KWHzl().setText(str);
        setArrowDrawable(OLrzqt().KWHzl(), this.AhwBna);
        this.EZpvd = str;
    }

    private final void OLrzqt(boolean z) {
        OLrzqt().KWHzl().setEnabled(z);
        setArrowDrawable(OLrzqt().KWHzl(), this.AhwBna);
    }

    public final void setSlippageClickListener(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C8003auW.copydefault(OLrzqt().KWHzl()).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.jqm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27206jqn.setSlippageClickListener$lambda$0(this.copydefault, function0, obj);
            }
        });
    }

    public static final void setSlippageClickListener$lambda$0(C27206jqn c27206jqn, Function0 function0, java.lang.Object obj) {
        if (c27206jqn.AhwBna) {
            function0.invoke();
        }
    }

    public final void AEQbTJ(int i, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, int i2, @NotNull java.lang.String str4, boolean z2, DisplayText displayText) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(str4, "");
        this.AYXKKw = bool != null ? bool.booleanValue() : true;
        switch (i) {
            case 0:
            case 4:
                setVisibility(8);
                break;
            case 1:
            case 3:
            case 5:
            case 6:
                setSlippageText("--");
                OLrzqt(false);
                break;
            case 2:
                if (z) {
                    setVisibility(0);
                    if (str == null || str.length() == 0) {
                        setNetworkVisible(8);
                    } else {
                        setNetworkVisible(0);
                        setNetworkText(str);
                        setNetworkLogo(str2);
                    }
                    if (str3 == null || str3.length() == 0) {
                        setSlippageVisible(8);
                        OLrzqt(false);
                    } else {
                        this.AhwBna = i2 != 2;
                        android.widget.TextView textViewKWHzl = OLrzqt().KWHzl();
                        if (z2) {
                            iCopydefault = C33070mpX.copydefault(C25493ixk.TaskDescription.valueOf);
                        } else {
                            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.DcMfJKsfEqpH);
                        }
                        textViewKWHzl.setTextColor(iCopydefault);
                        setSlippageVisible(0);
                        setSlippageText(str3);
                        OLrzqt(true);
                        if (str4.length() == 0) {
                            OLrzqt().valueOf().setVisibility(8);
                        } else {
                            OLrzqt().valueOf().setVisibility(0);
                            OLrzqt().valueOf().setText(str4);
                        }
                    }
                    if (displayText != null) {
                        InterfaceC27309jsk interfaceC27309jskOLrzqt = OLrzqt();
                        C27569jxf.OLrzqt.KWHzl(interfaceC27309jskOLrzqt.AYXKKw(), C52761wXj.TaskDescription.GGlJim);
                        android.widget.TextView textViewAYXKKw = interfaceC27309jskOLrzqt.AYXKKw();
                        textViewAYXKKw.setOnClickListener(new Application(textViewAYXKKw, 1000L, this, interfaceC27309jskOLrzqt, displayText));
                    }
                } else {
                    setVisibility(8);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: o.jqn$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ DisplayText EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C27206jqn OLrzqt;
        public final /* synthetic */ InterfaceC27309jsk copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C27206jqn c27206jqn, InterfaceC27309jsk interfaceC27309jsk, DisplayText displayText) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c27206jqn;
            this.copydefault = interfaceC27309jsk;
            this.EZpvd = displayText;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(this.copydefault.AYXKKw().getText());
                DisplayText displayText = this.EZpvd;
                android.content.Context context2 = viewOnClickListenerC54939xaY.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                viewOnClickListenerC54939xaY.EZpvd(displayText.getString(context2));
                java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C25493ixk.FragmentManager.OHqIaq);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new Activity(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.jqn$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
        }
    }

    public final void setArrowDrawable(android.widget.TextView textView, boolean z) {
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        int i = C52761wXj.TaskDescription.DGOPHZDGOPHZ;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(20.0f, context);
        int currentTextColor = textView.getCurrentTextColor();
        android.content.Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c27569jxf.copydefault(textView, i, iCopydefault, z, java.lang.Integer.valueOf(currentTextColor), C55298xhM.copydefault(8.0f, context2));
    }
}
