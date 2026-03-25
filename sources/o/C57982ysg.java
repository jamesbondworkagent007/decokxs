package o;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.os.Handler;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.tencent.matrix.lifecycle.MatrixLifecycleThread;
import java.lang.reflect.InvocationHandler;
import java.util.HashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C57982ysg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ysg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57982ysg extends C57983ysh {
    public static android.os.Handler AEQbTJ;
    public static android.app.ActivityManager AhwBna;
    public static final C57982ysg EZpvd = new C57982ysg();
    public static android.util.ArrayMap<?, ?> OLrzqt;
    public static final java.lang.reflect.Field gEmmrt;
    public static TaskDescription valueOf;

    private C57982ysg() {
        super(false, 1, null);
    }

    static {
        java.lang.reflect.Field declaredField;
        try {
            declaredField = java.lang.Class.forName("android.app.Service").getDeclaredField("mActivityManager");
            declaredField.setAccessible(true);
        } catch (java.lang.Throwable th) {
            C58013ytK.OLrzqt("Matrix.FgService", th, "", new java.lang.Object[0]);
            declaredField = null;
        }
        gEmmrt = declaredField;
    }

    public final void KWHzl(@NotNull android.content.Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.copydefault(systemService, "");
        AhwBna = (android.app.ActivityManager) systemService;
        if (!z) {
            C58013ytK.EZpvd("Matrix.FgService", "disabled", new java.lang.Object[0]);
        } else {
            AkhnZx();
        }
    }

    private final void AkhnZx() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mH");
            declaredField.setAccessible(true);
            java.lang.reflect.Method method = cls.getMethod("currentActivityThread", new java.lang.Class[0]);
            method.setAccessible(true);
            java.lang.Object objInvoke = method.invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mServices");
            declaredField2.setAccessible(true);
            OLrzqt = (android.util.ArrayMap) declaredField2.get(objInvoke);
            java.lang.Object obj = declaredField.get(objInvoke);
            Intrinsics.copydefault(obj, "");
            AEQbTJ = (android.os.Handler) obj;
            java.lang.reflect.Field declaredField3 = android.os.Handler.class.getDeclaredField("mCallback");
            declaredField3.setAccessible(true);
            Handler.Callback callback = (Handler.Callback) declaredField3.get(AEQbTJ);
            declaredField3.set(AEQbTJ, new StateListAnimator(callback));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("origin is ");
            sb.append(callback != null ? callback.getClass().getName() : null);
            C58013ytK.EZpvd("Matrix.FgService", sb.toString(), new java.lang.Object[0]);
        } catch (java.lang.Throwable th) {
            C58013ytK.OLrzqt("Matrix.FgService", th, "", new java.lang.Object[0]);
        }
    }

    public final boolean gEmmrt() {
        TaskDescription taskDescription;
        android.app.ActivityManager activityManager = AhwBna;
        if (activityManager == null) {
            throw new java.lang.IllegalStateException("NOT initialized yet");
        }
        boolean z = false;
        try {
            Intrinsics.copydefault(activityManager);
            java.util.List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
            Intrinsics.checkNotNullExpressionValue(runningServices, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : runningServices) {
                ActivityManager.RunningServiceInfo runningServiceInfo = (ActivityManager.RunningServiceInfo) obj;
                if (runningServiceInfo.uid == android.os.Process.myUid() && runningServiceInfo.pid == android.os.Process.myPid()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((ActivityManager.RunningServiceInfo) it.next()).foreground) {
                        z = true;
                        break;
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            C58013ytK.OLrzqt("Matrix.FgService", th, "", new java.lang.Object[0]);
        }
        if (!z && (taskDescription = valueOf) != null) {
            taskDescription.AEQbTJ();
        }
        return z;
    }

    /* JADX INFO: renamed from: o.ysg$StateListAnimator */
    public static final class StateListAnimator implements Handler.Callback {
        public boolean KWHzl;
        public final Handler.Callback OLrzqt;

        public StateListAnimator(Handler.Callback callback) {
            this.OLrzqt = callback;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NotNull android.os.Message message) {
            android.os.Handler handler;
            Intrinsics.checkNotNullParameter(message, "");
            if (this.KWHzl) {
                C58013ytK.OLrzqt("Matrix.FgService", "reentrant!!! ignore this msg: " + message.what, new java.lang.Object[0]);
                return false;
            }
            int i = message.what;
            if (i == 114) {
                android.os.Handler handler2 = C57982ysg.AEQbTJ;
                if (handler2 != null) {
                    handler2.post(new java.lang.Runnable() { // from class: o.ysm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C57982ysg.StateListAnimator.OLrzqt(this.AEQbTJ);
                        }
                    });
                }
            } else if (i == 116 && (handler = C57982ysg.AEQbTJ) != null) {
                handler.post(new java.lang.Runnable() { // from class: o.ysn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C57982ysg.StateListAnimator.KWHzl(this.EZpvd);
                    }
                });
            }
            this.KWHzl = true;
            Handler.Callback callback = this.OLrzqt;
            java.lang.Boolean boolValueOf = callback != null ? java.lang.Boolean.valueOf(callback.handleMessage(message)) : null;
            this.KWHzl = false;
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
            return false;
        }

        public static final void OLrzqt(StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            try {
                stateListAnimator.AEQbTJ();
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt("Matrix.FgService", th, "", new java.lang.Object[0]);
            }
        }

        public static final void KWHzl(final StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            MatrixLifecycleThread.EZpvd.OLrzqt().post(new java.lang.Runnable() { // from class: o.ysi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C57982ysg.StateListAnimator.AhwBna(this.AEQbTJ);
                }
            });
        }

        public static final void AhwBna(StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            try {
                C57982ysg.EZpvd.gEmmrt();
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt("Matrix.FgService", th, "", new java.lang.Object[0]);
            }
        }

        public final void AEQbTJ() throws java.lang.IllegalAccessException {
            android.util.ArrayMap arrayMap = C57982ysg.OLrzqt;
            if (arrayMap != null) {
                for (Map.Entry entry : arrayMap.entrySet()) {
                    java.lang.reflect.Field field = C57982ysg.gEmmrt;
                    java.lang.Object obj = field != null ? field.get(entry.getValue()) : null;
                    Intrinsics.copydefault(obj);
                    if (!java.lang.reflect.Proxy.isProxyClass(obj.getClass()) || !Intrinsics.EZpvd(java.lang.reflect.Proxy.getInvocationHandler(obj), C57982ysg.valueOf)) {
                        if (C57982ysg.valueOf == null) {
                            C58013ytK.EZpvd("Matrix.FgService", "first inject", new java.lang.Object[0]);
                            C57982ysg c57982ysg = C57982ysg.EZpvd;
                            C57982ysg.valueOf = new TaskDescription(obj);
                        }
                        C58013ytK.EZpvd("Matrix.FgService", "going to inject " + entry.getValue(), new java.lang.Object[0]);
                        java.lang.Object value = entry.getValue();
                        Intrinsics.copydefault(value, "");
                        android.app.Service service = (android.app.Service) value;
                        OLrzqt(new android.content.ComponentName(service, service.getClass().getName()));
                        java.lang.reflect.Field field2 = C57982ysg.gEmmrt;
                        if (field2 != null) {
                            java.lang.Object value2 = entry.getValue();
                            java.lang.ClassLoader classLoader = obj.getClass().getClassLoader();
                            java.lang.Class<?>[] interfaces = obj.getClass().getInterfaces();
                            TaskDescription taskDescription = C57982ysg.valueOf;
                            Intrinsics.copydefault(taskDescription);
                            field2.set(value2, java.lang.reflect.Proxy.newProxyInstance(classLoader, interfaces, taskDescription));
                        }
                    }
                }
            }
        }

        public final void OLrzqt(final android.content.ComponentName componentName) {
            MatrixLifecycleThread.EZpvd.OLrzqt().post(new java.lang.Runnable() { // from class: o.yso
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C57982ysg.StateListAnimator.copydefault(this.copydefault, componentName);
                }
            });
        }

        public static final void copydefault(StateListAnimator stateListAnimator, android.content.ComponentName componentName) {
            java.util.List<ActivityManager.RunningServiceInfo> runningServices;
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(componentName, "");
            try {
                android.app.ActivityManager activityManager = C57982ysg.AhwBna;
                if (activityManager == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null) {
                    return;
                }
                java.util.ArrayList<ActivityManager.RunningServiceInfo> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : runningServices) {
                    ActivityManager.RunningServiceInfo runningServiceInfo = (ActivityManager.RunningServiceInfo) obj;
                    if (runningServiceInfo.pid == android.os.Process.myPid() && runningServiceInfo.uid == android.os.Process.myUid() && Intrinsics.EZpvd(runningServiceInfo.service, componentName) && runningServiceInfo.foreground) {
                        arrayList.add(obj);
                    }
                }
                for (ActivityManager.RunningServiceInfo runningServiceInfo2 : arrayList) {
                    C58013ytK.EZpvd("Matrix.FgService", "service turned fg when create: " + runningServiceInfo2.service, new java.lang.Object[0]);
                    TaskDescription taskDescription = C57982ysg.valueOf;
                    if (taskDescription != null) {
                        android.content.ComponentName componentName2 = runningServiceInfo2.service;
                        Intrinsics.checkNotNullExpressionValue(componentName2, "");
                        taskDescription.OLrzqt(componentName2);
                    }
                }
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt("Matrix.FgService", th, "", new java.lang.Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: o.ysg$TaskDescription */
    public static final class TaskDescription implements InvocationHandler {
        public final java.lang.Object EZpvd;
        public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0<java.util.HashSet<android.content.ComponentName>>() { // from class: com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner$FgServiceHandler$fgServiceRecord$2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final HashSet<ComponentName> invoke() {
                return new HashSet<>();
            }
        });

        public TaskDescription(java.lang.Object obj) {
            this.EZpvd = obj;
        }

        public final java.util.HashSet<android.content.ComponentName> OLrzqt() {
            return (java.util.HashSet) this.copydefault.getValue();
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, @NotNull java.lang.Object... objArr) {
            java.lang.Object objInvoke;
            Intrinsics.checkNotNullParameter(objArr, "");
            if (method != null) {
                try {
                    objInvoke = method.invoke(this.EZpvd, java.util.Arrays.copyOf(objArr, objArr.length));
                } catch (java.lang.Throwable th) {
                    C58013ytK.OLrzqt("Matrix.FgService", th, "", new java.lang.Object[0]);
                    return null;
                }
            } else {
                objInvoke = null;
            }
            if (Intrinsics.EZpvd((java.lang.Object) (method != null ? method.getName() : null), (java.lang.Object) "setServiceForeground")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("real invoked setServiceForeground: ");
                java.lang.String string = java.util.Arrays.toString(objArr);
                Intrinsics.checkNotNullExpressionValue(string, "");
                sb.append(string);
                C58013ytK.EZpvd("Matrix.FgService", sb.toString(), new java.lang.Object[0]);
                if (objArr.length > 3 && objArr[3] == null) {
                    java.lang.Object obj2 = objArr[0];
                    Intrinsics.copydefault(obj2, "");
                    AEQbTJ((android.content.ComponentName) obj2);
                } else {
                    java.lang.Object obj3 = objArr[0];
                    Intrinsics.copydefault(obj3, "");
                    OLrzqt((android.content.ComponentName) obj3);
                }
            }
            return objInvoke;
        }

        public final void OLrzqt(@NotNull android.content.ComponentName componentName) {
            boolean z;
            Intrinsics.checkNotNullParameter(componentName, "");
            synchronized (OLrzqt()) {
                C58013ytK.EZpvd("Matrix.FgService", "hack onStartForeground: " + componentName, new java.lang.Object[0]);
                if (OLrzqt().isEmpty()) {
                    C58013ytK.EZpvd("Matrix.FgService", "should turn ON", new java.lang.Object[0]);
                    z = true;
                } else {
                    z = false;
                }
                OLrzqt().add(componentName);
            }
            if (z) {
                C58013ytK.EZpvd("Matrix.FgService", "do turn ON", new java.lang.Object[0]);
                C57982ysg.EZpvd.valueOf();
            }
        }

        public final void AEQbTJ(@NotNull android.content.ComponentName componentName) {
            boolean z;
            Intrinsics.checkNotNullParameter(componentName, "");
            synchronized (OLrzqt()) {
                C58013ytK.EZpvd("Matrix.FgService", "hack onStopForeground: " + componentName, new java.lang.Object[0]);
                OLrzqt().remove(componentName);
                if (OLrzqt().isEmpty()) {
                    C58013ytK.EZpvd("Matrix.FgService", "should turn OFF", new java.lang.Object[0]);
                    z = true;
                } else {
                    z = false;
                }
                Unit unit = Unit.INSTANCE;
            }
            if (z) {
                C58013ytK.EZpvd("Matrix.FgService", "do turn OFF", new java.lang.Object[0]);
                C57982ysg.EZpvd.djBIcL();
            }
        }

        public final void AEQbTJ() {
            boolean z;
            synchronized (OLrzqt()) {
                z = true;
                if (!OLrzqt().isEmpty()) {
                    OLrzqt().clear();
                    C58013ytK.EZpvd("Matrix.FgService", "clear done, should turn OFF", new java.lang.Object[0]);
                } else {
                    z = false;
                }
                Unit unit = Unit.INSTANCE;
            }
            if (z) {
                C58013ytK.EZpvd("Matrix.FgService", "fix clear: do turn OFF", new java.lang.Object[0]);
                C57982ysg.EZpvd.djBIcL();
            }
        }
    }
}
