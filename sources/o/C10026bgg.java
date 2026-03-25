package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.defi.biz.constant.EOSState;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.rxutils.RxBus;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC9955bfO;
import o.Bitmap;
import o.C10026bgg;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC9742bbN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bgg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10026bgg extends AbstractC9966bfZ implements ActivityC9955bfO.TaskDescription, ActivityC9955bfO.Application {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public AbstractC16651enu EZpvd;
    public final int OLrzqt = C13754dXa.TaskDescription.RqmePg;
    public long copydefault;
    public final java.util.ArrayList<java.lang.Object> djBIcL;
    public boolean gEmmrt;
    public boolean valueOf;

    /* JADX INFO: renamed from: o.bgg$Activity */
    public static final class Activity extends StateListAnimator {
    }

    /* JADX INFO: renamed from: o.bgg$Application */
    public static final class Application {
    }

    /* JADX INFO: renamed from: o.bgg$FragmentManager */
    public static final /* synthetic */ class FragmentManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(Function1 function1) {
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

    /* JADX INFO: renamed from: o.bgg$LoaderManager */
    public static final class LoaderManager extends StateListAnimator {
    }

    /* JADX INFO: renamed from: o.bgg$StateListAnimator */
    public static class StateListAnimator {
        public java.lang.String AEQbTJ = "";
        public int KWHzl;
        public Function0<Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(int i) {
            this.KWHzl = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(Function0<Unit> function0) {
            this.OLrzqt = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }
    }

    /* JADX INFO: renamed from: o.bgg$TaskDescription */
    public static final class TaskDescription {
        public CustomChainCoinMeta AYXKKw;
        public C10594brR AhwBna;
        public int DbNXlk;
        public boolean EZpvd;
        public C10525bqB KWHzl;
        public boolean copydefault;
        public java.lang.String valueOf = "";
        public java.lang.String gEmmrt = "";
        public java.lang.String AkhnZx = "";
        public java.lang.String djBIcL = "";
        public java.lang.String AEQbTJ = "";
        public java.lang.String OLrzqt = "";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C10594brR AEQbTJ() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(CustomChainCoinMeta customChainCoinMeta) {
            this.AYXKKw = customChainCoinMeta;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C10525bqB c10525bqB) {
            this.KWHzl = c10525bqB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C10594brR c10594brR) {
            this.AhwBna = c10594brR;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(int i) {
            this.DbNXlk = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C10525bqB copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.copydefault = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CustomChainCoinMeta djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void gEmmrt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AkhnZx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.djBIcL;
        }
    }

    public static final boolean KWHzl(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean OLrzqt(int i) {
        return i == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    public C10026bgg() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.assets.coinmanagement.SelectCoinFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.assets.coinmanagement.SelectCoinFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C10006bgM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.assets.coinmanagement.SelectCoinFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.assets.coinmanagement.SelectCoinFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.assets.coinmanagement.SelectCoinFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = new java.util.ArrayList<>();
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.bgp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10026bgg.djBIcL(this.OLrzqt);
            }
        });
        this.copydefault = Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: o.bgg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bgg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C10026bgg newInstance$default(ActionBar actionBar, boolean z, long j, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                j = Long.MIN_VALUE;
            }
            return actionBar.OLrzqt(z, j);
        }

        public final C10026bgg OLrzqt(boolean z, long j) {
            C10026bgg c10026bgg = new C10026bgg();
            c10026bgg.ensureArguments().putBoolean("support_custom_coin", z);
            c10026bgg.ensureArguments().putLong("chain_id", j);
            return c10026bgg;
        }
    }

    public final C10006bgM AEQbTJ() {
        return (C10006bgM) this.AYXKKw.getValue();
    }

    private final C59534zip EZpvd() {
        return (C59534zip) this.AhwBna.getValue();
    }

    public static final C59534zip djBIcL(C10026bgg c10026bgg) {
        return new C59534zip(c10026bgg.djBIcL);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.valueOf = ensureArguments().getBoolean("support_custom_coin");
        this.copydefault = ensureArguments().getLong("chain_id");
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        AbstractC16651enu abstractC16651enu = (AbstractC16651enu) viewDataBindingBind;
        this.EZpvd = abstractC16651enu;
        AbstractC16651enu abstractC16651enu2 = null;
        if (abstractC16651enu == null) {
            Intrinsics.gEmmrt("");
            abstractC16651enu = null;
        }
        abstractC16651enu.OLrzqt.setHasFixedSize(true);
        AbstractC16651enu abstractC16651enu3 = this.EZpvd;
        if (abstractC16651enu3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16651enu3 = null;
        }
        abstractC16651enu3.OLrzqt.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        AbstractC16651enu abstractC16651enu4 = this.EZpvd;
        if (abstractC16651enu4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16651enu2 = abstractC16651enu4;
        }
        abstractC16651enu2.OLrzqt.setAdapter(EZpvd());
        OLrzqt();
        copydefault();
        AEQbTJ().EZpvd(this.copydefault);
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C9934beu.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.bgj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10026bgg.EZpvd(this.AEQbTJ, (C9934beu) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.bgf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10026bgg.djBIcL(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C10026bgg c10026bgg, C9934beu c9934beu) {
        c10026bgg.gEmmrt = true;
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.gEmmrt) {
            AEQbTJ().EZpvd(this.copydefault);
            this.gEmmrt = false;
        }
    }

    public final void copydefault() {
        AEQbTJ().OLrzqt().observe(this, new FragmentManager(new Function1() { // from class: o.bgl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10026bgg.OLrzqt(this.KWHzl, (Bitmap) obj);
            }
        }));
    }

    public static final Unit OLrzqt(final C10026bgg c10026bgg, Bitmap bitmap) {
        if (bitmap instanceof Bitmap.StateListAnimator) {
            c10026bgg.dismissLoading();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (c10026bgg.AEQbTJ().copydefault()) {
                LoaderManager loaderManager = new LoaderManager();
                loaderManager.OLrzqt(c10026bgg.getString(C13754dXa.FragmentManager.requestPostMessageChannel));
                loaderManager.KWHzl(C52761wXj.TaskDescription.accept);
                loaderManager.OLrzqt(new Function0() { // from class: o.bgn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C10026bgg.gEmmrt(this.OLrzqt);
                    }
                });
                arrayList.add(loaderManager);
            }
            if (c10026bgg.valueOf) {
                Activity activity = new Activity();
                activity.OLrzqt(c10026bgg.getString(C13754dXa.FragmentManager.iLAtSv));
                activity.KWHzl(C52761wXj.TaskDescription.getPostValueLengthLimit);
                activity.OLrzqt(new Function0() { // from class: o.bgo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C10026bgg.valueOf(this.OLrzqt);
                    }
                });
                arrayList.add(activity);
            }
            if (!arrayList.isEmpty()) {
                arrayList.add(new Application());
            }
            java.util.List list = (java.util.List) ((Bitmap.StateListAnimator) bitmap).OLrzqt();
            if (list != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(((TaskDescription) next).gEmmrt() != 0 ? 1 : 0);
                    java.lang.Object arrayList2 = linkedHashMap.get(numValueOf);
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList();
                        linkedHashMap.put(numValueOf, arrayList2);
                    }
                    ((java.util.List) arrayList2).add(next);
                }
                if (linkedHashMap.containsKey(1) || linkedHashMap.containsKey(2)) {
                    arrayList.add(c10026bgg.getString(C13754dXa.FragmentManager.dXcUrg));
                    java.util.List list2 = (java.util.List) linkedHashMap.get(1);
                    if (list2 != null) {
                        arrayList.addAll(list2);
                    }
                }
                if (linkedHashMap.containsKey(0)) {
                    arrayList.add(c10026bgg.getString(C13754dXa.FragmentManager.iLWfRf));
                    java.util.List list3 = (java.util.List) linkedHashMap.get(0);
                    if (list3 != null) {
                        arrayList.addAll(list3);
                    }
                }
            }
            c10026bgg.djBIcL.clear();
            c10026bgg.djBIcL.addAll(arrayList);
            c10026bgg.EZpvd().notifyDataSetChanged();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c10026bgg, true, (java.lang.String) null, 2, (java.lang.Object) null);
            FragmentActivity activity2 = c10026bgg.getActivity();
            ActivityC9955bfO activityC9955bfO = activity2 instanceof ActivityC9955bfO ? (ActivityC9955bfO) activity2 : null;
            if (activityC9955bfO != null) {
                activityC9955bfO.EZpvd(c10026bgg.valueOf);
            }
            if (!c10026bgg.valueOf && c10026bgg.djBIcL.size() > 16) {
                FragmentActivity activity3 = c10026bgg.getActivity();
                ActivityC9955bfO activityC9955bfO2 = activity3 instanceof ActivityC9955bfO ? (ActivityC9955bfO) activity3 : null;
                if (activityC9955bfO2 != null) {
                    activityC9955bfO2.EZpvd(true);
                }
            }
        } else if (bitmap instanceof Bitmap.ActionBar) {
            c10026bgg.dismissLoading();
            C55326xho.toast$default(((Bitmap.ActionBar) bitmap).AEQbTJ(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else {
            c10026bgg.showLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(final C10026bgg c10026bgg) {
        FragmentActivity activity = c10026bgg.getActivity();
        if (activity != null) {
            ActivityC10083bhk.Companion.OLrzqt(activity, c10026bgg.copydefault);
            C32866mlf.onEvent$default("Web3WalletHomepage_ManageCrypto_RecentlyRemoved_Click", (TrackChannel[]) null, new Function1() { // from class: o.bgm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10026bgg.copydefault(this.KWHzl, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C10026bgg c10026bgg, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("network_selection", c10026bgg.AEQbTJ().copydefault(c10026bgg.copydefault), true);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C10026bgg c10026bgg) {
        FragmentActivity activity = c10026bgg.getActivity();
        if (activity != null) {
            ActivityC16100edZ.Companion.AEQbTJ(activity, c10026bgg.copydefault);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.bgg$Dialog */
    public static final class Dialog extends C43318rmy<Activity, AbstractC16826erJ> {

        /* JADX INFO: renamed from: o.bgg$Dialog$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ Activity AEQbTJ;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ long OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, Activity activity) {
                this.KWHzl = view;
                this.OLrzqt = j;
                this.AEQbTJ = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    Function0<Unit> function0AEQbTJ = this.AEQbTJ.AEQbTJ();
                    if (function0AEQbTJ != null) {
                        function0AEQbTJ.invoke();
                    }
                }
            }
        }

        public Dialog(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC16826erJ> c43312rms, Activity activity) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(activity, "");
            super.onBindViewHolder((C43312rms) c43312rms, activity);
            if (activity.copydefault() != 0) {
                ((AbstractC16826erJ) c43312rms.OLrzqt()).EZpvd.setImageResource(activity.copydefault());
            }
            android.view.View root = ((AbstractC16826erJ) c43312rms.OLrzqt()).getRoot();
            root.setOnClickListener(new Application(root, 1000L, activity));
        }
    }

    /* JADX INFO: renamed from: o.bgg$PendingIntent */
    public static final class PendingIntent extends C43318rmy<LoaderManager, AbstractC16826erJ> {

        /* JADX INFO: renamed from: o.bgg$PendingIntent$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ LoaderManager copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, LoaderManager loaderManager) {
                this.EZpvd = view;
                this.OLrzqt = j;
                this.copydefault = loaderManager;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    Function0<Unit> function0AEQbTJ = this.copydefault.AEQbTJ();
                    if (function0AEQbTJ != null) {
                        function0AEQbTJ.invoke();
                    }
                }
            }
        }

        public PendingIntent(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC16826erJ> c43312rms, LoaderManager loaderManager) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(loaderManager, "");
            super.onBindViewHolder((C43312rms) c43312rms, loaderManager);
            if (loaderManager.copydefault() != 0) {
                ((AbstractC16826erJ) c43312rms.OLrzqt()).EZpvd.setImageResource(loaderManager.copydefault());
            }
            android.view.View root = ((AbstractC16826erJ) c43312rms.OLrzqt()).getRoot();
            root.setOnClickListener(new StateListAnimator(root, 1000L, loaderManager));
        }
    }

    private final void OLrzqt() {
        EZpvd().register(java.lang.String.class, new C43318rmy(C13754dXa.TaskDescription.RLmrWm, dTV.fIwbmz));
        C59534zip c59534zipEZpvd = EZpvd();
        int i = C13754dXa.TaskDescription.QiTXOm;
        int i2 = dTV.valueOf;
        c59534zipEZpvd.register(Activity.class, new Dialog(i, i2));
        EZpvd().register(LoaderManager.class, new PendingIntent(C13754dXa.TaskDescription.QiTXOm, i2));
        EZpvd().register(Application.class, new C43318rmy(C13754dXa.TaskDescription.OrsvgJ, dTV.AhwBna));
        EZpvd().register(TaskDescription.class, new Fragment(C13754dXa.TaskDescription.QnnRaN, dTV.AYXKKw));
    }

    /* JADX INFO: renamed from: o.bgg$Fragment */
    public static final class Fragment extends C43318rmy<TaskDescription, AbstractC16823erG> {
        public Fragment(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(C43312rms<AbstractC16823erG> c43312rms, TaskDescription taskDescription) {
            java.lang.String strOLrzqt;
            java.lang.String string;
            boolean z;
            java.lang.String displayAmount$default;
            C10854bwM c10854bwMKWHzl;
            AbstractC12782ctV abstractC12782ctVValues;
            C13852daR c13852daRODWQjV;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(taskDescription, "");
            super.onBindViewHolder((C43312rms) c43312rms, taskDescription);
            if (!taskDescription.OLrzqt()) {
                strOLrzqt = taskDescription.AYXKKw();
            } else {
                java.lang.Character chWlaJM = C59454zhO.wlaJM(taskDescription.isConnected());
                if (chWlaJM == null || (string = chWlaJM.toString()) == null || (strOLrzqt = C9700baY.OLrzqt(string)) == null) {
                    strOLrzqt = "";
                }
            }
            taskDescription.OLrzqt(strOLrzqt);
            android.widget.ImageView imageView = ((AbstractC16823erG) c43312rms.OLrzqt()).copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C57659ymb.loadFixSizeBorderImage$default(imageView, taskDescription.AYXKKw(), C52761wXj.TaskDescription.aHXSQp, 0.0f, 0.0f, 12, null);
            boolean z2 = taskDescription.gEmmrt() != 0;
            C10525bqB c10525bqBCopydefault = taskDescription.copydefault();
            if (c10525bqBCopydefault == null || (c10854bwMKWHzl = c10525bqBCopydefault.KWHzl()) == null || !c10854bwMKWHzl.OuxcSI()) {
                z = false;
            } else {
                C10525bqB c10525bqBCopydefault2 = taskDescription.copydefault();
                if (((c10525bqBCopydefault2 == null || (abstractC12782ctVValues = c10525bqBCopydefault2.values()) == null || (c13852daRODWQjV = abstractC12782ctVValues.ODWQjV()) == null) ? null : c13852daRODWQjV.valueOf()) != EOSState.Opened) {
                    z = true;
                }
            }
            android.widget.TextView textView = ((AbstractC16823erG) c43312rms.OLrzqt()).EZpvd;
            C13821dZn c13821dZn = C13821dZn.EZpvd;
            if (taskDescription.OLrzqt()) {
                C10594brR c10594brRAEQbTJ = taskDescription.AEQbTJ();
                displayAmount$default = c10594brRAEQbTJ != null ? c10594brRAEQbTJ.AYXKKw() : null;
                if (displayAmount$default == null) {
                    displayAmount$default = "";
                }
            } else {
                C10525bqB c10525bqBCopydefault3 = taskDescription.copydefault();
                displayAmount$default = c10525bqBCopydefault3 != null ? InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqBCopydefault3, false, true, 1, null) : null;
                if (displayAmount$default == null) {
                }
            }
            textView.setText(c13821dZn.KWHzl(displayAmount$default));
            Intrinsics.copydefault(textView);
            textView.setVisibility((!z2 || z) ? 8 : 0);
            android.widget.TextView textView2 = ((AbstractC16823erG) c43312rms.OLrzqt()).djBIcL;
            C10525bqB c10525bqBCopydefault4 = taskDescription.copydefault();
            java.lang.String strOLrzqt2 = c10525bqBCopydefault4 != null ? c10525bqBCopydefault4.OLrzqt(true) : null;
            textView2.setText(c13821dZn.KWHzl(strOLrzqt2 != null ? strOLrzqt2 : ""));
            Intrinsics.copydefault(textView2);
            textView2.setVisibility((!z2 || z || taskDescription.OLrzqt()) ? 8 : 0);
            ((AbstractC16823erG) c43312rms.OLrzqt()).AEQbTJ.setAlpha(1.0f);
            ((AbstractC16823erG) c43312rms.OLrzqt()).valueOf.clearAnimation();
            ((AbstractC16823erG) c43312rms.OLrzqt()).valueOf.setAlpha(0.0f);
            ((AbstractC16823erG) c43312rms.OLrzqt()).AEQbTJ.setCheckState(taskDescription.gEmmrt());
            ((AbstractC16823erG) c43312rms.OLrzqt()).AEQbTJ.setOnCheckStateChangeListener(new StateListAnimator(taskDescription, C10026bgg.this, c43312rms));
        }

        /* JADX INFO: renamed from: o.bgg$Fragment$StateListAnimator */
        public static final class StateListAnimator implements InterfaceC10330bmS {
            public final /* synthetic */ TaskDescription EZpvd;
            public final /* synthetic */ C10026bgg KWHzl;
            public final /* synthetic */ C43312rms<AbstractC16823erG> copydefault;

            public StateListAnimator(TaskDescription taskDescription, C10026bgg c10026bgg, C43312rms<AbstractC16823erG> c43312rms) {
                this.EZpvd = taskDescription;
                this.KWHzl = c10026bgg;
                this.copydefault = c43312rms;
            }

            @Override // o.InterfaceC10330bmS
            public void KWHzl(final C10324bmM c10324bmM, final int i) {
                Intrinsics.checkNotNullParameter(c10324bmM, "");
                if (i == 1 && !this.EZpvd.OLrzqt()) {
                    C10026bgg c10026bgg = this.KWHzl;
                    C10525bqB c10525bqBCopydefault = this.EZpvd.copydefault();
                    Intrinsics.copydefault(c10525bqBCopydefault);
                    final C10026bgg c10026bgg2 = this.KWHzl;
                    final TaskDescription taskDescription = this.EZpvd;
                    if (c10026bgg.EZpvd(c10525bqBCopydefault, new Function1() { // from class: o.bgq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C10026bgg.Fragment.StateListAnimator.copydefault(c10026bgg2, c10324bmM, i, taskDescription, ((java.lang.Boolean) obj).booleanValue());
                        }
                    })) {
                        return;
                    }
                }
                if (i != 1) {
                    C10006bgM c10006bgMAEQbTJ = this.KWHzl.AEQbTJ();
                    final TaskDescription taskDescription2 = this.EZpvd;
                    final C10026bgg c10026bgg3 = this.KWHzl;
                    c10006bgMAEQbTJ.copydefault(c10324bmM, i, taskDescription2, new Function0() { // from class: o.bgu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C10026bgg.Fragment.StateListAnimator.copydefault(c10026bgg3, taskDescription2);
                        }
                    });
                    return;
                }
                ((AbstractC16823erG) this.copydefault.OLrzqt()).AEQbTJ.animate().setListener(new Application(this.copydefault, this.KWHzl, c10324bmM, i, this.EZpvd)).alpha(0.0f).start();
            }

            public static final Unit copydefault(final C10026bgg c10026bgg, C10324bmM c10324bmM, int i, final TaskDescription taskDescription, boolean z) {
                if (z) {
                    c10026bgg.AEQbTJ().copydefault(c10324bmM, i, taskDescription, new Function0() { // from class: o.bgr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C10026bgg.Fragment.StateListAnimator.EZpvd(c10026bgg, taskDescription);
                        }
                    });
                } else {
                    c10324bmM.setCheckState(0);
                }
                return Unit.INSTANCE;
            }

            public static final Unit EZpvd(C10026bgg c10026bgg, TaskDescription taskDescription) {
                c10026bgg.AEQbTJ(taskDescription);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: o.bgg$Fragment$StateListAnimator$Application */
            public static final class Application extends android.animation.AnimatorListenerAdapter {
                public final /* synthetic */ C10026bgg AEQbTJ;
                public final /* synthetic */ TaskDescription EZpvd;
                public final /* synthetic */ C43312rms<AbstractC16823erG> KWHzl;
                public final /* synthetic */ C10324bmM OLrzqt;
                public final /* synthetic */ int copydefault;

                public Application(C43312rms<AbstractC16823erG> c43312rms, C10026bgg c10026bgg, C10324bmM c10324bmM, int i, TaskDescription taskDescription) {
                    this.KWHzl = c43312rms;
                    this.AEQbTJ = c10026bgg;
                    this.OLrzqt = c10324bmM;
                    this.copydefault = i;
                    this.EZpvd = taskDescription;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    Intrinsics.checkNotNullParameter(animator, "");
                    ((AbstractC16823erG) this.KWHzl.OLrzqt()).AEQbTJ.setAlpha(0.0f);
                    ((AbstractC16823erG) this.KWHzl.OLrzqt()).valueOf.setAlpha(1.0f);
                    ((AbstractC16823erG) this.KWHzl.OLrzqt()).valueOf.setAnimation(C13754dXa.Fragment.AEQbTJ);
                    ((AbstractC16823erG) this.KWHzl.OLrzqt()).valueOf.addAnimatorListener(new Activity(this.KWHzl, this.AEQbTJ, this.OLrzqt, this.copydefault, this.EZpvd));
                    ((AbstractC16823erG) this.KWHzl.OLrzqt()).valueOf.playAnimation();
                }

                /* JADX INFO: renamed from: o.bgg$Fragment$StateListAnimator$Application$Activity */
                public static final class Activity extends android.animation.AnimatorListenerAdapter {
                    public final /* synthetic */ C10324bmM AEQbTJ;
                    public final /* synthetic */ C10026bgg EZpvd;
                    public final /* synthetic */ int KWHzl;
                    public final /* synthetic */ C43312rms<AbstractC16823erG> OLrzqt;
                    public final /* synthetic */ TaskDescription copydefault;

                    public Activity(C43312rms<AbstractC16823erG> c43312rms, C10026bgg c10026bgg, C10324bmM c10324bmM, int i, TaskDescription taskDescription) {
                        this.OLrzqt = c43312rms;
                        this.EZpvd = c10026bgg;
                        this.AEQbTJ = c10324bmM;
                        this.KWHzl = i;
                        this.copydefault = taskDescription;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        Intrinsics.checkNotNullParameter(animator, "");
                        ((AbstractC16823erG) this.OLrzqt.OLrzqt()).valueOf.removeAnimatorListener(this);
                        C10006bgM c10006bgMAEQbTJ = this.EZpvd.AEQbTJ();
                        C10324bmM c10324bmM = this.AEQbTJ;
                        final int i = this.KWHzl;
                        final TaskDescription taskDescription = this.copydefault;
                        final C10026bgg c10026bgg = this.EZpvd;
                        c10006bgMAEQbTJ.copydefault(c10324bmM, i, taskDescription, new Function0() { // from class: o.bgx
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C10026bgg.Fragment.StateListAnimator.Application.Activity.copydefault(c10026bgg, taskDescription, i);
                            }
                        });
                    }

                    public static final Unit copydefault(C10026bgg c10026bgg, TaskDescription taskDescription, int i) {
                        c10026bgg.AEQbTJ(taskDescription);
                        if (i == 1) {
                            c10026bgg.AEQbTJ(taskDescription.copydefault());
                        }
                        return Unit.INSTANCE;
                    }
                }
            }

            public static final Unit copydefault(C10026bgg c10026bgg, TaskDescription taskDescription) {
                c10026bgg.AEQbTJ(taskDescription);
                return Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC43310rmq, o.AbstractC59533zio
        public C43312rms<AbstractC16823erG> onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C43312rms<AbstractC16823erG> c43312rmsOnCreateViewHolder = super.onCreateViewHolder(layoutInflater, viewGroup);
            Intrinsics.checkNotNullExpressionValue(c43312rmsOnCreateViewHolder, "");
            ((AbstractC16823erG) c43312rmsOnCreateViewHolder.OLrzqt()).AEQbTJ.setAutoSetState(false);
            return c43312rmsOnCreateViewHolder;
        }
    }

    public final void AEQbTJ(final TaskDescription taskDescription) {
        KWHzl();
        java.util.Iterator<java.lang.Object> it = this.djBIcL.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            java.lang.Object next = it.next();
            if ((next instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) ((TaskDescription) next).AhwBna(), (java.lang.Object) taskDescription.AhwBna())) {
                break;
            } else {
                i2++;
            }
        }
        java.util.ArrayList<java.lang.Object> arrayList = this.djBIcL;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            for (java.lang.Object obj : arrayList) {
                if ((obj instanceof StateListAnimator) || (obj instanceof Application)) {
                    i++;
                    if (i < 0) {
                        yDY.djBIcL();
                    }
                }
            }
        }
        java.util.ArrayList<java.lang.Object> arrayList2 = this.djBIcL;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            if ((obj2 instanceof TaskDescription) || (obj2 instanceof java.lang.String)) {
                arrayList3.add(obj2);
            }
        }
        int iOLrzqt = AEQbTJ().OLrzqt(taskDescription, arrayList3) + i;
        if (i2 >= 0 && i2 < this.djBIcL.size()) {
            this.djBIcL.remove(i2);
            EZpvd().notifyItemRemoved(i2);
            if (iOLrzqt >= 0 && iOLrzqt <= this.djBIcL.size() + 1) {
                if (iOLrzqt > i2) {
                    iOLrzqt--;
                }
                int iMax = java.lang.Math.max(iOLrzqt, i);
                this.djBIcL.add(iMax, taskDescription);
                EZpvd().notifyItemInserted(iMax);
            }
            if (taskDescription.gEmmrt() == 1) {
                C55326xho.toast$default(C13754dXa.FragmentManager.onWindowStartingSupportActionMode, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            } else {
                C55326xho.toast$default(C13754dXa.FragmentManager.supportInvalidateOptionsMenu, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            java.lang.String string = getString(C13754dXa.FragmentManager.iLWfRf);
            Intrinsics.checkNotNullExpressionValue(string, "");
            copydefault(string, new Function1() { // from class: o.bgs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return java.lang.Boolean.valueOf(C10026bgg.OLrzqt(((java.lang.Integer) obj3).intValue()));
                }
            });
            java.lang.String string2 = getString(C13754dXa.FragmentManager.dXcUrg);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            copydefault(string2, new Function1() { // from class: o.bgh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return java.lang.Boolean.valueOf(C10026bgg.KWHzl(((java.lang.Integer) obj3).intValue()));
                }
            });
        }
        if (taskDescription.gEmmrt() == 1) {
            C32866mlf.onEvent$default("Web3WalletHomepage_ManageCrypto_AddCrypto_Click", (TrackChannel[]) null, new Function1() { // from class: o.bgi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return C10026bgg.AEQbTJ(taskDescription, (EventParamsList) obj3);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit AEQbTJ(TaskDescription taskDescription, EventParamsList eventParamsList) {
        C10854bwM c10854bwMKWHzl;
        C10854bwM c10854bwMKWHzl2;
        C10854bwM c10854bwMKWHzl3;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_symbol", taskDescription.isConnected(), false, 4, null);
        C10525bqB c10525bqBCopydefault = taskDescription.copydefault();
        java.lang.String strOLrzqt = null;
        java.lang.String strFJNWhG = (c10525bqBCopydefault == null || (c10854bwMKWHzl2 = c10525bqBCopydefault.KWHzl()) == null || (c10854bwMKWHzl3 = c10854bwMKWHzl2.KWHzl()) == null) ? null : c10854bwMKWHzl3.fJNWhG();
        EventParamsList.put$default(eventParamsList, "chain_symbol", strFJNWhG == null ? "" : strFJNWhG, false, 4, null);
        C10525bqB c10525bqBCopydefault2 = taskDescription.copydefault();
        if (c10525bqBCopydefault2 != null && (c10854bwMKWHzl = c10525bqBCopydefault2.KWHzl()) != null) {
            strOLrzqt = c10854bwMKWHzl.OLrzqt();
        }
        EventParamsList.put$default(eventParamsList, "token_contract_address", strOLrzqt == null ? "" : strOLrzqt, false, 4, null);
        eventParamsList.put("source_page", "manage_crypto", true);
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        int i = 0;
        if (AEQbTJ().copydefault()) {
            java.util.ArrayList<java.lang.Object> arrayList = this.djBIcL;
            if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                java.util.Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof LoaderManager) {
                        return;
                    }
                }
            }
            java.util.ArrayList<java.lang.Object> arrayList2 = this.djBIcL;
            LoaderManager loaderManager = new LoaderManager();
            loaderManager.OLrzqt(getString(C13754dXa.FragmentManager.requestPostMessageChannel));
            loaderManager.KWHzl(C52761wXj.TaskDescription.accept);
            loaderManager.OLrzqt(new Function0() { // from class: o.bgt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C10026bgg.AYXKKw(this.AEQbTJ);
                }
            });
            Unit unit = Unit.INSTANCE;
            arrayList2.add(0, loaderManager);
            EZpvd().notifyItemInserted(0);
            if (this.valueOf) {
                return;
            }
            this.djBIcL.add(1, new Application());
            EZpvd().notifyItemInserted(1);
            return;
        }
        java.util.Iterator<java.lang.Object> it2 = this.djBIcL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (it2.next() instanceof LoaderManager) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.djBIcL.remove(i);
            EZpvd().notifyItemRemoved(i);
            if (i >= this.djBIcL.size() || !(this.djBIcL.get(i) instanceof Application)) {
                return;
            }
            this.djBIcL.remove(i);
            EZpvd().notifyItemRemoved(i);
        }
    }

    public static final Unit AYXKKw(final C10026bgg c10026bgg) {
        FragmentActivity activity = c10026bgg.getActivity();
        if (activity != null) {
            ActivityC10083bhk.Companion.OLrzqt(activity, c10026bgg.copydefault);
            C32866mlf.onEvent$default("Web3WalletHomepage_ManageCrypto_RecentlyRemoved_Click", (TrackChannel[]) null, new Function1() { // from class: o.bgk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10026bgg.KWHzl(this.copydefault, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C10026bgg c10026bgg, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("network_selection", c10026bgg.AEQbTJ().copydefault(c10026bgg.copydefault), true);
        return Unit.INSTANCE;
    }

    @Override // o.ActivityC9955bfO.TaskDescription
    public void AEQbTJ(long j) {
        this.copydefault = j;
        AEQbTJ().EZpvd(j);
    }

    @Override // o.ActivityC9955bfO.Application
    public void OLrzqt(boolean z) {
        this.valueOf = z;
        FragmentActivity activity = getActivity();
        ActivityC9955bfO activityC9955bfO = activity instanceof ActivityC9955bfO ? (ActivityC9955bfO) activity : null;
        if (activityC9955bfO != null) {
            activityC9955bfO.EZpvd(this.valueOf);
        }
    }

    public final void copydefault(java.lang.String str, Function1<? super java.lang.Integer, java.lang.Boolean> function1) {
        java.util.Iterator<java.lang.Object> it = this.djBIcL.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (Intrinsics.EZpvd(it.next(), (java.lang.Object) str)) {
                break;
            } else {
                i2++;
            }
        }
        java.util.Iterator<java.lang.Object> it2 = this.djBIcL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            java.lang.Object next = it2.next();
            if ((next instanceof TaskDescription) && function1.invoke(java.lang.Integer.valueOf(((TaskDescription) next).gEmmrt())).booleanValue()) {
                break;
            } else {
                i++;
            }
        }
        if (i2 != -1 && i == -1) {
            this.djBIcL.remove(i2);
            EZpvd().notifyItemRemoved(i2);
        } else {
            if (i2 != -1 || i == -1) {
                return;
            }
            this.djBIcL.add(i, str);
            EZpvd().notifyItemInserted(i);
        }
    }
}
