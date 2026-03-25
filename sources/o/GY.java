package o;

import aws.smithy.kotlin.runtime.telemetry.trace.SpanKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface GY {
    GU EZpvd(@NotNull java.lang.String str, @NotNull InterfaceC57843yq interfaceC57843yq, @NotNull SpanKind spanKind, FW fw);

    public static final class ActionBar {
        public static /* synthetic */ GU createSpan$default(GY gy, java.lang.String str, InterfaceC57843yq interfaceC57843yq, SpanKind spanKind, FW fw, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSpan");
            }
            if ((i & 2) != 0) {
                interfaceC57843yq = C58108yv.copydefault();
            }
            if ((i & 4) != 0) {
                spanKind = SpanKind.INTERNAL;
            }
            if ((i & 8) != 0) {
                fw = null;
            }
            return gy.EZpvd(str, interfaceC57843yq, spanKind, fw);
        }
    }
}
