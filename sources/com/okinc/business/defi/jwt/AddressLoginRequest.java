package com.okinc.business.defi.jwt;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AddressLoginRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String address;
    public final Integer algorithmCode;
    public final Long chainId;
    public final String publicKey;
    public final String signature;
    public final String signedDataR;
    public final String signedDataS;
    public final Long timestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressLoginRequest OLrzqt(@NotNull String str, @NotNull String str2, Long l, Integer num, String str3, Long l2, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AddressLoginRequest(str, str2, l, num, str3, l2, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressLoginRequest)) {
            return false;
        }
        AddressLoginRequest addressLoginRequest = (AddressLoginRequest) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) addressLoginRequest.address) && Intrinsics.EZpvd((Object) this.signature, (Object) addressLoginRequest.signature) && Intrinsics.EZpvd(this.chainId, addressLoginRequest.chainId) && Intrinsics.EZpvd(this.algorithmCode, addressLoginRequest.algorithmCode) && Intrinsics.EZpvd((Object) this.publicKey, (Object) addressLoginRequest.publicKey) && Intrinsics.EZpvd(this.timestamp, addressLoginRequest.timestamp) && Intrinsics.EZpvd((Object) this.signedDataR, (Object) addressLoginRequest.signedDataR) && Intrinsics.EZpvd((Object) this.signedDataS, (Object) addressLoginRequest.signedDataS);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        int iHashCode2 = this.signature.hashCode();
        Long l = this.chainId;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Integer num = this.algorithmCode;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str = this.publicKey;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Long l2 = this.timestamp;
        int iHashCode6 = l2 == null ? 0 : l2.hashCode();
        String str2 = this.signedDataR;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.signedDataS;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressLoginRequest(address=" + this.address + ", signature=" + this.signature + ", chainId=" + this.chainId + ", algorithmCode=" + this.algorithmCode + ", publicKey=" + this.publicKey + ", timestamp=" + this.timestamp + ", signedDataR=" + this.signedDataR + ", signedDataS=" + this.signedDataS + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.jwt.AddressLoginRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressLoginRequest> serializer() {
            return AddressLoginRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressLoginRequest(int i, String str, String str2, Long l, Integer num, String str3, Long l2, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, AddressLoginRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        this.signature = str2;
        if ((i & 4) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 8) == 0) {
            this.algorithmCode = null;
        } else {
            this.algorithmCode = num;
        }
        if ((i & 16) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str3;
        }
        if ((i & 32) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = l2;
        }
        if ((i & 64) == 0) {
            this.signedDataR = null;
        } else {
            this.signedDataR = str4;
        }
        if ((i & 128) == 0) {
            this.signedDataS = null;
        } else {
            this.signedDataS = str5;
        }
    }

    public static final /* synthetic */ void AEQbTJ(AddressLoginRequest addressLoginRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, addressLoginRequest.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, addressLoginRequest.signature);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || addressLoginRequest.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, addressLoginRequest.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || addressLoginRequest.algorithmCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, addressLoginRequest.algorithmCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || addressLoginRequest.publicKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, addressLoginRequest.publicKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || addressLoginRequest.timestamp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, addressLoginRequest.timestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || addressLoginRequest.signedDataR != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, addressLoginRequest.signedDataR);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && addressLoginRequest.signedDataS == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, addressLoginRequest.signedDataS);
    }

    public AddressLoginRequest(@NotNull String str, @NotNull String str2, Long l, Integer num, String str3, Long l2, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.address = str;
        this.signature = str2;
        this.chainId = l;
        this.algorithmCode = num;
        this.publicKey = str3;
        this.timestamp = l2;
        this.signedDataR = str4;
        this.signedDataS = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r15v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001a: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r18v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.defi.jwt.AddressLoginRequest.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AddressLoginRequest(String str, String str2, Long l, Integer num, String str3, Long l2, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5);
    }
}
