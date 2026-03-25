package o;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46989tha {
    public static final C46989tha copydefault = new C46989tha();

    private C46989tha() {
    }

    public static /* synthetic */ android.app.PendingIntent createDeepLinkPendingIntent$default(C46989tha c46989tha, android.content.Context context, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return c46989tha.AEQbTJ(context, str, i);
    }

    public final android.app.PendingIntent AEQbTJ(@NotNull android.content.Context context, java.lang.String str, int i) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(android.app.PendingIntent.getActivity(context, i, new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)), 201326592));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (android.app.PendingIntent) objM7377constructorimpl;
    }
}
