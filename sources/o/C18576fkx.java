package o;

import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentKt;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C38307pTy;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fkx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18576fkx extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public C55001xbh KWHzl;

    /* JADX INFO: renamed from: o.fkx$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fkx.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C18576fkx OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C18576fkx c18576fkx = new C18576fkx();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("tiny_Threshold_key", str);
            c18576fkx.setArguments(bundle);
            return c18576fkx;
        }
    }

    public final java.lang.String copydefault() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("tiny_Threshold_key") : null;
        return (string == null || string.length() == 0) ? "1" : string;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C13754dXa.LoaderManager.valueOf);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        C52781wYc c52781wYc;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        C54946xaf binding = getBinding();
        if (binding == null || (c52781wYc = binding.EZpvd) == null) {
            return;
        }
        c52781wYc.setTitleAlignmentCenter(false);
        c52781wYc.setType(9);
        java.lang.String string = getString(C13754dXa.FragmentManager.startActionMode);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c52781wYc.setTitle(string);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16561emJ.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        ConstraintLayout constraintLayout;
        android.view.View rootView;
        android.widget.LinearLayout linearLayoutDjBIcL;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C54946xaf binding = getBinding();
        if (binding == null || (constraintLayout = binding.AEQbTJ) == null || (rootView = constraintLayout.getRootView()) == null) {
            return;
        }
        android.view.View viewFindViewById = rootView.findViewById(C13754dXa.ActionBar.tIwhY);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        C52794wYp c52794wYp = (C52794wYp) viewFindViewById;
        boolean z = false;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) copydefault()) && C33129mqd.AEQbTJ(copydefault(), 0)) {
            z = true;
        }
        c52794wYp.setEnabled(z);
        android.view.View viewFindViewById2 = rootView.findViewById(C13754dXa.ActionBar.setDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        C55008xbo c55008xbo = (C55008xbo) viewFindViewById2;
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        this.KWHzl = c55001xbhAkhnZx;
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setHintTextColor(ContextCompat.getColor(requireContext(), C52761wXj.Activity.UlJrfe));
        }
        C55001xbh c55001xbh = this.KWHzl;
        if (c55001xbh != null) {
            c55001xbh.setInputType(8194);
        }
        C55001xbh c55001xbh2 = this.KWHzl;
        if (c55001xbh2 != null) {
            c55001xbh2.setShowThousandsSeparator(true);
        }
        c55008xbo.setHintText(getString(C13754dXa.FragmentManager.sendCaptioningEnabled));
        java.lang.String string = getString(C13754dXa.FragmentManager.sendRepeatMode);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C33129mqd.EZpvd("10000"), false, 2, null, 5, null);
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(strConvertToString$default);
        C38307pTy.Application application = C38307pTy.Companion;
        java.lang.String amtWithSymbol$default = C54862xYb.formatAmtWithSymbol$default(bigDecimalEZpvd, application.AEQbTJ(2), "", false, null, 8, null);
        pUU.copydefault("zqh", "currencyMaxValue = " + strConvertToString$default + " : tinyThreshold = " + copydefault());
        java.lang.String strConvertToString$default2 = C54862xYb.convertToString$default(C33129mqd.EZpvd("0.1"), false, 2, null, 5, null);
        java.lang.String amtWithSymbol$default2 = C54862xYb.formatAmtWithSymbol$default(C33129mqd.EZpvd(strConvertToString$default2), application.AEQbTJ(2), "", false, null, 8, null);
        C55001xbh c55001xbh3 = this.KWHzl;
        if (c55001xbh3 != null) {
            c55001xbh3.EZpvd(2);
        }
        C55001xbh c55001xbh4 = this.KWHzl;
        if (c55001xbh4 != null) {
            c55001xbh4.setPlainNumericText(copydefault());
        }
        C55009xbp c55009xbpFIwbmz = c55008xbo.fIwbmz();
        if (c55009xbpFIwbmz == null || (linearLayoutDjBIcL = c55009xbpFIwbmz.djBIcL()) == null) {
            return;
        }
        android.widget.TextView textView = new android.widget.TextView(requireContext());
        textView.setText(string);
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.fdOvFl));
        TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.AxsJAY);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(C55298xhM.dp2px$default(12.0f, null, 1, null));
        layoutParams.gravity = 16;
        linearLayoutDjBIcL.addView(textView, layoutParams);
        C55001xbh c55001xbh5 = this.KWHzl;
        if (c55001xbh5 != null) {
            c55001xbh5.addTextChangedListener(new ActionBar(strConvertToString$default2, strConvertToString$default, c55008xbo, c52794wYp, amtWithSymbol$default2, amtWithSymbol$default));
        }
        C8003auW.copydefault(c52794wYp).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.fky
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18576fkx.EZpvd(this.EZpvd, obj);
            }
        });
        view.post(new java.lang.Runnable() { // from class: o.fkD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C18576fkx.copydefault(this.EZpvd);
            }
        });
    }

    /* JADX INFO: renamed from: o.fkx$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        public final /* synthetic */ C52794wYp AEQbTJ;
        public final /* synthetic */ C55008xbo AhwBna;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar(java.lang.String str, java.lang.String str2, C55008xbo c55008xbo, C52794wYp c52794wYp, java.lang.String str3, java.lang.String str4) {
            this.OLrzqt = str;
            this.EZpvd = str2;
            this.AhwBna = c55008xbo;
            this.AEQbTJ = c52794wYp;
            this.copydefault = str3;
            this.KWHzl = str4;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C55001xbh c55001xbh = C18576fkx.this.KWHzl;
            java.lang.String strIsConnected = c55001xbh != null ? c55001xbh.isConnected() : null;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) editable) && C33129mqd.copydefault(strIsConnected, this.OLrzqt) && C33129mqd.valueOf(strIsConnected, this.EZpvd)) {
                this.AhwBna.values();
                this.AEQbTJ.setEnabled(true);
            } else {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) editable)) {
                    this.AhwBna.setErrorText(C33069mpW.copydefault(C18576fkx.this, C13754dXa.FragmentManager.setWindowTitle, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("min", this.copydefault), C56390yDp.OLrzqt("max", this.KWHzl))));
                }
                this.AEQbTJ.setEnabled(false);
            }
        }
    }

    public static final void EZpvd(C18576fkx c18576fkx, java.lang.Object obj) {
        C55001xbh c55001xbh = c18576fkx.KWHzl;
        java.lang.String strIsConnected = c55001xbh != null ? c55001xbh.isConnected() : null;
        if (strIsConnected == null || strIsConnected.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strIsConnected)) {
            strIsConnected = "1";
        }
        FragmentKt.setFragmentResult(c18576fkx, "hide_asset_value_request_key", BundleKt.bundleOf(C56390yDp.OLrzqt("hide_asset_value_result_key", strIsConnected)));
        c18576fkx.dismissAllowingStateLoss();
    }

    public static final void copydefault(C18576fkx c18576fkx) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c18576fkx, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C55001xbh c55001xbh = this.KWHzl;
        if (c55001xbh != null) {
            c55001xbh.requestFocusFromTouch();
        }
    }
}
