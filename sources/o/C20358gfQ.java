package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.api.model.tx.signdata.IntervalMode;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.TransferAddressData;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer;
import com.okinc.business.defi.biz.database.addressbook.entity.SendCoinRecordEntity;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.web3Uilib.bean.TransactionAddressInfoBean;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC20438ggr;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gfQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20358gfQ<T extends OKWBaseMultiTransfer<?, ?>> extends AbstractC20080gaD<T> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int fARcdN = 8;
    public final InterfaceC56387yDm getFieldNames = C56392yDr.copydefault(new Function0() { // from class: o.gfT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C20358gfQ.OLrzqt(this.KWHzl);
        }
    });
    public C57422yiC getNewProxyInstance;
    public C57460yio iwGUEr;

    /* JADX INFO: renamed from: o.gfQ$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[IntervalMode.values().length];
            try {
                iArr[IntervalMode.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[IntervalMode.RANGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX INFO: renamed from: o.gfQ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gfQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C20358gfQ<OKWBaseMultiTransfer<?, ?>> EZpvd(android.os.Bundle bundle) {
            C20358gfQ<OKWBaseMultiTransfer<?, ?>> c20358gfQ = new C20358gfQ<>();
            c20358gfQ.setArguments(bundle);
            return c20358gfQ;
        }
    }

    /* JADX INFO: renamed from: o.gfQ$ActionBar */
    public static final class ActionBar implements OKWBaseMultiTransfer.Application {
        public final /* synthetic */ C20358gfQ<T> KWHzl;

        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void AEQbTJ() {
        }

        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void KWHzl() {
        }

        public ActionBar(C20358gfQ<T> c20358gfQ) {
            this.KWHzl = c20358gfQ;
        }

        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void KWHzl(int i) {
            if (i == 4 || i == 5 || i == 6) {
                C57422yiC c57422yiC = this.KWHzl.getNewProxyInstance;
                if (c57422yiC != null) {
                    c57422yiC.setViewDataBean(this.KWHzl.QUSxYX());
                }
                this.KWHzl.djSkpj();
            }
        }
    }

    public final OKWBaseMultiTransfer.Application QbewEr() {
        return (OKWBaseMultiTransfer.Application) this.getFieldNames.getValue();
    }

    public static final ActionBar OLrzqt(C20358gfQ c20358gfQ) {
        return new ActionBar(c20358gfQ);
    }

    @Override // o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<T>.ActionBar actionBar, boolean z) {
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(actionBar, "");
        int transferType = ((MultiTransferSignData) ejfBZ().QVsKAR()).getTransferType();
        if (transferType == 1) {
            CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
            CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmMultiTransferOneToMany;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            pairOLrzqt = C56390yDp.OLrzqt(cDNSourceManager.KWHzl(imageSource, contextRequireContext), java.lang.Integer.valueOf(C13754dXa.FragmentManager.ActivityResultCallerKtExternalSyntheticLambda0));
        } else if (transferType == 2) {
            CDNSourceManager cDNSourceManager2 = CDNSourceManager.OLrzqt;
            CDNSourceManager.ImageSource imageSource2 = CDNSourceManager.ImageSource.TxConfirmMultiTransferManyToOne;
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            pairOLrzqt = C56390yDp.OLrzqt(cDNSourceManager2.KWHzl(imageSource2, contextRequireContext2), java.lang.Integer.valueOf(C13754dXa.FragmentManager.ActivityResultCaller));
        } else {
            CDNSourceManager cDNSourceManager3 = CDNSourceManager.OLrzqt;
            CDNSourceManager.ImageSource imageSource3 = CDNSourceManager.ImageSource.TxConfirmMultiTransferManyToMany;
            android.content.Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            pairOLrzqt = C56390yDp.OLrzqt(cDNSourceManager3.KWHzl(imageSource3, contextRequireContext3), java.lang.Integer.valueOf(C13754dXa.FragmentManager.ActivityResultCallerKt));
        }
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, (java.lang.String) pairOLrzqt.component1(), C33070mpX.AYXKKw(((java.lang.Number) pairOLrzqt.component2()).intValue()), null, null, null, null, null, 124, null));
        actionBar.OLrzqt(QVAiDq());
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(EZpvd());
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(aKErDB());
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(dNCPSb());
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
    }

    @Override // o.AbstractC20082gaF, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        ejfBZ().copydefault(QbewEr());
        C32866mlf.onEvent$default("AppMultisender_Confirmation_Confirmation_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // o.AbstractC20080gaD
    public java.lang.String EZpvd(@NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(super.EZpvd(c8486bDd), java.lang.Integer.valueOf(ejfBZ().AwvSrB())), false, RoundingMode.UP, 1, (java.lang.Object) null);
    }

    @Override // o.AbstractC20080gaD, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(collection, "");
        super.copydefault(collection);
        OLrzqt(collection);
        AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection);
        if ((abstractC9832bcy instanceof C9806bcY) || (abstractC9832bcy instanceof C9803bcV) || (abstractC9832bcy instanceof C9862bdb)) {
            C8486bDd c8486bDdKWHzl = ejfBZ().QKudOq().KWHzl();
            java.lang.String strFJNWhG = c8486bDdKWHzl.getFeeCoinMeta().fJNWhG();
            if (!(c8486bDdKWHzl instanceof C9215bRQ)) {
                strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.onFitSystemWindows, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG)));
            } else if (ejfBZ().heceqZ()) {
                strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialROgMPW, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG)));
            } else {
                strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG)));
            }
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, strCopydefault, (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy == null) {
            if (UeEOUB()) {
                RcXXUw();
                return;
            } else {
                AbstractC20102gaZ.updateReminder$default(this, null, 1, null);
                return;
            }
        }
        if (UeEOUB()) {
            RcXXUw();
        }
    }

    private final void OLrzqt(java.util.Collection<? extends AbstractC9832bcy> collection) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            fXW fxwAkhnZx = AkhnZx();
            androidx.fragment.app.FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            fXW.dealFromAddressRisk$default(fxwAkhnZx, activity, supportFragmentManager, collection, false, 8, null);
        }
    }

    public final boolean UeEOUB() {
        return ejfBZ().dHguZz().DGOPHZ() && ejfBZ().ORxRYg();
    }

    public final void RcXXUw() {
        KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultCallerKtExternalSyntheticLambda1), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
    }

    public final android.view.View QVAiDq() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57422yiC c57422yiC = new C57422yiC(contextRequireContext, null, 0, 6, null);
        this.getNewProxyInstance = c57422yiC;
        c57422yiC.setViewDataBean(QUSxYX());
        return c57422yiC;
    }

    public final TransactionHeaderInfoBean QUSxYX() {
        C10854bwM c10854bwMFHqPtx = ejfBZ().fHqPtx();
        java.lang.String strEZpvd = C54870xYj.EZpvd(ejfBZ().AubY(), c10854bwMFHqPtx.valueOf(), c10854bwMFHqPtx.DTwDnp(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.r8lambdaSjF4PZlnE9fmKbolD64Sz5ghy6c);
        java.lang.String strDbNXlk = c10854bwMFHqPtx.DbNXlk();
        C14726dqr c14726dqr = C14726dqr.OLrzqt;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new TransactionHeaderInfoBean(strAYXKKw, C56402yEa.EZpvd(new TransactionHeaderInfoBean.HeaderSimpleDataBean(0, 0.0f, 0, 0, strDbNXlk, null, c14726dqr.OLrzqt(contextRequireContext), null, "-" + strEZpvd, c10854bwMFHqPtx.fJNWhG(), false, ejfBZ().c_(ejfBZ().values(ejfBZ().AubY())), null, null, 0, null, null, null, null, null, 1045679, null)), false, null, null, null, null, 124, null);
    }

    public final android.view.View aKErDB() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57460yio c57460yio = new C57460yio(contextRequireContext, null, 0, 6, null);
        this.iwGUEr = c57460yio;
        c57460yio.setDeleteCallback(new Function1() { // from class: o.gfV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20358gfQ.OLrzqt(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        });
        djSkpj();
        return c57460yio;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C20358gfQ c20358gfQ, int i) {
        ((OKWBaseMultiTransfer) c20358gfQ.ejfBZ()).AEQbTJ(i);
        return Unit.INSTANCE;
    }

    public final void djSkpj() {
        C57460yio c57460yio = this.iwGUEr;
        if (c57460yio != null) {
            C17946fYd c17946fYd = C17946fYd.AEQbTJ;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            c57460yio.setBean(c17946fYd.copydefault(contextRequireContext, false, ejfBZ()));
        }
    }

    public final android.view.View dNCPSb() {
        java.lang.String strAYXKKw;
        MultiTransferSignData multiTransferSignData = (MultiTransferSignData) ejfBZ().QVsKAR();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57457yil c57457yil = new C57457yil(contextRequireContext, null, 0, 6, null);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ContextAwareHelper);
        int i = StateListAnimator.copydefault[multiTransferSignData.getIntervalMode().ordinal()];
        if (i == 1) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ContextAwareKt);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strAYXKKw = C33069mpW.copydefault(C13754dXa.FragmentManager.accessobserveReporter, C56424yEw.gEmmrt(C56390yDp.OLrzqt("min", multiTransferSignData.getMinInterval()), C56390yDp.OLrzqt("max", multiTransferSignData.getMaxInterval())));
        }
        c57457yil.setViewDataBean(new TransactionAddressInfoBean(strAYXKKw2, strAYXKKw, (java.lang.String) null, (java.lang.String) null, false, (Function0) null, (java.lang.String) null, false, (Function0) null, TypedValues.PositionType.TYPE_CURVE_FIT, (DefaultConstructorMarker) null));
        return c57457yil;
    }

    @Override // o.AbstractC20082gaF
    public void getFieldNames() {
        fZBcTu();
        super.getFieldNames();
    }

    @Override // o.AbstractC20082gaF
    public void OLrzqt(@NotNull final C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
        C20690gle.OLrzqt.copydefault(true);
        copydefault(new Function0() { // from class: o.gfS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20358gfQ.AEQbTJ(this.AEQbTJ, c9748bbT);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C20358gfQ c20358gfQ, C9748bbT c9748bbT) {
        ActivityC20438ggr.Activity activity = ActivityC20438ggr.Companion;
        android.content.Context contextRequireContext = c20358gfQ.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        activity.KWHzl(contextRequireContext, (OKWBaseMultiTransfer) c20358gfQ.ejfBZ());
        c20358gfQ.KWHzl(c9748bbT);
        return Unit.INSTANCE;
    }

    private final void copydefault(final Function0<Unit> function0) {
        SendCoinRecordEntity sendCoinRecordEntity;
        java.lang.String string;
        C10854bwM c10854bwMFHqPtx = ejfBZ().fHqPtx();
        java.util.ArrayList<OKWBaseMultiTransfer.TransactionInfo> arrayListGHZMYf = ejfBZ().gHZMYf();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListGHZMYf, 10));
        java.util.Iterator<T> it = arrayListGHZMYf.iterator();
        while (true) {
            java.lang.String str = "";
            if (!it.hasNext()) {
                AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtCopydefault = cGL.KWHzl.copydefault(arrayList);
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(abstractC58260yxtCopydefault, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY);
                final Function1 function1 = new Function1() { // from class: o.gfX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20358gfQ.copydefault(function0, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gfY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C20358gfQ.djBIcL(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.gfW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20358gfQ.copydefault(function0, (java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gfU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C20358gfQ.AkhnZx(function12, obj);
                    }
                });
                return;
            }
            OKWBaseMultiTransfer.TransactionInfo transactionInfo = (OKWBaseMultiTransfer.TransactionInfo) it.next();
            SendCoinRecordEntity sendCoinRecordEntity2 = new SendCoinRecordEntity(null, null, null, null, null, 0L, 0, 127, null);
            java.lang.String address = transactionInfo.getToAddress().getAddress();
            android.os.Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("ens_domain")) != null) {
                str = string;
            }
            if (str.length() > 0 && StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (java.lang.Object) null)) {
                sendCoinRecordEntity = sendCoinRecordEntity2;
                sendCoinRecordEntity.setAddress(str);
            } else {
                sendCoinRecordEntity = sendCoinRecordEntity2;
                sendCoinRecordEntity.setAddress(address);
            }
            sendCoinRecordEntity.setChainId(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMFHqPtx.AhwBna())));
            sendCoinRecordEntity.setWalletId(transactionInfo.getWalletId());
            sendCoinRecordEntity.setChainName(c10854bwMFHqPtx.djBIcL());
            java.util.List<C13853daS> listAEQbTJ = C13847daM.Companion.AEQbTJ(address);
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
            arrayList.add(sendCoinRecordEntity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function0 function0, java.lang.Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function0 function0, java.util.List list) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // o.AbstractC20082gaF, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        OKWBaseMultiTransfer oKWBaseMultiTransfer = (OKWBaseMultiTransfer) fARcdN().AEQbTJ();
        if (oKWBaseMultiTransfer != null) {
            oKWBaseMultiTransfer.KWHzl(QbewEr());
        }
    }

    private final void fZBcTu() {
        C32866mlf.onEvent$default("AppMultisender_Confirmation_Confirmation_Click", (TrackChannel[]) null, new Function1() { // from class: o.gfR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20358gfQ.OLrzqt(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v33, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v35, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v39, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v41, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v49, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v52, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v58, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v60, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v69, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v71, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v3, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(C20358gfQ c20358gfQ, EventParamsList eventParamsList) {
        java.lang.Object next;
        java.lang.String str;
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        int transferType = ((MultiTransferSignData) ((OKWBaseMultiTransfer) c20358gfQ.ejfBZ()).QVsKAR()).getTransferType();
        eventParamsList.put("transaction_type", transferType != 1 ? transferType != 2 ? "many_to_many" : "many_to_one" : "one_to_many", true);
        eventParamsList.put("token", ((OKWBaseMultiTransfer) c20358gfQ.ejfBZ()).fHqPtx().fJNWhG(), false);
        eventParamsList.put("chain", ((OKWBaseMultiTransfer) c20358gfQ.ejfBZ()).dHguZz().djBIcL(), false);
        eventParamsList.put("sending_amount", ((OKWBaseMultiTransfer) c20358gfQ.ejfBZ()).AubY(), false);
        eventParamsList.put("sending_address_count", java.lang.String.valueOf(((MultiTransferSignData) ((OKWBaseMultiTransfer) c20358gfQ.ejfBZ()).QVsKAR()).getFromAddress().size()), false);
        eventParamsList.put("receiving_address_count", java.lang.String.valueOf(((MultiTransferSignData) ((OKWBaseMultiTransfer) c20358gfQ.ejfBZ()).QVsKAR()).getToAddress().size()), false);
        java.util.Iterator<T> it = ((MultiTransferSignData) ((OKWBaseMultiTransfer) c20358gfQ.ejfBZ()).QVsKAR()).getToAddress().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((TransferAddressData) next).getOkexAccount())) {
                break;
            }
        }
        TransferAddressData transferAddressData = (TransferAddressData) next;
        if (transferAddressData != null) {
            eventParamsList.put("receiving_address_cefi", transferAddressData.getAddress(), false);
        }
        java.util.ArrayList<TransferAddressData> toAddress = ((MultiTransferSignData) ((OKWBaseMultiTransfer) c20358gfQ.ejfBZ()).QVsKAR()).getToAddress();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : toAddress) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((TransferAddressData) obj).getMemo())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            java.util.ArrayList<TransferAddressData> toAddress2 = ((MultiTransferSignData) ((OKWBaseMultiTransfer) c20358gfQ.ejfBZ()).QVsKAR()).getToAddress();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : toAddress2) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((TransferAddressData) obj2).getMemo())) {
                    arrayList2.add(obj2);
                }
            }
            eventParamsList.put("ton_memo", CollectionsKt___CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, null, 63, null), false);
        }
        eventParamsList.put("tom_memo_counts", java.lang.String.valueOf(arrayList.size()), false);
        java.lang.String str3 = "range";
        if (((OKWBaseMultiTransfer) c20358gfQ.ejfBZ()).ORxRYg()) {
            str = "max";
        } else {
            str = ((OKWBaseMultiTransfer) c20358gfQ.ejfBZ()).DTwDnp() ? "specific_amount" : "range";
        }
        eventParamsList.put("sending_amount_type", str, true);
        int i = StateListAnimator.copydefault[((MultiTransferSignData) ((OKWBaseMultiTransfer) c20358gfQ.ejfBZ()).QVsKAR()).getIntervalMode().ordinal()];
        if (i == 1) {
            str3 = "no_interval";
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        eventParamsList.put("interval_setting", str3, true);
        Fee feeQKudOq = ((OKWBaseMultiTransfer) c20358gfQ.ejfBZ()).QKudOq();
        if (feeQKudOq instanceof AbstractC8485bDc) {
            switch (((AbstractC8485bDc) feeQKudOq).DbNXlk()) {
                case 31:
                    str2 = "slow";
                    break;
                case 32:
                    str2 = "average";
                    break;
                case 33:
                    str2 = "fast";
                    break;
                default:
                    str2 = "custom";
                    break;
            }
        }
        eventParamsList.put("gas_level", str2, true);
        return Unit.INSTANCE;
    }
}
