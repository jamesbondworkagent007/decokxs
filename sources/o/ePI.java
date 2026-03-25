package o;

import android.animation.Animator;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DisabledClickableLinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import com.okinc.business.defi.api.bean.ChartData;
import com.okinc.business.defi.biz.constant.EOSState;
import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.password.CredentialState;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.ApproveItem;
import com.okinc.business.defi.biz.net.bean.MoreFunctionModuleInfo;
import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse;
import com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$initPnlViewAndCollectPnlData$1$3$1;
import com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$1;
import com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$2;
import com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$3;
import com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$initView$2$2;
import com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$initView$2$8;
import com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$loadMainWallet$1;
import com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$onClick$1$1;
import com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$showWalletAssets$1;
import com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$subscribeIsKLineExpandedChange$1;
import com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$subscribeKLineStateChange$1;
import com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$subscribeSelectedChartTypeChange$1;
import com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$trackButtonClickEvents$1;
import com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$trackButtonClickEvents$3;
import com.okinc.business.defi.wallet.home.WalletHomeDialogQueueManager;
import com.okinc.business.defi.wallet.home.WalletStateChecker;
import com.okinc.business.defi.wallet.home.addressDetail.utils.KLineData;
import com.okinc.business.defi.wallet.home.addressDetail.utils.WalletBalanceShareInfo;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.WalletPnlDataViewModel;
import com.okinc.business.defi.wallet.home.viewmodel.DefiHomeContainerViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.banner.OKAlertBanner;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import com.robinhood.ticker.TickerView;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.AbstractC18281ffT;
import o.AbstractC18810fpT;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.ActivityC15452eIw;
import o.ActivityC15848eXn;
import o.ActivityC18568fkp;
import o.C10407bnq;
import o.C10614brl;
import o.C11010bzJ;
import o.C12827cuN;
import o.C13754dXa;
import o.C13766dXm;
import o.C15530eLt;
import o.C18042fat;
import o.C21118gti;
import o.C52761wXj;
import o.C7773aqE;
import o.InterfaceC18271ffJ;
import o.InterfaceC54854xXu;
import o.InterfaceC9738bbJ;
import o.dTK;
import o.eLJ;
import o.eQU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ePI extends AbstractC15690eRr implements InterfaceC54847xXn, InterfaceC54854xXu {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public boolean AYXKKw;
    public C16595emr AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public DialogC55112xdm AuCTel;
    public InterfaceC58217yxC AuCTelauCTel;
    public java.lang.String AubY;
    public final InterfaceC56387yDm AwvSrB;
    public final ActivityResultLauncher<C21118gti.Application> AxsJAY;
    public android.animation.AnimatorSet DbNXlk;
    public CredentialState EZpvd;
    public final MediatorLiveData<kotlin.Pair<java.lang.Boolean, java.util.List<ApproveItem>>> KWHzl;
    public final Observer<java.util.List<ApproveItem>> OLrzqt;
    public boolean djBIcL;
    public Function1<? super java.lang.String, Unit> ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public AbstractC12782ctV fIwbmz;
    public final ActivityResultLauncher<android.content.Context> fJNWhG;
    public Function1<? super AbstractC12782ctV, Unit> fetchVPNInfo;
    public final ActivityResultLauncher<android.content.Context> gEmmrt;
    public boolean getFieldNames;
    public java.lang.Integer getNewProxyInstance;
    public final int[] hDKMBd;
    public final int isConnected = C13754dXa.TaskDescription.zzQwtT;
    public boolean iwGUEr;
    public final InterfaceC56387yDm uzCIH;
    public boolean valueOf;
    public final Function1<java.lang.String, Unit> values;
    public final InterfaceC56387yDm wlaJM;
    public C12827cuN zLjUOn;
    public java.lang.String zsXlph;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.HDWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[WalletStateChecker.WalletState.values().length];
            try {
                iArr2[WalletStateChecker.WalletState.NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[WalletStateChecker.WalletState.NOT_BACKED_UP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[WalletStateChecker.WalletState.ZERO_ASSETS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[WalletStateChecker.WalletState.ONBOARDING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            KWHzl = iArr2;
        }
    }

    public static final void copydefault(java.lang.Integer num) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.zLjUOn = c12827cuN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityResultLauncher<android.content.Context> OLrzqt(boolean z) {
        return z ? this.gEmmrt : this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.fetchVPNInfo = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.isConnected;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ java.util.List AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ePI OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ePI epi, java.util.List list) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = epi;
            this.AEQbTJ = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ePI.trackButtonClickEvents$default(this.OLrzqt, "more", "more", null, 4, null);
                C15770eUq.Companion.KWHzl(this.AEQbTJ, this.OLrzqt.iwGUEr).show(this.OLrzqt.getChildFragmentManager(), "WalletHomeMoreFragment");
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ePI AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ AbstractC12782ctV OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ePI epi, AbstractC12782ctV abstractC12782ctV) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = epi;
            this.OLrzqt = abstractC12782ctV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ePI.trackButtonClickEvents$default(this.AEQbTJ, "history", "history", null, 4, null);
                if (this.OLrzqt.zLjUOn()) {
                    ActivityC15452eIw.ActionBar actionBar = ActivityC15452eIw.Companion;
                    FragmentActivity activity = this.AEQbTJ.getActivity();
                    if (activity == null) {
                        return;
                    }
                    actionBar.KWHzl(activity, this.OLrzqt.DbNXlk(), this.AEQbTJ.QVAiDq().fJNWhG() > -1 ? this.AEQbTJ.QVAiDq().ejfBZ() : Long.MIN_VALUE);
                    return;
                }
                FragmentActivity fragmentActivityRequireActivity = this.AEQbTJ.requireActivity();
                AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivityRequireActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity : null;
                if (abstractActivityC33041mov == null) {
                    return;
                }
                C14325djN.showBackupTipDialog$default(new C14325djN(), abstractActivityC33041mov, this.AEQbTJ.getChildFragmentManager(), this.OLrzqt, null, 8, null);
            }
        }
    }

    public static final class BroadcastReceiver implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ePI OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver(android.view.View view, long j, ePI epi) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = epi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ("hidden_amount", "hidden_amount", "hidden_amount");
                C13912dbY c13912dbY = C13912dbY.copydefault;
                boolean z = !c13912dbY.djBIcL();
                if (c13912dbY.OLrzqt(z)) {
                    this.OLrzqt.QVAiDq().getNewProxyInstance().setValue(java.lang.Boolean.valueOf(z));
                    ePI epi = this.OLrzqt;
                    epi.DbNXlk(epi.fIwbmz);
                }
            }
        }
    }

    public static final class ClipData implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ePI KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ClipData(android.view.View view, long j, ePI epi) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = epi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("app_home_copyAddress_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                if (WalletStateChecker.AEQbTJ.copydefault(this.KWHzl.ORxRYg(), this.KWHzl.QVAiDq()) == WalletStateChecker.WalletState.NORMAL) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.KWHzl), null, null, new DefiHomeWalletFragment$onClick$1$1(null), 3, null);
                }
                C15554eMq c15554eMq = C15554eMq.KWHzl;
                FragmentActivity activity = this.KWHzl.getActivity();
                AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
                if (abstractActivityC33041mov == null) {
                    return;
                }
                androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                AbstractC12782ctV abstractC12782ctV = this.KWHzl.fIwbmz;
                if (abstractC12782ctV == null) {
                    return;
                }
                c15554eMq.EZpvd(abstractActivityC33041mov, childFragmentManager, abstractC12782ctV);
            }
        }
    }

    public static final class ComponentCallbacks implements View.OnClickListener {
        public final /* synthetic */ ePI AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ AbstractC12782ctV KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks(android.view.View view, long j, ePI epi, AbstractC12782ctV abstractC12782ctV) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = epi;
            this.KWHzl = abstractC12782ctV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.AkhnZx(this.KWHzl);
            }
        }
    }

    public static final class ComponentCallbacks2 implements View.OnClickListener {
        public final /* synthetic */ ePI AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks2(android.view.View view, long j, ePI epi) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = epi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ePI.OcIXYQ(this.AEQbTJ);
            }
        }
    }

    public static final class ComponentName implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ePI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentName(android.view.View view, long j, ePI epi) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = epi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ePI.OcIXYQ(this.copydefault);
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ OKAlertBanner OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, OKAlertBanner oKAlertBanner) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = oKAlertBanner;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.setVisibility(8);
                C15689eRq.KWHzl.AEQbTJ(true);
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ AbstractC12782ctV EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ePI OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, ePI epi, AbstractC12782ctV abstractC12782ctV) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = epi;
            this.EZpvd = abstractC12782ctV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("app_home_receive_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                ePI.trackButtonClickEvents$default(this.OLrzqt, "receive", "receive", null, 4, null);
                this.OLrzqt.OLrzqt(this.EZpvd.zsXlph(), this.OLrzqt.new Application(this.EZpvd));
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ AbstractC12782ctV AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ePI OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, ePI epi, AbstractC12782ctV abstractC12782ctV) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = epi;
            this.AEQbTJ = abstractC12782ctV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C32866mlf.onEvent$default("app_home_send_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                ePI.trackButtonClickEvents$default(this.OLrzqt, "send", "send", null, 4, null);
                this.OLrzqt.OLrzqt(this.AEQbTJ.QfsBiF() || this.AEQbTJ.zsXlph(), this.OLrzqt.new LoaderManager(this.AEQbTJ));
            }
        }
    }

    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ePI OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, ePI epi) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = epi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.values.invoke("clickToggleExpandLLLayout");
            }
        }
    }

    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ ePI AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C16595emr OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, ePI epi, C16595emr c16595emr, java.lang.String str) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = epi;
            this.OLrzqt = c16595emr;
            this.EZpvd = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                InterfaceC18129fca interfaceC18129fcaEZpvd = C18072fbW.EZpvd(this.AEQbTJ);
                if (interfaceC18129fcaEZpvd != null) {
                    C55230xfy c55230xfy = this.OLrzqt.AuCTelauCTel;
                    Intrinsics.checkNotNullExpressionValue(c55230xfy, "");
                    C18072fbW.pushSearchContainer$default(interfaceC18129fcaEZpvd, c55230xfy, this.EZpvd, null, 4, null);
                }
            }
        }
    }

    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ePI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, ePI epi) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = epi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.values.invoke("clickKLineChart");
            }
        }
    }

    public ePI() {
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(eUI.class);
        Function0<ViewModelStore> function0 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$1
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
        };
        final byte b = 0 == true ? 1 : 0;
        this.AwvSrB = FragmentViewModelLazyKt.createViewModelLazy(this, interfaceC56551yJoAEQbTJ, function0, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = b;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$3
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
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ2 = C56524yIo.AEQbTJ(DefiHomeContainerViewModel.class);
        Function0<ViewModelStore> function02 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$4
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
        };
        final byte b2 = 0 == true ? 1 : 0;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, interfaceC56551yJoAEQbTJ2, function02, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$5
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
                Function0 function03 = b2;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$6
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
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ3 = C56524yIo.AEQbTJ(C18060fbK.class);
        Function0<ViewModelStore> function03 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$7
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
        };
        final byte b3 = 0 == true ? 1 : 0;
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, interfaceC56551yJoAEQbTJ3, function03, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$8
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
                Function0 function04 = b3;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$9
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
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ4 = C56524yIo.AEQbTJ(C18275ffN.class);
        Function0<ViewModelStore> function04 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$10
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
        };
        final byte b4 = 0 == true ? 1 : 0;
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, interfaceC56551yJoAEQbTJ4, function04, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$11
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
                Function0 function05 = b4;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$12
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
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ5 = C56524yIo.AEQbTJ(WalletPnlDataViewModel.class);
        Function0<ViewModelStore> function05 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$13
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
        };
        final byte b5 = 0 == true ? 1 : 0;
        this.wlaJM = FragmentViewModelLazyKt.createViewModelLazy(this, interfaceC56551yJoAEQbTJ5, function05, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$14
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
                Function0 function06 = b5;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$special$$inlined$activityViewModels$default$15
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
        this.djBIcL = true;
        this.valueOf = true;
        this.uzCIH = C56392yDr.copydefault(new Function0() { // from class: o.eQB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ePI.QbewEr(this.copydefault);
            }
        });
        this.ejfBZ = new Function1() { // from class: o.eQA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.OLrzqt((java.lang.String) obj);
            }
        };
        this.fetchVPNInfo = new Function1() { // from class: o.eQC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.AEQbTJ((AbstractC12782ctV) obj);
            }
        };
        this.EZpvd = CredentialState.NONE;
        this.KWHzl = new MediatorLiveData<>();
        this.OLrzqt = new Observer() { // from class: o.eQz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ePI.EZpvd(this.copydefault, (java.util.List) obj);
            }
        };
        this.values = new Function1() { // from class: o.eQE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.valueOf(this.copydefault, (java.lang.String) obj);
            }
        };
        this.zsXlph = "";
        this.AubY = "";
        InterfaceC8106awV interfaceC8106awV = (InterfaceC8106awV) C43251rlk.OLrzqt(InterfaceC8106awV.class);
        this.fJNWhG = interfaceC8106awV != null ? registerForActivityResult(interfaceC8106awV.OLrzqt(true), new ActivityResultCallback() { // from class: o.eQH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ePI.fetchVPNInfo(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }) : null;
        InterfaceC8106awV interfaceC8106awV2 = (InterfaceC8106awV) C43251rlk.OLrzqt(InterfaceC8106awV.class);
        this.gEmmrt = interfaceC8106awV2 != null ? registerForActivityResult(interfaceC8106awV2.OLrzqt(true), new ActivityResultCallback() { // from class: o.eQF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ePI.valueOf(this.copydefault, (java.lang.Boolean) obj);
            }
        }) : null;
        ActivityResultLauncher<C21118gti.Application> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new C21118gti(), new ActivityResultCallback() { // from class: o.eQI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ePI.copydefault((java.lang.Integer) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AxsJAY = activityResultLauncherRegisterForActivityResult;
        this.hDKMBd = new int[2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final eUI QVAiDq() {
        return (eUI) this.AwvSrB.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DefiHomeContainerViewModel ORxRYg() {
        return (DefiHomeContainerViewModel) this.AEQbTJ.getValue();
    }

    private final C18060fbK RJOkX() {
        return (C18060fbK) this.fARcdN.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C18275ffN QbewEr() {
        return (C18275ffN) this.AkhnZx.getValue();
    }

    public final WalletPnlDataViewModel AkhnZx() {
        return (WalletPnlDataViewModel) this.wlaJM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C18270ffI QfsBiF() {
        return (C18270ffI) this.uzCIH.getValue();
    }

    public static final C18270ffI QbewEr(ePI epi) {
        FragmentActivity fragmentActivityRequireActivity = epi.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (C18270ffI) new ViewModelProvider(fragmentActivityRequireActivity).get(C18270ffI.class);
    }

    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return Unit.INSTANCE;
    }

    public final boolean getNewProxyInstance() {
        return QbewEr().AYXKKw().getValue().booleanValue();
    }

    public final C12827cuN fetchVPNInfo() {
        C12827cuN c12827cuN = this.zLjUOn;
        if (c12827cuN != null) {
            return c12827cuN;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final boolean hDKMBd() {
        return C14728dqt.KWHzl.KWHzl();
    }

    public final WalletHomeDialogQueueManager DbNXlk() {
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        C15572eNh c15572eNh = parentFragment instanceof C15572eNh ? (C15572eNh) parentFragment : null;
        if (c15572eNh != null) {
            return c15572eNh.wlaJM();
        }
        return null;
    }

    @Override // o.AbstractC15690eRr, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(C13458dMb.EZpvd(context).OcIXYQ());
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        values();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C16595emr c16595emrEZpvd = C16595emr.EZpvd(getLayoutInflater(), viewGroup, false);
        this.AhwBna = c16595emrEZpvd;
        if (c16595emrEZpvd != null) {
            return c16595emrEZpvd.getRoot();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [275=9] */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).copydefault();
        djSkpj();
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr == null) {
            return;
        }
        c16595emr.QOLQEE.setTypeface(ResourcesCompat.getFont(view.getContext(), C52761wXj.Dialog.EZpvd));
        c16595emr.QOLQEE.setGravity(C55296xhK.AEQbTJ(view) ? 8388613 : 8388611);
        android.widget.FrameLayout frameLayoutOLrzqt = c16595emr.AxsJAY.getRoot();
        frameLayoutOLrzqt.setOnClickListener(new PictureInPictureParams(frameLayoutOLrzqt, 1000L, this));
        android.widget.FrameLayout frameLayout = c16595emr.valueOf;
        frameLayout.setOnClickListener(new VoiceInteractor(frameLayout, 1000L, this));
        C55230xfy c55230xfy = c16595emr.AuCTelauCTel;
        Intrinsics.checkNotNullExpressionValue(c55230xfy, "");
        c55230xfy.setVisibility(true ^ hDKMBd() ? 0 : 8);
        if (!hDKMBd()) {
            c16595emr.AuCTelauCTel.setTransitionName("wallet_search_container_oksearchbar_global");
            C55230xfy c55230xfy2 = c16595emr.AuCTelauCTel;
            c55230xfy2.setOnClickListener(new TaskStackBuilder(c55230xfy2, 1000L, this, c16595emr, "wallet_search_container_oksearchbar_global"));
            c16595emr.AuCTelauCTel.setOnSearchBarClick(new Function0() { // from class: o.ePN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ePI.AEQbTJ();
                }
            });
        }
        android.view.ViewTreeObserver viewTreeObserver = c16595emr.ORxRYg.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new SharedElementCallback(c16595emr, this));
        }
        AuCTel();
        uzCIH();
        zuBGHE();
        AxsJAY();
        sSMYrx();
        eUI euiQVAiDq = QVAiDq();
        euiQVAiDq.fARcdN().observe(getViewLifecycleOwner(), new eQU.StateListAnimator(new Function1() { // from class: o.ePL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.djBIcL(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiHomeWalletFragment$initView$2$2(euiQVAiDq, this, null), 3, null);
        euiQVAiDq.getNewProxyInstance().observe(getViewLifecycleOwner(), new eQU.StateListAnimator(new Function1() { // from class: o.ePS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.AhwBna(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        euiQVAiDq.AuCTel().observe(getViewLifecycleOwner(), new eQU.StateListAnimator(new Function1() { // from class: o.ePT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.djBIcL(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        euiQVAiDq.hDKMBd().observe(getViewLifecycleOwner(), new eQU.StateListAnimator(new Function1() { // from class: o.ePR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.gEmmrt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        euiQVAiDq.uzCIH().observe(getViewLifecycleOwner(), new eQU.StateListAnimator(new Function1() { // from class: o.ePU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.DbNXlk(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        ORxRYg().AYXKKw().observe(getViewLifecycleOwner(), new eQU.StateListAnimator(new Function1() { // from class: o.ePY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.OLrzqt(this.OLrzqt, (AbstractC18810fpT) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new DefiHomeWalletFragment$initView$2$8(this, euiQVAiDq, null), 3, null);
        RJOkX().AEQbTJ().observe(getViewLifecycleOwner(), new eQU.StateListAnimator(new Function1() { // from class: o.ePW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.gEmmrt(this.OLrzqt, (java.util.List) obj);
            }
        }));
        ORxRYg().valueOf();
        djBIcL();
    }

    public static final Unit AEQbTJ() {
        C32866mlf.onEvent$default("HomePage_GlobalSearch_InputBox_Click", (TrackChannel[]) null, new Function1() { // from class: o.eQx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("source_id", "home", true);
        return Unit.INSTANCE;
    }

    public static final class SharedElementCallback implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ C16595emr KWHzl;
        public final /* synthetic */ ePI copydefault;

        public SharedElementCallback(C16595emr c16595emr, ePI epi) {
            this.KWHzl = c16595emr;
            this.copydefault = epi;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.KWHzl.ORxRYg.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            java.lang.String strDjBIcL = this.KWHzl.QOLQEE.djBIcL();
            if (strDjBIcL != null) {
                this.copydefault.AYXKKw(strDjBIcL);
            }
        }
    }

    public static final Unit djBIcL(ePI epi, AbstractC12782ctV abstractC12782ctV) {
        Group group;
        if (abstractC12782ctV == null) {
            return Unit.INSTANCE;
        }
        RxBus.KWHzl("changedWallet");
        epi.values(abstractC12782ctV);
        epi.fetchVPNInfo(abstractC12782ctV);
        C16595emr c16595emr = epi.AhwBna;
        if (c16595emr != null && (group = c16595emr.fJNWhG) != null) {
            group.setVisibility((!abstractC12782ctV.zLjUOn() || (epi.getNewProxyInstance() && epi.QUSxYX())) ? 8 : 0);
        }
        if (epi.QVAiDq().AuCTelauCTel()) {
            epi.wlaJM();
            epi.QVAiDq().AYXKKw(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ePI epi, java.lang.Boolean bool) {
        C18095fbt c18095fbt;
        oXR oxrEZpvd;
        C14783drv c14783drv;
        C14706dqX c14706dqX;
        epi.DbNXlk(epi.fIwbmz);
        C16595emr c16595emr = epi.AhwBna;
        if (c16595emr != null && (c14706dqX = c16595emr.fARcdN) != null) {
            c14706dqX.AEQbTJ();
        }
        C16595emr c16595emr2 = epi.AhwBna;
        if (c16595emr2 != null && (c14783drv = c16595emr2.hDKMBd) != null) {
            c14783drv.copydefault();
        }
        C16595emr c16595emr3 = epi.AhwBna;
        if (c16595emr3 != null && (c18095fbt = c16595emr3.AkhnZx) != null && (oxrEZpvd = c18095fbt.EZpvd()) != null) {
            oxrEZpvd.setMaxMinLabelsAlpha((Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) ? 1 : 0) * 255);
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(ePI epi, java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            epi.RJOkX().copydefault();
        } else {
            epi.RJOkX().OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ePI epi, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            epi.valueOf();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(ePI epi, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            epi.AhwBna();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ePI epi, AbstractC18810fpT abstractC18810fpT) {
        if (abstractC18810fpT instanceof AbstractC18810fpT.ActionBar) {
            epi.AhwBna(((AbstractC18810fpT.ActionBar) abstractC18810fpT).OLrzqt());
            epi.ORxRYg().EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ePI epi, java.util.List list) {
        epi.zLjUOn();
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
    public final void djBIcL() {
        java.lang.Object objM7377constructorimpl;
        final OKAlertBanner oKAlertBanner;
        OKAlertBanner oKAlertBanner2 = null;
        android.graphics.drawable.Drawable drawable = null;
        oKAlertBanner2 = null;
        WalletStatus walletStatusFetchVPNInfo = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).fetchVPNInfo();
        CredentialState credentialState = this.EZpvd;
        C15689eRq c15689eRq = C15689eRq.KWHzl;
        pUU.copydefault("zqh", "deviceDataMigration credentialState = " + credentialState + " : showDeviceDataMigration = " + c15689eRq.AEQbTJ() + " : walletStatus = " + walletStatusFetchVPNInfo);
        if (walletStatusFetchVPNInfo == WalletStatus.RealWallets && this.EZpvd == CredentialState.SECRET_KEY_NOT_EXISTS && !c15689eRq.AEQbTJ()) {
            try {
                Result.Application application = Result.Companion;
                C16595emr c16595emr = this.AhwBna;
                if (c16595emr != null && (oKAlertBanner = c16595emr.OLrzqt) != null) {
                    oKAlertBanner.setVisibility(0);
                    oKAlertBanner.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.invalidateMenu));
                    oKAlertBanner.setMessage(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onActivityResult));
                    android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(requireContext(), C52761wXj.TaskDescription.UPzgla);
                    if (drawable2 != null) {
                        DrawableCompat.setTint(drawable2, ContextCompat.getColor(requireContext(), C52761wXj.Activity.zblBkD));
                        drawable = drawable2;
                    }
                    oKAlertBanner.setLeadingIcon(drawable);
                    oKAlertBanner.setPrimaryAction(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onCreate), new Function0() { // from class: o.eQh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return ePI.EZpvd(oKAlertBanner, this);
                        }
                    });
                    android.widget.ImageView imageViewOLrzqt = oKAlertBanner.OLrzqt();
                    imageViewOLrzqt.setOnClickListener(new Dialog(imageViewOLrzqt, 1000L, oKAlertBanner));
                    oKAlertBanner2 = oKAlertBanner;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(oKAlertBanner2);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault(getTAG(), "deviceDataMigration error: " + thM7380exceptionOrNullimpl.getMessage());
            }
        }
    }

    public static final Unit EZpvd(OKAlertBanner oKAlertBanner, ePI epi) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            C15730eTd c15730eTdEZpvd = C15730eTd.Companion.EZpvd();
            androidx.fragment.app.FragmentManager parentFragmentManager = epi.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            c15730eTdEZpvd.show(parentFragmentManager);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(epi.getTAG(), "deviceDataMigration primaryButton error: " + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final C16595emr c16595emr, final ePI epi) {
        C15890eZb c15890eZbCopydefault = C15890eZb.Companion.copydefault(c16595emr.fARcdN.copydefault(), new Function1() { // from class: o.eQq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.copydefault(c16595emr, epi, (java.lang.String) obj);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = epi.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c15890eZbCopydefault.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C16595emr c16595emr, ePI epi, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            c16595emr.fARcdN.setPeriodType(str);
            epi.KWHzl("setPeriodType", 1);
        }
        return Unit.INSTANCE;
    }

    public static final Unit ORxRYg(ePI epi) {
        epi.KWHzl("retryAnalysis", 1);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.eXn.ActionBar.startActivity$default(o.eXn$ActionBar, android.content.Context, java.lang.String, int, long, java.util.ArrayList, int, java.lang.Object):void */
    public static final Unit djBIcL(C16595emr c16595emr, ePI epi) {
        java.lang.String strDbNXlk;
        ActivityC15848eXn.ActionBar actionBar = ActivityC15848eXn.Companion;
        android.content.Context context = c16595emr.hDKMBd.getContext();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(context, "");
        AbstractC12782ctV abstractC12782ctV = epi.fIwbmz;
        if (abstractC12782ctV != null && (strDbNXlk = abstractC12782ctV.DbNXlk()) != null) {
            str = strDbNXlk;
        }
        ActivityC15848eXn.ActionBar.startActivity$default(actionBar, context, str, 2, c16595emr.hDKMBd.KWHzl(), null, 16, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C16595emr c16595emr, ePI epi) {
        ChainAddress chainAddress;
        WalletPnlAnalysisResponse walletPnlAnalysisResponseEZpvd = c16595emr.fARcdN.EZpvd();
        if (walletPnlAnalysisResponseEZpvd == null) {
            return Unit.INSTANCE;
        }
        AbstractC12782ctV value = epi.QVAiDq().fARcdN().getValue();
        if (value == null || (chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(value, epi.QVAiDq().ejfBZ(), null, 2, null)) == null) {
            return Unit.INSTANCE;
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(chainAddress.getCoinId()));
        if (c10854bwMKWHzl != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(epi), null, null, new DefiHomeWalletFragment$initPnlViewAndCollectPnlData$1$3$1(epi, c16595emr, walletPnlAnalysisResponseEZpvd, c10854bwMKWHzl, chainAddress, null), 3, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [487=5] */
    public final void AuCTel() {
        final C16595emr c16595emr = this.AhwBna;
        if (c16595emr == null) {
            return;
        }
        c16595emr.fARcdN.setOnPeriodTypeClick(new Function0() { // from class: o.eQD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ePI.copydefault(c16595emr, this);
            }
        });
        c16595emr.fARcdN.setOnRetryCallBack(new Function0() { // from class: o.eQJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ePI.ORxRYg(this.OLrzqt);
            }
        });
        c16595emr.fARcdN.setOnChartShareClickListener(new Function0() { // from class: o.eQW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ePI.AEQbTJ(c16595emr, this);
            }
        });
        c16595emr.hDKMBd.setPnlListDetailCallback(new Function0() { // from class: o.eQX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ePI.djBIcL(c16595emr, this);
            }
        });
        c16595emr.hDKMBd.setPnlListRetryCallback(new Function0() { // from class: o.eQV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ePI.QKVWgx(this.AEQbTJ);
            }
        });
        WalletPnlDataViewModel walletPnlDataViewModelAkhnZx = AkhnZx();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$1(this, walletPnlDataViewModelAkhnZx, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$2(this, walletPnlDataViewModelAkhnZx, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$3(this, walletPnlDataViewModelAkhnZx, null), 3, null);
    }

    public static final Unit QKVWgx(ePI epi) {
        epi.KWHzl("retryPnlList", 2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean QUSxYX() {
        return AkhnZx().AEQbTJ(QVAiDq().fARcdN().getValue(), QVAiDq().ejfBZ(), QVAiDq().fJNWhG());
    }

    public final boolean iwGUEr() {
        return C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).AEQbTJ(QVAiDq().fJNWhG());
    }

    public static /* synthetic */ void loadPnlTokenData$default(ePI epi, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        epi.KWHzl(str, i);
    }

    public final void KWHzl(java.lang.String str, int i) {
        AbstractC12782ctV value = QVAiDq().fARcdN().getValue();
        if (value != null && QbewEr().AYXKKw().getValue().booleanValue() && QUSxYX()) {
            if (i == 0) {
                valueOf(this, value);
                AYXKKw(this, value);
            } else if (i == 1) {
                valueOf(this, value);
            } else {
                if (i != 2) {
                    return;
                }
                AYXKKw(this, value);
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dqX.setData$default(o.dqX, com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse, int, boolean, int, java.lang.Object):void */
    public static final void valueOf(ePI epi, AbstractC12782ctV abstractC12782ctV) {
        C14706dqX c14706dqX;
        C14706dqX c14706dqX2;
        C16595emr c16595emr = epi.AhwBna;
        if (c16595emr != null && (c14706dqX2 = c16595emr.fARcdN) != null) {
            C14706dqX.setData$default(c14706dqX2, null, 1, false, 4, null);
        }
        WalletPnlDataViewModel walletPnlDataViewModelAkhnZx = epi.AkhnZx();
        C16595emr c16595emr2 = epi.AhwBna;
        java.lang.String strCopydefault = (c16595emr2 == null || (c14706dqX = c16595emr2.fARcdN) == null) ? null : c14706dqX.copydefault();
        Intrinsics.copydefault((java.lang.Object) strCopydefault);
        walletPnlDataViewModelAkhnZx.copydefault(strCopydefault, abstractC12782ctV.DbNXlk(), abstractC12782ctV.EZpvd(epi.QVAiDq().ejfBZ()), epi.QVAiDq().ejfBZ());
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.drv.setData$default(o.drv, java.lang.String, java.util.List, int, boolean, int, java.lang.Object):void */
    public static final void AYXKKw(ePI epi, AbstractC12782ctV abstractC12782ctV) {
        C14783drv c14783drv;
        C16595emr c16595emr = epi.AhwBna;
        if (c16595emr != null && (c14783drv = c16595emr.hDKMBd) != null) {
            C14783drv.setData$default(c14783drv, "", null, 1, false, 8, null);
        }
        epi.AkhnZx().AEQbTJ(abstractC12782ctV.DbNXlk(), epi.QVAiDq().ejfBZ(), (60 & 4) != 0 ? 1 : 0, (60 & 8) != 0 ? false : false, (60 & 16) != 0 ? 0 : 0, (60 & 32) != 0 ? 3 : 0);
    }

    public final void copydefault(long j) {
        C14697dqO c14697dqO;
        C14697dqO c14697dqO2;
        C14697dqO c14697dqO3;
        xWV xwv;
        AbstractC12782ctV value = QVAiDq().fARcdN().getValue();
        if (value == null) {
            return;
        }
        C14687dqE c14687dqE = C14687dqE.OLrzqt;
        boolean z = !c14687dqE.isConnected();
        boolean z2 = (C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl(value) || c14687dqE.AkhnZx() || (xwv = (xWV) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(xWV.class))) == null || !xwv.copydefault()) ? false : true;
        if (j == Long.MIN_VALUE) {
            C16595emr c16595emr = this.AhwBna;
            if (c16595emr == null || (c14697dqO3 = c16595emr.KWHzl) == null) {
                return;
            }
            c14697dqO3.setData(AbstractC12782ctV.getCoinAssetValuation$default(value, "opened", false, 2, null), value.DCJXGO(), z, value.KWHzl(z2, true), z2);
            return;
        }
        if (j >= 0) {
            C16595emr c16595emr2 = this.AhwBna;
            if (c16595emr2 == null || (c14697dqO2 = c16595emr2.KWHzl) == null) {
                return;
            }
            c14697dqO2.setData(value.KWHzl("opened", j), value.AuCTel(j), z, value.EZpvd(z2, true, j), z2);
            return;
        }
        C16595emr c16595emr3 = this.AhwBna;
        if (c16595emr3 == null || (c14697dqO = c16595emr3.KWHzl) == null) {
            return;
        }
        c14697dqO.setData("0", "0", z, "0", z2);
    }

    public final void uzCIH() {
        final LiveData<java.util.List<ApproveItem>> liveDataAEQbTJ;
        if (this.EZpvd == CredentialState.SECRET_KEY_NOT_EXISTS) {
            return;
        }
        if (eLJ.Companion.AEQbTJ()) {
            liveDataAEQbTJ = C15530eLt.ActionBar.getInstance$default(C15530eLt.Companion, null, 1, null).copydefault();
        } else {
            liveDataAEQbTJ = C15523eLm.KWHzl.AEQbTJ();
        }
        this.KWHzl.addSource(QVAiDq().isConnected(), new eQU.StateListAnimator(new Function1() { // from class: o.eQu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.KWHzl(liveDataAEQbTJ, this, (java.lang.Boolean) obj);
            }
        }));
        this.KWHzl.addSource(liveDataAEQbTJ, new eQU.StateListAnimator(new Function1() { // from class: o.eQy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.valueOf(this.copydefault, (java.util.List) obj);
            }
        }));
        this.KWHzl.observe(getViewLifecycleOwner(), new eQU.StateListAnimator(new Function1() { // from class: o.eQv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.copydefault(this.OLrzqt, (kotlin.Pair) obj);
            }
        }));
    }

    public static final Unit KWHzl(LiveData liveData, ePI epi, java.lang.Boolean bool) {
        epi.KWHzl.setValue(C56390yDp.OLrzqt(bool, (java.util.List) liveData.getValue()));
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ePI epi, java.util.List list) {
        java.lang.Boolean value = epi.QVAiDq().isConnected().getValue();
        epi.KWHzl.setValue(C56390yDp.OLrzqt(java.lang.Boolean.valueOf(value != null ? value.booleanValue() : false), list));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ePI epi, kotlin.Pair pair) {
        boolean zBooleanValue = ((java.lang.Boolean) pair.component1()).booleanValue();
        java.util.List<ApproveItem> list = (java.util.List) pair.component2();
        if (zBooleanValue && list != null) {
            epi.OLrzqt.onChanged(list);
        }
        return Unit.INSTANCE;
    }

    public final Job zuBGHE() {
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeWalletFragment$subscribeKLineStateChange$1(this, null), 3, null);
    }

    public final void fARcdN() {
        copydefault(false);
    }

    public final void isConnected() {
        C18095fbt c18095fbt;
        LottieAnimationView lottieAnimationView;
        oXR oxr;
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr != null && (oxr = c16595emr.gHZMYf) != null) {
            oxr.setVisibility(8);
        }
        C16595emr c16595emr2 = this.AhwBna;
        if (c16595emr2 != null && (lottieAnimationView = c16595emr2.AwvSrB) != null) {
            lottieAnimationView.setVisibility(8);
        }
        C16595emr c16595emr3 = this.AhwBna;
        if (c16595emr3 == null || (c18095fbt = c16595emr3.AkhnZx) == null) {
            return;
        }
        c18095fbt.OLrzqt(new Function0() { // from class: o.ePQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ePI.QOLQEE(this.EZpvd);
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ffN.fetchKLineState$default(o.ffN, o.ffJ, o.ctV, int, java.lang.Object):void */
    public static final Unit QOLQEE(ePI epi) {
        C18275ffN.fetchKLineState$default(epi.QbewEr(), InterfaceC18271ffJ.Application.EZpvd, null, 2, null);
        return Unit.INSTANCE;
    }

    public final void ejfBZ() {
        LottieAnimationView lottieAnimationView;
        oXR oxr;
        C18095fbt c18095fbt;
        if (getNewProxyInstance()) {
            C16595emr c16595emr = this.AhwBna;
            if (c16595emr != null && (c18095fbt = c16595emr.AkhnZx) != null) {
                c18095fbt.AhwBna();
            }
        } else {
            C16595emr c16595emr2 = this.AhwBna;
            if (c16595emr2 != null && (oxr = c16595emr2.gHZMYf) != null) {
                oxr.setVisibility(8);
            }
            C16595emr c16595emr3 = this.AhwBna;
            if (c16595emr3 != null && (lottieAnimationView = c16595emr3.AwvSrB) != null) {
                lottieAnimationView.setVisibility(0);
            }
        }
        copydefault(true);
    }

    public static final Unit copydefault(ePI epi, int i) {
        if (i == -1) {
            return Unit.INSTANCE;
        }
        C18275ffN.fetchKLineState$default(epi.QbewEr(), new InterfaceC18271ffJ.Activity(i), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fat.setText$default(o.fat, java.math.BigDecimal, java.math.BigDecimal, int, int, java.lang.Object):void */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [810=6] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(ePI epi, C16595emr c16595emr, BigDecimal bigDecimal) {
        int iEZpvd;
        AbstractC18281ffT value = epi.QbewEr().copydefault().getValue();
        AbstractC18281ffT.Activity activity = value instanceof AbstractC18281ffT.Activity ? (AbstractC18281ffT.Activity) value : null;
        if (activity == null) {
            pUU.KWHzl(epi.getTAG(), "klineInteractionActiveDataPointListener: kLineState is not KLineShown " + epi.QbewEr().copydefault().getValue());
            return Unit.INSTANCE;
        }
        if (bigDecimal == null) {
            epi.AYXKKw = false;
            C18042fat c18042fat = c16595emr.uzCIH;
            BigDecimal bigDecimalKWHzl = activity.KWHzl();
            BigDecimal bigDecimalCopydefault = activity.copydefault();
            android.content.Context context = c18042fat.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c18042fat.setText(bigDecimalKWHzl, bigDecimalCopydefault, epi.copydefault(activity, context));
            ChartData chartDataAEQbTJ = activity.AEQbTJ();
            if (chartDataAEQbTJ != null) {
                epi.valueOf(chartDataAEQbTJ.getAssetAmount());
            }
        } else {
            epi.AYXKKw = true;
            java.util.List<ChartData> listEZpvd = C18283ffV.EZpvd(activity);
            java.lang.Boolean boolEZpvd = activity.EZpvd();
            boolean zBooleanValue = boolEZpvd != null ? boolEZpvd.booleanValue() : false;
            if (listEZpvd.isEmpty()) {
                C18042fat c18042fat2 = c16595emr.uzCIH;
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                C18042fat.setText$default(c18042fat2, bigDecimal2, bigDecimal2, 0, 4, null);
            } else {
                BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(((ChartData) CollectionsKt___CollectionsKt.AuCTelauCTel(listEZpvd)).getAssetAmount());
                BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimalEZpvd);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "");
                if (zBooleanValue) {
                    BigDecimal bigDecimalMultiply = BigDecimal.ZERO;
                    if (!C33129mqd.OLrzqt(bigDecimalEZpvd, bigDecimalMultiply)) {
                        if (!zBooleanValue) {
                            BigDecimal bigDecimal3 = BigDecimal.ZERO;
                            if (C33129mqd.OLrzqt(bigDecimalEZpvd, bigDecimal3)) {
                                if (C33129mqd.AhwBna(bigDecimalSubtract, bigDecimal3)) {
                                    bigDecimal3 = new BigDecimal(100);
                                }
                                bigDecimalMultiply = bigDecimal3;
                            } else {
                                BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalEZpvd, RoundingMode.HALF_EVEN);
                                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "");
                                bigDecimalMultiply = bigDecimalDivide.multiply(new BigDecimal(100));
                                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
                            }
                        }
                    }
                    if (bigDecimal.compareTo(bigDecimalEZpvd) > 0) {
                        C18042fat.TaskDescription taskDescription = C18042fat.Companion;
                        android.content.Context context2 = c16595emr.uzCIH.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        iEZpvd = taskDescription.OLrzqt(context2);
                    } else if (bigDecimal.compareTo(bigDecimalEZpvd) < 0) {
                        C18042fat.TaskDescription taskDescription2 = C18042fat.Companion;
                        android.content.Context context3 = c16595emr.uzCIH.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "");
                        iEZpvd = taskDescription2.AEQbTJ(context3);
                    } else {
                        C18042fat.TaskDescription taskDescription3 = C18042fat.Companion;
                        android.content.Context context4 = c16595emr.uzCIH.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "");
                        iEZpvd = taskDescription3.EZpvd(context4);
                    }
                    c16595emr.uzCIH.setText(bigDecimalSubtract, bigDecimalMultiply, iEZpvd);
                }
            }
            java.lang.String plainString = bigDecimal.toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "");
            epi.valueOf(plainString);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oXR.setData$default(o.oXR, java.util.List, boolean, boolean, o.oXM, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [810=9] */
    public final void KWHzl(AbstractC18281ffT.Activity activity) {
        oXR oxr;
        final C16595emr c16595emr = this.AhwBna;
        if (c16595emr != null) {
            c16595emr.fIwbmz.setText(QbewEr().AEQbTJ());
            c16595emr.AkhnZx.setTimeAxisData(QbewEr().OLrzqt());
            c16595emr.AkhnZx.copydefault(new Function1() { // from class: o.eQK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ePI.copydefault(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            });
            if (c16595emr.AkhnZx.copydefault() == null) {
                c16595emr.AkhnZx.setKlineInteractionActiveDataPointListener(new Function1() { // from class: o.eQN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ePI.EZpvd(this.KWHzl, c16595emr, (BigDecimal) obj);
                    }
                });
            }
            c16595emr.AkhnZx.setFirstTimeLoad(this.valueOf && (activity.OLrzqt().isEmpty() ^ true));
            c16595emr.AkhnZx.setData(C18283ffV.EZpvd(activity), true);
            LottieAnimationView lottieAnimationView = c16595emr.AwvSrB;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
            lottieAnimationView.setVisibility(activity.OLrzqt().isEmpty() ? 0 : 8);
            if (!this.AYXKKw) {
                C18042fat c18042fat = c16595emr.uzCIH;
                BigDecimal bigDecimalKWHzl = activity.KWHzl();
                BigDecimal bigDecimalCopydefault = activity.copydefault();
                android.content.Context context = c18042fat.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c18042fat.setText(bigDecimalKWHzl, bigDecimalCopydefault, copydefault(activity, context));
                ChartData chartDataAEQbTJ = activity.AEQbTJ();
                if (chartDataAEQbTJ != null) {
                    valueOf(chartDataAEQbTJ.getAssetAmount());
                }
            }
        }
        if (!activity.OLrzqt().isEmpty()) {
            java.util.List listOLrzqt = C14721dqm.OLrzqt(C18283ffV.EZpvd(activity), 12);
            C16595emr c16595emr2 = this.AhwBna;
            if (c16595emr2 != null && (oxr = c16595emr2.gHZMYf) != null) {
                oxr.setVisibility(0);
                oxr.setDrawOption(oXO.AEQbTJ.AEQbTJ(!C33492mxV.OLrzqt(), C33512mxp.AEQbTJ.isConnected() == 0, Intrinsics.EZpvd(activity.AYXKKw(), java.lang.Boolean.TRUE)));
                oxr.setData(listOLrzqt, (104 & 2) != 0 ? false : this.valueOf, (104 & 4) != 0 ? false : true, (104 & 8) != 0 ? oXM.Companion.OLrzqt() : null, new Function1() { // from class: o.eQL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Float.valueOf(ePI.KWHzl((ChartData) obj));
                    }
                }, (104 & 32) != 0 ? new Function1() { // from class: o.oXX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return oXR.KWHzl(obj);
                    }
                } : null, (104 & 64) != 0 ? new Function1() { // from class: o.oXT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return oXR.copydefault(obj);
                    }
                } : null);
            }
            this.valueOf = false;
        }
        copydefault(true);
    }

    public static final float KWHzl(ChartData chartData) {
        Intrinsics.checkNotNullParameter(chartData, "");
        return java.lang.Float.parseFloat(chartData.getAssetAmount());
    }

    public final int copydefault(AbstractC18281ffT.Activity activity, android.content.Context context) {
        if (activity.AYXKKw() != null && activity.KWHzl() != null && activity.copydefault() != null) {
            BigDecimal bigDecimalKWHzl = activity.KWHzl();
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (!C33129mqd.OLrzqt(bigDecimalKWHzl, bigDecimal) || !C33129mqd.OLrzqt(activity.copydefault(), bigDecimal)) {
                return Intrinsics.EZpvd(activity.AYXKKw(), java.lang.Boolean.TRUE) ? C18042fat.Companion.OLrzqt(context) : C18042fat.Companion.AEQbTJ(context);
            }
        }
        return C18042fat.Companion.EZpvd(context);
    }

    public final void valueOf(java.lang.String str) {
        java.lang.String valuationFromAsset$default = C54880xYt.formatValuationFromAsset$default(str, null, false, C14455dll.KWHzl.OLrzqt(str), false, 11, null);
        this.zsXlph = str;
        this.AubY = valuationFromAsset$default;
        AYXKKw(C13821dZn.EZpvd.OLrzqt(valuationFromAsset$default));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gEmmrt(final AbstractC12782ctV abstractC12782ctV) {
        boolean z;
        WalletHomeDialogQueueManager walletHomeDialogQueueManagerDbNXlk;
        dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
        if (dtq != null) {
            z = dtq.OLrzqt(abstractC12782ctV.DbNXlk());
        }
        boolean zAxsJAY = QVAiDq().AxsJAY();
        if (!z || zAxsJAY || (walletHomeDialogQueueManagerDbNXlk = DbNXlk()) == null) {
            return;
        }
        walletHomeDialogQueueManagerDbNXlk.OLrzqt(WalletHomeDialogQueueManager.DialogPriority.SA_GUIDE, "SA_GUIDE", new Function0() { // from class: o.ePV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ePI.KWHzl(abstractC12782ctV, this));
            }
        }, new Function0() { // from class: o.ePX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ePI.AEQbTJ(abstractC12782ctV, this);
            }
        });
    }

    public static final boolean KWHzl(AbstractC12782ctV abstractC12782ctV, ePI epi) {
        return abstractC12782ctV.zLjUOn() && !SPUtils.getBoolean("TEE_SHOW_GUILD_KEY", false) && epi.isVisible() && !epi.isDetached();
    }

    public static final Unit AEQbTJ(AbstractC12782ctV abstractC12782ctV, final ePI epi) {
        fST fstKWHzl = fST.Companion.KWHzl(new ActivateTeeGuideModel(abstractC12782ctV.DbNXlk(), false, false, (java.lang.String) null, 0, 1, 0, "sa_wallet_onboarding", 94, (DefaultConstructorMarker) null));
        fstKWHzl.AEQbTJ(new Function0() { // from class: o.ePZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ePI.sSMYrx(this.KWHzl);
            }
        });
        fstKWHzl.show(epi.getParentFragmentManager(), "SA_GUIDE");
        return Unit.INSTANCE;
    }

    public static final Unit sSMYrx(ePI epi) {
        WalletHomeDialogQueueManager walletHomeDialogQueueManagerDbNXlk = epi.DbNXlk();
        if (walletHomeDialogQueueManagerDbNXlk != null) {
            walletHomeDialogQueueManagerDbNXlk.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna(final java.lang.String str) {
        WalletHomeDialogQueueManager walletHomeDialogQueueManagerDbNXlk = DbNXlk();
        if (walletHomeDialogQueueManagerDbNXlk != null) {
            walletHomeDialogQueueManagerDbNXlk.OLrzqt(WalletHomeDialogQueueManager.DialogPriority.TERMS_VERSION, "TERMS_VERSION", new Function0() { // from class: o.eQg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(ePI.gHZMYf(this.OLrzqt));
                }
            }, new Function0() { // from class: o.eQj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ePI.copydefault(str, this);
                }
            });
        }
    }

    public static final boolean gHZMYf(ePI epi) {
        return epi.isVisible() && !epi.isDetached();
    }

    public static final Unit copydefault(java.lang.String str, final ePI epi) {
        try {
            C18813fpW c18813fpWCopydefault = C18813fpW.Companion.copydefault(str);
            c18813fpWCopydefault.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.ePJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    ePI.AYXKKw(this.OLrzqt, dialogInterface);
                }
            });
            c18813fpWCopydefault.show(epi.getParentFragmentManager(), "WalletTermsUpdateBottomSheet");
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ(epi.getTAG(), "CheckTermsVersionBottomSheet", th);
        }
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(ePI epi, android.content.DialogInterface dialogInterface) {
        WalletHomeDialogQueueManager walletHomeDialogQueueManagerDbNXlk = epi.DbNXlk();
        if (walletHomeDialogQueueManagerDbNXlk != null) {
            walletHomeDialogQueueManagerDbNXlk.KWHzl();
        }
    }

    public final void valueOf() {
        WalletHomeDialogQueueManager walletHomeDialogQueueManagerDbNXlk = DbNXlk();
        if (walletHomeDialogQueueManagerDbNXlk != null) {
            walletHomeDialogQueueManagerDbNXlk.OLrzqt(WalletHomeDialogQueueManager.DialogPriority.VERIFY_WALLET, "VERIFY_WALLET", new Function0() { // from class: o.eQo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(ePI.AwvSrB(this.OLrzqt));
                }
            }, new Function0() { // from class: o.eQn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ePI.DTwDnp(this.OLrzqt);
                }
            });
        }
    }

    public static final boolean AwvSrB(ePI epi) {
        return (epi.QVAiDq().djBIcL() || !epi.isVisible() || epi.isDetached()) ? false : true;
    }

    public static final Unit DTwDnp(ePI epi) {
        epi.AuCTelauCTel();
        return Unit.INSTANCE;
    }

    public final void AuCTelauCTel() {
        if (QVAiDq().djBIcL()) {
            return;
        }
        QVAiDq().AEQbTJ(true);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.setTitle(C13754dXa.FragmentManager.HrMTQN);
        viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.fzHEvu);
        viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.gLWkOL, new View.OnClickListener() { // from class: o.ePH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ePI.KWHzl(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.AxsJAYsNCnLh, new View.OnClickListener() { // from class: o.ePP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ePI.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.ePM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                ePI.djBIcL(this.AEQbTJ, dialogInterface);
            }
        });
        try {
            if (!isVisible() || isDetached()) {
                return;
            }
            viewOnClickListenerC54939xaY.show();
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "showVerifyDialog", e);
        }
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, ePI epi, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        androidx.fragment.app.FragmentManager childFragmentManager = epi.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        new C14461dlr(childFragmentManager, "showVerifyDialog-home", new Function1() { // from class: o.eQP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.gEmmrt((java.lang.String) obj);
            }
        }, new Function0() { // from class: o.eQQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ePI.EZpvd();
            }
        }, null, false, 48, null).EZpvd();
    }

    public static final Unit gEmmrt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toastWithSuccessfulIcon$default(C13754dXa.FragmentManager.onStatusChanged, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void djBIcL(ePI epi, android.content.DialogInterface dialogInterface) {
        WalletHomeDialogQueueManager walletHomeDialogQueueManagerDbNXlk = epi.DbNXlk();
        if (walletHomeDialogQueueManagerDbNXlk != null) {
            walletHomeDialogQueueManagerDbNXlk.KWHzl();
        }
    }

    public final void AhwBna() {
        WalletHomeDialogQueueManager walletHomeDialogQueueManagerDbNXlk = DbNXlk();
        if (walletHomeDialogQueueManagerDbNXlk != null) {
            walletHomeDialogQueueManagerDbNXlk.OLrzqt(WalletHomeDialogQueueManager.DialogPriority.BACKUP_REMINDER, "BACKUP_REMINDER", new Function0() { // from class: o.eQG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(ePI.zuBGHE(this.OLrzqt));
                }
            }, new Function0() { // from class: o.eQM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ePI.AxsJAY(this.copydefault);
                }
            });
        }
    }

    public static final boolean zuBGHE(ePI epi) {
        return epi.isVisible() && !epi.isDetached();
    }

    public static final Unit AxsJAY(ePI epi) {
        epi.AubY();
        return Unit.INSTANCE;
    }

    public final void AubY() {
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            try {
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
                viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
                viewOnClickListenerC54939xaY.setCancelable(false);
                viewOnClickListenerC54939xaY.setTitle(C13754dXa.FragmentManager.createHandler);
                viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.ComponentActivityReportFullyDrawnExecutor);
                viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.ComponentActivityReportFullyDrawnExecutorApi1, new View.OnClickListener() { // from class: o.eQm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ePI.AEQbTJ(viewOnClickListenerC54939xaY, activity, view);
                    }
                });
                viewOnClickListenerC54939xaY.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.eQk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(android.content.DialogInterface dialogInterface) {
                        ePI.gEmmrt(this.copydefault, dialogInterface);
                    }
                });
                if (!isVisible() || isDetached()) {
                    return;
                }
                viewOnClickListenerC54939xaY.show();
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ(getTAG(), "showManualBackUpDialog", e);
            }
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, FragmentActivity fragmentActivity, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        ActivityC18768fod.Companion.AEQbTJ(fragmentActivity);
    }

    public static final void gEmmrt(ePI epi, android.content.DialogInterface dialogInterface) {
        WalletHomeDialogQueueManager walletHomeDialogQueueManagerDbNXlk = epi.DbNXlk();
        if (walletHomeDialogQueueManagerDbNXlk != null) {
            walletHomeDialogQueueManagerDbNXlk.KWHzl();
        }
    }

    public static final void EZpvd(final ePI epi, java.util.List list) {
        final eLJ instance$default;
        final InterfaceC9738bbJ interfaceC9738bbJOLrzqt;
        if (!epi.isVisible() || (interfaceC9738bbJOLrzqt = (instance$default = eLJ.StateListAnimator.getInstance$default(eLJ.Companion, null, 1, null)).OLrzqt()) == null || interfaceC9738bbJOLrzqt.zsXlph() || interfaceC9738bbJOLrzqt.QfsBiF()) {
            return;
        }
        java.util.List<ApproveItem> listGEmmrt = instance$default.gEmmrt();
        if (!listGEmmrt.isEmpty()) {
            final java.lang.Long lAEQbTJ = dXK.OLrzqt.AEQbTJ(interfaceC9738bbJOLrzqt.DbNXlk());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = listGEmmrt.iterator();
            while (it.hasNext()) {
                java.lang.Long blackTagAlarmTime = ((ApproveItem) it.next()).getBlackTagAlarmTime();
                if (blackTagAlarmTime != null) {
                    arrayList.add(blackTagAlarmTime);
                }
            }
            final long jLongValue = ((java.lang.Number) CollectionsKt___CollectionsKt.gGvvIC(arrayList)).longValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it2 = listGEmmrt.iterator();
            while (it2.hasNext()) {
                java.lang.Integer blackTagLongTimeDayLimit = ((ApproveItem) it2.next()).getBlackTagLongTimeDayLimit();
                if (blackTagLongTimeDayLimit != null) {
                    arrayList2.add(blackTagLongTimeDayLimit);
                }
            }
            final int iIntValue = ((java.lang.Number) CollectionsKt___CollectionsKt.gGvvIC(arrayList2)).intValue();
            Function0<java.lang.Boolean> function0 = new Function0() { // from class: o.eQl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(ePI.OLrzqt(jLongValue, lAEQbTJ, epi, interfaceC9738bbJOLrzqt, instance$default));
                }
            };
            WalletHomeDialogQueueManager walletHomeDialogQueueManagerDbNXlk = epi.DbNXlk();
            if (walletHomeDialogQueueManagerDbNXlk != null) {
                walletHomeDialogQueueManagerDbNXlk.OLrzqt(WalletHomeDialogQueueManager.DialogPriority.RISKY_APPROVAL, "RISKY_APPROVAL", function0, new Function0() { // from class: o.eQt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ePI.copydefault(interfaceC9738bbJOLrzqt, iIntValue, epi);
                    }
                });
                return;
            }
            return;
        }
        java.util.List<ApproveItem> listValueOf = instance$default.valueOf();
        if (true ^ listValueOf.isEmpty()) {
            dXK dxk = dXK.OLrzqt;
            final java.lang.Long lOLrzqt = dxk.OLrzqt(interfaceC9738bbJOLrzqt.DbNXlk());
            if (lOLrzqt == null) {
                dxk.KWHzl(interfaceC9738bbJOLrzqt.DbNXlk(), java.lang.System.currentTimeMillis());
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it3 = listValueOf.iterator();
            while (it3.hasNext()) {
                java.lang.Long blackTagAlarmGapTime = ((ApproveItem) it3.next()).getBlackTagAlarmGapTime();
                if (blackTagAlarmGapTime != null) {
                    arrayList3.add(blackTagAlarmGapTime);
                }
            }
            final long jLongValue2 = ((java.lang.Number) CollectionsKt___CollectionsKt.gGvvIC(arrayList3)).longValue();
            Function0<java.lang.Boolean> function02 = new Function0() { // from class: o.eQr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(ePI.AEQbTJ(this.copydefault, jLongValue2, lOLrzqt));
                }
            };
            WalletHomeDialogQueueManager walletHomeDialogQueueManagerDbNXlk2 = epi.DbNXlk();
            if (walletHomeDialogQueueManagerDbNXlk2 != null) {
                walletHomeDialogQueueManagerDbNXlk2.OLrzqt(WalletHomeDialogQueueManager.DialogPriority.MALICIOUS_RISKY_APPROVAL, "MALICIOUS_APPROVAL", function02, new Function0() { // from class: o.eQp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ePI.AEQbTJ(interfaceC9738bbJOLrzqt, epi);
                    }
                });
            }
        }
    }

    public static final boolean OLrzqt(long j, java.lang.Long l, ePI epi, InterfaceC9738bbJ interfaceC9738bbJ, eLJ elj) {
        boolean zEZpvd = dXK.OLrzqt.EZpvd();
        if (j != -1 && (l == null || l.longValue() + j < java.lang.System.currentTimeMillis())) {
            zEZpvd = true;
        }
        if (epi.QVAiDq().sSMYrx()) {
            zEZpvd = false;
        }
        Intrinsics.copydefault(interfaceC9738bbJ, "");
        if (C17922fXg.EZpvd((AbstractC12782ctV) interfaceC9738bbJ) instanceof dTK.Application) {
            zEZpvd = zEZpvd && (elj.valueOf().isEmpty() ^ true);
        }
        return epi.isVisible() && zEZpvd;
    }

    public static final Unit copydefault(InterfaceC9738bbJ interfaceC9738bbJ, int i, final ePI epi) {
        dXK dxk = dXK.OLrzqt;
        dxk.AEQbTJ();
        dxk.OLrzqt(interfaceC9738bbJ.DbNXlk(), java.lang.System.currentTimeMillis());
        C13766dXm c13766dXmNewInstance$default = C13766dXm.ActionBar.newInstance$default(C13766dXm.Companion, 0, i, 1, null);
        c13766dXmNewInstance$default.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.ePG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                ePI.valueOf(this.KWHzl, dialogInterface);
            }
        });
        androidx.fragment.app.FragmentManager parentFragmentManager = epi.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c13766dXmNewInstance$default.show(parentFragmentManager);
        C32866mlf.onEvent$default("Web3Approvals_Page_Popup_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void valueOf(ePI epi, android.content.DialogInterface dialogInterface) {
        WalletHomeDialogQueueManager walletHomeDialogQueueManagerDbNXlk = epi.DbNXlk();
        if (walletHomeDialogQueueManagerDbNXlk != null) {
            walletHomeDialogQueueManagerDbNXlk.KWHzl();
        }
    }

    public static final boolean AEQbTJ(ePI epi, long j, java.lang.Long l) {
        return (epi.QVAiDq().sSMYrx() || j == -1 || l == null || l.longValue() + j >= java.lang.System.currentTimeMillis() || !epi.isVisible()) ? false : true;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dXm.ActionBar.newInstance$default(o.dXm$ActionBar, int, int, int, java.lang.Object):o.dXm */
    public static final Unit AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ, final ePI epi) {
        dXK.OLrzqt.KWHzl(interfaceC9738bbJ.DbNXlk(), java.lang.System.currentTimeMillis());
        C13766dXm c13766dXmNewInstance$default = C13766dXm.ActionBar.newInstance$default(C13766dXm.Companion, 1, 0, 2, null);
        c13766dXmNewInstance$default.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.ePO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                ePI.AhwBna(this.copydefault, dialogInterface);
            }
        });
        androidx.fragment.app.FragmentManager parentFragmentManager = epi.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c13766dXmNewInstance$default.show(parentFragmentManager);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(ePI epi, android.content.DialogInterface dialogInterface) {
        WalletHomeDialogQueueManager walletHomeDialogQueueManagerDbNXlk = epi.DbNXlk();
        if (walletHomeDialogQueueManagerDbNXlk != null) {
            walletHomeDialogQueueManagerDbNXlk.KWHzl();
        }
    }

    public final Job AxsJAY() {
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeWalletFragment$subscribeIsKLineExpandedChange$1(this, null), 3, null);
    }

    public final void EZpvd(boolean z) {
        android.widget.FrameLayout frameLayout;
        AbstractC12782ctV abstractC12782ctV;
        AbstractC12782ctV abstractC12782ctV2;
        android.widget.FrameLayout frameLayout2;
        boolean zAEQbTJ = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).AEQbTJ(QVAiDq().fJNWhG());
        if (!z || (abstractC12782ctV = this.fIwbmz) == null || !abstractC12782ctV.zLjUOn() || (abstractC12782ctV2 = this.fIwbmz) == null || abstractC12782ctV2.QfsBiF() || zAEQbTJ) {
            C16595emr c16595emr = this.AhwBna;
            if (c16595emr == null || (frameLayout = c16595emr.AubY) == null) {
                return;
            }
            frameLayout.setVisibility(4);
            return;
        }
        C16595emr c16595emr2 = this.AhwBna;
        if (c16595emr2 == null || (frameLayout2 = c16595emr2.AubY) == null) {
            return;
        }
        frameLayout2.setVisibility(4);
    }

    public final Job sSMYrx() {
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeWalletFragment$subscribeSelectedChartTypeChange$1(this, null), 3, null);
    }

    public static final Unit valueOf(ePI epi, java.lang.String str) {
        AbstractC12782ctV value;
        Intrinsics.checkNotNullParameter(str, "");
        if (epi.AwvSrB() && (value = epi.QVAiDq().fARcdN().getValue()) != null) {
            epi.QbewEr().copydefault(value.DbNXlk(), str);
        }
        return Unit.INSTANCE;
    }

    public final void values(AbstractC12782ctV abstractC12782ctV) {
        AppCompatImageView appCompatImageView;
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr == null || (appCompatImageView = c16595emr.RJOkX) == null) {
            return;
        }
        C14725dqq.copydefault(appCompatImageView, abstractC12782ctV.AEQbTJ(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.eQw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.EZpvd((C5335Nt) obj);
            }
        }, 18.0f);
    }

    public static final Unit EZpvd(C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
        return Unit.INSTANCE;
    }

    public final void zLjUOn() {
        EZpvd(RJOkX().AEQbTJ(QVAiDq().fARcdN().getValue()));
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (!c43453rpa.KWHzl(activity)) {
            this.valueOf = true;
            return;
        }
        if (this.valueOf && AwvSrB()) {
            C18275ffN.fetchKLineState$default(QbewEr(), InterfaceC18271ffJ.Application.EZpvd, null, 2, null);
            DbNXlk(this.fIwbmz);
        }
        if (eLJ.Companion.AEQbTJ()) {
            C15530eLt.ActionBar actionBar = C15530eLt.Companion;
            if (C15530eLt.ActionBar.getInstance$default(actionBar, null, 1, null).AEQbTJ()) {
                C15530eLt instance$default = C15530eLt.ActionBar.getInstance$default(actionBar, null, 1, null);
                AbstractC12782ctV abstractC12782ctV = this.fIwbmz;
                instance$default.KWHzl(abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null);
            }
        }
    }

    public final void values() {
        final java.lang.String str = "fix_wallet_ark_address_20240229";
        if (SPUtils.getBoolean("fix_wallet_ark_address_20240229", false)) {
            return;
        }
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(fetchVPNInfo(), false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.eQe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.AYXKKw(this.KWHzl, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtFetchAllWallets$default.OLrzqt(new InterfaceC58229yxO() { // from class: o.eQd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ePI.copydefault(function1, obj);
            }
        });
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eQc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ePI.EZpvd(str, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eQb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.copydefault(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eQa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ePI.EZpvd(function12, obj);
            }
        });
        Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
        addDisposable(interfaceC58217yxCAEQbTJ);
    }

    public static final InterfaceC58261yxu copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AYXKKw(ePI epi, java.util.List list) {
        java.lang.String address;
        java.lang.String address2;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
            ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, 111L, null, 2, null);
            java.lang.String str = (chainAddress == null || (address2 = chainAddress.getAddress()) == null) ? "" : address2;
            if (str.length() != 0) {
                C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(111L);
                long jAEQbTJ = c10854bwMCopydefault != null ? c10854bwMCopydefault.AEQbTJ() : Long.MIN_VALUE;
                int i = StateListAnimator.copydefault[abstractC12782ctV.QwvEab().ordinal()];
                if (i == 1) {
                    ChainAddress chainAddress2 = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, 1L, null, 2, null);
                    if (chainAddress2 == null || (address = chainAddress2.getAddress()) == null) {
                        address = "";
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) address, (java.lang.Object) str)) {
                        arrayList.add(epi.fetchVPNInfo().AhwBna().KWHzl(abstractC12782ctV.DbNXlk(), jAEQbTJ));
                    }
                } else if (i == 2 && C59449zhJ.startsWith$default(str, EIP1271Verifier.hexPrefix, false, 2, null)) {
                    arrayList.add(epi.fetchVPNInfo().AhwBna().KWHzl(abstractC12782ctV.DbNXlk(), jAEQbTJ));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return C11607cUn.KWHzl(arrayList);
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0);
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final void EZpvd(java.lang.String str, java.lang.Object obj) {
        SPUtils.put(str, java.lang.Boolean.TRUE);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ePI epi, java.lang.Throwable th) {
        pUU.copydefault(epi.getTAG(), "fixArkAddress error message = " + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void fetchVPNInfo(@NotNull AbstractC12782ctV abstractC12782ctV) {
        android.widget.FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AbstractC12782ctV abstractC12782ctV2 = this.fIwbmz;
        boolean z = true;
        boolean z2 = !Intrinsics.EZpvd((java.lang.Object) (abstractC12782ctV2 != null ? abstractC12782ctV2.DbNXlk() : null), (java.lang.Object) abstractC12782ctV.DbNXlk());
        this.fIwbmz = abstractC12782ctV;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeWalletFragment$loadMainWallet$1(this, abstractC12782ctV, null), 3, null);
        boolean zAwvSrB = AwvSrB();
        boolean zAEQbTJ = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).AEQbTJ(QVAiDq().fJNWhG());
        boolean zAEQbTJ2 = C33129mqd.AEQbTJ(java.lang.Integer.valueOf(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AEQbTJ().size()), 1);
        this.iwGUEr = zAEQbTJ2;
        EZpvd(abstractC12782ctV, zAEQbTJ, zAwvSrB, zAEQbTJ2);
        DbNXlk(abstractC12782ctV);
        AYXKKw(abstractC12782ctV);
        EZpvd(QbewEr().AYXKKw().getValue().booleanValue());
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr != null && (frameLayout = c16595emr.AubY) != null) {
            frameLayout.setOnClickListener(new ComponentCallbacks(frameLayout, 1000L, this, abstractC12782ctV));
        }
        if (z2) {
            QbewEr().AEQbTJ(abstractC12782ctV, "loadMainWallet");
            loadPnlTokenData$default(this, "loadMainWallet", 0, 2, null);
            copydefault("loadMainWallet", getNewProxyInstance(), QUSxYX());
        }
        if (zAEQbTJ || !zAwvSrB || z2) {
            QbewEr().AEQbTJ(InterfaceC18271ffJ.TaskDescription.EZpvd, abstractC12782ctV);
            if (!zAEQbTJ && zAwvSrB) {
                z = false;
            }
            this.valueOf = z;
        }
    }

    public final void EZpvd(AbstractC12782ctV abstractC12782ctV, boolean z, boolean z2, boolean z3) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        C16595emr c16595emr = this.AhwBna;
        int i = 0;
        if (c16595emr != null && (appCompatTextView6 = c16595emr.djBIcL) != null) {
            appCompatTextView6.setVisibility(z3 ? 0 : 8);
        }
        C16595emr c16595emr2 = this.AhwBna;
        if (c16595emr2 != null && (appCompatTextView5 = c16595emr2.QbewEr) != null) {
            appCompatTextView5.setVisibility(z3 ? 0 : 8);
        }
        C16595emr c16595emr3 = this.AhwBna;
        if (c16595emr3 != null && (appCompatTextView4 = c16595emr3.QbewEr) != null) {
            appCompatTextView4.setText(C14733dqy.copydefault.AEQbTJ(abstractC12782ctV));
        }
        C16595emr c16595emr4 = this.AhwBna;
        if (c16595emr4 != null && (appCompatTextView3 = c16595emr4.copydefault) != null) {
            appCompatTextView3.setText(abstractC12782ctV.AkhnZx());
        }
        C16595emr c16595emr5 = this.AhwBna;
        if (c16595emr5 != null && (appCompatTextView2 = c16595emr5.QbewEr) != null) {
            appCompatTextView2.invalidate();
        }
        C16595emr c16595emr6 = this.AhwBna;
        if (c16595emr6 != null && (appCompatTextView = c16595emr6.copydefault) != null) {
            appCompatTextView.invalidate();
        }
        C16595emr c16595emr7 = this.AhwBna;
        if (c16595emr7 != null && (appCompatImageView2 = c16595emr7.AYXKKw) != null) {
            appCompatImageView2.setEnabled(!abstractC12782ctV.DCUTEIdCUTEI());
        }
        C16595emr c16595emr8 = this.AhwBna;
        if (c16595emr8 != null && (appCompatImageView = c16595emr8.AYXKKw) != null) {
            if (!z && !z2) {
                i = 8;
            }
            appCompatImageView.setVisibility(i);
        }
        ejfBZ(abstractC12782ctV);
    }

    public final void ejfBZ(AbstractC12782ctV abstractC12782ctV) {
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr == null) {
            return;
        }
        C17927fXl.KWHzl.OLrzqt(C17922fXg.OLrzqt(abstractC12782ctV), c16595emr.isConnected, false, c16595emr.QbewEr, c16595emr.copydefault, c16595emr.djBIcL);
    }

    public final void AkhnZx(AbstractC12782ctV abstractC12782ctV) {
        java.lang.String str;
        AbstractC12782ctV abstractC12782ctV2;
        java.util.List<C10854bwM> listOFhtUX;
        java.lang.Object next;
        java.lang.String strCopydefault;
        java.lang.String str2;
        java.util.ArrayList arrayList;
        java.util.List<C10854bwM> listOFhtUX2;
        java.util.List<C10854bwM> listOFhtUX3;
        C10854bwM c10854bwM;
        java.util.ArrayList<ChainAddress> arrayListFvQaOB;
        C18042fat c18042fat;
        C18042fat c18042fat2;
        C18042fat c18042fat3;
        C18095fbt c18095fbt;
        C16595emr c16595emr = this.AhwBna;
        java.lang.Integer numValueOf = (c16595emr == null || (c18095fbt = c16595emr.AkhnZx) == null) ? null : java.lang.Integer.valueOf(c18095fbt.AEQbTJ());
        C16595emr c16595emr2 = this.AhwBna;
        java.lang.String strAEQbTJ = (c16595emr2 == null || (c18042fat3 = c16595emr2.uzCIH) == null) ? null : c18042fat3.AEQbTJ();
        C16595emr c16595emr3 = this.AhwBna;
        java.lang.String strEZpvd = (c16595emr3 == null || (c18042fat2 = c16595emr3.uzCIH) == null) ? null : c18042fat2.EZpvd();
        C16595emr c16595emr4 = this.AhwBna;
        java.lang.Integer numValueOf2 = (c16595emr4 == null || (c18042fat = c16595emr4.uzCIH) == null) ? null : java.lang.Integer.valueOf(c18042fat.KWHzl());
        java.lang.String str3 = this.zsXlph;
        AbstractC12782ctV abstractC12782ctV3 = this.fIwbmz;
        if (abstractC12782ctV3 == null || (arrayListFvQaOB = abstractC12782ctV3.EZpvd()) == null || arrayListFvQaOB.size() != 1) {
            java.lang.CharSequence charSequenceAEQbTJ = C14733dqy.copydefault.AEQbTJ(abstractC12782ctV);
            AbstractC12782ctV abstractC12782ctV4 = this.fIwbmz;
            str = ((java.lang.Object) charSequenceAEQbTJ) + "-" + (abstractC12782ctV4 != null ? abstractC12782ctV4.AkhnZx() : null);
        } else {
            str = null;
        }
        AbstractC12782ctV abstractC12782ctV5 = this.fIwbmz;
        java.lang.String strAEQbTJ2 = abstractC12782ctV5 != null ? abstractC12782ctV5.AEQbTJ() : null;
        AbstractC12782ctV abstractC12782ctV6 = this.fIwbmz;
        if (abstractC12782ctV6 == null || (listOFhtUX2 = abstractC12782ctV6.OFhtUX()) == null || listOFhtUX2.size() != 1) {
            if (QVAiDq().ejfBZ() != Long.MIN_VALUE && (abstractC12782ctV2 = this.fIwbmz) != null && (listOFhtUX = abstractC12782ctV2.OFhtUX()) != null) {
                java.util.Iterator<T> it = listOFhtUX.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((C10854bwM) next).fetchVPNInfo() == QVAiDq().ejfBZ()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C10854bwM c10854bwM2 = (C10854bwM) next;
                if (c10854bwM2 != null) {
                    strCopydefault = c10854bwM2.copydefault();
                    str2 = strCopydefault;
                }
            }
            str2 = null;
        } else {
            AbstractC12782ctV abstractC12782ctV7 = this.fIwbmz;
            if (abstractC12782ctV7 != null && (listOFhtUX3 = abstractC12782ctV7.OFhtUX()) != null && (c10854bwM = (C10854bwM) CollectionsKt___CollectionsKt.firstOrNull(listOFhtUX3)) != null) {
                strCopydefault = c10854bwM.copydefault();
                str2 = strCopydefault;
            }
            str2 = null;
        }
        if (QbewEr().copydefault().getValue() instanceof AbstractC18281ffT.Activity) {
            AbstractC18281ffT value = QbewEr().copydefault().getValue();
            Intrinsics.copydefault(value, "");
            java.util.List<ChartData> listEZpvd = C18283ffV.EZpvd((AbstractC18281ffT.Activity) value);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (ChartData chartData : listEZpvd) {
                arrayList2.add(new KLineData(java.lang.String.valueOf(chartData.getDateTime()), chartData.getAssetAmount()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        WalletBalanceShareInfo walletBalanceShareInfo = new WalletBalanceShareInfo(numValueOf, strAEQbTJ, strEZpvd, numValueOf2, str3, str, strAEQbTJ2, str2, arrayList);
        AbstractC12782ctV abstractC12782ctV8 = this.fIwbmz;
        java.lang.String strDbNXlk = abstractC12782ctV8 != null ? abstractC12782ctV8.DbNXlk() : null;
        C15911eZw.KWHzl(this, walletBalanceShareInfo, strDbNXlk != null ? strDbNXlk : "", new Context());
    }

    public static final class Context implements InterfaceC13655dTj {
        public Context() {
        }

        @Override // o.InterfaceC13655dTj
        public void copydefault() {
            ePI.this.UeEOUB();
        }

        @Override // o.InterfaceC13655dTj
        public void AEQbTJ() {
            ePI.this.QOLQEE();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UeEOUB() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (this.AuCTel == null) {
                this.AuCTel = new DialogC55112xdm(activity, C13754dXa.LoaderManager.isConnected);
            }
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            try {
                DialogC55112xdm dialogC55112xdm = this.AuCTel;
                if (dialogC55112xdm != null) {
                    dialogC55112xdm.show();
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault(getTAG(), "error message:" + e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void QOLQEE() {
        DialogC55112xdm dialogC55112xdm = this.AuCTel;
        if (dialogC55112xdm != null) {
            dialogC55112xdm.dismiss();
        }
    }

    public final void DbNXlk(AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV == null || !abstractC12782ctV.zuWLRA()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new DefiHomeWalletFragment$showWalletAssets$1(abstractC12782ctV, this, null), 2, null);
    }

    public final void AYXKKw(java.lang.String str) {
        TickerView tickerView;
        TickerView tickerView2;
        TickerView tickerView3;
        TickerView tickerView4;
        android.widget.FrameLayout frameLayout;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        int length = str.length();
        float fGEmmrt = C55298xhM.gEmmrt(36.0f, activity);
        float fGEmmrt2 = C55298xhM.gEmmrt(14.0f, activity);
        float fGEmmrt3 = C55298xhM.gEmmrt(java.lang.Math.max(2.0f - (length * 0.05f), 0.05f), activity);
        C16595emr c16595emr = this.AhwBna;
        int iCopydefault = (c16595emr == null || (frameLayout = c16595emr.valueOf) == null) ? C55298xhM.copydefault(105.0f, (android.content.Context) activity) : frameLayout.getMeasuredWidth();
        int iCopydefault2 = C55298xhM.copydefault(24.0f, (android.content.Context) activity) * 2;
        int iCopydefault3 = C55298xhM.copydefault(20.0f, (android.content.Context) activity) + iCopydefault2 + iCopydefault;
        int iOLrzqt = C55302xhQ.OLrzqt(activity) - iCopydefault3;
        C16595emr c16595emr2 = this.AhwBna;
        android.text.TextPaint textPaint = new android.text.TextPaint((c16595emr2 == null || (tickerView4 = c16595emr2.QOLQEE) == null) ? null : tickerView4.uzCIH);
        textPaint.setTextSize(fGEmmrt2);
        float fMeasureText = textPaint.measureText(str);
        boolean z = false;
        if (iOLrzqt < iCopydefault3 || fMeasureText > iOLrzqt) {
            this.getFieldNames = true;
            copydefault(true);
            iOLrzqt += iCopydefault3 - iCopydefault2;
        } else if (this.getFieldNames) {
            this.getFieldNames = false;
            copydefault(true);
        }
        textPaint.setTextSize(fGEmmrt);
        float fMeasureText2 = textPaint.measureText(str);
        while (fMeasureText2 > iOLrzqt && fGEmmrt > fGEmmrt2) {
            fGEmmrt = java.lang.Math.max(fGEmmrt - fGEmmrt3, fGEmmrt2);
            textPaint.setTextSize(fGEmmrt);
            fMeasureText2 = textPaint.measureText(str);
        }
        java.lang.Integer num = this.getNewProxyInstance;
        if (num == null || num == null || num.intValue() != length) {
            this.getNewProxyInstance = java.lang.Integer.valueOf(length);
            this.djBIcL = true;
        }
        C16595emr c16595emr3 = this.AhwBna;
        if (c16595emr3 != null && (tickerView3 = c16595emr3.QOLQEE) != null) {
            tickerView3.setTextSize(fGEmmrt);
        }
        C16595emr c16595emr4 = this.AhwBna;
        if (c16595emr4 != null && (tickerView2 = c16595emr4.QOLQEE) != null) {
            tickerView2.requestLayout();
        }
        C16595emr c16595emr5 = this.AhwBna;
        if (c16595emr5 != null && (tickerView = c16595emr5.QOLQEE) != null) {
            this.ejfBZ.invoke(str);
            if (!this.djBIcL && !StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "*****", false, 2, (java.lang.Object) null)) {
                z = true;
            }
            tickerView.setText(str, z);
        }
        copydefault(QVAiDq().fJNWhG());
    }

    private final void djSkpj() {
        AppCompatImageView appCompatImageView;
        zsXlph();
        getFieldNames();
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr == null || (appCompatImageView = c16595emr.AYXKKw) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new ClipData(appCompatImageView, 1000L, this));
    }

    public static final void OcIXYQ(ePI epi) {
        C14724dqp.EZpvd.KWHzl(100L);
        epi.wlaJM();
        C32866mlf.onEvent$default("Web3WalletManagement_HomePage_Entry_Click", (TrackChannel[]) null, new Function1() { // from class: o.eQs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        epi.AEQbTJ("switch_wallet", "switch_wallet", "switch_wallet");
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void zsXlph() {
        AppCompatImageView appCompatImageView;
        ConstraintLayout constraintLayout;
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr != null && (constraintLayout = c16595emr.OcIXYQ) != null) {
            constraintLayout.setOnClickListener(new ComponentCallbacks2(constraintLayout, 1000L, this));
        }
        C16595emr c16595emr2 = this.AhwBna;
        if (c16595emr2 == null || (appCompatImageView = c16595emr2.RJOkX) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new ComponentName(appCompatImageView, 1000L, this));
    }

    public final void getFieldNames() {
        TickerView tickerView;
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr == null || (tickerView = c16595emr.QOLQEE) == null) {
            return;
        }
        tickerView.setOnClickListener(new BroadcastReceiver(tickerView, 1000L, this));
    }

    public static /* synthetic */ void trackButtonClickEvents$default(ePI epi, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        epi.AEQbTJ(str, str2, str3);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i = StateListAnimator.KWHzl[WalletStateChecker.AEQbTJ.copydefault(ORxRYg(), QVAiDq()).ordinal()];
        if (i == 1) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiHomeWalletFragment$trackButtonClickEvents$1(str, null), 3, null);
            return;
        }
        if (i == 2) {
            if (str3 != null) {
                C14494dmX.KWHzl.EZpvd(str3);
            }
        } else {
            if (i != 3) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiHomeWalletFragment$trackButtonClickEvents$3(str2, null), 3, null);
        }
    }

    public final void wlaJM() {
        if (this.fIwbmz != null) {
            fDF fdf = new fDF();
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            fdf.copydefault(childFragmentManager, new Intent());
        }
    }

    public static final class Intent implements AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity {
        public Intent() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.eUI.requestAllHomeData$default(o.eUI, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, java.lang.Integer, boolean, boolean, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
        @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
        public void copydefault(android.os.Bundle bundle) {
            if (ePI.this.fetchVPNInfo().fetchVPNInfo() == WalletStatus.NoWallet) {
                ePI.this.ORxRYg().values();
            } else {
                eUI.requestAllHomeData$default(ePI.this.QVAiDq(), "switchWallet", null, bundle != null ? bundle.getBoolean("isChangeWallet", false) : false, true, false, false, null, true, false, null, 882, null);
            }
        }
    }

    public final void AYXKKw(AbstractC12782ctV abstractC12782ctV) {
        valueOf(abstractC12782ctV);
        djBIcL(abstractC12782ctV);
        copydefault(abstractC12782ctV);
    }

    public final void valueOf(AbstractC12782ctV abstractC12782ctV) {
        C16595emr c16595emr = this.AhwBna;
        DisabledClickableLinearLayout disabledClickableLinearLayout = c16595emr != null ? c16595emr.wlaJM : null;
        if (disabledClickableLinearLayout == null) {
            return;
        }
        disabledClickableLinearLayout.setEnabled((abstractC12782ctV.DCUTEIdCUTEI() || abstractC12782ctV.QfsBiF() || abstractC12782ctV.htlTjW() || abstractC12782ctV.spnCvw() || abstractC12782ctV.zsXlph() || !abstractC12782ctV.zLjUOn()) ? false : true);
        disabledClickableLinearLayout.setAlpha(!disabledClickableLinearLayout.isEnabled() ? 0.3f : 1.0f);
        disabledClickableLinearLayout.setOnClickListener(new PendingIntent(disabledClickableLinearLayout, 1000L, this, abstractC12782ctV));
    }

    public static final class LoaderManager implements Function0<Unit> {
        public final /* synthetic */ AbstractC12782ctV KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(AbstractC12782ctV abstractC12782ctV) {
            this.KWHzl = abstractC12782ctV;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.fkp.Activity.startActivity$default(o.fkp$Activity, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):void */
        /* JADX DEBUG: Class process forced to load method for inline: o.gle.openSendCoinActivity$default(o.gle, androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity, java.lang.String, java.lang.Long, java.lang.String, com.okinc.business.defi.biz.core.scan.TransactionInfo, boolean, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
        public final void copydefault() {
            eUG eug;
            java.util.ArrayList<eUG> value = ePI.this.QVAiDq().zsXlph().getValue();
            if (value == null || (eug = (eUG) CollectionsKt___CollectionsKt.firstOrNull(value)) == null) {
                return;
            }
            ePI epi = ePI.this;
            AbstractC12782ctV abstractC12782ctV = this.KWHzl;
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(eug.djBIcL())));
            if (c10854bwMKWHzl == null || !c10854bwMKWHzl.OuxcSI() || !epi.copydefault(abstractC12782ctV, c10854bwMKWHzl)) {
                C20690gle.OLrzqt.KWHzl((106 & 1) != 0 ? null : epi, (106 & 2) != 0 ? null : null, abstractC12782ctV.DbNXlk(), (106 & 8) != 0 ? null : null, "", (106 & 32) != 0 ? null : null, (106 & 64) != 0 ? false : false, (106 & 128) != 0 ? null : StateListAnimator.OLrzqt);
                return;
            }
            ActivityC18568fkp.Activity activity = ActivityC18568fkp.Companion;
            FragmentActivity fragmentActivityRequireActivity = epi.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            activity.AEQbTJ(fragmentActivityRequireActivity, (28 & 2) != 0 ? "" : abstractC12782ctV.DbNXlk(), (28 & 4) != 0 ? "" : null, (28 & 8) != 0 ? "" : null, (28 & 16) != 0 ? "" : null);
        }

        public static final class StateListAnimator implements Function1<android.os.Bundle, Unit> {
            public static final StateListAnimator OLrzqt = new StateListAnimator();

            public final void AEQbTJ(android.os.Bundle bundle) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(android.os.Bundle bundle) {
                AEQbTJ(bundle);
                return Unit.INSTANCE;
            }
        }
    }

    public final void djBIcL(AbstractC12782ctV abstractC12782ctV) {
        C16595emr c16595emr = this.AhwBna;
        DisabledClickableLinearLayout disabledClickableLinearLayout = c16595emr != null ? c16595emr.getNewProxyInstance : null;
        if (disabledClickableLinearLayout == null) {
            return;
        }
        disabledClickableLinearLayout.setEnabled((abstractC12782ctV.DCUTEIdCUTEI() || abstractC12782ctV.htlTjW() || abstractC12782ctV.spnCvw() || abstractC12782ctV.zsXlph() || !abstractC12782ctV.zLjUOn()) ? false : true);
        disabledClickableLinearLayout.setAlpha(!disabledClickableLinearLayout.isEnabled() ? 0.3f : 1.0f);
        disabledClickableLinearLayout.setOnClickListener(new Fragment(disabledClickableLinearLayout, 1000L, this, abstractC12782ctV));
    }

    public static final class Application implements Function0<Unit> {
        public final /* synthetic */ AbstractC12782ctV AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(AbstractC12782ctV abstractC12782ctV) {
            this.AEQbTJ = abstractC12782ctV;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            ePI.this.isConnected(this.AEQbTJ);
        }
    }

    public final void copydefault(AbstractC12782ctV abstractC12782ctV) {
        C16595emr c16595emr = this.AhwBna;
        DisabledClickableLinearLayout disabledClickableLinearLayout = c16595emr != null ? c16595emr.AhwBna : null;
        if (disabledClickableLinearLayout == null) {
            return;
        }
        disabledClickableLinearLayout.setEnabled(abstractC12782ctV.zLjUOn());
        disabledClickableLinearLayout.setAlpha(!disabledClickableLinearLayout.isEnabled() ? 0.3f : 1.0f);
        disabledClickableLinearLayout.setOnClickListener(new Activity(disabledClickableLinearLayout, 1000L, this, abstractC12782ctV));
    }

    public final void EZpvd(java.util.List<MoreFunctionModuleInfo> list) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        android.content.Context context;
        C16595emr c16595emr;
        wYC wyc;
        android.widget.TextView textView;
        ConstraintLayout constraintLayout3;
        AbstractC12782ctV value;
        ConstraintLayout constraintLayout4;
        if (!list.isEmpty() || (value = QVAiDq().fARcdN().getValue()) == null || value.AubY()) {
            C16595emr c16595emr2 = this.AhwBna;
            if (c16595emr2 != null && (constraintLayout3 = c16595emr2.AuCTel) != null) {
                constraintLayout3.setVisibility(0);
            }
            C16595emr c16595emr3 = this.AhwBna;
            if (c16595emr3 != null && (textView = c16595emr3.sSMYrx) != null) {
                textView.setText(getString(C13754dXa.FragmentManager.ComponentActivityExternalSyntheticLambda0));
            }
            C16595emr c16595emr4 = this.AhwBna;
            if (c16595emr4 != null && (constraintLayout2 = c16595emr4.DbNXlk) != null && (context = constraintLayout2.getContext()) != null && (c16595emr = this.AhwBna) != null && (wyc = c16595emr.fetchVPNInfo) != null) {
                wyc.setImageDrawable(ContextCompat.getDrawable(context, C52761wXj.TaskDescription.HJWChPfvRMlC));
            }
            C16595emr c16595emr5 = this.AhwBna;
            if (c16595emr5 != null && (constraintLayout = c16595emr5.AuCTel) != null) {
                constraintLayout.setOnClickListener(new ActionBar(constraintLayout, 1000L, this, list));
            }
        } else {
            C16595emr c16595emr6 = this.AhwBna;
            if (c16595emr6 != null && (constraintLayout4 = c16595emr6.AuCTel) != null) {
                constraintLayout4.setVisibility(4);
            }
        }
        eUI.isPreZeroState$default(QVAiDq(), new Function1() { // from class: o.eQR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.KWHzl(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }, null, 2, null);
    }

    public static final Unit KWHzl(ePI epi, boolean z) {
        Group group;
        C16595emr c16595emr = epi.AhwBna;
        if (c16595emr != null && (group = c16595emr.fJNWhG) != null) {
            AbstractC12782ctV value = epi.QVAiDq().fARcdN().getValue();
            group.setVisibility(((value == null || value.zLjUOn()) && !(epi.getNewProxyInstance() && epi.QUSxYX())) ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final AbstractC12782ctV abstractC12782ctV, boolean z) {
        eUG eug;
        java.util.ArrayList<eUG> value = QVAiDq().zsXlph().getValue();
        if (value == null || (eug = (eUG) CollectionsKt___CollectionsKt.firstOrNull(value)) == null) {
            return;
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(eug.djBIcL())));
        if (c10854bwMKWHzl == null || !c10854bwMKWHzl.OuxcSI() || !copydefault(abstractC12782ctV, c10854bwMKWHzl)) {
            C20690gle.OLrzqt.EZpvd((10 & 1) != 0 ? null : this, (10 & 2) != 0 ? null : null, abstractC12782ctV.DbNXlk(), (10 & 8) != 0 ? null : null, (10 & 16) != 0 ? false : z, "", (10 & 64) != 0 ? null : new Function1() { // from class: o.eQf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ePI.copydefault(this.KWHzl, abstractC12782ctV, (android.os.Bundle) obj);
                }
            });
            return;
        }
        ActivityC18568fkp.Activity activity = ActivityC18568fkp.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        activity.AEQbTJ(fragmentActivityRequireActivity, (28 & 2) != 0 ? "" : abstractC12782ctV.DbNXlk(), (28 & 4) != 0 ? "" : null, (28 & 8) != 0 ? "" : null, (28 & 16) != 0 ? "" : null);
    }

    public static final Unit copydefault(ePI epi, AbstractC12782ctV abstractC12782ctV, android.os.Bundle bundle) {
        if (bundle != null && bundle.getBoolean("is_first_time_use", false)) {
            epi.OLrzqt(abstractC12782ctV, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.grx.exchangeDialogLogic$default(o.grx, androidx.fragment.app.FragmentManager, androidx.fragment.app.FragmentActivity, androidx.activity.result.ActivityResultLauncher, java.lang.String, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function2, int, java.lang.Object):void */
    public final void isConnected(final AbstractC12782ctV abstractC12782ctV) {
        C21027grx c21027grx = C21027grx.copydefault;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c21027grx.OLrzqt(childFragmentManager, fragmentActivityRequireActivity, this.AxsJAY, abstractC12782ctV.DbNXlk(), (128 & 16) != 0 ? true : true, (128 & 32) != 0 ? false : abstractC12782ctV.QfsBiF(), (128 & 64) != 0 ? true : true, (128 & 128) != 0 ? false : false, (128 & 256) != 0 ? null : new Function2() { // from class: o.eQi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ePI.EZpvd(this.copydefault, abstractC12782ctV, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue());
            }
        });
    }

    public static final Unit EZpvd(ePI epi, AbstractC12782ctV abstractC12782ctV, int i, boolean z) {
        ActivityResultLauncher<android.content.Context> activityResultLauncherOLrzqt;
        if (i == 2 || i == 3) {
            epi.OLrzqt(abstractC12782ctV, z);
        } else if (i == 5 && (activityResultLauncherOLrzqt = epi.OLrzqt(z)) != null) {
            activityResultLauncherOLrzqt.launch(epi.requireActivity());
        }
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(ePI epi, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            epi.KWHzl(false);
        }
    }

    public static final void valueOf(ePI epi, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            epi.KWHzl(true);
        }
    }

    public final void KWHzl(boolean z) {
        java.lang.String strDbNXlk;
        C21027grx c21027grx = C21027grx.copydefault;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        ActivityResultLauncher<C21118gti.Application> activityResultLauncher = this.AxsJAY;
        AbstractC12782ctV abstractC12782ctV = this.fIwbmz;
        if (abstractC12782ctV == null || (strDbNXlk = abstractC12782ctV.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        c21027grx.EZpvd(childFragmentManager, fragmentActivityRequireActivity, activityResultLauncher, strDbNXlk, true, z);
    }

    public final boolean copydefault(AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM) {
        C13852daR c13852daRODWQjV;
        boolean z = c10854bwM != null && c10854bwM.OuxcSI();
        EOSState eOSStateValueOf = (abstractC12782ctV == null || (c13852daRODWQjV = abstractC12782ctV.ODWQjV()) == null) ? null : c13852daRODWQjV.valueOf();
        return (!z || eOSStateValueOf == null || eOSStateValueOf == EOSState.Opened) ? false : true;
    }

    public final void OLrzqt(boolean z, Function0<Unit> function0) {
        AbstractC12782ctV abstractC12782ctV = this.fIwbmz;
        if (abstractC12782ctV != null) {
            if (z) {
                C55326xho.toast$default(getString(C13754dXa.FragmentManager.QSAYLr), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, 0, 27, (java.lang.Object) null);
                return;
            }
            if (abstractC12782ctV.htlTjW()) {
                fPH fph = fPH.OLrzqt;
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    return;
                }
                fPH.showOwnerCheckFailedDialog$default(fph, activity, abstractC12782ctV.fFgQHt(), 0, null, 8, null);
                return;
            }
            if (AhwBna(abstractC12782ctV)) {
                return;
            }
            if (!abstractC12782ctV.zLjUOn()) {
                FragmentActivity activity2 = getActivity();
                AbstractActivityC33041mov abstractActivityC33041mov = activity2 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity2 : null;
                if (abstractActivityC33041mov == null) {
                    return;
                }
                C14325djN.showBackupTipDialog$default(new C14325djN(), abstractActivityC33041mov, getChildFragmentManager(), abstractC12782ctV, null, 8, null);
                return;
            }
            function0.invoke();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.eSp.dealWithMpcExceptionStatus$default(o.eSp, o.ctV, android.content.Context, kotlin.jvm.functions.Function0, int, java.lang.Object):boolean */
    public final boolean AhwBna(AbstractC12782ctV abstractC12782ctV) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return C15715eSp.dealWithMpcExceptionStatus$default(C15715eSp.AEQbTJ, abstractC12782ctV, activity, null, 4, null);
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        LiveData<java.util.List<ApproveItem>> liveDataAEQbTJ;
        C55230xfy c55230xfy;
        C18095fbt c18095fbt;
        C14783drv c14783drv;
        C14706dqX c14706dqX;
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr != null && (c14706dqX = c16595emr.fARcdN) != null) {
            c14706dqX.setOnChartShareClickListener(null);
            c14706dqX.setOnPeriodTypeClick(null);
            c14706dqX.setOnRetryCallBack(null);
        }
        C16595emr c16595emr2 = this.AhwBna;
        if (c16595emr2 != null && (c14783drv = c16595emr2.hDKMBd) != null) {
            c14783drv.setPnlListDetailCallback(null);
            c14783drv.setPnlListRetryCallback(null);
        }
        C16595emr c16595emr3 = this.AhwBna;
        if (c16595emr3 != null && (c18095fbt = c16595emr3.AkhnZx) != null) {
            c18095fbt.setKlineInteractionActiveDataPointListener(null);
        }
        C16595emr c16595emr4 = this.AhwBna;
        if (c16595emr4 != null && (c55230xfy = c16595emr4.AuCTelauCTel) != null) {
            c55230xfy.setOnSearchBarClick(null);
        }
        android.animation.AnimatorSet animatorSet = this.DbNXlk;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.DbNXlk = null;
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTelauCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.AuCTelauCTel = null;
        if (eLJ.Companion.AEQbTJ()) {
            liveDataAEQbTJ = C15530eLt.ActionBar.getInstance$default(C15530eLt.Companion, null, 1, null).copydefault();
        } else {
            liveDataAEQbTJ = C15523eLm.KWHzl.AEQbTJ();
        }
        this.KWHzl.removeSource(liveDataAEQbTJ);
        this.KWHzl.removeSource(QVAiDq().isConnected());
        this.EZpvd = CredentialState.NONE;
        DialogC55112xdm dialogC55112xdm = this.AuCTel;
        if (dialogC55112xdm != null) {
            dialogC55112xdm.dismiss();
        }
        this.AuCTel = null;
        this.ejfBZ = new Function1() { // from class: o.eQO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.AEQbTJ((java.lang.String) obj);
            }
        };
        this.fetchVPNInfo = new Function1() { // from class: o.eQS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ePI.OLrzqt((AbstractC12782ctV) obj);
            }
        };
        this.AhwBna = null;
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC54847xXn
    public void KWHzl(long j, long j2, boolean z) {
        QVAiDq().OLrzqt(j2);
        QVAiDq().AEQbTJ(j);
        if (!C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).AEQbTJ(j)) {
            this.valueOf = true;
        }
        copydefault("onChainSet", getNewProxyInstance(), QUSxYX());
        C18275ffN.fetchKLineState$default(QbewEr(), InterfaceC18271ffJ.Application.EZpvd, null, 2, null);
        loadPnlTokenData$default(this, "onChainSet", 0, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2009=20] */
    public final void copydefault(java.lang.String str, boolean z, boolean z2) {
        ConstraintLayout.LayoutParams layoutParams;
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr != null) {
            if (!z) {
                C14706dqX c14706dqX = c16595emr.fARcdN;
                Intrinsics.checkNotNullExpressionValue(c14706dqX, "");
                c14706dqX.setVisibility(8);
                C14783drv c14783drv = c16595emr.hDKMBd;
                Intrinsics.checkNotNullExpressionValue(c14783drv, "");
                c14783drv.setVisibility(8);
                android.widget.Space space = c16595emr.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(space, "");
                space.setVisibility(8);
                AbstractC12782ctV value = QVAiDq().fARcdN().getValue();
                if (value == null || !value.zLjUOn()) {
                    Group group = c16595emr.fJNWhG;
                    Intrinsics.checkNotNullExpressionValue(group, "");
                    group.setVisibility(8);
                } else {
                    Group group2 = c16595emr.fJNWhG;
                    Intrinsics.checkNotNullExpressionValue(group2, "");
                    group2.setVisibility(0);
                }
                android.widget.FrameLayout frameLayoutOLrzqt = c16595emr.AxsJAY.getRoot();
                Intrinsics.checkNotNullExpressionValue(frameLayoutOLrzqt, "");
                frameLayoutOLrzqt.setVisibility(8);
                c16595emr.AxsJAY.OLrzqt.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
                ConstraintLayout constraintLayout = c16595emr.ejfBZ;
                ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
                layoutParams = layoutParams2 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams == null) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                constraintLayout.setLayoutParams(layoutParams);
                return;
            }
            if (z2) {
                C14706dqX c14706dqX2 = c16595emr.fARcdN;
                Intrinsics.checkNotNullExpressionValue(c14706dqX2, "");
                c14706dqX2.setVisibility(0);
                C14783drv c14783drv2 = c16595emr.hDKMBd;
                Intrinsics.checkNotNullExpressionValue(c14783drv2, "");
                c14783drv2.setVisibility(0);
                android.widget.Space space2 = c16595emr.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(space2, "");
                space2.setVisibility(0);
                Group group3 = c16595emr.fJNWhG;
                Intrinsics.checkNotNullExpressionValue(group3, "");
                group3.setVisibility(8);
                android.widget.FrameLayout frameLayoutOLrzqt2 = c16595emr.AxsJAY.getRoot();
                Intrinsics.checkNotNullExpressionValue(frameLayoutOLrzqt2, "");
                frameLayoutOLrzqt2.setVisibility(8);
            } else {
                C14706dqX c14706dqX3 = c16595emr.fARcdN;
                Intrinsics.checkNotNullExpressionValue(c14706dqX3, "");
                c14706dqX3.setVisibility(8);
                C14783drv c14783drv3 = c16595emr.hDKMBd;
                Intrinsics.checkNotNullExpressionValue(c14783drv3, "");
                c14783drv3.setVisibility(8);
                android.widget.Space space3 = c16595emr.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(space3, "");
                space3.setVisibility(8);
                Group group4 = c16595emr.fJNWhG;
                Intrinsics.checkNotNullExpressionValue(group4, "");
                group4.setVisibility(0);
                android.widget.FrameLayout frameLayoutOLrzqt3 = c16595emr.AxsJAY.getRoot();
                Intrinsics.checkNotNullExpressionValue(frameLayoutOLrzqt3, "");
                frameLayoutOLrzqt3.setVisibility(iwGUEr() ^ true ? 0 : 8);
            }
            c16595emr.AxsJAY.OLrzqt.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
            ConstraintLayout constraintLayout2 = c16595emr.ejfBZ;
            ViewGroup.LayoutParams layoutParams3 = constraintLayout2.getLayoutParams();
            layoutParams = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams == null) {
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
            constraintLayout2.setLayoutParams(layoutParams);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2041=7] */
    public final void copydefault(boolean z) {
        boolean z2 = z && AwvSrB();
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr != null) {
            if (getNewProxyInstance()) {
                c16595emr.valueOf.setAlpha(0.0f);
                c16595emr.ejfBZ.setAlpha(1.0f);
            } else {
                c16595emr.valueOf.setAlpha(1.0f);
                c16595emr.ejfBZ.setAlpha(0.0f);
            }
            android.widget.FrameLayout frameLayout = c16595emr.valueOf;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility((!z2 || this.getFieldNames) ? 8 : 0);
            ConstraintLayout constraintLayout = c16595emr.iwGUEr;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(z2 ? 0 : 8);
            ConstraintLayout constraintLayout2 = c16595emr.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility((z2 && getNewProxyInstance()) ? 0 : 8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2076=4] */
    public final void gEmmrt() {
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr == null) {
            return;
        }
        C14675dpt c14675dpt = C14675dpt.copydefault;
        android.widget.FrameLayout frameLayoutOLrzqt = c16595emr.AxsJAY.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOLrzqt, "");
        ConstraintLayout constraintLayout = c16595emr.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ConstraintLayout constraintLayout2 = c16595emr.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        java.util.ArrayList arrayListCopydefault = yDY.copydefault(c14675dpt.OLrzqt(frameLayoutOLrzqt, 300L), c14675dpt.OLrzqt(constraintLayout, 300L), c14675dpt.AEQbTJ(constraintLayout2, 300L));
        if (!this.getFieldNames) {
            android.widget.FrameLayout frameLayout = c16595emr.valueOf;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            arrayListCopydefault.add(c14675dpt.EZpvd(frameLayout, 300L));
        }
        android.animation.AnimatorSet animatorSet = this.DbNXlk;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayListCopydefault));
        this.DbNXlk = animatorSet2;
        animatorSet2.addListener(new FragmentManager(c16595emr));
        android.animation.AnimatorSet animatorSet3 = this.DbNXlk;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    public static final class FragmentManager implements Animator.AnimatorListener {
        public final /* synthetic */ C16595emr OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public FragmentManager(C16595emr c16595emr) {
            this.OLrzqt = c16595emr;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            if (ePI.this.QUSxYX()) {
                Group group = this.OLrzqt.fJNWhG;
                Intrinsics.checkNotNullExpressionValue(group, "");
                group.setVisibility(0);
                android.widget.Space space = this.OLrzqt.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(space, "");
                space.setVisibility(8);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            android.widget.FrameLayout frameLayoutOLrzqt = this.OLrzqt.AxsJAY.getRoot();
            Intrinsics.checkNotNullExpressionValue(frameLayoutOLrzqt, "");
            frameLayoutOLrzqt.setVisibility(8);
            this.OLrzqt.AxsJAY.OLrzqt.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
            ActivityResultCaller parentFragment = ePI.this.getParentFragment();
            if (parentFragment == null || !(parentFragment instanceof InterfaceC54853xXt)) {
                return;
            }
            ((InterfaceC54853xXt) parentFragment).dxcTrN();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2158=11] */
    public final void AYXKKw() {
        int iCopydefault;
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr == null) {
            return;
        }
        if (QUSxYX()) {
            loadPnlTokenData$default(this, "expandKlineChart", 0, 2, null);
            ViewGroup.LayoutParams layoutParams = c16595emr.AkhnZx.getLayoutParams();
            C7773aqE.StateListAnimator stateListAnimator = layoutParams instanceof C7773aqE.StateListAnimator ? (C7773aqE.StateListAnimator) layoutParams : null;
            ViewGroup.LayoutParams layoutParams2 = c16595emr.hDKMBd.getLayoutParams();
            C7773aqE.StateListAnimator stateListAnimator2 = layoutParams2 instanceof C7773aqE.StateListAnimator ? (C7773aqE.StateListAnimator) layoutParams2 : null;
            ViewGroup.LayoutParams layoutParams3 = c16595emr.fARcdN.getLayoutParams();
            C7773aqE.StateListAnimator stateListAnimator3 = layoutParams3 instanceof C7773aqE.StateListAnimator ? (C7773aqE.StateListAnimator) layoutParams3 : null;
            android.content.Context context = c16595emr.ejfBZ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iCopydefault2 = C55298xhM.copydefault(350.0f, context);
            int i = stateListAnimator != null ? ((LinearLayout.LayoutParams) stateListAnimator).topMargin : 0;
            int i2 = stateListAnimator != null ? ((LinearLayout.LayoutParams) stateListAnimator).bottomMargin : 0;
            int iCopydefault3 = C56548yJl.copydefault(c16595emr.hDKMBd.getHeight(), C55298xhM.dp2px$default(240.0f, null, 1, null));
            int i3 = stateListAnimator2 != null ? ((LinearLayout.LayoutParams) stateListAnimator2).topMargin : 0;
            int i4 = stateListAnimator2 != null ? ((LinearLayout.LayoutParams) stateListAnimator2).bottomMargin : 0;
            int iCopydefault4 = C56548yJl.copydefault(c16595emr.fARcdN.getHeight(), C55298xhM.dp2px$default(540.0f, null, 1, null));
            iCopydefault = iCopydefault2 + i + i2 + iCopydefault3 + i3 + i4 + iCopydefault4 + (stateListAnimator3 != null ? ((LinearLayout.LayoutParams) stateListAnimator3).topMargin : 0) + (stateListAnimator3 != null ? ((LinearLayout.LayoutParams) stateListAnimator3).bottomMargin : 0);
        } else {
            android.content.Context context2 = c16595emr.ejfBZ.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iCopydefault = C55298xhM.copydefault(350.0f, context2);
        }
        C14675dpt c14675dpt = C14675dpt.copydefault;
        android.widget.FrameLayout frameLayoutOLrzqt = c16595emr.AxsJAY.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutOLrzqt, "");
        ConstraintLayout constraintLayout = c16595emr.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ConstraintLayout constraintLayout2 = c16595emr.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        java.util.ArrayList arrayListCopydefault = yDY.copydefault(c14675dpt.EZpvd(frameLayoutOLrzqt, 300L), c14675dpt.EZpvd(constraintLayout, 300L), c14675dpt.copydefault(constraintLayout2, iCopydefault, 300L));
        if (!this.getFieldNames) {
            android.widget.FrameLayout frameLayout = c16595emr.valueOf;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            arrayListCopydefault.add(c14675dpt.OLrzqt(frameLayout, 300L));
        }
        android.animation.AnimatorSet animatorSet = this.DbNXlk;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayListCopydefault));
        this.DbNXlk = animatorSet2;
        animatorSet2.addListener(new AssistContent(c16595emr, this));
        android.animation.AnimatorSet animatorSet3 = this.DbNXlk;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    public static final class AssistContent implements Animator.AnimatorListener {
        public final /* synthetic */ C16595emr EZpvd;
        public final /* synthetic */ ePI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public AssistContent(C16595emr c16595emr, ePI epi) {
            this.EZpvd = c16595emr;
            this.copydefault = epi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [2158=5] */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            if (this.copydefault.QUSxYX()) {
                Group group = this.EZpvd.fJNWhG;
                Intrinsics.checkNotNullExpressionValue(group, "");
                group.setVisibility(8);
                android.widget.FrameLayout frameLayoutOLrzqt = this.EZpvd.AxsJAY.getRoot();
                Intrinsics.checkNotNullExpressionValue(frameLayoutOLrzqt, "");
                frameLayoutOLrzqt.setVisibility(8);
                android.widget.Space space = this.EZpvd.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(space, "");
                space.setVisibility(0);
            } else {
                android.widget.FrameLayout frameLayoutOLrzqt2 = this.EZpvd.AxsJAY.getRoot();
                Intrinsics.checkNotNullExpressionValue(frameLayoutOLrzqt2, "");
                frameLayoutOLrzqt2.setVisibility(0);
            }
            ConstraintLayout constraintLayout = this.EZpvd.ejfBZ;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
                constraintLayout.setLayoutParams(layoutParams2);
            }
            this.copydefault.gHZMYf();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.EZpvd.AxsJAY.OLrzqt.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
            if (this.copydefault.QUSxYX()) {
                C14706dqX c14706dqX = this.EZpvd.fARcdN;
                Intrinsics.checkNotNullExpressionValue(c14706dqX, "");
                c14706dqX.setVisibility(0);
                C14783drv c14783drv = this.EZpvd.hDKMBd;
                Intrinsics.checkNotNullExpressionValue(c14783drv, "");
                c14783drv.setVisibility(0);
            }
        }
    }

    @Override // o.InterfaceC54854xXu
    public void KWHzl(float f, int i) {
        InterfaceC54854xXu.StateListAnimator.AEQbTJ(this, f, i);
        gHZMYf();
    }

    public final void gHZMYf() {
        C17161exa c17161exa;
        android.widget.FrameLayout frameLayoutOLrzqt;
        AbstractC12782ctV value;
        ActivityResultCaller parentFragment;
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr == null || (c17161exa = c16595emr.AxsJAY) == null || (frameLayoutOLrzqt = c17161exa.getRoot()) == null || frameLayoutOLrzqt.getVisibility() != 0 || (value = QVAiDq().fARcdN().getValue()) == null || !value.zLjUOn() || (parentFragment = getParentFragment()) == null || !(parentFragment instanceof InterfaceC54853xXt)) {
            return;
        }
        frameLayoutOLrzqt.getLocationOnScreen(this.hDKMBd);
        if (((InterfaceC54853xXt) parentFragment).copydefault(this.hDKMBd[1])) {
            frameLayoutOLrzqt.setAlpha(0.0f);
        } else {
            frameLayoutOLrzqt.setAlpha(1.0f);
        }
    }

    public final void fIwbmz() {
        C17161exa c17161exa;
        android.widget.FrameLayout frameLayoutOLrzqt;
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr == null || (c17161exa = c16595emr.AxsJAY) == null || (frameLayoutOLrzqt = c17161exa.getRoot()) == null) {
            return;
        }
        frameLayoutOLrzqt.performClick();
    }

    public final void fJNWhG() {
        DisabledClickableLinearLayout disabledClickableLinearLayout;
        C16595emr c16595emr = this.AhwBna;
        if (c16595emr == null || (disabledClickableLinearLayout = c16595emr.getNewProxyInstance) == null) {
            return;
        }
        disabledClickableLinearLayout.performClick();
    }

    public final boolean AwvSrB() {
        int i = StateListAnimator.KWHzl[WalletStateChecker.AEQbTJ.copydefault(ORxRYg(), QVAiDq()).ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                return true;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ePI.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
