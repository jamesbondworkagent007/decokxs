package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_positions.data.LatestRecordDto;
import com.okinc.planet.biz_positions.domain.FetchLatestRecordsUseCase$execute$1;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import com.okinc.planet.format.InstId;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tGA extends tQX<Activity, LatestRecordDto> {
    public final java.util.Set<java.lang.String> AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final tQP KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tGA(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull tQP tqp) {
        super(coroutineDispatcher, 0, 2, null);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(tqp, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = tqp;
        this.AEQbTJ = yEE.AhwBna("FUTURES", "SWAP", "OPTION", "MARGIN", "SPOT");
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:40:0x00d9, B:42:0x00e1, B:44:0x00e7, B:45:0x00f4, B:33:0x009b, B:37:0x00af), top: B:50:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:40:0x00d9, B:42:0x00e1, B:44:0x00e7, B:45:0x00f4, B:33:0x009b, B:37:0x00af), top: B:50:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.tQX
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Activity activity, @NotNull Continuation<? super java.util.List<LatestRecordDto>> continuation) throws java.lang.Throwable {
        FetchLatestRecordsUseCase$execute$1 fetchLatestRecordsUseCase$execute$1;
        AbstractC43419rot actionBar;
        Activity activity2;
        tGA tga;
        tGA tga2;
        ResponseData responseData;
        if (continuation instanceof FetchLatestRecordsUseCase$execute$1) {
            fetchLatestRecordsUseCase$execute$1 = (FetchLatestRecordsUseCase$execute$1) continuation;
            int i = fetchLatestRecordsUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchLatestRecordsUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchLatestRecordsUseCase$execute$1 = new FetchLatestRecordsUseCase$execute$1(this, continuation);
            }
        }
        FetchLatestRecordsUseCase$execute$1 fetchLatestRecordsUseCase$execute$12 = fetchLatestRecordsUseCase$execute$1;
        java.lang.Object objAEQbTJ = fetchLatestRecordsUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchLatestRecordsUseCase$execute$12.label;
        try {
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            C46392tSq c46392tSq = C46392tSq.EZpvd;
            fetchLatestRecordsUseCase$execute$12.L$0 = this;
            activity2 = activity;
            fetchLatestRecordsUseCase$execute$12.L$1 = activity2;
            fetchLatestRecordsUseCase$execute$12.label = 1;
            if (c46392tSq.AEQbTJ(fetchLatestRecordsUseCase$execute$12) == objCopydefault) {
                return objCopydefault;
            }
            tga = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    responseData = (ResponseData) objAEQbTJ;
                    if (responseData.getCode() == 0 && responseData.getData() != null) {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                    return actionBar.AEQbTJ();
                }
                activity2 = (Activity) fetchLatestRecordsUseCase$execute$12.L$1;
                tga2 = (tGA) fetchLatestRecordsUseCase$execute$12.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                tga2.EZpvd(activity2.copydefault());
                if (activity2.OLrzqt()) {
                    tga2.copydefault();
                }
                java.lang.String strAEQbTJ = tga2.AEQbTJ(activity2.AEQbTJ());
                tQP tqp = tga2.KWHzl;
                java.lang.String strKWHzl = activity2.KWHzl();
                int iOLrzqt = tga2.OLrzqt();
                java.lang.String strEZpvd = activity2.EZpvd();
                java.lang.String str = strEZpvd != null ? null : strEZpvd;
                java.lang.String strKWHzl2 = tga2.KWHzl();
                int iEZpvd = tga2.EZpvd();
                java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(iOLrzqt);
                java.lang.Integer numAEQbTJ2 = C56443yFo.AEQbTJ(iEZpvd);
                fetchLatestRecordsUseCase$execute$12.L$0 = null;
                fetchLatestRecordsUseCase$execute$12.L$1 = null;
                fetchLatestRecordsUseCase$execute$12.label = 3;
                objAEQbTJ = tqp.AEQbTJ(strKWHzl, str, strAEQbTJ, strKWHzl2, null, null, null, numAEQbTJ, numAEQbTJ2, fetchLatestRecordsUseCase$execute$12);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objAEQbTJ;
                if (responseData.getCode() == 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
                return actionBar.AEQbTJ();
            }
            activity2 = (Activity) fetchLatestRecordsUseCase$execute$12.L$1;
            tga = (tGA) fetchLatestRecordsUseCase$execute$12.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        C46392tSq c46392tSq2 = C46392tSq.EZpvd;
        java.util.Set<java.lang.String> set = tga.AEQbTJ;
        fetchLatestRecordsUseCase$execute$12.L$0 = tga;
        fetchLatestRecordsUseCase$execute$12.L$1 = activity2;
        fetchLatestRecordsUseCase$execute$12.label = 2;
        if (c46392tSq2.EZpvd(set, fetchLatestRecordsUseCase$execute$12) == objCopydefault) {
            return objCopydefault;
        }
        tga2 = tga;
        tga2.EZpvd(activity2.copydefault());
        if (activity2.OLrzqt()) {
        }
        java.lang.String strAEQbTJ2 = tga2.AEQbTJ(activity2.AEQbTJ());
        tQP tqp2 = tga2.KWHzl;
        java.lang.String strKWHzl3 = activity2.KWHzl();
        int iOLrzqt2 = tga2.OLrzqt();
        java.lang.String strEZpvd2 = activity2.EZpvd();
        if (strEZpvd2 != null) {
        }
        java.lang.String strKWHzl22 = tga2.KWHzl();
        int iEZpvd2 = tga2.EZpvd();
        java.lang.Integer numAEQbTJ3 = C56443yFo.AEQbTJ(iOLrzqt2);
        java.lang.Integer numAEQbTJ22 = C56443yFo.AEQbTJ(iEZpvd2);
        fetchLatestRecordsUseCase$execute$12.L$0 = null;
        fetchLatestRecordsUseCase$execute$12.L$1 = null;
        fetchLatestRecordsUseCase$execute$12.label = 3;
        objAEQbTJ = tqp2.AEQbTJ(strKWHzl3, str, strAEQbTJ2, strKWHzl22, null, null, null, numAEQbTJ3, numAEQbTJ22, fetchLatestRecordsUseCase$execute$12);
        if (objAEQbTJ == objCopydefault) {
        }
        responseData = (ResponseData) objAEQbTJ;
        if (responseData.getCode() == 0) {
        }
        return actionBar.AEQbTJ();
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.AEQbTJ.contains(str)) {
            return str;
        }
        return null;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final boolean EZpvd;
        public final java.lang.String KWHzl;
        public final int OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String), (r3v0 java.lang.String), (r4v0 boolean), (r5v0 int) A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, int):void (m)] call: o.tGA.Activity.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, int):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-ZAGJ_ns$default, reason: not valid java name */
        public static /* synthetic */ Activity m8715copyZAGJ_ns$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = activity.copydefault;
            }
            if ((i2 & 2) != 0) {
                str2 = activity.AEQbTJ;
            }
            java.lang.String str4 = str2;
            if ((i2 & 4) != 0) {
                str3 = activity.KWHzl;
            }
            java.lang.String str5 = str3;
            if ((i2 & 8) != 0) {
                z = activity.EZpvd;
            }
            boolean z2 = z;
            if ((i2 & 16) != 0) {
                i = activity.OLrzqt;
            }
            return activity.KWHzl(str, str4, str5, z2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, boolean z, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new Activity(str, str2, str3, z, i, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.OLrzqt;
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
            if (!PlanetUniqueName.KWHzl(this.copydefault, activity.copydefault)) {
                return false;
            }
            java.lang.String str = this.AEQbTJ;
            java.lang.String str2 = activity.AEQbTJ;
            if (str != null ? str2 != null && InstId.copydefault(str, str2) : str2 == null) {
                return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && this.EZpvd == activity.EZpvd && this.OLrzqt == activity.OLrzqt;
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iOLrzqt = PlanetUniqueName.OLrzqt(this.copydefault);
            java.lang.String str = this.AEQbTJ;
            return (((((((iOLrzqt * 31) + (str == null ? 0 : InstId.OLrzqt(str))) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String strCopydefault = PlanetUniqueName.copydefault(this.copydefault);
            java.lang.String str = this.AEQbTJ;
            return "Params(uniqueName=" + strCopydefault + ", instId=" + (str == null ? AbstractJsonLexerKt.NULL : InstId.AEQbTJ(str)) + ", instType=" + this.KWHzl + ", reset=" + this.EZpvd + ", size=" + this.OLrzqt + ")";
        }

        public Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.copydefault = str;
            this.AEQbTJ = str2;
            this.KWHzl = str3;
            this.EZpvd = z;
            this.OLrzqt = i;
        }
    }
}
