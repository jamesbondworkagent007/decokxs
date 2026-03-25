package o;

import com.okinc.im.usecase.group.announcement.DeleteGroupAnnouncementsUseCase$invoke$1;
import com.okinc.im.usecase.group.announcement.DeleteGroupAnnouncementsUseCase$invoke$2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35794oDy {
    public final sIR KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C35794oDy(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = sir;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super Result<Unit>> continuation) {
        DeleteGroupAnnouncementsUseCase$invoke$1 deleteGroupAnnouncementsUseCase$invoke$1;
        if (continuation instanceof DeleteGroupAnnouncementsUseCase$invoke$1) {
            deleteGroupAnnouncementsUseCase$invoke$1 = (DeleteGroupAnnouncementsUseCase$invoke$1) continuation;
            int i = deleteGroupAnnouncementsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteGroupAnnouncementsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteGroupAnnouncementsUseCase$invoke$1 = new DeleteGroupAnnouncementsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = deleteGroupAnnouncementsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteGroupAnnouncementsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            DeleteGroupAnnouncementsUseCase$invoke$2 deleteGroupAnnouncementsUseCase$invoke$2 = new DeleteGroupAnnouncementsUseCase$invoke$2(this, str, list, null);
            deleteGroupAnnouncementsUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, deleteGroupAnnouncementsUseCase$invoke$2, deleteGroupAnnouncementsUseCase$invoke$1);
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
