package o;

import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C31952mK implements InterfaceC32141mR {
    /* JADX DEBUG: Method merged with bridge method: resolveEndpoint(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC57790yp
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object resolveEndpoint(@NotNull C32060mO c32060mO, @NotNull Continuation<? super C57631ym> continuation) {
        PushbackInputStream pushbackInputStreamOLrzqt;
        if (c32060mO.KWHzl() != null) {
            if (Intrinsics.EZpvd(c32060mO.EZpvd(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: FIPS and custom endpoint are not supported");
            }
            if (Intrinsics.EZpvd(c32060mO.OLrzqt(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: Dualstack and custom endpoint are not supported");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, c32060mO.KWHzl(), null, 2, null), null, 2, null);
        }
        if (c32060mO.copydefault() != null && (pushbackInputStreamOLrzqt = C32114mQ.OLrzqt(c32060mO.copydefault())) != null) {
            if (Intrinsics.EZpvd(c32060mO.EZpvd(), C56443yFo.KWHzl(true)) && Intrinsics.EZpvd(c32060mO.OLrzqt(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamOLrzqt.OLrzqt()) && Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamOLrzqt.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://textract-fips." + c32060mO.copydefault() + '.' + pushbackInputStreamOLrzqt.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
            }
            if (Intrinsics.EZpvd(c32060mO.EZpvd(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(pushbackInputStreamOLrzqt.OLrzqt(), C56443yFo.KWHzl(true))) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://textract-fips." + c32060mO.copydefault() + '.' + pushbackInputStreamOLrzqt.KWHzl(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
            }
            if (Intrinsics.EZpvd(c32060mO.OLrzqt(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamOLrzqt.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://textract." + c32060mO.copydefault() + '.' + pushbackInputStreamOLrzqt.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://textract." + c32060mO.copydefault() + '.' + pushbackInputStreamOLrzqt.KWHzl(), null, 2, null), null, 2, null);
        }
        throw new EndpointProviderException("Invalid Configuration: Missing Region");
    }
}
