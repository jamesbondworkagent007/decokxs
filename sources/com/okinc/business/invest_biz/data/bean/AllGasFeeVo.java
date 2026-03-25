package com.okinc.business.invest_biz.data.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class AllGasFeeVo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String allGasFee;
    public final String allGasFeeAmount;
    public final String errorMessage;
    public final String gasLimit;
    public final String gasPrice;
    public final String l1GasFee;
    public final String originGasLimit;
    public final Boolean queryGasLimitErrorUseDefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AllGasFeeVo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AllGasFeeVo EZpvd(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        return new AllGasFeeVo(str, str2, str3, str4, str5, str6, str7, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.allGasFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllGasFeeVo)) {
            return false;
        }
        AllGasFeeVo allGasFeeVo = (AllGasFeeVo) obj;
        return Intrinsics.EZpvd((Object) this.allGasFee, (Object) allGasFeeVo.allGasFee) && Intrinsics.EZpvd((Object) this.allGasFeeAmount, (Object) allGasFeeVo.allGasFeeAmount) && Intrinsics.EZpvd((Object) this.errorMessage, (Object) allGasFeeVo.errorMessage) && Intrinsics.EZpvd((Object) this.gasLimit, (Object) allGasFeeVo.gasLimit) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) allGasFeeVo.gasPrice) && Intrinsics.EZpvd((Object) this.l1GasFee, (Object) allGasFeeVo.l1GasFee) && Intrinsics.EZpvd((Object) this.originGasLimit, (Object) allGasFeeVo.originGasLimit) && Intrinsics.EZpvd(this.queryGasLimitErrorUseDefault, allGasFeeVo.queryGasLimitErrorUseDefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.allGasFee;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.allGasFeeAmount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.errorMessage;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.gasLimit;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.gasPrice;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.l1GasFee;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.originGasLimit;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        Boolean bool = this.queryGasLimitErrorUseDefault;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AllGasFeeVo(allGasFee=" + this.allGasFee + ", allGasFeeAmount=" + this.allGasFeeAmount + ", errorMessage=" + this.errorMessage + ", gasLimit=" + this.gasLimit + ", gasPrice=" + this.gasPrice + ", l1GasFee=" + this.l1GasFee + ", originGasLimit=" + this.originGasLimit + ", queryGasLimitErrorUseDefault=" + this.queryGasLimitErrorUseDefault + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.AllGasFeeVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AllGasFeeVo> serializer() {
            return AllGasFeeVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AllGasFeeVo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.allGasFee = "";
        } else {
            this.allGasFee = str;
        }
        if ((i & 2) == 0) {
            this.allGasFeeAmount = "";
        } else {
            this.allGasFeeAmount = str2;
        }
        if ((i & 4) == 0) {
            this.errorMessage = "";
        } else {
            this.errorMessage = str3;
        }
        if ((i & 8) == 0) {
            this.gasLimit = "";
        } else {
            this.gasLimit = str4;
        }
        if ((i & 16) == 0) {
            this.gasPrice = "";
        } else {
            this.gasPrice = str5;
        }
        if ((i & 32) == 0) {
            this.l1GasFee = "";
        } else {
            this.l1GasFee = str6;
        }
        if ((i & 64) == 0) {
            this.originGasLimit = "";
        } else {
            this.originGasLimit = str7;
        }
        if ((i & 128) == 0) {
            this.queryGasLimitErrorUseDefault = Boolean.TRUE;
        } else {
            this.queryGasLimitErrorUseDefault = bool;
        }
    }

    public static final /* synthetic */ void OLrzqt(AllGasFeeVo allGasFeeVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) allGasFeeVo.allGasFee, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, allGasFeeVo.allGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) allGasFeeVo.allGasFeeAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, allGasFeeVo.allGasFeeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) allGasFeeVo.errorMessage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, allGasFeeVo.errorMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) allGasFeeVo.gasLimit, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, allGasFeeVo.gasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) allGasFeeVo.gasPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, allGasFeeVo.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) allGasFeeVo.l1GasFee, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, allGasFeeVo.l1GasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) allGasFeeVo.originGasLimit, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, allGasFeeVo.originGasLimit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd(allGasFeeVo.queryGasLimitErrorUseDefault, Boolean.TRUE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, allGasFeeVo.queryGasLimitErrorUseDefault);
    }

    public AllGasFeeVo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        this.allGasFee = str;
        this.allGasFeeAmount = str2;
        this.errorMessage = str3;
        this.gasLimit = str4;
        this.gasPrice = str5;
        this.l1GasFee = str6;
        this.originGasLimit = str7;
        this.queryGasLimitErrorUseDefault = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r16v0 java.lang.String) : (""))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r17v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:1053) call: com.okinc.business.invest_biz.data.bean.AllGasFeeVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ AllGasFeeVo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? Boolean.TRUE : bool);
    }
}
