package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ReadReceiptMessageData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String lastMsgSeq;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReadReceiptMessageData() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReadReceiptMessageData copy$default(ReadReceiptMessageData readReceiptMessageData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = readReceiptMessageData.lastMsgSeq;
        }
        return readReceiptMessageData.copy(str);
    }

    @SerialName("lastMsgSeq")
    public static /* synthetic */ void getLastMsgSeq$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.lastMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReadReceiptMessageData copy(String str) {
        return new ReadReceiptMessageData(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReadReceiptMessageData) && Intrinsics.EZpvd((Object) this.lastMsgSeq, (Object) ((ReadReceiptMessageData) obj).lastMsgSeq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastMsgSeq() {
        return this.lastMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.lastMsgSeq;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReadReceiptMessageData(lastMsgSeq=" + this.lastMsgSeq + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.ReadReceiptMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReadReceiptMessageData> serializer() {
            return ReadReceiptMessageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReadReceiptMessageData(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.lastMsgSeq = null;
        } else {
            this.lastMsgSeq = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ReadReceiptMessageData readReceiptMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && readReceiptMessageData.lastMsgSeq == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, readReceiptMessageData.lastMsgSeq);
    }

    public ReadReceiptMessageData(String str) {
        this.lastMsgSeq = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:9) call: com.okinc.okimcore.model.im.inhouseim.ws.ReadReceiptMessageData.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ ReadReceiptMessageData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
