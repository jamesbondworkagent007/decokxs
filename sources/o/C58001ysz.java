package o;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.tencent.matrix.lifecycle.MatrixLifecycleThread;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C58001ysz;
import o.InterfaceC57909yrM;
import o.InterfaceC57913yrQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ysz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58001ysz {
    public static ActionBar DbNXlk;
    public static android.app.ActivityManager EZpvd;
    public static android.content.pm.ActivityInfo[] OLrzqt;
    public static volatile boolean djBIcL;
    public static java.lang.String gEmmrt;
    public static java.lang.String isConnected;
    public static java.lang.String values;
    public static final C58001ysz AEQbTJ = new C58001ysz();
    public static final android.os.Handler fIwbmz = MatrixLifecycleThread.EZpvd.OLrzqt();
    public static final java.lang.Object getFieldNames = new java.lang.Object();
    public static final WeakHashMap<android.app.Activity, java.lang.Object> KWHzl = new WeakHashMap<>();
    public static final WeakHashMap<android.app.Activity, java.lang.Object> fJNWhG = new WeakHashMap<>();
    public static final WeakHashMap<android.app.Activity, java.lang.Object> AuCTel = new WeakHashMap<>();
    public static final WeakHashMap<android.app.Activity, java.lang.Object> valueOf = new WeakHashMap<>();
    public static boolean AkhnZx = true;
    public static boolean uzCIH = true;
    public static final InterfaceC57913yrQ AhwBna = new StateListAnimator();
    public static final InterfaceC57913yrQ fARcdN = new Application();
    public static final InterfaceC57913yrQ hDKMBd = new Application();
    public static java.lang.String ejfBZ = "";
    public static final java.lang.Runnable AYXKKw = new java.lang.Runnable() { // from class: o.ysA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            C58001ysz.copydefault();
        }
    };
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0<java.util.HashMap<java.lang.String, java.lang.String>>() { // from class: com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$componentToProcess$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final HashMap<String, String> invoke() {
            return new HashMap<>();
        }
    });
    public static final java.util.HashSet<InterfaceC58036yth> fetchVPNInfo = new java.util.HashSet<>();
    public static java.lang.String getNewProxyInstance = "default";

    /* JADX INFO: renamed from: o.ysz$ActionBar */
    public interface ActionBar {
        void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        getNewProxyInstance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57913yrQ fetchVPNInfo() {
        return fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57913yrQ gEmmrt() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57913yrQ isConnected() {
        return hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return ejfBZ;
    }

    private C58001ysz() {
    }

    public final void copydefault(@NotNull android.app.Application application) {
        android.content.pm.ActivityInfo[] activityInfoArr;
        Intrinsics.checkNotNullParameter(application, "");
        java.lang.Object systemService = application.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        EZpvd = (android.app.ActivityManager) systemService;
        isConnected = C58014ytL.OLrzqt(application);
        values = C58014ytL.copydefault(application);
        try {
            android.content.pm.PackageManager packageManager = application.getPackageManager();
            java.lang.String str = values;
            Intrinsics.copydefault((java.lang.Object) str);
            activityInfoArr = packageManager.getPackageInfo(str, 1).activities;
        } catch (java.lang.Throwable th) {
            C58013ytK.OLrzqt("Matrix.Lifecycle", th, "", new java.lang.Object[0]);
            activityInfoArr = null;
        }
        OLrzqt = activityInfoArr;
        AEQbTJ(application);
        C58013ytK.EZpvd("Matrix.Lifecycle", "init for [" + isConnected + AbstractJsonLexerKt.END_LIST, new java.lang.Object[0]);
    }

    public final <R> R AEQbTJ(WeakHashMap<android.app.Activity, java.lang.Object> weakHashMap, Function1<? super WeakHashMap<android.app.Activity, java.lang.Object>, ? extends R> function1) {
        R rInvoke;
        synchronized (weakHashMap) {
            rInvoke = function1.invoke(weakHashMap);
        }
        return rInvoke;
    }

    public final java.lang.Object AEQbTJ(WeakHashMap<android.app.Activity, java.lang.Object> weakHashMap, android.app.Activity activity) {
        return weakHashMap.put(activity, getFieldNames);
    }

    /* JADX INFO: renamed from: o.ysz$Application */
    public static class Application extends C57983ysh implements InterfaceC57913yrQ {
        public Application() {
            super(false, 1, null);
        }

        public void KWHzl() {
            valueOf();
        }

        public void copydefault() {
            djBIcL();
        }
    }

    /* JADX INFO: renamed from: o.ysz$StateListAnimator */
    public static final class StateListAnimator extends Application {
        @Override // o.C57983ysh, o.InterfaceC57914yrR
        public boolean AEQbTJ() {
            return super.AEQbTJ() && ((java.lang.Boolean) C58001ysz.AEQbTJ.AEQbTJ((WeakHashMap<android.app.Activity, java.lang.Object>) C58001ysz.KWHzl, new Function1<WeakHashMap<android.app.Activity, java.lang.Object>, java.lang.Boolean>() { // from class: com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$CreatedStateOwner$active$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(@NotNull WeakHashMap<Activity, Object> weakHashMap) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(weakHashMap, "");
                    if (weakHashMap.isEmpty()) {
                        z = true;
                    } else {
                        Iterator<Map.Entry<Activity, Object>> it = weakHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            Activity key = it.next().getKey();
                            if (key == null || key.isFinishing()) {
                                z = false;
                                break;
                            }
                        }
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            })).booleanValue();
        }
    }

    public final void copydefault(ActionBar actionBar) {
        DbNXlk = actionBar;
        if (actionBar == null || !hDKMBd.AEQbTJ() || android.text.TextUtils.isEmpty(ejfBZ)) {
            return;
        }
        actionBar.OLrzqt(ejfBZ, "");
    }

    public static final void AEQbTJ(ActionBar actionBar, java.lang.String str) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(str, "");
        actionBar.OLrzqt(str, ejfBZ);
    }

    public final void OLrzqt(final java.lang.String str) {
        final ActionBar actionBar = DbNXlk;
        if (actionBar != null) {
            try {
                fIwbmz.post(new java.lang.Runnable() { // from class: o.ysE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C58001ysz.AEQbTJ(actionBar, str);
                    }
                });
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt("Matrix.Lifecycle", th, "", new java.lang.Object[0]);
            }
        }
        ejfBZ = str;
    }

    public static final void copydefault() {
        C58001ysz c58001ysz = AEQbTJ;
        c58001ysz.djBIcL();
        c58001ysz.AYXKKw();
    }

    public final void KWHzl(final android.app.Activity activity) {
        WeakHashMap<android.app.Activity, java.lang.Object> weakHashMap = KWHzl;
        boolean zIsEmpty = weakHashMap.isEmpty();
        AEQbTJ(weakHashMap, new Function1<WeakHashMap<android.app.Activity, java.lang.Object>, java.lang.Object>() { // from class: com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$activityCreated$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(@NotNull WeakHashMap<Activity, Object> weakHashMap2) {
                Intrinsics.checkNotNullParameter(weakHashMap2, "");
                return C58001ysz.AEQbTJ.AEQbTJ((WeakHashMap<Activity, Object>) weakHashMap2, activity);
            }
        });
        if (zIsEmpty) {
            InterfaceC57913yrQ interfaceC57913yrQ = AhwBna;
            Intrinsics.copydefault(interfaceC57913yrQ, "");
            ((Application) interfaceC57913yrQ).KWHzl();
        }
    }

    public final void EZpvd(android.app.Activity activity) {
        WeakHashMap<android.app.Activity, java.lang.Object> weakHashMap = AuCTel;
        boolean zIsEmpty = weakHashMap.isEmpty();
        AEQbTJ(weakHashMap, activity);
        if (zIsEmpty && uzCIH) {
            InterfaceC57913yrQ interfaceC57913yrQ = hDKMBd;
            Intrinsics.copydefault(interfaceC57913yrQ, "");
            ((Application) interfaceC57913yrQ).KWHzl();
        }
    }

    public final void OLrzqt(android.app.Activity activity) {
        WeakHashMap<android.app.Activity, java.lang.Object> weakHashMap = fJNWhG;
        boolean zIsEmpty = weakHashMap.isEmpty();
        AEQbTJ(weakHashMap, activity);
        if (zIsEmpty) {
            if (AkhnZx) {
                InterfaceC57913yrQ interfaceC57913yrQ = fARcdN;
                Intrinsics.copydefault(interfaceC57913yrQ, "");
                ((Application) interfaceC57913yrQ).KWHzl();
                AkhnZx = false;
                return;
            }
            fIwbmz.removeCallbacks(AYXKKw);
        }
    }

    public final void AEQbTJ(android.app.Activity activity) {
        WeakHashMap<android.app.Activity, java.lang.Object> weakHashMap = fJNWhG;
        weakHashMap.remove(activity);
        if (weakHashMap.isEmpty()) {
            fIwbmz.postDelayed(AYXKKw, 500L);
        }
    }

    public final void AhwBna(android.app.Activity activity) {
        AuCTel.remove(activity);
        AYXKKw();
    }

    public final void copydefault(final android.app.Activity activity) {
        AEQbTJ(KWHzl, new Function1<WeakHashMap<android.app.Activity, java.lang.Object>, Unit>() { // from class: com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$activityDestroyed$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WeakHashMap<Activity, Object> weakHashMap) {
                invoke2(weakHashMap);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull WeakHashMap<Activity, Object> weakHashMap) {
                Intrinsics.checkNotNullParameter(weakHashMap, "");
                weakHashMap.remove(activity);
                if (weakHashMap.isEmpty()) {
                    InterfaceC57913yrQ interfaceC57913yrQGEmmrt = C58001ysz.AEQbTJ.gEmmrt();
                    Intrinsics.copydefault(interfaceC57913yrQGEmmrt, "");
                    ((C58001ysz.Application) interfaceC57913yrQGEmmrt).copydefault();
                }
            }
        });
        AEQbTJ(valueOf, activity);
        if (AuCTel.remove(activity) != null) {
            C58013ytK.AEQbTJ("Matrix.Lifecycle", "removed [" + activity + "] when destroy, maybe something wrong with onStart/onStop callback", new java.lang.Object[0]);
        }
        if (fJNWhG.remove(activity) != null) {
            C58013ytK.AEQbTJ("Matrix.Lifecycle", "removed [" + activity + "] when destroy, maybe something wrong with onResume/onPause callback", new java.lang.Object[0]);
        }
    }

    public final void djBIcL() {
        if (fJNWhG.isEmpty()) {
            AkhnZx = true;
            InterfaceC57913yrQ interfaceC57913yrQ = fARcdN;
            Intrinsics.copydefault(interfaceC57913yrQ, "");
            ((Application) interfaceC57913yrQ).copydefault();
        }
    }

    public final void AYXKKw() {
        if (AuCTel.isEmpty() && AkhnZx) {
            uzCIH = true;
            InterfaceC57913yrQ interfaceC57913yrQ = hDKMBd;
            Intrinsics.copydefault(interfaceC57913yrQ, "");
            ((Application) interfaceC57913yrQ).copydefault();
        }
    }

    public final void AEQbTJ(android.app.Application application) {
        hDKMBd.KWHzl(new Activity());
        application.registerActivityLifecycleCallbacks(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.ysz$TaskDescription */
    public static final class TaskDescription implements Application.ActivityLifecycleCallbacks {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bundle, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            C58001ysz.AEQbTJ.KWHzl(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            C58001ysz c58001ysz = C58001ysz.AEQbTJ;
            java.lang.String name = activity.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            c58001ysz.OLrzqt(name);
            c58001ysz.AYXKKw(activity);
            c58001ysz.EZpvd(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            C58001ysz.AEQbTJ.OLrzqt(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            C58001ysz.AEQbTJ.AEQbTJ(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            C58001ysz.AEQbTJ.AhwBna(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            C58001ysz.AEQbTJ.copydefault(activity);
        }
    }

    public final java.util.HashMap<java.lang.String, java.lang.String> valueOf() {
        return (java.util.HashMap) copydefault.getValue();
    }

    public final boolean EZpvd(android.content.ComponentName componentName, java.lang.String str) {
        android.content.pm.ActivityInfo activityInfo;
        java.lang.String str2;
        if (componentName == null || !Intrinsics.EZpvd((java.lang.Object) componentName.getPackageName(), (java.lang.Object) values)) {
            return false;
        }
        if (OLrzqt == null) {
            return true;
        }
        java.util.HashMap<java.lang.String, java.lang.String> mapValueOf = valueOf();
        java.lang.String className = componentName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "");
        java.lang.String str3 = mapValueOf.get(className);
        if (str3 == null) {
            android.content.pm.ActivityInfo[] activityInfoArr = OLrzqt;
            Intrinsics.copydefault(activityInfoArr);
            int length = activityInfoArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    activityInfo = null;
                    break;
                }
                activityInfo = activityInfoArr[i];
                if (Intrinsics.EZpvd((java.lang.Object) activityInfo.name, (java.lang.Object) componentName.getClassName())) {
                    break;
                }
                i++;
            }
            if (activityInfo == null) {
                C58013ytK.OLrzqt("Matrix.Lifecycle", "got task info not appeared in package manager " + activityInfo, new java.lang.Object[0]);
                str2 = values;
                Intrinsics.copydefault((java.lang.Object) str2);
            } else {
                str2 = activityInfo.processName;
            }
            str3 = str2;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            mapValueOf.put(className, str3);
        }
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str3);
    }

    public final boolean KWHzl(ActivityManager.RecentTaskInfo recentTaskInfo, java.lang.String str) {
        return EZpvd(recentTaskInfo.baseIntent.getComponent(), str) || EZpvd(recentTaskInfo.origActivity, str) || EZpvd(recentTaskInfo.baseActivity, str) || EZpvd(recentTaskInfo.topActivity, str);
    }

    public static final boolean AhwBna() {
        android.app.ActivityManager activityManager = EZpvd;
        if (activityManager == null) {
            throw new java.lang.IllegalStateException("NOT initialized yet");
        }
        try {
            Intrinsics.copydefault(activityManager);
            java.util.List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
            Intrinsics.checkNotNullExpressionValue(appTasks, "");
            java.util.ArrayList<ActivityManager.AppTask> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : appTasks) {
                C58001ysz c58001ysz = AEQbTJ;
                ActivityManager.RecentTaskInfo taskInfo = ((ActivityManager.AppTask) obj).getTaskInfo();
                Intrinsics.checkNotNullExpressionValue(taskInfo, "");
                if (c58001ysz.KWHzl(taskInfo, isConnected)) {
                    arrayList.add(obj);
                }
            }
            for (ActivityManager.AppTask appTask : arrayList) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(isConnected);
                sb.append(" task: ");
                ActivityManager.RecentTaskInfo taskInfo2 = appTask.getTaskInfo();
                Intrinsics.checkNotNullExpressionValue(taskInfo2, "");
                sb.append(C58018ytP.EZpvd(taskInfo2));
                C58013ytK.EZpvd("Matrix.Lifecycle", sb.toString(), new java.lang.Object[0]);
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            for (ActivityManager.AppTask appTask2 : arrayList) {
                C58013ytK.copydefault("Matrix.Lifecycle", "hasRunningAppTask run any", new java.lang.Object[0]);
                if (Build.VERSION.SDK_INT >= 29) {
                    if (appTask2.getTaskInfo().isRunning) {
                    }
                } else if (appTask2.getTaskInfo().numActivities > 0) {
                }
            }
            return false;
        } catch (java.lang.Throwable th) {
            C58013ytK.OLrzqt("Matrix.Lifecycle", th, "", new java.lang.Object[0]);
        }
        return true;
    }

    public static final ActivityManager.AppTask[] EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.app.ActivityManager activityManager = EZpvd;
        if (activityManager == null) {
            throw new java.lang.IllegalStateException("NOT initialized yet");
        }
        ActivityManager.AppTask[] appTaskArr = new ActivityManager.AppTask[0];
        try {
            Intrinsics.copydefault(activityManager);
            java.util.List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
            Intrinsics.checkNotNullExpressionValue(appTasks, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : appTasks) {
                C58001ysz c58001ysz = AEQbTJ;
                ActivityManager.RecentTaskInfo taskInfo = ((ActivityManager.AppTask) obj).getTaskInfo();
                Intrinsics.checkNotNullExpressionValue(taskInfo, "");
                if (c58001ysz.KWHzl(taskInfo, str)) {
                    arrayList.add(obj);
                }
            }
            return (ActivityManager.AppTask[]) arrayList.toArray(new ActivityManager.AppTask[0]);
        } catch (java.lang.Throwable th) {
            C58013ytK.OLrzqt("Matrix.Lifecycle", th, "", new java.lang.Object[0]);
            return appTaskArr;
        }
    }

    public final void copydefault(java.lang.String str) {
        C58013ytK.EZpvd("Matrix.Lifecycle", "[setCurrentFragmentName] fragmentName: " + str, new java.lang.Object[0]);
        gEmmrt = str;
        if (str != null) {
            AEQbTJ(str);
        } else {
            AEQbTJ("?");
        }
    }

    public final void KWHzl(@NotNull InterfaceC58036yth interfaceC58036yth) {
        Intrinsics.checkNotNullParameter(interfaceC58036yth, "");
        java.util.HashSet<InterfaceC58036yth> hashSet = fetchVPNInfo;
        synchronized (hashSet) {
            hashSet.add(interfaceC58036yth);
        }
    }

    public final void EZpvd(@NotNull InterfaceC58036yth interfaceC58036yth) {
        Intrinsics.checkNotNullParameter(interfaceC58036yth, "");
        java.util.HashSet<InterfaceC58036yth> hashSet = fetchVPNInfo;
        synchronized (hashSet) {
            hashSet.remove(interfaceC58036yth);
        }
    }

    public final void AYXKKw(android.app.Activity activity) {
        java.lang.String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        getNewProxyInstance = name;
    }

    /* JADX INFO: renamed from: o.ysz$Activity */
    public static final class Activity implements InterfaceC57909yrM {
        @Override // o.InterfaceC57909yrM
        public boolean copydefault() {
            return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
        }

        public final void gEmmrt() {
            C58001ysz c58001ysz = C58001ysz.AEQbTJ;
            if (c58001ysz.ejfBZ()) {
                return;
            }
            C58013ytK.EZpvd("Matrix.Lifecycle", "onForeground... visibleScene[" + c58001ysz.AkhnZx() + '@' + C58001ysz.isConnected + AbstractJsonLexerKt.END_LIST, new java.lang.Object[0]);
            MatrixLifecycleThread.EZpvd.copydefault().execute(new java.lang.Runnable() { // from class: o.ysB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C58001ysz.Activity.djBIcL();
                }
            });
        }

        public static final void djBIcL() {
            C58001ysz c58001ysz = C58001ysz.AEQbTJ;
            C58001ysz.djBIcL = true;
            synchronized (C58001ysz.fetchVPNInfo) {
                java.util.Iterator it = C58001ysz.fetchVPNInfo.iterator();
                while (it.hasNext()) {
                    ((InterfaceC58036yth) it.next()).copydefault(true);
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void valueOf() {
            C58001ysz c58001ysz = C58001ysz.AEQbTJ;
            if (c58001ysz.ejfBZ()) {
                C58013ytK.EZpvd("Matrix.Lifecycle", "onBackground... visibleScene[" + c58001ysz.AkhnZx() + '@' + C58001ysz.isConnected + AbstractJsonLexerKt.END_LIST, new java.lang.Object[0]);
                MatrixLifecycleThread.EZpvd.copydefault().execute(new java.lang.Runnable() { // from class: o.ysC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C58001ysz.Activity.AYXKKw();
                    }
                });
            }
        }

        public static final void AYXKKw() {
            C58001ysz c58001ysz = C58001ysz.AEQbTJ;
            C58001ysz.djBIcL = false;
            synchronized (C58001ysz.fetchVPNInfo) {
                java.util.Iterator it = C58001ysz.fetchVPNInfo.iterator();
                while (it.hasNext()) {
                    ((InterfaceC58036yth) it.next()).copydefault(false);
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // o.InterfaceC57916yrT
        public void KWHzl() {
            gEmmrt();
        }

        @Override // o.InterfaceC57916yrT
        public void OLrzqt() {
            valueOf();
        }
    }
}
