package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class WSJoinLiveStreamAck {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WSJoinLiveStreamAck() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSJoinLiveStreamAck copy$default(WSJoinLiveStreamAck wSJoinLiveStreamAck, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wSJoinLiveStreamAck.msg;
        }
        return wSJoinLiveStreamAck.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSJoinLiveStreamAck KWHzl(String str) {
        return new WSJoinLiveStreamAck(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSJoinLiveStreamAck) && Intrinsics.EZpvd((Object) this.msg, (Object) ((WSJoinLiveStreamAck) obj).msg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.msg;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSJoinLiveStreamAck(msg=" + this.msg + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSJoinLiveStreamAck.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSJoinLiveStreamAck> serializer() {
            return WSJoinLiveStreamAck$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSJoinLiveStreamAck(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.msg = null;
        } else {
            this.msg = str;
        }
    }

    public static final /* synthetic */ void OLrzqt(WSJoinLiveStreamAck wSJoinLiveStreamAck, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && wSJoinLiveStreamAck.msg == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, wSJoinLiveStreamAck.msg);
    }

    public WSJoinLiveStreamAck(String str) {
        this.msg = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:6) call: com.okinc.okimcore.model.im.inhouseim.ws.WSJoinLiveStreamAck.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ WSJoinLiveStreamAck(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
