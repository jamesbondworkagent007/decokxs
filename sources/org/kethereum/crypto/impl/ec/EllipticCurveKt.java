package org.kethereum.crypto.impl.ec;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.crypto.ec.CustomNamedCurves;
import org.spongycastle.crypto.params.ECDomainParameters;

/* JADX INFO: loaded from: classes24.dex */
public final class EllipticCurveKt {
    public static final ECDomainParameters AEQbTJ;
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0<X9ECParameters>() { // from class: org.kethereum.crypto.impl.ec.EllipticCurveKt$CURVE_PARAMS$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final X9ECParameters invoke() {
            X9ECParameters byName = CustomNamedCurves.getByName("secp256k1");
            Intrinsics.copydefault(byName);
            return byName;
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ECDomainParameters OLrzqt() {
        return AEQbTJ;
    }

    static {
        X9ECParameters x9ECParametersEZpvd = EZpvd();
        AEQbTJ = new ECDomainParameters(x9ECParametersEZpvd.getCurve(), x9ECParametersEZpvd.getG(), x9ECParametersEZpvd.getN(), x9ECParametersEZpvd.getH());
    }

    public static final X9ECParameters EZpvd() {
        return (X9ECParameters) EZpvd.getValue();
    }
}
