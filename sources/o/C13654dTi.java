package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.immomo.mls.InitData;
import com.immomo.mls.ScriptStateListener;
import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.business.defi.share.Web3ShareCustomizeHandler$handleShare$2$onInitialized$2;
import com.okinc.business.defi.share.bean.ShareLinkBean;
import com.okinc.business.defi.share.bean.Web3ShareModel;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.wallet.api.WalletReferralSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.C13654dTi;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dTi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13654dTi extends AbstractC13657dTl {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public static WeakReference<C7328ahk> OLrzqt;
    public InterfaceC13655dTj AEQbTJ;
    public Job KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C13654dTi() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.dTj:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.dTj) : (r1v0 o.dTj))
 A[MD:(o.dTj):void (m)] (LINE:36) call: o.dTi.<init>(o.dTj):void type: THIS */
    public /* synthetic */ C13654dTi(InterfaceC13655dTj interfaceC13655dTj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC13655dTj);
    }

    public C13654dTi(InterfaceC13655dTj interfaceC13655dTj) {
        this.AEQbTJ = interfaceC13655dTj;
    }

    @Override // o.AbstractC13657dTl
    public void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Web3ShareModel web3ShareModel, ShareLinkBean shareLinkBean) {
        java.lang.String event;
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(web3ShareModel, "");
        if (shareLinkBean == null) {
            pUU.copydefault("Web3ShareService: lack of share link");
            return;
        }
        java.lang.Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(web3ShareModel.getShareInfoList());
        Intrinsics.copydefault(objFirstOrNull, "");
        dTJ dtj = (dTJ) objFirstOrNull;
        final Lifecycle lifecycleAEQbTJ = dtj.AEQbTJ();
        if (lifecycleAEQbTJ != null) {
            lifecycleAEQbTJ.addObserver(new LifecycleEventObserver() { // from class: com.okinc.business.defi.share.Web3ShareCustomizeHandler$handleShare$1$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                    Intrinsics.checkNotNullParameter(event2, "");
                    if (event2 == Lifecycle.Event.ON_DESTROY) {
                        C13654dTi.Companion.copydefault();
                        lifecycleAEQbTJ.removeObserver(this);
                    }
                }
            });
        }
        android.view.View viewInflate = android.view.View.inflate(abstractActivityC33041mov, C13754dXa.TaskDescription.hPlhRW, null);
        Intrinsics.copydefault(viewInflate, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewInflate;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        abstractActivityC33041mov.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        C33487mxQ.EZpvd(viewGroup, i, i2);
        C43056riA c43056riA = C43056riA.AEQbTJ;
        java.lang.String luaAppID = web3ShareModel.getLuaAppID();
        java.lang.String luaPageUrl = web3ShareModel.getLuaPageUrl();
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = C56390yDp.OLrzqt("to", web3ShareModel.getLuaRootVC());
        java.lang.String strAEQbTJ = ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_nft_miniapp_minversion", AmplitudeName.WEB3);
        if (strAEQbTJ == null) {
            strAEQbTJ = "6.155.3";
        }
        pairArr[1] = C56390yDp.OLrzqt("minversion", strAEQbTJ);
        InitData initDataEZpvd = c43056riA.EZpvd(luaAppID, luaPageUrl, C56424yEw.gEmmrt(pairArr));
        initDataEZpvd.KWHzl(128);
        kotlin.Pair[] pairArr2 = new kotlin.Pair[9];
        pairArr2[0] = C56390yDp.OLrzqt("moduleName", dtj.copydefault());
        pairArr2[1] = C56390yDp.OLrzqt("moduleVersion", java.lang.Integer.valueOf(dtj.KWHzl()));
        pairArr2[2] = C56390yDp.OLrzqt("shortLink", shareLinkBean.getFinalShareLink());
        pairArr2[3] = C56390yDp.OLrzqt("shareDataJson", dtj.EZpvd());
        pairArr2[4] = C56390yDp.OLrzqt("referralCode", web3ShareModel.getReferralCode());
        pairArr2[5] = C56390yDp.OLrzqt("discountRate", web3ShareModel.getDiscountRate());
        java.lang.String accountId = web3ShareModel.getAccountId();
        if (accountId == null) {
            accountId = "";
        }
        pairArr2[6] = C56390yDp.OLrzqt("walletId", accountId);
        WalletReferralSource source = web3ShareModel.getSource();
        if (source == null || (event = source.getEvent()) == null) {
            event = "";
        }
        pairArr2[7] = C56390yDp.OLrzqt("source", event);
        pairArr2[8] = C56390yDp.OLrzqt("trackEvent", "DexReferral_ShareWithCode_ShareLink_Click");
        java.util.HashMap mapAYXKKw = C56424yEw.AYXKKw(pairArr2);
        android.content.Context applicationContext = abstractActivityC33041mov.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        C43082ria.copydefault(applicationContext, new StateListAnimator(abstractActivityC33041mov, mapAYXKKw, viewGroup, initDataEZpvd, i, i2, this));
    }

    /* JADX INFO: renamed from: o.dTi$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC7340ahw {
        public final /* synthetic */ AbstractActivityC33041mov AEQbTJ;
        public final /* synthetic */ int AhwBna;
        public final /* synthetic */ java.util.HashMap<java.lang.String, java.lang.Object> EZpvd;
        public final /* synthetic */ android.view.ViewGroup KWHzl;
        public final /* synthetic */ InitData OLrzqt;
        public final /* synthetic */ int copydefault;
        public final /* synthetic */ C13654dTi djBIcL;

        public StateListAnimator(AbstractActivityC33041mov abstractActivityC33041mov, java.util.HashMap<java.lang.String, java.lang.Object> map, android.view.ViewGroup viewGroup, InitData initData, int i, int i2, C13654dTi c13654dTi) {
            this.AEQbTJ = abstractActivityC33041mov;
            this.EZpvd = map;
            this.KWHzl = viewGroup;
            this.OLrzqt = initData;
            this.AhwBna = i;
            this.copydefault = i2;
            this.djBIcL = c13654dTi;
        }

        @Override // o.InterfaceC7340ahw
        public void OLrzqt() {
            Activity activity = C13654dTi.Companion;
            activity.copydefault();
            if (C7863arp.KWHzl(this.AEQbTJ)) {
                C7328ahk c7328ahk = new C7328ahk(this.AEQbTJ);
                c7328ahk.OLrzqt(this.EZpvd);
                c7328ahk.EZpvd(this.KWHzl);
                c7328ahk.fetchVPNInfo = new C0829StateListAnimator(this.djBIcL, this.AEQbTJ);
                c7328ahk.AEQbTJ(this.OLrzqt);
                C33487mxQ.EZpvd(this.KWHzl, this.AhwBna, this.copydefault);
                this.djBIcL.KWHzl = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new Web3ShareCustomizeHandler$handleShare$2$onInitialized$2(this.djBIcL, this.AEQbTJ, null), 3, null);
                activity.KWHzl(new WeakReference<>(c7328ahk));
            }
        }

        /* JADX INFO: renamed from: o.dTi$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0829StateListAnimator implements ScriptStateListener {
            public final /* synthetic */ C13654dTi AEQbTJ;
            public final /* synthetic */ AbstractActivityC33041mov EZpvd;

            public C0829StateListAnimator(C13654dTi c13654dTi, AbstractActivityC33041mov abstractActivityC33041mov) {
                this.AEQbTJ = c13654dTi;
                this.EZpvd = abstractActivityC33041mov;
            }

            @Override // com.immomo.mls.ScriptStateListener
            public void OLrzqt() {
                final C13654dTi c13654dTi = this.AEQbTJ;
                final AbstractActivityC33041mov abstractActivityC33041mov = this.EZpvd;
                ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.dTo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C13654dTi.StateListAnimator.C0829StateListAnimator.KWHzl(c13654dTi, abstractActivityC33041mov);
                    }
                });
            }

            public static final void KWHzl(C13654dTi c13654dTi, AbstractActivityC33041mov abstractActivityC33041mov) {
                Job job = c13654dTi.KWHzl;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
                }
                c13654dTi.OLrzqt(abstractActivityC33041mov);
            }

            @Override // com.immomo.mls.ScriptStateListener
            public void copydefault(ScriptStateListener.Reason reason, java.lang.String str) {
                final C13654dTi c13654dTi = this.AEQbTJ;
                final AbstractActivityC33041mov abstractActivityC33041mov = this.EZpvd;
                ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.dTk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C13654dTi.StateListAnimator.C0829StateListAnimator.EZpvd(c13654dTi, abstractActivityC33041mov);
                    }
                });
            }

            public static final void EZpvd(C13654dTi c13654dTi, AbstractActivityC33041mov abstractActivityC33041mov) {
                Job job = c13654dTi.KWHzl;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
                }
                c13654dTi.OLrzqt(abstractActivityC33041mov);
            }
        }

        @Override // o.InterfaceC7340ahw
        public void EZpvd(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.djBIcL.OLrzqt(this.AEQbTJ);
            pUU.copydefault("share load mls failure");
        }
    }

    public final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov) {
        if (this.copydefault) {
            return;
        }
        this.copydefault = true;
        if (C7863arp.KWHzl(abstractActivityC33041mov)) {
            InterfaceC13655dTj interfaceC13655dTj = this.AEQbTJ;
            if (interfaceC13655dTj != null) {
                Intrinsics.copydefault(interfaceC13655dTj);
                interfaceC13655dTj.AEQbTJ();
            } else {
                abstractActivityC33041mov.dismissLoading();
            }
        }
    }

    /* JADX INFO: renamed from: o.dTi$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dTi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final WeakReference<C7328ahk> AEQbTJ() {
            return C13654dTi.OLrzqt;
        }

        public final void KWHzl(WeakReference<C7328ahk> weakReference) {
            C13654dTi.OLrzqt = weakReference;
        }

        public final void copydefault() {
            C7328ahk c7328ahk;
            WeakReference<C7328ahk> weakReferenceAEQbTJ = AEQbTJ();
            if (weakReferenceAEQbTJ != null && (c7328ahk = weakReferenceAEQbTJ.get()) != null) {
                c7328ahk.AubY();
            }
            WeakReference<C7328ahk> weakReferenceAEQbTJ2 = AEQbTJ();
            if (weakReferenceAEQbTJ2 != null) {
                weakReferenceAEQbTJ2.clear();
            }
            KWHzl(null);
        }
    }
}
