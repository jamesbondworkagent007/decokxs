package o;

import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ClickableSpan implements URLSpan {
    /* JADX DEBUG: Method merged with bridge method: resolveEndpoint(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC57790yp
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object resolveEndpoint(@NotNull TransitionManager transitionManager, @NotNull Continuation<? super C57631ym> continuation) {
        PushbackInputStream pushbackInputStreamOLrzqt;
        if (transitionManager.copydefault() != null) {
            if (Intrinsics.EZpvd(transitionManager.AEQbTJ(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: FIPS and custom endpoint are not supported");
            }
            if (Intrinsics.EZpvd(transitionManager.KWHzl(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: Dualstack and custom endpoint are not supported");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, transitionManager.copydefault(), null, 2, null), null, 2, null);
        }
        if (transitionManager.OLrzqt() != null && (pushbackInputStreamOLrzqt = SizeF.OLrzqt(transitionManager.OLrzqt())) != null) {
            if (Intrinsics.EZpvd(transitionManager.AEQbTJ(), C56443yFo.KWHzl(true)) && Intrinsics.EZpvd(transitionManager.KWHzl(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamOLrzqt.OLrzqt()) && Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamOLrzqt.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://portal.sso-fips." + transitionManager.OLrzqt() + '.' + pushbackInputStreamOLrzqt.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
            }
            if (Intrinsics.EZpvd(transitionManager.AEQbTJ(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(pushbackInputStreamOLrzqt.OLrzqt(), C56443yFo.KWHzl(true))) {
                    if (Intrinsics.EZpvd((java.lang.Object) pushbackInputStreamOLrzqt.AEQbTJ(), (java.lang.Object) "aws-us-gov")) {
                        return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://portal.sso." + transitionManager.OLrzqt() + ".amazonaws.com", null, 2, null), null, 2, null);
                    }
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://portal.sso-fips." + transitionManager.OLrzqt() + '.' + pushbackInputStreamOLrzqt.KWHzl(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
            }
            if (Intrinsics.EZpvd(transitionManager.KWHzl(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamOLrzqt.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://portal.sso." + transitionManager.OLrzqt() + '.' + pushbackInputStreamOLrzqt.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://portal.sso." + transitionManager.OLrzqt() + '.' + pushbackInputStreamOLrzqt.KWHzl(), null, 2, null), null, 2, null);
        }
        throw new EndpointProviderException("Invalid Configuration: Missing Region");
    }
}
