package com.okinc.business.dexlogic.bean;

import com.okinc.business.defi.api.bean.SignData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C23316hvt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class ApproveUnsignedData {
    private String approveGasLimitCoefficient;
    private final String bizLoad;
    private String data;
    private String dexContractAddress;
    private String from;
    private String id;
    private final String quoteId;
    private final ReminderInfo reminderInfo;
    private String to;
    private String unsignedTx;
    private String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApproveUnsignedData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ReminderInfo) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReminderInfo component10() {
        return this.reminderInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.dexContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.approveGasLimitCoefficient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.bizLoad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveUnsignedData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull ReminderInfo reminderInfo, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(reminderInfo, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new ApproveUnsignedData(str, str2, str3, str4, str5, str6, str7, str8, str9, reminderInfo, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproveUnsignedData)) {
            return false;
        }
        ApproveUnsignedData approveUnsignedData = (ApproveUnsignedData) obj;
        return Intrinsics.EZpvd((Object) this.data, (Object) approveUnsignedData.data) && Intrinsics.EZpvd((Object) this.id, (Object) approveUnsignedData.id) && Intrinsics.EZpvd((Object) this.from, (Object) approveUnsignedData.from) && Intrinsics.EZpvd((Object) this.to, (Object) approveUnsignedData.to) && Intrinsics.EZpvd((Object) this.value, (Object) approveUnsignedData.value) && Intrinsics.EZpvd((Object) this.dexContractAddress, (Object) approveUnsignedData.dexContractAddress) && Intrinsics.EZpvd((Object) this.unsignedTx, (Object) approveUnsignedData.unsignedTx) && Intrinsics.EZpvd((Object) this.approveGasLimitCoefficient, (Object) approveUnsignedData.approveGasLimitCoefficient) && Intrinsics.EZpvd((Object) this.bizLoad, (Object) approveUnsignedData.bizLoad) && Intrinsics.EZpvd(this.reminderInfo, approveUnsignedData.reminderInfo) && Intrinsics.EZpvd((Object) this.quoteId, (Object) approveUnsignedData.quoteId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApproveGasLimitCoefficient() {
        return this.approveGasLimitCoefficient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizLoad() {
        return this.bizLoad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexContractAddress() {
        return this.dexContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReminderInfo getReminderInfo() {
        return this.reminderInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.data.hashCode() * 31) + this.id.hashCode()) * 31) + this.from.hashCode()) * 31) + this.to.hashCode()) * 31) + this.value.hashCode()) * 31) + this.dexContractAddress.hashCode()) * 31) + this.unsignedTx.hashCode()) * 31) + this.approveGasLimitCoefficient.hashCode()) * 31) + this.bizLoad.hashCode()) * 31) + this.reminderInfo.hashCode()) * 31) + this.quoteId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApproveGasLimitCoefficient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.approveGasLimitCoefficient = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dexContractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnsignedTx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unsignedTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApproveUnsignedData(data=" + this.data + ", id=" + this.id + ", from=" + this.from + ", to=" + this.to + ", value=" + this.value + ", dexContractAddress=" + this.dexContractAddress + ", unsignedTx=" + this.unsignedTx + ", approveGasLimitCoefficient=" + this.approveGasLimitCoefficient + ", bizLoad=" + this.bizLoad + ", reminderInfo=" + this.reminderInfo + ", quoteId=" + this.quoteId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.ApproveUnsignedData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ApproveUnsignedData> serializer() {
            return ApproveUnsignedData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ApproveUnsignedData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ReminderInfo reminderInfo, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.data = "";
        } else {
            this.data = str;
        }
        if ((i & 2) == 0) {
            this.id = "";
        } else {
            this.id = str2;
        }
        if ((i & 4) == 0) {
            this.from = "";
        } else {
            this.from = str3;
        }
        if ((i & 8) == 0) {
            this.to = "";
        } else {
            this.to = str4;
        }
        if ((i & 16) == 0) {
            this.value = "";
        } else {
            this.value = str5;
        }
        if ((i & 32) == 0) {
            this.dexContractAddress = "";
        } else {
            this.dexContractAddress = str6;
        }
        if ((i & 64) == 0) {
            this.unsignedTx = "";
        } else {
            this.unsignedTx = str7;
        }
        if ((i & 128) == 0) {
            this.approveGasLimitCoefficient = "";
        } else {
            this.approveGasLimitCoefficient = str8;
        }
        if ((i & 256) == 0) {
            this.bizLoad = "";
        } else {
            this.bizLoad = str9;
        }
        if ((i & 512) == 0) {
            this.reminderInfo = new ReminderInfo(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.reminderInfo = reminderInfo;
        }
        if ((i & 1024) == 0) {
            this.quoteId = "";
        } else {
            this.quoteId = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ApproveUnsignedData approveUnsignedData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) approveUnsignedData.data, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, approveUnsignedData.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) approveUnsignedData.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, approveUnsignedData.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) approveUnsignedData.from, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, approveUnsignedData.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) approveUnsignedData.to, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, approveUnsignedData.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) approveUnsignedData.value, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, approveUnsignedData.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) approveUnsignedData.dexContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, approveUnsignedData.dexContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) approveUnsignedData.unsignedTx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, approveUnsignedData.unsignedTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) approveUnsignedData.approveGasLimitCoefficient, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, approveUnsignedData.approveGasLimitCoefficient);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) approveUnsignedData.bizLoad, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, approveUnsignedData.bizLoad);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(approveUnsignedData.reminderInfo, new ReminderInfo(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, ReminderInfo$$serializer.INSTANCE, approveUnsignedData.reminderInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) approveUnsignedData.quoteId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, approveUnsignedData.quoteId);
    }

    public ApproveUnsignedData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull ReminderInfo reminderInfo, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(reminderInfo, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.data = str;
        this.id = str2;
        this.from = str3;
        this.to = str4;
        this.value = str5;
        this.dexContractAddress = str6;
        this.unsignedTx = str7;
        this.approveGasLimitCoefficient = str8;
        this.bizLoad = str9;
        this.reminderInfo = reminderInfo;
        this.quoteId = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0089: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.ReminderInfo:?: TERNARY null = ((wrap:int:0x004c: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0064: CONSTRUCTOR 
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:1499) call: com.okinc.business.dexlogic.bean.ReminderInfo.<init>(boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r27v0 com.okinc.business.dexlogic.bean.ReminderInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ReminderInfo, java.lang.String):void (m)] (LINE:1489) call: com.okinc.business.dexlogic.bean.ApproveUnsignedData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ReminderInfo, java.lang.String):void type: THIS */
    public /* synthetic */ ApproveUnsignedData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ReminderInfo reminderInfo, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? new ReminderInfo(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : reminderInfo, (i & 1024) == 0 ? str10 : "");
    }

    public static /* synthetic */ String getSignDataJson$default(ApproveUnsignedData approveUnsignedData, boolean z, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = 2;
        }
        return approveUnsignedData.getSignDataJson(z, num);
    }

    public final String getSignDataJson(boolean z, Integer num) {
        if (!z) {
            return this.unsignedTx;
        }
        return C23316hvt.OLrzqt(new SignData((String) null, (String) null, (String) null, (String) null, this.to, this.data, this.from, (String) null, num, (List) null, 655, (DefaultConstructorMarker) null));
    }
}
