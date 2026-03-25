package com.okinc.unify_find.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class RankListRequest {
    private final String marketCap;
    private final String num;
    private final String period;
    private final String plateType;
    private final String rank;
    private String type;
    private final String zone;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RankListRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RankListRequest copy$default(RankListRequest rankListRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rankListRequest.plateType;
        }
        if ((i & 2) != 0) {
            str2 = rankListRequest.marketCap;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = rankListRequest.num;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = rankListRequest.rank;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = rankListRequest.period;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = rankListRequest.zone;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = rankListRequest.type;
        }
        return rankListRequest.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.plateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.rank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.zone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankListRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new RankListRequest(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankListRequest)) {
            return false;
        }
        RankListRequest rankListRequest = (RankListRequest) obj;
        return Intrinsics.EZpvd((Object) this.plateType, (Object) rankListRequest.plateType) && Intrinsics.EZpvd((Object) this.marketCap, (Object) rankListRequest.marketCap) && Intrinsics.EZpvd((Object) this.num, (Object) rankListRequest.num) && Intrinsics.EZpvd((Object) this.rank, (Object) rankListRequest.rank) && Intrinsics.EZpvd((Object) this.period, (Object) rankListRequest.period) && Intrinsics.EZpvd((Object) this.zone, (Object) rankListRequest.zone) && Intrinsics.EZpvd((Object) this.type, (Object) rankListRequest.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNum() {
        return this.num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlateType() {
        return this.plateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRank() {
        return this.rank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getZone() {
        return this.zone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.plateType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.marketCap;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.num;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.rank;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.period;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.zone;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.type;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RankListRequest(plateType=" + this.plateType + ", marketCap=" + this.marketCap + ", num=" + this.num + ", rank=" + this.rank + ", period=" + this.period + ", zone=" + this.zone + ", type=" + this.type + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_find.data.RankListRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RankListRequest> serializer() {
            return RankListRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RankListRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.plateType = null;
        } else {
            this.plateType = str;
        }
        if ((i & 2) == 0) {
            this.marketCap = null;
        } else {
            this.marketCap = str2;
        }
        if ((i & 4) == 0) {
            this.num = null;
        } else {
            this.num = str3;
        }
        if ((i & 8) == 0) {
            this.rank = null;
        } else {
            this.rank = str4;
        }
        if ((i & 16) == 0) {
            this.period = null;
        } else {
            this.period = str5;
        }
        if ((i & 32) == 0) {
            this.zone = null;
        } else {
            this.zone = str6;
        }
        if ((i & 64) == 0) {
            this.type = null;
        } else {
            this.type = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(RankListRequest rankListRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rankListRequest.plateType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, rankListRequest.plateType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rankListRequest.marketCap != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, rankListRequest.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rankListRequest.num != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, rankListRequest.num);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rankListRequest.rank != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, rankListRequest.rank);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || rankListRequest.period != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, rankListRequest.period);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || rankListRequest.zone != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, rankListRequest.zone);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && rankListRequest.type == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, rankListRequest.type);
    }

    public RankListRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.plateType = str;
        this.marketCap = str2;
        this.num = str3;
        this.rank = str4;
        this.period = str5;
        this.zone = str6;
        this.type = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:51) call: com.okinc.unify_find.data.RankListRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RankListRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
