package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.tabs.TabLayout;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbitrageLiquidationPriceRatePresenter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wbU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52906wbU extends AbstractC49945uyC<uZJ, SmartArbitrageLiquidationPriceRatePresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public java.lang.String copydefault;
    public final int KWHzl = C48033uCm.Activity.OxbLUn;
    public java.lang.String AEQbTJ = "add";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.wbU$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wbU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ void show$default(ActionBar actionBar, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            actionBar.EZpvd(str, fragmentManager);
        }

        public final void EZpvd(@NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C52906wbU c52906wbU = new C52906wbU();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("query_scene_params", str);
            c52906wbU.setArguments(bundle);
            c52906wbU.show(fragmentManager, "SmartArbitrageLiquidationPriceRateDialog");
        }
    }

    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.copydefault = arguments != null ? arguments.getString("query_scene_params") : null;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fARcdN();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        if (AuCTel()) {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.QnnRaN);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.sbu);
        }
        wxq.setTitle(strAYXKKw);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setDividerVisibility(false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    private final boolean AuCTel() {
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) "open");
    }

    private final void fARcdN() {
        java.lang.String strAYXKKw;
        android.widget.TextView textView = values().valueOf;
        if (AuCTel()) {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.pXZxY);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.cancel);
        }
        textView.setText(strAYXKKw);
        C55249xgQ c55249xgQ = values().AEQbTJ;
        TabLayout.Tab tabNewTab = c55249xgQ.newTab();
        tabNewTab.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.RXdAnZ));
        tabNewTab.setTag("add");
        c55249xgQ.addTab(tabNewTab);
        TabLayout.Tab tabNewTab2 = c55249xgQ.newTab();
        tabNewTab2.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.gAnGwV));
        tabNewTab2.setTag("reduce");
        c55249xgQ.addTab(tabNewTab2);
        c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new StateListAnimator());
        isConnected();
        copydefault();
        C52794wYp c52794wYp = values().copydefault;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.wbU$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            C52906wbU c52906wbU = C52906wbU.this;
            java.lang.Object tag = tab != null ? tab.getTag() : null;
            c52906wbU.KWHzl(tag instanceof java.lang.String ? (java.lang.String) tag : null);
        }
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        android.text.SpannableString spannableStringKWHzl;
        android.widget.TextView textView = values().values;
        if (AuCTel()) {
            spannableStringKWHzl = KWHzl(C33069mpW.copydefault(this, C48033uCm.Fragment.hKJZrr, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("spotPrice", "100"), C56390yDp.OLrzqt("futuresPrice", "102"), C56390yDp.OLrzqt("ccy", "USDT"), C56390yDp.OLrzqt("spreadRate", "+2%"))), "+2", "+2%");
        } else {
            spannableStringKWHzl = KWHzl(C33069mpW.copydefault(this, C48033uCm.Fragment.GhqvEQ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("spotPrice", "102"), C56390yDp.OLrzqt("futuresPrice", "100"), C56390yDp.OLrzqt("ccy", "USDT"), C56390yDp.OLrzqt("spreadRate", "+2%"))), "+2", "+2%");
        }
        textView.setText(spannableStringKWHzl);
    }

    public final void copydefault() {
        if (AuCTel()) {
            values().AYXKKw.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.zFtALg));
            values().gEmmrt.setText("100 USDT");
            values().EZpvd.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.sRzUNh));
            values().djBIcL.setText("102 USDT");
            values().KWHzl.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.OrsvgJ));
            values().fetchVPNInfo.setText("+2%");
            values().fetchVPNInfo.setTextColor(C56033xvF.OLrzqt((java.lang.Object) "+2"));
            return;
        }
        values().AYXKKw.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKDSqxTE));
        values().gEmmrt.setText("102 USDT");
        values().EZpvd.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.stopBehavioSecDataCollection));
        values().djBIcL.setText("100 USDT");
        values().KWHzl.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.sbu));
        values().fetchVPNInfo.setText("+2%");
        values().fetchVPNInfo.setTextColor(C56033xvF.OLrzqt((java.lang.Object) "+2"));
    }

    /* JADX INFO: renamed from: o.wbU$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C52906wbU KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52906wbU c52906wbU) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c52906wbU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.fJNWhG();
            }
        }
    }

    /* JADX INFO: renamed from: o.wbU$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C52906wbU EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52906wbU c52906wbU) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c52906wbU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.fJNWhG();
            }
        }
    }

    public final void fIwbmz() {
        android.text.SpannableString spannableStringKWHzl;
        android.widget.TextView textView = values().values;
        if (AuCTel()) {
            spannableStringKWHzl = KWHzl(C33069mpW.copydefault(this, C48033uCm.Fragment.GQzpsZgQzpsZ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("spotPrice", "100"), C56390yDp.OLrzqt("futuresPrice", "98"), C56390yDp.OLrzqt("ccy", "USDT"), C56390yDp.OLrzqt("spreadRate", "-2%"))), "-2", "-2%");
        } else {
            spannableStringKWHzl = KWHzl(C33069mpW.copydefault(this, C48033uCm.Fragment.DXd, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("spotPrice", "98"), C56390yDp.OLrzqt("futuresPrice", "100"), C56390yDp.OLrzqt("ccy", "USDT"), C56390yDp.OLrzqt("spreadRate", "-2%"))), "-2", "-2%");
        }
        textView.setText(spannableStringKWHzl);
    }

    public final void ejfBZ() {
        if (AuCTel()) {
            values().AYXKKw.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.zFtALg));
            values().gEmmrt.setText("100 USDT");
            values().EZpvd.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.sRzUNh));
            values().djBIcL.setText("98 USDT");
            values().KWHzl.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.OrsvgJ));
            values().fetchVPNInfo.setText("-2%");
            values().fetchVPNInfo.setTextColor(C56033xvF.OLrzqt((java.lang.Object) "-2"));
            return;
        }
        values().AYXKKw.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKDSqxTE));
        values().gEmmrt.setText("98 USDT");
        values().EZpvd.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.stopBehavioSecDataCollection));
        values().djBIcL.setText("100 USDT");
        values().KWHzl.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.sbu));
        values().fetchVPNInfo.setText("-2%");
        values().fetchVPNInfo.setTextColor(C56033xvF.OLrzqt((java.lang.Object) "-2"));
    }

    public final android.text.SpannableString KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableString, str3, 0, false, 6, (java.lang.Object) null);
        int length = str3.length() + iIndexOf$default;
        if (iIndexOf$default >= 0) {
            spannableString.setSpan(new TaskDescription(str2), iIndexOf$default, length, 0);
            spannableString.setSpan(new android.text.style.StyleSpan(1), iIndexOf$default, length, 17);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: o.wbU$TaskDescription */
    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public TaskDescription(java.lang.String str) {
            this.copydefault = str;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(C56033xvF.OLrzqt((java.lang.Object) this.copydefault));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.lang.String str) {
        this.AEQbTJ = str == null ? "add" : str;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "add")) {
            isConnected();
            copydefault();
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "reduce")) {
            fIwbmz();
            ejfBZ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fJNWhG() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }
}
