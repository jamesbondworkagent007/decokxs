package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import com.okinc.web.WebActivity;
import com.okinc.web3Uilib.bean.TransactionAssetInfoBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
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
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.geE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20293geE extends C20290geB<C11999cef> {
    public java.lang.String copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20290geB, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<C11999cef>.ActionBar actionBar, boolean z) {
        C9758bbd c9758bbdCopydefault;
        final C9701baZ c9701baZOLrzqt;
        java.lang.String urlOnlyHost;
        Intrinsics.checkNotNullParameter(actionBar, "");
        C9835bdA c9835bdA = (C9835bdA) ((C11999cef) ejfBZ()).UlJrfe().KWHzl(C56524yIo.AEQbTJ(C9835bdA.class));
        if (c9835bdA == null || (c9758bbdCopydefault = c9835bdA.copydefault()) == null || (c9701baZOLrzqt = c9758bbdCopydefault.OLrzqt()) == null) {
            return;
        }
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmApprove;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        int i = C13754dXa.FragmentManager.GVpNrsfQMcgE;
        java.lang.String strGEmmrt = ((C11999cef) ejfBZ()).gEmmrt();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl);
        if (strGEmmrt == null || strGEmmrt.length() == 0) {
            strGEmmrt = strAYXKKw;
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("dappname", strGEmmrt)));
        PlatformItem dapp = ((C11999cef) ejfBZ()).OJuSTm().getDapp();
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, strKWHzl, strCopydefault, null, (dapp == null || (urlOnlyHost = dapp.getUrlOnlyHost()) == null) ? "" : urlOnlyHost, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        actionBar.OLrzqt(copydefault(c9701baZOLrzqt));
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AEQbTJ(c9701baZOLrzqt.copydefault()));
        actionBar.OLrzqt(djBIcL());
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
        actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.geG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20293geE.copydefault(this.copydefault, c9701baZOLrzqt, (AbstractC20082gaF.ActionBar) obj);
            }
        }, 3, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C20293geE c20293geE, C9701baZ c9701baZ, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.OLrzqt(c20293geE.KWHzl(c9701baZ));
        actionBar.copydefault(AbstractC20102gaZ.normalDataInMoreView$default(c20293geE, null, ((C11999cef) c20293geE.ejfBZ()).AEQbTJ(true), 1, null));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC20082gaF, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        iwGUEr();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View copydefault(C9701baZ c9701baZ) {
        java.lang.String strOLrzqt;
        boolean z;
        java.lang.String strAEQbTJ = c9701baZ.AEQbTJ();
        java.lang.String strAYXKKw = (strAEQbTJ == null || strAEQbTJ.length() == 0) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor) : strAEQbTJ;
        if (C33129mqd.AEQbTJ(c9701baZ.EZpvd(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, 13.0d)))) {
            strOLrzqt = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
            z = true;
        } else {
            java.lang.String strEZpvd = c9701baZ.EZpvd();
            if (strEZpvd != null) {
                strOLrzqt = C54870xYj.OLrzqt(strEZpvd, (249 & 1) != 0 ? 0 : 0, ((C11999cef) ejfBZ()).dHguZz().DTwDnp(), null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
            } else {
                strOLrzqt = null;
            }
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            z = false;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57466yiu c57466yiu = new C57466yiu(contextRequireContext, null, 0, 6, null);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) strOLrzqt);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(z ? C52761wXj.Activity.DTeKQX : C52761wXj.Activity.fdOvFl)), 0, strOLrzqt.length(), 17);
        Unit unit = Unit.INSTANCE;
        c57466yiu.setViewDataBean(new TransactionAssetInfoBean(C56402yEa.EZpvd(new TransactionAssetInfoBean.AssetSimpleDataBean(null, null, new android.text.SpannedString(spannableStringBuilder), strAYXKKw, null, null, null, 115, null)), 0, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        return c57466yiu;
    }

    public final android.view.View KWHzl(C9701baZ c9701baZ) {
        int i = C13754dXa.FragmentManager.sGvRiA;
        java.lang.String strAEQbTJ = c9701baZ.AEQbTJ();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
        if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
            strAEQbTJ = strAYXKKw;
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", strAEQbTJ)));
        java.lang.String strKWHzl = c9701baZ.KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        return AbstractC20102gaZ.addressView$default(this, strCopydefault, strKWHzl, null, null, null, null, true, null, false, null, 956, null);
    }

    @Override // o.C20290geB, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        super.copydefault(collection);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9785bcD) {
                arrayList.add(obj);
            }
        }
        C9785bcD c9785bcD = (C9785bcD) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (c9785bcD instanceof C9835bdA) {
            C9835bdA c9835bdA = (C9835bdA) c9785bcD;
            if (c9835bdA.copydefault().EZpvd()) {
                EZpvd(c9835bdA.copydefault());
            }
        }
    }

    public final void EZpvd(C9758bbd c9758bbd) {
        C9701baZ c9701baZOLrzqt = c9758bbd.OLrzqt();
        java.lang.String strCopydefault = c9701baZOLrzqt != null ? c9701baZOLrzqt.copydefault() : null;
        this.copydefault = strCopydefault;
        if (strCopydefault == null || strCopydefault.length() == 0) {
            return;
        }
        KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.createSubDecor, C56423yEv.EZpvd(C56390yDp.OLrzqt("AccountAddress", C14079deg.getAddressStr$default(C14079deg.EZpvd, strCopydefault, false, 2, null)))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setExtras), new Function0() { // from class: o.geF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20293geE.AEQbTJ(this.OLrzqt);
            }
        }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
    }

    public static final Unit AEQbTJ(C20293geE c20293geE) {
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        FragmentActivity activity = c20293geE.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        WebActivity.TaskDescription.openPage$default(taskDescription, activity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDescription)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.C20290geB, o.AbstractC20082gaF
    public void getFieldNames() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault)) {
            DefiWalletVReminderDFragment defiWalletVReminderDFragmentEZpvd = DefiWalletVReminderDFragment.Companion.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(C52761wXj.TaskDescription.NRYds, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AnimRes), C33069mpW.copydefault(C13754dXa.FragmentManager.fromParcel, C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, C14079deg.getAddressStr$default(C14079deg.EZpvd, this.copydefault, false, 2, null)))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaVisualMediaType), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaImageOnly), 2, null));
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            defiWalletVReminderDFragmentEZpvd.AEQbTJ(childFragmentManager, new Function1() { // from class: o.geI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20293geE.EZpvd(this.copydefault, (java.lang.Integer) obj);
                }
            });
            return;
        }
        super.getFieldNames();
    }

    public static final Unit EZpvd(C20293geE c20293geE, java.lang.Integer num) {
        if (num != null && num.intValue() == 2) {
            super.getFieldNames();
        }
        return Unit.INSTANCE;
    }
}
