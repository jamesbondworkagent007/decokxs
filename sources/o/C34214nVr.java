package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.account.api.service.UserInfoService;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.group.create.IMEditProfileScenario;
import com.okinc.im.imui.group.management.GroupSettingsFragment$addPrivatePublicGroupConversionSettings$1$1;
import com.okinc.im.imui.group.management.GroupSettingsFragment$getLatestGroupDescription$1;
import com.okinc.im.imui.group.management.GroupSettingsFragment$getLatestGroupDescription$2;
import com.okinc.im.imui.group.management.GroupSettingsFragment$initViewModel$1;
import com.okinc.im.imui.group.management.GroupSettingsFragment$observeGroupInfo$2;
import com.okinc.im.imui.group.management.GroupSettingsFragment$observeUiEvents$2;
import com.okinc.im.imui.group.management.GroupSettingsFragment$observeUiState$2;
import com.okinc.im.imui.group.management.GroupSettingsFragment$showPrivatePublicConversionDescriptionBottomSheet$1;
import com.okinc.im.imui.group.management.viewmodel.GroupManagementViewModel;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C34237nWn;
import o.C35399nuc;
import o.C52761wXj;
import o.C55284xgz;
import o.nVO;
import o.oHT;
import o.tWL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nVr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C34214nVr extends nVN implements C34237nWn.StateListAnimator {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm OLrzqt;

    public C34214nVr() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.group.management.GroupSettingsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.group.management.GroupSettingsFragment$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(GroupManagementViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.management.GroupSettingsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.management.GroupSettingsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.management.GroupSettingsFragment$special$$inlined$viewModels$default$5
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

    /* JADX DEBUG: Possible override for method o.nVN.EZpvd()V */
    public final GroupManagementViewModel EZpvd() {
        return (GroupManagementViewModel) this.OLrzqt.getValue();
    }

    /* JADX INFO: renamed from: o.nVr$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nVr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C34214nVr OLrzqt(@NotNull GroupInfo groupInfo) {
            Intrinsics.checkNotNullParameter(groupInfo, "");
            C34214nVr c34214nVr = new C34214nVr();
            c34214nVr.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_GROUP_INFO", groupInfo)));
            return c34214nVr;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AhwBna();
        getParentFragmentManager().setFragmentResultListener("INCREASE_GROUP_SIZE_REQUEST", this, new FragmentResultListener() { // from class: o.nVB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                C34214nVr.OLrzqt(this.OLrzqt, str, bundle2);
            }
        });
    }

    public static final void OLrzqt(C34214nVr c34214nVr, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        boolean z = bundle.getBoolean("KEY_INCREASE_ACCEPTED", false);
        int i = bundle.getInt("KEY_GROUP_CAPACITY", 0);
        if (z) {
            c34214nVr.EZpvd().KWHzl(i);
        }
    }

    private final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupSettingsFragment$initViewModel$1(this, null), 3, null);
    }

    public final java.lang.Object EZpvd(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(FlowKt.filterNotNull(EZpvd().AEQbTJ()), new GroupSettingsFragment$observeGroupInfo$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(EZpvd().OLrzqt(), new GroupSettingsFragment$observeUiState$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(EZpvd().EZpvd(), new GroupSettingsFragment$observeUiEvents$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchVPNInfo() {
        IMEditProfileScenario.ImGroup imGroup = IMEditProfileScenario.ImGroup.copydefault;
        UserInfoService userInfoService = (UserInfoService) C43251rlk.copydefault(UserInfoService.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        UserInfoService.Application.startEditProfileFlow$default(userInfoService, fragmentActivityRequireActivity, imGroup.AEQbTJ(), null, new Dialog(), imGroup.OLrzqt(), imGroup.EZpvd(), imGroup.copydefault(), 4, null);
    }

    /* JADX INFO: renamed from: o.nVr$Dialog */
    public static final class Dialog implements UserInfoService.Activity {
        public Dialog() {
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        EZpvd().copydefault();
    }

    public final java.util.List<C35694oAf> EZpvd(final GroupInfo groupInfo) {
        java.util.List<C35694oAf> listOLrzqt = C56402yEa.OLrzqt();
        copydefault(listOLrzqt, new Function1() { // from class: o.nVD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34214nVr.AEQbTJ(this.copydefault, groupInfo, (java.util.List) obj);
            }
        }, new Function1() { // from class: o.nVG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34214nVr.copydefault(this.copydefault, groupInfo, (java.util.List) obj);
            }
        }, new Function1() { // from class: o.nVF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34214nVr.valueOf(this.OLrzqt, groupInfo, (java.util.List) obj);
            }
        });
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public static final Unit AEQbTJ(C34214nVr c34214nVr, GroupInfo groupInfo, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c34214nVr.EZpvd((java.util.List<C35694oAf>) list, groupInfo);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C34214nVr c34214nVr, GroupInfo groupInfo, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c34214nVr.AEQbTJ((java.util.List<C35694oAf>) list, groupInfo);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C34214nVr c34214nVr, GroupInfo groupInfo, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c34214nVr.copydefault((java.util.List<C35694oAf>) list, groupInfo);
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.util.List<C35694oAf> list, final GroupInfo groupInfo) {
        boolean zIsAllowSetRole = groupInfo.isAllowSetRole();
        boolean zIsCanTransferOwnership = groupInfo.isCanTransferOwnership();
        java.lang.Integer type = groupInfo.getType();
        boolean z = type != null && type.intValue() == GroupTagType.AFFILIATE.getValue();
        boolean convertGroupToPublic = groupInfo.getConvertGroupToPublic();
        boolean zOLrzqt = InHouseIMSuperGroupConfig.IncreaseGroupStatus.Companion.OLrzqt(groupInfo.getIncreaseGroupStatus());
        if (zIsAllowSetRole || zIsCanTransferOwnership || !z || convertGroupToPublic) {
            list.add(KWHzl(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fObYrO), "Admin Controls Section"));
        }
        if (zIsAllowSetRole) {
            list.add(KWHzl(C33070mpX.AYXKKw(C35399nuc.LoaderManager.HJWChPOKBmQNaCIdOM), "Edit Group Admins Setting", new Function1() { // from class: o.nVs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34214nVr.EZpvd(groupInfo, this, (android.content.Context) obj);
                }
            }));
        }
        if (zIsCanTransferOwnership) {
            list.add(KWHzl(C33070mpX.AYXKKw(C35399nuc.LoaderManager.HJWChPQPAeHI), C33070mpX.AYXKKw(C35399nuc.LoaderManager.run), "Assign New Owner Setting", new Function1() { // from class: o.nVu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34214nVr.gEmmrt(groupInfo, this, (android.content.Context) obj);
                }
            }));
        }
        if (!z) {
            valueOf(list, groupInfo);
        }
        if (convertGroupToPublic) {
            AYXKKw(list, groupInfo);
        }
        if (zOLrzqt) {
            list.add(KWHzl(C33070mpX.AYXKKw(C35399nuc.LoaderManager.sIqKDg), "Upgrade Group Setting", new Function1() { // from class: o.nVw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34214nVr.copydefault(groupInfo, this, (android.content.Context) obj);
                }
            }));
        }
    }

    public static final Unit EZpvd(GroupInfo groupInfo, C34214nVr c34214nVr, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        c34214nVr.startActivity(nUP.Companion.EZpvd(context, groupInfo));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(GroupInfo groupInfo, C34214nVr c34214nVr, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        c34214nVr.startActivity(ActivityC34206nVj.Companion.OLrzqt(context, groupInfo));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(GroupInfo groupInfo, C34214nVr c34214nVr, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        nVO.Activity activity = nVO.Companion;
        boolean z = groupInfo.getIncreaseGroupStatus() == InHouseIMSuperGroupConfig.IncreaseGroupStatus.IS_FULL;
        java.lang.Integer groupCapacity = groupInfo.getGroupCapacity();
        activity.OLrzqt(z, groupCapacity != null ? groupCapacity.intValue() : 0, false).show(c34214nVr.getParentFragmentManager(), c34214nVr.getTAG());
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.util.List<C35694oAf> list, GroupInfo groupInfo) {
        list.add(KWHzl(C33070mpX.AYXKKw(C35399nuc.LoaderManager.hErYDe), "Invite Permissions Section"));
        java.lang.Integer type = groupInfo.getType();
        int value = GroupTagType.AFFILIATE.getValue();
        if (type != null && type.intValue() == value) {
            return;
        }
        KWHzl(list, groupInfo);
    }

    public final void valueOf(java.util.List<C35694oAf> list, final GroupInfo groupInfo) {
        final boolean requireAdminApprovalToJoin = groupInfo.getRequireAdminApprovalToJoin();
        list.add(createSwitchItem$default(this, C33070mpX.AYXKKw(C35399nuc.LoaderManager.RAaltf), C33070mpX.AYXKKw(C35399nuc.LoaderManager.OsDdEf), requireAdminApprovalToJoin, false, "Join Approval Setting", new Function0() { // from class: o.nVK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34214nVr.valueOf(this.AEQbTJ, groupInfo, requireAdminApprovalToJoin);
            }
        }, 8, null));
    }

    public static final Unit valueOf(C34214nVr c34214nVr, GroupInfo groupInfo, boolean z) {
        c34214nVr.EZpvd().OLrzqt(groupInfo.getGroupId(), !z);
        return Unit.INSTANCE;
    }

    public final void AYXKKw(java.util.List<C35694oAf> list, final GroupInfo groupInfo) {
        list.add(KWHzl(C33070mpX.AYXKKw(C35399nuc.LoaderManager.OtRJxF), "Make This As a Public Group", new Function1() { // from class: o.nVt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34214nVr.EZpvd(this.KWHzl, groupInfo, (android.content.Context) obj);
            }
        }));
    }

    public static final Unit EZpvd(final C34214nVr c34214nVr, GroupInfo groupInfo, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (((tWL) C43251rlk.copydefault(tWL.class)).EZpvd()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c34214nVr), null, null, new GroupSettingsFragment$addPrivatePublicGroupConversionSettings$1$1(c34214nVr, groupInfo, null), 3, null);
        } else {
            tWL twl = (tWL) C43251rlk.copydefault(tWL.class);
            FragmentActivity fragmentActivityRequireActivity = c34214nVr.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            tWL.Application.openOrbiterUpgradeFlow$default(twl, fragmentActivityRequireActivity, null, false, new Function1() { // from class: o.nVn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34214nVr.OLrzqt(this.EZpvd, (kotlin.Pair) obj);
                }
            }, 6, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C34214nVr c34214nVr, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        C55284xgz.Activity activity = C55284xgz.Companion;
        android.view.View viewRequireView = c34214nVr.requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "");
        C55284xgz c55284xgzKWHzl = activity.KWHzl(viewRequireView, C33070mpX.AYXKKw(C35399nuc.LoaderManager.IPostMessageService));
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.djBIcL(0);
            c55284xgzKWHzl.hDKMBd();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.util.List<C35694oAf> list, final GroupInfo groupInfo) {
        final boolean zIsAllowMembersToAddMembers = groupInfo.isAllowMembersToAddMembers();
        final boolean zIsAllowSharingInvitationQrCode = groupInfo.isAllowSharingInvitationQrCode();
        list.add(createSwitchItem$default(this, C33070mpX.AYXKKw(C35399nuc.LoaderManager.OTJFaA), C33070mpX.AYXKKw(C35399nuc.LoaderManager.DRuYWY), zIsAllowMembersToAddMembers, false, "Invite Others Setting", new Function0() { // from class: o.nVE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34214nVr.AYXKKw(this.KWHzl, groupInfo, zIsAllowMembersToAddMembers);
            }
        }, 8, null));
        list.add(createSwitchItem$default(this, C33070mpX.AYXKKw(C35399nuc.LoaderManager.DvMhtu), C33070mpX.AYXKKw(C35399nuc.LoaderManager.DHEdFZ), zIsAllowSharingInvitationQrCode, false, "Join With QR Invite Setting", new Function0() { // from class: o.nVC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34214nVr.KWHzl(this.EZpvd, groupInfo, zIsAllowSharingInvitationQrCode, zIsAllowMembersToAddMembers);
            }
        }, 8, null));
    }

    public static final Unit AYXKKw(C34214nVr c34214nVr, GroupInfo groupInfo, boolean z) {
        c34214nVr.EZpvd().copydefault(groupInfo.getGroupId(), java.lang.Boolean.valueOf(!z), z ? java.lang.Boolean.FALSE : null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C34214nVr c34214nVr, GroupInfo groupInfo, boolean z, boolean z2) {
        c34214nVr.EZpvd().copydefault(groupInfo.getGroupId(), (z2 || z) ? null : java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    public final void copydefault(java.util.List<C35694oAf> list, GroupInfo groupInfo) {
        list.add(KWHzl(C33070mpX.AYXKKw(C35399nuc.LoaderManager.iTrKTi), "Chat Settings Section"));
        OLrzqt(list, groupInfo);
        gEmmrt(list, groupInfo);
        AhwBna(list, groupInfo);
    }

    public final void OLrzqt(java.util.List<C35694oAf> list, final GroupInfo groupInfo) {
        if (groupInfo.isAllowMuteUnmuteMember()) {
            final boolean zIsMute = groupInfo.isMute();
            list.add(createSwitchItem$default(this, C33070mpX.AYXKKw(C35399nuc.LoaderManager.HJWChPRGtXKC), C33070mpX.AYXKKw(C35399nuc.LoaderManager.HJWChPRGtXKCRGtXKC), zIsMute, false, "Restrict Chat Setting", new Function0() { // from class: o.nVI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34214nVr.gEmmrt(this.copydefault, groupInfo, zIsMute);
                }
            }, 8, null));
        }
    }

    public static final Unit gEmmrt(C34214nVr c34214nVr, final GroupInfo groupInfo, final boolean z) {
        C32866mlf.onEvent$default("IMGroupSettings_Full_Switch_Click", (TrackChannel[]) null, new Function1() { // from class: o.nVy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34214nVr.AEQbTJ(groupInfo, z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        c34214nVr.EZpvd().copydefault(groupInfo.getGroupId(), !z);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(GroupInfo groupInfo, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        oBY oby = oBY.copydefault;
        oby.copydefault(eventParamsList, groupInfo);
        oby.EZpvd(eventParamsList, "disablechat");
        oby.KWHzl(eventParamsList, z);
        return Unit.INSTANCE;
    }

    public final void gEmmrt(java.util.List<C35694oAf> list, final GroupInfo groupInfo) {
        if (groupInfo.isAllowMuteUnmuteMember()) {
            final boolean zIsAllowPrivacyChat = groupInfo.isAllowPrivacyChat();
            list.add(createSwitchItem$default(this, C33070mpX.AYXKKw(C35399nuc.LoaderManager.aSdHwS), C33070mpX.AYXKKw(C35399nuc.LoaderManager.DDxOgT), zIsAllowPrivacyChat, false, "Allow One To One Chat Setting", new Function0() { // from class: o.nVz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34214nVr.AhwBna(this.copydefault, groupInfo, zIsAllowPrivacyChat);
                }
            }, 8, null));
        }
    }

    public static final Unit AhwBna(C34214nVr c34214nVr, GroupInfo groupInfo, boolean z) {
        c34214nVr.EZpvd().AEQbTJ(groupInfo.getGroupId(), !z);
        return Unit.INSTANCE;
    }

    public final void AhwBna(java.util.List<C35694oAf> list, final GroupInfo groupInfo) {
        if (C37683oyU.EZpvd(groupInfo).gEmmrt()) {
            final boolean zIsAllowMentionOthers = groupInfo.isAllowMentionOthers();
            list.add(createSwitchItem$default(this, C33070mpX.AYXKKw(C35399nuc.LoaderManager.DGOPHZ), C33070mpX.AYXKKw(C35399nuc.LoaderManager.DCUTEIddSDPG), zIsAllowMentionOthers, false, "Enable Mentions Setting", new Function0() { // from class: o.nVv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34214nVr.djBIcL(this.EZpvd, groupInfo, zIsAllowMentionOthers);
                }
            }, 8, null));
        }
    }

    public static final Unit djBIcL(C34214nVr c34214nVr, GroupInfo groupInfo, boolean z) {
        c34214nVr.EZpvd().KWHzl(groupInfo.getGroupId(), !z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.nVr$Activity */
    public static final class Activity extends C37740ozY {
        public Activity(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }

    public final C37740ozY KWHzl(java.lang.String str, java.lang.String str2) {
        return new Activity(str, str2);
    }

    /* JADX INFO: renamed from: o.nVr$StateListAnimator */
    public static final class StateListAnimator extends C37739ozX {
        public final /* synthetic */ Function1<android.content.Context, Unit> AEQbTJ;

        /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: kotlin.jvm.functions.Function1<? super android.content.Context, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(java.lang.String str, java.lang.String str2, Function1<? super android.content.Context, Unit> function1) {
            super(str, null, null, null, str2, 14, null);
            this.AEQbTJ = function1;
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.AEQbTJ.invoke(context);
        }
    }

    public final C37739ozX KWHzl(java.lang.String str, java.lang.String str2, Function1<? super android.content.Context, Unit> function1) {
        return new StateListAnimator(str, str2, function1);
    }

    /* JADX INFO: renamed from: o.nVr$Application */
    public static final class Application extends C37738ozW {
        public final /* synthetic */ Function1<android.content.Context, Unit> AEQbTJ;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super android.content.Context, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(java.lang.String str, java.lang.String str2, java.lang.String str3, Function1<? super android.content.Context, Unit> function1, android.graphics.drawable.Drawable drawable) {
            super(str, str2, drawable, str3);
            this.AEQbTJ = function1;
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.AEQbTJ.invoke(context);
        }
    }

    public final C37738ozW KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, Function1<? super android.content.Context, Unit> function1) {
        return new Application(str, str2, str3, function1, C33070mpX.KWHzl(C52761wXj.TaskDescription.DGUQLI));
    }

    public static /* synthetic */ C35690oAb createSwitchItem$default(C34214nVr c34214nVr, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return c34214nVr.OLrzqt(str, str2, z, z2, str3, function0);
    }

    /* JADX INFO: renamed from: o.nVr$TaskDescription */
    public static final class TaskDescription extends C35690oAb {
        public final /* synthetic */ Function0<Unit> AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(java.lang.String str, boolean z, java.lang.String str2, boolean z2, java.lang.String str3, Function0<Unit> function0) {
            super(str, z, str2, z2, str3);
            this.AEQbTJ = function0;
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.AEQbTJ.invoke();
        }
    }

    public final C35690oAb OLrzqt(java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, Function0<Unit> function0) {
        return new TaskDescription(str, z2, str2, z, str3, function0);
    }

    @Override // o.C34237nWn.StateListAnimator
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd().KWHzl(str, str2);
    }

    public final void OLrzqt(final java.lang.String str) {
        oHT.ActionBar actionBar = oHT.Companion;
        java.lang.String string = getString(C35399nuc.LoaderManager.keyboardTargetTextChanged);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = getString(C35399nuc.LoaderManager.QBiWsm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        oHT ohtAEQbTJ = actionBar.AEQbTJ(string, string2, getString(C35399nuc.LoaderManager.fdazkH));
        ohtAEQbTJ.copydefault(new Function0() { // from class: o.nVA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34214nVr.AEQbTJ(this.KWHzl, str);
            }
        });
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        ohtAEQbTJ.show(parentFragmentManager);
    }

    public static final Unit AEQbTJ(C34214nVr c34214nVr, java.lang.String str) {
        c34214nVr.EZpvd().EZpvd(str);
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.String str) {
        EZpvd().copydefault();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupSettingsFragment$showPrivatePublicConversionDescriptionBottomSheet$1(this, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        GroupSettingsFragment$getLatestGroupDescription$1 groupSettingsFragment$getLatestGroupDescription$1;
        if (continuation instanceof GroupSettingsFragment$getLatestGroupDescription$1) {
            groupSettingsFragment$getLatestGroupDescription$1 = (GroupSettingsFragment$getLatestGroupDescription$1) continuation;
            int i = groupSettingsFragment$getLatestGroupDescription$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupSettingsFragment$getLatestGroupDescription$1.label = i - Integer.MIN_VALUE;
            } else {
                groupSettingsFragment$getLatestGroupDescription$1 = new GroupSettingsFragment$getLatestGroupDescription$1(this, continuation);
            }
        }
        java.lang.Object objFirst = groupSettingsFragment$getLatestGroupDescription$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupSettingsFragment$getLatestGroupDescription$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objFirst);
            Flow flowFilterNotNull = FlowKt.filterNotNull(EZpvd().AEQbTJ());
            GroupSettingsFragment$getLatestGroupDescription$2 groupSettingsFragment$getLatestGroupDescription$2 = new GroupSettingsFragment$getLatestGroupDescription$2(str, null);
            groupSettingsFragment$getLatestGroupDescription$1.label = 1;
            objFirst = FlowKt.first(flowFilterNotNull, groupSettingsFragment$getLatestGroupDescription$2, groupSettingsFragment$getLatestGroupDescription$1);
            if (objFirst == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objFirst);
        }
        return ((GroupInfo) objFirst).getDescription();
    }

    public final void KWHzl() {
        android.content.Context context = getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setCancelable(true);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.QSbQqJ);
            viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.kcQGz);
            viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.DCUTEI, new View.OnClickListener() { // from class: o.nVx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C34214nVr.OLrzqt(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void copydefault(java.util.List<C35694oAf> list, Function1<? super java.util.List<C35694oAf>, Unit>... function1Arr) {
        for (Function1<? super java.util.List<C35694oAf>, Unit> function1 : function1Arr) {
            int size = list.size();
            function1.invoke(list);
            if (1 <= size && size < list.size()) {
                list.add(size, C37734ozS.AEQbTJ);
            }
        }
    }
}
