package com.geetest.gtc4;

import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
public final class u0 implements Comparator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iCompare = Integer.compare(bArr.length, bArr2.length);
        if (iCompare == 0) {
            for (int i = 0; i < bArr.length && (iCompare = Byte.compare(bArr[i], bArr2[i])) == 0; i++) {
            }
        }
        return iCompare;
    }
}
