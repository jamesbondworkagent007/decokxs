package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.nft.ui.mediapicker.data.bean.MediaInfo;
import com.okinc.nft.ui.mediapicker.data.constants.MediaPickerType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43471rps;
import o.C43680rtp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rtz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43690rtz extends AbstractC32998moE implements C43680rtp.Activity {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public LottieAnimationView AYXKKw;
    public RecyclerView AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public int EZpvd;
    public android.widget.TextView copydefault;
    public C59534zip djBIcL;
    public java.lang.String fetchVPNInfo;
    public InterfaceC43645rtG gEmmrt;
    public java.util.List<java.lang.Object> valueOf;
    public final AbstractC55115xdp values;
    public int isConnected = 1;
    public boolean KWHzl = true;

    /* JADX INFO: renamed from: o.rtz$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C43471rps.TaskDescription.KWHzl;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public C43690rtz() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.valueOf = arrayList;
        this.djBIcL = new C59534zip(arrayList);
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.nft.ui.mediapicker.nftfeature.ImageAndVideoListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.nft.ui.mediapicker.nftfeature.ImageAndVideoListFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C43644rtF.class), new Function0<ViewModelStore>() { // from class: com.okinc.nft.ui.mediapicker.nftfeature.ImageAndVideoListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.nft.ui.mediapicker.nftfeature.ImageAndVideoListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.nft.ui.mediapicker.nftfeature.ImageAndVideoListFragment$special$$inlined$viewModels$default$5
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
        this.values = C55119xdt.AEQbTJ.KWHzl(this, 20, new ActivityResultCallback() { // from class: o.rtA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C43690rtz.OLrzqt(this.OLrzqt, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.rtz$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rtz.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C43690rtz KWHzl(int i, java.lang.String str, InterfaceC43645rtG interfaceC43645rtG) {
            C43690rtz c43690rtz = new C43690rtz();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("type", i);
            bundle.putString("selectedPath", str);
            c43690rtz.setArguments(bundle);
            c43690rtz.gEmmrt = interfaceC43645rtG;
            return c43690rtz;
        }
    }

    public final C43644rtF AEQbTJ() {
        return (C43644rtF) this.DbNXlk.getValue();
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        if (this.AEQbTJ) {
            return;
        }
        copydefault();
        this.AEQbTJ = true;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C33566myq c33566myq = C33566myq.EZpvd;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        int iEZpvd = c33566myq.EZpvd(context);
        android.content.Context context2 = getContext();
        if (context2 == null) {
            return;
        }
        this.EZpvd = (iEZpvd - C33052mpF.AEQbTJ(48, context2)) / 3;
        android.os.Bundle arguments = getArguments();
        this.isConnected = arguments != null ? arguments.getInt("type") : 1;
        android.os.Bundle arguments2 = getArguments();
        RecyclerView recyclerView = null;
        this.fetchVPNInfo = arguments2 != null ? arguments2.getString("selectedPath", null) : null;
        this.AYXKKw = (LottieAnimationView) view.findViewById(C43471rps.Activity.fetchVPNInfo);
        this.AhwBna = (RecyclerView) view.findViewById(C43471rps.Activity.AkhnZx);
        this.copydefault = (android.widget.TextView) view.findViewById(C43471rps.Activity.isConnected);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        RecyclerView recyclerView2 = this.AhwBna;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView3 = this.AhwBna;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
            recyclerView3 = null;
        }
        android.content.Context context3 = getContext();
        if (context3 == null) {
            return;
        }
        int iAEQbTJ = C33052mpF.AEQbTJ(8, context3);
        android.content.Context context4 = getContext();
        if (context4 == null) {
            return;
        }
        recyclerView3.addItemDecoration(new C57584ylF(3, iAEQbTJ, C33052mpF.AEQbTJ(8, context4)));
        RecyclerView recyclerView4 = this.AhwBna;
        if (recyclerView4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView = recyclerView4;
        }
        recyclerView.setAdapter(this.djBIcL);
        this.djBIcL.register(MediaInfo.class, new C43688rtx(this.isConnected, this.fetchVPNInfo, getContext(), AEQbTJ(), getActivity(), this.EZpvd, this.gEmmrt));
        this.djBIcL.register(C43677rtm.class, new C43680rtp(this.EZpvd, this));
        EZpvd();
    }

    private final void EZpvd() {
        AEQbTJ().EZpvd().observe(this, new Application(new Function1() { // from class: o.rtw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43690rtz.KWHzl(this.copydefault, (java.util.List) obj);
            }
        }));
    }

    public static final Unit KWHzl(C43690rtz c43690rtz, java.util.List list) {
        c43690rtz.dismissLoading();
        c43690rtz.valueOf.clear();
        if (c43690rtz.KWHzl) {
            c43690rtz.valueOf.add(new C43677rtm(c43690rtz.isConnected));
        }
        if (list != null && (!list.isEmpty())) {
            c43690rtz.valueOf.addAll(list);
        }
        c43690rtz.djBIcL.notifyDataSetChanged();
        if (c43690rtz.valueOf.isEmpty()) {
            c43690rtz.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C43690rtz c43690rtz, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            java.util.ArrayList<MediaInfo> arrayList = new java.util.ArrayList<>();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaInfo mediaInfoOLrzqt = C43648rtJ.OLrzqt(c43690rtz.requireContext(), (android.net.Uri) it.next(), c43690rtz.isConnected == 1 ? MediaPickerType.TYPE_IMAGE : MediaPickerType.TYPE_VIDEO);
                if (mediaInfoOLrzqt != null) {
                    arrayList.add(mediaInfoOLrzqt);
                }
            }
            if (!arrayList.isEmpty()) {
                c43690rtz.AEQbTJ().KWHzl(c43690rtz.isConnected, arrayList);
            }
        }
    }

    private final void OLrzqt() {
        android.widget.TextView textView = this.copydefault;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = this.copydefault;
        if (textView2 != null) {
            textView2.setText(getString(this.isConnected == 1 ? C43471rps.ActionBar.gasjUx : C43471rps.ActionBar.dvKsVJ));
        }
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        android.widget.TextView textView = this.copydefault;
        if (textView != null) {
            textView.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView = this.AYXKKw;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView2 = this.AYXKKw;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.playAnimation();
        }
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void dismissLoading() {
        LottieAnimationView lottieAnimationView = this.AYXKKw;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView2 = this.AYXKKw;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.cancelAnimation();
        }
    }

    private final void copydefault() {
        showLoading();
        this.KWHzl = true;
        AEQbTJ().KWHzl(this.isConnected);
    }

    @Override // o.C43680rtp.Activity
    public void EZpvd(int i) {
        if (i == 1) {
            this.values.KWHzl();
        } else {
            this.values.AEQbTJ();
        }
    }
}
