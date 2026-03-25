package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59937zsS {
    public static final C60060zuj KWHzl(@NotNull android.app.Service service) {
        Intrinsics.checkNotNullParameter(service, "");
        if (!(service instanceof InterfaceC59938zsT)) {
            throw new java.lang.IllegalStateException("Service should implement AndroidScopeComponent".toString());
        }
        C60022zty c60022ztyEZpvd = C59932zsN.EZpvd(service);
        C60060zuj c60060zujOLrzqt = c60022ztyEZpvd.OLrzqt(C59973ztB.KWHzl(service));
        return c60060zujOLrzqt == null ? c60022ztyEZpvd.OLrzqt(C59973ztB.KWHzl(service), C59973ztB.OLrzqt(service), service) : c60060zujOLrzqt;
    }

    public static final C60060zuj KWHzl(@NotNull android.app.Service service, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(service, "");
        return C59932zsN.EZpvd(service).OLrzqt(C59973ztB.KWHzl(service), C59973ztB.OLrzqt(service), obj);
    }

    public static /* synthetic */ C60060zuj createScope$default(android.app.Service service, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return KWHzl(service, obj);
    }
}
