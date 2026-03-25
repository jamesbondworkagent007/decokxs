package o;

import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig;
import com.okinc.business.dex.trade.core.domain.model.common.NetworkFee;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig;
import com.okinc.business.dex.trade.core.domain.model.common.QuoteExt;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6QuoteHandler$executeQuoteRequest$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o.gYS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kWR {
    public final kWN AEQbTJ;
    public final C19700gMb OLrzqt;
    public final kTW copydefault;

    @yCM
    public kWR(@NotNull kWN kwn, @NotNull C19700gMb c19700gMb, @NotNull kTW ktw) {
        Intrinsics.checkNotNullParameter(kwn, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(ktw, "");
        this.AEQbTJ = kwn;
        this.OLrzqt = c19700gMb;
        this.copydefault = ktw;
    }

    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final boolean AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String AkhnZx;
        public final java.lang.String DbNXlk;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final int copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String fARcdN;
        public final java.lang.String fIwbmz;
        public final java.lang.Integer fetchVPNInfo;
        public java.lang.String gEmmrt;
        public final java.lang.String isConnected;
        public final int valueOf;
        public final boolean values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AuCTel() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean DbNXlk() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i, @NotNull java.lang.String str6, @NotNull java.lang.String str7, java.lang.String str8, java.lang.Integer num, int i2, java.lang.String str9, java.lang.String str10, java.lang.String str11, @NotNull java.lang.String str12, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str12, "");
            return new TaskDescription(str, str2, str3, str4, str5, i, str6, str7, str8, num, i2, str9, str10, str11, str12, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) taskDescription.fIwbmz) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) taskDescription.fARcdN) && this.copydefault == taskDescription.copydefault && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) taskDescription.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) taskDescription.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) taskDescription.djBIcL) && Intrinsics.EZpvd(this.fetchVPNInfo, taskDescription.fetchVPNInfo) && this.valueOf == taskDescription.valueOf && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) taskDescription.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) taskDescription.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) taskDescription.gEmmrt) && this.values == taskDescription.values && this.AYXKKw == taskDescription.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fJNWhG() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            int iHashCode3 = this.fIwbmz.hashCode();
            int iHashCode4 = this.OLrzqt.hashCode();
            int iHashCode5 = this.fARcdN.hashCode();
            int iHashCode6 = java.lang.Integer.hashCode(this.copydefault);
            int iHashCode7 = this.DbNXlk.hashCode();
            int iHashCode8 = this.isConnected.hashCode();
            java.lang.String str = this.djBIcL;
            int iHashCode9 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.fetchVPNInfo;
            int iHashCode10 = num == null ? 0 : num.hashCode();
            int iHashCode11 = java.lang.Integer.hashCode(this.valueOf);
            java.lang.String str2 = this.EZpvd;
            int iHashCode12 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.AhwBna;
            int iHashCode13 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.AkhnZx;
            return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.values)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "QuoteRequestParams(chainId=" + this.KWHzl + ", fromTokenAddress=" + this.AEQbTJ + ", toTokenAddress=" + this.fIwbmz + ", amount=" + this.OLrzqt + ", userWalletAddress=" + this.fARcdN + ", direction=" + this.copydefault + ", routerModeType=" + this.DbNXlk + ", slippageValue=" + this.isConnected + ", maxSlippage=" + this.djBIcL + ", slippageMode=" + this.fetchVPNInfo + ", priorityFeeType=" + this.valueOf + ", defiPlatformIds=" + this.EZpvd + ", refCode=" + this.AhwBna + ", referralCommissionVersion=" + this.AkhnZx + ", priorityFee=" + this.gEmmrt + ", supportCustomGas=" + this.values + ", needApprove=" + this.AYXKKw + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer values() {
            return this.fetchVPNInfo;
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i, @NotNull java.lang.String str6, @NotNull java.lang.String str7, java.lang.String str8, java.lang.Integer num, int i2, java.lang.String str9, java.lang.String str10, java.lang.String str11, @NotNull java.lang.String str12, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str12, "");
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.fIwbmz = str3;
            this.OLrzqt = str4;
            this.fARcdN = str5;
            this.copydefault = i;
            this.DbNXlk = str6;
            this.isConnected = str7;
            this.djBIcL = str8;
            this.fetchVPNInfo = num;
            this.valueOf = i2;
            this.EZpvd = str9;
            this.AhwBna = str10;
            this.AkhnZx = str11;
            this.gEmmrt = str12;
            this.values = z;
            this.AYXKKw = z2;
        }
    }

    public final gYS AEQbTJ(TaskDescription taskDescription, java.lang.String str) {
        return new gYS.Activity(copydefault(taskDescription, str));
    }

    public final V6QuoteRequest copydefault(@NotNull TaskDescription taskDescription, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.OLrzqt.KWHzl();
        java.lang.String strIsConnected = this.OLrzqt.isConnected();
        java.lang.String strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
        java.lang.String str2 = strDbNXlk != null ? strDbNXlk : "";
        if (strIsConnected.length() <= 0) {
            strIsConnected = null;
        }
        AccountInfo accountInfo = new AccountInfo(strIsConnected, 1, java.lang.Boolean.valueOf(this.copydefault.copydefault()), str2);
        java.lang.String strAEQbTJ = taskDescription.AEQbTJ();
        java.lang.String strEZpvd = taskDescription.EZpvd();
        java.lang.String strFJNWhG = taskDescription.fJNWhG();
        java.lang.String strOLrzqt = taskDescription.OLrzqt();
        java.lang.String strAuCTel = taskDescription.AuCTel();
        SlippageConfig slippageConfig = new SlippageConfig(taskDescription.AYXKKw(), taskDescription.AkhnZx(), C33129mqd.gEmmrt(taskDescription.values()));
        LiquidityConfig liquidityConfigCopydefault = copydefault(taskDescription.copydefault());
        java.lang.String strValueOf = taskDescription.valueOf();
        java.lang.String str3 = (strValueOf == null || strValueOf.length() <= 0) ? null : strValueOf;
        java.lang.String strFetchVPNInfo = taskDescription.fetchVPNInfo();
        return new V6QuoteRequest(strAuCTel, str, slippageConfig, liquidityConfigCopydefault, new QuoteExt(str3, (strFetchVPNInfo == null || strFetchVPNInfo.length() <= 0) ? null : strFetchVPNInfo, (java.lang.Boolean) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null), strAEQbTJ, strEZpvd, strFJNWhG, strOLrzqt, accountInfo);
    }

    public final LiquidityConfig copydefault(java.lang.String str) {
        java.lang.String strOLrzqt = C24695iig.OLrzqt("default_trade");
        if (AEQbTJ(str, strOLrzqt)) {
            return new LiquidityConfig(strOLrzqt, (java.lang.String) null, str, 2, (DefaultConstructorMarker) null);
        }
        return new LiquidityConfig((java.lang.String) null, (java.lang.String) null, str, 3, (DefaultConstructorMarker) null);
    }

    public final boolean AEQbTJ(java.lang.String str, java.lang.String str2) {
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.OLrzqt((java.lang.CharSequence) str2);
    }

    public static /* synthetic */ java.lang.Object buildV6QuoteAndCallDataRequest$default(kWR kwr, TaskDescription taskDescription, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return kwr.KWHzl(taskDescription, str, z, continuation);
    }

    public final java.lang.Object KWHzl(TaskDescription taskDescription, java.lang.String str, boolean z, Continuation<? super gYS.Application> continuation) {
        NetworkFee networkFee;
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.OLrzqt.KWHzl();
        java.lang.String strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
        java.lang.String str2 = strDbNXlk == null ? "" : strDbNXlk;
        if (taskDescription.DbNXlk()) {
            networkFee = new NetworkFee(taskDescription.djBIcL() == PriorityFeeType.PriorityCustom.getValue() ? taskDescription.AhwBna() : "", java.lang.String.valueOf(taskDescription.djBIcL()));
        } else {
            networkFee = null;
        }
        java.util.Map mapKWHzl = C56424yEw.KWHzl();
        java.lang.String strAEQbTJ = taskDescription.AEQbTJ();
        java.lang.String strEZpvd = taskDescription.EZpvd();
        java.lang.String strFJNWhG = taskDescription.fJNWhG();
        java.lang.String strOLrzqt = taskDescription.OLrzqt();
        java.lang.String strAuCTel = taskDescription.AuCTel();
        int iKWHzl = taskDescription.KWHzl();
        SlippageConfig slippageConfig = new SlippageConfig(taskDescription.AYXKKw(), taskDescription.AkhnZx(), C33129mqd.gEmmrt(taskDescription.values()));
        java.lang.String strCopydefault = taskDescription.copydefault();
        LiquidityConfig liquidityConfig = (strCopydefault == null || strCopydefault.length() == 0) ? null : new LiquidityConfig(C24695iig.OLrzqt("default_trade"), (java.lang.String) null, taskDescription.copydefault(), 2, (DefaultConstructorMarker) null);
        PreSetConfig preSetConfig = new PreSetConfig(taskDescription.isConnected());
        java.lang.String strValueOf = taskDescription.valueOf();
        if (strValueOf == null || strValueOf.length() <= 0) {
            strValueOf = null;
        }
        java.lang.String strFetchVPNInfo = taskDescription.fetchVPNInfo();
        if (strFetchVPNInfo == null || strFetchVPNInfo.length() <= 0) {
            strFetchVPNInfo = null;
        }
        return new gYS.Application(mapKWHzl, new V6QuoteAndCalldataRequest(C56443yFo.KWHzl(false), slippageConfig, liquidityConfig, preSetConfig, new QuoteExt(strValueOf, strFetchVPNInfo, C56443yFo.KWHzl(taskDescription.gEmmrt()), taskDescription.gEmmrt() ? "" : null), str, AbstractC22421hez.Companion.KWHzl(), networkFee, strAEQbTJ, strEZpvd, strFJNWhG, strOLrzqt, strAuCTel, java.lang.String.valueOf(iKWHzl), new AccountInfo((java.lang.String) null, C56443yFo.AEQbTJ(2), C56443yFo.KWHzl(this.copydefault.copydefault()), str2, 1, (DefaultConstructorMarker) null)), z);
    }

    public final java.lang.Object AEQbTJ(@NotNull TaskDescription taskDescription, @NotNull java.lang.String str, boolean z, @NotNull Continuation<? super gYS> continuation) {
        if (z && !taskDescription.gEmmrt()) {
            return AEQbTJ(taskDescription, str);
        }
        java.lang.Object objBuildV6QuoteAndCallDataRequest$default = buildV6QuoteAndCallDataRequest$default(this, taskDescription, str, false, continuation, 4, null);
        return objBuildV6QuoteAndCallDataRequest$default == C56442yFn.copydefault() ? objBuildV6QuoteAndCallDataRequest$default : (gYS) objBuildV6QuoteAndCallDataRequest$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull V6QuoteRequest v6QuoteRequest, @NotNull Continuation<? super Result<V6QuoteResponseData>> continuation) {
        MemeV6QuoteHandler$executeQuoteRequest$1 memeV6QuoteHandler$executeQuoteRequest$1;
        if (continuation instanceof MemeV6QuoteHandler$executeQuoteRequest$1) {
            memeV6QuoteHandler$executeQuoteRequest$1 = (MemeV6QuoteHandler$executeQuoteRequest$1) continuation;
            int i = memeV6QuoteHandler$executeQuoteRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeV6QuoteHandler$executeQuoteRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                memeV6QuoteHandler$executeQuoteRequest$1 = new MemeV6QuoteHandler$executeQuoteRequest$1(this, continuation);
            }
        }
        java.lang.Object obj = memeV6QuoteHandler$executeQuoteRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeV6QuoteHandler$executeQuoteRequest$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        kWN kwn = this.AEQbTJ;
        memeV6QuoteHandler$executeQuoteRequest$1.label = 1;
        java.lang.Object objCopydefault2 = kwn.copydefault(v6QuoteRequest, memeV6QuoteHandler$executeQuoteRequest$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    public final Flow<Result<V6BaseQuoteResponse>> KWHzl(@NotNull gYS gys) {
        Intrinsics.checkNotNullParameter(gys, "");
        return this.AEQbTJ.OLrzqt(gys);
    }
}
