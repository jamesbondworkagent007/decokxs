package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class RegisterStatusResp {
    private String alertMessage;
    private Boolean mainCoinRegister;
    private Boolean register;
    private Integer status;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RegisterStatusResp() {
        this((Integer) null, (Boolean) null, (Boolean) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RegisterStatusResp copy$default(RegisterStatusResp registerStatusResp, Integer num, Boolean bool, Boolean bool2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = registerStatusResp.status;
        }
        if ((i & 2) != 0) {
            bool = registerStatusResp.register;
        }
        Boolean bool3 = bool;
        if ((i & 4) != 0) {
            bool2 = registerStatusResp.mainCoinRegister;
        }
        Boolean bool4 = bool2;
        if ((i & 8) != 0) {
            str = registerStatusResp.alertMessage;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = registerStatusResp.url;
        }
        return registerStatusResp.copy(num, bool3, bool4, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.register;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.mainCoinRegister;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.alertMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegisterStatusResp copy(Integer num, Boolean bool, Boolean bool2, String str, String str2) {
        return new RegisterStatusResp(num, bool, bool2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterStatusResp)) {
            return false;
        }
        RegisterStatusResp registerStatusResp = (RegisterStatusResp) obj;
        return Intrinsics.EZpvd(this.status, registerStatusResp.status) && Intrinsics.EZpvd(this.register, registerStatusResp.register) && Intrinsics.EZpvd(this.mainCoinRegister, registerStatusResp.mainCoinRegister) && Intrinsics.EZpvd((Object) this.alertMessage, (Object) registerStatusResp.alertMessage) && Intrinsics.EZpvd((Object) this.url, (Object) registerStatusResp.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlertMessage() {
        return this.alertMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getMainCoinRegister() {
        return this.mainCoinRegister;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRegister() {
        return this.register;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.status;
        int iHashCode = num == null ? 0 : num.hashCode();
        Boolean bool = this.register;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.mainCoinRegister;
        int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.alertMessage;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.url;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlertMessage(String str) {
        this.alertMessage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainCoinRegister(Boolean bool) {
        this.mainCoinRegister = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRegister(Boolean bool) {
        this.register = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(Integer num) {
        this.status = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(String str) {
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RegisterStatusResp(status=" + this.status + ", register=" + this.register + ", mainCoinRegister=" + this.mainCoinRegister + ", alertMessage=" + this.alertMessage + ", url=" + this.url + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.RegisterStatusResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RegisterStatusResp> serializer() {
            return RegisterStatusResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RegisterStatusResp(int i, Integer num, Boolean bool, Boolean bool2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.status = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.register = Boolean.FALSE;
        } else {
            this.register = bool;
        }
        if ((i & 4) == 0) {
            this.mainCoinRegister = null;
        } else {
            this.mainCoinRegister = bool2;
        }
        if ((i & 8) == 0) {
            this.alertMessage = null;
        } else {
            this.alertMessage = str;
        }
        if ((i & 16) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RegisterStatusResp registerStatusResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = registerStatusResp.status) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, registerStatusResp.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(registerStatusResp.register, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, registerStatusResp.register);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || registerStatusResp.mainCoinRegister != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, registerStatusResp.mainCoinRegister);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || registerStatusResp.alertMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, registerStatusResp.alertMessage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && registerStatusResp.url == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, registerStatusResp.url);
    }

    public RegisterStatusResp(Integer num, Boolean bool, Boolean bool2, String str, String str2) {
        this.status = num;
        this.register = bool;
        this.mainCoinRegister = bool2;
        this.alertMessage = str;
        this.url = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 java.lang.Integer))
  (wrap:java.lang.Boolean:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r5v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r6v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:205) call: com.okinc.business.defi.biz.net.bean.RegisterStatusResp.<init>(java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RegisterStatusResp(Integer num, Boolean bool, Boolean bool2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str, (i & 16) == 0 ? str2 : null);
    }
}
