package com.okinc.business.web3pay.lib.features.paytransaction.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class QRCodeAcquire {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String acquireLogo;
    private final String acquireName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QRCodeAcquire() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QRCodeAcquire copy$default(QRCodeAcquire qRCodeAcquire, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qRCodeAcquire.acquireLogo;
        }
        if ((i & 2) != 0) {
            str2 = qRCodeAcquire.acquireName;
        }
        return qRCodeAcquire.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.acquireLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.acquireName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QRCodeAcquire copy(String str, String str2) {
        return new QRCodeAcquire(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRCodeAcquire)) {
            return false;
        }
        QRCodeAcquire qRCodeAcquire = (QRCodeAcquire) obj;
        return Intrinsics.EZpvd((Object) this.acquireLogo, (Object) qRCodeAcquire.acquireLogo) && Intrinsics.EZpvd((Object) this.acquireName, (Object) qRCodeAcquire.acquireName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcquireLogo() {
        return this.acquireLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcquireName() {
        return this.acquireName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.acquireLogo;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.acquireName;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QRCodeAcquire(acquireLogo=" + this.acquireLogo + ", acquireName=" + this.acquireName + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.paytransaction.model.QRCodeAcquire.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QRCodeAcquire> serializer() {
            return QRCodeAcquire$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QRCodeAcquire(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.acquireLogo = null;
        } else {
            this.acquireLogo = str;
        }
        if ((i & 2) == 0) {
            this.acquireName = null;
        } else {
            this.acquireName = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(QRCodeAcquire qRCodeAcquire, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || qRCodeAcquire.acquireLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, qRCodeAcquire.acquireLogo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && qRCodeAcquire.acquireName == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, qRCodeAcquire.acquireName);
    }

    public QRCodeAcquire(String str, String str2) {
        this.acquireLogo = str;
        this.acquireName = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:44) call: com.okinc.business.web3pay.lib.features.paytransaction.model.QRCodeAcquire.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ QRCodeAcquire(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
