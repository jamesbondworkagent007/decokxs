package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.usecase.bot.FetchArbitrageInfoUseCase$execute$1;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wTM extends vNH<Activity, ArbitrageInfoResponse> {
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC50055vAf copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public wTM(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = interfaceC50055vAf;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.vNH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Activity activity, @NotNull Continuation<? super ArbitrageInfoResponse> continuation) throws java.lang.Throwable {
        FetchArbitrageInfoUseCase$execute$1 fetchArbitrageInfoUseCase$execute$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot actionBar2;
        if (continuation instanceof FetchArbitrageInfoUseCase$execute$1) {
            fetchArbitrageInfoUseCase$execute$1 = (FetchArbitrageInfoUseCase$execute$1) continuation;
            int i = fetchArbitrageInfoUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchArbitrageInfoUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchArbitrageInfoUseCase$execute$1 = new FetchArbitrageInfoUseCase$execute$1(this, continuation);
            }
        }
        FetchArbitrageInfoUseCase$execute$1 fetchArbitrageInfoUseCase$execute$12 = fetchArbitrageInfoUseCase$execute$1;
        java.lang.Object objEZpvd = fetchArbitrageInfoUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchArbitrageInfoUseCase$execute$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC50055vAf interfaceC50055vAf = this.copydefault;
                java.lang.String strEZpvd = activity.EZpvd();
                java.lang.String strAYXKKw = activity.AYXKKw();
                java.lang.String strCopydefault = activity.copydefault();
                java.lang.String strGEmmrt = activity.gEmmrt();
                java.lang.String strAEQbTJ = activity.AEQbTJ();
                java.lang.String strKWHzl = activity.KWHzl();
                java.lang.Float fOLrzqt = activity.OLrzqt();
                SubArbitrageType4Remote subArbitrageType4RemoteAhwBna = activity.AhwBna();
                java.lang.String strDjBIcL = activity.djBIcL();
                fetchArbitrageInfoUseCase$execute$12.label = 1;
                objEZpvd = interfaceC50055vAf.EZpvd(strEZpvd, strAYXKKw, strCopydefault, strGEmmrt, strAEQbTJ, strKWHzl, fOLrzqt, subArbitrageType4RemoteAhwBna, strDjBIcL, fetchArbitrageInfoUseCase$execute$12);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            ResponseData responseData = (ResponseData) objEZpvd;
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
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            actionBar2 = new AbstractC43419rot.StateListAnimator((ArbitrageInfoResponse) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()));
        } else {
            if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar2 = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) actionBar).KWHzl());
        }
        return actionBar2.AEQbTJ();
    }

    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final SubArbitrageType4Remote AhwBna;
        public final java.lang.String EZpvd;
        public final java.lang.Float KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubArbitrageType4Remote AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull java.lang.String str6, java.lang.Float f, SubArbitrageType4Remote subArbitrageType4Remote, java.lang.String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new Activity(str, str2, str3, str4, str5, str6, f, subArbitrageType4Remote, str7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AYXKKw;
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) activity.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) activity.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && this.AhwBna == activity.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) activity.AYXKKw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.djBIcL.hashCode();
            int iHashCode3 = this.copydefault.hashCode();
            java.lang.String str = this.gEmmrt;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.AEQbTJ;
            int iHashCode5 = str2 == null ? 0 : str2.hashCode();
            int iHashCode6 = this.OLrzqt.hashCode();
            java.lang.Float f = this.KWHzl;
            int iHashCode7 = f == null ? 0 : f.hashCode();
            SubArbitrageType4Remote subArbitrageType4Remote = this.AhwBna;
            int iHashCode8 = subArbitrageType4Remote == null ? 0 : subArbitrageType4Remote.hashCode();
            java.lang.String str3 = this.AYXKKw;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(instFamily=" + this.EZpvd + ", totalAmt=" + this.djBIcL + ", arbType=" + this.copydefault + ", spreadRatio=" + this.gEmmrt + ", algoId=" + this.AEQbTJ + ", queryScene=" + this.OLrzqt + ", leveragePrincipal=" + this.KWHzl + ", subArbTypes=" + this.AhwBna + ", stopType=" + this.AYXKKw + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull java.lang.String str6, java.lang.Float f, SubArbitrageType4Remote subArbitrageType4Remote, java.lang.String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.EZpvd = str;
            this.djBIcL = str2;
            this.copydefault = str3;
            this.gEmmrt = str4;
            this.AEQbTJ = str5;
            this.OLrzqt = str6;
            this.KWHzl = f;
            this.AhwBna = subArbitrageType4Remote;
            this.AYXKKw = str7;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (r19v0 java.lang.String)
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0013: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r20v0 java.lang.Float))
  (wrap:com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote:?: TERNARY null = ((wrap:int:0x001b: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote) : (r21v0 com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Float, com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote, java.lang.String):void (m)] (LINE:35) call: o.wTM.Activity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Float, com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote, java.lang.String):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Float f, SubArbitrageType4Remote subArbitrageType4Remote, java.lang.String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : subArbitrageType4Remote, (i & 256) != 0 ? null : str7);
        }
    }
}
