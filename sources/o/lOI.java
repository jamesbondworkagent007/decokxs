package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.bumptech.glide.Glide;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.buysell.common.OKRemoteImageResource;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lOI extends C33005moL {
    public AbstractC31482lup EZpvd;
    public Function0<Unit> OLrzqt;
    public ChannelCategoryCode valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public java.lang.String djBIcL = "";
    public java.lang.String fetchVPNInfo = "";
    public java.lang.String DbNXlk = "";
    public java.lang.String KWHzl = "";
    public java.lang.String copydefault = "";
    public java.lang.String AhwBna = "";
    public java.lang.String AYXKKw = "";
    public java.lang.String gEmmrt = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.OLrzqt;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lOI.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final lOI OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull ChannelCategoryCode channelCategoryCode) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(channelCategoryCode, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("img_url", str);
            bundle.putString("legal_amount", str2);
            bundle.putString(OtcExtraKeys.LEGAL_CURRENCY, str3);
            bundle.putString("amount_usdt", str4);
            bundle.putString("currency_usdt", str5);
            bundle.putString(OtcExtraKeys.BASE_CURRENCY, str6);
            bundle.putString("convert_base_amount", str7);
            bundle.putString("convert_price", str8);
            bundle.putParcelable("fiat_category_code", channelCategoryCode);
            lOI loi = new lOI();
            loi.setArguments(bundle);
            return loi;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.EZpvd = null;
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        android.view.Window window;
        android.view.ViewGroup viewGroup;
        super.onStart();
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (viewGroup = (android.view.ViewGroup) window.findViewById(com.google.android.material.R.id.design_bottom_sheet)) == null) {
            return;
        }
        viewGroup.setBackgroundResource(android.R.color.transparent);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        KWHzl();
        this.EZpvd = (AbstractC31482lup) DataBindingUtil.inflate(layoutInflater, C31351lsQ.ActionBar.AuCTel, null, false);
        KWHzl(false);
        AbstractC31482lup abstractC31482lup = this.EZpvd;
        if (abstractC31482lup != null) {
            return abstractC31482lup.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC31482lup abstractC31482lup = this.EZpvd;
        if (abstractC31482lup != null) {
            abstractC31482lup.values.setText(C33069mpW.copydefault(this, C31351lsQ.Activity.iqMDAV, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, this.AhwBna))));
            abstractC31482lup.ejfBZ.setText(C33069mpW.copydefault(this, C31351lsQ.Activity.invokespecialDaTmkG, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, this.fetchVPNInfo + " " + this.DbNXlk))));
            abstractC31482lup.fetchVPNInfo.setText(this.KWHzl);
            abstractC31482lup.AuCTel.setText(this.copydefault);
            abstractC31482lup.AkhnZx.setText(C33069mpW.copydefault(this, C31351lsQ.Activity.FQMcgE, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(FirebaseAnalytics.Param.QUANTITY, this.AYXKKw), C56390yDp.OLrzqt("cryptoCurrency", this.AhwBna))));
            abstractC31482lup.isConnected.setText(getString(C31351lsQ.Activity.invokespecialDPHOMC));
            abstractC31482lup.AkhnZx.setText(this.AYXKKw);
            abstractC31482lup.DbNXlk.setText(this.AhwBna);
            android.widget.ImageView imageView = abstractC31482lup.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.loadUrl$default(imageView, this.djBIcL, null, 0, 0, 14, null);
            android.widget.ImageView imageView2 = abstractC31482lup.OLrzqt;
            imageView2.setOnClickListener(new TaskDescription(imageView2, 1000L, this));
            abstractC31482lup.AEQbTJ.setText(getString(C31351lsQ.Activity.DFbvW));
            C52794wYp c52794wYp = abstractC31482lup.AEQbTJ;
            c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
            OKReminder oKReminder = abstractC31482lup.valueOf;
            int i = 0;
            if (C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "bsc-trading-account", null, 2, null), "treatment", false, 2, null)) {
                java.lang.String string = getString(C31351lsQ.Activity.zuBGHE);
                Intrinsics.checkNotNullExpressionValue(string, "");
                oKReminder.setTitle(string);
                oKReminder.setMessage(getString(C31351lsQ.Activity.AwvSrB));
                oKReminder.setStyle(0);
                oKReminder.setCloseIconVisibility(false);
            } else {
                i = 8;
            }
            oKReminder.setVisibility(i);
        }
        OKRemoteImageResource oKRemoteImageResource = OKRemoteImageResource.copydefault;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.AEQbTJ(requireContext()).EZpvd(oKRemoteImageResource.OLrzqt(OKRemoteImageResource.ImagePathKey.DOTTED_STEPPER, oKRemoteImageResource.AEQbTJ(contextRequireContext)));
        AbstractC31482lup abstractC31482lup2 = this.EZpvd;
        android.widget.ImageView imageView3 = abstractC31482lup2 != null ? abstractC31482lup2.AhwBna : null;
        Intrinsics.copydefault(imageView3);
        c5335NtEZpvd.EZpvd(imageView3);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("PaymentMethod_Sheet_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    private final void KWHzl() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            java.lang.String string = arguments.getString("img_url");
            if (string == null) {
                string = "";
            }
            this.djBIcL = string;
            java.lang.String string2 = arguments.getString("legal_amount");
            if (string2 == null) {
                string2 = "";
            }
            this.fetchVPNInfo = string2;
            java.lang.String string3 = arguments.getString(OtcExtraKeys.LEGAL_CURRENCY);
            if (string3 == null) {
                string3 = "";
            }
            this.DbNXlk = string3;
            java.lang.String string4 = arguments.getString("amount_usdt");
            if (string4 == null) {
                string4 = "";
            }
            this.KWHzl = string4;
            java.lang.String string5 = arguments.getString("currency_usdt");
            if (string5 == null) {
                string5 = "";
            }
            this.copydefault = string5;
            java.lang.String string6 = arguments.getString(OtcExtraKeys.BASE_CURRENCY);
            this.AhwBna = string6 != null ? string6 : "";
            this.AYXKKw = C33129mqd.gEmmrt(arguments.getString("convert_base_amount"));
            this.gEmmrt = C33129mqd.gEmmrt(arguments.getString("convert_price"));
            this.valueOf = (ChannelCategoryCode) arguments.getParcelable("fiat_category_code");
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ lOI OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, lOI loi) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = loi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.onEvent$default("PaymentMethod_Sheet_Next_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
                Function0<Unit> function0Copydefault = this.OLrzqt.copydefault();
                if (function0Copydefault != null) {
                    function0Copydefault.invoke();
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ lOI AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, lOI loi) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = loi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.dismiss();
            }
        }
    }
}
