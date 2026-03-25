package o;

import com.okinc.biz.share.ShareFileProvider;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.rxutils.RxBus;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.link.LinkShareParams;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uiB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49096uiB extends AbstractC49105uiK {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IShareParams copydefault(@NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(iShareParams, "");
        return iShareParams;
    }

    public static /* synthetic */ void performShareActionWithIShareParams$default(AbstractC49096uiB abstractC49096uiB, android.app.Activity activity, IShareParams iShareParams, boolean z, InterfaceC49121uia.Activity activity2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performShareActionWithIShareParams");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        abstractC49096uiB.EZpvd(activity, iShareParams, z, activity2);
    }

    public final void EZpvd(@NotNull android.app.Activity activity, @NotNull IShareParams iShareParams, boolean z, InterfaceC49121uia.Activity activity2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        java.lang.String strKWHzl = KWHzl();
        java.util.List<java.lang.String> listCopydefault = copydefault();
        if (strKWHzl == null || strKWHzl.length() == 0) {
            pUU.copydefault("BaseIntentSharePerformer", "invalid packageName:" + strKWHzl);
            return;
        }
        if (listCopydefault == null || listCopydefault.isEmpty()) {
            pUU.copydefault("BaseIntentSharePerformer", "invalid componentNames:" + listCopydefault);
            return;
        }
        try {
            android.content.Intent intentCopydefault = copydefault(activity, iShareParams);
            java.util.List<android.content.pm.ResolveInfo> listOLrzqt = OLrzqt(activity, intentCopydefault, strKWHzl);
            if (listOLrzqt.isEmpty()) {
                pUU.KWHzl("BaseIntentSharePerformer", "resolveShareComponents is empty->pkg:" + strKWHzl);
                java.lang.String string = activity.getResources().getString(C48931uew.Activity.gHZMYf);
                Intrinsics.checkNotNullExpressionValue(string, "");
                OLrzqt(iShareParams, string);
                return;
            }
            android.content.ComponentName componentNameAEQbTJ = AEQbTJ(strKWHzl, listOLrzqt, listCopydefault);
            if (componentNameAEQbTJ != null) {
                copydefault(activity, intentCopydefault, componentNameAEQbTJ, z, activity2, iShareParams);
                return;
            }
            KWHzl(activity, intentCopydefault, strKWHzl, z, activity2, iShareParams);
            AEQbTJ(listOLrzqt);
            C49067uhZ.AEQbTJ.OLrzqt();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            java.lang.String string2 = activity.getResources().getString(C48931uew.Activity.gHZMYf);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            OLrzqt(iShareParams, string2);
            if (activity2 != null) {
                activity2.EZpvd(EZpvd(), e);
            }
            RxBus.AEQbTJ(new C49286ulg("false", EZpvd().getPlatformName()));
            java.lang.String str = "performShareActionWithIShareParams occur error: " + e.getMessage();
            C6777aVl.Companion.EZpvd(new java.lang.IllegalArgumentException(str, e));
            pUU.copydefault("BaseIntentSharePerformer", str);
            C49067uhZ.AEQbTJ.OLrzqt();
        }
    }

    public android.content.Intent copydefault(@NotNull android.app.Activity activity, @NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        IShareParams iShareParamsCopydefault = copydefault(iShareParams);
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        java.lang.String title = iShareParamsCopydefault.getTitle();
        java.lang.String body = iShareParamsCopydefault.getBody();
        if (iShareParamsCopydefault.getShareType() == ShareType.SHARE_IMAGE) {
            intent.setType("image/*");
            Intrinsics.copydefault(iShareParamsCopydefault, "");
            intent.putExtra("android.intent.extra.STREAM", ShareFileProvider.Companion.copydefault(activity, ((ImageShareParams) iShareParamsCopydefault).requirePendingShareImagePath()));
            intent.addFlags(1);
            intent.putExtra("android.intent.extra.TEXT", OLrzqt(title, body, (java.lang.String) null));
        } else if (iShareParamsCopydefault.getShareType() == ShareType.SHARE_WEBPAGE) {
            Intrinsics.copydefault(iShareParamsCopydefault, "");
            intent.putExtra("android.intent.extra.TEXT", OLrzqt(title, body, ((LinkShareParams) iShareParamsCopydefault).getLinkUrl()));
            intent.setType("text/plain");
        } else {
            intent.putExtra("android.intent.extra.TEXT", OLrzqt(title, body, (java.lang.String) null));
            intent.setType("text/plain");
        }
        return intent;
    }

    public final java.util.List<android.content.pm.ResolveInfo> OLrzqt(@NotNull android.content.Context context, @NotNull android.content.Intent intent, @NotNull java.lang.String str) {
        java.util.List<android.content.pm.ResolveInfo> listAhwBna;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            listAhwBna = context.getPackageManager().queryIntentActivities(intent, 65536);
            Intrinsics.copydefault(listAhwBna);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAhwBna) {
            android.content.pm.ActivityInfo activityInfo = ((android.content.pm.ResolveInfo) obj).activityInfo;
            if (activityInfo != null && android.text.TextUtils.equals(activityInfo.packageName, str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final android.content.ComponentName AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<? extends android.content.pm.ResolveInfo> list, @NotNull java.util.List<java.lang.String> list2) {
        java.lang.Object next;
        java.lang.Object next2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        if (list.isEmpty() || list2.isEmpty()) {
            return null;
        }
        java.util.Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.lang.String str2 = (java.lang.String) next;
            java.util.Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                android.content.pm.ActivityInfo activityInfo = ((android.content.pm.ResolveInfo) next2).activityInfo;
                if (activityInfo != null && android.text.TextUtils.equals(str, activityInfo.packageName) && Intrinsics.EZpvd((java.lang.Object) activityInfo.name, (java.lang.Object) str2)) {
                    break;
                }
            }
            android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) next2;
            if ((resolveInfo != null ? resolveInfo.activityInfo : null) != null) {
                break;
            }
        }
        java.lang.String str3 = (java.lang.String) next;
        if (str3 != null) {
            return new android.content.ComponentName(str, str3);
        }
        return null;
    }

    public static /* synthetic */ boolean performShareWithIntent$default(AbstractC49096uiB abstractC49096uiB, android.app.Activity activity, android.content.Intent intent, android.content.ComponentName componentName, boolean z, InterfaceC49121uia.Activity activity2, IShareParams iShareParams, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performShareWithIntent");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return abstractC49096uiB.copydefault(activity, intent, componentName, z, activity2, iShareParams);
    }

    public final boolean copydefault(@NotNull android.app.Activity activity, @NotNull android.content.Intent intent, @NotNull android.content.ComponentName componentName, boolean z, InterfaceC49121uia.Activity activity2, @NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(componentName, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        try {
            intent.setPackage(componentName.getPackageName());
            intent.setComponent(componentName);
            intent.addFlags(268435456);
            activity.startActivity(intent);
            if (activity2 != null) {
                activity2.KWHzl(EZpvd());
            }
            RxBus.AEQbTJ(new C49286ulg("true", EZpvd().getPlatformName()));
            if (z) {
                OLrzqt();
            }
            return true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            java.lang.String string = activity.getResources().getString(C48931uew.Activity.gHZMYf);
            Intrinsics.checkNotNullExpressionValue(string, "");
            OLrzqt(iShareParams, string);
            if (activity2 != null) {
                activity2.EZpvd(EZpvd(), e);
            }
            RxBus.AEQbTJ(new C49286ulg("false", EZpvd().getPlatformName()));
            java.lang.String str = "shareByIntent occur error: " + e.getMessage() + " componentName:" + componentName;
            C6777aVl.Companion.EZpvd(new java.lang.IllegalArgumentException(str, e));
            pUU.copydefault("BaseIntentSharePerformer", str);
            return false;
        }
    }

    public static /* synthetic */ boolean performShareWithChooser$default(AbstractC49096uiB abstractC49096uiB, android.app.Activity activity, android.content.Intent intent, java.lang.String str, boolean z, InterfaceC49121uia.Activity activity2, IShareParams iShareParams, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performShareWithChooser");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return abstractC49096uiB.KWHzl(activity, intent, str, z, activity2, iShareParams);
    }

    public final boolean KWHzl(@NotNull android.app.Activity activity, @NotNull android.content.Intent intent, @NotNull java.lang.String str, boolean z, InterfaceC49121uia.Activity activity2, @NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        try {
            intent.setComponent(null);
            intent.setPackage(str);
            intent.addFlags(268435456);
            activity.startActivity(android.content.Intent.createChooser(intent, activity.getResources().getString(C48931uew.Activity.QKVWgx)));
            pUU.copydefault("BaseIntentSharePerformer", "performShareWithChooser->pkg:" + str);
            if (activity2 != null) {
                activity2.KWHzl(EZpvd());
            }
            RxBus.AEQbTJ(new C49286ulg("true", EZpvd().getPlatformName()));
            if (z) {
                OLrzqt();
            }
            return true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            java.lang.String string = activity.getResources().getString(C48931uew.Activity.gHZMYf);
            Intrinsics.checkNotNullExpressionValue(string, "");
            OLrzqt(iShareParams, string);
            if (activity2 != null) {
                activity2.EZpvd(EZpvd(), e);
            }
            RxBus.AEQbTJ(new C49286ulg("false", EZpvd().getPlatformName()));
            java.lang.String str2 = "shareWithChooser occur error: " + e.getMessage() + " packageName:" + str;
            C6777aVl.Companion.EZpvd(new java.lang.IllegalArgumentException(str2, e));
            pUU.copydefault("BaseIntentSharePerformer", str2);
            return false;
        }
    }

    public final void AEQbTJ(@NotNull java.util.List<? extends android.content.pm.ResolveInfo> list) {
        final android.content.pm.PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        final java.lang.String strKWHzl = KWHzl();
        Intrinsics.copydefault((java.lang.Object) strKWHzl);
        final java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ";", null, null, 0, null, new Function1() { // from class: o.uiJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC49096uiB.EZpvd((android.content.pm.ResolveInfo) obj);
            }
        }, 30, null);
        try {
            packageInfo = C32979mnm.EZpvd.OLrzqt().getPackageManager().getPackageInfo(strKWHzl, 0);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            packageInfo = null;
        }
        pUU.copydefault("BaseIntentSharePerformer", "logUnknownShareComponentsEvent->pkg:" + strKWHzl + "  components:" + strJoinToString$default);
        C32866mlf.AEQbTJ("app_share_unknown_share_components", new TrackChannel[]{TrackChannel.OKStatistics}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.uiH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC49096uiB.KWHzl(strJoinToString$default, strKWHzl, packageInfo, (EventParamsList) obj);
            }
        });
    }

    public static final java.lang.CharSequence EZpvd(android.content.pm.ResolveInfo resolveInfo) {
        Intrinsics.checkNotNullParameter(resolveInfo, "");
        return "cmp:" + resolveInfo.activityInfo.name;
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, android.content.pm.PackageInfo packageInfo, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("components", str, false);
        eventParamsList.put("packageName", str2, false);
        if (packageInfo != null) {
            java.lang.String str3 = packageInfo.versionName;
            eventParamsList.put("version", str3 != null ? str3 : "", true);
        }
        return Unit.INSTANCE;
    }
}
