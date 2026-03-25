package com.reown.android.internal.common.signing.signature;

import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class Signature$Companion$$ExternalSyntheticBackport0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ int m(String str, int i) {
        if (str.length() > 1 && str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long j = Long.parseLong(str, i);
        if ((BodyPartID.bodyIdMax & j) == j) {
            return (int) j;
        }
        throw new NumberFormatException("Input " + str + " in base " + i + " is not in the range of an unsigned integer");
    }
}
