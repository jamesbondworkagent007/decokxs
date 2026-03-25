package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aUD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6692aUD {
    public static final java.lang.String AEQbTJ(@NotNull android.content.res.TypedArray typedArray, @androidx.annotation.StyleableRes int i) {
        Intrinsics.checkNotNullParameter(typedArray, "");
        int resourceId = typedArray.getResourceId(i, -1);
        if (resourceId == -1) {
            java.lang.String string = typedArray.getString(i);
            return string == null ? "" : string;
        }
        java.lang.String string2 = typedArray.getResources().getString(resourceId);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }
}
