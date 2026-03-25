package o;

import com.okinc.im.call.domain.GroupCallManager$handleGroupCallEnded$1;
import com.okinc.im.call.domain.GroupCallManager$joinGroupCall$1;
import com.okinc.im.call.domain.GroupCallManager$leaveGroupCall$1;
import com.okinc.im.call.domain.GroupCallManager$startGroupCall$1;
import com.okinc.im.call.model.CallDirection;
import com.okinc.im.call.model.CallSessionV2;
import com.okinc.im.call.model.CallStateV2;
import com.okinc.okimcore.model.im.GroupVoiceCallUser;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC35221nrI;
import o.AbstractC35226nrN;
import o.AbstractC35238nrZ;
import o.AbstractC35264nrz;
import o.C35220nrH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35225nrM implements C35220nrH.ActionBar {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public Function0<? extends CallStateV2> AEQbTJ;
    public final InterfaceC35234nrV AYXKKw;
    public CoroutineScope AhwBna;
    public Activity EZpvd;
    public Application KWHzl;
    public final java.util.List<ActionBar> copydefault;

    /* JADX INFO: renamed from: o.nrM$ActionBar */
    public interface ActionBar {
        void KWHzl(@NotNull java.util.List<GroupVoiceCallUser> list, @NotNull java.util.List<java.lang.String> list2, @NotNull java.util.List<java.lang.String> list3);
    }

    /* JADX INFO: renamed from: o.nrM$Activity */
    public interface Activity {
        void copydefault(C35233nrU c35233nrU);
    }

    /* JADX INFO: renamed from: o.nrM$Application */
    public interface Application {
        void AEQbTJ(@NotNull AbstractC35264nrz abstractC35264nrz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull CoroutineScope coroutineScope, @NotNull Function0<? extends CallStateV2> function0, @NotNull Application application, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(activity, "");
        this.AhwBna = coroutineScope;
        this.AEQbTJ = function0;
        this.KWHzl = application;
        this.EZpvd = activity;
    }

    @yCM
    public C35225nrM(@NotNull InterfaceC35234nrV interfaceC35234nrV) {
        Intrinsics.checkNotNullParameter(interfaceC35234nrV, "");
        this.AYXKKw = interfaceC35234nrV;
        this.copydefault = new java.util.ArrayList();
    }

    /* JADX INFO: renamed from: o.nrM$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nrM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation) throws java.lang.Throwable {
        GroupCallManager$startGroupCall$1 groupCallManager$startGroupCall$1;
        C35225nrM c35225nrM;
        AbstractC35226nrN abstractC35226nrN;
        AbstractC35226nrN abstractC35226nrN2;
        C35225nrM c35225nrM2;
        CallSessionV2 callSessionV2;
        AbstractC35226nrN abstractC35226nrN3;
        if (continuation instanceof GroupCallManager$startGroupCall$1) {
            groupCallManager$startGroupCall$1 = (GroupCallManager$startGroupCall$1) continuation;
            int i = groupCallManager$startGroupCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupCallManager$startGroupCall$1.label = i - Integer.MIN_VALUE;
            } else {
                groupCallManager$startGroupCall$1 = new GroupCallManager$startGroupCall$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = groupCallManager$startGroupCall$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupCallManager$startGroupCall$1.label;
        Application application = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            AEQbTJ("startGroupCall: groupId=" + str + ", targetUids=" + list.size());
            Function0<? extends CallStateV2> function0 = this.AEQbTJ;
            if (function0 == null) {
                Intrinsics.gEmmrt("");
                function0 = null;
            }
            CallStateV2 callStateV2Invoke = function0.invoke();
            if (callStateV2Invoke.OLrzqt()) {
                AEQbTJ("startGroupCall: REJECTED - already active (" + C56524yIo.AEQbTJ(callStateV2Invoke.getClass()).valueOf() + ")");
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) AbstractC35221nrI.TaskDescription.AEQbTJ);
            }
            if (!this.AYXKKw.EZpvd()) {
                AEQbTJ("startGroupCall: REJECTED - network unavailable");
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) AbstractC35221nrI.Fragment.OLrzqt);
            }
            AEQbTJ("startGroupCall: Initiating group call via repository");
            InterfaceC35234nrV interfaceC35234nrV = this.AYXKKw;
            groupCallManager$startGroupCall$1.L$0 = this;
            groupCallManager$startGroupCall$1.label = 1;
            objEZpvd = interfaceC35234nrV.EZpvd(str, list, groupCallManager$startGroupCall$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c35225nrM = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                callSessionV2 = (CallSessionV2) groupCallManager$startGroupCall$1.L$3;
                abstractC35226nrN = (AbstractC35226nrN) groupCallManager$startGroupCall$1.L$2;
                abstractC35226nrN2 = (AbstractC35226nrN) groupCallManager$startGroupCall$1.L$1;
                c35225nrM2 = (C35225nrM) groupCallManager$startGroupCall$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                abstractC35226nrN3 = (AbstractC35226nrN) objEZpvd;
                if (abstractC35226nrN3 instanceof AbstractC35226nrN.ActionBar) {
                    c35225nrM2.AEQbTJ("startGroupCall: Successfully joined Agora channel");
                    c35225nrM2.EZpvd(callSessionV2);
                    Application application2 = c35225nrM2.KWHzl;
                    if (application2 == null) {
                        Intrinsics.gEmmrt("");
                        application2 = null;
                    }
                    application2.AEQbTJ(AbstractC35264nrz.VoiceInteractor.KWHzl);
                    Application application3 = c35225nrM2.KWHzl;
                    if (application3 == null) {
                        Intrinsics.gEmmrt("");
                        application3 = null;
                    }
                    application3.AEQbTJ(AbstractC35264nrz.TaskDescription.AEQbTJ);
                }
                if (abstractC35226nrN3 instanceof AbstractC35226nrN.Application) {
                    AbstractC35221nrI abstractC35221nrIOLrzqt = ((AbstractC35226nrN.Application) abstractC35226nrN3).OLrzqt();
                    c35225nrM2.AEQbTJ("startGroupCall: Failed to join channel: " + abstractC35221nrIOLrzqt.AEQbTJ());
                    Application application4 = c35225nrM2.KWHzl;
                    if (application4 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        application = application4;
                    }
                    application.AEQbTJ(new AbstractC35264nrz.Activity(new java.lang.Exception(abstractC35221nrIOLrzqt.AEQbTJ())));
                }
                c35225nrM = c35225nrM2;
                if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
                    c35225nrM.AEQbTJ("startGroupCall: Failed to start: " + ((AbstractC35226nrN.Application) abstractC35226nrN).OLrzqt().AEQbTJ());
                }
                return abstractC35226nrN2;
            }
            c35225nrM = (C35225nrM) groupCallManager$startGroupCall$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        abstractC35226nrN = (AbstractC35226nrN) objEZpvd;
        if (abstractC35226nrN instanceof AbstractC35226nrN.ActionBar) {
            CallSessionV2 callSessionV22 = (CallSessionV2) ((AbstractC35226nrN.ActionBar) abstractC35226nrN).EZpvd();
            c35225nrM.AEQbTJ("startGroupCall: Group call initiated, callId=" + callSessionV22.gEmmrt());
            Application application5 = c35225nrM.KWHzl;
            if (application5 == null) {
                Intrinsics.gEmmrt("");
                application5 = null;
            }
            application5.AEQbTJ(new AbstractC35264nrz.LoaderManager(callSessionV22));
            c35225nrM.AEQbTJ("startGroupCall: Joining Agora channel");
            InterfaceC35234nrV interfaceC35234nrV2 = c35225nrM.AYXKKw;
            groupCallManager$startGroupCall$1.L$0 = c35225nrM;
            groupCallManager$startGroupCall$1.L$1 = abstractC35226nrN;
            groupCallManager$startGroupCall$1.L$2 = abstractC35226nrN;
            groupCallManager$startGroupCall$1.L$3 = callSessionV22;
            groupCallManager$startGroupCall$1.label = 2;
            java.lang.Object objOLrzqt = interfaceC35234nrV2.OLrzqt(callSessionV22, groupCallManager$startGroupCall$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            abstractC35226nrN2 = abstractC35226nrN;
            c35225nrM2 = c35225nrM;
            callSessionV2 = callSessionV22;
            objEZpvd = objOLrzqt;
            abstractC35226nrN3 = (AbstractC35226nrN) objEZpvd;
            if (abstractC35226nrN3 instanceof AbstractC35226nrN.ActionBar) {
            }
            if (abstractC35226nrN3 instanceof AbstractC35226nrN.Application) {
            }
            c35225nrM = c35225nrM2;
            if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
            }
            return abstractC35226nrN2;
        }
        abstractC35226nrN2 = abstractC35226nrN;
        if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
        }
        return abstractC35226nrN2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11, types: [int] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation) throws java.lang.Throwable {
        GroupCallManager$joinGroupCall$1 groupCallManager$joinGroupCall$1;
        ?? r11;
        C35225nrM c35225nrM;
        AbstractC35226nrN abstractC35226nrN;
        AbstractC35226nrN abstractC35226nrN2;
        CallSessionV2 callSessionV2;
        C35225nrM c35225nrM2;
        AbstractC35226nrN abstractC35226nrN3;
        ?? r112;
        ?? r113;
        AbstractC35226nrN abstractC35226nrN4;
        if (continuation instanceof GroupCallManager$joinGroupCall$1) {
            groupCallManager$joinGroupCall$1 = (GroupCallManager$joinGroupCall$1) continuation;
            int i = groupCallManager$joinGroupCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupCallManager$joinGroupCall$1.label = i - Integer.MIN_VALUE;
            } else {
                groupCallManager$joinGroupCall$1 = new GroupCallManager$joinGroupCall$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = groupCallManager$joinGroupCall$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = groupCallManager$joinGroupCall$1.label;
        Application application = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            AEQbTJ("joinGroupCall: groupId=" + str);
            Function0<? extends CallStateV2> function0 = this.AEQbTJ;
            if (function0 == null) {
                Intrinsics.gEmmrt("");
                function0 = null;
            }
            CallStateV2 callStateV2Invoke = function0.invoke();
            if (callStateV2Invoke instanceof CallStateV2.Ringing) {
                CallStateV2.Ringing ringing = (CallStateV2.Ringing) callStateV2Invoke;
                ?? r2 = (ringing.valueOf() == CallDirection.INCOMING && ringing.djBIcL().AuCTel()) ? 1 : 0;
                if (r2 == 0 && callStateV2Invoke.OLrzqt()) {
                    AEQbTJ("joinGroupCall: REJECTED - already active (" + C56524yIo.AEQbTJ(callStateV2Invoke.getClass()).valueOf() + ")");
                    return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) AbstractC35221nrI.TaskDescription.AEQbTJ);
                }
                if (!this.AYXKKw.EZpvd()) {
                    AEQbTJ("joinGroupCall: REJECTED - network unavailable");
                    return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) AbstractC35221nrI.Fragment.OLrzqt);
                }
                AEQbTJ("joinGroupCall: Joining group call via repository (acceptingIncoming=" + r2 + ")");
                InterfaceC35234nrV interfaceC35234nrV = this.AYXKKw;
                groupCallManager$joinGroupCall$1.L$0 = this;
                groupCallManager$joinGroupCall$1.I$0 = r2;
                groupCallManager$joinGroupCall$1.label = 1;
                objCopydefault = interfaceC35234nrV.copydefault(str, groupCallManager$joinGroupCall$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                r11 = r2;
                c35225nrM = this;
            }
            if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
            }
            return abstractC35226nrN2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = groupCallManager$joinGroupCall$1.I$0;
            callSessionV2 = (CallSessionV2) groupCallManager$joinGroupCall$1.L$3;
            abstractC35226nrN3 = (AbstractC35226nrN) groupCallManager$joinGroupCall$1.L$2;
            abstractC35226nrN2 = (AbstractC35226nrN) groupCallManager$joinGroupCall$1.L$1;
            c35225nrM2 = (C35225nrM) groupCallManager$joinGroupCall$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            r113 = i3;
            abstractC35226nrN4 = (AbstractC35226nrN) objCopydefault;
            if (abstractC35226nrN4 instanceof AbstractC35226nrN.ActionBar) {
                c35225nrM2.AEQbTJ("joinGroupCall: Successfully joined Agora channel");
                c35225nrM2.EZpvd(callSessionV2);
            }
            if (abstractC35226nrN4 instanceof AbstractC35226nrN.Application) {
                AbstractC35221nrI abstractC35221nrIOLrzqt = ((AbstractC35226nrN.Application) abstractC35226nrN4).OLrzqt();
                c35225nrM2.AEQbTJ("joinGroupCall: Failed to join Agora channel: " + abstractC35221nrIOLrzqt.AEQbTJ());
                Application application2 = c35225nrM2.KWHzl;
                if (application2 == null) {
                    Intrinsics.gEmmrt("");
                    application2 = null;
                }
                application2.AEQbTJ(new AbstractC35264nrz.Activity(new java.lang.Exception(abstractC35221nrIOLrzqt.AEQbTJ())));
            }
            abstractC35226nrN = abstractC35226nrN3;
            c35225nrM = c35225nrM2;
            r112 = r113;
            if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
                AbstractC35221nrI abstractC35221nrIOLrzqt2 = ((AbstractC35226nrN.Application) abstractC35226nrN).OLrzqt();
                c35225nrM.AEQbTJ("joinGroupCall: Failed to join: " + abstractC35221nrIOLrzqt2.AEQbTJ());
                if (r112 != 0) {
                    c35225nrM.AEQbTJ("joinGroupCall: Resetting state after failed accept");
                    Application application3 = c35225nrM.KWHzl;
                    if (application3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        application = application3;
                    }
                    application.AEQbTJ(new AbstractC35264nrz.Activity(new java.lang.Exception("Failed to join group call: " + abstractC35221nrIOLrzqt2.AEQbTJ())));
                }
            }
            return abstractC35226nrN2;
        }
        int i4 = groupCallManager$joinGroupCall$1.I$0;
        c35225nrM = (C35225nrM) groupCallManager$joinGroupCall$1.L$0;
        C56391yDq.AEQbTJ(objCopydefault);
        r11 = i4;
        abstractC35226nrN = (AbstractC35226nrN) objCopydefault;
        if (abstractC35226nrN instanceof AbstractC35226nrN.ActionBar) {
            CallSessionV2 callSessionV22 = (CallSessionV2) ((AbstractC35226nrN.ActionBar) abstractC35226nrN).EZpvd();
            c35225nrM.AEQbTJ("joinGroupCall: Successfully joined, callId=" + callSessionV22.gEmmrt());
            if (r11 != 0) {
                Application application4 = c35225nrM.KWHzl;
                if (application4 == null) {
                    Intrinsics.gEmmrt("");
                    application4 = null;
                }
                application4.AEQbTJ(AbstractC35264nrz.Dialog.EZpvd);
            } else {
                Application application5 = c35225nrM.KWHzl;
                if (application5 == null) {
                    Intrinsics.gEmmrt("");
                    application5 = null;
                }
                application5.AEQbTJ(new AbstractC35264nrz.Application(callSessionV22));
                Application application6 = c35225nrM.KWHzl;
                if (application6 == null) {
                    Intrinsics.gEmmrt("");
                    application6 = null;
                }
                application6.AEQbTJ(AbstractC35264nrz.Dialog.EZpvd);
            }
            c35225nrM.AEQbTJ("joinGroupCall: Joining Agora channel");
            InterfaceC35234nrV interfaceC35234nrV2 = c35225nrM.AYXKKw;
            groupCallManager$joinGroupCall$1.L$0 = c35225nrM;
            groupCallManager$joinGroupCall$1.L$1 = abstractC35226nrN;
            groupCallManager$joinGroupCall$1.L$2 = abstractC35226nrN;
            groupCallManager$joinGroupCall$1.L$3 = callSessionV22;
            groupCallManager$joinGroupCall$1.I$0 = r11;
            groupCallManager$joinGroupCall$1.label = 2;
            java.lang.Object objOLrzqt = interfaceC35234nrV2.OLrzqt(callSessionV22, groupCallManager$joinGroupCall$1);
            if (objOLrzqt == objCopydefault2) {
                return objCopydefault2;
            }
            abstractC35226nrN2 = abstractC35226nrN;
            callSessionV2 = callSessionV22;
            objCopydefault = objOLrzqt;
            c35225nrM2 = c35225nrM;
            abstractC35226nrN3 = abstractC35226nrN2;
            r113 = r11;
            abstractC35226nrN4 = (AbstractC35226nrN) objCopydefault;
            if (abstractC35226nrN4 instanceof AbstractC35226nrN.ActionBar) {
            }
            if (abstractC35226nrN4 instanceof AbstractC35226nrN.Application) {
            }
            abstractC35226nrN = abstractC35226nrN3;
            c35225nrM = c35225nrM2;
            r112 = r113;
            if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
            }
            return abstractC35226nrN2;
        }
        abstractC35226nrN2 = abstractC35226nrN;
        r112 = r11;
        if (abstractC35226nrN instanceof AbstractC35226nrN.Application) {
        }
        return abstractC35226nrN2;
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        AEQbTJ("ringGroupCall: targets=" + list.size() + ", uids=" + list);
        Function0<? extends CallStateV2> function0 = this.AEQbTJ;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        CallSessionV2 callSessionV2AEQbTJ = function0.invoke().AEQbTJ();
        if (callSessionV2AEQbTJ == null || !callSessionV2AEQbTJ.AuCTel()) {
            AEQbTJ("ringGroupCall: REJECTED - not in group call");
            return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) AbstractC35221nrI.PictureInPictureParams.OLrzqt);
        }
        java.lang.String strValueOf = callSessionV2AEQbTJ.valueOf();
        if (strValueOf == null) {
            AEQbTJ("ringGroupCall: REJECTED - no groupId in session");
            return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) AbstractC35221nrI.PictureInPictureParams.OLrzqt);
        }
        AEQbTJ("ringGroupCall: Ringing users in groupId=" + strValueOf);
        return this.AYXKKw.AEQbTJ(strValueOf, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) throws java.lang.Throwable {
        GroupCallManager$leaveGroupCall$1 groupCallManager$leaveGroupCall$1;
        C35225nrM c35225nrM;
        if (continuation instanceof GroupCallManager$leaveGroupCall$1) {
            groupCallManager$leaveGroupCall$1 = (GroupCallManager$leaveGroupCall$1) continuation;
            int i = groupCallManager$leaveGroupCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupCallManager$leaveGroupCall$1.label = i - Integer.MIN_VALUE;
            } else {
                groupCallManager$leaveGroupCall$1 = new GroupCallManager$leaveGroupCall$1(this, continuation);
            }
        }
        java.lang.Object obj = groupCallManager$leaveGroupCall$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupCallManager$leaveGroupCall$1.label;
        Application application = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AEQbTJ("leaveGroupCall: Attempting to leave group call");
            Function0<? extends CallStateV2> function0 = this.AEQbTJ;
            if (function0 == null) {
                Intrinsics.gEmmrt("");
                function0 = null;
            }
            CallSessionV2 callSessionV2AEQbTJ = function0.invoke().AEQbTJ();
            if (callSessionV2AEQbTJ == null || !callSessionV2AEQbTJ.AuCTel()) {
                AEQbTJ("leaveGroupCall: REJECTED - not in group call");
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) AbstractC35221nrI.PictureInPictureParams.OLrzqt);
            }
            AEQbTJ("leaveGroupCall: Leaving groupId=" + callSessionV2AEQbTJ.valueOf());
            InterfaceC35234nrV interfaceC35234nrV = this.AYXKKw;
            groupCallManager$leaveGroupCall$1.L$0 = this;
            groupCallManager$leaveGroupCall$1.label = 1;
            if (interfaceC35234nrV.EZpvd(groupCallManager$leaveGroupCall$1) == objCopydefault) {
                return objCopydefault;
            }
            c35225nrM = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c35225nrM = (C35225nrM) groupCallManager$leaveGroupCall$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Application application2 = c35225nrM.KWHzl;
        if (application2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            application = application2;
        }
        application.AEQbTJ(AbstractC35264nrz.FragmentManager.EZpvd);
        c35225nrM.AEQbTJ();
        c35225nrM.AEQbTJ("leaveGroupCall: Successfully left group call");
        return AbstractC35226nrN.Companion.copydefault(Unit.INSTANCE);
    }

    public final void KWHzl(java.util.List<GroupVoiceCallUser> list, java.util.List<java.lang.String> list2, java.util.List<java.lang.String> list3) {
        AEQbTJ("notifyParticipantsChanged: activeUsers=" + list.size() + ", historicalUids=" + list2.size() + ", targetUids=" + list3.size());
        for (ActionBar actionBar : this.copydefault) {
            try {
                Result.Application application = Result.Companion;
                actionBar.KWHzl(list, list2, list3);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
    }

    @Override // o.C35220nrH.ActionBar
    public java.lang.Object EZpvd(@NotNull AbstractC35238nrZ.PendingIntent pendingIntent, @NotNull Continuation<? super Unit> continuation) {
        Function0<? extends CallStateV2> function0 = this.AEQbTJ;
        Application application = null;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        if (function0.invoke().OLrzqt()) {
            AEQbTJ("handleGroupCallIncoming: Already in call, ignoring");
            return Unit.INSTANCE;
        }
        java.lang.String strKWHzl = C44157sFk.KWHzl();
        if (strKWHzl == null) {
            return Unit.INSTANCE;
        }
        CallSessionV2 callSessionV2AEQbTJ = CallSessionV2.Companion.AEQbTJ(pendingIntent.copydefault(), strKWHzl, "", "", "", 0);
        java.lang.String strAEQbTJ = pendingIntent.AEQbTJ();
        CallSessionV2 callSessionV2KWHzl = callSessionV2AEQbTJ.KWHzl((131055 & 1) != 0 ? callSessionV2AEQbTJ.callId : null, (131055 & 2) != 0 ? callSessionV2AEQbTJ.conversationId : null, (131055 & 4) != 0 ? callSessionV2AEQbTJ.calleeUserId : null, (131055 & 8) != 0 ? callSessionV2AEQbTJ.callerUserId : strAEQbTJ == null ? "" : strAEQbTJ, (131055 & 16) != 0 ? callSessionV2AEQbTJ.selfUserId : null, (131055 & 32) != 0 ? callSessionV2AEQbTJ.agoraToken : null, (131055 & 64) != 0 ? callSessionV2AEQbTJ.agoraAppId : null, (131055 & 128) != 0 ? callSessionV2AEQbTJ.agoraUid : 0, (131055 & 256) != 0 ? callSessionV2AEQbTJ.callType : null, (131055 & 512) != 0 ? callSessionV2AEQbTJ.mediaType : null, (131055 & 1024) != 0 ? callSessionV2AEQbTJ.meetingId : null, (131055 & 2048) != 0 ? callSessionV2AEQbTJ.nonLoginUserId : null, (131055 & 4096) != 0 ? callSessionV2AEQbTJ.nonLoginUUID : null, (131055 & 8192) != 0 ? callSessionV2AEQbTJ.createdAt : 0L, (131055 & 16384) != 0 ? callSessionV2AEQbTJ.agoraGroupChannelName : null, (32768 & 131055) != 0 ? callSessionV2AEQbTJ.groupId : null, (131055 & 65536) != 0 ? callSessionV2AEQbTJ.isGroupCallInitiator : false);
        Application application2 = this.KWHzl;
        if (application2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            application = application2;
        }
        application.AEQbTJ(new AbstractC35264nrz.Application(callSessionV2KWHzl));
        return Unit.INSTANCE;
    }

    @Override // o.C35220nrH.ActionBar
    public void OLrzqt(@NotNull AbstractC35238nrZ.Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "");
        Function0<? extends CallStateV2> function0 = this.AEQbTJ;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        CallSessionV2 callSessionV2AEQbTJ = function0.invoke().AEQbTJ();
        if (!Intrinsics.EZpvd((java.lang.Object) (callSessionV2AEQbTJ != null ? callSessionV2AEQbTJ.valueOf() : null), (java.lang.Object) dialog.copydefault())) {
            AEQbTJ("handleGroupCallParticipantsUpdated: Not in this group call, ignoring");
            return;
        }
        AEQbTJ("handleGroupCallParticipantsUpdated: activeUsers=" + dialog.EZpvd().size() + ", targetUids=" + dialog.KWHzl().size());
        KWHzl(dialog.EZpvd(), dialog.AEQbTJ(), dialog.KWHzl());
    }

    @Override // o.C35220nrH.ActionBar
    public void copydefault(@NotNull AbstractC35238nrZ.FragmentManager fragmentManager) {
        CoroutineScope coroutineScope;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Function0<? extends CallStateV2> function0 = this.AEQbTJ;
        Application application = null;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        CallStateV2 callStateV2Invoke = function0.invoke();
        CallSessionV2 callSessionV2AEQbTJ = callStateV2Invoke.AEQbTJ();
        if (Intrinsics.EZpvd((java.lang.Object) (callSessionV2AEQbTJ != null ? callSessionV2AEQbTJ.valueOf() : null), (java.lang.Object) fragmentManager.OLrzqt())) {
            if (callStateV2Invoke instanceof CallStateV2.Ringing) {
                AEQbTJ("handleGroupCallEnded: Dismissing incoming UI");
                Application application2 = this.KWHzl;
                if (application2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    application = application2;
                }
                application.AEQbTJ(AbstractC35264nrz.SharedElementCallback.OLrzqt);
                return;
            }
            if (callStateV2Invoke instanceof CallStateV2.Disconnected) {
                AEQbTJ("handleGroupCallEnded: Already disconnected, clearing participation");
                AEQbTJ();
                return;
            }
            AEQbTJ("handleGroupCallEnded: Leaving group call");
            CoroutineScope coroutineScope2 = this.AhwBna;
            if (coroutineScope2 == null) {
                Intrinsics.gEmmrt("");
                coroutineScope = null;
            } else {
                coroutineScope = coroutineScope2;
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GroupCallManager$handleGroupCallEnded$1(this, null), 3, null);
        }
    }

    public final void EZpvd(CallSessionV2 callSessionV2) {
        java.lang.String strValueOf = callSessionV2.valueOf();
        if (strValueOf == null) {
            return;
        }
        long jOLrzqt = callSessionV2.OLrzqt();
        Activity activity = this.EZpvd;
        if (activity == null) {
            Intrinsics.gEmmrt("");
            activity = null;
        }
        activity.copydefault(new C35233nrU(strValueOf, jOLrzqt));
    }

    public final void AEQbTJ() {
        Activity activity = this.EZpvd;
        if (activity == null) {
            Intrinsics.gEmmrt("");
            activity = null;
        }
        activity.copydefault(null);
    }

    public final void AEQbTJ(java.lang.String str) {
        C44124sEe.imLogVoiceCall$default("GroupCallManager: " + str, null, 2, null);
    }
}
