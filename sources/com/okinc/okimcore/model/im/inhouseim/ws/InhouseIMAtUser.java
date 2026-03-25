package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InhouseIMAtUser {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String atText;
    public final String uid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InhouseIMAtUser() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InhouseIMAtUser copy$default(InhouseIMAtUser inhouseIMAtUser, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inhouseIMAtUser.atText;
        }
        if ((i & 2) != 0) {
            str2 = inhouseIMAtUser.uid;
        }
        return inhouseIMAtUser.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InhouseIMAtUser EZpvd(String str, String str2) {
        return new InhouseIMAtUser(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.atText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InhouseIMAtUser)) {
            return false;
        }
        InhouseIMAtUser inhouseIMAtUser = (InhouseIMAtUser) obj;
        return Intrinsics.EZpvd((Object) this.atText, (Object) inhouseIMAtUser.atText) && Intrinsics.EZpvd((Object) this.uid, (Object) inhouseIMAtUser.uid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.atText;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.uid;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InhouseIMAtUser(atText=" + this.atText + ", uid=" + this.uid + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.InhouseIMAtUser.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InhouseIMAtUser> serializer() {
            return InhouseIMAtUser$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InhouseIMAtUser(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.atText = null;
        } else {
            this.atText = str;
        }
        if ((i & 2) == 0) {
            this.uid = null;
        } else {
            this.uid = str2;
        }
    }

    public static final /* synthetic */ void AEQbTJ(InhouseIMAtUser inhouseIMAtUser, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inhouseIMAtUser.atText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inhouseIMAtUser.atText);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && inhouseIMAtUser.uid == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inhouseIMAtUser.uid);
    }

    public InhouseIMAtUser(String str, String str2) {
        this.atText = str;
        this.uid = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.okimcore.model.im.inhouseim.ws.InhouseIMAtUser.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InhouseIMAtUser(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
