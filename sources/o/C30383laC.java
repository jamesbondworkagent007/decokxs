package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.laC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30383laC extends android.widget.LinearLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public C30387laG AYXKKw;
    public android.view.View EZpvd;
    public InterfaceC30390laJ KWHzl;
    public final C21635hGr copydefault;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30383laC(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActionHandler(@NotNull InterfaceC30390laJ interfaceC30390laJ) {
        Intrinsics.checkNotNullParameter(interfaceC30390laJ, "");
        this.KWHzl = interfaceC30390laJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:34) call: o.laC.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C30383laC(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30383laC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C21635hGr c21635hGrOLrzqt = C21635hGr.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c21635hGrOLrzqt, "");
        this.copydefault = c21635hGrOLrzqt;
        this.AYXKKw = new C30387laG(null, null, null, null, 15, null);
        this.AEQbTJ = "115792089237316195423570985008687907853269984665640564039457584007913129639935";
        this.valueOf = "115792089237316195423570985008687907853269984665640564039457584007913129639935";
        copydefault();
    }

    /* JADX INFO: renamed from: o.laC$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.laC.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void copydefault() {
        setOrientation(1);
        final C21635hGr c21635hGr = this.copydefault;
        android.widget.ImageView imageView = c21635hGr.EZpvd;
        imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this));
        C52794wYp c52794wYp = c21635hGr.OLrzqt;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        C55001xbh c55001xbhAkhnZx = c21635hGr.AhwBna.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setShowThousandsSeparator(true);
        }
        C55009xbp c55009xbpFIwbmz = c21635hGr.AhwBna.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.EZpvd(KWHzl());
        }
        C55001xbh c55001xbhAkhnZx2 = c21635hGr.AhwBna.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.laF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C30383laC.KWHzl(this.OLrzqt, c21635hGr, view, z);
                }
            });
        }
        C55001xbh c55001xbhAkhnZx3 = c21635hGr.AhwBna.AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx3, new Function1() { // from class: o.laH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C30383laC.OLrzqt(this.KWHzl, c21635hGr, (java.lang.CharSequence) obj);
                }
            });
        }
        AppCompatTextView appCompatTextView = c21635hGr.DbNXlk;
        appCompatTextView.setOnClickListener(new TaskDescription(appCompatTextView, 1000L, this));
        AppCompatTextView appCompatTextView2 = c21635hGr.values;
        appCompatTextView2.setOnClickListener(new Dialog(appCompatTextView2, 1000L, this));
    }

    public static final void KWHzl(C30383laC c30383laC, C21635hGr c21635hGr, android.view.View view, boolean z) {
        if (z) {
            c30383laC.KWHzl("");
            c21635hGr.AhwBna.setHintText(c30383laC.getContext().getString(C23274hvD.Fragment.DlmWDR));
        }
    }

    public static final Unit OLrzqt(C30383laC c30383laC, C21635hGr c21635hGr, java.lang.CharSequence charSequence) {
        C55001xbh c55001xbhAkhnZx = c21635hGr.AhwBna.AkhnZx();
        java.lang.String strIsConnected = c55001xbhAkhnZx != null ? c55001xbhAkhnZx.isConnected() : null;
        if (strIsConnected == null) {
            strIsConnected = "";
        }
        c30383laC.KWHzl(strIsConnected);
        if (charSequence == null || charSequence.length() == 0) {
            c21635hGr.AhwBna.setHintText(c30383laC.getContext().getString(C23274hvD.Fragment.DlmWDR));
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull C30387laG c30387laG) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(c30387laG, "");
        this.AYXKKw = c30387laG;
        android.view.View view = this.EZpvd;
        if (view != null && (textView = (android.widget.TextView) view.findViewById(C23274hvD.Application.ActivityResultContractsPickVisualMediaImageAndVideo)) != null) {
            textView.setText(c30387laG.KWHzl());
        }
        AppCompatTextView appCompatTextView = this.copydefault.AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        appCompatTextView.setText(C33069mpW.KWHzl(context, C23274hvD.Fragment.DcMfJKsuEgdN, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C23322hvz.toLocalizedNumber$default(c30387laG.OLrzqt(), false, (RoundingMode) null, true, false, 11, (java.lang.Object) null)))));
        this.copydefault.isConnected.setText(this.AYXKKw.KWHzl());
        KWHzl(c30387laG.copydefault());
    }

    public final void copydefault(final int i) {
        android.widget.LinearLayout linearLayout = this.copydefault.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = i;
            linearLayout.setLayoutParams(layoutParams2);
            ViewCompat.setOnApplyWindowInsetsListener(getRootView(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.laI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                    return C30383laC.AEQbTJ(this.AEQbTJ, i, view, windowInsetsCompat);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public static final WindowInsetsCompat AEQbTJ(C30383laC c30383laC, int i, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        if (windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime())) {
            android.widget.LinearLayout linearLayout = c30383laC.copydefault.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.height = i + LuaValue.ERR_WRITE_FILE_ERROR;
                linearLayout.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        } else {
            C55001xbh c55001xbhAkhnZx = c30383laC.copydefault.AhwBna.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.clearFocus();
            }
            android.widget.LinearLayout linearLayout2 = c30383laC.copydefault.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
            if (layoutParams3 != null) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.height = i;
                linearLayout2.setLayoutParams(layoutParams4);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        return windowInsetsCompat;
    }

    private final android.view.View KWHzl() {
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C23274hvD.Activity.AhwBna, (android.view.ViewGroup) null, false);
        this.EZpvd = viewInflate;
        android.view.View viewFindViewById = viewInflate.findViewById(C23274hvD.Application.CollapsibleActionView);
        viewFindViewById.setOnClickListener(new Activity(viewFindViewById, 1000L, this));
        Intrinsics.copydefault(viewInflate);
        return viewInflate;
    }

    public final void KWHzl(java.lang.String str) {
        java.lang.String localizedNumber$default;
        this.AEQbTJ = str;
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935");
        C21635hGr c21635hGr = this.copydefault;
        AppCompatTextView appCompatTextView = c21635hGr.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(zEZpvd ? 0 : 8);
        AppCompatTextView appCompatTextView2 = c21635hGr.KWHzl;
        if (zEZpvd) {
            localizedNumber$default = getContext().getString(C23274hvD.Fragment.getAdvertisingId);
        } else {
            localizedNumber$default = C23322hvz.toLocalizedNumber$default(this.AEQbTJ, false, (RoundingMode) null, false, false, 11, (java.lang.Object) null);
        }
        appCompatTextView2.setText(localizedNumber$default);
        if (!zEZpvd && C23313hvq.KWHzl(this.AEQbTJ, this.AYXKKw.EZpvd())) {
            c21635hGr.OLrzqt.setEnabled(false);
            if (this.AEQbTJ.length() == 0) {
                c21635hGr.AhwBna.values();
                return;
            }
            C55008xbo c55008xbo = c21635hGr.AhwBna;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c55008xbo.setErrorText(C33069mpW.KWHzl(context, C23274hvD.Fragment.abAflu, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", C23322hvz.toLocalizedNumber$default(this.AYXKKw.EZpvd(), false, (RoundingMode) null, false, false, 11, (java.lang.Object) null)), C56390yDp.OLrzqt("token", this.AYXKKw.KWHzl()))));
            return;
        }
        c21635hGr.AhwBna.values();
        c21635hGr.OLrzqt.setEnabled(true);
    }

    /* JADX INFO: renamed from: o.laC$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C30383laC EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C30383laC c30383laC) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c30383laC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                AppCompatTextView appCompatTextView = this.EZpvd.copydefault.ejfBZ;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                appCompatTextView.setVisibility(0);
                this.EZpvd.copydefault.AhwBna.setText("");
                this.EZpvd.KWHzl("115792089237316195423570985008687907853269984665640564039457584007913129639935");
                this.EZpvd.AEQbTJ();
            }
        }
    }

    /* JADX INFO: renamed from: o.laC$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C30383laC KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C30383laC c30383laC) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c30383laC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ();
                this.KWHzl.OLrzqt();
            }
        }
    }

    /* JADX INFO: renamed from: o.laC$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C30383laC EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C30383laC c30383laC) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c30383laC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C55001xbh c55001xbhAkhnZx = this.EZpvd.copydefault.AhwBna.AkhnZx();
                if (c55001xbhAkhnZx != null) {
                    c55001xbhAkhnZx.setPlainNumericText(this.EZpvd.AYXKKw.EZpvd());
                }
                C30383laC c30383laC = this.EZpvd;
                c30383laC.KWHzl(c30383laC.AYXKKw.EZpvd());
                this.EZpvd.AEQbTJ();
            }
        }
    }

    /* JADX INFO: renamed from: o.laC$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C30383laC EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C30383laC c30383laC) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c30383laC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.EZpvd();
            }
        }
    }

    /* JADX INFO: renamed from: o.laC$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C30383laC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C30383laC c30383laC) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c30383laC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C55001xbh c55001xbhAkhnZx = this.copydefault.copydefault.AhwBna.AkhnZx();
                if (c55001xbhAkhnZx != null) {
                    c55001xbhAkhnZx.setPlainNumericText(C33129mqd.formatS$default(this.copydefault.AYXKKw.OLrzqt(), null, null, null, 7, null));
                }
                C30383laC c30383laC = this.copydefault;
                c30383laC.KWHzl(C33129mqd.formatS$default(c30383laC.AYXKKw.OLrzqt(), null, null, null, 7, null));
                this.copydefault.AEQbTJ();
            }
        }
    }

    public final void AEQbTJ() {
        C55008xbo c55008xbo = this.copydefault.AhwBna;
        c55008xbo.setHintText("");
        java.lang.Object systemService = c55008xbo.getContext().getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(c55008xbo.getWindowToken(), 0);
        c55008xbo.clearFocus();
    }

    public final void EZpvd() {
        C21635hGr c21635hGr = this.copydefault;
        AppCompatTextView appCompatTextView = c21635hGr.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(8);
        AppCompatTextView appCompatTextView2 = c21635hGr.isConnected;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(8);
        android.widget.ImageView imageView = c21635hGr.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        android.widget.FrameLayout frameLayout = c21635hGr.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(0);
        android.widget.LinearLayout linearLayout = c21635hGr.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        android.widget.LinearLayout linearLayout2 = c21635hGr.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(0);
        android.view.View view = c21635hGr.copydefault;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        android.view.View view2 = c21635hGr.djBIcL;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(8);
        C52794wYp c52794wYp = c21635hGr.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(0);
        this.valueOf = this.AEQbTJ;
        InterfaceC30390laJ interfaceC30390laJ = this.KWHzl;
        if (interfaceC30390laJ != null) {
            interfaceC30390laJ.KWHzl();
        }
    }

    public final void OLrzqt() {
        C21635hGr c21635hGr = this.copydefault;
        AppCompatTextView appCompatTextView = c21635hGr.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(0);
        AppCompatTextView appCompatTextView2 = c21635hGr.isConnected;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(0);
        android.widget.ImageView imageView = c21635hGr.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        android.widget.FrameLayout frameLayout = c21635hGr.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        android.widget.LinearLayout linearLayout = c21635hGr.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        android.widget.LinearLayout linearLayout2 = c21635hGr.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(8);
        android.view.View view = c21635hGr.copydefault;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(8);
        android.view.View view2 = c21635hGr.djBIcL;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(0);
        C52794wYp c52794wYp = c21635hGr.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(8);
        InterfaceC30390laJ interfaceC30390laJ = this.KWHzl;
        if (interfaceC30390laJ != null) {
            interfaceC30390laJ.OLrzqt(this.AEQbTJ, !Intrinsics.EZpvd((java.lang.Object) r1, (java.lang.Object) this.valueOf));
        }
    }
}
