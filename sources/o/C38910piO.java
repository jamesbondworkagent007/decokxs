package o;

import android.animation.Animator;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.ui.NewCoinIntroContainerFragment$initView$3$2;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.WatchListBean;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.piO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38910piO extends AbstractC38566pbp {
    public static final Application Companion = new Application(null);
    public static final int valueOf = 8;
    public java.lang.String AYXKKw;
    public InterfaceC39502ptZ AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public java.lang.String djBIcL;
    public oPK gEmmrt;
    public C54822xWp isConnected;
    public boolean values;
    public java.util.ArrayList<WatchListData> DbNXlk = new java.util.ArrayList<>();
    public MarketCoinInfo fetchVPNInfo = new MarketCoinInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
    public MarketTopInfo fIwbmz = new MarketTopInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, 16777215, null);

    /* JADX INFO: renamed from: o.piO$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.RIuxYh;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public C38910piO() {
        final Function0 function0 = null;
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCZ.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.NewCoinIntroContainerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.NewCoinIntroContainerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.NewCoinIntroContainerFragment$special$$inlined$activityViewModels$default$3
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
    }

    /* JADX INFO: renamed from: o.piO$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.piO.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C38910piO newInstance$default(Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, InterfaceC39502ptZ interfaceC39502ptZ, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                interfaceC39502ptZ = null;
            }
            return application.AEQbTJ(str, str2, str3, interfaceC39502ptZ);
        }

        public final C38910piO AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, InterfaceC39502ptZ interfaceC39502ptZ) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C38910piO c38910piO = new C38910piO();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("data", str);
            bundle.putString(oLT.gEmmrt(), str2);
            bundle.putString(oLT.valueOf(), str3);
            c38910piO.setArguments(bundle);
            c38910piO.AhwBna = interfaceC39502ptZ;
            return c38910piO;
        }
    }

    public final pCZ gEmmrt() {
        return (pCZ) this.AkhnZx.getValue();
    }

    /* JADX DEBUG: Possible override for method o.pbp.AEQbTJ()V */
    public final java.lang.String AEQbTJ() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("data")) == null) ? "BTC" : string;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.gEmmrt = oPK.AEQbTJ(view);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelProvider.Factory defaultViewModelProviderFactory = requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            C54822xWp c54822xWp = (C54822xWp) new ViewModelProvider(activity, defaultViewModelProviderFactory).get(C54822xWp.class);
            if (c54822xWp != null) {
                this.isConnected = c54822xWp;
                c54822xWp.KWHzl().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.piP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C38910piO.EZpvd(this.EZpvd, (MarketCoinInfo) obj);
                    }
                }));
                getChildFragmentManager().setFragmentResultListener("market.route_to_feed_tab_event", this, new FragmentResultListener() { // from class: o.piT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.fragment.app.FragmentResultListener
                    public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                        C38910piO.copydefault(this.copydefault, str, bundle2);
                    }
                });
                return;
            }
        }
        pUU.copydefault("NewCoinIntroContainerFragment", "Activity is null, cannot init sharedViewModel");
    }

    public static final Unit EZpvd(C38910piO c38910piO, MarketCoinInfo marketCoinInfo) {
        c38910piO.fetchVPNInfo = marketCoinInfo;
        FragmentActivity activity = c38910piO.getActivity();
        if (activity != null && (activity instanceof ActivityC38834pgs)) {
            ((ActivityC38834pgs) activity).OLrzqt();
        }
        LifecycleOwnerKt.getLifecycleScope(c38910piO).launchWhenResumed(new NewCoinIntroContainerFragment$initView$3$2(marketCoinInfo, c38910piO, null));
        return Unit.INSTANCE;
    }

    public static final void copydefault(C38910piO c38910piO, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        C54822xWp c54822xWp = c38910piO.isConnected;
        if (c54822xWp == null) {
            Intrinsics.gEmmrt("");
            c54822xWp = null;
        }
        c54822xWp.copydefault("insights");
        c38910piO.gEmmrt().AEQbTJ().postValue("news");
    }

    private final void AYXKKw() {
        java.util.ArrayList arrayList;
        pWP pwp;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        C56131xwy c56131xwyFetchVPNInfo;
        InterfaceC54577xNn interfaceC54577xNn3;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3;
        C56131xwy c56131xwyFetchVPNInfo2;
        java.lang.Object obj = null;
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null)) {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM == null || (interfaceC54577xNn3 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt3 = interfaceC54577xNn3.OLrzqt()) == null || (c56131xwyFetchVPNInfo2 = interfaceC54581xNrOLrzqt3.fetchVPNInfo()) == null) {
                return;
            }
            c56131xwyFetchVPNInfo2.OLrzqt(new ActionBar());
            return;
        }
        InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        java.util.ArrayList<WatchListBean> arrayListAEQbTJ = (interfaceC49425uoM2 == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) == null || (c56131xwyFetchVPNInfo = interfaceC54581xNrOLrzqt2.fetchVPNInfo()) == null) ? null : c56131xwyFetchVPNInfo.AEQbTJ();
        if (arrayListAEQbTJ != null) {
            java.util.ArrayList<WatchListBean> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayListAEQbTJ) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((WatchListBean) obj2).getInstType(), (java.lang.Object) "COIN")) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (WatchListBean watchListBean : arrayList2) {
                if (Intrinsics.EZpvd((java.lang.Object) watchListBean.getInstType(), (java.lang.Object) "FUTURES")) {
                    InterfaceC49425uoM interfaceC49425uoM3 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                    pwp = (interfaceC49425uoM3 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM3.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "FUTURES", null, watchListBean.getInstId(), watchListBean.getAlias(), 2, null)) == null) ? null : new pWP(suggestedInstrument$default.getInstId(), suggestedInstrument$default.getInstType(), null, null, null, 28, null);
                } else {
                    pwp = new pWP(watchListBean.getInstId(), watchListBean.getInstType(), null, null, null, 28, null);
                }
                arrayList.add(pwp);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                pWP pwp2 = (pWP) next;
                if (Intrinsics.EZpvd((java.lang.Object) (pwp2 != null ? pwp2.AEQbTJ() : null), (java.lang.Object) this.fetchVPNInfo.getInstrumentId()) && Intrinsics.EZpvd((java.lang.Object) pwp2.KWHzl(), (java.lang.Object) this.fetchVPNInfo.getInstrumentType())) {
                    obj = next;
                    break;
                }
            }
            obj = (pWP) obj;
        }
        this.values = obj != null;
        fetchVPNInfo();
    }

    /* JADX INFO: renamed from: o.piO$ActionBar */
    public static final class ActionBar implements InterfaceC55701xos<java.util.List<? extends WatchListData>> {
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<WatchListData> list, java.lang.Exception exc) {
            java.lang.Object pwp;
            InterfaceC54577xNn interfaceC54577xNn;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            BizInstrument suggestedInstrument$default;
            if (!z || list == null) {
                return;
            }
            C38910piO.this.DbNXlk.clear();
            C38910piO.this.DbNXlk.addAll(list);
            C38910piO c38910piO = C38910piO.this;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (Intrinsics.EZpvd((java.lang.Object) ((WatchListData) obj).getInstType(), (java.lang.Object) c38910piO.fetchVPNInfo.getInstrumentType())) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                pwp = null;
                if (!it.hasNext()) {
                    break;
                }
                WatchListData watchListData = (WatchListData) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "FUTURES")) {
                    InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                    if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "FUTURES", null, watchListData.getInstId(), watchListData.getAlias(), 2, null)) != null) {
                        pwp = new pWP(suggestedInstrument$default.getInstId(), suggestedInstrument$default.getInstType(), null, null, null, 28, null);
                    }
                } else {
                    pwp = new pWP(watchListData.getInstId(), watchListData.getInstType(), null, null, null, 28, null);
                }
                arrayList2.add(pwp);
            }
            C38910piO c38910piO2 = C38910piO.this;
            java.util.Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next = it2.next();
                pWP pwp2 = (pWP) next;
                if (Intrinsics.EZpvd((java.lang.Object) (pwp2 != null ? pwp2.AEQbTJ() : null), (java.lang.Object) c38910piO2.fetchVPNInfo.getInstrumentId()) && Intrinsics.EZpvd((java.lang.Object) pwp2.KWHzl(), (java.lang.Object) c38910piO2.fetchVPNInfo.getInstrumentType())) {
                    pwp = next;
                    break;
                }
            }
            c38910piO2.values = pwp != null;
            C38910piO.this.fetchVPNInfo();
        }
    }

    /* JADX INFO: renamed from: o.piO$Activity */
    public static final class Activity implements Animator.AnimatorListener {
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Activity() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            C38910piO.this.djBIcL();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchVPNInfo() {
        android.widget.FrameLayout root;
        C38685peB c38685peBValueOf;
        android.animation.ValueAnimator valueAnimatorFJNWhG;
        InterfaceC39502ptZ interfaceC39502ptZ = this.AhwBna;
        if (interfaceC39502ptZ != null) {
            interfaceC39502ptZ.KWHzl(0, this.values);
        }
        FragmentActivity activity = getActivity();
        ActivityC38834pgs activityC38834pgs = activity instanceof ActivityC38834pgs ? (ActivityC38834pgs) activity : null;
        if (activityC38834pgs != null && (c38685peBValueOf = activityC38834pgs.valueOf()) != null && (valueAnimatorFJNWhG = c38685peBValueOf.fJNWhG()) != null) {
            valueAnimatorFJNWhG.addListener(new Activity());
        }
        oPK opk = this.gEmmrt;
        if (opk == null || (root = opk.getRoot()) == null) {
            return;
        }
        root.post(new java.lang.Runnable() { // from class: o.piS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C38910piO.gEmmrt(this.KWHzl);
            }
        });
    }

    public static final void gEmmrt(C38910piO c38910piO) {
        C38685peB c38685peBValueOf;
        FragmentActivity activity = c38910piO.getActivity();
        ActivityC38834pgs activityC38834pgs = activity instanceof ActivityC38834pgs ? (ActivityC38834pgs) activity : null;
        if (activityC38834pgs == null || (c38685peBValueOf = activityC38834pgs.valueOf()) == null) {
            return;
        }
        c38685peBValueOf.OLrzqt(true);
    }

    public final void djBIcL() {
        AhwBna();
        InterfaceC39502ptZ interfaceC39502ptZ = this.AhwBna;
        if (interfaceC39502ptZ != null) {
            interfaceC39502ptZ.AEQbTJ(this.fIwbmz);
            interfaceC39502ptZ.dUDNAs();
        }
    }

    public final void AhwBna() {
        BizInstrument minSuggestedInstrument$default;
        java.lang.String safeString$default;
        java.lang.String tradeSymbol;
        java.lang.String quoteSymbol;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xMW xmwKWHzl;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLEZpvd;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLDjBIcL;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class);
        TradeKey tradeKey = TradeKey.MANAGER;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) interfaceC49425uoM.KWHzl(tradeKey)).copydefault();
        java.lang.String str = "";
        if (interfaceC54581xNrCopydefault != null) {
            java.lang.String str2 = this.AYXKKw;
            if (str2 == null) {
                str2 = "";
            }
            minSuggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, this.djBIcL, null, null, 12, null);
        } else {
            minSuggestedInstrument$default = null;
        }
        this.fIwbmz.setTPriceNoTh("0");
        this.fIwbmz.setTPrice(pDM.EZpvd(AudioStats.AUDIO_AMPLITUDE_NONE, 4));
        MarketTopInfo marketTopInfo = this.fIwbmz;
        InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM2 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(tradeKey)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl()) == null || (c54536xMLAYXKKw = xmwKWHzl.AYXKKw("0.0000")) == null || (c54536xMLEZpvd = c54536xMLAYXKKw.EZpvd("4")) == null || (c54536xMLAkhnZx = c54536xMLEZpvd.AkhnZx()) == null || (c54536xMLAEQbTJ = c54536xMLAkhnZx.AEQbTJ(true)) == null || (c54536xMLDjBIcL = c54536xMLAEQbTJ.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) {
            safeString$default = "";
        }
        marketTopInfo.setTLocalPrice(safeString$default);
        this.fIwbmz.setTIncrease(pTB.formatPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE)), 0, null, 3, null));
        MarketTopInfo marketTopInfo2 = this.fIwbmz;
        marketTopInfo2.setT24HighPrice(marketTopInfo2.getTPrice());
        MarketTopInfo marketTopInfo3 = this.fIwbmz;
        marketTopInfo3.setT24LowPrice(marketTopInfo3.getTPrice());
        MarketTopInfo marketTopInfo4 = this.fIwbmz;
        java.lang.String tPrice = marketTopInfo4.getTPrice();
        if (minSuggestedInstrument$default == null || (tradeSymbol = minSuggestedInstrument$default.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        marketTopInfo4.setT24Volume(new kotlin.Pair<>(tPrice, tradeSymbol));
        MarketTopInfo marketTopInfo5 = this.fIwbmz;
        java.lang.String tPrice2 = marketTopInfo5.getTPrice();
        if (minSuggestedInstrument$default != null && (quoteSymbol = minSuggestedInstrument$default.getQuoteSymbol()) != null) {
            str = quoteSymbol;
        }
        marketTopInfo5.setT24Turnover(new kotlin.Pair<>(tPrice2, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void valueOf() {
        C38685peB c38685peBValueOf;
        FragmentActivity activity = getActivity();
        ActivityC38834pgs activityC38834pgs = activity instanceof ActivityC38834pgs ? (ActivityC38834pgs) activity : null;
        if (activityC38834pgs != null && (c38685peBValueOf = activityC38834pgs.valueOf()) != null) {
            c38685peBValueOf.zLjUOn();
        }
        AYXKKw();
    }
}
