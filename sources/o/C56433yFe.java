package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yFe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56433yFe {
    public static /* synthetic */ java.lang.Thread thread$default(boolean z, boolean z2, java.lang.ClassLoader classLoader, java.lang.String str, int i, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        java.lang.ClassLoader classLoader2 = (i2 & 4) != 0 ? null : classLoader;
        java.lang.String str2 = (i2 & 8) != 0 ? null : str;
        if ((i2 & 16) != 0) {
            i = -1;
        }
        return KWHzl(z3, z4, classLoader2, str2, i, function0);
    }

    /* JADX INFO: renamed from: o.yFe$Activity */
    public static final class Activity extends java.lang.Thread {
        public final /* synthetic */ Function0<Unit> KWHzl;

        public Activity(Function0<Unit> function0) {
            this.KWHzl = function0;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.KWHzl.invoke();
        }
    }

    public static final java.lang.Thread KWHzl(boolean z, boolean z2, java.lang.ClassLoader classLoader, java.lang.String str, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        Activity activity = new Activity(function0);
        if (z2) {
            activity.setDaemon(true);
        }
        if (i > 0) {
            activity.setPriority(i);
        }
        if (str != null) {
            activity.setName(str);
        }
        if (classLoader != null) {
            activity.setContextClassLoader(classLoader);
        }
        if (z) {
            activity.start();
        }
        return activity;
    }
}
