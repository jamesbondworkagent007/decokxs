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
public final class TurnOverRank extends BaseRank {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String ccyV2;
    private final String changePerDay24h;
    private final String changePerDayUtc0;
    private final String changePerDayUtc8;
    private final String changePerV2;
    private final String fullNameV2;
    private final String iconV2;
    private final String lastPrice;
    private final String turnOver;
    private final String volumeV2;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TurnOverRank() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.iconV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.ccyV2;
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
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.changePerDay24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.changePerDayUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.changePerDayUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.turnOver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TurnOverRank copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        return new TurnOverRank(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TurnOverRank)) {
            return false;
        }
        TurnOverRank turnOverRank = (TurnOverRank) obj;
        return Intrinsics.EZpvd((Object) this.iconV2, (Object) turnOverRank.iconV2) && Intrinsics.EZpvd((Object) this.fullNameV2, (Object) turnOverRank.fullNameV2) && Intrinsics.EZpvd((Object) this.changePerV2, (Object) turnOverRank.changePerV2) && Intrinsics.EZpvd((Object) this.volumeV2, (Object) turnOverRank.volumeV2) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) turnOverRank.lastPrice) && Intrinsics.EZpvd((Object) this.changePerDay24h, (Object) turnOverRank.changePerDay24h) && Intrinsics.EZpvd((Object) this.changePerDayUtc0, (Object) turnOverRank.changePerDayUtc0) && Intrinsics.EZpvd((Object) this.changePerDayUtc8, (Object) turnOverRank.changePerDayUtc8) && Intrinsics.EZpvd((Object) this.turnOver, (Object) turnOverRank.turnOver) && Intrinsics.EZpvd((Object) this.ccyV2, (Object) turnOverRank.ccyV2);
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
    public final String getFullNameV2() {
        return this.fullNameV2;
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
    public final String getTurnOver() {
        return this.turnOver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolumeV2() {
        return this.volumeV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.iconV2.hashCode() * 31) + this.fullNameV2.hashCode()) * 31) + this.changePerV2.hashCode()) * 31) + this.volumeV2.hashCode()) * 31) + this.lastPrice.hashCode()) * 31) + this.changePerDay24h.hashCode()) * 31) + this.changePerDayUtc0.hashCode()) * 31) + this.changePerDayUtc8.hashCode()) * 31) + this.turnOver.hashCode()) * 31) + this.ccyV2.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TurnOverRank(iconV2=" + this.iconV2 + ", fullNameV2=" + this.fullNameV2 + ", changePerV2=" + this.changePerV2 + ", volumeV2=" + this.volumeV2 + ", lastPrice=" + this.lastPrice + ", changePerDay24h=" + this.changePerDay24h + ", changePerDayUtc0=" + this.changePerDayUtc0 + ", changePerDayUtc8=" + this.changePerDayUtc8 + ", turnOver=" + this.turnOver + ", ccyV2=" + this.ccyV2 + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_find.data.TurnOverRank.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TurnOverRank> serializer() {
            return TurnOverRank$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TurnOverRank(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.lastPrice = "";
        } else {
            this.lastPrice = str7;
        }
        if ((i & 128) == 0) {
            this.changePerDay24h = "";
        } else {
            this.changePerDay24h = str8;
        }
        if ((i & 256) == 0) {
            this.changePerDayUtc0 = "";
        } else {
            this.changePerDayUtc0 = str9;
        }
        if ((i & 512) == 0) {
            this.changePerDayUtc8 = "";
        } else {
            this.changePerDayUtc8 = str10;
        }
        if ((i & 1024) == 0) {
            this.turnOver = "";
        } else {
            this.turnOver = str11;
        }
        if ((i & 2048) == 0) {
            this.ccyV2 = "";
        } else {
            this.ccyV2 = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(TurnOverRank turnOverRank, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseRank.write$Self(turnOverRank, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) turnOverRank.iconV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, turnOverRank.iconV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) turnOverRank.fullNameV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, turnOverRank.fullNameV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) turnOverRank.changePerV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, turnOverRank.changePerV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) turnOverRank.volumeV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, turnOverRank.volumeV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) turnOverRank.lastPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, turnOverRank.lastPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) turnOverRank.changePerDay24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, turnOverRank.changePerDay24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) turnOverRank.changePerDayUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, turnOverRank.changePerDayUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) turnOverRank.changePerDayUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, turnOverRank.changePerDayUtc8);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) turnOverRank.turnOver, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, turnOverRank.turnOver);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) turnOverRank.ccyV2, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, turnOverRank.ccyV2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:132) call: com.okinc.unify_find.data.TurnOverRank.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TurnOverRank(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TurnOverRank(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        this.iconV2 = str;
        this.fullNameV2 = str2;
        this.changePerV2 = str3;
        this.volumeV2 = str4;
        this.lastPrice = str5;
        this.changePerDay24h = str6;
        this.changePerDayUtc0 = str7;
        this.changePerDayUtc8 = str8;
        this.turnOver = str9;
        this.ccyV2 = str10;
    }
}
