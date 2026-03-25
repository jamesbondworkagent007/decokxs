package o;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46361tRm {
    public static /* synthetic */ void launch$default(android.app.Activity activity, java.util.Map map, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) AbstractActivityC33041mov.class);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                KWHzl(intent, (java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        activity.startActivity(intent);
        if (z) {
            activity.finish();
        }
    }

    public static /* synthetic */ void launch$default(android.content.Context context, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) AbstractActivityC33041mov.class);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                KWHzl(intent, (java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        context.startActivity(intent);
    }

    public static final void KWHzl(@NotNull android.content.Intent intent, @NotNull java.lang.String str, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (obj instanceof java.lang.Long) {
            intent.putExtra(str, ((java.lang.Number) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            intent.putExtra(str, (java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            intent.putExtra(str, ((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof java.lang.Float) {
            intent.putExtra(str, ((java.lang.Number) obj).floatValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            intent.putExtra(str, ((java.lang.Number) obj).doubleValue());
        } else if (obj instanceof java.lang.Integer) {
            intent.putExtra(str, ((java.lang.Number) obj).intValue());
        } else if (obj instanceof android.os.Parcelable) {
            intent.putExtra(str, (android.os.Parcelable) obj);
        }
    }

    public static final boolean OLrzqt(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return (activity.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
