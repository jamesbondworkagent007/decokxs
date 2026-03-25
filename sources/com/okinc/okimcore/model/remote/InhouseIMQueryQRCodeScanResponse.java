package com.okinc.okimcore.model.remote;

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
public final class InhouseIMQueryQRCodeScanResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String avatar;
    private final String name;
    private final String targetId;
    private final int targetType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InhouseIMQueryQRCodeScanResponse() {
        this(0, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InhouseIMQueryQRCodeScanResponse copy$default(InhouseIMQueryQRCodeScanResponse inhouseIMQueryQRCodeScanResponse, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = inhouseIMQueryQRCodeScanResponse.targetType;
        }
        if ((i2 & 2) != 0) {
            str = inhouseIMQueryQRCodeScanResponse.targetId;
        }
        if ((i2 & 4) != 0) {
            str2 = inhouseIMQueryQRCodeScanResponse.avatar;
        }
        if ((i2 & 8) != 0) {
            str3 = inhouseIMQueryQRCodeScanResponse.name;
        }
        return inhouseIMQueryQRCodeScanResponse.copy(i, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InhouseIMQueryQRCodeScanResponse copy(int i, String str, String str2, String str3) {
        return new InhouseIMQueryQRCodeScanResponse(i, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InhouseIMQueryQRCodeScanResponse)) {
            return false;
        }
        InhouseIMQueryQRCodeScanResponse inhouseIMQueryQRCodeScanResponse = (InhouseIMQueryQRCodeScanResponse) obj;
        return this.targetType == inhouseIMQueryQRCodeScanResponse.targetType && Intrinsics.EZpvd((Object) this.targetId, (Object) inhouseIMQueryQRCodeScanResponse.targetId) && Intrinsics.EZpvd((Object) this.avatar, (Object) inhouseIMQueryQRCodeScanResponse.avatar) && Intrinsics.EZpvd((Object) this.name, (Object) inhouseIMQueryQRCodeScanResponse.name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetId() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTargetType() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.targetType);
        String str = this.targetId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.avatar;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.name;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InhouseIMQueryQRCodeScanResponse(targetType=" + this.targetType + ", targetId=" + this.targetId + ", avatar=" + this.avatar + ", name=" + this.name + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InhouseIMQueryQRCodeScanResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InhouseIMQueryQRCodeScanResponse> serializer() {
            return InhouseIMQueryQRCodeScanResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InhouseIMQueryQRCodeScanResponse(int i, int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.targetType = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.targetId = "";
        } else {
            this.targetId = str;
        }
        if ((i & 4) == 0) {
            this.avatar = "";
        } else {
            this.avatar = str2;
        }
        if ((i & 8) == 0) {
            this.name = "";
        } else {
            this.name = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InhouseIMQueryQRCodeScanResponse inhouseIMQueryQRCodeScanResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inhouseIMQueryQRCodeScanResponse.targetType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, inhouseIMQueryQRCodeScanResponse.targetType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) inhouseIMQueryQRCodeScanResponse.targetId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inhouseIMQueryQRCodeScanResponse.targetId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) inhouseIMQueryQRCodeScanResponse.avatar, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inhouseIMQueryQRCodeScanResponse.avatar);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) inhouseIMQueryQRCodeScanResponse.name, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, inhouseIMQueryQRCodeScanResponse.name);
    }

    public InhouseIMQueryQRCodeScanResponse(int i, String str, String str2, String str3) {
        this.targetType = i;
        this.targetId = str;
        this.avatar = str2;
        this.name = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:57) call: com.okinc.okimcore.model.remote.InhouseIMQueryQRCodeScanResponse.<init>(int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InhouseIMQueryQRCodeScanResponse(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
