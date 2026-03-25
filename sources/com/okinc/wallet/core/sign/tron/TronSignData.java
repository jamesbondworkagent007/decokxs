package com.okinc.wallet.core.sign.tron;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TronSignData {
    private static final KSerializer<Object>[] $childSerializers;
    private List<String> fullSignature;
    private TronRawData raw_data;
    private String raw_data_hex;
    private String serviceCharge;
    private List<String> signature;
    private String txHashValue;
    private String txID;
    private Boolean visible;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TronSignData() {
        this((TronRawData) null, (String) null, (List) null, (String) null, (Boolean) null, (String) null, (String) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TronRawData component1() {
        return this.raw_data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.raw_data_hex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.txID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.txHashValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component8() {
        return this.fullSignature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TronSignData copy(TronRawData tronRawData, String str, List<String> list, String str2, Boolean bool, String str3, String str4, List<String> list2) {
        return new TronSignData(tronRawData, str, list, str2, bool, str3, str4, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TronSignData)) {
            return false;
        }
        TronSignData tronSignData = (TronSignData) obj;
        return Intrinsics.EZpvd(this.raw_data, tronSignData.raw_data) && Intrinsics.EZpvd((Object) this.raw_data_hex, (Object) tronSignData.raw_data_hex) && Intrinsics.EZpvd(this.signature, tronSignData.signature) && Intrinsics.EZpvd((Object) this.txID, (Object) tronSignData.txID) && Intrinsics.EZpvd(this.visible, tronSignData.visible) && Intrinsics.EZpvd((Object) this.serviceCharge, (Object) tronSignData.serviceCharge) && Intrinsics.EZpvd((Object) this.txHashValue, (Object) tronSignData.txHashValue) && Intrinsics.EZpvd(this.fullSignature, tronSignData.fullSignature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getFullSignature() {
        return this.fullSignature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TronRawData getRaw_data() {
        return this.raw_data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRaw_data_hex() {
        return this.raw_data_hex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceCharge() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHashValue() {
        return this.txHashValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxID() {
        return this.txID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getVisible() {
        return this.visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TronRawData tronRawData = this.raw_data;
        int iHashCode = tronRawData == null ? 0 : tronRawData.hashCode();
        String str = this.raw_data_hex;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<String> list = this.signature;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str2 = this.txID;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.visible;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        String str3 = this.serviceCharge;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.txHashValue;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        List<String> list2 = this.fullSignature;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullSignature(List<String> list) {
        this.fullSignature = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRaw_data(TronRawData tronRawData) {
        this.raw_data = tronRawData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRaw_data_hex(String str) {
        this.raw_data_hex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServiceCharge(String str) {
        this.serviceCharge = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(List<String> list) {
        this.signature = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHashValue(String str) {
        this.txHashValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxID(String str) {
        this.txID = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVisible(Boolean bool) {
        this.visible = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TronSignData(raw_data=" + this.raw_data + ", raw_data_hex=" + this.raw_data_hex + ", signature=" + this.signature + ", txID=" + this.txID + ", visible=" + this.visible + ", serviceCharge=" + this.serviceCharge + ", txHashValue=" + this.txHashValue + ", fullSignature=" + this.fullSignature + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.tron.TronSignData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TronSignData> serializer() {
            return TronSignData$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ TronSignData(int i, TronRawData tronRawData, String str, List list, String str2, Boolean bool, String str3, String str4, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.raw_data = null;
        } else {
            this.raw_data = tronRawData;
        }
        if ((i & 2) == 0) {
            this.raw_data_hex = null;
        } else {
            this.raw_data_hex = str;
        }
        if ((i & 4) == 0) {
            this.signature = null;
        } else {
            this.signature = list;
        }
        if ((i & 8) == 0) {
            this.txID = null;
        } else {
            this.txID = str2;
        }
        if ((i & 16) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 32) == 0) {
            this.serviceCharge = null;
        } else {
            this.serviceCharge = str3;
        }
        if ((i & 64) == 0) {
            this.txHashValue = null;
        } else {
            this.txHashValue = str4;
        }
        if ((i & 128) == 0) {
            this.fullSignature = null;
        } else {
            this.fullSignature = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(TronSignData tronSignData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tronSignData.raw_data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TronRawData$$serializer.INSTANCE, tronSignData.raw_data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tronSignData.raw_data_hex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tronSignData.raw_data_hex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tronSignData.signature != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], tronSignData.signature);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tronSignData.txID != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tronSignData.txID);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tronSignData.visible != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, tronSignData.visible);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tronSignData.serviceCharge != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tronSignData.serviceCharge);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tronSignData.txHashValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tronSignData.txHashValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && tronSignData.fullSignature == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], tronSignData.fullSignature);
    }

    public TronSignData(TronRawData tronRawData, String str, List<String> list, String str2, Boolean bool, String str3, String str4, List<String> list2) {
        this.raw_data = tronRawData;
        this.raw_data_hex = str;
        this.signature = list;
        this.txID = str2;
        this.visible = bool;
        this.serviceCharge = str3;
        this.txHashValue = str4;
        this.fullSignature = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:com.okinc.wallet.core.sign.tron.TronRawData:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.core.sign.tron.TronRawData) : (r10v0 com.okinc.wallet.core.sign.tron.TronRawData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r14v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.util.List) : (null java.util.List))
 A[MD:(com.okinc.wallet.core.sign.tron.TronRawData, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:49) call: com.okinc.wallet.core.sign.tron.TronSignData.<init>(com.okinc.wallet.core.sign.tron.TronRawData, java.lang.String, java.util.List, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TronSignData(TronRawData tronRawData, String str, List list, String str2, Boolean bool, String str3, String str4, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tronRawData, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) == 0 ? list2 : null);
    }
}
