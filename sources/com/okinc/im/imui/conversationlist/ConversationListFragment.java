package com.okinc.im.imui.conversationlist;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.config.ImEnabledStatus;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.conversation.message.menu.ListMenuPopupWindow;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import com.okinc.im.imui.conversation.message.menu.impl.DeleteConversationMenuItemPerformer;
import com.okinc.im.imui.conversation.message.menu.impl.DisturbConversationMenuItemPerformer;
import com.okinc.im.imui.conversation.message.menu.impl.FlagConversationMenuItemPerformer;
import com.okinc.im.imui.conversation.message.menu.impl.MarkConversationAsReadMenuItemPerformer;
import com.okinc.im.imui.conversation.message.menu.impl.PinConversationMenuItemPerformer;
import com.okinc.im.imui.conversationlist.ConversationListFragment;
import com.okinc.im.imui.conversationlist.menu.home.HideSectionItemPerformer;
import com.okinc.im.imui.conversationlist.model.ConversationListParams;
import com.okinc.im.imui.conversationlist.provider.ConversationListFilterChipsType;
import com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel;
import com.okinc.im.imui.conversationlist.viewmodel.ConversationListViewModel;
import com.okinc.im.imui.conversationlist.viewmodel.RestrictedConversationListViewModel;
import com.okinc.im.usecase.conversation.CheckStartNewChatUseCase;
import com.okinc.ok_kyc_core_api.ResultBackStatus;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.stateful.StatefulView;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.AbstractC58185ywX;
import o.ActivityC37293orB;
import o.ActivityC37326ori;
import o.ActivityC37536ovg;
import o.C32866mlf;
import o.C32868mlh;
import o.C32991mny;
import o.C33024moe;
import o.C33070mpX;
import o.C33129mqd;
import o.C33546myW;
import o.C33570myu;
import o.C33764nEz;
import o.C33815nGw;
import o.C33820nHa;
import o.C33822nHc;
import o.C33824nHe;
import o.C33826nHg;
import o.C33829nHj;
import o.C33831nHl;
import o.C33832nHm;
import o.C33833nHn;
import o.C33834nHo;
import o.C33836nHq;
import o.C33838nHs;
import o.C34168nTy;
import o.C35399nuc;
import o.C35718oBc;
import o.C37242oqD;
import o.C37246oqH;
import o.C37290oqz;
import o.C37314orW;
import o.C37341orx;
import o.C37716ozA;
import o.C43251rlk;
import o.C43296rmc;
import o.C44170sFx;
import o.C52761wXj;
import o.C55237xgE;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56402yEa;
import o.C56444yFp;
import o.C6805aWM;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56445yFq;
import o.InterfaceC56514yIe;
import o.InterfaceC57900yrD;
import o.InterfaceC57934yrl;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC6804aWL;
import o.ViewOnClickListenerC54939xaY;
import o.nEE;
import o.nEI;
import o.nFG;
import o.nFQ;
import o.nGA;
import o.nGC;
import o.nGE;
import o.nGF;
import o.nGM;
import o.nGR;
import o.nGS;
import o.nGU;
import o.nGX;
import o.nOM;
import o.oGU;
import o.pKC;
import o.pUU;
import o.rTU;
import o.rVN;
import o.rXL;
import o.rXT;
import o.sEF;
import o.sNN;
import o.tWL;
import o.yCM;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ConversationListFragment extends nFQ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final Application AEQbTJ;
    public boolean AhwBna;
    public final ActivityResultLauncher<Intent> DbNXlk;
    public Job EZpvd;
    public final TaskDescription copydefault;
    public InterfaceC58217yxC djBIcL;
    public final LoaderManager fIwbmz;
    public PopupWindow fetchVPNInfo;
    public nOM isConnected;

    @yCM
    public C34168nTy joinGroupEntryHelper;
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.nFg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ConversationListFragment.values(this.AEQbTJ);
        }
    });
    public final nEE AYXKKw = new nEE(new nEI());
    public final ActivityResultLauncher<Intent> AkhnZx = C37290oqz.registerForImNewChatInConvoListActivityResult$default(C37290oqz.copydefault, this, null, 1, null);
    public boolean valueOf = true;
    public final int gEmmrt = C35399nuc.Dialog.invokespecialdPnHjp;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.nFf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ConversationListFragment.gEmmrt(this.copydefault);
        }
    });

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ImEnabledStatus.values().length];
            try {
                iArr[ImEnabledStatus.Full.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[BaseConversationListViewModel.NewChatCheckState.values().length];
            try {
                iArr2[BaseConversationListViewModel.NewChatCheckState.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[BaseConversationListViewModel.NewChatCheckState.ShowKycFlow.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr2;
            int[] iArr3 = new int[BaseConversationListViewModel.AddContactCheckState.values().length];
            try {
                iArr3[BaseConversationListViewModel.AddContactCheckState.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[BaseConversationListViewModel.AddContactCheckState.ShowKycFlow.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            KWHzl = iArr3;
            int[] iArr4 = new int[BaseConversationListViewModel.SyncSuggestedListCheckState.values().length];
            try {
                iArr4[BaseConversationListViewModel.SyncSuggestedListCheckState.ShowKycFlow.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr4[BaseConversationListViewModel.SyncSuggestedListCheckState.AskContactPermission.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            OLrzqt = iArr4;
            int[] iArr5 = new int[KycFlowRequest.values().length];
            try {
                iArr5[KycFlowRequest.NEW_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr5[KycFlowRequest.SYNC_LOCAL_RELATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            EZpvd = iArr5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(PopupWindow popupWindow) {
        this.fetchVPNInfo = popupWindow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public ConversationListFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.nFh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ConversationListFragment.KWHzl(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.DbNXlk = activityResultLauncherRegisterForActivityResult;
        this.fIwbmz = new LoaderManager();
        this.AEQbTJ = new Application();
        this.copydefault = new TaskDescription();
    }

    public final BaseConversationListViewModel AhwBna() {
        return (BaseConversationListViewModel) this.values.getValue();
    }

    public static final BaseConversationListViewModel values(ConversationListFragment conversationListFragment) {
        if (StateListAnimator.copydefault[oGU.KWHzl.AEQbTJ().ordinal()] == 1) {
            return (BaseConversationListViewModel) new ViewModelProvider(conversationListFragment).get(ConversationListViewModel.class);
        }
        return (BaseConversationListViewModel) new ViewModelProvider(conversationListFragment).get(RestrictedConversationListViewModel.class);
    }

    /* JADX DEBUG: Possible override for method o.nFQ.OLrzqt()V */
    public final C34168nTy OLrzqt() {
        C34168nTy c34168nTy = this.joinGroupEntryHelper;
        if (c34168nTy != null) {
            return c34168nTy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final ConversationListParams EZpvd() {
        return (ConversationListParams) this.OLrzqt.getValue();
    }

    public static final ConversationListParams gEmmrt(ConversationListFragment conversationListFragment) {
        ConversationListParams conversationListParams;
        Bundle arguments = conversationListFragment.getArguments();
        return (arguments == null || (conversationListParams = (ConversationListParams) BundleCompat.getParcelable(arguments, "route_params", ConversationListParams.class)) == null) ? new ConversationListParams(null, false, false, false, 0, false, false, false, false, FrameMetricsAggregator.EVERY_DURATION, null) : conversationListParams;
    }

    public static final void KWHzl(ConversationListFragment conversationListFragment, ActivityResult activityResult) {
        Intent data;
        Bundle extras;
        OKConversation oKConversation;
        if (activityResult.getResultCode() != 1001 || (data = activityResult.getData()) == null || (extras = data.getExtras()) == null || (oKConversation = (OKConversation) extras.getParcelable("conversation")) == null) {
            return;
        }
        C33764nEz c33764nEz = C33764nEz.OLrzqt;
        Context contextRequireContext = conversationListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c33764nEz.copydefault(oKConversation, contextRequireContext, (204 & 4) != 0 ? null : null, (204 & 8) != 0 ? null : null, (204 & 16) != 0 ? null : null, (204 & 32) != 0 ? null : null, (204 & 64) != 0 ? null : null, (204 & 128) != 0 ? null : null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class KycFlowRequest {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ KycFlowRequest[] $VALUES;
        public static final KycFlowRequest NEW_MESSAGE = new KycFlowRequest("NEW_MESSAGE", 0);
        public static final KycFlowRequest SYNC_LOCAL_RELATION = new KycFlowRequest("SYNC_LOCAL_RELATION", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ KycFlowRequest[] $values() {
            return new KycFlowRequest[]{NEW_MESSAGE, SYNC_LOCAL_RELATION};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<KycFlowRequest> getEntries() {
            return $ENTRIES;
        }

        private KycFlowRequest(String str, int i) {
        }

        static {
            KycFlowRequest[] kycFlowRequestArr$values = $values();
            $VALUES = kycFlowRequestArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(kycFlowRequestArr$values);
        }

        public static KycFlowRequest valueOf(String str) {
            return (KycFlowRequest) Enum.valueOf(KycFlowRequest.class, str);
        }

        public static KycFlowRequest[] values() {
            return (KycFlowRequest[]) $VALUES.clone();
        }
    }

    public final void KWHzl(nGM ngm) {
        tWL twl;
        AhwBna().OLrzqt(ngm.AEQbTJ(), true);
        C43296rmc.EZpvd(getTAG(), "OrbitUpdatesConversation on click");
        Context context = getContext();
        if (context == null || (twl = (tWL) C43251rlk.OLrzqt(tWL.class)) == null) {
            return;
        }
        tWL.Application.openPlanetNotificationCenter$default(twl, context, null, 2, null);
    }

    public final void AEQbTJ(nGF ngf) {
        Intent intentBuildNotificationCenterIntent$default = null;
        BaseConversationListViewModel.markConversationAsRead$default(AhwBna(), ngf.AEQbTJ(), false, 2, null);
        Context context = getContext();
        if (context != null) {
            rXT rxt = (rXT) C43251rlk.OLrzqt(rXT.class);
            if (rxt != null) {
                rXL rxlDjBIcL = ngf.djBIcL();
                intentBuildNotificationCenterIntent$default = rXT.StateListAnimator.buildNotificationCenterIntent$default(rxt, context, rxlDjBIcL != null ? rxlDjBIcL.EZpvd() : null, null, 4, null);
            }
            if (intentBuildNotificationCenterIntent$default != null) {
                context.startActivity(intentBuildNotificationCenterIntent$default);
            }
        }
    }

    public final void copydefault(nGE nge) {
        final OKConversation oKConversationAEQbTJ = nge.AEQbTJ();
        if (oKConversationAEQbTJ == null) {
            return;
        }
        if (C44170sFx.OLrzqt(oKConversationAEQbTJ)) {
            InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
            if (interfaceC6804aWL != null) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                interfaceC6804aWL.copydefault(contextRequireContext, C6805aWM.OLrzqt(new Function1() { // from class: o.nFv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ConversationListFragment.EZpvd((ChatBotRequest) obj);
                    }
                }));
                return;
            }
            return;
        }
        if (C44170sFx.copydefault(oKConversationAEQbTJ)) {
            EZpvd(oKConversationAEQbTJ);
            return;
        }
        if (C44170sFx.KWHzl(oKConversationAEQbTJ)) {
            AEQbTJ(oKConversationAEQbTJ);
            return;
        }
        C32866mlf.onEvent$default("IMChat_Full_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.nFw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.EZpvd(oKConversationAEQbTJ, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        C33764nEz c33764nEz = C33764nEz.OLrzqt;
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        c33764nEz.copydefault(oKConversationAEQbTJ, contextRequireContext2, (204 & 4) != 0 ? null : null, (204 & 8) != 0 ? null : null, (204 & 16) != 0 ? null : "conversation", (204 & 32) != 0 ? null : null, (204 & 64) != 0 ? null : null, (204 & 128) != 0 ? null : null);
    }

    public static final Unit EZpvd(ChatBotRequest chatBotRequest) {
        Intrinsics.checkNotNullParameter(chatBotRequest, "");
        chatBotRequest.setOkaFrom("dedicatedvip_imconv_chat");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(OKConversation oKConversation, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        String targetId = oKConversation.getTargetId();
        EventParamsList.put$default(eventParamsList, "channel_id", targetId == null ? "" : targetId, false, 4, null);
        EventParamsList.put$default(eventParamsList, "channel_type", sNN.copydefault(oKConversation.getConversationType()), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(OKConversation oKConversation) {
        KWHzl(oKConversation);
    }

    public final void KWHzl(final OKConversation oKConversation) {
        if (getContext() != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
            viewOnClickListenerC54939xaY.setTitle(viewOnClickListenerC54939xaY.getContext().getResources().getString(C35399nuc.LoaderManager.zblBkD));
            viewOnClickListenerC54939xaY.EZpvd(viewOnClickListenerC54939xaY.getContext().getResources().getString(C35399nuc.LoaderManager.spnCvw));
            viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.DCUTEI), new View.OnClickListener() { // from class: o.nEN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ConversationListFragment.KWHzl(this.EZpvd, oKConversation, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.setCancelable(true);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void KWHzl(ConversationListFragment conversationListFragment, OKConversation oKConversation, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        conversationListFragment.AhwBna().OLrzqt(oKConversation.getTargetId());
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AEQbTJ(OKConversation oKConversation) {
        Integer disbandServiceScenarioType = oKConversation.getDisbandServiceScenarioType();
        if (disbandServiceScenarioType != null && disbandServiceScenarioType.intValue() == 91) {
            OLrzqt(oKConversation);
        } else if (disbandServiceScenarioType != null && disbandServiceScenarioType.intValue() == 92) {
            copydefault(oKConversation);
        } else {
            gEmmrt(oKConversation);
        }
    }

    public final void gEmmrt(final OKConversation oKConversation) {
        if (getContext() != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
            viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.fdOvFl);
            viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.fERRXa);
            viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.DarRvM, new View.OnClickListener() { // from class: o.nFq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ConversationListFragment.valueOf(this.OLrzqt, oKConversation, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.setCancelable(true);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void valueOf(ConversationListFragment conversationListFragment, OKConversation oKConversation, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        conversationListFragment.AhwBna().OLrzqt(oKConversation.getTargetId());
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(final OKConversation oKConversation) {
        Context context = getContext();
        if (context != null) {
            Integer role = oKConversation.getRole();
            int i = (role != null && role.intValue() == GroupRole.Owner.getCode()) ? C35399nuc.LoaderManager.onComplete : C35399nuc.LoaderManager.scanPackages;
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.UJEglR);
            viewOnClickListenerC54939xaY.copydefault(i);
            viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.getFieldNames, new View.OnClickListener() { // from class: o.nFt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ConversationListFragment.AYXKKw(this.copydefault, oKConversation, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.setCancelable(true);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void AYXKKw(ConversationListFragment conversationListFragment, OKConversation oKConversation, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        conversationListFragment.AhwBna().OLrzqt(oKConversation.getTargetId());
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void copydefault(final OKConversation oKConversation) {
        Context context = getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.UJEglR);
            viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.registerUser);
            viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.getFieldNames, new View.OnClickListener() { // from class: o.nFo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ConversationListFragment.djBIcL(this.AEQbTJ, oKConversation, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.setCancelable(true);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void djBIcL(ConversationListFragment conversationListFragment, OKConversation oKConversation, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        conversationListFragment.AhwBna().OLrzqt(oKConversation.getTargetId());
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (isReenter()) {
            AhwBna().QVAiDq();
            AhwBna().copydefault(gEmmrt());
            AhwBna().copydefault();
        }
        AhwBna().fFgQHt();
        AhwBna().EZpvd();
        AhwBna().AEQbTJ();
        AhwBna().RcXXUw();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.isConnected = nOM.KWHzl(view);
        if (oGU.KWHzl.KWHzl()) {
            nOM nom = this.isConnected;
            if (nom == null) {
                Intrinsics.gEmmrt("");
                nom = null;
            }
            nom.valueOf.setPadding(0, C33570myu.gEmmrt(requireActivity()), 0, 0);
        }
        valueOf();
        values();
        djBIcL();
        AhwBna().ORxRYg().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.nFp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.KWHzl(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        AhwBna().ejfBZ().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.nFu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.OLrzqt(this.copydefault, (java.util.Set) obj);
            }
        }));
        AhwBna().djBIcL().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.nFs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.copydefault(this.EZpvd, (nGA) obj);
            }
        }));
        AhwBna().QbewEr();
        AhwBna().dxcTrN();
    }

    public static final Unit KWHzl(ConversationListFragment conversationListFragment, Boolean bool) {
        pUU.KWHzl("ConversationListFragment", "isEnableLoadMore: " + bool);
        nOM nom = conversationListFragment.isConnected;
        if (nom == null) {
            Intrinsics.gEmmrt("");
            nom = null;
        }
        C33546myW c33546myW = nom.AYXKKw;
        Intrinsics.copydefault(bool);
        c33546myW.AhwBna(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ConversationListFragment conversationListFragment, Set set) {
        Intrinsics.checkNotNullParameter(set, "");
        pUU.KWHzl("ConversationListFragment", "itemChangedSet: " + set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            try {
                Result.Application application = Result.Companion;
                conversationListFragment.AYXKKw.notifyItemChanged(iIntValue);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final ConversationListFragment conversationListFragment, nGA nga) {
        View viewFindViewById;
        Intrinsics.checkNotNullParameter(nga, "");
        pUU.KWHzl("ConversationListFragment", "actionLiveData: " + nga);
        nOM nom = null;
        if (nga instanceof nGA.Fragment) {
            if (((nGA.Fragment) nga).OLrzqt()) {
                nOM nom2 = conversationListFragment.isConnected;
                if (nom2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    nom = nom2;
                }
                nom.AhwBna.setStatus(StatefulView.Status.Loading);
            } else {
                nOM nom3 = conversationListFragment.isConnected;
                if (nom3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    nom = nom3;
                }
                nom.AhwBna.setStatus(StatefulView.Status.Content);
            }
        } else if (nga instanceof nGA.FragmentManager) {
            conversationListFragment.OLrzqt(false);
            nOM nom4 = conversationListFragment.isConnected;
            if (nom4 == null) {
                Intrinsics.gEmmrt("");
                nom4 = null;
            }
            C55237xgE c55237xgE = nom4.AhwBna;
            StatefulView.Status status = StatefulView.Status.Error;
            c55237xgE.setStatus(status);
            nOM nom5 = conversationListFragment.isConnected;
            if (nom5 == null) {
                Intrinsics.gEmmrt("");
                nom5 = null;
            }
            View viewAEQbTJ = nom5.AhwBna.AEQbTJ(status);
            if (viewAEQbTJ != null && (viewFindViewById = viewAEQbTJ.findViewById(C52761wXj.FragmentManager.fIwbmz)) != null) {
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: o.nEG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ConversationListFragment.copydefault(this.EZpvd, view);
                    }
                });
            }
            rVN.reportFullyDrawn$default((Fragment) conversationListFragment, false, (String) null, 2, (Object) null);
        } else if (nga instanceof nGA.TaskDescription) {
            FragmentActivity activity = conversationListFragment.getActivity();
            if (activity != null && !conversationListFragment.AhwBna) {
                C37716ozA.KWHzl(activity, false, (Function0<Unit>) new Function0() { // from class: o.nEH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ConversationListFragment.DbNXlk(this.OLrzqt);
                    }
                });
                conversationListFragment.AhwBna = true;
            }
        } else if (nga instanceof nGA.AssistContent) {
            KeyEventDispatcher.Component activity2 = conversationListFragment.getActivity();
            if (activity2 != null && (activity2 instanceof pKC)) {
                ((pKC) activity2).KWHzl();
            }
        } else if (nga instanceof nGA.ActionBar) {
            nOM nom6 = conversationListFragment.isConnected;
            if (nom6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                nom = nom6;
            }
            nom.AYXKKw.valueOf();
        } else if (nga instanceof nGA.Dialog) {
            C55326xho.toast$default(((nGA.Dialog) nga).AEQbTJ(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        } else if (nga instanceof nGA.Activity) {
            C37314orW c37314orWKWHzl = C37314orW.Companion.KWHzl(((nGA.Activity) nga).KWHzl());
            androidx.fragment.app.FragmentManager childFragmentManager = conversationListFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c37314orWKWHzl.show(childFragmentManager);
        } else if (nga instanceof nGA.Application) {
            C33764nEz c33764nEz = C33764nEz.OLrzqt;
            Context contextRequireContext = conversationListFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            nGA.Application application = (nGA.Application) nga;
            C33764nEz.startIMChat$default(c33764nEz, contextRequireContext, application.EZpvd(), ChatOrigin.NEW_CHAT_FRIEND_LIST, null, null, application.copydefault(), IMPageType.NORMAL_IM, null, null, 408, null);
        } else if (nga instanceof nGA.LoaderManager) {
            conversationListFragment.copydefault(((nGA.LoaderManager) nga).KWHzl());
        } else if (nga instanceof nGA.StateListAnimator) {
            conversationListFragment.fetchVPNInfo();
        } else {
            if (!(nga instanceof nGA.PendingIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            conversationListFragment.isConnected();
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(ConversationListFragment conversationListFragment, View view) {
        conversationListFragment.AhwBna().dNCPSb();
    }

    public static final Unit DbNXlk(ConversationListFragment conversationListFragment) {
        conversationListFragment.AhwBna = false;
        ((rXT) C43251rlk.copydefault(rXT.class)).KWHzl();
        return Unit.INSTANCE;
    }

    public final void values() {
        nEE nee = this.AYXKKw;
        if (EZpvd().isShowSearchBar() && !oGU.KWHzl.OLrzqt(EZpvd().getOrigin())) {
            C33831nHl c33831nHl = new C33831nHl();
            c33831nHl.copydefault(new FragmentManager());
            nee.copydefault(c33831nHl);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C33820nHa c33820nHa = new C33820nHa(viewLifecycleOwner);
        c33820nHa.OLrzqt(this.copydefault);
        nee.copydefault(c33820nHa);
        C33824nHe c33824nHe = new C33824nHe();
        c33824nHe.OLrzqt(this.copydefault);
        nee.copydefault(c33824nHe);
        C33829nHj c33829nHj = new C33829nHj();
        c33829nHj.OLrzqt(this.copydefault);
        nee.copydefault(c33829nHj);
        C33838nHs c33838nHs = new C33838nHs();
        c33838nHs.KWHzl(this.fIwbmz);
        c33838nHs.EZpvd(this.AEQbTJ);
        nee.copydefault(c33838nHs);
        C33836nHq c33836nHq = new C33836nHq(oGU.KWHzl.OLrzqt(EZpvd().getOrigin()));
        c33836nHq.AEQbTJ((C33836nHq.Activity) this.fIwbmz);
        c33836nHq.EZpvd(this.AEQbTJ);
        nee.copydefault(c33836nHq);
        nee.copydefault(new nGX());
        C33822nHc c33822nHc = new C33822nHc();
        c33822nHc.AEQbTJ(new Function0() { // from class: o.nFd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ConversationListFragment.AkhnZx(this.KWHzl);
            }
        });
        c33822nHc.copydefault(new Function0() { // from class: o.nFj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ConversationListFragment.fetchVPNInfo(this.EZpvd);
            }
        });
        nee.copydefault(c33822nHc);
        tWL twl = (tWL) C43251rlk.OLrzqt(tWL.class);
        if (twl != null && twl.AhwBna()) {
            C33826nHg c33826nHg = new C33826nHg();
            c33826nHg.KWHzl(new Function1() { // from class: o.nFm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ConversationListFragment.EZpvd(this.EZpvd, (nGS) obj);
                }
            });
            nee.copydefault(c33826nHg);
        } else {
            C33834nHo c33834nHo = new C33834nHo();
            c33834nHo.copydefault(new Function1() { // from class: o.nFk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ConversationListFragment.copydefault(this.AEQbTJ, (nGS) obj);
                }
            });
            nee.copydefault(c33834nHo);
        }
        nGU ngu = new nGU();
        ngu.KWHzl(new Function1() { // from class: o.nFi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.EZpvd(this.OLrzqt, (ConversationListFilterChipsType) obj);
            }
        });
        nee.copydefault(ngu);
        C33832nHm c33832nHm = new C33832nHm();
        c33832nHm.KWHzl(new Dialog());
        nee.copydefault(c33832nHm);
        C33833nHn c33833nHn = new C33833nHn();
        c33833nHn.KWHzl(new PendingIntent());
        nee.copydefault(c33833nHn);
        nOM nom = this.isConnected;
        nOM nom2 = null;
        if (nom == null) {
            Intrinsics.gEmmrt("");
            nom = null;
        }
        RecyclerView recyclerView = nom.KWHzl;
        int recyclerviewLastItemPadding = EZpvd().getRecyclerviewLastItemPadding();
        recyclerView.setClipToPadding(false);
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), recyclerView.getPaddingEnd(), recyclerviewLastItemPadding);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.setAdapter(this.AYXKKw);
        nOM nom3 = this.isConnected;
        if (nom3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            nom2 = nom3;
        }
        nom2.AYXKKw.KWHzl(new InterfaceC57900yrD() { // from class: o.nFl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                ConversationListFragment.AEQbTJ(this.copydefault, interfaceC57934yrl);
            }
        });
    }

    public static final class FragmentManager implements C33831nHl.TaskDescription {
        public FragmentManager() {
        }

        @Override // o.C33831nHl.TaskDescription
        public void copydefault() {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("MessagingNotificationCenter_TopRight_Search_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (Object) null);
            ConversationListFragment.this.AkhnZx();
        }
    }

    public static final Unit AkhnZx(ConversationListFragment conversationListFragment) {
        Context context = conversationListFragment.getContext();
        if (context != null) {
            context.startActivity(TrendingGroupsListActivity.Companion.EZpvd(context));
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(ConversationListFragment conversationListFragment) {
        conversationListFragment.AhwBna().QfsBiF();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ConversationListFragment conversationListFragment, nGS ngs) {
        Intrinsics.checkNotNullParameter(ngs, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(conversationListFragment), null, null, new ConversationListFragment$setUpRecyclerView$1$8$1$1(conversationListFragment, ngs, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ConversationListFragment conversationListFragment, nGS ngs) {
        Intrinsics.checkNotNullParameter(ngs, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(conversationListFragment), null, null, new ConversationListFragment$setUpRecyclerView$1$9$1$1(conversationListFragment, ngs, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ConversationListFragment conversationListFragment, ConversationListFilterChipsType conversationListFilterChipsType) {
        Intrinsics.checkNotNullParameter(conversationListFilterChipsType, "");
        pUU.EZpvd(conversationListFragment.getTAG(), conversationListFilterChipsType + " is selected");
        conversationListFragment.AhwBna().KWHzl(conversationListFilterChipsType);
        return Unit.INSTANCE;
    }

    public static final class Dialog implements C33832nHm.Application {
        public Dialog() {
        }

        @Override // o.C33832nHm.Application
        public void EZpvd(RelationInfo relationInfo) {
            Intrinsics.checkNotNullParameter(relationInfo, "");
            C33764nEz c33764nEz = C33764nEz.OLrzqt;
            Context contextRequireContext = ConversationListFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C33764nEz.startIMChat$default(c33764nEz, contextRequireContext, null, ChatOrigin.CONVERSATION_LIST, null, null, relationInfo.getContactsId(), IMPageType.NORMAL_IM, C33070mpX.AYXKKw(C35399nuc.LoaderManager.OLrzqt), null, 282, null);
        }
    }

    public static final class PendingIntent implements C33833nHn.TaskDescription {
        public PendingIntent() {
        }

        @Override // o.C33833nHn.TaskDescription
        public void OLrzqt(C37246oqH c37246oqH) {
            Intrinsics.checkNotNullParameter(c37246oqH, "");
            ConversationListFragment.this.AhwBna().AEQbTJ(c37246oqH);
        }
    }

    public static final void AEQbTJ(ConversationListFragment conversationListFragment, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        pUU.KWHzl(conversationListFragment.getTAG(), "onLoadMore");
        conversationListFragment.AhwBna().RJOkX();
    }

    public static final class LoaderManager implements C33836nHq.Activity {
        public LoaderManager() {
        }

        @Override // o.C33836nHq.Activity
        public void AEQbTJ() {
            pUU.KWHzl("ConversationListFragment", "Sync button clicked");
            ConversationListFragment.this.AhwBna().aKErDB();
        }
    }

    public static final class Application implements C33836nHq.StateListAnimator {
        public Application() {
        }

        @Override // o.C33836nHq.StateListAnimator
        public void copydefault() {
            pUU.KWHzl("ConversationListFragment", "Dismiss sync contact item clicked");
            ConversationListFragment.this.AhwBna().OLrzqt();
        }
    }

    public static final class TaskDescription implements nGR.ActionBar {
        public TaskDescription() {
        }

        @Override // o.nGR.ActionBar
        public void copydefault(nGE nge) {
            Intrinsics.checkNotNullParameter(nge, "");
            if (nge instanceof nGM) {
                ConversationListFragment.this.KWHzl((nGM) nge);
            } else if (nge instanceof nGF) {
                ConversationListFragment.this.AEQbTJ((nGF) nge);
            } else {
                ConversationListFragment.this.copydefault(nge);
            }
        }

        @Override // o.nGR.ActionBar
        public void KWHzl(nGE nge, View view, Pair<Float, Float> pair) {
            List<? extends IMenuItemPerformer> listGEmmrt;
            Intrinsics.checkNotNullParameter(nge, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(pair, "");
            final OKConversation oKConversationAEQbTJ = nge.AEQbTJ();
            if (oKConversationAEQbTJ == null) {
                return;
            }
            if (C44170sFx.copydefault(oKConversationAEQbTJ)) {
                ConversationListFragment.this.EZpvd(oKConversationAEQbTJ);
                return;
            }
            if (C44170sFx.KWHzl(oKConversationAEQbTJ)) {
                ConversationListFragment.this.AEQbTJ(oKConversationAEQbTJ);
                return;
            }
            final ConversationListFragment conversationListFragment = ConversationListFragment.this;
            MarkConversationAsReadMenuItemPerformer markConversationAsReadMenuItemPerformer = new MarkConversationAsReadMenuItemPerformer(new Function0() { // from class: o.nFB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ConversationListFragment.TaskDescription.KWHzl(conversationListFragment, oKConversationAEQbTJ);
                }
            });
            int i = 2;
            if (nge instanceof nGF) {
                listGEmmrt = yDY.gEmmrt(new PinConversationMenuItemPerformer(oKConversationAEQbTJ), markConversationAsReadMenuItemPerformer);
            } else if (nge instanceof nGM) {
                listGEmmrt = yDY.gEmmrt(new PinConversationMenuItemPerformer(oKConversationAEQbTJ), markConversationAsReadMenuItemPerformer);
            } else if (yEE.AhwBna(GroupTagType.OTC_AGENT, GroupTagType.RM_VIP_GROUP).contains(oKConversationAEQbTJ.getGroupType())) {
                listGEmmrt = yDY.gEmmrt(new DisturbConversationMenuItemPerformer(oKConversationAEQbTJ), new PinConversationMenuItemPerformer(oKConversationAEQbTJ), new FlagConversationMenuItemPerformer(oKConversationAEQbTJ));
            } else {
                listGEmmrt = yDY.gEmmrt(new DisturbConversationMenuItemPerformer(oKConversationAEQbTJ), new PinConversationMenuItemPerformer(oKConversationAEQbTJ), new DeleteConversationMenuItemPerformer(oKConversationAEQbTJ));
            }
            if (C33129mqd.KWHzl((Collection) listGEmmrt)) {
                ConversationListFragment conversationListFragment2 = ConversationListFragment.this;
                Context contextRequireContext = conversationListFragment2.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                conversationListFragment2.EZpvd(new ListMenuPopupWindow(contextRequireContext, null, i, 0 == true ? 1 : 0).OLrzqt(view, listGEmmrt, 18.0f));
            }
        }

        public static final Unit KWHzl(ConversationListFragment conversationListFragment, OKConversation oKConversation) {
            BaseConversationListViewModel.markConversationAsRead$default(conversationListFragment.AhwBna(), oKConversation, false, 2, null);
            return Unit.INSTANCE;
        }
    }

    public final void copydefault(C37246oqH c37246oqH) {
        C37341orx c37341orxOLrzqt = C37341orx.Companion.OLrzqt(c37246oqH.EZpvd(), c37246oqH.OLrzqt());
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c37341orxOLrzqt.show(childFragmentManager);
        getChildFragmentManager().setFragmentResultListener("REQUEST_KEY_SELECTION_LOCAL_RELATION", this, new FragmentResultListener() { // from class: o.nEJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ConversationListFragment.valueOf(this.copydefault, str, bundle);
            }
        });
    }

    public static final void valueOf(ConversationListFragment conversationListFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        PhoneRelation phoneRelation = (PhoneRelation) BundleCompat.getParcelable(bundle, "RESULT_KEY_SELECTED_RELATION", PhoneRelation.class);
        if (phoneRelation != null) {
            conversationListFragment.AhwBna().AEQbTJ(phoneRelation);
        }
    }

    private final void AEQbTJ(List<? extends Object> list) {
        this.AYXKKw.AEQbTJ(list);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("MessagingNotificationCenter_FullPage_Page_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (Object) null);
        sEF sef = sEF.OLrzqt;
        ReportManager reportManager = ReportManager.AEQbTJ;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("MessageListPage");
        Unit unit = Unit.INSTANCE;
        sef.EZpvd(reportManager, eventDataAEQbTJ);
        AYXKKw();
        AhwBna().AEQbTJ(fIwbmz(), EZpvd().getShowNotificationsItem(), EZpvd().isShowStartFirstChatBanner(), gEmmrt());
        AhwBna().fARcdN().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.nEK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.OLrzqt(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        AhwBna().QUSxYX().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.nEM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.OLrzqt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        AhwBna().uzCIH().observe(getViewLifecycleOwner(), new Observer() { // from class: o.nES
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ConversationListFragment.valueOf(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        AhwBna().iwGUEr().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.nEQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.AEQbTJ(this.OLrzqt, (BaseConversationListViewModel.NewChatCheckState) obj);
            }
        }));
        AhwBna().gEmmrt().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.nEO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.OLrzqt(this.OLrzqt, (BaseConversationListViewModel.AddContactCheckState) obj);
            }
        }));
        AhwBna().zsXlph().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.nEP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.EZpvd(this.OLrzqt, (BaseConversationListViewModel.SyncSuggestedListCheckState) obj);
            }
        }));
        AhwBna().RJOkX();
        AhwBna().copydefault();
        AhwBna().KWHzl();
    }

    public static final Unit OLrzqt(ConversationListFragment conversationListFragment, List list) {
        if (list != null) {
            nOM nom = conversationListFragment.isConnected;
            if (nom == null) {
                Intrinsics.gEmmrt("");
                nom = null;
            }
            nom.AhwBna.setStatus(StatefulView.Status.Content);
            conversationListFragment.AEQbTJ((List<? extends Object>) list);
            rVN.reportFullyDrawn$default((Fragment) conversationListFragment, true, (String) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ConversationListFragment conversationListFragment, Boolean bool) {
        Intrinsics.copydefault(bool);
        conversationListFragment.OLrzqt(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final void valueOf(ConversationListFragment conversationListFragment, boolean z) {
        pUU.KWHzl("ConversationListFragment", "loading:" + z);
        if (z) {
            conversationListFragment.showLoading();
        } else {
            conversationListFragment.releaseLoading();
        }
    }

    public static final Unit AEQbTJ(ConversationListFragment conversationListFragment, BaseConversationListViewModel.NewChatCheckState newChatCheckState) {
        Intrinsics.checkNotNullParameter(newChatCheckState, "");
        conversationListFragment.KWHzl(newChatCheckState);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ConversationListFragment conversationListFragment, BaseConversationListViewModel.AddContactCheckState addContactCheckState) {
        Intrinsics.checkNotNullParameter(addContactCheckState, "");
        conversationListFragment.copydefault(addContactCheckState);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ConversationListFragment conversationListFragment, BaseConversationListViewModel.SyncSuggestedListCheckState syncSuggestedListCheckState) {
        Intrinsics.checkNotNullParameter(syncSuggestedListCheckState, "");
        conversationListFragment.OLrzqt(syncSuggestedListCheckState);
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        nOM nom = this.isConnected;
        if (nom == null) {
            Intrinsics.gEmmrt("");
            nom = null;
        }
        FragmentContainerView fragmentContainerView = nom.djBIcL;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
        fragmentContainerView.setVisibility(EZpvd().isShowToolbar() ? 0 : 8);
        if (EZpvd().isShowToolbar()) {
            getChildFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.iRgjgR, nFG.Companion.copydefault(AhwBna().isConnected(), EZpvd().isShowBackButton())).commitAllowingStateLoss();
        }
    }

    public final void djBIcL() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C35718oBc.class, new String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXKWHzl2 = C33024moe.KWHzl(abstractC58185ywXKWHzl);
        final Function1 function1 = new Function1() { // from class: o.nEX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.EZpvd(this.KWHzl, (C35718oBc) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.nEV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ConversationListFragment.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.nFc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        this.djBIcL = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.nEY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ConversationListFragment.KWHzl(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(ConversationListFragment conversationListFragment, C35718oBc c35718oBc) {
        conversationListFragment.AhwBna().KWHzl(c35718oBc.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void OLrzqt(boolean z) {
        pUU.KWHzl("ConversationListFragment", "ShowEmptyState: " + z);
        Job job = this.EZpvd;
        nOM nom = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (z) {
            this.EZpvd = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ConversationListFragment$showEmptyState$1(this, null), 3, null);
            return;
        }
        nOM nom2 = this.isConnected;
        if (nom2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            nom = nom2;
        }
        LinearLayout linearLayout = nom.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
    }

    private final String fIwbmz() {
        return EZpvd().getOrigin().getValue();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.conversationlist.ConversationListFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ConversationListFragment copydefault(@NotNull ConversationListParams conversationListParams) {
            Intrinsics.checkNotNullParameter(conversationListParams, "");
            ConversationListFragment conversationListFragment = new ConversationListFragment();
            conversationListFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("route_params", conversationListParams)));
            return conversationListFragment;
        }
    }

    public final boolean AEQbTJ() {
        return AhwBna().AhwBna();
    }

    public final boolean KWHzl() {
        return AhwBna().valueOf();
    }

    public final void KWHzl(BaseConversationListViewModel.NewChatCheckState newChatCheckState) {
        int i = StateListAnimator.AEQbTJ[newChatCheckState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            copydefault(KycFlowRequest.NEW_MESSAGE);
        } else {
            ActivityResultLauncher<Intent> activityResultLauncher = this.DbNXlk;
            ActivityC37293orB.Activity activity = ActivityC37293orB.Companion;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            activityResultLauncher.launch(activity.copydefault(contextRequireContext));
        }
    }

    public final void copydefault(BaseConversationListViewModel.AddContactCheckState addContactCheckState) {
        int i = StateListAnimator.KWHzl[addContactCheckState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            copydefault(KycFlowRequest.NEW_MESSAGE);
        } else {
            ActivityResultLauncher<Intent> activityResultLauncher = this.AkhnZx;
            ActivityC37326ori.ActionBar actionBar = ActivityC37326ori.Companion;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            activityResultLauncher.launch(actionBar.EZpvd(contextRequireContext));
        }
    }

    public final void OLrzqt(BaseConversationListViewModel.SyncSuggestedListCheckState syncSuggestedListCheckState) {
        pUU.KWHzl("ConversationListFragment", "handleSyncSuggestedListState:" + syncSuggestedListCheckState);
        int i = StateListAnimator.OLrzqt[syncSuggestedListCheckState.ordinal()];
        if (i == 1) {
            copydefault(KycFlowRequest.SYNC_LOCAL_RELATION);
        } else {
            if (i != 2) {
                return;
            }
            C37242oqD.EZpvd.KWHzl(this, new Function0() { // from class: o.nEL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ConversationListFragment.isConnected(this.OLrzqt);
                }
            });
        }
    }

    public static final Unit isConnected(ConversationListFragment conversationListFragment) {
        conversationListFragment.AhwBna().copydefault(conversationListFragment.gEmmrt());
        return Unit.INSTANCE;
    }

    public final void copydefault(final KycFlowRequest kycFlowRequest) {
        rTU rtu = (rTU) C43251rlk.copydefault(rTU.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        rTU.Application.checkAndRestrictsDistributary$default(rtu, fragmentActivityRequireActivity, new Function1() { // from class: o.nET
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.KWHzl(this.OLrzqt, kycFlowRequest, ((java.lang.Boolean) obj).booleanValue());
            }
        }, Boolean.TRUE, null, new Function1() { // from class: o.nEU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.EZpvd((java.lang.String) obj);
            }
        }, new Function1() { // from class: o.nEW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConversationListFragment.AEQbTJ(this.EZpvd, kycFlowRequest, (ResultBackStatus) obj);
            }
        }, 8, null);
    }

    public static final Unit EZpvd(String str) {
        pUU.KWHzl("ConversationListFragment", "KYC flow error: " + str);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ConversationListFragment conversationListFragment, KycFlowRequest kycFlowRequest, boolean z) {
        if (!z) {
            pUU.KWHzl("ConversationListFragment", "KYC flow not restricted");
            conversationListFragment.OLrzqt(kycFlowRequest);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ConversationListFragment conversationListFragment, KycFlowRequest kycFlowRequest, ResultBackStatus resultBackStatus) {
        if (resultBackStatus == ResultBackStatus.Success) {
            pUU.KWHzl("ConversationListFragment", "KYC flow success");
            conversationListFragment.OLrzqt(kycFlowRequest);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(KycFlowRequest kycFlowRequest) {
        int i = StateListAnimator.EZpvd[kycFlowRequest.ordinal()];
        if (i == 1) {
            AhwBna().KWHzl(new Function1() { // from class: o.nFn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ConversationListFragment.OLrzqt(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            AhwBna().KWHzl(new Function1() { // from class: o.nFr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ConversationListFragment.KWHzl(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(ConversationListFragment conversationListFragment, boolean z) {
        conversationListFragment.AhwBna().AEQbTJ(CheckStartNewChatUseCase.CheckStep.Kyc);
        conversationListFragment.ejfBZ();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ConversationListFragment conversationListFragment, boolean z) {
        conversationListFragment.AhwBna().aKErDB();
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        getChildFragmentManager().setFragmentResultListener("REQUEST_KEY_START_NEW_CHAT", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.nEZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ConversationListFragment.copydefault(this.copydefault, str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("REQUEST_KEY_START_ADD_CONTACT", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.nFa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ConversationListFragment.djBIcL(this.copydefault, str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("REQUEST_IM_KEY_MENU_SELECTED", this, new FragmentResultListener() { // from class: o.nFb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ConversationListFragment.AYXKKw(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final void copydefault(ConversationListFragment conversationListFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        conversationListFragment.ejfBZ();
    }

    public static final void djBIcL(ConversationListFragment conversationListFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        conversationListFragment.fARcdN();
    }

    public static final void AYXKKw(ConversationListFragment conversationListFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        IMenuItemPerformer iMenuItemPerformer = (IMenuItemPerformer) BundleCompat.getParcelable(bundle, "RESULT_IM_KEY_MENU", IMenuItemPerformer.class);
        pUU.KWHzl("ConversationListToolbarFragment", "menu item selected:" + iMenuItemPerformer);
        if (iMenuItemPerformer instanceof HideSectionItemPerformer) {
            pUU.KWHzl("ConversationListFragment", "HideSectionItemPerformer clicked");
            conversationListFragment.AhwBna().AEQbTJ(false);
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C35399nuc.LoaderManager.sFt), 0, 1, (Object) null);
        }
    }

    public final boolean gEmmrt() {
        C37242oqD c37242oqD = C37242oqD.EZpvd;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return c37242oqD.AEQbTJ(contextRequireContext);
    }

    public final void fetchVPNInfo() {
        C33815nGw.Companion.OLrzqt(C56402yEa.EZpvd(new HideSectionItemPerformer())).show(getChildFragmentManager(), "hide_trending_groups_menu");
    }

    public final void isConnected() {
        final nGC ngc = new nGC();
        ngc.KWHzl(new Function0() { // from class: o.nER
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ConversationListFragment.copydefault(this.EZpvd, ngc);
            }
        });
        ngc.copydefault(new Function0() { // from class: o.nFe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ConversationListFragment.OLrzqt(this.AEQbTJ, ngc);
            }
        });
        ngc.show(getChildFragmentManager(), "RemoveSectionConfirmation");
    }

    public static final Unit copydefault(ConversationListFragment conversationListFragment, nGC ngc) {
        conversationListFragment.AhwBna().AEQbTJ(true);
        ngc.dismiss();
        C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C35399nuc.LoaderManager.QYvkLl), 0, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ConversationListFragment conversationListFragment, nGC ngc) {
        conversationListFragment.AhwBna().AEQbTJ(false);
        ngc.dismiss();
        C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C35399nuc.LoaderManager.sFt), 0, 1, (Object) null);
        return Unit.INSTANCE;
    }

    private final void ejfBZ() {
        AhwBna().UeEOUB();
    }

    private final void fARcdN() {
        AhwBna().djSkpj();
    }

    public final void AkhnZx() {
        ActivityC37536ovg.StateListAnimator stateListAnimator = ActivityC37536ovg.Companion;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        startActivity(stateListAnimator.AEQbTJ(contextRequireContext, null));
    }

    @Override // o.AbstractC32996moC, o.C60121zwJ.Activity
    public void onPermissionsGranted(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.onPermissionsGranted(i, list);
        pUU.KWHzl("ConversationListFragment", "onPermissionGranted, requestCode: " + i + ", perms:" + list);
        if (i == 101) {
            AhwBna().copydefault(gEmmrt());
        }
    }

    @Override // o.AbstractC32996moC, o.C60121zwJ.Activity
    public void onPermissionsDenied(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.onPermissionsDenied(i, list);
        C37242oqD c37242oqD = C37242oqD.EZpvd;
        if (c37242oqD.AEQbTJ(this)) {
            c37242oqD.KWHzl(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.djBIcL = null;
        Job job = this.EZpvd;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.EZpvd = null;
    }
}
