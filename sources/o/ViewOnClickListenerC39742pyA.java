package o;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.VectorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.library.drawline.DrawLineData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pyA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewOnClickListenerC39742pyA extends android.widget.FrameLayout implements View.OnClickListener {
    public java.util.ArrayList<oLO> AEQbTJ;
    public oPO AYXKKw;
    public float AhwBna;
    public C39591pvI AkhnZx;
    public C39593pvK DbNXlk;
    public int EZpvd;
    public InterfaceC35982oKx KWHzl;
    public int OLrzqt;
    public int copydefault;
    public float djBIcL;
    public C39587pvE fetchVPNInfo;
    public int gEmmrt;
    public int isConnected;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC39742pyA(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setClickListener(@NotNull InterfaceC35982oKx interfaceC35982oKx) {
        Intrinsics.checkNotNullParameter(interfaceC35982oKx, "");
        this.KWHzl = interfaceC35982oKx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawToolBottomMargin(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawToolTopMargin(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightToolMargin(int i) {
        this.isConnected = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:45) call: o.pyA.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ ViewOnClickListenerC39742pyA(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC39742pyA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = (oPO) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C35964oKf.Application.RqmePg, this, true);
        this.AEQbTJ = new java.util.ArrayList<>();
        this.copydefault = C55298xhM.copydefault(20.0f, context);
        this.isConnected = C55298xhM.copydefault(48.0f, context);
        this.valueOf = C55298xhM.copydefault(10.0f, context);
        this.gEmmrt = C36246oUr.copydefault().zuWLRA();
        this.EZpvd = C55298xhM.copydefault(60.0f, context);
        this.OLrzqt = C55298xhM.copydefault(2.0f, context);
        this.AYXKKw.AhwBna.setOnClickListener(this);
        this.AYXKKw.AYXKKw.setOnClickListener(this);
        this.AYXKKw.djBIcL.setOnClickListener(this);
        this.AYXKKw.gEmmrt.setOnClickListener(this);
        this.AYXKKw.valueOf.setOnClickListener(this);
        this.AYXKKw.copydefault.setOnClickListener(this);
        this.AYXKKw.EZpvd.setOnClickListener(this);
        this.AEQbTJ = pDT.Companion.KWHzl().djBIcL();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (motionEvent.getX() <= this.copydefault) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                return true;
            }
            float fEZpvd = rawX - this.AhwBna;
            float fOLrzqt = rawY - this.djBIcL;
            if (getX() + fEZpvd < 0.0f) {
                fEZpvd = -getX();
            }
            float x = getX();
            C33566myq c33566myq = C33566myq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(getContext(), "");
            if (x + fEZpvd > (c33566myq.EZpvd(r6) - getWidth()) - this.isConnected) {
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                fEZpvd = ((c33566myq.EZpvd(r9) - getWidth()) - this.isConnected) - getX();
            }
            float y = getY() + fOLrzqt;
            float f = this.gEmmrt;
            if (y < f) {
                fOLrzqt = f - getY();
            }
            float y2 = getY();
            Intrinsics.checkNotNullExpressionValue(getContext(), "");
            if (y2 + fOLrzqt > (c33566myq.OLrzqt(r6) - getHeight()) - this.valueOf) {
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                fOLrzqt = ((c33566myq.OLrzqt(r3) - getHeight()) - this.valueOf) - getY();
            }
            AEQbTJ(fEZpvd, fOLrzqt);
        }
        this.AhwBna = rawX;
        this.djBIcL = rawY;
        return true;
    }

    public final void AEQbTJ(float f, float f2) {
        setTranslationX(getTranslationX() + f);
        setTranslationY(getTranslationY() + f2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C35964oKf.StateListAnimator.iMXFZQ;
        if (numValueOf != null && numValueOf.intValue() == i) {
            view.setSelected(true);
            AEQbTJ();
            return;
        }
        int i2 = C35964oKf.StateListAnimator.fastForward;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            view.setSelected(true);
            AhwBna();
            return;
        }
        int i3 = C35964oKf.StateListAnimator.OAjjVP;
        if (numValueOf != null && numValueOf.intValue() == i3) {
            view.setSelected(true);
            OLrzqt();
            return;
        }
        int i4 = C35964oKf.StateListAnimator.zlzhuY;
        if (numValueOf != null && numValueOf.intValue() == i4) {
            InterfaceC35982oKx interfaceC35982oKx = this.KWHzl;
            if (interfaceC35982oKx != null) {
                interfaceC35982oKx.EZpvd();
                return;
            }
            return;
        }
        int i5 = C35964oKf.StateListAnimator.hGuIrQ;
        if (numValueOf != null && numValueOf.intValue() == i5) {
            InterfaceC35982oKx interfaceC35982oKx2 = this.KWHzl;
            if (interfaceC35982oKx2 != null) {
                interfaceC35982oKx2.AYXKKw();
                return;
            }
            return;
        }
        int i6 = C35964oKf.StateListAnimator.GPCHlQ;
        if (numValueOf != null && numValueOf.intValue() == i6) {
            InterfaceC35982oKx interfaceC35982oKx3 = this.KWHzl;
            if (interfaceC35982oKx3 != null) {
                interfaceC35982oKx3.KWHzl();
                return;
            }
            return;
        }
        int i7 = C35964oKf.StateListAnimator.DsfknC;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            if (view != null) {
                view.setSelected(true);
            }
            EZpvd();
        }
    }

    public final void EZpvd() {
        android.widget.LinearLayout linearLayout = this.AYXKKw.valueOf;
        if (this.fetchVPNInfo == null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.fetchVPNInfo = new C39587pvE(context, this.AEQbTJ, new Function1() { // from class: o.pyG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39742pyA.gEmmrt(this.OLrzqt, (oLO) obj);
                }
            }, null, new Function1() { // from class: o.pyF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39742pyA.AhwBna(this.AEQbTJ, (oLO) obj);
                }
            }, 8, null);
        }
        float y = getY();
        C33566myq c33566myq = C33566myq.EZpvd;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        boolean z = y > ((float) (c33566myq.OLrzqt(context2) / 2));
        C39587pvE c39587pvE = this.fetchVPNInfo;
        if (c39587pvE != null) {
            pDT pdtKWHzl = pDT.Companion.KWHzl();
            DrawLineData drawLineData = DrawLineData.copydefault;
            java.lang.String strCopydefault = pdtKWHzl.copydefault(drawLineData.copydefault());
            if (strCopydefault == null) {
                strCopydefault = drawLineData.KWHzl();
            }
            C39587pvE.setSelectedColorAndPos$default(c39587pvE, strCopydefault, z, false, true, drawLineData.KWHzl(), 4, null);
        }
        if (z) {
            C39587pvE c39587pvE2 = this.fetchVPNInfo;
            if (c39587pvE2 != null) {
                c39587pvE2.showAtLocation(linearLayout, 3, C33129mqd.AhwBna(java.lang.Float.valueOf(linearLayout.getX())) + c39587pvE2.KWHzl(), c39587pvE2.OLrzqt() - C33129mqd.AhwBna(java.lang.Float.valueOf(linearLayout.getY())));
                return;
            }
            return;
        }
        C39587pvE c39587pvE3 = this.fetchVPNInfo;
        if (c39587pvE3 != null) {
            c39587pvE3.showAsDropDown(linearLayout, 0, z ? C33129mqd.AhwBna(java.lang.Integer.valueOf(-(linearLayout.getHeight() + this.EZpvd))) : this.OLrzqt, 3);
        }
    }

    public static final Unit gEmmrt(ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA, oLO olo) {
        Intrinsics.checkNotNullParameter(olo, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) olo.copydefault())) {
            SPUtils.put("draw_fill_color_blk", olo.copydefault());
        }
        java.lang.String strOLrzqt = Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_white") ? olo.OLrzqt() : olo.EZpvd();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
            java.lang.String strAEQbTJ = viewOnClickListenerC39742pyA.AEQbTJ(strOLrzqt, C33129mqd.djBIcL(C33129mqd.divS$default(java.lang.Integer.valueOf(olo.KWHzl()), 255, null, null, null, 14, null)));
            android.graphics.drawable.Drawable background = viewOnClickListenerC39742pyA.AYXKKw.isConnected.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setTint(Color.parseColor(strAEQbTJ));
            }
            SPUtils.put("draw_fill_color", strAEQbTJ);
            DrawLineData drawLineData = DrawLineData.copydefault;
            drawLineData.copydefault(strAEQbTJ);
            drawLineData.KWHzl(olo.copydefault());
            DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
            if (drawLineItemIsConnected != null) {
                drawLineItemIsConnected.setFillColor(strAEQbTJ);
            }
            DrawLineData.DrawLineItem drawLineItemIsConnected2 = drawLineData.isConnected();
            if (drawLineItemIsConnected2 != null) {
                drawLineItemIsConnected2.setFillColorBlk(olo.copydefault());
            }
        }
        InterfaceC35982oKx interfaceC35982oKx = viewOnClickListenerC39742pyA.KWHzl;
        if (interfaceC35982oKx != null) {
            interfaceC35982oKx.copydefault();
        }
        viewOnClickListenerC39742pyA.KWHzl();
        viewOnClickListenerC39742pyA.fetchVPNInfo = null;
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA, oLO olo) {
        Intrinsics.checkNotNullParameter(olo, "");
        java.lang.String strOLrzqt = Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_white") ? olo.OLrzqt() : olo.EZpvd();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
            java.lang.String strAEQbTJ = viewOnClickListenerC39742pyA.AEQbTJ(strOLrzqt, C33129mqd.djBIcL(C33129mqd.divS$default(java.lang.Integer.valueOf(olo.KWHzl()), 255, null, null, null, 14, null)));
            android.graphics.drawable.Drawable background = viewOnClickListenerC39742pyA.AYXKKw.isConnected.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setTint(Color.parseColor(strAEQbTJ));
            }
            DrawLineData drawLineData = DrawLineData.copydefault;
            drawLineData.copydefault(strAEQbTJ);
            drawLineData.KWHzl(olo.copydefault());
            DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
            if (drawLineItemIsConnected != null) {
                drawLineItemIsConnected.setFillColor(strAEQbTJ);
            }
            DrawLineData.DrawLineItem drawLineItemIsConnected2 = drawLineData.isConnected();
            if (drawLineItemIsConnected2 != null) {
                drawLineItemIsConnected2.setFillColorBlk(olo.copydefault());
            }
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        android.widget.LinearLayout linearLayout = this.AYXKKw.AhwBna;
        if (this.fetchVPNInfo == null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.fetchVPNInfo = new C39587pvE(context, this.AEQbTJ, new Function1() { // from class: o.pyD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39742pyA.KWHzl(this.copydefault, (oLO) obj);
                }
            }, null, new Function1() { // from class: o.pyC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39742pyA.valueOf(this.AEQbTJ, (oLO) obj);
                }
            }, 8, null);
        }
        float y = getY();
        C33566myq c33566myq = C33566myq.EZpvd;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        boolean z = y > ((float) (c33566myq.OLrzqt(context2) / 2));
        C39587pvE c39587pvE = this.fetchVPNInfo;
        if (c39587pvE != null) {
            pDT pdtKWHzl = pDT.Companion.KWHzl();
            DrawLineData drawLineData = DrawLineData.copydefault;
            java.lang.String strCopydefault = pdtKWHzl.copydefault(drawLineData.AYXKKw());
            if (strCopydefault == null) {
                strCopydefault = drawLineData.AEQbTJ();
            }
            C39587pvE.setSelectedColorAndPos$default(c39587pvE, strCopydefault, z, false, true, drawLineData.AEQbTJ(), 4, null);
            c39587pvE.showAsDropDown(linearLayout, 0, z ? C33129mqd.AhwBna(java.lang.Integer.valueOf(-(linearLayout.getHeight() + c39587pvE.OLrzqt()))) : this.OLrzqt, 3);
        }
    }

    public static final Unit KWHzl(ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA, oLO olo) {
        Intrinsics.checkNotNullParameter(olo, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) olo.copydefault())) {
            SPUtils.put("draw_line_color_blk", olo.copydefault());
        }
        java.lang.String strOLrzqt = Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_white") ? olo.OLrzqt() : olo.EZpvd();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
            android.graphics.drawable.Drawable background = viewOnClickListenerC39742pyA.AYXKKw.fetchVPNInfo.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            java.lang.String strAEQbTJ = viewOnClickListenerC39742pyA.AEQbTJ(strOLrzqt, C33129mqd.djBIcL(C33129mqd.divS$default(java.lang.Integer.valueOf(olo.KWHzl()), 255, null, null, null, 14, null)));
            if (gradientDrawable != null) {
                gradientDrawable.setTint(Color.parseColor(strAEQbTJ));
            }
            DrawLineData drawLineData = DrawLineData.copydefault;
            drawLineData.EZpvd(strAEQbTJ);
            drawLineData.AEQbTJ(olo.copydefault());
            DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
            if (drawLineItemIsConnected != null) {
                drawLineItemIsConnected.setLinecolor(strAEQbTJ);
            }
            DrawLineData.DrawLineItem drawLineItemIsConnected2 = drawLineData.isConnected();
            if (drawLineItemIsConnected2 != null) {
                drawLineItemIsConnected2.setLineColorBlk(olo.copydefault());
            }
        }
        InterfaceC35982oKx interfaceC35982oKx = viewOnClickListenerC39742pyA.KWHzl;
        if (interfaceC35982oKx != null) {
            interfaceC35982oKx.copydefault();
        }
        viewOnClickListenerC39742pyA.KWHzl();
        viewOnClickListenerC39742pyA.fetchVPNInfo = null;
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA, oLO olo) {
        Intrinsics.checkNotNullParameter(olo, "");
        java.lang.String strOLrzqt = Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_white") ? olo.OLrzqt() : olo.EZpvd();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
            android.graphics.drawable.Drawable background = viewOnClickListenerC39742pyA.AYXKKw.fetchVPNInfo.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            java.lang.String strAEQbTJ = viewOnClickListenerC39742pyA.AEQbTJ(strOLrzqt, C33129mqd.djBIcL(C33129mqd.divS$default(java.lang.Integer.valueOf(olo.KWHzl()), 255, null, null, null, 14, null)));
            if (gradientDrawable != null) {
                gradientDrawable.setTint(Color.parseColor(strAEQbTJ));
            }
            DrawLineData drawLineData = DrawLineData.copydefault;
            drawLineData.EZpvd(strAEQbTJ);
            drawLineData.AEQbTJ(olo.copydefault());
            DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
            if (drawLineItemIsConnected != null) {
                drawLineItemIsConnected.setLinecolor(strAEQbTJ);
            }
            DrawLineData.DrawLineItem drawLineItemIsConnected2 = drawLineData.isConnected();
            if (drawLineItemIsConnected2 != null) {
                drawLineItemIsConnected2.setLineColorBlk(olo.copydefault());
            }
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        final android.widget.TextView textView = this.AYXKKw.AYXKKw;
        if (textView != null) {
            if (this.DbNXlk == null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                this.DbNXlk = new C39593pvK(context, new Function1() { // from class: o.pyB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC39742pyA.KWHzl(this.copydefault, textView, (oLN) obj);
                    }
                });
            }
            float y = getY();
            C33566myq c33566myq = C33566myq.EZpvd;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            boolean z = y > ((float) (c33566myq.OLrzqt(context2) / 2));
            C39593pvK c39593pvK = this.DbNXlk;
            if (c39593pvK != null) {
                c39593pvK.EZpvd(DrawLineData.copydefault.AhwBna(), z);
            }
            C39593pvK c39593pvK2 = this.DbNXlk;
            if (c39593pvK2 != null) {
                c39593pvK2.showAsDropDown(textView, 0, 0, 3);
            }
            C39593pvK c39593pvK3 = this.DbNXlk;
            if (c39593pvK3 != null) {
                c39593pvK3.setOnDismissListener(new TaskDescription());
            }
        }
    }

    public static final Unit KWHzl(ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA, android.widget.TextView textView, oLN oln) {
        Intrinsics.checkNotNullParameter(oln, "");
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.OLrzqt(oln.EZpvd());
        DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
        if (drawLineItemIsConnected != null) {
            drawLineItemIsConnected.setLinewidth(oln.EZpvd());
        }
        SPUtils.put("draw_line_width", java.lang.Integer.valueOf(oln.EZpvd()));
        C39593pvK c39593pvK = viewOnClickListenerC39742pyA.DbNXlk;
        if (c39593pvK != null) {
            c39593pvK.dismiss();
        }
        textView.setText(oln.EZpvd() + "px");
        InterfaceC35982oKx interfaceC35982oKx = viewOnClickListenerC39742pyA.KWHzl;
        if (interfaceC35982oKx != null) {
            interfaceC35982oKx.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pyA$TaskDescription */
    public static final class TaskDescription implements PopupWindow.OnDismissListener {
        public TaskDescription() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            ViewOnClickListenerC39742pyA.this.KWHzl();
        }
    }

    public final void OLrzqt() {
        android.widget.LinearLayout linearLayout = this.AYXKKw.djBIcL;
        if (this.AkhnZx == null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.AkhnZx = new C39591pvI(context, new Function1() { // from class: o.pyx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39742pyA.KWHzl(this.KWHzl, (oLQ) obj);
                }
            });
        }
        float y = getY();
        C33566myq c33566myq = C33566myq.EZpvd;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        boolean z = y > ((float) (c33566myq.OLrzqt(context2) / 2));
        C39591pvI c39591pvI = this.AkhnZx;
        if (c39591pvI != null) {
            c39591pvI.OLrzqt(DrawLineData.copydefault.gEmmrt(), z);
        }
        C39591pvI c39591pvI2 = this.AkhnZx;
        if (c39591pvI2 != null) {
            c39591pvI2.showAsDropDown(linearLayout, 0, 0, 3);
        }
        C39591pvI c39591pvI3 = this.AkhnZx;
        if (c39591pvI3 != null) {
            c39591pvI3.setOnDismissListener(new Activity());
        }
    }

    public static final Unit KWHzl(ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA, oLQ olq) {
        Intrinsics.checkNotNullParameter(olq, "");
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.copydefault(olq.EZpvd());
        DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
        if (drawLineItemIsConnected != null) {
            drawLineItemIsConnected.setLinestyle(olq.EZpvd());
        }
        SPUtils.put("draw_line_style", java.lang.Integer.valueOf(olq.EZpvd()));
        InterfaceC35982oKx interfaceC35982oKx = viewOnClickListenerC39742pyA.KWHzl;
        if (interfaceC35982oKx != null) {
            interfaceC35982oKx.AEQbTJ();
        }
        C39591pvI c39591pvI = viewOnClickListenerC39742pyA.AkhnZx;
        if (c39591pvI != null) {
            c39591pvI.dismiss();
        }
        viewOnClickListenerC39742pyA.EZpvd(drawLineData.gEmmrt());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pyA$Activity */
    public static final class Activity implements PopupWindow.OnDismissListener {
        public Activity() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            ViewOnClickListenerC39742pyA.this.KWHzl();
        }
    }

    public final void KWHzl() {
        this.AYXKKw.AhwBna.setSelected(false);
        this.AYXKKw.AYXKKw.setSelected(false);
        this.AYXKKw.djBIcL.setSelected(false);
        this.AYXKKw.valueOf.setSelected(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void gEmmrt() {
        if (Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.AEQbTJ(), (java.lang.Object) "kline_dark")) {
            android.view.View view = this.AYXKKw.DbNXlk;
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(C36246oUr.copydefault().AubY(), C35964oKf.Activity.isConnected);
            Intrinsics.copydefault(drawable, "");
            view.setBackground((VectorDrawable) drawable);
        } else {
            android.view.View view2 = this.AYXKKw.DbNXlk;
            android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(C36246oUr.copydefault().AubY(), C35964oKf.Activity.values);
            Intrinsics.copydefault(drawable2, "");
            view2.setBackground((VectorDrawable) drawable2);
        }
        pDT pdtKWHzl = pDT.Companion.KWHzl();
        DrawLineData drawLineData = DrawLineData.copydefault;
        java.lang.String strKWHzl = pdtKWHzl.KWHzl(drawLineData.AYXKKw(), drawLineData.AEQbTJ());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
            android.graphics.drawable.Drawable background = this.AYXKKw.fetchVPNInfo.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setTint(Color.parseColor(strKWHzl));
            }
        }
        this.AYXKKw.AYXKKw.setText(drawLineData.AhwBna() + "px");
        DrawLineData.LineType lineTypeValueOf = drawLineData.valueOf();
        DrawLineData.LineType lineType = DrawLineData.LineType.G_CIRCLE;
        if (lineTypeValueOf != lineType) {
            DrawLineData.LineType lineTypeValueOf2 = drawLineData.valueOf();
            DrawLineData.LineType lineType2 = DrawLineData.LineType.G_TRIANGLE;
            if (lineTypeValueOf2 != lineType2) {
                DrawLineData.LineType lineTypeValueOf3 = drawLineData.valueOf();
                DrawLineData.LineType lineType3 = DrawLineData.LineType.G_RECTANGLE;
                if (lineTypeValueOf3 == lineType3) {
                    setDrawGriphicsBg();
                } else {
                    DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
                    if ((drawLineItemIsConnected != null ? drawLineItemIsConnected.getLineType() : null) == lineType) {
                        setDrawGriphicsBg();
                    } else {
                        DrawLineData.DrawLineItem drawLineItemIsConnected2 = drawLineData.isConnected();
                        if ((drawLineItemIsConnected2 != null ? drawLineItemIsConnected2.getLineType() : null) != lineType2) {
                            DrawLineData.DrawLineItem drawLineItemIsConnected3 = drawLineData.isConnected();
                            if ((drawLineItemIsConnected3 != null ? drawLineItemIsConnected3.getLineType() : null) != lineType3) {
                                this.AYXKKw.djBIcL.setVisibility(0);
                                this.AYXKKw.valueOf.setVisibility(8);
                                EZpvd(drawLineData.gEmmrt());
                            }
                        }
                    }
                }
            }
        }
        valueOf();
    }

    public final void setDrawGriphicsBg() {
        this.AYXKKw.djBIcL.setVisibility(8);
        this.AYXKKw.valueOf.setVisibility(0);
        if (Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.AEQbTJ(), (java.lang.Object) "kline_dark")) {
            android.view.View view = this.AYXKKw.AkhnZx;
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(C36246oUr.copydefault().AubY(), C35964oKf.Activity.isConnected);
            Intrinsics.copydefault(drawable, "");
            view.setBackground((VectorDrawable) drawable);
        } else {
            android.view.View view2 = this.AYXKKw.AkhnZx;
            android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(C36246oUr.copydefault().AubY(), C35964oKf.Activity.values);
            Intrinsics.copydefault(drawable2, "");
            view2.setBackground((VectorDrawable) drawable2);
        }
        pDT pdtKWHzl = pDT.Companion.KWHzl();
        DrawLineData drawLineData = DrawLineData.copydefault;
        java.lang.String strKWHzl = pdtKWHzl.KWHzl(drawLineData.copydefault(), drawLineData.KWHzl());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
            android.graphics.drawable.Drawable background = this.AYXKKw.isConnected.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setTint(Color.parseColor(strKWHzl));
            }
        }
    }

    private final void EZpvd(int i) {
        if (i == 0) {
            this.AYXKKw.values.setBackgroundResource(C35964oKf.Activity.EZpvd);
        } else {
            if (i != 1) {
                return;
            }
            this.AYXKKw.values.setBackgroundResource(C35964oKf.Activity.copydefault);
        }
    }

    public void valueOf() {
        DrawLineData.LineType lineType = DrawLineData.LineType.FIBONACCI;
        DrawLineData drawLineData = DrawLineData.copydefault;
        DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
        if (lineType == (drawLineItemIsConnected != null ? drawLineItemIsConnected.getLineType() : null) || lineType == drawLineData.valueOf()) {
            this.AYXKKw.gEmmrt.setVisibility(0);
        } else {
            this.AYXKKw.gEmmrt.setVisibility(8);
        }
    }

    public void setImageBackground(int i) {
        this.AYXKKw.copydefault.setImageResource(i);
    }

    public void AYXKKw() {
        copydefault();
        gEmmrt();
        this.AYXKKw.copydefault.setClickable(false);
        this.AYXKKw.copydefault.setImageResource(C52761wXj.TaskDescription.UUsvzU);
        this.AYXKKw.copydefault.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.Dff)));
        this.AYXKKw.EZpvd.setClickable(false);
        this.AYXKKw.EZpvd.setImageResource(C52761wXj.TaskDescription.dTTfOR);
        this.AYXKKw.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.Dff)));
    }

    public void djBIcL() {
        this.AYXKKw.copydefault.setClickable(true);
        this.AYXKKw.copydefault.setImageResource(C52761wXj.TaskDescription.UUsvzU);
        this.AYXKKw.copydefault.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
        this.AYXKKw.EZpvd.setClickable(true);
        this.AYXKKw.EZpvd.setImageResource(C52761wXj.TaskDescription.dTTfOR);
        this.AYXKKw.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
    }

    public void copydefault() {
        setVisibility(0);
        valueOf();
    }

    public final java.lang.String AEQbTJ(java.lang.String str, float f) {
        int color = Color.parseColor(str);
        int iArgb = Color.argb((int) (f * 255), Color.red(color), Color.green(color), Color.blue(color));
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str2 = java.lang.String.format("#%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iArgb)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }
}
