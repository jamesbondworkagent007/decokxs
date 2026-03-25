package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ynG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57691ynG {
    public static final C57691ynG AEQbTJ = new C57691ynG();

    private C57691ynG() {
    }

    public final void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(android.net.Uri.parse(Intrinsics.KWHzl("package:", context.getPackageName())));
        context.startActivity(intent);
    }
}
