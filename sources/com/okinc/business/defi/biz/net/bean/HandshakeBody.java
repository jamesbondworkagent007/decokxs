package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class HandshakeBody {
    private final String accountId;
    private final String accountName;
    private String data;
    private final String encKey;
    private final int funcType;
    private final String mpcId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HandshakeBody copy$default(HandshakeBody handshakeBody, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = handshakeBody.funcType;
        }
        if ((i2 & 2) != 0) {
            str = handshakeBody.encKey;
        }
        String str6 = str;
        if ((i2 & 4) != 0) {
            str2 = handshakeBody.accountId;
        }
        String str7 = str2;
        if ((i2 & 8) != 0) {
            str3 = handshakeBody.accountName;
        }
        String str8 = str3;
        if ((i2 & 16) != 0) {
            str4 = handshakeBody.mpcId;
        }
        String str9 = str4;
        if ((i2 & 32) != 0) {
            str5 = handshakeBody.data;
        }
        return handshakeBody.copy(i, str6, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.funcType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.encKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HandshakeBody copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new HandshakeBody(i, str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HandshakeBody)) {
            return false;
        }
        HandshakeBody handshakeBody = (HandshakeBody) obj;
        return this.funcType == handshakeBody.funcType && Intrinsics.EZpvd((Object) this.encKey, (Object) handshakeBody.encKey) && Intrinsics.EZpvd((Object) this.accountId, (Object) handshakeBody.accountId) && Intrinsics.EZpvd((Object) this.accountName, (Object) handshakeBody.accountName) && Intrinsics.EZpvd((Object) this.mpcId, (Object) handshakeBody.mpcId) && Intrinsics.EZpvd((Object) this.data, (Object) handshakeBody.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncKey() {
        return this.encKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFuncType() {
        return this.funcType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.funcType);
        int iHashCode2 = this.encKey.hashCode();
        int iHashCode3 = this.accountId.hashCode();
        int iHashCode4 = this.accountName.hashCode();
        int iHashCode5 = this.mpcId.hashCode();
        String str = this.data;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(String str) {
        this.data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HandshakeBody(funcType=" + this.funcType + ", encKey=" + this.encKey + ", accountId=" + this.accountId + ", accountName=" + this.accountName + ", mpcId=" + this.mpcId + ", data=" + this.data + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.HandshakeBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HandshakeBody> serializer() {
            return HandshakeBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HandshakeBody(int i, int i2, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, HandshakeBody$$serializer.INSTANCE.getDescriptor());
        }
        this.funcType = i2;
        this.encKey = str;
        this.accountId = str2;
        this.accountName = str3;
        this.mpcId = str4;
        if ((i & 32) == 0) {
            this.data = "";
        } else {
            this.data = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(HandshakeBody handshakeBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, handshakeBody.funcType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, handshakeBody.encKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, handshakeBody.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, handshakeBody.accountName);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, handshakeBody.mpcId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) handshakeBody.data, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, handshakeBody.data);
    }

    public HandshakeBody(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.funcType = i;
        this.encKey = str;
        this.accountId = str2;
        this.accountName = str3;
        this.mpcId = str4;
        this.data = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r8v0 int)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:932) call: com.okinc.business.defi.biz.net.bean.HandshakeBody.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HandshakeBody(int i, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, (i2 & 32) != 0 ? "" : str5);
    }
}
