package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nhQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34705nhQ {
    public static final C34705nhQ AEQbTJ = new C34705nhQ();

    private C34705nhQ() {
    }

    public static final boolean AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage("com.android.settings"));
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
