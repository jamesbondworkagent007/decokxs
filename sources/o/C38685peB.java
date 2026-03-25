package o;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.ui.KlineHeaderFragment$ensureBizInitialize$1;
import com.okinc.kline.ui.KlineHeaderFragment$initListener$1$2$2;
import com.okinc.kline.ui.KlineHeaderFragment$initTitleBar$1;
import com.okinc.kline.ui.KlineHeaderFragment$onResume$1;
import com.okinc.kline.ui.KlineHeaderFragment$setSearchFragment$2$2$1;
import com.okinc.kline.ui.KlineHeaderFragment$setSwipingTitleAdapter$4$1$1;
import com.okinc.kline.ui.KlineHeaderFragment$subscribeOnUiChange$1;
import com.okinc.kline.ui.KlineHeaderFragment$subscribeOnUiChange$2;
import com.okinc.kline.ui.KlineHeaderFragment$subscribeOnUiChange$3;
import com.okinc.kline.ui.KlineHeaderFragment$subscribeWatchList$1;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.kline.ui.view.model.ViceInfo;
import com.okinc.kline.ui.viewmodel.KlineHeaderViewModel;
import com.okinc.kline.ui.viewmodel.KlineTimeAnchorViewModel;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unified.BusinessType;
import com.okinc.unified.shared.CeDeFiSharedViewModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.unify_trade.biz.CoinInfo;
import com.okinc.unify_trade.biz.DeriConfigData;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o.C35964oKf;
import o.C35966oKh;
import o.C52761wXj;
import o.InterfaceC48910ueb;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.oZI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.peB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38685peB extends AbstractC38559pbi {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public long AYXKKw;
    public boolean AhwBna;
    public final InterfaceC56387yDm AubY;
    public boolean DbNXlk;
    public boolean ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public float fJNWhG;
    public java.lang.Float fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final float getFieldNames;
    public android.view.View hDKMBd;
    public boolean isConnected;
    public final InterfaceC56387yDm iwGUEr;
    public C38353pVq uzCIH;
    public oOS valueOf;
    public boolean values;
    public final float wlaJM;
    public final int AuCTel = C35964oKf.Application.gwwfep;
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.peY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C38685peB.wlaJM(this.KWHzl);
        }
    });
    public java.util.List<pWP> fIwbmz = yDY.AhwBna();
    public kotlin.Pair<java.lang.Boolean, ViceInfo> getNewProxyInstance = new kotlin.Pair<>(java.lang.Boolean.FALSE, new ViceInfo(null, 0, null, 0, 15, null));

    /* JADX INFO: renamed from: o.peB$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.CeDeFi.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BusinessType.CeFi.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AuCTel;
    }

    /* JADX INFO: renamed from: o.peB$Activity */
    public static final class Activity implements View.OnLayoutChangeListener {
        public final /* synthetic */ android.widget.TextView AEQbTJ;

        public Activity(android.widget.TextView textView) {
            this.AEQbTJ = textView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            if (this.AEQbTJ.getPaint().measureText(this.AEQbTJ.getText().toString()) > this.AEQbTJ.getWidth()) {
                this.AEQbTJ.setTextSize(10.0f);
                this.AEQbTJ.setMaxLines(2);
            }
        }
    }

    /* JADX INFO: renamed from: o.peB$TaskStackBuilder */
    public static final class TaskStackBuilder implements View.OnLayoutChangeListener {
        public TaskStackBuilder() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            C38353pVq c38353pVq = C38685peB.this.uzCIH;
            if (c38353pVq == null) {
                Intrinsics.gEmmrt("");
                c38353pVq = null;
            }
            c38353pVq.valueOf();
        }
    }

    public C38685peB() {
        final Function0 function0 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(KlineHeaderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.KlineHeaderFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.KlineHeaderFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.KlineHeaderFragment$special$$inlined$activityViewModels$default$3
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
        this.iwGUEr = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CeDeFiSharedViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.KlineHeaderFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.KlineHeaderFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.KlineHeaderFragment$special$$inlined$activityViewModels$default$6
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
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCT.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.KlineHeaderFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.KlineHeaderFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.KlineHeaderFragment$special$$inlined$activityViewModels$default$9
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
        float fEZpvd = C33070mpX.EZpvd(C35964oKf.ActionBar.AEQbTJ);
        this.wlaJM = fEZpvd;
        this.getFieldNames = 0.4f;
        this.AhwBna = true;
        this.fJNWhG = fEZpvd;
        this.fetchVPNInfo = java.lang.Float.valueOf(0.0f);
        this.AubY = C56392yDr.copydefault(new Function0() { // from class: o.peW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38685peB.AYXKKw();
            }
        });
        this.AYXKKw = 150L;
    }

    /* JADX INFO: renamed from: o.peB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.peB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C38685peB newInstance$default(StateListAnimator stateListAnimator, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return stateListAnimator.EZpvd(z);
        }

        public final C38685peB EZpvd(boolean z) {
            C38685peB c38685peB = new C38685peB();
            c38685peB.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("is_CR_Mode", java.lang.Boolean.valueOf(z))));
            return c38685peB;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KlineHeaderViewModel DTwDnp() {
        return (KlineHeaderViewModel) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CeDeFiSharedViewModel QUSxYX() {
        return (CeDeFiSharedViewModel) this.iwGUEr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pCT RJOkX() {
        return (pCT) this.fARcdN.getValue();
    }

    private final InterfaceC56387yDm<KlineTimeAnchorViewModel> OcIXYQ() {
        return (InterfaceC56387yDm) this.AkhnZx.getValue();
    }

    public static final android.animation.ValueAnimator AYXKKw() {
        return android.animation.ValueAnimator.ofFloat(0.1f, 1.0f);
    }

    public final android.animation.ValueAnimator ejfBZ() {
        return (android.animation.ValueAnimator) this.AubY.getValue();
    }

    public final InterfaceC39499ptW gEmmrt() {
        ActivityC38834pgs activityC38834pgsFIwbmz = fIwbmz();
        androidx.fragment.app.Fragment fragmentAYXKKw = activityC38834pgsFIwbmz != null ? activityC38834pgsFIwbmz.AYXKKw() : null;
        if (fragmentAYXKKw instanceof InterfaceC39499ptW) {
            return (InterfaceC39499ptW) fragmentAYXKKw;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String QKVWgx() {
        return QUSxYX().KWHzl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String ORxRYg() {
        return QUSxYX().copydefault();
    }

    public final java.lang.String AkhnZx() {
        TokenBase tokenBaseValueOf = QUSxYX().valueOf();
        if (tokenBaseValueOf != null) {
            return tokenBaseValueOf.getChainId();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String QbewEr() {
        TokenBase tokenBaseValueOf = QUSxYX().valueOf();
        if (tokenBaseValueOf != null) {
            return tokenBaseValueOf.getTokenContractAddress();
        }
        return null;
    }

    private final BizInstrument QOLQEE() {
        BizInstrument minSuggestedInstrument$default;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        if (interfaceC54581xNrCopydefault != null && (minSuggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, ORxRYg(), QKVWgx(), null, null, 12, null)) != null) {
            return minSuggestedInstrument$default;
        }
        AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(ORxRYg());
        if (abstractC54531xLwKWHzl != null) {
            return abstractC54531xLwKWHzl.valueOf(QKVWgx());
        }
        return null;
    }

    public final BusinessType AhwBna() {
        BusinessType second = QUSxYX().AEQbTJ().getValue().getSecond();
        return second == null ? BusinessType.CeFi : second;
    }

    public final ActivityC38834pgs fIwbmz() {
        FragmentActivity activity = getActivity();
        if (activity instanceof ActivityC38834pgs) {
            return (ActivityC38834pgs) activity;
        }
        return null;
    }

    /* JADX INFO: renamed from: o.peB$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C38685peB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C38685peB c38685peB) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c38685peB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            android.widget.ImageView imageView;
            android.widget.ImageView imageView2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                WatchListData watchListDataAuCTel = this.copydefault.AuCTel();
                this.copydefault.showLoading();
                oOS oos = this.copydefault.valueOf;
                if (oos == null || (imageView2 = oos.AYXKKw) == null || !imageView2.isSelected()) {
                    this.copydefault.DTwDnp().EZpvd(watchListDataAuCTel);
                } else {
                    this.copydefault.DTwDnp().copydefault(watchListDataAuCTel);
                }
                if (this.copydefault.AhwBna() == BusinessType.CeFi) {
                    oOS oos2 = this.copydefault.valueOf;
                    if (oos2 == null || (imageView = oos2.AYXKKw) == null || imageView.isSelected()) {
                        return;
                    }
                    C32866mlf.onEvent$default("KLine_Full_Button_Click", (TrackChannel[]) null, LoaderManager.EZpvd, 1, (java.lang.Object) null);
                    return;
                }
                this.copydefault.DTwDnp().EZpvd().setValue(java.lang.Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: o.peB$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C38685peB KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C38685peB c38685peB) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c38685peB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.zsXlph();
                this.KWHzl.DTwDnp().KWHzl().setValue(java.lang.Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: o.peB$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C38685peB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C38685peB c38685peB) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c38685peB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                InterfaceC39499ptW interfaceC39499ptWGEmmrt = this.copydefault.gEmmrt();
                if (interfaceC39499ptWGEmmrt != null) {
                    interfaceC39499ptWGEmmrt.OLrzqt(0);
                }
                if (this.copydefault.AhwBna() != BusinessType.CeFi) {
                    this.copydefault.DTwDnp().OLrzqt().setValue(java.lang.Boolean.TRUE);
                } else {
                    C32866mlf.onEvent$default("KLine_Full_Button_Click", (TrackChannel[]) null, FragmentManager.copydefault, 1, (java.lang.Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.peB$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C38685peB OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C38685peB c38685peB) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c38685peB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (!this.OLrzqt.DTwDnp().AhwBna() || this.OLrzqt.ejfBZ) {
                    return;
                }
                this.OLrzqt.zsXlph();
                C32866mlf.onEvent$default("KLine_Full_Button_Click", (TrackChannel[]) null, PendingIntent.copydefault, 1, (java.lang.Object) null);
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.valueOf = oOS.AEQbTJ(view);
        QVAiDq();
        QfsBiF();
        uzCIH();
        zLjUOn();
        gHZMYf();
        oOS oos = this.valueOf;
        if (oos != null) {
            copydefault(oos);
        }
        dNCPSb();
        aKErDB();
        view.post(new java.lang.Runnable() { // from class: o.peV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C38685peB.zsXlph(this.KWHzl);
            }
        });
    }

    public static final void zsXlph(C38685peB c38685peB) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c38685peB, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KlineHeaderFragment$onResume$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Function0<Unit> function0, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        KlineHeaderFragment$ensureBizInitialize$1 klineHeaderFragment$ensureBizInitialize$1;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        C38685peB c38685peB;
        java.lang.String instrumentType;
        if (continuation instanceof KlineHeaderFragment$ensureBizInitialize$1) {
            klineHeaderFragment$ensureBizInitialize$1 = (KlineHeaderFragment$ensureBizInitialize$1) continuation;
            int i = klineHeaderFragment$ensureBizInitialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                klineHeaderFragment$ensureBizInitialize$1.label = i - Integer.MIN_VALUE;
            } else {
                klineHeaderFragment$ensureBizInitialize$1 = new KlineHeaderFragment$ensureBizInitialize$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = klineHeaderFragment$ensureBizInitialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = klineHeaderFragment$ensureBizInitialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (AhwBna() == BusinessType.CeDeFi) {
                function0.invoke();
                return Unit.INSTANCE;
            }
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            klineHeaderFragment$ensureBizInitialize$1.L$0 = this;
            klineHeaderFragment$ensureBizInitialize$1.L$1 = function0;
            klineHeaderFragment$ensureBizInitialize$1.label = 1;
            objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, klineHeaderFragment$ensureBizInitialize$1, 3, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
            c38685peB = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) klineHeaderFragment$ensureBizInitialize$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                function0.invoke();
                return Unit.INSTANCE;
            }
            function0 = (Function0) klineHeaderFragment$ensureBizInitialize$1.L$1;
            c38685peB = (C38685peB) klineHeaderFragment$ensureBizInitialize$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            objM8790ensureInitialize0E7RQCE$default = ((Result) objEZpvd).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM8790ensureInitialize0E7RQCE$default)) {
            objM8790ensureInitialize0E7RQCE$default = null;
        }
        InterfaceC54581xNr interfaceC54581xNr = (InterfaceC54581xNr) objM8790ensureInitialize0E7RQCE$default;
        if (interfaceC54581xNr != null) {
            MarketCoinInfo marketCoinInfoDjBIcL = c38685peB.QUSxYX().djBIcL();
            if (marketCoinInfoDjBIcL == null || (instrumentType = marketCoinInfoDjBIcL.getInstrumentType()) == null) {
                instrumentType = "";
            }
            klineHeaderFragment$ensureBizInitialize$1.L$0 = function0;
            klineHeaderFragment$ensureBizInitialize$1.L$1 = null;
            klineHeaderFragment$ensureBizInitialize$1.label = 2;
            objEZpvd = interfaceC54581xNr.EZpvd(instrumentType, klineHeaderFragment$ensureBizInitialize$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    private final void dNCPSb() {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.setFragmentResultListener("switch_full_screen", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.peI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C38685peB.AEQbTJ(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final void AEQbTJ(C38685peB c38685peB, java.lang.String str, android.os.Bundle bundle) {
        ConstraintLayout constraintLayoutOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        boolean z = bundle.getBoolean("kline_full_screen");
        oOS oos = c38685peB.valueOf;
        if (oos == null || (constraintLayoutOLrzqt = oos.getRoot()) == null) {
            return;
        }
        constraintLayoutOLrzqt.postDelayed(c38685peB.new AssistContent(z), 200L);
    }

    private final void aKErDB() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KlineHeaderFragment$subscribeOnUiChange$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KlineHeaderFragment$subscribeOnUiChange$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KlineHeaderFragment$subscribeOnUiChange$3(this, null), 3, null);
    }

    public final void AxsJAY() {
        if (this.DbNXlk) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KlineHeaderFragment$subscribeWatchList$1(this, null), 3, null);
        this.DbNXlk = true;
    }

    public final void OLrzqt(oOS oos, BusinessType businessType) {
        boolean z = businessType != BusinessType.CeDeFi;
        if (this.AhwBna) {
            RecyclerView recyclerView = oos.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(z ? 0 : 8);
        } else {
            Group group = oos.copydefault;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(z ? 0 : 8);
        }
        mUA mua = oos.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(mua, "");
        mua.setVisibility(z ^ true ? 0 : 8);
    }

    private final void QVAiDq() {
        android.os.Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null && arguments.getBoolean("is_CR_Mode", false)) {
            z = true;
        }
        this.ejfBZ = z;
        MarketCoinInfo marketCoinInfoDjBIcL = QUSxYX().djBIcL();
        if (marketCoinInfoDjBIcL != null) {
            DTwDnp().AEQbTJ(marketCoinInfoDjBIcL);
        }
    }

    public final WatchListData AuCTel() {
        java.lang.String tokenContractAddress;
        java.lang.String chainId;
        if (AhwBna() == BusinessType.CeFi) {
            BizInstrument bizInstrumentQOLQEE = QOLQEE();
            if (bizInstrumentQOLQEE != null) {
                xUV xuv = xUV.EZpvd;
                java.lang.String strGEmmrt = gEmmrt(xuv.OLrzqt(bizInstrumentQOLQEE));
                java.lang.String strKWHzl = xuv.KWHzl(bizInstrumentQOLQEE);
                java.lang.String strCopydefault = xuv.copydefault(bizInstrumentQOLQEE);
                java.lang.String str = strCopydefault == null ? "" : strCopydefault;
                java.lang.String strAEQbTJ = xuv.AEQbTJ(bizInstrumentQOLQEE);
                return new WatchListData(str, strAEQbTJ == null ? "" : strAEQbTJ, strKWHzl, strGEmmrt, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null);
            }
            return new WatchListData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 255, (DefaultConstructorMarker) null);
        }
        TokenBase tokenBaseValueOf = QUSxYX().valueOf();
        java.lang.String str2 = (tokenBaseValueOf == null || (chainId = tokenBaseValueOf.getChainId()) == null) ? "" : chainId;
        TokenBase tokenBaseValueOf2 = QUSxYX().valueOf();
        return new WatchListData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, "CEDEFI", str2, (tokenBaseValueOf2 == null || (tokenContractAddress = tokenBaseValueOf2.getTokenContractAddress()) == null) ? "" : tokenContractAddress, (java.lang.String) null, (java.lang.String) null, 199, (DefaultConstructorMarker) null);
    }

    private final java.lang.String gEmmrt(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN") ? "SPOT" : str;
    }

    public final void uzCIH() {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        oOS oos = this.valueOf;
        if (oos != null && (imageView2 = oos.djBIcL) != null) {
            imageView2.setVisibility(DTwDnp().AhwBna() ? 0 : 8);
        }
        oOS oos2 = this.valueOf;
        if (oos2 == null || (imageView = oos2.values) == null) {
            return;
        }
        imageView.setVisibility(DTwDnp().AhwBna() ? 0 : 8);
    }

    public final void copydefault(final oOS oos) {
        if (AhwBna() == BusinessType.CeDeFi) {
            return;
        }
        RecyclerView recyclerView = oos.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(8);
        Group group = oos.copydefault;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
        EZpvd(C48914uef.getTitleByIdAndType$default(C48914uef.EZpvd, QKVWgx(), ORxRYg(), false, false, null, true, false, 92, null));
        AwvSrB();
        ejfBZ().setDuration(this.AYXKKw);
        ejfBZ().setInterpolator(new android.view.animation.LinearInterpolator());
        ejfBZ().addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.peG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C38685peB.OLrzqt(this.KWHzl, oos, valueAnimator);
            }
        });
    }

    public static final void OLrzqt(C38685peB c38685peB, oOS oos, android.animation.ValueAnimator valueAnimator) {
        float fFloatValue;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        float fFloatValue2 = 0.0f;
        if (c38685peB.values) {
            float f = c38685peB.fJNWhG;
            java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.copydefault(animatedValue, "");
            fFloatValue = f - (((java.lang.Float) animatedValue).floatValue() * f);
            java.lang.Float f2 = c38685peB.fetchVPNInfo;
            if (f2 != null) {
                float fFloatValue3 = f2.floatValue();
                java.lang.Object animatedValue2 = valueAnimator.getAnimatedValue();
                Intrinsics.copydefault(animatedValue2, "");
                fFloatValue2 = fFloatValue3 + ((java.lang.Float) animatedValue2).floatValue();
            }
        } else {
            float f3 = c38685peB.fJNWhG;
            java.lang.Object animatedValue3 = valueAnimator.getAnimatedValue();
            Intrinsics.copydefault(animatedValue3, "");
            fFloatValue = f3 * ((java.lang.Float) animatedValue3).floatValue();
            java.lang.Float f4 = c38685peB.fetchVPNInfo;
            if (f4 != null) {
                float fFloatValue4 = f4.floatValue();
                float f5 = 1;
                java.lang.Object animatedValue4 = valueAnimator.getAnimatedValue();
                Intrinsics.copydefault(animatedValue4, "");
                fFloatValue2 = f5 - ((f5 - fFloatValue4) * ((java.lang.Float) animatedValue4).floatValue());
            }
        }
        oos.valueOf.setTranslationY(fFloatValue);
        oos.gEmmrt.setTranslationY(fFloatValue);
        oos.gEmmrt.setAlpha(fFloatValue2);
        oos.fetchVPNInfo.setTranslationY(fFloatValue);
        oZI.Application applicationDjBIcL = c38685peB.djBIcL();
        if (applicationDjBIcL != null) {
            oZI.Application.updateViceAlpha$default(applicationDjBIcL, fFloatValue2, false, 2, null);
        }
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        Intrinsics.checkNotNullParameter(str, "");
        if (this.ejfBZ) {
            oOS oos = this.valueOf;
            if (oos != null && (textView4 = oos.isConnected) != null) {
                textView4.setTextSize(pFS.KWHzl.EZpvd(str.length()));
            }
            oOS oos2 = this.valueOf;
            if (oos2 == null || (textView3 = oos2.isConnected) == null) {
                return;
            }
            textView3.setText(str);
            return;
        }
        oOS oos3 = this.valueOf;
        if (oos3 != null && (textView2 = oos3.AkhnZx) != null) {
            textView2.setTextSize(pFS.KWHzl.EZpvd(str.length()));
        }
        oOS oos4 = this.valueOf;
        if (oos4 != null && (textView = oos4.AkhnZx) != null) {
            textView.setText(str);
        }
        C36246oUr.copydefault().isConnected(str);
        zuBGHE();
    }

    private final void zuBGHE() {
        android.widget.TextView textView;
        BizInstrument bizInstrumentQOLQEE;
        oOS oos = this.valueOf;
        if (oos == null || (textView = oos.AkhnZx) == null || (bizInstrumentQOLQEE = QOLQEE()) == null || !bizInstrumentQOLQEE.isPreMarketPair()) {
            return;
        }
        if (!ViewCompat.isLaidOut(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new Activity(textView));
        } else if (textView.getPaint().measureText(textView.getText().toString()) > textView.getWidth()) {
            textView.setTextSize(10.0f);
            textView.setMaxLines(2);
        }
    }

    private final void QfsBiF() {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.LinearLayout linearLayout;
        android.widget.ImageView imageView3;
        C57585ylG c57585ylG;
        oOS oos = this.valueOf;
        if (oos != null && (c57585ylG = oos.AuCTel) != null) {
            java.lang.String string = getString(C35964oKf.Fragment.fHqPtx);
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String string2 = getString(C35964oKf.Fragment.gGvvIC);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c57585ylG.setText(string, string2);
            c57585ylG.setUserIconClick(new Function0() { // from class: o.pfa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C38685peB.zLjUOn(this.AEQbTJ);
                }
            });
            c57585ylG.setOnRealChangeClick(new Function0() { // from class: o.pfd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C38685peB.AubY(this.KWHzl);
                }
            });
        }
        oOS oos2 = this.valueOf;
        if (oos2 != null && (imageView3 = oos2.AhwBna) != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: o.peZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C38685peB.OLrzqt(this.OLrzqt, view);
                }
            });
        }
        oOS oos3 = this.valueOf;
        if (oos3 != null && (linearLayout = oos3.valueOf) != null) {
            linearLayout.setOnClickListener(new TaskDescription(linearLayout, 1000L, this));
        }
        oOS oos4 = this.valueOf;
        if (oos4 != null && (imageView2 = oos4.AYXKKw) != null) {
            imageView2.setOnClickListener(new Application(imageView2, 1000L, this));
        }
        oOS oos5 = this.valueOf;
        if (oos5 != null && (imageView = oos5.djBIcL) != null) {
            imageView.setOnClickListener(new Fragment(imageView, 1000L, this));
        }
        mUA muaIsConnected = isConnected();
        if (muaIsConnected != null) {
            muaIsConnected.setOnClickListener(new Dialog(muaIsConnected, 1000L, this));
        }
    }

    public static final Unit zLjUOn(C38685peB c38685peB) {
        C32866mlf.onEvent$default("app_demo_trading_header_user_center_click", (TrackChannel[]) null, new Function1() { // from class: o.peH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38685peB.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        ActivityC38834pgs activityC38834pgsFIwbmz = c38685peB.fIwbmz();
        ActivityC38834pgs activityC38834pgs = activityC38834pgsFIwbmz instanceof android.app.Activity ? activityC38834pgsFIwbmz : null;
        if (activityC38834pgs == null) {
            return Unit.INSTANCE;
        }
        InterfaceC35160nqA interfaceC35160nqA = (InterfaceC35160nqA) C43251rlk.OLrzqt(InterfaceC35160nqA.class);
        if (interfaceC35160nqA != null) {
            interfaceC35160nqA.KWHzl(activityC38834pgs);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", "home", false);
        return Unit.INSTANCE;
    }

    public static final Unit AubY(C38685peB c38685peB) {
        C32866mlf.onEvent$default("app_demo_trading_header_switch_mode_click", (TrackChannel[]) null, new Function1() { // from class: o.peN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38685peB.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        c38685peB.showLoading();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c38685peB), null, null, new KlineHeaderFragment$initListener$1$2$2(c38685peB, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", "home", false);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(final C38685peB c38685peB, android.view.View view) {
        if (pFP.isUserInDemoTrading$default(pFP.OLrzqt, null, 1, null)) {
            C32866mlf.onEvent$default("app_demo_trading_chart_button_click", (TrackChannel[]) null, new Function1() { // from class: o.peT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38685peB.OLrzqt(this.KWHzl, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        FragmentActivity activity = c38685peB.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final Unit OLrzqt(C38685peB c38685peB, EventParamsList eventParamsList) {
        java.lang.String strDjBIcL;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(BotWebHook.KEY_ACTION, "back", false);
        InterfaceC39499ptW interfaceC39499ptWGEmmrt = c38685peB.gEmmrt();
        if (interfaceC39499ptWGEmmrt != null && (strDjBIcL = interfaceC39499ptWGEmmrt.djBIcL()) != null) {
            str = strDjBIcL;
        }
        eventParamsList.put("type", str, false);
        eventParamsList.put("pair", c38685peB.QKVWgx(), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.peB$PendingIntent */
    public static final class PendingIntent implements Function1<EventParamsList, Unit> {
        public static final PendingIntent copydefault = new PendingIntent();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("nav_entry", "nav_entry", true);
            eventParamsList.put("chart_layout", "classic", true);
        }
    }

    /* JADX INFO: renamed from: o.peB$AssistContent */
    public static final class AssistContent implements java.lang.Runnable {
        public final /* synthetic */ boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(boolean z) {
            this.OLrzqt = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C38685peB.this.OLrzqt(this.OLrzqt);
        }
    }

    /* JADX INFO: renamed from: o.peB$LoaderManager */
    public static final class LoaderManager implements Function1<EventParamsList, Unit> {
        public static final LoaderManager EZpvd = new LoaderManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("top_icon_type", "favourite", true);
            eventParamsList.put("chart_layout", "classic", true);
        }
    }

    /* JADX INFO: renamed from: o.peB$FragmentManager */
    public static final class FragmentManager implements Function1<EventParamsList, Unit> {
        public static final FragmentManager copydefault = new FragmentManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("top_icon_type", "share", true);
            eventParamsList.put("chart_layout", "classic", true);
        }
    }

    public final void zLjUOn() {
        android.widget.ImageView imageView;
        C57585ylG c57585ylG;
        C57585ylG c57585ylG2;
        android.widget.ImageView imageView2;
        if (this.ejfBZ) {
            return;
        }
        if (pFP.isUserInDemoTrading$default(pFP.OLrzqt, null, 1, null)) {
            oOS oos = this.valueOf;
            if (oos != null && (imageView2 = oos.AYXKKw) != null) {
                imageView2.setVisibility(8);
            }
            oOS oos2 = this.valueOf;
            if (oos2 == null || (c57585ylG2 = oos2.AuCTel) == null) {
                return;
            }
            c57585ylG2.setVisibility(0);
            return;
        }
        oOS oos3 = this.valueOf;
        if (oos3 != null && (c57585ylG = oos3.AuCTel) != null) {
            c57585ylG.setVisibility(8);
        }
        oOS oos4 = this.valueOf;
        if (oos4 == null || (imageView = oos4.AYXKKw) == null) {
            return;
        }
        imageView.setVisibility((DTwDnp().AhwBna() && getNewProxyInstance()) ? 0 : 8);
    }

    public final void copydefault(java.lang.String str) {
        android.widget.TextView textView;
        oOS oos = this.valueOf;
        if (oos == null || (textView = oos.AkhnZx) == null) {
            return;
        }
        textView.setText(C48914uef.getTitleByIdAndType$default(C48914uef.EZpvd, str, ORxRYg(), false, false, null, false, false, 124, null));
    }

    public final void EZpvd(boolean z) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.ImageView imageView3;
        if (isAdded() && !this.ejfBZ) {
            if (pFP.isUserInDemoTrading$default(pFP.OLrzqt, null, 1, null)) {
                oOS oos = this.valueOf;
                if (oos != null && (imageView3 = oos.AYXKKw) != null) {
                    imageView3.setVisibility(8);
                }
            } else {
                oOS oos2 = this.valueOf;
                if (oos2 != null && (imageView = oos2.AYXKKw) != null) {
                    imageView.setVisibility(DTwDnp().AhwBna() ? 0 : 8);
                }
            }
            oOS oos3 = this.valueOf;
            if (oos3 != null && (imageView2 = oos3.AYXKKw) != null) {
                imageView2.setSelected(z);
            }
            RJOkX().KWHzl(z);
            hDKMBd();
        }
    }

    public final void sSMYrx() {
        android.widget.ImageView imageView;
        oOS oos = this.valueOf;
        if (oos == null || (imageView = oos.djBIcL) == null) {
            return;
        }
        imageView.setVisibility(DTwDnp().AhwBna() ? 0 : 8);
    }

    public final android.animation.ValueAnimator fJNWhG() {
        return ejfBZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AwvSrB() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        AppCompatTextView appCompatTextView;
        android.widget.TextView textView6;
        android.widget.TextView textView7;
        android.widget.TextView textView8;
        android.widget.TextView textView9;
        BizInstrument bizInstrumentQOLQEE = QOLQEE();
        int iCopydefault = Intrinsics.EZpvd((java.lang.Object) (bizInstrumentQOLQEE != null ? bizInstrumentQOLQEE.getInstType() : null), (java.lang.Object) "SWAP") ? C33070mpX.copydefault(C52761wXj.Activity.invokespecialhOMIpD) : C33070mpX.copydefault(C52761wXj.Activity.Dmq);
        BizInstrument bizInstrumentQOLQEE2 = QOLQEE();
        int iCopydefault2 = Intrinsics.EZpvd((java.lang.Object) (bizInstrumentQOLQEE2 != null ? bizInstrumentQOLQEE2.getInstType() : null), (java.lang.Object) "SWAP") ? C33070mpX.copydefault(C35964oKf.TaskDescription.AEQbTJ) : C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC);
        oOS oos = this.valueOf;
        if (oos != null && (textView9 = oos.DbNXlk) != null) {
            textView9.setTextColor(iCopydefault);
        }
        oOS oos2 = this.valueOf;
        if (oos2 != null && (textView8 = oos2.DbNXlk) != null) {
            textView8.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iCopydefault2));
        }
        BizInstrument bizInstrumentQOLQEE3 = QOLQEE();
        if (bizInstrumentQOLQEE3 != null && bizInstrumentQOLQEE3.isPreMarketPair()) {
            BizInstrument bizInstrumentQOLQEE4 = QOLQEE();
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrumentQOLQEE4 != null ? bizInstrumentQOLQEE4.getInstType() : null), (java.lang.Object) "FUTURES")) {
                oOS oos3 = this.valueOf;
                if (oos3 != null && (textView7 = oos3.DbNXlk) != null) {
                    textView7.setVisibility(0);
                }
                oOS oos4 = this.valueOf;
                if (oos4 != null && (textView6 = oos4.DbNXlk) != null) {
                    textView6.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.onStatusChanged));
                }
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) ORxRYg(), (java.lang.Object) "SWAP")) {
            oOS oos5 = this.valueOf;
            if (oos5 != null && (textView5 = oos5.DbNXlk) != null) {
                textView5.setVisibility(0);
            }
            oOS oos6 = this.valueOf;
            if (oos6 != null && (textView4 = oos6.DbNXlk) != null) {
                textView4.setText(C33070mpX.AYXKKw(C35966oKh.TaskDescription.KWHzl));
            }
        } else {
            java.lang.String strValues = values();
            if (strValues == null || strValues.length() == 0 || !C55608xnE.EZpvd()) {
                oOS oos7 = this.valueOf;
                if (oos7 != null && (textView = oos7.DbNXlk) != null) {
                    textView.setVisibility(8);
                }
            } else {
                oOS oos8 = this.valueOf;
                if (oos8 != null && (textView3 = oos8.DbNXlk) != null) {
                    textView3.setVisibility(0);
                }
                oOS oos9 = this.valueOf;
                if (oos9 != null && (textView2 = oos9.DbNXlk) != null) {
                    textView2.setText(values() + "x");
                }
            }
        }
        oOS oos10 = this.valueOf;
        if (oos10 == null || (appCompatTextView = oos10.ejfBZ) == null) {
            return;
        }
        BizInstrument bizInstrumentQOLQEE5 = QOLQEE();
        appCompatTextView.setVisibility(Intrinsics.EZpvd((java.lang.Object) (bizInstrumentQOLQEE5 != null ? bizInstrumentQOLQEE5.getInstType() : null), (java.lang.Object) "SPOT") ? 0 : 8);
    }

    public final java.lang.String values() {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        AbstractC54531xLw abstractC54531xLwDjBIcL;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        BizInstrument bizInstrumentValueOf = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrCopydefault = interfaceC54577xNn.copydefault()) == null || (abstractC54531xLwDjBIcL = interfaceC54581xNrCopydefault.djBIcL(ORxRYg())) == null) ? null : abstractC54531xLwDjBIcL.valueOf(QKVWgx());
        if (bizInstrumentValueOf instanceof SpotInstrument) {
            return ((SpotInstrument) bizInstrumentValueOf).getLevel();
        }
        return null;
    }

    public final void gHZMYf() {
        oOS oos;
        RecyclerView recyclerView;
        android.content.Context context = getContext();
        if (context == null || (oos = this.valueOf) == null || (recyclerView = oos.fetchVPNInfo) == null) {
            return;
        }
        C38353pVq c38353pVq = new C38353pVq(context, recyclerView, new Function0() { // from class: o.peF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38685peB.AuCTelauCTel(this.EZpvd);
            }
        }, new Function0() { // from class: o.peM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38685peB.zuBGHE(this.copydefault);
            }
        }, new Function1() { // from class: o.peO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38685peB.copydefault(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: o.peK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38685peB.copydefault(this.copydefault, (android.view.View) obj);
            }
        }, new Function1() { // from class: o.peL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38685peB.KWHzl((java.lang.String) obj);
            }
        }, this.isConnected, QOLQEE());
        this.uzCIH = c38353pVq;
        c38353pVq.djBIcL();
    }

    public static final Unit AuCTelauCTel(C38685peB c38685peB) {
        c38685peB.zsXlph();
        return Unit.INSTANCE;
    }

    public static final oZI.Application zuBGHE(C38685peB c38685peB) {
        return c38685peB.djBIcL();
    }

    public static final Unit copydefault(C38685peB c38685peB, boolean z) {
        if (c38685peB.fARcdN() != null) {
            c38685peB.AuCTelauCTel();
        } else {
            c38685peB.AEQbTJ(z);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C38685peB c38685peB, android.view.View view) {
        android.view.View view2;
        oOS oos;
        RecyclerView recyclerView;
        C39014pkM c39014pkMValues;
        c38685peB.hDKMBd = view;
        c38685peB.isConnected = false;
        ViewOnClickListenerC38857phO viewOnClickListenerC38857phOFARcdN = c38685peB.fARcdN();
        C38353pVq c38353pVq = null;
        if (viewOnClickListenerC38857phOFARcdN != null && (c39014pkMValues = viewOnClickListenerC38857phOFARcdN.values()) != null) {
            LifecycleOwnerKt.getLifecycleScope(c39014pkMValues).launchWhenResumed(new KlineHeaderFragment$setSwipingTitleAdapter$4$1$1(c39014pkMValues, null));
        }
        C38353pVq c38353pVq2 = c38685peB.uzCIH;
        if (c38353pVq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c38353pVq = c38353pVq2;
        }
        if (!c38353pVq.KWHzl() && (view2 = c38685peB.hDKMBd) != null && (oos = c38685peB.valueOf) != null && (recyclerView = oos.fetchVPNInfo) != null) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
            if (C33129mqd.KWHzl((java.util.Collection) c38685peB.fIwbmz) && childAdapterPosition >= 0) {
                c38685peB.AubY();
                pWP pwp = c38685peB.fIwbmz.get(childAdapterPosition % c38685peB.fIwbmz.size());
                if (pwp != null) {
                    MarketCoinInfo marketCoinInfo = new MarketCoinInfo(pwp.AEQbTJ(), pwp.KWHzl(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
                    c38685peB.QUSxYX().EZpvd(marketCoinInfo);
                    c38685peB.QUSxYX().EZpvd(pwp.AEQbTJ(), BusinessType.CeFi);
                    c38685peB.DTwDnp().AEQbTJ(marketCoinInfo);
                    c38685peB.QUSxYX().AhwBna().setValue(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C37908pFd.AhwBna(str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void handleSwipingTitleScroll$default(C38685peB c38685peB, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c38685peB.AEQbTJ(z);
    }

    public final void AEQbTJ(final boolean z) {
        final oOS oos = this.valueOf;
        if (oos != null) {
            oos.fetchVPNInfo.post(new java.lang.Runnable() { // from class: o.peJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C38685peB.copydefault(z, this, oos);
                }
            });
        }
    }

    public static final void copydefault(boolean z, C38685peB c38685peB, oOS oos) {
        float f = 0.0f;
        if (z) {
            oZI.Application applicationDjBIcL = c38685peB.djBIcL();
            if (applicationDjBIcL != null) {
                applicationDjBIcL.AEQbTJ(0.0f, true);
            }
            f = c38685peB.wlaJM;
        } else {
            oZI.Application applicationDjBIcL2 = c38685peB.djBIcL();
            if (applicationDjBIcL2 != null) {
                oZI.Application.updateViceAlpha$default(applicationDjBIcL2, 1.0f, false, 2, null);
            }
        }
        oos.fetchVPNInfo.animate().translationY(f).setDuration(200L).start();
    }

    public final C55427xjj valueOf() {
        ActivityC38834pgs activityC38834pgsFIwbmz = fIwbmz();
        androidx.fragment.app.Fragment fragmentAYXKKw = activityC38834pgsFIwbmz != null ? activityC38834pgsFIwbmz.AYXKKw() : null;
        if (fragmentAYXKKw instanceof C55427xjj) {
            return (C55427xjj) fragmentAYXKKw;
        }
        return null;
    }

    public final ViewOnClickListenerC38857phO fARcdN() {
        C55427xjj c55427xjjValueOf = valueOf();
        androidx.fragment.app.Fragment fragmentEZpvd = c55427xjjValueOf != null ? c55427xjjValueOf.EZpvd() : null;
        if (fragmentEZpvd instanceof ViewOnClickListenerC38857phO) {
            return (ViewOnClickListenerC38857phO) fragmentEZpvd;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(boolean z) {
        android.view.View viewEZpvd;
        this.values = z;
        if (this.AhwBna) {
            oZI.Application applicationDjBIcL = djBIcL();
            viewEZpvd = applicationDjBIcL != null ? applicationDjBIcL.EZpvd() : null;
        } else {
            oOS oos = this.valueOf;
            if (oos != null) {
                viewEZpvd = oos.gEmmrt;
            }
        }
        if (z) {
            if ((viewEZpvd != null ? viewEZpvd.getAlpha() : 0.0f) < 1.0f) {
                ejfBZ().cancel();
                ejfBZ().start();
                return;
            }
        }
        if (z || this.fJNWhG <= 0.0f) {
            return;
        }
        ejfBZ().cancel();
        ejfBZ().start();
    }

    public final void hDKMBd() {
        RecyclerView recyclerView;
        if (!this.ejfBZ) {
            if (!C33129mqd.KWHzl((java.util.Collection) this.fIwbmz) || this.isConnected) {
                LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new KlineHeaderFragment$initTitleBar$1(this, null));
                return;
            }
            return;
        }
        this.AhwBna = false;
        oOS oos = this.valueOf;
        if (oos == null || (recyclerView = oos.fetchVPNInfo) == null) {
            return;
        }
        recyclerView.setVisibility(8);
    }

    public final java.util.List<pWP> DbNXlk() {
        if (Intrinsics.EZpvd((java.lang.Object) ORxRYg(), (java.lang.Object) "OPTION")) {
            return yDY.AhwBna();
        }
        return fetchVPNInfo();
    }

    public final java.util.List<pWP> fetchVPNInfo() {
        BizInstrument bizInstrumentQOLQEE = QOLQEE();
        if (bizInstrumentQOLQEE != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                java.util.List<BizInstrument> listEZpvd = C55608xnE.EZpvd(interfaceC54581xNrOLrzqt, Intrinsics.EZpvd((java.lang.Object) ORxRYg(), (java.lang.Object) "MARGIN") ? "SPOT" : ORxRYg(), bizInstrumentQOLQEE.getQuoteSymbol(), bizInstrumentQOLQEE.isPreMarketPair());
                if (listEZpvd != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
                    for (BizInstrument bizInstrument : listEZpvd) {
                        arrayList.add(new pWP(bizInstrument.getInstId(), bizInstrument.getInstType(), null, null, null, 28, null));
                    }
                    return arrayList;
                }
            }
            return yDY.AhwBna();
        }
        return yDY.AhwBna();
    }

    public final oZI.Application djBIcL() {
        oOS oos;
        RecyclerView recyclerView;
        android.view.View view;
        int childAdapterPosition;
        C38353pVq c38353pVq = this.uzCIH;
        if (c38353pVq == null) {
            return null;
        }
        if (c38353pVq == null) {
            Intrinsics.gEmmrt("");
            c38353pVq = null;
        }
        if (c38353pVq.EZpvd() && (oos = this.valueOf) != null && (recyclerView = oos.fetchVPNInfo) != null && (view = this.hDKMBd) != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) != -1) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(childAdapterPosition);
            if (viewHolderFindViewHolderForAdapterPosition instanceof oZI.Application) {
                return (oZI.Application) viewHolderFindViewHolderForAdapterPosition;
            }
        }
        return null;
    }

    public final void KWHzl(int i) {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        android.widget.LinearLayout linearLayout3;
        android.widget.LinearLayout linearLayout4;
        android.widget.LinearLayout linearLayout5;
        RecyclerView recyclerView;
        oZI.Application applicationDjBIcL;
        RecyclerView recyclerView2;
        float f = this.wlaJM;
        float f2 = i * this.getFieldNames;
        float f3 = f - f2;
        float f4 = f2 < f ? f2 / f : 1.0f;
        java.lang.Float fValueOf = null;
        if (this.AhwBna) {
            oOS oos = this.valueOf;
            if (oos != null && (recyclerView2 = oos.fetchVPNInfo) != null) {
                if (f3 <= 0.0f) {
                    f3 = 0.0f;
                }
                recyclerView2.setTranslationY(f3);
            }
            oZI.Application applicationDjBIcL2 = djBIcL();
            if (applicationDjBIcL2 != null) {
                oZI.Application.updateViceAlpha$default(applicationDjBIcL2, f4, false, 2, null);
            }
            if (this.getNewProxyInstance.getFirst().booleanValue() && (applicationDjBIcL = djBIcL()) != null) {
                applicationDjBIcL.AEQbTJ(this.getNewProxyInstance.getSecond());
            }
            oOS oos2 = this.valueOf;
            this.fJNWhG = ((java.lang.Float) ((oos2 == null || (recyclerView = oos2.fetchVPNInfo) == null) ? 0L : java.lang.Float.valueOf(recyclerView.getTranslationY()))).floatValue();
            this.fetchVPNInfo = java.lang.Float.valueOf(f4);
            return;
        }
        if (f3 <= 0.0f) {
            f3 = 0.0f;
        }
        oOS oos3 = this.valueOf;
        if (oos3 != null && (linearLayout5 = oos3.valueOf) != null) {
            linearLayout5.setTranslationY(f3);
        }
        oOS oos4 = this.valueOf;
        if (oos4 != null && (linearLayout4 = oos4.gEmmrt) != null) {
            linearLayout4.setTranslationY(f3);
        }
        oOS oos5 = this.valueOf;
        if (oos5 != null && (linearLayout3 = oos5.gEmmrt) != null) {
            linearLayout3.setAlpha(f4);
        }
        oOS oos6 = this.valueOf;
        this.fJNWhG = ((java.lang.Float) ((oos6 == null || (linearLayout2 = oos6.valueOf) == null) ? 0L : java.lang.Float.valueOf(linearLayout2.getTranslationY()))).floatValue();
        oOS oos7 = this.valueOf;
        if (oos7 != null && (linearLayout = oos7.gEmmrt) != null) {
            fValueOf = java.lang.Float.valueOf(linearLayout.getAlpha());
        }
        this.fetchVPNInfo = fValueOf;
    }

    public final void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        int i;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        android.widget.TextView textView7;
        android.widget.TextView textView8;
        android.widget.TextView textView9;
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        FragmentActivity activity = getActivity();
        java.lang.CharSequence text = null;
        java.lang.Integer numValueOf = activity != null ? java.lang.Integer.valueOf(C33508mxl.AEQbTJ(activity)) : null;
        FragmentActivity activity2 = getActivity();
        java.lang.Integer numValueOf2 = activity2 != null ? java.lang.Integer.valueOf(C33508mxl.copydefault(activity2)) : null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) marketTopInfo.getTPriceNoTh()) && C33129mqd.valueOf(marketTopInfo.getTPriceNoTh(), 0)) {
            i = iCopydefault;
        } else if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) marketTopInfo.getTIncrease(), (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
            if (numValueOf != null) {
                iCopydefault = numValueOf.intValue();
            }
            i = iCopydefault;
        } else {
            int iIntValue = (Intrinsics.EZpvd((java.lang.Object) marketTopInfo.getTIncrease(), (java.lang.Object) pTB.KWHzl(pTB.OLrzqt((java.lang.Object) "0.00"), 2, RoundingMode.DOWN)) || numValueOf2 == null) ? iCopydefault : numValueOf2.intValue();
            if (!Intrinsics.EZpvd((java.lang.Object) marketTopInfo.getTPrice(), (java.lang.Object) "--") && numValueOf2 != null) {
                iCopydefault = numValueOf2.intValue();
            }
            int i2 = iIntValue;
            i = iCopydefault;
            iCopydefault = i2;
        }
        java.lang.String strAEQbTJ = Intrinsics.EZpvd((java.lang.Object) marketTopInfo.getTPrice(), (java.lang.Object) "--") ? "--" : pTF.KWHzl.AEQbTJ(marketTopInfo.getTIncrease());
        if (this.ejfBZ || !this.AhwBna) {
            oOS oos = this.valueOf;
            if (oos != null && (textView9 = oos.hDKMBd) != null) {
                textView9.setTextColor(iCopydefault);
            }
            oOS oos2 = this.valueOf;
            if (oos2 != null && (textView8 = oos2.getFieldNames) != null) {
                textView8.setTextColor(iCopydefault);
            }
            oOS oos3 = this.valueOf;
            if (oos3 != null && (textView7 = oos3.fIwbmz) != null) {
                textView7.setTextColor(i);
            }
            oOS oos4 = this.valueOf;
            if (oos4 != null && (textView6 = oos4.fARcdN) != null) {
                textView6.setTextColor(i);
            }
            oOS oos5 = this.valueOf;
            if (oos5 != null && (textView5 = oos5.fIwbmz) != null) {
                textView5.setText(marketTopInfo.getTPrice());
            }
            oOS oos6 = this.valueOf;
            if (oos6 != null && (textView4 = oos6.hDKMBd) != null) {
                textView4.setText(strAEQbTJ);
            }
            if (this.ejfBZ) {
                oOS oos7 = this.valueOf;
                if (oos7 != null && (textView3 = oos7.fARcdN) != null) {
                    textView3.setText(marketTopInfo.getTPrice());
                }
                oOS oos8 = this.valueOf;
                if (oos8 != null && (textView = oos8.getFieldNames) != null) {
                    if (oos8 != null && (textView2 = oos8.hDKMBd) != null) {
                        text = textView2.getText();
                    }
                    textView.setText(text);
                }
            }
        } else {
            ViceInfo viceInfo = new ViceInfo(strAEQbTJ, iCopydefault, marketTopInfo.getTPrice(), i);
            oZI.Application applicationDjBIcL = djBIcL();
            if (applicationDjBIcL != null) {
                applicationDjBIcL.AEQbTJ(viceInfo);
            }
            this.getNewProxyInstance = C56390yDp.OLrzqt(java.lang.Boolean.valueOf(marketTopInfo.isNewCoin()), viceInfo);
        }
        RJOkX().AEQbTJ(marketTopInfo);
    }

    public final void getFieldNames() {
        if (this.AhwBna) {
            C38353pVq c38353pVq = this.uzCIH;
            if (c38353pVq == null) {
                Intrinsics.gEmmrt("");
                c38353pVq = null;
            }
            c38353pVq.AEQbTJ();
        }
    }

    public final void iwGUEr() {
        android.widget.ImageView imageView;
        Group group;
        Group group2;
        android.widget.ImageView imageView2;
        if (!this.ejfBZ) {
            oOS oos = this.valueOf;
            if (oos == null || (imageView = oos.values) == null) {
                return;
            }
            imageView.setVisibility(DTwDnp().AhwBna() ? 0 : 8);
            return;
        }
        oOS oos2 = this.valueOf;
        if (oos2 != null && (imageView2 = oos2.djBIcL) != null) {
            imageView2.setVisibility(8);
        }
        oOS oos3 = this.valueOf;
        if (oos3 != null && (group2 = oos3.copydefault) != null) {
            group2.setVisibility(8);
        }
        oOS oos4 = this.valueOf;
        if (oos4 == null || (group = oos4.KWHzl) == null) {
            return;
        }
        group.setVisibility(0);
    }

    public final void AuCTelauCTel() {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        android.widget.LinearLayout linearLayout3;
        RecyclerView recyclerView;
        float f = this.wlaJM;
        this.fJNWhG = f;
        if (this.AhwBna) {
            oOS oos = this.valueOf;
            if (oos != null && (recyclerView = oos.fetchVPNInfo) != null) {
                recyclerView.setTranslationY(f);
            }
            oZI.Application applicationDjBIcL = djBIcL();
            if (applicationDjBIcL != null) {
                oZI.Application.updateViceAlpha$default(applicationDjBIcL, 0.0f, false, 2, null);
                return;
            }
            return;
        }
        oOS oos2 = this.valueOf;
        if (oos2 != null && (linearLayout3 = oos2.valueOf) != null) {
            linearLayout3.setTranslationY(f);
        }
        oOS oos3 = this.valueOf;
        if (oos3 != null && (linearLayout2 = oos3.gEmmrt) != null) {
            linearLayout2.setTranslationY(this.wlaJM);
        }
        oOS oos4 = this.valueOf;
        if (oos4 == null || (linearLayout = oos4.gEmmrt) == null) {
            return;
        }
        linearLayout.setAlpha(0.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.peB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zsXlph() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        C56087xwG c56087xwGZLjUOn;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null) {
            TradeKey tradeKey = TradeKey.MANAGER;
            InterfaceC54577xNn interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(tradeKey);
            if (interfaceC54577xNn2 != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn2.OLrzqt()) != null && interfaceC54581xNrOLrzqt.sSMYrx()) {
                InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                if (interfaceC49425uoM2 != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(tradeKey)) != null && (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn.OLrzqt()) != null && (c56087xwGZLjUOn = interfaceC54581xNrOLrzqt2.zLjUOn()) != null) {
                    c56087xwGZLjUOn.KWHzl(new PictureInPictureParams(objectRef, this));
                }
            } else {
                ?? string = SPUtils.getString("search_navigate_type", "coinNav", "file_search_nav_type");
                objectRef.element = string;
                OLrzqt((java.lang.String) string);
            }
        }
        C32866mlf.onEvent$default("app_page_change_click", (TrackChannel[]) null, new Function1() { // from class: o.peX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38685peB.copydefault(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.peB$PictureInPictureParams */
    public static final class PictureInPictureParams implements InterfaceC55701xos<java.util.List<? extends DeriConfigData>> {
        public final /* synthetic */ C38685peB EZpvd;
        public final /* synthetic */ Ref.ObjectRef<java.lang.String> OLrzqt;

        public PictureInPictureParams(Ref.ObjectRef<java.lang.String> objectRef, C38685peB c38685peB) {
            this.OLrzqt = objectRef;
            this.EZpvd = c38685peB;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<DeriConfigData> list, java.lang.Exception exc) {
            DeriConfigData deriConfigData;
            DeriConfigData deriConfigData2;
            DeriConfigData deriConfigData3;
            if (z && C33129mqd.KWHzl((java.util.Collection) list)) {
                java.lang.String showConfigTimes = null;
                if (Intrinsics.EZpvd((java.lang.Object) ((list == null || (deriConfigData3 = list.get(0)) == null) ? null : deriConfigData3.isSetNavConfig()), (java.lang.Object) "1")) {
                    Ref.ObjectRef<java.lang.String> objectRef = this.OLrzqt;
                    DeriConfigData deriConfigData4 = (DeriConfigData) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
                    T t = "coinNav";
                    if (deriConfigData4 != null) {
                        java.lang.String derivativesNavConfig = deriConfigData4.getDerivativesNavConfig();
                        t = "coinNav";
                        if (derivativesNavConfig != null) {
                            t = derivativesNavConfig;
                        }
                    }
                    objectRef.element = t;
                    this.EZpvd.OLrzqt(this.OLrzqt.element);
                    return;
                }
                if (C33129mqd.gEmmrt((list == null || (deriConfigData2 = list.get(0)) == null) ? null : deriConfigData2.getShowConfigTimes(), 3)) {
                    this.OLrzqt.element = "coinNav";
                    this.EZpvd.OLrzqt("coinNav");
                    return;
                }
                if (list != null && (deriConfigData = list.get(0)) != null) {
                    showConfigTimes = deriConfigData.getShowConfigTimes();
                }
                if (C33129mqd.copydefault((java.lang.Object) showConfigTimes, (java.lang.Object) 3)) {
                    Ref.ObjectRef<java.lang.String> objectRef2 = this.OLrzqt;
                    T t2 = "coinNav";
                    if (list != null) {
                        DeriConfigData deriConfigData5 = list.get(0);
                        t2 = "coinNav";
                        if (deriConfigData5 != null) {
                            java.lang.String derivativesNavConfig2 = deriConfigData5.getDerivativesNavConfig();
                            t2 = "coinNav";
                            if (derivativesNavConfig2 != null) {
                                t2 = derivativesNavConfig2;
                            }
                        }
                    }
                    objectRef2.element = t2;
                    this.EZpvd.OLrzqt(this.OLrzqt.element);
                }
            }
        }
    }

    public static final Unit copydefault(C38685peB c38685peB, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("frompage", "kline", true);
        eventParamsList.put("biztype", c38685peB.ORxRYg(), true);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        kotlin.Pair pairOLrzqt;
        xND xndAEQbTJ;
        java.lang.String str2 = (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "coinNav") && (xndAEQbTJ = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).AEQbTJ()) != null && Intrinsics.EZpvd(xndAEQbTJ.valueOf(), java.lang.Boolean.TRUE)) ? "coinNav" : "bizNAv";
        final java.lang.String str3 = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "coinNav") ? "coin" : "biz";
        C32866mlf.onEvent$default("app_navigate_page_view", (TrackChannel[]) null, new Function1() { // from class: o.peQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38685peB.KWHzl(str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (AhwBna() == BusinessType.CeFi) {
            java.lang.String strQKVWgx = QKVWgx();
            BizInstrument bizInstrumentQOLQEE = QOLQEE();
            pairOLrzqt = C56390yDp.OLrzqt(strQKVWgx, (bizInstrumentQOLQEE == null || !bizInstrumentQOLQEE.isPreMarketPair()) ? ORxRYg() : "pre_market");
        } else {
            java.lang.String strAkhnZx = AkhnZx();
            if (strAkhnZx == null) {
                strAkhnZx = QKVWgx();
            }
            pairOLrzqt = C56390yDp.OLrzqt(strAkhnZx, "CEDEFI");
        }
        final java.lang.String str4 = (java.lang.String) pairOLrzqt.component1();
        java.lang.String str5 = (java.lang.String) pairOLrzqt.component2();
        InterfaceC49508upq interfaceC49508upq = (InterfaceC49508upq) C43251rlk.OLrzqt(InterfaceC49508upq.class);
        ActivityResultCaller searchRootFragment$default = interfaceC49508upq != null ? InterfaceC48910ueb.Application.getSearchRootFragment$default(interfaceC49508upq, str4, str5, str2, "page_k", null, null, 48, null) : null;
        C48918uej.EZpvd("page_k");
        InterfaceC48913uee interfaceC48913uee = searchRootFragment$default instanceof InterfaceC48913uee ? (InterfaceC48913uee) searchRootFragment$default : null;
        if (interfaceC48913uee != null) {
            interfaceC48913uee.copydefault(new Function1() { // from class: o.peR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38685peB.KWHzl(this.copydefault, obj);
                }
            });
            interfaceC48913uee.copydefault(new Function2() { // from class: o.peS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C38685peB.OLrzqt(this.EZpvd, (DexInstrument) obj, (java.lang.String) obj2);
                }
            });
            interfaceC48913uee.EZpvd(new Function1() { // from class: o.peP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38685peB.KWHzl(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            interfaceC48913uee.AEQbTJ(childFragmentManager, "javaClass");
        }
        if (pFP.isUserInDemoTrading$default(pFP.OLrzqt, null, 1, null)) {
            C32866mlf.onEvent$default("app_demo_trading_chart_button_click", (TrackChannel[]) null, new Function1() { // from class: o.peU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38685peB.copydefault(this.copydefault, str4, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", str, true);
        eventParamsList.put("from", "page_k", true);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C38685peB c38685peB, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof CoinInfo) {
            BusinessType businessTypeAhwBna = c38685peB.AhwBna();
            BusinessType businessType = BusinessType.CeFi;
            if (businessTypeAhwBna == businessType) {
                c38685peB.AubY();
            } else {
                c38685peB.OcIXYQ().getValue().OLrzqt();
            }
            c38685peB.isConnected = true;
            CoinInfo coinInfo = (CoinInfo) obj;
            MarketCoinInfo marketCoinInfo = new MarketCoinInfo(coinInfo.getIntId(), coinInfo.getIntType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
            c38685peB.QUSxYX().EZpvd(marketCoinInfo);
            c38685peB.QUSxYX().EZpvd(coinInfo.getIntId(), businessType);
            oOS oos = c38685peB.valueOf;
            if (oos != null) {
                c38685peB.copydefault(oos);
            }
            c38685peB.DTwDnp().AEQbTJ(marketCoinInfo);
            c38685peB.QUSxYX().AhwBna().setValue(java.lang.Boolean.TRUE);
            c38685peB.getFieldNames();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C38685peB c38685peB, DexInstrument dexInstrument, java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        c38685peB.QUSxYX().EZpvd(dexInstrument.getChainId() + dexInstrument.getTokenContractAddress(), BusinessType.CeDeFi);
        c38685peB.QUSxYX().KWHzl(C55491xku.KWHzl.OLrzqt(dexInstrument));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c38685peB), null, null, new KlineHeaderFragment$setSearchFragment$2$2$1(c38685peB, dexInstrument, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C38685peB c38685peB, boolean z) {
        AppCompatImageView appCompatImageViewAEQbTJ;
        android.widget.ImageView imageView;
        oZI.Application applicationDjBIcL = c38685peB.djBIcL();
        if (applicationDjBIcL != null) {
            applicationDjBIcL.EZpvd(z);
        }
        oOS oos = c38685peB.valueOf;
        if (oos != null && (imageView = oos.values) != null) {
            imageView.setSelected(z);
        }
        mUA muaIsConnected = c38685peB.isConnected();
        if (muaIsConnected != null && (appCompatImageViewAEQbTJ = muaIsConnected.AEQbTJ()) != null) {
            appCompatImageViewAEQbTJ.setSelected(z);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C38685peB c38685peB, java.lang.String str, EventParamsList eventParamsList) {
        java.lang.String strDjBIcL;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(BotWebHook.KEY_ACTION, "search", false);
        InterfaceC39499ptW interfaceC39499ptWGEmmrt = c38685peB.gEmmrt();
        if (interfaceC39499ptWGEmmrt != null && (strDjBIcL = interfaceC39499ptWGEmmrt.djBIcL()) != null) {
            eventParamsList.put("type", strDjBIcL, false);
        }
        eventParamsList.put("pair", str, false);
        return Unit.INSTANCE;
    }

    public final void AubY() {
        OcIXYQ().getValue().EZpvd(C36246oUr.copydefault().AxsJAYsNCnLh());
    }

    public final mUA isConnected() {
        oOS oos = this.valueOf;
        if (oos != null) {
            return oos.OLrzqt;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ejfBZ().cancel();
    }

    public final boolean getNewProxyInstance() {
        int i = ActionBar.copydefault[AhwBna().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return QOLQEE() != null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void wlaJM() {
        RecyclerView recyclerView;
        java.util.Iterator<pWP> it = this.fIwbmz.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            pWP next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) (next != null ? next.AEQbTJ() : null), (java.lang.Object) QKVWgx())) {
                if (Intrinsics.EZpvd((java.lang.Object) next.KWHzl(), (java.lang.Object) (Intrinsics.EZpvd((java.lang.Object) ORxRYg(), (java.lang.Object) "MARGIN") ? "SPOT" : ORxRYg()))) {
                    break;
                }
            }
            i++;
        }
        if (i != -1) {
            int size = (LockFreeTaskQueueCore.MAX_CAPACITY_MASK - (LockFreeTaskQueueCore.MAX_CAPACITY_MASK % this.fIwbmz.size())) + i;
            oOS oos = this.valueOf;
            if (oos == null || (recyclerView = oos.fetchVPNInfo) == null) {
                return;
            }
            recyclerView.scrollToPosition(size);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(size, 0);
            recyclerView.addOnLayoutChangeListener(new TaskStackBuilder());
        }
    }

    public static final InterfaceC56387yDm wlaJM(final C38685peB c38685peB) {
        final Function0 function0 = null;
        return FragmentViewModelLazyKt.createViewModelLazy(c38685peB, C56524yIo.AEQbTJ(KlineTimeAnchorViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.KlineHeaderFragment$klineTimeAnchorViewModel_delegate$lambda$0$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = c38685peB.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.KlineHeaderFragment$klineTimeAnchorViewModel_delegate$lambda$0$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = c38685peB.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.KlineHeaderFragment$klineTimeAnchorViewModel_delegate$lambda$0$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = c38685peB.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }
}
