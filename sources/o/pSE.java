package o;

import com.okinc.di.LocalizeDIModule;
import com.okinc.localization.LocalizeResources;
import com.okinc.localization.hooker.Reflector;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pSE {
    public static final pSE EZpvd = new pSE();
    public static pTU OLrzqt = ((LocalizeDIModule.Activity) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), LocalizeDIModule.Activity.class)).gkJEwt();
    public static final int copydefault = 8;

    private pSE() {
    }

    public final void EZpvd(@NotNull android.content.Context context) {
        LocalizeResources localizeResources;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            Reflector reflectorKWHzl = Reflector.KWHzl(context);
            java.lang.String strKWHzl = pSC.AEQbTJ.KWHzl();
            if (!android.text.TextUtils.isEmpty(strKWHzl)) {
                java.util.Locale locale = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) StringsKt__StringsKt.split$default((java.lang.CharSequence) strKWHzl, new char[]{'-'}, false, 0, 6, (java.lang.Object) null).get(0))) {
                    locale = android.text.TextUtils.isEmpty((java.lang.CharSequence) StringsKt__StringsKt.split$default((java.lang.CharSequence) strKWHzl, new char[]{'-'}, false, 0, 6, (java.lang.Object) null).get(1)) ? new java.util.Locale((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) strKWHzl, new char[]{'-'}, false, 0, 6, (java.lang.Object) null).get(0)) : new java.util.Locale((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) strKWHzl, new char[]{'-'}, false, 0, 6, (java.lang.Object) null).get(0), (java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) strKWHzl, new char[]{'-'}, false, 0, 6, (java.lang.Object) null).get(1));
                }
                android.content.res.AssetManager assets = context.getAssets();
                Intrinsics.checkNotNullExpressionValue(assets, "");
                android.content.res.Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                localizeResources = new LocalizeResources(assets, resources);
                android.util.DisplayMetrics displayMetrics = localizeResources.getDisplayMetrics();
                android.content.res.Configuration configuration = localizeResources.getConfiguration();
                configuration.locale = locale;
                configuration.setLocales(new android.os.LocaleList(locale));
                localizeResources.updateConfiguration(configuration, displayMetrics);
            } else {
                android.content.res.AssetManager assets2 = context.getAssets();
                Intrinsics.checkNotNullExpressionValue(assets2, "");
                android.content.res.Resources resources2 = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "");
                localizeResources = new LocalizeResources(assets2, resources2);
            }
            reflectorKWHzl.OLrzqt("mResources").AEQbTJ(localizeResources);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
        }
    }
}
