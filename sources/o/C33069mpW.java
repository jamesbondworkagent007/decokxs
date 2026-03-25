package o;

import android.content.res.Resources;
import com.okinc.di.LocalizeDIContainer;
import com.okinc.localization.LocalizeResources;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33069mpW {
    public static boolean OLrzqt;
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mpY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33069mpW.KWHzl();
        }
    });

    public static /* synthetic */ java.lang.String getStringWithParams$default(android.content.res.Resources resources, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return AEQbTJ(resources, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
    }

    public static final java.lang.String AEQbTJ(@NotNull android.content.res.Resources resources, @androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(map, "");
        return copydefault(resources, i, map);
    }

    public static /* synthetic */ java.lang.String getStringWithParams$default(android.content.Context context, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return OLrzqt(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
    }

    public static final java.lang.String OLrzqt(@NotNull android.content.Context context, @androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        return KWHzl(context, i, map);
    }

    public static /* synthetic */ java.lang.String getStringWithParams$default(androidx.fragment.app.Fragment fragment, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return AEQbTJ(fragment, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
    }

    public static final java.lang.String AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, @androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(map, "");
        return copydefault(fragment, i, map);
    }

    public static /* synthetic */ java.lang.String getFormattedString$default(java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return OLrzqt(str, map);
    }

    public static /* synthetic */ java.lang.String getFormattedString$default(android.content.res.Resources resources, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return copydefault(resources, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
    }

    public static final java.lang.String copydefault(@NotNull android.content.res.Resources resources, @androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String string = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return OLrzqt(string, map);
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
        return copydefault(resources, i, map);
    }

    public static /* synthetic */ java.lang.String getFormattedString$default(androidx.fragment.app.Fragment fragment, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return copydefault(fragment, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
    }

    public static final java.lang.String copydefault(@NotNull androidx.fragment.app.Fragment fragment, @androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.content.Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return KWHzl(contextRequireContext, i, map);
    }

    public static /* synthetic */ android.text.SpannableStringBuilder getFormattedSpanString$default(android.content.Context context, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return copydefault(context, i, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) map);
    }

    public static final android.text.SpannableStringBuilder copydefault(@NotNull android.content.Context context, @androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, ? extends android.text.Spannable> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.content.res.Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return KWHzl(resources, i, map);
    }

    public static /* synthetic */ android.text.SpannableStringBuilder getFormattedSpanString$default(android.content.Context context, android.text.SpannableStringBuilder spannableStringBuilder, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return copydefault(context, spannableStringBuilder, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) map);
    }

    public static final android.text.SpannableStringBuilder copydefault(@NotNull android.content.Context context, @NotNull android.text.SpannableStringBuilder spannableStringBuilder, @NotNull java.util.Map<java.lang.String, ? extends android.text.Spannable> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.content.res.Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return OLrzqt(resources, spannableStringBuilder, map);
    }

    public static /* synthetic */ android.text.SpannableStringBuilder getFormattedSpanString$default(android.content.res.Resources resources, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return KWHzl(resources, i, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) map);
    }

    public static final android.text.SpannableStringBuilder KWHzl(@NotNull android.content.res.Resources resources, @androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, ? extends android.text.Spannable> map) {
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String string = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return OLrzqt(resources, new android.text.SpannableStringBuilder(string), map);
    }

    public static /* synthetic */ android.text.SpannableStringBuilder getFormattedSpanString$default(android.content.res.Resources resources, android.text.SpannableStringBuilder spannableStringBuilder, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return OLrzqt(resources, spannableStringBuilder, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) map);
    }

    public static final android.text.SpannableStringBuilder OLrzqt(@NotNull android.content.res.Resources resources, @NotNull android.text.SpannableStringBuilder spannableStringBuilder, @NotNull java.util.Map<java.lang.String, ? extends android.text.Spannable> map) {
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String string = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String strReplace$default = string;
        for (Map.Entry<java.lang.String, ? extends android.text.Spannable> entry : map.entrySet()) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableStringBuilder, "{" + ((java.lang.Object) entry.getKey()) + "}", 0, false, 6, (java.lang.Object) null);
            if (iIndexOf$default != -1) {
                int length = entry.getKey().length();
                android.text.Spannable value = entry.getValue();
                spannableStringBuilder = spannableStringBuilder.replace(iIndexOf$default, length + iIndexOf$default + 2, (java.lang.CharSequence) java.lang.String.valueOf(value));
                strReplace$default = C59449zhJ.replace$default(strReplace$default, "{" + ((java.lang.Object) entry.getKey()) + "}", java.lang.String.valueOf(entry.getValue()), false, 4, (java.lang.Object) null);
                try {
                    java.lang.Object[] spans = value.getSpans(0, value.length(), java.lang.Object.class);
                    Intrinsics.checkNotNullExpressionValue(spans, "");
                    for (java.lang.Object obj : spans) {
                        int spanStart = value.getSpanStart(obj);
                        int i = iIndexOf$default + spanStart;
                        spannableStringBuilder.setSpan(C6798aWF.EZpvd(obj), i, (value.getSpanEnd(obj) - spanStart) + i, 33);
                    }
                } catch (java.lang.Exception e) {
                    pUU.valueOf("OKResourcesExt", "getFormattedSpanString exception: " + e);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static final android.app.Application EZpvd() {
        return (android.app.Application) copydefault.getValue();
    }

    public static final android.app.Application KWHzl() {
        return C43246rlf.OLrzqt.valueOf();
    }

    public static final java.lang.String copydefault(@androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        android.content.res.Resources resources = EZpvd().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return copydefault(resources, i, map);
    }

    public static /* synthetic */ java.lang.String getString$default(android.content.Context context, C2774AYs c2774AYs, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return KWHzl(context, c2774AYs, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
    }

    public static final java.lang.String KWHzl(@NotNull android.content.Context context, @NotNull C2774AYs c2774AYs, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.String string;
        java.lang.String string2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c2774AYs, "");
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier(c2774AYs.OLrzqt(), "string", context.getPackageName());
        boolean z = OLrzqt;
        if (z && identifier == 0) {
            throw new Resources.NotFoundException("Resource not found for key '" + c2774AYs.OLrzqt() + "' in package '" + context.getPackageName() + "'. Add it to your string.xml");
        }
        if (z && !(resources instanceof LocalizeResources)) {
            throw new java.lang.IllegalArgumentException("Resources must be LocalizeResources type for key '" + c2774AYs.OLrzqt() + "', current: " + resources.getClass().getName());
        }
        boolean z2 = resources instanceof LocalizeResources;
        if (!z2) {
            java.lang.CharSequence charSequenceAuCTel = LocalizeDIContainer.INSTANCE.getLocalizeResourceRepo().AuCTel(c2774AYs.OLrzqt());
            if (charSequenceAuCTel == null || (string2 = charSequenceAuCTel.toString()) == null) {
                string = identifier != 0 ? resources.getText(identifier).toString() : null;
            } else {
                string = string2;
            }
        } else if (identifier != 0) {
            string = ((LocalizeResources) resources).getText(identifier).toString();
        } else {
            string = ((LocalizeResources) resources).getString(c2774AYs.OLrzqt());
        }
        if (string != null) {
            return map == null ? string : OLrzqt(string, map);
        }
        pUU.valueOf("getStringExt", "return key's name for " + c2774AYs.OLrzqt() + ", stringId:" + identifier + ", isLocalizeResources:" + z2);
        return c2774AYs.OLrzqt();
    }

    public static /* synthetic */ java.lang.String getQuantityString$default(android.content.Context context, C2774AYs c2774AYs, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        return KWHzl(context, c2774AYs, i, map);
    }

    public static final java.lang.String KWHzl(@NotNull android.content.Context context, @NotNull C2774AYs c2774AYs, int i, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.String quantityString;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c2774AYs, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier(c2774AYs.OLrzqt(), "plurals", context.getPackageName());
        boolean z = OLrzqt;
        if (z && identifier == 0) {
            throw new Resources.NotFoundException("Plurals resource not found for key '" + c2774AYs.OLrzqt() + "' in package '" + context.getPackageName() + "'. Add it to your plurals.xml");
        }
        if (z && !(resources instanceof LocalizeResources)) {
            throw new java.lang.IllegalArgumentException("Resources must be LocalizeResources type for key '" + c2774AYs.OLrzqt() + "', current: " + resources.getClass().getName());
        }
        boolean z2 = resources instanceof LocalizeResources;
        if (!z2) {
            java.lang.CharSequence charSequenceEZpvd = LocalizeDIContainer.INSTANCE.getLocalizeResourceRepo().EZpvd(c2774AYs.OLrzqt(), i, (java.util.Map<java.lang.Object, ? extends java.lang.Object>) null);
            if (charSequenceEZpvd == null || (string = charSequenceEZpvd.toString()) == null) {
                quantityString = identifier != 0 ? resources.getQuantityString(identifier, i) : null;
            } else {
                quantityString = string;
            }
        } else if (identifier != 0) {
            quantityString = ((LocalizeResources) resources).getQuantityString(identifier, i);
        } else {
            quantityString = ((LocalizeResources) resources).getQuantityString(c2774AYs.OLrzqt(), i);
        }
        if (quantityString != null) {
            return map.isEmpty() ? quantityString : OLrzqt(quantityString, map);
        }
        pUU.valueOf("getQuantityStringExt", "return key's name for " + c2774AYs.OLrzqt() + ", pluralsId:" + identifier + ", isLocalizeResources:" + z2);
        return c2774AYs.OLrzqt();
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String strReplace$default = str;
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            strReplace$default = C59449zhJ.replace$default(strReplace$default, "{" + ((java.lang.Object) entry.getKey()) + "}", java.lang.String.valueOf(entry.getValue()), false, 4, (java.lang.Object) null);
        }
        pSQ.copydefault.OLrzqt(str, strReplace$default);
        return strReplace$default;
    }
}
