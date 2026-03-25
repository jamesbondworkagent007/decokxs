package o;

import com.okinc.im.imui.group.joinreview.displaymodel.JoinRequestDisplayModel;
import com.okinc.im.usecase.group.join.GetJoinGroupRequestsUseCase$invoke$1;
import com.okinc.im.usecase.group.join.GetJoinGroupRequestsUseCase$invoke$2$1;
import com.okinc.im.usecase.group.join.GetJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1;
import com.okinc.im.usecase.group.join.GetJoinGroupRequestsUseCase$toResult$1;
import com.okinc.im.widgets.AvatarInfo;
import com.okinc.okimcore.model.im.group.GroupApplicationStatus;
import com.okinc.okimcore.model.remote.ListGroupJoinApplicationsRequest;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.sOA;
import o.sOM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDJ {
    public final InterfaceC44177sGd AEQbTJ;
    public final sIR EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public oDJ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull sIR sir, @NotNull InterfaceC44177sGd interfaceC44177sGd) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = sir;
        this.AEQbTJ = interfaceC44177sGd;
    }

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oDJ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static final class StateListAnimator extends Application {
            public final int AEQbTJ;
            public final java.util.List<JoinRequestDisplayModel> EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oDJ$Application$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, java.util.List list, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = stateListAnimator.AEQbTJ;
                }
                if ((i2 & 2) != 0) {
                    list = stateListAnimator.EZpvd;
                }
                return stateListAnimator.copydefault(i, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.List<JoinRequestDisplayModel> copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(int i, @NotNull java.util.List<JoinRequestDisplayModel> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new StateListAnimator(i, list);
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
                return this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(totalItemCount=" + this.AEQbTJ + ", requests=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(int i, @NotNull java.util.List<JoinRequestDisplayModel> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.AEQbTJ = i;
                this.EZpvd = list;
            }
        }

        /* JADX INFO: renamed from: o.oDJ$Application$Application, reason: collision with other inner class name */
        public static final class C0899Application extends Application {
            public final java.lang.Throwable AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0899Application copy$default(C0899Application c0899Application, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = c0899Application.AEQbTJ;
                }
                return c0899Application.copydefault(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0899Application copydefault(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new C0899Application(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0899Application) && Intrinsics.EZpvd(this.AEQbTJ, ((C0899Application) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(error=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0899Application(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.AEQbTJ = th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(long j, java.lang.String str, GroupApplicationStatus groupApplicationStatus, java.lang.Integer num, @NotNull Continuation<? super Application> continuation) throws java.lang.Throwable {
        GetJoinGroupRequestsUseCase$invoke$1 getJoinGroupRequestsUseCase$invoke$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof GetJoinGroupRequestsUseCase$invoke$1) {
            getJoinGroupRequestsUseCase$invoke$1 = (GetJoinGroupRequestsUseCase$invoke$1) continuation;
            int i = getJoinGroupRequestsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getJoinGroupRequestsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getJoinGroupRequestsUseCase$invoke$1 = new GetJoinGroupRequestsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getJoinGroupRequestsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getJoinGroupRequestsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                ListGroupJoinApplicationsRequest listGroupJoinApplicationsRequest = new ListGroupJoinApplicationsRequest(j, str, groupApplicationStatus, num);
                CoroutineDispatcher coroutineDispatcher = this.copydefault;
                GetJoinGroupRequestsUseCase$invoke$2$1 getJoinGroupRequestsUseCase$invoke$2$1 = new GetJoinGroupRequestsUseCase$invoke$2$1(this, listGroupJoinApplicationsRequest, null);
                getJoinGroupRequestsUseCase$invoke$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, getJoinGroupRequestsUseCase$invoke$2$1, getJoinGroupRequestsUseCase$invoke$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Application.StateListAnimator) objWithContext);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return objM7377constructorimpl;
        }
        C44124sEe.AYXKKw("GetJoinGroupRequestsUseCase: Error fetching join group requests", thM7380exceptionOrNullimpl);
        return new Application.C0899Application(thM7380exceptionOrNullimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:30:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ac -> B:37:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(sOM.StateListAnimator stateListAnimator, Continuation<? super Application.StateListAnimator> continuation) throws java.lang.Throwable {
        GetJoinGroupRequestsUseCase$toResult$1 getJoinGroupRequestsUseCase$toResult$1;
        int iIntValue;
        java.util.Collection arrayList;
        java.util.Iterator it;
        oDJ odj;
        GetJoinGroupRequestsUseCase$toResult$1 getJoinGroupRequestsUseCase$toResult$12;
        int i;
        sOA.Application application;
        GetJoinGroupRequestsUseCase$toResult$1 getJoinGroupRequestsUseCase$toResult$13;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        JoinRequestDisplayModel joinRequestDisplayModel;
        if (continuation instanceof GetJoinGroupRequestsUseCase$toResult$1) {
            getJoinGroupRequestsUseCase$toResult$1 = (GetJoinGroupRequestsUseCase$toResult$1) continuation;
            int i2 = getJoinGroupRequestsUseCase$toResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getJoinGroupRequestsUseCase$toResult$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getJoinGroupRequestsUseCase$toResult$1 = new GetJoinGroupRequestsUseCase$toResult$1(this, continuation);
            }
        }
        java.lang.Object obj = getJoinGroupRequestsUseCase$toResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getJoinGroupRequestsUseCase$toResult$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.Integer numKWHzl = stateListAnimator.KWHzl();
            iIntValue = numKWHzl != null ? numKWHzl.intValue() : 0;
            java.util.List<sOA.Application> listEZpvd = stateListAnimator.EZpvd();
            arrayList = new java.util.ArrayList();
            it = listEZpvd.iterator();
            odj = this;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = getJoinGroupRequestsUseCase$toResult$1.I$0;
            sOA.Application application2 = (sOA.Application) getJoinGroupRequestsUseCase$toResult$1.L$4;
            java.util.Iterator it2 = (java.util.Iterator) getJoinGroupRequestsUseCase$toResult$1.L$3;
            java.util.Collection collection = (java.util.Collection) getJoinGroupRequestsUseCase$toResult$1.L$2;
            sOM.StateListAnimator stateListAnimator2 = (sOM.StateListAnimator) getJoinGroupRequestsUseCase$toResult$1.L$1;
            oDJ odj2 = (oDJ) getJoinGroupRequestsUseCase$toResult$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Throwable th) {
                th = th;
                getJoinGroupRequestsUseCase$toResult$12 = getJoinGroupRequestsUseCase$toResult$1;
                i = i4;
                stateListAnimator = stateListAnimator2;
                application = application2;
                getJoinGroupRequestsUseCase$toResult$13 = getJoinGroupRequestsUseCase$toResult$12;
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                joinRequestDisplayModel = (JoinRequestDisplayModel) objM7377constructorimpl;
                if (joinRequestDisplayModel != null) {
                }
                iIntValue = i;
                getJoinGroupRequestsUseCase$toResult$1 = getJoinGroupRequestsUseCase$toResult$13;
                it = it2;
                arrayList = collection;
                odj = odj2;
                if (it.hasNext()) {
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((JoinRequestDisplayModel) obj);
            GetJoinGroupRequestsUseCase$toResult$1 getJoinGroupRequestsUseCase$toResult$14 = getJoinGroupRequestsUseCase$toResult$1;
            i = i4;
            stateListAnimator = stateListAnimator2;
            application = application2;
            getJoinGroupRequestsUseCase$toResult$13 = getJoinGroupRequestsUseCase$toResult$14;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                C44124sEe.AYXKKw("GetJoinGroupRequestsUseCase: Error parsing join request for display, skipping. Application ID: " + application.KWHzl() + ", Member ID: " + application.AEQbTJ(), thM7380exceptionOrNullimpl);
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            joinRequestDisplayModel = (JoinRequestDisplayModel) objM7377constructorimpl;
            if (joinRequestDisplayModel != null) {
                collection.add(joinRequestDisplayModel);
            }
            iIntValue = i;
            getJoinGroupRequestsUseCase$toResult$1 = getJoinGroupRequestsUseCase$toResult$13;
            it = it2;
            arrayList = collection;
            odj = odj2;
            if (it.hasNext()) {
                application = (sOA.Application) it.next();
                try {
                } catch (java.lang.Throwable th2) {
                    getJoinGroupRequestsUseCase$toResult$12 = getJoinGroupRequestsUseCase$toResult$1;
                    i = iIntValue;
                    th = th2;
                    odj2 = odj;
                    collection = arrayList;
                    it2 = it;
                    getJoinGroupRequestsUseCase$toResult$13 = getJoinGroupRequestsUseCase$toResult$12;
                    Result.Application application32 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    }
                    joinRequestDisplayModel = (JoinRequestDisplayModel) objM7377constructorimpl;
                    if (joinRequestDisplayModel != null) {
                    }
                    iIntValue = i;
                    getJoinGroupRequestsUseCase$toResult$1 = getJoinGroupRequestsUseCase$toResult$13;
                    it = it2;
                    arrayList = collection;
                    odj = odj2;
                    if (it.hasNext()) {
                    }
                }
                Result.Application application4 = Result.Companion;
                getJoinGroupRequestsUseCase$toResult$1.L$0 = odj;
                getJoinGroupRequestsUseCase$toResult$1.L$1 = stateListAnimator;
                getJoinGroupRequestsUseCase$toResult$1.L$2 = arrayList;
                getJoinGroupRequestsUseCase$toResult$1.L$3 = it;
                getJoinGroupRequestsUseCase$toResult$1.L$4 = application;
                getJoinGroupRequestsUseCase$toResult$1.I$0 = iIntValue;
                getJoinGroupRequestsUseCase$toResult$1.label = 1;
                java.lang.Object objEZpvd = odj.EZpvd(application, getJoinGroupRequestsUseCase$toResult$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                stateListAnimator2 = stateListAnimator;
                i4 = iIntValue;
                obj = objEZpvd;
                odj2 = odj;
                collection = arrayList;
                it2 = it;
                application2 = application;
                objM7377constructorimpl = Result.m7377constructorimpl((JoinRequestDisplayModel) obj);
                GetJoinGroupRequestsUseCase$toResult$1 getJoinGroupRequestsUseCase$toResult$142 = getJoinGroupRequestsUseCase$toResult$1;
                i = i4;
                stateListAnimator = stateListAnimator2;
                application = application2;
                getJoinGroupRequestsUseCase$toResult$13 = getJoinGroupRequestsUseCase$toResult$142;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                joinRequestDisplayModel = (JoinRequestDisplayModel) objM7377constructorimpl;
                if (joinRequestDisplayModel != null) {
                }
                iIntValue = i;
                getJoinGroupRequestsUseCase$toResult$1 = getJoinGroupRequestsUseCase$toResult$13;
                it = it2;
                arrayList = collection;
                odj = odj2;
                if (it.hasNext()) {
                    return new Application.StateListAnimator(iIntValue, (java.util.List) arrayList);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(sOA.Application application, Continuation<? super JoinRequestDisplayModel> continuation) throws java.lang.Throwable {
        GetJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1 getJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1;
        java.lang.String str;
        java.lang.String strCopydefault;
        if (continuation instanceof GetJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1) {
            getJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1 = (GetJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1) continuation;
            int i = getJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1.label = i - Integer.MIN_VALUE;
            } else {
                getJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1 = new GetJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1(this, continuation);
            }
        }
        java.lang.Object obj = getJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String strKWHzl = application.KWHzl();
            if (strKWHzl == null) {
                throw new java.lang.IllegalArgumentException("Application ID cannot be null".toString());
            }
            java.lang.Long lAEQbTJ = application.AEQbTJ();
            if (lAEQbTJ == null) {
                throw new java.lang.IllegalArgumentException("Member ID cannot be null".toString());
            }
            long jLongValue = lAEQbTJ.longValue();
            InterfaceC44177sGd interfaceC44177sGd = this.AEQbTJ;
            getJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1.L$0 = application;
            getJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1.L$1 = strKWHzl;
            getJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1.label = 1;
            java.lang.Object objCopydefault2 = interfaceC44177sGd.copydefault(java.lang.String.valueOf(jLongValue), getJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            str = strKWHzl;
            obj = objCopydefault2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str2 = (java.lang.String) getJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1.L$1;
            sOA.Application application2 = (sOA.Application) getJoinGroupRequestsUseCase$toJoinRequestDisplayModel$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str = str2;
            application = application2;
        }
        RelationInfo relationInfo = (RelationInfo) obj;
        if (relationInfo != null) {
            strCopydefault = C44157sFk.getDisplayName$default(relationInfo, null, 1, null);
        } else {
            strCopydefault = application.copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
        }
        java.lang.String strOLrzqt = application.OLrzqt();
        AvatarInfo avatarInfo = new AvatarInfo(strOLrzqt == null ? "" : strOLrzqt, strCopydefault, 0.0f, 4, null);
        java.lang.String strAhwBna = application.AhwBna();
        return new JoinRequestDisplayModel(str, avatarInfo, strCopydefault, strAhwBna == null ? "" : strAhwBna, false, false, 48, null);
    }
}
