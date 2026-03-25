package com.okinc.business.appupdate.update;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.core.os.BundleKt;
import com.okinc.web.WebActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56403yEb;
import o.C59449zhJ;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ExternalBrowserOpener {
    public static final int $stable = 0;
    private static final String CHROME_PACKAGE = "com.android.chrome";
    public static final ExternalBrowserOpener INSTANCE = new ExternalBrowserOpener();
    private static final String TAG = "ExternalBrowserOpener";

    private ExternalBrowserOpener() {
    }

    public final void open(@NotNull Context context, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 131072);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listQueryIntentActivities, 10));
            Iterator<T> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
            }
            List listQbewEr = CollectionsKt___CollectionsKt.QbewEr(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listQbewEr) {
                if (!Intrinsics.EZpvd(obj, (Object) context.getPackageName())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                String str2 = (String) obj2;
                Intrinsics.copydefault((Object) str2);
                if (!C59449zhJ.startsWith$default(str2, "com.okinc.okx", false, 2, null) || !C59449zhJ.startsWith$default(str2, "com.okx", false, 2, null)) {
                    arrayList3.add(obj2);
                }
            }
            pUU.EZpvd(TAG, "browserPackages: " + arrayList3);
            if (arrayList3.isEmpty()) {
                pUU.EZpvd("No external browser available");
                if (z) {
                    openWithWebView(context, str);
                    return;
                }
                return;
            }
            String str3 = CHROME_PACKAGE;
            if (!arrayList3.contains(CHROME_PACKAGE)) {
                str3 = (String) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList3);
            }
            intent.setPackage(str3);
            context.startActivity(intent);
        } catch (Throwable unused) {
            pUU.copydefault(TAG, "Invalid url: " + str);
        }
    }

    private final void openWithWebView(Context context, String str) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str)), null, 4, null);
    }
}
