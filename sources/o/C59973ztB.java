package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59973ztB {
    public static final <T> java.lang.String KWHzl(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        return C60067zuq.KWHzl(C56524yIo.AEQbTJ(t.getClass())) + '@' + t.hashCode();
    }

    public static final <T> C60054zud OLrzqt(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        return new C60054zud(C56524yIo.AEQbTJ(t.getClass()));
    }

    public static /* synthetic */ C60060zuj createScope$default(InterfaceC59974ztC interfaceC59974ztC, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return OLrzqt(interfaceC59974ztC, obj);
    }

    public static final <T extends InterfaceC59974ztC> C60060zuj OLrzqt(@NotNull T t, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(t, "");
        return t.OLrzqt().OLrzqt(KWHzl(t), OLrzqt(t), obj);
    }

    public static final <T extends InterfaceC59974ztC> C60060zuj EZpvd(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        return t.OLrzqt().OLrzqt(KWHzl(t));
    }
}
