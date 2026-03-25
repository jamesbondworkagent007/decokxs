package com.sparrowwallet.hummingbird.registry;

import co.nstant.in.cbor.CborException;
import com.sparrowwallet.hummingbird.UR;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import o.HS;

/* JADX INFO: loaded from: classes17.dex */
public abstract class RegistryItem implements CborSerializable {
    public abstract RegistryType getRegistryType();

    public UR toUR() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new HS(byteArrayOutputStream).EZpvd(toCbor());
            return new UR(getRegistryType(), byteArrayOutputStream.toByteArray());
        } catch (CborException | UR.InvalidTypeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static byte[] bigIntegerToBytes(BigInteger bigInteger, int i) {
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException("b must be positive or zero");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("numBytes must be positive");
        }
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[i];
        int i2 = byteArray[0] == 0 ? 1 : 0;
        int length = byteArray.length;
        if (i2 != 0) {
            length--;
        }
        if (length > i) {
            throw new IllegalArgumentException("The given number does not fit in " + i);
        }
        System.arraycopy(byteArray, i2, bArr, i - length, length);
        Arrays.fill(byteArray, (byte) 0);
        return bArr;
    }
}
