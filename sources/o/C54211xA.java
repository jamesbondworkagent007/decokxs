package o;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.jvm.internal.Intrinsics;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C54211xA {
    public static final void EZpvd(@NotNull java.lang.Object obj, @NotNull InterfaceC5039Cj interfaceC5039Cj, InterfaceC56186xy interfaceC56186xy) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(interfaceC5039Cj, "");
        if (obj instanceof ServiceException) {
            ServiceException serviceException = (ServiceException) obj;
            InterfaceC56293yA interfaceC56293yAOLrzqt = serviceException.getSdkErrorMetadata().OLrzqt();
            C52562wQ.Activity activity = C52562wQ.EZpvd;
            C58108yv.AEQbTJ(interfaceC56293yAOLrzqt, activity.AEQbTJ(), interfaceC56186xy != null ? interfaceC56186xy.OLrzqt() : null);
            C58108yv.AEQbTJ(serviceException.getSdkErrorMetadata().OLrzqt(), activity.KWHzl(), interfaceC56186xy != null ? interfaceC56186xy.copydefault() : null);
            C58108yv.AEQbTJ(serviceException.getSdkErrorMetadata().OLrzqt(), activity.OLrzqt(), interfaceC5039Cj.AEQbTJ().copydefault("x-amz-request-id"));
            serviceException.getSdkErrorMetadata().OLrzqt().OLrzqt(activity.EZpvd(), interfaceC5039Cj);
        }
    }
}
