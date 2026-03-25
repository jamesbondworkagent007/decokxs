package o;

import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.constant.KYSAssetType;
import com.okinc.business.defi.biz.net.bean.Asset;
import com.okinc.business.defi.biz.net.bean.ExposureInfo;
import com.okinc.business.defi.biz.net.bean.KYSPreTxCheckInfo;
import com.okinc.business.defi.biz.net.bean.Spender;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.web3Uilib.bean.TransactionAddressInfoBean;
import com.okinc.web3Uilib.bean.TransactionAssetInfoBean;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.geu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20335geu extends C20290geB<C9035bNw> {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20290geB, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<C9035bNw>.ActionBar actionBar, boolean z) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String urlOnlyHost;
        ExposureInfo exposureInfo;
        ExposureInfo exposureInfo2;
        Spender spenderValue;
        Intrinsics.checkNotNullParameter(actionBar, "");
        KYSPreTxCheckInfo kYSPreTxCheckInfoValueOf = ((C9035bNw) ejfBZ()).valueOf();
        java.lang.String strategy = kYSPreTxCheckInfoValueOf != null ? kYSPreTxCheckInfoValueOf.getStrategy() : null;
        KYSPreTxCheckInfo kYSPreTxCheckInfoValueOf2 = ((C9035bNw) ejfBZ()).valueOf();
        java.util.List<ExposureInfo> exposures = kYSPreTxCheckInfoValueOf2 != null ? kYSPreTxCheckInfoValueOf2.getExposures() : null;
        if (C33129mqd.KWHzl((java.util.Collection) exposures)) {
            strAYXKKw = (exposures == null || (exposureInfo2 = (ExposureInfo) CollectionsKt___CollectionsKt.firstOrNull(exposures)) == null || (spenderValue = exposureInfo2.getSpenderValue()) == null) ? null : spenderValue.getName();
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl);
            if (strAYXKKw == null || strAYXKKw.length() == 0) {
                strAYXKKw = strAYXKKw3;
            }
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl);
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.GVpNrsfQMcgE, C56423yEv.EZpvd(C56390yDp.OLrzqt("dappname", strAYXKKw)));
        if (Intrinsics.EZpvd((java.lang.Object) strategy, (java.lang.Object) TxToastCheckRes.RESULT_STRATEGY_PERMIT2)) {
            strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.m);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.UkuJRw);
        }
        java.lang.String str = strAYXKKw2;
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmApprove;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        PlatformItem dapp = ((C9035bNw) ejfBZ()).OJuSTm().getDapp();
        if (dapp == null || (urlOnlyHost = dapp.getUrlOnlyHost()) == null) {
            urlOnlyHost = "";
        }
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, strKWHzl, strCopydefault, str, urlOnlyHost, null, null, new Function0() { // from class: o.get
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20335geu.OLrzqt(this.OLrzqt);
            }
        }, 48, null));
        actionBar.OLrzqt(KWHzl());
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AEQbTJ((exposures == null || (exposureInfo = (ExposureInfo) CollectionsKt___CollectionsKt.firstOrNull(exposures)) == null) ? null : exposureInfo.getSpenderKey()));
        actionBar.OLrzqt(djBIcL());
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
        actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.gew
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20335geu.KWHzl(this.EZpvd, (AbstractC20082gaF.ActionBar) obj);
            }
        }, 3, null));
    }

    public static final Unit OLrzqt(C20335geu c20335geu) {
        c20335geu.OLrzqt();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C20335geu c20335geu, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.EZpvd(c20335geu.AEQbTJ());
        java.lang.String strAEQbTJ = ((C9035bNw) c20335geu.ejfBZ()).AEQbTJ(true);
        actionBar.copydefault(AbstractC20102gaZ.normalDataInMoreView$default(c20335geu, null, strAEQbTJ != null ? strAEQbTJ : "", 1, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gcM.TaskDescription.newInstance$default(o.gcM$TaskDescription, com.okinc.business.defi.common.utils.CDNSourceManager$ImageSource, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.Object):o.gcM */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt() {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String strAYXKKw3;
        java.lang.String strAYXKKw4;
        java.lang.String strAYXKKw5;
        KYSPreTxCheckInfo kYSPreTxCheckInfoValueOf = ((C9035bNw) ejfBZ()).valueOf();
        if (Intrinsics.EZpvd((java.lang.Object) (kYSPreTxCheckInfoValueOf != null ? kYSPreTxCheckInfoValueOf.getStrategy() : null), (java.lang.Object) TxToastCheckRes.RESULT_STRATEGY_PERMIT2)) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DhEJvI);
            strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ijmTNW);
            strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DuQ);
            strAYXKKw4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ZqidTP);
            strAYXKKw5 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ZGRCNj);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.dbAction);
            strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.identifier);
            strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ZNPcth);
            strAYXKKw4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.Zpvmxu);
            strAYXKKw5 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.sSi);
        }
        C20195gcM c20195gcMOLrzqt = C20195gcM.Companion.OLrzqt(CDNSourceManager.ImageSource.TxConfirmPermit, strAYXKKw, strAYXKKw2, strAYXKKw3, strAYXKKw4, strAYXKKw5, (64 & 64) != 0 ? false : false);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c20195gcMOLrzqt.show(childFragmentManager);
    }

    @Override // o.AbstractC20082gaF, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        iwGUEr();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final android.view.View KWHzl() {
        java.lang.String strSubstring;
        int iValueOf;
        int i;
        int iDTwDnp;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strEZpvd;
        java.lang.String strAYXKKw;
        java.lang.String strCopydefault;
        java.lang.String address;
        java.lang.Long chainId;
        java.lang.Integer decimals;
        KYSPreTxCheckInfo kYSPreTxCheckInfoValueOf = ((C9035bNw) ejfBZ()).valueOf();
        java.lang.String str3 = null;
        if (kYSPreTxCheckInfoValueOf == null) {
            return null;
        }
        java.util.List<ExposureInfo> exposures = kYSPreTxCheckInfoValueOf.getExposures();
        if (exposures.isEmpty()) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        java.lang.String str4 = "";
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57466yiu c57466yiu = new C57466yiu(contextRequireContext, null, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(exposures, 10));
        for (ExposureInfo exposureInfo : exposures) {
            Asset asset = exposureInfo.getAsset();
            Spender spenderValue = exposureInfo.getSpenderValue();
            if (spenderValue == null || (strSubstring = spenderValue.getApprovalRaw()) == null) {
                strSubstring = str4;
            }
            boolean zStartsWith$default = C59449zhJ.startsWith$default(strSubstring, "-", false, 2, str3);
            if (asset == null || (decimals = asset.getDecimals()) == null) {
                if (asset != null) {
                    java.lang.Integer assetType = asset.getAssetType();
                    int value = KYSAssetType.NFT_TYPE.getValue();
                    if (assetType != null && assetType.intValue() == value) {
                        i = 0;
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) (asset == null ? asset.getAddress() : str3))) {
                            iDTwDnp = 6;
                        } else {
                            C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
                            if (asset == null || (address = asset.getAddress()) == null) {
                                address = str4;
                            }
                            C10854bwM c10854bwMEZpvd = c10948byAValueOf.EZpvd(address, (asset == null || (chainId = asset.getChainId()) == null) ? -1L : chainId.longValue());
                            iDTwDnp = c10854bwMEZpvd != null ? c10854bwMEZpvd.DTwDnp() : 8;
                        }
                        int i2 = iDTwDnp;
                        boolean z = true;
                        if (zStartsWith$default) {
                            strSubstring = strSubstring.substring(1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, str4);
                        }
                        str = strSubstring;
                        if (C59449zhJ.gEmmrt(str, "0x0", true)) {
                            if (str.length() == 0) {
                                strEZpvd = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
                                str2 = str4;
                            } else {
                                str2 = str4;
                                if (C9700baY.EZpvd(str)) {
                                    java.lang.String strOLrzqt = C33491mxU.OLrzqt(str);
                                    if (!C33129mqd.AEQbTJ(strOLrzqt, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, 13)))) {
                                        strEZpvd = C54870xYj.EZpvd(strOLrzqt, i, i2, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                                    } else {
                                        strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
                                        strEZpvd = strAYXKKw;
                                        z = true;
                                    }
                                } else if (!C33129mqd.AEQbTJ(str, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, 13)))) {
                                    strEZpvd = C54870xYj.EZpvd(str, i, i2, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                                } else {
                                    strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
                                    strEZpvd = strAYXKKw;
                                    z = true;
                                }
                            }
                            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                            spannableStringBuilder.append((java.lang.CharSequence) strEZpvd);
                            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(z ? C52761wXj.Activity.DTeKQX : C52761wXj.Activity.fdOvFl)), 0, strEZpvd.length(), 17);
                            Unit unit = Unit.INSTANCE;
                            android.text.SpannedString spannedString = new android.text.SpannedString(spannableStringBuilder);
                            java.lang.String symbol = asset != null ? asset.getSymbol() : null;
                            java.lang.String strAYXKKw2 = (symbol == null || symbol.length() == 0) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor) : symbol;
                            if (C33129mqd.OLrzqt((java.lang.CharSequence) exposureInfo.getExpiration())) {
                                int i3 = C13754dXa.FragmentManager.PickVisualMediaRequestdefault;
                                java.lang.String expiration = exposureInfo.getExpiration();
                                Intrinsics.copydefault((java.lang.Object) expiration);
                                strCopydefault = C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", expiration)));
                            } else {
                                strCopydefault = str2;
                            }
                            arrayList.add(new TransactionAssetInfoBean.AssetSimpleDataBean(null, null, spannedString, strAYXKKw2, strCopydefault, null, null, 99, null));
                            str4 = str2;
                            str3 = null;
                        } else {
                            strEZpvd = "0";
                            str2 = str4;
                        }
                        z = false;
                        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
                        spannableStringBuilder2.append((java.lang.CharSequence) strEZpvd);
                        spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(z ? C52761wXj.Activity.DTeKQX : C52761wXj.Activity.fdOvFl)), 0, strEZpvd.length(), 17);
                        Unit unit2 = Unit.INSTANCE;
                        android.text.SpannedString spannedString2 = new android.text.SpannedString(spannableStringBuilder2);
                        if (asset != null) {
                        }
                        if (symbol == null) {
                        }
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) exposureInfo.getExpiration())) {
                        }
                        arrayList.add(new TransactionAssetInfoBean.AssetSimpleDataBean(null, null, spannedString2, strAYXKKw2, strCopydefault, null, null, 99, null));
                        str4 = str2;
                        str3 = null;
                    }
                }
                iValueOf = ((C9035bNw) ejfBZ()).dHguZz().valueOf();
            } else {
                iValueOf = decimals.intValue();
            }
            i = iValueOf;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (asset == null ? asset.getAddress() : str3))) {
            }
            int i22 = iDTwDnp;
            boolean z2 = true;
            if (zStartsWith$default) {
            }
            str = strSubstring;
            if (C59449zhJ.gEmmrt(str, "0x0", true)) {
            }
            z2 = false;
            android.text.SpannableStringBuilder spannableStringBuilder22 = new android.text.SpannableStringBuilder();
            spannableStringBuilder22.append((java.lang.CharSequence) strEZpvd);
            spannableStringBuilder22.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(z2 ? C52761wXj.Activity.DTeKQX : C52761wXj.Activity.fdOvFl)), 0, strEZpvd.length(), 17);
            Unit unit22 = Unit.INSTANCE;
            android.text.SpannedString spannedString22 = new android.text.SpannedString(spannableStringBuilder22);
            if (asset != null) {
            }
            if (symbol == null) {
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) exposureInfo.getExpiration())) {
            }
            arrayList.add(new TransactionAssetInfoBean.AssetSimpleDataBean(null, null, spannedString22, strAYXKKw2, strCopydefault, null, null, 99, null));
            str4 = str2;
            str3 = null;
        }
        c57466yiu.setViewDataBean(new TransactionAssetInfoBean(arrayList, 0, C33070mpX.AYXKKw(C13754dXa.FragmentManager.search), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRoot), null, null, null, 114, null));
        return c57466yiu;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final java.util.List<android.view.View> AEQbTJ() {
        java.lang.String address;
        KYSPreTxCheckInfo kYSPreTxCheckInfoValueOf = ((C9035bNw) ejfBZ()).valueOf();
        if (kYSPreTxCheckInfoValueOf == null) {
            return yDY.AhwBna();
        }
        java.util.List<ExposureInfo> exposures = kYSPreTxCheckInfoValueOf.getExposures();
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
            c57457yil.setViewDataBean(new TransactionAddressInfoBean(C33069mpW.copydefault(C13754dXa.FragmentManager.sGvRiA, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", symbol))), str, (java.lang.String) null, (java.lang.String) null, true, new Function0() { // from class: o.ges
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20335geu.KWHzl(c57457yil, str);
                }
            }, (java.lang.String) null, false, (Function0) null, 460, (DefaultConstructorMarker) null));
            arrayList.add(c57457yil);
        }
        return arrayList;
    }

    public static final Unit KWHzl(C57457yil c57457yil, java.lang.String str) {
        java.lang.Object systemService = c57457yil.getContext().getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return Unit.INSTANCE;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), str).KWHzl(c57457yil.getContext());
        return Unit.INSTANCE;
    }
}
