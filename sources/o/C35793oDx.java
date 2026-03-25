package o;

import com.okinc.im.usecase.group.announcement.GetGroupAnnouncementListUseCase$invoke$1;
import com.okinc.im.usecase.group.announcement.GetGroupAnnouncementListUseCase$invoke$2;
import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35793oDx {
    public final sIR KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C35793oDx(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = sir;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<StateListAnimator>> continuation) throws java.lang.Throwable {
        GetGroupAnnouncementListUseCase$invoke$1 getGroupAnnouncementListUseCase$invoke$1;
        if (continuation instanceof GetGroupAnnouncementListUseCase$invoke$1) {
            getGroupAnnouncementListUseCase$invoke$1 = (GetGroupAnnouncementListUseCase$invoke$1) continuation;
            int i = getGroupAnnouncementListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getGroupAnnouncementListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getGroupAnnouncementListUseCase$invoke$1 = new GetGroupAnnouncementListUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getGroupAnnouncementListUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getGroupAnnouncementListUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            GetGroupAnnouncementListUseCase$invoke$2 getGroupAnnouncementListUseCase$invoke$2 = new GetGroupAnnouncementListUseCase$invoke$2(this, str, null);
            getGroupAnnouncementListUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getGroupAnnouncementListUseCase$invoke$2, getGroupAnnouncementListUseCase$invoke$1);
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

    /* JADX INFO: renamed from: o.oDx$StateListAnimator */
    public static final class StateListAnimator {
        public final int KWHzl;
        public final java.util.List<GroupAnnouncementInfo> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oDx$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                list = stateListAnimator.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                i = stateListAnimator.KWHzl;
            }
            return stateListAnimator.AEQbTJ(list, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull java.util.List<GroupAnnouncementInfo> list, int i) {
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(list, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<GroupAnnouncementInfo> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && this.KWHzl == stateListAnimator.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AnnouncementListResult(announcements=" + this.OLrzqt + ", maxLimit=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull java.util.List<GroupAnnouncementInfo> list, int i) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
            this.KWHzl = i;
        }
    }
}
