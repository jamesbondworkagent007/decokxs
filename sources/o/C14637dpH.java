package o;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14637dpH {
    public static /* synthetic */ Gson getGson$default(android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C9678baC.Companion.AEQbTJ();
        }
        return AEQbTJ(context);
    }

    public static final Gson AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C13458dMb.EZpvd(context).fetchVPNInfo();
    }
}
