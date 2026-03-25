package o;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mjB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32730mjB {
    public static volatile C32779mjy EZpvd;
    public static final C32730mjB AEQbTJ = new C32730mjB();
    public static final AtomicBoolean OLrzqt = new AtomicBoolean(false);
    public static final int copydefault = 8;

    private C32730mjB() {
    }

    public final C32779mjy AEQbTJ(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        C32779mjy c32779mjy = EZpvd;
        if (c32779mjy == null) {
            synchronized (this) {
                c32779mjy = EZpvd;
                if (c32779mjy == null) {
                    C32779mjy c32779mjyEZpvd = AEQbTJ.EZpvd(application);
                    EZpvd = c32779mjyEZpvd;
                    c32779mjy = c32779mjyEZpvd;
                }
            }
        }
        return c32779mjy;
    }

    public final C32779mjy EZpvd(android.app.Application application) {
        C32779mjy c32779mjy = new C32779mjy(application);
        OLrzqt.set(true);
        return c32779mjy;
    }

    public final void copydefault() {
        synchronized (this) {
            C32779mjy c32779mjy = EZpvd;
            if (c32779mjy != null) {
                c32779mjy.fJNWhG();
                EZpvd = null;
                OLrzqt.set(false);
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
