package com.okinc.dexkline.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class TransactionInfoData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String buyAmountUsd;
    private final String buyNo;
    private final String buyTraders;
    private final Boolean hasPushed;
    private final String inflow;
    private final String sellAmountUsd;
    private final String sellNo;
    private final String sellTraders;
    private final String totalAmountUsd;
    private final String totalNo;
    private final String totalTraders;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionInfoData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 2047, (DefaultConstructorMarker) null);
    }

    @SerialName("buyAmountUsd")
    public static /* synthetic */ void getBuyAmountUsd$annotations() {
    }

    @SerialName("buyNo")
    public static /* synthetic */ void getBuyNo$annotations() {
    }

    @SerialName("buyTraders")
    public static /* synthetic */ void getBuyTraders$annotations() {
    }

    @SerialName("hasPushed")
    public static /* synthetic */ void getHasPushed$annotations() {
    }

    @SerialName("inflow")
    public static /* synthetic */ void getInflow$annotations() {
    }

    @SerialName("sellAmountUsd")
    public static /* synthetic */ void getSellAmountUsd$annotations() {
    }

    @SerialName("sellNo")
    public static /* synthetic */ void getSellNo$annotations() {
    }

    @SerialName("sellTraders")
    public static /* synthetic */ void getSellTraders$annotations() {
    }

    @SerialName("totalAmountUsd")
    public static /* synthetic */ void getTotalAmountUsd$annotations() {
    }

    @SerialName("totalNo")
    public static /* synthetic */ void getTotalNo$annotations() {
    }

    @SerialName("totalTraders")
    public static /* synthetic */ void getTotalTraders$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.buyAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.totalTraders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.hasPushed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.buyNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.buyTraders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sellAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sellNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.inflow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sellTraders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.totalAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.totalNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionInfoData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool) {
        return new TransactionInfoData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionInfoData)) {
            return false;
        }
        TransactionInfoData transactionInfoData = (TransactionInfoData) obj;
        return Intrinsics.EZpvd((Object) this.buyAmountUsd, (Object) transactionInfoData.buyAmountUsd) && Intrinsics.EZpvd((Object) this.buyNo, (Object) transactionInfoData.buyNo) && Intrinsics.EZpvd((Object) this.buyTraders, (Object) transactionInfoData.buyTraders) && Intrinsics.EZpvd((Object) this.sellAmountUsd, (Object) transactionInfoData.sellAmountUsd) && Intrinsics.EZpvd((Object) this.sellNo, (Object) transactionInfoData.sellNo) && Intrinsics.EZpvd((Object) this.inflow, (Object) transactionInfoData.inflow) && Intrinsics.EZpvd((Object) this.sellTraders, (Object) transactionInfoData.sellTraders) && Intrinsics.EZpvd((Object) this.totalAmountUsd, (Object) transactionInfoData.totalAmountUsd) && Intrinsics.EZpvd((Object) this.totalNo, (Object) transactionInfoData.totalNo) && Intrinsics.EZpvd((Object) this.totalTraders, (Object) transactionInfoData.totalTraders) && Intrinsics.EZpvd(this.hasPushed, transactionInfoData.hasPushed);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyAmountUsd() {
        return this.buyAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyNo() {
        return this.buyNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyTraders() {
        return this.buyTraders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasPushed() {
        return this.hasPushed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInflow() {
        return this.inflow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellAmountUsd() {
        return this.sellAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellNo() {
        return this.sellNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellTraders() {
        return this.sellTraders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmountUsd() {
        return this.totalAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalNo() {
        return this.totalNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalTraders() {
        return this.totalTraders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.buyAmountUsd;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.buyNo;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.buyTraders;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.sellAmountUsd;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.sellNo;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.inflow;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.sellTraders;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.totalAmountUsd;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.totalNo;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.totalTraders;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        Boolean bool = this.hasPushed;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionInfoData(buyAmountUsd=" + this.buyAmountUsd + ", buyNo=" + this.buyNo + ", buyTraders=" + this.buyTraders + ", sellAmountUsd=" + this.sellAmountUsd + ", sellNo=" + this.sellNo + ", inflow=" + this.inflow + ", sellTraders=" + this.sellTraders + ", totalAmountUsd=" + this.totalAmountUsd + ", totalNo=" + this.totalNo + ", totalTraders=" + this.totalTraders + ", hasPushed=" + this.hasPushed + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.TransactionInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionInfoData> serializer() {
            return TransactionInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionInfoData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.buyAmountUsd = "";
        } else {
            this.buyAmountUsd = str;
        }
        if ((i & 2) == 0) {
            this.buyNo = "";
        } else {
            this.buyNo = str2;
        }
        if ((i & 4) == 0) {
            this.buyTraders = "";
        } else {
            this.buyTraders = str3;
        }
        if ((i & 8) == 0) {
            this.sellAmountUsd = "";
        } else {
            this.sellAmountUsd = str4;
        }
        if ((i & 16) == 0) {
            this.sellNo = "";
        } else {
            this.sellNo = str5;
        }
        if ((i & 32) == 0) {
            this.inflow = "";
        } else {
            this.inflow = str6;
        }
        if ((i & 64) == 0) {
            this.sellTraders = "";
        } else {
            this.sellTraders = str7;
        }
        if ((i & 128) == 0) {
            this.totalAmountUsd = "";
        } else {
            this.totalAmountUsd = str8;
        }
        if ((i & 256) == 0) {
            this.totalNo = "";
        } else {
            this.totalNo = str9;
        }
        if ((i & 512) == 0) {
            this.totalTraders = "";
        } else {
            this.totalTraders = str10;
        }
        if ((i & 1024) == 0) {
            this.hasPushed = Boolean.FALSE;
        } else {
            this.hasPushed = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(TransactionInfoData transactionInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) transactionInfoData.buyAmountUsd, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, transactionInfoData.buyAmountUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) transactionInfoData.buyNo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, transactionInfoData.buyNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) transactionInfoData.buyTraders, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, transactionInfoData.buyTraders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) transactionInfoData.sellAmountUsd, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, transactionInfoData.sellAmountUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) transactionInfoData.sellNo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, transactionInfoData.sellNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) transactionInfoData.inflow, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, transactionInfoData.inflow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) transactionInfoData.sellTraders, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, transactionInfoData.sellTraders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) transactionInfoData.totalAmountUsd, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, transactionInfoData.totalAmountUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) transactionInfoData.totalNo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, transactionInfoData.totalNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) transactionInfoData.totalTraders, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, transactionInfoData.totalTraders);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd(transactionInfoData.hasPushed, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, transactionInfoData.hasPushed);
    }

    public TransactionInfoData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool) {
        this.buyAmountUsd = str;
        this.buyNo = str2;
        this.buyTraders = str3;
        this.sellAmountUsd = str4;
        this.sellNo = str5;
        this.inflow = str6;
        this.sellTraders = str7;
        this.totalAmountUsd = str8;
        this.totalNo = str9;
        this.totalTraders = str10;
        this.hasPushed = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (""))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0054: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r23v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:9) call: com.okinc.dexkline.market.data.model.TransactionInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TransactionInfoData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "", (i & 1024) != 0 ? Boolean.FALSE : bool);
    }
}
