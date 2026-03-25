package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MarginLayoutParamsCompat;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C31063lmu;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lmu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31063lmu extends wXX {
    public wYF AhwBna;
    public Function1<? super java.lang.String, Unit> KWHzl;
    public C21578hEo copydefault;
    public int valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.lmr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C31063lmu.djBIcL(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.lmv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C31063lmu.AkhnZx(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.lms
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C31063lmu.valueOf(this.copydefault);
        }
    });

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    private final java.lang.String EZpvd() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String djBIcL(C31063lmu c31063lmu) {
        android.os.Bundle arguments = c31063lmu.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("data", "") : null;
        return string == null ? "" : string;
    }

    private final java.lang.String AEQbTJ() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public static final java.lang.String AkhnZx(C31063lmu c31063lmu) {
        android.os.Bundle arguments = c31063lmu.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("extra_universal_1", "") : null;
        return string == null ? "" : string;
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String valueOf(C31063lmu c31063lmu) {
        java.lang.String string;
        android.os.Bundle arguments = c31063lmu.getArguments();
        return (arguments == null || (string = arguments.getString("extra_universal_5")) == null) ? "12" : string;
    }

    /* JADX INFO: renamed from: o.lmu$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lmu.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.text.InputFilter[] OLrzqt() {
            return new android.text.InputFilter[]{new android.text.InputFilter() { // from class: o.lmx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.text.InputFilter
                public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
                    return C31063lmu.TaskDescription.KWHzl(charSequence, i, i2, spanned, i3, i4);
                }
            }, new C55007xbn(2, false, null, null, false, false, 62, null)};
        }

        /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:java.lang.Object:CAST), (wrap:java.lang.Object:CAST) */
        public static final java.lang.CharSequence KWHzl(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append((java.lang.Object) spanned);
                sb.append((java.lang.Object) charSequence);
                java.lang.String string = sb.toString();
                if (C23313hvq.OLrzqt(string, 100)) {
                    return "";
                }
                if (!Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "100.")) {
                    return null;
                }
                for (int iFIwbmz = StringsKt__StringsKt.fIwbmz((java.lang.CharSequence) string); -1 < iFIwbmz; iFIwbmz--) {
                    string.charAt(iFIwbmz);
                    if (!C59449zhJ.endsWith$default(string, JwtUtilsKt.JWT_DELIMITER, false, 2, null)) {
                        java.lang.String strSubstring = string.substring(0, iFIwbmz + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        return strSubstring;
                    }
                }
                return "";
            } catch (java.lang.NumberFormatException unused) {
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: o.lmu$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C55008xbo c55008xbo;
            C55008xbo c55008xbo2;
            C52794wYp c52794wYpCopydefault;
            C55008xbo c55008xbo3;
            C55001xbh c55001xbhAkhnZx;
            C21578hEo c21578hEo = C31063lmu.this.copydefault;
            java.lang.String strIsConnected = (c21578hEo == null || (c55008xbo3 = c21578hEo.copydefault) == null || (c55001xbhAkhnZx = c55008xbo3.AkhnZx()) == null) ? null : c55001xbhAkhnZx.isConnected();
            wYF wyf = C31063lmu.this.AhwBna;
            if (wyf != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                c52794wYpCopydefault.setEnabled(strIsConnected != null && strIsConnected.length() > 0 && C23313hvq.OLrzqt(strIsConnected, 0));
            }
            if (strIsConnected == null || strIsConnected.length() <= 0 || !C23313hvq.copydefault(strIsConnected, 0)) {
                C21578hEo c21578hEo2 = C31063lmu.this.copydefault;
                if (c21578hEo2 == null || (c55008xbo = c21578hEo2.copydefault) == null) {
                    return;
                }
                c55008xbo.values();
                return;
            }
            C21578hEo c21578hEo3 = C31063lmu.this.copydefault;
            if (c21578hEo3 == null || (c55008xbo2 = c21578hEo3.copydefault) == null) {
                return;
            }
            c55008xbo2.setErrorText(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatConnectionCallbackConnectionCallbackApi21));
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(2);
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        if (this.valueOf == 0) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.getExtras);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.getRoot);
        }
        wxq.setTitle(strAYXKKw);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        C55008xbo c55008xbo2;
        C55009xbp c55009xbpFIwbmz;
        C55008xbo c55008xbo3;
        C55001xbh c55001xbhAkhnZx2;
        C55008xbo c55008xbo4;
        C55001xbh c55001xbhAkhnZx3;
        C55008xbo c55008xbo5;
        C55001xbh c55001xbhAkhnZx4;
        C55008xbo c55008xbo6;
        C55009xbp c55009xbpFIwbmz2;
        C55008xbo c55008xbo7;
        C55001xbh c55001xbhAkhnZx5;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        this.valueOf = arguments != null ? arguments.getInt("extra_universal_3") : 0;
        C21578hEo c21578hEoKWHzl = C21578hEo.KWHzl(getLayoutInflater(), constraintLayout, true);
        this.copydefault = c21578hEoKWHzl;
        if (c21578hEoKWHzl != null && (c55008xbo7 = c21578hEoKWHzl.copydefault) != null && (c55001xbhAkhnZx5 = c55008xbo7.AkhnZx()) != null) {
            c55001xbhAkhnZx5.setTextAppearance(C32113mPz.Dialog.zLjUOn);
        }
        C21578hEo c21578hEo = this.copydefault;
        if (c21578hEo != null && (c55008xbo6 = c21578hEo.copydefault) != null && (c55009xbpFIwbmz2 = c55008xbo6.fIwbmz()) != null) {
            c55009xbpFIwbmz2.KWHzl();
        }
        C21578hEo c21578hEo2 = this.copydefault;
        if (c21578hEo2 != null && (c55008xbo5 = c21578hEo2.copydefault) != null && (c55001xbhAkhnZx4 = c55008xbo5.AkhnZx()) != null) {
            c55001xbhAkhnZx4.setPlainNumericText(EZpvd());
        }
        C21578hEo c21578hEo3 = this.copydefault;
        if (c21578hEo3 != null && (c55008xbo4 = c21578hEo3.copydefault) != null && (c55001xbhAkhnZx3 = c55008xbo4.AkhnZx()) != null) {
            c55001xbhAkhnZx3.setText(pTB.formatLocalized$default(EZpvd(), null, 1, null));
        }
        if (this.valueOf == 1) {
            C21578hEo c21578hEo4 = this.copydefault;
            if (c21578hEo4 != null && (c55008xbo3 = c21578hEo4.copydefault) != null && (c55001xbhAkhnZx2 = c55008xbo3.AkhnZx()) != null) {
                c55001xbhAkhnZx2.setShowThousandsSeparator(false);
            }
            copydefault();
        } else {
            OLrzqt();
        }
        C21578hEo c21578hEo5 = this.copydefault;
        if (c21578hEo5 != null && (c55008xbo2 = c21578hEo5.copydefault) != null && (c55009xbpFIwbmz = c55008xbo2.fIwbmz()) != null) {
            android.view.View viewInflate = android.view.LayoutInflater.from(requireContext()).inflate(C23274hvD.Activity.UJEglR, (android.view.ViewGroup) null);
            ((AppCompatTextView) viewInflate.findViewById(C23274hvD.Application.getPaint)).setText(AEQbTJ());
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            c55009xbpFIwbmz.EZpvd(viewInflate);
        }
        C21578hEo c21578hEo6 = this.copydefault;
        if (c21578hEo6 == null || (c55008xbo = c21578hEo6.copydefault) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null) {
            return;
        }
        c55001xbhAkhnZx.addTextChangedListener(new StateListAnimator());
    }

    public final void OLrzqt() {
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        C55008xbo c55008xbo2;
        C55001xbh c55001xbhAkhnZx2;
        C55008xbo c55008xbo3;
        C55001xbh c55001xbhAkhnZx3;
        C21578hEo c21578hEo = this.copydefault;
        if (c21578hEo != null && (c55008xbo3 = c21578hEo.copydefault) != null && (c55001xbhAkhnZx3 = c55008xbo3.AkhnZx()) != null) {
            c55001xbhAkhnZx3.setFilters(null);
        }
        C21578hEo c21578hEo2 = this.copydefault;
        if (c21578hEo2 != null && (c55008xbo2 = c21578hEo2.copydefault) != null && (c55001xbhAkhnZx2 = c55008xbo2.AkhnZx()) != null) {
            c55001xbhAkhnZx2.setMaxDecimalValue(C22370heA.OLrzqt(KWHzl()));
        }
        C21578hEo c21578hEo3 = this.copydefault;
        if (c21578hEo3 == null || (c55008xbo = c21578hEo3.copydefault) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null) {
            return;
        }
        c55001xbhAkhnZx.setShowThousandsSeparator(true);
    }

    public final void copydefault() {
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        C21578hEo c21578hEo = this.copydefault;
        if (c21578hEo == null || (c55008xbo = c21578hEo.copydefault) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null) {
            return;
        }
        c55001xbhAkhnZx.setFilters(Companion.OLrzqt());
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        C55008xbo c55008xbo;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C21578hEo c21578hEo = this.copydefault;
        if (c21578hEo != null && (c55008xbo = c21578hEo.copydefault) != null) {
            c55008xbo.postDelayed(new java.lang.Runnable() { // from class: o.lmt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C31063lmu.values(this.AEQbTJ);
                }
            }, 200L);
        }
        view.post(new java.lang.Runnable() { // from class: o.lmw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31063lmu.fetchVPNInfo(this.AEQbTJ);
            }
        });
    }

    public static final void values(C31063lmu c31063lmu) {
        C21578hEo c21578hEo;
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        C55008xbo c55008xbo2;
        C55001xbh c55001xbhAkhnZx2;
        C21578hEo c21578hEo2 = c31063lmu.copydefault;
        if (c21578hEo2 != null && (c55008xbo2 = c21578hEo2.copydefault) != null && (c55001xbhAkhnZx2 = c55008xbo2.AkhnZx()) != null) {
            c55001xbhAkhnZx2.requestFocus();
        }
        if (c31063lmu.EZpvd().length() <= 0 || (c21578hEo = c31063lmu.copydefault) == null || (c55008xbo = c21578hEo.copydefault) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null) {
            return;
        }
        int length = c31063lmu.EZpvd().length();
        android.text.Editable text = c55001xbhAkhnZx.getText();
        c55001xbhAkhnZx.setSelection(C56548yJl.valueOf(length, text != null ? text.length() : 0));
    }

    public static final void fetchVPNInfo(C31063lmu c31063lmu) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c31063lmu, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.AhwBna = wyf;
        wyf.setType(5);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.QKVWgx));
        }
        ViewGroup.LayoutParams layoutParams = wyf.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) layoutParams, C7865arr.copydefault(8.0f));
        ViewGroup.LayoutParams layoutParams2 = wyf.getLayoutParams();
        Intrinsics.copydefault(layoutParams2, "");
        MarginLayoutParamsCompat.setMarginEnd((ViewGroup.MarginLayoutParams) layoutParams2, C7865arr.copydefault(8.0f));
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new ActionBar(c52794wYpCopydefault2, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.lmu$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C31063lmu EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C31063lmu c31063lmu) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c31063lmu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C55008xbo c55008xbo;
            C55001xbh c55001xbhAkhnZx;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.KWHzl;
                if (function1 != null) {
                    C21578hEo c21578hEo = this.EZpvd.copydefault;
                    java.lang.String strIsConnected = (c21578hEo == null || (c55008xbo = c21578hEo.copydefault) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null) ? null : c55001xbhAkhnZx.isConnected();
                    Intrinsics.copydefault((java.lang.Object) strIsConnected);
                    function1.invoke(strIsConnected);
                }
                this.EZpvd.dismiss();
            }
        }
    }
}
