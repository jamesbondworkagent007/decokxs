package com.okinc.unify_trade.trade.source;

import com.okinc.unify_trade.biz.DexInstrument;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SearchTradeBizInfo {
    public static final int $stable = 8;
    private String alias;
    private DexInstrument dexRawPo;
    private String expTime;
    private String index;
    private String instId;
    private String instType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchTradeBizInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SearchTradeBizInfo copy$default(SearchTradeBizInfo searchTradeBizInfo, String str, String str2, String str3, String str4, String str5, DexInstrument dexInstrument, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchTradeBizInfo.instId;
        }
        if ((i & 2) != 0) {
            str2 = searchTradeBizInfo.instType;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = searchTradeBizInfo.index;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = searchTradeBizInfo.alias;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = searchTradeBizInfo.expTime;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            dexInstrument = searchTradeBizInfo.dexRawPo;
        }
        return searchTradeBizInfo.copy(str, str6, str7, str8, str9, dexInstrument);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexInstrument component6() {
        return this.dexRawPo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchTradeBizInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, DexInstrument dexInstrument) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SearchTradeBizInfo(str, str2, str3, str4, str5, dexInstrument);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexInstrument getDexRawPo() {
        return this.dexRawPo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpTime() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlias(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.alias = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexRawPo(DexInstrument dexInstrument) {
        this.dexRawPo = dexInstrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.index = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchTradeBizInfo(instId=" + this.instId + ", instType=" + this.instType + ", index=" + this.index + ", alias=" + this.alias + ", expTime=" + this.expTime + ", dexRawPo=" + this.dexRawPo + ")";
    }

    public SearchTradeBizInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, DexInstrument dexInstrument) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.instId = str;
        this.instType = str2;
        this.index = str3;
        this.alias = str4;
        this.expTime = str5;
        this.dexRawPo = dexInstrument;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:com.okinc.unify_trade.biz.DexInstrument:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.DexInstrument) : (r10v0 com.okinc.unify_trade.biz.DexInstrument))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.DexInstrument):void (m)] (LINE:10) call: com.okinc.unify_trade.trade.source.SearchTradeBizInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.DexInstrument):void type: THIS */
    public /* synthetic */ SearchTradeBizInfo(String str, String str2, String str3, String str4, String str5, DexInstrument dexInstrument, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : dexInstrument);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0091 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (obj instanceof SearchTradeBizInfo) {
            SearchTradeBizInfo searchTradeBizInfo = (SearchTradeBizInfo) obj;
            if (Intrinsics.EZpvd((Object) searchTradeBizInfo.instType, (Object) "FUTURES") && Intrinsics.EZpvd((Object) this.instType, (Object) "FUTURES")) {
                if (!Intrinsics.EZpvd((Object) searchTradeBizInfo.alias, (Object) this.alias) || !Intrinsics.EZpvd((Object) searchTradeBizInfo.index, (Object) this.index) || !Intrinsics.EZpvd((Object) searchTradeBizInfo.instType, (Object) this.instType)) {
                }
            } else if (Intrinsics.EZpvd((Object) searchTradeBizInfo.instType, (Object) "CEDEFI") && Intrinsics.EZpvd((Object) this.instType, (Object) "CEDEFI")) {
                DexInstrument dexInstrument = searchTradeBizInfo.dexRawPo;
                String chainId = dexInstrument != null ? dexInstrument.getChainId() : null;
                DexInstrument dexInstrument2 = this.dexRawPo;
                if (Intrinsics.EZpvd((Object) chainId, (Object) (dexInstrument2 != null ? dexInstrument2.getChainId() : null))) {
                    DexInstrument dexInstrument3 = searchTradeBizInfo.dexRawPo;
                    String tokenContractAddress = dexInstrument3 != null ? dexInstrument3.getTokenContractAddress() : null;
                    DexInstrument dexInstrument4 = this.dexRawPo;
                    if (Intrinsics.EZpvd((Object) tokenContractAddress, (Object) (dexInstrument4 != null ? dexInstrument4.getTokenContractAddress() : null))) {
                    }
                }
            } else if (Intrinsics.EZpvd((Object) searchTradeBizInfo.instId, (Object) this.instId) && Intrinsics.EZpvd((Object) searchTradeBizInfo.instType, (Object) this.instType)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.instType;
        if (Intrinsics.EZpvd((Object) str, (Object) "FUTURES")) {
            return Objects.hash(this.alias, this.index, this.instType);
        }
        if (Intrinsics.EZpvd((Object) str, (Object) "CEDEFI")) {
            Object[] objArr = new Object[3];
            DexInstrument dexInstrument = this.dexRawPo;
            objArr[0] = dexInstrument != null ? dexInstrument.getChainId() : null;
            DexInstrument dexInstrument2 = this.dexRawPo;
            objArr[1] = dexInstrument2 != null ? dexInstrument2.getTokenContractAddress() : null;
            objArr[2] = this.instType;
            return Objects.hash(objArr);
        }
        return Objects.hash(this.instId, this.instType);
    }
}
