package o;

import com.okinc.im.usecase.group.UpdateGroupSettingsUseCase$modifyGroupConversationDndSetting$1;
import com.okinc.im.usecase.group.UpdateGroupSettingsUseCase$modifyGroupConversationDndSetting$2;
import com.okinc.im.usecase.group.UpdateGroupSettingsUseCase$modifyGroupPrivateChatStatus$2;
import com.okinc.im.usecase.group.UpdateGroupSettingsUseCase$modifyInvitePermissionSettings$2;
import com.okinc.im.usecase.group.UpdateGroupSettingsUseCase$modifyMentionOthersStatus$2;
import com.okinc.im.usecase.group.UpdateGroupSettingsUseCase$modifyMuteStatus$2;
import com.okinc.im.usecase.group.UpdateGroupSettingsUseCase$modifyPinConversationSetting$1;
import com.okinc.im.usecase.group.UpdateGroupSettingsUseCase$modifyPinConversationSetting$2;
import com.okinc.im.usecase.group.UpdateGroupSettingsUseCase$modifyRequireAdminApprovalToJoinStatus$2;
import com.okinc.im.usecase.group.UpdateGroupSettingsUseCase$performDeleteGroup$1;
import com.okinc.im.usecase.group.UpdateGroupSettingsUseCase$performDeleteGroup$2;
import com.okinc.im.usecase.group.UpdateGroupSettingsUseCase$performExitGroup$1;
import com.okinc.im.usecase.group.UpdateGroupSettingsUseCase$performExitGroup$2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35782oDm {
    public final sGF AEQbTJ;
    public final CoroutineDispatcher OLrzqt;
    public final sIR copydefault;

    @yCM
    public C35782oDm(@NotNull sIR sir, @NotNull sGF sgf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(sgf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = sir;
        this.AEQbTJ = sgf;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.OLrzqt, new UpdateGroupSettingsUseCase$modifyMuteStatus$2(this, str, z, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.OLrzqt, new UpdateGroupSettingsUseCase$modifyMentionOthersStatus$2(this, str, z, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final java.lang.Object AYXKKw(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.OLrzqt, new UpdateGroupSettingsUseCase$modifyRequireAdminApprovalToJoinStatus$2(this, str, z, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.OLrzqt, new UpdateGroupSettingsUseCase$modifyInvitePermissionSettings$2(this, str, bool, bool2, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.OLrzqt, new UpdateGroupSettingsUseCase$modifyGroupPrivateChatStatus$2(this, str, z, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        UpdateGroupSettingsUseCase$modifyGroupConversationDndSetting$1 updateGroupSettingsUseCase$modifyGroupConversationDndSetting$1;
        if (continuation instanceof UpdateGroupSettingsUseCase$modifyGroupConversationDndSetting$1) {
            updateGroupSettingsUseCase$modifyGroupConversationDndSetting$1 = (UpdateGroupSettingsUseCase$modifyGroupConversationDndSetting$1) continuation;
            int i = updateGroupSettingsUseCase$modifyGroupConversationDndSetting$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateGroupSettingsUseCase$modifyGroupConversationDndSetting$1.label = i - Integer.MIN_VALUE;
            } else {
                updateGroupSettingsUseCase$modifyGroupConversationDndSetting$1 = new UpdateGroupSettingsUseCase$modifyGroupConversationDndSetting$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = updateGroupSettingsUseCase$modifyGroupConversationDndSetting$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateGroupSettingsUseCase$modifyGroupConversationDndSetting$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            UpdateGroupSettingsUseCase$modifyGroupConversationDndSetting$2 updateGroupSettingsUseCase$modifyGroupConversationDndSetting$2 = new UpdateGroupSettingsUseCase$modifyGroupConversationDndSetting$2(this, str, z, null);
            updateGroupSettingsUseCase$modifyGroupConversationDndSetting$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, updateGroupSettingsUseCase$modifyGroupConversationDndSetting$2, updateGroupSettingsUseCase$modifyGroupConversationDndSetting$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        UpdateGroupSettingsUseCase$modifyPinConversationSetting$1 updateGroupSettingsUseCase$modifyPinConversationSetting$1;
        if (continuation instanceof UpdateGroupSettingsUseCase$modifyPinConversationSetting$1) {
            updateGroupSettingsUseCase$modifyPinConversationSetting$1 = (UpdateGroupSettingsUseCase$modifyPinConversationSetting$1) continuation;
            int i = updateGroupSettingsUseCase$modifyPinConversationSetting$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateGroupSettingsUseCase$modifyPinConversationSetting$1.label = i - Integer.MIN_VALUE;
            } else {
                updateGroupSettingsUseCase$modifyPinConversationSetting$1 = new UpdateGroupSettingsUseCase$modifyPinConversationSetting$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = updateGroupSettingsUseCase$modifyPinConversationSetting$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateGroupSettingsUseCase$modifyPinConversationSetting$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            UpdateGroupSettingsUseCase$modifyPinConversationSetting$2 updateGroupSettingsUseCase$modifyPinConversationSetting$2 = new UpdateGroupSettingsUseCase$modifyPinConversationSetting$2(this, str, z, null);
            updateGroupSettingsUseCase$modifyPinConversationSetting$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, updateGroupSettingsUseCase$modifyPinConversationSetting$2, updateGroupSettingsUseCase$modifyPinConversationSetting$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        UpdateGroupSettingsUseCase$performExitGroup$1 updateGroupSettingsUseCase$performExitGroup$1;
        if (continuation instanceof UpdateGroupSettingsUseCase$performExitGroup$1) {
            updateGroupSettingsUseCase$performExitGroup$1 = (UpdateGroupSettingsUseCase$performExitGroup$1) continuation;
            int i = updateGroupSettingsUseCase$performExitGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateGroupSettingsUseCase$performExitGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                updateGroupSettingsUseCase$performExitGroup$1 = new UpdateGroupSettingsUseCase$performExitGroup$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = updateGroupSettingsUseCase$performExitGroup$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateGroupSettingsUseCase$performExitGroup$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            UpdateGroupSettingsUseCase$performExitGroup$2 updateGroupSettingsUseCase$performExitGroup$2 = new UpdateGroupSettingsUseCase$performExitGroup$2(this, str, null);
            updateGroupSettingsUseCase$performExitGroup$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, updateGroupSettingsUseCase$performExitGroup$2, updateGroupSettingsUseCase$performExitGroup$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        UpdateGroupSettingsUseCase$performDeleteGroup$1 updateGroupSettingsUseCase$performDeleteGroup$1;
        if (continuation instanceof UpdateGroupSettingsUseCase$performDeleteGroup$1) {
            updateGroupSettingsUseCase$performDeleteGroup$1 = (UpdateGroupSettingsUseCase$performDeleteGroup$1) continuation;
            int i = updateGroupSettingsUseCase$performDeleteGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateGroupSettingsUseCase$performDeleteGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                updateGroupSettingsUseCase$performDeleteGroup$1 = new UpdateGroupSettingsUseCase$performDeleteGroup$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = updateGroupSettingsUseCase$performDeleteGroup$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateGroupSettingsUseCase$performDeleteGroup$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            UpdateGroupSettingsUseCase$performDeleteGroup$2 updateGroupSettingsUseCase$performDeleteGroup$2 = new UpdateGroupSettingsUseCase$performDeleteGroup$2(this, str, null);
            updateGroupSettingsUseCase$performDeleteGroup$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, updateGroupSettingsUseCase$performDeleteGroup$2, updateGroupSettingsUseCase$performDeleteGroup$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
