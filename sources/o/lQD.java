package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lQD extends wXX {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public boolean copydefault;
    public AbstractC31484lur djBIcL;
    public Function1<? super java.lang.String, Unit> AYXKKw = new Function1() { // from class: o.lQL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return lQD.EZpvd((java.lang.String) obj);
        }
    };
    public java.lang.String OLrzqt = "";
    public java.lang.String AhwBna = "";
    public java.lang.String gEmmrt = "";
    public java.lang.String AEQbTJ = "";
    public java.lang.String KWHzl = "";

    public static final Unit EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.valueOf().setVisibility(8);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.AYXKKw == null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String strPrependFiatSymbol$default;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC31484lur abstractC31484lurCopydefault = AbstractC31484lur.copydefault(android.view.LayoutInflater.from(getContext()));
        this.djBIcL = abstractC31484lurCopydefault;
        AbstractC31484lur abstractC31484lur = null;
        if (abstractC31484lurCopydefault == null) {
            Intrinsics.gEmmrt("");
            abstractC31484lurCopydefault = null;
        }
        lQY lqy = abstractC31484lurCopydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(lqy, "");
        KWHzl(lqy);
        abstractC31484lurCopydefault.AYXKKw.setEditable(abstractC31484lurCopydefault.copydefault.EZpvd());
        final lQY lqy2 = abstractC31484lurCopydefault.copydefault;
        lqy2.setUpCurrencyLabel(this.AhwBna);
        lqy2.EZpvd(true);
        lqy2.post(new java.lang.Runnable() { // from class: o.lQI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                lQD.AEQbTJ(lqy2, this);
            }
        });
        abstractC31484lurCopydefault.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.lQK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lQD.AEQbTJ(this.copydefault, view);
            }
        });
        abstractC31484lurCopydefault.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.lQH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lQD.KWHzl(this.AEQbTJ, view);
            }
        });
        android.widget.TextView textView = abstractC31484lurCopydefault.AhwBna;
        if (this.copydefault) {
            strPrependFiatSymbol$default = C31661lzi.appendCryptoSymbol$default(this.KWHzl, this.AhwBna, 0, null, null, null, 30, null);
        } else {
            strPrependFiatSymbol$default = C31661lzi.prependFiatSymbol$default(this.KWHzl, this.AhwBna, this.gEmmrt, C38307pTy.Companion.KWHzl(0, 2), null, false, 24, null);
        }
        textView.setText(strPrependFiatSymbol$default);
        AbstractC31484lur abstractC31484lur2 = this.djBIcL;
        if (abstractC31484lur2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC31484lur = abstractC31484lur2;
        }
        constraintLayout.addView(abstractC31484lur.getRoot(), -1, -2);
    }

    public static final void AEQbTJ(lQY lqy, lQD lqd) {
        android.text.Editable text;
        lqy.setTextValue(C31661lzi.EZpvd(lqd.OLrzqt, 2));
        C55001xbh c55001xbhAkhnZx = lqy.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            C55001xbh c55001xbhAkhnZx2 = lqy.AkhnZx();
            c55001xbhAkhnZx.setSelection((c55001xbhAkhnZx2 == null || (text = c55001xbhAkhnZx2.getText()) == null) ? 0 : text.length());
        }
    }

    public static final void AEQbTJ(lQD lqd, android.view.View view) {
        Function1<? super java.lang.String, Unit> function1 = lqd.AYXKKw;
        if (function1 != null) {
            function1.invoke(lqd.OLrzqt);
        }
        lqd.dismissAllowingStateLoss();
    }

    public static final void KWHzl(lQD lqd, android.view.View view) {
        lqd.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.AYXKKw == null) {
            dismissAllowingStateLoss();
        }
    }

    public final void KWHzl(final lQY lqy) {
        C55001xbh c55001xbhAkhnZx = lqy.AkhnZx();
        if (c55001xbhAkhnZx == null) {
            return;
        }
        c55001xbhAkhnZx.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.lQG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                lQD.copydefault(lqy, view, z);
            }
        });
        c55001xbhAkhnZx.addTextChangedListener(new Activity(lqy, this));
    }

    public static final void copydefault(lQY lqy, android.view.View view, boolean z) {
        if (z) {
            lqy.KWHzl();
        }
    }

    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ lQD OLrzqt;
        public final /* synthetic */ lQY copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(lQY lqy, lQD lqd) {
            this.copydefault = lqy;
            this.OLrzqt = lqd;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String string;
            if (editable == null || (string = editable.toString()) == null) {
                return;
            }
            lQY lqy = this.copydefault;
            lQD lqd = this.OLrzqt;
            lqy.KWHzl();
            lqy.values();
            lqy.setState(1);
            lqy.requestFocus();
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
                lqd.AEQbTJ(lqy.OLrzqt());
                return;
            }
            lqy.EZpvd().copydefault(false);
            lqy.setState(0);
            lqd.EZpvd();
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        java.lang.String fiatSymbol$default;
        java.lang.String fiatSymbol$default2;
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        double dAEQbTJ2 = C33129mqd.AEQbTJ(this.AEQbTJ);
        double dAEQbTJ3 = C33129mqd.AEQbTJ(this.KWHzl);
        AbstractC31484lur abstractC31484lur = null;
        if (dAEQbTJ < dAEQbTJ2) {
            copydefault(false);
            AbstractC31484lur abstractC31484lur2 = this.djBIcL;
            if (abstractC31484lur2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC31484lur = abstractC31484lur2;
            }
            C31562lwP c31562lwP = abstractC31484lur.OLrzqt;
            c31562lwP.EZpvd.setVisibility(0);
            android.widget.TextView textView = c31562lwP.OLrzqt;
            int i = C31351lsQ.Activity.DcMfJKfNLfdT;
            if (this.copydefault) {
                fiatSymbol$default2 = C31661lzi.appendCryptoSymbol$default(this.AEQbTJ, this.AhwBna, 0, null, null, null, 30, null);
            } else {
                fiatSymbol$default2 = C38305pTw.formatFiatSymbol$default(java.lang.Double.valueOf(dAEQbTJ2), this.AhwBna, null, C38307pTy.Companion.KWHzl(0, 2), null, null, null, 58, null);
            }
            textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, fiatSymbol$default2))));
            c31562lwP.KWHzl.setVisibility(8);
            c31562lwP.KWHzl.setClickable(false);
            Intrinsics.copydefault(c31562lwP);
            return;
        }
        if (dAEQbTJ > dAEQbTJ3) {
            copydefault(false);
            AbstractC31484lur abstractC31484lur3 = this.djBIcL;
            if (abstractC31484lur3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC31484lur = abstractC31484lur3;
            }
            C31562lwP c31562lwP2 = abstractC31484lur.OLrzqt;
            c31562lwP2.EZpvd.setVisibility(0);
            android.widget.TextView textView2 = c31562lwP2.OLrzqt;
            int i2 = C31351lsQ.Activity.DcMfJKDSqxTE;
            if (this.copydefault) {
                fiatSymbol$default = C31661lzi.appendCryptoSymbol$default(this.KWHzl, this.AhwBna, 0, null, null, null, 30, null);
            } else {
                fiatSymbol$default = C38305pTw.formatFiatSymbol$default(java.lang.Double.valueOf(dAEQbTJ3), this.AhwBna, null, C38307pTy.Companion.KWHzl(0, 2), null, null, null, 58, null);
            }
            textView2.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, fiatSymbol$default))));
            c31562lwP2.KWHzl.setVisibility(0);
            c31562lwP2.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lQJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lQD.gEmmrt(this.copydefault, view);
                }
            });
            c31562lwP2.AEQbTJ.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.sCB));
            Intrinsics.copydefault(c31562lwP2);
            return;
        }
        copydefault(true);
        AbstractC31484lur abstractC31484lur4 = this.djBIcL;
        if (abstractC31484lur4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC31484lur = abstractC31484lur4;
        }
        abstractC31484lur.OLrzqt.EZpvd.setVisibility(8);
        this.OLrzqt = str;
    }

    public static final void gEmmrt(lQD lqd, android.view.View view) {
        android.text.Editable text;
        lqd.OLrzqt = lqd.KWHzl;
        AbstractC31484lur abstractC31484lur = lqd.djBIcL;
        if (abstractC31484lur == null) {
            Intrinsics.gEmmrt("");
            abstractC31484lur = null;
        }
        lQY lqy = abstractC31484lur.copydefault;
        lqy.setTextValue(lqd.KWHzl);
        C55001xbh c55001xbhAkhnZx = lqy.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            C55001xbh c55001xbhAkhnZx2 = lqy.AkhnZx();
            c55001xbhAkhnZx.setSelection((c55001xbhAkhnZx2 == null || (text = c55001xbhAkhnZx2.getText()) == null) ? 0 : text.length());
        }
        lqd.AEQbTJ(lqd.KWHzl);
    }

    private final void copydefault(boolean z) {
        AbstractC31484lur abstractC31484lur = this.djBIcL;
        if (abstractC31484lur == null) {
            Intrinsics.gEmmrt("");
            abstractC31484lur = null;
        }
        if (z) {
            abstractC31484lur.KWHzl.setEnabled(true);
            abstractC31484lur.KWHzl.setVisibility(0);
        } else {
            abstractC31484lur.KWHzl.setEnabled(false);
            abstractC31484lur.KWHzl.setVisibility(8);
        }
    }

    public final void EZpvd() {
        AbstractC31484lur abstractC31484lur = this.djBIcL;
        AbstractC31484lur abstractC31484lur2 = null;
        if (abstractC31484lur == null) {
            Intrinsics.gEmmrt("");
            abstractC31484lur = null;
        }
        C52794wYp c52794wYp = abstractC31484lur.KWHzl;
        c52794wYp.setVisibility(0);
        c52794wYp.setEnabled(false);
        AbstractC31484lur abstractC31484lur3 = this.djBIcL;
        if (abstractC31484lur3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC31484lur2 = abstractC31484lur3;
        }
        abstractC31484lur2.OLrzqt.EZpvd.setVisibility(8);
        this.OLrzqt = "";
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lQD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final lQD copydefault(@NotNull lQV lqv, @NotNull Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(lqv, "");
            Intrinsics.checkNotNullParameter(function1, "");
            lQD lqd = new lQD();
            lqd.OLrzqt = lqv.copydefault();
            lqd.AhwBna = lqv.KWHzl();
            lqd.gEmmrt = lqv.djBIcL();
            lqd.copydefault = lqv.AEQbTJ();
            lqd.AEQbTJ = lqv.EZpvd();
            lqd.KWHzl = lqv.OLrzqt();
            lqd.AYXKKw = function1;
            return lqd;
        }
    }
}
