package o;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.moF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32999moF {
    public static final C32999moF AEQbTJ = new C32999moF();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        int i = Build.VERSION.SDK_INT;
        return i == 29 || i == 28;
    }

    private C32999moF() {
    }

    public final void copydefault(@NotNull android.content.Context context, android.os.Bundle bundle) {
        java.util.Set<java.lang.String> setKeySet;
        Intrinsics.checkNotNullParameter(context, "");
        if (bundle != null) {
            try {
                if (AEQbTJ()) {
                    bundle.setClassLoader(context.getClass().getClassLoader());
                    android.os.Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    if (bundle2 == null || (setKeySet = bundle2.keySet()) == null) {
                        return;
                    }
                    java.util.Iterator<T> it = setKeySet.iterator();
                    while (it.hasNext()) {
                        java.lang.Object obj = bundle2.get((java.lang.String) it.next());
                        android.os.Bundle bundle3 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
                        if (bundle3 != null) {
                            bundle3.setClassLoader(context.getClass().getClassLoader());
                        }
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.valueOf("FragmentStateFixer", "fixState exception: " + e);
            }
        }
    }
}
