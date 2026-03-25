package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.viewmodel;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryBean;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterSettingsBottomsheetFragment;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationReadStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C32979mnm;
import o.C33129mqd;
import o.C42584rYg;
import o.C42601rYx;
import o.C42607rZc;
import o.C44617saM;
import o.C44639sai;
import o.C44646sap;
import o.C56402yEa;
import o.C56403yEb;
import o.C58113yvE;
import o.InterfaceC33171mrS;
import o.InterfaceC47230tmC;
import o.pTA;
import o.pUU;
import o.rXL;
import o.rXP;
import o.rXQ;
import o.rXY;
import o.rYN;
import o.rYU;
import o.rYW;
import o.rYZ;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCenterViewModel extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final MutableStateFlow<TaskDescription> AEQbTJ;
    public final MutableSharedFlow<NotificationSettingChannel> AYXKKw;
    public final Context AhwBna;
    public final rYU AkhnZx;
    public final StateFlow<C42584rYg<SystemNotification>> AuCTel;
    public final rXP AuCTelauCTel;
    public final rYW DbNXlk;
    public final MutableStateFlow<Boolean> EZpvd;
    public final MutableStateFlow<List<C44646sap>> KWHzl;
    public final MutableStateFlow<String> OLrzqt;
    public final MutableStateFlow<C42584rYg<SystemNotification>> djBIcL;
    public final C42601rYx ejfBZ;
    public final rXY fARcdN;
    public final C42607rZc fIwbmz;
    public final C44639sai fJNWhG;
    public final StateFlow<String> fetchVPNInfo;
    public final StateFlow<List<C44646sap>> gEmmrt;
    public final rYZ getFieldNames;
    public final SavedStateHandle getNewProxyInstance;
    public final StateFlow<List<NotificationCenterSettingsBottomsheetFragment.SettingsOption>> hDKMBd;
    public final StateFlow<TaskDescription> isConnected;
    public final InterfaceC33171mrS iwGUEr;
    public final SharedFlow<NotificationSettingChannel> uzCIH;
    public final MutableStateFlow<Integer> valueOf;
    public final rYN values;
    public final rXQ zLjUOn;
    public final StateFlow<Integer> zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<NotificationSettingChannel> AYXKKw() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<NotificationCenterSettingsBottomsheetFragment.SettingsOption>> AhwBna() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> EZpvd() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C44646sap>> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> copydefault() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> isConnected() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C42584rYg<SystemNotification>> valueOf() {
        return this.AuCTel;
    }

    @yCM
    public NotificationCenterViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C42601rYx c42601rYx, @NotNull InterfaceC33171mrS interfaceC33171mrS, @NotNull rXQ rxq, @NotNull rXY rxy, @NotNull C44639sai c44639sai, @NotNull rYZ ryz, @NotNull C42607rZc c42607rZc, @NotNull rYW ryw, @NotNull rYU ryu, @NotNull rYN ryn, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c42601rYx, "");
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        Intrinsics.checkNotNullParameter(rxq, "");
        Intrinsics.checkNotNullParameter(rxy, "");
        Intrinsics.checkNotNullParameter(c44639sai, "");
        Intrinsics.checkNotNullParameter(ryz, "");
        Intrinsics.checkNotNullParameter(c42607rZc, "");
        Intrinsics.checkNotNullParameter(ryw, "");
        Intrinsics.checkNotNullParameter(ryu, "");
        Intrinsics.checkNotNullParameter(ryn, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.getNewProxyInstance = savedStateHandle;
        this.ejfBZ = c42601rYx;
        this.iwGUEr = interfaceC33171mrS;
        this.zLjUOn = rxq;
        this.fARcdN = rxy;
        this.fJNWhG = c44639sai;
        this.getFieldNames = ryz;
        this.fIwbmz = c42607rZc;
        this.DbNXlk = ryw;
        this.AkhnZx = ryu;
        this.values = ryn;
        this.AhwBna = context;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(gEmmrt()));
        this.EZpvd = MutableStateFlow;
        MutableStateFlow<C42584rYg<SystemNotification>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C42584rYg(false, null, false, false, false, false, 63, null));
        this.djBIcL = MutableStateFlow2;
        this.AuCTel = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<C44646sap>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.KWHzl = MutableStateFlow3;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow4;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Integer> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.valueOf = MutableStateFlow5;
        this.zsXlph = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<TaskDescription> MutableStateFlow6 = StateFlowKt.MutableStateFlow(new TaskDescription(false, false, false, 7, null));
        this.AEQbTJ = MutableStateFlow6;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow6);
        this.hDKMBd = FlowKt.stateIn(FlowKt.combine(MutableStateFlow, MutableStateFlow2, new NotificationCenterViewModel$notificationsSettingsList$1(null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getLazily(), yDY.AhwBna());
        this.AuCTelauCTel = new Application();
        MutableSharedFlow<NotificationSettingChannel> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default;
        this.uzCIH = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.viewmodel.NotificationCenterViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final class TaskDescription {
        public final boolean AEQbTJ;
        public final boolean KWHzl;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(false, false, false, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                z2 = taskDescription.copydefault;
            }
            if ((i & 4) != 0) {
                z3 = taskDescription.AEQbTJ;
            }
            return taskDescription.AEQbTJ(z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(boolean z, boolean z2, boolean z3) {
            return new TaskDescription(z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.KWHzl == taskDescription.KWHzl && this.copydefault == taskDescription.copydefault && this.AEQbTJ == taskDescription.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Boolean.hashCode(this.KWHzl) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LoadingState(isCategoriesLoading=" + this.KWHzl + ", isNotificationsLoading=" + this.copydefault + ", isRefreshing=" + this.AEQbTJ + ")";
        }

        public TaskDescription(boolean z, boolean z2, boolean z3) {
            this.KWHzl = z;
            this.copydefault = z2;
            this.AEQbTJ = z3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(boolean, boolean, boolean):void (m)] (LINE:89) call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.viewmodel.NotificationCenterViewModel.TaskDescription.<init>(boolean, boolean, boolean):void type: THIS */
        public /* synthetic */ TaskDescription(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
        }
    }

    public final boolean gEmmrt() {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB().values() && !this.iwGUEr.fIwbmz();
    }

    public final String KWHzl() {
        return (String) this.getNewProxyInstance.get("ARG_SELECTED_CATEGORY");
    }

    public final boolean fetchVPNInfo() {
        return Intrinsics.EZpvd(this.getNewProxyInstance.get("ARG_NOTIFICATION_CHANNEL_ID"), (Object) "EXTRA_KEY_FROM_COPY_TRADING");
    }

    public final String djBIcL() {
        String str = (String) this.getNewProxyInstance.get("ARG_MARK_READ_CATEGORY");
        return str == null ? "" : str;
    }

    public static final class Application implements rXP {
        public Application() {
        }
    }

    public final void AuCTel() {
        fARcdN();
        ejfBZ();
        AubY();
    }

    private final void AubY() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationCenterViewModel$observeUnreadCount$1(this, null), 3, null);
    }

    public final void ejfBZ() {
        this.getFieldNames.copydefault(this.AuCTelauCTel);
    }

    public final void fARcdN() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationCenterViewModel$observeForceUpdate$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        MutableStateFlow<C42584rYg<SystemNotification>> mutableStateFlow = this.djBIcL;
        C42584rYg<SystemNotification> value = mutableStateFlow.getValue();
        List<SystemNotification> listOLrzqt = this.djBIcL.getValue().OLrzqt();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (SystemNotification systemNotification : listOLrzqt) {
            arrayList.add(systemNotification.copy((16383 & 1) != 0 ? systemNotification.id : null, (16383 & 2) != 0 ? systemNotification.title : null, (16383 & 4) != 0 ? systemNotification.content : null, (16383 & 8) != 0 ? systemNotification.url : null, (16383 & 16) != 0 ? systemNotification.lightIconLink : null, (16383 & 32) != 0 ? systemNotification.darkIconLink : null, (16383 & 64) != 0 ? systemNotification.type : null, (16383 & 128) != 0 ? systemNotification.pushTime : null, (16383 & 256) != 0 ? systemNotification.data : null, (16383 & 512) != 0 ? systemNotification.bizType : null, (16383 & 1024) != 0 ? systemNotification.linkType : null, (16383 & 2048) != 0 ? systemNotification.messageName : null, (16383 & 4096) != 0 ? systemNotification.template : null, (16383 & 8192) != 0 ? systemNotification.businessIdentity : null, (16383 & 16384) != 0 ? systemNotification.readStatus : Integer.valueOf(NotificationReadStatus.READ.getValue())));
        }
        mutableStateFlow.setValue(C42584rYg.copy$default(value, false, arrayList, false, false, false, false, 61, null));
    }

    public final void copydefault(rXL rxl) {
        if (this.KWHzl.getValue().isEmpty() || Intrinsics.EZpvd(this.djBIcL.getValue(), new C42584rYg(false, null, false, false, false, false, 63, null)) || this.djBIcL.getValue().copydefault()) {
            fJNWhG();
            MutableStateFlow<C42584rYg<SystemNotification>> mutableStateFlow = this.djBIcL;
            mutableStateFlow.setValue(C42584rYg.copy$default(mutableStateFlow.getValue(), true, null, false, false, false, false, 62, null));
            if (rxl != null) {
                KWHzl(rxl);
            } else {
                DbNXlk();
            }
        }
    }

    public final void KWHzl(rXL rxl) {
        String strAEQbTJ = rxl.AEQbTJ();
        NotificationCategoryBean notificationCategoryBean = new NotificationCategoryBean(strAEQbTJ, rxl.copydefault(), null, 4, null);
        String id = notificationCategoryBean.getId();
        if (id == null) {
            id = "";
        }
        EZpvd(id, C56402yEa.EZpvd(new C44646sap(notificationCategoryBean, true)));
        KWHzl(strAEQbTJ);
    }

    public final void DbNXlk() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationCenterViewModel$loadRemoteCategoryList$1(this, null), 3, null);
    }

    public final void EZpvd(String str, List<C44646sap> list) {
        this.KWHzl.setValue(list);
        KWHzl(str);
        C44646sap c44646sap = (C44646sap) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (c44646sap != null) {
            this.getNewProxyInstance.set("ARG_MARK_READ_CATEGORY", c44646sap.KWHzl().getId());
        }
    }

    public final void getFieldNames() {
        MutableStateFlow<TaskDescription> mutableStateFlow = this.AEQbTJ;
        mutableStateFlow.setValue(TaskDescription.copy$default(mutableStateFlow.getValue(), false, false, false, 6, null));
    }

    public final void hDKMBd() {
        MutableStateFlow<TaskDescription> mutableStateFlow = this.AEQbTJ;
        mutableStateFlow.setValue(TaskDescription.copy$default(mutableStateFlow.getValue(), false, true, false, 5, null));
    }

    public final void getNewProxyInstance() {
        MutableStateFlow<TaskDescription> mutableStateFlow = this.AEQbTJ;
        mutableStateFlow.setValue(TaskDescription.copy$default(mutableStateFlow.getValue(), false, false, false, 5, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zsXlph() {
        MutableStateFlow<TaskDescription> mutableStateFlow = this.AEQbTJ;
        mutableStateFlow.setValue(TaskDescription.copy$default(mutableStateFlow.getValue(), false, false, true, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zLjUOn() {
        MutableStateFlow<TaskDescription> mutableStateFlow = this.AEQbTJ;
        mutableStateFlow.setValue(TaskDescription.copy$default(mutableStateFlow.getValue(), false, false, false, 3, null));
    }

    public final void fJNWhG() {
        this.AEQbTJ.setValue(new TaskDescription(true, true, false, 4, null));
    }

    public final void iwGUEr() {
        this.AEQbTJ.setValue(new TaskDescription(false, false, false, 7, null));
    }

    public final void fIwbmz() {
        zsXlph();
        loadNotificationList$default(this, null, false, true, 3, null);
    }

    public static /* synthetic */ void loadNotificationList$default(NotificationCenterViewModel notificationCenterViewModel, Long l, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        notificationCenterViewModel.EZpvd(l, z, z2);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlinx.coroutines.Job] */
    public final void EZpvd(Long l, boolean z, boolean z2) {
        pUU.KWHzl("NotificationCenterViewModel", "loadNotificationList => maxPushTimeStamp:" + l + ", isLoadMore:" + z);
        MutableStateFlow<C42584rYg<SystemNotification>> mutableStateFlow = this.djBIcL;
        mutableStateFlow.setValue(C42584rYg.copy$default(mutableStateFlow.getValue(), true, null, false, false, false, false, 62, null));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (!z2 && !z) {
            objectRef.element = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationCenterViewModel$loadNotificationList$1(this, null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationCenterViewModel$loadNotificationList$2(this, l, z, objectRef, z2, null), 3, null);
    }

    public final void uzCIH() {
        String strKWHzl = KWHzl();
        if (strKWHzl != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationCenterViewModel$viewedAllNotifications$1$1(this, strKWHzl, null), 3, null);
        }
    }

    public final boolean values() {
        if (!this.djBIcL.getValue().EZpvd() || this.djBIcL.getValue().OLrzqt().size() < 20) {
            return false;
        }
        loadNotificationList$default(this, Long.valueOf(C33129mqd.valueOf(((SystemNotification) CollectionsKt___CollectionsKt.AubY(this.djBIcL.getValue().OLrzqt())).getPushTime())), true, false, 4, null);
        return true;
    }

    public final void KWHzl(String str) {
        if (Intrinsics.EZpvd((Object) KWHzl(), (Object) str)) {
            return;
        }
        this.getNewProxyInstance.set("ARG_SELECTED_CATEGORY", str);
        MutableStateFlow<List<C44646sap>> mutableStateFlow = this.KWHzl;
        List<C44646sap> value = mutableStateFlow.getValue();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(value, 10));
        for (C44646sap c44646sap : value) {
            arrayList.add(C44646sap.copy$default(c44646sap, null, Intrinsics.EZpvd((Object) c44646sap.KWHzl().getId(), (Object) str), 1, null));
        }
        mutableStateFlow.setValue(arrayList);
        loadNotificationList$default(this, null, false, false, 7, null);
        this.fJNWhG.AEQbTJ(str);
    }

    public final void KWHzl(@NotNull SystemNotification systemNotification) {
        Intrinsics.checkNotNullParameter(systemNotification, "");
        Integer readStatus = systemNotification.getReadStatus();
        int value = NotificationReadStatus.READ.getValue();
        if (readStatus == null || readStatus.intValue() != value) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationCenterViewModel$markNotificationAsRead$1(this, systemNotification, null), 3, null);
        }
        rXY rxy = this.fARcdN;
        String template = systemNotification.getTemplate();
        rxy.KWHzl(template != null ? template : "");
    }

    public final List<Object> KWHzl(@NotNull List<SystemNotification> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        String str = null;
        for (SystemNotification systemNotification : list) {
            long jValueOf = C33129mqd.valueOf(systemNotification.getPushTime());
            String strEZpvd = DateUtils.isToday(jValueOf) ? C44617saM.Companion.copydefault().EZpvd() : pTA.formatDate$default(new Date(jValueOf), OKDateEnum.DATE_FORMAT_STANDARD, null, null, 6, null);
            if (!Intrinsics.EZpvd((Object) str, (Object) strEZpvd)) {
                C44617saM.StateListAnimator stateListAnimator = C44617saM.Companion;
                arrayList.add(Intrinsics.EZpvd((Object) strEZpvd, (Object) stateListAnimator.copydefault().EZpvd()) ? stateListAnimator.copydefault() : new C44617saM(strEZpvd));
                str = strEZpvd;
            }
            arrayList.add(systemNotification);
        }
        return arrayList;
    }

    public final void AkhnZx() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationCenterViewModel$loadSettingsList$1(this, null), 3, null);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.getFieldNames.KWHzl(this.AuCTelauCTel);
    }
}
