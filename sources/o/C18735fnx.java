package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import com.okinc.business.defi.wallet.mine.addressbook.list.WalletAddressBookListFragment$observeAddButtonEnabledState$1;
import com.okinc.business.defi.wallet.mine.addressbook.list.WalletAddressBookListFragment$observeAddressesState$1;
import com.okinc.business.defi.wallet.mine.addressbook.list.WalletAddressBookListViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import o.Point;
import o.xWD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fnx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18735fnx extends AbstractC18732fnu {
    public C18647fmO AYXKKw;
    public C16626enV AhwBna;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.invokespecialhOMIpD;
    }

    public C18735fnx() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.list.WalletAddressBookListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.list.WalletAddressBookListFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletAddressBookListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.list.WalletAddressBookListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.list.WalletAddressBookListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.addressbook.list.WalletAddressBookListFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX DEBUG: Possible override for method o.fnu.KWHzl()V */
    public final WalletAddressBookListViewModel KWHzl() {
        return (WalletAddressBookListViewModel) this.valueOf.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C16626enV c16626enVCopydefault = C16626enV.copydefault(view);
        this.AhwBna = c16626enVCopydefault;
        if (c16626enVCopydefault != null) {
            AEQbTJ(c16626enVCopydefault);
        }
        AYXKKw();
        gEmmrt();
    }

    public final void AEQbTJ(C16626enV c16626enV) {
        c16626enV.OLrzqt.setTitleTypeface("harmony_sans_bold.ttf");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(requireContext(), xWD.Activity.KWHzl);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(requireContext(), 1);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
        }
        this.AYXKKw = new C18647fmO(new Function1() { // from class: o.fnt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18735fnx.copydefault(this.KWHzl, (AddressBookEntity) obj);
            }
        });
        c16626enV.valueOf.addItemDecoration(dividerItemDecoration);
        c16626enV.valueOf.setAdapter(this.AYXKKw);
        C52794wYp c52794wYp = c16626enV.AEQbTJ;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        android.widget.EditText editTextEZpvd = c16626enV.KWHzl.EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C33606mzd.copydefault(editTextEZpvd, viewLifecycleOwner, new Function1() { // from class: o.fnB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18735fnx.OLrzqt(this.AEQbTJ, (java.lang.CharSequence) obj);
            }
        });
        c16626enV.KWHzl.EZpvd().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.fnC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C18735fnx.copydefault(this.KWHzl, view, z);
            }
        });
    }

    public static final Unit copydefault(C18735fnx c18735fnx, AddressBookEntity addressBookEntity) {
        Intrinsics.checkNotNullParameter(addressBookEntity, "");
        FragmentActivity activity = c18735fnx.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        c18735fnx.copydefault("address_list");
        C33570myu.copydefault((android.app.Activity) activity);
        c18735fnx.copydefault(activity, addressBookEntity.getAddress());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C18735fnx c18735fnx, java.lang.CharSequence charSequence) {
        WalletAddressBookListViewModel walletAddressBookListViewModelKWHzl = c18735fnx.KWHzl();
        java.lang.String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        walletAddressBookListViewModelKWHzl.AEQbTJ(string);
        return Unit.INSTANCE;
    }

    public static final void copydefault(C18735fnx c18735fnx, android.view.View view, boolean z) {
        if (z) {
            c18735fnx.copydefault("search");
        }
    }

    public static /* synthetic */ void navigateToAddressBookDetail$default(C18735fnx c18735fnx, FragmentActivity fragmentActivity, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        c18735fnx.copydefault(fragmentActivity, str);
    }

    public final void copydefault(FragmentActivity fragmentActivity, java.lang.String str) {
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.setCustomAnimations(C52761wXj.Application.OLrzqt, C52761wXj.Application.AYXKKw, C52761wXj.Application.KWHzl, C52761wXj.Application.djBIcL);
        fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.XW, C18713fnb.Companion.KWHzl(str));
        fragmentTransactionBeginTransaction.addToBackStack(null);
        fragmentTransactionBeginTransaction.commit();
    }

    private final void AYXKKw() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletAddressBookListFragment$observeAddressesState$1(this, null), 3, null);
    }

    public final void gEmmrt() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletAddressBookListFragment$observeAddButtonEnabledState$1(this, null), 3, null);
    }

    public final void AEQbTJ(Point<? extends java.util.List<AddressBookEntity>> point) {
        C55173xeu c55173xeu;
        C55173xeu c55173xeu2;
        if (point == null) {
            return;
        }
        if (point instanceof Point.StateListAnimator) {
            showLoadingAtOnce();
            C16626enV c16626enV = this.AhwBna;
            if (c16626enV != null && (c55173xeu2 = c16626enV.EZpvd) != null) {
                c55173xeu2.setVisibility(8);
            }
            OLrzqt(false);
            return;
        }
        if (point instanceof Point.Application) {
            dismissLoading();
            Point.Application<? extends java.util.List<AddressBookEntity>> application = (Point.Application) point;
            java.util.List<AddressBookEntity> listCopydefault = application.copydefault();
            if (KWHzl().AEQbTJ()) {
                KWHzl(application);
            } else {
                AEQbTJ(listCopydefault);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (!(point instanceof Point.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        dismissLoading();
        C16626enV c16626enV2 = this.AhwBna;
        if (c16626enV2 != null && (c55173xeu = c16626enV2.EZpvd) != null) {
            c55173xeu.setVisibility(8);
        }
        OLrzqt(false);
        java.lang.String strEZpvd = ((Point.TaskDescription) point).EZpvd();
        if (strEZpvd != null) {
            C55326xho.toast$default(strEZpvd, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public final void KWHzl(Point.Application<? extends java.util.List<AddressBookEntity>> application) {
        C55173xeu c55173xeu;
        C55173xeu c55173xeu2;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        if (application.copydefault().isEmpty()) {
            C16626enV c16626enV = this.AhwBna;
            if (c16626enV != null && (c55173xeu2 = c16626enV.EZpvd) != null) {
                c55173xeu2.setVisibility(0);
            }
            C16626enV c16626enV2 = this.AhwBna;
            if (c16626enV2 != null) {
                c16626enV2.EZpvd.setEmptyTypeImage(7);
                C55173xeu c55173xeu3 = c16626enV2.EZpvd;
                java.lang.String string = context.getString(C13754dXa.FragmentManager.fFgQHt);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55173xeu3.setSubTitle((java.lang.CharSequence) string);
                c16626enV2.EZpvd.setTitle("");
            }
        } else {
            C16626enV c16626enV3 = this.AhwBna;
            if (c16626enV3 != null && (c55173xeu = c16626enV3.EZpvd) != null) {
                c55173xeu.setVisibility(8);
            }
        }
        C18647fmO c18647fmO = this.AYXKKw;
        if (c18647fmO != null) {
            c18647fmO.submitList(application.copydefault());
        }
    }

    public final void AEQbTJ(java.util.List<AddressBookEntity> list) {
        C55173xeu c55173xeu;
        C55173xeu c55173xeu2;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        if (list.isEmpty()) {
            C16626enV c16626enV = this.AhwBna;
            if (c16626enV != null && (c55173xeu2 = c16626enV.EZpvd) != null) {
                c55173xeu2.setVisibility(0);
            }
            OLrzqt(false);
            C16626enV c16626enV2 = this.AhwBna;
            if (c16626enV2 != null) {
                c16626enV2.KWHzl.EZpvd().setText("");
                c16626enV2.KWHzl.EZpvd().clearFocus();
                c16626enV2.EZpvd.setEmptyTypeImage(6);
                C55173xeu c55173xeu3 = c16626enV2.EZpvd;
                java.lang.String string = context.getString(C13754dXa.FragmentManager.RAQtXZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55173xeu3.setTitle(string);
                C55173xeu c55173xeu4 = c16626enV2.EZpvd;
                java.lang.String string2 = context.getString(C13754dXa.FragmentManager.getSmallIconId);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                c55173xeu4.setSubTitle((java.lang.CharSequence) string2);
            }
        } else {
            C16626enV c16626enV3 = this.AhwBna;
            if (c16626enV3 != null && (c55173xeu = c16626enV3.EZpvd) != null) {
                c55173xeu.setVisibility(8);
            }
            OLrzqt(true);
        }
        C18647fmO c18647fmO = this.AYXKKw;
        if (c18647fmO != null) {
            c18647fmO.submitList(list);
        }
    }

    /* JADX INFO: renamed from: o.fnx$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C18735fnx EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C18735fnx c18735fnx) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c18735fnx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C32866mlf.onEvent$default("AddressBook_Btm_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                C18735fnx c18735fnx = this.EZpvd;
                FragmentActivity activity = c18735fnx.getActivity();
                if (activity == null) {
                    return;
                }
                C18735fnx.navigateToAddressBookDetail$default(c18735fnx, activity, null, 2, null);
            }
        }
    }

    public final void OLrzqt(boolean z) {
        RecyclerView recyclerView;
        C55230xfy c55230xfy;
        C16626enV c16626enV = this.AhwBna;
        if (c16626enV != null && (c55230xfy = c16626enV.KWHzl) != null) {
            c55230xfy.setVisibility(z ? 0 : 8);
        }
        C16626enV c16626enV2 = this.AhwBna;
        if (c16626enV2 == null || (recyclerView = c16626enV2.valueOf) == null) {
            return;
        }
        recyclerView.setVisibility(z ? 0 : 8);
    }

    private final void copydefault(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3AddressBook_Top_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fnz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18735fnx.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
        this.AhwBna = null;
    }
}
