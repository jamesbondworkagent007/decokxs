package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeMarkAllAsReadMenuItemPerformer;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C35399nuc;
import o.C52761wXj;
import o.nHG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nGr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33810nGr extends wXS {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.nGr$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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
    @Override // o.wXS
    public java.lang.CharSequence copydefault() {
        return "";
    }

    @Override // o.wXS, o.wXX
    public boolean getHasFooter() {
        return false;
    }

    public C33810nGr() {
        Function0 function0 = new Function0() { // from class: o.nGs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33810nGr.copydefault(this.KWHzl);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.conversationlist.menu.ConvoListBottomSheetMenuFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.conversationlist.menu.ConvoListBottomSheetMenuFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(nHG.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.conversationlist.menu.ConvoListBottomSheetMenuFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.conversationlist.menu.ConvoListBottomSheetMenuFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.nGz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33810nGr.AEQbTJ(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.nGr$TaskDescription */
    public static final class TaskDescription implements ViewModelProvider.Factory {
        public TaskDescription() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU == null) {
                throw new java.lang.IllegalArgumentException("OKIMService not available".toString());
            }
            android.content.Context applicationContext = C33810nGr.this.requireContext().getApplicationContext();
            sHZ shzAEQbTJ = interfaceC35180nqU.AEQbTJ();
            Intrinsics.copydefault(applicationContext);
            CoroutineDispatcher coroutineDispatcherInvokespecialDaTmkG = ((InterfaceC44149sFc) C58114yvF.OLrzqt(applicationContext, InterfaceC44149sFc.class)).invokespecialDaTmkG();
            InterfaceC44375sNm interfaceC44375sNmEZpvd = shzAEQbTJ.EZpvd();
            return new nHG(new C33842nHw(shzAEQbTJ.djBIcL(), new C35837oFn(interfaceC44375sNmEZpvd, ((InterfaceC35335ntQ) C58114yvF.OLrzqt(applicationContext, InterfaceC35335ntQ.class)).hrNTAI()), new oCD(interfaceC44375sNmEZpvd, (tWL) C43251rlk.OLrzqt(tWL.class)), coroutineDispatcherInvokespecialDaTmkG));
        }
    }

    public final nHG OLrzqt() {
        return (nHG) this.copydefault.getValue();
    }

    public static final ViewModelProvider.Factory copydefault(C33810nGr c33810nGr) {
        return c33810nGr.new TaskDescription();
    }

    private final java.util.List<IMenuItemPerformer> EZpvd() {
        return (java.util.List) this.OLrzqt.getValue();
    }

    public static final java.util.ArrayList AEQbTJ(C33810nGr c33810nGr) {
        android.os.Bundle arguments = c33810nGr.getArguments();
        if (arguments == null) {
            arguments = new android.os.Bundle();
        }
        return BundleCompat.getParcelableArrayList(arguments, "list", IMenuItemPerformer.class);
    }

    /* JADX INFO: renamed from: o.nGr$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nGr.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C33810nGr EZpvd(@NotNull java.util.List<? extends IMenuItemPerformer> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C33810nGr c33810nGr = new C33810nGr();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("list", new java.util.ArrayList<>(list));
            c33810nGr.setArguments(bundle);
            return c33810nGr;
        }
    }

    @Override // o.wXS, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(67);
        LinearLayoutCompat linearLayoutCompatEZpvd = c52781wYc.EZpvd();
        if (linearLayoutCompatEZpvd != null) {
            linearLayoutCompatEZpvd.setVisibility(8);
        }
    }

    @Override // o.wXS, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C35399nuc.TaskDescription.OLrzqt));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl();
    }

    private final void KWHzl() {
        OLrzqt().EZpvd().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.nGt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33810nGr.copydefault(this.OLrzqt, (C32989mnw) obj);
            }
        }));
    }

    public static final Unit copydefault(C33810nGr c33810nGr, C32989mnw c32989mnw) {
        AbstractActivityC33041mov abstractActivityC33041mov;
        nHG.Application application = (nHG.Application) c32989mnw.KWHzl();
        if (application != null) {
            if (application instanceof nHG.Application.C0889Application) {
                if (((nHG.Application.C0889Application) application).KWHzl()) {
                    c33810nGr.dismissAllowingStateLoss();
                    C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.sEAkxl, 0, 1, (java.lang.Object) null);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putParcelable("RESULT_IM_KEY_MENU", new HomeMarkAllAsReadMenuItemPerformer());
                    bundle.putSerializable("RESULT_IM_KEY_MENU_SELECTED", new HomeMarkAllAsReadMenuItemPerformer().AEQbTJ());
                    FragmentKt.setFragmentResult(c33810nGr, "REQUEST_IM_KEY_MENU_SELECTED", bundle);
                } else {
                    C55326xho.toastWithFailedIcon$default(C35399nuc.LoaderManager.AhwBna, 0, 1, (java.lang.Object) null);
                }
            } else if (application instanceof nHG.Application.TaskDescription) {
                C55326xho.toast$default(((nHG.Application.TaskDescription) application).OLrzqt(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            } else {
                if (!(application instanceof nHG.Application.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((nHG.Application.Activity) application).copydefault()) {
                    FragmentActivity activity = c33810nGr.getActivity();
                    abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
                    if (abstractActivityC33041mov != null) {
                        abstractActivityC33041mov.showLoadingAtOnce();
                    }
                } else {
                    FragmentActivity activity2 = c33810nGr.getActivity();
                    abstractActivityC33041mov = activity2 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity2 : null;
                    if (abstractActivityC33041mov != null) {
                        abstractActivityC33041mov.releaseLoading();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXS
    public void copydefault(@NotNull LinearLayoutCompat linearLayoutCompat) {
        Intrinsics.checkNotNullParameter(linearLayoutCompat, "");
        pUU.EZpvd("ConvoListBottomSheetMenuFragment", "menuList: " + EZpvd());
        java.util.List<IMenuItemPerformer> listEZpvd = EZpvd();
        if (listEZpvd != null) {
            int i = 0;
            for (java.lang.Object obj : listEZpvd) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                final IMenuItemPerformer iMenuItemPerformer = (IMenuItemPerformer) obj;
                java.lang.CharSequence charSequenceEZpvd = iMenuItemPerformer.EZpvd();
                if (charSequenceEZpvd != null) {
                    final android.widget.TextView textViewAEQbTJ = AEQbTJ(linearLayoutCompat, charSequenceEZpvd);
                    textViewAEQbTJ.setTypeface(C55051xce.OLrzqt.valueOf());
                    textViewAEQbTJ.setTextAppearance(C52761wXj.LoaderManager.run);
                    textViewAEQbTJ.setGravity(TextAlign.LEFT);
                    textViewAEQbTJ.setCompoundDrawablePadding(C55298xhM.dp2px$default(12.0f, null, 1, null));
                    textViewAEQbTJ.setBackgroundResource(C35399nuc.ActionBar.EZpvd);
                    java.lang.String strGEmmrt = C33129mqd.gEmmrt(iMenuItemPerformer.AEQbTJ());
                    if (!java.lang.Boolean.valueOf(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt)).booleanValue()) {
                        strGEmmrt = null;
                    }
                    if (strGEmmrt == null) {
                        strGEmmrt = "menu_item_" + i;
                    }
                    textViewAEQbTJ.setContentDescription(strGEmmrt);
                    android.graphics.drawable.Drawable drawableCopydefault = iMenuItemPerformer.copydefault();
                    if (drawableCopydefault != null) {
                        int iDp2px$default = C55298xhM.dp2px$default(32.0f, null, 1, null);
                        drawableCopydefault.setBounds(0, 0, iDp2px$default, iDp2px$default);
                    }
                    textViewAEQbTJ.setCompoundDrawablesRelative(drawableCopydefault, null, null, null);
                    textViewAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.nGq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C33810nGr.OLrzqt(iMenuItemPerformer, this, textViewAEQbTJ, view);
                        }
                    });
                }
                i++;
            }
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void OLrzqt(IMenuItemPerformer iMenuItemPerformer, C33810nGr c33810nGr, android.widget.TextView textView, android.view.View view) {
        if (iMenuItemPerformer instanceof HomeMarkAllAsReadMenuItemPerformer) {
            c33810nGr.OLrzqt().copydefault();
            return;
        }
        c33810nGr.dismissAllowingStateLoss();
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        iMenuItemPerformer.AEQbTJ(context);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("RESULT_IM_KEY_MENU", iMenuItemPerformer);
        bundle.putSerializable("RESULT_IM_KEY_MENU_SELECTED", iMenuItemPerformer.AEQbTJ());
        FragmentKt.setFragmentResult(c33810nGr, "REQUEST_IM_KEY_MENU_SELECTED", bundle);
    }
}
