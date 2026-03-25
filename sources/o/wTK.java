package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.dto.BillsArchive;
import com.okinc.tradingbot.impl.usecase.bot.FetchAccountBillsUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wTK extends vNH<Activity, java.util.List<? extends BillsArchive>> {
    public final InterfaceC50055vAf KWHzl;
    public final CoroutineDispatcher OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public wTK(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = interfaceC50055vAf;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Activity activity, @NotNull Continuation<? super java.util.List<BillsArchive>> continuation) throws java.lang.Throwable {
        FetchAccountBillsUseCase$execute$1 fetchAccountBillsUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof FetchAccountBillsUseCase$execute$1) {
            fetchAccountBillsUseCase$execute$1 = (FetchAccountBillsUseCase$execute$1) continuation;
            int i = fetchAccountBillsUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchAccountBillsUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchAccountBillsUseCase$execute$1 = new FetchAccountBillsUseCase$execute$1(this, continuation);
            }
        }
        FetchAccountBillsUseCase$execute$1 fetchAccountBillsUseCase$execute$12 = fetchAccountBillsUseCase$execute$1;
        java.lang.Object objAEQbTJ = fetchAccountBillsUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchAccountBillsUseCase$execute$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC50055vAf interfaceC50055vAf = this.KWHzl;
                java.lang.Long lAEQbTJ = activity.AEQbTJ();
                java.lang.String strKWHzl = activity.KWHzl();
                int iDjBIcL = activity.djBIcL();
                long jOLrzqt = activity.OLrzqt();
                long jCopydefault = activity.copydefault();
                int iEZpvd = activity.EZpvd();
                fetchAccountBillsUseCase$execute$12.label = 1;
                objAEQbTJ = interfaceC50055vAf.AEQbTJ(lAEQbTJ, strKWHzl, java.lang.String.valueOf(iDjBIcL), java.lang.String.valueOf(jOLrzqt), java.lang.String.valueOf(jCopydefault), java.lang.String.valueOf(iEZpvd), fetchAccountBillsUseCase$execute$12);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            responseData = (ResponseData) objAEQbTJ;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return stateListAnimator.AEQbTJ();
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return stateListAnimator.AEQbTJ();
    }

    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.Long EZpvd;
        public final long KWHzl;
        public final long OLrzqt;
        public final int copydefault;
        public final int gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(java.lang.Long l, @NotNull java.lang.String str, int i, long j, long j2, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(l, str, i, j, j2, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
            return this.gEmmrt;
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
            return Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && this.gEmmrt == activity.gEmmrt && this.KWHzl == activity.KWHzl && this.OLrzqt == activity.OLrzqt && this.copydefault == activity.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Long l = this.EZpvd;
            return ((((((((((l == null ? 0 : l.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.gEmmrt)) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(sId=" + this.EZpvd + ", instType=" + this.AEQbTJ + ", subType=" + this.gEmmrt + ", start=" + this.KWHzl + ", end=" + this.OLrzqt + ", limit=" + this.copydefault + ")";
        }

        public Activity(java.lang.Long l, @NotNull java.lang.String str, int i, long j, long j2, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = l;
            this.AEQbTJ = str;
            this.gEmmrt = i;
            this.KWHzl = j;
            this.OLrzqt = j2;
            this.copydefault = i2;
        }
    }
}
