package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class PreExecTransactionReq {
    public static final int $stable = 8;
    private String amount;
    private List<EVMAuthorization> authorizationList;
    private Integer bizLine;
    private long chainIndex;
    private String dappData;
    private final DappInfo dappInfo;
    private final String from;
    private String inputData;
    private boolean isRpcChain;
    private String method;
    private Boolean onlyGasLimit;
    private String payload;
    private List<EVMStateOverride> stateOverrideList;
    private String to;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dappData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMAuthorization> component10() {
        return this.authorizationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMStateOverride> component11() {
        return this.stateOverrideList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.onlyGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappInfo component5() {
        return this.dappInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.bizLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isRpcChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreExecTransactionReq copy(String str, @NotNull String str2, @NotNull String str3, String str4, DappInfo dappInfo, long j, Integer num, String str5, boolean z, List<EVMAuthorization> list, List<EVMStateOverride> list2, String str6, String str7, Boolean bool) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PreExecTransactionReq(str, str2, str3, str4, dappInfo, j, num, str5, z, list, list2, str6, str7, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreExecTransactionReq)) {
            return false;
        }
        PreExecTransactionReq preExecTransactionReq = (PreExecTransactionReq) obj;
        return Intrinsics.EZpvd((Object) this.dappData, (Object) preExecTransactionReq.dappData) && Intrinsics.EZpvd((Object) this.method, (Object) preExecTransactionReq.method) && Intrinsics.EZpvd((Object) this.from, (Object) preExecTransactionReq.from) && Intrinsics.EZpvd((Object) this.to, (Object) preExecTransactionReq.to) && Intrinsics.EZpvd(this.dappInfo, preExecTransactionReq.dappInfo) && this.chainIndex == preExecTransactionReq.chainIndex && Intrinsics.EZpvd(this.bizLine, preExecTransactionReq.bizLine) && Intrinsics.EZpvd((Object) this.payload, (Object) preExecTransactionReq.payload) && this.isRpcChain == preExecTransactionReq.isRpcChain && Intrinsics.EZpvd(this.authorizationList, preExecTransactionReq.authorizationList) && Intrinsics.EZpvd(this.stateOverrideList, preExecTransactionReq.stateOverrideList) && Intrinsics.EZpvd((Object) this.amount, (Object) preExecTransactionReq.amount) && Intrinsics.EZpvd((Object) this.inputData, (Object) preExecTransactionReq.inputData) && Intrinsics.EZpvd(this.onlyGasLimit, preExecTransactionReq.onlyGasLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMAuthorization> getAuthorizationList() {
        return this.authorizationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBizLine() {
        return this.bizLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDappData() {
        return this.dappData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappInfo getDappInfo() {
        return this.dappInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputData() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getOnlyGasLimit() {
        return this.onlyGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMStateOverride> getStateOverrideList() {
        return this.stateOverrideList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.dappData;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.method.hashCode();
        int iHashCode3 = this.from.hashCode();
        String str2 = this.to;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        DappInfo dappInfo = this.dappInfo;
        int iHashCode5 = dappInfo == null ? 0 : dappInfo.hashCode();
        int iHashCode6 = Long.hashCode(this.chainIndex);
        Integer num = this.bizLine;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        String str3 = this.payload;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        int iHashCode9 = Boolean.hashCode(this.isRpcChain);
        List<EVMAuthorization> list = this.authorizationList;
        int iHashCode10 = list == null ? 0 : list.hashCode();
        List<EVMStateOverride> list2 = this.stateOverrideList;
        int iHashCode11 = list2 == null ? 0 : list2.hashCode();
        String str4 = this.amount;
        int iHashCode12 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.inputData;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        Boolean bool = this.onlyGasLimit;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRpcChain() {
        return this.isRpcChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthorizationList(List<EVMAuthorization> list) {
        this.authorizationList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizLine(Integer num) {
        this.bizLine = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(long j) {
        this.chainIndex = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappData(String str) {
        this.dappData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputData(String str) {
        this.inputData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.method = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnlyGasLimit(Boolean bool) {
        this.onlyGasLimit = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayload(String str) {
        this.payload = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRpcChain(boolean z) {
        this.isRpcChain = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStateOverrideList(List<EVMStateOverride> list) {
        this.stateOverrideList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(String str) {
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PreExecTransactionReq(dappData=" + this.dappData + ", method=" + this.method + ", from=" + this.from + ", to=" + this.to + ", dappInfo=" + this.dappInfo + ", chainIndex=" + this.chainIndex + ", bizLine=" + this.bizLine + ", payload=" + this.payload + ", isRpcChain=" + this.isRpcChain + ", authorizationList=" + this.authorizationList + ", stateOverrideList=" + this.stateOverrideList + ", amount=" + this.amount + ", inputData=" + this.inputData + ", onlyGasLimit=" + this.onlyGasLimit + ")";
    }

    public PreExecTransactionReq(String str, @NotNull String str2, @NotNull String str3, String str4, DappInfo dappInfo, long j, Integer num, String str5, boolean z, List<EVMAuthorization> list, List<EVMStateOverride> list2, String str6, String str7, Boolean bool) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.dappData = str;
        this.method = str2;
        this.from = str3;
        this.to = str4;
        this.dappInfo = dappInfo;
        this.chainIndex = j;
        this.bizLine = num;
        this.payload = str5;
        this.isRpcChain = z;
        this.authorizationList = list;
        this.stateOverrideList = list2;
        this.amount = str6;
        this.inputData = str7;
        this.onlyGasLimit = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (r22v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (r24v0 com.okinc.business.defi.biz.net.bean.DappInfo)
  (r25v0 long)
  (r27v0 java.lang.Integer)
  (r28v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0026: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r30v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002e: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r31v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0048: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r34v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.DappInfo, long, java.lang.Integer, java.lang.String, boolean, java.util.List<com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization>, java.util.List<com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride>, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:1947) call: com.okinc.business.defi.biz.net.bean.PreExecTransactionReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.DappInfo, long, java.lang.Integer, java.lang.String, boolean, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ PreExecTransactionReq(String str, String str2, String str3, String str4, DappInfo dappInfo, long j, Integer num, String str5, boolean z, List list, List list2, String str6, String str7, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, str3, (i & 8) != 0 ? null : str4, dappInfo, j, num, str5, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : list2, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? Boolean.FALSE : bool);
    }
}
