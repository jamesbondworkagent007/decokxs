package o;

import com.okinc.im.usecase.group.announcement.CreateGroupAnnouncementUseCase$invoke$1;
import com.okinc.im.usecase.group.announcement.CreateGroupAnnouncementUseCase$invoke$2;
import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35789oDt {
    public final sIR KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C35789oDt(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = sir;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: invoke-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8702invokeBWLJW6A$default(C35789oDt c35789oDt, java.lang.String str, java.lang.String str2, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return c35789oDt.KWHzl(str, str2, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull Continuation<? super Result<GroupAnnouncementInfo>> continuation) throws java.lang.Throwable {
        CreateGroupAnnouncementUseCase$invoke$1 createGroupAnnouncementUseCase$invoke$1;
        if (continuation instanceof CreateGroupAnnouncementUseCase$invoke$1) {
            createGroupAnnouncementUseCase$invoke$1 = (CreateGroupAnnouncementUseCase$invoke$1) continuation;
            int i2 = createGroupAnnouncementUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createGroupAnnouncementUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                createGroupAnnouncementUseCase$invoke$1 = new CreateGroupAnnouncementUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = createGroupAnnouncementUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = createGroupAnnouncementUseCase$invoke$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            CreateGroupAnnouncementUseCase$invoke$2 createGroupAnnouncementUseCase$invoke$2 = new CreateGroupAnnouncementUseCase$invoke$2(this, str, str2, i, null);
            createGroupAnnouncementUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, createGroupAnnouncementUseCase$invoke$2, createGroupAnnouncementUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
