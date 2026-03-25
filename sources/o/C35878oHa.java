package o;

import com.okinc.web.WebActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oHa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35878oHa {
    public static /* synthetic */ void openPageWithInterceptor$default(WebActivity.TaskDescription taskDescription, android.content.Context context, android.os.Bundle bundle, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        copydefault(taskDescription, context, bundle, num);
    }

    public static final void copydefault(@NotNull WebActivity.TaskDescription taskDescription, @NotNull android.content.Context context, @NotNull android.os.Bundle bundle, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        taskDescription.KWHzl(context, bundle, num);
    }
}
