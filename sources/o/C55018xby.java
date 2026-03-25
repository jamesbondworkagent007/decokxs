package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55018xby;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xby, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55018xby extends C55008xbo {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public int AEQbTJ;
    public Function1<? super java.lang.CharSequence, Unit> AuCTelauCTel;
    public C54997xbd AwvSrB;
    public java.util.List<java.lang.CharSequence> AxsJAY;
    public AbstractC52786wYh EZpvd;
    public androidx.fragment.app.FragmentManager KWHzl;
    public final View.OnClickListener OLrzqt;
    public int sSMYrx;
    public java.util.List<C55276xgr> wlaJM;
    public float zLjUOn;
    public boolean zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55018xby(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55018xby(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.sSMYrx;
    }

    public final int AEQbTJ(int i) {
        if (i != 40) {
            return i != 48 ? 4 : 16;
        }
        return 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54997xbd EZpvd() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.CharSequence> KWHzl() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC52786wYh OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C55276xgr> copydefault() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultFunction$OKUILib_uilib(boolean z) {
        setDefaultFunction$OKUILib_uilib$default(this, z, 0, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFragmentManager(androidx.fragment.app.FragmentManager fragmentManager) {
        this.KWHzl = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickItem(Function1<? super java.lang.CharSequence, Unit> function1) {
        this.AuCTelauCTel = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPopover(C54997xbd c54997xbd) {
        this.AwvSrB = c54997xbd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.sSMYrx = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.spnCvw int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:36) call: o.xby.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55018xby(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.spnCvw : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55018xby(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.wlaJM = new java.util.ArrayList();
        this.AxsJAY = new java.util.ArrayList();
        this.zLjUOn = 20.0f;
        this.AEQbTJ = 4;
        this.OLrzqt = new View.OnClickListener() { // from class: o.xbE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C55018xby.EZpvd(this.AEQbTJ, view);
            }
        };
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.jFiva);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setContentHeight$OKUILib_uilib(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.sEcTXd, 40));
        zuBGHE();
        this.sSMYrx = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.icKaHr, 0);
        typedArrayObtainStyledAttributes.recycle();
        C55009xbp c55009xbpFIwbmz = fIwbmz();
        if (c55009xbpFIwbmz != null) {
            ViewGroup.LayoutParams layoutParams = c55009xbpFIwbmz.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C55298xhM.OLrzqt(fARcdN(), context);
            }
            c55009xbpFIwbmz.setInterceptEvent(wlaJM() != 4);
            c55009xbpFIwbmz.AhwBna().setMinimumWidth(0);
        }
        C54997xbd c54997xbd = new C54997xbd(context, null, 0, 0, 14, null);
        c54997xbd.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.xbG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C55018xby.EZpvd(this.AEQbTJ);
            }
        });
        this.AwvSrB = c54997xbd;
        Activity activity = new Activity();
        activity.EZpvd(this);
        activity.OLrzqt(this.wlaJM);
        activity.EZpvd(this.AuCTelauCTel);
        setBottomSheet(activity);
        setAllTextAppearance$OKUILib_uilib();
        setAllTextSize$OKUILib_uilib();
    }

    public final void setItems(@NotNull java.util.List<C55276xgr> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.wlaJM = list;
        AbstractC52786wYh abstractC52786wYh = this.EZpvd;
        Activity activity = abstractC52786wYh instanceof Activity ? (Activity) abstractC52786wYh : null;
        if (activity != null) {
            activity.OLrzqt(list);
        }
    }

    public final void setPopoverItems(@NotNull java.util.List<java.lang.CharSequence> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AxsJAY = list;
        C54997xbd c54997xbd = this.AwvSrB;
        if (c54997xbd != null) {
            c54997xbd.AEQbTJ(list);
            c54997xbd.OLrzqt(new Function2() { // from class: o.xbH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C55018xby.KWHzl(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (java.lang.CharSequence) obj2);
                }
            });
        }
    }

    public static final Unit KWHzl(C55018xby c55018xby, int i, java.lang.CharSequence charSequence) {
        C55001xbh c55001xbhAkhnZx = c55018xby.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setText(charSequence);
        }
        C55009xbp c55009xbpFIwbmz = c55018xby.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            C55009xbp.updateContentAppearance$OKUILib_uilib$default(c55009xbpFIwbmz, false, 1, null);
        }
        Function1<? super java.lang.CharSequence, Unit> function1 = c55018xby.AuCTelauCTel;
        if (function1 != null) {
            function1.invoke(charSequence);
        }
        return Unit.INSTANCE;
    }

    public final void setBottomSheet(AbstractC52786wYh abstractC52786wYh) {
        this.EZpvd = abstractC52786wYh;
        if (abstractC52786wYh != null) {
            abstractC52786wYh.KWHzl(this);
        }
    }

    public static final void EZpvd(C55018xby c55018xby, android.view.View view) {
        C55009xbp c55009xbpFIwbmz = c55018xby.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.performClick();
        }
    }

    public static final void EZpvd(C55018xby c55018xby) {
        if (c55018xby.zsXlph) {
            return;
        }
        setDefaultFunction$OKUILib_uilib$default(c55018xby, true, 0, 2, null);
        C55009xbp c55009xbpFIwbmz = c55018xby.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.copydefault();
        }
    }

    public static /* synthetic */ void setDefaultFunction$OKUILib_uilib$default(C55018xby c55018xby, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = c55018xby.AEQbTJ;
        }
        c55018xby.setDefaultFunction$OKUILib_uilib(z, i);
    }

    public final void setDefaultFunction$OKUILib_uilib(boolean z, int i) {
        if (z) {
            C55009xbp c55009xbpFIwbmz = fIwbmz();
            if (c55009xbpFIwbmz != null) {
                c55009xbpFIwbmz.KWHzl(C52761wXj.TaskDescription.QSLkRj, C55298xhM.dpInt$default(this.zLjUOn, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(this.zLjUOn, (android.content.Context) null, 1, (java.lang.Object) null), i);
                return;
            }
            return;
        }
        C55009xbp c55009xbpFIwbmz2 = fIwbmz();
        if (c55009xbpFIwbmz2 != null) {
            c55009xbpFIwbmz2.KWHzl(C52761wXj.TaskDescription.dUDNAs, C55298xhM.dpInt$default(this.zLjUOn, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(this.zLjUOn, (android.content.Context) null, 1, (java.lang.Object) null), i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final C55009xbp c55009xbpFIwbmz = fIwbmz();
        if (c55009xbpFIwbmz != null) {
            if (!this.zsXlph && wlaJM() != 4) {
                setDefaultFunction$OKUILib_uilib$default(this, true, 0, 2, null);
            }
            c55009xbpFIwbmz.setOnClickListener(new View.OnClickListener() { // from class: o.xbD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C55018xby.EZpvd(this.copydefault, c55009xbpFIwbmz, view);
                }
            });
        }
    }

    public static final void EZpvd(C55018xby c55018xby, C55009xbp c55009xbp, android.view.View view) {
        if (c55018xby.wlaJM() == 4) {
            return;
        }
        c55018xby.setState(1);
        if (!c55018xby.zsXlph) {
            setDefaultFunction$OKUILib_uilib$default(c55018xby, false, 0, 2, null);
        }
        if (c55018xby.sSMYrx == 0) {
            c55018xby.AEQbTJ(c55018xby.EZpvd);
            return;
        }
        C54997xbd c54997xbd = c55018xby.AwvSrB;
        if (c54997xbd != null) {
            android.widget.LinearLayout linearLayout = c55018xby.getFieldNames().copydefault;
            android.content.Context context = c55009xbp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c54997xbd.showAsDropDown(linearLayout, 0, C55298xhM.OLrzqt(5, context));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMin;
        C54997xbd c54997xbd = this.AwvSrB;
        if (c54997xbd != null) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getRootView().getMeasuredWidth(), Integer.MIN_VALUE);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getRootView().getMeasuredHeight(), Integer.MIN_VALUE);
            android.view.View contentView = c54997xbd.getContentView();
            if (contentView != null) {
                contentView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMin = java.lang.Math.min(contentView.getMeasuredWidth(), contentView.getRootView().getMeasuredWidth() - C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null));
            } else {
                iMin = 0;
            }
            int measuredWidth = getMeasuredWidth();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c54997xbd.setWidth(java.lang.Math.max(measuredWidth + (C55298xhM.OLrzqt(12, context) * 2), iMin));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public final void AEQbTJ(AbstractC52786wYh abstractC52786wYh) {
        androidx.fragment.app.FragmentManager supportFragmentManager = this.KWHzl;
        if (supportFragmentManager == null) {
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            Intrinsics.copydefault(activityAEQbTJ, "");
            supportFragmentManager = ((FragmentActivity) activityAEQbTJ).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        }
        if ((abstractC52786wYh == null || !abstractC52786wYh.isAdded()) && abstractC52786wYh != null) {
            abstractC52786wYh.show(supportFragmentManager);
        }
    }

    /* JADX INFO: renamed from: o.xby$Activity */
    public static final class Activity extends AbstractC52786wYh {
        public C55018xby AEQbTJ;
        public Function1<? super java.lang.CharSequence, Unit> EZpvd;
        public java.util.List<C55276xgr> KWHzl = new java.util.ArrayList();
        public C55198xfS copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(Function1<? super java.lang.CharSequence, Unit> function1) {
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C55018xby c55018xby) {
            this.AEQbTJ = c55018xby;
        }

        @Override // o.AbstractC52792wYn
        public void EZpvd(@NotNull C55198xfS c55198xfS) {
            Intrinsics.checkNotNullParameter(c55198xfS, "");
            this.copydefault = c55198xfS;
            OLrzqt(this.KWHzl);
        }

        @Override // o.wXX
        public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
            Intrinsics.checkNotNullParameter(c52781wYc, "");
            super.onCreateHeader(c52781wYc);
            c52781wYc.setType(0);
        }

        @Override // o.AbstractC52786wYh, o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
        public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            super.onDismiss(dialogInterface);
            C55018xby c55018xby = this.AEQbTJ;
            if (c55018xby != null) {
                if (!c55018xby.zsXlph) {
                    C55018xby.setDefaultFunction$OKUILib_uilib$default(c55018xby, true, 0, 2, null);
                }
                if (c55018xby.zLjUOn()) {
                    c55018xby.setState(2);
                } else {
                    c55018xby.setState(0);
                }
            }
        }

        public final void OLrzqt(@NotNull java.util.List<C55276xgr> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
            C55198xfS c55198xfS = this.copydefault;
            if (c55198xfS != null) {
                c55198xfS.setSingleOneColumnData(list, new yHO() { // from class: o.xbJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.yHO
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return C55018xby.Activity.OLrzqt(this.EZpvd, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
                    }
                });
            }
        }

        public static final Unit OLrzqt(Activity activity, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
            C55001xbh c55001xbhAkhnZx;
            C55018xby c55018xby = activity.AEQbTJ;
            if (c55018xby != null && (c55001xbhAkhnZx = c55018xby.AkhnZx()) != null) {
                c55001xbhAkhnZx.setText(c55276xgr != null ? c55276xgr.AhwBna() : null);
            }
            return Unit.INSTANCE;
        }

        @Override // o.AbstractC52792wYn
        public void copydefault(final Function2<? super java.lang.Integer, ? super C55276xgr, Unit> function2) {
            C55198xfS c55198xfSIsConnected = isConnected();
            if (c55198xfSIsConnected != null) {
                c55198xfSIsConnected.copydefault(new yHO() { // from class: o.xbF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.yHO
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return C55018xby.Activity.EZpvd(function2, this, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
                    }
                });
            }
        }

        public static final Unit EZpvd(Function2 function2, Activity activity, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
            if (c55276xgr != null) {
                if (function2 != null) {
                    function2.invoke(0, c55276xgr);
                }
                Function1<? super java.lang.CharSequence, Unit> function1 = activity.EZpvd;
                if (function1 != null) {
                    function1.invoke(c55276xgr.AhwBna());
                }
            }
            return Unit.INSTANCE;
        }

        @Override // o.wXX
        public void onFooterCreated(@NotNull wYF wyf) {
            Intrinsics.checkNotNullParameter(wyf, "");
            wyf.setVisibility(8);
        }
    }

    @Override // o.C55008xbo
    public ViewGroup.LayoutParams isConnected() {
        ViewGroup.LayoutParams layoutParamsIsConnected = super.isConnected();
        int iFARcdN = fARcdN();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        layoutParamsIsConnected.height = C55298xhM.OLrzqt(iFARcdN, context);
        return layoutParamsIsConnected;
    }

    @Override // o.C55008xbo
    public void setAllTextSize$OKUILib_uilib() {
        float fGEmmrt;
        float fEZpvd;
        float fGEmmrt2;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C55312xha c55312xhaValueOf2;
        C55320xhi c55320xhiKWHzl2;
        int iFARcdN = fARcdN();
        if (iFARcdN == 24) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            fGEmmrt = C55298xhM.gEmmrt(12.0f, context);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            fEZpvd = C55298xhM.EZpvd(12.0f, context2);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            fGEmmrt2 = C55298xhM.gEmmrt(12.0f, context3);
        } else if (iFARcdN == 28) {
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            fGEmmrt = C55298xhM.gEmmrt(12.0f, context4);
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            fEZpvd = C55298xhM.gEmmrt(14.0f, context5);
            android.content.Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            fGEmmrt2 = C55298xhM.gEmmrt(12.0f, context6);
        } else if (iFARcdN == 40) {
            android.content.Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            fGEmmrt = C55298xhM.gEmmrt(14.0f, context7);
            android.content.Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            fEZpvd = C55298xhM.gEmmrt(16.0f, context8);
            android.content.Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "");
            fGEmmrt2 = C55298xhM.gEmmrt(12.0f, context9);
        } else if (iFARcdN != 48) {
            fGEmmrt = 0.0f;
            fEZpvd = 0.0f;
            fGEmmrt2 = 0.0f;
        } else {
            android.content.Context context10 = getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "");
            fGEmmrt = C55298xhM.gEmmrt(14.0f, context10);
            android.content.Context context11 = getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "");
            fEZpvd = C55298xhM.EZpvd(16.0f, context11);
            android.content.Context context12 = getContext();
            Intrinsics.checkNotNullExpressionValue(context12, "");
            fGEmmrt2 = C55298xhM.gEmmrt(14.0f, context12);
        }
        if (getNewProxyInstance() == 0) {
            C55258xgZ c55258xgZHDKMBd = hDKMBd();
            if (c55258xgZHDKMBd != null && (c55312xhaValueOf2 = c55258xgZHDKMBd.valueOf()) != null && (c55320xhiKWHzl2 = c55312xhaValueOf2.KWHzl()) != null) {
                c55320xhiKWHzl2.setTextSize(0, fEZpvd);
            }
        } else {
            C55258xgZ c55258xgZHDKMBd2 = hDKMBd();
            if (c55258xgZHDKMBd2 != null && (c55312xhaValueOf = c55258xgZHDKMBd2.valueOf()) != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
                c55320xhiKWHzl.setTextSize(0, fGEmmrt);
            }
        }
        C55009xbp c55009xbpFIwbmz = fIwbmz();
        if (c55009xbpFIwbmz != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
            c55001xbh.setTextSize(0, fEZpvd);
            android.content.Context context13 = c55001xbh.getContext();
            Intrinsics.checkNotNullExpressionValue(context13, "");
            c55001xbh.setMaxTextSize(C55298xhM.AhwBna(fEZpvd, context13));
        }
        android.widget.TextView textViewAuCTelauCTel = AuCTelauCTel();
        if (textViewAuCTelauCTel != null) {
            textViewAuCTelauCTel.setTextSize(0, fGEmmrt2);
        }
    }

    @Override // o.C55008xbo
    public void setSizeType(int i) {
        setContentHeight$OKUILib_uilib(i);
        zuBGHE();
        super.setSizeType(i);
    }

    @Override // o.C55008xbo
    public void setInputFiledViewEnable(boolean z) {
        int color;
        super.setInputFiledViewEnable(z);
        if (z) {
            color = ContextCompat.getColor(getContext(), C52761wXj.Activity.svhCHd);
        } else {
            color = ContextCompat.getColor(getContext(), C52761wXj.Activity.hfdhUn);
        }
        C55009xbp c55009xbpFIwbmz = fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.setImageTint(color);
        }
    }

    public final void zuBGHE() {
        this.zLjUOn = (fARcdN() == 24 || fARcdN() == 28) ? 12.0f : 20.0f;
        int iFARcdN = fARcdN();
        if (iFARcdN == 40 || iFARcdN == 48) {
            C55009xbp c55009xbpFIwbmz = fIwbmz();
            if (c55009xbpFIwbmz != null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iKWHzl = C55298xhM.KWHzl(12.0f, context);
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c55009xbpFIwbmz.setPaddingRelative(iKWHzl, 0, C55298xhM.KWHzl(12.0f, context2), 0);
            }
        } else {
            C55009xbp c55009xbpFIwbmz2 = fIwbmz();
            if (c55009xbpFIwbmz2 != null) {
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                int iKWHzl2 = C55298xhM.KWHzl(8.0f, context3);
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                c55009xbpFIwbmz2.setPaddingRelative(iKWHzl2, 0, C55298xhM.KWHzl(8.0f, context4), 0);
            }
        }
        this.AEQbTJ = AEQbTJ(fARcdN());
    }

    /* JADX INFO: renamed from: o.xby$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xby.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
