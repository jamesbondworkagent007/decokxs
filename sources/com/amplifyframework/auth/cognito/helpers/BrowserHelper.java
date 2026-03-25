package com.amplifyframework.auth.cognito.helpers;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BrowserHelper {
    public static final BrowserHelper INSTANCE = new BrowserHelper();

    private BrowserHelper() {
    }

    public final boolean isBrowserInstalled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new Intent("android.intent.action.VIEW", Uri.parse("https://docs.amplify.aws/")).resolveActivity(context.getPackageManager()) != null;
    }

    public final String getDefaultCustomTabPackage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        List<String> supportedCustomTabsPackages = getSupportedCustomTabsPackages(context);
        if (!supportedCustomTabsPackages.isEmpty()) {
            return CustomTabsClient.getPackageName(context, supportedCustomTabsPackages);
        }
        return null;
    }

    private final List<String> getSupportedCustomTabsPackages(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "");
        Intent action = new Intent().setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        Intrinsics.checkNotNullExpressionValue(action, "");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(action, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listQueryIntentServices, 10));
        Iterator<T> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).serviceInfo.packageName);
        }
        return arrayList;
    }
}
