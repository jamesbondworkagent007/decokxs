package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.okinc.business.defi.api.bean.ReserveBean;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.constant.KYSAssetType;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.net.bean.Asset;
import com.okinc.business.defi.biz.net.bean.ExposureInfo;
import com.okinc.business.defi.biz.net.bean.Intention;
import com.okinc.business.defi.biz.net.bean.KYSPreTxCheckInfo;
import com.okinc.business.defi.biz.net.bean.Spender;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.wallet.api.bean.WalletRechargeResult;
import com.okinc.web.WebActivity;
import com.okinc.web3Uilib.bean.TransactionAddressInfoBean;
import com.okinc.web3Uilib.bean.TransactionAssetInfoBean;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.AbstractC8601bFm;
import o.C13754dXa;
import o.C52761wXj;
import o.C55284xgz;
import o.C57406yhn;
import o.C8475bDS;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.gbU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C20150gbU<T extends AbstractC8601bFm<?, ?>> extends AbstractC20080gaD<T> {
    public Function0<Unit> AubY;
    public Function0<Unit> AwvSrB;
    public InterfaceC58217yxC AxsJAY;
    public android.widget.TextView getFieldNames;
    public C57457yil getNewProxyInstance;
    public C57466yiu hDKMBd;
    public android.widget.TextView uzCIH;
    public C57422yiC wlaJM;
    public C57422yiC zLjUOn;
    public Function0<Unit> zsXlph;
    public final InterfaceC56387yDm sSMYrx = C56392yDr.copydefault(new Function0() { // from class: o.gbT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C20150gbU.AkhnZx(this.OLrzqt);
        }
    });
    public boolean iwGUEr = true;
    public boolean AuCTelauCTel = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull C57466yiu c57466yiu) {
        Intrinsics.checkNotNullParameter(c57466yiu, "");
        this.hDKMBd = c57466yiu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AwvSrB = function0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC8601bFm gEmmrt(C20150gbU c20150gbU) {
        return (AbstractC8601bFm) c20150gbU.ejfBZ();
    }

    public final eUI UeEOUB() {
        return (eUI) this.sSMYrx.getValue();
    }

    public static final eUI AkhnZx(C20150gbU c20150gbU) {
        FragmentActivity fragmentActivityRequireActivity = c20150gbU.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (eUI) new ViewModelProvider(fragmentActivityRequireActivity).get(eUI.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    @Override // o.AbstractC20082gaF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(@NotNull AbstractC20082gaF<T>.ActionBar actionBar, boolean z) {
        java.lang.String intentionTypeIconUrlDay;
        Intrinsics.checkNotNullParameter(actionBar, "");
        KYSPreTxCheckInfo kYSPreTxCheckInfoAb_ = ejfBZ().ab_();
        Intention contractIntention = kYSPreTxCheckInfoAb_ != null ? kYSPreTxCheckInfoAb_.getContractIntention() : null;
        if (C33492mxV.OLrzqt()) {
            intentionTypeIconUrlDay = contractIntention != null ? contractIntention.getIntentionTypeIconUrlNight() : null;
        } else if (contractIntention != null) {
            intentionTypeIconUrlDay = contractIntention.getIntentionTypeIconUrlDay();
        }
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C13754dXa.Activity.ixgjPv);
        java.lang.String intentionTypeLanguageText = contractIntention != null ? contractIntention.getIntentionTypeLanguageText() : null;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getAutoTimeNightModeManager);
        if (intentionTypeLanguageText == null || intentionTypeLanguageText.length() == 0) {
            intentionTypeLanguageText = strAYXKKw;
        }
        PlatformItem dapp = ejfBZ().OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        C57431yiL c57431yiLTitleInfoView$default = AbstractC20102gaZ.titleInfoView$default(this, intentionTypeIconUrlDay, intentionTypeLanguageText, null, urlOnlyHost == null ? "" : urlOnlyHost, null, drawableKWHzl, null, 84, null);
        actionBar.OLrzqt(c57431yiLTitleInfoView$default);
        final boolean zAl_ = ejfBZ().al_();
        int iEZpvd = actionBar.EZpvd();
        if (zAl_) {
            actionBar.OLrzqt(RcXXUw());
        }
        actionBar.OLrzqt(finit());
        actionBar.OLrzqt(dxcTrN());
        if (actionBar.EZpvd() > iEZpvd) {
            actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        } else if (kYSPreTxCheckInfoAb_ == null) {
            c57431yiLTitleInfoView$default.setSubChildTitleInfo(C33070mpX.AYXKKw(C13754dXa.FragmentManager.doInvalidatePanelMenu));
        } else if (Intrinsics.EZpvd((java.lang.Object) (contractIntention != null ? contractIntention.getSupportIntentionFlag() : null), (java.lang.Object) "UNKNOWN")) {
        }
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(EZpvd());
        if (zAl_) {
            java.util.List<ExposureInfo> exposures = kYSPreTxCheckInfoAb_ != null ? kYSPreTxCheckInfoAb_.getExposures() : null;
            if (exposures != null) {
                for (ExposureInfo exposureInfo : exposures) {
                    actionBar.OLrzqt(copydefault(exposureInfo != null ? exposureInfo.getSpenderKey() : null));
                }
            }
        }
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
        actionBar.OLrzqt(djSkpj());
        actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.gce
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20150gbU.EZpvd(zAl_, this, (AbstractC20082gaF.ActionBar) obj);
            }
        }, 3, null));
    }

    public static final Unit EZpvd(boolean z, C20150gbU c20150gbU, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (z) {
            actionBar.EZpvd(c20150gbU.dvKsVJ());
        }
        c20150gbU.valueOf(actionBar);
        Unit unit = Unit.INSTANCE;
        actionBar.KWHzl(unit);
        return unit;
    }

    public final C57466yiu aKErDB() {
        C57466yiu c57466yiu = this.hDKMBd;
        if (c57466yiu != null) {
            return c57466yiu;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final android.view.View RcXXUw() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57466yiu c57466yiu = new C57466yiu(contextRequireContext, null, 0, 6, null);
        EZpvd(c57466yiu);
        fZBcTu();
        return c57466yiu;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01aa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fZBcTu() {
        java.lang.String strSubstring;
        int iValueOf;
        int i;
        int iDTwDnp;
        java.lang.String str;
        java.lang.String strEZpvd;
        java.lang.String address;
        java.lang.Long chainId;
        java.lang.Integer decimals;
        KYSPreTxCheckInfo kYSPreTxCheckInfoAb_ = ejfBZ().ab_();
        if (kYSPreTxCheckInfoAb_ == null) {
            return;
        }
        java.util.List<ExposureInfo> exposures = kYSPreTxCheckInfoAb_.getExposures();
        if (exposures.isEmpty()) {
            return;
        }
        C57466yiu c57466yiuAKErDB = aKErDB();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(exposures, 10));
        for (ExposureInfo exposureInfo : exposures) {
            Asset asset = exposureInfo.getAsset();
            Spender spenderValue = exposureInfo.getSpenderValue();
            java.lang.String strCopydefault = "";
            if (spenderValue == null || (strSubstring = spenderValue.getApprovalRaw()) == null) {
                strSubstring = "";
            }
            boolean zStartsWith$default = C59449zhJ.startsWith$default(strSubstring, "-", false, 2, null);
            if (asset == null || (decimals = asset.getDecimals()) == null) {
                if (asset != null) {
                    java.lang.Integer assetType = asset.getAssetType();
                    int value = KYSAssetType.NFT_TYPE.getValue();
                    if (assetType != null && assetType.intValue() == value) {
                        i = 0;
                        if (!C33129mqd.OLrzqt((java.lang.CharSequence) (asset == null ? asset.getAddress() : null))) {
                            C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
                            if (asset == null || (address = asset.getAddress()) == null) {
                                address = "";
                            }
                            C10854bwM c10854bwMEZpvd = c10948byAValueOf.EZpvd(address, (asset == null || (chainId = asset.getChainId()) == null) ? -1L : chainId.longValue());
                            iDTwDnp = c10854bwMEZpvd != null ? c10854bwMEZpvd.DTwDnp() : 8;
                        }
                        int i2 = iDTwDnp;
                        boolean z = true;
                        if (zStartsWith$default) {
                            strSubstring = strSubstring.substring(1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        }
                        str = strSubstring;
                        if (!C59449zhJ.gEmmrt(str, "0x0", true)) {
                            strEZpvd = "0";
                            z = false;
                        } else if (str.length() == 0) {
                            strEZpvd = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
                        } else if (C9700baY.EZpvd(str)) {
                            java.lang.String strOLrzqt = C33491mxU.OLrzqt(str);
                            if (!C33129mqd.AEQbTJ(strOLrzqt, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, 13)))) {
                                strEZpvd = C54870xYj.EZpvd(strOLrzqt, i, i2, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                                z = false;
                            } else {
                                strEZpvd = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
                                z = true;
                            }
                        } else if (!C33129mqd.AEQbTJ(str, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, 13)))) {
                            strEZpvd = C54870xYj.EZpvd(str, i, i2, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                            z = false;
                        } else {
                            strEZpvd = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
                            z = true;
                        }
                        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                        spannableStringBuilder.append((java.lang.CharSequence) strEZpvd);
                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(!z ? C52761wXj.Activity.DTeKQX : C52761wXj.Activity.fdOvFl)), 0, strEZpvd.length(), 17);
                        Unit unit = Unit.INSTANCE;
                        android.text.SpannedString spannedString = new android.text.SpannedString(spannableStringBuilder);
                        java.lang.String symbol = asset != null ? asset.getSymbol() : null;
                        java.lang.String strAYXKKw = (symbol != null || symbol.length() == 0) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor) : symbol;
                        if (!C33129mqd.OLrzqt((java.lang.CharSequence) exposureInfo.getExpiration())) {
                            int i3 = C13754dXa.FragmentManager.PickVisualMediaRequestdefault;
                            java.lang.String expiration = exposureInfo.getExpiration();
                            Intrinsics.copydefault((java.lang.Object) expiration);
                            strCopydefault = C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", expiration)));
                        }
                        arrayList.add(new TransactionAssetInfoBean.AssetSimpleDataBean(null, null, spannedString, strAYXKKw, strCopydefault, null, null, 99, null));
                    }
                }
                iValueOf = ejfBZ().dHguZz().valueOf();
            } else {
                iValueOf = decimals.intValue();
            }
            i = iValueOf;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) (asset == null ? asset.getAddress() : null))) {
            }
            int i22 = iDTwDnp;
            boolean z2 = true;
            if (zStartsWith$default) {
            }
            str = strSubstring;
            if (!C59449zhJ.gEmmrt(str, "0x0", true)) {
            }
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
            spannableStringBuilder2.append((java.lang.CharSequence) strEZpvd);
            spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(!z2 ? C52761wXj.Activity.DTeKQX : C52761wXj.Activity.fdOvFl)), 0, strEZpvd.length(), 17);
            Unit unit2 = Unit.INSTANCE;
            android.text.SpannedString spannedString2 = new android.text.SpannedString(spannableStringBuilder2);
            if (asset != null) {
            }
            if (symbol != null) {
            }
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) exposureInfo.getExpiration())) {
            }
            arrayList.add(new TransactionAssetInfoBean.AssetSimpleDataBean(null, null, spannedString2, strAYXKKw, strCopydefault, null, null, 99, null));
        }
        c57466yiuAKErDB.setViewDataBean(new TransactionAssetInfoBean(arrayList, 0, C33070mpX.AYXKKw(C13754dXa.FragmentManager.search), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRoot), C33070mpX.AYXKKw(C57406yhn.ActionBar.OLrzqt), null, null, 98, null));
    }

    public final java.util.List<android.view.View> dvKsVJ() {
        java.lang.String address;
        KYSPreTxCheckInfo kYSPreTxCheckInfoAb_ = ejfBZ().ab_();
        if (kYSPreTxCheckInfoAb_ == null) {
            return yDY.AhwBna();
        }
        java.util.List<ExposureInfo> exposures = kYSPreTxCheckInfoAb_.getExposures();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(exposures, 10));
        java.util.Iterator<T> it = exposures.iterator();
        while (it.hasNext()) {
            Asset asset = ((ExposureInfo) it.next()).getAsset();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            final C57457yil c57457yil = new C57457yil(contextRequireContext, null, 0, 6, null);
            final java.lang.String str = (asset == null || (address = asset.getAddress()) == null) ? "" : address;
            java.lang.String symbol = asset != null ? asset.getSymbol() : null;
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
            if (symbol == null || symbol.length() == 0) {
                symbol = strAYXKKw;
            }
            c57457yil.setViewDataBean(new TransactionAddressInfoBean(C33069mpW.copydefault(C13754dXa.FragmentManager.sGvRiA, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", symbol))), str, (java.lang.String) null, (java.lang.String) null, true, new Function0() { // from class: o.gcd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20150gbU.valueOf(c57457yil, str);
                }
            }, (java.lang.String) null, false, (Function0) null, 460, (DefaultConstructorMarker) null));
            arrayList.add(c57457yil);
        }
        return arrayList;
    }

    public static final Unit valueOf(C57457yil c57457yil, java.lang.String str) {
        java.lang.Object systemService = c57457yil.getContext().getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return Unit.INSTANCE;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), str).KWHzl(c57457yil.getContext());
        return Unit.INSTANCE;
    }

    public final C57422yiC finit() {
        Function0<Unit> function0 = new Function0() { // from class: o.gcb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20150gbU.fetchVPNInfo(this.AEQbTJ);
            }
        };
        this.AubY = function0;
        java.util.List<TransactionHeaderInfoBean.HeaderSimpleDataBean> listAEQbTJ = AEQbTJ(true, false, function0);
        if (listAEQbTJ == null || listAEQbTJ.isEmpty()) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57422yiC c57422yiC = new C57422yiC(contextRequireContext, null, 0, 6, null);
        this.zLjUOn = c57422yiC;
        EZpvd(listAEQbTJ);
        return c57422yiC;
    }

    public static final Unit fetchVPNInfo(C20150gbU c20150gbU) {
        c20150gbU.EZpvd(c20150gbU.AEQbTJ(true, c20150gbU.iwGUEr, c20150gbU.AubY));
        c20150gbU.iwGUEr = !c20150gbU.iwGUEr;
        C57422yiC c57422yiC = c20150gbU.wlaJM;
        if (c57422yiC != null) {
            c57422yiC.requestLayout();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gbU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updatePayView$default(C20150gbU c20150gbU, java.util.List list, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updatePayView");
        }
        if ((i & 1) != 0) {
            list = c20150gbU.AEQbTJ(true, c20150gbU.iwGUEr, c20150gbU.AubY);
        }
        c20150gbU.EZpvd((java.util.List<TransactionHeaderInfoBean.HeaderSimpleDataBean>) list);
    }

    public final void EZpvd(java.util.List<TransactionHeaderInfoBean.HeaderSimpleDataBean> list) {
        C57422yiC c57422yiC = this.zLjUOn;
        if (c57422yiC != null) {
            c57422yiC.setViewDataBean(new TransactionHeaderInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ArkbYM), list, false, null, null, null, null, 124, null));
        }
    }

    public final C57422yiC dxcTrN() {
        Function0<Unit> function0 = new Function0() { // from class: o.gbY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20150gbU.values(this.OLrzqt);
            }
        };
        this.zsXlph = function0;
        java.util.List<TransactionHeaderInfoBean.HeaderSimpleDataBean> listAEQbTJ = AEQbTJ(false, false, function0);
        if (listAEQbTJ == null || listAEQbTJ.isEmpty()) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57422yiC c57422yiC = new C57422yiC(contextRequireContext, null, 0, 6, null);
        this.wlaJM = c57422yiC;
        AEQbTJ(listAEQbTJ);
        return c57422yiC;
    }

    public static final Unit values(C20150gbU c20150gbU) {
        c20150gbU.AEQbTJ(c20150gbU.AEQbTJ(false, c20150gbU.AuCTelauCTel, c20150gbU.zsXlph));
        c20150gbU.AuCTelauCTel = !c20150gbU.AuCTelauCTel;
        C57422yiC c57422yiC = c20150gbU.zLjUOn;
        if (c57422yiC != null) {
            c57422yiC.requestLayout();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gbU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateReceiveView$default(C20150gbU c20150gbU, java.util.List list, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateReceiveView");
        }
        if ((i & 1) != 0) {
            list = c20150gbU.AEQbTJ(false, c20150gbU.AuCTelauCTel, c20150gbU.zsXlph);
        }
        c20150gbU.AEQbTJ((java.util.List<TransactionHeaderInfoBean.HeaderSimpleDataBean>) list);
    }

    public final void AEQbTJ(java.util.List<TransactionHeaderInfoBean.HeaderSimpleDataBean> list) {
        C57422yiC c57422yiC = this.wlaJM;
        if (c57422yiC != null) {
            c57422yiC.setViewDataBean(new TransactionHeaderInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sjbWxX), list, false, null, null, null, null, 124, null));
        }
    }

    public final java.util.List<TransactionHeaderInfoBean.HeaderSimpleDataBean> AEQbTJ(boolean z, boolean z2, Function0<Unit> function0) {
        int i;
        java.util.List<AbstractC8601bFm<Fee, SignData>.Activity> listOLrzqt = ejfBZ().OLrzqt(z);
        if (listOLrzqt == null || listOLrzqt.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (it.hasNext()) {
            AbstractC8601bFm.Activity activity = (AbstractC8601bFm.Activity) it.next();
            int iDpInt$default = C55298xhM.dpInt$default(activity.copydefault() ? 4 : 16, (android.content.Context) null, 1, (java.lang.Object) null);
            java.lang.Object objEZpvd = activity.EZpvd();
            C14726dqr c14726dqr = C14726dqr.OLrzqt;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            android.graphics.drawable.Drawable drawableOLrzqt = c14726dqr.OLrzqt(contextRequireContext);
            java.lang.String strAEQbTJ = activity.AEQbTJ();
            java.lang.String strKWHzl = activity.KWHzl();
            if (strKWHzl.length() == 0) {
                strKWHzl = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
            }
            arrayList2.add(new TransactionHeaderInfoBean.HeaderSimpleDataBean(0, 0.0f, iDpInt$default, 0, objEZpvd, null, drawableOLrzqt, null, strAEQbTJ, strKWHzl, true, activity.OLrzqt(), null, null, 0, null, null, null, null, null, 1044650, null));
        }
        if (arrayList2.size() > 3) {
            if (!z2) {
                arrayList2 = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList2, 3);
            }
            arrayList.addAll(arrayList2);
            float f = z2 ? 180.0f : 0.0f;
            if (z2) {
                i = C13754dXa.FragmentManager.getRoot;
            } else {
                i = C13754dXa.FragmentManager.search;
            }
            arrayList.add(new TransactionHeaderInfoBean.HeaderSimpleDataBean(1, f, 0, 0, null, null, null, null, null, null, false, null, null, null, 0, null, null, function0, null, C33070mpX.AYXKKw(i), 393212, null));
        } else {
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public final android.view.View djSkpj() {
        java.lang.String strZLjUOn;
        final java.lang.String str;
        if (ejfBZ() instanceof C9024bNl) {
            T tEjfBZ = ejfBZ();
            Intrinsics.copydefault(tEjfBZ, "");
            C9024bNl c9024bNl = (C9024bNl) tEjfBZ;
            if (!c9024bNl.QXDzTk()) {
                strZLjUOn = c9024bNl.RVsVBY();
            } else {
                str = null;
                if (str != null || str.length() == 0) {
                    return null;
                }
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                final C57457yil c57457yil = new C57457yil(contextRequireContext, null, 0, 6, null);
                c57457yil.setViewDataBean(new TransactionAddressInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDrawerSlideAnimationEnabled), str, (java.lang.String) null, (java.lang.String) null, true, new Function0() { // from class: o.gbS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C20150gbU.KWHzl(this.OLrzqt, c57457yil, str);
                    }
                }, (java.lang.String) null, false, (Function0) null, 460, (DefaultConstructorMarker) null));
                return c57457yil;
            }
        } else {
            strZLjUOn = ejfBZ().zLjUOn();
        }
        str = strZLjUOn;
        if (str != null) {
        }
        return null;
    }

    public static final Unit KWHzl(C20150gbU c20150gbU, C57457yil c57457yil, java.lang.String str) {
        c20150gbU.copydefault();
        java.lang.Object systemService = c57457yil.getContext().getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return Unit.INSTANCE;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), str).KWHzl(c57457yil.getContext());
        return Unit.INSTANCE;
    }

    public final android.view.View copydefault(final java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final C57457yil c57457yil = new C57457yil(contextRequireContext, null, 0, 6, null);
        this.getNewProxyInstance = c57457yil;
        c57457yil.setViewDataBean(new TransactionAddressInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.dHAKvv), str, (java.lang.String) null, (java.lang.String) null, true, new Function0() { // from class: o.gcg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20150gbU.OLrzqt(c57457yil, str);
            }
        }, (java.lang.String) null, false, (Function0) null, 460, (DefaultConstructorMarker) null));
        return c57457yil;
    }

    public static final Unit OLrzqt(C57457yil c57457yil, java.lang.String str) {
        java.lang.Object systemService = c57457yil.getContext().getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return Unit.INSTANCE;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), str).KWHzl(c57457yil.getContext());
        return Unit.INSTANCE;
    }

    public final void valueOf(@NotNull AbstractC20082gaF<T>.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        java.lang.String strAEQbTJ = ejfBZ().AEQbTJ(true);
        if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
            return;
        }
        java.lang.String strZ_ = ejfBZ().Z_();
        if (strZ_ == null || strZ_.length() == 0) {
            actionBar.copydefault(AbstractC20102gaZ.normalDataInMoreView$default(this, null, strAEQbTJ, 1, null));
        } else {
            actionBar.OLrzqt(dNCPSb());
        }
    }

    /* JADX INFO: renamed from: o.gbU$Activity */
    public static final class Activity extends PagerAdapter {
        public final /* synthetic */ C20150gbU<T> KWHzl;

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return 2;
        }

        public Activity(C20150gbU<T> c20150gbU) {
            this.KWHzl = c20150gbU;
        }

        public final android.widget.TextView KWHzl(int i) {
            java.lang.String strAEQbTJ;
            AppCompatTextView appCompatTextViewKWHzl = this.KWHzl.KWHzl((java.lang.String) null);
            appCompatTextViewKWHzl.setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0);
            ViewPager.LayoutParams layoutParams = new ViewPager.LayoutParams();
            ((ViewGroup.LayoutParams) layoutParams).height = -2;
            appCompatTextViewKWHzl.setLayoutParams(layoutParams);
            if (i == 0) {
                this.KWHzl.uzCIH = appCompatTextViewKWHzl;
                strAEQbTJ = C20150gbU.gEmmrt((C20150gbU) this.KWHzl).AEQbTJ(true);
            } else if (i != 1) {
                strAEQbTJ = "";
            } else {
                this.KWHzl.getFieldNames = appCompatTextViewKWHzl;
                strAEQbTJ = C20150gbU.gEmmrt((C20150gbU) this.KWHzl).Z_();
            }
            appCompatTextViewKWHzl.setText(strAEQbTJ);
            return appCompatTextViewKWHzl;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            if (i != 0) {
                return i != 1 ? "" : C33070mpX.AYXKKw(C13754dXa.FragmentManager.sanitizeWindowFeatureId);
            }
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialDPHOMC);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return Intrinsics.EZpvd(view, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.widget.TextView textViewKWHzl = KWHzl(i);
            viewGroup.addView(textViewKWHzl);
            return textViewKWHzl;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(obj, "");
            android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
            if (view == null) {
                return;
            }
            viewGroup.removeView(view);
        }
    }

    public final android.view.View dNCPSb() {
        Activity activity = new Activity(this);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57432yiM c57432yiM = new C57432yiM(contextRequireContext, null, 0, 6, null);
        c57432yiM.setViewDataBean(new C57411yhs(activity));
        return c57432yiM;
    }

    @Override // o.AbstractC20102gaZ
    public void EZpvd(java.lang.String str) {
        super.EZpvd(str);
        android.widget.TextView textView = this.uzCIH;
        if (textView != null) {
            textView.setText(str);
        }
        android.widget.TextView textView2 = this.getFieldNames;
        if (textView2 != null) {
            textView2.setText(ejfBZ().Z_());
        }
    }

    @Override // o.AbstractC20082gaF, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        if (ejfBZ().QUSxYX() || this.zLjUOn == null) {
            return;
        }
        ejfBZ().DarRvM().OLrzqt(new Application(this));
    }

    /* JADX INFO: renamed from: o.gbU$Application */
    public static final class Application implements C8475bDS.ActionBar {
        public final /* synthetic */ C20150gbU<T> copydefault;

        public Application(C20150gbU<T> c20150gbU) {
            this.copydefault = c20150gbU;
        }

        @Override // o.C8475bDS.ActionBar
        public void OLrzqt(java.util.List<WalletTickerManager.CoinPrice> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C20150gbU.updatePayView$default(this.copydefault, null, 1, null);
        }
    }

    @Override // o.AbstractC20080gaD
    public void KWHzl(@NotNull AbstractC8426bCW<?> abstractC8426bCW, @NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(abstractC8426bCW, "");
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        if (ejfBZ().UlJrfe().copydefault(C56524yIo.AEQbTJ(C9868bdh.class))) {
            OLrzqt();
        } else {
            super.KWHzl(abstractC8426bCW, c8486bDd);
        }
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r6v25. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r17v3, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r17v4, types: [kotlin.jvm.functions.Function0] */
    @Override // o.AbstractC20080gaD, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) throws CoinMetaError {
        java.lang.String strCopydefault;
        java.util.ArrayList arrayList;
        ?? r11;
        C10854bwM c10854bwMDHguZz;
        C10854bwM c10854bwMDHguZz2;
        java.lang.String strAYXKKw;
        android.widget.TextView textViewCopydefault;
        android.widget.TextView textViewCopydefault2;
        java.util.Collection<AbstractC9832bcy> collectionValues;
        strCopydefault = "";
        Intrinsics.checkNotNullParameter(collection, "");
        fXW fxwAkhnZx = AkhnZx();
        FragmentActivity activity = getActivity();
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        java.util.HashMap<java.lang.String, AbstractC9832bcy> mapEZpvd = ejfBZ().UlJrfe().EZpvd(3);
        java.lang.Object objFJNWhG = null;
        if (mapEZpvd == null || (collectionValues = mapEZpvd.values()) == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : collectionValues) {
                if (!((AbstractC9832bcy) obj).AhwBna()) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        fxwAkhnZx.AEQbTJ(activity, parentFragmentManager, arrayList, ejfBZ().aUsmxb(), !(ejfBZ() instanceof C9216bRR), new Function0() { // from class: o.gcm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20150gbU.AhwBna(this.OLrzqt);
            }
        });
        java.util.Collection<? extends AbstractC9832bcy> collection2 = collection;
        final AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection2);
        if (abstractC9832bcy == null) {
            AbstractC20102gaZ.updateReminder$default(this, null, 1, null);
        } else if (abstractC9832bcy instanceof C9868bdh) {
            if (!ejfBZ().dHguZz().fARcdN() || Intrinsics.EZpvd(((C9868bdh) abstractC9832bcy).KWHzl(), java.lang.Boolean.TRUE)) {
                OLrzqt();
            } else {
                AbstractC8426bCW<?> abstractC8426bCWQKudOq = ejfBZ().QKudOq();
                copydefault(abstractC8426bCWQKudOq, abstractC8426bCWQKudOq.KWHzl());
            }
            java.lang.String strAEQbTJ = ((C9868bdh) abstractC9832bcy).AEQbTJ();
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, strAEQbTJ == null ? "" : strAEQbTJ, (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
        } else if (abstractC9832bcy instanceof C9876bdp) {
            C9876bdp c9876bdp = (C9876bdp) abstractC9832bcy;
            int i = c9876bdp.OLrzqt() ? C13754dXa.FragmentManager.MediaDescriptionCompat1 : C13754dXa.FragmentManager.setMediaId;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = C56390yDp.OLrzqt("approved_address", C14079deg.getAddressStr$default(C14079deg.EZpvd, c9876bdp.KWHzl(), false, 2, null));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) c9876bdp.AEQbTJ())) {
                strAYXKKw = c9876bdp.AEQbTJ();
                Intrinsics.copydefault((java.lang.Object) strAYXKKw);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setIconUri);
            }
            pairArr[1] = C56390yDp.OLrzqt("approved_asset", strAYXKKw);
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
        } else if (abstractC9832bcy instanceof C9826bcs) {
            java.lang.String strCopydefault2 = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", ejfBZ().QKudOq().KWHzl().getFeeCoinMeta().fJNWhG())));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((C9826bcs) abstractC9832bcy).KWHzl())) {
                strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getValue);
                objFJNWhG = new Function0() { // from class: o.gcq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C20150gbU.AEQbTJ(abstractC9832bcy, this);
                    }
                };
            }
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, (java.lang.CharSequence) strCopydefault2, (java.lang.CharSequence) strCopydefault, (Function0) objFJNWhG, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
        } else {
            boolean z = abstractC9832bcy instanceof C9786bcE;
            if (z || (abstractC9832bcy instanceof C9784bcC)) {
                final C10854bwM c10854bwMAYXKKw = ejfBZ().QKudOq().AYXKKw();
                Function0 function0 = new Function0() { // from class: o.gcr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C20150gbU.KWHzl(this.copydefault, c10854bwMAYXKKw);
                    }
                };
                if (z) {
                    KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.apLTlu, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", c10854bwMAYXKKw.fJNWhG()))), C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", c10854bwMAYXKKw.fJNWhG()))), function0, C33069mpW.copydefault(C13754dXa.FragmentManager.iMXFZQ, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", c10854bwMAYXKKw.fJNWhG()))), new Function0() { // from class: o.gcu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C20150gbU.OLrzqt(this.OLrzqt, c10854bwMAYXKKw, abstractC9832bcy);
                        }
                    }, 1, (DefaultConstructorMarker) null));
                } else if (abstractC9832bcy instanceof C9784bcC) {
                    C8486bDd c8486bDdKWHzl = ejfBZ().QKudOq().KWHzl();
                    java.lang.String strFJNWhG = c8486bDdKWHzl.getFeeCoinMeta().fJNWhG();
                    C9784bcC c9784bcC = (C9784bcC) abstractC9832bcy;
                    java.lang.String strCopydefault3 = c9784bcC.copydefault();
                    if (strCopydefault3 == null || strCopydefault3.length() == 0) {
                        if (!(c8486bDdKWHzl instanceof C9215bRQ)) {
                            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.onFitSystemWindows, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG)));
                        } else {
                            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG)));
                        }
                    } else {
                        java.lang.String strCopydefault4 = c9784bcC.copydefault();
                        if (strCopydefault4 != null) {
                            r11 = strCopydefault4;
                        }
                        KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, (java.lang.CharSequence) r11, C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", c10854bwMAYXKKw.fJNWhG()))), function0, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
                    }
                    r11 = strCopydefault;
                    KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, (java.lang.CharSequence) r11, C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", c10854bwMAYXKKw.fJNWhG()))), function0, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
                }
            } else if (abstractC9832bcy instanceof C9828bcu) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((C9828bcu) abstractC9832bcy).KWHzl())) {
                    strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getValue);
                    objFJNWhG = new Function0() { // from class: o.gct
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C20150gbU.KWHzl(abstractC9832bcy, this);
                        }
                    };
                }
                KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, (java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DQYQgr), (java.lang.CharSequence) strCopydefault, (Function0) objFJNWhG, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            } else if (abstractC9832bcy instanceof C9808bca) {
                KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DQYQgr), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ggKfIT), new Function0() { // from class: o.gcs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C20150gbU.isConnected(this.copydefault);
                    }
                }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            } else if (abstractC9832bcy instanceof C9879bds) {
                int i2 = C13754dXa.FragmentManager.reopenMenu;
                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                T tEjfBZ = ejfBZ();
                InterfaceC9462bVz interfaceC9462bVz = tEjfBZ instanceof InterfaceC9462bVz ? (InterfaceC9462bVz) tEjfBZ : null;
                java.lang.String strOLrzqt = interfaceC9462bVz != null ? interfaceC9462bVz.OLrzqt(true, false) : null;
                if (strOLrzqt == null) {
                    strOLrzqt = "";
                }
                pairArr2[0] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, strOLrzqt);
                T tEjfBZ2 = ejfBZ();
                InterfaceC9462bVz interfaceC9462bVz2 = tEjfBZ2 instanceof InterfaceC9462bVz ? (InterfaceC9462bVz) tEjfBZ2 : null;
                if (interfaceC9462bVz2 != null && (c10854bwMDHguZz2 = interfaceC9462bVz2.dHguZz()) != null) {
                    objFJNWhG = c10854bwMDHguZz2.fJNWhG();
                }
                pairArr2[1] = C56390yDp.OLrzqt("token", objFJNWhG != null ? objFJNWhG : "");
                KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr2)), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            } else if (abstractC9832bcy instanceof C9878bdr) {
                int i3 = C13754dXa.FragmentManager.onKeyDownPanel;
                kotlin.Pair[] pairArr3 = new kotlin.Pair[2];
                T tEjfBZ3 = ejfBZ();
                InterfaceC9462bVz interfaceC9462bVz3 = tEjfBZ3 instanceof InterfaceC9462bVz ? (InterfaceC9462bVz) tEjfBZ3 : null;
                java.lang.String strCopydefault5 = interfaceC9462bVz3 != null ? interfaceC9462bVz3.copydefault(true, false) : null;
                if (strCopydefault5 == null) {
                    strCopydefault5 = "";
                }
                pairArr3[0] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, strCopydefault5);
                T tEjfBZ4 = ejfBZ();
                InterfaceC9462bVz interfaceC9462bVz4 = tEjfBZ4 instanceof InterfaceC9462bVz ? (InterfaceC9462bVz) tEjfBZ4 : null;
                if (interfaceC9462bVz4 != null && (c10854bwMDHguZz = interfaceC9462bVz4.dHguZz()) != null) {
                    objFJNWhG = c10854bwMDHguZz.fJNWhG();
                }
                pairArr3[1] = C56390yDp.OLrzqt("token", objFJNWhG != null ? objFJNWhG : "");
                KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(i3, C56424yEw.gEmmrt(pairArr3)), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            } else if (abstractC9832bcy instanceof C9880bdt) {
                T tEjfBZ5 = ejfBZ();
                InterfaceC9462bVz interfaceC9462bVz5 = tEjfBZ5 instanceof InterfaceC9462bVz ? (InterfaceC9462bVz) tEjfBZ5 : null;
                KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.initializePanelMenu, C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", ejfBZ().dHguZz().fJNWhG()), C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C54870xYj.KWHzl(C54862xYb.convertToBigIntegerString$default(interfaceC9462bVz5 != null ? interfaceC9462bVz5.EZpvd(ejfBZ().QKudOq().KWHzl().getFeeAmount()) : null, false, (RoundingMode) null, 3, (java.lang.Object) null), ejfBZ().dHguZz().valueOf(), ejfBZ().dHguZz().fZBcTu(), null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null)))), C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", ejfBZ().QKudOq().AYXKKw().fJNWhG()))), new Function0() { // from class: o.gcv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C20150gbU.DbNXlk(this.EZpvd);
                    }
                }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            } else if (abstractC9832bcy instanceof C9750bbV) {
                OLrzqt();
                KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatActivity), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            } else if (abstractC9832bcy instanceof C9751bbW) {
                KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setOnItemSelectedListener), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            } else if (abstractC9832bcy instanceof C9838bdD) {
                KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, ((C9838bdD) abstractC9832bcy).copydefault(), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            } else if (abstractC9832bcy instanceof C9882bdv) {
                KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStub), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            } else if (abstractC9832bcy instanceof C9886bdz) {
                KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setVolumeTo), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : collection2) {
            if (obj2 instanceof C9789bcH) {
                arrayList3.add(obj2);
            }
        }
        C9789bcH c9789bcH = (C9789bcH) CollectionsKt___CollectionsKt.firstOrNull(arrayList3);
        if ((c9789bcH instanceof C9870bdj) || (c9789bcH instanceof C9814bcg)) {
            C57457yil c57457yil = this.getNewProxyInstance;
            if (c57457yil == null || (textViewCopydefault = c57457yil.copydefault()) == null) {
                return;
            }
            textViewCopydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
            return;
        }
        C57457yil c57457yil2 = this.getNewProxyInstance;
        if (c57457yil2 == null || (textViewCopydefault2 = c57457yil2.copydefault()) == null) {
            return;
        }
        textViewCopydefault2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(final C20150gbU c20150gbU) {
        long jAEQbTJ = ((AbstractC8601bFm) c20150gbU.ejfBZ()).dHguZz().AEQbTJ();
        java.lang.String strZLjUOn = ((AbstractC8601bFm) c20150gbU.ejfBZ()).zLjUOn();
        java.lang.String strHtlTjW = ((AbstractC8601bFm) c20150gbU.ejfBZ()).htlTjW();
        c20150gbU.UeEOUB().EZpvd(jAEQbTJ, strHtlTjW, strZLjUOn, 2, ((AbstractC8601bFm) c20150gbU.ejfBZ()).dUDNAs().USBtdM(), ((AbstractC8601bFm) c20150gbU.ejfBZ()).dUDNAs().DbNXlk(), new Function0() { // from class: o.gbX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20150gbU.valueOf(this.AEQbTJ);
            }
        }, ((AbstractC8601bFm) c20150gbU.ejfBZ()).dUDNAs().aUsmxb());
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C20150gbU c20150gbU) {
        C55284xgz.Activity activity = C55284xgz.Companion;
        android.content.Context context = c20150gbU.getContext();
        Intrinsics.copydefault(context, "");
        android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
        Intrinsics.copydefault(decorView, "");
        final C55284xgz c55284xgzKWHzl = activity.KWHzl((android.view.ViewGroup) decorView, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegate));
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegate));
            c55284xgzKWHzl.EZpvd(new View.OnClickListener() { // from class: o.gbW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20150gbU.EZpvd(c55284xgzKWHzl, view);
                }
            });
        }
        android.view.View viewAkhnZx = c55284xgzKWHzl != null ? c55284xgzKWHzl.AkhnZx() : null;
        if (viewAkhnZx != null) {
            ViewGroup.LayoutParams layoutParams = viewAkhnZx.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, C55298xhM.dpInt$default(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, (android.content.Context) null, 1, (java.lang.Object) null));
            viewAkhnZx.setLayoutParams(marginLayoutParams);
        }
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.hDKMBd();
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C55284xgz c55284xgz, android.view.View view) {
        c55284xgz.copydefault();
    }

    public static final Unit AEQbTJ(AbstractC9832bcy abstractC9832bcy, C20150gbU c20150gbU) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", ((C9826bcs) abstractC9832bcy).KWHzl()), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = c20150gbU.getContext();
        if (context != null) {
            WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(final C20150gbU c20150gbU, C10854bwM c10854bwM) {
        c20150gbU.gHZMYf();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = c20150gbU.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return Unit.INSTANCE;
        }
        interfaceC54829xWw.EZpvd(abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwM.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwM.OLrzqt()), "wallet", "gas", yDY.copydefault("dex"), (java.util.ArrayList) null, false, (java.lang.String) null, ((AbstractC8601bFm) c20150gbU.ejfBZ()).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), C13754dXa.LoaderManager.AuCTel, new Function1() { // from class: o.gcf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20150gbU.EZpvd(this.copydefault, (WalletRechargeResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C20150gbU c20150gbU, WalletRechargeResult walletRechargeResult) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(walletRechargeResult, "");
        if (walletRechargeResult.isSubmit() && (activity = c20150gbU.getActivity()) != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(final C20150gbU c20150gbU, final C10854bwM c10854bwM, final AbstractC9832bcy abstractC9832bcy) {
        c20150gbU.showLoading();
        InterfaceC58217yxC interfaceC58217yxC = c20150gbU.AxsJAY;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtEZpvd = ((AbstractC8601bFm) c20150gbU.ejfBZ()).aj_().EZpvd(new ReserveBean(c10854bwM.AuCTel(), c10854bwM.OLrzqt(), ((C9786bcE) abstractC9832bcy).OLrzqt(), c10854bwM.valueOf()));
        LifecycleOwner viewLifecycleOwner = c20150gbU.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(abstractC58260yxtEZpvd, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.gcc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20150gbU.AEQbTJ(this.OLrzqt, abstractC9832bcy, c10854bwM, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gck
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20150gbU.values(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gcj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20150gbU.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        c20150gbU.AxsJAY = abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gci
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20150gbU.DbNXlk(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [o.bCW] */
    public static final Unit AEQbTJ(C20150gbU c20150gbU, AbstractC9832bcy abstractC9832bcy, C10854bwM c10854bwM, kotlin.Pair pair) {
        java.util.ArrayList<android.widget.TextView> arrayListOLrzqt;
        java.util.ArrayList<android.widget.TextView> arrayListOLrzqt2;
        c20150gbU.dismissLoading();
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            updatePayView$default(c20150gbU, null, 1, null);
            updateReceiveView$default(c20150gbU, null, 1, null);
            C57422yiC c57422yiC = c20150gbU.zLjUOn;
            if (c57422yiC != null && (arrayListOLrzqt2 = c57422yiC.OLrzqt()) != null) {
                c20150gbU.copydefault((java.util.List<? extends android.view.View>) arrayListOLrzqt2);
            }
            C57422yiC c57422yiC2 = c20150gbU.wlaJM;
            if (c57422yiC2 != null && (arrayListOLrzqt = c57422yiC2.OLrzqt()) != null) {
                c20150gbU.copydefault((java.util.List<? extends android.view.View>) arrayListOLrzqt);
            }
            c20150gbU.EZpvd(((AbstractC8601bFm) c20150gbU.ejfBZ()).AEQbTJ(true));
            FragmentActivity activity = c20150gbU.getActivity();
            if (activity == null) {
                return Unit.INSTANCE;
            }
            C55097xdX c55097xdX = new C55097xdX(activity, null, 0, 4, null);
            c55097xdX.setTitle(C33069mpW.copydefault(C13754dXa.FragmentManager.DtnWsU, C56424yEw.gEmmrt(C56390yDp.OLrzqt("value", AbstractC8426bCW.formatToFeeCoinAmount$default(((AbstractC8601bFm) c20150gbU.ejfBZ()).QKudOq(), ((C9786bcE) abstractC9832bcy).AEQbTJ(), false, false, false, 10, null)), C56390yDp.OLrzqt("symbol", c10854bwM.fJNWhG()))));
            c55097xdX.setState(2);
            c55097xdX.setType(1);
            c55097xdX.setCloseBtnShow(false);
            c55097xdX.setMessage(null);
            C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
        } else {
            java.lang.String str = (java.lang.String) pair.getSecond();
            if (str != null) {
                C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C20150gbU c20150gbU, java.lang.Throwable th) {
        if (c20150gbU.getViewLifecycleOwner().getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return Unit.INSTANCE;
        }
        c20150gbU.dismissLoading();
        Intrinsics.copydefault(th);
        C10857bwP.copydefault("ContractFragment", th);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC9832bcy abstractC9832bcy, C20150gbU c20150gbU) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", ((C9828bcu) abstractC9832bcy).KWHzl()), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = c20150gbU.getContext();
        if (context != null) {
            WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit isConnected(final C20150gbU c20150gbU) {
        final InterfaceC9731bbC interfaceC9731bbCOLrzqt;
        if (((AbstractC8601bFm) c20150gbU.ejfBZ()).dUDNAs().getFieldNames()) {
            C9808bca c9808bca = (C9808bca) ((AbstractC8601bFm) c20150gbU.ejfBZ()).UlJrfe().KWHzl(C56524yIo.AEQbTJ(C9808bca.class));
            if (c9808bca == null || (interfaceC9731bbCOLrzqt = c9808bca.OLrzqt()) == null) {
                return Unit.INSTANCE;
            }
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOLrzqt = fPV.OLrzqt.OLrzqt(interfaceC9731bbCOLrzqt.AhwBna(), ((AbstractC8601bFm) c20150gbU.ejfBZ()).dUDNAs());
            LifecycleOwner viewLifecycleOwner = c20150gbU.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            AbstractC58185ywX abstractC58185ywXOLrzqt2 = C58156yvv.OLrzqt(abstractC58185ywXOLrzqt, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY).OLrzqt(new InterfaceC58222yxH() { // from class: o.gch
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58222yxH
                public final void run() {
                    C20150gbU.KWHzl(this.OLrzqt, interfaceC9731bbCOLrzqt);
                }
            });
            final Function1 function1 = new Function1() { // from class: o.gcl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20150gbU.copydefault((kotlin.Pair) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gco
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20150gbU.isConnected(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.gcp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20150gbU.KWHzl((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXOLrzqt2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gcn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20150gbU.fetchVPNInfo(function12, obj);
                }
            });
        } else {
            DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpdCopydefault = DialogInterfaceOnKeyListenerC14659dpd.Companion.copydefault(0.92f);
            dialogInterfaceOnKeyListenerC14659dpdCopydefault.KWHzl(ViewOnClickListenerC20995grR.Companion.copydefault(((AbstractC8601bFm) c20150gbU.ejfBZ()).dUDNAs().DbNXlk(), java.lang.String.valueOf(((AbstractC8601bFm) c20150gbU.ejfBZ()).dHguZz().AhwBna()), (1772 & 4) != 0 ? false : false, (1772 & 8) != 0 ? "" : null, (1772 & 16) != 0 ? false : false, (1772 & 32) != 0 ? false : false, (1772 & 64) != 0 ? -1 : 0, (1772 & 128) != 0 ? -1L : 0L, (1772 & 256) != 0 ? "" : null, (1772 & 512) != 0 ? 1 : 0, (1772 & 1024) != 0 ? null : null));
            dialogInterfaceOnKeyListenerC14659dpdCopydefault.show(c20150gbU.getChildFragmentManager(), ViewOnClickListenerC20995grR.class.getSimpleName());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C20150gbU c20150gbU, InterfaceC9731bbC interfaceC9731bbC) {
        DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpdCopydefault = DialogInterfaceOnKeyListenerC14659dpd.Companion.copydefault(0.92f);
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.KWHzl(ViewOnClickListenerC20995grR.Companion.copydefault(((AbstractC8601bFm) c20150gbU.ejfBZ()).dUDNAs().DbNXlk(), java.lang.String.valueOf(interfaceC9731bbC.AhwBna()), (1772 & 4) != 0 ? false : false, (1772 & 8) != 0 ? "" : null, (1772 & 16) != 0 ? false : false, (1772 & 32) != 0 ? false : false, (1772 & 64) != 0 ? -1 : 0, (1772 & 128) != 0 ? -1L : 0L, (1772 & 256) != 0 ? "" : null, (1772 & 512) != 0 ? 1 : 0, (1772 & 1024) != 0 ? null : null));
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.show(c20150gbU.getChildFragmentManager(), ViewOnClickListenerC20995grR.class.getSimpleName());
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(kotlin.Pair pair) {
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit DbNXlk(C20150gbU c20150gbU) {
        DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpdCopydefault = DialogInterfaceOnKeyListenerC14659dpd.Companion.copydefault(0.92f);
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.KWHzl(ViewOnClickListenerC20995grR.Companion.copydefault(((AbstractC8601bFm) c20150gbU.ejfBZ()).dUDNAs().DbNXlk(), java.lang.String.valueOf(((AbstractC8601bFm) c20150gbU.ejfBZ()).dHguZz().AhwBna()), (1772 & 4) != 0 ? false : false, (1772 & 8) != 0 ? "" : null, (1772 & 16) != 0 ? false : false, (1772 & 32) != 0 ? false : false, (1772 & 64) != 0 ? -1 : 0, (1772 & 128) != 0 ? -1L : 0L, (1772 & 256) != 0 ? "" : null, (1772 & 512) != 0 ? 1 : 0, (1772 & 1024) != 0 ? null : null));
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.show(c20150gbU.getChildFragmentManager(), ViewOnClickListenerC20995grR.class.getSimpleName());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC20082gaF
    public void OLrzqt(@NotNull C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
        AEQbTJ(c9748bbT.gEmmrt());
        Function0<Unit> function0 = this.AwvSrB;
        if (function0 == null) {
            KWHzl(c9748bbT);
        } else if (function0 != null) {
            function0.invoke();
        }
    }

    public final void AEQbTJ(final java.lang.String str) {
        int iQwvEab = ejfBZ().QwvEab();
        if (iQwvEab == 3) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_metax_wallet_trade_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.gbV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20150gbU.copydefault(str, (EventParamsList) obj);
                }
            });
        } else if (iQwvEab == 4) {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_metax_wallet_NFT_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.gca
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20150gbU.KWHzl(str, (EventParamsList) obj);
                }
            });
        } else {
            TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_metax_wallet_contractinteract_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.gbZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20150gbU.AYXKKw(str, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str == null) {
            str = "";
        }
        eventParamsList.put("tx_id", str, false);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str == null) {
            str = "";
        }
        eventParamsList.put("tx_id", str, false);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str == null) {
            str = "";
        }
        eventParamsList.put("tx_id", str, false);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.AxsJAY;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }
}
