package o;

import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Class implements UnicodeScript {
    /* JADX DEBUG: Method merged with bridge method: resolveEndpoint(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC57790yp
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Object resolveEndpoint(@NotNull ClassCastException classCastException, @NotNull Continuation<? super C57631ym> continuation) {
        PushbackInputStream pushbackInputStreamKWHzl;
        if (classCastException.KWHzl() != null) {
            if (Intrinsics.EZpvd(classCastException.AEQbTJ(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: FIPS and custom endpoint are not supported");
            }
            if (Intrinsics.EZpvd(classCastException.copydefault(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: Dualstack and custom endpoint are not supported");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, classCastException.KWHzl(), null, 2, null), null, 2, null);
        }
        if (classCastException.OLrzqt() != null && (pushbackInputStreamKWHzl = CloneNotSupportedException.KWHzl(classCastException.OLrzqt())) != null) {
            if (Intrinsics.EZpvd(classCastException.AEQbTJ(), C56443yFo.KWHzl(true)) && Intrinsics.EZpvd(classCastException.copydefault(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamKWHzl.OLrzqt()) && Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamKWHzl.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://cognito-identity-fips." + classCastException.OLrzqt() + '.' + pushbackInputStreamKWHzl.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
            }
            if (Intrinsics.EZpvd(classCastException.AEQbTJ(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(pushbackInputStreamKWHzl.OLrzqt(), C56443yFo.KWHzl(true))) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://cognito-identity-fips." + classCastException.OLrzqt() + '.' + pushbackInputStreamKWHzl.KWHzl(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
            }
            if (Intrinsics.EZpvd(classCastException.copydefault(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamKWHzl.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://cognito-identity." + classCastException.OLrzqt() + '.' + pushbackInputStreamKWHzl.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://cognito-identity." + classCastException.OLrzqt() + '.' + pushbackInputStreamKWHzl.KWHzl(), null, 2, null), null, 2, null);
        }
        throw new EndpointProviderException("Invalid Configuration: Missing Region");
    }
}
