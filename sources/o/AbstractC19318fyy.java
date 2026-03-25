package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.account.api.model.wallet.BindWalletInput;
import com.okinc.account.api.model.wallet.BindWalletPreCheckResult;
import com.okinc.account.api.model.wallet.BindWalletResult;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$handlePreCheckResult$4$2;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$launch$1;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$observeUIState$1;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$observeUIState$2;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$observeUIState$3;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$observeUIState$4;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$observeUIState$5;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$observeUIState$6;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$observeUIState$7;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$observeUIState$8;
import com.okinc.business.defi.wallet.mine.walletbind.viewmodel.WalletBindViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fyy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC19318fyy extends AbstractC32996moC {
    public final ActivityResultLauncher<android.content.Context> AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final ActivityResultLauncher<BindWalletInput> valueOf;

    public AbstractC19318fyy() {
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(WalletBindViewModel.class);
        Function0<ViewModelStore> function0 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$special$$inlined$activityViewModels$default$1
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
        };
        final byte b = 0 == true ? 1 : 0;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, interfaceC56551yJoAEQbTJ, function0, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = b;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$special$$inlined$activityViewModels$default$3
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
        });
        InterfaceC8107awW interfaceC8107awW = (InterfaceC8107awW) C43251rlk.OLrzqt(InterfaceC8107awW.class);
        this.valueOf = interfaceC8107awW != null ? registerForActivityResult(interfaceC8107awW.EZpvd(), new ActivityResultCallback() { // from class: o.fyI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                AbstractC19318fyy.AEQbTJ(this.AEQbTJ, (BindWalletResult) obj);
            }
        }) : null;
        InterfaceC8106awV interfaceC8106awV = (InterfaceC8106awV) C43251rlk.OLrzqt(InterfaceC8106awV.class);
        this.AYXKKw = interfaceC8106awV != null ? registerForActivityResult(interfaceC8106awV.OLrzqt(true), new ActivityResultCallback() { // from class: o.fyG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                AbstractC19318fyy.AEQbTJ((java.lang.Boolean) obj);
            }
        }) : null;
    }

    public final WalletBindViewModel values() {
        return (WalletBindViewModel) this.AhwBna.getValue();
    }

    public static final void AEQbTJ(AbstractC19318fyy abstractC19318fyy, BindWalletResult bindWalletResult) {
        if (bindWalletResult instanceof BindWalletResult.Success) {
            abstractC19318fyy.values().hDKMBd();
        }
    }

    public static final void AEQbTJ(final java.lang.Boolean bool) {
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        final java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        C32866mlf.onEvent$default("LinkedAccount_CefiNotLogin_KycVerify_Click", (TrackChannel[]) null, new Function1() { // from class: o.fyA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC19318fyy.KWHzl(strDbNXlk, bool, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.Boolean bool, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("wallet_account_id", str, false);
        eventParamsList.put("entry_point", "wallet_default", true);
        eventParamsList.put("is_logged", bool.booleanValue() ? "yes" : "no", true);
        return Unit.INSTANCE;
    }

    public void fARcdN() {
        copydefault(new WalletBaseBindFragment$observeUIState$1(this, null));
        copydefault(new WalletBaseBindFragment$observeUIState$2(this, null));
        copydefault(new WalletBaseBindFragment$observeUIState$3(this, null));
        copydefault(new WalletBaseBindFragment$observeUIState$4(this, null));
        copydefault(new WalletBaseBindFragment$observeUIState$5(this, null));
        copydefault(new WalletBaseBindFragment$observeUIState$6(this, null));
        copydefault(new WalletBaseBindFragment$observeUIState$7(this, null));
        copydefault(new WalletBaseBindFragment$observeUIState$8(this, null));
    }

    public final void copydefault(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletBaseBindFragment$launch$1(function2, null), 3, null);
    }

    public final void EZpvd(BindWalletPreCheckResult bindWalletPreCheckResult) {
        if (bindWalletPreCheckResult instanceof BindWalletPreCheckResult.NeedLogin) {
            C32866mlf.onEvent$default("LinkedAccount_CefiNotLogin_BottomSheet_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            copydefault(new DefiWalletVReminderDFragment.ReminderDataBean(0, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ilfrrN), C33070mpX.AYXKKw(C13754dXa.FragmentManager.iRgjgR), C33070mpX.AYXKKw(C13754dXa.FragmentManager.iZzfmt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.RZMhtF), 3, null), new Function0() { // from class: o.fyM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC19318fyy.EZpvd(this.KWHzl);
                }
            }, new Function0() { // from class: o.fyP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC19318fyy.fetchVPNInfo();
                }
            }, new Function0() { // from class: o.fyL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC19318fyy.AkhnZx();
                }
            });
            return;
        }
        if (bindWalletPreCheckResult instanceof BindWalletPreCheckResult.NeedSwitchMainAccount) {
            copydefault(new DefiWalletVReminderDFragment.ReminderDataBean(0, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.sanrWj), C33070mpX.AYXKKw(C13754dXa.FragmentManager.hfeTOA), C33070mpX.AYXKKw(C13754dXa.FragmentManager.gdwsGQ), C33070mpX.AYXKKw(C13754dXa.FragmentManager.RZMhtF), 3, null), new Function0() { // from class: o.fyx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC19318fyy.KWHzl(this.OLrzqt);
                }
            }, new Function0() { // from class: o.fyB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC19318fyy.isConnected();
                }
            }, new Function0() { // from class: o.fyE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC19318fyy.DbNXlk();
                }
            });
        } else if (bindWalletPreCheckResult instanceof BindWalletPreCheckResult.ReachedMaxAccLimit) {
            C32866mlf.onEvent$default("LinkedAccount_Capacity_BottomSheet_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            showReminderDialog$default(this, new DefiWalletVReminderDFragment.ReminderDataBean(0, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.onLocationChanged), C33069mpW.copydefault(C13754dXa.FragmentManager.sEAkxl, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", ((BindWalletPreCheckResult.ReachedMaxAccLimit) bindWalletPreCheckResult).getMaxCapacity()))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DCJXGO), "", 3, null), null, null, null, 14, null);
        }
    }

    public static final Unit EZpvd(AbstractC19318fyy abstractC19318fyy) {
        C32866mlf.onEvent$default("LinkedAccount_CefiNotLogin_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fyz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC19318fyy.fetchVPNInfo((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        ActivityResultLauncher<android.content.Context> activityResultLauncher = abstractC19318fyy.AYXKKw;
        if (activityResultLauncher != null) {
            android.content.Context context = abstractC19318fyy.getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            activityResultLauncher.launch(context);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "log_in", true);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo() {
        C32866mlf.onEvent$default("LinkedAccount_CefiNotLogin_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fyC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC19318fyy.DbNXlk((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "maybe_later", true);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx() {
        C32866mlf.onEvent$default("LinkedAccount_CefiNotLogin_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fyJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC19318fyy.gEmmrt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "exit_bottomsheet", true);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC19318fyy abstractC19318fyy) {
        C32866mlf.onEvent$default("LinkedAccount_SubAccount_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fyH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC19318fyy.djBIcL((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        LifecycleOwner viewLifecycleOwner = abstractC19318fyy.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletBaseBindFragment$handlePreCheckResult$4$2(abstractC19318fyy, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "switch_to_main_account", true);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected() {
        C32866mlf.onEvent$default("LinkedAccount_SubAccount_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fyK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC19318fyy.AhwBna((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "maybe_later", true);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk() {
        C32866mlf.onEvent$default("LinkedAccount_SubAccount_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fyD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC19318fyy.valueOf((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "exit_bottomsheet", true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.fyy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showReminderDialog$default(AbstractC19318fyy abstractC19318fyy, DefiWalletVReminderDFragment.ReminderDataBean reminderDataBean, Function0 function0, Function0 function02, Function0 function03, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showReminderDialog");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        if ((i & 8) != 0) {
            function03 = null;
        }
        abstractC19318fyy.copydefault(reminderDataBean, function0, function02, function03);
    }

    public final void copydefault(DefiWalletVReminderDFragment.ReminderDataBean reminderDataBean, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03) {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed() || getChildFragmentManager().isStateSaved() || getChildFragmentManager().isDestroyed()) {
            return;
        }
        DefiWalletVReminderDFragment defiWalletVReminderDFragmentEZpvd = DefiWalletVReminderDFragment.Companion.EZpvd(reminderDataBean);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        defiWalletVReminderDFragmentEZpvd.AEQbTJ(childFragmentManager, new Function1() { // from class: o.fyF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC19318fyy.KWHzl(function0, function02, function03, (java.lang.Integer) obj);
            }
        });
    }

    public static final Unit KWHzl(Function0 function0, Function0 function02, Function0 function03, java.lang.Integer num) {
        if (num != null && num.intValue() == 1) {
            if (function0 != null) {
                function0.invoke();
            }
        } else if (num != null && num.intValue() == 2) {
            if (function02 != null) {
                function02.invoke();
            }
        } else if (function03 != null) {
            function03.invoke();
        }
        return Unit.INSTANCE;
    }
}
