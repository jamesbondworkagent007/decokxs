package com.ionspin.kotlin.bignum.integer.base32;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.C56395yDu;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes22.dex */
public final class BigInteger32Arithmetic$toUnsignedIntArrayCodeFormat$1 extends Lambda implements Function1<C56395yDu, CharSequence> {
    public static final BigInteger32Arithmetic$toUnsignedIntArrayCodeFormat$1 INSTANCE = new BigInteger32Arithmetic$toUnsignedIntArrayCodeFormat$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BigInteger32Arithmetic$toUnsignedIntArrayCodeFormat$1() {
        super(1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ CharSequence invoke(C56395yDu c56395yDu) {
        return m6340invokeWZ4Q5Ns(c56395yDu.copydefault());
    }

    /* JADX INFO: renamed from: invoke-WZ4Q5Ns, reason: not valid java name */
    public final CharSequence m6340invokeWZ4Q5Ns(int i) {
        return Intrinsics.KWHzl(Long.toString(((long) i) & BodyPartID.bodyIdMax, 10), "U");
    }
}
