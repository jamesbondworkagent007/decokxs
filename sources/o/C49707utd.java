package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradeuilib.header.BizSettingItem;
import com.okinc.tradeuilib.header.TradePopupPresenterNew;
import com.okinc.tradeuilib.header.TradeSwitchBizHeaderPresenter;
import com.okinc.tradeuilib.header.TradeSwitchBizHeaderView$observer$1;
import com.okinc.unify_trade.biz.TokenBusinessData;
import com.okinc.unify_trade.header.CacheSource;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import com.okinc.unify_trade.trade.utils.TradeAbTestManager;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C49511upt;
import o.C49627usC;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.utd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49707utd extends android.widget.FrameLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public volatile java.lang.Object AEQbTJ;
    public boolean AYXKKw;
    public volatile java.lang.Boolean AhwBna;
    public java.util.ArrayList<TokenBusinessData> AkhnZx;
    public final RecyclerView AuCTel;
    public final java.util.Set<java.lang.String> DbNXlk;
    public java.util.ArrayList<TokenBusinessData> KWHzl;
    public final int OLrzqt;
    public final StateListAnimator copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final android.widget.ImageView fARcdN;
    public Function1<? super TokenBusinessData, Unit> fetchVPNInfo;
    public LifecycleOwner gEmmrt;
    public final TradeSwitchBizHeaderView$observer$1 isConnected;
    public Function1<? super android.view.View, Unit> valueOf;
    public Function1<? super TokenBusinessData, Unit> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49707utd(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49707utd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItemSelectCallback(Function1<? super TokenBusinessData, Unit> function1) {
        this.fetchVPNInfo = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnLoadFinishCallback(Function1<? super android.view.View, Unit> function1) {
        this.valueOf = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:69) call: o.utd.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C49707utd(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.okinc.tradeuilib.header.TradeSwitchBizHeaderView$observer$1] */
    public C49707utd(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.uti
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49707utd.copydefault(this.KWHzl, context);
            }
        });
        this.values = new Function1() { // from class: o.utj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49707utd.EZpvd((TokenBusinessData) obj);
            }
        };
        this.KWHzl = new java.util.ArrayList<>();
        this.AkhnZx = new java.util.ArrayList<>();
        this.OLrzqt = C55298xhM.dp2px$default(50.0f, null, 1, null);
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.copydefault = stateListAnimator;
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.utf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49707utd.OLrzqt();
            }
        });
        this.DbNXlk = yEE.AhwBna("SPOT", "SWAP");
        android.view.LayoutInflater.from(context).inflate(C49511upt.StateListAnimator.AuCTelauCTel, (android.view.ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(C49511upt.Application.OTwTPd);
        this.AuCTel = recyclerView;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(C49511upt.Application.hUfVAv);
        this.fARcdN = imageView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(stateListAnimator);
        imageView.setOnClickListener(new LoaderManager(imageView, 1000L, this));
        this.isConnected = new DefaultLifecycleObserver() { // from class: com.okinc.tradeuilib.header.TradeSwitchBizHeaderView$observer$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                this.KWHzl.copydefault();
            }
        };
    }

    /* JADX INFO: renamed from: o.utd$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.utd.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.lang.String EZpvd() {
            return "key_trade_mode_title_order-" + C55697xoo.OLrzqt.gEmmrt();
        }

        public final java.lang.String KWHzl() {
            return "key_trade_mode_title_disable-" + C55697xoo.OLrzqt.gEmmrt();
        }
    }

    private final InterfaceC56387yDm<?> djBIcL() {
        return (InterfaceC56387yDm) this.ejfBZ.getValue();
    }

    public static final InterfaceC56387yDm copydefault(final C49707utd c49707utd, final android.content.Context context) {
        return C56392yDr.copydefault(new Function0() { // from class: o.utn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49707utd.OLrzqt(this.OLrzqt, context);
            }
        });
    }

    public static final AbsPresenter OLrzqt(C49707utd c49707utd, android.content.Context context) {
        AbsPresenter absPresenter;
        FragmentActivity fragmentActivityCopydefault = c49707utd.copydefault(context);
        if (fragmentActivityCopydefault != null) {
            if (TradeAbTestManager.copydefault.gEmmrt()) {
                absPresenter = (AbsPresenter) new ViewModelProvider(fragmentActivityCopydefault, new TaskDescription(fragmentActivityCopydefault)).get(TradePopupPresenterNew.class);
            } else {
                absPresenter = (AbsPresenter) new ViewModelProvider(fragmentActivityCopydefault).get(TradeSwitchBizHeaderPresenter.class);
            }
            if (absPresenter != null) {
                return absPresenter;
            }
        }
        throw new java.lang.IllegalStateException("Cannot get FragmentActivity");
    }

    /* JADX INFO: renamed from: o.utd$TaskDescription */
    public static final class TaskDescription extends AbstractSavedStateViewModelFactory {
        public final /* synthetic */ FragmentActivity KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(FragmentActivity fragmentActivity) {
            super(fragmentActivity, null);
            this.KWHzl = fragmentActivity;
        }

        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        public <T extends ViewModel> T create(java.lang.String str, java.lang.Class<T> cls, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(savedStateHandle, "");
            android.app.Application application = this.KWHzl.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "");
            return new TradePopupPresenterNew(application, savedStateHandle, false, CacheSource.HEADER_VIEW);
        }
    }

    public static final Unit EZpvd(TokenBusinessData tokenBusinessData) {
        Intrinsics.checkNotNullParameter(tokenBusinessData, "");
        return Unit.INSTANCE;
    }

    public static final xLY OLrzqt() {
        return new xLY(BizInfoConfig.DefaultBizConfig.copydefault);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Lifecycle lifecycle;
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        this.gEmmrt = lifecycleOwner;
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this.isConnected);
    }

    /* JADX INFO: renamed from: o.utd$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ C49707utd AEQbTJ;
        public final android.widget.TextView KWHzl;

        /* JADX INFO: renamed from: o.utd$Activity$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ C49707utd AEQbTJ;
            public final /* synthetic */ TokenBusinessData EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, C49707utd c49707utd, TokenBusinessData tokenBusinessData) {
                this.OLrzqt = view;
                this.KWHzl = j;
                this.AEQbTJ = c49707utd;
                this.EZpvd = tokenBusinessData;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.AEQbTJ.OLrzqt(this.EZpvd);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C49707utd c49707utd, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = c49707utd;
            android.view.View viewFindViewById = view.findViewById(C49511upt.Application.gtCCJH);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.KWHzl = (android.widget.TextView) viewFindViewById;
        }

        public final void OLrzqt(@NotNull TokenBusinessData tokenBusinessData) {
            Intrinsics.checkNotNullParameter(tokenBusinessData, "");
            this.KWHzl.setText(C49640usP.OLrzqt.copydefault(tokenBusinessData.getInstType(), java.lang.Boolean.valueOf(tokenBusinessData.isPreMarket())));
            this.KWHzl.setSelected(tokenBusinessData.isSelect());
            this.KWHzl.setTextAppearance(tokenBusinessData.isSelect() ? C49511upt.Dialog.copydefault : C49511upt.Dialog.EZpvd);
            this.KWHzl.setTextColor(C33070mpX.copydefault(tokenBusinessData.isSelect() ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.zDGrpR));
            android.view.View view = this.itemView;
            view.setOnClickListener(new ActionBar(view, 1000L, this.AEQbTJ, tokenBusinessData));
        }
    }

    /* JADX INFO: renamed from: o.utd$Application */
    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ C49707utd EZpvd;

        /* JADX INFO: renamed from: o.utd$Application$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ C49707utd KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, C49707utd c49707utd) {
                this.copydefault = view;
                this.OLrzqt = j;
                this.KWHzl = c49707utd;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.KWHzl.AEQbTJ();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C49707utd c49707utd, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = c49707utd;
        }

        public final void copydefault() {
            android.view.View view = this.itemView;
            view.setOnClickListener(new ActionBar(view, 1000L, this.EZpvd));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = this.gEmmrt;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.isConnected);
        }
        super.onDetachedFromWindow();
        if (this.AEQbTJ != null) {
            try {
                EZpvd(new Function2() { // from class: o.utm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C49707utd.KWHzl((java.util.ArrayList) obj, ((java.lang.Boolean) obj2).booleanValue());
                    }
                });
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("TradeSwitchBizHeaderView", "Failed to clear callback in onDetachedFromWindow", e);
            }
        }
    }

    /* JADX INFO: renamed from: o.utd$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C49707utd copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C49707utd c49707utd) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c49707utd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.AEQbTJ();
            }
        }
    }

    public static final Unit KWHzl(java.util.ArrayList arrayList, boolean z) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        xOU xouWlaJM;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        if (c54589xNz.isConnected()) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            java.lang.String strKWHzl = (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.KWHzl();
            if (!this.AkhnZx.isEmpty()) {
                setVisibility(0);
            } else {
                setVisibility(Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "copytrading") ? 4 : 8);
            }
            AEQbTJ(Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "trade_manual"));
            return;
        }
        setVisibility(8);
    }

    public static final Unit gEmmrt(C49707utd c49707utd) {
        c49707utd.KWHzl();
        return Unit.INSTANCE;
    }

    private final java.lang.Object gEmmrt() {
        java.lang.Object obj = this.AEQbTJ;
        if (obj == null) {
            synchronized (this) {
                obj = this.AEQbTJ;
                if (obj == null) {
                    java.lang.Object value = djBIcL().getValue();
                    if (value instanceof TradePopupPresenterNew) {
                        this.AhwBna = java.lang.Boolean.TRUE;
                        obj = (AbsPresenter) value;
                    } else if (value instanceof TradeSwitchBizHeaderPresenter) {
                        this.AhwBna = java.lang.Boolean.FALSE;
                        obj = (AbsPresenter) value;
                    } else {
                        throw new java.lang.IllegalStateException("Unsupported presenter type: " + (value != null ? value.getClass() : null));
                    }
                    this.AEQbTJ = obj;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        Intrinsics.copydefault(obj);
        return obj;
    }

    private final java.util.ArrayList<TokenBusinessData> AYXKKw() {
        java.lang.Object objGEmmrt = gEmmrt();
        if (Intrinsics.EZpvd(this.AhwBna, java.lang.Boolean.TRUE)) {
            Intrinsics.copydefault(objGEmmrt, "");
            return ((TradePopupPresenterNew) objGEmmrt).DbNXlk();
        }
        Intrinsics.copydefault(objGEmmrt, "");
        return ((TradeSwitchBizHeaderPresenter) objGEmmrt).AEQbTJ();
    }

    private final void copydefault(java.lang.String str) {
        java.lang.Object objGEmmrt = gEmmrt();
        if (Intrinsics.EZpvd(this.AhwBna, java.lang.Boolean.TRUE)) {
            Intrinsics.copydefault(objGEmmrt, "");
            ((TradePopupPresenterNew) objGEmmrt).copydefault(str);
        } else {
            Intrinsics.copydefault(objGEmmrt, "");
            ((TradeSwitchBizHeaderPresenter) objGEmmrt).AEQbTJ(str);
        }
    }

    public final void EZpvd(final Function2<? super java.util.ArrayList<TokenBusinessData>, ? super java.lang.Boolean, Unit> function2) {
        java.lang.Object objGEmmrt = gEmmrt();
        if (Intrinsics.EZpvd(this.AhwBna, java.lang.Boolean.TRUE)) {
            Intrinsics.copydefault(objGEmmrt, "");
            ((TradePopupPresenterNew) objGEmmrt).KWHzl(function2);
        } else {
            Intrinsics.copydefault(objGEmmrt, "");
            ((TradeSwitchBizHeaderPresenter) objGEmmrt).AEQbTJ(new Function1() { // from class: o.utt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49707utd.AEQbTJ(function2, (java.util.ArrayList) obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(Function2 function2, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        function2.invoke(arrayList, java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void presenterInitData$default(C49707utd c49707utd, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c49707utd.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        java.lang.Object objGEmmrt = gEmmrt();
        if (Intrinsics.EZpvd(this.AhwBna, java.lang.Boolean.TRUE)) {
            Intrinsics.copydefault(objGEmmrt, "");
            ((TradePopupPresenterNew) objGEmmrt).EZpvd(z);
        } else {
            Intrinsics.copydefault(objGEmmrt, "");
            ((TradeSwitchBizHeaderPresenter) objGEmmrt).OLrzqt(z);
        }
    }

    public final void AEQbTJ(TokenBusinessData tokenBusinessData) {
        java.lang.Object objGEmmrt = gEmmrt();
        if (Intrinsics.EZpvd(this.AhwBna, java.lang.Boolean.TRUE)) {
            Intrinsics.copydefault(objGEmmrt, "");
            ((TradePopupPresenterNew) objGEmmrt).EZpvd(tokenBusinessData);
        } else {
            Intrinsics.copydefault(objGEmmrt, "");
            ((TradeSwitchBizHeaderPresenter) objGEmmrt).OLrzqt(tokenBusinessData);
        }
    }

    public final FragmentActivity copydefault(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof FragmentActivity) {
                return (FragmentActivity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static /* synthetic */ void requestBusinessList$default(C49707utd c49707utd, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c49707utd.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        EZpvd(new Function2() { // from class: o.uth
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C49707utd.AEQbTJ(this.OLrzqt, (java.util.ArrayList) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        OLrzqt(z);
    }

    public static final Unit AEQbTJ(C49707utd c49707utd, java.util.ArrayList arrayList, boolean z) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        c49707utd.setVisibility(arrayList.isEmpty() ^ true ? 0 : 8);
        setData$default(c49707utd, arrayList, false, false, 6, null);
        Function1<? super android.view.View, Unit> function1 = c49707utd.valueOf;
        if (function1 != null) {
            function1.invoke(c49707utd.fARcdN);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setData$default(C49707utd c49707utd, java.util.ArrayList arrayList, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        c49707utd.setData(arrayList, z, z2);
    }

    public final void setData(java.util.ArrayList<TokenBusinessData> arrayList, final boolean z, final boolean z2) {
        this.AkhnZx = new java.util.ArrayList<>(arrayList);
        this.KWHzl = AEQbTJ(arrayList);
        this.copydefault.notifyDataSetChanged();
        this.AuCTel.post(new java.lang.Runnable() { // from class: o.utk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49707utd.setData$lambda$13(this.OLrzqt, z2, z);
            }
        });
    }

    public static final void setData$lambda$13(C49707utd c49707utd, boolean z, boolean z2) {
        c49707utd.AhwBna();
        if (z) {
            c49707utd.KWHzl(z2);
        }
    }

    public final void AhwBna() {
        int iKWHzl;
        if (this.KWHzl.isEmpty()) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.AuCTel.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int size = this.KWHzl.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            android.view.View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i2);
            if (viewFindViewByPosition != null) {
                iKWHzl = viewFindViewByPosition.getWidth();
            } else {
                TokenBusinessData tokenBusinessData = this.KWHzl.get(i2);
                Intrinsics.checkNotNullExpressionValue(tokenBusinessData, "");
                iKWHzl = KWHzl(tokenBusinessData);
            }
            i += iKWHzl;
        }
        boolean z = i > this.AuCTel.getWidth();
        if (z != this.AYXKKw) {
            this.AYXKKw = z;
            this.fARcdN.setVisibility(z ^ true ? 0 : 8);
            ViewGroup.LayoutParams layoutParams = this.AuCTel.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                if (this.AYXKKw) {
                    layoutParams2.removeRule(16);
                    layoutParams2.setMarginEnd(C55298xhM.dp2px$default(24.0f, null, 1, null));
                } else {
                    layoutParams2.addRule(16, C49511upt.Application.hUfVAv);
                    layoutParams2.setMarginEnd(C55298xhM.dp2px$default(12.0f, null, 1, null));
                }
                this.AuCTel.setLayoutParams(layoutParams2);
            }
            this.copydefault.notifyDataSetChanged();
        }
    }

    public final int KWHzl(TokenBusinessData tokenBusinessData) {
        java.lang.String strCopydefault = C49640usP.OLrzqt.copydefault(tokenBusinessData.getInstType(), java.lang.Boolean.valueOf(tokenBusinessData.isPreMarket()));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(C55298xhM.dp2pxFloat$default(18.0f, null, 1, null));
        return (int) (paint.measureText(strCopydefault) + C55298xhM.dp2px$default(24.0f, null, 1, null));
    }

    public final void KWHzl() {
        this.KWHzl = AEQbTJ(this.AkhnZx);
        this.AYXKKw = false;
        this.fARcdN.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = this.AuCTel.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.addRule(16, C49511upt.Application.hUfVAv);
            layoutParams2.setMarginEnd(C55298xhM.dp2px$default(12.0f, null, 1, null));
            this.AuCTel.setLayoutParams(layoutParams2);
        }
        this.copydefault.notifyDataSetChanged();
        this.AuCTel.post(new java.lang.Runnable() { // from class: o.utl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49707utd.AhwBna(this.KWHzl);
            }
        });
    }

    public static final void AhwBna(C49707utd c49707utd) {
        c49707utd.AhwBna();
        scrollToSelected$default(c49707utd, false, 1, null);
    }

    public final java.util.ArrayList<TokenBusinessData> AEQbTJ(java.util.List<TokenBusinessData> list) {
        ActionBar actionBar = Companion;
        java.lang.String string = SPUtils.getString(actionBar.EZpvd(), "CONVERT,SPOT,SWAP,CEDEFI,BOTS,COPYTRADING,OPTION");
        java.lang.String string2 = SPUtils.getString(actionBar.KWHzl(), "");
        java.util.List listAhwBna = (string == null || string.length() == 0) ? yDY.AhwBna() : StringsKt__StringsKt.split$default((java.lang.CharSequence) string, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        java.util.Set<java.lang.String> setEZpvd = EZpvd(string2);
        java.util.ArrayList<TokenBusinessData> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            TokenBusinessData tokenBusinessData = (TokenBusinessData) obj;
            if (!setEZpvd.contains(tokenBusinessData.getOrderType()) || this.DbNXlk.contains(tokenBusinessData.getOrderType())) {
                arrayList.add(obj);
            }
        }
        if (!listAhwBna.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
            for (java.lang.Object obj2 : arrayList) {
                linkedHashMap.put(((TokenBusinessData) obj2).getOrderType(), obj2);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = listAhwBna.iterator();
            while (it.hasNext()) {
                TokenBusinessData tokenBusinessData2 = (TokenBusinessData) linkedHashMap.get((java.lang.String) it.next());
                if (tokenBusinessData2 != null) {
                    arrayList2.add(tokenBusinessData2);
                }
            }
            for (TokenBusinessData tokenBusinessData3 : arrayList) {
                if (!arrayList2.contains(tokenBusinessData3)) {
                    arrayList2.add(tokenBusinessData3);
                }
            }
            arrayList = arrayList2;
        }
        return new java.util.ArrayList<>(arrayList);
    }

    public final java.util.ArrayList<TokenBusinessData> EZpvd(java.util.List<TokenBusinessData> list) {
        java.lang.String string = SPUtils.getString(Companion.EZpvd(), "CONVERT,SPOT,SWAP,CEDEFI,BOTS,COPYTRADING,OPTION");
        java.util.List listAhwBna = (string == null || string.length() == 0) ? yDY.AhwBna() : StringsKt__StringsKt.split$default((java.lang.CharSequence) string, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        if (!listAhwBna.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            for (java.lang.Object obj : list) {
                linkedHashMap.put(((TokenBusinessData) obj).getOrderType(), obj);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = listAhwBna.iterator();
            while (it.hasNext()) {
                TokenBusinessData tokenBusinessData = (TokenBusinessData) linkedHashMap.get((java.lang.String) it.next());
                if (tokenBusinessData != null) {
                    arrayList.add(tokenBusinessData);
                }
            }
            for (TokenBusinessData tokenBusinessData2 : list) {
                if (!arrayList.contains(tokenBusinessData2)) {
                    arrayList.add(tokenBusinessData2);
                }
            }
            list = arrayList;
        }
        return new java.util.ArrayList<>(list);
    }

    public static /* synthetic */ java.util.Set getDisabledSet$default(C49707utd c49707utd, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c49707utd.EZpvd(str);
    }

    public final java.util.Set<java.lang.String> EZpvd(java.lang.String str) {
        if (str == null) {
            str = SPUtils.getString(Companion.KWHzl(), "");
        }
        java.lang.String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return yEE.copydefault();
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listSplit$default) {
            java.lang.String str3 = (java.lang.String) obj;
            if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) && !this.DbNXlk.contains(str3)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.OqFWZa(arrayList);
    }

    public static /* synthetic */ void scrollToSelected$default(C49707utd c49707utd, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c49707utd.KWHzl(z);
    }

    public static final void OLrzqt(C49707utd c49707utd, int i, boolean z) {
        int width;
        RecyclerView.LayoutManager layoutManager = c49707utd.AuCTel.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (width = c49707utd.AuCTel.getWidth()) == 0) {
            return;
        }
        android.view.View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
        int width2 = (width - (viewFindViewByPosition != null ? viewFindViewByPosition.getWidth() : 0)) / 2;
        if (z) {
            FragmentManager fragmentManager = new FragmentManager(c49707utd.getContext());
            fragmentManager.setTargetPosition(i);
            linearLayoutManager.startSmoothScroll(fragmentManager);
            return;
        }
        linearLayoutManager.scrollToPositionWithOffset(i, width2);
    }

    /* JADX INFO: renamed from: o.utd$FragmentManager */
    public static final class FragmentManager extends LinearSmoothScroller {
        public FragmentManager(android.content.Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(TokenBusinessData tokenBusinessData) {
        if (!tokenBusinessData.isSelect()) {
            if (!Intrinsics.EZpvd((java.lang.Object) tokenBusinessData.getInstType(), (java.lang.Object) "OPTION")) {
                for (TokenBusinessData tokenBusinessData2 : AYXKKw()) {
                    tokenBusinessData2.setSelect(Intrinsics.EZpvd((java.lang.Object) tokenBusinessData2.getInstType(), (java.lang.Object) tokenBusinessData.getInstType()) && tokenBusinessData2.isPreMarket() == tokenBusinessData.isPreMarket());
                }
            }
            java.lang.String instType = tokenBusinessData.getInstType();
            switch (instType.hashCode()) {
                case -2027980370:
                    if (instType.equals("MARGIN")) {
                        AEQbTJ(tokenBusinessData);
                        setData(AYXKKw(), true, false);
                    } else {
                        copydefault(tokenBusinessData.getInstType());
                        setData(AYXKKw(), true, false);
                    }
                    break;
                case 2552066:
                    if (!instType.equals("SPOT")) {
                    }
                    break;
                case 2558355:
                    if (!instType.equals("SWAP")) {
                    }
                    break;
                case 214415088:
                    if (instType.equals("FUTURES")) {
                    }
                    break;
            }
            xHZ.KWHzl.EZpvd();
            Function1<? super TokenBusinessData, Unit> function1 = this.fetchVPNInfo;
            if (function1 == null) {
                AEQbTJ(KWHzl(tokenBusinessData.getInstType()));
            } else if (function1 != null) {
                function1.invoke(tokenBusinessData);
            }
            copydefault(tokenBusinessData.getInstType(), this.KWHzl.indexOf(tokenBusinessData));
            return;
        }
        xHZ xhz = xHZ.KWHzl;
        xhz.KWHzl("trade_top_header");
        xhz.KWHzl();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(java.lang.String str) {
        switch (str.hashCode()) {
            case -1956807563:
                return str.equals("OPTION") ? "trade_option" : "trade_manual";
            case -1201878036:
                if (str.equals("COPYTRADING")) {
                    return "copytrading";
                }
                break;
            case 2044812:
                if (str.equals("BOTS")) {
                    return "trade_tactics";
                }
                break;
            case 1669573011:
                if (str.equals("CONVERT")) {
                    return "trade_convert";
                }
                break;
            case 1983970406:
                if (str.equals("CEDEFI")) {
                    return "trade_cedefi_dex";
                }
                break;
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        FragmentActivity fragmentActivityCopydefault = copydefault(context);
        if (fragmentActivityCopydefault == null || (supportFragmentManager = fragmentActivityCopydefault.getSupportFragmentManager()) == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_trade_mode", str);
        Unit unit = Unit.INSTANCE;
        supportFragmentManager.setFragmentResult("SWITCH_TRADE_MODE", bundle);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void copydefault(java.lang.String str, final int i) {
        final java.lang.String str2;
        switch (str.hashCode()) {
            case -1956807563:
                str2 = !str.equals("OPTION") ? null : "options";
                break;
            case -1201878036:
                str2 = !str.equals("COPYTRADING") ? null : "marketplace";
                break;
            case 2044812:
                str2 = !str.equals("BOTS") ? null : "bots";
                break;
            case 2552066:
                str2 = !str.equals("SPOT") ? null : "spot";
                break;
            case 2558355:
                str2 = !str.equals("SWAP") ? null : "futures";
                break;
            case 1669573011:
                str2 = !str.equals("CONVERT") ? null : "convert";
                break;
            case 1983970406:
                str2 = !str.equals("CEDEFI") ? null : "dex";
                break;
            default:
                str2 = null;
                break;
        }
        if (str2 != null) {
            C32866mlf.onEvent$default("Trade_TopBarBizNaviagtion_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.uto
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49707utd.EZpvd(str2, i, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit EZpvd(java.lang.String str, int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "position", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.utd$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return (C49707utd.this.AYXKKw && i == C49707utd.this.KWHzl.size()) ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            if (i == 1) {
                android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C49511upt.StateListAnimator.uzCIH, viewGroup, false);
                C49707utd c49707utd = C49707utd.this;
                Intrinsics.copydefault(viewInflate);
                return new Application(c49707utd, viewInflate);
            }
            android.view.View viewInflate2 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C49511upt.StateListAnimator.getFieldNames, viewGroup, false);
            C49707utd c49707utd2 = C49707utd.this;
            Intrinsics.copydefault(viewInflate2);
            return new Activity(c49707utd2, viewInflate2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return C49707utd.this.KWHzl.size() + (C49707utd.this.AYXKKw ? 1 : 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            if (viewHolder instanceof Activity) {
                java.lang.Object obj = C49707utd.this.KWHzl.get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "");
                ((Activity) viewHolder).OLrzqt((TokenBusinessData) obj);
            } else if (viewHolder instanceof Application) {
                ((Application) viewHolder).copydefault();
            }
        }
    }

    public final void AEQbTJ() {
        if (getVisibility() == 4) {
            return;
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        FragmentActivity fragmentActivityCopydefault = copydefault(context);
        if (fragmentActivityCopydefault == null) {
            return;
        }
        java.util.ArrayList<TokenBusinessData> arrayListEZpvd = EZpvd(this.AkhnZx);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListEZpvd, 10));
        int i = 0;
        for (java.lang.Object obj : arrayListEZpvd) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            TokenBusinessData tokenBusinessData = (TokenBusinessData) obj;
            java.lang.String orderType = tokenBusinessData.getOrderType();
            java.lang.String strCopydefault = C49640usP.OLrzqt.copydefault(tokenBusinessData.getInstType(), java.lang.Boolean.valueOf(tokenBusinessData.isPreMarket()));
            boolean z = true;
            if (getDisabledSet$default(this, null, 1, null).contains(tokenBusinessData.getOrderType()) && !this.DbNXlk.contains(tokenBusinessData.getOrderType())) {
                z = false;
            }
            arrayList.add(new BizSettingItem(orderType, strCopydefault, z, this.DbNXlk.contains(tokenBusinessData.getOrderType())));
            i++;
        }
        C49627usC.TaskDescription taskDescription = C49627usC.Companion;
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivityCopydefault.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        taskDescription.copydefault(supportFragmentManager, arrayList, this.DbNXlk, new Function0() { // from class: o.utb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49707utd.gEmmrt(this.AEQbTJ);
            }
        });
    }

    public final void KWHzl(final boolean z) {
        java.util.Iterator<TokenBusinessData> it = this.KWHzl.iterator();
        final int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().isSelect()) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        this.AuCTel.post(new java.lang.Runnable() { // from class: o.utg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49707utd.OLrzqt(this.OLrzqt, i, z);
            }
        });
    }
}
