package com.okinc.unify_find.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class HotRankResponse extends BaseRank {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String ccyV2;
    private final String changePerDay24h;
    private final String changePerDayUtc0;
    private final String changePerDayUtc8;
    private final String changePerV2;
    private final String displayId;
    private final String fullNameV2;
    private final String hotIndex;
    private final String iconV2;
    private final String lastPrice;
    private final String turnOverV2;
    private final String volumeV2;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HotRankResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.iconV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.changePerDayUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.changePerDayUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fullNameV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.changePerV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.volumeV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.turnOverV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.hotIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ccyV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.changePerDay24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HotRankResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new HotRankResponse(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotRankResponse)) {
            return false;
        }
        HotRankResponse hotRankResponse = (HotRankResponse) obj;
        return Intrinsics.EZpvd((Object) this.iconV2, (Object) hotRankResponse.iconV2) && Intrinsics.EZpvd((Object) this.fullNameV2, (Object) hotRankResponse.fullNameV2) && Intrinsics.EZpvd((Object) this.changePerV2, (Object) hotRankResponse.changePerV2) && Intrinsics.EZpvd((Object) this.volumeV2, (Object) hotRankResponse.volumeV2) && Intrinsics.EZpvd((Object) this.turnOverV2, (Object) hotRankResponse.turnOverV2) && Intrinsics.EZpvd((Object) this.hotIndex, (Object) hotRankResponse.hotIndex) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) hotRankResponse.lastPrice) && Intrinsics.EZpvd((Object) this.ccyV2, (Object) hotRankResponse.ccyV2) && Intrinsics.EZpvd((Object) this.changePerDay24h, (Object) hotRankResponse.changePerDay24h) && Intrinsics.EZpvd((Object) this.changePerDayUtc0, (Object) hotRankResponse.changePerDayUtc0) && Intrinsics.EZpvd((Object) this.changePerDayUtc8, (Object) hotRankResponse.changePerDayUtc8) && Intrinsics.EZpvd((Object) this.displayId, (Object) hotRankResponse.displayId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcyV2() {
        return this.ccyV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDay24h() {
        return this.changePerDay24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDayUtc0() {
        return this.changePerDayUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDayUtc8() {
        return this.changePerDayUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerV2() {
        return this.changePerV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullNameV2() {
        return this.fullNameV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHotIndex() {
        return this.hotIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconV2() {
        return this.iconV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurnOverV2() {
        return this.turnOverV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolumeV2() {
        return this.volumeV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.iconV2.hashCode() * 31) + this.fullNameV2.hashCode()) * 31) + this.changePerV2.hashCode()) * 31) + this.volumeV2.hashCode()) * 31) + this.turnOverV2.hashCode()) * 31) + this.hotIndex.hashCode()) * 31) + this.lastPrice.hashCode()) * 31) + this.ccyV2.hashCode()) * 31) + this.changePerDay24h.hashCode()) * 31) + this.changePerDayUtc0.hashCode()) * 31) + this.changePerDayUtc8.hashCode()) * 31) + this.displayId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HotRankResponse(iconV2=" + this.iconV2 + ", fullNameV2=" + this.fullNameV2 + ", changePerV2=" + this.changePerV2 + ", volumeV2=" + this.volumeV2 + ", turnOverV2=" + this.turnOverV2 + ", hotIndex=" + this.hotIndex + ", lastPrice=" + this.lastPrice + ", ccyV2=" + this.ccyV2 + ", changePerDay24h=" + this.changePerDay24h + ", changePerDayUtc0=" + this.changePerDayUtc0 + ", changePerDayUtc8=" + this.changePerDayUtc8 + ", displayId=" + this.displayId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_find.data.HotRankResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HotRankResponse> serializer() {
            return HotRankResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HotRankResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, str2, serializationConstructorMarker);
        if ((i & 4) == 0) {
            this.iconV2 = "";
        } else {
            this.iconV2 = str3;
        }
        if ((i & 8) == 0) {
            this.fullNameV2 = "";
        } else {
            this.fullNameV2 = str4;
        }
        if ((i & 16) == 0) {
            this.changePerV2 = "";
        } else {
            this.changePerV2 = str5;
        }
        if ((i & 32) == 0) {
            this.volumeV2 = "";
        } else {
            this.volumeV2 = str6;
        }
        if ((i & 64) == 0) {
            this.turnOverV2 = "";
        } else {
            this.turnOverV2 = str7;
        }
        if ((i & 128) == 0) {
            this.hotIndex = "";
        } else {
            this.hotIndex = str8;
        }
        if ((i & 256) == 0) {
            this.lastPrice = "";
        } else {
            this.lastPrice = str9;
        }
        if ((i & 512) == 0) {
            this.ccyV2 = "";
        } else {
            this.ccyV2 = str10;
        }
        if ((i & 1024) == 0) {
            this.changePerDay24h = "";
        } else {
            this.changePerDay24h = str11;
        }
        if ((i & 2048) == 0) {
            this.changePerDayUtc0 = "";
        } else {
            this.changePerDayUtc0 = str12;
        }
        if ((i & 4096) == 0) {
            this.changePerDayUtc8 = "";
        } else {
            this.changePerDayUtc8 = str13;
        }
        if ((i & 8192) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str14;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(HotRankResponse hotRankResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseRank.write$Self(hotRankResponse, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) hotRankResponse.iconV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, hotRankResponse.iconV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) hotRankResponse.fullNameV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, hotRankResponse.fullNameV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) hotRankResponse.changePerV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, hotRankResponse.changePerV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) hotRankResponse.volumeV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, hotRankResponse.volumeV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) hotRankResponse.turnOverV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, hotRankResponse.turnOverV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) hotRankResponse.hotIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, hotRankResponse.hotIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) hotRankResponse.lastPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, hotRankResponse.lastPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) hotRankResponse.ccyV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, hotRankResponse.ccyV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) hotRankResponse.changePerDay24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, hotRankResponse.changePerDay24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) hotRankResponse.changePerDayUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, hotRankResponse.changePerDayUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) hotRankResponse.changePerDayUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, hotRankResponse.changePerDayUtc8);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) hotRankResponse.displayId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, hotRankResponse.displayId);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:81) call: com.okinc.unify_find.data.HotRankResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HotRankResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) == 0 ? str12 : "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotRankResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
        super((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.iconV2 = str;
        this.fullNameV2 = str2;
        this.changePerV2 = str3;
        this.volumeV2 = str4;
        this.turnOverV2 = str5;
        this.hotIndex = str6;
        this.lastPrice = str7;
        this.ccyV2 = str8;
        this.changePerDay24h = str9;
        this.changePerDayUtc0 = str10;
        this.changePerDayUtc8 = str11;
        this.displayId = str12;
    }
}
