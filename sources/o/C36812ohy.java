package o;

import android.os.Build;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.messageV2.view.banner.joinreview.PendingJoinReviewsBannerViewModel;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.ActivityC34183nUn;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ohy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36812ohy extends AbstractC36763ohB {
    public C33917nKq AYXKKw;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final int gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AhwBna = 8;

    /* JADX INFO: renamed from: o.ohy$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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
        return this.gEmmrt;
    }

    public C36812ohy() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messageV2.view.banner.joinreview.PendingJoinReviewsBannerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.banner.joinreview.PendingJoinReviewsBannerFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PendingJoinReviewsBannerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.banner.joinreview.PendingJoinReviewsBannerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.banner.joinreview.PendingJoinReviewsBannerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.banner.joinreview.PendingJoinReviewsBannerFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.ohE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36812ohy.KWHzl(this.OLrzqt);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ohF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36812ohy.AEQbTJ(this.AEQbTJ);
            }
        });
        this.gEmmrt = C35399nuc.Dialog.fdOvFl;
    }

    public final PendingJoinReviewsBannerViewModel valueOf() {
        return (PendingJoinReviewsBannerViewModel) this.DbNXlk.getValue();
    }

    /* JADX DEBUG: Possible override for method o.ohB.OLrzqt()V */
    public final java.lang.Long OLrzqt() {
        return (java.lang.Long) this.djBIcL.getValue();
    }

    public static final java.lang.Long KWHzl(C36812ohy c36812ohy) {
        java.lang.String string;
        android.os.Bundle arguments = c36812ohy.getArguments();
        if (arguments == null || (string = arguments.getString("ARG_CHANNEL_ID")) == null) {
            return null;
        }
        return StringsKt__StringNumberConversionsKt.getFieldNames(string);
    }

    public final OKConversationType djBIcL() {
        return (OKConversationType) this.valueOf.getValue();
    }

    public static final OKConversationType AEQbTJ(C36812ohy c36812ohy) {
        if (Build.VERSION.SDK_INT >= 33) {
            android.os.Bundle arguments = c36812ohy.getArguments();
            if (arguments != null) {
                return (OKConversationType) arguments.getSerializable("ARG_CONVERSATION_TYPE", OKConversationType.class);
            }
            return null;
        }
        android.os.Bundle arguments2 = c36812ohy.getArguments();
        java.io.Serializable serializable = arguments2 != null ? arguments2.getSerializable("ARG_CONVERSATION_TYPE") : null;
        if (serializable instanceof OKConversationType) {
            return (OKConversationType) serializable;
        }
        return null;
    }

    /* JADX INFO: renamed from: o.ohy$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ohy.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str + "_FRAGMENT_RESULT_BANNER_HEIGHT";
        }

        public final C36812ohy EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull OKConversationType oKConversationType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(oKConversationType, "");
            C36812ohy c36812ohy = new C36812ohy();
            c36812ohy.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_CHANNEL_ID", str2), C56390yDp.OLrzqt("ARG_CONVERSATION_TYPE", oKConversationType), C56390yDp.OLrzqt("ARG_FRAGMENT_REQUEST_KEY", str)));
            return c36812ohy;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33917nKq c33917nKqAEQbTJ = C33917nKq.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c33917nKqAEQbTJ, "");
        this.AYXKKw = c33917nKqAEQbTJ;
        OKAlertBanner root = c33917nKqAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.Long lOLrzqt = OLrzqt();
        if (djBIcL() != OKConversationType.GROUP || lOLrzqt == null) {
            return;
        }
        C33917nKq c33917nKq = this.AYXKKw;
        if (c33917nKq != null) {
            c33917nKq.KWHzl.setLeadingIcon(C33070mpX.KWHzl(C52761wXj.TaskDescription.UimiPOhkCVbT));
            OKAlertBanner oKAlertBanner = c33917nKq.KWHzl;
            oKAlertBanner.setOnClickListener(new TaskDescription(oKAlertBanner, 1000L, view, lOLrzqt, this));
        }
        EZpvd(lOLrzqt.longValue());
    }

    public final void EZpvd(long j) {
        valueOf().OLrzqt().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.ohG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36812ohy.EZpvd(this.OLrzqt, (java.lang.Integer) obj);
            }
        }));
        valueOf().EZpvd(java.lang.Long.valueOf(j));
    }

    public static final Unit EZpvd(C36812ohy c36812ohy, java.lang.Integer num) {
        OKAlertBanner oKAlertBanner;
        C33917nKq c33917nKq = c36812ohy.AYXKKw;
        if (c33917nKq != null && (oKAlertBanner = c33917nKq.KWHzl) != null) {
            if (num.intValue() > 0) {
                int i = C35399nuc.Fragment.valueOf;
                Intrinsics.copydefault(num);
                oKAlertBanner.setTitle(pTD.KWHzl(c36812ohy, i, num.intValue(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(num.toString(), null, 1, null)))));
                oKAlertBanner.setVisibility(0);
            } else {
                oKAlertBanner.setVisibility(8);
            }
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36812ohy, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ohy$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C36812ohy AEQbTJ;
        public final /* synthetic */ java.lang.Long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, android.view.View view2, java.lang.Long l, C36812ohy c36812ohy) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = view2;
            this.EZpvd = l;
            this.AEQbTJ = c36812ohy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ActivityC34183nUn.ActionBar actionBar = ActivityC34183nUn.Companion;
                android.content.Context context = this.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                this.AEQbTJ.startActivity(actionBar.AEQbTJ(context, this.EZpvd.longValue()));
            }
        }
    }
}
