package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.chatsettings.model.ChatSettingsResult;
import com.okinc.im.imui.privacy.viewmodel.CommonChatSettingsViewModel$fetchPrivacySettings$2;
import com.okinc.im.imui.privacy.viewmodel.CommonChatSettingsViewModel$getFetchingJob$1;
import com.okinc.im.imui.privacy.viewmodel.CommonChatSettingsViewModel$getFetchingJobWithAvatar$2;
import com.okinc.im.imui.privacy.viewmodel.CommonChatSettingsViewModel$loadAvatarInfo$1;
import com.okinc.im.imui.privacy.viewmodel.CommonChatSettingsViewModel$updateAvatarInfo$1;
import com.okinc.im.imui.privacy.viewmodel.CommonChatSettingsViewModel$updatePrivacySetting$1;
import com.okinc.im.utils.UiText;
import com.okinc.okuser.data.User;
import com.okinc.okuser.data.UserProfile;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37203opR extends AbstractC33073mpa {
    public final InterfaceC47278tmy AYXKKw;
    public final MutableStateFlow<C35501nwZ> EZpvd;
    public final StateFlow<C35501nwZ> KWHzl;
    public final MutableStateFlow<Activity> OLrzqt;
    public final InterfaceC8108awX copydefault;
    public final StateFlow<Activity> djBIcL;
    public final C35765oCw gEmmrt;
    public final C35767oCy valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Activity> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C35501nwZ> KWHzl() {
        return this.KWHzl;
    }

    public C37203opR(@NotNull C35767oCy c35767oCy, @NotNull C35765oCw c35765oCw, @NotNull InterfaceC8108awX interfaceC8108awX, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(c35767oCy, "");
        Intrinsics.checkNotNullParameter(c35765oCw, "");
        Intrinsics.checkNotNullParameter(interfaceC8108awX, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.valueOf = c35767oCy;
        this.gEmmrt = c35765oCw;
        this.copydefault = interfaceC8108awX;
        this.AYXKKw = interfaceC47278tmy;
        MutableStateFlow<Activity> MutableStateFlow = StateFlowKt.MutableStateFlow(new Activity.ActionBar(true));
        this.OLrzqt = MutableStateFlow;
        this.djBIcL = MutableStateFlow;
        MutableStateFlow<C35501nwZ> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow2;
        this.KWHzl = MutableStateFlow2;
    }

    /* JADX INFO: renamed from: o.opR$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.opR.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.opR$Activity */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.opR.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.opR$Activity$ActionBar */
        public static final class ActionBar extends Activity {
            public final boolean EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = actionBar.EZpvd;
                }
                return actionBar.copydefault(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(boolean z) {
                return new ActionBar(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && this.EZpvd == ((ActionBar) obj).EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Loading(isInitProcess=" + this.EZpvd + ")";
            }

            public ActionBar(boolean z) {
                super(null);
                this.EZpvd = z;
            }
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.opR$Activity$Activity, reason: collision with other inner class name */
        public static final class C0907Activity extends Activity {
            public final java.lang.String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C0907Activity() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0907Activity copy$default(C0907Activity c0907Activity, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = c0907Activity.KWHzl;
                }
                return c0907Activity.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0907Activity OLrzqt(java.lang.String str) {
                return new C0907Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0907Activity) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((C0907Activity) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.String str = this.KWHzl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(message=" + this.KWHzl + ")";
            }

            public C0907Activity(java.lang.String str) {
                super(null);
                this.KWHzl = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:33) call: o.opR.Activity.Activity.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ C0907Activity(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }
        }

        /* JADX INFO: renamed from: o.opR$Activity$TaskDescription */
        public static final class TaskDescription extends Activity {
            public final ChatSettingsResult OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, ChatSettingsResult chatSettingsResult, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    chatSettingsResult = taskDescription.OLrzqt;
                }
                return taskDescription.OLrzqt(chatSettingsResult);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription OLrzqt(@NotNull ChatSettingsResult chatSettingsResult) {
                Intrinsics.checkNotNullParameter(chatSettingsResult, "");
                return new TaskDescription(chatSettingsResult);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ChatSettingsResult copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((TaskDescription) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Content(settings=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull ChatSettingsResult chatSettingsResult) {
                super(null);
                Intrinsics.checkNotNullParameter(chatSettingsResult, "");
                this.OLrzqt = chatSettingsResult;
            }
        }
    }

    public static /* synthetic */ void getPrivacySettings$default(C37203opR c37203opR, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        c37203opR.copydefault(z, z2);
    }

    public final void copydefault(boolean z, boolean z2) {
        AEQbTJ(z, z2);
    }

    public static /* synthetic */ void updateAvatarInfo$default(C37203opR c37203opR, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        c37203opR.EZpvd(z, z2);
    }

    public final void EZpvd(boolean z, boolean z2) {
        if (z && z2) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonChatSettingsViewModel$updateAvatarInfo$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        CommonChatSettingsViewModel$getFetchingJob$1 commonChatSettingsViewModel$getFetchingJob$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof CommonChatSettingsViewModel$getFetchingJob$1) {
            commonChatSettingsViewModel$getFetchingJob$1 = (CommonChatSettingsViewModel$getFetchingJob$1) continuation;
            int i = commonChatSettingsViewModel$getFetchingJob$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonChatSettingsViewModel$getFetchingJob$1.label = i - Integer.MIN_VALUE;
            } else {
                commonChatSettingsViewModel$getFetchingJob$1 = new CommonChatSettingsViewModel$getFetchingJob$1(this, continuation);
            }
        }
        java.lang.Object obj = commonChatSettingsViewModel$getFetchingJob$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = commonChatSettingsViewModel$getFetchingJob$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                commonChatSettingsViewModel$getFetchingJob$1.label = 1;
                if (KWHzl(commonChatSettingsViewModel$getFetchingJob$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("CommonChatSettingsViewModel", "Error in getFetchingJob: " + thM7380exceptionOrNullimpl);
            throw thM7380exceptionOrNullimpl;
        }
        return Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(Continuation<? super Unit> continuation) {
        java.lang.Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CommonChatSettingsViewModel$getFetchingJobWithAvatar$2(this, null), continuation);
        return objCoroutineScope == C56442yFn.copydefault() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        CommonChatSettingsViewModel$loadAvatarInfo$1 commonChatSettingsViewModel$loadAvatarInfo$1;
        java.lang.Object objM7377constructorimpl;
        C37203opR c37203opR;
        C35501nwZ value;
        java.lang.String strGEmmrt;
        UiText.DynamicString dynamicString;
        java.lang.String nameDesc;
        java.lang.String subAccountType;
        if (continuation instanceof CommonChatSettingsViewModel$loadAvatarInfo$1) {
            commonChatSettingsViewModel$loadAvatarInfo$1 = (CommonChatSettingsViewModel$loadAvatarInfo$1) continuation;
            int i = commonChatSettingsViewModel$loadAvatarInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonChatSettingsViewModel$loadAvatarInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                commonChatSettingsViewModel$loadAvatarInfo$1 = new CommonChatSettingsViewModel$loadAvatarInfo$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = commonChatSettingsViewModel$loadAvatarInfo$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = commonChatSettingsViewModel$loadAvatarInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                Result.Application application = Result.Companion;
                InterfaceC8108awX interfaceC8108awX = this.copydefault;
                commonChatSettingsViewModel$loadAvatarInfo$1.L$0 = this;
                commonChatSettingsViewModel$loadAvatarInfo$1.label = 1;
                objCopydefault = interfaceC8108awX.copydefault(true, commonChatSettingsViewModel$loadAvatarInfo$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                c37203opR = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c37203opR = (C37203opR) commonChatSettingsViewModel$loadAvatarInfo$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (objCopydefault == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        java.lang.String profilePictureUrl = ((UserProfile) objCopydefault).getProfilePictureUrl();
        MutableStateFlow<C35501nwZ> mutableStateFlow = c37203opR.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            C35501nwZ c35501nwZ = value;
            strGEmmrt = c37203opR.AYXKKw.gEmmrt();
            java.lang.String str = "";
            if (c37203opR.AYXKKw.DbNXlk()) {
                User userOLrzqt = c37203opR.AYXKKw.OLrzqt();
                if (userOLrzqt != null && (subAccountType = userOLrzqt.getSubAccountType()) != null) {
                    str = subAccountType;
                }
                dynamicString = new UiText.DynamicString(str);
            } else {
                User userOLrzqt2 = c37203opR.AYXKKw.OLrzqt();
                if (userOLrzqt2 != null && (nameDesc = userOLrzqt2.getNameDesc()) != null) {
                    str = nameDesc;
                }
                dynamicString = new UiText.DynamicString(str);
            }
        } while (!mutableStateFlow.compareAndSet(value, new C35501nwZ(profilePictureUrl, strGEmmrt, dynamicString)));
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("CommonChatSettingsViewModel", "forceLoadRemoteUserProfile returns error: " + thM7380exceptionOrNullimpl);
            throw thM7380exceptionOrNullimpl;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.opR$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(java.lang.Object obj, Continuation<? super Unit> continuation) throws java.lang.Throwable {
            java.lang.Object value;
            java.lang.Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
            C37203opR c37203opR = C37203opR.this;
            if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                ChatSettingsResult chatSettingsResult = (ChatSettingsResult) objM7386unboximpl;
                MutableStateFlow mutableStateFlow = c37203opR.OLrzqt;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, new Activity.TaskDescription(chatSettingsResult)));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("CommonChatSettingsViewModel", "Error in fetchChatSettings: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                throw thM7380exceptionOrNullimpl;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object KWHzl(Continuation<? super Unit> continuation) {
        java.lang.Object objCollect = this.valueOf.KWHzl().collect(new ActionBar(), continuation);
        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
    }

    public final void AEQbTJ(int i, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonChatSettingsViewModel$updatePrivacySetting$1(this, i, z, null), 3, null);
    }

    public final void AEQbTJ(boolean z, boolean z2) {
        MutableStateFlow<Activity> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new Activity.ActionBar(z))) {
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CommonChatSettingsViewModel$fetchPrivacySettings$2(z2, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(int i, boolean z) {
        Activity value;
        Activity taskDescription;
        MutableStateFlow<Activity> mutableStateFlow = this.OLrzqt;
        do {
            value = mutableStateFlow.getValue();
            taskDescription = value;
            if (taskDescription instanceof Activity.TaskDescription) {
                ChatSettingsResult chatSettingsResultCopydefault = ((Activity.TaskDescription) taskDescription).copydefault();
                if (i == 1) {
                    chatSettingsResultCopydefault = ChatSettingsResult.copy$default(chatSettingsResultCopydefault, z, false, false, false, null, 30, null);
                } else if (i == 3) {
                    chatSettingsResultCopydefault = ChatSettingsResult.copy$default(chatSettingsResultCopydefault, false, false, z, false, null, 27, null);
                } else if (i == 4) {
                    chatSettingsResultCopydefault = ChatSettingsResult.copy$default(chatSettingsResultCopydefault, false, false, false, z, null, 23, null);
                }
                taskDescription = new Activity.TaskDescription(chatSettingsResultCopydefault);
            }
        } while (!mutableStateFlow.compareAndSet(value, taskDescription));
    }
}
