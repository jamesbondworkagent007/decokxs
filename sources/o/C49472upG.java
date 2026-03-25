package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.tradeuilib.borrowdata.simplemodeborrow.BorrowedCoinAdjustLeverPresenter;
import com.okinc.unify_trade.biz.AdjustLeverRequiredData;
import com.okinc.unify_trade.biz.LeverIntervalData;
import com.okinc.unify_trade.biz.LeverageReq;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.upG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49472upG extends AbstractC49732uuB {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public Function1<? super java.lang.String, Unit> djBIcL;
    public InterfaceC58217yxC gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public float copydefault = 0.95f;
    public int AYXKKw = 1;

    /* JADX INFO: renamed from: o.upG$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "BorrowedCoinAdjustLeverFragment";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.AYXKKw = i;
    }

    public C49472upG() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradeuilib.borrowdata.simplemodeborrow.BorrowedCoinAdjustLeverFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradeuilib.borrowdata.simplemodeborrow.BorrowedCoinAdjustLeverFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BorrowedCoinAdjustLeverPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradeuilib.borrowdata.simplemodeborrow.BorrowedCoinAdjustLeverFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradeuilib.borrowdata.simplemodeborrow.BorrowedCoinAdjustLeverFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradeuilib.borrowdata.simplemodeborrow.BorrowedCoinAdjustLeverFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: o.upG$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.upG.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C49472upG copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull Function1<? super android.content.Context, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C49472upG c49472upG = new C49472upG();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("instType", str2);
            bundle.putString("instId", str);
            bundle.putString("selected_ccy", str3);
            bundle.putString("current_leverage", str4);
            c49472upG.setArguments(bundle);
            c49472upG.KWHzl(function1);
            return c49472upG;
        }
    }

    /* JADX DEBUG: Possible override for method o.uuB.OLrzqt()V */
    public final BorrowedCoinAdjustLeverPresenter OLrzqt() {
        return (BorrowedCoinAdjustLeverPresenter) this.valueOf.getValue();
    }

    @Override // o.AbstractC49732uuB, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        this.AEQbTJ = arguments != null ? arguments.getString("instType") : null;
        android.os.Bundle arguments2 = getArguments();
        this.EZpvd = arguments2 != null ? arguments2.getString("instId") : null;
        android.os.Bundle arguments3 = getArguments();
        this.KWHzl = arguments3 != null ? arguments3.getString("selected_ccy") : null;
        iwGUEr();
        BorrowedCoinAdjustLeverPresenter borrowedCoinAdjustLeverPresenterOLrzqt = OLrzqt();
        java.lang.String str = this.KWHzl;
        if (str == null) {
            str = "";
        }
        borrowedCoinAdjustLeverPresenterOLrzqt.copydefault(str);
        BorrowedCoinAdjustLeverPresenter borrowedCoinAdjustLeverPresenterOLrzqt2 = OLrzqt();
        java.lang.String strFetchVPNInfo = fetchVPNInfo();
        java.lang.String str2 = this.KWHzl;
        if (str2 == null) {
            str2 = "";
        }
        borrowedCoinAdjustLeverPresenterOLrzqt2.EZpvd(strFetchVPNInfo, str2, new Function0() { // from class: o.upQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49472upG.AEQbTJ(this.EZpvd);
            }
        });
        isConnected().fetchVPNInfo.setVisibility(0);
        isConnected().AkhnZx.setVisibility(0);
        KWHzl(8);
        AuCTel();
        copydefault(true);
        copydefault(true, "--");
        AEQbTJ();
        C55001xbh c55001xbh = isConnected().values;
        Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
        EZpvd(c55001xbh);
    }

    public static final Unit AEQbTJ(C49472upG c49472upG) {
        c49472upG.getFieldNames();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC49732uuB, o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        android.os.Bundle arguments = getArguments();
        this.KWHzl = arguments != null ? arguments.getString("selected_ccy") : null;
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
        wxq.setGravity(3);
        wxq.setTitle(this.KWHzl + " " + C33070mpX.AYXKKw(C49511upt.Activity.AxsJAYsNCnLh));
    }

    private final void iwGUEr() {
        C56111xwe<java.util.List<LeverIntervalData>> c56111xweEZpvd = OLrzqt().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweEZpvd.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.upF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49472upG.copydefault(this.KWHzl, (java.util.List) obj);
            }
        }));
        TradeLiveData<C49483upR> tradeLiveDataOLrzqt = OLrzqt().OLrzqt();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataOLrzqt.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.upL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49472upG.KWHzl(this.copydefault, (C49483upR) obj);
            }
        }));
        C56111xwe<java.util.List<AdjustLeverRequiredData>> c56111xweCopydefault = OLrzqt().copydefault();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweCopydefault.observe(viewLifecycleOwner3, new StateListAnimator(new Function1() { // from class: o.upH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49472upG.OLrzqt(this.copydefault, (java.util.List) obj);
            }
        }));
        C56111xwe<java.util.ArrayList<LeverageReq>> c56111xweAhwBna = OLrzqt().AhwBna();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweAhwBna.observe(viewLifecycleOwner4, new StateListAnimator(new Function1() { // from class: o.upM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49472upG.KWHzl(this.copydefault, (java.util.ArrayList) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().AEQbTJ().AhwBna();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner5, new StateListAnimator(new Function1() { // from class: o.upP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49472upG.KWHzl(this.EZpvd, (java.lang.Exception) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna2 = OLrzqt().KWHzl().AhwBna();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        c56109xwcAhwBna2.observe(viewLifecycleOwner6, new StateListAnimator(new Function1() { // from class: o.upN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49472upG.EZpvd(this.copydefault, (java.lang.Exception) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna3 = OLrzqt().djBIcL().AhwBna();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        c56109xwcAhwBna3.observe(viewLifecycleOwner7, new StateListAnimator(new Function1() { // from class: o.upO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49472upG.valueOf(this.copydefault, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit copydefault(C49472upG c49472upG, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        BorrowedCoinAdjustLeverPresenter borrowedCoinAdjustLeverPresenterOLrzqt = c49472upG.OLrzqt();
        if (borrowedCoinAdjustLeverPresenterOLrzqt != null) {
            borrowedCoinAdjustLeverPresenterOLrzqt.KWHzl(list);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C49472upG c49472upG, C49483upR c49483upR) {
        Intrinsics.checkNotNullParameter(c49483upR, "");
        c49472upG.EZpvd("", c49483upR.KWHzl(), c49483upR.OLrzqt());
        c49472upG.KWHzl(c49483upR.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C49472upG c49472upG, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c49472upG.DbNXlk())) {
            c49472upG.OLrzqt("");
        }
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            C49546uqb c49546uqb = C49546uqb.AEQbTJ;
            c49472upG.copydefault(true, c49546uqb.AEQbTJ(((AdjustLeverRequiredData) list.get(0)).getMaxAmount(), java.lang.Integer.valueOf(c49546uqb.AEQbTJ(c49472upG.KWHzl)), c49472upG.KWHzl, RoundingMode.UP));
        }
        C49483upR value = c49472upG.OLrzqt().OLrzqt().getValue();
        java.lang.String strOLrzqt = null;
        java.lang.String strKWHzl = C33129mqd.valueOf(value != null ? value.KWHzl() : null, 0) ? "0.01" : value != null ? value.KWHzl() : null;
        if (C33129mqd.valueOf(value != null ? value.OLrzqt() : null, 0)) {
            strOLrzqt = "50";
        } else if (value != null) {
            strOLrzqt = value.OLrzqt();
        }
        c49472upG.copydefault(c49472upG.OLrzqt().AEQbTJ(c49472upG.fetchVPNInfo(), strKWHzl, strOLrzqt));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C49472upG c49472upG, java.util.ArrayList arrayList) {
        Function1<? super java.lang.String, Unit> function1;
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (C33129mqd.KWHzl((java.util.Collection) arrayList) && (function1 = c49472upG.djBIcL) != null) {
            function1.invoke(((LeverageReq) arrayList.get(0)).getLever());
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C49472upG c49472upG, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c49472upG.EZpvd("", "0.01", "50");
        c49472upG.KWHzl("1,2,3,5,10,20,30,50");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C49472upG c49472upG, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c49472upG.copydefault(true, "--");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) exc.getMessage())) {
            java.lang.String message = exc.getMessage();
            c49472upG.OLrzqt(message != null ? message : "");
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C49472upG c49472upG, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) exc.getMessage())) {
            java.lang.String message = exc.getMessage();
            c49472upG.OLrzqt(message != null ? message : "");
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        int i = 0;
        if (listSplit$default.size() == 1 && Intrinsics.EZpvd(listSplit$default.get(0), (java.lang.Object) "")) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
        for (java.lang.Object obj : listSplit$default) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str2 = (java.lang.String) obj;
            arrayList.add(new C49777uuu(str2 + "x", str2, C33129mqd.OLrzqt(str2, fetchVPNInfo()), i));
            i++;
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            OLrzqt(arrayList);
        }
    }

    @Override // o.AbstractC49732uuB
    public void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.just("").delay(300L, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.upT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49472upG.AEQbTJ(this.OLrzqt, str, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.upJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49472upG.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.upK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49472upG.OLrzqt(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        this.gEmmrt = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.upI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49472upG.copydefault(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(final C49472upG c49472upG, java.lang.String str, java.lang.String str2) {
        c49472upG.OLrzqt().EZpvd(str, c49472upG.KWHzl, new Function0() { // from class: o.upE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49472upG.OLrzqt(this.KWHzl);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C49472upG c49472upG) {
        c49472upG.getFieldNames();
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C49472upG c49472upG, java.lang.Throwable th) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) th.getMessage())) {
            java.lang.String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            c49472upG.OLrzqt(message);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC49732uuB
    public void AEQbTJ(@NotNull java.lang.String str) {
        android.view.Window window;
        Intrinsics.checkNotNullParameter(str, "");
        C33054mpH.copydefault(this);
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(3);
        }
        BorrowedCoinAdjustLeverPresenter borrowedCoinAdjustLeverPresenterOLrzqt = OLrzqt();
        java.lang.String str2 = this.KWHzl;
        borrowedCoinAdjustLeverPresenterOLrzqt.KWHzl(str, str2 != null ? str2 : "");
        EZpvd();
    }

    @Override // o.AbstractC49732uuB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    private final void getFieldNames() {
        copydefault(true, "--");
        AkhnZx("");
        copydefault(false);
    }

    public final void OLrzqt(java.lang.String str) {
        AkhnZx(str);
        copydefault(false);
    }

    public final void AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("current_leverage") : null;
        if (string == null) {
            string = "";
        }
        isConnected().AkhnZx.setText(C49855uwS.getLeverShow$default(C49855uwS.copydefault, string, false, 2, null));
    }

    public final void EZpvd() {
        C32866mlf.onEvent$default("PlaceOrder_Borrowmanage_AdjustLeverage_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }
}
