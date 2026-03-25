package com.okinc.unify_find.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class CandlesRequest {
    private String after;
    private String bar;
    private String before;
    private String instId;
    private String limit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CandlesRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CandlesRequest copy$default(CandlesRequest candlesRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = candlesRequest.instId;
        }
        if ((i & 2) != 0) {
            str2 = candlesRequest.after;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = candlesRequest.before;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = candlesRequest.bar;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = candlesRequest.limit;
        }
        return candlesRequest.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.after;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.before;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CandlesRequest copy(@NotNull String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CandlesRequest(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CandlesRequest)) {
            return false;
        }
        CandlesRequest candlesRequest = (CandlesRequest) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) candlesRequest.instId) && Intrinsics.EZpvd((Object) this.after, (Object) candlesRequest.after) && Intrinsics.EZpvd((Object) this.before, (Object) candlesRequest.before) && Intrinsics.EZpvd((Object) this.bar, (Object) candlesRequest.bar) && Intrinsics.EZpvd((Object) this.limit, (Object) candlesRequest.limit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAfter() {
        return this.after;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBar() {
        return this.bar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBefore() {
        return this.before;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        String str = this.after;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.before;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.bar;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.limit;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAfter(String str) {
        this.after = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBar(String str) {
        this.bar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBefore(String str) {
        this.before = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimit(String str) {
        this.limit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CandlesRequest(instId=" + this.instId + ", after=" + this.after + ", before=" + this.before + ", bar=" + this.bar + ", limit=" + this.limit + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_find.data.CandlesRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CandlesRequest> serializer() {
            return CandlesRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CandlesRequest(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        this.instId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.after = null;
        } else {
            this.after = str2;
        }
        if ((i & 4) == 0) {
            this.before = null;
        } else {
            this.before = str3;
        }
        if ((i & 8) == 0) {
            this.bar = null;
        } else {
            this.bar = str4;
        }
        if ((i & 16) == 0) {
            this.limit = null;
        } else {
            this.limit = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(CandlesRequest candlesRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) candlesRequest.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, candlesRequest.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || candlesRequest.after != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, candlesRequest.after);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || candlesRequest.before != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, candlesRequest.before);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || candlesRequest.bar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, candlesRequest.bar);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && candlesRequest.limit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, candlesRequest.limit);
    }

    public CandlesRequest(@NotNull String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
        this.after = str2;
        this.before = str3;
        this.bar = str4;
        this.limit = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.unify_find.data.CandlesRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CandlesRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }
}
