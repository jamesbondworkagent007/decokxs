package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import com.okinc.lib.internal.monitor.memory.leak.LeakDetectorImpl$AppCallbacks$onTrimMemory$1;
import com.okinc.lib.internal.monitor.memory.leak.LeakDetectorImpl$AppCallbacks$onTrimMemory$2;
import com.okinc.lib.internal.monitor.memory.leak.LeakDetectorImpl$AppCallbacks$onTrimMemory$3;
import com.okinc.lib.internal.monitor.memory.leak.LeakDetectorImpl$activityCallbacks$1;
import com.okinc.lib.internal.monitor.memory.leak.LeakDetectorImpl$startProcessingCoroutines$1;
import com.okinc.lib.monitor.memory.LeakCertainty;
import com.okinc.lib.monitor.memory.LeakLifecycleObserver;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C38030pJq;
import o.InterfaceC38044pKd;
import o.pJX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pJq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38030pJq implements pJX {
    public final pJX.StateListAnimator AEQbTJ;
    public final CoroutineDispatcher AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final ReferenceQueue<java.lang.Object> AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final CopyOnWriteArraySet<pJX.Application> EZpvd;
    public final android.app.Application KWHzl;
    public final ActionBar OLrzqt;
    public final pJB copydefault;
    public long djBIcL;
    public final CoroutineScope ejfBZ;
    public final ConcurrentHashMap<java.lang.String, C38037pJx> fARcdN;
    public final ConcurrentHashMap<java.lang.String, java.lang.Long> fetchVPNInfo;
    public float gEmmrt;
    public final long isConnected;
    public boolean valueOf;
    public Job values;

    /* JADX INFO: renamed from: o.pJq$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LeakCertainty.values().length];
            try {
                iArr[LeakCertainty.LOW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LeakCertainty.HIGH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public C38030pJq(@NotNull android.app.Application application, @NotNull pJX.StateListAnimator stateListAnimator, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.KWHzl = application;
        this.AEQbTJ = stateListAnimator;
        this.AYXKKw = coroutineDispatcher;
        this.ejfBZ = coroutineScope;
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.pJu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38030pJq.KWHzl();
            }
        });
        this.fARcdN = new ConcurrentHashMap<>();
        this.EZpvd = new CopyOnWriteArraySet<>();
        this.AkhnZx = new ReferenceQueue<>();
        this.fetchVPNInfo = new ConcurrentHashMap<>();
        this.OLrzqt = new ActionBar();
        this.copydefault = new pJB(new LeakDetectorImpl$activityCallbacks$1(this), null, 2, null);
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.pJt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(C38030pJq.djBIcL(this.KWHzl));
            }
        });
        this.isConnected = 15000L;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r1v0 android.app.Application)
  (r2v0 o.pJX$StateListAnimator)
  (r3v0 kotlinx.coroutines.CoroutineDispatcher)
  (wrap:kotlinx.coroutines.CoroutineScope:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineScope:0x000e: INVOKE 
  (wrap:kotlin.coroutines.CoroutineContext:0x000a: INVOKE 
  (wrap:kotlinx.coroutines.CompletableJob:0x0006: INVOKE 
  (wrap:kotlinx.coroutines.Job:?: CAST (kotlinx.coroutines.Job) (null kotlinx.coroutines.Job))
  (1 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
 STATIC call: kotlinx.coroutines.SupervisorKt.SupervisorJob$default(kotlinx.coroutines.Job, int, java.lang.Object):kotlinx.coroutines.CompletableJob A[MD:(kotlinx.coroutines.Job, int, java.lang.Object):kotlinx.coroutines.CompletableJob (m), WRAPPED] (LINE:46))
  (r3v0 kotlinx.coroutines.CoroutineDispatcher)
 INTERFACE call: kotlin.coroutines.CoroutineContext.plus(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext A[MD:(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext (m), WRAPPED] (LINE:46))
 STATIC call: kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlin.coroutines.CoroutineContext):kotlinx.coroutines.CoroutineScope A[MD:(kotlin.coroutines.CoroutineContext):kotlinx.coroutines.CoroutineScope (m), WRAPPED] (LINE:46)) : (r4v0 kotlinx.coroutines.CoroutineScope))
 A[MD:(android.app.Application, o.pJX$StateListAnimator, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineScope):void (m)] (LINE:42) call: o.pJq.<init>(android.app.Application, o.pJX$StateListAnimator, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineScope):void type: THIS */
    public /* synthetic */ C38030pJq(android.app.Application application, pJX.StateListAnimator stateListAnimator, CoroutineDispatcher coroutineDispatcher, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, stateListAnimator, coroutineDispatcher, (i & 8) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher)) : coroutineScope);
    }

    public static final android.os.Handler KWHzl() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final android.os.Handler valueOf() {
        return (android.os.Handler) this.DbNXlk.getValue();
    }

    public static final float djBIcL(C38030pJq c38030pJq) {
        return c38030pJq.copydefault();
    }

    public final float EZpvd() {
        return ((java.lang.Number) this.AhwBna.getValue()).floatValue();
    }

    @Override // o.pJX
    public pJX KWHzl(@NotNull pJX.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.EZpvd.add(application);
        return this;
    }

    @Override // o.pJX
    public void AhwBna() {
        if (CoroutineScopeKt.isActive(this.ejfBZ) && this.AEQbTJ.djBIcL()) {
            if (!this.valueOf) {
                this.KWHzl.registerComponentCallbacks(this.OLrzqt);
                this.KWHzl.registerActivityLifecycleCallbacks(this.copydefault);
                this.valueOf = true;
            }
            this.gEmmrt = EZpvd();
            isConnected();
            pUU.KWHzl("Monitor.Leak", "Leak | Start memory ratio: " + ((int) (EZpvd() * 100)) + "%");
        }
    }

    public void fetchVPNInfo() {
        Job job = this.values;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.values = null;
        OLrzqt();
        this.fARcdN.clear();
        this.EZpvd.clear();
        this.fetchVPNInfo.clear();
        pUU.KWHzl("Monitor.Leak", "Leak | Stop at memory ratio: " + ((int) (copydefault() * 100)) + "%");
        CoroutineScopeKt.cancel$default(this.ejfBZ, null, 1, null);
    }

    @Override // o.pJX
    public void KWHzl(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        if (this.AEQbTJ.djBIcL() && OLrzqt(obj)) {
            if (djBIcL()) {
                fetchVPNInfo();
                return;
            }
            java.lang.String name = obj.getClass().getName();
            java.lang.String str = name + "@" + java.lang.System.identityHashCode(obj);
            Intrinsics.copydefault((java.lang.Object) name);
            if (KWHzl(str, name)) {
                return;
            }
            this.fARcdN.put(str, new C38037pJx(new C38039pJz(obj, this.AkhnZx, str), name, java.lang.System.currentTimeMillis(), LeakCertainty.LOW));
            this.fetchVPNInfo.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + this.AEQbTJ.AhwBna()));
        }
    }

    public final void isConnected() {
        Job job = this.values;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.values = BuildersKt__Builders_commonKt.launch$default(this.ejfBZ, null, null, new LeakDetectorImpl$startProcessingCoroutines$1(this, null), 3, null);
    }

    public final boolean gEmmrt() {
        Reference<? extends java.lang.Object> referencePoll = this.AkhnZx.poll();
        int i = 0;
        while (referencePoll != null && i < 30) {
            if (referencePoll instanceof C38039pJz) {
                C38039pJz c38039pJz = (C38039pJz) referencePoll;
                this.fARcdN.remove(c38039pJz.EZpvd());
                this.fetchVPNInfo.remove(c38039pJz.EZpvd());
            }
            referencePoll = this.AkhnZx.poll();
            i++;
        }
        return i > 0;
    }

    public final void AYXKKw() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        java.util.Set<Map.Entry<java.lang.String, java.lang.Long>> setEntrySet = this.fetchVPNInfo.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Intrinsics.copydefault(entry);
            java.lang.Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            java.lang.String str = (java.lang.String) key;
            java.lang.Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (jCurrentTimeMillis >= ((java.lang.Long) value).longValue()) {
                arrayList.add(str);
            }
        }
        for (java.lang.String str2 : arrayList) {
            this.fetchVPNInfo.remove(str2);
            C38037pJx c38037pJx = this.fARcdN.get(str2);
            if (c38037pJx != null) {
                int i = Activity.EZpvd[c38037pJx.AEQbTJ().ordinal()];
                if (i == 1) {
                    c38037pJx.OLrzqt(LeakCertainty.HIGH);
                    this.fetchVPNInfo.put(str2, java.lang.Long.valueOf(this.AEQbTJ.AEQbTJ() + jCurrentTimeMillis));
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.fARcdN.remove(str2);
                    java.lang.String strEZpvd = c38037pJx.EZpvd();
                    pUU.KWHzl("Monitor.Leak", "Leak | Detected --> " + strEZpvd);
                    EZpvd(strEZpvd, str2);
                }
            }
        }
    }

    public final boolean djBIcL() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis - this.djBIcL > this.isConnected) {
            this.gEmmrt = copydefault();
            this.djBIcL = jCurrentTimeMillis;
        }
        return this.gEmmrt > EZpvd() + this.AEQbTJ.OLrzqt();
    }

    public final float copydefault() {
        return (r0.totalMemory() - r0.freeMemory()) / java.lang.Runtime.getRuntime().maxMemory();
    }

    public final boolean KWHzl(java.lang.String str, java.lang.String str2) {
        boolean z;
        java.util.Collection<C38037pJx> collectionValues = this.fARcdN.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.Collection<C38037pJx> collection = collectionValues;
        if (collection.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((C38037pJx) it.next()).EZpvd(), (java.lang.Object) str2)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (this.fARcdN.containsKey(str) || z) {
            return true;
        }
        if (this.fARcdN.size() >= this.AEQbTJ.EZpvd()) {
            pUU.KWHzl("Monitor.Leak", "Leak | Max objects reached, clearing oldest");
            clearOldestEntries$default(this, 0, 1, null);
        }
        return false;
    }

    public final boolean OLrzqt(java.lang.Object obj) {
        java.lang.String name = obj.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        if (!C59449zhJ.startsWith$default(name, "com.okinc.", false, 2, null)) {
            return false;
        }
        java.lang.String name2 = obj.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "");
        if (C59449zhJ.startsWith$default(name2, "com.okinc.debugbox.", false, 2, null)) {
            return false;
        }
        java.lang.String name3 = obj.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name3, "");
        return !C59449zhJ.startsWith$default(name3, "com.okinc.okdebugger.", false, 2, null);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        InterfaceC38044pKd.ActionBar actionBar = new InterfaceC38044pKd.ActionBar(str2, C56424yEw.gEmmrt(C56390yDp.OLrzqt("path", str), C56390yDp.OLrzqt("type", VerifyDAppDomainUrlResponse.LEVEL_HIGH), C56390yDp.OLrzqt("attr_2", java.lang.String.valueOf(this.gEmmrt))));
        java.util.Iterator<T> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            ((pJX.Application) it.next()).copydefault(actionBar);
        }
    }

    public static /* synthetic */ void clearOldestEntries$default(C38030pJq c38030pJq, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c38030pJq.AEQbTJ.EZpvd() / 4;
        }
        c38030pJq.EZpvd(i);
    }

    public final void EZpvd(int i) {
        if (i > 0 && !this.fARcdN.isEmpty()) {
            int iMin = java.lang.Math.min(this.fARcdN.size(), java.lang.Math.min(i, 64));
            java.util.Iterator<java.lang.String> it = this.fARcdN.keySet().iterator();
            for (int i2 = 0; it.hasNext() && i2 < iMin; i2++) {
                java.lang.String next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                java.lang.String str = next;
                this.fARcdN.remove(str);
                this.fetchVPNInfo.remove(str);
            }
        }
    }

    public final void KWHzl(@NotNull final android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof LifecycleOwner) {
            valueOf().post(new java.lang.Runnable() { // from class: o.pJr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C38030pJq.AEQbTJ(activity);
                }
            });
        }
        if (this.AEQbTJ.AYXKKw() && (activity instanceof FragmentActivity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new StateListAnimator(), true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(android.app.Activity activity) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
        if (lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycleOwner.getLifecycle().addObserver(new LeakLifecycleObserver(activity));
        }
    }

    /* JADX INFO: renamed from: o.pJq$StateListAnimator */
    public static final class StateListAnimator extends FragmentManager.FragmentLifecycleCallbacks {
        public StateListAnimator() {
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentCreated(androidx.fragment.app.FragmentManager fragmentManager, final androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            C38030pJq.this.valueOf().post(new java.lang.Runnable() { // from class: o.pJy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C38030pJq.StateListAnimator.OLrzqt(fragment);
                }
            });
        }

        public static final void OLrzqt(androidx.fragment.app.Fragment fragment) {
            if (fragment.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                fragment.getLifecycle().addObserver(new LeakLifecycleObserver(fragment));
            }
        }
    }

    public final void OLrzqt() {
        if (this.valueOf) {
            try {
                this.KWHzl.unregisterComponentCallbacks(this.OLrzqt);
                this.KWHzl.unregisterActivityLifecycleCallbacks(this.copydefault);
                this.valueOf = false;
            } catch (java.lang.Exception e) {
                pUU.KWHzl("Monitor.Leak", "Error unregistering application callbacks: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: o.pJq$ActionBar */
    public final class ActionBar implements android.content.ComponentCallbacks2 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "");
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            if (i >= 60) {
                BuildersKt__Builders_commonKt.launch$default(C38030pJq.this.ejfBZ, null, null, new LeakDetectorImpl$AppCallbacks$onTrimMemory$1(C38030pJq.this, null), 3, null);
            } else if (i >= 40) {
                BuildersKt__Builders_commonKt.launch$default(C38030pJq.this.ejfBZ, null, null, new LeakDetectorImpl$AppCallbacks$onTrimMemory$2(C38030pJq.this, null), 3, null);
            } else if (i >= 10) {
                BuildersKt__Builders_commonKt.launch$default(C38030pJq.this.ejfBZ, null, null, new LeakDetectorImpl$AppCallbacks$onTrimMemory$3(C38030pJq.this, null), 3, null);
            }
        }
    }
}
