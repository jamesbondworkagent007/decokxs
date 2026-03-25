package com.okinc.im.imui.messageV2.view.banner.joincall;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.messageV2.view.ChatActivityViewModel;
import com.okinc.im.imui.messageV2.view.banner.joincall.JoinOnGoingCallFragment;
import com.okinc.okimcore.model.im.GroupVoiceCallData;
import com.okinc.okimcore.model.im.GroupVoiceCallUser;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.uilab.banner.OKAlertBanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC36810ohw;
import o.C35233nrU;
import o.C35399nuc;
import o.C36609oeG;
import o.C37721ozF;
import o.C55296xhK;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.C56524yIo;
import o.InterfaceC35259nru;
import o.InterfaceC56387yDm;
import o.nJO;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class JoinOnGoingCallFragment extends AbstractC36810ohw {
    public final InterfaceC56387yDm AhwBna;

    @yCM
    public InterfaceC35259nru audioCallAPI;
    public nJO djBIcL;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ohx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return JoinOnGoingCallFragment.AEQbTJ(this.EZpvd);
        }
    });
    public final int gEmmrt = C35399nuc.Dialog.gwTjWJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.banner.joincall.JoinOnGoingCallFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final JoinOnGoingCallFragment AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            JoinOnGoingCallFragment joinOnGoingCallFragment = new JoinOnGoingCallFragment();
            joinOnGoingCallFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_CHANNEL_ID", str)));
            return joinOnGoingCallFragment;
        }
    }

    public JoinOnGoingCallFragment() {
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChatActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.banner.joincall.JoinOnGoingCallFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.banner.joincall.JoinOnGoingCallFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.banner.joincall.JoinOnGoingCallFragment$special$$inlined$activityViewModels$default$3
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
    }

    /* JADX DEBUG: Possible override for method o.ohw.AEQbTJ()V */
    public final InterfaceC35259nru AEQbTJ() {
        InterfaceC35259nru interfaceC35259nru = this.audioCallAPI;
        if (interfaceC35259nru != null) {
            return interfaceC35259nru;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final String AEQbTJ(JoinOnGoingCallFragment joinOnGoingCallFragment) {
        Bundle arguments = joinOnGoingCallFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_CHANNEL_ID");
        }
        return null;
    }

    private final ChatActivityViewModel gEmmrt() {
        return (ChatActivityViewModel) this.AhwBna.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nJO njoCopydefault = nJO.copydefault(layoutInflater, viewGroup, false);
        this.djBIcL = njoCopydefault;
        if (njoCopydefault != null) {
            return njoCopydefault.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        OKAlertBanner oKAlertBanner;
        Intrinsics.checkNotNullParameter(view, "");
        AYXKKw();
        nJO njo = this.djBIcL;
        if (njo == null || (oKAlertBanner = njo.KWHzl) == null) {
            return;
        }
        oKAlertBanner.setLeadingIcon(AppCompatResources.getDrawable(requireContext(), C35399nuc.ActionBar.fARcdN));
        oKAlertBanner.setOnClickListener(new Application(oKAlertBanner, 1000L, this));
    }

    public final void valueOf() {
        GroupVoiceCallConfig groupVoiceCallConfig;
        GroupVoiceCallData currentCall;
        Integer maxParticipants;
        GroupVoiceCallConfig groupVoiceCallConfig2;
        GroupVoiceCallData currentCall2;
        List<GroupVoiceCallUser> activeUsers;
        GroupInfo value = gEmmrt().fetchVPNInfo().getValue();
        if (value == null || (groupVoiceCallConfig = value.getGroupVoiceCallConfig()) == null || (currentCall = groupVoiceCallConfig.getCurrentCall()) == null || (maxParticipants = currentCall.getMaxParticipants()) == null) {
            return;
        }
        int iIntValue = maxParticipants.intValue();
        GroupInfo value2 = gEmmrt().fetchVPNInfo().getValue();
        if (value2 == null || (groupVoiceCallConfig2 = value2.getGroupVoiceCallConfig()) == null || (currentCall2 = groupVoiceCallConfig2.getCurrentCall()) == null || (activeUsers = currentCall2.getActiveUsers()) == null) {
            return;
        }
        if (activeUsers.size() < iIntValue) {
            Fragment parentFragment = getParentFragment();
            C36609oeG c36609oeG = parentFragment instanceof C36609oeG ? (C36609oeG) parentFragment : null;
            if (c36609oeG != null) {
                C36609oeG.requestStartVoiceCall$default(c36609oeG, null, 1, null);
                return;
            }
            return;
        }
        Fragment parentFragment2 = getParentFragment();
        C36609oeG c36609oeG2 = parentFragment2 instanceof C36609oeG ? (C36609oeG) parentFragment2 : null;
        if (c36609oeG2 != null) {
            c36609oeG2.copydefault(C35399nuc.LoaderManager.DPHsZd);
        }
    }

    private final void AYXKKw() {
        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(FlowKt.filterNotNull(gEmmrt().fetchVPNInfo()), AEQbTJ().EZpvd(), new JoinOnGoingCallFragment$initObserver$1(this, null)));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(flowDistinctUntilChanged, viewLifecycleOwner, (Lifecycle.State) null, new JoinOnGoingCallFragment$initObserver$2(this, null), 2, (Object) null);
    }

    public final boolean KWHzl(GroupInfo groupInfo, C35233nrU c35233nrU) {
        GroupVoiceCallData currentCall;
        List<GroupVoiceCallUser> activeUsers;
        GroupVoiceCallConfig groupVoiceCallConfig = groupInfo.getGroupVoiceCallConfig();
        if (groupVoiceCallConfig == null || (currentCall = groupVoiceCallConfig.getCurrentCall()) == null || (activeUsers = currentCall.getActiveUsers()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(activeUsers, 10));
        Iterator<T> it = activeUsers.iterator();
        while (it.hasNext()) {
            arrayList.add(((GroupVoiceCallUser) it.next()).getAgoraUid());
        }
        return !arrayList.contains(c35233nrU != null ? Long.valueOf(c35233nrU.AEQbTJ()) : null);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ JoinOnGoingCallFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, JoinOnGoingCallFragment joinOnGoingCallFragment) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = joinOnGoingCallFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.valueOf();
            }
        }
    }
}
