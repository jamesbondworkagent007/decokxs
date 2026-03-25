package com.okinc.okpaymentapi.data.remote.model.experience;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class BuyCryptoMetaData {
    private QRCode qrCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BuyCryptoMetaData() {
        this((QRCode) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BuyCryptoMetaData copy$default(BuyCryptoMetaData buyCryptoMetaData, QRCode qRCode, int i, Object obj) {
        if ((i & 1) != 0) {
            qRCode = buyCryptoMetaData.qrCode;
        }
        return buyCryptoMetaData.copy(qRCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QRCode component1() {
        return this.qrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuyCryptoMetaData copy(QRCode qRCode) {
        return new BuyCryptoMetaData(qRCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BuyCryptoMetaData) && Intrinsics.EZpvd(this.qrCode, ((BuyCryptoMetaData) obj).qrCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QRCode getQrCode() {
        return this.qrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        QRCode qRCode = this.qrCode;
        if (qRCode == null) {
            return 0;
        }
        return qRCode.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQrCode(QRCode qRCode) {
        this.qrCode = qRCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuyCryptoMetaData(qrCode=" + this.qrCode + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.BuyCryptoMetaData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BuyCryptoMetaData> serializer() {
            return BuyCryptoMetaData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BuyCryptoMetaData(int i, QRCode qRCode, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.qrCode = null;
        } else {
            this.qrCode = qRCode;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(BuyCryptoMetaData buyCryptoMetaData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && buyCryptoMetaData.qrCode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, QRCode$$serializer.INSTANCE, buyCryptoMetaData.qrCode);
    }

    public BuyCryptoMetaData(QRCode qRCode) {
        this.qrCode = qRCode;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.QRCode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.experience.QRCode) : (r1v0 com.okinc.okpaymentapi.data.remote.model.experience.QRCode))
 A[MD:(com.okinc.okpaymentapi.data.remote.model.experience.QRCode):void (m)] (LINE:167) call: com.okinc.okpaymentapi.data.remote.model.experience.BuyCryptoMetaData.<init>(com.okinc.okpaymentapi.data.remote.model.experience.QRCode):void type: THIS */
    public /* synthetic */ BuyCryptoMetaData(QRCode qRCode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : qRCode);
    }
}
