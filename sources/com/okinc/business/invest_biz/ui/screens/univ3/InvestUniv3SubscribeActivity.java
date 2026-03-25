package com.okinc.business.invest_biz.ui.screens.univ3;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RangeInfoType;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.bean.SwapSlippageConfig;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.bean.InvestConsumeData;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeViewModel;
import com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.InvestUniv3Mode;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.ZapMode;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.ZapPageData;
import com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel;
import com.okinc.business.invest_biz.ui.widget.InvestUniv3PriceChart;
import com.okinc.business.invest_biz.ui.widget.InvestUniv3PriceInputView;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.DeserializationStrategy;
import o.AbstractActivityC26831jjj;
import o.AbstractC27236jrQ;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C23611iCu;
import o.C23732iHg;
import o.C23792iJm;
import o.C23795iJp;
import o.C23910iNw;
import o.C23948iPg;
import o.C23953iPl;
import o.C23954iPm;
import o.C23958iPq;
import o.C23962iPu;
import o.C23978iQj;
import o.C24114iVk;
import o.C25493ixk;
import o.C25544iyi;
import o.C27024jnQ;
import o.C27042jni;
import o.C27131jpR;
import o.C27137jpX;
import o.C27138jpY;
import o.C27179jqM;
import o.C27187jqU;
import o.C27207jqo;
import o.C27221jrB;
import o.C27300jsb;
import o.C27301jsc;
import o.C27315jsq;
import o.C27446jvO;
import o.C27492jwH;
import o.C27493jwI;
import o.C27496jwL;
import o.C27508jwX;
import o.C27522jwl;
import o.C27569jxf;
import o.C27570jxg;
import o.C27589jxz;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33489mxS;
import o.C33537myN;
import o.C43251rlk;
import o.C43422row;
import o.C52761wXj;
import o.C52794wYp;
import o.C54976xbI;
import o.C55001xbh;
import o.C55113xdn;
import o.C55249xgQ;
import o.C55258xgZ;
import o.C55296xhK;
import o.C55298xhM;
import o.C55326xho;
import o.C55328xhq;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56444yFp;
import o.C56524yIo;
import o.C56548yJl;
import o.C57600ylV;
import o.C7514alK;
import o.C7827arF;
import o.InterfaceC23916iOb;
import o.InterfaceC24173iXp;
import o.InterfaceC26678jgp;
import o.InterfaceC27531jwu;
import o.InterfaceC54829xWw;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56445yFq;
import o.InterfaceC56514yIe;
import o.InterfaceC58227yxM;
import o.InterfaceC9738bbJ;
import o.ViewOnClickListenerC54939xaY;
import o.iKU;
import o.iTW;
import o.iUI;
import o.iUX;
import o.iUZ;
import o.iXD;
import o.rVN;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeActivity extends AbstractActivityC26831jjj implements InterfaceC26678jgp {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public String AYXKKw;
    public C23732iHg AhwBna;
    public final MutableStateFlow<EditMode> AkhnZx;
    public AmountInputIndex AuCTel;
    public C23795iJp AubY;
    public final InterfaceC56387yDm AwvSrB;
    public ZapPageData AxsJAY;
    public boolean DbNXlk;
    public long djBIcL;
    public boolean ejfBZ;
    public Runnable fARcdN;
    public boolean fIwbmz;
    public boolean fJNWhG;
    public String gEmmrt;
    public C23792iJm getFieldNames;
    public final InterfaceC56387yDm getNewProxyInstance;
    public InvestPoolV3 hDKMBd;
    public long isConnected;
    public final Observer<InvestTransactionModel> iwGUEr;
    public Vibrator sSMYrx;
    public C23910iNw uzCIH;
    public iKU valueOf;
    public ArrayList<InvestInputData> values;
    public String wlaJM;
    public final ActivityResultLauncher<android.content.Intent> zLjUOn;
    public TransactionConfig zsXlph;
    public String zuBGHE;
    public InvestUniv3Mode AuCTelauCTel = InvestUniv3Mode.Normal;
    public final Runnable fetchVPNInfo = new Runnable() { // from class: o.jmi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            InvestUniv3SubscribeActivity.ORxRYg(this.EZpvd);
        }
    };

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwapSlippageActivity.SlippageMode.values().length];
            try {
                iArr[SwapSlippageActivity.SlippageMode.DYNAMIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwapSlippageActivity.SlippageMode.FIXED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[InvestUniv3Mode.values().length];
            try {
                iArr2[InvestUniv3Mode.Zap.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr2;
            int[] iArr3 = new int[YieldState.values().length];
            try {
                iArr3[YieldState.DASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            copydefault = iArr3;
        }
    }

    public static final /* synthetic */ class ComponentCallbacks2 implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.jjj.djBIcL()V */
    public final MutableStateFlow<EditMode> djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Runnable gEmmrt() {
        return this.fetchVPNInfo;
    }

    public static final class ComponentName implements Function1<String, InvestTransactionModel> {
        public static final ComponentName EZpvd = new ComponentName();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r3v1, types: [com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final InvestTransactionModel invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) InvestTransactionModel.Companion.serializer(), str);
        }
    }

    public static final class Intent implements Function0<Object> {
        public final /* synthetic */ Function1 KWHzl;
        public final /* synthetic */ String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Intent(String str, Function1 function1) {
            this.copydefault = str;
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity$Intent$1] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            final String str = this.copydefault;
            final Function1 function1 = this.KWHzl;
            return new ViewModelProvider.Factory() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity.Intent.1
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(Class<T> cls) {
                    Intrinsics.checkNotNullParameter(cls, "");
                    return new C23611iCu(str, function1);
                }
            };
        }
    }

    public InvestUniv3SubscribeActivity() {
        final Function0 function0 = null;
        this.AwvSrB = new ViewModelLazy(C56524yIo.AEQbTJ(InvestUniv3SubscribeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.jmh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                InvestUniv3SubscribeActivity.KWHzl(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.zLjUOn = activityResultLauncherRegisterForActivityResult;
        this.getNewProxyInstance = new ViewModelLazy(C56524yIo.AEQbTJ(C23611iCu.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity$special$$inlined$viewModels$default$5
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
        }, new Intent("invest-tx-status-toast", ComponentName.EZpvd), new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity$special$$inlined$viewModels$default$6
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
        this.iwGUEr = new Observer() { // from class: o.jmg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                InvestUniv3SubscribeActivity.KWHzl(this.OLrzqt, (InvestTransactionModel) obj);
            }
        };
        this.wlaJM = "";
        this.zuBGHE = "";
        this.AYXKKw = "";
        this.ejfBZ = true;
        this.AkhnZx = StateFlowKt.MutableStateFlow(EditMode.NONE);
        this.AuCTel = AmountInputIndex.First;
        this.gEmmrt = "CHART_TYPE_DEPTH";
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final InvestUniv3SubscribeViewModel isConnected() {
        return (InvestUniv3SubscribeViewModel) this.AwvSrB.getValue();
    }

    public static final void ORxRYg(InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.ORxRYg.smoothScrollTo(0, 100000);
    }

    public final Runnable EZpvd(final int i) {
        return new Runnable() { // from class: o.jml
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                InvestUniv3SubscribeActivity.OLrzqt(this.OLrzqt, i);
            }
        };
    }

    public static final void OLrzqt(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, int i) {
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        LinearLayout linearLayout = c23732iHg.djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23732iHg2 = c23732iHg3;
        }
        View view = c23732iHg2.QfsBiF;
        Intrinsics.checkNotNullExpressionValue(view, "");
        int[] iArr = new int[2];
        linearLayout.getLocationOnScreen(iArr);
        int i2 = investUniv3SubscribeActivity.getResources().getDisplayMetrics().heightPixels - i;
        int height = iArr[1] + linearLayout.getHeight();
        if (height > i2) {
            int iCopydefault = C55298xhM.copydefault(16.0f, (Context) investUniv3SubscribeActivity);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = (height - i2) + iCopydefault;
            view.setLayoutParams(layoutParams);
            view.setVisibility(0);
            return;
        }
        view.setVisibility(8);
    }

    public static final class BroadcastReceiver implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ InvestUniv3SubscribeActivity OLrzqt;
        public final /* synthetic */ InvestUniv3SubscribeReceiveInfo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver(View view, long j, InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo, InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = investUniv3SubscribeReceiveInfo;
            this.OLrzqt = investUniv3SubscribeActivity;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.iUX.ActionBar.newInstance$default(o.iUX$ActionBar, com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo, boolean, int, java.lang.Object):o.iUX */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                iUX.ActionBar.newInstance$default(iUX.Companion, this.copydefault.getTransactionLossInfo(), false, 2, null).show(this.OLrzqt.getSupportFragmentManager(), (String) null);
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ InvestUniv3SubscribeActivity OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(View view, long j, InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = investUniv3SubscribeActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                InvestUniv3SubscribeActivity.gHZMYf(this.OLrzqt);
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ InvestUniv3SubscribeActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j, InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = investUniv3SubscribeActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                InvestUniv3SubscribeActivity.gHZMYf(this.copydefault);
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ InvestUniv3SubscribeActivity OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(View view, long j, InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = investUniv3SubscribeActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.OLrzqt);
                viewOnClickListenerC54939xaY.KWHzl(C25493ixk.Activity.fFgQHt);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C25493ixk.FragmentManager.DcMfJKOmnske, (View.OnClickListener) null, 2, (Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ Context EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(View view, long j, Context context) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C27496jwL c27496jwL = C27496jwL.EZpvd;
                Intrinsics.copydefault(this.EZpvd);
                Context context = this.EZpvd;
                C27496jwL.showDialog$default(c27496jwL, context, context.getString(C25493ixk.FragmentManager.ggKfIT), this.EZpvd.getString(C25493ixk.FragmentManager.DQzvGNdrmXxudrmXxu), null, false, false, this.EZpvd.getString(C25493ixk.FragmentManager.gwwfep), null, null, null, false, 1976, null);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ InvestUniv3SubscribeActivity OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = investUniv3SubscribeActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.iwGUEr();
            }
        }
    }

    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ InvestUniv3SubscribeReceiveInfo OLrzqt;
        public final /* synthetic */ InvestUniv3SubscribeActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(View view, long j, InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo, InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = investUniv3SubscribeReceiveInfo;
            this.copydefault = investUniv3SubscribeActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                iUX.ActionBar.newInstance$default(iUX.Companion, this.OLrzqt.getTransactionLossInfo(), false, 2, null).show(this.copydefault.getSupportFragmentManager(), (String) null);
            }
        }
    }

    public static final void KWHzl(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, ActivityResult activityResult) {
        android.content.Intent data;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null) {
            return;
        }
        String stringExtra = data.getStringExtra("result_slippage_mode");
        if (stringExtra == null) {
            stringExtra = "DYNAMIC";
        }
        SwapSlippageActivity.SlippageMode slippageModeValueOf = SwapSlippageActivity.SlippageMode.valueOf(stringExtra);
        String stringExtra2 = data.getStringExtra("result_max_slippage");
        String stringExtra3 = data.getStringExtra("result_fixed_slippage");
        if (stringExtra3 == null) {
            stringExtra3 = SlippageConfigVo.MAX_SLIP;
        }
        boolean booleanExtra = data.getBooleanExtra("result_is_custom", false);
        boolean booleanExtra2 = data.getBooleanExtra("result_dynamic_is_custom", false);
        boolean booleanExtra3 = data.getBooleanExtra("result_user_set_fixed_slippage", false);
        investUniv3SubscribeActivity.isConnected().KWHzl(slippageModeValueOf);
        investUniv3SubscribeActivity.isConnected().OLrzqt(stringExtra2);
        investUniv3SubscribeActivity.isConnected().EZpvd(stringExtra3);
        investUniv3SubscribeActivity.isConnected().AYXKKw(booleanExtra);
        investUniv3SubscribeActivity.isConnected().valueOf(booleanExtra2);
        investUniv3SubscribeActivity.isConnected().gEmmrt(booleanExtra3);
        investUniv3SubscribeActivity.wlaJM();
    }

    public final void wlaJM() {
        String swapSlippage;
        C23792iJm c23792iJm = this.getFieldNames;
        if (c23792iJm != null) {
            if (isConnected().OuxcSI() || isConnected().OBJEWx()) {
                C27492jwH c27492jwH = C27492jwH.OLrzqt;
                InvestUniv3SubscribeViewModel investUniv3SubscribeViewModelIsConnected = isConnected();
                InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfoIsConnected = isConnected().isConnected();
                if (investUniv3SubscribeReceiveInfoIsConnected == null || (swapSlippage = investUniv3SubscribeReceiveInfoIsConnected.getSwapSlippage()) == null) {
                    swapSlippage = "";
                }
                String ratePercent$default = C27492jwH.formatRatePercent$default(c27492jwH, investUniv3SubscribeViewModelIsConnected.KWHzl(swapSlippage), false, 2, null);
                int i = ActionBar.AEQbTJ[isConnected().finit().ordinal()];
                if (i == 1) {
                    ratePercent$default = C33069mpW.KWHzl(this, C25493ixk.FragmentManager.zblBkD, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", ratePercent$default)));
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c23792iJm.AEQbTJ.setText(ratePercent$default);
            }
        }
    }

    private final C23611iCu<InvestTransactionModel> gHZMYf() {
        return (C23611iCu) this.getNewProxyInstance.getValue();
    }

    public static final void KWHzl(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, InvestTransactionModel investTransactionModel) {
        Integer pushToastCode;
        Intrinsics.checkNotNullParameter(investTransactionModel, "");
        Bundle bundleEZpvd = investUniv3SubscribeActivity.isConnected().EZpvd();
        if (bundleEZpvd != null) {
            if ((C33129mqd.OLrzqt((CharSequence) investTransactionModel.getTxHash()) && Intrinsics.EZpvd((Object) investTransactionModel.getTxHash(), (Object) bundleEZpvd.getString("tx_hash"))) || (C33129mqd.OLrzqt((CharSequence) investTransactionModel.getUopHash()) && Intrinsics.EZpvd((Object) investTransactionModel.getUopHash(), (Object) bundleEZpvd.getString("tx_uop_hash")))) {
                Integer pushToastCode2 = investTransactionModel.getPushToastCode();
                if ((pushToastCode2 != null && pushToastCode2.intValue() == 1) || ((pushToastCode = investTransactionModel.getPushToastCode()) != null && pushToastCode.intValue() == 5)) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(investUniv3SubscribeActivity), null, null, new InvestUniv3SubscribeActivity$mObserver$1$1$1(investUniv3SubscribeActivity, null), 3, null);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EditMode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ EditMode[] $VALUES;
        public static final EditMode DEPTH_CHART = new EditMode("DEPTH_CHART", 0);
        public static final EditMode PRICE_CHART = new EditMode("PRICE_CHART", 1);
        public static final EditMode EDIT_VIEW = new EditMode("EDIT_VIEW", 2);
        public static final EditMode NONE = new EditMode("NONE", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ EditMode[] $values() {
            return new EditMode[]{DEPTH_CHART, PRICE_CHART, EDIT_VIEW, NONE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<EditMode> getEntries() {
            return $ENTRIES;
        }

        static {
            EditMode[] editModeArr$values = $values();
            $VALUES = editModeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(editModeArr$values);
        }

        private EditMode(String str, int i) {
        }

        public static EditMode valueOf(String str) {
            return (EditMode) Enum.valueOf(EditMode.class, str);
        }

        public static EditMode[] values() {
            return (EditMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AmountInputIndex {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AmountInputIndex[] $VALUES;
        public static final AmountInputIndex First = new AmountInputIndex("First", 0);
        public static final AmountInputIndex Second = new AmountInputIndex("Second", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AmountInputIndex[] $values() {
            return new AmountInputIndex[]{First, Second};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AmountInputIndex> getEntries() {
            return $ENTRIES;
        }

        static {
            AmountInputIndex[] amountInputIndexArr$values = $values();
            $VALUES = amountInputIndexArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(amountInputIndexArr$values);
        }

        private AmountInputIndex(String str, int i) {
        }

        public static AmountInputIndex valueOf(String str) {
            return (AmountInputIndex) Enum.valueOf(AmountInputIndex.class, str);
        }

        public static AmountInputIndex[] values() {
            return (AmountInputIndex[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public final class Activity extends AbstractC27236jrQ {
        public final /* synthetic */ InvestUniv3SubscribeActivity EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull InvestUniv3SubscribeActivity investUniv3SubscribeActivity, EditMode editMode) {
            super(editMode);
            Intrinsics.checkNotNullParameter(editMode, "");
            this.EZpvd = investUniv3SubscribeActivity;
        }

        @Override // o.AbstractC27236jrQ
        public C27315jsq copydefault(@NotNull C27315jsq c27315jsq) {
            Intrinsics.checkNotNullParameter(c27315jsq, "");
            this.EZpvd.AEQbTJ();
            this.EZpvd.AYXKKw();
            if (AEQbTJ(this.EZpvd.isConnected().AxsJAYaxsJAY().KWHzl()).compareTo(AEQbTJ(c27315jsq.KWHzl())) <= 0) {
                if (this.EZpvd.djBIcL().getValue() == EditMode.NONE) {
                    C55328xhq.show$default(C55328xhq.OLrzqt, this.EZpvd.getString(C25493ixk.FragmentManager.iHkeWl), ContextCompat.getDrawable(this.EZpvd, C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
                }
                c27315jsq = AEQbTJ(this.EZpvd.isConnected().AxsJAYaxsJAY().KWHzl(), false);
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.EZpvd), null, null, new InvestUniv3SubscribeActivity$PriceChangeCallback$onLowPriceChange$1(this.EZpvd, c27315jsq, null), 3, null);
            return c27315jsq;
        }

        @Override // o.AbstractC27236jrQ
        public C27315jsq EZpvd(@NotNull C27315jsq c27315jsq) {
            Intrinsics.checkNotNullParameter(c27315jsq, "");
            this.EZpvd.AYXKKw();
            this.EZpvd.AEQbTJ();
            if (AEQbTJ(this.EZpvd.isConnected().AxsJAY().KWHzl()).compareTo(AEQbTJ(c27315jsq.KWHzl())) >= 0) {
                if (this.EZpvd.djBIcL().getValue() == EditMode.NONE) {
                    C55328xhq.show$default(C55328xhq.OLrzqt, this.EZpvd.getString(C25493ixk.FragmentManager.iHkeWl), ContextCompat.getDrawable(this.EZpvd, C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
                }
                c27315jsq = AEQbTJ(this.EZpvd.isConnected().AxsJAY().KWHzl(), true);
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.EZpvd), null, null, new InvestUniv3SubscribeActivity$PriceChangeCallback$onHighPriceChange$1(this.EZpvd, c27315jsq, null), 3, null);
            return c27315jsq;
        }

        @Override // o.AbstractC27236jrQ
        public void EZpvd(boolean z) {
            this.EZpvd.zsXlph();
            this.EZpvd.AEQbTJ();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.EZpvd), null, null, new InvestUniv3SubscribeActivity$PriceChangeCallback$onEditModeChange$1(this.EZpvd, z, this, null), 3, null);
        }

        @Override // o.AbstractC27236jrQ
        public C27315jsq AEQbTJ(int i, boolean z) {
            int iFFgQHt = i + (this.EZpvd.isConnected().fFgQHt() * (!(z ^ this.EZpvd.ejfBZ()) ? 1 : -1));
            return new C27315jsq(AEQbTJ(iFFgQHt), iFFgQHt);
        }

        @Override // o.AbstractC27236jrQ
        public void OLrzqt() {
            Vibrator vibrator = this.EZpvd.sSMYrx;
            if (vibrator != null) {
                vibrator.vibrate(100L);
            }
        }

        @Override // o.AbstractC27236jrQ
        public BigDecimal AEQbTJ(int i) {
            return this.EZpvd.isConnected().OLrzqt(i);
        }

        @Override // o.AbstractC27236jrQ
        public int copydefault(@NotNull BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            return this.EZpvd.isConnected().KWHzl(bigDecimal);
        }

        @Override // o.AbstractC27236jrQ
        public int AEQbTJ(@NotNull BigDecimal bigDecimal, boolean z) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            return this.EZpvd.isConnected().copydefault(bigDecimal, z);
        }
    }

    @Override // o.AbstractActivityC26831jjj, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.AhwBna = C23732iHg.KWHzl(getLayoutInflater());
        android.content.Intent intent = getIntent();
        if (intent != null) {
            TransactionConfig transactionConfig = (TransactionConfig) intent.getParcelableExtra("key.trx_config");
            this.zsXlph = transactionConfig;
            if (transactionConfig != null) {
                this.isConnected = transactionConfig.isConnected();
                this.values = transactionConfig.valueOf();
                this.djBIcL = transactionConfig.copydefault();
                this.wlaJM = transactionConfig.ejfBZ();
            }
            this.hDKMBd = (InvestPoolV3) intent.getParcelableExtra("poolInvestV3");
        }
        C23732iHg c23732iHg = this.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        setContentView(c23732iHg.getRoot());
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        C23732iHg c23732iHg3 = this.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg3 = null;
        }
        this.valueOf = iKU.OLrzqt(layoutInflaterFrom, c23732iHg3.finit);
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().KWHzl();
        final Function1 function1 = new Function1() { // from class: o.jlS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.copydefault(this.copydefault, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.jlQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestUniv3SubscribeActivity.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.jlT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.AEQbTJ(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.jlU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestUniv3SubscribeActivity.EZpvd(function12, obj);
            }
        });
        isConnected().AubY().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jlV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.KWHzl(this.AEQbTJ, (C23958iPq) obj);
            }
        }));
        isConnected().dNCPSb().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jlY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.AEQbTJ(this.OLrzqt, (InvestSubscriptionNewViewModel.SubscriptionResult) obj);
            }
        }));
        isConnected().wlaJM().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jlZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.copydefault(this.KWHzl, (C23948iPg) obj);
            }
        }));
        isConnected().zsXlph().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jlW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.AYXKKw(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        QKVWgx();
        C23732iHg c23732iHg4 = this.AhwBna;
        if (c23732iHg4 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg4 = null;
        }
        C27137jpX c27137jpX = c23732iHg4.AubY;
        c27137jpX.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.iRxXKY));
        c27137jpX.setSubTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.AxsJAYsNCnLh));
        c27137jpX.setButtonText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.AwvSrB));
        C23732iHg c23732iHg5 = this.AhwBna;
        if (c23732iHg5 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg5 = null;
        }
        c23732iHg5.AubY.setRetryClick(new Function0() { // from class: o.jma
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestUniv3SubscribeActivity.QOLQEE(this.copydefault);
            }
        });
        C23732iHg c23732iHg6 = this.AhwBna;
        if (c23732iHg6 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg6 = null;
        }
        C27137jpX c27137jpX2 = c23732iHg6.wlaJM;
        c27137jpX2.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.iRxXKY));
        c27137jpX2.setSubTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.AxsJAYsNCnLh));
        c27137jpX2.setButtonText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.AwvSrB));
        C23732iHg c23732iHg7 = this.AhwBna;
        if (c23732iHg7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23732iHg2 = c23732iHg7;
        }
        c23732iHg2.wlaJM.setRetryClick(new Function0() { // from class: o.jmc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestUniv3SubscribeActivity.QKVWgx(this.AEQbTJ);
            }
        });
        gHZMYf().KWHzl().observeForever(this.iwGUEr);
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (!interfaceC9738bbJ.zsXlph() && !interfaceC9738bbJ.UeEOUB()) {
            investUniv3SubscribeActivity.AEQbTJ(interfaceC9738bbJ.DbNXlk(), interfaceC9738bbJ.EZpvd(investUniv3SubscribeActivity.djBIcL));
        } else {
            investUniv3SubscribeActivity.AEQbTJ("", "");
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Throwable th) {
        investUniv3SubscribeActivity.AEQbTJ("", "");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, C23958iPq c23958iPq) {
        C23732iHg c23732iHg = null;
        if (c23958iPq.KWHzl()) {
            C23732iHg c23732iHg2 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg2 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg2 = null;
            }
            c23732iHg2.AubY.setVisibility(8);
            C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg3 = null;
            }
            c23732iHg3.accept.setVisibility(0);
            C23732iHg c23732iHg4 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg4 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg4 = null;
            }
            c23732iHg4.zuBGHE.setVisibility(0);
            C23732iHg c23732iHg5 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg5 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg5 = null;
            }
            c23732iHg5.djBIcL.setVisibility(0);
            C23732iHg c23732iHg6 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg6 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg6 = null;
            }
            C27207jqo c27207jqo = c23732iHg6.QKVWgx;
            Intrinsics.checkNotNullExpressionValue(c27207jqo, "");
            C57600ylV.AEQbTJ(c27207jqo);
            C23732iHg c23732iHg7 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg7 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg7 = null;
            }
            c23732iHg7.ORxRYg.setVisibility(0);
            rVN.reportFullyDrawn$default((android.app.Activity) investUniv3SubscribeActivity, true, (String) null, 2, (Object) null);
        } else {
            C23732iHg c23732iHg8 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg8 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg8 = null;
            }
            c23732iHg8.ORxRYg.setVisibility(8);
            C23732iHg c23732iHg9 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg9 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg9 = null;
            }
            c23732iHg9.AubY.setVisibility(0);
            C23732iHg c23732iHg10 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg10 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg10 = null;
            }
            c23732iHg10.accept.setVisibility(8);
            C23732iHg c23732iHg11 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg11 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg11 = null;
            }
            c23732iHg11.zuBGHE.setVisibility(8);
            C23732iHg c23732iHg12 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg12 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg12 = null;
            }
            c23732iHg12.djBIcL.setVisibility(8);
            C23732iHg c23732iHg13 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg13 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg13 = null;
            }
            C27207jqo c27207jqo2 = c23732iHg13.QKVWgx;
            Intrinsics.checkNotNullExpressionValue(c27207jqo2, "");
            C57600ylV.AEQbTJ(c27207jqo2);
            rVN.reportFullyDrawn$default((android.app.Activity) investUniv3SubscribeActivity, false, (String) null, 2, (Object) null);
            if (c23958iPq.AEQbTJ()) {
                C23732iHg c23732iHg14 = investUniv3SubscribeActivity.AhwBna;
                if (c23732iHg14 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c23732iHg = c23732iHg14;
                }
                c23732iHg.AubY.setSubTitleShow(true);
            } else {
                C23732iHg c23732iHg15 = investUniv3SubscribeActivity.AhwBna;
                if (c23732iHg15 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c23732iHg = c23732iHg15;
                }
                c23732iHg.AubY.setSubTitleShow(false);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, InvestSubscriptionNewViewModel.SubscriptionResult subscriptionResult) {
        if (subscriptionResult.copydefault() == 3) {
            investUniv3SubscribeActivity.AEQbTJ(subscriptionResult.OLrzqt(), subscriptionResult.KWHzl());
        }
        if (subscriptionResult.copydefault() != 3) {
            subscriptionResult.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, C23948iPg c23948iPg) {
        if (c23948iPg.EZpvd()) {
            investUniv3SubscribeActivity.QOLQEE();
            C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
            C23732iHg c23732iHg2 = null;
            if (c23732iHg == null) {
                Intrinsics.gEmmrt("");
                c23732iHg = null;
            }
            c23732iHg.fvQaOB.OLrzqt();
            C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg2 = c23732iHg3;
            }
            c23732iHg2.giSNqX.OLrzqt();
            investUniv3SubscribeActivity.KWHzl(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Boolean bool) {
        if (bool.booleanValue()) {
            investUniv3SubscribeActivity.showLoading();
        } else {
            investUniv3SubscribeActivity.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit QOLQEE(InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
        investUniv3SubscribeActivity.AEQbTJ(investUniv3SubscribeActivity.zuBGHE, investUniv3SubscribeActivity.AYXKKw);
        return Unit.INSTANCE;
    }

    public static final Unit QKVWgx(InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
        String str = investUniv3SubscribeActivity.gEmmrt;
        if (Intrinsics.EZpvd((Object) str, (Object) "CHART_TYPE_DEPTH")) {
            C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg == null) {
                Intrinsics.gEmmrt("");
                c23732iHg = null;
            }
            C55113xdn.showLoading$default(c23732iHg.DbNXlk, 0L, 1, null);
            loadDepthChartData$default(investUniv3SubscribeActivity, false, 1, null);
        } else if (Intrinsics.EZpvd((Object) str, (Object) "CHART_TYPE_PRICE")) {
            C23732iHg c23732iHg2 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg2 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg2 = null;
            }
            C55113xdn.showLoading$default(c23732iHg2.DbNXlk, 0L, 1, null);
            loadPriceChartData$default(investUniv3SubscribeActivity, null, false, 3, null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.zuBGHE = str;
        this.AYXKKw = str2;
        C23732iHg c23732iHg = this.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.QKVWgx.setVisibility(0);
        C23732iHg c23732iHg2 = this.AhwBna;
        if (c23732iHg2 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg2 = null;
        }
        C27207jqo c27207jqo = c23732iHg2.QKVWgx;
        Intrinsics.checkNotNullExpressionValue(c27207jqo, "");
        C27301jsc.copydefault(c27207jqo);
        C23732iHg c23732iHg3 = this.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg3 = null;
        }
        NestedScrollView nestedScrollView = c23732iHg3.ORxRYg;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        nestedScrollView.setVisibility(8);
        this.AxsJAY = new ZapPageData(str, str2, this.isConnected, this.wlaJM, this.djBIcL, 0, 0, 96, null);
        InvestUniv3SubscribeViewModel investUniv3SubscribeViewModelIsConnected = isConnected();
        String str3 = this.AYXKKw;
        long j = this.isConnected;
        long j2 = this.djBIcL;
        String str4 = this.wlaJM;
        ArrayList<InvestInputData> arrayList = this.values;
        investUniv3SubscribeViewModelIsConnected.AEQbTJ(str, str3, j, j2, str4, false, arrayList != null ? (InvestInputData) CollectionsKt___CollectionsKt.AkhnZx(arrayList, 0) : null, this.hDKMBd);
        AwvSrB();
    }

    private final void QKVWgx() {
        final C23732iHg c23732iHg = this.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        ViewCompat.setOnApplyWindowInsetsListener(c23732iHg.getRoot(), new OnApplyWindowInsetsListener() { // from class: o.jlw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return InvestUniv3SubscribeActivity.copydefault(c23732iHg, view, windowInsetsCompat);
            }
        });
        fJNWhG();
        AkhnZx();
        if (this.wlaJM.length() == 0) {
            fetchVPNInfo();
            fIwbmz();
            fARcdN();
            zLjUOn();
        } else {
            C23732iHg c23732iHg3 = this.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg3 = null;
            }
            c23732iHg3.RJOkX.OLrzqt();
            C23732iHg c23732iHg4 = this.AhwBna;
            if (c23732iHg4 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg4 = null;
            }
            c23732iHg4.QVAiDq.OLrzqt();
            C23732iHg c23732iHg5 = this.AhwBna;
            if (c23732iHg5 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg5 = null;
            }
            C55249xgQ c55249xgQ = c23732iHg5.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(c55249xgQ, "");
            c55249xgQ.setVisibility(8);
            C23732iHg c23732iHg6 = this.AhwBna;
            if (c23732iHg6 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg6 = null;
            }
            ImageView imageView = c23732iHg6.zLjUOn;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            C23732iHg c23732iHg7 = this.AhwBna;
            if (c23732iHg7 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg7 = null;
            }
            ImageView imageView2 = c23732iHg7.zsXlph;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            C23732iHg c23732iHg8 = this.AhwBna;
            if (c23732iHg8 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg8 = null;
            }
            C27221jrB c27221jrB = c23732iHg8.iwGUEr;
            Intrinsics.checkNotNullExpressionValue(c27221jrB, "");
            c27221jrB.setVisibility(8);
            C23732iHg c23732iHg9 = this.AhwBna;
            if (c23732iHg9 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg9 = null;
            }
            InvestUniv3PriceChart investUniv3PriceChart = c23732iHg9.QUSxYX;
            Intrinsics.checkNotNullExpressionValue(investUniv3PriceChart, "");
            investUniv3PriceChart.setVisibility(8);
            C23732iHg c23732iHg10 = this.AhwBna;
            if (c23732iHg10 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg10 = null;
            }
            TextView textView = c23732iHg10.fFgQHt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            C23732iHg c23732iHg11 = this.AhwBna;
            if (c23732iHg11 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg11 = null;
            }
            ImageView imageView3 = c23732iHg11.dNCPSb;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
            C23732iHg c23732iHg12 = this.AhwBna;
            if (c23732iHg12 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg12 = null;
            }
            LinearLayout linearLayout = c23732iHg12.UeEOUB;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            C23732iHg c23732iHg13 = this.AhwBna;
            if (c23732iHg13 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg13 = null;
            }
            ConstraintLayout constraintLayout = c23732iHg13.sSMYrx;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
        }
        C23732iHg c23732iHg14 = this.AhwBna;
        if (c23732iHg14 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg14 = null;
        }
        c23732iHg14.RJOkX.setType(InvestUniv3PriceInputView.InputType.MAX_PRICE);
        C23732iHg c23732iHg15 = this.AhwBna;
        if (c23732iHg15 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg15 = null;
        }
        c23732iHg15.QVAiDq.setType(InvestUniv3PriceInputView.InputType.MIN_PRICE);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$initView$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$initView$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$initView$4(this, null), 3, null);
        C23732iHg c23732iHg16 = this.AhwBna;
        if (c23732iHg16 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg16 = null;
        }
        InvestUniv3PriceInputView investUniv3PriceInputView = c23732iHg16.QVAiDq;
        EditMode editMode = EditMode.EDIT_VIEW;
        investUniv3PriceInputView.setPriceChangeCallback(new Activity(this, editMode));
        C23732iHg c23732iHg17 = this.AhwBna;
        if (c23732iHg17 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg17 = null;
        }
        c23732iHg17.RJOkX.setPriceChangeCallback(new Activity(this, editMode));
        isConnected().getNewProxyInstance().setValue(new BigDecimal(2));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$initView$5(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$initView$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$initView$7(this, null), 3, null);
        Function2<? super C55001xbh, ? super String, Unit> function2 = new Function2() { // from class: o.jlx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return InvestUniv3SubscribeActivity.EZpvd(this.OLrzqt, (C55001xbh) obj, (java.lang.String) obj2);
            }
        };
        Function1<? super View, Unit> function1 = new Function1() { // from class: o.jly
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.fetchVPNInfo(this.KWHzl, (android.view.View) obj);
            }
        };
        C23732iHg c23732iHg18 = this.AhwBna;
        if (c23732iHg18 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg18 = null;
        }
        c23732iHg18.fvQaOB.setTagAndDelayedTextWatcher(AmountInputIndex.First, function2);
        C23732iHg c23732iHg19 = this.AhwBna;
        if (c23732iHg19 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg19 = null;
        }
        c23732iHg19.giSNqX.setTagAndDelayedTextWatcher(AmountInputIndex.Second, function2);
        C23732iHg c23732iHg20 = this.AhwBna;
        if (c23732iHg20 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg20 = null;
        }
        c23732iHg20.fvQaOB.setGetFocusCallback(function1);
        C23732iHg c23732iHg21 = this.AhwBna;
        if (c23732iHg21 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg21 = null;
        }
        c23732iHg21.giSNqX.setGetFocusCallback(function1);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o.jlz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                InvestUniv3SubscribeActivity.isConnected(this.copydefault, view);
            }
        };
        C23732iHg c23732iHg22 = this.AhwBna;
        if (c23732iHg22 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg22 = null;
        }
        c23732iHg22.fvQaOB.setClickablePromptListener(onClickListener);
        C23732iHg c23732iHg23 = this.AhwBna;
        if (c23732iHg23 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg23 = null;
        }
        c23732iHg23.giSNqX.setClickablePromptListener(onClickListener);
        C23732iHg c23732iHg24 = this.AhwBna;
        if (c23732iHg24 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg24 = null;
        }
        c23732iHg24.DAIeex.setOnClickListener(new View.OnClickListener() { // from class: o.jlC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                InvestUniv3SubscribeActivity.DbNXlk(this.copydefault, view);
            }
        });
        getFieldNames();
        zuBGHE();
        DbNXlk();
        ORxRYg();
        C27589jxz.collectOnLifecycle$default(this, isConnected().KWHzl(), null, new AssistContent(), 2, null);
        C27589jxz.collectOnLifecycle$default(this, isConnected().giSNqX(), null, new LoaderManager(), 2, null);
        C23732iHg c23732iHg25 = this.AhwBna;
        if (c23732iHg25 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg25 = null;
        }
        c23732iHg25.fARcdN.setOnCTAButtonClick(new Function0() { // from class: o.jlF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestUniv3SubscribeActivity.DTwDnp(this.copydefault);
            }
        });
        C23732iHg c23732iHg26 = this.AhwBna;
        if (c23732iHg26 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg26 = null;
        }
        C55113xdn c55113xdn = c23732iHg26.DCJXGO;
        C23732iHg c23732iHg27 = this.AhwBna;
        if (c23732iHg27 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg27 = null;
        }
        Context context = c23732iHg27.DCJXGO.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55113xdn.setAnimationFromUrl(C7827arF.EZpvd("lottie/web3_defi/defi_v3_zap.lottie", context, true));
        C23732iHg c23732iHg28 = this.AhwBna;
        if (c23732iHg28 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23732iHg2 = c23732iHg28;
        }
        c23732iHg2.DXXBbs.setSwitchCallback(new PictureInPictureParams());
    }

    public static final WindowInsetsCompat copydefault(C23732iHg c23732iHg, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        C33537myN c33537myN = c23732iHg.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c33537myN, "");
        c33537myN.setPaddingRelative(c33537myN.getPaddingStart(), insets.top, c33537myN.getPaddingEnd(), c33537myN.getPaddingBottom());
        return windowInsetsCompat;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, C55001xbh c55001xbh, String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (investUniv3SubscribeActivity.fIwbmz) {
            Object tag = c55001xbh.getTag();
            AmountInputIndex amountInputIndex = AmountInputIndex.First;
            C23732iHg c23732iHg = null;
            if (tag == amountInputIndex) {
                C23732iHg c23732iHg2 = investUniv3SubscribeActivity.AhwBna;
                if (c23732iHg2 == null) {
                    Intrinsics.gEmmrt("");
                    c23732iHg2 = null;
                }
                if (c23732iHg2.fvQaOB.KWHzl()) {
                    investUniv3SubscribeActivity.AuCTel = amountInputIndex;
                    if (!investUniv3SubscribeActivity.fJNWhG) {
                        amountInputIndex = AmountInputIndex.Second;
                    }
                    investUniv3SubscribeActivity.OLrzqt(str, amountInputIndex);
                } else {
                    C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
                    if (c23732iHg3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c23732iHg = c23732iHg3;
                    }
                    if (c23732iHg.fvQaOB.AYXKKw()) {
                    }
                }
            } else {
                C23732iHg c23732iHg4 = investUniv3SubscribeActivity.AhwBna;
                if (c23732iHg4 == null) {
                    Intrinsics.gEmmrt("");
                    c23732iHg4 = null;
                }
                if (c23732iHg4.giSNqX.KWHzl()) {
                    AmountInputIndex amountInputIndex2 = AmountInputIndex.Second;
                    investUniv3SubscribeActivity.AuCTel = amountInputIndex2;
                    if (investUniv3SubscribeActivity.fJNWhG) {
                        amountInputIndex = amountInputIndex2;
                    }
                    investUniv3SubscribeActivity.OLrzqt(str, amountInputIndex);
                } else {
                    C23732iHg c23732iHg5 = investUniv3SubscribeActivity.AhwBna;
                    if (c23732iHg5 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c23732iHg = c23732iHg5;
                    }
                    if (c23732iHg.giSNqX.AYXKKw()) {
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        investUniv3SubscribeActivity.isConnected().KWHzl(true);
        Object tag = view.getTag();
        AmountInputIndex amountInputIndex = tag instanceof AmountInputIndex ? (AmountInputIndex) tag : null;
        if (amountInputIndex != null) {
            investUniv3SubscribeActivity.AuCTel = amountInputIndex;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v16, types: [T, java.lang.Object, java.lang.String] */
    public static final void isConnected(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, View view) {
        Object tag = view.getTag();
        Pair pair = tag instanceof Pair ? (Pair) tag : null;
        if (pair == null) {
            return;
        }
        Object objComponent1 = pair.component1();
        Object objComponent2 = pair.component2();
        AmountInputIndex amountInputIndex = objComponent2 instanceof AmountInputIndex ? (AmountInputIndex) objComponent2 : null;
        if (amountInputIndex == null) {
            return;
        }
        if (Intrinsics.EZpvd(objComponent1, (Object) 2)) {
            InvestTokenWithAmount investTokenWithAmountEZpvd = investUniv3SubscribeActivity.isConnected().EZpvd(amountInputIndex == AmountInputIndex.First);
            if (investTokenWithAmountEZpvd != null) {
                investUniv3SubscribeActivity.AEQbTJ(investTokenWithAmountEZpvd);
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd(objComponent1, (Object) 1)) {
            investUniv3SubscribeActivity.OcIXYQ();
            investUniv3SubscribeActivity.AEQbTJ();
            investUniv3SubscribeActivity.isConnected().KWHzl(true);
            InvestTokenWithAmount investTokenWithAmountEZpvd2 = investUniv3SubscribeActivity.isConnected().EZpvd(amountInputIndex == AmountInputIndex.First);
            if (investTokenWithAmountEZpvd2 != null) {
                investUniv3SubscribeActivity.AuCTel = amountInputIndex;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = investTokenWithAmountEZpvd2.getCoinAmount();
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                if (investTokenWithAmountEZpvd2.isBaseToken()) {
                    ?? SubS$default = C33129mqd.subS$default(objectRef.element, investUniv3SubscribeActivity.isConnected().AYXKKw(), null, null, null, 14, null);
                    objectRef.element = SubS$default;
                    if (!C33129mqd.AEQbTJ(SubS$default, 0)) {
                        booleanRef.element = true;
                    } else if (!SPUtils.getBoolean("sp_invest_maxreminder_dialog_never_show", false)) {
                        iTW.Companion.KWHzl("sp_invest_maxreminder_dialog_never_show").show(investUniv3SubscribeActivity.getSupportFragmentManager(), iTW.class.getName());
                    }
                }
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(investUniv3SubscribeActivity), null, null, new InvestUniv3SubscribeActivity$initView$amountInputClickListener$1$2$1(booleanRef, investUniv3SubscribeActivity, amountInputIndex, objectRef, null), 3, null);
            }
        }
    }

    public static final void DbNXlk(final InvestUniv3SubscribeActivity investUniv3SubscribeActivity, View view) {
        if (ActionBar.EZpvd[investUniv3SubscribeActivity.AuCTelauCTel.ordinal()] == 1) {
            investUniv3SubscribeActivity.isConnected().aKErDB().setValue(Boolean.FALSE);
            C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg == null) {
                Intrinsics.gEmmrt("");
                c23732iHg = null;
            }
            C52794wYp.startLoading$default(c23732iHg.DAIeex, 0L, 1, null);
            investUniv3SubscribeActivity.isConnected().ORxRYg().setValue(Boolean.TRUE);
            return;
        }
        refreshDataFirst$default(investUniv3SubscribeActivity, new Function1() { // from class: o.jlD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.copydefault(this.EZpvd, (InvestUniv3SubscribeReceiveInfo) obj);
            }
        }, null, 2, null);
    }

    public static final Unit copydefault(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo) {
        investUniv3SubscribeActivity.QOLQEE();
        showConfirmLayout$default(investUniv3SubscribeActivity, false, 1, null);
        return Unit.INSTANCE;
    }

    public static final class AssistContent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC24173iXp interfaceC24173iXp, Continuation<? super Unit> continuation) {
            C23732iHg c23732iHg = InvestUniv3SubscribeActivity.this.AhwBna;
            if (c23732iHg == null) {
                Intrinsics.gEmmrt("");
                c23732iHg = null;
            }
            c23732iHg.fARcdN.setButtonState(interfaceC24173iXp);
            return Unit.INSTANCE;
        }
    }

    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(iXD ixd, Continuation<? super Unit> continuation) {
            InvestUniv3SubscribeActivity.this.OLrzqt(ixd);
            return Unit.INSTANCE;
        }
    }

    public static final Unit DTwDnp(final InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        Object tag = c23732iHg.fARcdN.getTag();
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num == null || num.intValue() != 4) {
            if (ActionBar.EZpvd[investUniv3SubscribeActivity.AuCTelauCTel.ordinal()] == 1) {
                investUniv3SubscribeActivity.DTwDnp();
            } else {
                investUniv3SubscribeActivity.OLrzqt(new Function1() { // from class: o.jlE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return InvestUniv3SubscribeActivity.EZpvd(this.EZpvd, (InvestUniv3SubscribeReceiveInfo) obj);
                    }
                }, new Function0() { // from class: o.jlB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return InvestUniv3SubscribeActivity.OcIXYQ(this.OLrzqt);
                    }
                });
            }
        } else {
            investUniv3SubscribeActivity.hDKMBd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo) {
        investUniv3SubscribeActivity.DTwDnp();
        return Unit.INSTANCE;
    }

    public static final Unit OcIXYQ(InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
        showInputLayout$default(investUniv3SubscribeActivity, false, 1, null);
        return Unit.INSTANCE;
    }

    public static final class PictureInPictureParams implements InterfaceC27531jwu {
        public PictureInPictureParams() {
        }

        @Override // o.InterfaceC27531jwu
        public void copydefault(boolean z) {
            InvestUniv3Mode investUniv3Mode;
            InvestUniv3SubscribeActivity.this.isConnected().copydefault(z);
            if (InvestUniv3SubscribeActivity.this.AxsJAY == null) {
                return;
            }
            if (!z && InvestUniv3SubscribeActivity.this.AuCTelauCTel == InvestUniv3Mode.Zap) {
                InvestUniv3SubscribeActivity.this.getNewProxyInstance();
                InvestUniv3SubscribeActivity.this.isConnected().KWHzl(InvestUniv3SubscribeActivity.this.isConnected().QOLQEE());
            }
            C23732iHg c23732iHg = InvestUniv3SubscribeActivity.this.AhwBna;
            C23732iHg c23732iHg2 = null;
            if (c23732iHg == null) {
                Intrinsics.gEmmrt("");
                c23732iHg = null;
            }
            ConstraintLayout constraintLayout = c23732iHg.RlQdEF;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(z ^ true ? 0 : 8);
            InvestUniv3SubscribeActivity.this.uzCIH();
            C23732iHg c23732iHg3 = InvestUniv3SubscribeActivity.this.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg3 = null;
            }
            NestedScrollView nestedScrollView = c23732iHg3.ORxRYg;
            final InvestUniv3SubscribeActivity investUniv3SubscribeActivity = InvestUniv3SubscribeActivity.this;
            nestedScrollView.post(new Runnable() { // from class: o.jmv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    InvestUniv3SubscribeActivity.PictureInPictureParams.OLrzqt(investUniv3SubscribeActivity);
                }
            });
            InvestUniv3SubscribeActivity investUniv3SubscribeActivity2 = InvestUniv3SubscribeActivity.this;
            if (z) {
                investUniv3Mode = InvestUniv3Mode.Zap;
            } else {
                investUniv3Mode = InvestUniv3Mode.Normal;
            }
            investUniv3SubscribeActivity2.AuCTelauCTel = investUniv3Mode;
            InvestUniv3SubscribeActivity.this.isConnected().AEQbTJ(z);
            InvestUniv3SubscribeActivity investUniv3SubscribeActivity3 = InvestUniv3SubscribeActivity.this;
            C23732iHg c23732iHg4 = investUniv3SubscribeActivity3.AhwBna;
            if (c23732iHg4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg2 = c23732iHg4;
            }
            FragmentContainerView fragmentContainerView = c23732iHg2.DTwDnp;
            Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
            String strValueOf = String.valueOf(C56524yIo.AEQbTJ(C27042jni.class).valueOf());
            final InvestUniv3SubscribeActivity investUniv3SubscribeActivity4 = InvestUniv3SubscribeActivity.this;
            investUniv3SubscribeActivity3.OLrzqt(z, fragmentContainerView, strValueOf, (Function0<? extends androidx.fragment.app.Fragment>) new Function0() { // from class: o.jmw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return InvestUniv3SubscribeActivity.PictureInPictureParams.EZpvd(investUniv3SubscribeActivity4);
                }
            });
        }

        public static final void OLrzqt(InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
            C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg == null) {
                Intrinsics.gEmmrt("");
                c23732iHg = null;
            }
            c23732iHg.ORxRYg.fullScroll(130);
        }

        public static final androidx.fragment.app.Fragment EZpvd(InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
            C27042jni.ActionBar actionBar = C27042jni.Companion;
            ZapPageData zapPageData = investUniv3SubscribeActivity.AxsJAY;
            Intrinsics.copydefault(zapPageData);
            return actionBar.copydefault(zapPageData);
        }

        @Override // o.InterfaceC27531jwu
        public void AEQbTJ() {
            C24114iVk.Application application = C24114iVk.Companion;
            String string = InvestUniv3SubscribeActivity.this.getString(C25493ixk.FragmentManager.fHqPtx);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = InvestUniv3SubscribeActivity.this.getString(C25493ixk.FragmentManager.WS);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            application.EZpvd(string, string2).show(InvestUniv3SubscribeActivity.this.getSupportFragmentManager(), C24114iVk.class.getName());
        }
    }

    private final void ORxRYg() {
        isConnected().aKErDB().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jlK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.gEmmrt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        isConnected().gHZMYf().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jlH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.KWHzl(this.copydefault, (java.lang.String) obj);
            }
        }));
        isConnected().QKVWgx().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jlI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.EZpvd(this.OLrzqt, (C27024jnQ) obj);
            }
        }));
        isConnected().DTwDnp().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jlG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.djBIcL(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        isConnected().dxcTrN().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jlJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.OLrzqt(this.AEQbTJ, (kotlin.Pair) obj);
            }
        }));
    }

    public static final Unit gEmmrt(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Boolean bool) {
        C23732iHg c23732iHg = null;
        if (bool.booleanValue()) {
            C23732iHg c23732iHg2 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg2 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg2 = null;
            }
            C55113xdn c55113xdn = c23732iHg2.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(0);
            C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg3 = null;
            }
            C55113xdn c55113xdn2 = c23732iHg3.getFieldNames;
            Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
            c55113xdn2.setVisibility(0);
            C23732iHg c23732iHg4 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg4 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg4 = null;
            }
            TextView textView = c23732iHg4.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            C23732iHg c23732iHg5 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg = c23732iHg5;
            }
            TextView textView2 = c23732iHg.AwvSrB;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        } else {
            C23732iHg c23732iHg6 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg6 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg6 = null;
            }
            C55113xdn c55113xdn3 = c23732iHg6.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
            c55113xdn3.setVisibility(8);
            C23732iHg c23732iHg7 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg = c23732iHg7;
            }
            C55113xdn c55113xdn4 = c23732iHg.getFieldNames;
            Intrinsics.checkNotNullExpressionValue(c55113xdn4, "");
            c55113xdn4.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, String str) {
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.gEmmrt.setText(str);
        C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg3 = null;
        }
        TextView textView = c23732iHg3.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        C23732iHg c23732iHg4 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23732iHg2 = c23732iHg4;
        }
        C55113xdn c55113xdn = c23732iHg2.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.iyi.getLossEntryTextViewColor$default(com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo, int, int, java.lang.Object):int */
    public static final Unit EZpvd(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, C27024jnQ c27024jnQ) {
        C23795iJp c23795iJp;
        InvestTipInfoVo estDailyYieldTip;
        String currencyAmount;
        String currencyData$default;
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        C55113xdn c55113xdn = c23732iHg.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        int i = 8;
        c55113xdn.setVisibility(8);
        C23732iHg c23732iHg2 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg2 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg2 = null;
        }
        TextView textView = c23732iHg2.AwvSrB;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        String str = "--";
        if (ActionBar.copydefault[c27024jnQ.copydefault().ordinal()] == 1) {
            C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg3 = null;
            }
            c23732iHg3.AwvSrB.setText("--");
            C23732iHg c23732iHg4 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg4 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg4 = null;
            }
            c23732iHg4.AwvSrB.setTextColor(ContextCompat.getColor(investUniv3SubscribeActivity, C52761wXj.Activity.fdOvFl));
            C23732iHg c23732iHg5 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg5 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg5 = null;
            }
            c23732iHg5.AwvSrB.setCompoundDrawablesRelative(null, null, null, null);
        } else {
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfoAEQbTJ = c27024jnQ.AEQbTJ();
            Intrinsics.copydefault(investUniv3SubscribeReceiveInfoAEQbTJ);
            C23732iHg c23732iHg6 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg6 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg6 = null;
            }
            TextView textView2 = c23732iHg6.AwvSrB;
            InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investUniv3SubscribeReceiveInfoAEQbTJ.getGainsTokenList());
            if (investTokenWithAmount != null && (currencyAmount = investTokenWithAmount.getCurrencyAmount()) != null && (currencyData$default = C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, currencyAmount, null, null, null, 14, null)) != null) {
                str = currencyData$default;
            }
            textView2.setText(str);
            InvestUniv3SubscribePromptInformation promptInformation = investUniv3SubscribeReceiveInfoAEQbTJ.getPromptInformation();
            if (promptInformation != null && (estDailyYieldTip = promptInformation.getEstDailyYieldTip()) != null) {
                if (C33129mqd.OLrzqt((CharSequence) estDailyYieldTip.getTipContent())) {
                    C23732iHg c23732iHg7 = investUniv3SubscribeActivity.AhwBna;
                    if (c23732iHg7 == null) {
                        Intrinsics.gEmmrt("");
                        c23732iHg7 = null;
                    }
                    c23732iHg7.AwvSrB.setText(estDailyYieldTip.getTipContent());
                }
                C27569jxf c27569jxf = C27569jxf.OLrzqt;
                C23732iHg c23732iHg8 = investUniv3SubscribeActivity.AhwBna;
                if (c23732iHg8 == null) {
                    Intrinsics.gEmmrt("");
                    c23732iHg8 = null;
                }
                TextView textView3 = c23732iHg8.AwvSrB;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                c27569jxf.AEQbTJ(investUniv3SubscribeActivity, null, textView3, estDailyYieldTip, (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
            }
            C23732iHg c23732iHg9 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg9 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg9 = null;
            }
            TextView textView4 = c23732iHg9.AwvSrB;
            InvestUniv3SubscribePromptInformation promptInformation2 = investUniv3SubscribeReceiveInfoAEQbTJ.getPromptInformation();
            textView4.setTextColor(ContextCompat.getColor(investUniv3SubscribeActivity, (promptInformation2 != null ? promptInformation2.getEstDailyYieldTip() : null) == null ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.iLAtSv));
            Drawable drawable = ContextCompat.getDrawable(investUniv3SubscribeActivity, C52761wXj.TaskDescription.GGlJim);
            if (drawable != null) {
                drawable.setBounds(0, 0, C55298xhM.copydefault(16.0f, (Context) investUniv3SubscribeActivity), C55298xhM.copydefault(16.0f, (Context) investUniv3SubscribeActivity));
            }
            C23732iHg c23732iHg10 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg10 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg10 = null;
            }
            TextView textView5 = c23732iHg10.AwvSrB;
            InvestUniv3SubscribePromptInformation promptInformation3 = investUniv3SubscribeReceiveInfoAEQbTJ.getPromptInformation();
            if ((promptInformation3 != null ? promptInformation3.getEstDailyYieldTip() : null) == null) {
                drawable = null;
            }
            textView5.setCompoundDrawablesRelative(null, null, drawable, null);
            C23795iJp c23795iJp2 = investUniv3SubscribeActivity.AubY;
            if (c23795iJp2 == null) {
                Intrinsics.gEmmrt("");
                c23795iJp = null;
            } else {
                c23795iJp = c23795iJp2;
            }
            ConstraintLayout root = c23795iJp.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            if (C33129mqd.OLrzqt((CharSequence) investUniv3SubscribeReceiveInfoAEQbTJ.getTransactionLossInfo().getTotalTransactionLoss()) && C33129mqd.AEQbTJ(investUniv3SubscribeReceiveInfoAEQbTJ.getTransactionLossInfo().getTotalTransactionLoss(), "0")) {
                i = 0;
            }
            root.setVisibility(i);
            Context context = c23795iJp.getRoot().getContext();
            c23795iJp.AEQbTJ.setText(context.getString(C25493ixk.FragmentManager.zzQwtT));
            c23795iJp.AEQbTJ.setHelperLabelType(1);
            c23795iJp.AEQbTJ.setUnderlineStyle(0);
            C55258xgZ c55258xgZ = c23795iJp.AEQbTJ;
            c55258xgZ.setOnClickListener(new SharedElementCallback(c55258xgZ, 1000L, context));
            investUniv3SubscribeReceiveInfoAEQbTJ.getTransactionStepList();
            c23795iJp.KWHzl.setTextColor(C33070mpX.copydefault(C25544iyi.getLossEntryTextViewColor$default(investUniv3SubscribeReceiveInfoAEQbTJ.getTransactionLossInfo(), 0, 1, null)));
            c23795iJp.KWHzl.setText(C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, investUniv3SubscribeReceiveInfoAEQbTJ.getTransactionLossInfo().getTotalTransactionLoss(), null, null, null, 14, null));
            ImageView imageView = c23795iJp.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            TextView textView6 = c23795iJp.KWHzl;
            textView6.setOnClickListener(new TaskStackBuilder(textView6, 1000L, investUniv3SubscribeReceiveInfoAEQbTJ, investUniv3SubscribeActivity));
            ImageView imageView2 = c23795iJp.copydefault;
            imageView2.setOnClickListener(new BroadcastReceiver(imageView2, 1000L, investUniv3SubscribeReceiveInfoAEQbTJ, investUniv3SubscribeActivity));
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Boolean bool) {
        if (!bool.booleanValue()) {
            return Unit.INSTANCE;
        }
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.DAIeex.fIwbmz();
        investUniv3SubscribeActivity.QOLQEE();
        showConfirmLayout$default(investUniv3SubscribeActivity, false, 1, null);
        investUniv3SubscribeActivity.isConnected().ORxRYg().setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Pair pair) {
        C23792iJm c23792iJm = investUniv3SubscribeActivity.getFieldNames;
        if (c23792iJm != null) {
            if (pair != null && C33129mqd.OLrzqt((CharSequence) pair.getSecond()) && C33129mqd.AEQbTJ(pair.getSecond(), "0")) {
                ConstraintLayout root = c23792iJm.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                root.setVisibility(0);
                ConstraintLayout root2 = c23792iJm.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "");
                ViewGroup.LayoutParams layoutParams = root2.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = C55298xhM.copydefault(20.0f, (Context) investUniv3SubscribeActivity);
                    root2.setLayoutParams(marginLayoutParams);
                    c23792iJm.EZpvd.setTextValue(investUniv3SubscribeActivity.getString(C25493ixk.FragmentManager.fjfviF));
                    c23792iJm.AEQbTJ.setText((CharSequence) pair.getFirst());
                    ImageView imageView = c23792iJm.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    imageView.setVisibility(0);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            } else {
                ConstraintLayout root3 = c23792iJm.getRoot();
                Intrinsics.checkNotNullExpressionValue(root3, "");
                root3.setVisibility(8);
                ConstraintLayout root4 = c23792iJm.getRoot();
                Intrinsics.checkNotNullExpressionValue(root4, "");
                ViewGroup.LayoutParams layoutParams2 = root4.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = 0;
                    root4.setLayoutParams(marginLayoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void uzCIH() {
        isConnected().gHZMYf().setValue("--");
        isConnected().QKVWgx().setValue(new C27024jnQ(null, null, 3, null));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$resetBottomContent$1(this, null), 3, null);
        AEQbTJ();
        isConnected().iZzfmt().setValue(new C23962iPu(false, null, 2, null));
    }

    public final void getNewProxyInstance() {
        C23732iHg c23732iHg = this.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        C55113xdn c55113xdn = c23732iHg.DCJXGO;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(0);
        C23732iHg c23732iHg3 = this.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg3 = null;
        }
        c23732iHg3.DCJXGO.setRepeatCount(0);
        C23732iHg c23732iHg4 = this.AhwBna;
        if (c23732iHg4 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg4 = null;
        }
        c23732iHg4.DCJXGO.KWHzl(0L);
        ClipData clipData = new ClipData();
        C23732iHg c23732iHg5 = this.AhwBna;
        if (c23732iHg5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23732iHg2 = c23732iHg5;
        }
        c23732iHg2.DCJXGO.addAnimatorListener(clipData);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class ClipData implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public ClipData() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(InvestUniv3SubscribeActivity.this), null, null, new InvestUniv3SubscribeActivity$showZapSwitchLoading$animatorListener$1$onAnimationEnd$1(InvestUniv3SubscribeActivity.this, this, null), 3, null);
        }
    }

    public final void OLrzqt(boolean z, FragmentContainerView fragmentContainerView, String str, Function0<? extends androidx.fragment.app.Fragment> function0) {
        final androidx.fragment.app.Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(str);
        if (!z) {
            if (fragmentFindFragmentByTag != null) {
                if (fragmentFindFragmentByTag instanceof C27042jni) {
                    ((C27042jni) fragmentFindFragmentByTag).EZpvd((C27042jni.TaskDescription) null);
                }
                getSupportFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commitNowAllowingStateLoss();
            }
            fragmentContainerView.setVisibility(8);
            return;
        }
        fragmentContainerView.setVisibility(0);
        if (fragmentFindFragmentByTag == null) {
            fragmentFindFragmentByTag = function0.invoke();
            getSupportFragmentManager().beginTransaction().replace(fragmentContainerView.getId(), fragmentFindFragmentByTag, str).commitNowAllowingStateLoss();
        }
        if (fragmentFindFragmentByTag instanceof C27042jni) {
            fragmentContainerView.post(new Runnable() { // from class: o.jmo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    InvestUniv3SubscribeActivity.copydefault(fragmentFindFragmentByTag, this);
                }
            });
        }
    }

    public static final class VoiceInteractor implements C27042jni.TaskDescription {
        public VoiceInteractor() {
        }

        @Override // o.C27042jni.TaskDescription
        public void KWHzl(int i, ZapMode zapMode) {
            Intrinsics.checkNotNullParameter(zapMode, "");
            InvestUniv3SubscribeActivity.this.KWHzl(i, zapMode);
        }
    }

    public static final void copydefault(androidx.fragment.app.Fragment fragment, InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
        ((C27042jni) fragment).EZpvd(investUniv3SubscribeActivity.new VoiceInteractor());
    }

    public final void KWHzl(int i, ZapMode zapMode) {
        isConnected().KWHzl(i, zapMode);
    }

    public final void DbNXlk() {
        C23732iHg c23732iHg = this.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        C55258xgZ c55258xgZ = c23732iHg.valueOf;
        c55258xgZ.setTextValue(getString(C25493ixk.FragmentManager.UlJrfe));
        c55258xgZ.setHelperLabelType(1);
        c55258xgZ.setUnderlineStyle(0);
        c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, this));
    }

    private final void zuBGHE() {
        C27446jvO c27446jvO;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        C23732iHg c23732iHg = this.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        this.AubY = C23795iJp.AEQbTJ(layoutInflaterFrom, c23732iHg.flVtFt, true);
        C23732iHg c23732iHg2 = this.AhwBna;
        if (c23732iHg2 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg2 = null;
        }
        c23732iHg2.ejfBZ.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.jlX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                InvestUniv3SubscribeActivity.KWHzl(this.AEQbTJ, view, i, i2, i3, i4);
            }
        });
        LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(this);
        C23732iHg c23732iHg3 = this.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg3 = null;
        }
        C23792iJm c23792iJmAEQbTJ = C23792iJm.AEQbTJ(layoutInflaterFrom2, c23732iHg3.gGvvIC, true);
        C55258xgZ c55258xgZ = c23792iJmAEQbTJ.EZpvd;
        c55258xgZ.setOnClickListener(new PendingIntent(c55258xgZ, 1000L, this));
        ImageView imageView = c23792iJmAEQbTJ.OLrzqt;
        imageView.setOnClickListener(new Fragment(imageView, 1000L, this));
        TextView textView = c23792iJmAEQbTJ.AEQbTJ;
        textView.setOnClickListener(new Dialog(textView, 1000L, this));
        this.getFieldNames = c23792iJmAEQbTJ;
        C23732iHg c23732iHg4 = this.AhwBna;
        if (c23732iHg4 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg4 = null;
        }
        c23732iHg4.AxsJAYsNCnLh.EZpvd(false, true);
        C23732iHg c23732iHg5 = this.AhwBna;
        if (c23732iHg5 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg5 = null;
        }
        c23732iHg5.AxsJAYsNCnLh.setProcessClickListener(new View.OnClickListener() { // from class: o.jmk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                InvestUniv3SubscribeActivity.valueOf(this.KWHzl, view);
            }
        });
        isConnected().AkhnZx().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jmq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.KWHzl(this.AEQbTJ, (InvestSubscriptionReceiveInfoUIBean) obj);
            }
        }));
        C23732iHg c23732iHg6 = this.AhwBna;
        if (c23732iHg6 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg6 = null;
        }
        c23732iHg6.QKudOq.AEQbTJ(true);
        isConnected().fvQaOB().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jms
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.OLrzqt(this.EZpvd, (C23953iPl) obj);
            }
        }));
        C23732iHg c23732iHg7 = this.AhwBna;
        if (c23732iHg7 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg7 = null;
        }
        c23732iHg7.QKudOq.setSlippageClickListener(new Function0() { // from class: o.jmr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestUniv3SubscribeActivity.sSMYrx(this.KWHzl);
            }
        });
        iKU iku = this.valueOf;
        if (iku != null && (c27446jvO = iku.EZpvd) != null) {
            c27446jvO.setOnCountdownListener(new FragmentManager());
        }
        isConnected().copydefault().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jmp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.KWHzl(this.copydefault, (InvestConsumeData) obj);
            }
        }));
        LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(this);
        C23732iHg c23732iHg8 = this.AhwBna;
        if (c23732iHg8 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg8 = null;
        }
        this.uzCIH = C23910iNw.OLrzqt(layoutInflaterFrom3, c23732iHg8.dvKsVJ, true);
        isConnected().zuWLRA().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jlr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.AEQbTJ(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        isConnected().QbewEr().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jls
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.KWHzl(this.copydefault, (InvestUniv3SubscribePromptInformation) obj);
            }
        }));
        isConnected().hUfVAv().observe(this, new ComponentCallbacks2(new Function1() { // from class: o.jlu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.AEQbTJ(this.AEQbTJ, (C23954iPm) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$initConfirmPage$12(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$initConfirmPage$13(this, null), 3, null);
    }

    public static final void KWHzl(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, View view, int i, int i2, int i3, int i4) {
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        View viewFindViewById = c23732iHg.getRoot().findViewById(C25493ixk.ActionBar.fdazkH);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(i2 > 0 ? 0 : 8);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity.ActionBar.start$default(com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity$ActionBar, android.content.Context, com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity$SlippageMode, java.lang.String, java.lang.String, boolean, com.okinc.business.invest_biz.data.bean.SwapSlippageConfig, java.lang.String, boolean, int, int, java.lang.Object):android.content.Intent */
    public static final void gHZMYf(InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
        SwapSlippageConfig swapSlippage;
        InvestGasPriceConfig value = investUniv3SubscribeActivity.isConnected().OLrzqt().getValue();
        if (value == null || (swapSlippage = value.getSwapSlippage()) == null) {
            return;
        }
        SwapSlippageActivity.ActionBar actionBar = SwapSlippageActivity.Companion;
        SwapSlippageActivity.SlippageMode slippageModeFinit = investUniv3SubscribeActivity.isConnected().finit();
        String strDvKsVJ = investUniv3SubscribeActivity.isConnected().dvKsVJ();
        String strUeEOUB = investUniv3SubscribeActivity.isConnected().UeEOUB();
        boolean zFZBcTu = investUniv3SubscribeActivity.isConnected().fZBcTu();
        Pair<String, String> value2 = investUniv3SubscribeActivity.isConnected().dxcTrN().getValue();
        investUniv3SubscribeActivity.zLjUOn.launch(actionBar.EZpvd(investUniv3SubscribeActivity, slippageModeFinit, strDvKsVJ, strUeEOUB, zFZBcTu, swapSlippage, (256 & 64) != 0 ? null : value2 != null ? value2.getSecond() : null, (256 & 128) != 0 ? false : investUniv3SubscribeActivity.isConnected().OuxcSI(), (256 & 256) != 0 ? 0 : 0));
    }

    public static final void valueOf(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, View view) {
        iUI.Companion.OLrzqt(2).show(investUniv3SubscribeActivity.getSupportFragmentManager(), "javaClass");
    }

    public static final Unit KWHzl(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean) {
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        C27187jqU c27187jqU = c23732iHg.AxsJAYsNCnLh;
        Intrinsics.copydefault(investSubscriptionReceiveInfoUIBean);
        c27187jqU.setData(investSubscriptionReceiveInfoUIBean);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, C23953iPl c23953iPl) {
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.QKudOq.AEQbTJ(c23953iPl.AYXKKw(), c23953iPl.AhwBna(), c23953iPl.AEQbTJ(), c23953iPl.OLrzqt(), c23953iPl.EZpvd(), Boolean.TRUE, (512 & 64) != 0 ? 0 : c23953iPl.copydefault(), (512 & 128) != 0 ? "" : c23953iPl.KWHzl(), (512 & 256) != 0 ? false : c23953iPl.valueOf(), (512 & 512) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public static final Unit sSMYrx(InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
        C23978iQj.Companion.AEQbTJ(2).show(investUniv3SubscribeActivity.getSupportFragmentManager(), "javaClass");
        return Unit.INSTANCE;
    }

    public static final class FragmentManager implements C27446jvO.TaskDescription {
        @Override // o.C27446jvO.TaskDescription
        public void AEQbTJ(int i, int i2, float f) {
        }

        public FragmentManager() {
        }

        @Override // o.C27446jvO.TaskDescription
        public void KWHzl() {
            C27446jvO c27446jvO;
            C27446jvO c27446jvO2;
            iKU iku = InvestUniv3SubscribeActivity.this.valueOf;
            if (iku != null && (c27446jvO2 = iku.EZpvd) != null) {
                c27446jvO2.KWHzl();
            }
            iKU iku2 = InvestUniv3SubscribeActivity.this.valueOf;
            if (iku2 != null && (c27446jvO = iku2.EZpvd) != null) {
                c27446jvO.setVisibility(8);
            }
            InvestUniv3SubscribeActivity.this.isConnected().KWHzl(TransactionStage.RECEIVE_INFO_TIME_OUT);
        }
    }

    public static final Unit KWHzl(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, InvestConsumeData investConsumeData) {
        if (!((Boolean) investConsumeData.getData()).booleanValue()) {
            C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg == null) {
                Intrinsics.gEmmrt("");
                c23732iHg = null;
            }
            c23732iHg.QKudOq.setSlippageText(investUniv3SubscribeActivity.isConnected().QUSxYX());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Boolean bool) {
        String investmentName;
        C23910iNw c23910iNw = investUniv3SubscribeActivity.uzCIH;
        if (c23910iNw == null) {
            Intrinsics.gEmmrt("");
            c23910iNw = null;
        }
        InvestTokenWithAmount fieldNames = investUniv3SubscribeActivity.fJNWhG ? investUniv3SubscribeActivity.isConnected().getFieldNames() : investUniv3SubscribeActivity.isConnected().RcXXUw();
        if (fieldNames == null) {
            return Unit.INSTANCE;
        }
        InvestTokenWithAmount investTokenWithAmountRcXXUw = investUniv3SubscribeActivity.fJNWhG ? investUniv3SubscribeActivity.isConnected().RcXXUw() : investUniv3SubscribeActivity.isConnected().getFieldNames();
        if (investTokenWithAmountRcXXUw == null) {
            return Unit.INSTANCE;
        }
        c23910iNw.getRoot().setPadding(C55298xhM.dp2px$default(24.0f, null, 1, null), 0, C55298xhM.dp2px$default(24.0f, null, 1, null), 0);
        TextView textView = c23910iNw.EZpvd;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfoGEmmrt = investUniv3SubscribeActivity.isConnected().gEmmrt();
        if (investUniv3SubscribeInfoGEmmrt == null || (investmentName = investUniv3SubscribeInfoGEmmrt.getInvestmentName()) == null) {
            investmentName = "";
        }
        textView.setText(investmentName);
        TextView textView2 = c23910iNw.OLrzqt;
        Context context = textView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int i = C25493ixk.FragmentManager.invokespecialhOMIpD;
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        String plainString = investUniv3SubscribeActivity.isConnected().AxsJAY().EZpvd().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        Pair pairOLrzqt = C56390yDp.OLrzqt("num1", c27492jwH.valueOf(plainString));
        String plainString2 = investUniv3SubscribeActivity.isConnected().AxsJAYaxsJAY().EZpvd().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString2, "");
        textView2.setText(C33069mpW.KWHzl(context, i, (Map<String, ? extends Object>) C56424yEw.gEmmrt(pairOLrzqt, C56390yDp.OLrzqt("num2", c27492jwH.valueOf(plainString2)), C56390yDp.OLrzqt("token1", investTokenWithAmountRcXXUw.getTokenSymbol()), C56390yDp.OLrzqt("token2", fieldNames.getTokenSymbol()))));
        if (bool.booleanValue()) {
            c23910iNw.copydefault.setText(investUniv3SubscribeActivity.getString(C25493ixk.FragmentManager.RihMUf));
            c23910iNw.copydefault.setOKDSStyle(7);
        } else {
            c23910iNw.copydefault.setText(investUniv3SubscribeActivity.getString(C25493ixk.FragmentManager.resume));
            c23910iNw.copydefault.setOKDSStyle(11);
        }
        c23910iNw.copydefault.setOKDSPill(-2);
        c23910iNw.copydefault.setTagPaint(1);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation) {
        InvestTipInfoVo positionNotInRangeTip;
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        LinearLayout linearLayout = c23732iHg.AxsJAYaxsJAY;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility((investUniv3SubscribePromptInformation != null ? investUniv3SubscribePromptInformation.getPositionNotInRangeTip() : null) != null ? 0 : 8);
        if (investUniv3SubscribePromptInformation != null && (positionNotInRangeTip = investUniv3SubscribePromptInformation.getPositionNotInRangeTip()) != null) {
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg3 = null;
            }
            Context context = c23732iHg3.AxsJAYaxsJAY.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C23732iHg c23732iHg4 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg4 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg4 = null;
            }
            TextView textView = c23732iHg4.hUfVAv;
            C23732iHg c23732iHg5 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg2 = c23732iHg5;
            }
            LinearLayout linearLayout2 = c23732iHg2.AxsJAYaxsJAY;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            c27569jxf.AEQbTJ(context, textView, linearLayout2, positionNotInRangeTip, (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, C23954iPm c23954iPm) {
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.gasjUx.AEQbTJ(true);
        if (C33129mqd.OLrzqt((CharSequence) c23954iPm.OLrzqt())) {
            C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg2 = c23732iHg3;
            }
            c23732iHg2.gasjUx.setUniv3TextData(c23954iPm.OLrzqt());
        } else {
            C23732iHg c23732iHg4 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg2 = c23732iHg4;
            }
            C27138jpY.setData$default(c23732iHg2.gasjUx, c23954iPm.EZpvd(), 2, false, false, null, 16, null);
        }
        return Unit.INSTANCE;
    }

    private final void QOLQEE() {
        ArrayList arrayList;
        List<InvestTokenWithAmount> investWithTokenList;
        C23732iHg c23732iHg = this.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        TextView textView = c23732iHg.iRxXKY;
        textView.setText(getString(C25493ixk.FragmentManager.igXuih));
        if (this.AuCTelauCTel == InvestUniv3Mode.Zap) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getContext().getResources().getDrawable(C25493ixk.StateListAnimator.gEmmrt), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (this.AuCTelauCTel == InvestUniv3Mode.Normal) {
            InvestTokenWithAmount fieldNames = this.fJNWhG ? isConnected().getFieldNames() : isConnected().RcXXUw();
            if (fieldNames == null) {
                return;
            }
            InvestTokenWithAmount investTokenWithAmountRcXXUw = this.fJNWhG ? isConnected().RcXXUw() : isConnected().getFieldNames();
            if (investTokenWithAmountRcXXUw == null) {
                return;
            }
            List<InvestTokenWithAmount> listGEmmrt = yDY.gEmmrt(investTokenWithAmountRcXXUw, fieldNames);
            arrayList = new ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
            for (InvestTokenWithAmount investTokenWithAmount : listGEmmrt) {
                C27492jwH c27492jwH = C27492jwH.OLrzqt;
                arrayList.add(new C27522jwl(C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH, investTokenWithAmount.getCoinAmount(), 6, 2, false, false, 24, null), investTokenWithAmount.getTokenSymbol(), c27492jwH.KWHzl(investTokenWithAmount.getCurrencyAmount()), investTokenWithAmount.getTokenLogo()));
            }
        } else {
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfoIsConnected = isConnected().isConnected();
            if (investUniv3SubscribeReceiveInfoIsConnected == null || (investWithTokenList = investUniv3SubscribeReceiveInfoIsConnected.getInvestWithTokenList()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(C56403yEb.AYXKKw(investWithTokenList, 10));
                for (InvestTokenWithAmount investTokenWithAmount2 : investWithTokenList) {
                    C27492jwH c27492jwH2 = C27492jwH.OLrzqt;
                    arrayList.add(new C27522jwl(C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH2, investTokenWithAmount2.getCoinAmount(), 6, 2, false, false, 24, null), investTokenWithAmount2.getTokenSymbol(), c27492jwH2.KWHzl(investTokenWithAmount2.getCurrencyAmount()), investTokenWithAmount2.getTokenLogo()));
                }
            }
        }
        if (arrayList != null) {
            C23732iHg c23732iHg3 = this.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg3 = null;
            }
            c23732iHg3.fIwbmz.setTokens(arrayList);
            if (arrayList.size() == 1) {
                C23732iHg c23732iHg4 = this.AhwBna;
                if (c23732iHg4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c23732iHg2 = c23732iHg4;
                }
                c23732iHg2.fIwbmz.OLrzqt();
            }
        }
    }

    public static /* synthetic */ void showConfirmLayout$default(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        investUniv3SubscribeActivity.KWHzl(z);
    }

    private final void KWHzl(boolean z) {
        this.ejfBZ = false;
        C23732iHg c23732iHg = this.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        ConstraintLayout constraintLayout = c23732iHg.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        C23732iHg c23732iHg3 = this.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg3 = null;
        }
        FrameLayout frameLayout = c23732iHg3.values;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(0);
        copydefault(true);
        if (z) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
            duration.setInterpolator(new LinearInterpolator());
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.jlt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    InvestUniv3SubscribeActivity.EZpvd(this.copydefault, valueAnimator);
                }
            });
            duration.start();
            return;
        }
        C23732iHg c23732iHg4 = this.AhwBna;
        if (c23732iHg4 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg4 = null;
        }
        NestedScrollView nestedScrollView = c23732iHg4.ORxRYg;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        nestedScrollView.setVisibility(8);
        C23732iHg c23732iHg5 = this.AhwBna;
        if (c23732iHg5 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg5 = null;
        }
        c23732iHg5.ORxRYg.setAlpha(0.0f);
        C23732iHg c23732iHg6 = this.AhwBna;
        if (c23732iHg6 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg6 = null;
        }
        LinearLayout linearLayout = c23732iHg6.zuBGHE;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        C23732iHg c23732iHg7 = this.AhwBna;
        if (c23732iHg7 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg7 = null;
        }
        c23732iHg7.zuBGHE.setAlpha(0.0f);
        C23732iHg c23732iHg8 = this.AhwBna;
        if (c23732iHg8 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg8 = null;
        }
        LinearLayout linearLayout2 = c23732iHg8.djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(8);
        C23732iHg c23732iHg9 = this.AhwBna;
        if (c23732iHg9 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg9 = null;
        }
        c23732iHg9.djBIcL.setAlpha(0.0f);
        C23732iHg c23732iHg10 = this.AhwBna;
        if (c23732iHg10 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg10 = null;
        }
        C52794wYp c52794wYp = c23732iHg10.DAIeex;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(8);
        C23732iHg c23732iHg11 = this.AhwBna;
        if (c23732iHg11 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg11 = null;
        }
        c23732iHg11.DAIeex.setAlpha(0.0f);
        C23732iHg c23732iHg12 = this.AhwBna;
        if (c23732iHg12 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg12 = null;
        }
        ConstraintLayout constraintLayout2 = c23732iHg12.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(0);
        C23732iHg c23732iHg13 = this.AhwBna;
        if (c23732iHg13 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg13 = null;
        }
        c23732iHg13.AkhnZx.setAlpha(1.0f);
        C23732iHg c23732iHg14 = this.AhwBna;
        if (c23732iHg14 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg14 = null;
        }
        FrameLayout frameLayout2 = c23732iHg14.values;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        frameLayout2.setVisibility(0);
        C23732iHg c23732iHg15 = this.AhwBna;
        if (c23732iHg15 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23732iHg2 = c23732iHg15;
        }
        c23732iHg2.values.setAlpha(1.0f);
    }

    public static final void EZpvd(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        NestedScrollView nestedScrollView = c23732iHg.ORxRYg;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        nestedScrollView.setAlpha(((Float) animatedValue).floatValue());
        C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg3 = null;
        }
        LinearLayout linearLayout = c23732iHg3.zuBGHE;
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue2, "");
        linearLayout.setAlpha(((Float) animatedValue2).floatValue());
        C23732iHg c23732iHg4 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg4 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg4 = null;
        }
        LinearLayout linearLayout2 = c23732iHg4.djBIcL;
        Object animatedValue3 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue3, "");
        linearLayout2.setAlpha(((Float) animatedValue3).floatValue());
        C23732iHg c23732iHg5 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg5 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg5 = null;
        }
        C52794wYp c52794wYp = c23732iHg5.DAIeex;
        Object animatedValue4 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue4, "");
        c52794wYp.setAlpha(((Float) animatedValue4).floatValue());
        C23732iHg c23732iHg6 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg6 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg6 = null;
        }
        ConstraintLayout constraintLayout = c23732iHg6.AkhnZx;
        Object animatedValue5 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue5, "");
        constraintLayout.setAlpha(1.0f - ((Float) animatedValue5).floatValue());
        Object animatedValue6 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue6, "");
        if (((Float) animatedValue6).floatValue() == 0.0f) {
            C23732iHg c23732iHg7 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg7 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg7 = null;
            }
            NestedScrollView nestedScrollView2 = c23732iHg7.ORxRYg;
            Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "");
            nestedScrollView2.setVisibility(8);
            C23732iHg c23732iHg8 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg8 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg8 = null;
            }
            LinearLayout linearLayout3 = c23732iHg8.zuBGHE;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            linearLayout3.setVisibility(8);
            C23732iHg c23732iHg9 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg9 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg9 = null;
            }
            LinearLayout linearLayout4 = c23732iHg9.djBIcL;
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
            linearLayout4.setVisibility(8);
            C23732iHg c23732iHg10 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg10 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg2 = c23732iHg10;
            }
            C52794wYp c52794wYp2 = c23732iHg2.DAIeex;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(8);
        }
    }

    public static /* synthetic */ void showInputLayout$default(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        investUniv3SubscribeActivity.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        this.ejfBZ = true;
        C23732iHg c23732iHg = this.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        NestedScrollView nestedScrollView = c23732iHg.ORxRYg;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        nestedScrollView.setVisibility(0);
        C23732iHg c23732iHg3 = this.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg3 = null;
        }
        LinearLayout linearLayout = c23732iHg3.zuBGHE;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        C23732iHg c23732iHg4 = this.AhwBna;
        if (c23732iHg4 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg4 = null;
        }
        LinearLayout linearLayout2 = c23732iHg4.djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(0);
        C23732iHg c23732iHg5 = this.AhwBna;
        if (c23732iHg5 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg5 = null;
        }
        C52794wYp c52794wYp = c23732iHg5.DAIeex;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(0);
        C23732iHg c23732iHg6 = this.AhwBna;
        if (c23732iHg6 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg6 = null;
        }
        FrameLayout frameLayout = c23732iHg6.values;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        if (z) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
            duration.setInterpolator(new LinearInterpolator());
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.jlv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    InvestUniv3SubscribeActivity.AEQbTJ(this.KWHzl, valueAnimator);
                }
            });
            duration.start();
            return;
        }
        C23732iHg c23732iHg7 = this.AhwBna;
        if (c23732iHg7 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg7 = null;
        }
        NestedScrollView nestedScrollView2 = c23732iHg7.ORxRYg;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "");
        nestedScrollView2.setVisibility(0);
        C23732iHg c23732iHg8 = this.AhwBna;
        if (c23732iHg8 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg8 = null;
        }
        c23732iHg8.ORxRYg.setAlpha(1.0f);
        C23732iHg c23732iHg9 = this.AhwBna;
        if (c23732iHg9 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg9 = null;
        }
        LinearLayout linearLayout3 = c23732iHg9.zuBGHE;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        linearLayout3.setVisibility(0);
        C23732iHg c23732iHg10 = this.AhwBna;
        if (c23732iHg10 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg10 = null;
        }
        c23732iHg10.zuBGHE.setAlpha(1.0f);
        C23732iHg c23732iHg11 = this.AhwBna;
        if (c23732iHg11 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg11 = null;
        }
        LinearLayout linearLayout4 = c23732iHg11.djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
        linearLayout4.setVisibility(0);
        C23732iHg c23732iHg12 = this.AhwBna;
        if (c23732iHg12 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg12 = null;
        }
        c23732iHg12.djBIcL.setAlpha(1.0f);
        C23732iHg c23732iHg13 = this.AhwBna;
        if (c23732iHg13 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg13 = null;
        }
        C52794wYp c52794wYp2 = c23732iHg13.DAIeex;
        Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
        c52794wYp2.setVisibility(0);
        C23732iHg c23732iHg14 = this.AhwBna;
        if (c23732iHg14 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg14 = null;
        }
        c23732iHg14.DAIeex.setAlpha(1.0f);
        C23732iHg c23732iHg15 = this.AhwBna;
        if (c23732iHg15 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg15 = null;
        }
        ConstraintLayout constraintLayout = c23732iHg15.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        C23732iHg c23732iHg16 = this.AhwBna;
        if (c23732iHg16 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23732iHg2 = c23732iHg16;
        }
        c23732iHg2.AkhnZx.setAlpha(0.0f);
        copydefault(false);
    }

    public static final void AEQbTJ(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        ConstraintLayout constraintLayout = c23732iHg.AkhnZx;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        constraintLayout.setAlpha(((Float) animatedValue).floatValue());
        C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg3 = null;
        }
        NestedScrollView nestedScrollView = c23732iHg3.ORxRYg;
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue2, "");
        nestedScrollView.setAlpha(1.0f - ((Float) animatedValue2).floatValue());
        C23732iHg c23732iHg4 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg4 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg4 = null;
        }
        LinearLayout linearLayout = c23732iHg4.zuBGHE;
        Object animatedValue3 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue3, "");
        linearLayout.setAlpha(1.0f - ((Float) animatedValue3).floatValue());
        C23732iHg c23732iHg5 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg5 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg5 = null;
        }
        LinearLayout linearLayout2 = c23732iHg5.djBIcL;
        Object animatedValue4 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue4, "");
        linearLayout2.setAlpha(1.0f - ((Float) animatedValue4).floatValue());
        C23732iHg c23732iHg6 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg6 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg6 = null;
        }
        C52794wYp c52794wYp = c23732iHg6.DAIeex;
        Object animatedValue5 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue5, "");
        c52794wYp.setAlpha(1.0f - ((Float) animatedValue5).floatValue());
        Object animatedValue6 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue6, "");
        if (((Float) animatedValue6).floatValue() == 0.0f) {
            C23732iHg c23732iHg7 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg2 = c23732iHg7;
            }
            ConstraintLayout constraintLayout2 = c23732iHg2.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            investUniv3SubscribeActivity.copydefault(false);
        }
    }

    public final void OLrzqt(String str, AmountInputIndex amountInputIndex) {
        if (this.fIwbmz) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$getReceiveInfoAndCheckState$1(this, str, amountInputIndex, null), 3, null);
        }
    }

    private final void AwvSrB() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$initData$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01d9 -> B:59:0x01dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01e0 -> B:61:0x01e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(InvestUniv3SubscribeInfo investUniv3SubscribeInfo, Continuation<? super Unit> continuation) throws Throwable {
        InvestUniv3SubscribeActivity$updateRangeConfig$1 investUniv3SubscribeActivity$updateRangeConfig$1;
        String str;
        Iterator it;
        final InvestUniv3SubscribeActivity investUniv3SubscribeActivity;
        InvestTipInfoVo priceRangeTip;
        InvestUniv3SubscribeActivity investUniv3SubscribeActivity2;
        String str2;
        InvestUniv3RangeInfoType investUniv3RangeInfoType;
        C52794wYp c52794wYp;
        MutableSharedFlow<C27315jsq> mutableSharedFlowIRxXKY;
        C27315jsq c27315jsqAEQbTJ;
        if (continuation instanceof InvestUniv3SubscribeActivity$updateRangeConfig$1) {
            investUniv3SubscribeActivity$updateRangeConfig$1 = (InvestUniv3SubscribeActivity$updateRangeConfig$1) continuation;
            int i = investUniv3SubscribeActivity$updateRangeConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investUniv3SubscribeActivity$updateRangeConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                investUniv3SubscribeActivity$updateRangeConfig$1 = new InvestUniv3SubscribeActivity$updateRangeConfig$1(this, continuation);
            }
        }
        InvestUniv3SubscribeActivity$updateRangeConfig$1 investUniv3SubscribeActivity$updateRangeConfig$12 = investUniv3SubscribeActivity$updateRangeConfig$1;
        Object obj = investUniv3SubscribeActivity$updateRangeConfig$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = investUniv3SubscribeActivity$updateRangeConfig$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C23732iHg c23732iHg = this.AhwBna;
            if (c23732iHg == null) {
                Intrinsics.gEmmrt("");
                c23732iHg = null;
            }
            ImageView imageView = c23732iHg.dNCPSb;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            InvestUniv3SubscribePromptInformation promptInformation = investUniv3SubscribeInfo.getPromptInformation();
            imageView.setVisibility((promptInformation != null ? promptInformation.getPriceRangeTip() : null) != null ? 0 : 8);
            InvestUniv3SubscribePromptInformation promptInformation2 = investUniv3SubscribeInfo.getPromptInformation();
            if (promptInformation2 == null || (priceRangeTip = promptInformation2.getPriceRangeTip()) == null) {
                str = "";
            } else {
                C27569jxf c27569jxf = C27569jxf.OLrzqt;
                C23732iHg c23732iHg2 = this.AhwBna;
                if (c23732iHg2 == null) {
                    Intrinsics.gEmmrt("");
                    c23732iHg2 = null;
                }
                ImageView imageView2 = c23732iHg2.dNCPSb;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                str = "";
                c27569jxf.AEQbTJ(this, null, imageView2, priceRangeTip, (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
            }
            C23732iHg c23732iHg3 = this.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt(str);
                c23732iHg3 = null;
            }
            c23732iHg3.UeEOUB.removeAllViews();
            it = investUniv3SubscribeInfo.getRangeInfo().iterator();
            investUniv3SubscribeActivity = this;
            if (it.hasNext()) {
            }
        } else if (i2 == 1) {
            c52794wYp = (C52794wYp) investUniv3SubscribeActivity$updateRangeConfig$12.L$3;
            investUniv3RangeInfoType = (InvestUniv3RangeInfoType) investUniv3SubscribeActivity$updateRangeConfig$12.L$2;
            Iterator it2 = (Iterator) investUniv3SubscribeActivity$updateRangeConfig$12.L$1;
            investUniv3SubscribeActivity2 = (InvestUniv3SubscribeActivity) investUniv3SubscribeActivity$updateRangeConfig$12.L$0;
            C56391yDq.AEQbTJ(obj);
            it = it2;
            str2 = "";
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(investUniv3SubscribeActivity2.isConnected().ejfBZ().getValue());
            BigDecimal bigDecimalAdd = new BigDecimal(1).add(C33129mqd.EZpvd(investUniv3RangeInfoType.getOffset()));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, str2);
            BigDecimal bigDecimalMultiply = bigDecimalEZpvd.multiply(bigDecimalAdd);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, str2);
            mutableSharedFlowIRxXKY = investUniv3SubscribeActivity2.isConnected().iRxXKY();
            c27315jsqAEQbTJ = investUniv3SubscribeActivity2.isConnected().AEQbTJ(bigDecimalMultiply);
            investUniv3SubscribeActivity$updateRangeConfig$12.L$0 = investUniv3SubscribeActivity2;
            investUniv3SubscribeActivity$updateRangeConfig$12.L$1 = it;
            investUniv3SubscribeActivity$updateRangeConfig$12.L$2 = investUniv3RangeInfoType;
            investUniv3SubscribeActivity$updateRangeConfig$12.L$3 = c52794wYp;
            investUniv3SubscribeActivity$updateRangeConfig$12.label = 2;
            if (mutableSharedFlowIRxXKY.emit(c27315jsqAEQbTJ, investUniv3SubscribeActivity$updateRangeConfig$12) == objCopydefault) {
            }
            C52794wYp c52794wYp2 = c52794wYp;
            final InvestUniv3RangeInfoType investUniv3RangeInfoType2 = investUniv3RangeInfoType;
            investUniv3SubscribeActivity = investUniv3SubscribeActivity2;
            c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: o.jmm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    InvestUniv3SubscribeActivity.KWHzl(this.AEQbTJ, investUniv3RangeInfoType2, view);
                }
            });
            str = str2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c52794wYp = (C52794wYp) investUniv3SubscribeActivity$updateRangeConfig$12.L$3;
            investUniv3RangeInfoType = (InvestUniv3RangeInfoType) investUniv3SubscribeActivity$updateRangeConfig$12.L$2;
            Iterator it3 = (Iterator) investUniv3SubscribeActivity$updateRangeConfig$12.L$1;
            investUniv3SubscribeActivity2 = (InvestUniv3SubscribeActivity) investUniv3SubscribeActivity$updateRangeConfig$12.L$0;
            C56391yDq.AEQbTJ(obj);
            it = it3;
            str2 = "";
            C52794wYp c52794wYp22 = c52794wYp;
            final InvestUniv3RangeInfoType investUniv3RangeInfoType22 = investUniv3RangeInfoType;
            investUniv3SubscribeActivity = investUniv3SubscribeActivity2;
            c52794wYp22.setOnClickListener(new View.OnClickListener() { // from class: o.jmm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    InvestUniv3SubscribeActivity.KWHzl(this.AEQbTJ, investUniv3RangeInfoType22, view);
                }
            });
            str = str2;
            if (it.hasNext()) {
                investUniv3RangeInfoType22 = (InvestUniv3RangeInfoType) it.next();
                C52794wYp c52794wYp3 = new C52794wYp(investUniv3SubscribeActivity, null, 0, 6, null);
                c52794wYp3.setOKDSType(investUniv3RangeInfoType22.isDefault() ? 259 : 260);
                c52794wYp3.setOKDSSize(36);
                c52794wYp3.setOKDSPill(-2);
                c52794wYp3.setText(investUniv3RangeInfoType22.getType());
                c52794wYp3.setTag(investUniv3RangeInfoType22.getType());
                C23732iHg c23732iHg4 = investUniv3SubscribeActivity.AhwBna;
                if (c23732iHg4 == null) {
                    Intrinsics.gEmmrt(str);
                    c23732iHg4 = null;
                }
                c23732iHg4.UeEOUB.addView(c52794wYp3);
                ViewGroup.LayoutParams layoutParams = c52794wYp3.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.width = 0;
                    layoutParams2.height = -2;
                    layoutParams2.weight = 1.0f;
                    layoutParams2.setMarginEnd(C55298xhM.copydefault(13.0f, (Context) investUniv3SubscribeActivity));
                    c52794wYp3.setLayoutParams(layoutParams2);
                    if (investUniv3RangeInfoType22.isDefault()) {
                        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(investUniv3SubscribeActivity.isConnected().ejfBZ().getValue());
                        BigDecimal bigDecimalSubtract = new BigDecimal(1).subtract(C33129mqd.EZpvd(investUniv3RangeInfoType22.getOffset()));
                        str2 = str;
                        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, str2);
                        BigDecimal bigDecimalMultiply2 = bigDecimalEZpvd2.multiply(bigDecimalSubtract);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, str2);
                        MutableSharedFlow<C27315jsq> mutableSharedFlowSSMYrx = investUniv3SubscribeActivity.isConnected().sSMYrx();
                        C27315jsq c27315jsqAEQbTJ2 = investUniv3SubscribeActivity.isConnected().AEQbTJ(bigDecimalMultiply2);
                        investUniv3SubscribeActivity$updateRangeConfig$12.L$0 = investUniv3SubscribeActivity;
                        investUniv3SubscribeActivity$updateRangeConfig$12.L$1 = it;
                        investUniv3SubscribeActivity$updateRangeConfig$12.L$2 = investUniv3RangeInfoType22;
                        investUniv3SubscribeActivity$updateRangeConfig$12.L$3 = c52794wYp3;
                        investUniv3SubscribeActivity$updateRangeConfig$12.label = 1;
                        if (mutableSharedFlowSSMYrx.emit(c27315jsqAEQbTJ2, investUniv3SubscribeActivity$updateRangeConfig$12) == objCopydefault) {
                            return objCopydefault;
                        }
                        investUniv3SubscribeActivity2 = investUniv3SubscribeActivity;
                        investUniv3RangeInfoType = investUniv3RangeInfoType22;
                        c52794wYp = c52794wYp3;
                        BigDecimal bigDecimalEZpvd3 = C33129mqd.EZpvd(investUniv3SubscribeActivity2.isConnected().ejfBZ().getValue());
                        BigDecimal bigDecimalAdd2 = new BigDecimal(1).add(C33129mqd.EZpvd(investUniv3RangeInfoType.getOffset()));
                        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, str2);
                        BigDecimal bigDecimalMultiply3 = bigDecimalEZpvd3.multiply(bigDecimalAdd2);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, str2);
                        mutableSharedFlowIRxXKY = investUniv3SubscribeActivity2.isConnected().iRxXKY();
                        c27315jsqAEQbTJ = investUniv3SubscribeActivity2.isConnected().AEQbTJ(bigDecimalMultiply3);
                        investUniv3SubscribeActivity$updateRangeConfig$12.L$0 = investUniv3SubscribeActivity2;
                        investUniv3SubscribeActivity$updateRangeConfig$12.L$1 = it;
                        investUniv3SubscribeActivity$updateRangeConfig$12.L$2 = investUniv3RangeInfoType;
                        investUniv3SubscribeActivity$updateRangeConfig$12.L$3 = c52794wYp;
                        investUniv3SubscribeActivity$updateRangeConfig$12.label = 2;
                        if (mutableSharedFlowIRxXKY.emit(c27315jsqAEQbTJ, investUniv3SubscribeActivity$updateRangeConfig$12) == objCopydefault) {
                            return objCopydefault;
                        }
                        C52794wYp c52794wYp222 = c52794wYp;
                        final InvestUniv3RangeInfoType investUniv3RangeInfoType222 = investUniv3RangeInfoType;
                        investUniv3SubscribeActivity = investUniv3SubscribeActivity2;
                        c52794wYp222.setOnClickListener(new View.OnClickListener() { // from class: o.jmm
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                InvestUniv3SubscribeActivity.KWHzl(this.AEQbTJ, investUniv3RangeInfoType222, view);
                            }
                        });
                        str = str2;
                        if (it.hasNext()) {
                            return Unit.INSTANCE;
                        }
                    } else {
                        str2 = str;
                        c52794wYp222 = c52794wYp3;
                        c52794wYp222.setOnClickListener(new View.OnClickListener() { // from class: o.jmm
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                InvestUniv3SubscribeActivity.KWHzl(this.AEQbTJ, investUniv3RangeInfoType222, view);
                            }
                        });
                        str = str2;
                        if (it.hasNext()) {
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            }
        }
    }

    public static final void KWHzl(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, InvestUniv3RangeInfoType investUniv3RangeInfoType, View view) {
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        LinearLayout linearLayout = c23732iHg.UeEOUB;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        for (View view2 : ViewGroupKt.getChildren(linearLayout)) {
            C52794wYp c52794wYp = view2 instanceof C52794wYp ? (C52794wYp) view2 : null;
            if (c52794wYp != null) {
                c52794wYp.setOKDSType(Intrinsics.EZpvd(((C52794wYp) view2).getTag(), view.getTag()) ? 259 : 260);
            }
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(investUniv3SubscribeActivity), null, null, new InvestUniv3SubscribeActivity$updateRangeConfig$3$2$2(investUniv3SubscribeActivity, investUniv3RangeInfoType, null), 3, null);
    }

    public final void AYXKKw() {
        C23732iHg c23732iHg = this.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        LinearLayout linearLayout = c23732iHg.UeEOUB;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        for (View view : ViewGroupKt.getChildren(linearLayout)) {
            C52794wYp c52794wYp = view instanceof C52794wYp ? (C52794wYp) view : null;
            if (c52794wYp != null) {
                c52794wYp.setOKDSType(260);
            }
        }
    }

    public final void AEQbTJ() {
        C23732iHg c23732iHg = this.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.fvQaOB.valueOf();
        C23732iHg c23732iHg3 = this.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23732iHg2 = c23732iHg3;
        }
        c23732iHg2.giSNqX.valueOf();
    }

    public final void AuCTelauCTel() {
        String tokenSymbol;
        String tokenSymbol2;
        String strKWHzl;
        String tokenSymbol3;
        String tokenSymbol4;
        if (this.fJNWhG) {
            int i = C25493ixk.FragmentManager.RzdrRQ;
            Pair[] pairArr = new Pair[2];
            InvestTokenWithAmount investTokenWithAmountFlVtFt = isConnected().flVtFt();
            if (investTokenWithAmountFlVtFt == null || (tokenSymbol3 = investTokenWithAmountFlVtFt.getTokenSymbol()) == null) {
                tokenSymbol3 = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("token", tokenSymbol3);
            InvestTokenWithAmount investTokenWithAmountGasjUx = isConnected().gasjUx();
            if (investTokenWithAmountGasjUx == null || (tokenSymbol4 = investTokenWithAmountGasjUx.getTokenSymbol()) == null) {
                tokenSymbol4 = "";
            }
            pairArr[1] = C56390yDp.OLrzqt("token1", tokenSymbol4);
            strKWHzl = C33069mpW.KWHzl(this, i, (Map<String, ? extends Object>) C56424yEw.gEmmrt(pairArr));
        } else {
            int i2 = C25493ixk.FragmentManager.RzdrRQ;
            Pair[] pairArr2 = new Pair[2];
            InvestTokenWithAmount investTokenWithAmountGasjUx2 = isConnected().gasjUx();
            if (investTokenWithAmountGasjUx2 == null || (tokenSymbol = investTokenWithAmountGasjUx2.getTokenSymbol()) == null) {
                tokenSymbol = "";
            }
            pairArr2[0] = C56390yDp.OLrzqt("token", tokenSymbol);
            InvestTokenWithAmount investTokenWithAmountFlVtFt2 = isConnected().flVtFt();
            if (investTokenWithAmountFlVtFt2 == null || (tokenSymbol2 = investTokenWithAmountFlVtFt2.getTokenSymbol()) == null) {
                tokenSymbol2 = "";
            }
            pairArr2[1] = C56390yDp.OLrzqt("token1", tokenSymbol2);
            strKWHzl = C33069mpW.KWHzl(this, i2, (Map<String, ? extends Object>) C56424yEw.gEmmrt(pairArr2));
        }
        C23732iHg c23732iHg = this.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.QVAiDq.setExchangeTypeText(strKWHzl);
        C23732iHg c23732iHg3 = this.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23732iHg2 = c23732iHg3;
        }
        c23732iHg2.RJOkX.setExchangeTypeText(strKWHzl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sSMYrx() {
        C23732iHg c23732iHg = this.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        C55113xdn.showLoading$default(c23732iHg.DbNXlk, 0L, 1, null);
        loadDepthChartData$default(this, false, 1, null);
        loadPriceChartData$default(this, null, false, 3, null);
    }

    public static /* synthetic */ void loadDepthChartData$default(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        investUniv3SubscribeActivity.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$loadDepthChartData$1(z, this, null), 3, null);
    }

    public static /* synthetic */ void loadPriceChartData$default(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        investUniv3SubscribeActivity.EZpvd(str, z);
    }

    public final void EZpvd(String str, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$loadPriceChartData$1(z, str, this, null), 3, null);
    }

    public static final void AhwBna(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, View view) {
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.iwGUEr.fetchVPNInfo();
    }

    public final void fIwbmz() {
        C23732iHg c23732iHg = this.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.zLjUOn.setOnClickListener(new View.OnClickListener() { // from class: o.jmb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                InvestUniv3SubscribeActivity.AhwBna(this.EZpvd, view);
            }
        });
        C23732iHg c23732iHg3 = this.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg3 = null;
        }
        c23732iHg3.zsXlph.setOnClickListener(new View.OnClickListener() { // from class: o.jme
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                InvestUniv3SubscribeActivity.values(this.AEQbTJ, view);
            }
        });
        C23732iHg c23732iHg4 = this.AhwBna;
        if (c23732iHg4 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg4 = null;
        }
        c23732iHg4.iwGUEr.setPriceChangeCallback(new Activity(this, EditMode.DEPTH_CHART));
        C23732iHg c23732iHg5 = this.AhwBna;
        if (c23732iHg5 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg5 = null;
        }
        C27221jrB c27221jrB = c23732iHg5.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(c27221jrB, "");
        c27221jrB.setVisibility(0);
        C23732iHg c23732iHg6 = this.AhwBna;
        if (c23732iHg6 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg6 = null;
        }
        ImageView imageView = c23732iHg6.zLjUOn;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        C23732iHg c23732iHg7 = this.AhwBna;
        if (c23732iHg7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23732iHg2 = c23732iHg7;
        }
        ImageView imageView2 = c23732iHg2.zsXlph;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(0);
    }

    public static final void values(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, View view) {
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.iwGUEr.values();
    }

    public final void fARcdN() {
        C23732iHg c23732iHg = this.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.QUSxYX.setPriceChangeCallback(new Activity(this, EditMode.PRICE_CHART));
        C23732iHg c23732iHg3 = this.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23732iHg2 = c23732iHg3;
        }
        C52794wYp c52794wYp = c23732iHg2.RcXXUw;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(8);
    }

    public final void AubY() {
        List<InvestTokenWithAmount> investWithTokenList;
        InvestTokenWithAmount investTokenWithAmount;
        String tokenPrice;
        BigDecimal bigDecimalEZpvd;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfoGEmmrt = isConnected().gEmmrt();
        if (investUniv3SubscribeInfoGEmmrt == null || (investWithTokenList = investUniv3SubscribeInfoGEmmrt.getInvestWithTokenList()) == null) {
            return;
        }
        if (this.fJNWhG) {
            investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(investWithTokenList, 1);
        } else {
            investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(investWithTokenList, 0);
        }
        if (investTokenWithAmount == null || (tokenPrice = investTokenWithAmount.getTokenPrice()) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(tokenPrice)) == null) {
            return;
        }
        C23732iHg c23732iHg = this.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.QUSxYX.setQuoteTokenPrice(bigDecimalEZpvd);
        C23732iHg c23732iHg3 = this.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg3 = null;
        }
        c23732iHg3.QVAiDq.setQuoteTokenPrice(bigDecimalEZpvd);
        C23732iHg c23732iHg4 = this.AhwBna;
        if (c23732iHg4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23732iHg2 = c23732iHg4;
        }
        c23732iHg2.RJOkX.setQuoteTokenPrice(bigDecimalEZpvd);
    }

    public final void zLjUOn() {
        C23732iHg c23732iHg = this.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        C27221jrB c27221jrB = c23732iHg.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(c27221jrB, "");
        c27221jrB.setVisibility(Intrinsics.EZpvd((Object) this.gEmmrt, (Object) "CHART_TYPE_DEPTH") ? 0 : 8);
        C23732iHg c23732iHg3 = this.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg3 = null;
        }
        ImageView imageView = c23732iHg3.zsXlph;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(Intrinsics.EZpvd((Object) this.gEmmrt, (Object) "CHART_TYPE_DEPTH") ? 0 : 8);
        C23732iHg c23732iHg4 = this.AhwBna;
        if (c23732iHg4 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg4 = null;
        }
        ImageView imageView2 = c23732iHg4.zLjUOn;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(Intrinsics.EZpvd((Object) this.gEmmrt, (Object) "CHART_TYPE_DEPTH") ? 0 : 8);
        C23732iHg c23732iHg5 = this.AhwBna;
        if (c23732iHg5 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg5 = null;
        }
        InvestUniv3PriceChart investUniv3PriceChart = c23732iHg5.QUSxYX;
        Intrinsics.checkNotNullExpressionValue(investUniv3PriceChart, "");
        investUniv3PriceChart.setVisibility(Intrinsics.EZpvd((Object) this.gEmmrt, (Object) "CHART_TYPE_PRICE") ? 0 : 8);
        C23732iHg c23732iHg6 = this.AhwBna;
        if (c23732iHg6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23732iHg2 = c23732iHg6;
        }
        C52794wYp c52794wYp = c23732iHg2.RcXXUw;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(Intrinsics.EZpvd((Object) this.gEmmrt, (Object) "CHART_TYPE_PRICE") ? 0 : 8);
    }

    public final void AkhnZx() {
        C23732iHg c23732iHg = this.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.AuCTel.setOnClickListener(new View.OnClickListener() { // from class: o.jlO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                InvestUniv3SubscribeActivity.gEmmrt(this.KWHzl, view);
            }
        });
    }

    public static final void gEmmrt(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, View view) {
        int iAhwBna;
        investUniv3SubscribeActivity.fJNWhG = !investUniv3SubscribeActivity.fJNWhG;
        investUniv3SubscribeActivity.isConnected().AhwBna(!investUniv3SubscribeActivity.isConnected().getPostValueLengthLimit());
        if (investUniv3SubscribeActivity.fJNWhG) {
            InvestTokenWithAmount fieldNames = investUniv3SubscribeActivity.isConnected().getFieldNames();
            iAhwBna = C33129mqd.AhwBna(fieldNames != null ? fieldNames.getTokenPrecision() : null);
        } else {
            InvestTokenWithAmount investTokenWithAmountRcXXUw = investUniv3SubscribeActivity.isConnected().RcXXUw();
            iAhwBna = C33129mqd.AhwBna(investTokenWithAmountRcXXUw != null ? investTokenWithAmountRcXXUw.getTokenPrecision() : null);
        }
        AmountInputIndex amountInputIndex = investUniv3SubscribeActivity.AuCTel;
        AmountInputIndex amountInputIndex2 = AmountInputIndex.Second;
        if (amountInputIndex == amountInputIndex2) {
            amountInputIndex2 = AmountInputIndex.First;
        }
        investUniv3SubscribeActivity.AuCTel = amountInputIndex2;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(investUniv3SubscribeActivity), null, null, new InvestUniv3SubscribeActivity$initCurrentPriceZone$1$1(investUniv3SubscribeActivity, iAhwBna, null), 3, null);
    }

    public final void values() {
        C23732iHg c23732iHg = null;
        if (!isConnected().DCUTEI()) {
            C23732iHg c23732iHg2 = this.AhwBna;
            if (c23732iHg2 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg2 = null;
            }
            C55249xgQ c55249xgQ = c23732iHg2.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(c55249xgQ, "");
            c55249xgQ.setVisibility(4);
            C23732iHg c23732iHg3 = this.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg3 = null;
            }
            TextView textView = c23732iHg3.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            C23732iHg c23732iHg4 = this.AhwBna;
            if (c23732iHg4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg = c23732iHg4;
            }
            c23732iHg.isConnected.setText(C25493ixk.FragmentManager.invokespecialgBtXYZ);
            this.gEmmrt = "CHART_TYPE_PRICE";
        } else {
            C23732iHg c23732iHg5 = this.AhwBna;
            if (c23732iHg5 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg5 = null;
            }
            C55249xgQ c55249xgQ2 = c23732iHg5.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(c55249xgQ2, "");
            c55249xgQ2.setVisibility(0);
            C23732iHg c23732iHg6 = this.AhwBna;
            if (c23732iHg6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg = c23732iHg6;
            }
            TextView textView2 = c23732iHg.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(4);
        }
        zLjUOn();
    }

    public final void fetchVPNInfo() {
        C23732iHg c23732iHg = this.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        C55249xgQ c55249xgQ = c23732iHg.fetchVPNInfo;
        c55249xgQ.addTab(c55249xgQ.newTab().setText(c55249xgQ.getContext().getString(C25493ixk.FragmentManager.invokespecialRuDPQV)).setTag("CHART_TYPE_DEPTH"));
        c55249xgQ.addTab(c55249xgQ.newTab().setText(c55249xgQ.getContext().getString(C25493ixk.FragmentManager.invokespecialdPnHjp)).setTag("CHART_TYPE_PRICE"));
        C23732iHg c23732iHg2 = this.AhwBna;
        if (c23732iHg2 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg2 = null;
        }
        c23732iHg2.fetchVPNInfo.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Application());
        final Drawable drawable = ContextCompat.getDrawable(this, C52761wXj.TaskDescription.QKDJJA);
        if (drawable != null) {
            drawable.setBounds(0, 0, C55298xhM.copydefault(12.0f, (Context) this), C55298xhM.copydefault(12.0f, (Context) this));
            drawable.setTint(getColor(C52761wXj.Activity.fdOvFl));
            drawable.setAlpha(102);
        } else {
            drawable = null;
        }
        final Drawable drawable2 = ContextCompat.getDrawable(this, C52761wXj.TaskDescription.getAdvertisingId);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, C55298xhM.copydefault(12.0f, (Context) this), C55298xhM.copydefault(12.0f, (Context) this));
            drawable2.setTint(getColor(C52761wXj.Activity.fdOvFl));
            drawable2.setAlpha(102);
        } else {
            drawable2 = null;
        }
        C23732iHg c23732iHg3 = this.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg3 = null;
        }
        c23732iHg3.RcXXUw.setCompoundDrawablesRelative(null, null, drawable2, null);
        C23732iHg c23732iHg4 = this.AhwBna;
        if (c23732iHg4 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg4 = null;
        }
        c23732iHg4.RcXXUw.setCompoundDrawablePadding(C55298xhM.copydefault(6.0f, (Context) this));
        C23732iHg c23732iHg5 = this.AhwBna;
        if (c23732iHg5 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg5 = null;
        }
        c23732iHg5.RcXXUw.setText(getString(C25493ixk.FragmentManager.RuDPQV));
        C23732iHg c23732iHg6 = this.AhwBna;
        if (c23732iHg6 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg6 = null;
        }
        c23732iHg6.RcXXUw.setOnClickListener(new View.OnClickListener() { // from class: o.jmt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                InvestUniv3SubscribeActivity.OLrzqt(this.KWHzl, drawable, drawable2, view);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$initChartControl$4(this, null), 3, null);
    }

    public static final class Application implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Application() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            C23732iHg c23732iHg = null;
            InvestUniv3SubscribeActivity.this.gEmmrt = String.valueOf(tab != null ? tab.getTag() : null);
            C23732iHg c23732iHg2 = InvestUniv3SubscribeActivity.this.AhwBna;
            if (c23732iHg2 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg2 = null;
            }
            C27137jpX c27137jpX = c23732iHg2.wlaJM;
            Intrinsics.checkNotNullExpressionValue(c27137jpX, "");
            c27137jpX.setVisibility(((Intrinsics.EZpvd((Object) InvestUniv3SubscribeActivity.this.gEmmrt, (Object) "CHART_TYPE_DEPTH") && InvestUniv3SubscribeActivity.this.isConnected().hDKMBd().getValue() == InvestUniv3SubscribeViewModel.ChartLoadingStatus.Error) || (Intrinsics.EZpvd((Object) InvestUniv3SubscribeActivity.this.gEmmrt, (Object) "CHART_TYPE_PRICE") && InvestUniv3SubscribeActivity.this.isConnected().RJOkX().getValue() == InvestUniv3SubscribeViewModel.ChartLoadingStatus.Error)) ? 0 : 8);
            InvestUniv3SubscribeActivity.this.zLjUOn();
            if (Intrinsics.EZpvd((Object) InvestUniv3SubscribeActivity.this.gEmmrt, (Object) "CHART_TYPE_PRICE")) {
                C23732iHg c23732iHg3 = InvestUniv3SubscribeActivity.this.AhwBna;
                if (c23732iHg3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c23732iHg = c23732iHg3;
                }
                c23732iHg.QUSxYX.OLrzqt();
            }
        }
    }

    public static final void OLrzqt(final InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Drawable drawable, final Drawable drawable2, View view) {
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.RcXXUw.setCompoundDrawablesRelative(null, null, drawable, null);
        final C27179jqM c27179jqM = new C27179jqM();
        c27179jqM.KWHzl(yDY.gEmmrt(C56390yDp.OLrzqt(investUniv3SubscribeActivity.getString(C25493ixk.FragmentManager.RuDPQV), investUniv3SubscribeActivity.getString(C25493ixk.FragmentManager.RuDPQV)), C56390yDp.OLrzqt(investUniv3SubscribeActivity.getString(C25493ixk.FragmentManager.dIjzlO), investUniv3SubscribeActivity.getString(C25493ixk.FragmentManager.dIjzlO)), C56390yDp.OLrzqt(investUniv3SubscribeActivity.getString(C25493ixk.FragmentManager.atDTRm), investUniv3SubscribeActivity.getString(C25493ixk.FragmentManager.atDTRm))), new Function1() { // from class: o.jmj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.AEQbTJ(this.KWHzl, drawable2, c27179jqM, obj);
            }
        });
        c27179jqM.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o.jmf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(android.content.DialogInterface dialogInterface) {
                InvestUniv3SubscribeActivity.OLrzqt(this.KWHzl, drawable2, dialogInterface);
            }
        });
        androidx.fragment.app.FragmentManager supportFragmentManager = investUniv3SubscribeActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c27179jqM.show(supportFragmentManager);
    }

    public static final Unit AEQbTJ(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Drawable drawable, C27179jqM c27179jqM, Object obj) {
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.RcXXUw.setText(obj != null ? obj.toString() : null);
        C23732iHg c23732iHg2 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg2 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg2 = null;
        }
        c23732iHg2.RcXXUw.setCompoundDrawablesRelative(null, null, drawable, null);
        investUniv3SubscribeActivity.EZpvd(obj != null ? obj.toString() : null, false);
        c27179jqM.dismiss();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Drawable drawable, DialogInterface dialogInterface) {
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.RcXXUw.setCompoundDrawablesRelative(null, null, drawable, null);
    }

    public final void zsXlph() {
        if (this.fIwbmz) {
            C23732iHg c23732iHg = this.AhwBna;
            if (c23732iHg == null) {
                Intrinsics.gEmmrt("");
                c23732iHg = null;
            }
            c23732iHg.getRoot().post(new Runnable() { // from class: o.jmd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    InvestUniv3SubscribeActivity.RJOkX(this.EZpvd);
                }
            });
        }
    }

    public static final void RJOkX(InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
        boolean z = investUniv3SubscribeActivity.isConnected().AxsJAYaxsJAY().EZpvd().compareTo(investUniv3SubscribeActivity.isConnected().ejfBZ().getValue()) >= 0;
        boolean z2 = investUniv3SubscribeActivity.isConnected().AxsJAY().EZpvd().compareTo(investUniv3SubscribeActivity.isConnected().ejfBZ().getValue()) <= 0;
        C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        C27300jsb c27300jsb = c23732iHg.fvQaOB;
        Intrinsics.checkNotNullExpressionValue(c27300jsb, "");
        int i = 8;
        c27300jsb.setVisibility(z ? 0 : 8);
        C23732iHg c23732iHg2 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg2 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg2 = null;
        }
        C27300jsb c27300jsb2 = c23732iHg2.giSNqX;
        Intrinsics.checkNotNullExpressionValue(c27300jsb2, "");
        c27300jsb2.setVisibility(z2 ? 0 : 8);
        C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg3 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg3 = null;
        }
        View view = c23732iHg3.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility((z && z2) ? 0 : 8);
        C23732iHg c23732iHg4 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg4 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg4 = null;
        }
        ImageView imageView = c23732iHg4.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility((z && z2) ? 0 : 8);
        C23732iHg c23732iHg5 = investUniv3SubscribeActivity.AhwBna;
        if (c23732iHg5 == null) {
            Intrinsics.gEmmrt("");
            c23732iHg5 = null;
        }
        View view2 = c23732iHg5.copydefault;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        if (z && z2) {
            i = 0;
        }
        view2.setVisibility(i);
        if ((z && z2) || investUniv3SubscribeActivity.DbNXlk) {
            return;
        }
        investUniv3SubscribeActivity.DbNXlk = true;
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(investUniv3SubscribeActivity);
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.copydefault(C25493ixk.FragmentManager.iCPUKe);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C25493ixk.FragmentManager.sVXHln, (View.OnClickListener) null, 2, (Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public final void AuCTel() {
        if (this.fIwbmz && isConnected().DarRvM()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$refreshInputAmountUponPriceChange$1(this, null), 3, null);
        }
    }

    public final void fJNWhG() {
        Vibrator defaultVibrator;
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = getSystemService("vibrator_manager");
            Intrinsics.copydefault(systemService, "");
            defaultVibrator = C7514alK.cI_(systemService).getDefaultVibrator();
        } else {
            Object systemService2 = getSystemService("vibrator");
            Intrinsics.copydefault(systemService2, "");
            defaultVibrator = (Vibrator) systemService2;
        }
        this.sSMYrx = defaultVibrator;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    private final void AxsJAY() {
        C27570jxg.investEvent$default("YieldDepositNumpad_Mid_GetToken_Click", null, new Function1() { // from class: o.jlA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.AEQbTJ((EventParamsList) obj);
            }
        }, 1, null);
    }

    private final void OcIXYQ() {
        C27570jxg.investEvent$default("YieldDepositNumpad_Full_Button_Click", null, new Function1() { // from class: o.jmn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeActivity.KWHzl(this.KWHzl, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("investment_id", C33129mqd.gEmmrt(Long.valueOf(investUniv3SubscribeActivity.isConnected)), false);
        eventParamsList.put("chain_id", C33129mqd.gEmmrt(Long.valueOf(investUniv3SubscribeActivity.djBIcL)), false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "max", true);
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(InvestTokenWithAmount investTokenWithAmount) {
        String strDjBIcL;
        String strHDKMBd;
        ArrayList arrayListCopydefault;
        AxsJAY();
        String tokenAddress = !investTokenWithAmount.isBaseToken() ? investTokenWithAmount.getTokenAddress() : "";
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().OLrzqt(this.zuBGHE);
        if (interfaceC9738bbJOLrzqt == null || (strDjBIcL = interfaceC9738bbJOLrzqt.djBIcL(investTokenWithAmount.getChainId())) == null) {
            strDjBIcL = "0";
        }
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt2 = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().OLrzqt(this.zuBGHE);
        if (interfaceC9738bbJOLrzqt2 == null || (strHDKMBd = interfaceC9738bbJOLrzqt2.hDKMBd()) == null) {
            strHDKMBd = "0";
        }
        boolean z = (C33129mqd.AEQbTJ(strDjBIcL, "0") || C33129mqd.AEQbTJ(strHDKMBd, "0")) ? false : true;
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC23916iOb.class);
        String strGEmmrt = C33129mqd.gEmmrt(Long.valueOf(investTokenWithAmount.getChainId()));
        if (z) {
            arrayListCopydefault = yDY.copydefault("dex", "gas_station");
        } else {
            arrayListCopydefault = yDY.copydefault("gas_station");
        }
        InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, this, new WalletRechargeBean(strGEmmrt, tokenAddress, "yield", "balance", arrayListCopydefault, (ArrayList) null, true, (String) null, 0, 416, (DefaultConstructorMarker) null), 0, null, 12, null);
    }

    public final void getFieldNames() {
        new C54976xbI().AEQbTJ(this, new ComponentCallbacks());
    }

    public static final class ComponentCallbacks implements C54976xbI.StateListAnimator {
        public ComponentCallbacks() {
        }

        @Override // o.C54976xbI.StateListAnimator
        public void OLrzqt(boolean z, int i) {
            C23732iHg c23732iHg = InvestUniv3SubscribeActivity.this.AhwBna;
            C23732iHg c23732iHg2 = null;
            if (c23732iHg == null) {
                Intrinsics.gEmmrt("");
                c23732iHg = null;
            }
            c23732iHg.DXXBbs.setSwitchEnable(!z);
            if (z) {
                Runnable runnable = InvestUniv3SubscribeActivity.this.fARcdN;
                if (runnable != null) {
                    C23732iHg c23732iHg3 = InvestUniv3SubscribeActivity.this.AhwBna;
                    if (c23732iHg3 == null) {
                        Intrinsics.gEmmrt("");
                        c23732iHg3 = null;
                    }
                    c23732iHg3.fJNWhG.removeCallbacks(runnable);
                }
                C23732iHg c23732iHg4 = InvestUniv3SubscribeActivity.this.AhwBna;
                if (c23732iHg4 == null) {
                    Intrinsics.gEmmrt("");
                    c23732iHg4 = null;
                }
                c23732iHg4.fJNWhG.removeCallbacks(InvestUniv3SubscribeActivity.this.gEmmrt());
                C23732iHg c23732iHg5 = InvestUniv3SubscribeActivity.this.AhwBna;
                if (c23732iHg5 == null) {
                    Intrinsics.gEmmrt("");
                    c23732iHg5 = null;
                }
                if (c23732iHg5.QVAiDq.hasFocus()) {
                    return;
                }
                C23732iHg c23732iHg6 = InvestUniv3SubscribeActivity.this.AhwBna;
                if (c23732iHg6 == null) {
                    Intrinsics.gEmmrt("");
                    c23732iHg6 = null;
                }
                if (c23732iHg6.RJOkX.hasFocus()) {
                    return;
                }
                InvestUniv3SubscribeActivity investUniv3SubscribeActivity = InvestUniv3SubscribeActivity.this;
                investUniv3SubscribeActivity.fARcdN = investUniv3SubscribeActivity.EZpvd(i);
                C23732iHg c23732iHg7 = InvestUniv3SubscribeActivity.this.AhwBna;
                if (c23732iHg7 == null) {
                    Intrinsics.gEmmrt("");
                    c23732iHg7 = null;
                }
                c23732iHg7.fJNWhG.post(InvestUniv3SubscribeActivity.this.fARcdN);
                C23732iHg c23732iHg8 = InvestUniv3SubscribeActivity.this.AhwBna;
                if (c23732iHg8 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c23732iHg2 = c23732iHg8;
                }
                c23732iHg2.fJNWhG.postDelayed(InvestUniv3SubscribeActivity.this.gEmmrt(), 500L);
                return;
            }
            C23732iHg c23732iHg9 = InvestUniv3SubscribeActivity.this.AhwBna;
            if (c23732iHg9 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg9 = null;
            }
            c23732iHg9.QfsBiF.setVisibility(8);
            C23732iHg c23732iHg10 = InvestUniv3SubscribeActivity.this.AhwBna;
            if (c23732iHg10 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg10 = null;
            }
            if (c23732iHg10.QVAiDq.hasFocus()) {
                return;
            }
            C23732iHg c23732iHg11 = InvestUniv3SubscribeActivity.this.AhwBna;
            if (c23732iHg11 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg11 = null;
            }
            if (c23732iHg11.RJOkX.hasFocus()) {
                return;
            }
            C23732iHg c23732iHg12 = InvestUniv3SubscribeActivity.this.AhwBna;
            if (c23732iHg12 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg2 = c23732iHg12;
            }
            NestedScrollView nestedScrollView = c23732iHg2.ORxRYg;
            final InvestUniv3SubscribeActivity investUniv3SubscribeActivity2 = InvestUniv3SubscribeActivity.this;
            nestedScrollView.post(new Runnable() { // from class: o.jmu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    InvestUniv3SubscribeActivity.ComponentCallbacks.copydefault(investUniv3SubscribeActivity2);
                }
            });
        }

        public static final void copydefault(InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
            C23732iHg c23732iHg = investUniv3SubscribeActivity.AhwBna;
            C23732iHg c23732iHg2 = null;
            if (c23732iHg == null) {
                Intrinsics.gEmmrt("");
                c23732iHg = null;
            }
            c23732iHg.ORxRYg.fullScroll(130);
            C23732iHg c23732iHg3 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
                c23732iHg3 = null;
            }
            c23732iHg3.QVAiDq.copydefault();
            C23732iHg c23732iHg4 = investUniv3SubscribeActivity.AhwBna;
            if (c23732iHg4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg2 = c23732iHg4;
            }
            c23732iHg2.RJOkX.copydefault();
        }
    }

    public final void iwGUEr() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.EZpvd(getString(C25493ixk.FragmentManager.geLlBI));
        viewOnClickListenerC54939xaY.EZpvd(C25493ixk.FragmentManager.OHqIaq, new View.OnClickListener() { // from class: o.jlN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                InvestUniv3SubscribeActivity.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.ejfBZ) {
            super.onBackPressed();
        } else {
            showInputLayout$default(this, false, 1, null);
        }
    }

    @Override // o.AbstractActivityC26831jjj, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        isConnected().dmfpNf();
        gHZMYf().KWHzl().removeObserver(this.iwGUEr);
        C23732iHg c23732iHg = this.AhwBna;
        C23732iHg c23732iHg2 = null;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        if (c23732iHg.iwGUEr != null) {
            C23732iHg c23732iHg3 = this.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg2 = c23732iHg3;
            }
            c23732iHg2.iwGUEr.KWHzl();
        }
    }

    @Override // o.AbstractActivityC26831jjj, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        isConnected().RKDWNf();
    }

    @Override // o.AbstractActivityC26831jjj, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        isConnected().QHmsKR();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshDataFirst$default(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        investUniv3SubscribeActivity.OLrzqt((Function1<? super InvestUniv3SubscribeReceiveInfo, Unit>) function1, (Function0<Unit>) function0);
    }

    public final void OLrzqt(Function1<? super InvestUniv3SubscribeReceiveInfo, Unit> function1, Function0<Unit> function0) {
        isConnected().aKErDB().setValue(Boolean.FALSE);
        C23732iHg c23732iHg = this.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        C52794wYp.startLoading$default(c23732iHg.DAIeex, 0L, 1, null);
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$refreshDataFirst$1(this, function1, function0, null), 3, null);
    }

    public final void copydefault(boolean z) {
        isConnected().KWHzl(z ? TransactionStage.CONFIRMATION : TransactionStage.INPUT);
        C23732iHg c23732iHg = this.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        C27131jpR c27131jpR = c23732iHg.fARcdN;
        Intrinsics.checkNotNullExpressionValue(c27131jpR, "");
        c27131jpR.setVisibility(z ? 0 : 8);
        if (z) {
            if (AhwBna()) {
                InvestUniv3SubscribeInfo investUniv3SubscribeInfoGEmmrt = isConnected().gEmmrt();
                copydefault(C56548yJl.copydefault(investUniv3SubscribeInfoGEmmrt != null ? investUniv3SubscribeInfoGEmmrt.getRefreshTime() : 15, 15));
                return;
            }
            return;
        }
        valueOf();
    }

    public final boolean AhwBna() {
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfoIsConnected;
        return ((this.AuCTelauCTel != InvestUniv3Mode.Zap && !isConnected().OcIXYQ()) || (investUniv3SubscribeReceiveInfoIsConnected = isConnected().isConnected()) == null || investUniv3SubscribeReceiveInfoIsConnected.isApproveStep()) ? false : true;
    }

    @Override // o.InterfaceC26678jgp
    public void copydefault(int i) {
        iKU iku;
        if (i > 0 && (iku = this.valueOf) != null) {
            C27446jvO c27446jvO = iku.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c27446jvO, "");
            c27446jvO.setVisibility(0);
            iku.EZpvd.setMaxCountdownTime(i);
            iku.EZpvd.OLrzqt();
        }
    }

    @Override // o.InterfaceC26678jgp
    public void valueOf() {
        iKU iku = this.valueOf;
        if (iku != null) {
            iku.EZpvd.KWHzl();
            C27446jvO c27446jvO = iku.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c27446jvO, "");
            c27446jvO.setVisibility(8);
        }
    }

    public final void hDKMBd() {
        C23732iHg c23732iHg = this.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.fARcdN.AEQbTJ();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUniv3SubscribeActivity$refreshReceiveInfoAndRestartCountdown$1(this, null), 3, null);
    }

    public final void AEQbTJ(Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
        C27508jwX.toTransactionResultPage$default(C27508jwX.AEQbTJ, this, bundle, transactionResultExtraData, 0, null, null, 28, null);
        finish();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeViewModel.settleTransaction$default(com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeViewModel, boolean, int, java.lang.Object):void */
    private final void DTwDnp() {
        C23732iHg c23732iHg = this.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.fARcdN.AEQbTJ();
        InvestUniv3SubscribeViewModel.settleTransaction$default(isConnected(), false, 1, null);
    }

    private final void AEQbTJ(Bundle bundle, int i) {
        C23732iHg c23732iHg = null;
        if (bundle == null || bundle.getInt("result") != -1) {
            C23732iHg c23732iHg2 = this.AhwBna;
            if (c23732iHg2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg = c23732iHg2;
            }
            c23732iHg.fARcdN.copydefault();
            return;
        }
        if (!InvestTradeManager.OLrzqt.AEQbTJ(i)) {
            C23732iHg c23732iHg3 = this.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg = c23732iHg3;
            }
            c23732iHg.fARcdN.copydefault();
            AEQbTJ(bundle, isConnected().gGvvIC());
            return;
        }
        C23732iHg c23732iHg4 = this.AhwBna;
        if (c23732iHg4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23732iHg = c23732iHg4;
        }
        c23732iHg.fARcdN.AEQbTJ();
        isConnected().AEQbTJ(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(final iXD ixd) {
        if (ixd instanceof iXD.ActionBar) {
            C27508jwX.AEQbTJ.EZpvd(this, ((iXD.ActionBar) ixd).EZpvd(), new Function1() { // from class: o.jlM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InvestUniv3SubscribeActivity.KWHzl(this.KWHzl, ixd, (android.os.Bundle) obj);
                }
            }, new Function1() { // from class: o.jlP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InvestUniv3SubscribeActivity.OLrzqt(ixd, (NewCallbackBean) obj);
                }
            }, new Function1() { // from class: o.jlL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InvestUniv3SubscribeActivity.copydefault(this.copydefault, (NewCallbackBean) obj);
                }
            });
            return;
        }
        if (ixd instanceof iXD.TaskDescription) {
            Throwable thOLrzqt = ((iXD.TaskDescription) ixd).OLrzqt();
            C23732iHg c23732iHg = null;
            if (thOLrzqt != null) {
                if ((thOLrzqt instanceof OKServerException) && ((OKServerException) thOLrzqt).getCode() == 111000111) {
                    iUZ.Companion.OLrzqt(new iUZ.TaskDescription() { // from class: o.jlR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.iUZ.TaskDescription
                        public final void KWHzl() {
                            InvestUniv3SubscribeActivity.AxsJAY(this.AEQbTJ);
                        }
                    }).show(getSupportFragmentManager(), iUZ.class.getSimpleName());
                    return;
                }
                String message = thOLrzqt.getMessage();
                if (!C33129mqd.OLrzqt((CharSequence) message)) {
                    message = null;
                }
                if (message == null) {
                    message = C43422row.OLrzqt();
                }
                C55326xho.toast$default(message, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            }
            C23732iHg c23732iHg2 = this.AhwBna;
            if (c23732iHg2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg = c23732iHg2;
            }
            c23732iHg.fARcdN.copydefault();
        }
    }

    public static final Unit KWHzl(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, iXD ixd, Bundle bundle) {
        investUniv3SubscribeActivity.AEQbTJ(bundle, ((iXD.ActionBar) ixd).copydefault().getOrderType());
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX OLrzqt(iXD ixd, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        iXD.ActionBar actionBar = (iXD.ActionBar) ixd;
        return actionBar.OLrzqt().invoke(newCallbackBean, actionBar.copydefault());
    }

    public static final AbstractC58185ywX copydefault(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        return investUniv3SubscribeActivity.isConnected().copydefault(newCallbackBean);
    }

    public static final void AxsJAY(InvestUniv3SubscribeActivity investUniv3SubscribeActivity) {
        investUniv3SubscribeActivity.isConnected().djBIcL(true);
    }

    @Override // o.AbstractActivityC26831jjj, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC26831jjj, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
