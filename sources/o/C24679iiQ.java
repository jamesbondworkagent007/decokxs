package o;

import android.text.TextUtils;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.dex.utils.CDNSourceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iiQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24679iiQ extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public CompoundButton.OnCheckedChangeListener AEQbTJ;
    public Function0<Unit> AYXKKw;
    public Function0<Unit> AhwBna;
    public C23490hzH OLrzqt;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.iiR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24679iiQ.gEmmrt(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.iiY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24679iiQ.DbNXlk(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.iiX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24679iiQ.AkhnZx(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.iiV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24679iiQ.AhwBna(this.copydefault);
        }
    });
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.iiW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24679iiQ.isConnected(this.copydefault);
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.iiZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C24679iiQ.fetchVPNInfo(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.ijb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24679iiQ.valueOf(this.copydefault);
        }
    });

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public final java.lang.String AEQbTJ() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public static final java.lang.String gEmmrt(C24679iiQ c24679iiQ) {
        java.lang.String string;
        android.os.Bundle arguments = c24679iiQ.getArguments();
        return (arguments == null || (string = arguments.getString("extra_universal_1")) == null) ? "" : string;
    }

    public final java.lang.String copydefault() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String DbNXlk(C24679iiQ c24679iiQ) {
        java.lang.String string;
        android.os.Bundle arguments = c24679iiQ.getArguments();
        return (arguments == null || (string = arguments.getString("extra_universal_2")) == null) ? "" : string;
    }

    private final java.lang.String djBIcL() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String AkhnZx(C24679iiQ c24679iiQ) {
        java.lang.String string;
        android.os.Bundle arguments = c24679iiQ.getArguments();
        return (arguments == null || (string = arguments.getString("extra_universal_3", "")) == null) ? "" : string;
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String AhwBna(C24679iiQ c24679iiQ) {
        java.lang.String string;
        android.os.Bundle arguments = c24679iiQ.getArguments();
        return (arguments == null || (string = arguments.getString("extra_universal_4", "")) == null) ? "" : string;
    }

    public final java.lang.String AYXKKw() {
        return (java.lang.String) this.fetchVPNInfo.getValue();
    }

    public static final java.lang.String isConnected(C24679iiQ c24679iiQ) {
        java.lang.String string;
        android.os.Bundle arguments = c24679iiQ.getArguments();
        return (arguments == null || (string = arguments.getString("value", "")) == null) ? "" : string;
    }

    public final boolean OLrzqt() {
        return ((java.lang.Boolean) this.isConnected.getValue()).booleanValue();
    }

    public static final boolean fetchVPNInfo(C24679iiQ c24679iiQ) {
        android.os.Bundle arguments = c24679iiQ.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("extra_universal_6", false);
        }
        return false;
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String valueOf(C24679iiQ c24679iiQ) {
        java.lang.String string;
        android.os.Bundle arguments = c24679iiQ.getArguments();
        return (arguments == null || (string = arguments.getString("extra_universal_5", "")) == null) ? "" : string;
    }

    /* JADX INFO: renamed from: o.iiQ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iiQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C24679iiQ KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4, java.lang.String str5, java.lang.String str6, Function0<Unit> function0, Function0<Unit> function02, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            android.os.Bundle bundle = new android.os.Bundle();
            if (str6 != null) {
                bundle.putString("extra_universal_5", str6);
            }
            if (str != null) {
                bundle.putString("extra_universal_3", str);
            }
            if (str2 != null) {
                bundle.putString("extra_universal_4", str2);
            }
            if (str3 != null) {
                bundle.putString("value", str3);
            }
            if (bool != null) {
                bool.booleanValue();
                bundle.putBoolean("extra_universal_6", bool.booleanValue());
            }
            if (str4 != null) {
                bundle.putString("extra_universal_1", str4);
            }
            if (str5 != null) {
                bundle.putString("extra_universal_2", str5);
            }
            C24679iiQ c24679iiQ = new C24679iiQ();
            c24679iiQ.AYXKKw = function0;
            c24679iiQ.AhwBna = function02;
            c24679iiQ.AEQbTJ = onCheckedChangeListener;
            c24679iiQ.setArguments(bundle);
            return c24679iiQ;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        wYK wyk;
        wYK wyk2;
        AppCompatTextView appCompatTextView;
        C23490hzH c23490hzH;
        AppCompatTextView appCompatTextView2;
        C23490hzH c23490hzH2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        AppCompatTextView appCompatTextView7;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23490hzH c23490hzHAEQbTJ = C23490hzH.AEQbTJ(getLayoutInflater(), constraintLayout, true);
        this.OLrzqt = c23490hzHAEQbTJ;
        if (c23490hzHAEQbTJ != null && (appCompatTextView7 = c23490hzHAEQbTJ.valueOf) != null) {
            appCompatTextView7.setText(djBIcL());
        }
        C23490hzH c23490hzH3 = this.OLrzqt;
        if (c23490hzH3 != null && (appCompatTextView6 = c23490hzH3.valueOf) != null) {
            appCompatTextView6.setContentDescription("web3_dex_submit_sheet");
        }
        C23490hzH c23490hzH4 = this.OLrzqt;
        if (c23490hzH4 != null && (appCompatTextView5 = c23490hzH4.KWHzl) != null) {
            appCompatTextView5.setText(EZpvd());
        }
        C23490hzH c23490hzH5 = this.OLrzqt;
        if (c23490hzH5 != null && (appCompatTextView4 = c23490hzH5.AYXKKw) != null) {
            appCompatTextView4.setText(AYXKKw());
        }
        C23490hzH c23490hzH6 = this.OLrzqt;
        if (c23490hzH6 != null) {
            if (OLrzqt()) {
                AppCompatImageView appCompatImageView = c23490hzH6.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                C22361hds.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.IconErrorCheck);
                AppCompatTextView appCompatTextView8 = c23490hzH6.valueOf;
                TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(appCompatTextView8, 20, 24, 2, 2);
                appCompatTextView8.setMaxLines(1);
                appCompatTextView8.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                AppCompatImageView appCompatImageView2 = c23490hzH6.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                C22361hds.OLrzqt(appCompatImageView2, CDNSourceManager.ImageSource.IconWarningCheck);
            }
        }
        if (djBIcL().length() == 0 && (c23490hzH2 = this.OLrzqt) != null && (appCompatTextView3 = c23490hzH2.valueOf) != null) {
            appCompatTextView3.setVisibility(8);
        }
        if (EZpvd().length() == 0 && (c23490hzH = this.OLrzqt) != null && (appCompatTextView2 = c23490hzH.KWHzl) != null) {
            appCompatTextView2.setVisibility(8);
        }
        C23490hzH c23490hzH7 = this.OLrzqt;
        if (c23490hzH7 != null && (appCompatTextView = c23490hzH7.AYXKKw) != null) {
            appCompatTextView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) AYXKKw()) ? 0 : 8);
        }
        if (KWHzl().length() == 0) {
            C23490hzH c23490hzH8 = this.OLrzqt;
            if (c23490hzH8 == null || (wyk2 = c23490hzH8.EZpvd) == null) {
                return;
            }
            wyk2.setVisibility(8);
            return;
        }
        C23490hzH c23490hzH9 = this.OLrzqt;
        if (c23490hzH9 == null || (wyk = c23490hzH9.EZpvd) == null) {
            return;
        }
        wyk.setVisibility(0);
        wyk.setText(KWHzl());
        wyk.setOnCheckedChangeListener(this.AEQbTJ);
        wyk.setContentDescription("web3_dex_understanding_checkbox");
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) AEQbTJ()) && C33129mqd.OLrzqt((java.lang.CharSequence) copydefault())) {
            wyf.setType(7);
        } else {
            wyf.setType(5);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) AEQbTJ())) {
            wyf.setPrimaryText(AEQbTJ());
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) copydefault())) {
            wyf.setSecondaryText(copydefault());
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setOKDSType(260);
            }
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setContentDescription("web3_dex_start_trading_button");
        }
        C25352ivB.setOnDoubleCheckClickListener$default(wyf.copydefault(), 0L, new Function1() { // from class: o.iiT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24679iiQ.OLrzqt(this.OLrzqt, (android.view.View) obj);
            }
        }, 1, null);
        C25352ivB.setOnDoubleCheckClickListener$default(wyf.AEQbTJ(), 0L, new Function1() { // from class: o.iiS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24679iiQ.copydefault(this.copydefault, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(C24679iiQ c24679iiQ, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c24679iiQ.dismiss();
        Function0<Unit> function0 = c24679iiQ.AYXKKw;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C24679iiQ c24679iiQ, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c24679iiQ.dismiss();
        Function0<Unit> function0 = c24679iiQ.AhwBna;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
