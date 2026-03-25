package o;

import com.okinc.social_trade_api.data.BannerLinkType;
import com.okinc.social_trade_api.data.MarketplaceBannerType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.umN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC49320umN {
    MarketplaceBannerType AEQbTJ();

    java.lang.String EZpvd();

    java.lang.String KWHzl();

    /* JADX INFO: renamed from: o.umN$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator implements InterfaceC49320umN {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final boolean AkhnZx;
        public final java.lang.String AuCTel;
        public final java.lang.String DbNXlk;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final MarketplaceBannerType OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String fJNWhG;
        public final java.lang.String fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public final java.lang.String isConnected;
        public final java.lang.String valueOf;
        public final BannerLinkType values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 131071, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC49320umN
        public MarketplaceBannerType AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC49320umN
        public java.lang.String EZpvd() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC49320umN
        public java.lang.String KWHzl() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull BannerLinkType bannerLinkType, @NotNull MarketplaceBannerType marketplaceBannerType, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, boolean z, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull java.lang.String str14) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(bannerLinkType, "");
            Intrinsics.checkNotNullParameter(marketplaceBannerType, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(str12, "");
            Intrinsics.checkNotNullParameter(str13, "");
            Intrinsics.checkNotNullParameter(str14, "");
            return new StateListAnimator(str, str2, str3, str4, str5, bannerLinkType, marketplaceBannerType, str6, str7, str8, str9, str10, z, str11, str12, str13, str14);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AkhnZx;
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
            return Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) stateListAnimator.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) stateListAnimator.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) stateListAnimator.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) stateListAnimator.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) stateListAnimator.AhwBna) && this.values == stateListAnimator.values && this.OLrzqt == stateListAnimator.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) stateListAnimator.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) stateListAnimator.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) stateListAnimator.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) stateListAnimator.valueOf) && this.AkhnZx == stateListAnimator.AkhnZx && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) stateListAnimator.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.fetchVPNInfo.hashCode() * 31) + this.AuCTel.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.values.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.fJNWhG.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AkhnZx)) * 31) + this.KWHzl.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "VoucherBanner(id=" + this.fetchVPNInfo + ", title=" + this.AuCTel + ", iconUrl=" + this.AYXKKw + ", iconUrlDark=" + this.gEmmrt + ", href=" + this.AhwBna + ", linkType=" + this.values + ", bannerType=" + this.OLrzqt + ", subTitle=" + this.fJNWhG + ", cta=" + this.EZpvd + ", remainingVouchersCount=" + this.DbNXlk + ", expireTime=" + this.djBIcL + ", currentTime=" + this.valueOf + ", showCountdown=" + this.AkhnZx + ", batchNo=" + this.KWHzl + ", isShowApr=" + this.isConnected + ", apr=" + this.AEQbTJ + ", aprTitle=" + this.copydefault + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull BannerLinkType bannerLinkType, @NotNull MarketplaceBannerType marketplaceBannerType, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, boolean z, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull java.lang.String str14) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(bannerLinkType, "");
            Intrinsics.checkNotNullParameter(marketplaceBannerType, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(str12, "");
            Intrinsics.checkNotNullParameter(str13, "");
            Intrinsics.checkNotNullParameter(str14, "");
            this.fetchVPNInfo = str;
            this.AuCTel = str2;
            this.AYXKKw = str3;
            this.gEmmrt = str4;
            this.AhwBna = str5;
            this.values = bannerLinkType;
            this.OLrzqt = marketplaceBannerType;
            this.fJNWhG = str6;
            this.EZpvd = str7;
            this.DbNXlk = str8;
            this.djBIcL = str9;
            this.valueOf = str10;
            this.AkhnZx = z;
            this.KWHzl = str11;
            this.isConnected = str12;
            this.AEQbTJ = str13;
            this.copydefault = str14;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00bc: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:com.okinc.social_trade_api.data.BannerLinkType:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: SGET  A[WRAPPED] (LINE:43) com.okinc.social_trade_api.data.BannerLinkType.Internal com.okinc.social_trade_api.data.BannerLinkType) : (r24v0 com.okinc.social_trade_api.data.BannerLinkType))
  (wrap:com.okinc.social_trade_api.data.MarketplaceBannerType:?: TERNARY null = ((wrap:int:0x0035: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: SGET  A[WRAPPED] (LINE:44) com.okinc.social_trade_api.data.MarketplaceBannerType.Voucher com.okinc.social_trade_api.data.MarketplaceBannerType) : (r25v0 com.okinc.social_trade_api.data.MarketplaceBannerType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0066: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0084: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.social_trade_api.data.BannerLinkType, com.okinc.social_trade_api.data.MarketplaceBannerType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:37) call: o.umN.StateListAnimator.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.social_trade_api.data.BannerLinkType, com.okinc.social_trade_api.data.MarketplaceBannerType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, BannerLinkType bannerLinkType, MarketplaceBannerType marketplaceBannerType, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, boolean z, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? BannerLinkType.Internal : bannerLinkType, (i & 64) != 0 ? MarketplaceBannerType.Voucher : marketplaceBannerType, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? "" : str12, (i & 32768) != 0 ? "" : str13, (i & 65536) != 0 ? "" : str14);
        }

        public final boolean AYXKKw() {
            java.lang.Integer intOrNull;
            if (copydefault() || this.DbNXlk.length() == 0 || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(this.DbNXlk)) == null) {
                return false;
            }
            return intOrNull.equals(0);
        }
    }
}
