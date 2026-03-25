package o;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.WalletIdsReq;
import com.okinc.business.defi.wallet.bean.WalletCreatedData;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import com.okinc.business.defi.wallet.mine.walletmanage.SearchWalletActivity;
import com.okinc.business.defi.wallet.mine.walletmanage.WalletManageContentFragmentNew$onErrorTipClick$1$1;
import com.okinc.business.defi.wallet.mine.walletmanage.WalletManageContentFragmentNew$onErrorTipClick$2$1;
import com.okinc.business.defi.wallet.mine.walletmanage.WalletManageContentFragmentNew$refreshData$2;
import com.okinc.business.defi.wallet.mine.walletmanage.WalletManageContentFragmentNew$refreshData$3;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.okuser.data.User;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import com.okinc.web.WebActivity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.ActivityC15412eHj;
import o.ActivityC17523fIm;
import o.ActivityC18321fgG;
import o.ActivityC18501fjb;
import o.ActivityC18691fnF;
import o.ActivityC18750foL;
import o.C10604brb;
import o.C12827cuN;
import o.C13754dXa;
import o.C15935eaT;
import o.C16058eck;
import o.C17351fCc;
import o.C17412fEj;
import o.C17424fEv;
import o.C18521fjv;
import o.C52761wXj;
import o.C52812wZg;
import o.InterfaceC8104awT;
import o.dTH;
import o.dTQ;
import o.eHZ;
import o.fVU;
import o.xXH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fCc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17351fCc extends AbstractC57212yeE implements eHZ.Application {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public boolean AYXKKw;
    public ActivityResultLauncher<android.content.Intent> AhwBna;
    public final java.lang.Object DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public InterfaceC58217yxC djBIcL;
    public final C17237eyx fARcdN;
    public final InterfaceC56387yDm fJNWhG;
    public final long fetchVPNInfo;
    public AbstractC16630enZ gEmmrt;
    public final fDW isConnected;
    public boolean valueOf;
    public final ActivityResultLauncher<ActivityC15412eHj.StateListAnimator> values;
    public final int AkhnZx = C13754dXa.TaskDescription.invokespecialsiEkQe;
    public java.lang.String copydefault = "WalletManageContentFragmentNew";

    /* JADX INFO: renamed from: o.fCc$SharedElementCallback */
    public static final /* synthetic */ class SharedElementCallback implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57212yeE
    public boolean copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public java.lang.String getTAG() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    public C17351fCc() {
        C12827cuN.Application application = C12827cuN.Companion;
        this.fARcdN = new C17237eyx(new C17262ezV(C12827cuN.Application.getInstance$default(application, null, 1, null), null, null, 6, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, new C17241ezA(new C17262ezV(C12827cuN.Application.getInstance$default(application, null, 1, null), null, null, 6, null)), 0 == true ? 1 : 0, 22, null);
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.fCV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17351fCc.KWHzl();
            }
        });
        this.fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.fCT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17351fCc.fetchVPNInfo(this.OLrzqt);
            }
        });
        this.DbNXlk = new java.lang.Object();
        ActivityResultLauncher<ActivityC15412eHj.StateListAnimator> activityResultLauncherRegisterForActivityResult = registerForActivityResult(ActivityC15412eHj.Application.AEQbTJ, new ActivityResultCallback() { // from class: o.fCW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C17351fCc.copydefault(this.EZpvd, (ActivityC15412eHj.ActionBar) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.values = activityResultLauncherRegisterForActivityResult;
        this.isConnected = new fDW() { // from class: o.fDa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.fDW
            public final void OLrzqt(boolean z) {
                C17351fCc.AEQbTJ(z);
            }
        };
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.fCZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17351fCc.isConnected(this.AEQbTJ);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.fCX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17351fCc.gEmmrt(this.AEQbTJ);
            }
        });
        this.AYXKKw = true;
        this.fetchVPNInfo = 600L;
    }

    public final Activity values() {
        return (Activity) this.AEQbTJ.getValue();
    }

    public static final Activity KWHzl() {
        return new Activity();
    }

    public final C17413fEk AkhnZx() {
        return (C17413fEk) this.fJNWhG.getValue();
    }

    public static final C17413fEk fetchVPNInfo(C17351fCc c17351fCc) {
        return (C17413fEk) new ViewModelProvider(c17351fCc).get(C17413fEk.class);
    }

    public static final void copydefault(C17351fCc c17351fCc, ActivityC15412eHj.ActionBar actionBar) {
        if (actionBar instanceof ActivityC15412eHj.ActionBar.C0833ActionBar) {
            android.content.Context contextRequireContext = c17351fCc.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C15406eHd.KWHzl(contextRequireContext, ((ActivityC15412eHj.ActionBar.C0833ActionBar) actionBar).copydefault());
        }
    }

    /* JADX INFO: renamed from: o.fCc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fCc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C17351fCc newInstance$default(ActionBar actionBar, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return actionBar.copydefault(str, z);
        }

        public final C17351fCc copydefault(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            C17351fCc c17351fCc = new C17351fCc();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("from", str);
            bundle.putBoolean("isHideManageBtn", z);
            c17351fCc.setArguments(bundle);
            return c17351fCc;
        }
    }

    /* JADX INFO: renamed from: o.fCc$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C17351fCc OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C17351fCc c17351fCc) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c17351fCc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.AuCTel();
            }
        }
    }

    /* JADX INFO: renamed from: o.fCc$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C17351fCc EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C17351fCc c17351fCc) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c17351fCc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (C13912dbY.copydefault.OLrzqt(!r7.djBIcL())) {
                    this.EZpvd.AkhnZx().OLrzqt(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.fCc$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C52812wZg EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C52812wZg c52812wZg) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c52812wZg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.KWHzl();
            }
        }
    }

    /* JADX INFO: renamed from: o.fCc$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C52812wZg EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C17351fCc OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C52812wZg c52812wZg, C17351fCc c17351fCc) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c52812wZg;
            this.OLrzqt = c17351fCc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.RZOtbZ)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
                WebActivity.TaskDescription taskDescription = WebActivity.Companion;
                FragmentActivity fragmentActivityRequireActivity = this.OLrzqt.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                WebActivity.TaskDescription.openPage$default(taskDescription, fragmentActivityRequireActivity, bundleBundleOf, null, 4, null);
                this.EZpvd.KWHzl();
            }
        }
    }

    /* JADX INFO: renamed from: o.fCc$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C17351fCc OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C17351fCc c17351fCc) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c17351fCc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.AhwBna();
                android.os.Bundle arguments = this.OLrzqt.getArguments();
                if (Intrinsics.EZpvd((java.lang.Object) (arguments != null ? arguments.getString("from") : null), (java.lang.Object) "fromHome")) {
                    C14724dqp.EZpvd.KWHzl(100L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.fCc$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C17351fCc KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C17351fCc c17351fCc) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c17351fCc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C10604brb instance$default = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null);
                android.content.Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                C17351fCc c17351fCc = this.KWHzl;
                instance$default.KWHzl(contextRequireContext, c17351fCc, c17351fCc.new Dialog());
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC16630enZ abstractC16630enZ = (AbstractC16630enZ) DataBindingUtil.bind(view);
        if (abstractC16630enZ == null) {
            return;
        }
        this.gEmmrt = abstractC16630enZ;
        C32866mlf.onEvent$default("Web3WalletManagement_Settings_WalletManage_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        fARcdN();
        fJNWhG();
        ejfBZ();
        fIwbmz();
        uzCIH();
        this.AhwBna = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.fDb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C17351fCc.EZpvd(this.copydefault, (ActivityResult) obj);
            }
        });
        this.djBIcL = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null).djBIcL();
    }

    public static final void EZpvd(C17351fCc c17351fCc, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            c17351fCc.AhwBna();
        }
    }

    private final void fARcdN() {
        Resources.Theme theme;
        AbstractC16630enZ abstractC16630enZ = this.gEmmrt;
        AbstractC16630enZ abstractC16630enZ2 = null;
        if (abstractC16630enZ == null) {
            Intrinsics.gEmmrt("");
            abstractC16630enZ = null;
        }
        abstractC16630enZ.fetchVPNInfo.setCalledActivity(SearchWalletActivity.class);
        AbstractC16630enZ abstractC16630enZ3 = this.gEmmrt;
        if (abstractC16630enZ3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16630enZ3 = null;
        }
        abstractC16630enZ3.fetchVPNInfo.setOnSearchBarClick(new Function0() { // from class: o.fDw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17351fCc.OLrzqt();
            }
        });
        C17412fEj c17412fEjGEmmrt = AkhnZx().gEmmrt();
        AbstractC16630enZ abstractC16630enZ4 = this.gEmmrt;
        if (abstractC16630enZ4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16630enZ4 = null;
        }
        ConstraintLayout constraintLayout = abstractC16630enZ4.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        c17412fEjGEmmrt.EZpvd(constraintLayout);
        DbNXlk();
        AbstractC16630enZ abstractC16630enZ5 = this.gEmmrt;
        if (abstractC16630enZ5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16630enZ5 = null;
        }
        AppCompatTextView appCompatTextView = abstractC16630enZ5.valueOf;
        if (appCompatTextView != null) {
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: o.fDx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C17351fCc.copydefault(this.copydefault, view);
                }
            });
        }
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("from") : null;
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -1245013079) {
                if (iHashCode == -1244869859 && string.equals("fromMine")) {
                    AbstractC16630enZ abstractC16630enZ6 = this.gEmmrt;
                    if (abstractC16630enZ6 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16630enZ6 = null;
                    }
                    abstractC16630enZ6.djBIcL.setImageResource(C13754dXa.Activity.DarRvM);
                }
            } else if (string.equals("fromHome")) {
                AbstractC16630enZ abstractC16630enZ7 = this.gEmmrt;
                if (abstractC16630enZ7 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16630enZ7 = null;
                }
                abstractC16630enZ7.djBIcL.setImageResource(C52761wXj.TaskDescription.DztXDE);
                android.util.TypedValue typedValue = new android.util.TypedValue();
                android.content.Context context = getContext();
                if (context != null && (theme = context.getTheme()) != null) {
                    theme.resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
                }
                int i = typedValue.resourceId;
                AbstractC16630enZ abstractC16630enZ8 = this.gEmmrt;
                if (abstractC16630enZ8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16630enZ8 = null;
                }
                abstractC16630enZ8.djBIcL.setBackgroundResource(i);
            }
        }
        C17412fEj.TaskDescription taskDescription = C17412fEj.Companion;
        android.os.Bundle arguments2 = getArguments();
        taskDescription.OLrzqt(arguments2 != null ? arguments2.getBoolean("isHideManageBtn", false) : false);
        if (taskDescription.KWHzl()) {
            AbstractC16630enZ abstractC16630enZ9 = this.gEmmrt;
            if (abstractC16630enZ9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16630enZ9 = null;
            }
            AppCompatTextView appCompatTextView2 = abstractC16630enZ9.valueOf;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(8);
            AbstractC16630enZ abstractC16630enZ10 = this.gEmmrt;
            if (abstractC16630enZ10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16630enZ10 = null;
            }
            abstractC16630enZ10.KWHzl.setVisibility(8);
        } else {
            AbstractC16630enZ abstractC16630enZ11 = this.gEmmrt;
            if (abstractC16630enZ11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16630enZ11 = null;
            }
            AppCompatTextView appCompatTextView3 = abstractC16630enZ11.valueOf;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            appCompatTextView3.setVisibility(0);
            AbstractC16630enZ abstractC16630enZ12 = this.gEmmrt;
            if (abstractC16630enZ12 == null) {
                Intrinsics.gEmmrt("");
                abstractC16630enZ12 = null;
            }
            abstractC16630enZ12.KWHzl.setVisibility(0);
        }
        AbstractC16630enZ abstractC16630enZ13 = this.gEmmrt;
        if (abstractC16630enZ13 == null) {
            Intrinsics.gEmmrt("");
            abstractC16630enZ13 = null;
        }
        C52794wYp c52794wYp = abstractC16630enZ13.OLrzqt;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        }
        AbstractC16630enZ abstractC16630enZ14 = this.gEmmrt;
        if (abstractC16630enZ14 == null) {
            Intrinsics.gEmmrt("");
            abstractC16630enZ14 = null;
        }
        AppCompatImageView appCompatImageView = abstractC16630enZ14.AhwBna;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new Application(appCompatImageView, 1000L, this));
        }
        AbstractC16630enZ abstractC16630enZ15 = this.gEmmrt;
        if (abstractC16630enZ15 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16630enZ2 = abstractC16630enZ15;
        }
        AppCompatTextView appCompatTextView4 = abstractC16630enZ2.isConnected;
        if (appCompatTextView4 != null) {
            appCompatTextView4.setOnClickListener(new Fragment(appCompatTextView4, 1000L, this));
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXH.class, new java.lang.String[0]);
        final java.lang.Object obj = this.DbNXlk;
        abstractC58185ywXKWHzl.subscribe(new RxBus.EventCallback<xXH>(obj) { // from class: com.okinc.business.defi.wallet.mine.walletmanage.WalletManageContentFragmentNew$initView$7
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(xXH xxh) {
                this.this$0.AkhnZx().copydefault(false);
            }
        });
    }

    public static final Unit AYXKKw(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        C32866mlf.onEvent$default("Web3WalletManagement_SearchResult_SearchBox_Click", (TrackChannel[]) null, new Function1() { // from class: o.fCM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.AYXKKw((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(C17351fCc c17351fCc, android.view.View view) {
        android.content.Context context = c17351fCc.getContext();
        if (context != null) {
            AbstractC16630enZ abstractC16630enZ = c17351fCc.gEmmrt;
            java.lang.String strDbNXlk = "";
            if (abstractC16630enZ == null) {
                Intrinsics.gEmmrt("");
                abstractC16630enZ = null;
            }
            RecyclerView.LayoutManager layoutManager = abstractC16630enZ.AYXKKw.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            java.util.List<fDL<java.lang.Object>> value = c17351fCc.AkhnZx().OLrzqt().getValue();
            if (value != null) {
                java.util.Iterator<fDL<java.lang.Object>> it = value.iterator();
                int i = 0;
                loop0: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    fDL<java.lang.Object> next = it.next();
                    if (i >= iFindFirstVisibleItemPosition && (next instanceof TaskDescription)) {
                        strDbNXlk = ((TaskDescription) next).gEmmrt().EZpvd();
                        break;
                    }
                    i++;
                    int iOLrzqt = next.OLrzqt();
                    for (int i2 = 0; i2 < iOLrzqt; i2++) {
                        if (i >= iFindFirstVisibleItemPosition) {
                            java.lang.Object objCopydefault = next.copydefault(i2);
                            if (objCopydefault instanceof eCF) {
                                strDbNXlk = ((eCF) objCopydefault).copydefault().DbNXlk();
                                break loop0;
                            }
                        }
                        i++;
                    }
                }
            }
            ActivityC17337fBp.Companion.EZpvd(context, strDbNXlk);
        }
        C32866mlf.onEvent$default("Web3WalletManagement_ManagePage_Manage_Click", (TrackChannel[]) null, new Function1() { // from class: o.fCD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.valueOf((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fCc$Dialog */
    public static final class Dialog implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            C17351fCc.this.fetchVPNInfo();
        }
    }

    public final void AuCTel() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.isFullyDrawnReported);
        viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.getItem, new View.OnClickListener() { // from class: o.fDt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17351fCc.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void fIwbmz() {
        AkhnZx().OLrzqt().observe(this, new SharedElementCallback(new Function1() { // from class: o.fCU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.AEQbTJ(this.copydefault, (java.util.List) obj);
            }
        }));
        AkhnZx().DbNXlk().observe(this, new SharedElementCallback(new Function1() { // from class: o.fDh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.KWHzl(this.copydefault, (java.lang.String) obj);
            }
        }));
        AkhnZx().fetchVPNInfo().observe(this, new SharedElementCallback(new Function1() { // from class: o.fDu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.EZpvd(this.copydefault, (java.lang.Integer) obj);
            }
        }));
        AkhnZx().valueOf().observe(this, new SharedElementCallback(new Function1() { // from class: o.fDy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.AYXKKw(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        AkhnZx().djBIcL().observe(this, new SharedElementCallback(new Function1() { // from class: o.fDD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.AhwBna(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        AkhnZx().KWHzl().observe(this, new SharedElementCallback(new Function1() { // from class: o.fCg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.valueOf(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        AkhnZx().values().observe(this, new SharedElementCallback(new Function1() { // from class: o.fCi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.gEmmrt(this.AEQbTJ, (java.lang.Integer) obj);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(final C17351fCc c17351fCc, java.util.List list) {
        boolean z;
        Activity activityValues = c17351fCc.values();
        Intrinsics.copydefault(list);
        activityValues.EZpvd((java.util.List<? extends fDL<java.lang.Object>>) list);
        AbstractC16630enZ abstractC16630enZ = null;
        if (c17351fCc.AkhnZx().copydefault()) {
            z = false;
        } else {
            android.os.Bundle arguments = c17351fCc.getArguments();
            if (Intrinsics.EZpvd((java.lang.Object) (arguments != null ? arguments.getString("from") : null), (java.lang.Object) "fromHome")) {
                z = true;
            }
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            fDL<java.lang.Object> fdl = (fDL) it.next();
            boolean z2 = fdl instanceof TaskDescription;
            if (z2 && c17351fCc.AkhnZx().gEmmrt().KWHzl(((TaskDescription) fdl).gEmmrt())) {
                c17351fCc.values().KWHzl(fdl);
            } else if (z2) {
                TaskDescription taskDescription = (TaskDescription) fdl;
                taskDescription.copydefault(false);
                if (z) {
                    int iOLrzqt = taskDescription.OLrzqt();
                    int i = 0;
                    while (true) {
                        if (i < iOLrzqt) {
                            java.lang.Object objCopydefault = taskDescription.copydefault(i);
                            if ((objCopydefault instanceof eCF) && ((eCF) objCopydefault).copydefault().zuWLRA()) {
                                taskDescription.copydefault(true);
                                c17351fCc.values().KWHzl(fdl);
                                c17351fCc.AkhnZx().gEmmrt().gEmmrt(taskDescription.gEmmrt());
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        AbstractC16630enZ abstractC16630enZ2 = c17351fCc.gEmmrt;
        if (abstractC16630enZ2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16630enZ2 = null;
        }
        if (abstractC16630enZ2.AYXKKw.getAdapter() == null) {
            AbstractC16630enZ abstractC16630enZ3 = c17351fCc.gEmmrt;
            if (abstractC16630enZ3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16630enZ3 = null;
            }
            abstractC16630enZ3.AYXKKw.setAdapter(c17351fCc.values());
        } else {
            c17351fCc.values().notifyDataSetChanged();
        }
        if (z) {
            c17351fCc.KWHzl((java.util.List<? extends fDL<java.lang.Object>>) list);
            c17351fCc.AkhnZx().copydefault(true);
        }
        AbstractC16630enZ abstractC16630enZ4 = c17351fCc.gEmmrt;
        if (abstractC16630enZ4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16630enZ = abstractC16630enZ4;
        }
        abstractC16630enZ.AYXKKw.post(new java.lang.Runnable() { // from class: o.fCv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C17351fCc.DbNXlk(this.copydefault);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(C17351fCc c17351fCc) {
        c17351fCc.isConnected();
    }

    public static final Unit KWHzl(C17351fCc c17351fCc, java.lang.String str) {
        java.lang.String strOLrzqt;
        AbstractC16630enZ abstractC16630enZ = c17351fCc.gEmmrt;
        if (abstractC16630enZ == null) {
            Intrinsics.gEmmrt("");
            abstractC16630enZ = null;
        }
        AppCompatTextView appCompatTextView = abstractC16630enZ.isConnected;
        if (C13912dbY.copydefault.fetchVPNInfo()) {
            strOLrzqt = "*****";
        } else {
            C13821dZn c13821dZn = C13821dZn.EZpvd;
            Intrinsics.copydefault((java.lang.Object) str);
            strOLrzqt = c13821dZn.OLrzqt(C54880xYt.formatValuationFromAsset$default(str, null, false, C14455dll.KWHzl.OLrzqt(str), false, 11, null));
        }
        appCompatTextView.setText(strOLrzqt);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C17351fCc c17351fCc, java.lang.Integer num) {
        int i = 0;
        AbstractC16630enZ abstractC16630enZ = null;
        if (num.intValue() > 10) {
            AbstractC16630enZ abstractC16630enZ2 = c17351fCc.gEmmrt;
            if (abstractC16630enZ2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16630enZ2 = null;
            }
            abstractC16630enZ2.EZpvd.setVisibility(8);
            AbstractC16630enZ abstractC16630enZ3 = c17351fCc.gEmmrt;
            if (abstractC16630enZ3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16630enZ3 = null;
            }
            abstractC16630enZ3.fetchVPNInfo.setVisibility(0);
        } else {
            AbstractC16630enZ abstractC16630enZ4 = c17351fCc.gEmmrt;
            if (abstractC16630enZ4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16630enZ4 = null;
            }
            abstractC16630enZ4.fetchVPNInfo.setVisibility(8);
            AbstractC16630enZ abstractC16630enZ5 = c17351fCc.gEmmrt;
            if (abstractC16630enZ5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16630enZ5 = null;
            }
            abstractC16630enZ5.EZpvd.setVisibility(0);
            i = 1;
        }
        AbstractC16630enZ abstractC16630enZ6 = c17351fCc.gEmmrt;
        if (abstractC16630enZ6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16630enZ = abstractC16630enZ6;
        }
        android.view.View view = abstractC16630enZ.values;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
        layoutParams2.setScrollFlags(i);
        view.setLayoutParams(layoutParams2);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C17351fCc c17351fCc, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c17351fCc.showLoadingAtOnce();
        } else {
            c17351fCc.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C17351fCc c17351fCc, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            if (c17351fCc.AkhnZx().AYXKKw()) {
                C55326xho.toast$default(C13754dXa.FragmentManager.sendShuffleMode, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            c17351fCc.OLrzqt("");
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C17351fCc c17351fCc, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c17351fCc.copydefault(true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C17351fCc c17351fCc, java.lang.Integer num) {
        AbstractC16630enZ abstractC16630enZ = c17351fCc.gEmmrt;
        if (abstractC16630enZ == null) {
            Intrinsics.gEmmrt("");
            abstractC16630enZ = null;
        }
        abstractC16630enZ.AhwBna.setVisibility(num.intValue() > 0 ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(java.util.List<? extends fDL<java.lang.Object>> list) {
        int i = 0;
        loop0: for (fDL<java.lang.Object> fdl : list) {
            i++;
            if (fdl instanceof TaskDescription) {
                TaskDescription taskDescription = (TaskDescription) fdl;
                int iOLrzqt = taskDescription.OLrzqt();
                for (int i2 = 0; i2 < iOLrzqt; i2++) {
                    java.lang.Object objCopydefault = taskDescription.copydefault(i2);
                    if (objCopydefault instanceof eCF) {
                        if (((eCF) objCopydefault).copydefault().zuWLRA()) {
                            break loop0;
                        } else if (taskDescription.values()) {
                            i++;
                        }
                    } else if (taskDescription.values()) {
                    }
                }
            }
        }
        AbstractC16630enZ abstractC16630enZ = null;
        if (i < ((int) java.lang.Math.floor((((double) C33570myu.EZpvd()) * 0.56d) / ((double) C55298xhM.dp2px$default(64.0f, null, 1, null))))) {
            return;
        }
        AbstractC16630enZ abstractC16630enZ2 = this.gEmmrt;
        if (abstractC16630enZ2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16630enZ2 = null;
        }
        abstractC16630enZ2.gEmmrt.setExpanded(false, false);
        AbstractC16630enZ abstractC16630enZ3 = this.gEmmrt;
        if (abstractC16630enZ3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16630enZ = abstractC16630enZ3;
        }
        abstractC16630enZ.AYXKKw.scrollToPosition(i);
    }

    public final void DbNXlk() {
        AbstractC16630enZ abstractC16630enZ = this.gEmmrt;
        if (abstractC16630enZ == null) {
            Intrinsics.gEmmrt("");
            abstractC16630enZ = null;
        }
        AppCompatImageView appCompatImageView = abstractC16630enZ.djBIcL;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new PendingIntent(appCompatImageView, 1000L, this));
        }
    }

    public final void EZpvd(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3WalletManagement_EditWallet_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fDA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.KWHzl(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "edit_options", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        EZpvd("edit_name");
    }

    public final void valueOf() {
        EZpvd(RequestParameters.SUBRESOURCE_DELETE);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yeE.close$default(o.yeE, android.os.Bundle, int, java.lang.Object):void */
    public final void AhwBna() {
        FragmentActivity activity;
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("from") : null;
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -1245013079) {
                if (iHashCode == -1244869859) {
                    if (string.equals("fromMine") && (activity = getActivity()) != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                if (iHashCode != -594355187 || !string.equals("fromDex")) {
                    return;
                }
            } else if (!string.equals("fromHome")) {
                return;
            }
            AbstractC57212yeE.close$default(this, null, 1, null);
        }
    }

    public final void OLrzqt(final java.lang.String str) {
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(false), this).KWHzl(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.fCh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.djBIcL(this.KWHzl, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fCf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17351fCc.gEmmrt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fCk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.OLrzqt(this.AEQbTJ, str, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fCm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17351fCc.AhwBna(function12, obj);
            }
        });
        Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
        addDisposable(interfaceC58217yxCAEQbTJ);
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(C17351fCc c17351fCc, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).EZpvd(WalletStatus.RealWallets);
            c17351fCc.copydefault(true);
        } else {
            C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).EZpvd(WalletStatus.NoWallet);
            WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).OLrzqt();
            C16058eck.removeDAppSessions$default(C16058eck.Activity.getInstance$default(C16058eck.Companion, null, 1, null), null, 1, null);
            C15935eaT.removeDAppSessions$default(C15935eaT.ActionBar.getInstance$default(C15935eaT.Companion, null, 1, null), null, 1, null);
            C21027grx.copydefault.copydefault(true);
            fPD.copydefault.OLrzqt(true);
            dZK dzk = dZK.AEQbTJ;
            FragmentActivity activity = c17351fCc.getActivity();
            if (activity == null) {
                return Unit.INSTANCE;
            }
            dzk.AEQbTJ(activity, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C17351fCc c17351fCc, java.lang.String str, java.lang.Throwable th) {
        pUU.copydefault(c17351fCc.getTAG(), "jumpToHomeWhenDelete error message :" + th.getMessage());
        WalletIdsReq walletIdsReq = new WalletIdsReq(C56402yEa.EZpvd(str));
        C6777aVl.Companion.EZpvd(new java.lang.Throwable("Defi: delete wallet failed. Req: " + new Gson().toJson(walletIdsReq) + ". Message: " + th.getMessage()));
        return Unit.INSTANCE;
    }

    public final void copydefault(boolean z) {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("from") : null;
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode == -1245013079) {
                if (string.equals("fromHome")) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("isChangeWallet", z);
                    AEQbTJ(bundle);
                    return;
                }
                return;
            }
            if (iHashCode != -1244869859) {
                if (iHashCode == -594355187 && string.equals("fromDex")) {
                    AbstractC57212yeE.close$default(this, null, 1, null);
                    return;
                }
                return;
            }
            if (string.equals("fromMine")) {
                dZK dzk = dZK.AEQbTJ;
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    return;
                }
                dzk.AEQbTJ(activity, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, true, false, (com.okinc.wallet.api.bean.ScanResult) null, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, (DefaultConstructorMarker) null));
            }
        }
    }

    public static final void AEQbTJ(boolean z) {
        if (z) {
            C32866mlf.onEvent$default("Web3WalletManagement_EditWallet_Card_Slide", (TrackChannel[]) null, new Function1() { // from class: o.fCl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17351fCc.djBIcL((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit djBIcL(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final C17425fEw gEmmrt() {
        return (C17425fEw) this.OLrzqt.getValue();
    }

    public static final C17425fEw isConnected(final C17351fCc c17351fCc) {
        return new C17425fEw(new Function1() { // from class: o.fCq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.DbNXlk(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        }, new Function1() { // from class: o.fCw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.isConnected(this.EZpvd, (AbstractC12782ctV) obj);
            }
        }, new Function1() { // from class: o.fCx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.fetchVPNInfo(this.copydefault, (AbstractC12782ctV) obj);
            }
        }, c17351fCc.isConnected);
    }

    public static final Unit DbNXlk(C17351fCc c17351fCc, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c17351fCc.AEQbTJ(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(C17351fCc c17351fCc, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c17351fCc.KWHzl(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C17351fCc c17351fCc, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c17351fCc.OLrzqt(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public final C17421fEs AYXKKw() {
        return (C17421fEs) this.EZpvd.getValue();
    }

    public static final C17421fEs gEmmrt(final C17351fCc c17351fCc) {
        return new C17421fEs(new Function1() { // from class: o.fCF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.valueOf(this.EZpvd, (AbstractC12782ctV) obj);
            }
        }, new Function1() { // from class: o.fCE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.AkhnZx(this.KWHzl, (AbstractC12782ctV) obj);
            }
        }, new Function1() { // from class: o.fCH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.values(this.KWHzl, (AbstractC12782ctV) obj);
            }
        }, c17351fCc.isConnected);
    }

    public static final Unit valueOf(C17351fCc c17351fCc, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c17351fCc.AEQbTJ(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C17351fCc c17351fCc, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c17351fCc.KWHzl(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final Unit values(C17351fCc c17351fCc, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c17351fCc.OLrzqt(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    private final void fJNWhG() {
        values().AEQbTJ(TaskDescription.class, (fDP) new fEK(new Function2() { // from class: o.fDf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C17351fCc.OLrzqt(this.copydefault, (C17351fCc.TaskDescription) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, new Function1() { // from class: o.fDd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.copydefault(this.OLrzqt, (C17351fCc.TaskDescription) obj);
            }
        }, new Function1() { // from class: o.fDe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.EZpvd(this.OLrzqt, (C17351fCc.TaskDescription) obj);
            }
        }, this.isConnected));
        values().EZpvd(eCF.class, new C17433fFd(new Function1() { // from class: o.fDk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.KWHzl(this.KWHzl, (eCF) obj);
            }
        }));
        values().AEQbTJ(C17424fEv.Activity.class, (fDP) new C17424fEv(new Function1() { // from class: o.fDl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.AEQbTJ(this.EZpvd, (C17424fEv.Activity) obj);
            }
        }));
        values().AEQbTJ(fED.class, (fDP) new C17428fEz());
        values().AEQbTJ(fEW.class, (fDP) new fEV(new Function1() { // from class: o.fDi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.EZpvd(this.copydefault, (AbstractC12784ctX) obj);
            }
        }));
        values().AEQbTJ(C17430fFa.class, (fDP) new fEZ(new Function1() { // from class: o.fDj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.copydefault(this.OLrzqt, (AbstractC12784ctX) obj);
            }
        }));
        Activity activityValues = values();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        activityValues.AEQbTJ(fEX.class, (fDP) new fET(viewLifecycleOwner, new Function1() { // from class: o.fDp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.fIwbmz(this.EZpvd, (AbstractC12782ctV) obj);
            }
        }));
        Activity activityValues2 = values();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        activityValues2.AEQbTJ(C17432fFc.class, (fDP) new C17434fFe(viewLifecycleOwner2, new Function1() { // from class: o.fDn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.ejfBZ(this.copydefault, (AbstractC12782ctV) obj);
            }
        }, new Function1() { // from class: o.fDq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.AuCTel(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C17351fCc c17351fCc, TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        if (c17351fCc.values().OLrzqt(taskDescription)) {
            taskDescription.copydefault(false);
            c17351fCc.values().AEQbTJ(taskDescription);
        } else {
            taskDescription.copydefault(true);
            c17351fCc.values().KWHzl(taskDescription);
        }
        c17351fCc.AkhnZx().gEmmrt().gEmmrt(taskDescription.gEmmrt());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C17351fCc c17351fCc, TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c17351fCc.copydefault(taskDescription.gEmmrt());
        c17351fCc.djBIcL();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final C17351fCc c17351fCc, TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        AbstractC12784ctX abstractC12784ctXGEmmrt = taskDescription.gEmmrt();
        C17237eyx c17237eyx = c17351fCc.fARcdN;
        FragmentActivity activity = c17351fCc.getActivity();
        Intrinsics.copydefault(activity, "");
        c17237eyx.EZpvd(new C17263ezW((AppCompatActivity) activity, abstractC12784ctXGEmmrt.EZpvd(), abstractC12784ctXGEmmrt.fJNWhG(), abstractC12784ctXGEmmrt.fJNWhG(), false, c17351fCc.getTAG(), new Function1() { // from class: o.fCn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        c17351fCc.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C17351fCc c17351fCc, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c17351fCc.dismissLoading();
        c17351fCc.AkhnZx().OLrzqt(false);
        return Unit.INSTANCE;
    }

    public static final fDP KWHzl(C17351fCc c17351fCc, eCF ecf) {
        Intrinsics.checkNotNullParameter(ecf, "");
        if (ecf.copydefault().getFieldNames()) {
            return c17351fCc.AYXKKw();
        }
        return c17351fCc.gEmmrt();
    }

    public static final Unit AEQbTJ(final C17351fCc c17351fCc, final C17424fEv.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        C10604brb instance$default = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null);
        android.content.Context contextRequireContext = c17351fCc.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        instance$default.KWHzl(contextRequireContext, c17351fCc, new Function0() { // from class: o.fCY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17351fCc.KWHzl(this.KWHzl, activity);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C17351fCc c17351fCc, C17424fEv.Activity activity) {
        c17351fCc.EZpvd(activity.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C17351fCc c17351fCc, AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        c17351fCc.KWHzl(abstractC12784ctX);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C17351fCc c17351fCc, AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        c17351fCc.OLrzqt(abstractC12784ctX);
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(C17351fCc c17351fCc, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c17351fCc.copydefault(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(C17351fCc c17351fCc, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c17351fCc.copydefault(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(C17351fCc c17351fCc, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c17351fCc.values().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fVU.Application.startActivity$default(o.fVU$Application, android.content.Context, java.lang.String, java.lang.Boolean, int, java.lang.Object):void */
    public final void copydefault(AbstractC12782ctV abstractC12782ctV) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C32866mlf.onEvent$default("Web3WalletManagement_AddWallet_Managesmartaccount_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
        if (C17922fXg.OLrzqt(abstractC12782ctV) instanceof dTH.Activity) {
            if (dtq != null) {
                dTQ.TaskDescription.walletRenewOrReenableTEEAccount$default(dtq, context, abstractC12782ctV.DbNXlk(), null, "sa_wallet_managesmartwallet", 4, null);
            }
        } else if (abstractC12782ctV.RJOkX() && !abstractC12782ctV.DTwDnp()) {
            fVU.Application.startActivity$default(fVU.Companion, context, abstractC12782ctV.DbNXlk(), null, 4, null);
        } else {
            ActivityC17792fSl.Companion.copydefault(context, new ActivateTeeGuideModel(abstractC12782ctV.DbNXlk(), false, false, (java.lang.String) null, 0, 1, 0, "sa_wallet_managesmartwallet", 94, (DefaultConstructorMarker) null));
        }
    }

    public final void OLrzqt(AbstractC12784ctX abstractC12784ctX) {
        FragmentActivity activity;
        java.lang.Object next;
        if (abstractC12784ctX.fJNWhG() != WalletType.MPCWallet || (activity = getActivity()) == null || abstractC12784ctX.getNewProxyInstance()) {
            return;
        }
        if (!abstractC12784ctX.AubY()) {
            ActivityC17523fIm.ActionBar.start$default(ActivityC17523fIm.Companion, activity, "", 0, 4, null);
            return;
        }
        dZP dzp = dZP.OLrzqt;
        if (!dzp.valueOf()) {
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
            if (interfaceC8104awT != null) {
                InterfaceC8104awT.StateListAnimator.routeLoginFromMpcWallet$default(interfaceC8104awT, activity, null, null, null, null, null, 48, null);
                return;
            }
            return;
        }
        java.lang.String strEZpvd = dzp.EZpvd();
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected = abstractC12784ctX.isConnected();
        if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) (mpcWalletEncodeInfoIsConnected != null ? mpcWalletEncodeInfoIsConnected.getUid() : null))) {
            return;
        }
        java.util.Iterator<T> it = dzp.copydefault().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            User user = (User) next;
            MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected2 = abstractC12784ctX.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoIsConnected2 != null ? mpcWalletEncodeInfoIsConnected2.getUid() : null), (java.lang.Object) user.getUid())) {
                break;
            }
        }
        User user2 = (User) next;
        java.util.List<User> listCopydefault = dZP.OLrzqt.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listCopydefault) {
            User user3 = (User) obj;
            MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected3 = abstractC12784ctX.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoIsConnected3 != null ? mpcWalletEncodeInfoIsConnected3.getUid() : null), (java.lang.Object) user3.getUid())) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        if (user2 != null && dZP.OLrzqt.copydefault().size() - size > 0) {
            eRI.OLrzqt.AEQbTJ(activity, user2, (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(abstractC12784ctX.KWHzl()), new yHT() { // from class: o.fCK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHT
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    return C17351fCc.OLrzqt(this.EZpvd, ((java.lang.Integer) obj2).intValue(), (android.view.View) obj3, (ViewOnClickListenerC54939xaY) obj4, ((java.lang.Boolean) obj5).booleanValue());
                }
            });
            return;
        }
        eRI eri = eRI.OLrzqt;
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(abstractC12784ctX.KWHzl());
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected4 = abstractC12784ctX.isConnected();
        Intrinsics.copydefault(mpcWalletEncodeInfoIsConnected4);
        eri.AEQbTJ(activity, activity, abstractC12782ctV, mpcWalletEncodeInfoIsConnected4.getUid(), new yHO() { // from class: o.fCL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return C17351fCc.EZpvd(this.EZpvd, ((java.lang.Integer) obj2).intValue(), (android.view.View) obj3, (ViewOnClickListenerC54939xaY) obj4);
            }
        });
    }

    public static final Unit OLrzqt(C17351fCc c17351fCc, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c17351fCc), Dispatchers.getMain(), null, new WalletManageContentFragmentNew$onErrorTipClick$1$1(c17351fCc, null), 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C17351fCc c17351fCc, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c17351fCc), Dispatchers.getMain(), null, new WalletManageContentFragmentNew$onErrorTipClick$2$1(c17351fCc, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fpt.showBackupDialogWithManualCallback$default(android.content.Context, androidx.fragment.app.FragmentManager, o.ctV, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public final void KWHzl(final AbstractC12784ctX abstractC12784ctX) {
        AbstractC12782ctV abstractC12782ctV;
        android.content.Context context = getContext();
        if (context == null || (abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(abstractC12784ctX.KWHzl())) == null) {
            return;
        }
        if (abstractC12784ctX.fJNWhG() == WalletType.MPCWallet) {
            EZpvd(abstractC12782ctV);
            return;
        }
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        C18836fpt.showBackupDialogWithManualCallback$default(context, childFragmentManager, abstractC12782ctV, null, new Function0() { // from class: o.fCC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17351fCc.gEmmrt(this.KWHzl, abstractC12784ctX);
            }
        }, 8, null);
        C32866mlf.onEvent$default("Web3WalletManagement_ManagePage_BackupWallet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fCG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.gEmmrt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit gEmmrt(C17351fCc c17351fCc, AbstractC12784ctX abstractC12784ctX) {
        if (C13912dbY.copydefault.gEmmrt()) {
            ActivityC18750foL.StateListAnimator stateListAnimator = ActivityC18750foL.Companion;
            android.content.Context contextRequireContext = c17351fCc.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            ActivityC18750foL.StateListAnimator.startActivity$default(stateListAnimator, contextRequireContext, abstractC12784ctX.EZpvd(), "defi_main", 0, 8, null);
        } else {
            ActivityC18691fnF.Activity activity = ActivityC18691fnF.Companion;
            android.content.Context contextRequireContext2 = c17351fCc.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            ActivityC18691fnF.Activity.startActivity$default(activity, contextRequireContext2, abstractC12784ctX.EZpvd(), "defi_main", 0, 8, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(AbstractC12782ctV abstractC12782ctV) {
        AkhnZx().AEQbTJ(abstractC12782ctV);
    }

    public static final Unit AhwBna(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(AbstractC12782ctV abstractC12782ctV) {
        FragmentActivity activity;
        C32866mlf.onEvent$default("Web3WalletManagement_MPCBackUp_Card_Click", (TrackChannel[]) null, new Function1() { // from class: o.fDm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.AhwBna((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (abstractC12782ctV.AxsJAYaxsJAY() || abstractC12782ctV.ffGIBT()) {
            if (abstractC12782ctV.QSBOWP() != null) {
                MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
                Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP);
                if (mpcWalletEncodeInfoQSBOWP.getStatus() != MpcShare2Status.SHARE2_INVALID.getValue() || getContext() == null || (activity = getActivity()) == null) {
                    return;
                }
                AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXEZpvd = C15691eRs.AEQbTJ.EZpvd(abstractC12782ctV, activity);
                final Function1 function1 = new Function1() { // from class: o.fDo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C17351fCc.gEmmrt(this.KWHzl, (java.lang.Boolean) obj);
                    }
                };
                InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fDr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C17351fCc.DbNXlk(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.fDs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C17351fCc.AEQbTJ((java.lang.Throwable) obj);
                    }
                };
                abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fDv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C17351fCc.fetchVPNInfo(function12, obj);
                    }
                });
                return;
            }
            return;
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            ActivityC18321fgG.StateListAnimator.startActivity$default(ActivityC18321fgG.Companion, activity2, abstractC12782ctV.DbNXlk(), false, 4, null);
        }
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(C17351fCc c17351fCc, java.lang.Boolean bool) {
        FragmentActivity activity;
        if (bool.booleanValue() && (activity = c17351fCc.getActivity()) != null) {
            ActivityC17523fIm.ActionBar.start$default(ActivityC17523fIm.Companion, activity, null, 0, 6, null);
        }
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        C17237eyx c17237eyx = this.fARcdN;
        FragmentActivity activity = getActivity();
        Intrinsics.copydefault(activity, "");
        AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
        java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
        WalletType walletTypeQwvEab = abstractC12782ctV.QwvEab();
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        c17237eyx.EZpvd(new C17263ezW(appCompatActivity, strDbNXlk, walletTypeQwvEab, abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.fJNWhG() : null, false, getTAG(), new Function1() { // from class: o.fDc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.AhwBna(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        valueOf();
    }

    public static final Unit AhwBna(C17351fCc c17351fCc, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c17351fCc.dismissLoading();
        c17351fCc.AkhnZx().OLrzqt(false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fjv.TaskDescription.newInstance$default(o.fjv$TaskDescription, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):o.fjv */
    public final void KWHzl(final AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strEZpvd;
        pUU.OLrzqt(">>>prompt onEditAccountNameClick walletID: " + abstractC12782ctV.DbNXlk() + " ");
        djBIcL();
        C18521fjv.TaskDescription taskDescription = C18521fjv.Companion;
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        java.lang.String str = (abstractC12784ctXGwTjWJ == null || (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) == null) ? "" : strEZpvd;
        java.lang.String string = getString(C13754dXa.FragmentManager.aappFQ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C18521fjv c18521fjvKWHzl = taskDescription.KWHzl(1, (20 & 2) != 0 ? "" : str, (20 & 4) != 0 ? "" : null, (20 & 8) != 0 ? "" : string, (20 & 16) != 0 ? "" : null, (20 & 32) == 0 ? abstractC12782ctV.AkhnZx() : "");
        c18521fjvKWHzl.show(getChildFragmentManager(), C17351fCc.class.getName());
        c18521fjvKWHzl.KWHzl(new Function1() { // from class: o.fDz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.EZpvd(this.OLrzqt, abstractC12782ctV, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(final C17351fCc c17351fCc, AbstractC12782ctV abstractC12782ctV, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c17351fCc.showLoading();
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC12782ctV.fIwbmz(str), c17351fCc);
        final Function1 function1 = new Function1() { // from class: o.fCt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.valueOf(this.OLrzqt, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fCu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17351fCc.AkhnZx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fCy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.AEQbTJ(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fCA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17351fCc.isConnected(function12, obj);
            }
        });
        Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
        c17351fCc.addDisposable(interfaceC58217yxCAEQbTJ);
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(C17351fCc c17351fCc, java.lang.Integer num) {
        c17351fCc.dismissLoading();
        c17351fCc.AkhnZx().OLrzqt(false);
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C17351fCc c17351fCc, java.lang.Throwable th) {
        c17351fCc.dismissLoading();
        pUU.copydefault(c17351fCc.getTAG(), "onEditAccountNameClick rename error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fjb.ActionBar.newInstance$default(o.fjb$ActionBar, android.content.Context, java.lang.String, java.util.List, java.util.List, boolean, int, int, java.lang.Object):android.content.Intent */
    public final void fetchVPNInfo() {
        java.lang.Object objM7377constructorimpl;
        if (AkhnZx().AkhnZx() == 0 && AkhnZx().AEQbTJ() == 0) {
            return;
        }
        if (AkhnZx().AkhnZx() >= 100) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C55326xho.toast$default(C33069mpW.copydefault(C13754dXa.FragmentManager.MediaBrowserCompatItemCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "100"))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, 0, 27, (java.lang.Object) null));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7376boximpl(objM7377constructorimpl);
        } else {
            ActivityResultLauncher<android.content.Intent> activityResultLauncher = this.AhwBna;
            if (activityResultLauncher != null) {
                ActivityC18501fjb.ActionBar actionBar = ActivityC18501fjb.Companion;
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    return;
                } else {
                    activityResultLauncher.launch(actionBar.OLrzqt(activity, (62 & 2) != 0 ? null : null, (62 & 4) == 0 ? null : null, (62 & 8) != 0 ? yDY.AhwBna() : null, (62 & 16) != 0, (62 & 32) == 0 ? 0 : 1));
                }
            }
        }
        dTU.onWeb3Event$default("Web3WalletManagement_ManagePage_AddAccount_Click", null, null, 3, null);
    }

    public final void EZpvd(final AbstractC12784ctX abstractC12784ctX) {
        if (AkhnZx().AkhnZx() >= 100) {
            C55326xho.toast$default(C33069mpW.copydefault(C13754dXa.FragmentManager.MediaBrowserCompatItemCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "100"))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, 0, 27, (java.lang.Object) null);
            return;
        }
        if (abstractC12784ctX.fJNWhG() != WalletType.HDWallet) {
            C32866mlf.onEvent$default("Web3WalletManagement_AccountSheet_SmartAccount_Click", (TrackChannel[]) null, new Function1() { // from class: o.fCB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17351fCc.AEQbTJ(abstractC12784ctX, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        fNC fnc = fNC.OLrzqt;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        fnc.KWHzl(abstractC12784ctX, fragmentActivityRequireActivity, childFragmentManager, this, "wallet_list", new Function2() { // from class: o.fCI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C17351fCc.OLrzqt(this.AEQbTJ, (WalletCreatedData) obj, (java.lang.Integer) obj2);
            }
        });
    }

    public static final Unit AEQbTJ(AbstractC12784ctX abstractC12784ctX, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("wallet_type", fNC.OLrzqt.AEQbTJ(abstractC12784ctX.fJNWhG()), true));
        eventParamsList.add(new EventParam("resource", "wallet_management", true));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C17351fCc c17351fCc, WalletCreatedData walletCreatedData, java.lang.Integer num) {
        c17351fCc.AEQbTJ(walletCreatedData, num);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(WalletCreatedData walletCreatedData, java.lang.Integer num) {
        dismissLoading();
        fNC.OLrzqt.EZpvd(walletCreatedData, num);
        AkhnZx().OLrzqt(true);
    }

    public final void copydefault(final AbstractC12784ctX abstractC12784ctX) {
        C18521fjv.TaskDescription taskDescription = C18521fjv.Companion;
        java.lang.String strEZpvd = abstractC12784ctX.EZpvd();
        java.lang.String string = getString(C13754dXa.FragmentManager.aappFQ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C18521fjv c18521fjvKWHzl = taskDescription.KWHzl(0, (20 & 2) != 0 ? "" : strEZpvd, (20 & 4) != 0 ? "" : null, (20 & 8) != 0 ? "" : string, (20 & 16) != 0 ? "" : null, (20 & 32) == 0 ? abstractC12784ctX.AuCTel() : "");
        c18521fjvKWHzl.show(getChildFragmentManager(), C17351fCc.class.getName());
        c18521fjvKWHzl.KWHzl(new Function1() { // from class: o.fDg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.KWHzl(this.OLrzqt, abstractC12784ctX, (java.lang.String) obj);
            }
        });
    }

    public static final Unit KWHzl(final C17351fCc c17351fCc, AbstractC12784ctX abstractC12784ctX, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c17351fCc.AkhnZx().isConnected();
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(abstractC12784ctX.copydefault(str), c17351fCc);
        final Function1 function1 = new Function1() { // from class: o.fCj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.AhwBna(this.EZpvd, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fCs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17351fCc.values(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fCp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.copydefault(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fCo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17351fCc.AuCTel(function12, obj);
            }
        });
        Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
        c17351fCc.addDisposable(interfaceC58217yxCAEQbTJ);
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(C17351fCc c17351fCc, java.lang.Integer num) {
        c17351fCc.AkhnZx().EZpvd();
        c17351fCc.AkhnZx().OLrzqt(false);
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C17351fCc c17351fCc, java.lang.Throwable th) {
        c17351fCc.dismissLoading();
        pUU.copydefault(c17351fCc.getTAG(), "onEditRootWalletNameClick rename error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    private final void ejfBZ() {
        AbstractC16630enZ abstractC16630enZ = this.gEmmrt;
        if (abstractC16630enZ == null) {
            Intrinsics.gEmmrt("");
            abstractC16630enZ = null;
        }
        abstractC16630enZ.AYXKKw.setLayoutManager(new SafeLinearLayoutManager(getContext()));
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.AYXKKw) {
            this.AYXKKw = false;
        } else {
            uzCIH();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.AbstractC57212yeE, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        SubHelper.AEQbTJ(this.DbNXlk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uzCIH() {
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        AkhnZx().OLrzqt(true);
        final Ref.IntRef intRef = new Ref.IntRef();
        new eSA().KWHzl(this, new Function1() { // from class: o.fCb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17351fCc.OLrzqt(intRef, jCurrentTimeMillis, this, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletManageContentFragmentNew$refreshData$2(intRef, jCurrentTimeMillis, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletManageContentFragmentNew$refreshData$3(this, intRef, jCurrentTimeMillis, null), 3, null);
    }

    public static final void KWHzl(long j, C17351fCc c17351fCc, int i) {
        if (i == 3 && java.lang.System.currentTimeMillis() - j > c17351fCc.fetchVPNInfo) {
            c17351fCc.AkhnZx().OLrzqt(false);
        }
    }

    public static final Unit OLrzqt(Ref.IntRef intRef, long j, C17351fCc c17351fCc, boolean z) {
        int i = intRef.element + 1;
        intRef.element = i;
        KWHzl(j, c17351fCc, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fCc$Activity */
    public static final class Activity extends fDJ {
        public java.util.List<? extends fDL<java.lang.Object>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull java.util.List<? extends fDL<java.lang.Object>> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.fDL<java.lang.Object>>, java.util.List<o.fDL<java.lang.Object>> */
        public final java.util.List<fDL<java.lang.Object>> copydefault() {
            return this.copydefault;
        }

        @Override // o.fDJ
        public int AEQbTJ() {
            java.util.List<? extends fDL<java.lang.Object>> list = this.copydefault;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x000f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // o.fDJ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public fDL<java.lang.Object> AEQbTJ(int i) {
            if (i >= 0) {
                java.util.List<? extends fDL<java.lang.Object>> list = this.copydefault;
                if (i >= (list != null ? list.size() : 0)) {
                }
            } else {
                try {
                    throw new java.lang.RuntimeException("getGroupItem with error index " + i);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
            java.util.List<? extends fDL<java.lang.Object>> list2 = this.copydefault;
            fDL<java.lang.Object> fdl = list2 != null ? list2.get(i) : null;
            Intrinsics.copydefault(fdl);
            return fdl;
        }
    }

    /* JADX INFO: renamed from: o.fCc$TaskDescription */
    public static final class TaskDescription implements fDL<java.lang.Object> {
        public boolean AEQbTJ;
        public final java.util.Map<java.lang.String, EIP7702WalletStatus> EZpvd;
        public final AbstractC12784ctX KWHzl;
        public final InterfaceC56387yDm OLrzqt;
        public final InterfaceC56387yDm copydefault;
        public final InterfaceC56387yDm djBIcL;
        public final boolean gEmmrt;

        @Override // o.fDL
        public boolean AEQbTJ() {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC12784ctX gEmmrt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean values() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<java.lang.String, ? extends com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull AbstractC12784ctX abstractC12784ctX, boolean z, boolean z2, java.util.Map<java.lang.String, ? extends EIP7702WalletStatus> map) {
            Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
            this.KWHzl = abstractC12784ctX;
            this.AEQbTJ = z;
            this.gEmmrt = z2;
            this.EZpvd = map;
            this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.fDE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C17351fCc.TaskDescription.KWHzl();
                }
            });
            this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.fDB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C17351fCc.TaskDescription.djBIcL();
                }
            });
            this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.fDC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C17351fCc.TaskDescription.EZpvd(this.AEQbTJ);
                }
            });
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 o.ctX)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
  (r5v0 java.util.Map)
 A[MD:(o.ctX, boolean, boolean, java.util.Map<java.lang.String, ? extends com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus>):void (m)] (LINE:986) call: o.fCc.TaskDescription.<init>(o.ctX, boolean, boolean, java.util.Map):void type: THIS */
        public /* synthetic */ TaskDescription(AbstractC12784ctX abstractC12784ctX, boolean z, boolean z2, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC12784ctX, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, map);
        }

        public final C17412fEj valueOf() {
            return (C17412fEj) this.copydefault.getValue();
        }

        public static final C17412fEj KWHzl() {
            return new C17412fEj();
        }

        public final dTQ AhwBna() {
            return (dTQ) this.djBIcL.getValue();
        }

        public static final dTQ djBIcL() {
            return (dTQ) C43251rlk.OLrzqt(dTQ.class);
        }

        private final java.util.ArrayList<java.lang.Object> fetchVPNInfo() {
            return (java.util.ArrayList) this.OLrzqt.getValue();
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final java.util.ArrayList EZpvd(TaskDescription taskDescription) {
            EIP7702WalletStatus eIP7702WalletStatus;
            dTQ dtqAhwBna;
            java.lang.String strAYXKKw;
            java.lang.String strAYXKKw2;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (taskDescription.KWHzl.zLjUOn() && taskDescription.KWHzl.AEQbTJ()) {
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(taskDescription.KWHzl.KWHzl());
                if (!abstractC12782ctV.DCUTEIdCUTEI()) {
                    if (!abstractC12782ctV.Dmq()) {
                        strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getCurrent);
                        strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.saveState);
                    } else {
                        dZP dzp = dZP.OLrzqt;
                        if (dzp.valueOf()) {
                            java.util.List<User> listCopydefault = dzp.copydefault();
                            if ((listCopydefault instanceof java.util.Collection) && listCopydefault.isEmpty()) {
                                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.LocalActivityResultRegistryOwnerLocalComposition1);
                                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.playFromMediaId);
                            } else {
                                java.util.Iterator<T> it = listCopydefault.iterator();
                                while (it.hasNext()) {
                                    java.lang.String uid = ((User) it.next()).getUid();
                                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
                                    if (Intrinsics.EZpvd((java.lang.Object) uid, (java.lang.Object) (mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getUid() : null))) {
                                        java.lang.String strEZpvd = dZP.OLrzqt.EZpvd();
                                        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
                                        if (!Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) (mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getUid() : null))) {
                                            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.provides);
                                            strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTransportControlEnabled);
                                        }
                                    }
                                }
                                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.LocalActivityResultRegistryOwnerLocalComposition1);
                                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.playFromMediaId);
                            }
                        }
                    }
                    if (strAYXKKw.length() > 0) {
                    }
                } else {
                    strAYXKKw = "";
                    strAYXKKw2 = "";
                    if (strAYXKKw.length() > 0) {
                        arrayList.add(new C17430fFa(strAYXKKw, strAYXKKw2, taskDescription.KWHzl));
                    }
                }
            }
            for (AbstractC12782ctV abstractC12782ctV2 : taskDescription.KWHzl.fIwbmz()) {
                java.util.Map<java.lang.String, EIP7702WalletStatus> map = taskDescription.EZpvd;
                if (map == null || (eIP7702WalletStatus = map.get(abstractC12782ctV2.DbNXlk())) == null) {
                    eIP7702WalletStatus = EIP7702WalletStatus.Unknown;
                }
                arrayList.add(new eCF(abstractC12782ctV2, eIP7702WalletStatus));
                if (abstractC12782ctV2.zuWLRA() && abstractC12782ctV2.zLjUOn() && (dtqAhwBna = taskDescription.AhwBna()) != null && dtqAhwBna.OLrzqt(abstractC12782ctV2.DbNXlk())) {
                    if (abstractC12782ctV2.QbewEr()) {
                        arrayList.add(new C17432fFc(abstractC12782ctV2));
                    } else {
                        arrayList.add(new fEX(abstractC12782ctV2));
                    }
                }
            }
            taskDescription.KWHzl.copydefault(taskDescription.valueOf().OLrzqt(taskDescription.KWHzl));
            if (taskDescription.KWHzl.djBIcL() || taskDescription.KWHzl.DbNXlk() > taskDescription.KWHzl.values()) {
                arrayList.add(new C17424fEv.Activity(taskDescription.KWHzl));
            }
            return arrayList;
        }

        @Override // o.fDL
        public int OLrzqt() {
            return fetchVPNInfo().size();
        }

        @Override // o.fDL
        public java.lang.Object copydefault(int i) {
            java.lang.Object obj = fetchVPNInfo().get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        }
    }

    public final void isConnected() {
        android.view.View viewFindViewById;
        final android.view.View childAt;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        final Function0<Unit> function0 = new Function0() { // from class: o.fCP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17351fCc.AkhnZx(this.KWHzl);
            }
        };
        C13912dbY c13912dbY = C13912dbY.copydefault;
        if (c13912dbY.AkhnZx()) {
            final C52812wZg c52812wZg = new C52812wZg(context);
            AbstractC16630enZ abstractC16630enZ = this.gEmmrt;
            if (abstractC16630enZ == null) {
                Intrinsics.gEmmrt("");
                abstractC16630enZ = null;
            }
            RecyclerView.LayoutManager layoutManager = abstractC16630enZ.AYXKKw.getLayoutManager();
            if (layoutManager != null) {
                AbstractC16630enZ abstractC16630enZ2 = this.gEmmrt;
                if (abstractC16630enZ2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16630enZ2 = null;
                }
                android.view.View childAt2 = layoutManager.getChildAt(abstractC16630enZ2.AYXKKw.getChildCount() - 1);
                if (childAt2 == null) {
                    return;
                }
                AbstractC16630enZ abstractC16630enZ3 = this.gEmmrt;
                if (abstractC16630enZ3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16630enZ3 = null;
                }
                RecyclerView.LayoutManager layoutManager2 = abstractC16630enZ3.AYXKKw.getLayoutManager();
                if (layoutManager2 == null || (childAt = layoutManager2.getChildAt(0)) == null) {
                    return;
                }
                c13912dbY.AhwBna(false);
                dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
                boolean z = dtq != null && dtq.copydefault();
                if (z) {
                    c13912dbY.AYXKKw(false);
                }
                C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(childAt2);
                stateListAnimator.EZpvd(3);
                stateListAnimator.copydefault(C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                stateListAnimator.AEQbTJ(0);
                stateListAnimator.KWHzl(C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                stateListAnimator.OLrzqt(0);
                stateListAnimator.AEQbTJ(C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                if (z) {
                    stateListAnimator.AEQbTJ(getString(C13754dXa.FragmentManager.registerKey));
                    stateListAnimator.OLrzqt(getString(C13754dXa.FragmentManager.generateRandomNumber));
                } else {
                    stateListAnimator.AEQbTJ(getString(C13754dXa.FragmentManager.rate));
                    stateListAnimator.OLrzqt(getString(C13754dXa.FragmentManager.previous));
                }
                stateListAnimator.copydefault(new Function0() { // from class: o.fCO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(C17351fCc.valueOf(childAt, c52812wZg));
                    }
                });
                final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) childAt.findViewById(C13754dXa.ActionBar.requestPostMessageChannelWithExtras);
                if (linearLayoutCompat == null) {
                    return;
                }
                linearLayoutCompat.setPaddingRelative(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null));
                C52812wZg.StateListAnimator stateListAnimator2 = new C52812wZg.StateListAnimator(linearLayoutCompat);
                stateListAnimator2.EZpvd(1);
                stateListAnimator2.copydefault(0);
                stateListAnimator2.AEQbTJ(0);
                stateListAnimator2.KWHzl(0);
                stateListAnimator2.OLrzqt(0);
                stateListAnimator2.AEQbTJ(C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                stateListAnimator2.AEQbTJ(getString(C13754dXa.FragmentManager.doDispatch));
                stateListAnimator2.OLrzqt(getString(C13754dXa.FragmentManager.launchdefault));
                stateListAnimator2.copydefault(new Function0() { // from class: o.fCN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(C17351fCc.AYXKKw(childAt, c52812wZg));
                    }
                });
                stateListAnimator2.KWHzl(new Function0() { // from class: o.fCQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(C17351fCc.AhwBna(childAt, c52812wZg));
                    }
                });
                AbstractC16630enZ abstractC16630enZ4 = this.gEmmrt;
                if (abstractC16630enZ4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16630enZ4 = null;
                }
                AppCompatTextView appCompatTextView = abstractC16630enZ4.valueOf;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                C52812wZg.StateListAnimator stateListAnimator3 = new C52812wZg.StateListAnimator(appCompatTextView);
                stateListAnimator3.EZpvd(1);
                stateListAnimator3.copydefault(32);
                stateListAnimator3.AEQbTJ(0);
                stateListAnimator3.KWHzl(32);
                stateListAnimator3.OLrzqt(0);
                stateListAnimator3.AEQbTJ(C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                stateListAnimator3.AEQbTJ(getString(C13754dXa.FragmentManager.ActivityResultRegistry));
                stateListAnimator3.OLrzqt(getString(C13754dXa.FragmentManager.ActivityResultLauncher));
                stateListAnimator3.KWHzl(new Function0() { // from class: o.fCR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(C17351fCc.AEQbTJ(childAt, c52812wZg));
                    }
                });
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(stateListAnimator);
                arrayList.add(stateListAnimator2);
                arrayList.add(stateListAnimator3);
                c52812wZg.EZpvd(arrayList);
                c52812wZg.OLrzqt(3);
                c52812wZg.KWHzl(new Function0() { // from class: o.fCS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C17351fCc.KWHzl(linearLayoutCompat, function0);
                    }
                });
                c52812wZg.fARcdN();
                return;
            }
            return;
        }
        if (c13912dbY.isConnected()) {
            C52812wZg c52812wZg2 = new C52812wZg(context);
            AbstractC16630enZ abstractC16630enZ5 = this.gEmmrt;
            if (abstractC16630enZ5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16630enZ5 = null;
            }
            RecyclerView.LayoutManager layoutManager3 = abstractC16630enZ5.AYXKKw.getLayoutManager();
            if (layoutManager3 != null) {
                AbstractC16630enZ abstractC16630enZ6 = this.gEmmrt;
                if (abstractC16630enZ6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16630enZ6 = null;
                }
                android.view.View childAt3 = layoutManager3.getChildAt(abstractC16630enZ6.AYXKKw.getChildCount() - 1);
                if (childAt3 == null || (viewFindViewById = childAt3.findViewById(C13754dXa.ActionBar.gHZMYf)) == null) {
                    return;
                }
                C52794wYp c52794wYpAkhnZx = c52812wZg2.AkhnZx();
                if (c52794wYpAkhnZx != null) {
                    c52794wYpAkhnZx.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ODWQjV));
                }
                C52794wYp c52794wYpAkhnZx2 = c52812wZg2.AkhnZx();
                if (c52794wYpAkhnZx2 != null) {
                    c52794wYpAkhnZx2.setOnClickListener(new LoaderManager(c52794wYpAkhnZx2, 1000L, c52812wZg2, this));
                }
                C52812wZg.StateListAnimator stateListAnimator4 = new C52812wZg.StateListAnimator(viewFindViewById);
                stateListAnimator4.EZpvd(1);
                stateListAnimator4.OLrzqt(C55298xhM.dpInt$default(14.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                stateListAnimator4.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.zAGdSp));
                stateListAnimator4.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hBUiXU));
                c52812wZg2.AEQbTJ(stateListAnimator4);
                c52812wZg2.OLrzqt(1);
                c52812wZg2.KWHzl(function0);
                c52812wZg2.fARcdN();
                C52794wYp c52794wYpIsConnected = c52812wZg2.isConnected();
                if (c52794wYpIsConnected != null) {
                    c52794wYpIsConnected.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DCJXGO));
                }
                C52794wYp c52794wYpIsConnected2 = c52812wZg2.isConnected();
                if (c52794wYpIsConnected2 != null) {
                    c52794wYpIsConnected2.setOnClickListener(new FragmentManager(c52794wYpIsConnected2, 1000L, c52812wZg2));
                }
                c13912dbY.AYXKKw(false);
            }
        }
    }

    public static final Unit AkhnZx(C17351fCc c17351fCc) {
        c17351fCc.AkhnZx().EZpvd(false);
        c17351fCc.AkhnZx().OLrzqt(true);
        return Unit.INSTANCE;
    }

    public static final boolean valueOf(final android.view.View view, final C52812wZg c52812wZg) {
        if (!(view instanceof fDY)) {
            return true;
        }
        fDW fdw = new fDW() { // from class: o.fCJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.fDW
            public final void OLrzqt(boolean z) {
                C17351fCc.AYXKKw(c52812wZg, view, z);
            }
        };
        fDY fdy = (fDY) view;
        fdy.OLrzqt(fdw);
        fdy.KWHzl();
        return true;
    }

    public static final void AYXKKw(C52812wZg c52812wZg, android.view.View view, boolean z) {
        c52812wZg.DbNXlk();
        ((fDY) view).OLrzqt((fDW) null);
    }

    public static final boolean AYXKKw(final android.view.View view, final C52812wZg c52812wZg) {
        if (!(view instanceof fDY)) {
            return true;
        }
        fDW fdw = new fDW() { // from class: o.fCz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.fDW
            public final void OLrzqt(boolean z) {
                C17351fCc.gEmmrt(c52812wZg, view, z);
            }
        };
        fDY fdy = (fDY) view;
        fdy.OLrzqt(fdw);
        fdy.AEQbTJ();
        return true;
    }

    public static final void gEmmrt(C52812wZg c52812wZg, android.view.View view, boolean z) {
        c52812wZg.DbNXlk();
        ((fDY) view).OLrzqt((fDW) null);
    }

    public static final boolean AhwBna(final android.view.View view, final C52812wZg c52812wZg) {
        if (!(view instanceof fDY)) {
            return true;
        }
        fDW fdw = new fDW() { // from class: o.fCe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.fDW
            public final void OLrzqt(boolean z) {
                C17351fCc.valueOf(c52812wZg, view, z);
            }
        };
        fDY fdy = (fDY) view;
        fdy.OLrzqt(fdw);
        fdy.AEQbTJ();
        return true;
    }

    public static final void valueOf(C52812wZg c52812wZg, android.view.View view, boolean z) {
        c52812wZg.EZpvd();
        ((fDY) view).OLrzqt((fDW) null);
    }

    public static final boolean AEQbTJ(final android.view.View view, final C52812wZg c52812wZg) {
        if (!(view instanceof fDY)) {
            return true;
        }
        fDW fdw = new fDW() { // from class: o.fCr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.fDW
            public final void OLrzqt(boolean z) {
                C17351fCc.copydefault(c52812wZg, view, z);
            }
        };
        fDY fdy = (fDY) view;
        fdy.OLrzqt(fdw);
        fdy.KWHzl();
        return true;
    }

    public static final void copydefault(C52812wZg c52812wZg, android.view.View view, boolean z) {
        c52812wZg.EZpvd();
        ((fDY) view).OLrzqt((fDW) null);
    }

    public static final Unit KWHzl(LinearLayoutCompat linearLayoutCompat, Function0 function0) {
        linearLayoutCompat.setPaddingRelative(0, 0, 0, 0);
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // o.eHZ.Application
    public void AEQbTJ(@NotNull OneKeyConnectedDevice oneKeyConnectedDevice) {
        Intrinsics.checkNotNullParameter(oneKeyConnectedDevice, "");
        this.values.launch(new ActivityC15412eHj.StateListAnimator(oneKeyConnectedDevice.getDevice().getConnectId(), oneKeyConnectedDevice.getDeviceId(), oneKeyConnectedDevice.getDevice().getDeviceType(), oneKeyConnectedDevice.getLabel(), 1));
    }
}
