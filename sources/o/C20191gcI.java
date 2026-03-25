package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.web3Uilib.bean.TransactionAddressInfoBean;
import com.okinc.web3Uilib.bean.TransactionAssetInfoBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.AbstractC8601bFm;
import o.ActivityC20262gda;
import o.C13754dXa;
import o.C52761wXj;
import o.C9694baS;
import o.InterfaceC9730bbB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gcI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C20191gcI<T extends AbstractC8601bFm<?, ?> & InterfaceC9730bbB> extends C20150gbU<T> {
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.gaF<T>$ActionBar */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20150gbU, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<T>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        djBIcL((AbstractC20082gaF<T>.ActionBar) actionBar);
        actionBar.KWHzl(Unit.INSTANCE);
        actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.gcH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20191gcI.copydefault(this.OLrzqt, (AbstractC20082gaF.ActionBar) obj);
            }
        }, 3, null));
    }

    public static final Unit copydefault(C20191gcI c20191gcI, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.OLrzqt(c20191gcI.QVAiDq());
        c20191gcI.valueOf(actionBar);
        Unit unit = Unit.INSTANCE;
        actionBar.KWHzl(unit);
        return unit;
    }

    public final void djBIcL(@NotNull AbstractC20082gaF<T>.ActionBar actionBar) {
        java.lang.String urlOnlyHost;
        Intrinsics.checkNotNullParameter(actionBar, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmApprove;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        int i = C13754dXa.FragmentManager.GVpNrsfQMcgE;
        java.lang.String strWlaJM = ((AbstractC8601bFm) ejfBZ()).wlaJM();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl);
        if (strWlaJM == null || strWlaJM.length() == 0) {
            strWlaJM = strAYXKKw;
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("dappname", strWlaJM)));
        PlatformItem dapp = ((AbstractC8601bFm) ejfBZ()).OJuSTm().getDapp();
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, strKWHzl, strCopydefault, null, (dapp == null || (urlOnlyHost = dapp.getUrlOnlyHost()) == null) ? "" : urlOnlyHost, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        actionBar.OLrzqt(QUSxYX());
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(EZpvd());
        actionBar.OLrzqt(copydefault(ejfBZ().OLrzqt()));
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
    }

    @Override // o.C20150gbU, o.AbstractC20082gaF, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        zLjUOn();
        java.lang.String strW_ = ((AbstractC8601bFm) ejfBZ()).W_();
        if (!Intrinsics.EZpvd((java.lang.Object) strW_, (java.lang.Object) "SKIP_EDIT") && ejfBZ().KWHzl()) {
            if ((Intrinsics.EZpvd((java.lang.Object) strW_, (java.lang.Object) "EDIT_DEFAULT_NUM") || Intrinsics.EZpvd((java.lang.Object) strW_, (java.lang.Object) "EDIT_NUM")) && !((AbstractC8601bFm) ejfBZ()).OJuSTm().isChangedCustomRpc()) {
                android.view.View view2 = getView();
                if (view2 != null) {
                    view2.setVisibility(4);
                }
                if (((AbstractC8601bFm) ejfBZ()).UlJrfe().AEQbTJ(3) != null) {
                    getParentFragmentManager().registerFragmentLifecycleCallbacks(new StateListAnimator(this), false);
                } else {
                    OLrzqt(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gcI$StateListAnimator */
    public static final class StateListAnimator extends FragmentManager.FragmentLifecycleCallbacks {
        public final /* synthetic */ C20191gcI<T> KWHzl;

        public StateListAnimator(C20191gcI<T> c20191gcI) {
            this.KWHzl = c20191gcI;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentViewDestroyed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            FragmentActivity activity;
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentViewDestroyed(fragmentManager, fragment);
            if (!(fragment instanceof C57441yiV) || ((C57441yiV) fragment).OLrzqt() || (activity = this.KWHzl.getActivity()) == null || activity.isFinishing()) {
                return;
            }
            this.KWHzl.OLrzqt(true);
        }
    }

    private final android.view.View QUSxYX() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57466yiu c57466yiu = new C57466yiu(contextRequireContext, null, 0, 6, null);
        EZpvd(c57466yiu);
        fFgQHt();
        return c57466yiu;
    }

    private final void fFgQHt() {
        java.lang.CharSequence spannedString;
        java.lang.CharSequence spannedString2;
        boolean zAEQbTJ = ejfBZ().AEQbTJ();
        boolean zKWHzl = ejfBZ().KWHzl();
        C57466yiu c57466yiuAKErDB = aKErDB();
        if (!zAEQbTJ) {
            spannedString = "";
        } else if (Intrinsics.EZpvd((java.lang.Object) ejfBZ().a_(false), (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) strAYXKKw);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DTeKQX)), 0, strAYXKKw.length(), 17);
            spannedString = new android.text.SpannedString(spannableStringBuilder);
        } else {
            java.lang.String strA_ = ejfBZ().a_(true);
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
            spannableStringBuilder2.append((java.lang.CharSequence) strA_);
            spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, strA_.length(), 17);
            spannedString = new android.text.SpannedString(spannableStringBuilder2);
        }
        java.lang.CharSequence charSequence = spannedString;
        InterfaceC9730bbB.StateListAnimator stateListAnimatorEZpvd = ejfBZ().EZpvd();
        java.lang.String strAYXKKw2 = stateListAnimatorEZpvd != null ? stateListAnimatorEZpvd.AYXKKw() : null;
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
        if (strAYXKKw2 == null || strAYXKKw2.length() == 0) {
            strAYXKKw2 = strAYXKKw3;
        }
        if (zAEQbTJ) {
            spannedString2 = strAYXKKw2;
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder();
            spannableStringBuilder3.append((java.lang.CharSequence) strAYXKKw2);
            spannableStringBuilder3.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, strAYXKKw2.length(), 17);
            spannedString2 = new android.text.SpannedString(spannableStringBuilder3);
        }
        c57466yiuAKErDB.setViewDataBean(new TransactionAssetInfoBean(C56402yEa.EZpvd(new TransactionAssetInfoBean.AssetSimpleDataBean(null, null, charSequence, spannedString2, null, (!zKWHzl || C59449zhJ.equals$default(((AbstractC8601bFm) ejfBZ()).W_(), "SKIP_EDIT", false, 2, null)) ? null : C33070mpX.KWHzl(C52761wXj.TaskDescription.DPhTBN), (!zKWHzl || C59449zhJ.equals$default(((AbstractC8601bFm) ejfBZ()).W_(), "SKIP_EDIT", false, 2, null)) ? null : new Function0() { // from class: o.gcG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20191gcI.copydefault(this.copydefault);
            }
        }, 19, null)), 0, C33070mpX.AYXKKw(C13754dXa.FragmentManager.search), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRoot), null, null, null, 114, null));
    }

    public static final Unit copydefault(C20191gcI c20191gcI) {
        c20191gcI.OLrzqt(false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OLrzqt(final boolean z) {
        if (!z) {
            AubY();
        }
        C9694baS.Application application = C9694baS.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        ActivityC20262gda.TaskDescription taskDescription = ActivityC20262gda.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        application.KWHzl(childFragmentManager, taskDescription.KWHzl(contextRequireContext, ejfBZ(), z), new Function2() { // from class: o.gcL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20191gcI.KWHzl(this.KWHzl, z, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C20191gcI c20191gcI, boolean z, int i, android.content.Intent intent) {
        FragmentActivity activity;
        java.lang.String approveAmount$default = InterfaceC9730bbB.Application.getApproveAmount$default((InterfaceC9730bbB) c20191gcI.ejfBZ(), false, 1, null);
        if (approveAmount$default.length() > 0) {
            ((InterfaceC9730bbB) c20191gcI.ejfBZ()).EZpvd(approveAmount$default);
        }
        if (i == -1) {
            android.view.View view = c20191gcI.getView();
            if (view != null) {
                view.setVisibility(0);
            }
            c20191gcI.fFgQHt();
            c20191gcI.EZpvd(((AbstractC8601bFm) c20191gcI.ejfBZ()).AEQbTJ(true));
            if (((AbstractC8601bFm) c20191gcI.ejfBZ()).UlJrfe().AEQbTJ(1) == null) {
                c20191gcI.QbewEr();
            }
        } else if ((z || ((AbstractC8601bFm) c20191gcI.ejfBZ()).OJuSTm().isChangedCustomRpc()) && (activity = c20191gcI.getActivity()) != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public final android.view.View QVAiDq() {
        InterfaceC9730bbB.StateListAnimator stateListAnimatorEZpvd = ejfBZ().EZpvd();
        if (stateListAnimatorEZpvd == null) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final C57457yil c57457yil = new C57457yil(contextRequireContext, null, 0, 6, null);
        java.lang.String strAYXKKw = stateListAnimatorEZpvd.AYXKKw();
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
        if (strAYXKKw == null || strAYXKKw.length() == 0) {
            strAYXKKw = strAYXKKw2;
        }
        final java.lang.String strKWHzl = stateListAnimatorEZpvd.KWHzl();
        c57457yil.setViewDataBean(new TransactionAddressInfoBean(C33069mpW.copydefault(C13754dXa.FragmentManager.sGvRiA, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", strAYXKKw))), strKWHzl, (java.lang.String) null, (java.lang.String) null, true, new Function0() { // from class: o.gcK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20191gcI.AEQbTJ(c57457yil, strKWHzl);
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

    @Override // o.C20150gbU, o.AbstractC20080gaD, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) throws CoinMetaError {
        Intrinsics.checkNotNullParameter(collection, "");
        super.copydefault(collection);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9785bcD) {
                arrayList.add(obj);
            }
        }
        if (((C9785bcD) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null) {
            QbewEr();
        }
    }

    public final void QbewEr() {
        java.lang.String strX_ = ((AbstractC8601bFm) ejfBZ()).X_();
        if (!C59449zhJ.equals$default(((AbstractC8601bFm) ejfBZ()).W_(), "SKIP_EDIT", false, 2, null) || strX_.equals("")) {
            return;
        }
        AhwBna(strX_);
    }

    public final void AhwBna(java.lang.String str) {
        if (str != null) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, str, (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
        }
    }

    @Override // o.AbstractC20082gaF
    public void getNewProxyInstance() {
        super.getNewProxyInstance();
        if (((AbstractC8601bFm) ejfBZ()).UlJrfe().AEQbTJ(C56524yIo.AEQbTJ(C9876bdp.class))) {
            C32866mlf.onEvent$default("Web3WalletContractInteraction_Btm_Reject_Click", (TrackChannel[]) null, new Function1() { // from class: o.gcJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20191gcI.AEQbTJ((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "transfer_type", "set_approve_for_all", false, 4, null);
        return Unit.INSTANCE;
    }
}
