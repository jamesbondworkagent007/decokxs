package o;

import android.os.Build;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mhn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32662mhn {
    public static final void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        int i = Build.VERSION.SDK_INT;
        if (i == 29) {
            for (java.lang.String str : copydefault(context)) {
                try {
                    java.lang.Class.forName(str).newInstance();
                    pUU.KWHzl("preloadProviders", "Preloaded provider: " + str);
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ("preloadProviders", "Provider class not found: " + str, e);
                }
            }
            pUU.copydefault("preloadProviders", "preloadProviders perform end :" + Build.VERSION.SDK_INT);
            return;
        }
        pUU.copydefault("preloadProviders", "preloadProviders not perform :" + i);
    }

    public static final java.util.List<java.lang.String> KWHzl(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.lang.String packageName = context.getPackageName();
        java.util.List<android.content.pm.ProviderInfo> listQueryContentProviders = packageManager.queryContentProviders((java.lang.String) null, 0, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryContentProviders, "");
        for (android.content.pm.ProviderInfo providerInfo : listQueryContentProviders) {
            if (Intrinsics.EZpvd((java.lang.Object) providerInfo.packageName, (java.lang.Object) packageName)) {
                java.lang.String str = providerInfo.name;
                Intrinsics.checkNotNullExpressionValue(str, "");
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static final java.util.Set<java.lang.String> copydefault(android.content.Context context) {
        java.lang.String[] strArr = {"com.okinc.account.api.config.ImagePickerProvider", "com.okinc.account.impl.util.AccountFileProvider", "com.okinc.biz.share.ShareFileProvider", "com.okinc.im.widgets.CustomFileProvider", "androidx.core.content.FileProvider", "com.okinc.debugbox.activity.ShareLogFileProvider", "com.okinc.base.utils.OkUtils$FileProviderDevApp", "androidx.startup.InitializationProvider", "com.okinc.lib.utils.OkUtils$FileProviderDevApp", "com.lzf.easyfloat.EasyFloatInitializer", "com.just.agentweb.AgentWebFileProvider", "com.huawei.hms.support.api.push.PushProvider"};
        pUU.KWHzl("preloadProviders", "default provides  :" + strArr);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            java.util.List<java.lang.String> listKWHzl = KWHzl(context);
            pUU.KWHzl("preloadProviders", "get provider from pms  :" + listKWHzl);
            linkedHashSet.addAll(listKWHzl);
        } catch (java.lang.Exception e) {
            pUU.copydefault("preloadProviders", "get provider from pms failed :" + e.getMessage());
        }
        if (linkedHashSet.isEmpty()) {
            C56406yEe.KWHzl(linkedHashSet, strArr);
        }
        pUU.KWHzl("preloadProviders", "return providerClassNames :" + linkedHashSet);
        return linkedHashSet;
    }
}
