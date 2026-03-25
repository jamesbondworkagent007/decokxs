package com.geetest.gtc4;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.okinc.business.defi.biz.core.error.WalletImportError;

/* JADX INFO: loaded from: classes21.dex */
public abstract class q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final short[] f497a = new short[128];
    public static final byte[] b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(byte[] bArr, int i, int i2, byte b2) {
        while (i <= i2) {
            bArr[i] = b2;
            i++;
        }
    }

    static {
        byte[] bArr = new byte[WalletImportError.ERROR_CODE_AA_EXIST];
        b = bArr;
        byte[] bArr2 = new byte[128];
        a(bArr2, 0, 15, (byte) 1);
        a(bArr2, 16, 31, (byte) 2);
        a(bArr2, 32, 63, (byte) 3);
        a(bArr2, 64, 65, (byte) 0);
        a(bArr2, 66, 95, (byte) 4);
        a(bArr2, 96, 96, (byte) 5);
        a(bArr2, 97, 108, (byte) 6);
        a(bArr2, 109, 109, (byte) 7);
        a(bArr2, WalletImportError.ERROR_CODE_AA_CREATE_KEY, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, (byte) 6);
        a(bArr2, WalletImportError.ERROR_CODE_AA_EXIST, WalletImportError.ERROR_CODE_AA_EXIST, (byte) 8);
        a(bArr2, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, 115, (byte) 9);
        a(bArr2, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, (byte) 10);
        a(bArr2, 117, 127, (byte) 0);
        a(bArr, 0, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, (byte) -2);
        a(bArr, 8, 11, (byte) -1);
        a(bArr, 24, 27, (byte) 0);
        a(bArr, 40, 43, (byte) 16);
        a(bArr, 58, 59, (byte) 0);
        a(bArr, 72, 73, (byte) 0);
        a(bArr, 89, 91, (byte) 16);
        a(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, Ascii.US, Ascii.SI, Ascii.SI, Ascii.SI, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, SignedBytes.MAX_POWER_OF_TWO, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b2 = bArr2[i];
            f497a[i] = (short) (bArr4[b2] | ((bArr3[b2] & i) << 8));
        }
    }
}
