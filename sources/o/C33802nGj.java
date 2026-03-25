package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.conversation.message.menu.ListMenuPopupWindow;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import com.okinc.im.imui.conversation.message.menu.impl.MarkConversationAsReadMenuItemPerformer;
import com.okinc.im.imui.conversation.message.menu.impl.PinConversationMenuItemPerformer;
import com.okinc.im.imui.conversationlist.error.ConversationListSubAccountFragment$setupFlowListener$1;
import com.okinc.im.imui.conversationlist.error.ConversationListSubAccountViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C33802nGj;
import o.C35399nuc;
import o.nGR;
import o.rXT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nGj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C33802nGj extends AbstractC33813nGu {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final int EZpvd = C35399nuc.Dialog.invokespecialgBtXYZ;
    public final nEE OLrzqt;
    public nOK copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    public C33802nGj() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.conversationlist.error.ConversationListSubAccountFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.conversationlist.error.ConversationListSubAccountFragment$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ConversationListSubAccountViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.conversationlist.error.ConversationListSubAccountFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.conversationlist.error.ConversationListSubAccountFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.conversationlist.error.ConversationListSubAccountFragment$special$$inlined$viewModels$default$5
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
        this.OLrzqt = new nEE(new nEI());
    }

    public final ConversationListSubAccountViewModel KWHzl() {
        return (ConversationListSubAccountViewModel) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "");
        nOK nokOLrzqt = nOK.OLrzqt(view);
        this.copydefault = nokOLrzqt;
        if (nokOLrzqt != null && (imageView = nokOLrzqt.copydefault) != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C33054mpH.loadUrl$default(imageView, C43454rpb.copydefault("images/im/privacy_notice.webp", contextRequireContext, true), null, 0, 0, 14, null);
        }
        nOK nok = this.copydefault;
        if (nok != null) {
            RecyclerView recyclerView = nok.KWHzl;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            copydefault(recyclerView);
            C52794wYp c52794wYp = nok.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            EZpvd(c52794wYp);
        }
        OLrzqt();
        KWHzl().OLrzqt();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KWHzl().copydefault();
    }

    /* JADX INFO: renamed from: o.nGj$StateListAnimator */
    public static final class StateListAnimator implements nGR.ActionBar {
        public StateListAnimator() {
        }

        @Override // o.nGR.ActionBar
        public void copydefault(nGE nge) {
            rXL rxlDjBIcL;
            Intrinsics.checkNotNullParameter(nge, "");
            C33802nGj.this.KWHzl().OLrzqt(nge.AEQbTJ());
            rXT rxt = (rXT) C43251rlk.OLrzqt(rXT.class);
            if (rxt != null) {
                android.content.Context contextRequireContext = C33802nGj.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                nGF ngf = nge instanceof nGF ? (nGF) nge : null;
                android.content.Intent intentBuildNotificationCenterIntent$default = rXT.StateListAnimator.buildNotificationCenterIntent$default(rxt, contextRequireContext, (ngf == null || (rxlDjBIcL = ngf.djBIcL()) == null) ? null : rxlDjBIcL.EZpvd(), null, 4, null);
                if (intentBuildNotificationCenterIntent$default != null) {
                    C33802nGj.this.startActivity(intentBuildNotificationCenterIntent$default);
                }
            }
        }

        @Override // o.nGR.ActionBar
        public void KWHzl(final nGE nge, android.view.View view, kotlin.Pair<java.lang.Float, java.lang.Float> pair) {
            java.util.List<? extends IMenuItemPerformer> listEZpvd;
            Intrinsics.checkNotNullParameter(nge, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(pair, "");
            int i = 2;
            if (nge instanceof nGF) {
                final C33802nGj c33802nGj = C33802nGj.this;
                listEZpvd = yDY.gEmmrt(new PinConversationMenuItemPerformer(nge.AEQbTJ()), new MarkConversationAsReadMenuItemPerformer(new Function0() { // from class: o.nGp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C33802nGj.StateListAnimator.KWHzl(c33802nGj, nge);
                    }
                }));
            } else {
                final C33802nGj c33802nGj2 = C33802nGj.this;
                listEZpvd = C56402yEa.EZpvd(new MarkConversationAsReadMenuItemPerformer(new Function0() { // from class: o.nGl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C33802nGj.StateListAnimator.AEQbTJ(c33802nGj2, nge);
                    }
                }));
            }
            android.content.Context contextRequireContext = C33802nGj.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            new ListMenuPopupWindow(contextRequireContext, null, i, 0 == true ? 1 : 0).copydefault(view, listEZpvd, pair.getFirst().floatValue(), pair.getSecond().floatValue());
        }

        public static final Unit KWHzl(C33802nGj c33802nGj, nGE nge) {
            c33802nGj.KWHzl().OLrzqt(nge.AEQbTJ());
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(C33802nGj c33802nGj, nGE nge) {
            c33802nGj.KWHzl().OLrzqt(nge.AEQbTJ());
            return Unit.INSTANCE;
        }
    }

    private final void copydefault(RecyclerView recyclerView) {
        nEE nee = this.OLrzqt;
        C33824nHe c33824nHe = new C33824nHe();
        c33824nHe.OLrzqt(new StateListAnimator());
        nee.copydefault(c33824nHe);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.setAdapter(this.OLrzqt);
    }

    public final void EZpvd(C52794wYp c52794wYp) {
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.nGg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C33802nGj.AEQbTJ(this.OLrzqt, view);
            }
        });
    }

    public static final void AEQbTJ(C33802nGj c33802nGj, android.view.View view) {
        InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
        android.content.Context contextRequireContext = c33802nGj.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC8104awT.KWHzl(contextRequireContext, "planet_chat");
    }

    public final void OLrzqt() {
        Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(KWHzl().EZpvd(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new ConversationListSubAccountFragment$setupFlowListener$1(this, null));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.copydefault = null;
    }

    /* JADX INFO: renamed from: o.nGj$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nGj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C33802nGj AEQbTJ() {
            return new C33802nGj();
        }
    }
}
