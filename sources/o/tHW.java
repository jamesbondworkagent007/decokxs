package o;

import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.planet.biz_setting.PlanetProfileSettingViewModel$refresh$1;
import com.okinc.planet.biz_setting.PlanetProfileSettingViewModel$refresh$2;
import com.okinc.planet.biz_setting.PlanetProfileSettingViewModel$refresh$3;
import com.okinc.planet.biz_setting.data.OrbitSettingUpgradeCardType;
import com.okinc.planet.biz_userprofile.data.PlanetAvatarInfo;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet_api.model.PlanetProfileSettingsActions;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC46197tLk;
import o.InterfaceC46130tIy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tHW extends tLY<ActionBar> {
    public final tIA AEQbTJ;
    public PlanetProfileSettingsActions EZpvd;
    public final StateFlow<AbstractC46197tLk<C46126tIu>> KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final MutableStateFlow<AbstractC46197tLk<C46126tIu>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetProfileSettingsActions KWHzl() {
        PlanetProfileSettingsActions planetProfileSettingsActions = this.EZpvd;
        this.EZpvd = null;
        return planetProfileSettingsActions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC46197tLk<C46126tIu>> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r1v0 androidx.lifecycle.SavedStateHandle)
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:28)) : (r2v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:o.tIA:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tIA:0x000e: INVOKE (wrap:o.tPF:0x000c: SGET  A[WRAPPED] (LINE:29) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.apNbdB():o.tIA A[MD:():o.tIA (m), WRAPPED] (LINE:29)) : (r3v0 o.tIA))
 A[MD:(androidx.lifecycle.SavedStateHandle, kotlinx.coroutines.CoroutineDispatcher, o.tIA):void (m)] (LINE:26) call: o.tHW.<init>(androidx.lifecycle.SavedStateHandle, kotlinx.coroutines.CoroutineDispatcher, o.tIA):void type: THIS */
    public /* synthetic */ tHW(SavedStateHandle savedStateHandle, CoroutineDispatcher coroutineDispatcher, tIA tia, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateHandle, (i & 2) != 0 ? Dispatchers.getDefault() : coroutineDispatcher, (i & 4) != 0 ? tPF.copydefault.apNbdB() : tia);
    }

    public tHW(@NotNull SavedStateHandle savedStateHandle, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull tIA tia) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(tia, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = tia;
        this.EZpvd = (PlanetProfileSettingsActions) savedStateHandle.get("community_user_center_user_setting_action");
        MutableStateFlow<AbstractC46197tLk<C46126tIu>> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC46197tLk.Companion.OLrzqt(true));
        this.copydefault = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final void EZpvd() {
        this.copydefault.setValue(AbstractC46197tLk.TaskDescription.loading$default(AbstractC46197tLk.Companion, false, 1, null));
        FlowKt.launchIn(FlowKt.onEach(FlowKt.m7441catch(FlowKt.flow(new PlanetProfileSettingViewModel$refresh$1(this, null)), new PlanetProfileSettingViewModel$refresh$2(this, null)), new PlanetProfileSettingViewModel$refresh$3(this, null)), CoroutineScopeKt.plus(ViewModelKt.getViewModelScope(this), this.OLrzqt));
    }

    public final void KWHzl(Function1<? super C46126tIu, Unit> function1) {
        C46126tIu c46126tIuOLrzqt = this.copydefault.getValue().OLrzqt();
        if (c46126tIuOLrzqt != null) {
            function1.invoke(c46126tIuOLrzqt);
        }
    }

    public final void KWHzl(@NotNull final TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        if (taskDescription instanceof TaskDescription.Application) {
            EZpvd();
            return;
        }
        if (taskDescription instanceof TaskDescription.C0958TaskDescription) {
            TaskDescription.C0958TaskDescription c0958TaskDescription = (TaskDescription.C0958TaskDescription) taskDescription;
            InterfaceC46130tIy interfaceC46130tIyOLrzqt = c0958TaskDescription.OLrzqt();
            if (interfaceC46130tIyOLrzqt instanceof InterfaceC46130tIy.Fragment) {
                OLrzqt();
                return;
            }
            if (Intrinsics.EZpvd(interfaceC46130tIyOLrzqt, InterfaceC46130tIy.Dialog.copydefault) || (interfaceC46130tIyOLrzqt instanceof InterfaceC46130tIy.TaskDescription) || (interfaceC46130tIyOLrzqt instanceof InterfaceC46130tIy.LoaderManager)) {
                return;
            }
            if (interfaceC46130tIyOLrzqt instanceof InterfaceC46130tIy.Activity) {
                EZpvd(ActionBar.Activity.copydefault);
                return;
            }
            if (interfaceC46130tIyOLrzqt instanceof InterfaceC46130tIy.FragmentManager) {
                EZpvd(new ActionBar.FragmentManager(((InterfaceC46130tIy.FragmentManager) c0958TaskDescription.OLrzqt()).djBIcL()));
                return;
            } else if (interfaceC46130tIyOLrzqt instanceof InterfaceC46130tIy.PendingIntent) {
                EZpvd(new ActionBar.LoaderManager(((InterfaceC46130tIy.PendingIntent) c0958TaskDescription.OLrzqt()).gEmmrt()));
                return;
            } else {
                if (!Intrinsics.EZpvd(interfaceC46130tIyOLrzqt, InterfaceC46130tIy.ActionBar.OLrzqt) && !Intrinsics.EZpvd(interfaceC46130tIyOLrzqt, InterfaceC46130tIy.StateListAnimator.AEQbTJ)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (taskDescription instanceof TaskDescription.StateListAnimator) {
            PlanetProfileSettingsActions planetProfileSettingsActionsEZpvd = ((TaskDescription.StateListAnimator) taskDescription).EZpvd();
            if (planetProfileSettingsActionsEZpvd instanceof PlanetProfileSettingsActions.ChangeNickname) {
                EZpvd(ActionBar.Activity.copydefault);
                return;
            } else if (planetProfileSettingsActionsEZpvd instanceof PlanetProfileSettingsActions.ChangeBio) {
                EZpvd(ActionBar.Activity.copydefault);
                return;
            } else {
                if (planetProfileSettingsActionsEZpvd instanceof PlanetProfileSettingsActions.ChangeProfilePrivacyMode) {
                    KWHzl(new Function1() { // from class: o.tHX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return tHW.OLrzqt(this.EZpvd, (C46126tIu) obj);
                        }
                    });
                    return;
                }
                return;
            }
        }
        if (!(taskDescription instanceof TaskDescription.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        KWHzl(new Function1() { // from class: o.tHY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tHW.copydefault(taskDescription, this, (C46126tIu) obj);
            }
        });
    }

    public static final Unit OLrzqt(tHW thw, C46126tIu c46126tIu) {
        Intrinsics.checkNotNullParameter(c46126tIu, "");
        thw.EZpvd(new ActionBar.Application(c46126tIu.AEQbTJ().hDKMBd()));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final TaskDescription taskDescription, tHW thw, C46126tIu c46126tIu) {
        Intrinsics.checkNotNullParameter(c46126tIu, "");
        PlanetBasicUserInfoResp planetBasicUserInfoRespAEQbTJ = c46126tIu.AEQbTJ();
        final PlanetBasicUserInfoResp planetBasicUserInfoRespAEQbTJ2 = planetBasicUserInfoRespAEQbTJ.AEQbTJ(((-3145733) & 1) != 0 ? planetBasicUserInfoRespAEQbTJ.authorId : null, ((-3145733) & 2) != 0 ? planetBasicUserInfoRespAEQbTJ.bio : null, ((-3145733) & 4) != 0 ? planetBasicUserInfoRespAEQbTJ.followerCount : null, ((-3145733) & 8) != 0 ? planetBasicUserInfoRespAEQbTJ.followeeCount : null, ((-3145733) & 16) != 0 ? planetBasicUserInfoRespAEQbTJ.twitterFollowerCount : null, ((-3145733) & 32) != 0 ? planetBasicUserInfoRespAEQbTJ.twitterFolloweeCount : null, ((-3145733) & 64) != 0 ? planetBasicUserInfoRespAEQbTJ.badgeList : null, ((-3145733) & 128) != 0 ? planetBasicUserInfoRespAEQbTJ.sourceUrl : null, ((-3145733) & 256) != 0 ? planetBasicUserInfoRespAEQbTJ.officialStatus : null, ((-3145733) & 512) != 0 ? planetBasicUserInfoRespAEQbTJ.userType : null, ((-3145733) & 1024) != 0 ? planetBasicUserInfoRespAEQbTJ.uid : null, ((-3145733) & 2048) != 0 ? planetBasicUserInfoRespAEQbTJ.countryId : null, ((-3145733) & 4096) != 0 ? planetBasicUserInfoRespAEQbTJ.nickName : null, ((-3145733) & 8192) != 0 ? planetBasicUserInfoRespAEQbTJ.enNickName : null, ((-3145733) & 16384) != 0 ? planetBasicUserInfoRespAEQbTJ.portrait : ((TaskDescription.ActionBar) taskDescription).AEQbTJ(), ((-3145733) & 32768) != 0 ? planetBasicUserInfoRespAEQbTJ.originalPortrait : null, ((-3145733) & 65536) != 0 ? planetBasicUserInfoRespAEQbTJ.roleType : null, ((-3145733) & 131072) != 0 ? planetBasicUserInfoRespAEQbTJ.targetId : null, ((-3145733) & 262144) != 0 ? planetBasicUserInfoRespAEQbTJ.uniqueName : null, ((-3145733) & 524288) != 0 ? planetBasicUserInfoRespAEQbTJ.publicStatus : null, ((-3145733) & 1048576) != 0 ? planetBasicUserInfoRespAEQbTJ.followStatus : false, ((-3145733) & 2097152) != 0 ? planetBasicUserInfoRespAEQbTJ.followStatusV2 : null, ((-3145733) & 4194304) != 0 ? planetBasicUserInfoRespAEQbTJ.strategyRoleType : null, ((-3145733) & 8388608) != 0 ? planetBasicUserInfoRespAEQbTJ.signalRoleType : null, ((-3145733) & 16777216) != 0 ? planetBasicUserInfoRespAEQbTJ.spotTradingRoleType : null, ((-3145733) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? planetBasicUserInfoRespAEQbTJ.translatedBio : null, ((-3145733) & 67108864) != 0 ? planetBasicUserInfoRespAEQbTJ.tier : null, ((-3145733) & 134217728) != 0 ? planetBasicUserInfoRespAEQbTJ.countryName : null, ((-3145733) & 268435456) != 0 ? planetBasicUserInfoRespAEQbTJ.showCountryTag : false, ((-3145733) & 536870912) != 0 ? planetBasicUserInfoRespAEQbTJ.countryInfo : null, ((-3145733) & 1073741824) != 0 ? planetBasicUserInfoRespAEQbTJ.groupInfoList : null, ((-3145733) & Integer.MIN_VALUE) != 0 ? planetBasicUserInfoRespAEQbTJ.competitionUrl : null, (FrameMetricsAggregator.EVERY_DURATION & 1) != 0 ? planetBasicUserInfoRespAEQbTJ.orbitLevel : 0, (FrameMetricsAggregator.EVERY_DURATION & 2) != 0 ? planetBasicUserInfoRespAEQbTJ.orbiterPlusStatus : 0, (FrameMetricsAggregator.EVERY_DURATION & 4) != 0 ? planetBasicUserInfoRespAEQbTJ.twitterHandleName : null, (FrameMetricsAggregator.EVERY_DURATION & 8) != 0 ? planetBasicUserInfoRespAEQbTJ.curveStatTime : null, (FrameMetricsAggregator.EVERY_DURATION & 16) != 0 ? planetBasicUserInfoRespAEQbTJ.liveStatus : null, (FrameMetricsAggregator.EVERY_DURATION & 32) != 0 ? planetBasicUserInfoRespAEQbTJ.liveStreamTab : null, (FrameMetricsAggregator.EVERY_DURATION & 64) != 0 ? planetBasicUserInfoRespAEQbTJ.shareCode : null, (FrameMetricsAggregator.EVERY_DURATION & 128) != 0 ? planetBasicUserInfoRespAEQbTJ.metricCurve : null, (FrameMetricsAggregator.EVERY_DURATION & 256) != 0 ? planetBasicUserInfoRespAEQbTJ.copyTradingData : null);
        tRN.AEQbTJ(thw.copydefault, new Function1() { // from class: o.tHV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tHW.EZpvd(planetBasicUserInfoRespAEQbTJ2, taskDescription, (C46126tIu) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final C46126tIu EZpvd(PlanetBasicUserInfoResp planetBasicUserInfoResp, TaskDescription taskDescription, C46126tIu c46126tIu) {
        Intrinsics.checkNotNullParameter(c46126tIu, "");
        java.util.List<InterfaceC46130tIy> listOLrzqt = c46126tIu.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (InterfaceC46125tIt interfaceC46125tItCopy$default : listOLrzqt) {
            if (interfaceC46125tItCopy$default instanceof InterfaceC46130tIy.Activity) {
                InterfaceC46130tIy.Activity activity = (InterfaceC46130tIy.Activity) interfaceC46125tItCopy$default;
                interfaceC46125tItCopy$default = InterfaceC46130tIy.Activity.copy$default(activity, PlanetAvatarInfo.copy$default(activity.valueOf(), ((TaskDescription.ActionBar) taskDescription).AEQbTJ(), null, null, null, 14, null), null, 2, null);
            }
            arrayList.add(interfaceC46125tItCopy$default);
        }
        return C46126tIu.copy$default(c46126tIu, planetBasicUserInfoResp, null, arrayList, 2, null);
    }

    public final void OLrzqt() {
        KWHzl(new Function1() { // from class: o.tHU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tHW.copydefault(this.OLrzqt, (C46126tIu) obj);
            }
        });
    }

    public static final Unit copydefault(tHW thw, C46126tIu c46126tIu) {
        Intrinsics.checkNotNullParameter(c46126tIu, "");
        thw.EZpvd(new ActionBar.Application(c46126tIu.AEQbTJ().hDKMBd()));
        return Unit.INSTANCE;
    }

    public interface TaskDescription {

        public static final class Application implements TaskDescription {
            public static final Application copydefault = new Application();

            private Application() {
            }
        }

        public static final class StateListAnimator implements TaskDescription {
            public final PlanetProfileSettingsActions OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, PlanetProfileSettingsActions planetProfileSettingsActions, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    planetProfileSettingsActions = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.OLrzqt(planetProfileSettingsActions);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PlanetProfileSettingsActions EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(PlanetProfileSettingsActions planetProfileSettingsActions) {
                return new StateListAnimator(planetProfileSettingsActions);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.OLrzqt, ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                PlanetProfileSettingsActions planetProfileSettingsActions = this.OLrzqt;
                if (planetProfileSettingsActions == null) {
                    return 0;
                }
                return planetProfileSettingsActions.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnSettingsActionReceived(planetProfileSettingsActions=" + this.OLrzqt + ")";
            }

            public StateListAnimator(PlanetProfileSettingsActions planetProfileSettingsActions) {
                this.OLrzqt = planetProfileSettingsActions;
            }
        }

        /* JADX INFO: renamed from: o.tHW$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0958TaskDescription implements TaskDescription {
            public final InterfaceC46130tIy OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0958TaskDescription copy$default(C0958TaskDescription c0958TaskDescription, InterfaceC46130tIy interfaceC46130tIy, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    interfaceC46130tIy = c0958TaskDescription.OLrzqt;
                }
                return c0958TaskDescription.KWHzl(interfaceC46130tIy);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0958TaskDescription KWHzl(@NotNull InterfaceC46130tIy interfaceC46130tIy) {
                Intrinsics.checkNotNullParameter(interfaceC46130tIy, "");
                return new C0958TaskDescription(interfaceC46130tIy);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InterfaceC46130tIy OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0958TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((C0958TaskDescription) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnItemClick(setting=" + this.OLrzqt + ")";
            }

            public C0958TaskDescription(@NotNull InterfaceC46130tIy interfaceC46130tIy) {
                Intrinsics.checkNotNullParameter(interfaceC46130tIy, "");
                this.OLrzqt = interfaceC46130tIy;
            }
        }

        public static final class ActionBar implements TaskDescription {
            public final java.lang.String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.AEQbTJ;
                }
                return actionBar.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ActionBar(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((ActionBar) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "UpdateAvatarUrl(url=" + this.AEQbTJ + ")";
            }

            public ActionBar(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }
    }

    public interface ActionBar {

        public static final class StateListAnimator implements ActionBar {
            public final java.lang.String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ErrorToast(message=" + this.OLrzqt + ")";
            }

            public StateListAnimator(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class TaskDescription implements ActionBar {
            public static final TaskDescription EZpvd = new TaskDescription();

            private TaskDescription() {
            }
        }

        public static final class Application implements ActionBar {
            public final java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = application.EZpvd;
                }
                return application.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "NavigateToPrivacyMode(profileMode=" + this.EZpvd + ")";
            }

            public Application(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }

        /* JADX INFO: renamed from: o.tHW$ActionBar$ActionBar, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class C0957ActionBar implements ActionBar {
            public static final C0957ActionBar OLrzqt = new C0957ActionBar();

            private C0957ActionBar() {
            }
        }

        public static final class Activity implements ActionBar {
            public static final Activity copydefault = new Activity();

            private Activity() {
            }
        }

        public static final class FragmentManager implements ActionBar {
            public final boolean EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = fragmentManager.EZpvd;
                }
                return fragmentManager.EZpvd(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FragmentManager EZpvd(boolean z) {
                return new FragmentManager(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FragmentManager) && this.EZpvd == ((FragmentManager) obj).EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "NavigateToXAccount(isLinked=" + this.EZpvd + ")";
            }

            public FragmentManager(boolean z) {
                this.EZpvd = z;
            }
        }

        public static final class LoaderManager implements ActionBar {
            public final OrbitSettingUpgradeCardType AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, OrbitSettingUpgradeCardType orbitSettingUpgradeCardType, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    orbitSettingUpgradeCardType = loaderManager.AEQbTJ;
                }
                return loaderManager.AEQbTJ(orbitSettingUpgradeCardType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoaderManager AEQbTJ(@NotNull OrbitSettingUpgradeCardType orbitSettingUpgradeCardType) {
                Intrinsics.checkNotNullParameter(orbitSettingUpgradeCardType, "");
                return new LoaderManager(orbitSettingUpgradeCardType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OrbitSettingUpgradeCardType EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoaderManager) && this.AEQbTJ == ((LoaderManager) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "NavigateToUpgradeCard(cardType=" + this.AEQbTJ + ")";
            }

            public LoaderManager(@NotNull OrbitSettingUpgradeCardType orbitSettingUpgradeCardType) {
                Intrinsics.checkNotNullParameter(orbitSettingUpgradeCardType, "");
                this.AEQbTJ = orbitSettingUpgradeCardType;
            }
        }
    }
}
