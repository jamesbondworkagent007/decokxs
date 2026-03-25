package o;

import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkBadging implements NetworkAgent {
    /* JADX DEBUG: Method merged with bridge method: resolveEndpoint(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC57790yp
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object resolveEndpoint(@NotNull Network network, @NotNull Continuation<? super C57631ym> continuation) {
        PushbackInputStream pushbackInputStreamKWHzl;
        if (network.KWHzl() != null) {
            if (Intrinsics.EZpvd(network.OLrzqt(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: FIPS and custom endpoint are not supported");
            }
            if (Intrinsics.EZpvd(network.AEQbTJ(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: Dualstack and custom endpoint are not supported");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, network.KWHzl(), null, 2, null), null, 2, null);
        }
        if (network.copydefault() != null && (pushbackInputStreamKWHzl = NetworkIdentity.KWHzl(network.copydefault())) != null) {
            if (Intrinsics.EZpvd(network.OLrzqt(), C56443yFo.KWHzl(true)) && Intrinsics.EZpvd(network.AEQbTJ(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamKWHzl.OLrzqt()) && Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamKWHzl.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://comprehend-fips." + network.copydefault() + '.' + pushbackInputStreamKWHzl.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
            }
            if (Intrinsics.EZpvd(network.OLrzqt(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(pushbackInputStreamKWHzl.OLrzqt(), C56443yFo.KWHzl(true))) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://comprehend-fips." + network.copydefault() + '.' + pushbackInputStreamKWHzl.KWHzl(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
            }
            if (Intrinsics.EZpvd(network.AEQbTJ(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamKWHzl.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://comprehend." + network.copydefault() + '.' + pushbackInputStreamKWHzl.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://comprehend." + network.copydefault() + '.' + pushbackInputStreamKWHzl.KWHzl(), null, 2, null), null, 2, null);
        }
        throw new EndpointProviderException("Invalid Configuration: Missing Region");
    }
}
