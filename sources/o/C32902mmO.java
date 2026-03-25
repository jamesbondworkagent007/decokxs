package o;

import com.bytedance.applog.IAppLogInstance;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.components.track.provider.ByteDanceABTestProvider$refreshCefiFlagsWithLoginChange$1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C32902mmO;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mmO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32902mmO implements InterfaceC32865mle {
    public static final C32902mmO KWHzl = new C32902mmO();
    public static final CoroutineScope OLrzqt = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getIO()));
    public static final java.util.Map<java.lang.String, ConcurrentLinkedQueue<InterfaceC32861mla>> copydefault = new ConcurrentHashMap();
    public static final java.util.Map<java.lang.String, java.lang.Boolean> EZpvd = new ConcurrentHashMap();
    public static final int AEQbTJ = 8;

    private C32902mmO() {
    }

    @Override // o.InterfaceC32865mle
    public java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        java.lang.String strEZpvd = EZpvd(EZpvd(amplitudeName).getAbConfig(str, null));
        pUU.EZpvd("ByteDanceABTestProvider", "getValue->key:" + str + " value:" + strEZpvd);
        return strEZpvd;
    }

    @Override // o.InterfaceC32865mle
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        java.lang.Object objOLrzqt = OLrzqt(EZpvd(amplitudeName).getAbConfig(str, null));
        pUU.EZpvd("ByteDanceABTestProvider", "getPayload->key:" + str + " payload:" + objOLrzqt);
        return objOLrzqt;
    }

    public final java.lang.String EZpvd(java.lang.Object obj) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("legacy_value") && jSONObject.has("legacy_payload")) {
                return jSONObject.get("legacy_value").toString();
            }
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public final java.lang.Object OLrzqt(java.lang.Object obj) {
        if (!(obj instanceof JSONObject)) {
            return obj;
        }
        JSONObject jSONObject = (JSONObject) obj;
        return (jSONObject.has("legacy_value") && jSONObject.has("legacy_payload")) ? jSONObject.get("legacy_payload") : obj;
    }

    @Override // o.InterfaceC32865mle
    public void OLrzqt(@NotNull InterfaceC32861mla interfaceC32861mla, @NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(interfaceC32861mla, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        java.util.Map<java.lang.String, ConcurrentLinkedQueue<InterfaceC32861mla>> map = copydefault;
        if (map.get(amplitudeName.name()) == null) {
            map.put(amplitudeName.name(), new ConcurrentLinkedQueue<>());
        }
        ConcurrentLinkedQueue<InterfaceC32861mla> concurrentLinkedQueue = map.get(amplitudeName.name());
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.add(interfaceC32861mla);
        }
        if (Intrinsics.EZpvd(EZpvd.get(amplitudeName.name()), java.lang.Boolean.TRUE)) {
            interfaceC32861mla.EZpvd(amplitudeName);
        }
    }

    @Override // o.InterfaceC32865mle
    public void EZpvd(@NotNull InterfaceC32861mla interfaceC32861mla, @NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(interfaceC32861mla, "");
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        ConcurrentLinkedQueue<InterfaceC32861mla> concurrentLinkedQueue = copydefault.get(amplitudeName.name());
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.remove(interfaceC32861mla);
        }
    }

    public final IAppLogInstance EZpvd(@NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        return C32859mlY.KWHzl.OLrzqt(amplitudeName);
    }

    public static /* synthetic */ void notifyDataUpdated$OKAnalytics_track$default(C32902mmO c32902mmO, AmplitudeName amplitudeName, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            amplitudeName = AmplitudeName.CEFI;
        }
        c32902mmO.AEQbTJ(amplitudeName);
    }

    public final void AEQbTJ(@NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        ConcurrentLinkedQueue<InterfaceC32861mla> concurrentLinkedQueue = copydefault.get(amplitudeName.name());
        if (concurrentLinkedQueue != null) {
            java.util.Iterator<T> it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                ((InterfaceC32861mla) it.next()).KWHzl(amplitudeName);
            }
        }
    }

    public static /* synthetic */ void notifyInit$OKAnalytics_track$default(C32902mmO c32902mmO, AmplitudeName amplitudeName, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            amplitudeName = AmplitudeName.CEFI;
        }
        c32902mmO.copydefault(amplitudeName);
    }

    public final void copydefault(@NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        ConcurrentLinkedQueue<InterfaceC32861mla> concurrentLinkedQueue = copydefault.get(amplitudeName.name());
        if (concurrentLinkedQueue != null) {
            java.util.Iterator<T> it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                ((InterfaceC32861mla) it.next()).EZpvd(amplitudeName);
            }
        }
        EZpvd.put(amplitudeName.name(), java.lang.Boolean.TRUE);
    }

    public static /* synthetic */ void refreshCefiFlagsWithLoginChange$default(C32902mmO c32902mmO, java.lang.String str, long j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 2000;
        }
        c32902mmO.KWHzl(str, j, function1);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [T, kotlinx.coroutines.Job] */
    public final void KWHzl(@NotNull java.lang.String str, long j, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.EZpvd("ByteDanceABTestProvider", "refreshCefiFlagsWithLoginChange userId=" + str);
        pUU.KWHzl("ByteDanceABTestProvider", "refreshCefiFlagsWithLoginChange timeout=" + j);
        AmplitudeName amplitudeName = AmplitudeName.CEFI;
        IAppLogInstance iAppLogInstanceEZpvd = EZpvd(amplitudeName);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        StateListAnimator stateListAnimator = new StateListAnimator(atomicBoolean, objectRef, function1);
        objectRef.element = BuildersKt__Builders_commonKt.launch$default(OLrzqt, null, null, new ByteDanceABTestProvider$refreshCefiFlagsWithLoginChange$1(j, atomicBoolean, stateListAnimator, function1, null), 3, null);
        OLrzqt(stateListAnimator, amplitudeName);
        iAppLogInstanceEZpvd.setUserUniqueID(str);
    }

    /* JADX INFO: renamed from: o.mmO$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC32861mla {
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> EZpvd;
        public final /* synthetic */ Ref.ObjectRef<Job> OLrzqt;
        public final /* synthetic */ AtomicBoolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC32861mla
        public void EZpvd(AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(amplitudeName, "");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(AtomicBoolean atomicBoolean, Ref.ObjectRef<Job> objectRef, Function1<? super java.lang.Boolean, Unit> function1) {
            this.copydefault = atomicBoolean;
            this.OLrzqt = objectRef;
            this.EZpvd = function1;
        }

        @Override // o.InterfaceC32861mla
        public void KWHzl(AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(amplitudeName, "");
            AmplitudeName amplitudeName2 = AmplitudeName.CEFI;
            if (amplitudeName == amplitudeName2 && this.copydefault.compareAndSet(false, true)) {
                Job job = this.OLrzqt.element;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
                }
                C32902mmO.KWHzl.EZpvd(this, amplitudeName2);
                pUU.KWHzl("ByteDanceABTestProvider", "refreshCefiFlagsWithLoginChange success");
                AbstractC58253yxm abstractC58253yxmOLrzqt = C58266yxz.OLrzqt();
                final Function1<java.lang.Boolean, Unit> function1 = this.EZpvd;
                abstractC58253yxmOLrzqt.scheduleDirect(new java.lang.Runnable() { // from class: o.mmT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C32902mmO.StateListAnimator.copydefault(function1);
                    }
                });
            }
        }

        public static final void copydefault(Function1 function1) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
    }
}
