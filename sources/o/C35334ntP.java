package o;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35334ntP {
    public static final AbstractActivityC33041mov EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context contextOLrzqt = C58196ywi.OLrzqt(view.getContext());
        Intrinsics.copydefault(contextOLrzqt, "");
        return (AbstractActivityC33041mov) contextOLrzqt;
    }

    public static final android.app.Activity KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context contextOLrzqt = C58196ywi.OLrzqt(view.getContext());
        Intrinsics.copydefault(contextOLrzqt, "");
        return (android.app.Activity) contextOLrzqt;
    }

    public static final AbstractActivityC33041mov EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context contextOLrzqt = C58196ywi.OLrzqt(context);
        Intrinsics.copydefault(contextOLrzqt, "");
        return (AbstractActivityC33041mov) contextOLrzqt;
    }

    public static final android.app.Activity KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context contextOLrzqt = C58196ywi.OLrzqt(context);
        Intrinsics.copydefault(contextOLrzqt, "");
        return (android.app.Activity) contextOLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    public static final LifecycleOwner AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (context instanceof LifecycleOwner) {
            return (LifecycleOwner) context;
        }
        if (!(context instanceof android.content.ContextWrapper)) {
            return null;
        }
        android.content.Context baseContext = ((android.content.ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "");
        return AEQbTJ(baseContext);
    }

    public static final boolean AEQbTJ(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((C35246nrh) C33488mxR.KWHzl().fromJson(str, C35246nrh.class));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        C35246nrh c35246nrh = (C35246nrh) objM7377constructorimpl;
        if (c35246nrh != null) {
            return c35246nrh.EZpvd();
        }
        return false;
    }
}
