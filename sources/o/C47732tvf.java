package o;

import com.okinc.okapm.okqpl.util.QPLConstants;
import com.okinc.planet.biz_content.plugin.framework.PlanetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1;
import com.okinc.planet.domain.remote.dto.PublishPermissionResp;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tvf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47732tvf {
    public boolean copydefault;
    public final java.util.List<tWX> EZpvd = new java.util.ArrayList();
    public final CoroutineScope AEQbTJ = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
    public final Mutex OLrzqt = MutexKt.Mutex$default(false, 1, null);

    public final void copydefault(@NotNull tWX twx) {
        Intrinsics.checkNotNullParameter(twx, "");
        pUU.EZpvd("PlanetPluginManager", "Registering plugin type: " + twx.EZpvd().getValue());
        java.util.Iterator<tWX> it = this.EZpvd.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().EZpvd() == twx.EZpvd()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            pUU.valueOf("PlanetPluginManager", "Plugin type " + twx.EZpvd().getValue() + " already registered. Replacing with new plugin.");
            this.EZpvd.set(i, twx);
            return;
        }
        this.EZpvd.add(twx);
        pUU.KWHzl("PlanetPluginManager", "Plugin registered successfully. Total plugins: " + this.EZpvd.size());
    }

    public static /* synthetic */ java.util.List getAllPlugins$default(C47732tvf c47732tvf, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c47732tvf.OLrzqt(z);
    }

    public final java.util.List<tWX> OLrzqt(boolean z) {
        pUU.EZpvd("PlanetPluginManager", "Getting all registered plugins. Count: " + this.EZpvd.size() + ", testMode: " + z);
        java.util.List<tWX> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.EZpvd);
        if (z) {
            return listAxsJAYsNCnLh;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAxsJAYsNCnLh) {
            Intrinsics.checkNotNullExpressionValue(((tWX) obj).EZpvd().getValue().toLowerCase(java.util.Locale.ROOT), "");
            if (!C59449zhJ.startsWith$default(r2, QPLConstants.ENV_DEBUG, false, 2, null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final tWX copydefault(@NotNull PlanetPublisherPluginType planetPublisherPluginType) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        java.util.Iterator<T> it = this.EZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((tWX) next).EZpvd() == planetPublisherPluginType) {
                break;
            }
        }
        tWX twx = (tWX) next;
        pUU.EZpvd("PlanetPluginManager", "Getting plugin by type: " + planetPublisherPluginType.getValue() + ", found: " + (twx != null));
        return twx;
    }

    public final boolean OLrzqt(@NotNull PlanetPublisherPluginType planetPublisherPluginType) {
        java.util.List<java.lang.String> pluginConfig;
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        tWX twxCopydefault = copydefault(planetPublisherPluginType);
        boolean zAEQbTJ = twxCopydefault != null ? twxCopydefault.AEQbTJ() : false;
        PublishPermissionResp publishPermissionRespKWHzl = C46388tSm.Companion.KWHzl().KWHzl();
        boolean z = (publishPermissionRespKWHzl == null || (pluginConfig = publishPermissionRespKWHzl.getPluginConfig()) == null || !pluginConfig.contains(planetPublisherPluginType.getValue())) ? false : true;
        pUU.EZpvd("PlanetPluginManager", "Checking share to feed support for type: " + planetPublisherPluginType.getValue() + ", result: " + zAEQbTJ);
        return zAEQbTJ && z;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0040 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x00ea */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x0025 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d A[Catch: all -> 0x003d, Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:13:0x0033, B:36:0x0097, B:38:0x009d, B:39:0x00a5, B:41:0x00ab, B:43:0x00b1), top: B:55:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5 A[Catch: all -> 0x003d, Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:13:0x0033, B:36:0x0097, B:38:0x009d, B:39:0x00a5, B:41:0x00ab, B:43:0x00b1), top: B:55:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PlanetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1 planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1;
        java.lang.Throwable th;
        ?? r10;
        C47732tvf c47732tvf;
        ?? r1;
        java.lang.Exception e;
        java.lang.Object objAEQbTJ;
        ?? r12;
        java.lang.Object objM7386unboximpl;
        C47732tvf c47732tvf2;
        if (continuation instanceof PlanetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1) {
            planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1 = (PlanetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1) continuation;
            int i = planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1.label = i - Integer.MIN_VALUE;
            } else {
                planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1 = new PlanetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1(this, continuation);
            }
        }
        java.lang.Object obj = planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1.result;
        ?? Copydefault = C56442yFn.copydefault();
        int i2 = planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1.label;
        try {
        } catch (java.lang.Throwable th2) {
            th = th2;
            r10 = Copydefault;
        }
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Mutex mutex = this.OLrzqt;
                planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1.L$0 = this;
                planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1.L$1 = mutex;
                planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1.label = 1;
                if (mutex.lock(null, planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1) == Copydefault) {
                    return Copydefault;
                }
                c47732tvf = this;
                r10 = mutex;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r1 = (Mutex) planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1.L$1;
                    c47732tvf2 = (C47732tvf) planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        objM7386unboximpl = ((Result) obj).m7386unboximpl();
                        r12 = r1;
                        if (!Result.m7384isSuccessimpl(objM7386unboximpl)) {
                            c47732tvf2.copydefault = true;
                            pUU.KWHzl("PlanetPluginManager", "TradeCoreManager initialized successfully");
                            Copydefault = r12;
                        } else {
                            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                            pUU.valueOf("PlanetPluginManager", "TradeCoreManager initialization failed: " + (thM7380exceptionOrNullimpl != null ? thM7380exceptionOrNullimpl.getMessage() : null));
                            Copydefault = r12;
                        }
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        pUU.AEQbTJ("PlanetPluginManager", "Error initializing TradeCoreManager: " + e.getMessage(), e);
                        Copydefault = r1;
                    }
                    Unit unit = Unit.INSTANCE;
                    Copydefault.unlock(null);
                    return unit;
                }
                Mutex mutex2 = (Mutex) planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1.L$1;
                c47732tvf = (C47732tvf) planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1.L$0;
                C56391yDq.AEQbTJ(obj);
                r10 = mutex2;
            }
            if (c47732tvf.copydefault) {
                pUU.EZpvd("PlanetPluginManager", "TradeCoreManager already initialized (double-check)");
                Unit unit2 = Unit.INSTANCE;
                r10.unlock(null);
                return unit2;
            }
            pUU.KWHzl("PlanetPluginManager", "Initializing TradeCoreManager for trading plugins");
            try {
                C54588xNy c54588xNy = new C54588xNy();
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1.L$0 = c47732tvf;
                planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1.L$1 = r10;
                planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1.label = 2;
                objAEQbTJ = c54589xNz.AEQbTJ(false, c54588xNy, planetPluginRegisterManager$initializeTradeCoreManagerWithMutex$1);
            } catch (java.lang.Exception e3) {
                r1 = r10;
                e = e3;
                pUU.AEQbTJ("PlanetPluginManager", "Error initializing TradeCoreManager: " + e.getMessage(), e);
                Copydefault = r1;
            }
            if (objAEQbTJ == Copydefault) {
                return Copydefault;
            }
            r12 = r10;
            objM7386unboximpl = objAEQbTJ;
            c47732tvf2 = c47732tvf;
            if (!Result.m7384isSuccessimpl(objM7386unboximpl)) {
            }
            Unit unit3 = Unit.INSTANCE;
            Copydefault.unlock(null);
            return unit3;
        } catch (java.lang.Throwable th3) {
            th = th3;
            r10.unlock(null);
            throw th;
        }
    }
}
