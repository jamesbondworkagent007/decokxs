package o;

import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IntUnaryOperator implements Predicate {
    /* JADX DEBUG: Method merged with bridge method: resolveEndpoint(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC57790yp
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object resolveEndpoint(@NotNull IntToLongFunction intToLongFunction, @NotNull Continuation<? super C57631ym> continuation) {
        PushbackInputStream pushbackInputStreamCopydefault;
        if (intToLongFunction.OLrzqt() != null) {
            if (Intrinsics.EZpvd(intToLongFunction.copydefault(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: FIPS and custom endpoint are not supported");
            }
            if (Intrinsics.EZpvd(intToLongFunction.EZpvd(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: Dualstack and custom endpoint are not supported");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, intToLongFunction.OLrzqt(), null, 2, null), null, 2, null);
        }
        if (intToLongFunction.KWHzl() != null && (pushbackInputStreamCopydefault = Supplier.copydefault(intToLongFunction.KWHzl())) != null) {
            if (Intrinsics.EZpvd(intToLongFunction.copydefault(), C56443yFo.KWHzl(true)) && Intrinsics.EZpvd(intToLongFunction.EZpvd(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamCopydefault.OLrzqt()) && Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamCopydefault.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://cognito-idp-fips." + intToLongFunction.KWHzl() + '.' + pushbackInputStreamCopydefault.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
            }
            if (Intrinsics.EZpvd(intToLongFunction.copydefault(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(pushbackInputStreamCopydefault.OLrzqt(), C56443yFo.KWHzl(true))) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://cognito-idp-fips." + intToLongFunction.KWHzl() + '.' + pushbackInputStreamCopydefault.KWHzl(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
            }
            if (Intrinsics.EZpvd(intToLongFunction.EZpvd(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamCopydefault.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://cognito-idp." + intToLongFunction.KWHzl() + '.' + pushbackInputStreamCopydefault.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://cognito-idp." + intToLongFunction.KWHzl() + '.' + pushbackInputStreamCopydefault.KWHzl(), null, 2, null), null, 2, null);
        }
        throw new EndpointProviderException("Invalid Configuration: Missing Region");
    }
}
