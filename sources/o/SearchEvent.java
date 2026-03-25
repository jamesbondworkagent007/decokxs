package o;

import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class SearchEvent implements OnApplyWindowInsetsListener {
    /* JADX DEBUG: Method merged with bridge method: resolveEndpoint(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC57790yp
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object resolveEndpoint(@NotNull AccessibilityDelegate accessibilityDelegate, @NotNull Continuation<? super C57631ym> continuation) {
        PushbackInputStream pushbackInputStreamCopydefault;
        if (accessibilityDelegate.copydefault() != null) {
            if (Intrinsics.EZpvd(accessibilityDelegate.AEQbTJ(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: FIPS and custom endpoint are not supported");
            }
            if (Intrinsics.EZpvd(accessibilityDelegate.OLrzqt(), C56443yFo.KWHzl(true))) {
                throw new EndpointProviderException("Invalid Configuration: Dualstack and custom endpoint are not supported");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, accessibilityDelegate.copydefault(), null, 2, null), null, 2, null);
        }
        if (accessibilityDelegate.KWHzl() != null && (pushbackInputStreamCopydefault = OnAttachStateChangeListener.copydefault(accessibilityDelegate.KWHzl())) != null) {
            if (Intrinsics.EZpvd(accessibilityDelegate.AEQbTJ(), C56443yFo.KWHzl(true)) && Intrinsics.EZpvd(accessibilityDelegate.OLrzqt(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamCopydefault.OLrzqt()) && Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamCopydefault.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://oidc-fips." + accessibilityDelegate.KWHzl() + '.' + pushbackInputStreamCopydefault.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
            }
            if (Intrinsics.EZpvd(accessibilityDelegate.AEQbTJ(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(pushbackInputStreamCopydefault.OLrzqt(), C56443yFo.KWHzl(true))) {
                    if (Intrinsics.EZpvd((java.lang.Object) pushbackInputStreamCopydefault.AEQbTJ(), (java.lang.Object) "aws-us-gov")) {
                        return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://oidc." + accessibilityDelegate.KWHzl() + ".amazonaws.com", null, 2, null), null, 2, null);
                    }
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://oidc-fips." + accessibilityDelegate.KWHzl() + '.' + pushbackInputStreamCopydefault.KWHzl(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
            }
            if (Intrinsics.EZpvd(accessibilityDelegate.OLrzqt(), C56443yFo.KWHzl(true))) {
                if (Intrinsics.EZpvd(C56443yFo.KWHzl(true), pushbackInputStreamCopydefault.copydefault())) {
                    return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://oidc." + accessibilityDelegate.KWHzl() + '.' + pushbackInputStreamCopydefault.EZpvd(), null, 2, null), null, 2, null);
                }
                throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
            }
            return new C57631ym(DL.StateListAnimator.parse$default(DL.AEQbTJ, "https://oidc." + accessibilityDelegate.KWHzl() + '.' + pushbackInputStreamCopydefault.KWHzl(), null, 2, null), null, 2, null);
        }
        throw new EndpointProviderException("Invalid Configuration: Missing Region");
    }
}
