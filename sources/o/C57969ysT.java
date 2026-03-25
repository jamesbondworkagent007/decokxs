package o;

import android.app.ActivityManager;
import android.os.RemoteException;
import androidx.core.app.FrameMetricsAggregator;
import com.tencent.matrix.lifecycle.MatrixLifecycleThread;
import com.tencent.matrix.lifecycle.supervisor.ProcessToken;
import com.tencent.matrix.util.MemInfo;
import com.tencent.matrix.util.PssInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C57968ysS;
import o.C57969ysT;
import o.InterfaceC57963ysN;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.ysT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57969ysT {
    public static final C57969ysT AEQbTJ = new C57969ysT();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0<java.lang.String>() { // from class: com.tencent.matrix.lifecycle.supervisor.ProcessSubordinate$TAG$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return C57968ysS.KWHzl.gEmmrt() + ".Subordinate";
        }
    });
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0<Activity>() { // from class: com.tencent.matrix.lifecycle.supervisor.ProcessSubordinate$manager$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final C57969ysT.Activity invoke() throws IllegalAccessException {
            if (C57968ysS.KWHzl.values()) {
                return new C57969ysT.Activity();
            }
            throw new IllegalAccessException("NOT allow for subordinate processes");
        }
    });
    public static final java.util.ArrayList<yHO<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean>> EZpvd = new java.util.ArrayList<>();
    public static final java.util.ArrayList<yHT<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, Unit>> OLrzqt = new java.util.ArrayList<>();
    public static final InterfaceC57960ysK gEmmrt = new StateListAnimator();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57960ysK OLrzqt() {
        return gEmmrt;
    }

    private C57969ysT() {
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) copydefault.getValue();
    }

    public final Activity AEQbTJ() {
        return (Activity) KWHzl.getValue();
    }

    /* JADX INFO: renamed from: o.ysT$Activity */
    public static final class Activity {
        public final InterfaceC56387yDm OLrzqt = C56392yDr.EZpvd(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<ConcurrentHashMap<ProcessToken, InterfaceC57963ysN>>() { // from class: com.tencent.matrix.lifecycle.supervisor.ProcessSubordinate$Manager$subordinateProxies$2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final ConcurrentHashMap<ProcessToken, InterfaceC57963ysN> invoke() {
                return new ConcurrentHashMap<>();
            }
        });

        public final ConcurrentHashMap<ProcessToken, InterfaceC57963ysN> OLrzqt() {
            return (ConcurrentHashMap) this.OLrzqt.getValue();
        }

        public final InterfaceC57963ysN KWHzl(@NotNull ProcessToken processToken, @NotNull InterfaceC57963ysN interfaceC57963ysN) {
            Intrinsics.checkNotNullParameter(processToken, "");
            Intrinsics.checkNotNullParameter(interfaceC57963ysN, "");
            return OLrzqt().put(processToken, interfaceC57963ysN);
        }

        public final InterfaceC57963ysN AEQbTJ(@NotNull ProcessToken processToken) {
            Intrinsics.checkNotNullParameter(processToken, "");
            return OLrzqt().remove(processToken);
        }

        public final void copydefault(@NotNull ProcessToken processToken, final java.lang.String str, final java.lang.String str2, final boolean z) {
            Intrinsics.checkNotNullParameter(processToken, "");
            ConcurrentHashMap<ProcessToken, InterfaceC57963ysN> concurrentHashMapOLrzqt = OLrzqt();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<ProcessToken, InterfaceC57963ysN> entry : concurrentHashMapOLrzqt.entrySet()) {
                if (!Intrinsics.EZpvd(entry.getKey(), processToken)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            KWHzl(linkedHashMap, new Function1<Map.Entry<? extends ProcessToken, ? extends InterfaceC57963ysN>, Unit>() { // from class: com.tencent.matrix.lifecycle.supervisor.ProcessSubordinate$Manager$dispatchState$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Map.Entry<? extends ProcessToken, ? extends InterfaceC57963ysN> entry2) throws RemoteException {
                    invoke2((Map.Entry<ProcessToken, ? extends InterfaceC57963ysN>) entry2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Map.Entry<ProcessToken, ? extends InterfaceC57963ysN> entry2) throws RemoteException {
                    Intrinsics.checkNotNullParameter(entry2, "");
                    entry2.getValue().OLrzqt(str, str2, z);
                }
            });
        }

        public final void EZpvd(final java.lang.String str, final java.lang.String str2, final int i, final boolean z) {
            KWHzl(OLrzqt(), new Function1<Map.Entry<? extends ProcessToken, ? extends InterfaceC57963ysN>, Unit>() { // from class: com.tencent.matrix.lifecycle.supervisor.ProcessSubordinate$Manager$dispatchDeath$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Map.Entry<? extends ProcessToken, ? extends InterfaceC57963ysN> entry) throws RemoteException {
                    invoke2((Map.Entry<ProcessToken, ? extends InterfaceC57963ysN>) entry);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Map.Entry<ProcessToken, ? extends InterfaceC57963ysN> entry) throws RemoteException {
                    Intrinsics.checkNotNullParameter(entry, "");
                    entry.getValue().EZpvd(str, str2, i, z);
                }
            });
        }

        public final void KWHzl(java.util.Map<ProcessToken, ? extends InterfaceC57963ysN> map, Function1<? super Map.Entry<ProcessToken, ? extends InterfaceC57963ysN>, Unit> function1) {
            for (Map.Entry<ProcessToken, ? extends InterfaceC57963ysN> entry : map.entrySet()) {
                try {
                    function1.invoke(entry);
                    Unit unit = Unit.INSTANCE;
                } catch (java.lang.Throwable th) {
                    C57969ysT c57969ysT = C57969ysT.AEQbTJ;
                    C58013ytK.OLrzqt(c57969ysT.KWHzl(), th, entry.getKey().KWHzl() + entry.getKey().EZpvd(), new java.lang.Object[0]);
                    if (th instanceof android.os.DeadObjectException) {
                        C58013ytK.OLrzqt(c57969ysT.KWHzl(), "remote process of proxy is dead, remove proxy: " + entry.getKey(), new java.lang.Object[0]);
                        OLrzqt().remove(entry.getKey());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ysT$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC57960ysK {
        @Override // o.InterfaceC57960ysK
        public void AEQbTJ(@NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, java.lang.Boolean> yho) {
            Intrinsics.checkNotNullParameter(yho, "");
            C57969ysT.EZpvd.add(yho);
        }

        @Override // o.InterfaceC57960ysK
        public void AEQbTJ(@NotNull yHT<? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Boolean, Unit> yht) {
            Intrinsics.checkNotNullParameter(yht, "");
            C57969ysT.OLrzqt.add(yht);
        }

        @Override // o.InterfaceC57960ysK
        public java.lang.String OLrzqt() {
            java.lang.String strEZpvd = ServiceC58030ytb.Companion.EZpvd();
            if (android.text.TextUtils.isEmpty(strEZpvd)) {
                C57968ysS c57968ysS = C57968ysS.KWHzl;
                java.lang.String strGEmmrt = c57968ysS.gEmmrt();
                try {
                    InterfaceC57967ysR interfaceC57967ysRAhwBna = c57968ysS.AhwBna();
                    strEZpvd = interfaceC57967ysRAhwBna != null ? interfaceC57967ysRAhwBna.KWHzl() : null;
                    if (strEZpvd == null) {
                        return "";
                    }
                    Intrinsics.checkNotNullExpressionValue(strEZpvd, "");
                } catch (java.lang.Throwable th) {
                    C58013ytK.OLrzqt(strGEmmrt, th, "", new java.lang.Object[0]);
                    return "";
                }
            }
            return strEZpvd;
        }
    }

    public final InterfaceC57963ysN.StateListAnimator EZpvd(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        return new TaskDescription(application);
    }

    /* JADX INFO: renamed from: o.ysT$TaskDescription */
    public static final class TaskDescription extends InterfaceC57963ysN.StateListAnimator {
        public final android.app.Application AEQbTJ;
        public boolean copydefault;

        public TaskDescription(@NotNull android.app.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            this.AEQbTJ = application;
        }

        @Override // o.InterfaceC57963ysN
        public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            java.lang.String strKWHzl = C57969ysT.AEQbTJ.KWHzl();
            try {
                if (z) {
                    C57964ysO.Companion.KWHzl(str2);
                } else {
                    C57964ysO.Companion.copydefault(str2);
                }
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt(strKWHzl, th, "", new java.lang.Object[0]);
            }
        }

        @Override // o.InterfaceC57963ysN
        public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C57969ysT c57969ysT = C57969ysT.AEQbTJ;
            java.lang.String strKWHzl = c57969ysT.KWHzl();
            try {
                C57968ysS c57968ysS = C57968ysS.KWHzl;
                C58013ytK.copydefault(c57968ysS.gEmmrt(), "receive kill target: " + i + '-' + str2, new java.lang.Object[0]);
                boolean zOLrzqt = c57969ysT.OLrzqt(C57969ysT.EZpvd, str, str2, java.lang.Integer.valueOf(i));
                if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) C58014ytL.OLrzqt(this.AEQbTJ)) && android.os.Process.myPid() == i) {
                    final ProcessToken processTokenCurrent$default = ProcessToken.ActionBar.current$default(ProcessToken.Companion, this.AEQbTJ, null, false, 6, null);
                    if (zOLrzqt && this.copydefault) {
                        this.copydefault = true;
                        InterfaceC57967ysR interfaceC57967ysRAhwBna = c57968ysS.AhwBna();
                        if (interfaceC57967ysRAhwBna != null) {
                            interfaceC57967ysRAhwBna.OLrzqt(processTokenCurrent$default);
                        }
                        C58013ytK.OLrzqt(c57968ysS.gEmmrt(), "rescued once !!!", new java.lang.Object[0]);
                        return;
                    }
                    MatrixLifecycleThread.EZpvd.OLrzqt().postDelayed(new java.lang.Runnable() { // from class: o.ysQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() throws java.lang.Throwable {
                            C57969ysT.TaskDescription.OLrzqt(this.copydefault, processTokenCurrent$default);
                        }
                    }, java.util.concurrent.TimeUnit.SECONDS.toMillis(10L));
                }
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt(strKWHzl, th, "", new java.lang.Object[0]);
            }
        }

        public static final void OLrzqt(TaskDescription taskDescription, ProcessToken processToken) throws java.lang.Throwable {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            Intrinsics.checkNotNullParameter(processToken, "");
            if (C58001ysz.AEQbTJ.isConnected().AEQbTJ() || C57982ysg.EZpvd.gEmmrt() || C57987ysl.EZpvd.AhwBna()) {
                java.lang.String strKWHzl = C57969ysT.AEQbTJ.KWHzl();
                try {
                    InterfaceC57967ysR interfaceC57967ysRAhwBna = C57968ysS.KWHzl.AhwBna();
                    if (interfaceC57967ysRAhwBna != null) {
                        interfaceC57967ysRAhwBna.copydefault(processToken);
                    }
                } catch (java.lang.Throwable th) {
                    C58013ytK.OLrzqt(strKWHzl, th, "", new java.lang.Object[0]);
                }
                C58013ytK.EZpvd(C57968ysS.KWHzl.gEmmrt(), "recheck: process is on foreground", new java.lang.Object[0]);
                return;
            }
            java.lang.String strKWHzl2 = C57969ysT.AEQbTJ.KWHzl();
            try {
                InterfaceC57967ysR interfaceC57967ysRAhwBna2 = C57968ysS.KWHzl.AhwBna();
                if (interfaceC57967ysRAhwBna2 != null) {
                    interfaceC57967ysRAhwBna2.EZpvd(processToken);
                }
            } catch (java.lang.Throwable th2) {
                C58013ytK.OLrzqt(strKWHzl2, th2, "", new java.lang.Object[0]);
            }
            C57968ysS c57968ysS = C57968ysS.KWHzl;
            C58013ytK.OLrzqt(c57968ysS.gEmmrt(), "actual kill !!! supervisor = " + c57968ysS.AhwBna(), new java.lang.Object[0]);
            java.lang.String strOLrzqt = C58014ytL.OLrzqt(taskDescription.AEQbTJ);
            Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
            for (ActivityManager.AppTask appTask : C58001ysz.EZpvd(strOLrzqt)) {
                java.lang.String strGEmmrt = C57968ysS.KWHzl.gEmmrt();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("removed task ");
                ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                Intrinsics.checkNotNullExpressionValue(taskInfo, "");
                sb.append(C58018ytP.EZpvd(taskInfo));
                C58013ytK.OLrzqt(strGEmmrt, sb.toString(), new java.lang.Object[0]);
                appTask.finishAndRemoveTask();
            }
            android.os.Process.killProcess(android.os.Process.myPid());
        }

        @Override // o.InterfaceC57963ysN
        public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C57969ysT c57969ysT = C57969ysT.AEQbTJ;
            java.lang.String strKWHzl = c57969ysT.KWHzl();
            try {
                c57969ysT.copydefault(C57969ysT.OLrzqt, str, str2, java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z));
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt(strKWHzl, th, "", new java.lang.Object[0]);
            }
        }

        @Override // o.InterfaceC57963ysN
        public MemInfo copydefault() {
            java.lang.String strKWHzl = C57969ysT.AEQbTJ.KWHzl();
            MemInfo memInfo = new MemInfo(null, null, null, null, null, new PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null), new PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null), null, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, null);
            try {
                return MemInfo.Companion.OLrzqt();
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt(strKWHzl, th, "", new java.lang.Object[0]);
                return memInfo;
            }
        }
    }

    public final boolean OLrzqt(java.util.ArrayList<yHO<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean>> arrayList, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        boolean zBooleanValue;
        java.util.Iterator<T> it = arrayList.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                yHO yho = (yHO) it.next();
                C57968ysS c57968ysS = C57968ysS.KWHzl;
                java.lang.String strGEmmrt = c57968ysS.gEmmrt();
                try {
                    zBooleanValue = ((java.lang.Boolean) yho.invoke(str, str2, num)).booleanValue();
                    if (zBooleanValue) {
                        C58013ytK.OLrzqt(c57968ysS.gEmmrt(), yho.getClass() + " try to rescue process", new java.lang.Object[0]);
                    }
                } catch (java.lang.Throwable th) {
                    C58013ytK.OLrzqt(strGEmmrt, th, "", new java.lang.Object[0]);
                }
                if (z || zBooleanValue) {
                    z = true;
                }
            }
            return z;
        }
    }

    public final void copydefault(java.util.ArrayList<yHT<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, Unit>> arrayList, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Boolean bool) {
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            yHT yht = (yHT) it.next();
            java.lang.String strGEmmrt = C57968ysS.KWHzl.gEmmrt();
            try {
                yht.invoke(str, str2, num, bool);
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt(strGEmmrt, th, "", new java.lang.Object[0]);
            }
        }
    }
}
