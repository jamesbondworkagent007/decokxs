package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.bean.SearchResultData;
import com.okinc.im.imui.search.view.FeedChatSearchResultFragment$setupObserver$1$1;
import com.okinc.im.imui.search.view.FeedChatSearchResultFragment$setupObserver$1$2;
import com.okinc.im.imui.search.viewmodel.FeedChatSearchViewModel;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC36573odX;
import o.C35399nuc;
import o.C37290oqz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ouo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37491ouo extends AbstractC37467ouQ {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public nKA AEQbTJ;
    public final C37418otU AYXKKw = new C37418otU(new C37421otX());
    public final ActivityResultLauncher<android.content.Intent> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX INFO: renamed from: o.ouo$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SearchResultData.LoadMore.values().length];
            try {
                iArr[SearchResultData.LoadMore.CHAT_AND_CONTACT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SearchResultData.LoadMore.MESSAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35399nuc.Dialog.Dmq;
    }

    public C37491ouo() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.search.view.FeedChatSearchResultFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.search.view.FeedChatSearchResultFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FeedChatSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.search.view.FeedChatSearchResultFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.search.view.FeedChatSearchResultFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.search.view.FeedChatSearchResultFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.ouq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37491ouo.djBIcL(this.copydefault);
            }
        });
        this.EZpvd = C37290oqz.registerForImNewChatActivityResult$default(C37290oqz.copydefault, this, (C37290oqz.StateListAnimator) null, 1, (java.lang.Object) null);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ouv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37491ouo.AYXKKw(this.KWHzl);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ouw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37491ouo.gEmmrt(this.EZpvd);
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.ouQ.OLrzqt()V */
    public final FeedChatSearchViewModel OLrzqt() {
        return (FeedChatSearchViewModel) this.gEmmrt.getValue();
    }

    public final java.util.List<SearchResultData> AEQbTJ() {
        return (java.util.List) this.djBIcL.getValue();
    }

    private final java.lang.String djBIcL() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String AYXKKw(C37491ouo c37491ouo) {
        java.lang.String string = c37491ouo.requireArguments().getString("ARGS_KEYWORD");
        return string == null ? "" : string;
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String gEmmrt(C37491ouo c37491ouo) {
        java.lang.String string = c37491ouo.requireArguments().getString("ARGS_FROM_PAGE");
        return string == null ? "" : string;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = nKA.copydefault(view);
        AhwBna();
        gEmmrt();
        OLrzqt().AEQbTJ(AEQbTJ());
    }

    private final void AhwBna() {
        FeedChatSearchViewModel feedChatSearchViewModelOLrzqt = OLrzqt();
        StateFlow<java.util.List<SearchResultData>> stateFlowEZpvd = feedChatSearchViewModelOLrzqt.EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowEZpvd, viewLifecycleOwner, (Lifecycle.State) null, new FeedChatSearchResultFragment$setupObserver$1$1(this, null), 2, (java.lang.Object) null);
        StateFlow<java.lang.Boolean> stateFlowKWHzl = feedChatSearchViewModelOLrzqt.KWHzl();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C37721ozF.collectOnLifecycle$default(stateFlowKWHzl, viewLifecycleOwner2, (Lifecycle.State) null, new FeedChatSearchResultFragment$setupObserver$1$2(this, null), 2, (java.lang.Object) null);
    }

    private final void gEmmrt() {
        C33546myW c33546myW;
        RecyclerView recyclerView;
        C37418otU c37418otU = this.AYXKKw;
        c37418otU.EZpvd(new C37481oue());
        c37418otU.EZpvd(new C37483oug(new Function1() { // from class: o.out
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37491ouo.copydefault(this.EZpvd, (SearchResultData.LoadMore) obj);
            }
        }));
        c37418otU.EZpvd(new C37479ouc(new Function0() { // from class: o.ous
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37491ouo.fetchVPNInfo(this.KWHzl);
            }
        }, new Function1() { // from class: o.oux
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37491ouo.KWHzl(this.KWHzl, (SearchResultData.ChatAndContact) obj);
            }
        }));
        c37418otU.EZpvd(new C37422otY(new Function0() { // from class: o.ouA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37491ouo.DbNXlk(this.copydefault);
            }
        }, new Function1() { // from class: o.ouz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37491ouo.EZpvd(this.AEQbTJ, (SearchResultData.Message) obj);
            }
        }));
        nKA nka = this.AEQbTJ;
        if (nka != null && (recyclerView = nka.KWHzl) != null) {
            recyclerView.setAdapter(this.AYXKKw);
            recyclerView.setItemAnimator(null);
            recyclerView.addItemDecoration(new C37419otV(this.AYXKKw));
            C37716ozA.EZpvd(recyclerView);
        }
        nKA nka2 = this.AEQbTJ;
        if (nka2 == null || (c33546myW = nka2.OLrzqt) == null) {
            return;
        }
        c33546myW.AhwBna(false);
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.ouy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C37491ouo.OLrzqt(this.AEQbTJ, interfaceC57934yrl);
            }
        });
    }

    public static final Unit copydefault(C37491ouo c37491ouo, SearchResultData.LoadMore loadMore) {
        Intrinsics.checkNotNullParameter(loadMore, "");
        int i = Activity.AEQbTJ[loadMore.ordinal()];
        if (i == 1) {
            c37491ouo.OLrzqt().KWHzl(c37491ouo.AEQbTJ());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c37491ouo.OLrzqt().AEQbTJ(c37491ouo.djBIcL());
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.String fetchVPNInfo(C37491ouo c37491ouo) {
        return c37491ouo.djBIcL();
    }

    public static final Unit KWHzl(final C37491ouo c37491ouo, SearchResultData.ChatAndContact chatAndContact) {
        Intrinsics.checkNotNullParameter(chatAndContact, "");
        C32866mlf.onEvent$default("Search_List_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.ouu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37491ouo.OLrzqt(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        ActivityC36573odX.Activity activity = ActivityC36573odX.Companion;
        FragmentActivity fragmentActivityRequireActivity = c37491ouo.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        OKConversation conversation = chatAndContact.getConversation();
        java.lang.String targetId = conversation != null ? conversation.getTargetId() : null;
        RelationInfo relation = chatAndContact.getRelation();
        java.lang.String contactsId = relation != null ? relation.getContactsId() : null;
        c37491ouo.EZpvd.launch(activity.KWHzl(fragmentActivityRequireActivity, (452 & 2) != 0 ? null : targetId, (452 & 4) != 0 ? null : null, (452 & 8) != 0 ? null : c37491ouo.djBIcL(), (452 & 16) != 0 ? null : C35182nqW.KWHzl("search"), (452 & 32) != 0 ? null : contactsId, (452 & 64) != 0 ? null : null, (452 & 128) != 0 ? null : null, (452 & 256) == 0 ? null : null));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C37491ouo c37491ouo, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("from_page", c37491ouo.valueOf(), true);
        eventParamsList.put("tab", "chat", true);
        eventParamsList.put("biz_type", "chat", true);
        eventParamsList.put("click_item_type", "chat_contact", true);
        return Unit.INSTANCE;
    }

    public static final java.lang.String DbNXlk(C37491ouo c37491ouo) {
        return c37491ouo.djBIcL();
    }

    public static final Unit EZpvd(final C37491ouo c37491ouo, SearchResultData.Message message) {
        Intrinsics.checkNotNullParameter(message, "");
        C32866mlf.onEvent$default("Search_List_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.ouB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37491ouo.copydefault(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        ActivityC36573odX.Activity activity = ActivityC36573odX.Companion;
        FragmentActivity fragmentActivityRequireActivity = c37491ouo.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c37491ouo.EZpvd.launch(activity.KWHzl(fragmentActivityRequireActivity, (452 & 2) != 0 ? null : message.getConversation().getTargetId(), (452 & 4) != 0 ? null : message.getMessage(), (452 & 8) != 0 ? null : c37491ouo.djBIcL(), (452 & 16) != 0 ? null : C35182nqW.KWHzl("search"), (452 & 32) != 0 ? null : null, (452 & 64) != 0 ? null : null, (452 & 128) != 0 ? null : null, (452 & 256) == 0 ? null : null));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C37491ouo c37491ouo, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("from_page", c37491ouo.valueOf(), true);
        eventParamsList.put("tab", "chat", true);
        eventParamsList.put("biz_type", "chat", true);
        eventParamsList.put("click_item_type", "chat_message", true);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C37491ouo c37491ouo, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c37491ouo.OLrzqt().KWHzl(c37491ouo.djBIcL());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        final Function0 function0 = null;
        ((C37454ouD) FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37454ouD.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.search.view.FeedChatSearchResultFragment$onDestroy$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.search.view.FeedChatSearchResultFragment$onDestroy$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.search.view.FeedChatSearchResultFragment$onDestroy$$inlined$activityViewModels$default$3
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
        }).getValue()).copydefault();
        this.AEQbTJ = null;
    }

    /* JADX INFO: renamed from: o.ouo$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ouo.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C37491ouo AEQbTJ(@NotNull java.util.List<? extends SearchResultData> list, @NotNull java.lang.String str, java.lang.String str2, @NotNull final androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("ARGS_KEYWORD", str);
            bundle.putString("ARGS_FROM_PAGE", str2);
            final Function0 function0 = null;
            ((C37454ouD) FragmentViewModelLazyKt.createViewModelLazy(fragment, C56524yIo.AEQbTJ(C37454ouD.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.search.view.FeedChatSearchResultFragment$Companion$newInstance$$inlined$activityViewModels$default$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStore invoke() {
                    ViewModelStore viewModelStore = fragment.requireActivity().getViewModelStore();
                    Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                    return viewModelStore;
                }
            }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.search.view.FeedChatSearchResultFragment$Companion$newInstance$$inlined$activityViewModels$default$2
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
                    CreationExtras defaultViewModelCreationExtras = fragment.requireActivity().getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                    return defaultViewModelCreationExtras;
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.search.view.FeedChatSearchResultFragment$Companion$newInstance$$inlined$activityViewModels$default$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelProvider.Factory invoke() {
                    ViewModelProvider.Factory defaultViewModelProviderFactory = fragment.requireActivity().getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                    return defaultViewModelProviderFactory;
                }
            }).getValue()).KWHzl(list);
            C37491ouo c37491ouo = new C37491ouo();
            c37491ouo.setArguments(bundle);
            return c37491ouo;
        }
    }

    public static final java.util.List djBIcL(final C37491ouo c37491ouo) {
        final Function0 function0 = null;
        return ((C37454ouD) FragmentViewModelLazyKt.createViewModelLazy(c37491ouo, C56524yIo.AEQbTJ(C37454ouD.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.search.view.FeedChatSearchResultFragment$resultList_delegate$lambda$0$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = c37491ouo.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.search.view.FeedChatSearchResultFragment$resultList_delegate$lambda$0$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = c37491ouo.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.search.view.FeedChatSearchResultFragment$resultList_delegate$lambda$0$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = c37491ouo.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }).getValue()).EZpvd();
    }
}
