package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsClickAction;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iVu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C24124iVu extends iTJ {
    public boolean AYXKKw;
    public C23733iHh valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AhwBna = 8;
    public java.lang.String djBIcL = "";
    public java.lang.String values = "";
    public java.util.List<ProductDetailsClickAction.UiProductDetailsExtInfo> gEmmrt = yDY.AhwBna();
    public java.util.List<InvestBaseDefiTokenInfo> DbNXlk = yDY.AhwBna();
    public java.util.List<InvestUserRewardInfoByInvestment> fetchVPNInfo = yDY.AhwBna();

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.valueOf = C23733iHh.copydefault(getLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            java.lang.String string = arguments.getString("KEY_AMOUNT");
            if (string == null) {
                string = "";
            }
            this.djBIcL = string;
            this.AYXKKw = arguments.getBoolean("KEY_IS_ACTIVE");
            java.lang.String string2 = arguments.getString("KEY_SETTLEMENT_TIME");
            this.values = string2 != null ? string2 : "";
            java.util.List<ProductDetailsClickAction.UiProductDetailsExtInfo> parcelableArrayList = arguments.getParcelableArrayList("KEY_EXT_INFO_LIST");
            if (parcelableArrayList == null) {
                parcelableArrayList = yDY.AhwBna();
            }
            this.gEmmrt = parcelableArrayList;
            java.util.List<InvestBaseDefiTokenInfo> parcelableArrayList2 = arguments.getParcelableArrayList("KEY_ASSET_TOKEN_LIST");
            if (parcelableArrayList2 == null) {
                parcelableArrayList2 = yDY.AhwBna();
            }
            this.DbNXlk = parcelableArrayList2;
            java.util.List<InvestUserRewardInfoByInvestment> parcelableArrayList3 = arguments.getParcelableArrayList("KEY_ASSET_REWARD_LIST");
            if (parcelableArrayList3 == null) {
                parcelableArrayList3 = yDY.AhwBna();
            }
            this.fetchVPNInfo = parcelableArrayList3;
        }
        gEmmrt();
    }

    private final void gEmmrt() {
        C23733iHh c23733iHh = null;
        if (this.AYXKKw) {
            C23733iHh c23733iHh2 = this.valueOf;
            if (c23733iHh2 == null) {
                Intrinsics.gEmmrt("");
                c23733iHh2 = null;
            }
            c23733iHh2.valueOf.setText(getString(C25493ixk.FragmentManager.hCLrkq));
            C23733iHh c23733iHh3 = this.valueOf;
            if (c23733iHh3 == null) {
                Intrinsics.gEmmrt("");
                c23733iHh3 = null;
            }
            c23733iHh3.valueOf.setOKDSStyle(7);
        } else {
            C23733iHh c23733iHh4 = this.valueOf;
            if (c23733iHh4 == null) {
                Intrinsics.gEmmrt("");
                c23733iHh4 = null;
            }
            c23733iHh4.valueOf.setText(getString(C25493ixk.FragmentManager.DGOPHZDGOPHZ));
            C23733iHh c23733iHh5 = this.valueOf;
            if (c23733iHh5 == null) {
                Intrinsics.gEmmrt("");
                c23733iHh5 = null;
            }
            c23733iHh5.valueOf.setOKDSStyle(6);
        }
        C23733iHh c23733iHh6 = this.valueOf;
        if (c23733iHh6 == null) {
            Intrinsics.gEmmrt("");
            c23733iHh6 = null;
        }
        c23733iHh6.EZpvd.setText(this.djBIcL);
        C23733iHh c23733iHh7 = this.valueOf;
        if (c23733iHh7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23733iHh = c23733iHh7;
        }
        LinearLayoutCompat linearLayoutCompat = c23733iHh.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(this.AYXKKw ^ true ? 0 : 8);
        djBIcL();
        EZpvd();
        AhwBna();
    }

    public final void djBIcL() {
        for (ProductDetailsClickAction.UiProductDetailsExtInfo uiProductDetailsExtInfo : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(new ProductDetailsClickAction.UiProductDetailsExtInfo(requireContext().getString(C25493ixk.FragmentManager.DGgnkA), this.values, "TIMESTAMP")), (java.lang.Iterable) this.gEmmrt)) {
            android.view.LayoutInflater layoutInflater = getLayoutInflater();
            C23733iHh c23733iHh = this.valueOf;
            C23733iHh c23733iHh2 = null;
            if (c23733iHh == null) {
                Intrinsics.gEmmrt("");
                c23733iHh = null;
            }
            C23738iHm c23738iHmCopydefault = C23738iHm.copydefault(layoutInflater, c23733iHh.AEQbTJ, false);
            Intrinsics.checkNotNullExpressionValue(c23738iHmCopydefault, "");
            c23738iHmCopydefault.OLrzqt.setText(uiProductDetailsExtInfo.AEQbTJ());
            if (Intrinsics.EZpvd((java.lang.Object) uiProductDetailsExtInfo.OLrzqt(), (java.lang.Object) "TIMESTAMP")) {
                c23738iHmCopydefault.copydefault.setText(pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(uiProductDetailsExtInfo.KWHzl()) * ((long) 1000)), null, 1, null));
            } else {
                c23738iHmCopydefault.copydefault.setText(uiProductDetailsExtInfo.KWHzl());
            }
            C23733iHh c23733iHh3 = this.valueOf;
            if (c23733iHh3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23733iHh2 = c23733iHh3;
            }
            c23733iHh2.AEQbTJ.addView(c23738iHmCopydefault.getRoot());
        }
    }

    public final void EZpvd() {
        for (InvestBaseDefiTokenInfo investBaseDefiTokenInfo : this.DbNXlk) {
            android.view.LayoutInflater layoutInflater = getLayoutInflater();
            C23733iHh c23733iHh = this.valueOf;
            C23733iHh c23733iHh2 = null;
            if (c23733iHh == null) {
                Intrinsics.gEmmrt("");
                c23733iHh = null;
            }
            C23736iHk c23736iHkOLrzqt = C23736iHk.OLrzqt(layoutInflater, c23733iHh.AEQbTJ, false);
            Intrinsics.checkNotNullExpressionValue(c23736iHkOLrzqt, "");
            C27487jwC c27487jwC = C27487jwC.KWHzl;
            C27212jqt c27212jqt = c23736iHkOLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(c27212jqt, "");
            java.lang.String tokenLogo = investBaseDefiTokenInfo.getTokenLogo();
            if (tokenLogo == null) {
                tokenLogo = "";
            }
            c27487jwC.EZpvd(c27212jqt, C56402yEa.EZpvd(tokenLogo), (40 & 4) != 0 ? null : java.lang.Float.valueOf(20.0f), (40 & 8) != 0 ? 0.5f : 0.0f, (40 & 16) != 0 ? null : java.lang.Integer.valueOf(ContextCompat.getColor(requireContext(), C25493ixk.TaskDescription.OLrzqt)), (40 & 32) != 0 ? null : null);
            c23736iHkOLrzqt.AEQbTJ.setText(investBaseDefiTokenInfo.getTokenSymbol());
            android.widget.TextView textView = c23736iHkOLrzqt.djBIcL;
            C27488jwD c27488jwD = C27488jwD.copydefault;
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            java.lang.String coinAmount = investBaseDefiTokenInfo.getCoinAmount();
            textView.setText(c27488jwD.KWHzl(C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH, coinAmount == null ? "" : coinAmount, 6, 2, false, false, 24, null)));
            android.widget.TextView textView2 = c23736iHkOLrzqt.OLrzqt;
            java.lang.String currencyAmount = investBaseDefiTokenInfo.getCurrencyAmount();
            textView2.setText(c27488jwD.KWHzl(C27492jwH.formatCurrencyData$default(c27492jwH, currencyAmount == null ? "" : currencyAmount, null, null, null, 14, null)));
            C23733iHh c23733iHh3 = this.valueOf;
            if (c23733iHh3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23733iHh2 = c23733iHh3;
            }
            c23733iHh2.KWHzl.addView(c23736iHkOLrzqt.getRoot());
        }
    }

    /* JADX INFO: renamed from: o.iVu$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iVu.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C24124iVu copydefault(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull java.util.List<ProductDetailsClickAction.UiProductDetailsExtInfo> list, @NotNull java.util.List<InvestBaseDefiTokenInfo> list2, @NotNull java.util.List<InvestUserRewardInfoByInvestment> list3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            C24124iVu c24124iVu = new C24124iVu();
            c24124iVu.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_AMOUNT", str), C56390yDp.OLrzqt("KEY_IS_ACTIVE", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("KEY_SETTLEMENT_TIME", str2), C56390yDp.OLrzqt("KEY_EXT_INFO_LIST", new java.util.ArrayList(list)), C56390yDp.OLrzqt("KEY_ASSET_TOKEN_LIST", new java.util.ArrayList(list2)), C56390yDp.OLrzqt("KEY_ASSET_REWARD_LIST", new java.util.ArrayList(list3))));
            return c24124iVu;
        }
    }

    public final void AhwBna() {
        java.util.List<InvestUserRewardInfoByInvestment> list = this.fetchVPNInfo;
        java.util.ArrayList<InvestUserRewardElementInfo> arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List<InvestUserRewardElementInfo> baseDefiTokenInfos = ((InvestUserRewardInfoByInvestment) it.next()).getBaseDefiTokenInfos();
            if (baseDefiTokenInfos == null) {
                baseDefiTokenInfos = yDY.AhwBna();
            }
            C56406yEe.KWHzl(arrayList, baseDefiTokenInfos);
        }
        C23733iHh c23733iHh = this.valueOf;
        if (c23733iHh == null) {
            Intrinsics.gEmmrt("");
            c23733iHh = null;
        }
        android.widget.TextView textView = c23733iHh.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(arrayList.isEmpty() ^ true ? 0 : 8);
        C23733iHh c23733iHh2 = this.valueOf;
        if (c23733iHh2 == null) {
            Intrinsics.gEmmrt("");
            c23733iHh2 = null;
        }
        LinearLayoutCompat linearLayoutCompat = c23733iHh2.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(arrayList.isEmpty() ^ true ? 0 : 8);
        for (InvestUserRewardElementInfo investUserRewardElementInfo : arrayList) {
            android.view.LayoutInflater layoutInflater = getLayoutInflater();
            C23733iHh c23733iHh3 = this.valueOf;
            if (c23733iHh3 == null) {
                Intrinsics.gEmmrt("");
                c23733iHh3 = null;
            }
            C23736iHk c23736iHkOLrzqt = C23736iHk.OLrzqt(layoutInflater, c23733iHh3.AhwBna, false);
            Intrinsics.checkNotNullExpressionValue(c23736iHkOLrzqt, "");
            C27487jwC c27487jwC = C27487jwC.KWHzl;
            C27212jqt c27212jqt = c23736iHkOLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(c27212jqt, "");
            java.lang.String tokenLogo = investUserRewardElementInfo.getTokenLogo();
            if (tokenLogo == null) {
                tokenLogo = "";
            }
            c27487jwC.EZpvd(c27212jqt, C56402yEa.EZpvd(tokenLogo), (40 & 4) != 0 ? null : java.lang.Float.valueOf(20.0f), (40 & 8) != 0 ? 0.5f : 0.0f, (40 & 16) != 0 ? null : java.lang.Integer.valueOf(ContextCompat.getColor(requireContext(), C25493ixk.TaskDescription.OLrzqt)), (40 & 32) != 0 ? null : null);
            c23736iHkOLrzqt.AEQbTJ.setText(investUserRewardElementInfo.getTokenSymbol());
            android.widget.TextView textView2 = c23736iHkOLrzqt.djBIcL;
            C27488jwD c27488jwD = C27488jwD.copydefault;
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            java.lang.String coinAmount = investUserRewardElementInfo.getCoinAmount();
            textView2.setText(c27488jwD.KWHzl(C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH, coinAmount == null ? "" : coinAmount, 6, 2, false, false, 24, null)));
            android.widget.TextView textView3 = c23736iHkOLrzqt.OLrzqt;
            java.lang.String currencyAmount = investUserRewardElementInfo.getCurrencyAmount();
            textView3.setText(c27488jwD.KWHzl(C27492jwH.formatCurrencyData$default(c27492jwH, currencyAmount == null ? "" : currencyAmount, null, null, null, 14, null)));
            C23733iHh c23733iHh4 = this.valueOf;
            if (c23733iHh4 == null) {
                Intrinsics.gEmmrt("");
                c23733iHh4 = null;
            }
            c23733iHh4.AhwBna.addView(c23736iHkOLrzqt.getRoot());
        }
    }
}
