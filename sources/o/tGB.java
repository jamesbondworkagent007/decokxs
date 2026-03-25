package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_positions.ProfilePositionsHistoryViewModel;
import com.okinc.planet.biz_positions.data.ProfilePositionHistoryDto;
import com.okinc.planet.biz_positions.domain.FetchHistoryFuturePositionUseCase$execute$1;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.tQP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tGB extends tQX<TaskDescription, C46068tGq> {
    public final CoroutineDispatcher EZpvd;
    public final tQP KWHzl;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ProfilePositionsHistoryViewModel.SortType.values().length];
            try {
                iArr[ProfilePositionsHistoryViewModel.SortType.RECENTLY_CLOSED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ProfilePositionsHistoryViewModel.SortType.HIGHEST_PROFIT_RATIO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfilePositionsHistoryViewModel.SortType.LOWEST_PROFIT_RATIO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tGB(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull tQP tqp) {
        super(coroutineDispatcher, 0, 2, null);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(tqp, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = tqp;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.tQX
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull TaskDescription taskDescription, @NotNull Continuation<? super java.util.List<C46068tGq>> continuation) throws java.lang.Throwable {
        FetchHistoryFuturePositionUseCase$execute$1 fetchHistoryFuturePositionUseCase$execute$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof FetchHistoryFuturePositionUseCase$execute$1) {
            fetchHistoryFuturePositionUseCase$execute$1 = (FetchHistoryFuturePositionUseCase$execute$1) continuation;
            int i = fetchHistoryFuturePositionUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchHistoryFuturePositionUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchHistoryFuturePositionUseCase$execute$1 = new FetchHistoryFuturePositionUseCase$execute$1(this, continuation);
            }
        }
        FetchHistoryFuturePositionUseCase$execute$1 fetchHistoryFuturePositionUseCase$execute$12 = fetchHistoryFuturePositionUseCase$execute$1;
        java.lang.Object historyFuturePosition$default = fetchHistoryFuturePositionUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchHistoryFuturePositionUseCase$execute$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(historyFuturePosition$default);
                EZpvd(taskDescription.OLrzqt());
                if (!taskDescription.gEmmrt()) {
                    copydefault();
                }
                tQP tqp = this.KWHzl;
                java.lang.String strDjBIcL = taskDescription.djBIcL();
                int iOLrzqt = taskDescription.OLrzqt();
                java.lang.String strEZpvd = taskDescription.EZpvd();
                java.lang.String strAEQbTJ = taskDescription.AEQbTJ();
                java.lang.String strCopydefault = taskDescription.copydefault();
                java.lang.String strAEQbTJ2 = AEQbTJ(taskDescription.KWHzl());
                fetchHistoryFuturePositionUseCase$execute$12.label = 1;
                historyFuturePosition$default = tQP.Application.getHistoryFuturePosition$default(tqp, strDjBIcL, java.lang.String.valueOf(iOLrzqt), strEZpvd, null, strAEQbTJ, strCopydefault, strAEQbTJ2, fetchHistoryFuturePositionUseCase$execute$12, 8, null);
                if (historyFuturePosition$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(historyFuturePosition$default);
            }
            ResponseData responseData = (ResponseData) historyFuturePosition$default;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        java.lang.Iterable iterable = (java.lang.Iterable) actionBar.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new C46070tGs().AEQbTJ((ProfilePositionHistoryDto) it.next()));
        }
        return arrayList;
    }

    public final java.lang.String AEQbTJ(ProfilePositionsHistoryViewModel.SortType sortType) {
        int i = Activity.EZpvd[sortType.ordinal()];
        if (i == 1) {
            return "1";
        }
        if (i == 2) {
            return "4";
        }
        if (i == 3) {
            return "5";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription {
        public final boolean AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final int copydefault;
        public final ProfilePositionsHistoryViewModel.SortType djBIcL;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 com.okinc.planet.biz_positions.ProfilePositionsHistoryViewModel$SortType)
  (r7v0 boolean)
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.biz_positions.ProfilePositionsHistoryViewModel$SortType, boolean):void (m)] call: o.tGB.TaskDescription.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.biz_positions.ProfilePositionsHistoryViewModel$SortType, boolean):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, ProfilePositionsHistoryViewModel.SortType sortType, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, str3, str4, sortType, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-rw59CZk$default, reason: not valid java name */
        public static /* synthetic */ TaskDescription m8716copyrw59CZk$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, ProfilePositionsHistoryViewModel.SortType sortType, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = taskDescription.valueOf;
            }
            if ((i2 & 2) != 0) {
                i = taskDescription.copydefault;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                str2 = taskDescription.EZpvd;
            }
            java.lang.String str5 = str2;
            if ((i2 & 8) != 0) {
                str3 = taskDescription.OLrzqt;
            }
            java.lang.String str6 = str3;
            if ((i2 & 16) != 0) {
                str4 = taskDescription.KWHzl;
            }
            java.lang.String str7 = str4;
            if ((i2 & 32) != 0) {
                sortType = taskDescription.djBIcL;
            }
            ProfilePositionsHistoryViewModel.SortType sortType2 = sortType;
            if ((i2 & 64) != 0) {
                z = taskDescription.AEQbTJ;
            }
            return taskDescription.EZpvd(str, i3, str5, str6, str7, sortType2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull ProfilePositionsHistoryViewModel.SortType sortType, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(sortType, "");
            return new TaskDescription(str, i, str2, str3, str4, sortType, z, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ProfilePositionsHistoryViewModel.SortType KWHzl() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return PlanetUniqueName.KWHzl(this.valueOf, taskDescription.valueOf) && this.copydefault == taskDescription.copydefault && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.KWHzl) && this.djBIcL == taskDescription.djBIcL && this.AEQbTJ == taskDescription.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iOLrzqt = PlanetUniqueName.OLrzqt(this.valueOf);
            int iHashCode = java.lang.Integer.hashCode(this.copydefault);
            java.lang.String str = this.EZpvd;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.OLrzqt;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.KWHzl;
            return (((((((((((iOLrzqt * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(uniqueName=" + PlanetUniqueName.copydefault(this.valueOf) + ", limit=" + this.copydefault + ", after=" + this.EZpvd + ", instType=" + this.OLrzqt + ", instId=" + this.KWHzl + ", sortType=" + this.djBIcL + ", isLoadMore=" + this.AEQbTJ + ")";
        }

        public TaskDescription(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, ProfilePositionsHistoryViewModel.SortType sortType, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(sortType, "");
            this.valueOf = str;
            this.copydefault = i;
            this.EZpvd = str2;
            this.OLrzqt = str3;
            this.KWHzl = str4;
            this.djBIcL = sortType;
            this.AEQbTJ = z;
        }
    }
}
