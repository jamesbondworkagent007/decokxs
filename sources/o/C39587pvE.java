package o;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.VectorDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pvE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39587pvE extends android.widget.PopupWindow {
    public final java.util.ArrayList<oLO> AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public boolean AkhnZx;
    public final int AuCTel;
    public boolean DbNXlk;
    public android.widget.LinearLayout EZpvd;
    public AppCompatSeekBar KWHzl;
    public C52794wYp OLrzqt;
    public ConstraintLayout copydefault;
    public int djBIcL;
    public RecyclerView ejfBZ;
    public final Function1<oLO, Unit> fARcdN;
    public final int fIwbmz;
    public final Function0<Unit> fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public int gEmmrt;
    public android.widget.TextView hDKMBd;
    public final Function1<oLO, Unit> isConnected;
    public oLO uzCIH;
    public int valueOf;
    public final android.content.Context values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        int i = this.AhwBna;
        int i2 = this.fIwbmz;
        return (i * i2) + this.djBIcL + (this.gEmmrt * i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        int i = this.AhwBna;
        int i2 = this.AuCTel;
        return (i * i2) + (this.gEmmrt * i2) + this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 android.content.Context)
  (r9v0 java.util.ArrayList)
  (r10v0 kotlin.jvm.functions.Function1)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r11v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r12v0 kotlin.jvm.functions.Function1))
 A[MD:(android.content.Context, java.util.ArrayList<o.oLO>, kotlin.jvm.functions.Function1<? super o.oLO, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super o.oLO, kotlin.Unit>):void (m)] (LINE:49) call: o.pvE.<init>(android.content.Context, java.util.ArrayList, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C39587pvE(android.content.Context context, java.util.ArrayList arrayList, Function1 function1, Function0 function0, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, arrayList, function1, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function12);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: kotlin.jvm.functions.Function1<? super o.oLO, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: kotlin.jvm.functions.Function1<? super o.oLO, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39587pvE(@NotNull android.content.Context context, @NotNull java.util.ArrayList<oLO> arrayList, @NotNull Function1<? super oLO, Unit> function1, Function0<Unit> function0, Function1<? super oLO, Unit> function12) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.values = context;
        this.AEQbTJ = arrayList;
        this.isConnected = function1;
        this.fJNWhG = function0;
        this.fARcdN = function12;
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.pvF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39587pvE.AEQbTJ();
            }
        });
        this.uzCIH = new oLO(null, false, null, null, 0, 31, null);
        this.fIwbmz = 9;
        this.AuCTel = 5;
        this.DbNXlk = true;
        this.gEmmrt = C55298xhM.dp2px$default(2.0f, null, 1, null);
        this.AYXKKw = C55298xhM.dp2px$default(58.0f, null, 1, null);
        this.djBIcL = C55298xhM.dp2px$default(16.0f, null, 1, null);
        this.AhwBna = C55298xhM.dp2px$default(24.0f, null, 1, null);
        this.valueOf = C55298xhM.dp2px$default(30.0f, null, 1, null);
        AYXKKw();
    }

    public static final C59534zip AEQbTJ() {
        return new C59534zip();
    }

    public final C59534zip AhwBna() {
        return (C59534zip) this.fetchVPNInfo.getValue();
    }

    public final void AYXKKw() {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(this.values).inflate(C35964oKf.Application.DQYQgr, (android.view.ViewGroup) null);
        this.EZpvd = linearLayout;
        this.ejfBZ = linearLayout != null ? (RecyclerView) linearLayout.findViewById(C35964oKf.StateListAnimator.extraCommand) : null;
        android.widget.LinearLayout linearLayout2 = this.EZpvd;
        this.OLrzqt = linearLayout2 != null ? (C52794wYp) linearLayout2.findViewById(C35964oKf.StateListAnimator.fFgQHt) : null;
        android.widget.LinearLayout linearLayout3 = this.EZpvd;
        this.copydefault = linearLayout3 != null ? (ConstraintLayout) linearLayout3.findViewById(C35964oKf.StateListAnimator.gUEfcq) : null;
        android.widget.LinearLayout linearLayout4 = this.EZpvd;
        this.KWHzl = linearLayout4 != null ? (AppCompatSeekBar) linearLayout4.findViewById(C35964oKf.StateListAnimator.hlkKmr) : null;
        android.widget.LinearLayout linearLayout5 = this.EZpvd;
        this.hDKMBd = linearLayout5 != null ? (android.widget.TextView) linearLayout5.findViewById(C35964oKf.StateListAnimator.setVolumeTo) : null;
        djBIcL();
        C52794wYp c52794wYp = this.OLrzqt;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.pvH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39587pvE.AEQbTJ(this.AEQbTJ, view);
                }
            });
        }
        AppCompatSeekBar appCompatSeekBar = this.KWHzl;
        if (appCompatSeekBar != null) {
            appCompatSeekBar.setOnSeekBarChangeListener(new ActionBar());
        }
    }

    public static final void AEQbTJ(C39587pvE c39587pvE, android.view.View view) {
        pEM pem = pEM.AEQbTJ;
        pem.AEQbTJ("");
        pem.EZpvd("");
        Function0<Unit> function0 = c39587pvE.fJNWhG;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: o.pvE$ActionBar */
    public static final class ActionBar implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        }

        public ActionBar() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            android.widget.TextView textView = C39587pvE.this.hDKMBd;
            if (textView != null) {
                textView.setText(C39587pvE.this.copydefault(i));
            }
            C39587pvE.this.uzCIH.AEQbTJ(i);
            Function1 function1 = C39587pvE.this.fARcdN;
            if (function1 != null) {
                function1.invoke(C39587pvE.this.uzCIH);
            }
        }
    }

    public final void djBIcL() {
        AhwBna().register(oLO.class, new C39516ptn(this.values, new Function1() { // from class: o.pvD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39587pvE.copydefault(this.copydefault, (oLO) obj);
            }
        }));
        AhwBna().setItems(this.AEQbTJ);
        RecyclerView recyclerView = this.ejfBZ;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new C39498ptV());
        }
        RecyclerView recyclerView2 = this.ejfBZ;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new GridLayoutManager(this.values, this.fIwbmz));
        }
        RecyclerView recyclerView3 = this.ejfBZ;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(AhwBna());
        }
    }

    public static final Unit copydefault(C39587pvE c39587pvE, oLO olo) {
        AppCompatSeekBar appCompatSeekBar;
        android.graphics.drawable.Drawable progressDrawable;
        android.graphics.drawable.Drawable progressDrawable2;
        Intrinsics.checkNotNullParameter(olo, "");
        if (!c39587pvE.AkhnZx) {
            c39587pvE.isConnected.invoke(olo);
        } else {
            for (oLO olo2 : c39587pvE.AEQbTJ) {
                olo2.OLrzqt(C59449zhJ.gEmmrt(olo2.copydefault(), olo.copydefault(), true));
                if (olo2.AEQbTJ()) {
                    c39587pvE.uzCIH = olo2;
                    AppCompatSeekBar appCompatSeekBar2 = c39587pvE.KWHzl;
                    olo2.AEQbTJ(appCompatSeekBar2 != null ? appCompatSeekBar2.getProgress() : 0);
                    android.graphics.drawable.Drawable drawableEZpvd = c39587pvE.EZpvd(Color.parseColor(Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_white") ? c39587pvE.uzCIH.OLrzqt() : c39587pvE.uzCIH.EZpvd()));
                    if (drawableEZpvd != null) {
                        AppCompatSeekBar appCompatSeekBar3 = c39587pvE.KWHzl;
                        android.graphics.Rect bounds = (appCompatSeekBar3 == null || (progressDrawable2 = appCompatSeekBar3.getProgressDrawable()) == null) ? null : progressDrawable2.getBounds();
                        AppCompatSeekBar appCompatSeekBar4 = c39587pvE.KWHzl;
                        if (appCompatSeekBar4 != null) {
                            appCompatSeekBar4.setProgressDrawable(drawableEZpvd);
                        }
                        if (bounds != null && (appCompatSeekBar = c39587pvE.KWHzl) != null && (progressDrawable = appCompatSeekBar.getProgressDrawable()) != null) {
                            progressDrawable.setBounds(bounds);
                        }
                    }
                    Function1<oLO, Unit> function1 = c39587pvE.fARcdN;
                    if (function1 != null) {
                        function1.invoke(olo2);
                    }
                }
            }
            c39587pvE.AhwBna().notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setSelectedColorAndPos$default(C39587pvE c39587pvE, java.lang.String str, boolean z, boolean z2, boolean z3, java.lang.String str2, int i, java.lang.Object obj) {
        boolean z4 = (i & 4) != 0 ? false : z2;
        boolean z5 = (i & 8) != 0 ? false : z3;
        if ((i & 16) != 0) {
            str2 = "";
        }
        c39587pvE.KWHzl(str, z, z4, z5, str2);
    }

    public static final void KWHzl(C39587pvE c39587pvE) {
        c39587pvE.isConnected.invoke(c39587pvE.uzCIH);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i, int i2, int i3) {
        Intrinsics.copydefault(view);
        view.getLocationOnScreen(new int[2]);
        super.showAsDropDown(view, i, i2, i3);
    }

    public final void copydefault() {
        android.widget.LinearLayout linearLayout = this.EZpvd;
        if (linearLayout == null) {
            return;
        }
        setContentView(linearLayout);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
    }

    public final java.lang.String copydefault(int i) {
        return pTB.formatPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(C33129mqd.divS$default(java.lang.Integer.valueOf(i), 255, null, null, null, 14, null)))), 0, null, 2, null);
    }

    public final int AEQbTJ(java.lang.String str) {
        return Color.alpha(Color.parseColor(str));
    }

    public final android.graphics.drawable.Drawable EZpvd(int i) {
        int iCopydefault = C55298xhM.copydefault(204.0f, this.values);
        int iCopydefault2 = C55298xhM.copydefault(10.0f, this.values);
        float f = iCopydefault2 / 2.0f;
        android.graphics.drawable.Drawable drawable = AppCompatResources.getDrawable(this.values, Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_white") ? C35964oKf.Activity.fIwbmz : C35964oKf.Activity.fetchVPNInfo);
        Intrinsics.copydefault(drawable, "");
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i});
        gradientDrawable.setCornerRadius(f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.setIntrinsicHeight(iCopydefault2);
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(C55298xhM.copydefault(1.0f, this.values));
        LayerDrawable layerDrawable = new LayerDrawable(new android.graphics.drawable.Drawable[]{(VectorDrawable) drawable, gradientDrawable, shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        layerDrawable.setLayerInset(1, 0, 0, 0, 0);
        layerDrawable.setLayerInset(2, 0, 0, 0, 0);
        layerDrawable.setBounds(0, 0, iCopydefault, iCopydefault2);
        return layerDrawable;
    }

    public final void KWHzl(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3, @NotNull java.lang.String str2) {
        android.graphics.drawable.Drawable drawableEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.DbNXlk = z;
        for (oLO olo : this.AEQbTJ) {
            olo.OLrzqt(C59449zhJ.gEmmrt(Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_white") ? olo.OLrzqt() : olo.EZpvd(), str, true));
            if (z3 && olo.AEQbTJ()) {
                this.uzCIH = olo;
                android.widget.TextView textView = this.hDKMBd;
                if (textView != null) {
                    textView.setText(copydefault(AEQbTJ(str2)));
                }
                AppCompatSeekBar appCompatSeekBar = this.KWHzl;
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(AEQbTJ(str2));
                }
            }
        }
        AhwBna().notifyDataSetChanged();
        copydefault();
        C52794wYp c52794wYp = this.OLrzqt;
        if (c52794wYp != null) {
            c52794wYp.setVisibility(z2 ? 0 : 8);
        }
        ConstraintLayout constraintLayout = this.copydefault;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(z3 ? 0 : 8);
        }
        this.AkhnZx = z3;
        if (z3) {
            java.lang.String strOLrzqt = Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_white") ? this.uzCIH.OLrzqt() : this.uzCIH.EZpvd();
            if (strOLrzqt != null && strOLrzqt.length() != 0 && (drawableEZpvd = EZpvd(Color.parseColor(strOLrzqt))) != null) {
                AppCompatSeekBar appCompatSeekBar2 = this.KWHzl;
                if (appCompatSeekBar2 != null) {
                    appCompatSeekBar2.setProgressDrawable(null);
                }
                AppCompatSeekBar appCompatSeekBar3 = this.KWHzl;
                if (appCompatSeekBar3 != null) {
                    appCompatSeekBar3.setProgressDrawable(drawableEZpvd);
                }
            }
            setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.pvG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    C39587pvE.KWHzl(this.OLrzqt);
                }
            });
        }
    }
}
