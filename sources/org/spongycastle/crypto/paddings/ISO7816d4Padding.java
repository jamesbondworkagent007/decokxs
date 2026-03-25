package org.spongycastle.crypto.paddings;

import com.google.common.primitives.UnsignedBytes;
import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes25.dex */
public class ISO7816d4Padding implements BlockCipherPadding {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ISO7816-4";
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i) {
        int length = bArr.length;
        bArr[i] = UnsignedBytes.MAX_POWER_OF_TWO;
        int i2 = i;
        while (true) {
            i2++;
            if (i2 >= bArr.length) {
                return length - i;
            }
            bArr[i2] = 0;
        }
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length - 1;
        while (length > 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] != -128) {
            throw new InvalidCipherTextException("pad block corrupted");
        }
        return bArr.length - length;
    }
}
