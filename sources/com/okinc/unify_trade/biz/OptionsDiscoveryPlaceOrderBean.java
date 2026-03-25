package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class OptionsDiscoveryPlaceOrderBean {
    private String clOrdId;
    private String ordId;
    private String sCode;
    private String sMsg;
    private String tag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OptionsDiscoveryPlaceOrderBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OptionsDiscoveryPlaceOrderBean copy$default(OptionsDiscoveryPlaceOrderBean optionsDiscoveryPlaceOrderBean, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionsDiscoveryPlaceOrderBean.clOrdId;
        }
        if ((i & 2) != 0) {
            str2 = optionsDiscoveryPlaceOrderBean.ordId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = optionsDiscoveryPlaceOrderBean.tag;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = optionsDiscoveryPlaceOrderBean.sCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = optionsDiscoveryPlaceOrderBean.sMsg;
        }
        return optionsDiscoveryPlaceOrderBean.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.clOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionsDiscoveryPlaceOrderBean copy(String str, String str2, String str3, String str4, String str5) {
        return new OptionsDiscoveryPlaceOrderBean(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionsDiscoveryPlaceOrderBean)) {
            return false;
        }
        OptionsDiscoveryPlaceOrderBean optionsDiscoveryPlaceOrderBean = (OptionsDiscoveryPlaceOrderBean) obj;
        return Intrinsics.EZpvd((Object) this.clOrdId, (Object) optionsDiscoveryPlaceOrderBean.clOrdId) && Intrinsics.EZpvd((Object) this.ordId, (Object) optionsDiscoveryPlaceOrderBean.ordId) && Intrinsics.EZpvd((Object) this.tag, (Object) optionsDiscoveryPlaceOrderBean.tag) && Intrinsics.EZpvd((Object) this.sCode, (Object) optionsDiscoveryPlaceOrderBean.sCode) && Intrinsics.EZpvd((Object) this.sMsg, (Object) optionsDiscoveryPlaceOrderBean.sMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClOrdId() {
        return this.clOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSCode() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSMsg() {
        return this.sMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.clOrdId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ordId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tag;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.sCode;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.sMsg;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClOrdId(String str) {
        this.clOrdId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(String str) {
        this.ordId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSCode(String str) {
        this.sCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSMsg(String str) {
        this.sMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OptionsDiscoveryPlaceOrderBean(clOrdId=" + this.clOrdId + ", ordId=" + this.ordId + ", tag=" + this.tag + ", sCode=" + this.sCode + ", sMsg=" + this.sMsg + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OptionsDiscoveryPlaceOrderBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OptionsDiscoveryPlaceOrderBean> serializer() {
            return OptionsDiscoveryPlaceOrderBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OptionsDiscoveryPlaceOrderBean(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.clOrdId = null;
        } else {
            this.clOrdId = str;
        }
        if ((i & 2) == 0) {
            this.ordId = null;
        } else {
            this.ordId = str2;
        }
        if ((i & 4) == 0) {
            this.tag = null;
        } else {
            this.tag = str3;
        }
        if ((i & 8) == 0) {
            this.sCode = null;
        } else {
            this.sCode = str4;
        }
        if ((i & 16) == 0) {
            this.sMsg = null;
        } else {
            this.sMsg = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OptionsDiscoveryPlaceOrderBean optionsDiscoveryPlaceOrderBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || optionsDiscoveryPlaceOrderBean.clOrdId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, optionsDiscoveryPlaceOrderBean.clOrdId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || optionsDiscoveryPlaceOrderBean.ordId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, optionsDiscoveryPlaceOrderBean.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || optionsDiscoveryPlaceOrderBean.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, optionsDiscoveryPlaceOrderBean.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || optionsDiscoveryPlaceOrderBean.sCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, optionsDiscoveryPlaceOrderBean.sCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && optionsDiscoveryPlaceOrderBean.sMsg == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, optionsDiscoveryPlaceOrderBean.sMsg);
    }

    public OptionsDiscoveryPlaceOrderBean(String str, String str2, String str3, String str4, String str5) {
        this.clOrdId = str;
        this.ordId = str2;
        this.tag = str3;
        this.sCode = str4;
        this.sMsg = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:933) call: com.okinc.unify_trade.biz.OptionsDiscoveryPlaceOrderBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OptionsDiscoveryPlaceOrderBean(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
