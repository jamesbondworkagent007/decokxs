package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.messageV2.view.banner.unblockrelation.UnblockRelationBannerFragment$openBlockedRelationList$1;
import com.okinc.im.imui.messageV2.view.banner.unblockrelation.UnblockRelationBannerViewModel;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oiO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36829oiO extends AbstractC36826oiL {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final int AhwBna = C35399nuc.Dialog.DWgRXt;
    public nKL djBIcL;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.oiO$StateListAnimator */
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

    public static final void EZpvd(RelationInfo relationInfo) {
    }

    public static final void KWHzl(OKConversation oKConversation) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    public C36829oiO() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messageV2.view.banner.unblockrelation.UnblockRelationBannerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.banner.unblockrelation.UnblockRelationBannerFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(UnblockRelationBannerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.banner.unblockrelation.UnblockRelationBannerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.banner.unblockrelation.UnblockRelationBannerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.banner.unblockrelation.UnblockRelationBannerFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.oiR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36829oiO.EZpvd(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.oiO$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oiO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C36829oiO copydefault(java.lang.String str) {
            C36829oiO c36829oiO = new C36829oiO();
            c36829oiO.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_CHANNEL_ID", str)));
            return c36829oiO;
        }
    }

    /* JADX DEBUG: Possible override for method o.oiL.EZpvd()V */
    public final UnblockRelationBannerViewModel EZpvd() {
        return (UnblockRelationBannerViewModel) this.valueOf.getValue();
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String EZpvd(C36829oiO c36829oiO) {
        android.os.Bundle arguments = c36829oiO.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_CHANNEL_ID");
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nKL nklOLrzqt = nKL.OLrzqt(layoutInflater, viewGroup, false);
        this.djBIcL = nklOLrzqt;
        if (nklOLrzqt != null) {
            return nklOLrzqt.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C52794wYp c52794wYp;
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd().copydefault().observe(getViewLifecycleOwner(), new Observer() { // from class: o.oiN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C36829oiO.KWHzl((OKConversation) obj);
            }
        });
        EZpvd().KWHzl().observe(getViewLifecycleOwner(), new Observer() { // from class: o.oiP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C36829oiO.EZpvd((RelationInfo) obj);
            }
        });
        nKL nkl = this.djBIcL;
        if (nkl != null && (textView = nkl.EZpvd) != null) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.QUSxYX);
            java.lang.String strCopydefault = C33069mpW.copydefault(C35399nuc.LoaderManager.QfsBiF, C56423yEv.EZpvd(C56390yDp.OLrzqt("blockedUsers", strAYXKKw)));
            android.text.SpannableString spannableString = new android.text.SpannableString(strCopydefault);
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strAYXKKw, 0, false, 6, (java.lang.Object) null);
            if (iIndexOf$default >= 0) {
                spannableString.setSpan(new Activity(), iIndexOf$default, strAYXKKw.length() + iIndexOf$default, 33);
            }
            textView.setText(spannableString);
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        nKL nkl2 = this.djBIcL;
        if (nkl2 != null && (c52794wYp = nkl2.OLrzqt) != null) {
            c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        }
        EZpvd().EZpvd().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.oiM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36829oiO.OLrzqt(this.EZpvd, (RelationInfo) obj);
            }
        }));
        EZpvd().OLrzqt().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.oiT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36829oiO.EZpvd(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        EZpvd().copydefault(valueOf());
    }

    /* JADX INFO: renamed from: o.oiO$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public Activity() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C36829oiO.this.AYXKKw();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            textPaint.setUnderlineText(true);
        }
    }

    public static final Unit OLrzqt(final C36829oiO c36829oiO, RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(relationInfo, "");
        C35580nxz c35580nxzAEQbTJ = C35580nxz.Companion.AEQbTJ("FRAGMENT_REQUEST_KEY_UNBLOCK_RELATION", relationInfo);
        androidx.fragment.app.FragmentManager childFragmentManager = c36829oiO.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c35580nxzAEQbTJ.show(childFragmentManager, (java.lang.String) null);
        FragmentKt.setFragmentResultListener(c35580nxzAEQbTJ, "FRAGMENT_REQUEST_KEY_UNBLOCK_RELATION", new Function2() { // from class: o.oiQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C36829oiO.copydefault(this.OLrzqt, (java.lang.String) obj, (android.os.Bundle) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C36829oiO c36829oiO, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "KEY_REQUEST_BLOCK_CONTACT") && bundle.getBoolean("KEY_BLOCK_CONTACT_RESULT", false)) {
            c36829oiO.EZpvd().AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C36829oiO c36829oiO, java.lang.Boolean bool) {
        android.widget.LinearLayout root;
        nKL nkl = c36829oiO.djBIcL;
        if (nkl != null && (root = nkl.getRoot()) != null) {
            root.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36829oiO, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UnblockRelationBannerFragment$openBlockedRelationList$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.oiO$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C36829oiO AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C36829oiO c36829oiO) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c36829oiO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd().djBIcL();
            }
        }
    }
}
