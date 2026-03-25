package com.okinc.im.imui.contacts;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.imui.contacts.ContactProfileFragment;
import com.okinc.im.imui.contacts.ContactProfileViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.p2p.api.OTCService;
import com.okinc.uilab.item.OKRegularCell;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC35670nzj;
import o.ActivityC35611nyd;
import o.ActivityC37225opn;
import o.C32866mlf;
import o.C33062mpP;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33570myu;
import o.C33764nEz;
import o.C35320ntB;
import o.C35322ntD;
import o.C35399nuc;
import o.C35626nys;
import o.C35891oHn;
import o.C35893oHp;
import o.C35951oJt;
import o.C35952oJu;
import o.C37683oyU;
import o.C37716ozA;
import o.C43251rlk;
import o.C43454rpb;
import o.C44157sFk;
import o.C44164sFr;
import o.C44170sFx;
import o.C52761wXj;
import o.C5335Nt;
import o.C55239xgG;
import o.C55296xhK;
import o.C55326xho;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56524yIo;
import o.C57635ymD;
import o.InterfaceC56387yDm;
import o.ViewOnClickListenerC54939xaY;
import o.nJM;
import o.wYC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactProfileFragment extends AbstractC35670nzj {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final int AEQbTJ = C35399nuc.Dialog.QkdxfA;
    public final InterfaceC56387yDm AYXKKw;
    public ViewOnClickListenerC54939xaY AhwBna;
    public final String EZpvd;
    public nJM KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupBillingType.values().length];
            try {
                iArr[GroupBillingType.YEARLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[ContactProfileViewModel.ProfileQuickAction.values().length];
            try {
                iArr2[ContactProfileViewModel.ProfileQuickAction.SEND_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ContactProfileViewModel.ProfileQuickAction.PAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ContactProfileViewModel.ProfileQuickAction.ADD_FRIEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ContactProfileViewModel.ProfileQuickAction.VIEW_PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public ContactProfileFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.im.imui.contacts.ContactProfileFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.contacts.ContactProfileFragment$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ContactProfileViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.contacts.ContactProfileFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.contacts.ContactProfileFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.contacts.ContactProfileFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.nyG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ContactProfileFragment.KWHzl(this.KWHzl));
            }
        });
        this.EZpvd = "images/planet/planet_cover_photo_default_v2.webp";
    }

    public final ContactProfileViewModel OLrzqt() {
        return (ContactProfileViewModel) this.OLrzqt.getValue();
    }

    public static final boolean KWHzl(ContactProfileFragment contactProfileFragment) {
        Bundle arguments = contactProfileFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("show_messages_settings");
        }
        return true;
    }

    public final boolean AEQbTJ() {
        return ((Boolean) this.AYXKKw.getValue()).booleanValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl = nJM.EZpvd(view);
        AhwBna();
        AYXKKw();
        OLrzqt().OLrzqt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.KWHzl = null;
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.AhwBna;
        if (viewOnClickListenerC54939xaY != null) {
            C33062mpP.OLrzqt(viewOnClickListenerC54939xaY);
        }
    }

    public final void AhwBna() {
        final nJM njm = this.KWHzl;
        if (njm != null) {
            njm.fJNWhG.setOnClickListener(new View.OnClickListener() { // from class: o.nyE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ContactProfileFragment.AkhnZx(this.EZpvd, view);
                }
            });
            njm.fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.nyN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ContactProfileFragment.isConnected(this.OLrzqt, view);
                }
            });
            njm.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.nyS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ContactProfileFragment.fIwbmz(this.EZpvd, view);
                }
            });
            njm.getNewProxyInstance.setOnClickListener(new View.OnClickListener() { // from class: o.nyR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ContactProfileFragment.AEQbTJ(njm, this, view);
                }
            });
            njm.AuCTelauCTel.setOnClickListener(new View.OnClickListener() { // from class: o.nyU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ContactProfileFragment.EZpvd(njm, this, view);
                }
            });
            njm.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.nyQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ContactProfileFragment.ejfBZ(this.OLrzqt, view);
                }
            });
            OKRegularCell oKRegularCell = njm.AEQbTJ;
            oKRegularCell.setOnClickListener(new Application(oKRegularCell, 1000L, this));
            njm.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.nyT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ContactProfileFragment.fARcdN(this.OLrzqt, view);
                }
            });
            njm.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.nyZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ContactProfileFragment.fJNWhG(this.AEQbTJ, view);
                }
            });
            njm.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.nyF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ContactProfileFragment.fetchVPNInfo(this.AEQbTJ, view);
                }
            });
            njm.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.nyJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ContactProfileFragment.values(this.copydefault, view);
                }
            });
            njm.ejfBZ.setOnClickListener(new View.OnClickListener() { // from class: o.nyL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ContactProfileFragment.DbNXlk(this.EZpvd, view);
                }
            });
            OKRegularCell oKRegularCell2 = njm.AhwBna;
            oKRegularCell2.setOnClickListener(new StateListAnimator(oKRegularCell2, 1000L, this));
        }
    }

    public static final void AkhnZx(ContactProfileFragment contactProfileFragment, View view) {
        contactProfileFragment.OLrzqt().AEQbTJ(ContactProfileViewModel.UserInfoAction.SHOW_AVATAR);
    }

    public static final void isConnected(ContactProfileFragment contactProfileFragment, View view) {
        contactProfileFragment.OLrzqt().AEQbTJ(ContactProfileViewModel.ActionBar.Activity.copydefault);
    }

    public static final void fIwbmz(ContactProfileFragment contactProfileFragment, View view) {
        contactProfileFragment.OLrzqt().AEQbTJ(ContactProfileViewModel.UserInfoAction.EDIT_ALIAS);
    }

    public static final void AEQbTJ(nJM njm, ContactProfileFragment contactProfileFragment, View view) {
        contactProfileFragment.OLrzqt().AEQbTJ(new ContactProfileViewModel.ActionBar.C0401ActionBar(njm.getNewProxyInstance.isChecked()));
    }

    public static final void EZpvd(nJM njm, ContactProfileFragment contactProfileFragment, View view) {
        contactProfileFragment.OLrzqt().AEQbTJ(new ContactProfileViewModel.ActionBar.Application(njm.AuCTelauCTel.isChecked()));
    }

    public static final void ejfBZ(ContactProfileFragment contactProfileFragment, View view) {
        contactProfileFragment.OLrzqt().AEQbTJ(ContactProfileViewModel.UserInfoAction.REPORT);
    }

    public static final void fARcdN(ContactProfileFragment contactProfileFragment, View view) {
        contactProfileFragment.OLrzqt().EZpvd(ContactProfileViewModel.GroupInfoAction.REMOVE_MEMBER);
    }

    public static final void fJNWhG(ContactProfileFragment contactProfileFragment, View view) {
        contactProfileFragment.OLrzqt().AEQbTJ(ContactProfileViewModel.UserInfoAction.BLOCK_CONTACT);
    }

    public static final void fetchVPNInfo(ContactProfileFragment contactProfileFragment, View view) {
        contactProfileFragment.OLrzqt().AEQbTJ(ContactProfileViewModel.UserInfoAction.BLOCK_CONTACT);
    }

    public static final void values(ContactProfileFragment contactProfileFragment, View view) {
        contactProfileFragment.OLrzqt().AEQbTJ(ContactProfileViewModel.UserInfoAction.REMOVE_CONTACT);
    }

    public static final void DbNXlk(ContactProfileFragment contactProfileFragment, View view) {
        contactProfileFragment.OLrzqt().OLrzqt();
    }

    public final void AYXKKw() {
        Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(OLrzqt().valueOf(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new ContactProfileFragment$setupFlow$1(this, null));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        Flow flowOnEach2 = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(OLrzqt().gEmmrt(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new ContactProfileFragment$setupFlow$2(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        FlowKt.launchIn(flowOnEach2, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2));
        FragmentKt.setFragmentResultListener(this, "REQUEST_KEY_REFRESH", new Function2() { // from class: o.nyM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ContactProfileFragment.EZpvd(this.AEQbTJ, (java.lang.String) obj, (android.os.Bundle) obj2);
            }
        });
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ContactProfileFragment AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, ContactProfileFragment contactProfileFragment) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = contactProfileFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.OLrzqt().EZpvd(ContactProfileViewModel.GroupInfoAction.CHANGE_PAID_MEMBER_TYPE);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ ContactProfileFragment EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, ContactProfileFragment contactProfileFragment) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = contactProfileFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.OLrzqt().AEQbTJ(ContactProfileViewModel.UserInfoAction.USER_VIP_PROFILE);
            }
        }
    }

    public static final Unit EZpvd(ContactProfileFragment contactProfileFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        contactProfileFragment.OLrzqt().AkhnZx();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(final ContactProfileViewModel.StateListAnimator.Activity activity) {
        boolean z;
        boolean z2;
        nJM njm = this.KWHzl;
        if (njm != null) {
            C35893oHp c35893oHp = njm.fJNWhG;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            RelationInfo relationInfoDjBIcL = activity.djBIcL();
            GroupInfo groupInfoCopydefault = OLrzqt().copydefault();
            if (groupInfoCopydefault != null) {
                Integer type = groupInfoCopydefault.getType();
                z = type != null && type.intValue() == GroupTagType.RM_VIP_GROUP.getValue();
            }
            C35891oHn.KWHzl(c35893oHp, relationInfoDjBIcL, z);
            EZpvd(activity.djBIcL().getOrbitBackgroundImage());
            Fragment parentFragment = getParentFragment();
            C35626nys c35626nys = parentFragment instanceof C35626nys ? (C35626nys) parentFragment : null;
            if (c35626nys != null) {
                c35626nys.AEQbTJ(activity.valueOf());
            }
            njm.gHZMYf.setText(C44157sFk.getDisplayName$default(activity.djBIcL(), null, 1, null));
            TextView textView = njm.zuBGHE;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            OfficialTagInfo officialTags = activity.djBIcL().getOfficialTags();
            GroupInfo groupInfoCopydefault2 = OLrzqt().copydefault();
            if (groupInfoCopydefault2 != null) {
                Integer type2 = groupInfoCopydefault2.getType();
                z2 = type2 != null && type2.intValue() == GroupTagType.RM_VIP_GROUP.getValue();
            }
            C37716ozA.updateTagViewWithTagInfo$default(textView, officialTags, 0, null, false, z2, false, 46, null);
            TextView textView2 = njm.zuBGHE;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility((activity.djBIcL().getOfficialTags() == null || activity.valueOf()) ? 8 : 0);
            njm.AwvSrB.setText(activity.djBIcL().getContactsId());
            C57635ymD c57635ymD = njm.AwvSrB;
            Intrinsics.checkNotNullExpressionValue(c57635ymD, "");
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C44164sFr.copydefault(c57635ymD, contextRequireContext, (28 & 2) != 0 ? null : "UID", (28 & 4) != 0 ? null : null, (Function0<Unit>) ((28 & 8) != 0 ? null : null), (Function0<Unit>) ((28 & 16) != 0 ? null : null));
            LinearLayout linearLayout = njm.uzCIH;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(C44157sFk.AEQbTJ() ? 0 : 8);
            njm.wlaJM.setText(activity.djBIcL().getCustomNote());
            TextView textView3 = njm.sSMYrx;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            EZpvd(textView3, activity.djBIcL());
            TextView textView4 = njm.ORxRYg;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            OLrzqt(textView4, activity);
            TextView textView5 = njm.zsXlph;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            LinearLayout linearLayout2 = njm.OcIXYQ;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            copydefault(textView5, linearLayout2, activity);
            C35952oJu c35952oJu = njm.iwGUEr;
            Intrinsics.checkNotNullExpressionValue(c35952oJu, "");
            c35952oJu.setVisibility(activity.copydefault().isEmpty() ^ true ? 0 : 8);
            OKRegularCell oKRegularCell = njm.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell, "");
            oKRegularCell.setVisibility(activity.OLrzqt() != null ? 0 : 8);
            OKRegularCell oKRegularCell2 = njm.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell2, "");
            oKRegularCell2.setVisibility(activity.valueOf() ^ true ? 0 : 8);
            njm.AubY.setText(activity.djBIcL().getRemarkName());
            C55239xgG c55239xgG = njm.getNewProxyInstance;
            OKConversation oKConversationOLrzqt = activity.OLrzqt();
            c55239xgG.setChecked(oKConversationOLrzqt != null ? oKConversationOLrzqt.isNoDisturb() : false);
            OKRegularCell oKRegularCell3 = njm.djBIcL;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell3, "");
            oKRegularCell3.setVisibility((!AEQbTJ() || activity.OLrzqt() == null) ? 8 : 0);
            C55239xgG c55239xgG2 = njm.AuCTelauCTel;
            OKConversation oKConversationOLrzqt2 = activity.OLrzqt();
            c55239xgG2.setChecked(oKConversationOLrzqt2 != null ? oKConversationOLrzqt2.isTop() : false);
            OKRegularCell oKRegularCell4 = njm.values;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell4, "");
            oKRegularCell4.setVisibility((!AEQbTJ() || activity.OLrzqt() == null) ? 8 : 0);
            LinearLayout linearLayout3 = njm.OcIXYQ;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            linearLayout3.setVisibility(C44170sFx.KWHzl(activity.djBIcL().getOfficialTags()) ? 0 : 8);
            Boolean boolGEmmrt = activity.gEmmrt();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.EZpvd(boolGEmmrt, bool)) {
                njm.AEQbTJ.EZpvd().setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.OEsIKP));
                OKRegularCell oKRegularCell5 = njm.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(oKRegularCell5, "");
                oKRegularCell5.setVisibility(activity.AEQbTJ() ? 0 : 8);
            } else if (Intrinsics.EZpvd(boolGEmmrt, Boolean.FALSE)) {
                njm.AEQbTJ.EZpvd().setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.RIKbBf));
                OKRegularCell oKRegularCell6 = njm.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(oKRegularCell6, "");
                oKRegularCell6.setVisibility(activity.AEQbTJ() ? 0 : 8);
            } else {
                OKRegularCell oKRegularCell7 = njm.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(oKRegularCell7, "");
                oKRegularCell7.setVisibility(8);
            }
            OKRegularCell oKRegularCell8 = njm.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell8, "");
            oKRegularCell8.setVisibility(OLrzqt().fetchVPNInfo() ? 0 : 8);
            OKRegularCell oKRegularCell9 = njm.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell9, "");
            oKRegularCell9.setVisibility(activity.KWHzl() ? 0 : 8);
            OKRegularCell oKRegularCell10 = njm.EZpvd;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell10, "");
            oKRegularCell10.setVisibility(activity.EZpvd() ? 0 : 8);
            OKRegularCell oKRegularCell11 = njm.copydefault;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell11, "");
            oKRegularCell11.setVisibility((!Intrinsics.EZpvd(activity.djBIcL().getAllowBlockUser(), bool) || activity.djBIcL().isBlackList()) ? 8 : 0);
            OKRegularCell oKRegularCell12 = njm.valueOf;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell12, "");
            oKRegularCell12.setVisibility((Intrinsics.EZpvd(activity.djBIcL().getAllowBlockUser(), bool) && activity.djBIcL().isBlackList()) ? 0 : 8);
            OKRegularCell oKRegularCell13 = njm.KWHzl;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell13, "");
            oKRegularCell13.setVisibility((AEQbTJ() && activity.AhwBna()) ? 0 : 8);
            View view = njm.isConnected;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(AEQbTJ() ? 0 : 8);
            OKRegularCell oKRegularCell14 = njm.AhwBna;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell14, "");
            oKRegularCell14.setVisibility(Intrinsics.EZpvd(activity.djBIcL().getShowVipPerformanceDetails(), bool) ? 0 : 8);
            TextView textView6 = njm.wlaJM;
            Intrinsics.checkNotNullExpressionValue(textView6, "");
            textView6.setVisibility(C33129mqd.OLrzqt((CharSequence) activity.djBIcL().getCustomNote()) ? 0 : 8);
            njm.copydefault.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
            njm.AYXKKw.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
            njm.EZpvd.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
            njm.KWHzl.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
            njm.valueOf.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            njm.AEQbTJ.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            njm.iwGUEr.setActionButtons(activity.copydefault(), new Function1() { // from class: o.nyO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ContactProfileFragment.EZpvd(this.EZpvd, activity, (C35951oJt) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(ContactProfileFragment contactProfileFragment, ContactProfileViewModel.StateListAnimator.Activity activity, C35951oJt c35951oJt) {
        Intrinsics.checkNotNullParameter(c35951oJt, "");
        contactProfileFragment.AEQbTJ(c35951oJt, activity.AYXKKw(), activity.djBIcL(), activity.OLrzqt());
        return Unit.INSTANCE;
    }

    public final void EZpvd(String str) {
        if (this.KWHzl != null) {
            FragmentActivity activity = getActivity();
            Fragment parentFragment = getParentFragment();
            if (activity instanceof ActivityC35611nyd) {
                if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                    if (OLrzqt().AYXKKw()) {
                        String str2 = this.EZpvd;
                        Context contextRequireContext = requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                        EZpvd((ActivityC35611nyd) activity, C43454rpb.copydefault(str2, contextRequireContext, true));
                        return;
                    }
                    copydefault((ActivityC35611nyd) activity);
                    return;
                }
                EZpvd((ActivityC35611nyd) activity, str);
                return;
            }
            if (parentFragment instanceof C35626nys) {
                if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                    if (OLrzqt().AYXKKw()) {
                        String str3 = this.EZpvd;
                        Context contextRequireContext2 = requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                        KWHzl((C35626nys) parentFragment, C43454rpb.copydefault(str3, contextRequireContext2, true));
                        return;
                    }
                    EZpvd((C35626nys) parentFragment);
                    return;
                }
                KWHzl((C35626nys) parentFragment, str);
            }
        }
    }

    public final void copydefault(ActivityC35611nyd activityC35611nyd) {
        nJM njm = this.KWHzl;
        if (njm != null) {
            activityC35611nyd.OLrzqt(true);
            FrameLayout frameLayout = njm.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(8);
            njm.fARcdN.setImageDrawable(null);
            njm.fARcdN.setImageMatrix(new Matrix());
            wYC wyc = njm.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(8);
            LinearLayout linearLayout = njm.AkhnZx;
            linearLayout.setPadding(linearLayout.getPaddingLeft(), 0, njm.AkhnZx.getPaddingRight(), njm.AkhnZx.getPaddingBottom());
        }
    }

    public final void EZpvd(ActivityC35611nyd activityC35611nyd, String str) {
        nJM njm = this.KWHzl;
        if (njm != null) {
            activityC35611nyd.OLrzqt(false);
            FrameLayout frameLayout = njm.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(0);
            wYC wyc = njm.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(0);
            ImageView imageView = njm.AuCTel;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            njm.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.nyD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ContactProfileFragment.AuCTel(this.copydefault, view);
                }
            });
            int iOLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.KWHzl);
            int iOLrzqt2 = C33570myu.OLrzqt();
            ViewGroup.LayoutParams layoutParams = njm.OLrzqt.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.topMargin = iOLrzqt2;
                njm.OLrzqt.setLayoutParams(layoutParams2);
            }
            LinearLayout linearLayout = njm.AkhnZx;
            linearLayout.setPadding(linearLayout.getPaddingLeft(), iOLrzqt + iOLrzqt2, njm.AkhnZx.getPaddingRight(), njm.AkhnZx.getPaddingBottom());
            C5335Nt<Drawable> c5335NtEZpvd = Glide.KWHzl(njm.fARcdN).EZpvd(str);
            Context context = njm.fARcdN.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ImageView imageView2 = njm.fARcdN;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
        }
    }

    public static final void AuCTel(ContactProfileFragment contactProfileFragment, View view) {
        contactProfileFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    public final void EZpvd(C35626nys c35626nys) {
        nJM njm = this.KWHzl;
        if (njm != null) {
            c35626nys.EZpvd(false);
            FrameLayout frameLayout = njm.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(8);
            njm.fARcdN.setImageDrawable(null);
            njm.fARcdN.setImageMatrix(new Matrix());
            wYC wyc = njm.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(8);
            njm.DbNXlk.setOutlineProvider(null);
            njm.DbNXlk.setClipToOutline(false);
            LinearLayout linearLayout = njm.AkhnZx;
            linearLayout.setPadding(linearLayout.getPaddingLeft(), 0, njm.AkhnZx.getPaddingRight(), njm.AkhnZx.getPaddingBottom());
        }
    }

    public final void KWHzl(C35626nys c35626nys, String str) {
        nJM njm = this.KWHzl;
        if (njm != null) {
            c35626nys.EZpvd(true);
            njm.DbNXlk.setOutlineProvider(new ActionBar());
            njm.DbNXlk.setClipToOutline(true);
            FrameLayout frameLayout = njm.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(0);
            ImageView imageView = njm.AuCTel;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            wYC wyc = njm.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(8);
            LinearLayout linearLayout = njm.AkhnZx;
            linearLayout.setPadding(linearLayout.getPaddingLeft(), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.AxsJAYaxsJAY), njm.AkhnZx.getPaddingRight(), njm.AkhnZx.getPaddingBottom());
            C5335Nt<Drawable> c5335NtEZpvd = Glide.KWHzl(njm.fARcdN).EZpvd(str);
            Context context = njm.fARcdN.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ImageView imageView2 = njm.fARcdN;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
        }
    }

    public static final class ActionBar extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C33070mpX.EZpvd(C52761wXj.StateListAnimator.ODWQjV));
        }
    }

    public final void EZpvd(TextView textView, RelationInfo relationInfo) {
        boolean zOLrzqt = C33129mqd.OLrzqt((CharSequence) relationInfo.getPhoneName());
        boolean zOLrzqt2 = C33129mqd.OLrzqt((CharSequence) relationInfo.getRemarkName());
        if (zOLrzqt || zOLrzqt2) {
            textView.setVisibility(0);
            textView.setText(C33069mpW.copydefault(this, C35399nuc.LoaderManager.DcMfJKfbSiEC, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("name", C44170sFx.copydefault(relationInfo)))));
        } else {
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064 A[EDGE_INSN: B:37:0x0064->B:30:0x0064 BREAK  A[LOOP:1: B:25:0x004e->B:39:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(TextView textView, ContactProfileViewModel.StateListAnimator.Activity activity) {
        Iterator<T> it;
        if (activity.valueOf()) {
            OfficialTagInfo officialTags = activity.djBIcL().getOfficialTags();
            String string = null;
            List<OfficialTagType> supportTagTypes = officialTags != null ? officialTags.getSupportTagTypes() : null;
            if (supportTagTypes != null && !supportTagTypes.isEmpty()) {
                Iterator<T> it2 = supportTagTypes.iterator();
                while (it2.hasNext()) {
                    if (((OfficialTagType) it2.next()) == OfficialTagType.VipRM) {
                        string = getString(C35399nuc.LoaderManager.OmPrLP);
                        break;
                    }
                }
                if (supportTagTypes != null) {
                    it = supportTagTypes.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                        }
                    }
                }
            } else if (supportTagTypes != null && !supportTagTypes.isEmpty()) {
                it = supportTagTypes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((OfficialTagType) it.next()) == OfficialTagType.VipSupport) {
                        string = getString(C35399nuc.LoaderManager.RYPzIz);
                        break;
                    }
                }
            }
            textView.setVisibility(string != null ? 0 : 8);
            textView.setText(string);
            return;
        }
        textView.setVisibility(8);
    }

    public final void copydefault(TextView textView, View view, final ContactProfileViewModel.StateListAnimator.Activity activity) {
        if (C44170sFx.KWHzl(activity.djBIcL().getOfficialTags())) {
            textView.setVisibility(0);
            textView.setText(C37683oyU.KWHzl(activity.djBIcL().getOfficialTags()));
            C37716ozA.updateMerchantIconWithTagInfo$default(textView, activity.djBIcL().getOfficialTags(), null, 2, null);
        } else {
            textView.setVisibility(8);
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: o.nyH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ContactProfileFragment.EZpvd(this.EZpvd, activity, view2);
            }
        });
    }

    public static final void EZpvd(ContactProfileFragment contactProfileFragment, ContactProfileViewModel.StateListAnimator.Activity activity, View view) {
        contactProfileFragment.EZpvd();
        contactProfileFragment.KWHzl();
        OTCService oTCService = (OTCService) C43251rlk.OLrzqt(OTCService.class);
        if (oTCService != null) {
            FragmentActivity fragmentActivityRequireActivity = contactProfileFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            oTCService.jumpToMerchantPage(fragmentActivityRequireActivity, activity.djBIcL().getContactsId());
        }
    }

    public final void AEQbTJ(ContactProfileViewModel.Activity activity) {
        int i;
        if (activity instanceof ContactProfileViewModel.Activity.FragmentManager) {
            C55326xho.toastWithFailedIcon$default(((ContactProfileViewModel.Activity.FragmentManager) activity).AEQbTJ(), 0, 1, (Object) null);
            return;
        }
        if (activity instanceof ContactProfileViewModel.Activity.StateListAnimator) {
            copydefault(new Action.UnFriend(((ContactProfileViewModel.Activity.StateListAnimator) activity).OLrzqt()));
            return;
        }
        if (activity instanceof ContactProfileViewModel.Activity.Application) {
            KWHzl();
            copydefault(new Action.EditAlias(((ContactProfileViewModel.Activity.Application) activity).KWHzl()));
            return;
        }
        if (activity instanceof ContactProfileViewModel.Activity.C0402Activity) {
            copydefault(new Action.BlockUser(((ContactProfileViewModel.Activity.C0402Activity) activity).copydefault()));
            return;
        }
        if (activity instanceof ContactProfileViewModel.Activity.LoaderManager) {
            C33764nEz c33764nEz = C33764nEz.OLrzqt;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            c33764nEz.OLrzqt(contextRequireContext, ((ContactProfileViewModel.Activity.LoaderManager) activity).AEQbTJ(), null);
            return;
        }
        if (Intrinsics.EZpvd(activity, ContactProfileViewModel.Activity.TaskStackBuilder.copydefault)) {
            OLrzqt().OLrzqt();
            return;
        }
        if (activity instanceof ContactProfileViewModel.Activity.PendingIntent) {
            ContactProfileViewModel.Activity.PendingIntent pendingIntent = (ContactProfileViewModel.Activity.PendingIntent) activity;
            if (!StringsKt__StringsKt.fARcdN((CharSequence) pendingIntent.EZpvd().getAvatar())) {
                KWHzl();
                ActivityC37225opn.TaskDescription taskDescription = ActivityC37225opn.Companion;
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                startActivity(taskDescription.EZpvd(contextRequireContext2, pendingIntent.EZpvd().getAvatar()));
                return;
            }
            return;
        }
        if (activity instanceof ContactProfileViewModel.Activity.Dialog) {
            KWHzl();
            OTCService oTCService = (OTCService) C43251rlk.OLrzqt(OTCService.class);
            if (oTCService != null) {
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                oTCService.openReportPage(fragmentActivityRequireActivity, ((ContactProfileViewModel.Activity.Dialog) activity).AEQbTJ().getContactsId());
                return;
            }
            return;
        }
        if (activity instanceof ContactProfileViewModel.Activity.ActionBar) {
            Context context = getContext();
            if (context != null) {
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                ContactProfileViewModel.Activity.ActionBar actionBar = (ContactProfileViewModel.Activity.ActionBar) activity;
                viewOnClickListenerC54939xaY.setTitle(actionBar.AEQbTJ() ? C35399nuc.LoaderManager.gZKUVK : C35399nuc.LoaderManager.uLLnq);
                if (actionBar.AEQbTJ()) {
                    i = Activity.KWHzl[actionBar.OLrzqt().ordinal()] == 1 ? C35399nuc.LoaderManager.ORrpqH : C35399nuc.LoaderManager.getConnectivityMgr;
                } else {
                    i = C35399nuc.LoaderManager.fGT;
                }
                viewOnClickListenerC54939xaY.copydefault(i);
                viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.OGitdB, new View.OnClickListener() { // from class: o.nyP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ContactProfileFragment.KWHzl(this.EZpvd, viewOnClickListenerC54939xaY, view);
                    }
                });
                ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.iwGUEr, (View.OnClickListener) null, 2, (Object) null);
                this.AhwBna = viewOnClickListenerC54939xaY;
                viewOnClickListenerC54939xaY.show();
                return;
            }
            return;
        }
        if (activity instanceof ContactProfileViewModel.Activity.TaskDescription) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = this.AhwBna;
            if (viewOnClickListenerC54939xaY2 != null) {
                viewOnClickListenerC54939xaY2.dismiss();
            }
            KWHzl();
            return;
        }
        if (activity instanceof ContactProfileViewModel.Activity.Fragment) {
            ContactProfileViewModel.Activity.Fragment fragment = (ContactProfileViewModel.Activity.Fragment) activity;
            copydefault(new Action.RemoveMember(fragment.OLrzqt(), fragment.copydefault()));
        } else {
            if (!(activity instanceof ContactProfileViewModel.Activity.VoiceInteractor)) {
                throw new NoWhenBranchMatchedException();
            }
            C35320ntB c35320ntB = C35320ntB.EZpvd;
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            c35320ntB.KWHzl(new C35322ntD(contextRequireContext3, ((ContactProfileViewModel.Activity.VoiceInteractor) activity).OLrzqt().getContactsId()));
            KWHzl();
        }
    }

    public static final void KWHzl(ContactProfileFragment contactProfileFragment, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        contactProfileFragment.OLrzqt().isConnected();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AEQbTJ(C35951oJt c35951oJt, ChatOrigin chatOrigin, RelationInfo relationInfo, OKConversation oKConversation) {
        ContactProfileViewModel.ProfileQuickAction profileQuickActionAEQbTJ = ContactProfileViewModel.ProfileQuickAction.Companion.AEQbTJ(c35951oJt.KWHzl());
        int i = profileQuickActionAEQbTJ == null ? -1 : Activity.OLrzqt[profileQuickActionAEQbTJ.ordinal()];
        if (i != -1) {
            if (i == 1) {
                C32866mlf.onEvent$default(c35951oJt.AEQbTJ(), (TrackChannel[]) null, new Function1() { // from class: o.nyI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ContactProfileFragment.OLrzqt((EventParamsList) obj);
                    }
                }, 1, (Object) null);
                copydefault(new Action.SendMessage(relationInfo, oKConversation, chatOrigin));
                return;
            }
            if (i == 2) {
                KWHzl();
                C32866mlf.onEvent$default(c35951oJt.AEQbTJ(), (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                copydefault(new Action.Pay(relationInfo));
            } else if (i == 3) {
                C32866mlf.onEvent$default(c35951oJt.AEQbTJ(), (TrackChannel[]) null, new Function1() { // from class: o.nyK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ContactProfileFragment.AEQbTJ((EventParamsList) obj);
                    }
                }, 1, (Object) null);
                copydefault(new Action.AddFriend(relationInfo, oKConversation, chatOrigin));
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                C32866mlf.onEvent$default(c35951oJt.AEQbTJ(), (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                copydefault(new Action.ViewPlanetProfile(relationInfo.getContactsId()));
            }
        }
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "send_message", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "add_contacts", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ContactProfileFragment$logMerchantClick$1(this, null), 3, null);
    }

    public final void copydefault(Action action) {
        FragmentKt.setFragmentResult(this, "REQUEST_KEY_ACTION", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_KEY_ACTION", action)));
    }

    public final void KWHzl() {
        FragmentKt.setFragmentResult(this, "REQUEST_KEY_CLOSE", BundleKt.bundleOf(C56390yDp.OLrzqt("result", Boolean.TRUE)));
    }

    public interface Action extends Parcelable {

        public static final class SendMessage implements Action, Parcelable {
            public final RelationInfo KWHzl;
            public final ChatOrigin OLrzqt;
            public final OKConversation copydefault;
            public static final int EZpvd = OKConversation.$stable | RelationInfo.$stable;
            public static final Parcelable.Creator<SendMessage> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<SendMessage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SendMessage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new SendMessage((RelationInfo) parcel.readParcelable(SendMessage.class.getClassLoader()), (OKConversation) parcel.readParcelable(SendMessage.class.getClassLoader()), (ChatOrigin) parcel.readParcelable(SendMessage.class.getClassLoader()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SendMessage[] newArray(int i) {
                    return new SendMessage[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SendMessage copy$default(SendMessage sendMessage, RelationInfo relationInfo, OKConversation oKConversation, ChatOrigin chatOrigin, int i, Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = sendMessage.KWHzl;
                }
                if ((i & 2) != 0) {
                    oKConversation = sendMessage.copydefault;
                }
                if ((i & 4) != 0) {
                    chatOrigin = sendMessage.OLrzqt;
                }
                return sendMessage.AEQbTJ(relationInfo, oKConversation, chatOrigin);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SendMessage AEQbTJ(@NotNull RelationInfo relationInfo, OKConversation oKConversation, @NotNull ChatOrigin chatOrigin) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                Intrinsics.checkNotNullParameter(chatOrigin, "");
                return new SendMessage(relationInfo, oKConversation, chatOrigin);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKConversation EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ChatOrigin OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo copydefault() {
                return this.KWHzl;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SendMessage)) {
                    return false;
                }
                SendMessage sendMessage = (SendMessage) obj;
                return Intrinsics.EZpvd(this.KWHzl, sendMessage.KWHzl) && Intrinsics.EZpvd(this.copydefault, sendMessage.copydefault) && this.OLrzqt == sendMessage.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.KWHzl.hashCode();
                OKConversation oKConversation = this.copydefault;
                return (((iHashCode * 31) + (oKConversation == null ? 0 : oKConversation.hashCode())) * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SendMessage(userInfo=" + this.KWHzl + ", conversation=" + this.copydefault + ", origin=" + this.OLrzqt + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeParcelable(this.KWHzl, i);
                parcel.writeParcelable(this.copydefault, i);
                parcel.writeParcelable(this.OLrzqt, i);
            }

            public SendMessage(@NotNull RelationInfo relationInfo, OKConversation oKConversation, @NotNull ChatOrigin chatOrigin) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                Intrinsics.checkNotNullParameter(chatOrigin, "");
                this.KWHzl = relationInfo;
                this.copydefault = oKConversation;
                this.OLrzqt = chatOrigin;
            }
        }

        public static final class EditAlias implements Action, Parcelable {
            public final RelationInfo KWHzl;
            public static final int EZpvd = RelationInfo.$stable;
            public static final Parcelable.Creator<EditAlias> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<EditAlias> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EditAlias createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new EditAlias((RelationInfo) parcel.readParcelable(EditAlias.class.getClassLoader()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EditAlias[] newArray(int i) {
                    return new EditAlias[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ EditAlias copy$default(EditAlias editAlias, RelationInfo relationInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = editAlias.KWHzl;
                }
                return editAlias.EZpvd(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final EditAlias EZpvd(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new EditAlias(relationInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EditAlias) && Intrinsics.EZpvd(this.KWHzl, ((EditAlias) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "EditAlias(userInfo=" + this.KWHzl + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeParcelable(this.KWHzl, i);
            }

            public EditAlias(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.KWHzl = relationInfo;
            }
        }

        public static final class BlockUser implements Action, Parcelable {
            public final RelationInfo KWHzl;
            public static final int EZpvd = RelationInfo.$stable;
            public static final Parcelable.Creator<BlockUser> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<BlockUser> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BlockUser createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new BlockUser((RelationInfo) parcel.readParcelable(BlockUser.class.getClassLoader()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BlockUser[] newArray(int i) {
                    return new BlockUser[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ BlockUser copy$default(BlockUser blockUser, RelationInfo relationInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = blockUser.KWHzl;
                }
                return blockUser.AEQbTJ(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final BlockUser AEQbTJ(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new BlockUser(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo EZpvd() {
                return this.KWHzl;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BlockUser) && Intrinsics.EZpvd(this.KWHzl, ((BlockUser) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "BlockUser(userInfo=" + this.KWHzl + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeParcelable(this.KWHzl, i);
            }

            public BlockUser(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.KWHzl = relationInfo;
            }
        }

        public static final class RemoveMember implements Action, Parcelable {
            public final RelationInfo EZpvd;
            public final GroupInfo copydefault;
            public static final int KWHzl = RelationInfo.$stable | GroupInfo.$stable;
            public static final Parcelable.Creator<RemoveMember> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<RemoveMember> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RemoveMember createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new RemoveMember((GroupInfo) parcel.readParcelable(RemoveMember.class.getClassLoader()), (RelationInfo) parcel.readParcelable(RemoveMember.class.getClassLoader()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RemoveMember[] newArray(int i) {
                    return new RemoveMember[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ RemoveMember copy$default(RemoveMember removeMember, GroupInfo groupInfo, RelationInfo relationInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    groupInfo = removeMember.copydefault;
                }
                if ((i & 2) != 0) {
                    relationInfo = removeMember.EZpvd;
                }
                return removeMember.KWHzl(groupInfo, relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RemoveMember KWHzl(@NotNull GroupInfo groupInfo, @NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(groupInfo, "");
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new RemoveMember(groupInfo, relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GroupInfo copydefault() {
                return this.copydefault;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RemoveMember)) {
                    return false;
                }
                RemoveMember removeMember = (RemoveMember) obj;
                return Intrinsics.EZpvd(this.copydefault, removeMember.copydefault) && Intrinsics.EZpvd(this.EZpvd, removeMember.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RemoveMember(groupInfo=" + this.copydefault + ", userInfo=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeParcelable(this.copydefault, i);
                parcel.writeParcelable(this.EZpvd, i);
            }

            public RemoveMember(@NotNull GroupInfo groupInfo, @NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(groupInfo, "");
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.copydefault = groupInfo;
                this.EZpvd = relationInfo;
            }
        }

        public static final class AddFriend implements Action, Parcelable {
            public static final int AEQbTJ = OKConversation.$stable | RelationInfo.$stable;
            public static final Parcelable.Creator<AddFriend> CREATOR = new Creator();
            public final RelationInfo EZpvd;
            public final ChatOrigin KWHzl;
            public final OKConversation OLrzqt;

            public static final class Creator implements Parcelable.Creator<AddFriend> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AddFriend createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new AddFriend((RelationInfo) parcel.readParcelable(AddFriend.class.getClassLoader()), (OKConversation) parcel.readParcelable(AddFriend.class.getClassLoader()), (ChatOrigin) parcel.readParcelable(AddFriend.class.getClassLoader()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AddFriend[] newArray(int i) {
                    return new AddFriend[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ AddFriend copy$default(AddFriend addFriend, RelationInfo relationInfo, OKConversation oKConversation, ChatOrigin chatOrigin, int i, Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = addFriend.EZpvd;
                }
                if ((i & 2) != 0) {
                    oKConversation = addFriend.OLrzqt;
                }
                if ((i & 4) != 0) {
                    chatOrigin = addFriend.KWHzl;
                }
                return addFriend.KWHzl(relationInfo, oKConversation, chatOrigin);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKConversation AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ChatOrigin EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AddFriend KWHzl(@NotNull RelationInfo relationInfo, OKConversation oKConversation, @NotNull ChatOrigin chatOrigin) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                Intrinsics.checkNotNullParameter(chatOrigin, "");
                return new AddFriend(relationInfo, oKConversation, chatOrigin);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo KWHzl() {
                return this.EZpvd;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AddFriend)) {
                    return false;
                }
                AddFriend addFriend = (AddFriend) obj;
                return Intrinsics.EZpvd(this.EZpvd, addFriend.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, addFriend.OLrzqt) && this.KWHzl == addFriend.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.EZpvd.hashCode();
                OKConversation oKConversation = this.OLrzqt;
                return (((iHashCode * 31) + (oKConversation == null ? 0 : oKConversation.hashCode())) * 31) + this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AddFriend(userInfo=" + this.EZpvd + ", conversation=" + this.OLrzqt + ", origin=" + this.KWHzl + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeParcelable(this.EZpvd, i);
                parcel.writeParcelable(this.OLrzqt, i);
                parcel.writeParcelable(this.KWHzl, i);
            }

            public AddFriend(@NotNull RelationInfo relationInfo, OKConversation oKConversation, @NotNull ChatOrigin chatOrigin) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                Intrinsics.checkNotNullParameter(chatOrigin, "");
                this.EZpvd = relationInfo;
                this.OLrzqt = oKConversation;
                this.KWHzl = chatOrigin;
            }
        }

        public static final class UnFriend implements Action, Parcelable {
            public final RelationInfo OLrzqt;
            public static final int copydefault = RelationInfo.$stable;
            public static final Parcelable.Creator<UnFriend> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<UnFriend> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnFriend createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new UnFriend((RelationInfo) parcel.readParcelable(UnFriend.class.getClassLoader()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnFriend[] newArray(int i) {
                    return new UnFriend[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UnFriend copy$default(UnFriend unFriend, RelationInfo relationInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = unFriend.OLrzqt;
                }
                return unFriend.KWHzl(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UnFriend KWHzl(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new UnFriend(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo copydefault() {
                return this.OLrzqt;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnFriend) && Intrinsics.EZpvd(this.OLrzqt, ((UnFriend) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UnFriend(userInfo=" + this.OLrzqt + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeParcelable(this.OLrzqt, i);
            }

            public UnFriend(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.OLrzqt = relationInfo;
            }
        }

        public static final class Pay implements Action, Parcelable {
            public final RelationInfo copydefault;
            public static final int KWHzl = RelationInfo.$stable;
            public static final Parcelable.Creator<Pay> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Pay> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Pay createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new Pay((RelationInfo) parcel.readParcelable(Pay.class.getClassLoader()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Pay[] newArray(int i) {
                    return new Pay[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Pay copy$default(Pay pay, RelationInfo relationInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = pay.copydefault;
                }
                return pay.EZpvd(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Pay EZpvd(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new Pay(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo EZpvd() {
                return this.copydefault;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Pay) && Intrinsics.EZpvd(this.copydefault, ((Pay) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Pay(userInfo=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeParcelable(this.copydefault, i);
            }

            public Pay(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.copydefault = relationInfo;
            }
        }

        public static final class ViewPlanetProfile implements Action, Parcelable {
            public static final Parcelable.Creator<ViewPlanetProfile> CREATOR = new Creator();
            public final String copydefault;

            public static final class Creator implements Parcelable.Creator<ViewPlanetProfile> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ViewPlanetProfile createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new ViewPlanetProfile(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ViewPlanetProfile[] newArray(int i) {
                    return new ViewPlanetProfile[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ViewPlanetProfile copy$default(ViewPlanetProfile viewPlanetProfile, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = viewPlanetProfile.copydefault;
                }
                return viewPlanetProfile.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ViewPlanetProfile OLrzqt(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ViewPlanetProfile(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.copydefault;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ViewPlanetProfile) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((ViewPlanetProfile) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ViewPlanetProfile(userId=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.copydefault);
            }

            public ViewPlanetProfile(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.contacts.ContactProfileFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final ContactProfileFragment AEQbTJ(Bundle bundle) {
            ContactProfileFragment contactProfileFragment = new ContactProfileFragment();
            contactProfileFragment.setArguments(bundle);
            return contactProfileFragment;
        }
    }
}
