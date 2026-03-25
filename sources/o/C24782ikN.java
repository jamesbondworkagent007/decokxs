package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.share.Web3ShareService;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexui.main.swap.trade.savings.SavingsOrderParams;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC9857bdW;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.ikN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C24782ikN extends AbstractC24778ikJ {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ikQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24782ikN.copydefault(this.EZpvd);
        }
    });
    public hHD djBIcL;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX DEBUG: Possible override for method o.ikJ.OLrzqt()V */
    public final SavingsOrderParams OLrzqt() {
        return (SavingsOrderParams) this.AYXKKw.getValue();
    }

    public static final SavingsOrderParams copydefault(C24782ikN c24782ikN) {
        android.os.Bundle arguments = c24782ikN.getArguments();
        if (arguments != null) {
            return (SavingsOrderParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "arg_params", SavingsOrderParams.class));
        }
        return null;
    }

    /* JADX INFO: renamed from: o.ikN$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ikN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C24782ikN EZpvd(@NotNull SavingsOrderParams savingsOrderParams) {
            Intrinsics.checkNotNullParameter(savingsOrderParams, "");
            C24782ikN c24782ikN = new C24782ikN();
            c24782ikN.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_params", savingsOrderParams)));
            return c24782ikN;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AEQbTJ().setVisibility(0);
        wxq.AYXKKw().setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(wyf.getContext().getString(C23274hvD.Fragment.MediaMetadataCompatApi21));
        wyf.setSecondaryText(wyf.getContext().getString(C23274hvD.Fragment.newStarRating));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c52794wYpCopydefault.getContext(), C52761wXj.TaskDescription.zEkrwr);
            if (drawable != null) {
                DrawableCompat.setTintList(drawable, c52794wYpCopydefault.getTextColors());
                android.content.Context context = c52794wYpCopydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iOLrzqt = C55298xhM.OLrzqt(16, context);
                android.content.Context context2 = c52794wYpCopydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(16, context2));
            } else {
                drawable = null;
            }
            android.content.Context context3 = c52794wYpCopydefault.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c52794wYpCopydefault.setCompoundDrawablePadding(C55298xhM.OLrzqt(8, context3));
            c52794wYpCopydefault.setCompoundDrawablesRelative(drawable, null, null, null);
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new TaskDescription(c52794wYpCopydefault2, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new ActionBar(c52794wYpAEQbTJ2, 1000L, this));
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.djBIcL = hHD.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        AhwBna();
    }

    private final void AhwBna() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        LottieAnimationView lottieAnimationView;
        SavingsOrderParams savingsOrderParamsOLrzqt = OLrzqt();
        if (savingsOrderParamsOLrzqt == null) {
            return;
        }
        hHD hhd = this.djBIcL;
        if (hhd != null && (lottieAnimationView = hhd.copydefault) != null) {
            C22361hds.OLrzqt(lottieAnimationView, CDNSourceManager.LottieSource.DEX_TRADE_SURPLUS_ORDER_SAVINGS);
        }
        InterfaceC9857bdW interfaceC9857bdW = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
        java.lang.String localizedNumber$default = C23322hvz.toLocalizedNumber$default(savingsOrderParamsOLrzqt.copydefault(), false, (RoundingMode) null, false, false, 11, (java.lang.Object) null);
        hHD hhd2 = this.djBIcL;
        if (hhd2 != null && (textView2 = hhd2.EZpvd) != null) {
            textView2.setText(Marker.ANY_NON_NULL_MARKER + localizedNumber$default + " " + savingsOrderParamsOLrzqt.AYXKKw());
        }
        java.lang.String strLocalizeFiatAmount$default = InterfaceC9857bdW.TaskDescription.localizeFiatAmount$default(interfaceC9857bdW, new BigDecimal(savingsOrderParamsOLrzqt.AhwBna()), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 46, null);
        hHD hhd3 = this.djBIcL;
        if (hhd3 == null || (textView = hhd3.AEQbTJ) == null) {
            return;
        }
        textView.setText("(≈" + strLocalizeFiatAmount$default + ")");
    }

    public final void gEmmrt() {
        SavingsOrderParams savingsOrderParamsOLrzqt = OLrzqt();
        if (savingsOrderParamsOLrzqt == null) {
            return;
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AkhnZx(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault(), 0);
        java.lang.String strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
        java.lang.String str = strDbNXlk == null ? "" : strDbNXlk;
        InterfaceC9857bdW interfaceC9857bdW = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
        java.lang.String str2 = Marker.ANY_NON_NULL_MARKER + C23322hvz.toLocalizedNumber$default(savingsOrderParamsOLrzqt.copydefault(), false, (RoundingMode) null, false, false, 11, (java.lang.Object) null) + " " + savingsOrderParamsOLrzqt.AYXKKw();
        BigDecimal bigDecimalFARcdN = C59443zhD.fARcdN(savingsOrderParamsOLrzqt.AhwBna());
        if (bigDecimalFARcdN == null) {
            bigDecimalFARcdN = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = bigDecimalFARcdN;
        Intrinsics.copydefault(bigDecimal);
        java.lang.String strOLrzqt = C23316hvt.OLrzqt(C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", 1), C56390yDp.OLrzqt("tokensUrl", savingsOrderParamsOLrzqt.djBIcL()), C56390yDp.OLrzqt("tokenSymbol", savingsOrderParamsOLrzqt.AYXKKw()), C56390yDp.OLrzqt("surplusAmount", str2), C56390yDp.OLrzqt("surplusUsdValue", Marker.ANY_NON_NULL_MARKER + InterfaceC9857bdW.TaskDescription.localizeFiatAmount$default(interfaceC9857bdW, bigDecimal, 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 46, null)), C56390yDp.OLrzqt("estReceiveAmount", C23322hvz.toLocalizedNumber$default(savingsOrderParamsOLrzqt.EZpvd(), false, (RoundingMode) null, false, false, 11, (java.lang.Object) null) + " " + savingsOrderParamsOLrzqt.AYXKKw()), C56390yDp.OLrzqt("actualReceiveAmount", C23322hvz.toLocalizedNumber$default(savingsOrderParamsOLrzqt.KWHzl(), false, (RoundingMode) null, false, false, 11, (java.lang.Object) null) + " " + savingsOrderParamsOLrzqt.AYXKKw()), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, AEQbTJ(savingsOrderParamsOLrzqt.OLrzqt() > 0 ? new Date(savingsOrderParamsOLrzqt.OLrzqt()) : new Date()))));
        java.lang.String string = getString(C23274hvD.Fragment.zDUObI);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String strEZpvd = ((xWP) C43251rlk.copydefault(xWP.class)).EZpvd(str);
        java.lang.String str3 = strEZpvd != null ? strEZpvd : "";
        gKZ gkz = gKZ.EZpvd;
        Web3ShareService.Application.shareByMiniProgram$default((Web3ShareService) C43251rlk.copydefault(Web3ShareService.class), this, "dex", "dex_surplus_share", 1, string, gkz.OLrzqt(gkz.AEQbTJ("dex/coin/detail"), C56390yDp.OLrzqt("chainId", savingsOrderParamsOLrzqt.AEQbTJ()), C56390yDp.OLrzqt("tokenContractAddress", savingsOrderParamsOLrzqt.valueOf()), C56390yDp.OLrzqt("ref", str3)), strOLrzqt, str, null, null, 768, null);
    }

    /* JADX INFO: renamed from: o.ikN$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C24782ikN KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C24782ikN c24782ikN) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c24782ikN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.startActivity(new android.content.Intent(this.KWHzl.requireContext(), (java.lang.Class<?>) ActivityC24781ikM.class));
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.ikN$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C24782ikN AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C24782ikN c24782ikN) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c24782ikN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.gEmmrt();
            }
        }
    }

    public final java.lang.String AEQbTJ(Date date) {
        java.lang.String string;
        java.lang.StringBuilder sb;
        java.lang.String str = new SimpleDateFormat("yyyy.MM.dd HH:mm", java.util.Locale.getDefault()).format(date);
        int offset = TimeZone.getDefault().getOffset(date.getTime());
        int i = offset / 3600000;
        int iAbs = java.lang.Math.abs((offset / 60000) % 60);
        if (iAbs == 0) {
            if (i >= 0) {
                sb = new java.lang.StringBuilder();
                sb.append("UTC+");
            } else {
                sb = new java.lang.StringBuilder();
                sb.append("UTC");
            }
            sb.append(i);
            string = sb.toString();
        } else if (i >= 0) {
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str2 = java.lang.String.format(java.util.Locale.US, TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iAbs)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            string = "UTC+" + i + ":" + str2;
        } else {
            C56529yIt c56529yIt2 = C56529yIt.KWHzl;
            java.lang.String str3 = java.lang.String.format(java.util.Locale.US, TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iAbs)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            string = "UTC" + i + ":" + str3;
        }
        return str + " (" + string + ")";
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }
}
