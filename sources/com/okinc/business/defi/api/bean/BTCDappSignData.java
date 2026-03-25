package com.okinc.business.defi.api.bean;

import com.okinc.business.defi.api.model.tx.signdata.BTCMessageSignData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class BTCDappSignData {
    private String from;
    private String psbtHex;
    private List<String> psbtHexs;
    private String signStr;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};
    private static final String TYPE_BIP322_SIMPLE = BTCMessageSignData.TYPE_BIP322_SIMPLE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BTCDappSignData() {
        this((String) null, (String) null, (List) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.api.bean.BTCDappSignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BTCDappSignData copy$default(BTCDappSignData bTCDappSignData, String str, String str2, List list, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bTCDappSignData.signStr;
        }
        if ((i & 2) != 0) {
            str2 = bTCDappSignData.psbtHex;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            list = bTCDappSignData.psbtHexs;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str3 = bTCDappSignData.from;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = bTCDappSignData.type;
        }
        return bTCDappSignData.copy(str, str5, list2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.psbtHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.psbtHexs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BTCDappSignData copy(String str, String str2, List<String> list, String str3, String str4) {
        return new BTCDappSignData(str, str2, list, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BTCDappSignData)) {
            return false;
        }
        BTCDappSignData bTCDappSignData = (BTCDappSignData) obj;
        return Intrinsics.EZpvd((Object) this.signStr, (Object) bTCDappSignData.signStr) && Intrinsics.EZpvd((Object) this.psbtHex, (Object) bTCDappSignData.psbtHex) && Intrinsics.EZpvd(this.psbtHexs, bTCDappSignData.psbtHexs) && Intrinsics.EZpvd((Object) this.from, (Object) bTCDappSignData.from) && Intrinsics.EZpvd((Object) this.type, (Object) bTCDappSignData.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPsbtHex() {
        return this.psbtHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPsbtHexs() {
        return this.psbtHexs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignStr() {
        return this.signStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.signStr;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.psbtHex;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<String> list = this.psbtHexs;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str3 = this.from;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.type;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(String str) {
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPsbtHex(String str) {
        this.psbtHex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPsbtHexs(List<String> list) {
        this.psbtHexs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignStr(String str) {
        this.signStr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BTCDappSignData(signStr=" + this.signStr + ", psbtHex=" + this.psbtHex + ", psbtHexs=" + this.psbtHexs + ", from=" + this.from + ", type=" + this.type + ")";
    }

    public /* synthetic */ BTCDappSignData(int i, String str, String str2, List list, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.signStr = null;
        } else {
            this.signStr = str;
        }
        if ((i & 2) == 0) {
            this.psbtHex = null;
        } else {
            this.psbtHex = str2;
        }
        if ((i & 4) == 0) {
            this.psbtHexs = null;
        } else {
            this.psbtHexs = list;
        }
        if ((i & 8) == 0) {
            this.from = null;
        } else {
            this.from = str3;
        }
        if ((i & 16) == 0) {
            this.type = null;
        } else {
            this.type = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(BTCDappSignData bTCDappSignData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bTCDappSignData.signStr != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, bTCDappSignData.signStr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || bTCDappSignData.psbtHex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bTCDappSignData.psbtHex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || bTCDappSignData.psbtHexs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], bTCDappSignData.psbtHexs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || bTCDappSignData.from != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, bTCDappSignData.from);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && bTCDappSignData.type == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, bTCDappSignData.type);
    }

    public BTCDappSignData(String str, String str2, List<String> list, String str3, String str4) {
        this.signStr = str;
        this.psbtHex = str2;
        this.psbtHexs = list;
        this.from = str3;
        this.type = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String):void (m)] (LINE:445) call: com.okinc.business.defi.api.bean.BTCDappSignData.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BTCDappSignData(String str, String str2, List list, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.BTCDappSignData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BTCDappSignData> serializer() {
            return BTCDappSignData$$serializer.INSTANCE;
        }

        public final String KWHzl() {
            return BTCDappSignData.TYPE_BIP322_SIMPLE;
        }
    }
}
