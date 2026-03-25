package o;

import com.okinc.im.usecase.group.announcement.EditGroupAnnouncementUseCase$invoke$1;
import com.okinc.im.usecase.group.announcement.EditGroupAnnouncementUseCase$invoke$2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35791oDv {
    public final sIR EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C35791oDv(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = sir;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: invoke-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8703invokeyxL6bBk$default(C35791oDv c35791oDv, java.lang.String str, long j, java.lang.String str2, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            bool = null;
        }
        return c35791oDv.EZpvd(str, j, str2, bool, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, java.lang.Boolean bool, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        EditGroupAnnouncementUseCase$invoke$1 editGroupAnnouncementUseCase$invoke$1;
        if (continuation instanceof EditGroupAnnouncementUseCase$invoke$1) {
            editGroupAnnouncementUseCase$invoke$1 = (EditGroupAnnouncementUseCase$invoke$1) continuation;
            int i = editGroupAnnouncementUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                editGroupAnnouncementUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                editGroupAnnouncementUseCase$invoke$1 = new EditGroupAnnouncementUseCase$invoke$1(this, continuation);
            }
        }
        EditGroupAnnouncementUseCase$invoke$1 editGroupAnnouncementUseCase$invoke$12 = editGroupAnnouncementUseCase$invoke$1;
        java.lang.Object objWithContext = editGroupAnnouncementUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = editGroupAnnouncementUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            EditGroupAnnouncementUseCase$invoke$2 editGroupAnnouncementUseCase$invoke$2 = new EditGroupAnnouncementUseCase$invoke$2(this, str, j, str2, bool, null);
            editGroupAnnouncementUseCase$invoke$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, editGroupAnnouncementUseCase$invoke$2, editGroupAnnouncementUseCase$invoke$12);
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
