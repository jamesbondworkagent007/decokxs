package o;

import com.okinc.im.imui.group.join.model.JoinGroupDisplayModel;
import com.okinc.im.usecase.group.invite.QueryGroupInviteUseCase$execute$1;
import com.okinc.im.usecase.group.invite.QueryGroupInviteUseCase$execute$2$1;
import com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo;
import com.okinc.okimcore.model.remote.GroupInvitationInfoResponse;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.sOD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDL {
    public final CoroutineDispatcher AEQbTJ;
    public final sIR copydefault;

    @yCM
    public oDL(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = sir;
        this.AEQbTJ = coroutineDispatcher;
    }

    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oDL.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static final class Application extends ActionBar {
            public static final int OLrzqt = ((GroupInvitationInfoResponse.PaidGroupPreview.$stable | GroupInvitationInfoResponse.GroupOwnerInfo.$stable) | GroupEntryAssetVerificationInfo.$stable) | OfficialTagInfo.$stable;
            public final JoinGroupDisplayModel EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, JoinGroupDisplayModel joinGroupDisplayModel, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    joinGroupDisplayModel = application.EZpvd;
                }
                return application.KWHzl(joinGroupDisplayModel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final JoinGroupDisplayModel EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(@NotNull JoinGroupDisplayModel joinGroupDisplayModel) {
                Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
                return new Application(joinGroupDisplayModel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.EZpvd, ((Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(data=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull JoinGroupDisplayModel joinGroupDisplayModel) {
                super(null);
                Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
                this.EZpvd = joinGroupDisplayModel;
            }
        }

        public static final class Activity extends ActionBar {
            public final java.lang.Throwable KWHzl;
            public final int copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, int i, java.lang.Throwable th, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = activity.copydefault;
                }
                if ((i2 & 2) != 0) {
                    th = activity.KWHzl;
                }
                return activity.copydefault(i, th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity copydefault(int i, @NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new Activity(i, th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return this.copydefault == activity.copydefault && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (java.lang.Integer.hashCode(this.copydefault) * 31) + this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(code=" + this.copydefault + ", error=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(int i, @NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.copydefault = i;
                this.KWHzl = th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        QueryGroupInviteUseCase$execute$1 queryGroupInviteUseCase$execute$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof QueryGroupInviteUseCase$execute$1) {
            queryGroupInviteUseCase$execute$1 = (QueryGroupInviteUseCase$execute$1) continuation;
            int i = queryGroupInviteUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                queryGroupInviteUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                queryGroupInviteUseCase$execute$1 = new QueryGroupInviteUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = queryGroupInviteUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = queryGroupInviteUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
                QueryGroupInviteUseCase$execute$2$1 queryGroupInviteUseCase$execute$2$1 = new QueryGroupInviteUseCase$execute$2$1(this, str, null);
                queryGroupInviteUseCase$execute$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, queryGroupInviteUseCase$execute$2$1, queryGroupInviteUseCase$execute$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((ActionBar) objWithContext);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        return thM7380exceptionOrNullimpl == null ? objM7377constructorimpl : new ActionBar.Activity(-1, thM7380exceptionOrNullimpl);
    }

    public final ActionBar.Application EZpvd(sOD.TaskDescription taskDescription) {
        return new ActionBar.Application(KWHzl(taskDescription));
    }

    public final JoinGroupDisplayModel KWHzl(sOD.TaskDescription taskDescription) {
        return new JoinGroupDisplayModel(taskDescription.AhwBna(), taskDescription.gEmmrt(), taskDescription.KWHzl(), taskDescription.djBIcL(), taskDescription.fetchVPNInfo(), taskDescription.values(), !yDY.gEmmrt(GroupTagType.DEFAULT, GroupTagType.PAID_GROUP, GroupTagType.UNKNOWN).contains(taskDescription.djBIcL()) ? new OfficialTagInfo((java.util.List) null, (java.util.List) null, (java.util.List) null, C56402yEa.EZpvd(OfficialTagType.CREATOR.fromInHouseGroupTag(taskDescription.djBIcL())), 7, (DefaultConstructorMarker) null) : null, taskDescription.OLrzqt(), taskDescription.AEQbTJ(), taskDescription.copydefault(), taskDescription.EZpvd(), taskDescription.valueOf(), taskDescription.AYXKKw(), taskDescription.AkhnZx());
    }
}
