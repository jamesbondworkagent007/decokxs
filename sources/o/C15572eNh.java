package o;

import android.content.DialogInterface;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.MyLinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import com.okinc.business.defi.biz.drivers.bean.SupportCloudType;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.AAStatus;
import com.okinc.business.defi.biz.net.bean.AccountStatus;
import com.okinc.business.defi.biz.net.bean.BannerInfoNew;
import com.okinc.business.defi.biz.net.bean.InfoListNew;
import com.okinc.business.defi.biz.net.bean.MpcStatus;
import com.okinc.business.defi.biz.net.bean.NftCollection;
import com.okinc.business.defi.biz.walletconnect.WCSessionMeta;
import com.okinc.business.defi.common.HomeTabType;
import com.okinc.business.defi.common.HomeTabTypeBean;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.business.defi.wallet.home.DefiHomeContainerFragment;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$AssetsListPagerAdapter$updateTabList$1;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$attachTabLayout$2$onTabSelected$1;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$bindWalletConnectState$1$1$1;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$bindWalletConnectState$3;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$bindWalletConnectState$4$1$1;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$initKLineExpandView$3;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$initKLineExpandView$4;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$initView$11;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$initView$12;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$reportDefiHubShow$1;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$setupCryptoReads$1;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$setupCryptoReads$adapter$1$1;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$setupNftCollections$1;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$setupNftCollections$adapter$1$1;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$setupNormalAsset$1$1;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$showZeroBackup$1;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$showZeroBackup$2;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$updateWalletConnectedData$1$1;
import com.okinc.business.defi.wallet.home.WalletHomeDialogQueueManager;
import com.okinc.business.defi.wallet.home.WalletStateChecker;
import com.okinc.business.defi.wallet.home.WcConnectExtra;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.WalletPnlDataViewModel;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import com.okinc.business.defi.wallet.home.viewmodel.DefiHomeContainerViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.okuser.data.User;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.wallet.api.MpcWalletService;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC18321fgG;
import o.ActivityC18691fnF;
import o.ActivityC18750foL;
import o.C10407bnq;
import o.C10614brl;
import o.C12827cuN;
import o.C13754dXa;
import o.C14445dlb;
import o.C15519eLi;
import o.C15572eNh;
import o.C18072fbW;
import o.C18136fch;
import o.C52761wXj;
import o.C9694baS;
import o.InterfaceC13980dcn;
import o.InterfaceC18129fca;
import o.InterfaceC18271ffJ;
import o.InterfaceC54828xWv;
import o.dTK;
import o.eLJ;
import o.eSW;
import o.eTW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eNh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15572eNh extends AbstractC32998moE implements InterfaceC54851xXr, InterfaceC54853xXt {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final int AEQbTJ;
    public final eZZ AYXKKw;
    public C16885esP AhwBna;
    public final int[] AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final java.lang.Runnable AuCTelauCTel;
    public final InterfaceC56387yDm AubY;
    public final InterfaceC56387yDm AwvSrB;
    public final InterfaceC56387yDm AxsJAY;
    public boolean AxsJAYaxsJAY;
    public boolean AxsJAYsNCnLh;
    public ColorStateList DAIeex;
    public boolean DCJXGO;
    public boolean DTwDnp;
    public boolean DXXBbs;
    public InterfaceC58217yxC DarRvM;
    public final C32991mny<java.lang.Integer> DbNXlk;
    public final java.lang.String KWHzl;
    public eUI ODWQjV;
    public boolean ORxRYg;
    public boolean OcIXYQ;
    public final InterfaceC56387yDm OqFWZa;
    public boolean QKVWgx;
    public int QKudOq;
    public boolean QOLQEE;
    public final InterfaceC56387yDm QUSxYX;
    public java.lang.String QVAiDq;
    public boolean QbewEr;
    public boolean QfsBiF;
    public boolean RJOkX;
    public java.lang.Object RcXXUw;
    public final Function1<AbstractC12782ctV, Unit> aKErDB;
    public final MessageQueue.IdleHandler accept;
    public final int copydefault;
    public java.lang.Float dNCPSb;
    public final int djBIcL;
    public AbstractC32996moC djSkpj;
    public AbstractC32996moC dvKsVJ;
    public long ejfBZ;
    public java.util.List<? extends AbstractC12782ctV> fARcdN;
    public boolean fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public AbstractC32996moC fZBcTu;
    public final InterfaceC56387yDm fetchVPNInfo;
    public AbstractC32996moC finit;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm gGvvIC;
    public boolean gHZMYf;
    public final InterfaceC56387yDm gasjUx;
    public HomeTabType getFieldNames;
    public C16592emo getNewProxyInstance;
    public final InterfaceC56387yDm getPostValueLengthLimit;
    public AbstractC32996moC giSNqX;
    public final InterfaceC56387yDm gkJEwt;
    public int hDKMBd;
    public C16973ety hUfVAv;
    public C16972etx iRxXKY;
    public final MessageQueue.IdleHandler iZzfmt;
    public eSW isConnected;
    public final InterfaceC56387yDm iwGUEr;
    public boolean sSMYrx;
    public long uzCIH;
    public int valueOf;
    public final int[] values;
    public final WalletHomeDialogQueueManager wlaJM;
    public final FragmentManager zLjUOn;
    public final android.os.Handler zsXlph;
    public boolean zuBGHE;
    public final InterfaceC56387yDm zuWLRA;
    public java.lang.String OLrzqt = "DefiHomeFragmentNew";
    public final int UeEOUB = C13754dXa.TaskDescription.gwwfep;
    public final InterfaceC56387yDm fvQaOB = C56392yDr.copydefault(new Function0() { // from class: o.eNS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15572eNh.DbNXlk();
        }
    });
    public final InterfaceC56387yDm dxcTrN = C56392yDr.copydefault(new Function0() { // from class: o.eOe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15572eNh.AhwBna();
        }
    });
    public final InterfaceC56387yDm flVtFt = C56392yDr.copydefault(new Function0() { // from class: o.eOi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15572eNh.isConnected();
        }
    });
    public final InterfaceC56387yDm fFgQHt = C56392yDr.copydefault(new Function0() { // from class: o.eOg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15572eNh.djBIcL();
        }
    });
    public final InterfaceC56387yDm ffGIBT = C56392yDr.copydefault(new Function0() { // from class: o.eOh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15572eNh.DarRvM(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm RlQdEF = C56392yDr.copydefault(new Function0() { // from class: o.eOj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15572eNh.ODWQjV(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.eNh$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletStateChecker.WalletState.values().length];
            try {
                iArr[WalletStateChecker.WalletState.NOT_BACKED_UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletStateChecker.WalletState.ZERO_ASSETS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[SupportCloudType.values().length];
            try {
                iArr2[SupportCloudType.GOOGLE_CLOUD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[SupportCloudType.HUAWEI_CLOUD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[SupportCloudType.BOTH_CLOUD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX INFO: renamed from: o.eNh$ApplicationInfo */
    public static final class ApplicationInfo implements InterfaceC33014moU {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC33014moU
        public void onRefreshCompleted(java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
        }
    }

    /* JADX INFO: renamed from: o.eNh$IntentFilter */
    public static final class IntentFilter implements InterfaceC33014moU {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC33014moU
        public void onRefreshCompleted(java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
        }
    }

    /* JADX INFO: renamed from: o.eNh$IntentSender */
    public static final class IntentSender implements InterfaceC33014moU {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC33014moU
        public void onRefreshCompleted(java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
        }
    }

    /* JADX INFO: renamed from: o.eNh$PackageManager */
    public static final /* synthetic */ class PackageManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PackageManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.eNh$ServiceConnection */
    public static final class ServiceConnection implements InterfaceC33014moU {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC33014moU
        public void onRefreshCompleted(java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
        }
    }

    /* JADX INFO: renamed from: o.eNh$SharedPreferences */
    public static final class SharedPreferences implements InterfaceC33014moU {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC33014moU
        public void onRefreshCompleted(java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AxsJAYaxsJAY() {
        this.DCJXGO = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fIwbmz() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fvQaOB() {
        this.DCJXGO = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gHZMYf() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNewProxyInstance() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public java.lang.String getTAG() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletHomeDialogQueueManager wlaJM() {
        return this.wlaJM;
    }

    /* JADX INFO: renamed from: o.eNh$Configuration */
    public static final class Configuration implements View.OnClickListener {
        public final /* synthetic */ C15572eNh EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Configuration(android.view.View view, long j, C15572eNh c15572eNh) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c15572eNh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ePI epiUzCIH = this.EZpvd.uzCIH();
                if (epiUzCIH != null) {
                    epiUzCIH.fJNWhG();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.eNh$ContentResolver */
    public static final class ContentResolver implements View.OnClickListener {
        public final /* synthetic */ C15572eNh EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContentResolver(android.view.View view, long j, C15572eNh c15572eNh) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c15572eNh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            AbstractC12784ctX abstractC12784ctXGwTjWJ;
            java.lang.String strEZpvd;
            android.content.Context context;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                eUI eui = null;
                C32866mlf.onEvent$default("Web3Onboarding_Sheet_BackupMethod_Click", (TrackChannel[]) null, ComponentName.KWHzl, 1, (java.lang.Object) null);
                WalletStateChecker walletStateChecker = WalletStateChecker.AEQbTJ;
                DefiHomeContainerViewModel fieldNames = this.EZpvd.getFieldNames();
                eUI eui2 = this.EZpvd.ODWQjV;
                if (eui2 == null) {
                    Intrinsics.gEmmrt("");
                    eui2 = null;
                }
                if (walletStateChecker.copydefault(fieldNames, eui2) == WalletStateChecker.WalletState.NOT_BACKED_UP) {
                    C14494dmX.KWHzl.EZpvd("backup_manually");
                }
                eUI eui3 = this.EZpvd.ODWQjV;
                if (eui3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    eui = eui3;
                }
                AbstractC12782ctV value = eui.fARcdN().getValue();
                if (value == null || (abstractC12784ctXGwTjWJ = value.gwTjWJ()) == null || (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) == null || (context = this.EZpvd.getContext()) == null) {
                    return;
                }
                this.EZpvd.AEQbTJ(context, strEZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.eNh$Context */
    public static final class Context implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C15572eNh KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Context(android.view.View view, long j, C15572eNh c15572eNh) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c15572eNh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            AbstractC12784ctX abstractC12784ctXGwTjWJ;
            java.lang.String strEZpvd;
            android.content.Context context;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                eUI eui = null;
                C32866mlf.onEvent$default("Web3Onboarding_Sheet_BackupMethod_Click", (TrackChannel[]) null, AssistContent.AEQbTJ, 1, (java.lang.Object) null);
                WalletStateChecker walletStateChecker = WalletStateChecker.AEQbTJ;
                DefiHomeContainerViewModel fieldNames = this.KWHzl.getFieldNames();
                eUI eui2 = this.KWHzl.ODWQjV;
                if (eui2 == null) {
                    Intrinsics.gEmmrt("");
                    eui2 = null;
                }
                if (walletStateChecker.copydefault(fieldNames, eui2) == WalletStateChecker.WalletState.NOT_BACKED_UP) {
                    C14494dmX.KWHzl.EZpvd("backup_cloud");
                }
                eUI eui3 = this.KWHzl.ODWQjV;
                if (eui3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    eui = eui3;
                }
                AbstractC12782ctV value = eui.fARcdN().getValue();
                if (value == null || (abstractC12784ctXGwTjWJ = value.gwTjWJ()) == null || (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) == null || (context = this.KWHzl.getContext()) == null) {
                    return;
                }
                if (value.AEQbTJ(WalletType.MPCWallet) || value.ORxRYg()) {
                    ActivityC18321fgG.StateListAnimator.startActivity$default(ActivityC18321fgG.Companion, context, value.DbNXlk(), false, 4, null);
                    return;
                }
                int i = Application.EZpvd[this.KWHzl.QKVWgx().ordinal()];
                if (i == 1) {
                    C15538eMa c15538eMa = C15538eMa.OLrzqt;
                    FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
                    Intrinsics.copydefault(fragmentActivityRequireActivity, "");
                    AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivityRequireActivity;
                    androidx.fragment.app.FragmentManager parentFragmentManager = this.KWHzl.getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                    C15538eMa.handleClickGoogleCloudBackup$default(c15538eMa, strEZpvd, abstractActivityC33041mov, parentFragmentManager, false, SharedElementCallback.EZpvd, this.KWHzl.new TaskStackBuilder(context, strEZpvd), 8, null);
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eTW.TaskDescription.newInstance$default(eTW.Companion, strEZpvd, 1, false, ClipData.OLrzqt, ComponentCallbacks2.AEQbTJ, this.KWHzl.new ComponentCallbacks(context, strEZpvd), 4, null).show(this.KWHzl.getChildFragmentManager(), "SelectCloudBackupDialogFragment");
                    return;
                }
                C15538eMa c15538eMa2 = C15538eMa.OLrzqt;
                FragmentActivity fragmentActivityRequireActivity2 = this.KWHzl.requireActivity();
                Intrinsics.copydefault(fragmentActivityRequireActivity2, "");
                AbstractActivityC33041mov abstractActivityC33041mov2 = (AbstractActivityC33041mov) fragmentActivityRequireActivity2;
                androidx.fragment.app.FragmentManager parentFragmentManager2 = this.KWHzl.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "");
                c15538eMa2.copydefault(strEZpvd, abstractActivityC33041mov2, parentFragmentManager2, VoiceInteractor.KWHzl, this.KWHzl.new BroadcastReceiver(context, strEZpvd));
            }
        }
    }

    /* JADX INFO: renamed from: o.eNh$ContextWrapper */
    public static final class ContextWrapper implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C15572eNh OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContextWrapper(android.view.View view, long j, C15572eNh c15572eNh) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c15572eNh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ePI epiUzCIH = this.OLrzqt.uzCIH();
                if (epiUzCIH != null) {
                    epiUzCIH.fIwbmz();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.eNh$DialogInterface */
    public static final class DialogInterface implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C15572eNh OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DialogInterface(android.view.View view, long j, C15572eNh c15572eNh) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c15572eNh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                WalletStateChecker walletStateChecker = WalletStateChecker.AEQbTJ;
                DefiHomeContainerViewModel fieldNames = this.OLrzqt.getFieldNames();
                eUI eui = this.OLrzqt.ODWQjV;
                if (eui == null) {
                    Intrinsics.gEmmrt("");
                    eui = null;
                }
                if (walletStateChecker.copydefault(fieldNames, eui) == WalletStateChecker.WalletState.NOT_BACKED_UP) {
                    C14494dmX.KWHzl.EZpvd("view_networks");
                }
                java.util.List<C10854bwM> listDjBIcL = C10954byG.EZpvd.valueOf().djBIcL();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
                for (C10854bwM c10854bwM : listDjBIcL) {
                    arrayList.add(new DefiOnboardingTile.TokenGroupTile.TokenInfo(c10854bwM.djBIcL(), c10854bwM.copydefault()));
                }
                C18120fcR c18120fcREZpvd = C18120fcR.Companion.EZpvd(arrayList, C13754dXa.FragmentManager.RXdAnZ);
                androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c18120fcREZpvd.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.eNh$Intent */
    public static final class Intent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C15572eNh OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Intent(android.view.View view, long j, C15572eNh c15572eNh) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c15572eNh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ePI epiUzCIH = this.OLrzqt.uzCIH();
                if (epiUzCIH != null) {
                    epiUzCIH.fIwbmz();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.eNh$PictureInPictureParams */
    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C15572eNh EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, C15572eNh c15572eNh) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c15572eNh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                FragmentActivity activity = this.EZpvd.getActivity();
                if (activity != null) {
                    C9694baS.Application application = C9694baS.Companion;
                    C15572eNh c15572eNh = this.EZpvd;
                    application.KWHzl(c15572eNh, ActivityC9955bfO.Companion.AEQbTJ(activity, c15572eNh.ejfBZ), this.EZpvd.new LoaderManager());
                }
            }
        }
    }

    public C15572eNh() {
        final Function0 function0 = null;
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DefiHomeContainerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.QUSxYX = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18275ffN.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$activityViewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$activityViewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.AwvSrB = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18304ffq.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.wlaJM = new WalletHomeDialogQueueManager();
        this.zuWLRA = C56392yDr.copydefault(new Function0() { // from class: o.eOl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15572eNh.AkhnZx();
            }
        });
        this.OqFWZa = C56392yDr.copydefault(new Function0() { // from class: o.eOm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15572eNh.OqFWZa(this.copydefault);
            }
        });
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18028faf.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$activityViewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$activityViewModels$default$8
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0() { // from class: o.eOk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15572eNh.fvQaOB(this.OLrzqt);
            }
        });
        this.getPostValueLengthLimit = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletPnlDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$activityViewModels$default$10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$activityViewModels$default$11
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$activityViewModels$default$12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.DAIeex = new ColorStateList();
        this.iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.eOp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15572eNh.gGvvIC(this.copydefault);
            }
        });
        this.QKudOq = -1;
        this.DTwDnp = true;
        this.RcXXUw = new java.lang.Object();
        this.AubY = C56392yDr.copydefault(new Function0() { // from class: o.eNP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15572eNh.iZzfmt(this.KWHzl);
            }
        });
        Function0 function03 = new Function0() { // from class: o.eNV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15572eNh.giSNqX(this.copydefault);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18035fam.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$9
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
                Function0 function05 = function0;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function03);
        Function0 function05 = new Function0() { // from class: o.eNW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15572eNh.AxsJAYaxsJAY(this.OLrzqt);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function06 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function06.invoke();
            }
        });
        this.gkJEwt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18142fcn.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$13
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$14
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
                Function0 function07 = function0;
                if (function07 != null && (creationExtras = (CreationExtras) function07.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function05);
        Function0 function07 = new Function0() { // from class: o.eNX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15572eNh.hUfVAv(this.EZpvd);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function08 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$16
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd4 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$17
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function08.invoke();
            }
        });
        this.AxsJAY = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18093fbr.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$18
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd4).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$19
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
                Function0 function09 = function0;
                if (function09 != null && (creationExtras = (CreationExtras) function09.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function07);
        this.gasjUx = C56392yDr.copydefault(new Function0() { // from class: o.eNU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15572eNh.values();
            }
        });
        this.gGvvIC = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18060fbK.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$activityViewModels$default$13
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$activityViewModels$default$14
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
                Function0 function09 = function0;
                if (function09 != null && (creationExtras = (CreationExtras) function09.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0() { // from class: o.eNY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15572eNh.gkJEwt(this.OLrzqt);
            }
        });
        final Function0<androidx.fragment.app.Fragment> function09 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$21
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd5 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$22
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function09.invoke();
            }
        });
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19300fyg.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$23
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd5).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$24
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
                Function0 function010 = function0;
                if (function010 != null && (creationExtras = (CreationExtras) function010.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd5);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$special$$inlined$viewModels$default$25
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd5);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.iZzfmt = new MessageQueue.IdleHandler() { // from class: o.eOa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return C15572eNh.AxsJAYsNCnLh(this.KWHzl);
            }
        };
        this.accept = new MessageQueue.IdleHandler() { // from class: o.eOd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return C15572eNh.DAIeex(this.copydefault);
            }
        };
        this.KWHzl = "wallet_current_state_key";
        this.AEQbTJ = 1;
        this.copydefault = 2;
        this.zsXlph = new android.os.Handler(android.os.Looper.getMainLooper());
        this.AuCTelauCTel = new java.lang.Runnable() { // from class: o.eOc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C15572eNh.flVtFt(this.EZpvd);
            }
        };
        this.aKErDB = new Function1() { // from class: o.eOb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.isConnected(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        };
        this.hDKMBd = -1;
        this.values = new int[2];
        this.ejfBZ = Long.MIN_VALUE;
        this.uzCIH = Long.MIN_VALUE;
        this.zuBGHE = true;
        this.DbNXlk = new C32991mny<>(new Function1() { // from class: o.eOf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.KWHzl(this.EZpvd, (java.lang.Integer) obj);
            }
        });
        this.AYXKKw = new eZY(null, null, null, 7, null);
        this.zLjUOn = new FragmentManager();
        this.AkhnZx = new int[2];
    }

    /* JADX INFO: renamed from: o.eNh$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eNh.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<InterfaceC9773bbs> RlQdEF() {
        return (java.util.List) this.fvQaOB.getValue();
    }

    public static final java.util.List DbNXlk() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
    }

    public final java.util.List<xWA> sSMYrx() {
        return (java.util.List) this.dxcTrN.getValue();
    }

    public static final java.util.List AhwBna() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(xWA.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<InterfaceC9774bbt> AxsJAYsNCnLh() {
        return (java.util.List) this.flVtFt.getValue();
    }

    public static final java.util.List isConnected() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9774bbt.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<InterfaceC9772bbr> QKudOq() {
        return (java.util.List) this.fFgQHt.getValue();
    }

    public static final java.util.List djBIcL() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9772bbr.class));
    }

    public final C18351fgk QVAiDq() {
        return (C18351fgk) this.ffGIBT.getValue();
    }

    public static final C18351fgk DarRvM(C15572eNh c15572eNh) {
        FragmentActivity fragmentActivityRequireActivity = c15572eNh.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (C18351fgk) new ViewModelProvider(fragmentActivityRequireActivity).get(C18351fgk.class);
    }

    public final C18270ffI OcIXYQ() {
        return (C18270ffI) this.RlQdEF.getValue();
    }

    public static final C18270ffI ODWQjV(C15572eNh c15572eNh) {
        FragmentActivity fragmentActivityRequireActivity = c15572eNh.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (C18270ffI) new ViewModelProvider(fragmentActivityRequireActivity).get(C18270ffI.class);
    }

    public final DefiHomeContainerViewModel getFieldNames() {
        return (DefiHomeContainerViewModel) this.AuCTel.getValue();
    }

    public final C18275ffN zuBGHE() {
        return (C18275ffN) this.QUSxYX.getValue();
    }

    public final C18304ffq AubY() {
        return (C18304ffq) this.AwvSrB.getValue();
    }

    public final ePI uzCIH() {
        androidx.fragment.app.Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(C13754dXa.ActionBar.Rdrawable);
        if (fragmentFindFragmentById instanceof ePI) {
            return (ePI) fragmentFindFragmentById;
        }
        return null;
    }

    public final ePI zsXlph() {
        androidx.fragment.app.Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(C13754dXa.ActionBar.Rstyleable);
        if (fragmentFindFragmentById instanceof ePI) {
            return (ePI) fragmentFindFragmentById;
        }
        return null;
    }

    public static final C13934dbu AkhnZx() {
        return new C13934dbu();
    }

    private final C13934dbu DXXBbs() {
        return (C13934dbu) this.zuWLRA.getValue();
    }

    public final SupportCloudType QKVWgx() {
        return (SupportCloudType) this.OqFWZa.getValue();
    }

    public static final SupportCloudType OqFWZa(C15572eNh c15572eNh) {
        C15538eMa c15538eMa = C15538eMa.OLrzqt;
        android.content.Context contextRequireContext = c15572eNh.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return c15538eMa.EZpvd(contextRequireContext);
    }

    public final C18028faf AuCTel() {
        return (C18028faf) this.fetchVPNInfo.getValue();
    }

    public static final ViewModelProvider.Factory fvQaOB(C15572eNh c15572eNh) {
        return new C18031fai(c15572eNh.DXXBbs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletPnlDataViewModel DCJXGO() {
        return (WalletPnlDataViewModel) this.getPostValueLengthLimit.getValue();
    }

    /* JADX INFO: renamed from: o.eNh$ColorStateList */
    public static final class ColorStateList extends ViewPager2.OnPageChangeCallback {
        public ColorStateList() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            C16592emo c16592emo = C15572eNh.this.getNewProxyInstance;
            if (c16592emo == null) {
                Intrinsics.gEmmrt("");
                c16592emo = null;
            }
            RecyclerView.Adapter adapter = c16592emo.OLrzqt.getAdapter();
            ActionBar actionBar = adapter instanceof ActionBar ? (ActionBar) adapter : null;
            if (actionBar != null) {
                C16592emo c16592emo2 = C15572eNh.this.getNewProxyInstance;
                if (c16592emo2 == null) {
                    Intrinsics.gEmmrt("");
                    c16592emo2 = null;
                }
                ConstraintLayout root = c16592emo2.KWHzl.getRoot();
                HomeTabTypeBean homeTabTypeBeanCopydefault = actionBar.copydefault(i);
                root.setVisibility((homeTabTypeBeanCopydefault != null ? homeTabTypeBeanCopydefault.getType() : null) == HomeTabType.TYPE_WALLET ? 0 : 4);
            }
            C16592emo c16592emo3 = C15572eNh.this.getNewProxyInstance;
            if (c16592emo3 == null) {
                Intrinsics.gEmmrt("");
                c16592emo3 = null;
            }
            RecyclerView.Adapter adapter2 = c16592emo3.OLrzqt.getAdapter();
            if ((adapter2 instanceof ActionBar ? (ActionBar) adapter2 : null) != null) {
                C15572eNh c15572eNh = C15572eNh.this;
                if (i == c15572eNh.QKudOq) {
                    InterfaceC25427iwX interfaceC25427iwXAuCTelauCTel = c15572eNh.AuCTelauCTel();
                    if (interfaceC25427iwXAuCTelauCTel != null) {
                        interfaceC25427iwXAuCTelauCTel.AEQbTJ();
                        return;
                    }
                    return;
                }
                InterfaceC25427iwX interfaceC25427iwXAuCTelauCTel2 = c15572eNh.AuCTelauCTel();
                if (interfaceC25427iwXAuCTelauCTel2 != null) {
                    interfaceC25427iwXAuCTelauCTel2.EZpvd();
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
            C16592emo c16592emo = C15572eNh.this.getNewProxyInstance;
            C16592emo c16592emo2 = null;
            if (c16592emo == null) {
                Intrinsics.gEmmrt("");
                c16592emo = null;
            }
            RecyclerView.Adapter adapter = c16592emo.OLrzqt.getAdapter();
            ActionBar actionBar = adapter instanceof ActionBar ? (ActionBar) adapter : null;
            if (actionBar != null) {
                C15572eNh c15572eNh = C15572eNh.this;
                HomeTabTypeBean homeTabTypeBeanCopydefault = actionBar.copydefault(i);
                if ((homeTabTypeBeanCopydefault != null ? homeTabTypeBeanCopydefault.getType() : null) == HomeTabType.TYPE_WALLET) {
                    C16592emo c16592emo3 = c15572eNh.getNewProxyInstance;
                    if (c16592emo3 == null) {
                        Intrinsics.gEmmrt("");
                        c16592emo3 = null;
                    }
                    c16592emo3.KWHzl.getRoot().setVisibility(0);
                    C16592emo c16592emo4 = c15572eNh.getNewProxyInstance;
                    if (c16592emo4 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c16592emo2 = c16592emo4;
                    }
                    c16592emo2.KWHzl.getRoot().setTranslationX(-i2);
                }
            }
        }
    }

    public final InterfaceC25427iwX AuCTelauCTel() {
        return (InterfaceC25427iwX) this.iwGUEr.getValue();
    }

    public static final InterfaceC25427iwX gGvvIC(C15572eNh c15572eNh) {
        try {
            InterfaceC25426iwW interfaceC25426iwW = (InterfaceC25426iwW) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25426iwW.class));
            if (interfaceC25426iwW != null) {
                android.content.Context contextRequireContext = c15572eNh.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                return interfaceC25426iwW.AEQbTJ(contextRequireContext);
            }
        } catch (java.lang.Exception e) {
            pUU.EZpvd(c15572eNh.getTAG(), "HomeTabSelectIconService not available, tab select icon feature disabled: " + e.getMessage());
        }
        return null;
    }

    public final C18192fdk zLjUOn() {
        return (C18192fdk) this.AubY.getValue();
    }

    public static final C18192fdk iZzfmt(C15572eNh c15572eNh) {
        return new C18192fdk(c15572eNh.DXXBbs());
    }

    public final C18035fam hDKMBd() {
        return (C18035fam) this.fJNWhG.getValue();
    }

    public static final ViewModelProvider.Factory giSNqX(C15572eNh c15572eNh) {
        return new C18040far(c15572eNh.zLjUOn());
    }

    public final C18142fcn ORxRYg() {
        return (C18142fcn) this.gkJEwt.getValue();
    }

    public static final ViewModelProvider.Factory AxsJAYaxsJAY(C15572eNh c15572eNh) {
        return new C18144fcp(c15572eNh.zLjUOn());
    }

    public final C18093fbr AxsJAY() {
        return (C18093fbr) this.AxsJAY.getValue();
    }

    public static final ViewModelProvider.Factory hUfVAv(C15572eNh c15572eNh) {
        return new C18089fbn(c15572eNh.zLjUOn());
    }

    public final eSA AwvSrB() {
        return (eSA) this.gasjUx.getValue();
    }

    public static final eSA values() {
        return new eSA();
    }

    private final C18060fbK accept() {
        return (C18060fbK) this.gGvvIC.getValue();
    }

    public static final C18060fbK AEQbTJ(C15572eNh c15572eNh, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C18060fbK(c15572eNh.DXXBbs());
    }

    public final C19300fyg ejfBZ() {
        return (C19300fyg) this.gEmmrt.getValue();
    }

    public static final boolean AxsJAYsNCnLh(C15572eNh c15572eNh) {
        c15572eNh.QUSxYX();
        return false;
    }

    public static final boolean DAIeex(C15572eNh c15572eNh) {
        c15572eNh.QUSxYX();
        return false;
    }

    public final WalletConnectUtils QfsBiF() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return C13458dMb.EZpvd(contextRequireContext).zuBGHE();
    }

    public final C16058eck QOLQEE() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return C13458dMb.EZpvd(contextRequireContext).wlaJM();
    }

    public final C15935eaT DTwDnp() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return C13458dMb.EZpvd(contextRequireContext).fJNWhG();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        fFgQHt();
        android.os.Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: o.eNy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return C15572eNh.RlQdEF(this.AEQbTJ);
            }
        });
    }

    public static final boolean RlQdEF(C15572eNh c15572eNh) {
        eUI eui = c15572eNh.ODWQjV;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        eui.valueOf();
        return false;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C16592emo c16592emoCopydefault = C16592emo.copydefault(getLayoutInflater(), viewGroup, false);
        this.getNewProxyInstance = c16592emoCopydefault;
        if (c16592emoCopydefault == null) {
            Intrinsics.gEmmrt("");
            c16592emoCopydefault = null;
        }
        ConstraintLayout root = c16592emoCopydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public final void valueOf(java.lang.String str) {
        C16592emo c16592emo = this.getNewProxyInstance;
        if (c16592emo == null) {
            Intrinsics.gEmmrt("");
            c16592emo = null;
        }
        LottieAnimationView lottieAnimationView = c16592emo.DbNXlk;
        lottieAnimationView.setAnimation(str);
        lottieAnimationView.playAnimation();
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setVisibility(0);
        Intrinsics.copydefault(lottieAnimationView);
        EZpvd(lottieAnimationView);
    }

    /* JADX INFO: renamed from: o.eNh$TaskDescription */
    public static final class TaskDescription extends android.animation.AnimatorListenerAdapter {
        public boolean EZpvd;
        public long OLrzqt;

        public TaskDescription() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            super.onAnimationStart(animator);
            this.EZpvd = true;
            this.OLrzqt = java.lang.System.currentTimeMillis();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            super.onAnimationEnd(animator);
            if (this.EZpvd) {
                this.EZpvd = false;
                C15572eNh.this.AubY().copydefault(C15572eNh.this.getTAG(), java.lang.System.currentTimeMillis() - this.OLrzqt);
            }
        }
    }

    public final void EZpvd(LottieAnimationView lottieAnimationView) {
        lottieAnimationView.addAnimatorListener(new TaskDescription());
    }

    public final void fARcdN() {
        C16592emo c16592emo = this.getNewProxyInstance;
        if (c16592emo == null) {
            Intrinsics.gEmmrt("");
            c16592emo = null;
        }
        LottieAnimationView lottieAnimationView = c16592emo.DbNXlk;
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.pauseAnimation();
        lottieAnimationView.cancelAnimation();
    }

    public static final void flVtFt(C15572eNh c15572eNh) {
        C18275ffN.fetchKLineState$default(c15572eNh.zuBGHE(), InterfaceC18271ffJ.Application.EZpvd, null, 2, null);
    }

    public final int iwGUEr() {
        java.lang.Integer num = SPUtils.getInt(this.KWHzl, this.djBIcL);
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final void EZpvd(int i) {
        SPUtils.put(this.KWHzl, java.lang.Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(int i) {
        android.view.View rootView;
        boolean zOLrzqt = C33492mxV.OLrzqt();
        if (i == this.djBIcL) {
            if (zOLrzqt) {
                return "no_asset_dark.lottie";
            }
            return "no_asset_light.lottie";
        }
        if (i != this.AEQbTJ) {
            return zOLrzqt ? "no_backup_dark.lottie" : "no_backup_light.lottie";
        }
        if (zuBGHE().AYXKKw().getValue().booleanValue()) {
            C16592emo c16592emo = this.getNewProxyInstance;
            if (c16592emo == null) {
                Intrinsics.gEmmrt("");
                c16592emo = null;
            }
            LottieAnimationView lottieAnimationView = c16592emo.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
            if (lottieAnimationView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    android.graphics.Rect rect = new android.graphics.Rect();
                    android.view.View view = getView();
                    if (view != null && (rootView = view.getRootView()) != null) {
                        rootView.getWindowVisibleDisplayFrame(rect);
                    }
                    layoutParams2.height = rect.height();
                    layoutParams2.topMargin = C55298xhM.dpInt$default(70, (android.content.Context) null, 1, (java.lang.Object) null);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
            return zOLrzqt ? "have_asset_kline_expand_dark.lottie" : "have_asset_kline_expand_light.lottie";
        }
        if (zOLrzqt) {
        }
    }

    public static final Unit isConnected(C15572eNh c15572eNh, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        ePI epiUzCIH = c15572eNh.uzCIH();
        if (epiUzCIH != null) {
            epiUzCIH.fetchVPNInfo(abstractC12782ctV);
        }
        ePI epiZsXlph = c15572eNh.zsXlph();
        if (epiZsXlph == null) {
            return null;
        }
        epiZsXlph.fetchVPNInfo(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        pUU.EZpvd("defiHome", "initView " + this);
        if (!getFieldNames().djBIcL()) {
            valueOf(AEQbTJ(iwGUEr()));
        }
        refreshDataForZeroAssetsHomepage$default(this, false, 1, null);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        this.ODWQjV = (eUI) new ViewModelProvider(fragmentActivityRequireActivity).get(eUI.class);
        accept().djBIcL();
        UeEOUB();
        refreshData$default(this, "initView", true, true, null, 8, null);
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C14445dlb.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        Lifecycle.Event event = Lifecycle.Event.ON_DESTROY;
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXKWHzl, this, event);
        final java.lang.Object obj = this.RcXXUw;
        abstractC58185ywXOLrzqt.subscribe(new RxBus.EventCallback<C14445dlb>(obj) { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$initView$1
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C14445dlb c14445dlb) {
                InterfaceC18129fca interfaceC18129fcaEZpvd = C18072fbW.EZpvd(this.this$0);
                if (interfaceC18129fcaEZpvd != null) {
                    C18072fbW.EZpvd(interfaceC18129fcaEZpvd, true);
                }
                if (c14445dlb != null) {
                    C15572eNh c15572eNh = this.this$0;
                    String strEZpvd = c14445dlb.EZpvd();
                    if (strEZpvd != null) {
                        c15572eNh.OLrzqt(strEZpvd);
                    }
                }
            }
        });
        eUI eui = this.ODWQjV;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        eui.AkhnZx().observe(getViewLifecycleOwner(), new PackageManager(new Function1() { // from class: o.eOs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C15572eNh.valueOf(this.AEQbTJ, (java.lang.String) obj2);
            }
        }));
        C16592emo c16592emo = this.getNewProxyInstance;
        if (c16592emo == null) {
            Intrinsics.gEmmrt("");
            c16592emo = null;
        }
        c16592emo.fJNWhG.OLrzqt(new InterfaceC57903yrG() { // from class: o.eOu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C15572eNh.AEQbTJ(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        AuCTel().EZpvd();
        fetchVPNInfo();
        eUI eui2 = this.ODWQjV;
        if (eui2 == null) {
            Intrinsics.gEmmrt("");
            eui2 = null;
        }
        eui2.fARcdN().observe(getViewLifecycleOwner(), new PackageManager(new Function1() { // from class: o.eOv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C15572eNh.fetchVPNInfo(this.copydefault, (AbstractC12782ctV) obj2);
            }
        }));
        aKErDB();
        AbstractC58185ywX abstractC58185ywXKWHzl2 = RxBus.KWHzl(xXS.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl2, this);
        final Function1 function1 = new Function1() { // from class: o.eOA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C15572eNh.copydefault(this.OLrzqt, (xXS) obj2);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eOC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                C15572eNh.getNewProxyInstance(function1, obj2);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("NFT_AIRDROP_CLAIM_SUCCEED");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function12 = new Function1() { // from class: o.eOz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C15572eNh.AhwBna(this.copydefault, (java.lang.String) obj2);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eOy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                C15572eNh.getFieldNames(function12, obj2);
            }
        });
        eSA.refreshAllMpcWallet$default(AwvSrB(), this, null, 2, null);
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("ev_account_login");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt2 = C58156yvv.OLrzqt(C58156yvv.EZpvd(abstractC58185ywXAEQbTJ2, this), this, event);
        final Function1 function13 = new Function1() { // from class: o.eOE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C15572eNh.AEQbTJ((java.lang.String) obj2);
            }
        };
        abstractC58185ywXOLrzqt2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eOH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                C15572eNh.uzCIH(function13, obj2);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ3 = RxBus.AEQbTJ("ev_account_change");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ3, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt3 = C58156yvv.OLrzqt(C58156yvv.EZpvd(abstractC58185ywXAEQbTJ3, this), this, event);
        final Function1 function14 = new Function1() { // from class: o.eOG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C15572eNh.djBIcL(this.OLrzqt, (java.lang.String) obj2);
            }
        };
        abstractC58185ywXOLrzqt3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eOo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                C15572eNh.wlaJM(function14, obj2);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ4 = RxBus.AEQbTJ("eventRefreshAssetOnVisible");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ4, "");
        AbstractC58185ywX abstractC58185ywXEZpvd3 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ4, this);
        final Function1 function15 = new Function1() { // from class: o.eOx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C15572eNh.gEmmrt(this.AEQbTJ, (java.lang.String) obj2);
            }
        };
        abstractC58185ywXEZpvd3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eOt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                C15572eNh.zLjUOn(function15, obj2);
            }
        });
        OcIXYQ().KWHzl().observe(getViewLifecycleOwner(), new PackageManager(new Function1() { // from class: o.eOw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C15572eNh.AhwBna(this.AEQbTJ, (java.lang.Integer) obj2);
            }
        }));
        dNCPSb();
        RJOkX();
        C16592emo c16592emo2 = this.getNewProxyInstance;
        if (c16592emo2 == null) {
            Intrinsics.gEmmrt("");
            c16592emo2 = null;
        }
        c16592emo2.valueOf.getRoot().setBackgroundResource(C13754dXa.Activity.DCUTEIddSDPG);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiHomeFragmentNew$initView$11(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeFragmentNew$initView$12(this, null), 3, null);
    }

    public static final Unit valueOf(C15572eNh c15572eNh, java.lang.String str) {
        eUI eui = c15572eNh.ODWQjV;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        eUI.requestAllHomeData$default(eui, "homeDataError", null, false, true, false, false, null, true, false, null, 818, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(final C15572eNh c15572eNh, InterfaceC57934yrl interfaceC57934yrl) {
        eUI eui;
        InterfaceC9774bbt interfaceC9774bbt;
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        java.util.List<InterfaceC9774bbt> listAxsJAYsNCnLh = c15572eNh.AxsJAYsNCnLh();
        if (listAxsJAYsNCnLh != null && (interfaceC9774bbt = (InterfaceC9774bbt) CollectionsKt___CollectionsKt.firstOrNull(listAxsJAYsNCnLh)) != null) {
            interfaceC9774bbt.OLrzqt(true);
        }
        eUI eui2 = c15572eNh.ODWQjV;
        if (eui2 == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        } else {
            eui = eui2;
        }
        eUI.requestAllHomeData$default(eui, "swapRefresh", null, false, false, false, false, null, true, true, new Function0() { // from class: o.eOL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15572eNh.iRxXKY(this.KWHzl);
            }
        }, 118, null);
        AbstractC32996moC abstractC32996moC = c15572eNh.giSNqX;
        if (abstractC32996moC != null && abstractC32996moC.isAdded()) {
            C16592emo c16592emo = c15572eNh.getNewProxyInstance;
            if (c16592emo == null) {
                Intrinsics.gEmmrt("");
                c16592emo = null;
            }
            RecyclerView.Adapter adapter = c16592emo.OLrzqt.getAdapter();
            ActionBar actionBar = adapter instanceof ActionBar ? (ActionBar) adapter : null;
            AbstractC32996moC abstractC32996moC2 = c15572eNh.giSNqX;
            if (abstractC32996moC2 != null) {
                if (actionBar != null) {
                    int iOLrzqt = actionBar.OLrzqt(HomeTabType.TYPE_NFT);
                    C16592emo c16592emo2 = c15572eNh.getNewProxyInstance;
                    if (c16592emo2 == null) {
                        Intrinsics.gEmmrt("");
                        c16592emo2 = null;
                    }
                    boolean z = iOLrzqt == c16592emo2.OLrzqt.getCurrentItem();
                    abstractC32996moC2.onRefresh(java.lang.Boolean.valueOf(z), new ServiceConnection());
                }
            }
        }
        AbstractC32996moC abstractC32996moC3 = c15572eNh.djSkpj;
        if (abstractC32996moC3 != null && abstractC32996moC3.isAdded()) {
            C16592emo c16592emo3 = c15572eNh.getNewProxyInstance;
            if (c16592emo3 == null) {
                Intrinsics.gEmmrt("");
                c16592emo3 = null;
            }
            RecyclerView.Adapter adapter2 = c16592emo3.OLrzqt.getAdapter();
            ActionBar actionBar2 = adapter2 instanceof ActionBar ? (ActionBar) adapter2 : null;
            AbstractC32996moC abstractC32996moC4 = c15572eNh.djSkpj;
            if (abstractC32996moC4 != null) {
                if (actionBar2 != null) {
                    int iOLrzqt2 = actionBar2.OLrzqt(HomeTabType.TYPE_DAPP);
                    C16592emo c16592emo4 = c15572eNh.getNewProxyInstance;
                    if (c16592emo4 == null) {
                        Intrinsics.gEmmrt("");
                        c16592emo4 = null;
                    }
                    boolean z2 = iOLrzqt2 == c16592emo4.OLrzqt.getCurrentItem();
                    abstractC32996moC4.onRefresh(java.lang.Boolean.valueOf(z2), new ApplicationInfo());
                }
            }
        }
        AbstractC32996moC abstractC32996moC5 = c15572eNh.dvKsVJ;
        if (abstractC32996moC5 != null && abstractC32996moC5.isAdded()) {
            C16592emo c16592emo5 = c15572eNh.getNewProxyInstance;
            if (c16592emo5 == null) {
                Intrinsics.gEmmrt("");
                c16592emo5 = null;
            }
            RecyclerView.Adapter adapter3 = c16592emo5.OLrzqt.getAdapter();
            ActionBar actionBar3 = adapter3 instanceof ActionBar ? (ActionBar) adapter3 : null;
            AbstractC32996moC abstractC32996moC6 = c15572eNh.dvKsVJ;
            if (abstractC32996moC6 != null) {
                if (actionBar3 != null) {
                    int iOLrzqt3 = actionBar3.OLrzqt(HomeTabType.TYPE_DEFI);
                    C16592emo c16592emo6 = c15572eNh.getNewProxyInstance;
                    if (c16592emo6 == null) {
                        Intrinsics.gEmmrt("");
                        c16592emo6 = null;
                    }
                    boolean z3 = iOLrzqt3 == c16592emo6.OLrzqt.getCurrentItem();
                    abstractC32996moC6.onRefresh(java.lang.Boolean.valueOf(z3), new IntentSender());
                }
            }
        }
        AbstractC32996moC abstractC32996moC7 = c15572eNh.finit;
        if (abstractC32996moC7 != null && abstractC32996moC7.isAdded()) {
            C16592emo c16592emo7 = c15572eNh.getNewProxyInstance;
            if (c16592emo7 == null) {
                Intrinsics.gEmmrt("");
                c16592emo7 = null;
            }
            RecyclerView.Adapter adapter4 = c16592emo7.OLrzqt.getAdapter();
            ActionBar actionBar4 = adapter4 instanceof ActionBar ? (ActionBar) adapter4 : null;
            AbstractC32996moC abstractC32996moC8 = c15572eNh.finit;
            if (abstractC32996moC8 != null) {
                if (actionBar4 != null) {
                    int iOLrzqt4 = actionBar4.OLrzqt(HomeTabType.TYPE_DEX_STRATEGY);
                    C16592emo c16592emo8 = c15572eNh.getNewProxyInstance;
                    if (c16592emo8 == null) {
                        Intrinsics.gEmmrt("");
                        c16592emo8 = null;
                    }
                    boolean z4 = iOLrzqt4 == c16592emo8.OLrzqt.getCurrentItem();
                    abstractC32996moC8.onRefresh(java.lang.Boolean.valueOf(z4), new SharedPreferences());
                }
            }
        }
        AbstractC32996moC abstractC32996moC9 = c15572eNh.fZBcTu;
        if (abstractC32996moC9 != null && abstractC32996moC9.isAdded()) {
            C16592emo c16592emo9 = c15572eNh.getNewProxyInstance;
            if (c16592emo9 == null) {
                Intrinsics.gEmmrt("");
                c16592emo9 = null;
            }
            RecyclerView.Adapter adapter5 = c16592emo9.OLrzqt.getAdapter();
            ActionBar actionBar5 = adapter5 instanceof ActionBar ? (ActionBar) adapter5 : null;
            AbstractC32996moC abstractC32996moC10 = c15572eNh.fZBcTu;
            if (abstractC32996moC10 != null) {
                if (actionBar5 != null) {
                    int iOLrzqt5 = actionBar5.OLrzqt(HomeTabType.TYPE_DEX_ORDERS);
                    C16592emo c16592emo10 = c15572eNh.getNewProxyInstance;
                    if (c16592emo10 == null) {
                        Intrinsics.gEmmrt("");
                        c16592emo10 = null;
                    }
                    boolean z5 = iOLrzqt5 == c16592emo10.OLrzqt.getCurrentItem();
                    abstractC32996moC10.onRefresh(java.lang.Boolean.valueOf(z5), new IntentFilter());
                }
            }
        }
        c15572eNh.AuCTel().EZpvd();
        C18275ffN.fetchKLineState$default(c15572eNh.zuBGHE(), InterfaceC18271ffJ.Application.EZpvd, null, 2, null);
        c15572eNh.DCJXGO().AhwBna();
    }

    public static final Unit iRxXKY(C15572eNh c15572eNh) {
        AbstractC32996moC abstractC32996moC;
        InterfaceC9774bbt interfaceC9774bbt;
        C16592emo c16592emo = c15572eNh.getNewProxyInstance;
        if (c16592emo == null) {
            Intrinsics.gEmmrt("");
            c16592emo = null;
        }
        c16592emo.fJNWhG.AEQbTJ();
        java.util.List<InterfaceC9774bbt> listAxsJAYsNCnLh = c15572eNh.AxsJAYsNCnLh();
        if (listAxsJAYsNCnLh != null && (interfaceC9774bbt = (InterfaceC9774bbt) CollectionsKt___CollectionsKt.firstOrNull(listAxsJAYsNCnLh)) != null) {
            interfaceC9774bbt.OLrzqt(false);
        }
        AbstractC32996moC abstractC32996moC2 = c15572eNh.dvKsVJ;
        if (abstractC32996moC2 != null && abstractC32996moC2.isAdded() && (abstractC32996moC = c15572eNh.dvKsVJ) != null) {
            abstractC32996moC.onRefreshCompleted(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C15572eNh c15572eNh, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strDbNXlk;
        java.util.List<ChainAddress> listValueOf;
        ChainAddress chainAddress;
        java.util.List<ChainAddress> listValueOf2;
        java.util.List<ChainAddress> listValueOf3;
        c15572eNh.AxsJAYaxsJAY = false;
        java.lang.String str = "";
        eUI eui = null;
        if (abstractC12782ctV != null) {
            java.lang.String strDbNXlk2 = abstractC12782ctV.DbNXlk();
            eUI eui2 = c15572eNh.ODWQjV;
            if (eui2 == null) {
                Intrinsics.gEmmrt("");
                eui2 = null;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) strDbNXlk2, (java.lang.Object) eui2.DbNXlk())) {
                C15519eLi.Application.getInstance$default(C15519eLi.Companion, null, null, null, 7, null).OLrzqt(abstractC12782ctV);
                c15572eNh.copydefault(abstractC12782ctV);
                c15572eNh.gEmmrt(abstractC12782ctV);
                eUI eui3 = c15572eNh.ODWQjV;
                if (eui3 == null) {
                    Intrinsics.gEmmrt("");
                    eui3 = null;
                }
                eui3.AEQbTJ("observeMainWallet", abstractC12782ctV, c15572eNh.DCJXGO().copydefault().getValue());
                c15572eNh.djBIcL(abstractC12782ctV);
            }
        }
        if (abstractC12782ctV != null && (listValueOf3 = abstractC12782ctV.valueOf()) != null && C33129mqd.AEQbTJ(java.lang.Integer.valueOf(listValueOf3.size()), 1)) {
            c15572eNh.fvQaOB();
            eUI eui4 = c15572eNh.ODWQjV;
            if (eui4 == null) {
                Intrinsics.gEmmrt("");
                eui4 = null;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) eui4.DbNXlk(), (java.lang.Object) abstractC12782ctV.DbNXlk())) {
                c15572eNh.AEQbTJ(Long.MIN_VALUE, Long.MIN_VALUE, true, true, "observeMainWallet");
                eUI eui5 = c15572eNh.ODWQjV;
                if (eui5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    eui = eui5;
                }
                eui.OLrzqt(abstractC12782ctV.DbNXlk());
            }
        } else {
            if (abstractC12782ctV != null && (listValueOf2 = abstractC12782ctV.valueOf()) != null && (!listValueOf2.isEmpty())) {
                c15572eNh.AxsJAYaxsJAY();
            }
            eUI eui6 = c15572eNh.ODWQjV;
            if (eui6 == null) {
                Intrinsics.gEmmrt("");
                eui6 = null;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) eui6.DbNXlk(), (java.lang.Object) (abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null))) {
                long jFlVtFt = abstractC12782ctV != null ? abstractC12782ctV.flVtFt() : 0L;
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl((abstractC12782ctV == null || (listValueOf = abstractC12782ctV.valueOf()) == null || (chainAddress = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(listValueOf)) == null) ? 0L : chainAddress.getCoinId());
                c15572eNh.AEQbTJ(jFlVtFt, c10854bwMKWHzl != null ? c10854bwMKWHzl.fetchVPNInfo() : 0L, true, true, "observeMainWallet");
                eUI eui7 = c15572eNh.ODWQjV;
                if (eui7 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    eui = eui7;
                }
                if (abstractC12782ctV != null && (strDbNXlk = abstractC12782ctV.DbNXlk()) != null) {
                    str = strDbNXlk;
                }
                eui.OLrzqt(str);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C15572eNh c15572eNh, xXS xxs) {
        c15572eNh.zsXlph.removeCallbacks(c15572eNh.AuCTelauCTel);
        c15572eNh.zsXlph.postDelayed(c15572eNh.AuCTelauCTel, 5000L);
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(C15572eNh c15572eNh, java.lang.String str) {
        refreshData$default(c15572eNh, "claim nft", false, true, null, 8, null);
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).aR_().invoke(java.lang.Boolean.TRUE);
        ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).KWHzl(new Function1() { // from class: o.eOK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z) {
        return Unit.INSTANCE;
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(C15572eNh c15572eNh, java.lang.String str) {
        C16592emo c16592emo = c15572eNh.getNewProxyInstance;
        if (c16592emo == null) {
            Intrinsics.gEmmrt("");
            c16592emo = null;
        }
        c16592emo.getRoot().post(new java.lang.Runnable() { // from class: o.eOD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C15572eNh.AYXKKw();
            }
        });
        ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).aR_().invoke(java.lang.Boolean.TRUE);
        ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).KWHzl(new Function1() { // from class: o.eOF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.KWHzl(((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AYXKKw() {
        C55326xho.toast$default(C33069mpW.copydefault(C13754dXa.FragmentManager.setOnKeyListener, C56423yEv.EZpvd(C56390yDp.OLrzqt("acctname", dZP.OLrzqt.AhwBna()))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    public static final Unit KWHzl(boolean z) {
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(C15572eNh c15572eNh, java.lang.String str) {
        C10856bwO.copydefault(c15572eNh.getTAG(), 0, "receive refresh asset on visible");
        c15572eNh.AxsJAYaxsJAY = true;
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C15572eNh c15572eNh, java.lang.Integer num) {
        if (num == null) {
            return Unit.INSTANCE;
        }
        C16592emo c16592emo = c15572eNh.getNewProxyInstance;
        if (c16592emo == null) {
            Intrinsics.gEmmrt("");
            c16592emo = null;
        }
        ViewPager2 viewPager2 = c16592emo.OLrzqt;
        C16592emo c16592emo2 = c15572eNh.getNewProxyInstance;
        if (c16592emo2 == null) {
            Intrinsics.gEmmrt("");
            c16592emo2 = null;
        }
        int paddingLeft = c16592emo2.OLrzqt.getPaddingLeft();
        C16592emo c16592emo3 = c15572eNh.getNewProxyInstance;
        if (c16592emo3 == null) {
            Intrinsics.gEmmrt("");
            c16592emo3 = null;
        }
        int paddingTop = c16592emo3.OLrzqt.getPaddingTop();
        C16592emo c16592emo4 = c15572eNh.getNewProxyInstance;
        if (c16592emo4 == null) {
            Intrinsics.gEmmrt("");
            c16592emo4 = null;
        }
        viewPager2.setPadding(paddingLeft, paddingTop, c16592emo4.OLrzqt.getPaddingRight(), num.intValue() == 0 ? C55298xhM.dp2px$default(52.0f, null, 1, null) : 0);
        return Unit.INSTANCE;
    }

    public final void djBIcL(AbstractC12782ctV abstractC12782ctV) {
        dTK dtkEZpvd = C17922fXg.EZpvd(abstractC12782ctV);
        if (!(dtkEZpvd instanceof dTK.ActionBar) || this.DXXBbs) {
            return;
        }
        try {
            fWY fwyAEQbTJ = fWY.Companion.AEQbTJ(abstractC12782ctV.DbNXlk(), dtkEZpvd instanceof dTK.StateListAnimator ? 3 : 2);
            fwyAEQbTJ.setOnDismissListener(new Dialog());
            fwyAEQbTJ.show(getChildFragmentManager(), "SASwitchTipSheet");
            this.DXXBbs = true;
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "show SASwitchTipSheet error: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: o.eNh$Dialog */
    public static final class Dialog implements DialogInterface.OnDismissListener {
        public Dialog() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            C15572eNh.this.DXXBbs = false;
        }
    }

    public final void dNCPSb() {
        zuBGHE().AEQbTJ((AbstractC12782ctV) null, "initKLineExpandView");
        DCJXGO().EZpvd();
        C16592emo c16592emo = this.getNewProxyInstance;
        if (c16592emo == null) {
            Intrinsics.gEmmrt("");
            c16592emo = null;
        }
        android.widget.FrameLayout frameLayout = c16592emo.AYXKKw.EZpvd;
        frameLayout.setOnClickListener(new ContextWrapper(frameLayout, 1000L, this));
        C16592emo c16592emo2 = this.getNewProxyInstance;
        if (c16592emo2 == null) {
            Intrinsics.gEmmrt("");
            c16592emo2 = null;
        }
        android.widget.FrameLayout root = c16592emo2.valueOf.getRoot();
        root.setOnClickListener(new Intent(root, 1000L, this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeFragmentNew$initKLineExpandView$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeFragmentNew$initKLineExpandView$4(this, null), 3, null);
    }

    public final void RJOkX() {
        C16592emo c16592emo = this.getNewProxyInstance;
        if (c16592emo == null) {
            Intrinsics.gEmmrt("");
            c16592emo = null;
        }
        C17090ewI c17090ewI = c16592emo.KWHzl;
        AppCompatTextView appCompatTextView = c17090ewI.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C19604gIn.KWHzl(appCompatTextView, 16, (28 & 2) != 0 ? 0 : C52761wXj.TaskDescription.sCB, (28 & 4) != 0 ? 0 : 0, (28 & 8) != 0 ? 0 : 0, (28 & 16) != 0 ? 0 : 0);
        AppCompatTextView appCompatTextView2 = c17090ewI.EZpvd;
        appCompatTextView2.setOnClickListener(new PictureInPictureParams(appCompatTextView2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.eNh$LoaderManager */
    public static final class LoaderManager implements Function2<java.lang.Integer, android.content.Intent, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.lang.Integer num, android.content.Intent intent) {
            AEQbTJ(num.intValue(), intent);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(int i, android.content.Intent intent) {
            C15572eNh.this.zsXlph.removeCallbacks(C15572eNh.this.AuCTelauCTel);
            C15572eNh.this.zsXlph.postDelayed(C15572eNh.this.AuCTelauCTel, 5000L);
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    public final void EZpvd(java.lang.String str, boolean z, boolean z2) {
        CoordinatorLayout.LayoutParams layoutParams;
        C16592emo c16592emo = this.getNewProxyInstance;
        if (c16592emo == null) {
            Intrinsics.gEmmrt("");
            c16592emo = null;
        }
        if (z && z2) {
            if (c16592emo.AYXKKw.getRoot().getVisibility() != 0) {
                c16592emo.AEQbTJ.setExpanded(true, true);
            }
            c16592emo.isConnected.setNeedLimitScroll(true);
            c16592emo.fetchVPNInfo.setNestedScrollingEnabled(false);
            c16592emo.fetchVPNInfo.setNeedLimitScroll(true);
            c16592emo.AYXKKw.getRoot().setVisibility(0);
            c16592emo.valueOf.getRoot().setVisibility(4);
            c16592emo.AhwBna.setVisibility(4);
            finit();
            flVtFt();
            C16592emo c16592emo2 = this.getNewProxyInstance;
            if (c16592emo2 == null) {
                Intrinsics.gEmmrt("");
                c16592emo2 = null;
            }
            c16592emo2.fARcdN.getRoot().setVisibility(8);
            C15764eUk c15764eUk = c16592emo.fetchVPNInfo;
            ViewGroup.LayoutParams layoutParams2 = c15764eUk.getLayoutParams();
            AppBarLayout.LayoutParams layoutParams3 = layoutParams2 instanceof AppBarLayout.LayoutParams ? (AppBarLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams3 != null) {
                ((LinearLayout.LayoutParams) layoutParams3).width = -1;
                ((LinearLayout.LayoutParams) layoutParams3).height = -1;
                c15764eUk.setLayoutParams(layoutParams3);
            }
            AppBarLayout appBarLayout = c16592emo.AEQbTJ;
            ViewGroup.LayoutParams layoutParams4 = appBarLayout.getLayoutParams();
            layoutParams = layoutParams4 instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams4 : null;
            if (layoutParams == null) {
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = -1;
            appBarLayout.setLayoutParams(layoutParams);
            return;
        }
        c16592emo.isConnected.setNeedLimitScroll(false);
        c16592emo.fetchVPNInfo.setNestedScrollingEnabled(true);
        c16592emo.fetchVPNInfo.setNeedLimitScroll(false);
        c16592emo.AYXKKw.getRoot().setVisibility(8);
        c16592emo.valueOf.getRoot().setVisibility(4);
        c16592emo.AhwBna.setVisibility(4);
        finit();
        flVtFt();
        C16592emo c16592emo3 = this.getNewProxyInstance;
        if (c16592emo3 == null) {
            Intrinsics.gEmmrt("");
            c16592emo3 = null;
        }
        ConstraintLayout root = c16592emo3.fARcdN.getRoot();
        java.lang.Integer value = OcIXYQ().KWHzl().getValue();
        root.setVisibility(value != null ? value.intValue() : 8);
        C15764eUk c15764eUk2 = c16592emo.fetchVPNInfo;
        ViewGroup.LayoutParams layoutParams5 = c15764eUk2.getLayoutParams();
        AppBarLayout.LayoutParams layoutParams6 = layoutParams5 instanceof AppBarLayout.LayoutParams ? (AppBarLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 != null) {
            ((LinearLayout.LayoutParams) layoutParams6).width = -1;
            ((LinearLayout.LayoutParams) layoutParams6).height = -2;
            c15764eUk2.setLayoutParams(layoutParams6);
        }
        AppBarLayout appBarLayout2 = c16592emo.AEQbTJ;
        ViewGroup.LayoutParams layoutParams7 = appBarLayout2.getLayoutParams();
        layoutParams = layoutParams7 instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams == null) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
        appBarLayout2.setLayoutParams(layoutParams);
    }

    public final boolean RcXXUw() {
        WalletPnlDataViewModel walletPnlDataViewModelDCJXGO = DCJXGO();
        eUI eui = this.ODWQjV;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        return walletPnlDataViewModelDCJXGO.AEQbTJ(eui.fARcdN().getValue(), this.uzCIH, this.ejfBZ);
    }

    public static final void valueOf(C15572eNh c15572eNh, boolean z) {
        int i = z ? 0 : 8;
        c15572eNh.OcIXYQ().KWHzl().setValue(java.lang.Integer.valueOf(i));
        C16592emo c16592emo = c15572eNh.getNewProxyInstance;
        C16592emo c16592emo2 = null;
        if (c16592emo == null) {
            Intrinsics.gEmmrt("");
            c16592emo = null;
        }
        ConstraintLayout root = c16592emo.fARcdN.getRoot();
        C16592emo c16592emo3 = c15572eNh.getNewProxyInstance;
        if (c16592emo3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16592emo2 = c16592emo3;
        }
        ConstraintLayout root2 = c16592emo2.AYXKKw.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        root.setVisibility(root2.getVisibility() != 0 ? i : 8);
    }

    public final void fetchVPNInfo() {
        QVAiDq().copydefault().observe(getViewLifecycleOwner(), new PackageManager(new Function1() { // from class: o.eNu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.djBIcL(this.OLrzqt, (java.lang.Integer) obj);
            }
        }));
        OcIXYQ().KWHzl().observe(getViewLifecycleOwner(), new PackageManager(new Function1() { // from class: o.eNw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.valueOf(this.OLrzqt, (java.lang.Integer) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeFragmentNew$bindWalletConnectState$3(this, null), 3, null);
        QVAiDq().AhwBna().observe(getViewLifecycleOwner(), new PackageManager(new Function1() { // from class: o.eNv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.OLrzqt(this.KWHzl, (C18343fgc) obj);
            }
        }));
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(final C15572eNh c15572eNh, java.lang.Integer num) {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.eNN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.djBIcL(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eNM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15572eNh.AkhnZx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eNQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eNT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15572eNh.fARcdN(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C15572eNh c15572eNh, AbstractC12782ctV abstractC12782ctV) {
        LifecycleOwner viewLifecycleOwner = c15572eNh.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiHomeFragmentNew$bindWalletConnectState$1$1$1(c15572eNh, abstractC12782ctV, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(final C15572eNh c15572eNh, java.lang.Integer num) {
        if (num == null) {
            return Unit.INSTANCE;
        }
        C16592emo c16592emo = null;
        if (num.intValue() == 0) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
            final Function1 function1 = new Function1() { // from class: o.eNp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15572eNh.AhwBna(this.copydefault, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eNq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15572eNh.fIwbmz(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.eNs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15572eNh.EZpvd((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eNt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15572eNh.AuCTel(function12, obj);
                }
            });
        }
        C16592emo c16592emo2 = c15572eNh.getNewProxyInstance;
        if (c16592emo2 == null) {
            Intrinsics.gEmmrt("");
            c16592emo2 = null;
        }
        ConstraintLayout root = c16592emo2.fARcdN.getRoot();
        C16592emo c16592emo3 = c15572eNh.getNewProxyInstance;
        if (c16592emo3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16592emo = c16592emo3;
        }
        ConstraintLayout root2 = c16592emo.AYXKKw.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        root.setVisibility(root2.getVisibility() == 0 ? 8 : num.intValue());
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C15572eNh c15572eNh, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.copydefault(abstractC12782ctV);
        c15572eNh.AhwBna(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final C15572eNh c15572eNh, C18343fgc c18343fgc) {
        if (c18343fgc == null) {
            return Unit.INSTANCE;
        }
        c15572eNh.QVAiDq().AhwBna().setValue(null);
        final java.lang.String strKWHzl = c18343fgc.KWHzl();
        final WcConnectExtra wcConnectExtraOLrzqt = c18343fgc.OLrzqt();
        C11607cUn.subscribeOnIO$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false), (Function1) null, new Function1() { // from class: o.eNH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.OLrzqt(this.copydefault, strKWHzl, wcConnectExtraOLrzqt, (AbstractC12782ctV) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C15572eNh c15572eNh, java.lang.String str, WcConnectExtra wcConnectExtra, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (abstractC12782ctV.zLjUOn()) {
            InterfaceC13980dcn interfaceC13980dcnFARcdN = c15572eNh.QfsBiF().fARcdN(str);
            pUU.KWHzl(c15572eNh.getTAG(), "validateWCUri result: " + interfaceC13980dcnFARcdN);
            if (interfaceC13980dcnFARcdN instanceof InterfaceC13980dcn.Application) {
                if (c15572eNh.QfsBiF().values(str)) {
                    c15572eNh.KWHzl(str);
                } else if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                    LifecycleOwner viewLifecycleOwner = c15572eNh.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiHomeFragmentNew$bindWalletConnectState$4$1$1(c15572eNh, str, wcConnectExtra, null), 3, null);
                }
            } else if (!(interfaceC13980dcnFARcdN instanceof InterfaceC13980dcn.Activity) && !(interfaceC13980dcnFARcdN instanceof InterfaceC13980dcn.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            C55326xho.toast$default(C13754dXa.FragmentManager.dbwnZN, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, 0, 3, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna(AbstractC12782ctV abstractC12782ctV) {
        C16592emo c16592emo = this.getNewProxyInstance;
        if (c16592emo == null) {
            Intrinsics.gEmmrt("");
            c16592emo = null;
        }
        C16749epm c16749epm = c16592emo.fARcdN;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiHomeFragmentNew$updateWalletConnectedData$1$1(this, abstractC12782ctV, c16749epm, null), 3, null);
    }

    public static /* synthetic */ void showWalletConnectFragment$default(C15572eNh c15572eNh, java.lang.Integer num, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        c15572eNh.KWHzl(num, i, str, str2);
    }

    public final void KWHzl(java.lang.Integer num, int i, java.lang.String str, java.lang.String str2) {
        C18355fgo c18355fgo = C18355fgo.KWHzl;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        c18355fgo.EZpvd(activity, num != null ? num.intValue() : 0, i, str == null ? "" : str, str2 == null ? "" : str2);
    }

    public final void EZpvd(@NotNull WalletSelectedChainBean walletSelectedChainBean) {
        Intrinsics.checkNotNullParameter(walletSelectedChainBean, "");
        notifyChainSet$default(this, C33129mqd.valueOf(walletSelectedChainBean.getChainId()), C33129mqd.valueOf(walletSelectedChainBean.getGeneralChainId()), false, false, "onNetworkSelected", 12, null);
        C14494dmX c14494dmX = C14494dmX.KWHzl;
        C14494dmX.trackHomePageIntroSlideUpClick$default(c14494dmX, "select_network", c14494dmX.KWHzl(this.ejfBZ), null, 4, null);
    }

    public final void aKErDB() {
        ejfBZ().EZpvd().observe(this, new Observer() { // from class: o.eNL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C15572eNh.KWHzl(this.KWHzl, (AAStatus) obj);
            }
        });
    }

    public static final void KWHzl(C15572eNh c15572eNh, AAStatus aAStatus) {
        if (aAStatus == null) {
            return;
        }
        fPH fph = fPH.OLrzqt;
        android.content.Context contextRequireContext = c15572eNh.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        fPH.showOwnerCheckFailedDialog$default(fph, contextRequireContext, aAStatus, 0, null, 8, null);
    }

    public final void copydefault(AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV.getFieldNames()) {
            WalletType walletType = WalletType.MPCWallet;
            if (!(abstractC12782ctV.AEQbTJ(walletType) && abstractC12782ctV.Dmq()) && abstractC12782ctV.AEQbTJ(walletType)) {
                return;
            }
            C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
            C19300fyg.homeCheckAAOwner$default(ejfBZ(), abstractC12782ctV.DbNXlk(), abstractC12782ctV.EZpvd(c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L), null, 4, null);
        }
    }

    private final void gEmmrt(final AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
            eSA esaAwvSrB = AwvSrB();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(esaAwvSrB.AEQbTJ(abstractC12782ctV, fragmentActivityRequireActivity), this);
            final Function1 function1 = new Function1() { // from class: o.eNx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15572eNh.OLrzqt(this.KWHzl, abstractC12782ctV, (kotlin.Pair) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eNA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15572eNh.hDKMBd(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.eNB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15572eNh.EZpvd(abstractC12782ctV, this, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eNC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15572eNh.iwGUEr(function12, obj);
                }
            });
        }
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C15572eNh c15572eNh, AbstractC12782ctV abstractC12782ctV, kotlin.Pair pair) {
        java.lang.Object obj;
        FragmentActivity activity;
        java.lang.String uid;
        if (((java.lang.Number) pair.getFirst()).intValue() != 1 || ((java.lang.Number) pair.getSecond()).intValue() != AccountStatus.Normal.getValue()) {
            eSA esaAwvSrB = c15572eNh.AwvSrB();
            int iIntValue = ((java.lang.Number) pair.getFirst()).intValue();
            int iIntValue2 = ((java.lang.Number) pair.getSecond()).intValue();
            FragmentActivity fragmentActivityRequireActivity = c15572eNh.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            eSA.judgyDialog$default(esaAwvSrB, iIntValue, iIntValue2, abstractC12782ctV, fragmentActivityRequireActivity, 0, null, 48, null);
        } else {
            java.util.Iterator<T> it = dZP.OLrzqt.copydefault().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.String uid2 = ((User) next).getUid();
                MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
                if (Intrinsics.EZpvd(uid2, mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getUid() : null)) {
                    obj = next;
                    break;
                }
            }
            if (((User) obj) == null && (activity = c15572eNh.getActivity()) != null) {
                eRI eri = eRI.OLrzqt;
                MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
                eri.AEQbTJ(activity, c15572eNh, abstractC12782ctV, (mpcWalletEncodeInfoQSBOWP2 == null || (uid = mpcWalletEncodeInfoQSBOWP2.getUid()) == null) ? "" : uid, new yHO() { // from class: o.eNi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.yHO
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return C15572eNh.OLrzqt(((java.lang.Integer) obj2).intValue(), (android.view.View) obj3, (ViewOnClickListenerC54939xaY) obj4);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(AbstractC12782ctV abstractC12782ctV, C15572eNh c15572eNh, java.lang.Throwable th) {
        int i;
        int value;
        if (abstractC12782ctV.DCUTEIdCUTEI()) {
            value = MpcStatus.Escape.getValue();
        } else if (!abstractC12782ctV.Dmq() && abstractC12782ctV.zLjUOn()) {
            value = MpcStatus.Refreshed.getValue();
        } else {
            i = -1;
            if (i != -1) {
                eSA esaAwvSrB = c15572eNh.AwvSrB();
                FragmentActivity fragmentActivityRequireActivity = c15572eNh.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                eSA.judgyDialog$default(esaAwvSrB, 0, i, abstractC12782ctV, fragmentActivityRequireActivity, 0, null, 48, null);
            }
            return Unit.INSTANCE;
        }
        i = value;
        if (i != -1) {
        }
        return Unit.INSTANCE;
    }

    public final void djSkpj() {
        AuCTel().KWHzl().observe(getViewLifecycleOwner(), new PackageManager(new Function1() { // from class: o.eNr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.EZpvd(this.EZpvd, (InfoListNew) obj);
            }
        }));
    }

    public static final Unit EZpvd(C15572eNh c15572eNh, InfoListNew infoListNew) {
        c15572eNh.finit();
        return Unit.INSTANCE;
    }

    public final void finit() {
        C18027fae c18027fae;
        C18027fae c18027fae2;
        C18027fae c18027fae3;
        C18027fae c18027fae4;
        C18027fae c18027fae5;
        C18027fae c18027fae6;
        eUI eui = this.ODWQjV;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        AbstractC12782ctV value = eui.fARcdN().getValue();
        if (value == null) {
            return;
        }
        java.util.List<BannerInfoNew> listOLrzqt = AuCTel().OLrzqt(value);
        C16972etx c16972etx = this.iRxXKY;
        if (c16972etx != null && (c18027fae6 = c16972etx.KWHzl) != null) {
            c18027fae6.setData(listOLrzqt, zuBGHE().AYXKKw().getValue().booleanValue() && RcXXUw(), new Function1() { // from class: o.eOO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15572eNh.AYXKKw(this.AEQbTJ, (java.lang.String) obj);
                }
            });
            c18027fae6.setAutoPlay(true);
            c18027fae6.setAutoTurningTime(5000L);
        }
        C16972etx c16972etx2 = this.iRxXKY;
        if (c16972etx2 == null || (c18027fae = c16972etx2.KWHzl) == null || c18027fae.getVisibility() != 0) {
            return;
        }
        if (AYXKKw(value)) {
            C16972etx c16972etx3 = this.iRxXKY;
            if (c16972etx3 != null && (c18027fae5 = c16972etx3.KWHzl) != null) {
                c18027fae5.setAutoPlay(false);
            }
            C16972etx c16972etx4 = this.iRxXKY;
            if (c16972etx4 == null || (c18027fae4 = c16972etx4.KWHzl) == null) {
                return;
            }
            c18027fae4.setVisibility(8);
            return;
        }
        if (RcXXUw() && zuBGHE().AYXKKw().getValue().booleanValue()) {
            C16972etx c16972etx5 = this.iRxXKY;
            if (c16972etx5 != null && (c18027fae3 = c16972etx5.KWHzl) != null) {
                c18027fae3.setAutoPlay(false);
            }
            C16972etx c16972etx6 = this.iRxXKY;
            if (c16972etx6 == null || (c18027fae2 = c16972etx6.KWHzl) == null) {
                return;
            }
            c18027fae2.setVisibility(8);
        }
    }

    public static final Unit AYXKKw(C15572eNh c15572eNh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC18129fca interfaceC18129fcaEZpvd = C18072fbW.EZpvd(c15572eNh);
        InterfaceC54828xWv interfaceC54828xWv = (InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC54828xWv.class);
        FragmentActivity fragmentActivityRequireActivity = c15572eNh.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC54828xWv.ActionBar.enterDAppWebViewByUrl$default(interfaceC54828xWv, fragmentActivityRequireActivity, str, null, "wallet", interfaceC18129fcaEZpvd != null ? interfaceC18129fcaEZpvd.EZpvd() : null, interfaceC18129fcaEZpvd != null ? java.lang.Integer.valueOf(interfaceC18129fcaEZpvd.OLrzqt()) : null, 4, null);
        return Unit.INSTANCE;
    }

    public final void hUfVAv() {
        pUU.copydefault("fcj toNormalAssetState call ");
        if (this.hDKMBd != this.AEQbTJ) {
            try {
                C16592emo c16592emo = this.getNewProxyInstance;
                C16592emo c16592emo2 = null;
                if (c16592emo == null) {
                    Intrinsics.gEmmrt("");
                    c16592emo = null;
                }
                c16592emo.values.setVisibility(8);
                C16592emo c16592emo3 = this.getNewProxyInstance;
                if (c16592emo3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16592emo2 = c16592emo3;
                }
                c16592emo2.isConnected.setVisibility(0);
            } catch (java.lang.Exception e) {
                pUU.copydefault(getTAG(), "toNormalAssetState error " + e);
            }
        }
        this.hDKMBd = this.AEQbTJ;
        flVtFt();
        gGvvIC();
        EZpvd(this.AEQbTJ);
        fJNWhG();
    }

    public final void flVtFt() {
        C52794wYp c52794wYp;
        ConstraintLayout root;
        ConstraintLayout root2;
        C16885esP c16885esP;
        ConstraintLayout root3;
        android.widget.ImageView imageView;
        C52794wYp c52794wYp2;
        ConstraintLayout root4;
        android.view.ViewStub viewStub;
        android.view.View viewInflate;
        eUI eui = this.ODWQjV;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        AbstractC12782ctV value = eui.fARcdN().getValue();
        if (value == null) {
            return;
        }
        if (AYXKKw(value)) {
            if (this.AhwBna == null) {
                C16972etx c16972etx = this.iRxXKY;
                if (c16972etx == null || (viewStub = c16972etx.EZpvd) == null || (viewInflate = viewStub.inflate()) == null) {
                    return;
                } else {
                    this.AhwBna = C16885esP.KWHzl(viewInflate);
                }
            }
            C16885esP c16885esP2 = this.AhwBna;
            if (c16885esP2 != null && (root4 = c16885esP2.getRoot()) != null) {
                root4.setVisibility(0);
            }
            C16885esP c16885esP3 = this.AhwBna;
            if (c16885esP3 != null && (c52794wYp2 = c16885esP3.copydefault) != null) {
                c52794wYp2.setOnClickListener(new Configuration(c52794wYp2, 1000L, this));
            }
            C16885esP c16885esP4 = this.AhwBna;
            if (c16885esP4 != null && (imageView = c16885esP4.AEQbTJ) != null) {
                C14677dpv.OLrzqt(imageView, CDNSourceManager.ImageSource.HomeSAAddFunds);
            }
        } else {
            C16885esP c16885esP5 = this.AhwBna;
            if (c16885esP5 != null && (root = c16885esP5.getRoot()) != null) {
                root.setVisibility(8);
            }
            C16885esP c16885esP6 = this.AhwBna;
            if (c16885esP6 != null && (c52794wYp = c16885esP6.copydefault) != null) {
                c52794wYp.setOnClickListener(null);
            }
        }
        C16885esP c16885esP7 = this.AhwBna;
        if (c16885esP7 == null || (root2 = c16885esP7.getRoot()) == null || root2.getVisibility() != 0 || !RcXXUw() || !zuBGHE().AYXKKw().getValue().booleanValue() || (c16885esP = this.AhwBna) == null || (root3 = c16885esP.getRoot()) == null) {
            return;
        }
        root3.setVisibility(8);
    }

    public final boolean AYXKKw(AbstractC12782ctV abstractC12782ctV) {
        C10407bnq.ActionBar actionBar = C10407bnq.Companion;
        return C10407bnq.ActionBar.getInstance$default(actionBar, null, 1, null).KWHzl(abstractC12782ctV) && abstractC12782ctV.DXXBbs() && !C10407bnq.ActionBar.getInstance$default(actionBar, null, 1, null).EZpvd(abstractC12782ctV.DbNXlk());
    }

    public final void fJNWhG() {
        eUI eui = this.ODWQjV;
        C16592emo c16592emo = null;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        AbstractC12782ctV value = eui.fARcdN().getValue();
        if (value == null || value.zLjUOn()) {
            C16592emo c16592emo2 = this.getNewProxyInstance;
            if (c16592emo2 == null) {
                Intrinsics.gEmmrt("");
                c16592emo2 = null;
            }
            c16592emo2.fJNWhG.djBIcL(true);
            C16592emo c16592emo3 = this.getNewProxyInstance;
            if (c16592emo3 == null) {
                Intrinsics.gEmmrt("");
                c16592emo3 = null;
            }
            c16592emo3.fJNWhG.AhwBna(false);
            C16592emo c16592emo4 = this.getNewProxyInstance;
            if (c16592emo4 == null) {
                Intrinsics.gEmmrt("");
                c16592emo4 = null;
            }
            c16592emo4.fJNWhG.valueOf(true);
        } else {
            C16592emo c16592emo5 = this.getNewProxyInstance;
            if (c16592emo5 == null) {
                Intrinsics.gEmmrt("");
                c16592emo5 = null;
            }
            c16592emo5.fJNWhG.djBIcL(true);
            C16592emo c16592emo6 = this.getNewProxyInstance;
            if (c16592emo6 == null) {
                Intrinsics.gEmmrt("");
                c16592emo6 = null;
            }
            c16592emo6.fJNWhG.AhwBna(false);
            C16592emo c16592emo7 = this.getNewProxyInstance;
            if (c16592emo7 == null) {
                Intrinsics.gEmmrt("");
                c16592emo7 = null;
            }
            c16592emo7.fJNWhG.valueOf(true);
            C16592emo c16592emo8 = this.getNewProxyInstance;
            if (c16592emo8 == null) {
                Intrinsics.gEmmrt("");
                c16592emo8 = null;
            }
            c16592emo8.fJNWhG.OLrzqt();
        }
        C16592emo c16592emo9 = this.getNewProxyInstance;
        if (c16592emo9 == null) {
            Intrinsics.gEmmrt("");
            c16592emo9 = null;
        }
        c16592emo9.AEQbTJ.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new Fragment());
        C16592emo c16592emo10 = this.getNewProxyInstance;
        if (c16592emo10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16592emo = c16592emo10;
        }
        c16592emo.fJNWhG.KWHzl(new PendingIntent());
    }

    /* JADX INFO: renamed from: o.eNh$Fragment */
    public static final class Fragment implements AppBarLayout.OnOffsetChangedListener {
        public Fragment() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            C15572eNh.this.EZpvd((-i) / (appBarLayout != null ? appBarLayout.getTotalScrollRange() : 1.0f));
            C15572eNh.this.OLrzqt(i);
        }
    }

    /* JADX INFO: renamed from: o.eNh$PendingIntent */
    public static final class PendingIntent implements InterfaceC57932yrj {
        @Override // o.InterfaceC57932yrj
        public boolean copydefault(android.view.View view) {
            return false;
        }

        public PendingIntent() {
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
        @Override // o.InterfaceC57932yrj
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean EZpvd(android.view.View view) {
            if (C15572eNh.this.fIwbmz() == 0) {
                C16592emo c16592emo = C15572eNh.this.getNewProxyInstance;
                if (c16592emo == null) {
                    Intrinsics.gEmmrt("");
                    c16592emo = null;
                }
                if (c16592emo.fetchVPNInfo.getScrollY() != 0) {
                }
            } else if (C15572eNh.this.getNewProxyInstance() != C15572eNh.this.gHZMYf()) {
                return false;
            }
            return true;
        }
    }

    public final void gkJEwt() {
        C17018euq c17018euq;
        java.lang.String strCopydefault;
        EZpvd(this.djBIcL);
        iZzfmt();
        fJNWhG();
        eUI eui = this.ODWQjV;
        C16592emo c16592emo = null;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        AbstractC12782ctV value = eui.fARcdN().getValue();
        C16973ety c16973ety = this.hUfVAv;
        if (c16973ety != null && (c17018euq = c16973ety.AhwBna) != null) {
            if (value != null && !value.zLjUOn()) {
                C15689eRq c15689eRq = C15689eRq.KWHzl;
                android.widget.TextView textView = c17018euq.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                c15689eRq.KWHzl(textView, c17018euq.OLrzqt);
                C52794wYp c52794wYp = c17018euq.copydefault;
                if (c52794wYp != null) {
                    c52794wYp.setVisibility(((value == null || !value.ORxRYg()) && (value == null || !value.AEQbTJ(WalletType.MPCWallet))) ? 0 : 8);
                }
                C52794wYp c52794wYp2 = c17018euq.AEQbTJ;
                if (c52794wYp2 != null) {
                    if ((value != null && value.ORxRYg()) || (value != null && value.AEQbTJ(WalletType.MPCWallet))) {
                        strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.onCreatePanelMenu);
                    } else {
                        SupportCloudType supportCloudTypeQKVWgx = QKVWgx();
                        android.content.Context contextRequireContext = requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                        strCopydefault = c15689eRq.copydefault(supportCloudTypeQKVWgx, contextRequireContext);
                    }
                    c52794wYp2.setText(strCopydefault);
                }
                C16592emo c16592emo2 = this.getNewProxyInstance;
                if (c16592emo2 == null) {
                    Intrinsics.gEmmrt("");
                    c16592emo2 = null;
                }
                c16592emo2.values.setVisibility(0);
                C16592emo c16592emo3 = this.getNewProxyInstance;
                if (c16592emo3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16592emo = c16592emo3;
                }
                c16592emo.isConnected.setVisibility(8);
                this.hDKMBd = this.copydefault;
                C16973ety c16973ety2 = this.hUfVAv;
                if (c16973ety2 != null) {
                    c16973ety2.EZpvd.getRoot().setVisibility(0);
                    if (!ORxRYg().KWHzl().getValue().isEmpty()) {
                        c16973ety2.copydefault.getRoot().setVisibility(0);
                    }
                }
            } else {
                gasjUx();
                if (this.hDKMBd != this.AEQbTJ) {
                    try {
                        C16592emo c16592emo4 = this.getNewProxyInstance;
                        if (c16592emo4 == null) {
                            Intrinsics.gEmmrt("");
                            c16592emo4 = null;
                        }
                        c16592emo4.values.setVisibility(8);
                        C16592emo c16592emo5 = this.getNewProxyInstance;
                        if (c16592emo5 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            c16592emo = c16592emo5;
                        }
                        c16592emo.isConnected.setVisibility(0);
                    } catch (java.lang.Exception e) {
                        pUU.copydefault(getTAG(), "toZeroAssetState error " + e);
                    }
                }
                this.hDKMBd = this.AEQbTJ;
                C16973ety c16973ety3 = this.hUfVAv;
                if (c16973ety3 != null) {
                    c16973ety3.EZpvd.getRoot().setVisibility(8);
                    c16973ety3.copydefault.getRoot().setVisibility(8);
                }
            }
        }
        this.QbewEr = true;
    }

    public final void fZBcTu() {
        C17120ewm c17120ewm;
        RecyclerView recyclerView;
        C17120ewm c17120ewm2;
        RecyclerView recyclerView2;
        C18037fao c18037fao = new C18037fao(new View.OnClickListener() { // from class: o.eOr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C15572eNh.copydefault(this.EZpvd, view);
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new DefiHomeFragmentNew$setupCryptoReads$1(this, c18037fao, null));
        C16973ety c16973ety = this.hUfVAv;
        if (c16973ety != null && (c17120ewm2 = c16973ety.EZpvd) != null && (recyclerView2 = c17120ewm2.AEQbTJ) != null) {
            recyclerView2.setItemAnimator(null);
        }
        C16973ety c16973ety2 = this.hUfVAv;
        if (c16973ety2 == null || (c17120ewm = c16973ety2.EZpvd) == null || (recyclerView = c17120ewm.AEQbTJ) == null) {
            return;
        }
        recyclerView.setAdapter(c18037fao);
    }

    public static final void copydefault(C15572eNh c15572eNh, android.view.View view) {
        WalletStateChecker walletStateChecker = WalletStateChecker.AEQbTJ;
        DefiHomeContainerViewModel fieldNames = c15572eNh.getFieldNames();
        eUI eui = c15572eNh.ODWQjV;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        int i = Application.AEQbTJ[walletStateChecker.copydefault(fieldNames, eui).ordinal()];
        if (i == 1) {
            C14494dmX.KWHzl.EZpvd("about_web3module");
        } else {
            if (i != 2) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = c15572eNh.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiHomeFragmentNew$setupCryptoReads$adapter$1$1(null), 3, null);
        }
    }

    public final void dvKsVJ() {
        C17122ewo c17122ewo;
        RecyclerView recyclerView;
        C18138fcj c18138fcj = new C18138fcj(new C18136fch.StateListAnimator() { // from class: o.eNK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C18136fch.StateListAnimator
            public final void copydefault(NftCollection nftCollection) {
                C15572eNh.OLrzqt(this.AEQbTJ, nftCollection);
            }
        }, new View.OnClickListener() { // from class: o.eNO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C15572eNh.KWHzl(this.KWHzl, view);
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new DefiHomeFragmentNew$setupNftCollections$1(this, c18138fcj, null));
        C16973ety c16973ety = this.hUfVAv;
        if (c16973ety == null || (c17122ewo = c16973ety.copydefault) == null || (recyclerView = c17122ewo.copydefault) == null) {
            return;
        }
        recyclerView.setAdapter(c18138fcj);
    }

    public static final void OLrzqt(C15572eNh c15572eNh, NftCollection nftCollection) {
        InterfaceC9773bbs interfaceC9773bbs;
        Intrinsics.checkNotNullParameter(nftCollection, "");
        WalletStateChecker walletStateChecker = WalletStateChecker.AEQbTJ;
        DefiHomeContainerViewModel fieldNames = c15572eNh.getFieldNames();
        eUI eui = c15572eNh.ODWQjV;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        int i = Application.AEQbTJ[walletStateChecker.copydefault(fieldNames, eui).ordinal()];
        if (i == 1) {
            C14494dmX.KWHzl.EZpvd("top_collections");
        } else if (i == 2) {
            LifecycleOwner viewLifecycleOwner = c15572eNh.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiHomeFragmentNew$setupNftCollections$adapter$1$1(null), 3, null);
        }
        java.util.List<InterfaceC9773bbs> listRlQdEF = c15572eNh.RlQdEF();
        if (listRlQdEF == null || (interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.firstOrNull(listRlQdEF)) == null) {
            return;
        }
        android.content.Context contextRequireContext = c15572eNh.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC9773bbs.copydefault(contextRequireContext, java.lang.String.valueOf(nftCollection.getId()), nftCollection.getProjectName(), nftCollection.getChain(), false);
    }

    public static final void KWHzl(C15572eNh c15572eNh, android.view.View view) {
        c15572eNh.ORxRYg().EZpvd();
    }

    public final void EZpvd(float f) {
        this.dNCPSb = java.lang.Float.valueOf(f);
        if (isAdded()) {
            java.util.List<androidx.fragment.app.Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "");
            for (ActivityResultCaller activityResultCaller : fragments) {
                if (activityResultCaller instanceof InterfaceC54854xXu) {
                    C16592emo c16592emo = this.getNewProxyInstance;
                    if (c16592emo == null) {
                        Intrinsics.gEmmrt("");
                        c16592emo = null;
                    }
                    c16592emo.gEmmrt.getLocationOnScreen(this.values);
                    ((InterfaceC54854xXu) activityResultCaller).KWHzl(f, this.values[1]);
                }
            }
        }
    }

    public static /* synthetic */ void notifyChainSet$default(C15572eNh c15572eNh, long j, long j2, boolean z, boolean z2, java.lang.String str, int i, java.lang.Object obj) {
        c15572eNh.AEQbTJ((i & 1) != 0 ? Long.MIN_VALUE : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, str);
    }

    public final void AEQbTJ(long j, long j2, boolean z, boolean z2, java.lang.String str) {
        if (!this.DCJXGO || z) {
            pUU.KWHzl(getTAG(), "notifyChainSet: changeWallet " + z2);
            pUU.KWHzl(getTAG(), "notifyChainSet: currentChainId " + this.ejfBZ);
            pUU.KWHzl(getTAG(), "notifyChainSet: chainId " + j);
            if (this.ejfBZ != j || z2) {
                this.ejfBZ = j;
                this.uzCIH = j2;
                EZpvd("notifyChainSet", zuBGHE().AYXKKw().getValue().booleanValue(), RcXXUw());
                java.util.List<androidx.fragment.app.Fragment> fragments = getChildFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "");
                for (ActivityResultCaller activityResultCaller : fragments) {
                    if (activityResultCaller instanceof InterfaceC54847xXn) {
                        if (Intrinsics.EZpvd(this.dvKsVJ, activityResultCaller) || Intrinsics.EZpvd(this.giSNqX, activityResultCaller) || Intrinsics.EZpvd(this.finit, activityResultCaller) || Intrinsics.EZpvd(this.fZBcTu, activityResultCaller)) {
                            ((InterfaceC54847xXn) activityResultCaller).KWHzl(j == Long.MIN_VALUE ? -1L : j, j2 == Long.MIN_VALUE ? -1L : j2, z);
                        } else {
                            ((InterfaceC54847xXn) activityResultCaller).KWHzl(j, j2, z);
                        }
                    }
                }
            }
        }
    }

    public final void QUSxYX() {
        eUI eui = this.ODWQjV;
        C16592emo c16592emo = null;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        AbstractC12782ctV value = eui.fARcdN().getValue();
        if (value == null) {
            return;
        }
        boolean zIsSingleMode = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(value.DbNXlk()).isSingleMode();
        boolean zKWHzl = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl(value);
        java.util.List<HomeTabTypeBean> tabTypeBeanWithFilter$default = C14088dep.getTabTypeBeanWithFilter$default(C14088dep.copydefault, zIsSingleMode, zKWHzl, (zKWHzl && eLJ.StateListAnimator.getInstance$default(eLJ.Companion, null, 1, null).valueOf().isEmpty()) ? false : true, false, 8, null);
        C16592emo c16592emo2 = this.getNewProxyInstance;
        if (c16592emo2 == null) {
            Intrinsics.gEmmrt("");
            c16592emo2 = null;
        }
        if (c16592emo2.OLrzqt.getAdapter() == null) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            EZpvd(new ActionBar(this, childFragmentManager, tabTypeBeanWithFilter$default));
        } else {
            C16592emo c16592emo3 = this.getNewProxyInstance;
            if (c16592emo3 == null) {
                Intrinsics.gEmmrt("");
                c16592emo3 = null;
            }
            RecyclerView.Adapter adapter = c16592emo3.OLrzqt.getAdapter();
            ActionBar actionBar = adapter instanceof ActionBar ? (ActionBar) adapter : null;
            if (actionBar == null) {
                return;
            }
            if (actionBar.KWHzl(tabTypeBeanWithFilter$default)) {
                C16592emo c16592emo4 = this.getNewProxyInstance;
                if (c16592emo4 == null) {
                    Intrinsics.gEmmrt("");
                    c16592emo4 = null;
                }
                android.view.View childAt = c16592emo4.OLrzqt.getChildAt(0);
                final RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
                final RecyclerView.ItemAnimator itemAnimator = recyclerView != null ? recyclerView.getItemAnimator() : null;
                if (recyclerView != null) {
                    recyclerView.setItemAnimator(null);
                }
                actionBar.KWHzl(tabTypeBeanWithFilter$default, 0);
                if (recyclerView != null) {
                    recyclerView.post(new java.lang.Runnable() { // from class: o.eOB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C15572eNh.AEQbTJ(recyclerView, itemAnimator);
                        }
                    });
                }
            }
        }
        C16592emo c16592emo5 = this.getNewProxyInstance;
        if (c16592emo5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16592emo = c16592emo5;
        }
        C55244xgL c55244xgL = c16592emo.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
        c55244xgL.setVisibility(tabTypeBeanWithFilter$default.size() <= 1 ? 8 : 0);
    }

    public static final void AEQbTJ(RecyclerView recyclerView, RecyclerView.ItemAnimator itemAnimator) {
        recyclerView.setItemAnimator(itemAnimator);
    }

    public final void EZpvd(final ActionBar actionBar) {
        try {
            C16592emo c16592emo = this.getNewProxyInstance;
            C16592emo c16592emo2 = null;
            if (c16592emo == null) {
                Intrinsics.gEmmrt("");
                c16592emo = null;
            }
            c16592emo.OLrzqt.setAdapter(actionBar);
            eSW esw = this.isConnected;
            if (esw != null) {
                esw.copydefault();
            }
            this.isConnected = null;
            C16592emo c16592emo3 = this.getNewProxyInstance;
            if (c16592emo3 == null) {
                Intrinsics.gEmmrt("");
                c16592emo3 = null;
            }
            TabLayout tabLayoutAYXKKw = c16592emo3.EZpvd.AYXKKw();
            C16592emo c16592emo4 = this.getNewProxyInstance;
            if (c16592emo4 == null) {
                Intrinsics.gEmmrt("");
                c16592emo4 = null;
            }
            this.isConnected = new eSW(tabLayoutAYXKKw, c16592emo4.OLrzqt, true, false, new eSW.Activity() { // from class: o.eNR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.eSW.Activity
                public final void KWHzl(TabLayout.Tab tab, int i) {
                    C15572eNh.OLrzqt(actionBar, this, tab, i);
                }
            });
            C16592emo c16592emo5 = this.getNewProxyInstance;
            if (c16592emo5 == null) {
                Intrinsics.gEmmrt("");
                c16592emo5 = null;
            }
            c16592emo5.OLrzqt.unregisterOnPageChangeCallback(this.DAIeex);
            C16592emo c16592emo6 = this.getNewProxyInstance;
            if (c16592emo6 == null) {
                Intrinsics.gEmmrt("");
                c16592emo6 = null;
            }
            c16592emo6.OLrzqt.registerOnPageChangeCallback(this.DAIeex);
            eSW esw2 = this.isConnected;
            if (esw2 != null) {
                esw2.KWHzl();
            }
            C16592emo c16592emo7 = this.getNewProxyInstance;
            if (c16592emo7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16592emo2 = c16592emo7;
            }
            c16592emo2.EZpvd.copydefault(new StateListAnimator(actionBar));
            getChildFragmentManager().unregisterFragmentLifecycleCallbacks(this.zLjUOn);
            getChildFragmentManager().registerFragmentLifecycleCallbacks(this.zLjUOn, true);
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "attachTabLayout error =" + e.getMessage() + " ");
        }
    }

    public static final void OLrzqt(ActionBar actionBar, C15572eNh c15572eNh, TabLayout.Tab tab, int i) {
        java.lang.String strAYXKKw;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(tab, "");
        HomeTabTypeBean homeTabTypeBeanCopydefault = actionBar.copydefault(i);
        if (homeTabTypeBeanCopydefault != null && (strAYXKKw = C33070mpX.AYXKKw(homeTabTypeBeanCopydefault.getTitle())) != null) {
            str = strAYXKKw;
        }
        tab.setText(str);
        if (i < actionBar.getItemCount()) {
            HomeTabTypeBean homeTabTypeBeanCopydefault2 = actionBar.copydefault(i);
            if ((homeTabTypeBeanCopydefault2 != null ? homeTabTypeBeanCopydefault2.getType() : null) == HomeTabType.TYPE_DEFI) {
                c15572eNh.QKudOq = i;
                InterfaceC25427iwX interfaceC25427iwXAuCTelauCTel = c15572eNh.AuCTelauCTel();
                if (interfaceC25427iwXAuCTelauCTel != null) {
                    interfaceC25427iwXAuCTelauCTel.AEQbTJ(tab);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.eNh$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ ActionBar AEQbTJ;

        /* JADX INFO: renamed from: o.eNh$StateListAnimator$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[HomeTabType.values().length];
                try {
                    iArr[HomeTabType.TYPE_WALLET.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[HomeTabType.TYPE_NFT.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[HomeTabType.TYPE_APPROVE_MANAGER.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[HomeTabType.TYPE_DEFI.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[HomeTabType.TYPE_DAPP.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                AEQbTJ = iArr;
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator(ActionBar actionBar) {
            this.AEQbTJ = actionBar;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab == null || tab.getPosition() != 0) {
                C16592emo c16592emo = C15572eNh.this.getNewProxyInstance;
                if (c16592emo == null) {
                    Intrinsics.gEmmrt("");
                    c16592emo = null;
                }
                c16592emo.OLrzqt.setOffscreenPageLimit(this.AEQbTJ.getItemCount());
            }
            HomeTabTypeBean homeTabTypeBeanCopydefault = this.AEQbTJ.copydefault(tab != null ? tab.getPosition() : -1);
            HomeTabType type = homeTabTypeBeanCopydefault != null ? homeTabTypeBeanCopydefault.getType() : null;
            int i = type != null ? TaskDescription.AEQbTJ[type.ordinal()] : -1;
            if (i == 1) {
                C32866mlf.onEvent$default("app_home_asset_coin_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                return;
            }
            if (i == 2) {
                C32866mlf.onEvent$default("app_home_asset_nft_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                return;
            }
            if (i == 3) {
                C32866mlf.onEvent$default("app_home_asset_approval_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                return;
            }
            if (i == 4) {
                C32866mlf.onEvent$default("app_home_asset_defi_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                C32866mlf.onEvent$default("HomeDefi_Full_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            } else if (i == 5) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(C15572eNh.this), null, null, new DefiHomeFragmentNew$attachTabLayout$2$onTabSelected$1(null), 3, null);
            } else {
                C32866mlf.onEvent$default("app_home_asset_coin_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            InterfaceC25427iwX interfaceC25427iwXAuCTelauCTel;
            if (tab == null || tab.getPosition() != C15572eNh.this.QKudOq || (interfaceC25427iwXAuCTelauCTel = C15572eNh.this.AuCTelauCTel()) == null) {
                return;
            }
            interfaceC25427iwXAuCTelauCTel.copydefault();
        }
    }

    public final void UeEOUB() {
        eUI eui = this.ODWQjV;
        C16592emo c16592emo = null;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        eui.fARcdN().observe(this, new Observer() { // from class: o.eNG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C15572eNh.gEmmrt(this.KWHzl, (AbstractC12782ctV) obj);
            }
        });
        C16592emo c16592emo2 = this.getNewProxyInstance;
        if (c16592emo2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16592emo = c16592emo2;
        }
        c16592emo.AuCTel.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
    }

    public static final void gEmmrt(C15572eNh c15572eNh, AbstractC12782ctV abstractC12782ctV) {
        DefiHomeContainerFragment.Companion.copydefault(true);
        c15572eNh.fARcdN();
    }

    public final void QbewEr() {
        C17018euq c17018euq;
        C16973ety c16973ety = this.hUfVAv;
        if (c16973ety == null || (c17018euq = c16973ety.AhwBna) == null) {
            return;
        }
        android.widget.TextView textView = c17018euq.gEmmrt;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ITrustedWebActivityCallbackStub));
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) spannableStringBuilder, (java.lang.CharSequence) "Web3", false, 2, (java.lang.Object) null)) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.OJuSTm)), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableStringBuilder, "Web3", 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableStringBuilder, "Web3", 0, false, 6, (java.lang.Object) null) + 4, 33);
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(0), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableStringBuilder, "Web3", 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableStringBuilder, "Web3", 0, false, 6, (java.lang.Object) null) + 4, 33);
        }
        textView.setText(spannableStringBuilder);
        ConstraintLayout constraintLayout = c17018euq.EZpvd;
        constraintLayout.setOnClickListener(new DialogInterface(constraintLayout, 1000L, this));
        C52794wYp c52794wYp = c17018euq.AEQbTJ;
        c52794wYp.setOnClickListener(new Context(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = c17018euq.copydefault;
        c52794wYp2.setOnClickListener(new ContentResolver(c52794wYp2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.eNh$AssistContent */
    public static final class AssistContent implements Function1<EventParamsList, Unit> {
        public static final AssistContent AEQbTJ = new AssistContent();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.add(new EventParam(FirebaseAnalytics.Param.METHOD, "cloud", false));
        }
    }

    /* JADX INFO: renamed from: o.eNh$SharedElementCallback */
    public static final class SharedElementCallback implements Function1<java.lang.Integer, Unit> {
        public static final SharedElementCallback EZpvd = new SharedElementCallback();

        public final void KWHzl(int i) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Integer num) {
            KWHzl(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.eNh$TaskStackBuilder */
    public static final class TaskStackBuilder implements Function0<Unit> {
        public final /* synthetic */ android.content.Context KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.content.Context context, java.lang.String str) {
            this.KWHzl = context;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            C15572eNh.this.AEQbTJ(this.KWHzl, this.OLrzqt);
        }
    }

    /* JADX INFO: renamed from: o.eNh$BroadcastReceiver */
    public static final class BroadcastReceiver implements Function0<Unit> {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ android.content.Context KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver(android.content.Context context, java.lang.String str) {
            this.KWHzl = context;
            this.EZpvd = str;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            C15572eNh.this.AEQbTJ(this.KWHzl, this.EZpvd);
        }
    }

    /* JADX INFO: renamed from: o.eNh$VoiceInteractor */
    public static final class VoiceInteractor implements Function1<java.lang.Integer, Unit> {
        public static final VoiceInteractor KWHzl = new VoiceInteractor();

        public final void copydefault(int i) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Integer num) {
            copydefault(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.eNh$ClipData */
    public static final class ClipData implements Function1<java.lang.Integer, Unit> {
        public static final ClipData OLrzqt = new ClipData();

        public final void copydefault(int i) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Integer num) {
            copydefault(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.eNh$ComponentCallbacks */
    public static final class ComponentCallbacks implements Function0<Unit> {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks(android.content.Context context, java.lang.String str) {
            this.AEQbTJ = context;
            this.KWHzl = str;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            C15572eNh.this.AEQbTJ(this.AEQbTJ, this.KWHzl);
        }
    }

    /* JADX INFO: renamed from: o.eNh$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 implements Function1<java.lang.Integer, Unit> {
        public static final ComponentCallbacks2 AEQbTJ = new ComponentCallbacks2();

        public final void OLrzqt(int i) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Integer num) {
            OLrzqt(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.eNh$ComponentName */
    public static final class ComponentName implements Function1<EventParamsList, Unit> {
        public static final ComponentName KWHzl = new ComponentName();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.add(new EventParam(FirebaseAnalytics.Param.METHOD, "manual", false));
        }
    }

    public final void AEQbTJ(android.content.Context context, java.lang.String str) {
        if (C13912dbY.copydefault.gEmmrt()) {
            ActivityC18750foL.StateListAnimator.startActivity$default(ActivityC18750foL.Companion, context, str, "defi_main", 0, 8, null);
        } else {
            ActivityC18691fnF.Activity.startActivity$default(ActivityC18691fnF.Companion, context, str, "defi_main", 0, 8, null);
        }
    }

    public final void iZzfmt() {
        android.widget.Space space;
        C17018euq c17018euq;
        android.widget.LinearLayout root;
        android.widget.Space space2;
        C17018euq c17018euq2;
        android.widget.LinearLayout root2;
        MyLinearLayout myLinearLayout;
        eUI eui = this.ODWQjV;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        AbstractC12782ctV value = eui.fARcdN().getValue();
        if (value == null) {
            return;
        }
        C16973ety c16973ety = this.hUfVAv;
        if (c16973ety != null && (myLinearLayout = c16973ety.AYXKKw) != null) {
            myLinearLayout.setLayoutRequest(false);
        }
        if (value.zuWLRA() && !value.zLjUOn()) {
            C16973ety c16973ety2 = this.hUfVAv;
            if (c16973ety2 != null && (c17018euq2 = c16973ety2.AhwBna) != null && (root2 = c17018euq2.getRoot()) != null) {
                root2.setVisibility(0);
            }
            C16973ety c16973ety3 = this.hUfVAv;
            if (c16973ety3 != null && (space2 = c16973ety3.KWHzl) != null) {
                space2.setVisibility(0);
            }
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiHomeFragmentNew$showZeroBackup$1(null), 3, null);
            EZpvd(this.copydefault);
            return;
        }
        C16973ety c16973ety4 = this.hUfVAv;
        if (c16973ety4 != null && (c17018euq = c16973ety4.AhwBna) != null && (root = c17018euq.getRoot()) != null) {
            root.setVisibility(8);
        }
        C16973ety c16973ety5 = this.hUfVAv;
        if (c16973ety5 != null && (space = c16973ety5.KWHzl) != null) {
            space.setVisibility(8);
        }
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new DefiHomeFragmentNew$showZeroBackup$2(null), 3, null);
    }

    public final void gGvvIC() {
        eUI eui = this.ODWQjV;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        final AbstractC12782ctV value = eui.fARcdN().getValue();
        if (value == null) {
            return;
        }
        AbstractC12784ctX abstractC12784ctXGwTjWJ = value.gwTjWJ();
        final java.lang.String strEZpvd = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.EZpvd() : null;
        if (!Intrinsics.EZpvd((java.lang.Object) this.QVAiDq, (java.lang.Object) strEZpvd)) {
            this.fIwbmz = true;
        }
        this.QVAiDq = strEZpvd;
        this.AxsJAYsNCnLh = false;
        if (value.zuWLRA() && value.AxsJAYaxsJAY() && !value.gasjUx() && this.fIwbmz && strEZpvd != null) {
            AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtOLrzqt = C13912dbY.copydefault.OLrzqt(strEZpvd);
            final Function1 function1 = new Function1() { // from class: o.eNj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15572eNh.KWHzl(this.EZpvd, strEZpvd, value, (java.lang.Boolean) obj);
                }
            };
            abstractC58260yxtOLrzqt.copydefault(new InterfaceC58227yxM() { // from class: o.eNz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15572eNh.AuCTelauCTel(function1, obj);
                }
            });
        }
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C15572eNh c15572eNh, java.lang.String str, AbstractC12782ctV abstractC12782ctV, java.lang.Boolean bool) {
        AbstractC12784ctX abstractC12784ctXGwTjWJ;
        eUI eui = c15572eNh.ODWQjV;
        eUI eui2 = null;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        AbstractC12782ctV value = eui.fARcdN().getValue();
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((value == null || (abstractC12784ctXGwTjWJ = value.gwTjWJ()) == null) ? null : abstractC12784ctXGwTjWJ.EZpvd()))) {
            return Unit.INSTANCE;
        }
        if (bool.booleanValue() && abstractC12782ctV.zuWLRA() && abstractC12782ctV.AxsJAYaxsJAY() && !abstractC12782ctV.gasjUx() && c15572eNh.fIwbmz) {
            eUI eui3 = c15572eNh.ODWQjV;
            if (eui3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                eui2 = eui3;
            }
            AbstractC12782ctV value2 = eui2.fARcdN().getValue();
            boolean z = (value2 == null || value2.ORxRYg() || value2 == null || value2.AEQbTJ(WalletType.MPCWallet)) ? false : true;
            if (c15572eNh.isVisibled() && z) {
                c15572eNh.fIwbmz = false;
                c15572eNh.EZpvd(str);
            } else {
                c15572eNh.AxsJAYsNCnLh = true;
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(final java.lang.String str) {
        this.wlaJM.OLrzqt(WalletHomeDialogQueueManager.DialogPriority.MANUAL_BACKUP, "MANUAL_BACKUP", new Function0() { // from class: o.eNZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C15572eNh.gasjUx(this.KWHzl));
            }
        }, new Function0() { // from class: o.eOn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15572eNh.AEQbTJ(str, this);
            }
        });
    }

    public static final boolean gasjUx(C15572eNh c15572eNh) {
        return c15572eNh.isVisible() && !c15572eNh.isDetached();
    }

    public static final Unit AEQbTJ(java.lang.String str, final C15572eNh c15572eNh) {
        C18758foT c18758foTKWHzl = C18758foT.Companion.KWHzl(str);
        c18758foTKWHzl.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.eOJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C15572eNh.AEQbTJ(this.OLrzqt, dialogInterface);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = c15572eNh.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c18758foTKWHzl.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C15572eNh c15572eNh, android.content.DialogInterface dialogInterface) {
        c15572eNh.wlaJM.KWHzl();
    }

    public static /* synthetic */ void refreshData$default(C15572eNh c15572eNh, java.lang.String str, boolean z, boolean z2, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            num = 0;
        }
        c15572eNh.EZpvd(str, z, z2, num);
    }

    public final void EZpvd(java.lang.String str, boolean z, boolean z2, java.lang.Integer num) {
        eUI eui = this.ODWQjV;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        eUI.requestAllHomeData$default(eui, str, null, false, z, false, false, num, z2, false, null, 822, null);
    }

    public static final Unit KWHzl(C15572eNh c15572eNh, java.lang.Integer num) {
        pUU.copydefault("current state " + num);
        int i = c15572eNh.djBIcL;
        eUI eui = null;
        if (num != null && num.intValue() == i) {
            pUU.copydefault("zero state");
            c15572eNh.giSNqX();
            c15572eNh.gkJEwt();
            refreshDataForZeroAssetsHomepage$default(c15572eNh, false, 1, null);
        } else if (num != null && num.intValue() == 1) {
            c15572eNh.gasjUx();
            c15572eNh.hUfVAv();
            c15572eNh.finit();
            c15572eNh.AuCTel().copydefault();
        } else if (num != null && num.intValue() == 2) {
            eUI eui2 = c15572eNh.ODWQjV;
            if (eui2 == null) {
                Intrinsics.gEmmrt("");
                eui2 = null;
            }
            AbstractC12782ctV value = eui2.fARcdN().getValue();
            if (value != null && !value.ORxRYg() && value != null && !value.AEQbTJ(WalletType.MPCWallet)) {
                eUI eui3 = c15572eNh.ODWQjV;
                if (eui3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    eui = eui3;
                }
                eui.AYXKKw().setValue(new C32989mnw<>(1));
            }
        }
        return Unit.INSTANCE;
    }

    public final void gasjUx() {
        C18027fae c18027fae;
        android.widget.LinearLayout root;
        C18027fae c18027fae2;
        MyLinearLayout root2;
        C16973ety c16973ety = this.hUfVAv;
        if (c16973ety != null && c16973ety != null && (root2 = c16973ety.getRoot()) != null) {
            root2.setVisibility(8);
        }
        C16972etx c16972etx = this.iRxXKY;
        if (c16972etx == null) {
            C16592emo c16592emo = this.getNewProxyInstance;
            if (c16592emo == null) {
                Intrinsics.gEmmrt("");
                c16592emo = null;
            }
            this.iRxXKY = C16972etx.AEQbTJ(c16592emo.fIwbmz.inflate());
            ePI epiUzCIH = uzCIH();
            if (epiUzCIH != null) {
                epiUzCIH.OLrzqt(this.aKErDB);
            }
            djSkpj();
            C16972etx c16972etx2 = this.iRxXKY;
            if (c16972etx2 != null && (c18027fae2 = c16972etx2.KWHzl) != null) {
                c18027fae2.setOnBannerClickListener(new View.OnClickListener() { // from class: o.eOq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C15572eNh.AhwBna(this.EZpvd, view);
                    }
                });
            }
        } else {
            if (c16972etx != null && (root = c16972etx.getRoot()) != null) {
                root.setVisibility(0);
            }
            C16972etx c16972etx3 = this.iRxXKY;
            if (c16972etx3 != null && (c18027fae = c16972etx3.KWHzl) != null) {
                c18027fae.setAutoPlay(true);
            }
        }
        QUSxYX();
    }

    public static final void AhwBna(C15572eNh c15572eNh, android.view.View view) {
        WalletStateChecker walletStateChecker = WalletStateChecker.AEQbTJ;
        DefiHomeContainerViewModel fieldNames = c15572eNh.getFieldNames();
        eUI eui = c15572eNh.ODWQjV;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        if (walletStateChecker.copydefault(fieldNames, eui) == WalletStateChecker.WalletState.NORMAL) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c15572eNh), null, null, new DefiHomeFragmentNew$setupNormalAsset$1$1(null), 3, null);
        }
    }

    public final void giSNqX() {
        MyLinearLayout root;
        C18027fae c18027fae;
        android.widget.LinearLayout root2;
        C16972etx c16972etx = this.iRxXKY;
        if (c16972etx != null) {
            if (c16972etx != null && (root2 = c16972etx.getRoot()) != null) {
                root2.setVisibility(8);
            }
            C16972etx c16972etx2 = this.iRxXKY;
            if (c16972etx2 != null && (c18027fae = c16972etx2.KWHzl) != null) {
                c18027fae.setAutoPlay(false);
            }
        }
        C16973ety c16973ety = this.hUfVAv;
        if (c16973ety == null) {
            C16592emo c16592emo = this.getNewProxyInstance;
            if (c16592emo == null) {
                Intrinsics.gEmmrt("");
                c16592emo = null;
            }
            this.hUfVAv = C16973ety.copydefault(c16592emo.AkhnZx.inflate());
            fZBcTu();
            dvKsVJ();
            QbewEr();
            QUSxYX();
            ePI epiZsXlph = zsXlph();
            if (epiZsXlph != null) {
                epiZsXlph.OLrzqt(this.aKErDB);
                return;
            }
            return;
        }
        if (c16973ety != null && (root = c16973ety.getRoot()) != null) {
            root.setVisibility(0);
        }
        QUSxYX();
    }

    public final void iRxXKY() {
        pUU.EZpvd(getTAG(), "subscribe: " + this.DbNXlk);
        eUI eui = this.ODWQjV;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        eui.AYXKKw().observe(getViewLifecycleOwner(), this.DbNXlk);
    }

    public final void DAIeex() {
        pUU.EZpvd(getTAG(), "unsubscribe: " + this.DbNXlk);
        eUI eui = this.ODWQjV;
        eUI eui2 = null;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        eui.AYXKKw().removeObserver(this.DbNXlk);
        java.lang.String tag = getTAG();
        eUI eui3 = this.ODWQjV;
        if (eui3 == null) {
            Intrinsics.gEmmrt("");
            eui3 = null;
        }
        pUU.EZpvd(tag, "hasObservers: " + eui3.AYXKKw().hasObservers());
        java.lang.String tag2 = getTAG();
        eUI eui4 = this.ODWQjV;
        if (eui4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            eui2 = eui4;
        }
        pUU.EZpvd(tag2, "hasActiveObservers: " + eui2.AYXKKw().hasActiveObservers());
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        AbstractC12784ctX abstractC12784ctXGwTjWJ;
        java.lang.String strEZpvd;
        C18027fae c18027fae;
        pUU.EZpvd("defiHome", "onVisible " + this);
        this.ORxRYg = true;
        ((xWN) C43251rlk.copydefault(xWN.class)).KWHzl(true);
        ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(true);
        eUI eui = null;
        if (!this.DTwDnp && C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).fetchVPNInfo() == WalletStatus.RealWallets) {
            EZpvd("onVisible", true, false, this.AxsJAYaxsJAY ? 0 : null);
        }
        this.DTwDnp = false;
        C16972etx c16972etx = this.iRxXKY;
        if (c16972etx != null && (c18027fae = c16972etx.KWHzl) != null) {
            c18027fae.setAutoPlay(true);
        }
        if (this.AxsJAYsNCnLh) {
            this.AxsJAYsNCnLh = false;
            this.fIwbmz = false;
            eUI eui2 = this.ODWQjV;
            if (eui2 == null) {
                Intrinsics.gEmmrt("");
                eui2 = null;
            }
            AbstractC12782ctV value = eui2.fARcdN().getValue();
            if (value == null || (abstractC12784ctXGwTjWJ = value.gwTjWJ()) == null || (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) == null) {
                return;
            }
            eUI eui3 = this.ODWQjV;
            if (eui3 == null) {
                Intrinsics.gEmmrt("");
                eui3 = null;
            }
            AbstractC12782ctV value2 = eui3.fARcdN().getValue();
            if (value2 != null && !value2.ORxRYg() && value2 != null && !value2.AEQbTJ(WalletType.MPCWallet)) {
                EZpvd(strEZpvd);
            }
        }
        eUI eui4 = this.ODWQjV;
        if (eui4 == null) {
            Intrinsics.gEmmrt("");
            eui4 = null;
        }
        if (eui4.fIwbmz()) {
            eUI eui5 = this.ODWQjV;
            if (eui5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                eui = eui5;
            }
            eui.djBIcL(false);
        }
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        C18027fae c18027fae;
        pUU.EZpvd("defiHome", "onInvisible " + this);
        C16972etx c16972etx = this.iRxXKY;
        if (c16972etx != null && (c18027fae = c16972etx.KWHzl) != null) {
            c18027fae.setAutoPlay(false);
        }
        this.ORxRYg = false;
    }

    public final void fFgQHt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeFragmentNew$reportDefiHubShow$1(this, null), 3, null);
    }

    public final boolean copydefault(java.util.List<? extends AbstractC12782ctV> list) {
        java.util.List<? extends AbstractC12782ctV> list2;
        java.util.List<? extends AbstractC12782ctV> list3 = this.fARcdN;
        if (list3 != null && list.size() == list3.size() && (list2 = this.fARcdN) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC12782ctV) it.next()).DbNXlk());
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AbstractC12782ctV) it2.next()).DbNXlk());
            }
            if (arrayList2.containsAll(arrayList) && arrayList.containsAll(arrayList2)) {
                return false;
            }
        }
        return true;
    }

    public final void KWHzl(java.lang.String str) {
        java.lang.String walletId;
        java.lang.String topic;
        WCSessionMeta wCSessionMetaIsConnected = QfsBiF().isConnected(str);
        showWalletConnectFragment$default(this, null, 3, (wCSessionMetaIsConnected == null || (topic = wCSessionMetaIsConnected.getTopic()) == null) ? "" : topic, (wCSessionMetaIsConnected == null || (walletId = wCSessionMetaIsConnected.getWalletId()) == null) ? "" : walletId, 1, null);
    }

    public static /* synthetic */ void refreshDataForZeroAssetsHomepage$default(C15572eNh c15572eNh, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c15572eNh.gEmmrt(z);
    }

    public final void gEmmrt(boolean z) {
        if (this.QbewEr) {
            hDKMBd().copydefault();
            ORxRYg().OLrzqt(z);
            AxsJAY().copydefault(z);
        }
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.eNm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.EZpvd(this.copydefault, str, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eNn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15572eNh.ejfBZ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eNo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.AhwBna((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eNl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15572eNh.fJNWhG(function12, obj);
            }
        });
    }

    public static final Unit EZpvd(final C15572eNh c15572eNh, final java.lang.String str, final AbstractC12782ctV abstractC12782ctV) {
        eUI eui = c15572eNh.ODWQjV;
        if (eui == null) {
            Intrinsics.gEmmrt("");
            eui = null;
        }
        eui.copydefault(new Function1() { // from class: o.eNJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.KWHzl(abstractC12782ctV, c15572eNh, str, ((java.lang.Boolean) obj).booleanValue());
            }
        }, abstractC12782ctV.DbNXlk());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(AbstractC12782ctV abstractC12782ctV, C15572eNh c15572eNh, java.lang.String str, boolean z) {
        C16592emo c16592emo;
        if (abstractC12782ctV.zLjUOn() || !z) {
            C16592emo c16592emo2 = c15572eNh.getNewProxyInstance;
            C16592emo c16592emo3 = null;
            if (c16592emo2 == null) {
                Intrinsics.gEmmrt("");
                c16592emo2 = null;
            }
            RecyclerView.Adapter adapter = c16592emo2.OLrzqt.getAdapter();
            ActionBar actionBar = adapter instanceof ActionBar ? (ActionBar) adapter : null;
            int iOLrzqt = actionBar != null ? actionBar.OLrzqt(HomeTabType.Companion.KWHzl(str)) : 0;
            if (iOLrzqt > -1) {
                C16592emo c16592emo4 = c15572eNh.getNewProxyInstance;
                if (c16592emo4 == null) {
                    Intrinsics.gEmmrt("");
                    c16592emo4 = null;
                }
                if (iOLrzqt >= c16592emo4.EZpvd.AYXKKw().getTabCount()) {
                }
                c16592emo = c15572eNh.getNewProxyInstance;
                if (c16592emo != null) {
                }
                c16592emo3.OLrzqt.setCurrentItem(iOLrzqt, false);
            } else {
                iOLrzqt = 0;
                c16592emo = c15572eNh.getNewProxyInstance;
                if (c16592emo != null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16592emo3 = c16592emo;
                }
                c16592emo3.OLrzqt.setCurrentItem(iOLrzqt, false);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        InterfaceC58217yxC interfaceC58217yxC = this.DarRvM;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.DarRvM = null;
        C16592emo c16592emo = this.getNewProxyInstance;
        if (c16592emo == null) {
            Intrinsics.gEmmrt("");
            c16592emo = null;
        }
        c16592emo.OLrzqt.unregisterOnPageChangeCallback(this.DAIeex);
        eSW esw = this.isConnected;
        if (esw != null) {
            esw.copydefault();
        }
        this.isConnected = null;
        InterfaceC25427iwX interfaceC25427iwXAuCTelauCTel = AuCTelauCTel();
        if (interfaceC25427iwXAuCTelauCTel != null) {
            interfaceC25427iwXAuCTelauCTel.OLrzqt();
        }
        this.zsXlph.removeCallbacksAndMessages(null);
        SubHelper.AEQbTJ(this.RcXXUw);
        android.os.Looper.myQueue().removeIdleHandler(this.accept);
        android.os.Looper.myQueue().removeIdleHandler(this.iZzfmt);
        C16592emo c16592emo2 = this.getNewProxyInstance;
        if (c16592emo2 == null) {
            Intrinsics.gEmmrt("");
            c16592emo2 = null;
        }
        c16592emo2.DbNXlk.removeAllAnimatorListeners();
        ePI epiUzCIH = uzCIH();
        if (epiUzCIH != null) {
            epiUzCIH.OLrzqt(new Function1() { // from class: o.eOM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15572eNh.AEQbTJ((AbstractC12782ctV) obj);
                }
            });
        }
        ePI epiZsXlph = zsXlph();
        if (epiZsXlph != null) {
            epiZsXlph.OLrzqt(new Function1() { // from class: o.eOQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15572eNh.OLrzqt((AbstractC12782ctV) obj);
                }
            });
        }
        this.giSNqX = null;
        this.djSkpj = null;
        this.dvKsVJ = null;
        this.finit = null;
        this.fZBcTu = null;
        this.hUfVAv = null;
        this.iRxXKY = null;
        this.AhwBna = null;
        super.onDestroyView();
    }

    public static final Unit AEQbTJ(AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.eNh$ActionBar */
    public final class ActionBar extends FragmentStateAdapter {
        public final /* synthetic */ C15572eNh AEQbTJ;
        public final androidx.fragment.app.FragmentManager EZpvd;
        public java.util.List<HomeTabTypeBean> copydefault;

        /* JADX INFO: renamed from: o.eNh$ActionBar$StateListAnimator */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[HomeTabType.values().length];
                try {
                    iArr[HomeTabType.TYPE_WALLET.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[HomeTabType.TYPE_APPROVE_MANAGER.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[HomeTabType.TYPE_NFT.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[HomeTabType.TYPE_DEFI.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[HomeTabType.TYPE_DAPP.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[HomeTabType.TYPE_DEX_STRATEGY.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[HomeTabType.TYPE_DEX_ORDERS.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C15572eNh c15572eNh, @NotNull androidx.fragment.app.FragmentManager fragmentManager, java.util.List<HomeTabTypeBean> list) {
            super(fragmentManager, c15572eNh.getLifecycle());
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = c15572eNh;
            this.EZpvd = fragmentManager;
            this.copydefault = list;
        }

        public final HomeTabTypeBean copydefault(int i) {
            if (i < 0 || i >= this.copydefault.size()) {
                return null;
            }
            return this.copydefault.get(i);
        }

        public final boolean KWHzl(@NotNull java.util.List<HomeTabTypeBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return !Intrinsics.EZpvd(this.copydefault, list);
        }

        public static final void OLrzqt(final C15572eNh c15572eNh, final int i, final java.util.List<HomeTabTypeBean> list) {
            C16592emo c16592emo = c15572eNh.getNewProxyInstance;
            if (c16592emo == null) {
                Intrinsics.gEmmrt("");
                c16592emo = null;
            }
            c16592emo.OLrzqt.post(new java.lang.Runnable() { // from class: o.eOP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C15572eNh.ActionBar.KWHzl(i, list, c15572eNh);
                }
            });
        }

        public static final void KWHzl(int i, java.util.List list, C15572eNh c15572eNh) {
            if (i >= list.size()) {
                i = 0;
            }
            C16592emo c16592emo = c15572eNh.getNewProxyInstance;
            if (c16592emo == null) {
                Intrinsics.gEmmrt("");
                c16592emo = null;
            }
            c16592emo.OLrzqt.setCurrentItem(i, false);
            if (list.size() >= 0) {
                c15572eNh.DAIeex.onPageSelected(i);
            }
        }

        public final void KWHzl(@NotNull java.util.List<HomeTabTypeBean> list, int i) {
            Intrinsics.checkNotNullParameter(list, "");
            if (!this.AEQbTJ.isResumed()) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ), null, null, new DefiHomeFragmentNew$AssetsListPagerAdapter$updateTabList$1(this.AEQbTJ, this, list, i, null), 3, null);
                return;
            }
            try {
                this.copydefault = list;
                notifyDataSetChanged();
                OLrzqt(this.AEQbTJ, i, list);
            } catch (java.lang.Exception e) {
                C10856bwO.copydefault(this.AEQbTJ.getTAG(), 0, "notifyDataSetChanged setOnlySupportTableList isResumed error " + e.getMessage());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.copydefault.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return this.copydefault.get(i).getId();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            AbstractC32996moC c15625ePg;
            AbstractC32996moC abstractC32996moC;
            InterfaceC9773bbs interfaceC9773bbs;
            androidx.fragment.app.Fragment fragmentAEQbTJ;
            InterfaceC9774bbt interfaceC9774bbt;
            AbstractC32996moC abstractC32996moCAEQbTJ;
            xWA xwa;
            InterfaceC9772bbr interfaceC9772bbr;
            InterfaceC9772bbr interfaceC9772bbr2;
            HomeTabTypeBean homeTabTypeBeanCopydefault = copydefault(i);
            HomeTabType type = homeTabTypeBeanCopydefault != null ? homeTabTypeBeanCopydefault.getType() : null;
            switch (type == null ? -1 : StateListAnimator.AEQbTJ[type.ordinal()]) {
                case 1:
                    c15625ePg = new C15625ePg();
                    break;
                case 2:
                    c15625ePg = new eMK();
                    break;
                case 3:
                    java.util.List listRlQdEF = this.AEQbTJ.RlQdEF();
                    androidx.fragment.app.Fragment fragmentAEQbTJ2 = (listRlQdEF == null || (interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listRlQdEF)) == null) ? null : interfaceC9773bbs.AEQbTJ((java.lang.String) null);
                    abstractC32996moC = fragmentAEQbTJ2 instanceof AbstractC32996moC ? (AbstractC32996moC) fragmentAEQbTJ2 : null;
                    if (abstractC32996moC == null) {
                        c15625ePg = new C15619ePa();
                        pUU.copydefault(this.AEQbTJ.getTAG(), "getNFTAssetEntryFragment error.");
                    } else {
                        c15625ePg = abstractC32996moC;
                    }
                    this.AEQbTJ.giSNqX = c15625ePg;
                    if ((c15625ePg instanceof InterfaceC54847xXn) && this.AEQbTJ.ejfBZ != Long.MIN_VALUE) {
                        ((InterfaceC54847xXn) c15625ePg).KWHzl(this.AEQbTJ.ejfBZ, this.AEQbTJ.uzCIH, false);
                    }
                    break;
                case 4:
                    InterfaceC18129fca interfaceC18129fcaEZpvd = C18072fbW.EZpvd(this.AEQbTJ);
                    java.util.List listAxsJAYsNCnLh = this.AEQbTJ.AxsJAYsNCnLh();
                    if (listAxsJAYsNCnLh == null || (interfaceC9774bbt = (InterfaceC9774bbt) CollectionsKt___CollectionsKt.firstOrNull(listAxsJAYsNCnLh)) == null) {
                        fragmentAEQbTJ = null;
                    } else {
                        fragmentAEQbTJ = interfaceC9774bbt.AEQbTJ(null, this.AEQbTJ.uzCIH == Long.MIN_VALUE ? null : java.lang.Long.valueOf(this.AEQbTJ.uzCIH), interfaceC18129fcaEZpvd != null ? interfaceC18129fcaEZpvd.EZpvd() : null, interfaceC18129fcaEZpvd != null ? java.lang.Integer.valueOf(interfaceC18129fcaEZpvd.OLrzqt()) : null);
                    }
                    abstractC32996moC = fragmentAEQbTJ instanceof AbstractC32996moC ? (AbstractC32996moC) fragmentAEQbTJ : null;
                    if (abstractC32996moC == null) {
                        c15625ePg = new C15619ePa();
                        pUU.copydefault(this.AEQbTJ.getTAG(), "getInvestPlatformListFragment error.");
                    } else {
                        c15625ePg = abstractC32996moC;
                    }
                    this.AEQbTJ.dvKsVJ = c15625ePg;
                    break;
                case 5:
                    InterfaceC18129fca interfaceC18129fcaEZpvd2 = C18072fbW.EZpvd(this.AEQbTJ);
                    java.util.List listSSMYrx = this.AEQbTJ.sSMYrx();
                    if (listSSMYrx == null || (xwa = (xWA) CollectionsKt___CollectionsKt.AuCTelauCTel(listSSMYrx)) == null) {
                        abstractC32996moCAEQbTJ = null;
                    } else {
                        abstractC32996moCAEQbTJ = xwa.AEQbTJ(interfaceC18129fcaEZpvd2 != null ? interfaceC18129fcaEZpvd2.EZpvd() : null, interfaceC18129fcaEZpvd2 != null ? java.lang.Integer.valueOf(interfaceC18129fcaEZpvd2.OLrzqt()) : null);
                    }
                    abstractC32996moC = abstractC32996moCAEQbTJ instanceof AbstractC32996moC ? abstractC32996moCAEQbTJ : null;
                    if (abstractC32996moC == null) {
                        c15625ePg = new C15619ePa();
                        pUU.copydefault(this.AEQbTJ.getTAG(), "getDAppTabHomeFragment error.");
                    } else {
                        c15625ePg = abstractC32996moC;
                    }
                    this.AEQbTJ.djSkpj = c15625ePg;
                    break;
                case 6:
                    c15625ePg = this.AEQbTJ.finit;
                    if (c15625ePg == null) {
                        java.util.List listQKudOq = this.AEQbTJ.QKudOq();
                        androidx.fragment.app.Fragment fragmentCopydefault = (listQKudOq == null || (interfaceC9772bbr = (InterfaceC9772bbr) CollectionsKt___CollectionsKt.AuCTelauCTel(listQKudOq)) == null) ? null : interfaceC9772bbr.copydefault();
                        abstractC32996moC = fragmentCopydefault instanceof AbstractC32996moC ? (AbstractC32996moC) fragmentCopydefault : null;
                        pUU.copydefault(this.AEQbTJ.getTAG(), "getDexStrategyFragment error.");
                        c15625ePg = abstractC32996moC;
                    }
                    this.AEQbTJ.finit = c15625ePg;
                    if ((c15625ePg instanceof InterfaceC54847xXn) && this.AEQbTJ.ejfBZ != Long.MIN_VALUE) {
                        ((InterfaceC54847xXn) c15625ePg).KWHzl(this.AEQbTJ.ejfBZ, this.AEQbTJ.uzCIH, false);
                    }
                    break;
                case 7:
                    c15625ePg = this.AEQbTJ.fZBcTu;
                    if (c15625ePg == null) {
                        java.util.List listQKudOq2 = this.AEQbTJ.QKudOq();
                        androidx.fragment.app.Fragment fragmentEZpvd = (listQKudOq2 == null || (interfaceC9772bbr2 = (InterfaceC9772bbr) CollectionsKt___CollectionsKt.AuCTelauCTel(listQKudOq2)) == null) ? null : interfaceC9772bbr2.EZpvd();
                        abstractC32996moC = fragmentEZpvd instanceof AbstractC32996moC ? (AbstractC32996moC) fragmentEZpvd : null;
                        pUU.copydefault(this.AEQbTJ.getTAG(), "getDexOrdersFragment error.");
                        c15625ePg = abstractC32996moC;
                    }
                    this.AEQbTJ.fZBcTu = c15625ePg;
                    if ((c15625ePg instanceof InterfaceC54847xXn) && this.AEQbTJ.ejfBZ != Long.MIN_VALUE) {
                        ((InterfaceC54847xXn) c15625ePg).KWHzl(this.AEQbTJ.ejfBZ, this.AEQbTJ.uzCIH, false);
                    }
                    break;
                default:
                    c15625ePg = new C15625ePg();
                    break;
            }
            Intrinsics.copydefault(c15625ePg, "");
            return c15625ePg;
        }

        public final int OLrzqt(@NotNull HomeTabType homeTabType) {
            Intrinsics.checkNotNullParameter(homeTabType, "");
            java.util.Iterator<HomeTabTypeBean> it = this.copydefault.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().getType() == homeTabType) {
                    return i;
                }
                i++;
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: o.eNh$FragmentManager */
    public static final class FragmentManager extends FragmentManager.FragmentLifecycleCallbacks {
        public FragmentManager() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: androidx.fragment.app.Fragment */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentResumed(fragmentManager, fragment);
            if (fragment instanceof eMK) {
                if (C15572eNh.this.OcIXYQ) {
                    return;
                }
                InterfaceC54847xXn interfaceC54847xXn = fragment instanceof InterfaceC54847xXn ? (InterfaceC54847xXn) fragment : null;
                if (interfaceC54847xXn != null) {
                    long j = C15572eNh.this.ejfBZ;
                    C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(C15572eNh.this.ejfBZ);
                    interfaceC54847xXn.KWHzl(j, c10854bwMKWHzl != null ? c10854bwMKWHzl.fetchVPNInfo() : Long.MIN_VALUE, true);
                }
                C15572eNh.this.OcIXYQ = true;
                return;
            }
            if (Intrinsics.EZpvd(fragment, C15572eNh.this.dvKsVJ)) {
                if (!C15572eNh.this.RJOkX) {
                    InterfaceC54847xXn interfaceC54847xXn2 = fragment instanceof InterfaceC54847xXn ? (InterfaceC54847xXn) fragment : null;
                    if (interfaceC54847xXn2 != null) {
                        long j2 = C15572eNh.this.ejfBZ;
                        C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(C15572eNh.this.ejfBZ);
                        interfaceC54847xXn2.KWHzl(j2, c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.fetchVPNInfo() : -1L, true);
                    }
                    C15572eNh.this.RJOkX = true;
                }
                InterfaceC25427iwX interfaceC25427iwXAuCTelauCTel = C15572eNh.this.AuCTelauCTel();
                if (interfaceC25427iwXAuCTelauCTel != null) {
                    interfaceC25427iwXAuCTelauCTel.EZpvd(fragment, HomeTabType.TYPE_DEFI.getValue());
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: androidx.fragment.app.Fragment */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentAttached(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.content.Context context) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(context, "");
            super.onFragmentAttached(fragmentManager, fragment, context);
            if (!Intrinsics.EZpvd(fragment, C15572eNh.this.giSNqX) || C15572eNh.this.QfsBiF || !(fragment instanceof InterfaceC54847xXn)) {
                if (!Intrinsics.EZpvd(fragment, C15572eNh.this.finit) || C15572eNh.this.QOLQEE || !(fragment instanceof InterfaceC54847xXn)) {
                    if (Intrinsics.EZpvd(fragment, C15572eNh.this.fZBcTu) && !C15572eNh.this.QKVWgx && (fragment instanceof InterfaceC54847xXn)) {
                        C15572eNh.this.QKVWgx = true;
                        InterfaceC54847xXn interfaceC54847xXn = (InterfaceC54847xXn) fragment;
                        long j = C15572eNh.this.ejfBZ;
                        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(C15572eNh.this.ejfBZ);
                        interfaceC54847xXn.KWHzl(j, c10854bwMKWHzl != null ? c10854bwMKWHzl.fetchVPNInfo() : -1L, true);
                        return;
                    }
                    return;
                }
                C15572eNh.this.QOLQEE = true;
                InterfaceC54847xXn interfaceC54847xXn2 = (InterfaceC54847xXn) fragment;
                long j2 = C15572eNh.this.ejfBZ;
                C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(C15572eNh.this.ejfBZ);
                interfaceC54847xXn2.KWHzl(j2, c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.fetchVPNInfo() : -1L, true);
                return;
            }
            C15572eNh.this.QfsBiF = true;
            InterfaceC54847xXn interfaceC54847xXn3 = (InterfaceC54847xXn) fragment;
            long j3 = C15572eNh.this.ejfBZ;
            C10854bwM c10854bwMKWHzl3 = C10954byG.EZpvd.valueOf().KWHzl(C15572eNh.this.ejfBZ);
            interfaceC54847xXn3.KWHzl(j3, c10854bwMKWHzl3 != null ? c10854bwMKWHzl3.fetchVPNInfo() : -1L, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    @Override // o.InterfaceC54851xXr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(boolean z) {
        HomeTabType type;
        int height;
        int height2;
        if (this.gHZMYf) {
            return;
        }
        C16592emo c16592emo = this.getNewProxyInstance;
        C16592emo c16592emo2 = null;
        if (c16592emo == null) {
            Intrinsics.gEmmrt("");
            c16592emo = null;
        }
        RecyclerView.Adapter adapter = c16592emo.OLrzqt.getAdapter();
        ActionBar actionBar = adapter instanceof ActionBar ? (ActionBar) adapter : null;
        if (actionBar == null) {
            type = null;
        } else {
            C16592emo c16592emo3 = this.getNewProxyInstance;
            if (c16592emo3 == null) {
                Intrinsics.gEmmrt("");
                c16592emo3 = null;
            }
            HomeTabTypeBean homeTabTypeBeanCopydefault = actionBar.copydefault(c16592emo3.OLrzqt.getCurrentItem());
            if (homeTabTypeBeanCopydefault != null) {
                type = homeTabTypeBeanCopydefault.getType();
            }
        }
        this.getFieldNames = type;
        if (type == HomeTabType.TYPE_WALLET) {
            C16592emo c16592emo4 = this.getNewProxyInstance;
            if (c16592emo4 == null) {
                Intrinsics.gEmmrt("");
                c16592emo4 = null;
            }
            c16592emo4.KWHzl.getRoot().setVisibility(0);
        }
        if (z) {
            if (this.sSMYrx) {
                return;
            }
            C16592emo c16592emo5 = this.getNewProxyInstance;
            if (c16592emo5 == null) {
                Intrinsics.gEmmrt("");
                c16592emo5 = null;
            }
            final ConstraintLayout root = c16592emo5.KWHzl.getRoot();
            android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = root.animate();
            C16592emo c16592emo6 = this.getNewProxyInstance;
            if (c16592emo6 == null) {
                Intrinsics.gEmmrt("");
                c16592emo6 = null;
            }
            ConstraintLayout root2 = c16592emo6.fARcdN.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            if (root2.getVisibility() == 0) {
                C16592emo c16592emo7 = this.getNewProxyInstance;
                if (c16592emo7 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16592emo2 = c16592emo7;
                }
                height2 = c16592emo2.fARcdN.getRoot().getHeight() + root.getHeight();
            } else {
                height2 = root.getHeight();
            }
            viewPropertyAnimatorAnimate.translationYBy(-height2).setDuration(250L).withStartAction(new java.lang.Runnable() { // from class: o.eND
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C15572eNh.copydefault(this.AEQbTJ, root);
                }
            }).withEndAction(new java.lang.Runnable() { // from class: o.eNE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C15572eNh.accept(this.copydefault);
                }
            }).start();
            return;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.sSMYrx) {
            C16592emo c16592emo8 = this.getNewProxyInstance;
            if (c16592emo8 == null) {
                Intrinsics.gEmmrt("");
                c16592emo8 = null;
            }
            final ConstraintLayout root3 = c16592emo8.KWHzl.getRoot();
            android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate2 = root3.animate();
            C16592emo c16592emo9 = this.getNewProxyInstance;
            if (c16592emo9 == null) {
                Intrinsics.gEmmrt("");
                c16592emo9 = null;
            }
            ConstraintLayout root4 = c16592emo9.fARcdN.getRoot();
            Intrinsics.checkNotNullExpressionValue(root4, "");
            if (root4.getVisibility() == 0) {
                C16592emo c16592emo10 = this.getNewProxyInstance;
                if (c16592emo10 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16592emo2 = c16592emo10;
                }
                height = c16592emo2.fARcdN.getRoot().getHeight() + root3.getHeight();
            } else {
                height = root3.getHeight();
            }
            viewPropertyAnimatorAnimate2.translationYBy(height).setDuration(250L).withStartAction(new java.lang.Runnable() { // from class: o.eNF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C15572eNh.QKudOq(this.EZpvd);
                }
            }).withEndAction(new java.lang.Runnable() { // from class: o.eNI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C15572eNh.OLrzqt(this.KWHzl, root3);
                }
            }).start();
        }
    }

    public static final void copydefault(C15572eNh c15572eNh, ConstraintLayout constraintLayout) {
        c15572eNh.gHZMYf = true;
        constraintLayout.setTranslationY(0.0f);
    }

    public static final void accept(C15572eNh c15572eNh) {
        c15572eNh.gHZMYf = false;
        c15572eNh.sSMYrx = true;
    }

    public static final void QKudOq(C15572eNh c15572eNh) {
        c15572eNh.gHZMYf = true;
    }

    public static final void OLrzqt(C15572eNh c15572eNh, ConstraintLayout constraintLayout) {
        c15572eNh.gHZMYf = false;
        c15572eNh.sSMYrx = false;
        constraintLayout.setTranslationY(0.0f);
    }

    @Override // o.InterfaceC54853xXt
    public boolean copydefault(int i) {
        C16592emo c16592emo = this.getNewProxyInstance;
        C16592emo c16592emo2 = null;
        if (c16592emo == null) {
            Intrinsics.gEmmrt("");
            c16592emo = null;
        }
        c16592emo.valueOf.getRoot().getLocationOnScreen(this.AkhnZx);
        C16592emo c16592emo3 = this.getNewProxyInstance;
        if (c16592emo3 == null) {
            Intrinsics.gEmmrt("");
            c16592emo3 = null;
        }
        int i2 = 4;
        c16592emo3.valueOf.getRoot().setVisibility(i >= this.AkhnZx[1] ? 0 : 4);
        C16592emo c16592emo4 = this.getNewProxyInstance;
        if (c16592emo4 == null) {
            Intrinsics.gEmmrt("");
            c16592emo4 = null;
        }
        android.view.View view = c16592emo4.AhwBna;
        C16592emo c16592emo5 = this.getNewProxyInstance;
        if (c16592emo5 == null) {
            Intrinsics.gEmmrt("");
            c16592emo5 = null;
        }
        android.widget.FrameLayout root = c16592emo5.valueOf.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        if (root.getVisibility() == 0) {
            C16592emo c16592emo6 = this.getNewProxyInstance;
            if (c16592emo6 == null) {
                Intrinsics.gEmmrt("");
                c16592emo6 = null;
            }
            ConstraintLayout root2 = c16592emo6.fARcdN.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            if (root2.getVisibility() != 0) {
                i2 = 0;
            }
        }
        view.setVisibility(i2);
        C16592emo c16592emo7 = this.getNewProxyInstance;
        if (c16592emo7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16592emo2 = c16592emo7;
        }
        android.widget.FrameLayout root3 = c16592emo2.valueOf.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "");
        return root3.getVisibility() == 0;
    }

    @Override // o.InterfaceC54853xXt
    public void dxcTrN() {
        java.lang.Float f = this.dNCPSb;
        if (f != null) {
            EZpvd(f.floatValue());
        }
    }

    public static final ViewModelProvider.Factory gkJEwt(final C15572eNh c15572eNh) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C18060fbK.class), new Function1() { // from class: o.eOI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15572eNh.AEQbTJ(this.AEQbTJ, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
