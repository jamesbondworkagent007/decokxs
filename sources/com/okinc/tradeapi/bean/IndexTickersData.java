package com.okinc.tradeapi.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class IndexTickersData {
    private String high24h;
    private String idxPx;
    private String instId;
    private String low24h;
    private String open24h;
    private String sodUtc0;
    private String sodUtc8;
    private String ts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IndexTickersData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.idxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.high24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.low24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IndexTickersData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new IndexTickersData(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexTickersData)) {
            return false;
        }
        IndexTickersData indexTickersData = (IndexTickersData) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) indexTickersData.instId) && Intrinsics.EZpvd((Object) this.idxPx, (Object) indexTickersData.idxPx) && Intrinsics.EZpvd((Object) this.high24h, (Object) indexTickersData.high24h) && Intrinsics.EZpvd((Object) this.low24h, (Object) indexTickersData.low24h) && Intrinsics.EZpvd((Object) this.open24h, (Object) indexTickersData.open24h) && Intrinsics.EZpvd((Object) this.sodUtc0, (Object) indexTickersData.sodUtc0) && Intrinsics.EZpvd((Object) this.sodUtc8, (Object) indexTickersData.sodUtc8) && Intrinsics.EZpvd((Object) this.ts, (Object) indexTickersData.ts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHigh24h() {
        return this.high24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdxPx() {
        return this.idxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLow24h() {
        return this.low24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpen24h() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc0() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc8() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.instId.hashCode() * 31) + this.idxPx.hashCode()) * 31) + this.high24h.hashCode()) * 31) + this.low24h.hashCode()) * 31) + this.open24h.hashCode()) * 31) + this.sodUtc0.hashCode()) * 31) + this.sodUtc8.hashCode()) * 31) + this.ts.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHigh24h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.high24h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIdxPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.idxPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLow24h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.low24h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpen24h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.open24h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSodUtc0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sodUtc0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSodUtc8(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sodUtc8 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ts = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IndexTickersData(instId=" + this.instId + ", idxPx=" + this.idxPx + ", high24h=" + this.high24h + ", low24h=" + this.low24h + ", open24h=" + this.open24h + ", sodUtc0=" + this.sodUtc0 + ", sodUtc8=" + this.sodUtc8 + ", ts=" + this.ts + ")";
    }

    public /* synthetic */ IndexTickersData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.idxPx = "";
        } else {
            this.idxPx = str2;
        }
        if ((i & 4) == 0) {
            this.high24h = "";
        } else {
            this.high24h = str3;
        }
        if ((i & 8) == 0) {
            this.low24h = "";
        } else {
            this.low24h = str4;
        }
        if ((i & 16) == 0) {
            this.open24h = "";
        } else {
            this.open24h = str5;
        }
        if ((i & 32) == 0) {
            this.sodUtc0 = "";
        } else {
            this.sodUtc0 = str6;
        }
        if ((i & 64) == 0) {
            this.sodUtc8 = "";
        } else {
            this.sodUtc8 = str7;
        }
        if ((i & 128) == 0) {
            this.ts = "";
        } else {
            this.ts = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(IndexTickersData indexTickersData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) indexTickersData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, indexTickersData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) indexTickersData.idxPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, indexTickersData.idxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) indexTickersData.high24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, indexTickersData.high24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) indexTickersData.low24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, indexTickersData.low24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) indexTickersData.open24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, indexTickersData.open24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) indexTickersData.sodUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, indexTickersData.sodUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) indexTickersData.sodUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, indexTickersData.sodUtc8);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) indexTickersData.ts, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, indexTickersData.ts);
    }

    public IndexTickersData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.instId = str;
        this.idxPx = str2;
        this.high24h = str3;
        this.low24h = str4;
        this.open24h = str5;
        this.sodUtc0 = str6;
        this.sodUtc8 = str7;
        this.ts = str8;
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.tradeapi.bean.IndexTickersData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ IndexTickersData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }

    public static final class Companion {

        public static final class Activity extends TypeToken<List<? extends IndexTickersData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeapi.bean.IndexTickersData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IndexTickersData> serializer() {
            return IndexTickersData$$serializer.INSTANCE;
        }

        public final IndexTickersData copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List list = (List) new Gson().fromJson(str, new Activity().getType());
                if (list != null && !list.isEmpty()) {
                    return (IndexTickersData) list.get(0);
                }
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "IndexTickersData-jsonConvert" + e.getMessage());
            }
            return null;
        }
    }
}
