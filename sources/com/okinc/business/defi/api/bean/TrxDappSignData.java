package com.okinc.business.defi.api.bean;

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

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class TrxDappSignData {
    private RawData raw_data;
    private String raw_data_hex;
    private List<String> signature;
    private String txID;
    private Boolean visible;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrxDappSignData() {
        this((RawData) null, (String) null, (List) null, (String) null, (Boolean) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.api.bean.TrxDappSignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrxDappSignData copy$default(TrxDappSignData trxDappSignData, RawData rawData, String str, List list, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            rawData = trxDappSignData.raw_data;
        }
        if ((i & 2) != 0) {
            str = trxDappSignData.raw_data_hex;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            list = trxDappSignData.signature;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str2 = trxDappSignData.txID;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bool = trxDappSignData.visible;
        }
        return trxDappSignData.copy(rawData, str3, list2, str4, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RawData component1() {
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
    public final TrxDappSignData copy(RawData rawData, String str, List<String> list, String str2, Boolean bool) {
        return new TrxDappSignData(rawData, str, list, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrxDappSignData)) {
            return false;
        }
        TrxDappSignData trxDappSignData = (TrxDappSignData) obj;
        return Intrinsics.EZpvd(this.raw_data, trxDappSignData.raw_data) && Intrinsics.EZpvd((Object) this.raw_data_hex, (Object) trxDappSignData.raw_data_hex) && Intrinsics.EZpvd(this.signature, trxDappSignData.signature) && Intrinsics.EZpvd((Object) this.txID, (Object) trxDappSignData.txID) && Intrinsics.EZpvd(this.visible, trxDappSignData.visible);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RawData getRaw_data() {
        return this.raw_data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRaw_data_hex() {
        return this.raw_data_hex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSignature() {
        return this.signature;
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
        RawData rawData = this.raw_data;
        int iHashCode = rawData == null ? 0 : rawData.hashCode();
        String str = this.raw_data_hex;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<String> list = this.signature;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str2 = this.txID;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.visible;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRaw_data(RawData rawData) {
        this.raw_data = rawData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRaw_data_hex(String str) {
        this.raw_data_hex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(List<String> list) {
        this.signature = list;
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
        return "TrxDappSignData(raw_data=" + this.raw_data + ", raw_data_hex=" + this.raw_data_hex + ", signature=" + this.signature + ", txID=" + this.txID + ", visible=" + this.visible + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.TrxDappSignData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrxDappSignData> serializer() {
            return TrxDappSignData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrxDappSignData(int i, RawData rawData, String str, List list, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.raw_data = null;
        } else {
            this.raw_data = rawData;
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
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(TrxDappSignData trxDappSignData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || trxDappSignData.raw_data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, RawData$$serializer.INSTANCE, trxDappSignData.raw_data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || trxDappSignData.raw_data_hex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, trxDappSignData.raw_data_hex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || trxDappSignData.signature != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], trxDappSignData.signature);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || trxDappSignData.txID != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, trxDappSignData.txID);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && trxDappSignData.visible == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, trxDappSignData.visible);
    }

    public TrxDappSignData(RawData rawData, String str, List<String> list, String str2, Boolean bool) {
        this.raw_data = rawData;
        this.raw_data_hex = str;
        this.signature = list;
        this.txID = str2;
        this.visible = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.api.bean.RawData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.RawData) : (r5v0 com.okinc.business.defi.api.bean.RawData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r9v0 java.lang.Boolean))
 A[MD:(com.okinc.business.defi.api.bean.RawData, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.Boolean):void (m)] (LINE:391) call: com.okinc.business.defi.api.bean.TrxDappSignData.<init>(com.okinc.business.defi.api.bean.RawData, java.lang.String, java.util.List, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TrxDappSignData(RawData rawData, String str, List list, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rawData, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool);
    }
}
