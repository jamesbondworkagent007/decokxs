package com.okinc.im.imui.group.qrcode.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.CreateGroupInviteRequest;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import com.okinc.okimcore.model.remote.GroupServiceType;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC44393sOd;
import o.AbstractC44398sOi;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.oDH;
import o.oDI;
import o.oDK;
import o.oDM;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupQrViewModel extends AbstractC33073mpa {
    public final oDK AEQbTJ;
    public final oDM EZpvd;
    public final MutableStateFlow<TaskDescription> KWHzl;
    public final oDI OLrzqt;
    public final oDH copydefault;
    public final StateFlow<TaskDescription> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> AEQbTJ() {
        return this.gEmmrt;
    }

    @yCM
    public GroupQrViewModel(@NotNull oDI odi, @NotNull oDH odh, @NotNull oDM odm, @NotNull oDK odk) {
        Intrinsics.checkNotNullParameter(odi, "");
        Intrinsics.checkNotNullParameter(odh, "");
        Intrinsics.checkNotNullParameter(odm, "");
        Intrinsics.checkNotNullParameter(odk, "");
        this.OLrzqt = odi;
        this.copydefault = odh;
        this.EZpvd = odm;
        this.AEQbTJ = odk;
        MutableStateFlow<TaskDescription> MutableStateFlow = StateFlowKt.MutableStateFlow(TaskDescription.Activity.KWHzl);
        this.KWHzl = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.qrcode.viewmodel.GroupQrViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Activity extends TaskDescription {
            public static final Activity KWHzl = new Activity();

            private Activity() {
                super(null);
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.qrcode.viewmodel.GroupQrViewModel$TaskDescription$TaskDescription, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class C0451TaskDescription extends TaskDescription {
            public static final int EZpvd = GroupInfo.$stable | OfficialTagInfo.$stable;
            public final String AEQbTJ;
            public final String KWHzl;
            public final OfficialTagInfo OLrzqt;
            public final GroupInfo copydefault;
            public final boolean djBIcL;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0451TaskDescription copy$default(C0451TaskDescription c0451TaskDescription, String str, String str2, OfficialTagInfo officialTagInfo, boolean z, GroupInfo groupInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0451TaskDescription.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    str2 = c0451TaskDescription.KWHzl;
                }
                String str3 = str2;
                if ((i & 4) != 0) {
                    officialTagInfo = c0451TaskDescription.OLrzqt;
                }
                OfficialTagInfo officialTagInfo2 = officialTagInfo;
                if ((i & 8) != 0) {
                    z = c0451TaskDescription.djBIcL;
                }
                boolean z2 = z;
                if ((i & 16) != 0) {
                    groupInfo = c0451TaskDescription.copydefault;
                }
                return c0451TaskDescription.EZpvd(str, str3, officialTagInfo2, z2, groupInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0451TaskDescription EZpvd(@NotNull String str, @NotNull String str2, OfficialTagInfo officialTagInfo, boolean z, @NotNull GroupInfo groupInfo) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(groupInfo, "");
                return new C0451TaskDescription(str, str2, officialTagInfo, z, groupInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean EZpvd() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OfficialTagInfo KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GroupInfo copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0451TaskDescription)) {
                    return false;
                }
                C0451TaskDescription c0451TaskDescription = (C0451TaskDescription) obj;
                return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) c0451TaskDescription.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) c0451TaskDescription.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c0451TaskDescription.OLrzqt) && this.djBIcL == c0451TaskDescription.djBIcL && Intrinsics.EZpvd(this.copydefault, c0451TaskDescription.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.AEQbTJ.hashCode();
                int iHashCode2 = this.KWHzl.hashCode();
                OfficialTagInfo officialTagInfo = this.OLrzqt;
                return (((((((iHashCode * 31) + iHashCode2) * 31) + (officialTagInfo == null ? 0 : officialTagInfo.hashCode())) * 31) + Boolean.hashCode(this.djBIcL)) * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "GroupData(groupAvatar=" + this.AEQbTJ + ", groupName=" + this.KWHzl + ", groupTag=" + this.OLrzqt + ", showRefresh=" + this.djBIcL + ", groupInfo=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0451TaskDescription(@NotNull String str, @NotNull String str2, OfficialTagInfo officialTagInfo, boolean z, @NotNull GroupInfo groupInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(groupInfo, "");
                this.AEQbTJ = str;
                this.KWHzl = str2;
                this.OLrzqt = officialTagInfo;
                this.djBIcL = z;
                this.copydefault = groupInfo;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class ActionBar extends TaskDescription {
            public final String EZpvd;
            public final boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.EZpvd;
                }
                if ((i & 2) != 0) {
                    z = actionBar.OLrzqt;
                }
                return actionBar.KWHzl(str, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar KWHzl(@NotNull String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ActionBar(str, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return Intrinsics.EZpvd((Object) this.EZpvd, (Object) actionBar.EZpvd) && this.OLrzqt == actionBar.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + Boolean.hashCode(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "QrData(inviteLink=" + this.EZpvd + ", postRevoke=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull String str, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
                this.OLrzqt = z;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class StateListAnimator extends TaskDescription {
            public final Throwable KWHzl;
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, Throwable th, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = stateListAnimator.KWHzl;
                }
                if ((i & 2) != 0) {
                    str = stateListAnimator.copydefault;
                }
                return stateListAnimator.AEQbTJ(th, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator AEQbTJ(@NotNull Throwable th, @NotNull String str) {
                Intrinsics.checkNotNullParameter(th, "");
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(th, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                return Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) stateListAnimator.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(error=" + this.KWHzl + ", toast=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull Throwable th, @NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = th;
                this.copydefault = str;
            }
        }
    }

    public final void KWHzl(long j) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupQrViewModel$getGroupInfoAndQr$1(this, j, null), 3, null);
    }

    public final void copydefault(long j) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupQrViewModel$refreshQr$1(this, j, null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(1:(1:(1:(1:15)(2:16|17)))(9:18|81|19|42|(2:44|(1:46))(2:47|(4:49|(1:51)|52|(1:54))(2:56|57))|55|62|67|(4:69|(1:72)|73|(1:75))))|23|79|24|62|67|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[Catch: all -> 0x0054, TryCatch #2 {all -> 0x0054, blocks: (B:19:0x004f, B:42:0x00bd, B:44:0x00c3, B:47:0x00dd, B:49:0x00e1, B:52:0x0103, B:56:0x0117, B:57:0x011c), top: B:81:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd A[Catch: all -> 0x0054, TryCatch #2 {all -> 0x0054, blocks: (B:19:0x004f, B:42:0x00bd, B:44:0x00c3, B:47:0x00dd, B:49:0x00e1, B:52:0x0103, B:56:0x0117, B:57:0x011c), top: B:81:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(long j, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        GroupQrViewModel$createNewInvite$1 groupQrViewModel$createNewInvite$1;
        GroupQrViewModel groupQrViewModel;
        TaskDescription value;
        GroupQrViewModel groupQrViewModel2;
        GroupQrViewModel groupQrViewModel3;
        boolean z2;
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        AbstractC44393sOd abstractC44393sOd;
        if (continuation instanceof GroupQrViewModel$createNewInvite$1) {
            groupQrViewModel$createNewInvite$1 = (GroupQrViewModel$createNewInvite$1) continuation;
            int i = groupQrViewModel$createNewInvite$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupQrViewModel$createNewInvite$1.label = i - Integer.MIN_VALUE;
            } else {
                groupQrViewModel$createNewInvite$1 = new GroupQrViewModel$createNewInvite$1(this, continuation);
            }
        }
        Object objEZpvd = groupQrViewModel$createNewInvite$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupQrViewModel$createNewInvite$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    z2 = groupQrViewModel$createNewInvite$1.Z$0;
                    groupQrViewModel3 = (GroupQrViewModel) groupQrViewModel$createNewInvite$1.L$1;
                    groupQrViewModel = (GroupQrViewModel) groupQrViewModel$createNewInvite$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objEZpvd);
                        abstractC44393sOd = (AbstractC44393sOd) objEZpvd;
                        if (!(abstractC44393sOd instanceof AbstractC44393sOd.Application)) {
                            TaskDescription.ActionBar actionBar = new TaskDescription.ActionBar(((AbstractC44393sOd.Application) abstractC44393sOd).AEQbTJ(), z2);
                            MutableStateFlow<TaskDescription> mutableStateFlow = groupQrViewModel3.KWHzl;
                            groupQrViewModel$createNewInvite$1.L$0 = groupQrViewModel;
                            groupQrViewModel$createNewInvite$1.L$1 = null;
                            groupQrViewModel$createNewInvite$1.label = 3;
                            if (mutableStateFlow.emit(actionBar, groupQrViewModel$createNewInvite$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            if (!(abstractC44393sOd instanceof AbstractC44393sOd.TaskDescription)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            C44124sEe.AYXKKw("Error creating group invite", ((AbstractC44393sOd.TaskDescription) abstractC44393sOd).KWHzl());
                            Throwable thKWHzl = ((AbstractC44393sOd.TaskDescription) abstractC44393sOd).KWHzl();
                            String message = ((AbstractC44393sOd.TaskDescription) abstractC44393sOd).KWHzl().getMessage();
                            if (message == null) {
                                message = "Error creating invitation";
                            }
                            TaskDescription.StateListAnimator stateListAnimator = new TaskDescription.StateListAnimator(thKWHzl, message);
                            MutableStateFlow<TaskDescription> mutableStateFlow2 = groupQrViewModel3.KWHzl;
                            groupQrViewModel$createNewInvite$1.L$0 = groupQrViewModel;
                            groupQrViewModel$createNewInvite$1.L$1 = null;
                            groupQrViewModel$createNewInvite$1.label = 4;
                            if (mutableStateFlow2.emit(stateListAnimator, groupQrViewModel$createNewInvite$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        groupQrViewModel2 = groupQrViewModel;
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        th = th;
                        Result.Application application = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        groupQrViewModel2 = groupQrViewModel;
                    }
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        C44124sEe.AYXKKw("Exception in createNewInvite", thM7380exceptionOrNullimpl);
                        String message2 = thM7380exceptionOrNullimpl.getMessage();
                        TaskDescription.StateListAnimator stateListAnimator2 = new TaskDescription.StateListAnimator(thM7380exceptionOrNullimpl, message2 != null ? message2 : "Error creating invitation");
                        MutableStateFlow<TaskDescription> mutableStateFlow3 = groupQrViewModel2.KWHzl;
                        groupQrViewModel$createNewInvite$1.L$0 = objM7377constructorimpl;
                        groupQrViewModel$createNewInvite$1.L$1 = null;
                        groupQrViewModel$createNewInvite$1.label = 5;
                        if (mutableStateFlow3.emit(stateListAnimator2, groupQrViewModel$createNewInvite$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else if (i2 != 3 && i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objEZpvd);
                }
            }
            groupQrViewModel2 = (GroupQrViewModel) groupQrViewModel$createNewInvite$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                Result.Application application2 = Result.Companion;
                value = this.KWHzl.getValue();
                EZpvd(j);
            } catch (Throwable th2) {
                th = th2;
                groupQrViewModel = this;
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                groupQrViewModel2 = groupQrViewModel;
            }
            if (!(value instanceof TaskDescription.C0451TaskDescription)) {
                TaskDescription.StateListAnimator stateListAnimator3 = new TaskDescription.StateListAnimator(new IllegalStateException("Failed to get group info"), "Error: Unable to determine group type");
                MutableStateFlow<TaskDescription> mutableStateFlow4 = this.KWHzl;
                groupQrViewModel$createNewInvite$1.L$0 = this;
                groupQrViewModel$createNewInvite$1.label = 1;
                if (mutableStateFlow4.emit(stateListAnimator3, groupQrViewModel$createNewInvite$1) == objCopydefault) {
                    return objCopydefault;
                }
                groupQrViewModel2 = this;
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
            } else {
                Integer type = ((TaskDescription.C0451TaskDescription) value).copydefault().getType();
                CreateGroupInviteRequest createGroupInviteRequest = new CreateGroupInviteRequest((type != null && type.intValue() == GroupTagType.AFFILIATE.getValue()) ? GroupServiceType.Affiliate : GroupServiceType.IM, GroupScenarioType.Default, j, (Integer) null, 8, (DefaultConstructorMarker) null);
                oDH odh = this.copydefault;
                groupQrViewModel$createNewInvite$1.L$0 = this;
                groupQrViewModel$createNewInvite$1.L$1 = this;
                groupQrViewModel$createNewInvite$1.Z$0 = z;
                groupQrViewModel$createNewInvite$1.label = 2;
                objEZpvd = odh.EZpvd(createGroupInviteRequest, groupQrViewModel$createNewInvite$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                groupQrViewModel3 = this;
                z2 = z;
                groupQrViewModel = groupQrViewModel3;
                abstractC44393sOd = (AbstractC44393sOd) objEZpvd;
                if (!(abstractC44393sOd instanceof AbstractC44393sOd.Application)) {
                }
                groupQrViewModel2 = groupQrViewModel;
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0080 A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:24:0x0059, B:33:0x007a, B:35:0x0080, B:38:0x009a, B:40:0x009e, B:42:0x00b6, B:44:0x00be, B:47:0x00cb, B:54:0x00e7, B:51:0x00d9, B:60:0x0109, B:61:0x010e), top: B:81:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:24:0x0059, B:33:0x007a, B:35:0x0080, B:38:0x009a, B:40:0x009e, B:42:0x00b6, B:44:0x00be, B:47:0x00cb, B:54:0x00e7, B:51:0x00d9, B:60:0x0109, B:61:0x010e), top: B:81:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(long j, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        GroupQrViewModel$getExistingInvite$1 groupQrViewModel$getExistingInvite$1;
        Throwable th;
        GroupQrViewModel groupQrViewModel;
        GroupQrViewModel groupQrViewModel2;
        GroupQrViewModel groupQrViewModel3;
        AbstractC44398sOi abstractC44398sOi;
        String message;
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof GroupQrViewModel$getExistingInvite$1) {
            groupQrViewModel$getExistingInvite$1 = (GroupQrViewModel$getExistingInvite$1) continuation;
            int i = groupQrViewModel$getExistingInvite$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupQrViewModel$getExistingInvite$1.label = i - Integer.MIN_VALUE;
            } else {
                groupQrViewModel$getExistingInvite$1 = new GroupQrViewModel$getExistingInvite$1(this, continuation);
            }
        }
        Object objAEQbTJ = groupQrViewModel$getExistingInvite$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupQrViewModel$getExistingInvite$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            try {
                Result.Application application = Result.Companion;
                oDK odk = this.AEQbTJ;
                groupQrViewModel$getExistingInvite$1.L$0 = this;
                groupQrViewModel$getExistingInvite$1.L$1 = this;
                groupQrViewModel$getExistingInvite$1.J$0 = j;
                groupQrViewModel$getExistingInvite$1.Z$0 = z;
                groupQrViewModel$getExistingInvite$1.label = 1;
                objAEQbTJ = odk.AEQbTJ(j, groupQrViewModel$getExistingInvite$1);
            } catch (Throwable th2) {
                th = th2;
                groupQrViewModel = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            groupQrViewModel2 = this;
            groupQrViewModel3 = groupQrViewModel2;
            abstractC44398sOi = (AbstractC44398sOi) objAEQbTJ;
            if (!(abstractC44398sOi instanceof AbstractC44398sOi.StateListAnimator)) {
            }
            groupQrViewModel = groupQrViewModel3;
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else if (i2 == 1) {
            z = groupQrViewModel$getExistingInvite$1.Z$0;
            j = groupQrViewModel$getExistingInvite$1.J$0;
            groupQrViewModel2 = (GroupQrViewModel) groupQrViewModel$getExistingInvite$1.L$1;
            groupQrViewModel3 = (GroupQrViewModel) groupQrViewModel$getExistingInvite$1.L$0;
            try {
                C56391yDq.AEQbTJ(objAEQbTJ);
                abstractC44398sOi = (AbstractC44398sOi) objAEQbTJ;
                if (!(abstractC44398sOi instanceof AbstractC44398sOi.StateListAnimator)) {
                    TaskDescription.ActionBar actionBar = new TaskDescription.ActionBar(((AbstractC44398sOi.StateListAnimator) abstractC44398sOi).EZpvd(), z);
                    MutableStateFlow<TaskDescription> mutableStateFlow = groupQrViewModel2.KWHzl;
                    groupQrViewModel$getExistingInvite$1.L$0 = groupQrViewModel3;
                    groupQrViewModel$getExistingInvite$1.L$1 = null;
                    groupQrViewModel$getExistingInvite$1.label = 2;
                    if (mutableStateFlow.emit(actionBar, groupQrViewModel$getExistingInvite$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (!(abstractC44398sOi instanceof AbstractC44398sOi.Activity)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C44124sEe.AYXKKw("Error getting existing group invite", ((AbstractC44398sOi.Activity) abstractC44398sOi).OLrzqt());
                    TaskDescription value = groupQrViewModel2.KWHzl.getValue();
                    if ((value instanceof TaskDescription.C0451TaskDescription) && ((TaskDescription.C0451TaskDescription) value).EZpvd()) {
                        groupQrViewModel$getExistingInvite$1.L$0 = groupQrViewModel3;
                        groupQrViewModel$getExistingInvite$1.L$1 = null;
                        groupQrViewModel$getExistingInvite$1.label = 3;
                        if (groupQrViewModel2.copydefault(j, z, groupQrViewModel$getExistingInvite$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (((AbstractC44398sOi.Activity) abstractC44398sOi).copydefault() == 2015) {
                            message = "You don't have permission to view this invitation";
                        } else {
                            message = ((AbstractC44398sOi.Activity) abstractC44398sOi).OLrzqt().getMessage();
                            if (message == null) {
                                message = "Error getting invitation";
                            }
                        }
                        TaskDescription.StateListAnimator stateListAnimator = new TaskDescription.StateListAnimator(((AbstractC44398sOi.Activity) abstractC44398sOi).OLrzqt(), message);
                        MutableStateFlow<TaskDescription> mutableStateFlow2 = groupQrViewModel2.KWHzl;
                        groupQrViewModel$getExistingInvite$1.L$0 = groupQrViewModel3;
                        groupQrViewModel$getExistingInvite$1.L$1 = null;
                        groupQrViewModel$getExistingInvite$1.label = 4;
                        if (mutableStateFlow2.emit(stateListAnimator, groupQrViewModel$getExistingInvite$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                groupQrViewModel = groupQrViewModel3;
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                th = th3;
                groupQrViewModel = groupQrViewModel3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
            groupQrViewModel = (GroupQrViewModel) groupQrViewModel$getExistingInvite$1.L$0;
            try {
                C56391yDq.AEQbTJ(objAEQbTJ);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th4) {
                th = th4;
                Result.Application application222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                C44124sEe.AYXKKw("Exception in getExistingInvite", thM7380exceptionOrNullimpl);
                String message2 = thM7380exceptionOrNullimpl.getMessage();
                TaskDescription.StateListAnimator stateListAnimator2 = new TaskDescription.StateListAnimator(thM7380exceptionOrNullimpl, message2 != null ? message2 : "Error getting invitation");
                MutableStateFlow<TaskDescription> mutableStateFlow3 = groupQrViewModel.KWHzl;
                groupQrViewModel$getExistingInvite$1.L$0 = objM7377constructorimpl;
                groupQrViewModel$getExistingInvite$1.L$1 = null;
                groupQrViewModel$getExistingInvite$1.label = 5;
                if (mutableStateFlow3.emit(stateListAnimator2, groupQrViewModel$getExistingInvite$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(long j) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupQrViewModel$getGroupInfo$1(this, j, null), 3, null);
    }
}
