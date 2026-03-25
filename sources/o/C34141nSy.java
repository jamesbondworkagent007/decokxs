package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.group.groupentry.GroupEntryConfigurationFragment$setObserver$1$1;
import com.okinc.im.imui.group.groupentry.GroupEntryConfigurationFragment$setObserver$1$2;
import com.okinc.im.imui.group.groupentry.GroupEntryConfigurationFragment$setObserver$1$3;
import com.okinc.im.imui.group.groupentry.GroupEntryConfigurationFragment$setObserver$1$4;
import com.okinc.im.imui.group.groupentry.GroupEntryConfigurationViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.C35399nuc;
import o.C52761wXj;
import o.C55018xby;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nSy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C34141nSy extends nSL {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public C33934nLg EZpvd;
    public nJF KWHzl;
    public C34134nSr OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35399nuc.Dialog.OuxcSI;
    }

    public C34141nSy() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.group.groupentry.GroupEntryConfigurationFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.group.groupentry.GroupEntryConfigurationFragment$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(GroupEntryConfigurationViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.groupentry.GroupEntryConfigurationFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.groupentry.GroupEntryConfigurationFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.groupentry.GroupEntryConfigurationFragment$special$$inlined$viewModels$default$5
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
        this.OLrzqt = new C34134nSr();
    }

    /* JADX DEBUG: Possible override for method o.nSL.OLrzqt()V */
    public final GroupEntryConfigurationViewModel OLrzqt() {
        return (GroupEntryConfigurationViewModel) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nJF njfKWHzl = nJF.KWHzl(layoutInflater, viewGroup, false);
        this.KWHzl = njfKWHzl;
        if (njfKWHzl == null) {
            Intrinsics.gEmmrt("");
            njfKWHzl = null;
        }
        ConstraintLayout constraintLayoutAEQbTJ = njfKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutAEQbTJ, "");
        return constraintLayoutAEQbTJ;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        valueOf();
        AYXKKw();
        OLrzqt().AYXKKw();
    }

    private final void valueOf() {
        C55320xhi c55320xhiKWHzl;
        C33934nLg c33934nLgAEQbTJ = C33934nLg.AEQbTJ(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c33934nLgAEQbTJ, "");
        c33934nLgAEQbTJ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.nSz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34141nSy.AEQbTJ(this.EZpvd, view);
            }
        });
        this.EZpvd = c33934nLgAEQbTJ;
        nJF njf = this.KWHzl;
        C33934nLg c33934nLg = null;
        if (njf == null) {
            Intrinsics.gEmmrt("");
            njf = null;
        }
        njf.isConnected.setEnabled(false);
        C55312xha c55312xhaValueOf = njf.AhwBna.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setText(getString(C35399nuc.LoaderManager.ahrCSq));
            c55320xhiKWHzl.setTextAppearance(C52761wXj.LoaderManager.zLjUOn);
            c55320xhiKWHzl.setAttachClickListener(new Function0() { // from class: o.nSw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34141nSy.djBIcL(this.EZpvd);
                }
            });
        }
        wYC wycCopydefault = njf.AhwBna.copydefault();
        if (wycCopydefault != null) {
            wycCopydefault.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(requireContext(), C52761wXj.Activity.fdOvFl)));
            C55296xhK.OLrzqt(wycCopydefault, java.lang.Float.valueOf(C55298xhM.dp2pxFloat$default(2.0f, null, 1, null)), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(C55298xhM.dp2pxFloat$default(2.0f, null, 1, null)));
            int iDp2px$default = C55298xhM.dp2px$default(16.0f, null, 1, null);
            ViewGroup.LayoutParams layoutParams = wycCopydefault.getLayoutParams();
            layoutParams.height = iDp2px$default;
            layoutParams.width = iDp2px$default;
            wycCopydefault.setLayoutParams(layoutParams);
        }
        C55173xeu c55173xeu = njf.EZpvd;
        java.lang.String string = getString(C35399nuc.LoaderManager.fXYAwm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setRetry(string);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.nSA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34141nSy.OLrzqt(this.KWHzl, view);
            }
        });
        final C55018xby c55018xby = njf.fetchVPNInfo;
        final java.util.List<GroupEntryConfigurationViewModel.ActionBar> listOLrzqt = OLrzqt().OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (it.hasNext()) {
            java.lang.String string2 = getString(((GroupEntryConfigurationViewModel.ActionBar) it.next()).KWHzl());
            Intrinsics.checkNotNullExpressionValue(string2, "");
            arrayList.add(new C55276xgr(string2, null, null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        }
        c55018xby.setItems(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList));
        AbstractC52786wYh abstractC52786wYhOLrzqt = c55018xby.OLrzqt();
        Intrinsics.copydefault(abstractC52786wYhOLrzqt, "");
        final C55018xby.Activity activity = (C55018xby.Activity) abstractC52786wYhOLrzqt;
        activity.EZpvd(new Function1() { // from class: o.nSx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34141nSy.EZpvd(listOLrzqt, this, c55018xby, activity, (java.lang.CharSequence) obj);
            }
        });
        android.widget.FrameLayout frameLayout = njf.AYXKKw;
        frameLayout.removeAllViews();
        C33934nLg c33934nLg2 = this.EZpvd;
        if (c33934nLg2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33934nLg = c33934nLg2;
        }
        frameLayout.addView(c33934nLg.getRoot());
    }

    public static final void AEQbTJ(C34141nSy c34141nSy, android.view.View view) {
        pUU.KWHzl(c34141nSy.getTAG(), "Filter chip clicked");
    }

    public static final Unit djBIcL(C34141nSy c34141nSy) {
        oHQ ohqCopydefault = oHQ.Companion.copydefault(C33070mpX.AYXKKw(C35399nuc.LoaderManager.UPbYzn), C33070mpX.AYXKKw(C35399nuc.LoaderManager.Srftgn));
        androidx.fragment.app.FragmentManager parentFragmentManager = c34141nSy.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        ohqCopydefault.show(parentFragmentManager);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C34141nSy c34141nSy, android.view.View view) {
        c34141nSy.OLrzqt().AYXKKw();
    }

    public static final Unit EZpvd(java.util.List list, C34141nSy c34141nSy, C55018xby c55018xby, C55018xby.Activity activity, java.lang.CharSequence charSequence) {
        java.lang.Object next;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd(activity.getString(((GroupEntryConfigurationViewModel.ActionBar) next).KWHzl()), charSequence)) {
                break;
            }
        }
        GroupEntryConfigurationViewModel.ActionBar actionBar = (GroupEntryConfigurationViewModel.ActionBar) next;
        c34141nSy.OLrzqt().AEQbTJ(actionBar != null ? actionBar.AEQbTJ() : null);
        AbstractC52786wYh abstractC52786wYhOLrzqt = c55018xby.OLrzqt();
        if (abstractC52786wYhOLrzqt != null) {
            abstractC52786wYhOLrzqt.dismiss();
        }
        c34141nSy.AEQbTJ(false);
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        GroupEntryConfigurationViewModel groupEntryConfigurationViewModelOLrzqt = OLrzqt();
        StateFlow<java.lang.Boolean> stateFlowDjBIcL = groupEntryConfigurationViewModelOLrzqt.djBIcL();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowDjBIcL, viewLifecycleOwner, (Lifecycle.State) null, new GroupEntryConfigurationFragment$setObserver$1$1(this, null), 2, (java.lang.Object) null);
        StateFlow<GroupEntryConfigurationViewModel.Fragment> stateFlowCopydefault = groupEntryConfigurationViewModelOLrzqt.copydefault();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C37721ozF.collectOnLifecycle$default(stateFlowCopydefault, viewLifecycleOwner2, (Lifecycle.State) null, new GroupEntryConfigurationFragment$setObserver$1$2(this, null), 2, (java.lang.Object) null);
        Flow<GroupEntryConfigurationViewModel.StateListAnimator> flowEZpvd = groupEntryConfigurationViewModelOLrzqt.EZpvd();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C37721ozF.collectOnLifecycle$default(flowEZpvd, viewLifecycleOwner3, (Lifecycle.State) null, new GroupEntryConfigurationFragment$setObserver$1$3(this, null), 2, (java.lang.Object) null);
        SharedFlow<GroupEntryConfigurationViewModel.Application> sharedFlowKWHzl = groupEntryConfigurationViewModelOLrzqt.KWHzl();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C37721ozF.collectOnLifecycle$default(sharedFlowKWHzl, viewLifecycleOwner4, (Lifecycle.State) null, new GroupEntryConfigurationFragment$setObserver$1$4(this, null), 2, (java.lang.Object) null);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.Integer num) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        if (num == null) {
            return str;
        }
        num.intValue();
        java.lang.String roundToFixed$default = pTB.formatRoundToFixed$default(C33129mqd.EZpvd(str), num.intValue(), null, 2, null);
        return roundToFixed$default == null ? str : roundToFixed$default;
    }

    public final void copydefault(java.lang.String str, java.lang.Integer num) {
        nJF njf = this.KWHzl;
        if (njf == null) {
            Intrinsics.gEmmrt("");
            njf = null;
        }
        C55001xbh c55001xbh = njf.gEmmrt;
        c55001xbh.setText(AEQbTJ(str, num));
        if (num != null) {
            c55001xbh.setMaxDecimalValue(num.intValue());
        }
    }

    public static /* synthetic */ void setMinInputUI$default(C34141nSy c34141nSy, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c34141nSy.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        nJF njf = null;
        if (z) {
            nJF njf2 = this.KWHzl;
            if (njf2 == null) {
                Intrinsics.gEmmrt("");
                njf2 = null;
            }
            njf2.AkhnZx.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UfveVb));
        } else {
            nJF njf3 = this.KWHzl;
            if (njf3 == null) {
                Intrinsics.gEmmrt("");
                njf3 = null;
            }
            njf3.AkhnZx.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        nJF njf4 = this.KWHzl;
        if (njf4 == null) {
            Intrinsics.gEmmrt("");
            njf4 = null;
        }
        njf4.KWHzl.setError(z);
        nJF njf5 = this.KWHzl;
        if (njf5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            njf = njf5;
        }
        njf.gEmmrt.clearFocus();
    }

    public static /* synthetic */ void setMinAmountUi$default(C34141nSy c34141nSy, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        c34141nSy.copydefault(str, str2, str3, num);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num) {
        nJF njf = this.KWHzl;
        nJF njf2 = null;
        if (njf == null) {
            Intrinsics.gEmmrt("");
            njf = null;
        }
        C55001xbh c55001xbh = njf.gEmmrt;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            c55001xbh.setHintText(AEQbTJ(C33129mqd.gEmmrt(str), num));
        }
        if ((str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) && (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2))) {
            nJF njf3 = this.KWHzl;
            if (njf3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                njf2 = njf3;
            }
            android.widget.TextView textView = njf2.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            return;
        }
        nJF njf4 = this.KWHzl;
        if (njf4 == null) {
            Intrinsics.gEmmrt("");
            njf4 = null;
        }
        android.widget.TextView textView2 = njf4.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        int i = C35399nuc.LoaderManager.RgaQzq;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = C56390yDp.OLrzqt("lower", C33129mqd.gEmmrt(str != null ? pTB.formatLocalized$default(str, null, 1, null) : null));
        pairArr[1] = C56390yDp.OLrzqt("upper", C33129mqd.gEmmrt(str2 != null ? pTB.formatLocalized$default(str2, null, 1, null) : null));
        pairArr[2] = C56390yDp.OLrzqt("currency", java.lang.String.valueOf(str3));
        java.lang.String strCopydefault = C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr));
        nJF njf5 = this.KWHzl;
        if (njf5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            njf2 = njf5;
        }
        njf2.AkhnZx.setText(strCopydefault);
    }

    /* JADX INFO: renamed from: o.nSy$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nSy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C34141nSy EZpvd(long j) {
            pUU.copydefault("GroupEntryConfigurationFragment", java.lang.Long.valueOf(j));
            C34141nSy c34141nSy = new C34141nSy();
            c34141nSy.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("GROUP_ID", java.lang.Long.valueOf(j))));
            return c34141nSy;
        }
    }
}
