package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class RegisterStatusReq {
    private String address;
    private Boolean checkMainCoinRegister;
    private String coinId;
    private String contractAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RegisterStatusReq() {
        this((String) null, (String) null, (String) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RegisterStatusReq copy$default(RegisterStatusReq registerStatusReq, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registerStatusReq.coinId;
        }
        if ((i & 2) != 0) {
            str2 = registerStatusReq.address;
        }
        if ((i & 4) != 0) {
            str3 = registerStatusReq.contractAddress;
        }
        if ((i & 8) != 0) {
            bool = registerStatusReq.checkMainCoinRegister;
        }
        return registerStatusReq.copy(str, str2, str3, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.checkMainCoinRegister;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegisterStatusReq copy(String str, String str2, String str3, Boolean bool) {
        return new RegisterStatusReq(str, str2, str3, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterStatusReq)) {
            return false;
        }
        RegisterStatusReq registerStatusReq = (RegisterStatusReq) obj;
        return Intrinsics.EZpvd((Object) this.coinId, (Object) registerStatusReq.coinId) && Intrinsics.EZpvd((Object) this.address, (Object) registerStatusReq.address) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) registerStatusReq.contractAddress) && Intrinsics.EZpvd(this.checkMainCoinRegister, registerStatusReq.checkMainCoinRegister);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCheckMainCoinRegister() {
        return this.checkMainCoinRegister;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.coinId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.address;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.contractAddress;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.checkMainCoinRegister;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCheckMainCoinRegister(Boolean bool) {
        this.checkMainCoinRegister = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(String str) {
        this.coinId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RegisterStatusReq(coinId=" + this.coinId + ", address=" + this.address + ", contractAddress=" + this.contractAddress + ", checkMainCoinRegister=" + this.checkMainCoinRegister + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.RegisterStatusReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RegisterStatusReq> serializer() {
            return RegisterStatusReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RegisterStatusReq(int i, String str, String str2, String str3, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinId = null;
        } else {
            this.coinId = str;
        }
        if ((i & 2) == 0) {
            this.address = null;
        } else {
            this.address = str2;
        }
        if ((i & 4) == 0) {
            this.contractAddress = null;
        } else {
            this.contractAddress = str3;
        }
        if ((i & 8) == 0) {
            this.checkMainCoinRegister = null;
        } else {
            this.checkMainCoinRegister = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RegisterStatusReq registerStatusReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || registerStatusReq.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, registerStatusReq.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || registerStatusReq.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, registerStatusReq.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || registerStatusReq.contractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, registerStatusReq.contractAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && registerStatusReq.checkMainCoinRegister == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, registerStatusReq.checkMainCoinRegister);
    }

    public RegisterStatusReq(String str, String str2, String str3, Boolean bool) {
        this.coinId = str;
        this.address = str2;
        this.contractAddress = str3;
        this.checkMainCoinRegister = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:196) call: com.okinc.business.defi.biz.net.bean.RegisterStatusReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ RegisterStatusReq(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }
}
