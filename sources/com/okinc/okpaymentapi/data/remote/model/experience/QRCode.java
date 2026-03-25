package com.okinc.okpaymentapi.data.remote.model.experience;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class QRCode {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long expirationTime;
    private final String qrCodeKey;
    private final String qrCodeStr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QRCode() {
        this((String) null, (String) null, 0L, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QRCode copy$default(QRCode qRCode, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qRCode.qrCodeStr;
        }
        if ((i & 2) != 0) {
            str2 = qRCode.qrCodeKey;
        }
        if ((i & 4) != 0) {
            j = qRCode.expirationTime;
        }
        return qRCode.copy(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.qrCodeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.qrCodeKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.expirationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QRCode copy(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new QRCode(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRCode)) {
            return false;
        }
        QRCode qRCode = (QRCode) obj;
        return Intrinsics.EZpvd((Object) this.qrCodeStr, (Object) qRCode.qrCodeStr) && Intrinsics.EZpvd((Object) this.qrCodeKey, (Object) qRCode.qrCodeKey) && this.expirationTime == qRCode.expirationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpirationTime() {
        return this.expirationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQrCodeKey() {
        return this.qrCodeKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQrCodeStr() {
        return this.qrCodeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.qrCodeStr.hashCode() * 31) + this.qrCodeKey.hashCode()) * 31) + Long.hashCode(this.expirationTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QRCode(qrCodeStr=" + this.qrCodeStr + ", qrCodeKey=" + this.qrCodeKey + ", expirationTime=" + this.expirationTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.QRCode.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QRCode> serializer() {
            return QRCode$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QRCode(int i, String str, String str2, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.qrCodeStr = "";
        } else {
            this.qrCodeStr = str;
        }
        if ((i & 2) == 0) {
            this.qrCodeKey = "";
        } else {
            this.qrCodeKey = str2;
        }
        if ((i & 4) == 0) {
            this.expirationTime = 0L;
        } else {
            this.expirationTime = j;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(QRCode qRCode, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) qRCode.qrCodeStr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, qRCode.qrCodeStr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) qRCode.qrCodeKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, qRCode.qrCodeKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && qRCode.expirationTime == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 2, qRCode.expirationTime);
    }

    public QRCode(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.qrCodeStr = str;
        this.qrCodeKey = str2;
        this.expirationTime = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r4v0 long))
 A[MD:(java.lang.String, java.lang.String, long):void (m)] (LINE:173) call: com.okinc.okpaymentapi.data.remote.model.experience.QRCode.<init>(java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ QRCode(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j);
    }
}
