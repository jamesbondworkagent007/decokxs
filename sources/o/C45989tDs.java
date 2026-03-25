package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_plugin.AllCryptoOption;
import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import com.okinc.planet.biz_plugin.future.ui.FuturePositionSearchBottomSheet$observeViewModel$1;
import com.okinc.uilab.edit.OKEditText;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C45951tCh;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tDs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45989tDs extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public tOW OLrzqt;
    public final C43316rmw copydefault;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.tDs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tDs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C45989tDs copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C45989tDs c45989tDs = new C45989tDs();
            c45989tDs.show(fragmentManager, C45989tDs.class.getSimpleName());
            return c45989tDs;
        }
    }

    public C45989tDs() {
        final Function0 function0 = new Function0() { // from class: o.tDv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45989tDs.valueOf(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_plugin.future.ui.FuturePositionSearchBottomSheet$special$$inlined$viewModels$default$1
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C45951tCh.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_plugin.future.ui.FuturePositionSearchBottomSheet$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_plugin.future.ui.FuturePositionSearchBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_plugin.future.ui.FuturePositionSearchBottomSheet$special$$inlined$viewModels$default$4
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
        this.AEQbTJ = true;
        this.copydefault = new C43316rmw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C45951tCh KWHzl() {
        return (C45951tCh) this.gEmmrt.getValue();
    }

    public static final ViewModelStoreOwner valueOf(C45989tDs c45989tDs) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c45989tDs.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C47501trL.Fragment.ODCBUN));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX));
        this.OLrzqt = tOW.copydefault(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl().EZpvd();
        copydefault();
        EZpvd();
    }

    private final void copydefault() {
        tOW tow = this.OLrzqt;
        if (tow != null) {
            this.copydefault.register(AllCryptoOption.class, new tBQ(new Function0() { // from class: o.tDp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C45989tDs.AEQbTJ(this.copydefault);
                }
            }, new Function0() { // from class: o.tDr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(C45989tDs.AYXKKw(this.OLrzqt));
                }
            }));
            this.copydefault.register(FuturePositionBean.class, new tDG(new Function1() { // from class: o.tDw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45989tDs.EZpvd(this.EZpvd, (FuturePositionBean) obj);
                }
            }));
            tow.AEQbTJ.setLayoutManager(new LinearLayoutManager(requireContext()));
            tow.AEQbTJ.setAdapter(this.copydefault);
            tow.copydefault.KWHzl.setText(C33070mpX.AYXKKw(C47501trL.Fragment.DaTmkG));
            tow.KWHzl.KWHzl().addTextChangedListener(new Application());
        }
    }

    /* JADX INFO: renamed from: o.tDs$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((FuturePositionBean) t).getTradePositionPlanetBean().getInstName(), ((FuturePositionBean) t2).getTradePositionPlanetBean().getInstName());
        }
    }

    public static final Unit AEQbTJ(C45989tDs c45989tDs) {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        tOW tow = c45989tDs.OLrzqt;
        if (tow != null && (c55230xfy = tow.KWHzl) != null && (oKEditTextKWHzl = c55230xfy.KWHzl()) != null) {
            oKEditTextKWHzl.clearFocus();
        }
        android.view.View view = c45989tDs.getView();
        if (view != null) {
            view.clearFocus();
        }
        c45989tDs.KWHzl().KWHzl();
        c45989tDs.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final boolean AYXKKw(C45989tDs c45989tDs) {
        return c45989tDs.KWHzl().copydefault().getValue().copydefault() == null;
    }

    public static final Unit EZpvd(C45989tDs c45989tDs, final FuturePositionBean futurePositionBean) {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        tOW tow = c45989tDs.OLrzqt;
        if (tow != null && (c55230xfy = tow.KWHzl) != null && (oKEditTextKWHzl = c55230xfy.KWHzl()) != null) {
            oKEditTextKWHzl.clearFocus();
        }
        android.view.View view = c45989tDs.getView();
        if (view != null) {
            view.clearFocus();
        }
        c45989tDs.KWHzl().KWHzl(futurePositionBean);
        C32866mlf.onEvent$default("Feeds_Top_PluginCardTokenFilter_Click", (TrackChannel[]) null, new Function1() { // from class: o.tDo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45989tDs.EZpvd(futurePositionBean, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        c45989tDs.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(FuturePositionBean futurePositionBean, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("plugin_type", "futures_position", true);
        eventParamsList.put("token", futurePositionBean.getTradePositionPlanetBean().getInstName(), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.tDs$Application */
    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C45989tDs.this.KWHzl().EZpvd(java.lang.String.valueOf(editable));
        }
    }

    private final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturePositionSearchBottomSheet$observeViewModel$1(this, null), 3, null);
    }

    public final void AEQbTJ(C45951tCh.TaskDescription taskDescription) {
        tOW tow = this.OLrzqt;
        if (tow != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new AllCryptoOption(C33070mpX.AYXKKw(C47501trL.Fragment.aGOrKO)));
            java.util.List<FuturePositionBean> listCopydefault = taskDescription.copydefault();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : listCopydefault) {
                java.lang.String instName = ((FuturePositionBean) obj).getTradePositionPlanetBean().getInstName();
                java.lang.Object arrayList2 = linkedHashMap.get(instName);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                    linkedHashMap.put(instName, arrayList2);
                }
                ((java.util.List) arrayList2).add(obj);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(linkedHashMap.size());
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList3.add((FuturePositionBean) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) ((Map.Entry) it.next()).getValue()));
            }
            java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList3, new Activity());
            arrayList.addAll(listEZpvd);
            this.copydefault.setItems(arrayList);
            this.copydefault.notifyDataSetChanged();
            if (listEZpvd.isEmpty() && taskDescription.AEQbTJ().length() > 0) {
                tow.AEQbTJ.setVisibility(0);
                tow.copydefault.getRoot().setVisibility(0);
            } else {
                tow.AEQbTJ.setVisibility(0);
                tow.copydefault.getRoot().setVisibility(8);
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        tOW tow = this.OLrzqt;
        if (tow != null && (c55230xfy = tow.KWHzl) != null && (oKEditTextKWHzl = c55230xfy.KWHzl()) != null) {
            oKEditTextKWHzl.clearFocus();
        }
        android.view.View view = getView();
        if (view != null) {
            view.clearFocus();
        }
        C33570myu.copydefault((android.app.Activity) getActivity());
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        tOW tow = this.OLrzqt;
        if (tow != null && (c55230xfy = tow.KWHzl) != null && (oKEditTextKWHzl = c55230xfy.KWHzl()) != null) {
            oKEditTextKWHzl.clearFocus();
        }
        super.onDestroyView();
        this.OLrzqt = null;
    }
}
