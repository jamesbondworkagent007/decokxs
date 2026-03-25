package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class SpreadTrendWithDaySubBody {
    private String arbitrageId;
    private String ctType;
    private String instFamily;
    private String type;
    private String uly;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpreadTrendWithDaySubBody() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpreadTrendWithDaySubBody copy$default(SpreadTrendWithDaySubBody spreadTrendWithDaySubBody, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spreadTrendWithDaySubBody.arbitrageId;
        }
        if ((i & 2) != 0) {
            str2 = spreadTrendWithDaySubBody.ctType;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = spreadTrendWithDaySubBody.type;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = spreadTrendWithDaySubBody.uly;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = spreadTrendWithDaySubBody.instFamily;
        }
        return spreadTrendWithDaySubBody.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.arbitrageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ctType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpreadTrendWithDaySubBody copy(String str, String str2, String str3, String str4, String str5) {
        return new SpreadTrendWithDaySubBody(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpreadTrendWithDaySubBody)) {
            return false;
        }
        SpreadTrendWithDaySubBody spreadTrendWithDaySubBody = (SpreadTrendWithDaySubBody) obj;
        return Intrinsics.EZpvd((Object) this.arbitrageId, (Object) spreadTrendWithDaySubBody.arbitrageId) && Intrinsics.EZpvd((Object) this.ctType, (Object) spreadTrendWithDaySubBody.ctType) && Intrinsics.EZpvd((Object) this.type, (Object) spreadTrendWithDaySubBody.type) && Intrinsics.EZpvd((Object) this.uly, (Object) spreadTrendWithDaySubBody.uly) && Intrinsics.EZpvd((Object) this.instFamily, (Object) spreadTrendWithDaySubBody.instFamily);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageId() {
        return this.arbitrageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtType() {
        return this.ctType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.arbitrageId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ctType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.type;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.uly;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.instFamily;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageId(String str) {
        this.arbitrageId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtType(String str) {
        this.ctType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstFamily(String str) {
        this.instFamily = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUly(String str) {
        this.uly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpreadTrendWithDaySubBody(arbitrageId=" + this.arbitrageId + ", ctType=" + this.ctType + ", type=" + this.type + ", uly=" + this.uly + ", instFamily=" + this.instFamily + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpreadTrendWithDaySubBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpreadTrendWithDaySubBody> serializer() {
            return SpreadTrendWithDaySubBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpreadTrendWithDaySubBody(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.arbitrageId = null;
        } else {
            this.arbitrageId = str;
        }
        if ((i & 2) == 0) {
            this.ctType = null;
        } else {
            this.ctType = str2;
        }
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = str3;
        }
        if ((i & 8) == 0) {
            this.uly = null;
        } else {
            this.uly = str4;
        }
        if ((i & 16) == 0) {
            this.instFamily = null;
        } else {
            this.instFamily = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpreadTrendWithDaySubBody spreadTrendWithDaySubBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spreadTrendWithDaySubBody.arbitrageId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spreadTrendWithDaySubBody.arbitrageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || spreadTrendWithDaySubBody.ctType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, spreadTrendWithDaySubBody.ctType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || spreadTrendWithDaySubBody.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, spreadTrendWithDaySubBody.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || spreadTrendWithDaySubBody.uly != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, spreadTrendWithDaySubBody.uly);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && spreadTrendWithDaySubBody.instFamily == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, spreadTrendWithDaySubBody.instFamily);
    }

    public SpreadTrendWithDaySubBody(String str, String str2, String str3, String str4, String str5) {
        this.arbitrageId = str;
        this.ctType = str2;
        this.type = str3;
        this.uly = str4;
        this.instFamily = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:36) call: com.okinc.unify_trade.biz.SpreadTrendWithDaySubBody.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpreadTrendWithDaySubBody(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
