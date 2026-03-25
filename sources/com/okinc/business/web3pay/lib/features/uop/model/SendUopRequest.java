package com.okinc.business.web3pay.lib.features.uop.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SendUopRequest {
    private final int accountType;
    private final String comment;
    private final String receiverName;
    private final String senderName;
    private final JsonElement signedMsg;
    private final String uopHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SendUopRequest copy$default(SendUopRequest sendUopRequest, JsonElement jsonElement, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jsonElement = sendUopRequest.signedMsg;
        }
        if ((i2 & 2) != 0) {
            str = sendUopRequest.uopHash;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = sendUopRequest.comment;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = sendUopRequest.senderName;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = sendUopRequest.receiverName;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            i = sendUopRequest.accountType;
        }
        return sendUopRequest.copy(jsonElement, str5, str6, str7, str8, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component1() {
        return this.signedMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.comment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.senderName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.receiverName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendUopRequest copy(@NotNull JsonElement jsonElement, @NotNull String str, String str2, String str3, String str4, int i) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new SendUopRequest(jsonElement, str, str2, str3, str4, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendUopRequest)) {
            return false;
        }
        SendUopRequest sendUopRequest = (SendUopRequest) obj;
        return Intrinsics.EZpvd(this.signedMsg, sendUopRequest.signedMsg) && Intrinsics.EZpvd((Object) this.uopHash, (Object) sendUopRequest.uopHash) && Intrinsics.EZpvd((Object) this.comment, (Object) sendUopRequest.comment) && Intrinsics.EZpvd((Object) this.senderName, (Object) sendUopRequest.senderName) && Intrinsics.EZpvd((Object) this.receiverName, (Object) sendUopRequest.receiverName) && this.accountType == sendUopRequest.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAccountType() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getComment() {
        return this.comment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiverName() {
        return this.receiverName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderName() {
        return this.senderName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getSignedMsg() {
        return this.signedMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.signedMsg.hashCode();
        int iHashCode2 = this.uopHash.hashCode();
        String str = this.comment;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.senderName;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.receiverName;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.accountType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SendUopRequest(signedMsg=" + this.signedMsg + ", uopHash=" + this.uopHash + ", comment=" + this.comment + ", senderName=" + this.senderName + ", receiverName=" + this.receiverName + ", accountType=" + this.accountType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.SendUopRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SendUopRequest> serializer() {
            return SendUopRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SendUopRequest(int i, JsonElement jsonElement, String str, String str2, String str3, String str4, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, SendUopRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.signedMsg = jsonElement;
        this.uopHash = str;
        this.comment = str2;
        this.senderName = str3;
        this.receiverName = str4;
        if ((i & 32) == 0) {
            this.accountType = 1;
        } else {
            this.accountType = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(SendUopRequest sendUopRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, JsonElementSerializer.INSTANCE, sendUopRequest.signedMsg);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, sendUopRequest.uopHash);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, sendUopRequest.comment);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, sendUopRequest.senderName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, sendUopRequest.receiverName);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && sendUopRequest.accountType == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 5, sendUopRequest.accountType);
    }

    public SendUopRequest(@NotNull JsonElement jsonElement, @NotNull String str, String str2, String str3, String str4, int i) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.signedMsg = jsonElement;
        this.uopHash = str;
        this.comment = str2;
        this.senderName = str3;
        this.receiverName = str4;
        this.accountType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r8v0 kotlinx.serialization.json.JsonElement)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r13v0 int))
 A[MD:(kotlinx.serialization.json.JsonElement, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:12) call: com.okinc.business.web3pay.lib.features.uop.model.SendUopRequest.<init>(kotlinx.serialization.json.JsonElement, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ SendUopRequest(JsonElement jsonElement, String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonElement, str, str2, str3, str4, (i2 & 32) != 0 ? 1 : i);
    }
}
