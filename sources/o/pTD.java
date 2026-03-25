package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pTD {
    public static /* synthetic */ java.lang.String getFormattedString$default(android.content.res.Resources resources, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return KWHzl(resources, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
    }

    public static final java.lang.String KWHzl(@NotNull android.content.res.Resources resources, @androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String string = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return C33069mpW.OLrzqt(string, map);
    }

    public static /* synthetic */ java.lang.String getFormattedString$default(android.content.Context context, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
    }

    public static final java.lang.String KWHzl(@NotNull android.content.Context context, @androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.content.res.Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return KWHzl(resources, i, map);
    }

    public static /* synthetic */ java.lang.String getFormattedString$default(androidx.fragment.app.Fragment fragment, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return copydefault(fragment, i, map);
    }

    public static final java.lang.String copydefault(@NotNull androidx.fragment.app.Fragment fragment, @androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.content.Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return KWHzl(contextRequireContext, i, map);
    }

    public static /* synthetic */ java.lang.String getFormattedQuantityString$default(android.content.res.Resources resources, int i, int i2, java.util.Map map, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        return copydefault(resources, i, i2, map);
    }

    public static final java.lang.String copydefault(@NotNull android.content.res.Resources resources, @androidx.annotation.PluralsRes int i, int i2, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String quantityString = resources.getQuantityString(i, i2);
        Intrinsics.checkNotNullExpressionValue(quantityString, "");
        java.lang.String strReplace$default = quantityString;
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            strReplace$default = C59449zhJ.replace$default(strReplace$default, "{" + ((java.lang.Object) entry.getKey()) + "}", java.lang.String.valueOf(entry.getValue()), false, 4, (java.lang.Object) null);
        }
        pSQ.copydefault.OLrzqt(quantityString, strReplace$default);
        return strReplace$default;
    }

    public static /* synthetic */ java.lang.String getFormattedQuantityString$default(android.content.Context context, int i, int i2, java.util.Map map, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        return EZpvd(context, i, i2, map);
    }

    public static final java.lang.String EZpvd(@NotNull android.content.Context context, @androidx.annotation.PluralsRes int i, int i2, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.content.res.Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return copydefault(resources, i, i2, map);
    }

    public static /* synthetic */ java.lang.String getFormattedQuantityString$default(androidx.fragment.app.Fragment fragment, int i, int i2, java.util.Map map, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        return KWHzl(fragment, i, i2, map);
    }

    public static final java.lang.String KWHzl(@NotNull androidx.fragment.app.Fragment fragment, @androidx.annotation.PluralsRes int i, int i2, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.content.Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return EZpvd(contextRequireContext, i, i2, map);
    }

    public static final java.lang.String KWHzl(java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str + obj;
    }

    public static final java.lang.String AEQbTJ(java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return obj + " " + str;
    }
}
