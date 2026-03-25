package com.okinc.planet.biz_social_feeds.domain;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ArbitrageInfoData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String avgPx;
    public final String enterPx;
    public final String instId;
    public final String instType;
    public final String major;
    public final String posSide;
    public final String pxType;
    public final String side;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArbitrageInfoData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageInfoData AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new ArbitrageInfoData(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.enterPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.major;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArbitrageInfoData)) {
            return false;
        }
        ArbitrageInfoData arbitrageInfoData = (ArbitrageInfoData) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) arbitrageInfoData.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) arbitrageInfoData.instType) && Intrinsics.EZpvd((Object) this.avgPx, (Object) arbitrageInfoData.avgPx) && Intrinsics.EZpvd((Object) this.pxType, (Object) arbitrageInfoData.pxType) && Intrinsics.EZpvd((Object) this.side, (Object) arbitrageInfoData.side) && Intrinsics.EZpvd((Object) this.major, (Object) arbitrageInfoData.major) && Intrinsics.EZpvd((Object) this.enterPx, (Object) arbitrageInfoData.enterPx) && Intrinsics.EZpvd((Object) this.posSide, (Object) arbitrageInfoData.posSide);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.instId.hashCode() * 31) + this.instType.hashCode()) * 31) + this.avgPx.hashCode()) * 31) + this.pxType.hashCode()) * 31) + this.side.hashCode()) * 31) + this.major.hashCode()) * 31) + this.enterPx.hashCode()) * 31) + this.posSide.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArbitrageInfoData(instId=" + this.instId + ", instType=" + this.instType + ", avgPx=" + this.avgPx + ", pxType=" + this.pxType + ", side=" + this.side + ", major=" + this.major + ", enterPx=" + this.enterPx + ", posSide=" + this.posSide + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.pxType;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_social_feeds.domain.ArbitrageInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbitrageInfoData> serializer() {
            return ArbitrageInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArbitrageInfoData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
        if ((i & 4) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str3;
        }
        if ((i & 8) == 0) {
            this.pxType = "";
        } else {
            this.pxType = str4;
        }
        if ((i & 16) == 0) {
            this.side = "";
        } else {
            this.side = str5;
        }
        if ((i & 32) == 0) {
            this.major = "";
        } else {
            this.major = str6;
        }
        if ((i & 64) == 0) {
            this.enterPx = "";
        } else {
            this.enterPx = str7;
        }
        if ((i & 128) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str8;
        }
    }

    public static final /* synthetic */ void EZpvd(ArbitrageInfoData arbitrageInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) arbitrageInfoData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, arbitrageInfoData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) arbitrageInfoData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, arbitrageInfoData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) arbitrageInfoData.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, arbitrageInfoData.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) arbitrageInfoData.pxType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, arbitrageInfoData.pxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) arbitrageInfoData.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, arbitrageInfoData.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) arbitrageInfoData.major, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, arbitrageInfoData.major);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) arbitrageInfoData.enterPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, arbitrageInfoData.enterPx);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) arbitrageInfoData.posSide, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, arbitrageInfoData.posSide);
    }

    public ArbitrageInfoData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.instId = str;
        this.instType = str2;
        this.avgPx = str3;
        this.pxType = str4;
        this.side = str5;
        this.major = str6;
        this.enterPx = str7;
        this.posSide = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.planet.biz_social_feeds.domain.ArbitrageInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ArbitrageInfoData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }
}
