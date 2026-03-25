package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.MessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.web3Uilib.bean.TransactionAddressInfoBean;
import com.okinc.web3Uilib.bean.TransactionGeneralInfoBean;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC20082gaF;
import o.AbstractC8610bFv;
import o.C13754dXa;
import o.C52761wXj;
import o.C55284xgz;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.geB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C20290geB<T extends AbstractC8610bFv<?>> extends AbstractC20102gaZ<T> {
    public final InterfaceC56387yDm getFieldNames = C56392yDr.copydefault(new Function0() { // from class: o.gez
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C20290geB.AhwBna(this.KWHzl);
        }
    });
    public boolean getNewProxyInstance;
    public C57457yil hDKMBd;

    private final eUI KWHzl() {
        return (eUI) this.getFieldNames.getValue();
    }

    public static final eUI AhwBna(C20290geB c20290geB) {
        FragmentActivity fragmentActivityRequireActivity = c20290geB.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (eUI) new ViewModelProvider(fragmentActivityRequireActivity).get(eUI.class);
    }

    @Override // o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<T>.ActionBar actionBar, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(actionBar, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmSignMessage;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, cDNSourceManager.KWHzl(imageSource, contextRequireContext), C33070mpX.AYXKKw(C13754dXa.FragmentManager.closeSocket), null, "", null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        actionBar.OLrzqt(QbewEr());
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        boolean z3 = false;
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(djBIcL());
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ejfBZ().AEQbTJ(true))) {
            final java.lang.String strAEQbTJ = ejfBZ().AEQbTJ(true);
            C10854bwM c10854bwMDHguZz = ejfBZ().dHguZz();
            if (!c10854bwMDHguZz.QkdxfA()) {
                if ((c10854bwMDHguZz.fARcdN() || c10854bwMDHguZz.fIwbmz()) && strAEQbTJ != null) {
                    z3 = !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ);
                }
            } else {
                if (strAEQbTJ != null) {
                    z2 = (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ) ^ true) && !C59449zhJ.startsWith$default(strAEQbTJ, EIP1271Verifier.hexPrefix, false, 2, null);
                }
                actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, z2, null, new Function1() { // from class: o.geA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20290geB.EZpvd(this.KWHzl, strAEQbTJ, (AbstractC20082gaF.ActionBar) obj);
                    }
                }, 2, null));
            }
            z2 = z3;
            actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, z2, null, new Function1() { // from class: o.geA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20290geB.EZpvd(this.KWHzl, strAEQbTJ, (AbstractC20082gaF.ActionBar) obj);
                }
            }, 2, null));
        }
    }

    public static final Unit EZpvd(C20290geB c20290geB, java.lang.String str, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (str == null) {
            str = "";
        }
        actionBar.copydefault(AbstractC20102gaZ.normalDataInMoreView$default(c20290geB, null, str, 1, null));
        return Unit.INSTANCE;
    }

    public final android.view.View QbewEr() {
        PlatformItem dapp = ejfBZ().OJuSTm().getDapp();
        java.lang.Object image = null;
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        if (urlOnlyHost == null || urlOnlyHost.length() == 0) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57422yiC c57422yiC = new C57422yiC(contextRequireContext, null, 0, 6, null);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.openFileOutput);
        PlatformItem dapp2 = ejfBZ().OJuSTm().getDapp();
        if (dapp2 != null) {
            android.content.Context context = c57422yiC.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            image = dapp2.getImage(context);
        }
        java.lang.Object obj = image;
        C14726dqr c14726dqr = C14726dqr.OLrzqt;
        android.content.Context context2 = c57422yiC.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c57422yiC.setViewDataBean(new TransactionHeaderInfoBean(strAYXKKw, C56402yEa.EZpvd(new TransactionHeaderInfoBean.HeaderSimpleDataBean(0, 0.0f, 0, 0, obj, null, c14726dqr.KWHzl(context2), null, urlOnlyHost, null, false, null, null, null, 0, null, null, null, null, null, 1048239, null)), false, null, null, null, null, 124, null));
        return c57422yiC;
    }

    public final android.view.View AEQbTJ(final java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final C57457yil c57457yil = new C57457yil(contextRequireContext, null, 0, 6, null);
        this.hDKMBd = c57457yil;
        c57457yil.setViewDataBean(new TransactionAddressInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.dHAKvv), str, (java.lang.String) null, (java.lang.String) null, true, new Function0() { // from class: o.geD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20290geB.AEQbTJ(c57457yil, str);
            }
        }, (java.lang.String) null, false, (Function0) null, 460, (DefaultConstructorMarker) null));
        return c57457yil;
    }

    public static final Unit AEQbTJ(C57457yil c57457yil, java.lang.String str) {
        java.lang.Object systemService = c57457yil.getContext().getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return Unit.INSTANCE;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), str).KWHzl(c57457yil.getContext());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList;
        android.widget.TextView textViewCopydefault;
        android.widget.TextView textViewCopydefault2;
        java.util.Collection<AbstractC9832bcy> collectionValues;
        Intrinsics.checkNotNullParameter(collection, "");
        fXW fxwAkhnZx = AkhnZx();
        FragmentActivity activity = getActivity();
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        java.util.HashMap<java.lang.String, AbstractC9832bcy> mapEZpvd = ejfBZ().UlJrfe().EZpvd(3);
        if (mapEZpvd == null || (collectionValues = mapEZpvd.values()) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : collectionValues) {
                if (!((AbstractC9832bcy) obj).AhwBna()) {
                    arrayList.add(obj);
                }
            }
        }
        fXW.dealKYSErrors$default(fxwAkhnZx, activity, parentFragmentManager, arrayList, ejfBZ().aUsmxb(), false, new Function0() { // from class: o.geC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20290geB.OLrzqt(this.copydefault);
            }
        }, 16, null);
        java.util.Collection<? extends AbstractC9832bcy> collection2 = collection;
        AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection2);
        if (abstractC9832bcy == null) {
            AbstractC20102gaZ.updateReminder$default(this, null, 1, null);
        } else if (abstractC9832bcy instanceof C9782bcA) {
            AbstractC20102gaZ.updateReminder$default(this, null, 1, null);
            if (!this.getNewProxyInstance) {
                this.getNewProxyInstance = true;
                C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.MediaSessionCompatApi24Callback, 0, 1, (java.lang.Object) null);
            }
        } else if (abstractC9832bcy instanceof C9783bcB) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.onCloseMenu), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            copydefault(true);
        } else if (abstractC9832bcy instanceof C9798bcQ) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.updateResourcesConfigurationForNightMode), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            copydefault(true);
        } else if (abstractC9832bcy instanceof C9810bcc) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.InterpolatorRes), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
        } else if (abstractC9832bcy instanceof C9809bcb) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getAutoBatteryNightModeManager), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            copydefault(true);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : collection2) {
            if (obj2 instanceof C9789bcH) {
                arrayList2.add(obj2);
            }
        }
        C9789bcH c9789bcH = (C9789bcH) CollectionsKt___CollectionsKt.firstOrNull(arrayList2);
        if ((c9789bcH instanceof C9870bdj) || (c9789bcH instanceof C9814bcg)) {
            C57457yil c57457yil = this.hDKMBd;
            if (c57457yil == null || (textViewCopydefault = c57457yil.copydefault()) == null) {
                return;
            }
            textViewCopydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
            return;
        }
        C57457yil c57457yil2 = this.hDKMBd;
        if (c57457yil2 == null || (textViewCopydefault2 = c57457yil2.copydefault()) == null) {
            return;
        }
        textViewCopydefault2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(final C20290geB c20290geB) {
        C10854bwM c10854bwMDHguZz = ((AbstractC8610bFv) c20290geB.ejfBZ()).dHguZz();
        long jAEQbTJ = c10854bwMDHguZz.AEQbTJ();
        java.lang.String strOLrzqt = c10854bwMDHguZz.OLrzqt();
        java.lang.String strHtlTjW = ((AbstractC8610bFv) c20290geB.ejfBZ()).htlTjW();
        c20290geB.KWHzl().EZpvd(jAEQbTJ, strHtlTjW, strOLrzqt, 2, ((AbstractC8610bFv) c20290geB.ejfBZ()).dUDNAs().USBtdM(), ((AbstractC8610bFv) c20290geB.ejfBZ()).dUDNAs().DbNXlk(), new Function0() { // from class: o.gey
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20290geB.AEQbTJ(this.OLrzqt);
            }
        }, ((AbstractC8610bFv) c20290geB.ejfBZ()).dUDNAs().aUsmxb());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C20290geB c20290geB) {
        C55284xgz.Activity activity = C55284xgz.Companion;
        android.content.Context context = c20290geB.getContext();
        Intrinsics.copydefault(context, "");
        android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
        Intrinsics.copydefault(decorView, "");
        final C55284xgz c55284xgzKWHzl = activity.KWHzl((android.view.ViewGroup) decorView, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegate));
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegate));
            c55284xgzKWHzl.EZpvd(new View.OnClickListener() { // from class: o.gex
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20290geB.OLrzqt(c55284xgzKWHzl, view);
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

    public static final void OLrzqt(C55284xgz c55284xgz, android.view.View view) {
        c55284xgz.copydefault();
    }

    @Override // o.AbstractC20082gaF
    public void OLrzqt(@NotNull C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
        java.lang.String strAEQbTJ = c9748bbT.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        java.lang.String strKWHzl = c9748bbT.KWHzl();
        EZpvd(strAEQbTJ, strKWHzl != null ? strKWHzl : "", ejfBZ().fERRXa().getPublicKey());
    }

    private final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("result", -1);
        bundle.putString("data", str);
        bundle.putString("tx_hash", str2);
        bundle.putString("publicKey", str3);
        bundle.putBoolean("is_reject_sign", false);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, new android.content.Intent().putExtras(bundle));
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final android.view.View djBIcL() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57471yiz c57471yiz = new C57471yiz(contextRequireContext, null, 0, 6, null);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.unregister);
        java.lang.String strDjBIcL = ejfBZ().dHguZz().djBIcL();
        java.lang.String strAYXKKw2 = ejfBZ().dHguZz().AYXKKw();
        C14726dqr c14726dqr = C14726dqr.OLrzqt;
        android.content.Context context = c57471yiz.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c57471yiz.setViewDataBean(new TransactionGeneralInfoBean(strAYXKKw, false, strDjBIcL, null, null, strAYXKKw2, c14726dqr.OLrzqt(context), null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524186, null));
        return c57471yiz;
    }

    @Override // o.AbstractC20082gaF
    public void getFieldNames() {
        QVAiDq();
        super.getFieldNames();
    }

    public final void QVAiDq() {
        MessageSignData messageSignData = (MessageSignData) ejfBZ().QVsKAR();
        if ((messageSignData instanceof EVMMessageSignData) && Intrinsics.EZpvd((java.lang.Object) ((EVMMessageSignData) messageSignData).getMethod(), (java.lang.Object) "eth_sign")) {
            C32866mlf.onEvent$default("security_event_eth_sign", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
    }
}
