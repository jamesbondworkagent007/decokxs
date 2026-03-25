package o;

import android.view.ViewTreeObserver;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.messageV2.view.banner.scamannouncement.ScamAnnouncementBannerViewModel;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36843oic extends AbstractC36785ohX {
    public final int AhwBna = C35399nuc.Dialog.DCUTEIdCUTEI;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public C33921nKu valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.oic$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    public C36843oic() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messageV2.view.banner.scamannouncement.ScamAnnouncementBannerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.banner.scamannouncement.ScamAnnouncementBannerFragment$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ScamAnnouncementBannerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.banner.scamannouncement.ScamAnnouncementBannerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.banner.scamannouncement.ScamAnnouncementBannerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.banner.scamannouncement.ScamAnnouncementBannerFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.oif
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36843oic.EZpvd(this.KWHzl);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.oie
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36843oic.AhwBna(this.EZpvd);
            }
        });
    }

    /* JADX INFO: renamed from: o.oic$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oic.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.lang.String copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "_FRAGMENT_RESULT_BANNER_HEIGHT";
        }
    }

    /* JADX DEBUG: Possible override for method o.ohX.EZpvd()V */
    public final ScamAnnouncementBannerViewModel EZpvd() {
        return (ScamAnnouncementBannerViewModel) this.fetchVPNInfo.getValue();
    }

    private final java.lang.String AYXKKw() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String EZpvd(C36843oic c36843oic) {
        android.os.Bundle arguments = c36843oic.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_CHANNEL_ID");
        }
        return null;
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public static final java.lang.String AhwBna(C36843oic c36843oic) {
        java.lang.String string;
        android.os.Bundle arguments = c36843oic.getArguments();
        return (arguments == null || (string = arguments.getString("ARG_FRAGMENT_REQUEST_KEY")) == null) ? "" : string;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.valueOf = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33921nKu c33921nKuEZpvd = C33921nKu.EZpvd(layoutInflater, viewGroup, false);
        this.valueOf = c33921nKuEZpvd;
        if (c33921nKuEZpvd != null) {
            return c33921nKuEZpvd.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        OKReminder root;
        OKReminder oKReminder;
        Intrinsics.checkNotNullParameter(view, "");
        C33921nKu c33921nKu = this.valueOf;
        if (c33921nKu != null && (oKReminder = c33921nKu.copydefault) != null) {
            java.lang.String string = getString(C35399nuc.LoaderManager.gHZMYf);
            Intrinsics.checkNotNullExpressionValue(string, "");
            oKReminder.setTitle(string);
            oKReminder.setMessage(getString(C35399nuc.LoaderManager.QslYrK));
            oKReminder.setStyle(0);
            oKReminder.setOnCloseIconCallback(new Function0() { // from class: o.oid
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C36843oic.AYXKKw(this.KWHzl);
                }
            });
        }
        C33921nKu c33921nKu2 = this.valueOf;
        if (c33921nKu2 != null && (root = c33921nKu2.getRoot()) != null) {
            android.view.ViewTreeObserver viewTreeObserver = root.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new Application(viewTreeObserver, root, this));
        }
        EZpvd().AEQbTJ().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.oig
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36843oic.KWHzl(this.EZpvd, (C36559odJ) obj);
            }
        }));
        ScamAnnouncementBannerViewModel scamAnnouncementBannerViewModelEZpvd = EZpvd();
        java.lang.String strAYXKKw = AYXKKw();
        android.os.Bundle arguments = getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("ARG_PAGE_TYPE") : null;
        scamAnnouncementBannerViewModelEZpvd.EZpvd(strAYXKKw, serializable instanceof IMPageType ? (IMPageType) serializable : null);
    }

    public static final Unit AYXKKw(C36843oic c36843oic) {
        pUU.KWHzl(c36843oic.getTAG(), "Scam banner close button clicked");
        c36843oic.EZpvd().OLrzqt();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C36843oic c36843oic, C36559odJ c36559odJ) {
        pUU.KWHzl(c36843oic.getTAG(), "Scam banner update: " + c36559odJ);
        c36843oic.copydefault(c36559odJ);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36843oic, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void copydefault(C36559odJ c36559odJ) {
        OKReminder oKReminder;
        C33921nKu c33921nKu = this.valueOf;
        if (c33921nKu == null || (oKReminder = c33921nKu.copydefault) == null) {
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = oKReminder.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new ActionBar(viewTreeObserver, oKReminder, this));
        oKReminder.setVisibility(c36559odJ != null ? 0 : 8);
    }

    private final int OLrzqt(android.view.View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        OKReminder root;
        C33921nKu c33921nKu = this.valueOf;
        if (c33921nKu == null || (root = c33921nKu.getRoot()) == null) {
            return;
        }
        int iOLrzqt = OLrzqt(root);
        if (root.getVisibility() != 0) {
            iOLrzqt = 0;
        }
        FragmentKt.setFragmentResult(this, Companion.copydefault(valueOf()), BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_BANNER_HEIGHT", java.lang.Integer.valueOf(iOLrzqt))));
    }

    /* JADX INFO: renamed from: o.oic$ActionBar */
    public static final class ActionBar implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ C36843oic AEQbTJ;
        public final /* synthetic */ android.view.ViewTreeObserver KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        public ActionBar(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, C36843oic c36843oic) {
            this.KWHzl = viewTreeObserver;
            this.OLrzqt = view;
            this.AEQbTJ = c36843oic;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.KWHzl.isAlive() ? this.KWHzl : this.OLrzqt.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            this.AEQbTJ.AhwBna();
        }
    }

    /* JADX INFO: renamed from: o.oic$Application */
    public static final class Application implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ android.view.ViewTreeObserver KWHzl;
        public final /* synthetic */ C36843oic OLrzqt;

        public Application(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, C36843oic c36843oic) {
            this.KWHzl = viewTreeObserver;
            this.EZpvd = view;
            this.OLrzqt = c36843oic;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.KWHzl.isAlive() ? this.KWHzl : this.EZpvd.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            this.OLrzqt.AhwBna();
        }
    }
}
