package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.bean.CurrencyPrependSign;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.net.bean.CoinInfoAddressInfoBean;
import com.okinc.business.defi.biz.net.bean.CoinInfoBean;
import com.okinc.business.defi.biz.net.bean.CoinInfoSocialMediaBean;
import com.okinc.components.track.TrackChannel;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C19595gIe;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.beN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityC9901beN extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public boolean AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public AbstractC16320ehh EZpvd;
    public java.util.List<CoinInfoAddressInfoBean> copydefault;
    public boolean djBIcL;
    public C10525bqB gEmmrt;
    public java.lang.String valueOf = "";
    public java.lang.String fetchVPNInfo = "";
    public long KWHzl = Long.MIN_VALUE;

    /* JADX INFO: renamed from: o.beN$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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

    public ActivityC9901beN() {
        final Function0 function0 = null;
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(C9935bev.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.assets.coinmanagement.DefiCoinInfoActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.assets.coinmanagement.DefiCoinInfoActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.assets.coinmanagement.DefiCoinInfoActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        this.AEQbTJ = new ViewModelLazy(C56524yIo.AEQbTJ(C9892beE.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.assets.coinmanagement.DefiCoinInfoActivity$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.assets.coinmanagement.DefiCoinInfoActivity$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.assets.coinmanagement.DefiCoinInfoActivity$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: renamed from: o.beN$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.beN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ void start$default(StateListAnimator stateListAnimator, android.app.Activity activity, java.lang.String str, java.lang.String str2, boolean z, long j, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            stateListAnimator.OLrzqt(activity, str, str2, z, j);
        }

        public final void OLrzqt(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, long j) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC9901beN.class);
            intent.putExtra("metaId", str);
            intent.putExtra("walletId", str2);
            intent.putExtra("custom", z);
            intent.putExtra("chainId", j);
            activity.startActivity(intent);
        }
    }

    public final C9935bev EZpvd() {
        return (C9935bev) this.AhwBna.getValue();
    }

    public final C9892beE AEQbTJ() {
        return (C9892beE) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16320ehh abstractC16320ehh = null;
        C32866mlf.onEvent$default("Web3WalletHomepage_SelectToken_TokenDetails_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        java.lang.String stringExtra = getIntent().getStringExtra("metaId");
        if (stringExtra == null) {
            return;
        }
        this.valueOf = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("walletId");
        if (stringExtra2 == null) {
            return;
        }
        this.fetchVPNInfo = stringExtra2;
        this.KWHzl = getIntent().getLongExtra("chainId", Long.MIN_VALUE);
        this.djBIcL = getIntent().getBooleanExtra("custom", false);
        AbstractC16320ehh abstractC16320ehh2 = (AbstractC16320ehh) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.hDKMBd);
        this.EZpvd = abstractC16320ehh2;
        if (abstractC16320ehh2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh2 = null;
        }
        abstractC16320ehh2.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.beO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC9901beN.fIwbmz(this.AEQbTJ, view);
            }
        });
        if (!this.djBIcL) {
            EZpvd().EZpvd().observe(this, new Application(new Function1() { // from class: o.beX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC9901beN.AEQbTJ(this.EZpvd, (java.util.List) obj);
                }
            }));
            EZpvd().KWHzl(this.valueOf, this.fetchVPNInfo, this.KWHzl);
            EZpvd().KWHzl().observe(this, new Application(new Function1() { // from class: o.bfi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC9901beN.OLrzqt(this.OLrzqt, (CoinInfoBean) obj);
                }
            }));
            return;
        }
        AEQbTJ().AEQbTJ().observe(this, new Application(new Function1() { // from class: o.bfl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC9901beN.AEQbTJ(this.copydefault, (C10594brR) obj);
            }
        }));
        AEQbTJ().OLrzqt().observe(this, new Application(new Function1() { // from class: o.bfk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC9901beN.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        AbstractC16320ehh abstractC16320ehh3 = this.EZpvd;
        if (abstractC16320ehh3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh3 = null;
        }
        abstractC16320ehh3.getFieldNames.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh4 = this.EZpvd;
        if (abstractC16320ehh4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh4 = null;
        }
        abstractC16320ehh4.hDKMBd.setVisibility(0);
        AbstractC16320ehh abstractC16320ehh5 = this.EZpvd;
        if (abstractC16320ehh5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh5 = null;
        }
        abstractC16320ehh5.ejfBZ.setVisibility(0);
        AbstractC16320ehh abstractC16320ehh6 = this.EZpvd;
        if (abstractC16320ehh6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh6 = null;
        }
        abstractC16320ehh6.fARcdN.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh7 = this.EZpvd;
        if (abstractC16320ehh7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh7 = null;
        }
        abstractC16320ehh7.fJNWhG.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh8 = this.EZpvd;
        if (abstractC16320ehh8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh8 = null;
        }
        abstractC16320ehh8.gEmmrt.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh9 = this.EZpvd;
        if (abstractC16320ehh9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh9 = null;
        }
        abstractC16320ehh9.gHZMYf.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh10 = this.EZpvd;
        if (abstractC16320ehh10 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh10 = null;
        }
        abstractC16320ehh10.AYXKKw.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh11 = this.EZpvd;
        if (abstractC16320ehh11 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh11 = null;
        }
        abstractC16320ehh11.sSMYrx.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh12 = this.EZpvd;
        if (abstractC16320ehh12 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh12 = null;
        }
        abstractC16320ehh12.djBIcL.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh13 = this.EZpvd;
        if (abstractC16320ehh13 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh13 = null;
        }
        abstractC16320ehh13.zuBGHE.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh14 = this.EZpvd;
        if (abstractC16320ehh14 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh14 = null;
        }
        abstractC16320ehh14.zLjUOn.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh15 = this.EZpvd;
        if (abstractC16320ehh15 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh15 = null;
        }
        abstractC16320ehh15.values.setVisibility(8);
        OLrzqt();
        AbstractC16320ehh abstractC16320ehh16 = this.EZpvd;
        if (abstractC16320ehh16 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh16 = null;
        }
        abstractC16320ehh16.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.bfo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC9901beN.fARcdN(this.OLrzqt, view);
            }
        });
        AbstractC16320ehh abstractC16320ehh17 = this.EZpvd;
        if (abstractC16320ehh17 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh17 = null;
        }
        abstractC16320ehh17.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.bfm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC9901beN.AuCTel(this.EZpvd, view);
            }
        });
        AbstractC16320ehh abstractC16320ehh18 = this.EZpvd;
        if (abstractC16320ehh18 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16320ehh = abstractC16320ehh18;
        }
        abstractC16320ehh.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.bfp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC9901beN.fJNWhG(this.copydefault, view);
            }
        });
    }

    public static final void fIwbmz(ActivityC9901beN activityC9901beN, android.view.View view) {
        activityC9901beN.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r7.gEmmrt = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(ActivityC9901beN activityC9901beN, java.util.List list) {
        if (list == null) {
            return Unit.INSTANCE;
        }
        java.util.Iterator it = list.iterator();
        C10525bqB c10525bqB = null;
        while (true) {
            if (it.hasNext()) {
                C10525bqB c10525bqB2 = (C10525bqB) it.next();
                if (c10525bqB2.AxsJAY()) {
                    if (c10525bqB2.KWHzl().AuCTel()) {
                        if (activityC9901beN.KWHzl != Long.MIN_VALUE || !c10525bqB2.KWHzl().fJNWhG().contentEquals("ETH") || !c10525bqB2.KWHzl().giSNqX() || !c10525bqB2.values().AuCTelauCTel()) {
                            break;
                        }
                        if (c10525bqB2.KWHzl().OBJEWx()) {
                            activityC9901beN.gEmmrt = c10525bqB2;
                            break;
                        }
                        c10525bqB = c10525bqB2;
                    } else {
                        activityC9901beN.gEmmrt = c10525bqB2;
                        break;
                    }
                }
            } else {
                if (c10525bqB == null) {
                    return Unit.INSTANCE;
                }
                activityC9901beN.gEmmrt = c10525bqB;
            }
        }
        activityC9901beN.copydefault = C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(list), new Function1() { // from class: o.beR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(ActivityC9901beN.AEQbTJ((C10525bqB) obj));
            }
        }), new Function1() { // from class: o.beV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC9901beN.EZpvd((C10525bqB) obj);
            }
        }));
        activityC9901beN.djBIcL();
        return Unit.INSTANCE;
    }

    public static final boolean AEQbTJ(C10525bqB c10525bqB) {
        Intrinsics.checkNotNullParameter(c10525bqB, "");
        return c10525bqB.KWHzl().DCUTEIddSDPG() && C33129mqd.OLrzqt((java.lang.CharSequence) c10525bqB.KWHzl().OLrzqt());
    }

    public static final CoinInfoAddressInfoBean EZpvd(C10525bqB c10525bqB) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(c10525bqB, "");
        C10854bwM c10854bwMKWHzl = c10525bqB.KWHzl().KWHzl();
        if (c10854bwMKWHzl == null || (strCopydefault = c10854bwMKWHzl.copydefault()) == null) {
            strCopydefault = c10525bqB.KWHzl().copydefault();
        }
        return new CoinInfoAddressInfoBean(strCopydefault, c10525bqB.KWHzl().djBIcL(), c10525bqB.KWHzl().OLrzqt(), c10525bqB.KWHzl().zuBGHE());
    }

    public static final Unit OLrzqt(final ActivityC9901beN activityC9901beN, CoinInfoBean coinInfoBean) {
        activityC9901beN.dismissLoading();
        if (coinInfoBean == null) {
            AbstractC16320ehh abstractC16320ehh = activityC9901beN.EZpvd;
            if (abstractC16320ehh == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh = null;
            }
            C55173xeu root = abstractC16320ehh.KWHzl.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh2 = activityC9901beN.EZpvd;
            if (abstractC16320ehh2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh2 = null;
            }
            abstractC16320ehh2.KWHzl.OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.beP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC9901beN.iwGUEr(this.KWHzl, view);
                }
            });
            C33134mqi.copydefault(C13754dXa.FragmentManager.OFhtUX);
            rVN.reportFullyDrawn$default((android.app.Activity) activityC9901beN, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            AbstractC16320ehh abstractC16320ehh3 = activityC9901beN.EZpvd;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            C55173xeu root2 = abstractC16320ehh3.KWHzl.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            root2.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh4 = activityC9901beN.EZpvd;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh4 = null;
            }
            abstractC16320ehh4.AkhnZx.setVisibility(0);
            activityC9901beN.KWHzl();
            activityC9901beN.EZpvd(coinInfoBean);
            activityC9901beN.KWHzl(coinInfoBean);
            activityC9901beN.copydefault(coinInfoBean);
            activityC9901beN.copydefault();
            activityC9901beN.AEQbTJ(coinInfoBean);
            activityC9901beN.OLrzqt(coinInfoBean);
            rVN.reportFullyDrawn$default((android.app.Activity) activityC9901beN, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(ActivityC9901beN activityC9901beN, android.view.View view) {
        activityC9901beN.djBIcL();
    }

    public static final Unit AEQbTJ(final ActivityC9901beN activityC9901beN, C10594brR c10594brR) {
        CoinInfoAddressInfoBean coinInfoAddressInfoBean;
        java.lang.String strValueOf;
        java.lang.String strZuBGHE;
        activityC9901beN.dismissLoading();
        java.lang.String str = "";
        if (c10594brR == null) {
            AbstractC16320ehh abstractC16320ehh = activityC9901beN.EZpvd;
            if (abstractC16320ehh == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh = null;
            }
            C55173xeu root = abstractC16320ehh.KWHzl.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh2 = activityC9901beN.EZpvd;
            if (abstractC16320ehh2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh2 = null;
            }
            abstractC16320ehh2.KWHzl.OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.bfc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC9901beN.getNewProxyInstance(this.AEQbTJ, view);
                }
            });
            C33134mqi.copydefault(C13754dXa.FragmentManager.OFhtUX);
        } else {
            AbstractC16320ehh abstractC16320ehh3 = activityC9901beN.EZpvd;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            C55173xeu root2 = abstractC16320ehh3.KWHzl.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            root2.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh4 = activityC9901beN.EZpvd;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh4 = null;
            }
            abstractC16320ehh4.AkhnZx.setVisibility(0);
        }
        activityC9901beN.AEQbTJ(c10594brR);
        if (c10594brR != null) {
            pUU.copydefault("it.coinMeta.contractAddress " + c10594brR.fetchVPNInfo().djBIcL());
            CustomChainMeta customChainMetaOLrzqt = c10594brR.fetchVPNInfo().OLrzqt();
            if (customChainMetaOLrzqt == null || (strValueOf = customChainMetaOLrzqt.valueOf()) == null) {
                strValueOf = "";
            }
            java.lang.String strDjBIcL = c10594brR.KWHzl().djBIcL();
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            java.lang.String strDjBIcL2 = c10594brR.fetchVPNInfo().djBIcL();
            C10854bwM c10854bwMKWHzl = c10594brR.KWHzl().KWHzl();
            if (c10854bwMKWHzl != null && (strZuBGHE = c10854bwMKWHzl.zuBGHE()) != null) {
                str = strZuBGHE;
            }
            coinInfoAddressInfoBean = new CoinInfoAddressInfoBean(strValueOf, strDjBIcL, strDjBIcL2, str);
        } else {
            coinInfoAddressInfoBean = null;
        }
        activityC9901beN.KWHzl(coinInfoAddressInfoBean);
        rVN.reportFullyDrawn$default(activityC9901beN, c10594brR != null, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(ActivityC9901beN activityC9901beN, android.view.View view) {
        activityC9901beN.OLrzqt();
    }

    public static final Unit AEQbTJ(ActivityC9901beN activityC9901beN, java.lang.String str) {
        activityC9901beN.dismissLoading();
        AbstractC16320ehh abstractC16320ehh = null;
        if (str == null || str.length() == 0) {
            AbstractC16320ehh abstractC16320ehh2 = activityC9901beN.EZpvd;
            if (abstractC16320ehh2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh2 = null;
            }
            abstractC16320ehh2.AuCTelauCTel.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh3 = activityC9901beN.EZpvd;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16320ehh = abstractC16320ehh3;
            }
            abstractC16320ehh.iwGUEr.setVisibility(0);
        } else {
            AbstractC16320ehh abstractC16320ehh4 = activityC9901beN.EZpvd;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh4 = null;
            }
            abstractC16320ehh4.AuCTelauCTel.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh5 = activityC9901beN.EZpvd;
            if (abstractC16320ehh5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh5 = null;
            }
            abstractC16320ehh5.iwGUEr.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh6 = activityC9901beN.EZpvd;
            if (abstractC16320ehh6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh6 = null;
            }
            abstractC16320ehh6.AuCTelauCTel.setText(C54873xYm.formatSpecificNum$default(C33129mqd.EZpvd(str), CurrencyPrependSign.CURRENCY_SIGN_NONE, null, 2, null));
        }
        return Unit.INSTANCE;
    }

    public static final void fARcdN(ActivityC9901beN activityC9901beN, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC9901beN);
        AbstractC16320ehh abstractC16320ehh = activityC9901beN.EZpvd;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        viewOnClickListenerC54939xaY.setTitle(abstractC16320ehh.uzCIH.getText());
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.GPCHlQ));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.sILrnl), new View.OnClickListener() { // from class: o.beU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC9901beN.AhwBna(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AhwBna(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AuCTel(ActivityC9901beN activityC9901beN, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC9901beN);
        AbstractC16320ehh abstractC16320ehh = activityC9901beN.EZpvd;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        viewOnClickListenerC54939xaY.setTitle(abstractC16320ehh.getNewProxyInstance.getText());
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.dbUqJD));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.sILrnl), new View.OnClickListener() { // from class: o.beS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC9901beN.isConnected(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void isConnected(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void fJNWhG(ActivityC9901beN activityC9901beN, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC9901beN);
        AbstractC16320ehh abstractC16320ehh = activityC9901beN.EZpvd;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        viewOnClickListenerC54939xaY.setTitle(abstractC16320ehh.fIwbmz.getText());
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.GLcwwN));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.sILrnl), new View.OnClickListener() { // from class: o.bfn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC9901beN.values(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void values(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt() {
        showLoading();
        AEQbTJ().EZpvd(this.fetchVPNInfo, C10953byF.KWHzl.EZpvd(this.valueOf));
    }

    public final void AEQbTJ(C10594brR c10594brR) {
        if (c10594brR != null) {
            java.lang.String strFetchVPNInfo = c10594brR.fetchVPNInfo().fetchVPNInfo();
            if (strFetchVPNInfo.length() == 0 && (strFetchVPNInfo = C9700baY.OLrzqt(java.lang.String.valueOf(C59454zhO.wlaJM(c10594brR.KWHzl().fJNWhG())))) == null) {
                strFetchVPNInfo = "";
            }
            AbstractC16320ehh abstractC16320ehh = this.EZpvd;
            AbstractC16320ehh abstractC16320ehh2 = null;
            if (abstractC16320ehh == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh = null;
            }
            C5335Nt c5335NtEZpvd = Glide.KWHzl(abstractC16320ehh.EZpvd).EZpvd(strFetchVPNInfo).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getApplicationContext()));
            AbstractC16320ehh abstractC16320ehh3 = this.EZpvd;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            c5335NtEZpvd.EZpvd(abstractC16320ehh3.EZpvd);
            AbstractC16320ehh abstractC16320ehh4 = this.EZpvd;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh4 = null;
            }
            abstractC16320ehh4.AubY.setText(c10594brR.KWHzl().fJNWhG());
            AbstractC16320ehh abstractC16320ehh5 = this.EZpvd;
            if (abstractC16320ehh5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16320ehh2 = abstractC16320ehh5;
            }
            abstractC16320ehh2.zsXlph.setText(c10594brR.KWHzl().values());
        }
    }

    public final void KWHzl(CoinInfoAddressInfoBean coinInfoAddressInfoBean) {
        AbstractC16320ehh abstractC16320ehh = null;
        if (coinInfoAddressInfoBean == null) {
            AbstractC16320ehh abstractC16320ehh2 = this.EZpvd;
            if (abstractC16320ehh2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh2 = null;
            }
            abstractC16320ehh2.AuCTel.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh3 = this.EZpvd;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            abstractC16320ehh3.fetchVPNInfo.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh4 = this.EZpvd;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh4 = null;
            }
            abstractC16320ehh4.DbNXlk.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh5 = this.EZpvd;
            if (abstractC16320ehh5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16320ehh = abstractC16320ehh5;
            }
            abstractC16320ehh.AxsJAY.setVisibility(8);
            return;
        }
        AbstractC16320ehh abstractC16320ehh6 = this.EZpvd;
        if (abstractC16320ehh6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh6 = null;
        }
        abstractC16320ehh6.DbNXlk.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh7 = this.EZpvd;
        if (abstractC16320ehh7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh7 = null;
        }
        abstractC16320ehh7.AxsJAY.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh8 = this.EZpvd;
        if (abstractC16320ehh8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh8 = null;
        }
        android.widget.LinearLayout linearLayout = abstractC16320ehh8.fetchVPNInfo;
        AbstractC16320ehh abstractC16320ehh9 = this.EZpvd;
        if (abstractC16320ehh9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16320ehh = abstractC16320ehh9;
        }
        android.widget.LinearLayout linearLayout2 = abstractC16320ehh.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout.addView(EZpvd((android.view.ViewGroup) linearLayout2, coinInfoAddressInfoBean, true));
    }

    private final void djBIcL() {
        showLoading();
        C9935bev c9935bevEZpvd = EZpvd();
        C10525bqB c10525bqB = this.gEmmrt;
        if (c10525bqB == null) {
            Intrinsics.gEmmrt("");
            c10525bqB = null;
        }
        c9935bevEZpvd.OLrzqt(c10525bqB.OLrzqt());
    }

    public final void KWHzl() {
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrCopydefault = Glide.copydefault((FragmentActivity) this);
        C10525bqB c10525bqB = this.gEmmrt;
        C10525bqB c10525bqB2 = null;
        if (c10525bqB == null) {
            Intrinsics.gEmmrt("");
            c10525bqB = null;
        }
        C5335Nt c5335NtEZpvd = componentCallbacks2C5333NrCopydefault.EZpvd(c10525bqB.KWHzl().DbNXlk()).copydefault(C52761wXj.TaskDescription.aHXSQp).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getApplicationContext()));
        AbstractC16320ehh abstractC16320ehh = this.EZpvd;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        c5335NtEZpvd.EZpvd(abstractC16320ehh.EZpvd);
        AbstractC16320ehh abstractC16320ehh2 = this.EZpvd;
        if (abstractC16320ehh2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh2 = null;
        }
        android.widget.TextView textView = abstractC16320ehh2.AubY;
        C10525bqB c10525bqB3 = this.gEmmrt;
        if (c10525bqB3 == null) {
            Intrinsics.gEmmrt("");
            c10525bqB3 = null;
        }
        textView.setText(c10525bqB3.valueOf());
        AbstractC16320ehh abstractC16320ehh3 = this.EZpvd;
        if (abstractC16320ehh3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh3 = null;
        }
        android.widget.TextView textView2 = abstractC16320ehh3.zsXlph;
        C10525bqB c10525bqB4 = this.gEmmrt;
        if (c10525bqB4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c10525bqB2 = c10525bqB4;
        }
        textView2.setText(c10525bqB2.KWHzl().gEmmrt());
    }

    private final void EZpvd(CoinInfoBean coinInfoBean) {
        AbstractC16320ehh abstractC16320ehh = this.EZpvd;
        AbstractC16320ehh abstractC16320ehh2 = null;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        abstractC16320ehh.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.beW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC9901beN.isConnected(this.AEQbTJ, view);
            }
        });
        if (coinInfoBean.getMarketCap() == null) {
            AbstractC16320ehh abstractC16320ehh3 = this.EZpvd;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            abstractC16320ehh3.getFieldNames.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh4 = this.EZpvd;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16320ehh2 = abstractC16320ehh4;
            }
            abstractC16320ehh2.hDKMBd.setVisibility(0);
            return;
        }
        AbstractC16320ehh abstractC16320ehh5 = this.EZpvd;
        if (abstractC16320ehh5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh5 = null;
        }
        abstractC16320ehh5.getFieldNames.setVisibility(0);
        AbstractC16320ehh abstractC16320ehh6 = this.EZpvd;
        if (abstractC16320ehh6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh6 = null;
        }
        abstractC16320ehh6.hDKMBd.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh7 = this.EZpvd;
        if (abstractC16320ehh7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16320ehh2 = abstractC16320ehh7;
        }
        abstractC16320ehh2.getFieldNames.setText(C54873xYm.formatLargeValue$default(C33129mqd.EZpvd(coinInfoBean.getMarketCap()), null, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, false, 27, null));
    }

    public static final void isConnected(ActivityC9901beN activityC9901beN, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC9901beN);
        AbstractC16320ehh abstractC16320ehh = activityC9901beN.EZpvd;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        viewOnClickListenerC54939xaY.setTitle(abstractC16320ehh.uzCIH.getText());
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.GPCHlQ));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.sILrnl), new View.OnClickListener() { // from class: o.beT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC9901beN.gEmmrt(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void gEmmrt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void KWHzl(CoinInfoBean coinInfoBean) {
        AbstractC16320ehh abstractC16320ehh = this.EZpvd;
        AbstractC16320ehh abstractC16320ehh2 = null;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        abstractC16320ehh.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.beQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC9901beN.ejfBZ(this.copydefault, view);
            }
        });
        if (coinInfoBean.getMaxSupply() == null) {
            AbstractC16320ehh abstractC16320ehh3 = this.EZpvd;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            abstractC16320ehh3.AuCTelauCTel.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh4 = this.EZpvd;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16320ehh2 = abstractC16320ehh4;
            }
            abstractC16320ehh2.iwGUEr.setVisibility(0);
            return;
        }
        AbstractC16320ehh abstractC16320ehh5 = this.EZpvd;
        if (abstractC16320ehh5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh5 = null;
        }
        abstractC16320ehh5.AuCTelauCTel.setVisibility(0);
        AbstractC16320ehh abstractC16320ehh6 = this.EZpvd;
        if (abstractC16320ehh6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh6 = null;
        }
        abstractC16320ehh6.iwGUEr.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh7 = this.EZpvd;
        if (abstractC16320ehh7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh7 = null;
        }
        abstractC16320ehh7.AuCTelauCTel.setText(C54873xYm.formatSpecificNum$default(C33129mqd.EZpvd(coinInfoBean.getMaxSupply()), CurrencyPrependSign.CURRENCY_SIGN_NONE, null, 2, null));
    }

    public static final void ejfBZ(ActivityC9901beN activityC9901beN, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC9901beN);
        AbstractC16320ehh abstractC16320ehh = activityC9901beN.EZpvd;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        viewOnClickListenerC54939xaY.setTitle(abstractC16320ehh.getNewProxyInstance.getText());
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.dbUqJD));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.sILrnl), new View.OnClickListener() { // from class: o.bff
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC9901beN.djBIcL(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void djBIcL(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void copydefault(CoinInfoBean coinInfoBean) {
        AbstractC16320ehh abstractC16320ehh = this.EZpvd;
        AbstractC16320ehh abstractC16320ehh2 = null;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        abstractC16320ehh.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.bfa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC9901beN.DbNXlk(this.copydefault, view);
            }
        });
        if (coinInfoBean.getCirculatingSupply() == null) {
            AbstractC16320ehh abstractC16320ehh3 = this.EZpvd;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            abstractC16320ehh3.fARcdN.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh4 = this.EZpvd;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16320ehh2 = abstractC16320ehh4;
            }
            abstractC16320ehh2.ejfBZ.setVisibility(0);
            return;
        }
        AbstractC16320ehh abstractC16320ehh5 = this.EZpvd;
        if (abstractC16320ehh5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh5 = null;
        }
        abstractC16320ehh5.fARcdN.setVisibility(0);
        AbstractC16320ehh abstractC16320ehh6 = this.EZpvd;
        if (abstractC16320ehh6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh6 = null;
        }
        abstractC16320ehh6.ejfBZ.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh7 = this.EZpvd;
        if (abstractC16320ehh7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh7 = null;
        }
        abstractC16320ehh7.fARcdN.setText(C54873xYm.formatSpecificNum$default(C33129mqd.EZpvd(coinInfoBean.getCirculatingSupply()), CurrencyPrependSign.CURRENCY_SIGN_NONE, null, 2, null));
    }

    public static final void DbNXlk(ActivityC9901beN activityC9901beN, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC9901beN);
        AbstractC16320ehh abstractC16320ehh = activityC9901beN.EZpvd;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        viewOnClickListenerC54939xaY.setTitle(abstractC16320ehh.fIwbmz.getText());
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.GLcwwN));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.sILrnl), new View.OnClickListener() { // from class: o.beY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC9901beN.AYXKKw(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AYXKKw(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void copydefault() {
        java.util.List<CoinInfoAddressInfoBean> list = this.copydefault;
        AbstractC16320ehh abstractC16320ehh = null;
        if (list == null) {
            Intrinsics.gEmmrt("");
            list = null;
        }
        if (!(!list.isEmpty())) {
            AbstractC16320ehh abstractC16320ehh2 = this.EZpvd;
            if (abstractC16320ehh2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh2 = null;
            }
            abstractC16320ehh2.AuCTel.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh3 = this.EZpvd;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            abstractC16320ehh3.fetchVPNInfo.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh4 = this.EZpvd;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh4 = null;
            }
            abstractC16320ehh4.DbNXlk.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh5 = this.EZpvd;
            if (abstractC16320ehh5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16320ehh = abstractC16320ehh5;
            }
            abstractC16320ehh.AxsJAY.setVisibility(8);
            return;
        }
        AbstractC16320ehh abstractC16320ehh6 = this.EZpvd;
        if (abstractC16320ehh6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh6 = null;
        }
        abstractC16320ehh6.AuCTel.setVisibility(0);
        AbstractC16320ehh abstractC16320ehh7 = this.EZpvd;
        if (abstractC16320ehh7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh7 = null;
        }
        abstractC16320ehh7.fetchVPNInfo.setVisibility(0);
        java.util.List<CoinInfoAddressInfoBean> list2 = this.copydefault;
        if (list2 == null) {
            Intrinsics.gEmmrt("");
            list2 = null;
        }
        if (list2.size() > 3) {
            AbstractC16320ehh abstractC16320ehh8 = this.EZpvd;
            if (abstractC16320ehh8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh8 = null;
            }
            abstractC16320ehh8.DbNXlk.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh9 = this.EZpvd;
            if (abstractC16320ehh9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh9 = null;
            }
            abstractC16320ehh9.AxsJAY.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh10 = this.EZpvd;
            if (abstractC16320ehh10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh10 = null;
            }
            abstractC16320ehh10.DbNXlk.setOnClickListener(new View.OnClickListener() { // from class: o.bfj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC9901beN.AkhnZx(this.OLrzqt, view);
                }
            });
        } else {
            AbstractC16320ehh abstractC16320ehh11 = this.EZpvd;
            if (abstractC16320ehh11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh11 = null;
            }
            abstractC16320ehh11.DbNXlk.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh12 = this.EZpvd;
            if (abstractC16320ehh12 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh12 = null;
            }
            abstractC16320ehh12.AxsJAY.setVisibility(8);
        }
        java.util.List<CoinInfoAddressInfoBean> list3 = this.copydefault;
        if (list3 == null) {
            Intrinsics.gEmmrt("");
            list3 = null;
        }
        int i = 0;
        for (java.lang.Object obj : list3) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            CoinInfoAddressInfoBean coinInfoAddressInfoBean = (CoinInfoAddressInfoBean) obj;
            AbstractC16320ehh abstractC16320ehh13 = this.EZpvd;
            if (abstractC16320ehh13 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh13 = null;
            }
            android.widget.LinearLayout linearLayout = abstractC16320ehh13.fetchVPNInfo;
            AbstractC16320ehh abstractC16320ehh14 = this.EZpvd;
            if (abstractC16320ehh14 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh14 = null;
            }
            android.widget.LinearLayout linearLayout2 = abstractC16320ehh14.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout.addView(EZpvd(linearLayout2, coinInfoAddressInfoBean, i < 3));
            i++;
        }
    }

    public static final void AkhnZx(ActivityC9901beN activityC9901beN, android.view.View view) {
        if (activityC9901beN.AYXKKw) {
            AbstractC16320ehh abstractC16320ehh = activityC9901beN.EZpvd;
            if (abstractC16320ehh == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh = null;
            }
            abstractC16320ehh.wlaJM.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OAhWiU));
            AbstractC16320ehh abstractC16320ehh2 = activityC9901beN.EZpvd;
            if (abstractC16320ehh2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh2 = null;
            }
            abstractC16320ehh2.AhwBna.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
            AbstractC16320ehh abstractC16320ehh3 = activityC9901beN.EZpvd;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            java.util.Iterator<java.lang.Integer> it = C56548yJl.AhwBna(3, abstractC16320ehh3.fetchVPNInfo.getChildCount()).iterator();
            while (it.hasNext()) {
                int iNextInt = ((AbstractC56415yEn) it).nextInt();
                AbstractC16320ehh abstractC16320ehh4 = activityC9901beN.EZpvd;
                if (abstractC16320ehh4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16320ehh4 = null;
                }
                abstractC16320ehh4.fetchVPNInfo.getChildAt(iNextInt).setVisibility(8);
            }
        } else {
            AbstractC16320ehh abstractC16320ehh5 = activityC9901beN.EZpvd;
            if (abstractC16320ehh5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh5 = null;
            }
            abstractC16320ehh5.wlaJM.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.aQtmcU));
            AbstractC16320ehh abstractC16320ehh6 = activityC9901beN.EZpvd;
            if (abstractC16320ehh6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh6 = null;
            }
            abstractC16320ehh6.AhwBna.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
            AbstractC16320ehh abstractC16320ehh7 = activityC9901beN.EZpvd;
            if (abstractC16320ehh7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh7 = null;
            }
            java.util.Iterator<java.lang.Integer> it2 = C56548yJl.AhwBna(3, abstractC16320ehh7.fetchVPNInfo.getChildCount()).iterator();
            while (it2.hasNext()) {
                int iNextInt2 = ((AbstractC56415yEn) it2).nextInt();
                AbstractC16320ehh abstractC16320ehh8 = activityC9901beN.EZpvd;
                if (abstractC16320ehh8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16320ehh8 = null;
                }
                abstractC16320ehh8.fetchVPNInfo.getChildAt(iNextInt2).setVisibility(0);
            }
        }
        activityC9901beN.AYXKKw = !activityC9901beN.AYXKKw;
    }

    private final android.view.View EZpvd(android.view.ViewGroup viewGroup, final CoinInfoAddressInfoBean coinInfoAddressInfoBean, boolean z) {
        java.lang.String strOLrzqt;
        java.lang.Character chWlaJM;
        java.lang.String string;
        android.view.View viewInflate = getLayoutInflater().inflate(C13754dXa.TaskDescription.DcMfJKgMxgjU, viewGroup, false);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinInfoAddressInfoBean.getImageUrl())) {
            strOLrzqt = coinInfoAddressInfoBean.getImageUrl();
        } else {
            java.lang.String chainName = coinInfoAddressInfoBean.getChainName();
            if (chainName == null || (chWlaJM = C59454zhO.wlaJM(chainName)) == null || (string = chWlaJM.toString()) == null || (strOLrzqt = C9700baY.OLrzqt(string)) == null) {
                strOLrzqt = "";
            }
        }
        coinInfoAddressInfoBean.setImageUrl(strOLrzqt);
        Glide.copydefault((FragmentActivity) this).EZpvd(coinInfoAddressInfoBean.getImageUrl()).copydefault(C52761wXj.TaskDescription.aHXSQp).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getApplicationContext())).EZpvd((android.widget.ImageView) viewInflate.findViewById(C13754dXa.ActionBar.ibrGus));
        ((android.widget.TextView) viewInflate.findViewById(C13754dXa.ActionBar.setOnBackInvokedDispatcher)).setText(coinInfoAddressInfoBean.getChainName());
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C13754dXa.ActionBar.onStart);
        Intrinsics.copydefault(textView);
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) coinInfoAddressInfoBean.getAddress()) ? 0 : 8);
        textView.setText(C14079deg.getAddressStr$default(C14079deg.EZpvd, coinInfoAddressInfoBean.getAddress(), false, 2, null));
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.bfb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC9901beN.OLrzqt(this.OLrzqt, coinInfoAddressInfoBean, view);
            }
        });
        android.view.View viewFindViewById = viewInflate.findViewById(C13754dXa.ActionBar.DRtzUu);
        Intrinsics.copydefault(viewFindViewById);
        viewFindViewById.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) coinInfoAddressInfoBean.getExplorerUrl()) ? 0 : 8);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: o.beZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC9901beN.copydefault(this.OLrzqt, coinInfoAddressInfoBean, view);
            }
        });
        viewInflate.setVisibility(z ? 0 : 8);
        Intrinsics.copydefault(viewInflate);
        return viewInflate;
    }

    public static final void OLrzqt(ActivityC9901beN activityC9901beN, CoinInfoAddressInfoBean coinInfoAddressInfoBean, android.view.View view) {
        java.lang.Object systemService = activityC9901beN.getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, coinInfoAddressInfoBean.getAddress()));
        C19595gIe.StateListAnimator stateListAnimator = C19595gIe.Companion;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.GQzpsZ);
        java.lang.String address = coinInfoAddressInfoBean.getAddress();
        stateListAnimator.AEQbTJ(strAYXKKw, address != null ? address : "").KWHzl(activityC9901beN);
    }

    public static final void copydefault(ActivityC9901beN activityC9901beN, CoinInfoAddressInfoBean coinInfoAddressInfoBean, android.view.View view) {
        activityC9901beN.KWHzl(coinInfoAddressInfoBean.getExplorerUrl());
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AEQbTJ(final CoinInfoBean coinInfoBean) {
        boolean z;
        boolean z2 = true;
        AbstractC16320ehh abstractC16320ehh = null;
        if (coinInfoBean.getWebsite() == null || !(!r0.isEmpty())) {
            AbstractC16320ehh abstractC16320ehh2 = this.EZpvd;
            if (abstractC16320ehh2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh2 = null;
            }
            abstractC16320ehh2.gEmmrt.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh3 = this.EZpvd;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            abstractC16320ehh3.gHZMYf.setVisibility(8);
            z = false;
        } else {
            AbstractC16320ehh abstractC16320ehh4 = this.EZpvd;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh4 = null;
            }
            abstractC16320ehh4.gEmmrt.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh5 = this.EZpvd;
            if (abstractC16320ehh5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh5 = null;
            }
            abstractC16320ehh5.gHZMYf.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh6 = this.EZpvd;
            if (abstractC16320ehh6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh6 = null;
            }
            abstractC16320ehh6.gHZMYf.setOnClickListener(new View.OnClickListener() { // from class: o.bfe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC9901beN.AEQbTJ(this.KWHzl, coinInfoBean, view);
                }
            });
            z = true;
        }
        if (coinInfoBean.getTechnicalDoc() == null || !(!r6.isEmpty())) {
            AbstractC16320ehh abstractC16320ehh7 = this.EZpvd;
            if (abstractC16320ehh7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh7 = null;
            }
            abstractC16320ehh7.AYXKKw.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh8 = this.EZpvd;
            if (abstractC16320ehh8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh8 = null;
            }
            abstractC16320ehh8.sSMYrx.setVisibility(8);
        } else {
            AbstractC16320ehh abstractC16320ehh9 = this.EZpvd;
            if (abstractC16320ehh9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh9 = null;
            }
            abstractC16320ehh9.AYXKKw.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh10 = this.EZpvd;
            if (abstractC16320ehh10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh10 = null;
            }
            abstractC16320ehh10.sSMYrx.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh11 = this.EZpvd;
            if (abstractC16320ehh11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh11 = null;
            }
            abstractC16320ehh11.sSMYrx.setOnClickListener(new View.OnClickListener() { // from class: o.bfd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC9901beN.EZpvd(this.OLrzqt, coinInfoBean, view);
                }
            });
            z = true;
        }
        C10525bqB c10525bqB = this.gEmmrt;
        if (c10525bqB == null) {
            Intrinsics.gEmmrt("");
            c10525bqB = null;
        }
        if (c10525bqB.KWHzl().AuCTel()) {
            C10525bqB c10525bqB2 = this.gEmmrt;
            if (c10525bqB2 == null) {
                Intrinsics.gEmmrt("");
                c10525bqB2 = null;
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) c10525bqB2.KWHzl().zuBGHE())) {
                AbstractC16320ehh abstractC16320ehh12 = this.EZpvd;
                if (abstractC16320ehh12 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16320ehh12 = null;
                }
                abstractC16320ehh12.djBIcL.setVisibility(0);
                AbstractC16320ehh abstractC16320ehh13 = this.EZpvd;
                if (abstractC16320ehh13 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16320ehh13 = null;
                }
                abstractC16320ehh13.zuBGHE.setVisibility(0);
                AbstractC16320ehh abstractC16320ehh14 = this.EZpvd;
                if (abstractC16320ehh14 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16320ehh14 = null;
                }
                abstractC16320ehh14.zuBGHE.setOnClickListener(new View.OnClickListener() { // from class: o.bfg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ActivityC9901beN.fetchVPNInfo(this.OLrzqt, view);
                    }
                });
            }
        } else {
            AbstractC16320ehh abstractC16320ehh15 = this.EZpvd;
            if (abstractC16320ehh15 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh15 = null;
            }
            abstractC16320ehh15.djBIcL.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh16 = this.EZpvd;
            if (abstractC16320ehh16 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh16 = null;
            }
            abstractC16320ehh16.zuBGHE.setVisibility(8);
            z2 = z;
        }
        AbstractC16320ehh abstractC16320ehh17 = this.EZpvd;
        if (abstractC16320ehh17 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16320ehh = abstractC16320ehh17;
        }
        abstractC16320ehh.fJNWhG.setVisibility(z2 ? 0 : 8);
    }

    public static final void AEQbTJ(ActivityC9901beN activityC9901beN, CoinInfoBean coinInfoBean, android.view.View view) {
        java.util.List<java.lang.String> website = coinInfoBean.getWebsite();
        Intrinsics.copydefault(website);
        activityC9901beN.KWHzl(website.get(0));
    }

    public static final void EZpvd(ActivityC9901beN activityC9901beN, CoinInfoBean coinInfoBean, android.view.View view) {
        java.util.List<java.lang.String> technicalDoc = coinInfoBean.getTechnicalDoc();
        Intrinsics.copydefault(technicalDoc);
        activityC9901beN.KWHzl(technicalDoc.get(0));
    }

    public static final void fetchVPNInfo(ActivityC9901beN activityC9901beN, android.view.View view) {
        C10525bqB c10525bqB = activityC9901beN.gEmmrt;
        if (c10525bqB == null) {
            Intrinsics.gEmmrt("");
            c10525bqB = null;
        }
        activityC9901beN.KWHzl(c10525bqB.KWHzl().zuBGHE());
    }

    private final void OLrzqt(CoinInfoBean coinInfoBean) {
        AbstractC16320ehh abstractC16320ehh = null;
        if (coinInfoBean.getSocialMedia() == null || !(!r0.isEmpty())) {
            AbstractC16320ehh abstractC16320ehh2 = this.EZpvd;
            if (abstractC16320ehh2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16320ehh = abstractC16320ehh2;
            }
            abstractC16320ehh.zLjUOn.setVisibility(8);
            return;
        }
        AbstractC16320ehh abstractC16320ehh3 = this.EZpvd;
        if (abstractC16320ehh3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh3 = null;
        }
        abstractC16320ehh3.zLjUOn.setVisibility(0);
        java.util.List<CoinInfoSocialMediaBean> socialMedia = coinInfoBean.getSocialMedia();
        Intrinsics.copydefault(socialMedia);
        for (final CoinInfoSocialMediaBean coinInfoSocialMediaBean : socialMedia) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(this);
            Glide.copydefault((FragmentActivity) this).EZpvd(coinInfoSocialMediaBean.getIcon()).KWHzl(C13754dXa.Activity.fHqPtx).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getApplicationContext())).EZpvd((android.widget.ImageView) appCompatImageView);
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: o.bfh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC9901beN.KWHzl(this.EZpvd, coinInfoSocialMediaBean, view);
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) C33052mpF.dp$default(32, (android.content.Context) null, 1, (java.lang.Object) null), (int) C33052mpF.dp$default(32, (android.content.Context) null, 1, (java.lang.Object) null));
            layoutParams.setMarginEnd((int) C33052mpF.dp$default(13, (android.content.Context) null, 1, (java.lang.Object) null));
            AbstractC16320ehh abstractC16320ehh4 = this.EZpvd;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh4 = null;
            }
            abstractC16320ehh4.values.addView(appCompatImageView, layoutParams);
        }
    }

    public static final void KWHzl(ActivityC9901beN activityC9901beN, CoinInfoSocialMediaBean coinInfoSocialMediaBean, android.view.View view) {
        activityC9901beN.KWHzl(coinInfoSocialMediaBean.getUrl());
    }

    private final void KWHzl(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return;
        }
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
