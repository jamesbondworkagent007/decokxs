package o;

import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class WebHistoryItem implements WebResourceResponse {
    /* JADX DEBUG: Method merged with bridge method: resolveEndpoint(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC57790yp
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object resolveEndpoint(@NotNull WebResourceError webResourceError, @NotNull Continuation<? super C57631ym> continuation) {
        PushbackInputStream pushbackInputStreamKWHzl;
        if (webResourceError.copydefault() != null) {
            if (Intrinsics.EZpvd(webResourceError.KWHzl(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: FIPS and custom endpoint are not supported");
            }
            if (Intrinsics.EZpvd(webResourceError.EZpvd(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: Dualstack and custom endpoint are not supported");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, webResourceError.copydefault(), null, 2, null), null, 2, null);
        }
        if (webResourceError.AEQbTJ() != null && (pushbackInputStreamKWHzl = WebResourceRequest.KWHzl(webResourceError.AEQbTJ())) != null) {
            if (Intrinsics.EZpvd(webResourceError.KWHzl(), C56443yFo.KWHzl(true)) && Intrinsics.EZpvd(webResourceError.EZpvd(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamKWHzl.OLrzqt()) && Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamKWHzl.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://rekognition-fips." + webResourceError.AEQbTJ() + '.' + pushbackInputStreamKWHzl.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
            }
            if (Intrinsics.EZpvd(webResourceError.KWHzl(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(pushbackInputStreamKWHzl.OLrzqt(), C56443yFo.KWHzl(true))) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://rekognition-fips." + webResourceError.AEQbTJ() + '.' + pushbackInputStreamKWHzl.KWHzl(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
            }
            if (Intrinsics.EZpvd(webResourceError.EZpvd(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamKWHzl.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://rekognition." + webResourceError.AEQbTJ() + '.' + pushbackInputStreamKWHzl.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://rekognition." + webResourceError.AEQbTJ() + '.' + pushbackInputStreamKWHzl.KWHzl(), null, 2, null), null, 2, null);
        }
        throw new EndpointProviderException("Invalid Configuration: Missing Region");
    }
}
