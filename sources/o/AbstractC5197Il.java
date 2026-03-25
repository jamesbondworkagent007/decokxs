package o;

import android.support.v4.media.session.PlaybackStateCompat;
import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.AdditionalInformation;
import co.nstant.in.cbor.model.MajorType;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: renamed from: o.Il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC5197Il<T> {
    public final HS AEQbTJ;
    public final java.io.OutputStream copydefault;

    public AbstractC5197Il(HS hs, java.io.OutputStream outputStream) {
        this.AEQbTJ = hs;
        this.copydefault = outputStream;
    }

    public void copydefault(MajorType majorType) throws CborException {
        int value = majorType.getValue();
        try {
            this.copydefault.write((value << 5) | AdditionalInformation.INDEFINITE.getValue());
        } catch (java.io.IOException e) {
            throw new CborException(e);
        }
    }

    public void EZpvd(MajorType majorType, long j) throws CborException {
        int value = majorType.getValue() << 5;
        if (j <= 23) {
            AEQbTJ((byte) (j | ((long) value)));
            return;
        }
        if (j <= 255) {
            AEQbTJ((byte) (value | AdditionalInformation.ONE_BYTE.getValue()), (byte) j);
            return;
        }
        if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            AEQbTJ((byte) (value | AdditionalInformation.TWO_BYTES.getValue()), (byte) (j >> 8), (byte) (j & 255));
        } else if (j <= BodyPartID.bodyIdMax) {
            AEQbTJ((byte) (value | AdditionalInformation.FOUR_BYTES.getValue()), (byte) ((j >> 24) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 8) & 255), (byte) (j & 255));
        } else {
            AEQbTJ((byte) (value | AdditionalInformation.EIGHT_BYTES.getValue()), (byte) ((j >> 56) & 255), (byte) ((j >> 48) & 255), (byte) ((j >> 40) & 255), (byte) ((j >> 32) & 255), (byte) ((j >> 24) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 8) & 255), (byte) (j & 255));
        }
    }

    public void copydefault(MajorType majorType, java.math.BigInteger bigInteger) throws CborException {
        boolean z = majorType == MajorType.NEGATIVE_INTEGER;
        int value = majorType.getValue() << 5;
        if (bigInteger.compareTo(java.math.BigInteger.valueOf(24L)) == -1) {
            AEQbTJ(bigInteger.intValue() | value);
            return;
        }
        if (bigInteger.compareTo(java.math.BigInteger.valueOf(256L)) == -1) {
            AEQbTJ((byte) (AdditionalInformation.ONE_BYTE.getValue() | value), (byte) bigInteger.intValue());
            return;
        }
        if (bigInteger.compareTo(java.math.BigInteger.valueOf(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) == -1) {
            int value2 = AdditionalInformation.TWO_BYTES.getValue();
            long jLongValue = bigInteger.longValue();
            AEQbTJ((byte) (value2 | value), (byte) (jLongValue >> 8), (byte) (jLongValue & 255));
        } else if (bigInteger.compareTo(java.math.BigInteger.valueOf(4294967296L)) == -1) {
            int value3 = AdditionalInformation.FOUR_BYTES.getValue();
            long jLongValue2 = bigInteger.longValue();
            AEQbTJ((byte) (value3 | value), (byte) ((jLongValue2 >> 24) & 255), (byte) ((jLongValue2 >> 16) & 255), (byte) ((jLongValue2 >> 8) & 255), (byte) (jLongValue2 & 255));
        } else if (bigInteger.compareTo(new java.math.BigInteger("18446744073709551616")) == -1) {
            int value4 = AdditionalInformation.EIGHT_BYTES.getValue();
            java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(255L);
            AEQbTJ((byte) (value4 | value), bigInteger.shiftRight(56).and(bigIntegerValueOf).byteValue(), bigInteger.shiftRight(48).and(bigIntegerValueOf).byteValue(), bigInteger.shiftRight(40).and(bigIntegerValueOf).byteValue(), bigInteger.shiftRight(32).and(bigIntegerValueOf).byteValue(), bigInteger.shiftRight(24).and(bigIntegerValueOf).byteValue(), bigInteger.shiftRight(16).and(bigIntegerValueOf).byteValue(), bigInteger.shiftRight(8).and(bigIntegerValueOf).byteValue(), bigInteger.and(bigIntegerValueOf).byteValue());
        } else {
            if (z) {
                this.AEQbTJ.EZpvd(new IK(3L));
            } else {
                this.AEQbTJ.EZpvd(new IK(2L));
            }
            this.AEQbTJ.EZpvd(new C5210Iy(bigInteger.toByteArray()));
        }
    }

    public void AEQbTJ(int i) throws CborException {
        try {
            this.copydefault.write(i);
        } catch (java.io.IOException e) {
            throw new CborException(e);
        }
    }

    public void AEQbTJ(byte... bArr) throws CborException {
        try {
            this.copydefault.write(bArr);
        } catch (java.io.IOException e) {
            throw new CborException(e);
        }
    }
}
