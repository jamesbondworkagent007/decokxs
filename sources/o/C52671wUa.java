package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.dto.MarginUsage;
import com.okinc.tradingbot.impl.usecase.bot.GetGridMarginUsageUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wUa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52671wUa extends vNH<Activity, java.util.List<? extends MarginUsage>> {
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC50055vAf copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C52671wUa(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = interfaceC50055vAf;
    }

    /* JADX INFO: renamed from: o.wUa$Activity */
    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.String AkhnZx;
        public java.lang.String AuCTel;
        public java.lang.String DbNXlk;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.Boolean copydefault;
        public int djBIcL;
        public java.lang.String fARcdN;
        public java.lang.String fJNWhG;
        public java.lang.String fetchVPNInfo;
        public java.lang.String gEmmrt;
        public java.lang.String isConnected;
        public java.lang.String valueOf;
        public java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.Boolean bool, java.lang.String str14, java.lang.String str15, java.lang.String str16) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new Activity(str, i, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, bool, str14, str15, str16);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.isConnected;
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
            return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) activity.AYXKKw) && this.djBIcL == activity.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) activity.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) activity.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) activity.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) activity.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) activity.values) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) activity.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) activity.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) activity.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) activity.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) activity.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) activity.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AYXKKw.hashCode();
            int iHashCode2 = java.lang.Integer.hashCode(this.djBIcL);
            int iHashCode3 = this.AhwBna.hashCode();
            int iHashCode4 = this.isConnected.hashCode();
            int iHashCode5 = this.fetchVPNInfo.hashCode();
            java.lang.String str = this.AEQbTJ;
            int iHashCode6 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.EZpvd;
            int iHashCode7 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.AkhnZx;
            int iHashCode8 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.values;
            int iHashCode9 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.DbNXlk;
            int iHashCode10 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.fJNWhG;
            int iHashCode11 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.AuCTel;
            int iHashCode12 = str7 == null ? 0 : str7.hashCode();
            java.lang.String str8 = this.fARcdN;
            int iHashCode13 = str8 == null ? 0 : str8.hashCode();
            java.lang.String str9 = this.OLrzqt;
            int iHashCode14 = str9 == null ? 0 : str9.hashCode();
            java.lang.Boolean bool = this.copydefault;
            int iHashCode15 = bool == null ? 0 : bool.hashCode();
            java.lang.String str10 = this.valueOf;
            int iHashCode16 = str10 == null ? 0 : str10.hashCode();
            java.lang.String str11 = this.KWHzl;
            int iHashCode17 = str11 == null ? 0 : str11.hashCode();
            java.lang.String str12 = this.gEmmrt;
            return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (str12 == null ? 0 : str12.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(instId=" + this.AYXKKw + ", gridNum=" + this.djBIcL + ", maxPx=" + this.AhwBna + ", minPx=" + this.isConnected + ", runType=" + this.fetchVPNInfo + ", algoOrdType=" + this.AEQbTJ + ", baseSz=" + this.EZpvd + ", quoteSz=" + this.AkhnZx + ", sourceCcySz=" + this.values + ", sourceCcy=" + this.DbNXlk + ", triggerStrategy=" + this.fJNWhG + ", triggerPx=" + this.AuCTel + ", tradeQuoteCcy=" + this.fARcdN + ", direction=" + this.OLrzqt + ", basePosition=" + this.copydefault + ", leverage=" + this.valueOf + ", actualMarginSz=" + this.KWHzl + ", extraMarginSz=" + this.gEmmrt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.valueOf;
        }

        public Activity(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.Boolean bool, java.lang.String str14, java.lang.String str15, java.lang.String str16) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.AYXKKw = str;
            this.djBIcL = i;
            this.AhwBna = str2;
            this.isConnected = str3;
            this.fetchVPNInfo = str4;
            this.AEQbTJ = str5;
            this.EZpvd = str6;
            this.AkhnZx = str7;
            this.values = str8;
            this.DbNXlk = str9;
            this.fJNWhG = str10;
            this.AuCTel = str11;
            this.fARcdN = str12;
            this.OLrzqt = str13;
            this.copydefault = bool;
            this.valueOf = str14;
            this.KWHzl = str15;
            this.gEmmrt = str16;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0081: CONSTRUCTOR 
  (r23v0 java.lang.String)
  (r24v0 int)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r41v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r41v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r41v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r41v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r41v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r41v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r41v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r41v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r41v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004d: ARITH (r41v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r37v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (32768 int) & (r41v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (65536 int) & (r41v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r41v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: o.wUa.Activity.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.Boolean bool, java.lang.String str14, java.lang.String str15, java.lang.String str16, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, str3, str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : str8, (i2 & 512) != 0 ? null : str9, (i2 & 1024) != 0 ? null : str10, (i2 & 2048) != 0 ? null : str11, (i2 & 4096) != 0 ? null : str12, (i2 & 8192) != 0 ? null : str13, (i2 & 16384) != 0 ? null : bool, (32768 & i2) != 0 ? null : str14, (65536 & i2) != 0 ? null : str15, (i2 & 131072) != 0 ? null : str16);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.vNH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Activity activity, @NotNull Continuation<? super java.util.List<MarginUsage>> continuation) throws java.lang.Throwable {
        GetGridMarginUsageUseCase$execute$1 getGridMarginUsageUseCase$execute$1;
        java.lang.String str;
        java.lang.String str2;
        AbstractC43419rot actionBar;
        java.lang.String str3;
        if (continuation instanceof GetGridMarginUsageUseCase$execute$1) {
            getGridMarginUsageUseCase$execute$1 = (GetGridMarginUsageUseCase$execute$1) continuation;
            int i = getGridMarginUsageUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getGridMarginUsageUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getGridMarginUsageUseCase$execute$1 = new GetGridMarginUsageUseCase$execute$1(this, continuation);
            }
        }
        GetGridMarginUsageUseCase$execute$1 getGridMarginUsageUseCase$execute$12 = getGridMarginUsageUseCase$execute$1;
        java.lang.Object objAEQbTJ = getGridMarginUsageUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getGridMarginUsageUseCase$execute$12.label;
        java.lang.String str4 = "Error: ";
        java.lang.String str5 = AbstractC43419rot.TAG;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC50055vAf interfaceC50055vAf = this.copydefault;
                java.lang.String strAYXKKw = activity.AYXKKw();
                int iKWHzl = activity.KWHzl();
                java.lang.String strAhwBna = activity.AhwBna();
                java.lang.String strDjBIcL = activity.djBIcL();
                java.lang.String strGEmmrt = activity.gEmmrt();
                java.lang.String strIsConnected = activity.isConnected();
                java.lang.String strCopydefault = activity.copydefault();
                java.lang.Boolean boolEZpvd = activity.EZpvd();
                java.lang.String strValueOf = activity.valueOf();
                java.lang.String strOLrzqt = activity.OLrzqt();
                java.lang.String strAEQbTJ = activity.AEQbTJ();
                getGridMarginUsageUseCase$execute$12.label = 1;
                str5 = strOLrzqt;
                str3 = AbstractC43419rot.TAG;
                str2 = "Error: ";
                str4 = strAEQbTJ;
                try {
                    objAEQbTJ = interfaceC50055vAf.AEQbTJ(strAYXKKw, iKWHzl, strAhwBna, strDjBIcL, strGEmmrt, strIsConnected, strCopydefault, boolEZpvd, strValueOf, str5, str4, getGridMarginUsageUseCase$execute$12);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    str = str3;
                    pUU.copydefault(str, str2 + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    return actionBar.AEQbTJ();
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
                str3 = AbstractC43419rot.TAG;
                str2 = "Error: ";
            }
            ResponseData responseData = (ResponseData) objAEQbTJ;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                str = str3;
                try {
                    pUU.copydefault(str, str2 + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    pUU.copydefault(str, str2 + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            str = str5;
            str2 = str4;
        }
        return actionBar.AEQbTJ();
    }
}
