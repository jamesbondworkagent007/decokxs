package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.database.addressbook.entity.SendCoinRecordEntity;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.transaction.ui.transfer.TransferConfig;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.web3Uilib.bean.RiskPageInfoBean;
import com.okinc.web3Uilib.bean.TransactionTopHeaderInfoBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import com.okinc.web3Uilib.bean.TransferAssetInfoBean;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC20082gaF;
import o.AbstractC8664bGw;
import o.C13754dXa;
import o.C52761wXj;
import o.C55284xgz;
import o.C57406yhn;
import o.C8475bDS;
import o.InterfaceC54829xWw;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.ggz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C20446ggz<T extends AbstractC8664bGw<?, ?>> extends AbstractC20080gaD<T> {
    public java.lang.String AuCTelauCTel;
    public C57431yiL AwvSrB;
    public C57457yil AxsJAY;
    public C57435yiP hDKMBd;
    public int wlaJM;
    public java.lang.String zsXlph;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int iwGUEr = 8;
    public static final java.lang.String getFieldNames = "wallet_transfer_config";
    public final InterfaceC56387yDm zLjUOn = C56392yDr.copydefault(new Function0() { // from class: o.ghb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C20446ggz.fJNWhG(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm AubY = C56392yDr.copydefault(new Function0() { // from class: o.ggX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C20446ggz.iwGUEr(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm gHZMYf = C56392yDr.copydefault(new Function0() { // from class: o.ghe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C20446ggz.zLjUOn(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.ggz$Application */
    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.Object objAkhnZx = C20446ggz.AkhnZx(C20446ggz.this);
            if (objAkhnZx instanceof InterfaceC9778bbx) {
                C52794wYp.startLoading$default(C20446ggz.this.gEmmrt().KWHzl.copydefault(), 0L, 1, null);
                ((InterfaceC9778bbx) objAkhnZx).KWHzl(editable != null ? editable.toString() : null).AEQbTJ(new InterfaceC58227yxM(new StateListAnimator(C20446ggz.this)) { // from class: o.ggz.FragmentManager
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.AEQbTJ.invoke(obj);
                    }
                }, new InterfaceC58227yxM(new ActionBar(C20446ggz.this)) { // from class: o.ggz.FragmentManager
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.AEQbTJ.invoke(obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: o.ggz$LoaderManager */
    public static final class LoaderManager implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public LoaderManager() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (C20446ggz.AkhnZx(C20446ggz.this) instanceof InterfaceC9747bbS) {
                java.lang.Object objAkhnZx = C20446ggz.AkhnZx(C20446ggz.this);
                Intrinsics.copydefault(objAkhnZx, "");
                ((InterfaceC9747bbS) objAkhnZx).EZpvd(C33129mqd.gEmmrt(editable != null ? editable.toString() : null));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC8664bGw AkhnZx(C20446ggz c20446ggz) {
        return (AbstractC8664bGw) c20446ggz.ejfBZ();
    }

    /* JADX INFO: renamed from: o.ggz$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ggz.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.lang.String EZpvd() {
            return C20446ggz.getFieldNames;
        }

        public final C20446ggz<AbstractC8664bGw<?, ?>> AEQbTJ(android.os.Bundle bundle) {
            C20446ggz<AbstractC8664bGw<?, ?>> c20446ggz = new C20446ggz<>();
            c20446ggz.setArguments(bundle);
            return c20446ggz;
        }
    }

    public final AbstractC17039evK djSkpj() {
        return (AbstractC17039evK) this.zLjUOn.getValue();
    }

    public static final AbstractC17039evK fJNWhG(C20446ggz c20446ggz) {
        return AbstractC17039evK.KWHzl(c20446ggz.getLayoutInflater());
    }

    public final AbstractC17044evP finit() {
        return (AbstractC17044evP) this.AubY.getValue();
    }

    public static final AbstractC17044evP iwGUEr(C20446ggz c20446ggz) {
        return AbstractC17044evP.copydefault(c20446ggz.getLayoutInflater());
    }

    private final eUI QbewEr() {
        return (eUI) this.gHZMYf.getValue();
    }

    public static final eUI zLjUOn(C20446ggz c20446ggz) {
        FragmentActivity fragmentActivityRequireActivity = c20446ggz.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (eUI) new ViewModelProvider(fragmentActivityRequireActivity).get(eUI.class);
    }

    @Override // o.AbstractC20082gaF, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        ejfBZ().DarRvM().KWHzl(new Activity(this));
    }

    /* JADX INFO: renamed from: o.ggz$Activity */
    public static final class Activity implements C8475bDS.TaskDescription {
        public final /* synthetic */ C20446ggz<T> EZpvd;

        @Override // o.C8475bDS.TaskDescription
        public void OLrzqt() {
        }

        public Activity(C20446ggz<T> c20446ggz) {
            this.EZpvd = c20446ggz;
        }

        @Override // o.C8475bDS.TaskDescription
        public void EZpvd() {
            this.EZpvd.gGvvIC();
        }
    }

    @Override // o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<T>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmTransfer;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.gkZNMa);
        PlatformItem dapp = ejfBZ().OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        C57431yiL c57431yiLTitleInfoView$default = AbstractC20102gaZ.titleInfoView$default(this, strKWHzl, strAYXKKw, null, urlOnlyHost == null ? "" : urlOnlyHost, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        this.AwvSrB = c57431yiLTitleInfoView$default;
        actionBar.OLrzqt(c57431yiLTitleInfoView$default);
        actionBar.OLrzqt(fFgQHt());
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(EZpvd());
        actionBar.OLrzqt(copydefault(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPrepareActionMode), ejfBZ().dHguZz().iRxXKY() ? ejfBZ().fERRXa().getAddressTypeText() : ""));
        actionBar.OLrzqt(gasjUx());
        actionBar.OLrzqt(fZBcTu());
        actionBar.OLrzqt(QUSxYX());
        UeEOUB();
    }

    public final android.view.View fFgQHt() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57435yiP c57435yiP = new C57435yiP(contextRequireContext, null, 0, 6, null);
        this.hDKMBd = c57435yiP;
        c57435yiP.setViewDataBean(QVAiDq());
        return c57435yiP;
    }

    public final void gGvvIC() {
        C57435yiP c57435yiP = this.hDKMBd;
        TransferAssetInfoBean transferAssetInfoBeanQVAiDq = QVAiDq();
        if (c57435yiP != null) {
            c57435yiP.setViewDataBean(transferAssetInfoBeanQVAiDq);
        }
        if (c57435yiP == null || !transferAssetInfoBeanQVAiDq.getChanged()) {
            return;
        }
        copydefault(C56402yEa.EZpvd(c57435yiP));
    }

    public TransferAssetInfoBean QVAiDq() {
        java.lang.String strEZpvd;
        java.lang.String str;
        java.lang.String strFJNWhG;
        java.lang.String str2;
        java.lang.String str3;
        C10854bwM c10854bwMFHqPtx = ejfBZ().fHqPtx();
        java.lang.String strDNCPSb = C10854bwM.isXRCToken$default(c10854bwMFHqPtx, null, 1, null) ? c10854bwMFHqPtx.dNCPSb() : "";
        if (ejfBZ().B_()) {
            java.lang.String strEZpvd2 = C54870xYj.EZpvd(AbstractC8704bHj.getTransferAmount$default(ejfBZ(), false, false, 3, null), c10854bwMFHqPtx.valueOf(), c10854bwMFHqPtx.DTwDnp(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            strFJNWhG = c10854bwMFHqPtx.fJNWhG();
            str3 = strEZpvd2;
            str2 = strDNCPSb;
            str = "";
            strEZpvd = dNCPSb();
        } else {
            java.lang.String strDNCPSb2 = dNCPSb();
            strEZpvd = C54870xYj.EZpvd(AbstractC8704bHj.getTransferAmount$default(ejfBZ(), false, false, 3, null), c10854bwMFHqPtx.valueOf(), c10854bwMFHqPtx.DTwDnp(), C14731dqw.AEQbTJ.AEQbTJ(c10854bwMFHqPtx.fJNWhG(), 12), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            str = strDNCPSb;
            strFJNWhG = "";
            str2 = strFJNWhG;
            str3 = strDNCPSb2;
        }
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) this.zsXlph);
        this.zsXlph = str3;
        boolean z = (zEZpvd ^ true) || !Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) this.AuCTelauCTel);
        this.AuCTelauCTel = strEZpvd;
        return new TransferAssetInfoBean(null, null, 0, 2, str3, strFJNWhG, str2, strEZpvd, str, z, 7, null);
    }

    public final java.lang.String dNCPSb() {
        return ejfBZ().fHqPtx().DarRvM() ? "" : ejfBZ().EZpvd(true);
    }

    public final java.lang.String RcXXUw() {
        java.lang.String strAEQbTJ;
        T tEjfBZ = ejfBZ();
        InterfaceC9778bbx interfaceC9778bbx = tEjfBZ instanceof InterfaceC9778bbx ? (InterfaceC9778bbx) tEjfBZ : null;
        if (interfaceC9778bbx == null || (strAEQbTJ = interfaceC9778bbx.AEQbTJ()) == null || Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) EIP1271Verifier.hexPrefix)) {
            return null;
        }
        return strAEQbTJ;
    }

    public android.view.View gasjUx() {
        java.lang.String strAYXKKw;
        java.lang.String string;
        if (dxcTrN()) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDrawerSlideAnimationEnabled);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.generateConfigDelta_locale);
        }
        java.lang.String str = strAYXKKw;
        java.lang.String strAn_ = ejfBZ().an_();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ejfBZ().z_())) {
            string = ejfBZ().z_();
        } else {
            android.os.Bundle arguments = getArguments();
            string = arguments != null ? arguments.getString(MTAnalysisConstants.Account.KEY_ACCOUNT) : null;
        }
        if (string == null) {
            string = "";
        }
        C57457yil c57457yilAddressView$default = AbstractC20102gaZ.addressView$default(this, str, strAn_, null, null, string, null, true, new Function1() { // from class: o.ggI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20446ggz.OLrzqt(this.copydefault, (java.lang.String) obj);
            }
        }, false, null, 812, null);
        this.AxsJAY = c57457yilAddressView$default;
        return c57457yilAddressView$default;
    }

    public static final Unit OLrzqt(C20446ggz c20446ggz, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c20446ggz.djBIcL();
        return Unit.INSTANCE;
    }

    public final android.view.View fZBcTu() {
        kotlin.Pair pairOLrzqt;
        if (!(ejfBZ() instanceof InterfaceC9747bbS)) {
            return null;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ejfBZ().y_())) {
            finit().OLrzqt.setVisibility(8);
            finit().copydefault.getRoot().setVisibility(0);
            finit().copydefault.KWHzl.setText(ejfBZ().y_());
            T tEjfBZ = ejfBZ();
            Intrinsics.copydefault(tEjfBZ, "");
            InterfaceC9747bbS interfaceC9747bbS = (InterfaceC9747bbS) tEjfBZ;
            java.lang.String strY_ = ejfBZ().y_();
            interfaceC9747bbS.EZpvd(strY_ != null ? strY_ : "");
            return finit().getRoot();
        }
        if (ejfBZ().dHguZz().DGOPHZ()) {
            T tEjfBZ2 = ejfBZ();
            Intrinsics.copydefault(tEjfBZ2, "");
            if (((C11945cde) tEjfBZ2).QKVWgx()) {
                pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentDialog), C33070mpX.AYXKKw(C13754dXa.FragmentManager.FullyDrawnReporter));
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.r8lambdaKrBLxNpMJdSxVU3Lsj65hn0UyA), C33070mpX.AYXKKw(C13754dXa.FragmentManager.FullyDrawnReporter));
            }
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fAklCm), C33070mpX.AYXKKw(C13754dXa.FragmentManager.RhjxDW));
        }
        java.lang.String str = (java.lang.String) pairOLrzqt.component1();
        java.lang.String str2 = (java.lang.String) pairOLrzqt.component2();
        C17043evO c17043evOKWHzl = C17043evO.KWHzl(getLayoutInflater(), finit().OLrzqt.fIwbmz(), false);
        c17043evOKWHzl.getRoot().setText(str);
        C55008xbo c55008xbo = finit().OLrzqt;
        android.widget.TextView root = c17043evOKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55008xbo.setLabelView(root);
        finit().copydefault.getRoot().setVisibility(8);
        finit().OLrzqt.setVisibility(0);
        C17048evT c17048evTKWHzl = C17048evT.KWHzl(getLayoutInflater(), finit().OLrzqt.fIwbmz(), false);
        c17048evTKWHzl.getRoot().setHint(str2);
        T tEjfBZ3 = ejfBZ();
        Intrinsics.copydefault(tEjfBZ3, "");
        java.lang.String strCopydefault = ((InterfaceC9747bbS) tEjfBZ3).copydefault();
        if (strCopydefault.length() > 0) {
            c17048evTKWHzl.getRoot().setText(strCopydefault);
        }
        T tEjfBZ4 = ejfBZ();
        Intrinsics.copydefault(tEjfBZ4, "");
        int iKWHzl = ((InterfaceC9747bbS) tEjfBZ4).KWHzl();
        if (iKWHzl > 0) {
            c17048evTKWHzl.getRoot().setFilters(new C57482yjJ[]{new C57482yjJ(iKWHzl + 1)});
        }
        OKEditText root2 = c17048evTKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        root2.addTextChangedListener(new LoaderManager());
        finit().OLrzqt.setSizeType(100);
        C55008xbo c55008xbo2 = finit().OLrzqt;
        OKEditText root3 = c17048evTKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "");
        c55008xbo2.setContentView(root3);
        c17048evTKWHzl.getRoot().setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return finit().getRoot();
    }

    public C57464yis QUSxYX() {
        T tEjfBZ = ejfBZ();
        if ((tEjfBZ instanceof InterfaceC9778bbx) && ((InterfaceC9778bbx) tEjfBZ).KWHzl() && dvKsVJ()) {
            return AbstractC20102gaZ.moreView$default(this, C33129mqd.OLrzqt((java.lang.CharSequence) RcXXUw()), null, new Function1() { // from class: o.ggM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20446ggz.KWHzl(this.copydefault, (AbstractC20082gaF.ActionBar) obj);
                }
            }, 2, null);
        }
        return null;
    }

    public static final Unit KWHzl(C20446ggz c20446ggz, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        java.lang.String strRcXXUw = c20446ggz.RcXXUw();
        actionBar.OLrzqt(c20446ggz.copydefault(strRcXXUw != null ? strRcXXUw : ""));
        return Unit.INSTANCE;
    }

    public android.view.View copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C17043evO c17043evOKWHzl = C17043evO.KWHzl(getLayoutInflater(), djSkpj().OLrzqt.fIwbmz(), false);
        c17043evOKWHzl.getRoot().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl4));
        C55008xbo c55008xbo = djSkpj().OLrzqt;
        android.widget.TextView root = c17043evOKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55008xbo.setLabelView(root);
        C17048evT c17048evTKWHzl = C17048evT.KWHzl(getLayoutInflater(), djSkpj().OLrzqt.fIwbmz(), false);
        c17048evTKWHzl.getRoot().setHint(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onDetachedFromWindow));
        java.lang.String strRcXXUw = RcXXUw();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strRcXXUw)) {
            c17048evTKWHzl.getRoot().setText(strRcXXUw);
        }
        OKEditText root2 = c17048evTKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        root2.addTextChangedListener(new Application());
        djSkpj().OLrzqt.setSizeType(100);
        C55008xbo c55008xbo2 = djSkpj().OLrzqt;
        OKEditText root3 = c17048evTKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "");
        c55008xbo2.setContentView(root3);
        c17048evTKWHzl.getRoot().setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        android.view.View root4 = djSkpj().getRoot();
        Intrinsics.checkNotNullExpressionValue(root4, "");
        return root4;
    }

    /* JADX INFO: renamed from: o.ggz$ActionBar */
    public static final class ActionBar implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ C20446ggz<T> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(C20446ggz<T> c20446ggz) {
            this.copydefault = c20446ggz;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            KWHzl(th);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.Throwable th) {
            this.copydefault.gEmmrt().KWHzl.copydefault().fIwbmz();
        }
    }

    /* JADX INFO: renamed from: o.ggz$StateListAnimator */
    public static final class StateListAnimator implements Function1<kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.String>, Unit> {
        public final /* synthetic */ C20446ggz<T> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(C20446ggz<T> c20446ggz) {
            this.KWHzl = c20446ggz;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.String> pair) {
            KWHzl(pair);
            return Unit.INSTANCE;
        }

        public final void KWHzl(kotlin.Pair<java.lang.Boolean, java.lang.String> pair) {
            this.KWHzl.gEmmrt().KWHzl.copydefault().fIwbmz();
        }
    }

    private final void UeEOUB() {
        if (dxcTrN()) {
            java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.KWHzl(AbstractC8704bHj.getTransferAmount$default(ejfBZ(), false, false, 3, null), ejfBZ().QKudOq().AEQbTJ()), false, null, null, 7, null);
            java.lang.String str = AbstractC8426bCW.formatToFeeCoinAmount$default(ejfBZ().QKudOq(), strConvertToString$default, false, false, false, 14, null) + AbstractC8426bCW.formatToFeeCurrencyAmount$default(ejfBZ().QKudOq(), strConvertToString$default, false, false, false, 14, null);
            if (AEQbTJ()) {
                str = "--";
            }
            AbstractC20102gaZ.showTotalCostView$default(this, null, str, 1, null);
        }
    }

    public final boolean dxcTrN() {
        java.lang.Integer txSource = ejfBZ().OJuSTm().getTxSource();
        return txSource != null && txSource.intValue() == 2;
    }

    @Override // o.AbstractC20080gaD
    public void KWHzl(@NotNull AbstractC8426bCW<?> abstractC8426bCW, @NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(abstractC8426bCW, "");
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        super.KWHzl(abstractC8426bCW, c8486bDd);
        if (ejfBZ().UlJrfe().copydefault(C56524yIo.AEQbTJ(C9868bdh.class))) {
            OLrzqt();
        }
        gGvvIC();
        UeEOUB();
    }

    @Override // o.AbstractC20080gaD, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.lang.String string;
        java.lang.String strCopydefault;
        java.lang.String strOLrzqt;
        java.lang.String toFeeCoinAmount$default;
        android.widget.TextView textViewCopydefault;
        Intrinsics.checkNotNullParameter(collection, "");
        KWHzl(collection);
        AEQbTJ(collection);
        java.lang.String str = null;
        java.lang.String transferAmount$default = AbstractC8704bHj.getTransferAmount$default(ejfBZ(), false, false, 3, null);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("deposit_limit")) == null) {
            string = "0";
        }
        java.util.Collection<? extends AbstractC9832bcy> collection2 = collection;
        java.util.Collection<? extends AbstractC9832bcy> collection3 = collection2;
        if (collection3.isEmpty()) {
            finit().OLrzqt.values();
        } else {
            java.util.Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                if (((AbstractC9832bcy) it.next()) instanceof C9800bcS) {
                    C55008xbo c55008xbo = finit().OLrzqt;
                    int i = C13754dXa.FragmentManager.setLogo;
                    T tEjfBZ = ejfBZ();
                    Intrinsics.copydefault(tEjfBZ, "");
                    c55008xbo.setErrorText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(((InterfaceC9747bbS) tEjfBZ).KWHzl())))));
                    break;
                }
            }
            finit().OLrzqt.values();
        }
        if (collection3.isEmpty()) {
            djSkpj().OLrzqt.values();
        } else {
            java.util.Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                if (((AbstractC9832bcy) it2.next()) instanceof C9795bcN) {
                    djSkpj().OLrzqt.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.uncaughtException));
                    break;
                }
            }
            djSkpj().OLrzqt.values();
        }
        AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection2);
        if (abstractC9832bcy instanceof C9868bdh) {
            java.lang.String strAEQbTJ = ((C9868bdh) abstractC9832bcy).AEQbTJ();
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, strAEQbTJ == null ? "" : strAEQbTJ, (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9870bdj) {
            if (((C9870bdj) abstractC9832bcy).gEmmrt()) {
                C57431yiL c57431yiL = this.AwvSrB;
                if (c57431yiL != null) {
                    c57431yiL.setViewDataBean(new TransactionTopHeaderInfoBean(C33070mpX.KWHzl(C57406yhn.Activity.QUSxYX), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.OYuSWK), null, null, null, null, null, 250, null));
                    return;
                }
                return;
            }
            C57457yil c57457yil = this.AxsJAY;
            if (c57457yil == null || (textViewCopydefault = c57457yil.copydefault()) == null) {
                return;
            }
            textViewCopydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
            return;
        }
        if (abstractC9832bcy instanceof C9825bcr) {
            C10854bwM feeCoinMeta = ejfBZ().QKudOq().KWHzl().getFeeCoinMeta();
            int i2 = C13754dXa.FragmentManager.describeContents;
            AbstractC8426bCW abstractC8426bCWQKudOq = ejfBZ().QKudOq();
            java.lang.String strOLrzqt2 = ((C9825bcr) abstractC9832bcy).OLrzqt();
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8426bCWQKudOq, strOLrzqt2 == null ? "" : strOLrzqt2, false, false, false, 10, null)))), C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", feeCoinMeta.fJNWhG()))), new Function0() { // from class: o.ggH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20446ggz.hDKMBd(this.AEQbTJ);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            return;
        }
        if ((abstractC9832bcy instanceof C9784bcC) || (abstractC9832bcy instanceof C9811bcd) || (abstractC9832bcy instanceof C9864bdd)) {
            C8486bDd c8486bDdKWHzl = ejfBZ().QKudOq().KWHzl();
            java.lang.String strFJNWhG = c8486bDdKWHzl.getFeeCoinMeta().fJNWhG();
            if (!(c8486bDdKWHzl instanceof C9215bRQ)) {
                strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.onFitSystemWindows, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG)));
            } else if (ejfBZ().heceqZ()) {
                strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialROgMPW, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG)));
            } else {
                strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG)));
            }
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, strCopydefault, C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", strFJNWhG))), new Function0() { // from class: o.ggN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20446ggz.getFieldNames(this.KWHzl);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            return;
        }
        if (!ejfBZ().dHguZz().QkdxfA() && !(ejfBZ() instanceof AbstractC12102cgc) && C33129mqd.AEQbTJ(transferAmount$default) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.QsIRgs), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9813bcf) {
            java.lang.String strAEQbTJ2 = C14731dqw.AEQbTJ.AEQbTJ(ejfBZ().fHqPtx().fJNWhG(), 12);
            if (ejfBZ() instanceof C12319ckh) {
                toFeeCoinAmount$default = ((C9813bcf) abstractC9832bcy).copydefault();
            } else {
                toFeeCoinAmount$default = AbstractC8426bCW.formatToFeeCoinAmount$default(ejfBZ().QKudOq(), ((C9813bcf) abstractC9832bcy).copydefault(), false, false, false, 10, null);
            }
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.dispatchKeyShortcutEvent, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, toFeeCoinAmount$default), C56390yDp.OLrzqt("currency", strAEQbTJ2))), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9822bco) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.dispatchKeyShortcutEvent, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, AbstractC8426bCW.formatToFeeCoinAmount$default(ejfBZ().QKudOq(), ((C9822bco) abstractC9832bcy).copydefault(), false, false, false, 10, null)), C56390yDp.OLrzqt("currency", C14731dqw.AEQbTJ.AEQbTJ(ejfBZ().fHqPtx().fJNWhG(), 12)))), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        if (C33129mqd.AEQbTJ(string, 0) && C33129mqd.gEmmrt(C54870xYj.AEQbTJ(transferAmount$default, ejfBZ().fHqPtx().valueOf()), string)) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.IntentSenderRequestBuilder, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, string), C56390yDp.OLrzqt("currency", ejfBZ().fHqPtx().fJNWhG()))), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        if ((abstractC9832bcy instanceof C9808bca) || (abstractC9832bcy instanceof C9754bbZ)) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.FQMcgE), C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", ejfBZ().fHqPtx().fJNWhG()))), new Function0() { // from class: o.ggT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20446ggz.getNewProxyInstance(this.copydefault);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9865bde) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.AppCompatDelegateImplAppCompatWindowCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", ((C9865bde) abstractC9832bcy).KWHzl()))), C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", ejfBZ().dHguZz().fJNWhG()))), new Function0() { // from class: o.ggY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20446ggz.uzCIH(this.OLrzqt);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9881bdu) {
            AbstractC20102gaZ.updateReminder$default(this, null, 1, null);
            OLrzqt();
            return;
        }
        if (abstractC9832bcy instanceof C9802bcU) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.onBackPressedDispatcherlambda1), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9885bdy) {
            final C10854bwM feeCoinMeta2 = ejfBZ().QKudOq().KWHzl().getFeeCoinMeta();
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.setSupportProgressBarVisibility, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, ((C9885bdy) abstractC9832bcy).OLrzqt()))), C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", feeCoinMeta2.fJNWhG()))), new Function0() { // from class: o.gha
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20446ggz.copydefault(this.EZpvd, feeCoinMeta2);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9867bdg) {
            final C10854bwM feeCoinMeta3 = ejfBZ().QKudOq().KWHzl().getFeeCoinMeta();
            int i3 = C13754dXa.FragmentManager.onAttachedFromWindow;
            T tEjfBZ2 = ejfBZ();
            Intrinsics.copydefault(tEjfBZ2, "");
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, ((C9443bVg) tEjfBZ2).OLrzqt(true)))), C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", feeCoinMeta3.fJNWhG()))), new Function0() { // from class: o.ggZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20446ggz.EZpvd(this.OLrzqt, feeCoinMeta3);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9884bdx) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.startSupportActionModeFromWindow), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        if (!(abstractC9832bcy instanceof C9872bdl)) {
            if (abstractC9832bcy == null) {
                AbstractC20102gaZ.updateReminder$default(this, null, 1, null);
                return;
            }
            return;
        }
        C9872bdl c9872bdl = (C9872bdl) abstractC9832bcy;
        C9796bcO c9796bcOKWHzl = c9872bdl.KWHzl();
        if (c9796bcOKWHzl != null) {
            if (C33492mxV.OLrzqt()) {
                strOLrzqt = c9796bcOKWHzl.AEQbTJ();
            } else {
                strOLrzqt = c9796bcOKWHzl.OLrzqt();
            }
            str = strOLrzqt;
        }
        java.lang.String str2 = str;
        java.lang.String strCopydefault2 = c9872bdl.copydefault();
        KWHzl(new TransactionTopReminderInfoBean(str2, strCopydefault2 == null ? "" : strCopydefault2, (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 60, (DefaultConstructorMarker) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.bCW] */
    public static final Unit hDKMBd(C20446ggz c20446ggz) throws CoinMetaError {
        c20446ggz.gHZMYf();
        C10854bwM c10854bwMAYXKKw = ((AbstractC8664bGw) c20446ggz.ejfBZ()).QKudOq().AYXKKw();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = c20446ggz.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMAYXKKw.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwMAYXKKw.OLrzqt()), "wallet", "gas", yDY.copydefault("dex"), (java.util.ArrayList) null, false, (java.lang.String) null, ((AbstractC8664bGw) c20446ggz.ejfBZ()).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.bCW] */
    public static final Unit getFieldNames(C20446ggz c20446ggz) throws CoinMetaError {
        c20446ggz.gHZMYf();
        C10854bwM c10854bwMAYXKKw = ((AbstractC8664bGw) c20446ggz.ejfBZ()).QKudOq().AYXKKw();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = c20446ggz.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMAYXKKw.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwMAYXKKw.OLrzqt()), "wallet", "gas", yDY.copydefault("dex"), (java.util.ArrayList) null, false, (java.lang.String) null, ((AbstractC8664bGw) c20446ggz.ejfBZ()).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getNewProxyInstance(C20446ggz c20446ggz) {
        C10854bwM c10854bwMFHqPtx = ((AbstractC8664bGw) c20446ggz.ejfBZ()).fHqPtx();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = c20446ggz.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMFHqPtx.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwMFHqPtx.OLrzqt()), "wallet", "balance", yDY.copydefault("gas_station"), (java.util.ArrayList) null, false, (java.lang.String) null, ((AbstractC8664bGw) c20446ggz.ejfBZ()).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit uzCIH(C20446ggz c20446ggz) {
        C10854bwM c10854bwMFHqPtx = ((AbstractC8664bGw) c20446ggz.ejfBZ()).fHqPtx();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = c20446ggz.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMFHqPtx.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwMFHqPtx.OLrzqt()), "wallet", "balance", yDY.copydefault("gas_station"), (java.util.ArrayList) null, false, (java.lang.String) null, ((AbstractC8664bGw) c20446ggz.ejfBZ()).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C20446ggz c20446ggz, C10854bwM c10854bwM) {
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = c20446ggz.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwM.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwM.OLrzqt()), "wallet", "balance", yDY.copydefault("gas_station"), (java.util.ArrayList) null, false, (java.lang.String) null, ((AbstractC8664bGw) c20446ggz.ejfBZ()).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C20446ggz c20446ggz, C10854bwM c10854bwM) {
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = c20446ggz.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwM.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwM.OLrzqt()), "wallet", "balance", yDY.copydefault("gas_station"), (java.util.ArrayList) null, false, (java.lang.String) null, ((AbstractC8664bGw) c20446ggz.ejfBZ()).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    private final void KWHzl(java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9788bcG) {
                arrayList.add(obj);
            }
        }
        C9788bcG c9788bcG = (C9788bcG) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (c9788bcG == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.wlaJM), 0)) {
            return;
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        android.content.res.Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        RiskPageInfoBean riskPageInfoBean = new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(activity, resources, C13754dXa.FragmentManager.ViewTreeOnBackPressedDispatcherOwner, "case", null, c9788bcG), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DCJXGO), null, null, null, null, null, ejfBZ() instanceof C9303bSz ? "" : C33070mpX.AYXKKw(C13754dXa.FragmentManager.asInterface), false, 1524, null);
        C17944fYb c17944fYb = C17944fYb.AEQbTJ;
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            return;
        }
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c17944fYb.OLrzqt(activity2, parentFragmentManager, C13754dXa.ActionBar.DfrfUJ, riskPageInfoBean, c9788bcG, new Function0() { // from class: o.ggJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20446ggz.AuCTel(this.OLrzqt);
            }
        });
        this.wlaJM++;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AuCTel(final C20446ggz c20446ggz) {
        long jAEQbTJ = ((AbstractC8664bGw) c20446ggz.ejfBZ()).dHguZz().AEQbTJ();
        java.lang.String strZLjUOn = ((AbstractC8664bGw) c20446ggz.ejfBZ()).zLjUOn();
        java.lang.String strHtlTjW = ((AbstractC8664bGw) c20446ggz.ejfBZ()).htlTjW();
        c20446ggz.QbewEr().EZpvd(jAEQbTJ, strHtlTjW, strZLjUOn, 2, ((AbstractC8664bGw) c20446ggz.ejfBZ()).dUDNAs().USBtdM(), ((AbstractC8664bGw) c20446ggz.ejfBZ()).dUDNAs().DbNXlk(), new Function0() { // from class: o.ggQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20446ggz.fIwbmz(this.KWHzl);
            }
        }, ((AbstractC8664bGw) c20446ggz.ejfBZ()).dUDNAs().aUsmxb());
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(C20446ggz c20446ggz) {
        C55284xgz.Activity activity = C55284xgz.Companion;
        android.content.Context context = c20446ggz.getContext();
        Intrinsics.copydefault(context, "");
        android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
        Intrinsics.copydefault(decorView, "");
        final C55284xgz c55284xgzKWHzl = activity.KWHzl((android.view.ViewGroup) decorView, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegate));
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegate));
            c55284xgzKWHzl.EZpvd(new View.OnClickListener() { // from class: o.ggK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20446ggz.AEQbTJ(c55284xgzKWHzl, view);
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

    public static final void AEQbTJ(C55284xgz c55284xgz, android.view.View view) {
        c55284xgz.copydefault();
    }

    public final void AEQbTJ(java.util.Collection<? extends AbstractC9832bcy> collection) {
        RiskPageInfoBean riskPageInfoBean;
        FragmentActivity activity;
        java.lang.String strCopydefault;
        java.util.Collection<? extends AbstractC9832bcy> collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection2) {
            if (obj instanceof C9870bdj) {
                arrayList.add(obj);
            }
        }
        C9870bdj c9870bdj = (C9870bdj) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        boolean zAEQbTJ = c9870bdj != null ? c9870bdj.AEQbTJ() : false;
        boolean zGEmmrt = c9870bdj != null ? c9870bdj.gEmmrt() : false;
        boolean z = (c9870bdj == null || (strCopydefault = c9870bdj.copydefault()) == null || strCopydefault.length() <= 0 || zGEmmrt) ? false : true;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : collection2) {
            if (obj2 instanceof C9874bdn) {
                arrayList2.add(obj2);
            }
        }
        C9874bdn c9874bdn = (C9874bdn) CollectionsKt___CollectionsKt.firstOrNull(arrayList2);
        if ((z || zAEQbTJ) && c9870bdj != null && C33129mqd.valueOf(java.lang.Integer.valueOf(this.wlaJM), 0)) {
            if (zAEQbTJ) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
                C14128dfc c14128dfc = C14128dfc.KWHzl;
                FragmentActivity activity2 = getActivity();
                if (activity2 == null) {
                    return;
                }
                android.content.res.Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                riskPageInfoBean = new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(activity2, resources, C13754dXa.FragmentManager.iluEmO, "case", C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, C14079deg.getAddressStr$default(C14079deg.EZpvd, c9870bdj.copydefault(), false, 2, null))), c9870bdj), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, null, null, null, null, ejfBZ() instanceof C9303bSz ? "" : C33070mpX.AYXKKw(C13754dXa.FragmentManager.asInterface), false, 1524, null);
            } else {
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
                C14128dfc c14128dfc2 = C14128dfc.KWHzl;
                FragmentActivity activity3 = getActivity();
                if (activity3 == null) {
                    return;
                }
                android.content.res.Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "");
                riskPageInfoBean = new RiskPageInfoBean(strAYXKKw2, c14128dfc2.copydefault(activity3, resources2, C13754dXa.FragmentManager.sWlOSi, "case", C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, C14079deg.getAddressStr$default(C14079deg.EZpvd, c9870bdj.copydefault(), false, 2, null))), c9870bdj), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.asInterface), false, MTPushConstants.Message.CODE_MESSAGE_OPENED, null);
            }
            RiskPageInfoBean riskPageInfoBean2 = riskPageInfoBean;
            C17944fYb c17944fYb = C17944fYb.AEQbTJ;
            FragmentActivity activity4 = getActivity();
            if (activity4 == null) {
                return;
            }
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            c17944fYb.OLrzqt(activity4, parentFragmentManager, C13754dXa.ActionBar.DfrfUJ, riskPageInfoBean2, c9870bdj, new Function0() { // from class: o.ggF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20446ggz.ejfBZ(this.OLrzqt);
                }
            });
            this.wlaJM++;
            return;
        }
        if (c9874bdn != null && C33129mqd.valueOf(java.lang.Integer.valueOf(this.wlaJM), 0)) {
            C17944fYb c17944fYb2 = C17944fYb.AEQbTJ;
            FragmentActivity activity5 = getActivity();
            if (activity5 == null) {
                return;
            }
            androidx.fragment.app.FragmentManager parentFragmentManager2 = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "");
            C17944fYb.showSafeRiskTipProcess$default(c17944fYb2, activity5, parentFragmentManager2, C13754dXa.ActionBar.DfrfUJ, new RiskPageInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPlayFromMediaId), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, false, 1540, null), c9874bdn, null, 32, null);
            this.wlaJM++;
            return;
        }
        if (!zGEmmrt || c9870bdj == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.wlaJM), 0) || (activity = getActivity()) == null) {
            return;
        }
        androidx.fragment.app.FragmentManager parentFragmentManager3 = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager3, "");
        AEQbTJ(activity, parentFragmentManager3, C13754dXa.ActionBar.DfrfUJ, c9870bdj.copydefault(), c9870bdj.KWHzl());
        this.wlaJM++;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit ejfBZ(final C20446ggz c20446ggz) {
        long jAEQbTJ = ((AbstractC8664bGw) c20446ggz.ejfBZ()).dHguZz().AEQbTJ();
        java.lang.String strZLjUOn = ((AbstractC8664bGw) c20446ggz.ejfBZ()).zLjUOn();
        java.lang.String strHtlTjW = ((AbstractC8664bGw) c20446ggz.ejfBZ()).htlTjW();
        c20446ggz.QbewEr().EZpvd(jAEQbTJ, strHtlTjW, strZLjUOn, 2, ((AbstractC8664bGw) c20446ggz.ejfBZ()).dUDNAs().USBtdM(), ((AbstractC8664bGw) c20446ggz.ejfBZ()).dUDNAs().DbNXlk(), new Function0() { // from class: o.ggV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20446ggz.fARcdN(this.AEQbTJ);
            }
        }, ((AbstractC8664bGw) c20446ggz.ejfBZ()).dUDNAs().aUsmxb());
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(C20446ggz c20446ggz) {
        C55284xgz.Activity activity = C55284xgz.Companion;
        android.content.Context context = c20446ggz.getContext();
        Intrinsics.copydefault(context, "");
        android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
        Intrinsics.copydefault(decorView, "");
        final C55284xgz c55284xgzKWHzl = activity.KWHzl((android.view.ViewGroup) decorView, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegate));
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegate));
            c55284xgzKWHzl.EZpvd(new View.OnClickListener() { // from class: o.ggS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20446ggz.KWHzl(c55284xgzKWHzl, view);
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

    public static final void KWHzl(C55284xgz c55284xgz, android.view.View view) {
        c55284xgz.copydefault();
    }

    public final void AEQbTJ(final FragmentActivity fragmentActivity, final androidx.fragment.app.FragmentManager fragmentManager, @androidx.annotation.IdRes int i, java.lang.String str, java.lang.String str2) {
        fragmentManager.beginTransaction().add(i, C20479ghf.Companion.KWHzl(str, str2, new Function0() { // from class: o.ggW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20446ggz.AEQbTJ(fragmentManager);
            }
        }, new Function0() { // from class: o.ggU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20446ggz.KWHzl(fragmentActivity);
            }
        }), "SimilarAddressTipFragment").commitAllowingStateLoss();
    }

    public static final Unit AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager) {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("SimilarAddressTipFragment");
        if (fragmentFindFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(FragmentActivity fragmentActivity) {
        fragmentActivity.finish();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC20082gaF
    public void getFieldNames() {
        if (values() instanceof C9821bcn) {
            fvQaOB();
        } else {
            super.getFieldNames();
        }
    }

    public final void fvQaOB() {
        C20300geL c20300geLOLrzqt = C20300geL.Companion.OLrzqt(new Function0() { // from class: o.ggE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20446ggz.AubY(this.AEQbTJ);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c20300geLOLrzqt.show(childFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AubY(C20446ggz c20446ggz) {
        c20446ggz.showLoadingWithLogo();
        C10854bwM c10854bwMFHqPtx = ((AbstractC8664bGw) c20446ggz.ejfBZ()).fHqPtx();
        fXM.initTransaction$default(c20446ggz.fARcdN(), new SignDataArgs(((AbstractC8664bGw) c20446ggz.ejfBZ()).Dmq(), null, c10854bwMFHqPtx.fetchVPNInfo(), new EVMContractSignData(null, null, null, c10854bwMFHqPtx.AuCTel() ? AbstractC8704bHj.getTransferAmount$default((AbstractC8704bHj) c20446ggz.ejfBZ(), false, false, 3, null) : "0", ((AbstractC8664bGw) c20446ggz.ejfBZ()).zLjUOn(), c20446ggz.RcXXUw(), ((AbstractC8664bGw) c20446ggz.ejfBZ()).htlTjW(), null, null, null, null, null, null, null, 16263, null), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, true, false, false, false, 15728626, null), false, false, 6, null);
        ((AbstractC8664bGw) c20446ggz.ejfBZ()).fFgQHt();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC20082gaF
    public void OLrzqt(@NotNull final C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
        C20690gle.OLrzqt.copydefault(true);
        KWHzl(new Function0() { // from class: o.ggG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20446ggz.AEQbTJ(this.AEQbTJ, c9748bbT);
            }
        });
        C32866mlf.onEvent$default("Web3SendCoin_SendResult_Api_Status", (TrackChannel[]) null, new Function1() { // from class: o.ggD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20446ggz.OLrzqt(c9748bbT, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C20446ggz c20446ggz, C9748bbT c9748bbT) {
        c20446ggz.KWHzl(c9748bbT);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C9748bbT c9748bbT, C20446ggz c20446ggz, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String strKWHzl = c9748bbT.KWHzl();
        eventParamsList.put("hash", strKWHzl != null ? strKWHzl : "", false);
        eventParamsList.put("network", ((AbstractC8664bGw) c20446ggz.ejfBZ()).dHguZz().fJNWhG(), false);
        eventParamsList.put("to_address", ((AbstractC8664bGw) c20446ggz.ejfBZ()).an_(), false);
        eventParamsList.put("from_address", ((AbstractC8664bGw) c20446ggz.ejfBZ()).spnCvw(), false);
        eventParamsList.put("token_symbol", ((AbstractC8664bGw) c20446ggz.ejfBZ()).fHqPtx().fJNWhG(), false);
        eventParamsList.put("token_contract_address", ((AbstractC8664bGw) c20446ggz.ejfBZ()).fHqPtx().OLrzqt(), false);
        return Unit.INSTANCE;
    }

    private final void KWHzl(final Function0<Unit> function0) {
        java.lang.String string;
        SendCoinRecordEntity sendCoinRecordEntity = new SendCoinRecordEntity(null, null, null, null, null, 0L, 0, 127, null);
        C10854bwM c10854bwMFHqPtx = ejfBZ().fHqPtx();
        java.lang.String strZLjUOn = ejfBZ().zLjUOn();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("ens_domain")) == null) {
            string = "";
        }
        if (string.length() > 0 && StringsKt__StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (java.lang.Object) null)) {
            sendCoinRecordEntity.setAddress(string);
        } else {
            C10854bwM c10854bwMKWHzl = c10854bwMFHqPtx.KWHzl();
            sendCoinRecordEntity.setAddress((c10854bwMKWHzl == null || !c10854bwMKWHzl.DGgnkA()) ? strZLjUOn : ejfBZ().an_());
        }
        sendCoinRecordEntity.setChainId(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMFHqPtx.AhwBna())));
        sendCoinRecordEntity.setWalletId(ejfBZ().dUDNAs().DbNXlk());
        sendCoinRecordEntity.setChainName(c10854bwMFHqPtx.djBIcL());
        java.util.List<C13853daS> listAEQbTJ = C13847daM.Companion.AEQbTJ(strZLjUOn);
        if (listAEQbTJ.isEmpty()) {
            sendCoinRecordEntity.setChainUrl(c10854bwMFHqPtx.copydefault());
        } else {
            for (C13853daS c13853daS : listAEQbTJ) {
                if (Intrinsics.EZpvd((java.lang.Object) c13853daS.copydefault().djBIcL(), (java.lang.Object) sendCoinRecordEntity.getChainName())) {
                    sendCoinRecordEntity.setChainUrl(c13853daS.copydefault().copydefault());
                }
            }
        }
        sendCoinRecordEntity.setCreateTime(java.lang.System.currentTimeMillis());
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("is_smart_account")) {
            sendCoinRecordEntity.setSmartContract();
        }
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtKWHzl = cGL.KWHzl.KWHzl(sendCoinRecordEntity);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(abstractC58260yxtKWHzl, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.ggL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20446ggz.OLrzqt(function0, (java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ggO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20446ggz.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ggP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20446ggz.KWHzl(function0, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ggR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20446ggz.isConnected(function12, obj);
            }
        });
    }

    public static final Unit KWHzl(Function0 function0, java.lang.Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function0 function0, java.lang.Long l) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final boolean dvKsVJ() {
        java.lang.Boolean shouldShowTransferEditableData;
        TransferConfig transferConfig = (TransferConfig) C48787ucK.AEQbTJ.EZpvd(getFieldNames, TransferConfig.class);
        return (transferConfig == null || (shouldShowTransferEditableData = transferConfig.getShouldShowTransferEditableData()) == null || !shouldShowTransferEditableData.booleanValue()) ? false : true;
    }
}
