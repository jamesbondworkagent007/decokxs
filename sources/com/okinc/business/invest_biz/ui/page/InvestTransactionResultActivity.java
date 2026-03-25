package com.okinc.business.invest_biz.ui.page;

import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.viewmodel.InvestTransactionResultViewModel;
import com.okinc.core.util.SPUtils;
import com.okinc.rxutils.RxBus;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC43238rlX;
import o.C23739iHn;
import o.C25493ixk;
import o.C25515iyF;
import o.C27508jwX;
import o.C27569jxf;
import o.C27589jxz;
import o.C33129mqd;
import o.C43251rlk;
import o.C52794wYp;
import o.C55178xez;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56424yEw;
import o.C56443yFo;
import o.C56524yIo;
import o.C7323ahf;
import o.InterfaceC23608iCr;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import o.InterfaceC7298ahG;
import o.InterfaceC9770bbp;
import o.iBJ;
import o.iFC;
import o.iMT;
import o.iPY;
import o.pTD;
import o.rVN;
import o.wYF;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestTransactionResultActivity extends iPY {
    public final InterfaceC56387yDm AYXKKw;
    public iBJ AhwBna;

    @yCM
    public iFC dashboardFeatureFlag;
    public boolean djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC9770bbp gEmmrt;
    public C23739iHn valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestTransactionResultViewModel.TransactionType.values().length];
            try {
                iArr[InvestTransactionResultViewModel.TransactionType.INVEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvestTransactionResultViewModel.TransactionType.REDEEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestTransactionResultViewModel.TransactionType.BORROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InvestTransactionResultViewModel.TransactionType.REPAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InvestTransactionResultViewModel.TransactionType.CLAIM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InvestTransactionResultViewModel.TransactionType.DEPLOY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InvestTransactionResultViewModel.TransactionType.MINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InvestTransactionResultViewModel.TransactionType.UNBOND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            OLrzqt = iArr;
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public InvestTransactionResultActivity() {
        Object next;
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$special$$inlined$viewModels$default$1
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
        };
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(InvestTransactionResultViewModel.class);
        Function0<ViewModelStore> function02 = new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$special$$inlined$viewModels$default$2
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
        };
        final byte b = 0 == true ? 1 : 0;
        this.fetchVPNInfo = new ViewModelLazy(interfaceC56551yJoAEQbTJ, function02, function0, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$special$$inlined$viewModels$default$3
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
                Function0 function03 = b;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.iSF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestTransactionResultActivity.gEmmrt();
            }
        });
        Iterator<T> it = fARcdN().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC9770bbp) next) instanceof InterfaceC23608iCr) {
                    break;
                }
            }
        }
        InterfaceC9770bbp interfaceC9770bbp = (InterfaceC9770bbp) next;
        this.gEmmrt = interfaceC9770bbp;
        InterfaceC23608iCr interfaceC23608iCr = interfaceC9770bbp instanceof InterfaceC23608iCr ? (InterfaceC23608iCr) interfaceC9770bbp : null;
        this.AhwBna = interfaceC23608iCr != null ? interfaceC23608iCr.EZpvd() : null;
    }

    public final InvestTransactionResultViewModel AYXKKw() {
        return (InvestTransactionResultViewModel) this.fetchVPNInfo.getValue();
    }

    private final String AuCTel() {
        Bundle bundle;
        Bundle extras = getIntent().getExtras();
        if (extras == null || (bundle = extras.getBundle("bundle")) == null) {
            return null;
        }
        return bundle.getString("tx_hash");
    }

    public final String AhwBna() {
        Bundle bundle;
        Bundle extras = getIntent().getExtras();
        if (extras == null || (bundle = extras.getBundle("bundle")) == null) {
            return null;
        }
        return bundle.getString("tx_uop_hash");
    }

    public final boolean isConnected() {
        Bundle bundle;
        Bundle extras = getIntent().getExtras();
        return (extras == null || (bundle = extras.getBundle("bundle")) == null || !bundle.getBoolean("action_web3_claim")) ? false : true;
    }

    private final String fIwbmz() {
        InvestTradeManager.TransactionResultExtraData transactionResultExtraData;
        String strAEQbTJ;
        Bundle extras = getIntent().getExtras();
        if (extras != null && (transactionResultExtraData = (InvestTradeManager.TransactionResultExtraData) extras.getParcelable("extraData")) != null && (strAEQbTJ = transactionResultExtraData.AEQbTJ()) != null) {
            return strAEQbTJ;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            return extras2.getString("key.orderId");
        }
        return null;
    }

    private final int fJNWhG() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return extras.getInt("investmentCategory");
        }
        return 0;
    }

    public final int djBIcL() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return extras.getInt("investProduct");
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransactionConfig ejfBZ() {
        Bundle bundle;
        Bundle extras = getIntent().getExtras();
        if (extras == null || (bundle = extras.getBundle("bundle")) == null) {
            return null;
        }
        return (TransactionConfig) bundle.getParcelable("key.trx_config");
    }

    private final List<InterfaceC9770bbp> fARcdN() {
        return (List) this.AYXKKw.getValue();
    }

    public static final List gEmmrt() {
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9770bbp.class));
        return listKWHzl == null ? yDY.AhwBna() : listKWHzl;
    }

    public final iFC valueOf() {
        iFC ifc = this.dashboardFeatureFlag;
        if (ifc != null) {
            return ifc;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final boolean AkhnZx() {
        return valueOf().copydefault();
    }

    public final boolean fetchVPNInfo() {
        TransactionConfig transactionConfigEjfBZ = ejfBZ();
        if (transactionConfigEjfBZ != null && transactionConfigEjfBZ.OcIXYQ()) {
            return true;
        }
        TransactionConfig transactionConfigEjfBZ2 = ejfBZ();
        return (transactionConfigEjfBZ2 != null && transactionConfigEjfBZ2.ORxRYg()) || isConnected();
    }

    @Override // o.iPY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        C23739iHn c23739iHnEZpvd = C23739iHn.EZpvd(getLayoutInflater());
        this.valueOf = c23739iHnEZpvd;
        if (c23739iHnEZpvd == null) {
            Intrinsics.gEmmrt("");
            c23739iHnEZpvd = null;
        }
        setContentView(c23739iHnEZpvd.getRoot());
        getFieldNames();
    }

    @Override // o.iPY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        iBJ ibj = this.AhwBna;
        if (ibj != null) {
            ibj.KWHzl(AuCTel(), fIwbmz(), AhwBna());
        }
    }

    private final void getFieldNames() {
        C23739iHn c23739iHn = this.valueOf;
        C23739iHn c23739iHn2 = null;
        if (c23739iHn == null) {
            Intrinsics.gEmmrt("");
            c23739iHn = null;
        }
        ViewCompat.setOnApplyWindowInsetsListener(c23739iHn.getRoot(), new OnApplyWindowInsetsListener() { // from class: o.iSG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return InvestTransactionResultActivity.AEQbTJ(this.AEQbTJ, view, windowInsetsCompat);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestTransactionResultActivity$initView$2(this, null), 3, null);
        C23739iHn c23739iHn3 = this.valueOf;
        if (c23739iHn3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23739iHn2 = c23739iHn3;
        }
        C55178xez root = c23739iHn2.getRoot();
        ImageView imageViewAEQbTJ = root.AEQbTJ();
        imageViewAEQbTJ.setOnClickListener(new Activity(imageViewAEQbTJ, 1000L, this));
        C27589jxz.collectOnLifecycle$default(this, FlowKt.filterNotNull(AYXKKw().AEQbTJ()), null, new StateListAnimator(root), 2, null);
    }

    public static final WindowInsetsCompat AEQbTJ(InvestTransactionResultActivity investTransactionResultActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        C23739iHn c23739iHn = investTransactionResultActivity.valueOf;
        if (c23739iHn == null) {
            Intrinsics.gEmmrt("");
            c23739iHn = null;
        }
        C55178xez root = c23739iHn.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setPaddingRelative(root.getPaddingStart(), insets.top, root.getPaddingEnd(), root.getPaddingBottom());
        return windowInsetsCompat;
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        public final /* synthetic */ C55178xez EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(C55178xez c55178xez) {
            this.EZpvd = c55178xez;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(InvestTransactionResultViewModel.Application application, Continuation<? super Unit> continuation) {
            List<Long> investmentIdList;
            InvestTransactionResultViewModel.ActionBar actionBarEZpvd = application.EZpvd();
            InvestTransactionResultViewModel.TransactionType transactionTypeCopydefault = application.copydefault();
            if (actionBarEZpvd instanceof InvestTransactionResultViewModel.ActionBar.TaskDescription) {
                rVN.reportFullyDrawn$default((android.app.Activity) InvestTransactionResultActivity.this, true, (String) null, 2, (Object) null);
                InvestTransactionResultActivity investTransactionResultActivity = InvestTransactionResultActivity.this;
                C55178xez c55178xez = this.EZpvd;
                Intrinsics.copydefault(c55178xez);
                investTransactionResultActivity.AEQbTJ(c55178xez, (InvestTransactionResultViewModel.ActionBar.TaskDescription) actionBarEZpvd, transactionTypeCopydefault);
            } else if (actionBarEZpvd instanceof InvestTransactionResultViewModel.ActionBar.LoaderManager) {
                rVN.reportFullyDrawn$default((android.app.Activity) InvestTransactionResultActivity.this, true, (String) null, 2, (Object) null);
                InvestTransactionResultActivity investTransactionResultActivity2 = InvestTransactionResultActivity.this;
                C55178xez c55178xez2 = this.EZpvd;
                Intrinsics.copydefault(c55178xez2);
                InvestTransactionResultViewModel.ActionBar.LoaderManager loaderManager = (InvestTransactionResultViewModel.ActionBar.LoaderManager) actionBarEZpvd;
                InvestTransactionParam routerParams = loaderManager.AEQbTJ().getRouterParams();
                Long analysisPlatformId = routerParams != null ? routerParams.getAnalysisPlatformId() : null;
                InvestTransactionParam routerParams2 = loaderManager.AEQbTJ().getRouterParams();
                investTransactionResultActivity2.copydefault(c55178xez2, transactionTypeCopydefault, analysisPlatformId, routerParams2 != null ? C56443yFo.KWHzl(routerParams2.getChainId()) : null, loaderManager.AEQbTJ().getTxHash(), loaderManager.AEQbTJ().getUopHash());
                InvestTransactionParam routerParams3 = loaderManager.AEQbTJ().getRouterParams();
                Long analysisPlatformId2 = routerParams3 != null ? routerParams3.getAnalysisPlatformId() : null;
                InvestTransactionParam routerParams4 = loaderManager.AEQbTJ().getRouterParams();
                RxBus.AEQbTJ(new C25515iyF(transactionTypeCopydefault, analysisPlatformId2, routerParams4 != null ? C56443yFo.KWHzl(routerParams4.getChainId()) : null));
                TransactionConfig transactionConfigEjfBZ = InvestTransactionResultActivity.this.ejfBZ();
                if (transactionConfigEjfBZ != null && transactionConfigEjfBZ.iwGUEr()) {
                    InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
                    Pair[] pairArr = new Pair[7];
                    pairArr[0] = C56390yDp.OLrzqt("transactionType", transactionTypeCopydefault.name());
                    InvestTransactionParam routerParams5 = loaderManager.AEQbTJ().getRouterParams();
                    pairArr[1] = C56390yDp.OLrzqt("chainId", routerParams5 != null ? C56443yFo.KWHzl(routerParams5.getChainId()) : null);
                    pairArr[2] = C56390yDp.OLrzqt("txHash", loaderManager.AEQbTJ().getTxHash());
                    pairArr[3] = C56390yDp.OLrzqt("uopHash", loaderManager.AEQbTJ().getUopHash());
                    InvestTransactionParam routerParams6 = loaderManager.AEQbTJ().getRouterParams();
                    pairArr[4] = C56390yDp.OLrzqt("analysisPlatformId", routerParams6 != null ? routerParams6.getAnalysisPlatformId() : null);
                    pairArr[5] = C56390yDp.OLrzqt("stakeId", transactionConfigEjfBZ.fARcdN());
                    InvestTransactionParam routerParams7 = loaderManager.AEQbTJ().getRouterParams();
                    pairArr[6] = C56390yDp.OLrzqt("investmentId", (routerParams7 == null || (investmentIdList = routerParams7.getInvestmentIdList()) == null) ? null : (Long) CollectionsKt___CollectionsKt.firstOrNull(investmentIdList));
                    interfaceC7298ahGKWHzl.AEQbTJ("BoostTransactionSuccessEvent", null, C56424yEw.gEmmrt(pairArr));
                }
            } else {
                if (!(actionBarEZpvd instanceof InvestTransactionResultViewModel.ActionBar.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                rVN.reportFullyDrawn$default((android.app.Activity) InvestTransactionResultActivity.this, false, (String) null, 2, (Object) null);
                InvestTransactionResultActivity investTransactionResultActivity3 = InvestTransactionResultActivity.this;
                C55178xez c55178xez3 = this.EZpvd;
                Intrinsics.copydefault(c55178xez3);
                InvestTransactionResultViewModel.ActionBar.Application application2 = (InvestTransactionResultViewModel.ActionBar.Application) actionBarEZpvd;
                investTransactionResultActivity3.EZpvd(c55178xez3, transactionTypeCopydefault, application2.EZpvd().getTxHash(), application2.EZpvd().getUopHash());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ InvestTransactionResultActivity AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, InvestTransactionResultActivity investTransactionResultActivity) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = investTransactionResultActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.values();
            }
        }
    }

    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ Long EZpvd;
        public final /* synthetic */ Long KWHzl;
        public final /* synthetic */ InvestTransactionResultActivity OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(View view, long j, InvestTransactionResultActivity investTransactionResultActivity, Long l, Long l2) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = investTransactionResultActivity;
            this.KWHzl = l;
            this.EZpvd = l2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.OLrzqt.isConnected()) {
                    this.OLrzqt.values();
                } else {
                    this.OLrzqt.OLrzqt(this.KWHzl, this.EZpvd);
                }
            }
        }
    }

    public static final class BroadcastReceiver implements View.OnClickListener {
        public final /* synthetic */ InvestTransactionResultActivity EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver(View view, long j, InvestTransactionResultActivity investTransactionResultActivity) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = investTransactionResultActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.values();
            }
        }
    }

    public static final class ClipData implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ InvestTransactionResultActivity KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ClipData(View view, long j, InvestTransactionResultActivity investTransactionResultActivity) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = investTransactionResultActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.DbNXlk();
            }
        }
    }

    public static final class ComponentCallbacks implements View.OnClickListener {
        public final /* synthetic */ InvestTransactionResultActivity AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks(View view, long j, InvestTransactionResultActivity investTransactionResultActivity) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = investTransactionResultActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.values();
            }
        }
    }

    public static final class ComponentCallbacks2 implements View.OnClickListener {
        public final /* synthetic */ Long AEQbTJ;
        public final /* synthetic */ InvestTransactionResultActivity EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ Long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks2(View view, long j, InvestTransactionResultActivity investTransactionResultActivity, Long l, Long l2) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = investTransactionResultActivity;
            this.AEQbTJ = l;
            this.copydefault = l2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.OLrzqt(this.AEQbTJ, this.copydefault);
            }
        }
    }

    public static final class ComponentName implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Long KWHzl;
        public final /* synthetic */ InvestTransactionResultActivity OLrzqt;
        public final /* synthetic */ Long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentName(View view, long j, InvestTransactionResultActivity investTransactionResultActivity, Long l, Long l2) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = investTransactionResultActivity;
            this.KWHzl = l;
            this.copydefault = l2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt(this.KWHzl, this.copydefault);
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ InvestTransactionResultActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(View view, long j, InvestTransactionResultActivity investTransactionResultActivity) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = investTransactionResultActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.values();
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ InvestTransactionResultActivity KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j, InvestTransactionResultActivity investTransactionResultActivity) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = investTransactionResultActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.values();
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ InvestTransactionResultActivity OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(View view, long j, InvestTransactionResultActivity investTransactionResultActivity) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = investTransactionResultActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.values();
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ InvestTransactionResultActivity KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(View view, long j, InvestTransactionResultActivity investTransactionResultActivity) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = investTransactionResultActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.DbNXlk();
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ InvestTransactionResultActivity EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(View view, long j, InvestTransactionResultActivity investTransactionResultActivity) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = investTransactionResultActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.DbNXlk();
            }
        }
    }

    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ String AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ InvestTransactionResultActivity KWHzl;
        public final /* synthetic */ String OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(View view, long j, InvestTransactionResultActivity investTransactionResultActivity, String str, String str2) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = investTransactionResultActivity;
            this.AEQbTJ = str;
            this.OLrzqt = str2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.OLrzqt(this.AEQbTJ, this.OLrzqt);
            }
        }
    }

    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ InvestTransactionResultActivity AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ Long OLrzqt;
        public final /* synthetic */ Long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(View view, long j, InvestTransactionResultActivity investTransactionResultActivity, Long l, Long l2) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = investTransactionResultActivity;
            this.copydefault = l;
            this.OLrzqt = l2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.OLrzqt(this.copydefault, this.OLrzqt);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ InvestTransactionResultActivity AhwBna;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ InvestTransactionResultViewModel.TransactionType KWHzl;
        public final /* synthetic */ String OLrzqt;
        public final /* synthetic */ String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, InvestTransactionResultActivity investTransactionResultActivity, InvestTransactionResultViewModel.TransactionType transactionType, String str, String str2) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.AhwBna = investTransactionResultActivity;
            this.KWHzl = transactionType;
            this.OLrzqt = str;
            this.copydefault = str2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (!this.AhwBna.isConnected() || this.KWHzl != InvestTransactionResultViewModel.TransactionType.CLAIM) {
                    this.AhwBna.OLrzqt(this.OLrzqt, this.copydefault);
                } else {
                    this.AhwBna.values();
                }
            }
        }
    }

    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ InvestTransactionResultActivity OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(View view, long j, InvestTransactionResultActivity investTransactionResultActivity) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = investTransactionResultActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.values();
            }
        }
    }

    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ InvestTransactionResultActivity KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ Long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(View view, long j, InvestTransactionResultActivity investTransactionResultActivity, Long l) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = investTransactionResultActivity;
            this.copydefault = l;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.OLrzqt(C33129mqd.valueOf(this.copydefault));
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NotNull String str, @NotNull Context context, @NotNull AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        C27569jxf.setStatusBarsStyle$OKDeFi_invest_biz$default(C27569jxf.OLrzqt, this, 0, 1, null);
    }

    @Override // o.iPY, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        iBJ ibj = this.AhwBna;
        if (ibj != null) {
            ibj.OLrzqt(AuCTel(), fIwbmz(), AhwBna());
        }
    }

    public final TextView KWHzl(C55178xez c55178xez) {
        View viewEZpvd = c55178xez.EZpvd();
        TextView textView = viewEZpvd instanceof TextView ? (TextView) viewEZpvd : null;
        if (textView != null) {
            return textView;
        }
        iMT imtOLrzqt = iMT.OLrzqt(LayoutInflater.from(c55178xez.getContext()));
        Intrinsics.checkNotNullExpressionValue(imtOLrzqt, "");
        imtOLrzqt.getRoot().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        TextView root = imtOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55178xez.setOptionalView(root);
        return root;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(C55178xez c55178xez, InvestTransactionResultViewModel.ActionBar.TaskDescription taskDescription, InvestTransactionResultViewModel.TransactionType transactionType) {
        String string;
        TransactionConfig transactionConfigEjfBZ;
        String string2;
        C52794wYp c52794wYpCopydefault;
        int i;
        TransactionConfig transactionConfigEjfBZ2;
        TransactionConfig transactionConfigEjfBZ3;
        c55178xez.setStatus(fetchVPNInfo() ? 6 : 2);
        int[] iArr = ActionBar.OLrzqt;
        switch (iArr[transactionType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                string = c55178xez.getContext().getString(C25493ixk.FragmentManager.KDccX);
                break;
            case 5:
                string = c55178xez.getContext().getString(C25493ixk.FragmentManager.HJWChPDXdlte);
                break;
            case 6:
                string = c55178xez.getContext().getString(C25493ixk.FragmentManager.DfrfUJ);
                break;
            case 7:
                string = c55178xez.getContext().getString(C25493ixk.FragmentManager.bindToGooglePlayService);
                break;
            case 8:
                string = c55178xez.getContext().getString(C25493ixk.FragmentManager.HJWChP);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        c55178xez.setTitleText(string);
        int i2 = 0;
        c55178xez.copydefault().setVisibility(0);
        TextView textViewCopydefault = c55178xez.copydefault();
        if (Intrinsics.EZpvd(taskDescription, InvestTransactionResultViewModel.ActionBar.StateListAnimator.copydefault)) {
            switch (iArr[transactionType.ordinal()]) {
                case 1:
                case 3:
                case 7:
                    TransactionConfig transactionConfigEjfBZ4 = ejfBZ();
                    if ((transactionConfigEjfBZ4 != null && transactionConfigEjfBZ4.zLjUOn()) || ((transactionConfigEjfBZ2 = ejfBZ()) != null && transactionConfigEjfBZ2.getNewProxyInstance())) {
                        string2 = c55178xez.getContext().getString(C25493ixk.FragmentManager.fXHmeK);
                    } else {
                        string2 = c55178xez.getContext().getString(C25493ixk.FragmentManager.zLAIeZ);
                    }
                    break;
                case 2:
                case 4:
                case 8:
                    TransactionConfig transactionConfigEjfBZ5 = ejfBZ();
                    if ((transactionConfigEjfBZ5 != null && transactionConfigEjfBZ5.zLjUOn()) || ((transactionConfigEjfBZ3 = ejfBZ()) != null && transactionConfigEjfBZ3.getNewProxyInstance())) {
                        string2 = c55178xez.getContext().getString(C25493ixk.FragmentManager.fXHmeK);
                    } else {
                        string2 = c55178xez.getContext().getString(C25493ixk.FragmentManager.RFmUsE);
                    }
                    break;
                case 5:
                case 6:
                    string2 = c55178xez.getContext().getString(C25493ixk.FragmentManager.onReceive);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (taskDescription instanceof InvestTransactionResultViewModel.ActionBar.C0340ActionBar) {
            switch (iArr[transactionType.ordinal()]) {
                case 1:
                case 3:
                case 7:
                    Context context = c55178xez.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    int i3 = C25493ixk.Application.OLrzqt;
                    InvestTransactionResultViewModel.ActionBar.C0340ActionBar c0340ActionBar = (InvestTransactionResultViewModel.ActionBar.C0340ActionBar) taskDescription;
                    int iAhwBna = C33129mqd.AhwBna(Long.valueOf(c0340ActionBar.copydefault()));
                    Context context2 = c55178xez.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    string2 = pTD.EZpvd(context, i3, iAhwBna, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", copydefault(context2, c0340ActionBar.copydefault()))));
                    break;
                case 2:
                case 4:
                    Context context3 = c55178xez.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    int i4 = C25493ixk.Application.OLrzqt;
                    InvestTransactionResultViewModel.ActionBar.C0340ActionBar c0340ActionBar2 = (InvestTransactionResultViewModel.ActionBar.C0340ActionBar) taskDescription;
                    int iAhwBna2 = C33129mqd.AhwBna(Long.valueOf(c0340ActionBar2.copydefault()));
                    Context context4 = c55178xez.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    string2 = pTD.EZpvd(context3, i4, iAhwBna2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", copydefault(context4, c0340ActionBar2.copydefault()))));
                    break;
                case 5:
                case 6:
                case 8:
                    Context context5 = c55178xez.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    int i5 = C25493ixk.Application.OLrzqt;
                    InvestTransactionResultViewModel.ActionBar.C0340ActionBar c0340ActionBar3 = (InvestTransactionResultViewModel.ActionBar.C0340ActionBar) taskDescription;
                    int iAhwBna3 = C33129mqd.AhwBna(Long.valueOf(c0340ActionBar3.copydefault()));
                    Context context6 = c55178xez.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    string2 = pTD.EZpvd(context5, i5, iAhwBna3, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", copydefault(context6, c0340ActionBar3.copydefault()))));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!Intrinsics.EZpvd(taskDescription, InvestTransactionResultViewModel.ActionBar.Activity.OLrzqt)) {
                throw new NoWhenBranchMatchedException();
            }
            TransactionConfig transactionConfigEjfBZ6 = ejfBZ();
            if ((transactionConfigEjfBZ6 != null && transactionConfigEjfBZ6.zLjUOn()) || ((transactionConfigEjfBZ = ejfBZ()) != null && transactionConfigEjfBZ.getNewProxyInstance())) {
                string2 = c55178xez.getContext().getString(C25493ixk.FragmentManager.fXHmeK);
            } else {
                string2 = c55178xez.getContext().getString(C25493ixk.FragmentManager.getSessionID);
            }
        }
        textViewCopydefault.setText(string2);
        switch (iArr[transactionType.ordinal()]) {
            case 1:
            case 3:
                c55178xez.OLrzqt().setVisibility(0);
                c55178xez.OLrzqt().setType(5);
                TransactionConfig transactionConfigEjfBZ7 = ejfBZ();
                if ((transactionConfigEjfBZ7 != null ? transactionConfigEjfBZ7.AYXKKw() : null) != InvestPageSource.SubscriptionCenter) {
                    TransactionConfig transactionConfigEjfBZ8 = ejfBZ();
                    if ((transactionConfigEjfBZ8 != null ? transactionConfigEjfBZ8.AYXKKw() : null) != InvestPageSource.Home) {
                        c55178xez.OLrzqt().setPrimaryText(c55178xez.getContext().getString(C25493ixk.FragmentManager.DWgRXt));
                    }
                    c52794wYpCopydefault = c55178xez.OLrzqt().copydefault();
                    if (c52794wYpCopydefault != null) {
                    }
                } else {
                    c55178xez.OLrzqt().setPrimaryText(c55178xez.getContext().getString(C25493ixk.FragmentManager.RJOkX));
                    c52794wYpCopydefault = c55178xez.OLrzqt().copydefault();
                    if (c52794wYpCopydefault != null) {
                        c52794wYpCopydefault.setOnClickListener(new Dialog(c52794wYpCopydefault, 1000L, this));
                    }
                    break;
                }
                break;
            case 2:
            case 4:
                c55178xez.OLrzqt().setVisibility(this.djBIcL ^ true ? 0 : 8);
                c55178xez.OLrzqt().setType(5);
                c55178xez.OLrzqt().setPrimaryText(c55178xez.getContext().getString(C25493ixk.FragmentManager.DWgRXt));
                C52794wYp c52794wYpCopydefault2 = c55178xez.OLrzqt().copydefault();
                if (c52794wYpCopydefault2 != null) {
                    c52794wYpCopydefault2.setOnClickListener(new Fragment(c52794wYpCopydefault2, 1000L, this));
                }
                break;
            case 5:
                c55178xez.OLrzqt().setVisibility(8);
                break;
            case 6:
            case 8:
                c55178xez.OLrzqt().setVisibility(this.djBIcL ^ true ? 0 : 8);
                c55178xez.OLrzqt().setType(5);
                c55178xez.OLrzqt().setPrimaryText(c55178xez.getContext().getString(C25493ixk.FragmentManager.FQNKFG));
                C52794wYp c52794wYpCopydefault3 = c55178xez.OLrzqt().copydefault();
                if (c52794wYpCopydefault3 != null) {
                    c52794wYpCopydefault3.setOnClickListener(new PendingIntent(c52794wYpCopydefault3, 1000L, this));
                }
                break;
            case 7:
                c55178xez.OLrzqt().setVisibility(0);
                c55178xez.OLrzqt().setType(5);
                c55178xez.OLrzqt().setPrimaryText(c55178xez.getContext().getString(C25493ixk.FragmentManager.iPSTqm));
                C52794wYp c52794wYpCopydefault4 = c55178xez.OLrzqt().copydefault();
                if (c52794wYpCopydefault4 != null) {
                    c52794wYpCopydefault4.setOnClickListener(new LoaderManager(c52794wYpCopydefault4, 1000L, this));
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        TextView textViewKWHzl = KWHzl(c55178xez);
        if (transactionType == InvestTransactionResultViewModel.TransactionType.DEPLOY && transactionType == InvestTransactionResultViewModel.TransactionType.MINT && transactionType == InvestTransactionResultViewModel.TransactionType.REPAY && transactionType == InvestTransactionResultViewModel.TransactionType.BORROW) {
            i2 = 8;
        }
        textViewKWHzl.setVisibility(i2);
        switch (iArr[transactionType.ordinal()]) {
            case 1:
                i = C25493ixk.FragmentManager.isReflectionWorking;
                break;
            case 2:
                i = C25493ixk.FragmentManager.hbZCHz;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                i = C25493ixk.FragmentManager.GiPPlLgiPPlL;
                break;
            case 8:
                i = C25493ixk.FragmentManager.unregister;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        textViewKWHzl.setText(i);
        if (transactionType == InvestTransactionResultViewModel.TransactionType.CLAIM) {
            ViewGroup.LayoutParams layoutParams = textViewKWHzl.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = C55298xhM.dpInt$default(20, (Context) null, 1, (Object) null);
                textViewKWHzl.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0245  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(o.C55178xez r17, com.okinc.business.invest_biz.ui.viewmodel.InvestTransactionResultViewModel.TransactionType r18, java.lang.Long r19, java.lang.Long r20, java.lang.String r21, java.lang.String r22) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            boolean r0 = r16.fetchVPNInfo()
            r1 = 4
            r2 = 1
            if (r0 == 0) goto Le
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            r8.setStatus(r0)
            int[] r0 = com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity.ActionBar.OLrzqt
            int r3 = r18.ordinal()
            r3 = r0[r3]
            r9 = 0
            switch(r3) {
                case 1: goto L52;
                case 2: goto L52;
                case 3: goto L52;
                case 4: goto L52;
                case 5: goto L45;
                case 6: goto L3a;
                case 7: goto L2f;
                case 8: goto L24;
                default: goto L1e;
            }
        L1e:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L24:
            android.content.Context r3 = r17.getContext()
            int r4 = o.C25493ixk.FragmentManager.zXhzOT
            java.lang.String r3 = r3.getString(r4)
            goto L4f
        L2f:
            android.content.Context r3 = r17.getContext()
            int r4 = o.C25493ixk.FragmentManager.getAdvertisingId
            java.lang.String r3 = r3.getString(r4)
            goto L4f
        L3a:
            android.content.Context r3 = r17.getContext()
            int r4 = o.C25493ixk.FragmentManager.XW
            java.lang.String r3 = r3.getString(r4)
            goto L4f
        L45:
            android.content.Context r3 = r17.getContext()
            int r4 = o.C25493ixk.FragmentManager.GqbzPL
            java.lang.String r3 = r3.getString(r4)
        L4f:
            r4 = r18
            goto L8d
        L52:
            com.okinc.business.invest_biz.ui.viewmodel.InvestTransactionResultViewModel$TransactionType r3 = com.okinc.business.invest_biz.ui.viewmodel.InvestTransactionResultViewModel.TransactionType.INVEST
            r4 = r18
            if (r4 != r3) goto L83
            com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig r3 = r16.ejfBZ()
            if (r3 == 0) goto L63
            com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource r3 = r3.AYXKKw()
            goto L64
        L63:
            r3 = r9
        L64:
            com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource r5 = com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource.SubscriptionCenter
            if (r3 == r5) goto L78
            com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig r3 = r16.ejfBZ()
            if (r3 == 0) goto L73
            com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource r3 = r3.AYXKKw()
            goto L74
        L73:
            r3 = r9
        L74:
            com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource r5 = com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource.Home
            if (r3 != r5) goto L83
        L78:
            android.content.Context r3 = r17.getContext()
            int r5 = o.C25493ixk.FragmentManager.QUSxYX
            java.lang.String r3 = r3.getString(r5)
            goto L8d
        L83:
            android.content.Context r3 = r17.getContext()
            int r5 = o.C25493ixk.FragmentManager.OBJEWx
            java.lang.String r3 = r3.getString(r5)
        L8d:
            r8.setTitleText(r3)
            r8.setSubTitleText(r9)
            o.wYF r3 = r17.OLrzqt()
            r5 = 0
            r3.setVisibility(r5)
            o.wYF r3 = r17.OLrzqt()
            r6 = 7
            r3.setType(r6)
            int r3 = r18.ordinal()
            r0 = r0[r3]
            r10 = 8
            r11 = 260(0x104, float:3.64E-43)
            r12 = 5
            r13 = 1000(0x3e8, double:4.94E-321)
            switch(r0) {
                case 1: goto L245;
                case 2: goto L1d9;
                case 3: goto L17a;
                case 4: goto L1d9;
                case 5: goto Lf3;
                case 6: goto Lb9;
                case 7: goto Lb9;
                case 8: goto Lb9;
                default: goto Lb3;
            }
        Lb3:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        Lb9:
            o.wYF r0 = r17.OLrzqt()
            boolean r1 = r7.djBIcL
            r1 = r1 ^ r2
            if (r1 == 0) goto Lc3
            goto Lc4
        Lc3:
            r5 = r10
        Lc4:
            r0.setVisibility(r5)
            o.wYF r0 = r17.OLrzqt()
            r0.setType(r12)
            o.wYF r0 = r17.OLrzqt()
            android.content.Context r1 = r17.getContext()
            int r2 = o.C25493ixk.FragmentManager.Dfv
            java.lang.String r1 = r1.getString(r2)
            r0.setPrimaryText(r1)
            o.wYF r0 = r17.OLrzqt()
            o.wYp r0 = r0.copydefault()
            if (r0 == 0) goto L343
            com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$ClipData r1 = new com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$ClipData
            r1.<init>(r0, r13, r7)
            r0.setOnClickListener(r1)
            goto L343
        Lf3:
            o.wYF r0 = r17.OLrzqt()
            boolean r1 = r16.isConnected()
            if (r1 == 0) goto L10f
            o.wYF r1 = r17.OLrzqt()
            r1.setType(r12)
            android.content.Context r1 = r17.getContext()
            int r2 = o.C25493ixk.FragmentManager.HJWChPOZOJIj
            java.lang.String r1 = r1.getString(r2)
            goto L119
        L10f:
            android.content.Context r1 = r17.getContext()
            int r2 = o.C25493ixk.FragmentManager.setLocationManually
            java.lang.String r1 = r1.getString(r2)
        L119:
            r0.setPrimaryText(r1)
            o.wYF r0 = r17.OLrzqt()
            o.wYp r9 = r0.copydefault()
            if (r9 == 0) goto L138
            com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$AssistContent r12 = new com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$AssistContent
            r2 = 1000(0x3e8, double:4.94E-321)
            r0 = r12
            r1 = r9
            r4 = r16
            r5 = r19
            r6 = r20
            r0.<init>(r1, r2, r4, r5, r6)
            r9.setOnClickListener(r12)
        L138:
            boolean r0 = r16.isConnected()
            if (r0 != 0) goto L343
            o.wYF r0 = r17.OLrzqt()
            android.content.Context r1 = r17.getContext()
            int r2 = o.C25493ixk.FragmentManager.GiPPlLQAswws
            java.lang.String r1 = r1.getString(r2)
            r0.setSecondaryText(r1)
            o.wYF r0 = r17.OLrzqt()
            o.wYp r0 = r0.AEQbTJ()
            if (r0 == 0) goto L15c
            r0.setOKDSType(r11)
        L15c:
            o.wYF r0 = r17.OLrzqt()
            o.wYp r9 = r0.AEQbTJ()
            if (r9 == 0) goto L343
            com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$PictureInPictureParams r11 = new com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$PictureInPictureParams
            r2 = 1000(0x3e8, double:4.94E-321)
            r0 = r11
            r1 = r9
            r4 = r16
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r4, r5, r6)
            r9.setOnClickListener(r11)
            goto L343
        L17a:
            o.wYF r0 = r17.OLrzqt()
            android.content.Context r1 = r17.getContext()
            int r2 = o.C25493ixk.FragmentManager.swzYdv
            java.lang.String r1 = r1.getString(r2)
            r0.setPrimaryText(r1)
            o.wYF r0 = r17.OLrzqt()
            o.wYp r9 = r0.copydefault()
            if (r9 == 0) goto L1a7
            com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$ComponentCallbacks2 r12 = new com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$ComponentCallbacks2
            r2 = 1000(0x3e8, double:4.94E-321)
            r0 = r12
            r1 = r9
            r4 = r16
            r5 = r19
            r6 = r20
            r0.<init>(r1, r2, r4, r5, r6)
            r9.setOnClickListener(r12)
        L1a7:
            o.wYF r0 = r17.OLrzqt()
            android.content.Context r1 = r17.getContext()
            int r2 = o.C25493ixk.FragmentManager.DWgRXt
            java.lang.String r1 = r1.getString(r2)
            r0.setSecondaryText(r1)
            o.wYF r0 = r17.OLrzqt()
            o.wYp r0 = r0.AEQbTJ()
            if (r0 == 0) goto L1c5
            r0.setOKDSType(r11)
        L1c5:
            o.wYF r0 = r17.OLrzqt()
            o.wYp r0 = r0.AEQbTJ()
            if (r0 == 0) goto L343
            com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$ComponentCallbacks r1 = new com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$ComponentCallbacks
            r1.<init>(r0, r13, r7)
            r0.setOnClickListener(r1)
            goto L343
        L1d9:
            o.wYF r0 = r17.OLrzqt()
            android.content.Context r1 = r17.getContext()
            int r2 = o.C25493ixk.FragmentManager.swzYdv
            java.lang.String r1 = r1.getString(r2)
            r0.setPrimaryText(r1)
            o.wYF r0 = r17.OLrzqt()
            o.wYp r9 = r0.copydefault()
            if (r9 == 0) goto L206
            com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$ComponentName r15 = new com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$ComponentName
            r2 = 1000(0x3e8, double:4.94E-321)
            r0 = r15
            r1 = r9
            r4 = r16
            r5 = r19
            r6 = r20
            r0.<init>(r1, r2, r4, r5, r6)
            r9.setOnClickListener(r15)
        L206:
            boolean r0 = r7.djBIcL
            if (r0 == 0) goto L213
            o.wYF r0 = r17.OLrzqt()
            r0.setType(r12)
            goto L343
        L213:
            o.wYF r0 = r17.OLrzqt()
            android.content.Context r1 = r17.getContext()
            int r2 = o.C25493ixk.FragmentManager.DWgRXt
            java.lang.String r1 = r1.getString(r2)
            r0.setSecondaryText(r1)
            o.wYF r0 = r17.OLrzqt()
            o.wYp r0 = r0.AEQbTJ()
            if (r0 == 0) goto L231
            r0.setOKDSType(r11)
        L231:
            o.wYF r0 = r17.OLrzqt()
            o.wYp r0 = r0.AEQbTJ()
            if (r0 == 0) goto L343
            com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$BroadcastReceiver r1 = new com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$BroadcastReceiver
            r1.<init>(r0, r13, r7)
            r0.setOnClickListener(r1)
            goto L343
        L245:
            com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig r0 = r16.ejfBZ()
            if (r0 == 0) goto L283
            java.lang.Boolean r0 = r0.hDKMBd()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.EZpvd(r0, r2)
            if (r0 == 0) goto L283
            o.wYF r0 = r17.OLrzqt()
            r0.setType(r12)
            o.wYF r0 = r17.OLrzqt()
            android.content.Context r1 = r17.getContext()
            int r2 = o.C25493ixk.FragmentManager.DXXBbs
            java.lang.String r1 = r1.getString(r2)
            r0.setPrimaryText(r1)
            o.wYF r0 = r17.OLrzqt()
            o.wYp r0 = r0.copydefault()
            if (r0 == 0) goto L343
            com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$FragmentManager r1 = new com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$FragmentManager
            r1.<init>(r0, r13, r7)
            r0.setOnClickListener(r1)
            goto L343
        L283:
            int r0 = r16.djBIcL()
            if (r0 != r1) goto L2b5
            o.wYF r0 = r17.OLrzqt()
            android.content.Context r1 = r17.getContext()
            int r2 = o.C25493ixk.FragmentManager.Hx
            java.lang.String r1 = r1.getString(r2)
            r0.setPrimaryText(r1)
            o.wYF r0 = r17.OLrzqt()
            o.wYp r6 = r0.copydefault()
            if (r6 == 0) goto L2e2
            com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$VoiceInteractor r12 = new com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$VoiceInteractor
            r2 = 1000(0x3e8, double:4.94E-321)
            r0 = r12
            r1 = r6
            r4 = r16
            r5 = r19
            r0.<init>(r1, r2, r4, r5)
            r6.setOnClickListener(r12)
            goto L2e2
        L2b5:
            o.wYF r0 = r17.OLrzqt()
            android.content.Context r1 = r17.getContext()
            int r2 = o.C25493ixk.FragmentManager.swzYdv
            java.lang.String r1 = r1.getString(r2)
            r0.setPrimaryText(r1)
            o.wYF r0 = r17.OLrzqt()
            o.wYp r12 = r0.copydefault()
            if (r12 == 0) goto L2e2
            com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$SharedElementCallback r15 = new com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$SharedElementCallback
            r2 = 1000(0x3e8, double:4.94E-321)
            r0 = r15
            r1 = r12
            r4 = r16
            r5 = r19
            r6 = r20
            r0.<init>(r1, r2, r4, r5, r6)
            r12.setOnClickListener(r15)
        L2e2:
            o.wYF r0 = r17.OLrzqt()
            o.wYp r0 = r0.AEQbTJ()
            if (r0 == 0) goto L2ef
            r0.setOKDSType(r11)
        L2ef:
            com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig r0 = r16.ejfBZ()
            if (r0 == 0) goto L2fa
            com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource r0 = r0.AYXKKw()
            goto L2fb
        L2fa:
            r0 = r9
        L2fb:
            com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource r1 = com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource.SubscriptionCenter
            if (r0 == r1) goto L320
            com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig r0 = r16.ejfBZ()
            if (r0 == 0) goto L309
            com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource r9 = r0.AYXKKw()
        L309:
            com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource r0 = com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource.Home
            if (r9 != r0) goto L30e
            goto L320
        L30e:
            o.wYF r0 = r17.OLrzqt()
            android.content.Context r1 = r17.getContext()
            int r2 = o.C25493ixk.FragmentManager.DWgRXt
            java.lang.String r1 = r1.getString(r2)
            r0.setSecondaryText(r1)
            goto L331
        L320:
            o.wYF r0 = r17.OLrzqt()
            android.content.Context r1 = r17.getContext()
            int r2 = o.C25493ixk.FragmentManager.RJOkX
            java.lang.String r1 = r1.getString(r2)
            r0.setSecondaryText(r1)
        L331:
            o.wYF r0 = r17.OLrzqt()
            o.wYp r0 = r0.AEQbTJ()
            if (r0 == 0) goto L343
            com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$TaskStackBuilder r1 = new com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity$TaskStackBuilder
            r1.<init>(r0, r13, r7)
            r0.setOnClickListener(r1)
        L343:
            android.view.View r0 = r17.EZpvd()
            if (r0 == 0) goto L34c
            r0.setVisibility(r10)
        L34c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.invest_biz.ui.page.InvestTransactionResultActivity.copydefault(o.xez, com.okinc.business.invest_biz.ui.viewmodel.InvestTransactionResultViewModel$TransactionType, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String):void");
    }

    public final void EZpvd(C55178xez c55178xez, InvestTransactionResultViewModel.TransactionType transactionType, String str, String str2) {
        String string;
        String string2;
        String string3;
        c55178xez.setStatus(fetchVPNInfo() ? 3 : 0);
        int[] iArr = ActionBar.OLrzqt;
        switch (iArr[transactionType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                string = c55178xez.getContext().getString(C25493ixk.FragmentManager.QHmsKR);
                break;
            case 5:
                string = c55178xez.getContext().getString(C25493ixk.FragmentManager.fZc);
                break;
            case 6:
                string = c55178xez.getContext().getString(C25493ixk.FragmentManager.DcMfJKsfEqpH);
                break;
            case 7:
                string = c55178xez.getContext().getString(C25493ixk.FragmentManager.DlABUU);
                break;
            case 8:
                string = c55178xez.getContext().getString(C25493ixk.FragmentManager.GcnicV);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        c55178xez.setTitleText(string);
        int i = iArr[transactionType.ordinal()];
        if (i == 1) {
            string2 = c55178xez.getContext().getString(C25493ixk.FragmentManager.dzCpvv);
        } else if (i == 2) {
            string2 = c55178xez.getContext().getString(C25493ixk.FragmentManager.QiTXOm);
        } else if (i == 5) {
            string2 = c55178xez.getContext().getString(C25493ixk.FragmentManager.Dff);
        } else {
            string2 = i != 6 ? "" : c55178xez.getContext().getString(C25493ixk.FragmentManager.OTwTPd);
        }
        c55178xez.setSubTitleText(string2);
        c55178xez.OLrzqt().setVisibility(0);
        c55178xez.OLrzqt().setType(5);
        wYF wyfOLrzqt = c55178xez.OLrzqt();
        switch (iArr[transactionType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                string3 = c55178xez.getContext().getString(C25493ixk.FragmentManager.YqksP);
                break;
            case 5:
                if (isConnected()) {
                    string3 = c55178xez.getContext().getString(C25493ixk.FragmentManager.AYXKKw);
                } else {
                    string3 = c55178xez.getContext().getString(C25493ixk.FragmentManager.zvzmfz);
                }
                break;
            case 6:
                string3 = c55178xez.getContext().getString(C25493ixk.FragmentManager.zvzmfz);
                break;
            case 7:
                string3 = c55178xez.getContext().getString(C25493ixk.FragmentManager.zvzmfz);
                break;
            case 8:
                string3 = c55178xez.getContext().getString(C25493ixk.FragmentManager.GGlJim);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        wyfOLrzqt.setPrimaryText(string3);
        C52794wYp c52794wYpCopydefault = c55178xez.OLrzqt().copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this, transactionType, str, str2));
        }
        View viewEZpvd = c55178xez.EZpvd();
        if (viewEZpvd != null) {
            viewEZpvd.setVisibility(8);
        }
    }

    public final void OLrzqt(String str, String str2) {
        if (str == null || str.length() == 0) {
            return;
        }
        C27508jwX.AEQbTJ.copydefault(this, str, str2, "txresult");
        finish();
    }

    public final void DbNXlk() {
        SPUtils.put("sp.key.txn_land", Boolean.TRUE);
        finish();
        C27508jwX.toInvestHomepage$default(C27508jwX.AEQbTJ, this, null, 1, null);
    }

    public final void OLrzqt(Long l, Long l2) {
        SPUtils.put("sp.key.txn_land", Boolean.TRUE);
        C27508jwX.AEQbTJ.EZpvd(this, new Function1() { // from class: o.iSD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestTransactionResultActivity.EZpvd(this.OLrzqt, (AbstractC43238rlX) obj);
            }
        });
    }

    public static final Unit EZpvd(InvestTransactionResultActivity investTransactionResultActivity, AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        if (investTransactionResultActivity.AkhnZx()) {
            investTransactionResultActivity.finish();
            return Unit.INSTANCE;
        }
        investTransactionResultActivity.finish();
        return Unit.INSTANCE;
    }

    public final void values() {
        SPUtils.put("sp.key.txn_land", Boolean.TRUE);
        finish();
    }

    public final void OLrzqt(long j) {
        C27508jwX.AEQbTJ.AEQbTJ(this, j, (14560 & 2) != 0, (14560 & 4) != 0 ? null : null, (14560 & 8) != 0 ? 0L : 0L, (14560 & 16) != 0 ? null : null, (14560 & 32) != 0 ? null : null, (14560 & 64) != 0 ? null : Integer.valueOf(fJNWhG()), (14560 & 128) != 0 ? null : null, 1, djBIcL(), (14560 & 1024) != 0 ? null : null, (14560 & 2048) != 0 ? null : null, (14560 & 4096) != 0 ? TransactionMethod.UNKNOWN : null, (14560 & 8192) != 0 ? false : false);
    }

    public final Spannable copydefault(Context context, long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(context, C25493ixk.Dialog.OLrzqt);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) String.valueOf(j));
        spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
        SpannableString spannableStringValueOf = SpannableString.valueOf(new SpannedString(spannableStringBuilder));
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        return spannableStringValueOf;
    }

    @Override // o.iPY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.iPY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.iPY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
