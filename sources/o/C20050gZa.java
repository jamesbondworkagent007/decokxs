package o;

import com.okinc.business.dex.trade.copytrading.home.data.CTPosition;
import com.okinc.business.dex.trade.copytrading.home.data.CTPositionsResponse;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dex.trade.order.domain.model.TokenInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gZa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20050gZa implements gYZ {
    public static final Application Companion = new Application(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String AuCTel;
    public final java.lang.String DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final OrderStrategyType djBIcL;
    public final java.lang.String fARcdN;
    public final TokenInfo fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.lang.String isConnected;
    public final java.lang.String valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C20050gZa copy$default(C20050gZa c20050gZa, java.lang.String str, java.lang.String str2, java.lang.String str3, OrderStrategyType orderStrategyType, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, TokenInfo tokenInfo, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, int i, java.lang.Object obj) {
        return c20050gZa.KWHzl((i & 1) != 0 ? c20050gZa.isConnected : str, (i & 2) != 0 ? c20050gZa.copydefault : str2, (i & 4) != 0 ? c20050gZa.valueOf : str3, (i & 8) != 0 ? c20050gZa.djBIcL : orderStrategyType, (i & 16) != 0 ? c20050gZa.DbNXlk : str4, (i & 32) != 0 ? c20050gZa.AhwBna : str5, (i & 64) != 0 ? c20050gZa.AEQbTJ : str6, (i & 128) != 0 ? c20050gZa.KWHzl : str7, (i & 256) != 0 ? c20050gZa.EZpvd : str8, (i & 512) != 0 ? c20050gZa.OLrzqt : str9, (i & 1024) != 0 ? c20050gZa.AYXKKw : str10, (i & 2048) != 0 ? c20050gZa.gEmmrt : str11, (i & 4096) != 0 ? c20050gZa.fetchVPNInfo : tokenInfo, (i & 8192) != 0 ? c20050gZa.AkhnZx : str12, (i & 16384) != 0 ? c20050gZa.values : str13, (i & 32768) != 0 ? c20050gZa.fARcdN : str14, (i & 65536) != 0 ? c20050gZa.AuCTel : str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C20050gZa KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull OrderStrategyType orderStrategyType, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull TokenInfo tokenInfo, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull java.lang.String str14, @NotNull java.lang.String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(orderStrategyType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        return new C20050gZa(str, str2, str3, orderStrategyType, str4, str5, str6, str7, str8, str9, str10, str11, tokenInfo, str12, str13, str14, str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo copydefault() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20050gZa)) {
            return false;
        }
        C20050gZa c20050gZa = (C20050gZa) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c20050gZa.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c20050gZa.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c20050gZa.valueOf) && this.djBIcL == c20050gZa.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c20050gZa.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c20050gZa.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c20050gZa.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c20050gZa.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c20050gZa.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c20050gZa.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c20050gZa.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c20050gZa.gEmmrt) && Intrinsics.EZpvd(this.fetchVPNInfo, c20050gZa.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c20050gZa.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c20050gZa.values) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) c20050gZa.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c20050gZa.AuCTel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gYZ
    public java.lang.String fJNWhG() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.isConnected.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.values.hashCode()) * 31) + this.fARcdN.hashCode()) * 31) + this.AuCTel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CTPositionUIData(strategyId=" + this.isConnected + ", chainId=" + this.copydefault + ", positionId=" + this.valueOf + ", orderStrategyType=" + this.djBIcL + ", time=" + this.DbNXlk + ", groupTime=" + this.AhwBna + ", balanceAmount=" + this.AEQbTJ + ", balanceUsdValue=" + this.KWHzl + ", buyTokenAmount=" + this.EZpvd + ", buyUsdValue=" + this.OLrzqt + ", sellTokenAmount=" + this.AYXKKw + ", sellUsdValue=" + this.gEmmrt + ", tokenInfo=" + this.fetchVPNInfo + ", totalPnl=" + this.AkhnZx + ", totalPnlRate=" + this.values + ", unrealizedPnl=" + this.fARcdN + ", unrealizedPnlRate=" + this.AuCTel + ")";
    }

    public C20050gZa(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull OrderStrategyType orderStrategyType, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull TokenInfo tokenInfo, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull java.lang.String str14, @NotNull java.lang.String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(orderStrategyType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        this.isConnected = str;
        this.copydefault = str2;
        this.valueOf = str3;
        this.djBIcL = orderStrategyType;
        this.DbNXlk = str4;
        this.AhwBna = str5;
        this.AEQbTJ = str6;
        this.KWHzl = str7;
        this.EZpvd = str8;
        this.OLrzqt = str9;
        this.AYXKKw = str10;
        this.gEmmrt = str11;
        this.fetchVPNInfo = tokenInfo;
        this.AkhnZx = str12;
        this.values = str13;
        this.fARcdN = str14;
        this.AuCTel = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a3: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r48v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r48v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (r33v0 java.lang.String)
  (r34v0 com.okinc.business.dex.trade.order.domain.model.OrderStrategyType)
  (r35v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r48v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r48v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r48v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r48v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r48v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r48v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r48v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.order.domain.model.TokenInfo:?: TERNARY null = ((wrap:int:0x004c: ARITH (r48v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (2047 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:19) call: com.okinc.business.dex.trade.order.domain.model.TokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r43v0 com.okinc.business.dex.trade.order.domain.model.TokenInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0074: ARITH (r48v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r48v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (32768 int) & (r48v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r48v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.order.domain.model.OrderStrategyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.order.domain.model.TokenInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:6) call: o.gZa.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.order.domain.model.OrderStrategyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.order.domain.model.TokenInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C20050gZa(java.lang.String str, java.lang.String str2, java.lang.String str3, OrderStrategyType orderStrategyType, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, TokenInfo tokenInfo, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3, orderStrategyType, str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? new TokenInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo, (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (32768 & i) != 0 ? "" : str14, (i & 65536) != 0 ? "" : str15);
    }

    @Override // o.gYZ
    public java.lang.String ejfBZ() {
        return this.valueOf + this.djBIcL.getType();
    }

    @Override // o.gYZ
    public gYZ EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copy$default(this, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, 131039, null);
    }

    public final boolean valueOf() {
        return this.fARcdN.length() > 0 && this.AuCTel.length() > 0;
    }

    /* JADX INFO: renamed from: o.gZa$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gZa.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.util.List<C20050gZa> EZpvd(@NotNull CTPositionsResponse cTPositionsResponse) {
            Intrinsics.checkNotNullParameter(cTPositionsResponse, "");
            java.util.List<CTPosition> positions = cTPositionsResponse.getPositions();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(positions, 10));
            for (CTPosition cTPosition : positions) {
                arrayList.add(new C20050gZa(cTPositionsResponse.getStrategyId(), cTPositionsResponse.getChainId(), cTPosition.getPositionId(), OrderStrategyType.CopyTrade, cTPosition.getLastActive(), null, cTPosition.getBalanceAmount(), cTPosition.getBalanceUsdValue(), cTPosition.getBuyTokenAmount(), cTPosition.getBuyUsdValue(), cTPosition.getSellTokenAmount(), cTPosition.getSellUsdValue(), cTPosition.getTokenInfo(), cTPosition.getTotalPnl(), cTPosition.getTotalPnlRate(), cTPosition.getUnrealizedPnl(), cTPosition.getUnrealizedPnlRate(), 32, null));
            }
            return arrayList;
        }

        public final C20050gZa AEQbTJ(@NotNull CTPosition cTPosition) {
            Intrinsics.checkNotNullParameter(cTPosition, "");
            return new C20050gZa(null, cTPosition.getTokenInfo().getChainId(), cTPosition.getPositionId(), OrderStrategyType.CopyTrade, cTPosition.getLastActive(), null, cTPosition.getBalanceAmount(), cTPosition.getBalanceUsdValue(), cTPosition.getBuyTokenAmount(), cTPosition.getBuyUsdValue(), cTPosition.getSellTokenAmount(), cTPosition.getSellUsdValue(), cTPosition.getTokenInfo(), cTPosition.getTotalPnl(), cTPosition.getTotalPnlRate(), cTPosition.getUnrealizedPnl(), cTPosition.getUnrealizedPnlRate(), 33, null);
        }
    }
}
