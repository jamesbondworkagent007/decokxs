package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class TradeFeeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String category;
    private final String delivery;
    private final String exercise;
    private final String instType;
    private final String maker;
    private final String taker;
    private final String ts;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeFeeInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeFeeInfo copy$default(TradeFeeInfo tradeFeeInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeFeeInfo.category;
        }
        if ((i & 2) != 0) {
            str2 = tradeFeeInfo.taker;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = tradeFeeInfo.maker;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = tradeFeeInfo.delivery;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = tradeFeeInfo.exercise;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = tradeFeeInfo.instType;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = tradeFeeInfo.ts;
        }
        return tradeFeeInfo.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.taker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.delivery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.exercise;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeFeeInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new TradeFeeInfo(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeFeeInfo)) {
            return false;
        }
        TradeFeeInfo tradeFeeInfo = (TradeFeeInfo) obj;
        return Intrinsics.EZpvd((Object) this.category, (Object) tradeFeeInfo.category) && Intrinsics.EZpvd((Object) this.taker, (Object) tradeFeeInfo.taker) && Intrinsics.EZpvd((Object) this.maker, (Object) tradeFeeInfo.maker) && Intrinsics.EZpvd((Object) this.delivery, (Object) tradeFeeInfo.delivery) && Intrinsics.EZpvd((Object) this.exercise, (Object) tradeFeeInfo.exercise) && Intrinsics.EZpvd((Object) this.instType, (Object) tradeFeeInfo.instType) && Intrinsics.EZpvd((Object) this.ts, (Object) tradeFeeInfo.ts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDelivery() {
        return this.delivery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExercise() {
        return this.exercise;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaker() {
        return this.maker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTaker() {
        return this.taker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.category.hashCode() * 31) + this.taker.hashCode()) * 31) + this.maker.hashCode()) * 31) + this.delivery.hashCode()) * 31) + this.exercise.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.ts.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeFeeInfo(category=" + this.category + ", taker=" + this.taker + ", maker=" + this.maker + ", delivery=" + this.delivery + ", exercise=" + this.exercise + ", instType=" + this.instType + ", ts=" + this.ts + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeFeeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeFeeInfo> serializer() {
            return TradeFeeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeFeeInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.category = "";
        } else {
            this.category = str;
        }
        if ((i & 2) == 0) {
            this.taker = "";
        } else {
            this.taker = str2;
        }
        if ((i & 4) == 0) {
            this.maker = "";
        } else {
            this.maker = str3;
        }
        if ((i & 8) == 0) {
            this.delivery = "";
        } else {
            this.delivery = str4;
        }
        if ((i & 16) == 0) {
            this.exercise = "";
        } else {
            this.exercise = str5;
        }
        if ((i & 32) == 0) {
            this.instType = "";
        } else {
            this.instType = str6;
        }
        if ((i & 64) == 0) {
            this.ts = "";
        } else {
            this.ts = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeFeeInfo tradeFeeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeFeeInfo.category, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeFeeInfo.category);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeFeeInfo.taker, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeFeeInfo.taker);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeFeeInfo.maker, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeFeeInfo.maker);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradeFeeInfo.delivery, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeFeeInfo.delivery);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradeFeeInfo.exercise, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeFeeInfo.exercise);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tradeFeeInfo.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tradeFeeInfo.instType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) tradeFeeInfo.ts, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, tradeFeeInfo.ts);
    }

    public TradeFeeInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.category = str;
        this.taker = str2;
        this.maker = str3;
        this.delivery = str4;
        this.exercise = str5;
        this.instType = str6;
        this.ts = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:186) call: com.okinc.unify_trade.biz.TradeFeeInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradeFeeInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
