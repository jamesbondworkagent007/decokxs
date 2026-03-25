package o;

import com.amplitude.common.Logger;
import com.amplitude.core.Amplitude$build$built$1;
import com.amplitude.core.Amplitude$setDeviceId$1;
import com.amplitude.core.Amplitude$setUserId$1;
import com.amplitude.core.Storage;
import com.amplitude.core.platform.Plugin;
import com.amplitude.eventbridge.EventChannel;
import com.amplitude.id.IdentityUpdateType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.InterfaceC5256Ks;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class JZ {
    public final Deferred<java.lang.Boolean> AYXKKw;
    public MG AhwBna;
    public final Logger AkhnZx;
    public final CoroutineDispatcher DbNXlk;
    public final CoroutineDispatcher EZpvd;
    public final CoroutineScope OLrzqt;
    public final C5244Kg copydefault;
    public final KL djBIcL;
    public final C5241Kd ejfBZ;
    public final C5260Kw fJNWhG;
    public Storage fetchVPNInfo;
    public Storage gEmmrt;
    public final CoroutineDispatcher isConnected;
    public MJ valueOf;
    public final CoroutineDispatcher values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineScope AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher AuCTel() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Logger DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object KWHzl(@NotNull ME me2, @NotNull Continuation<? super Unit> continuation) {
        return EZpvd(this, me2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5244Kg djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5241Kd ejfBZ() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher fARcdN() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher fJNWhG() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Deferred<java.lang.Boolean> getNewProxyInstance() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5260Kw iwGUEr() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher valueOf() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KL values() {
        return this.djBIcL;
    }

    public JZ(@NotNull C5244Kg c5244Kg, @NotNull C5241Kd c5241Kd, @NotNull CoroutineScope coroutineScope, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull CoroutineDispatcher coroutineDispatcher3, @NotNull CoroutineDispatcher coroutineDispatcher4) {
        Intrinsics.checkNotNullParameter(c5244Kg, "");
        Intrinsics.checkNotNullParameter(c5241Kd, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher3, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher4, "");
        this.copydefault = c5244Kg;
        this.ejfBZ = c5241Kd;
        this.OLrzqt = coroutineScope;
        this.EZpvd = coroutineDispatcher;
        this.isConnected = coroutineDispatcher2;
        this.values = coroutineDispatcher3;
        this.DbNXlk = coroutineDispatcher4;
        this.djBIcL = new KL();
        if (!c5244Kg.OcIXYQ()) {
            throw new java.lang.IllegalArgumentException("invalid configuration".toString());
        }
        this.fJNWhG = AEQbTJ();
        this.AkhnZx = c5244Kg.AuCTel().getLogger(this);
        Deferred<java.lang.Boolean> deferredEZpvd = EZpvd();
        this.AYXKKw = deferredEZpvd;
        deferredEZpvd.start();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JZ(C5244Kg c5244Kg, C5241Kd c5241Kd, CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        CoroutineDispatcher coroutineDispatcherFrom;
        CoroutineDispatcher coroutineDispatcherFrom2;
        CoroutineDispatcher coroutineDispatcherFrom3;
        CoroutineDispatcher coroutineDispatcherFrom4;
        CoroutineScope CoroutineScope = (i & 4) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)) : coroutineScope;
        if ((i & 8) != 0) {
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
            Intrinsics.checkNotNullExpressionValue(executorServiceNewCachedThreadPool, "");
            coroutineDispatcherFrom = ExecutorsKt.from(executorServiceNewCachedThreadPool);
        } else {
            coroutineDispatcherFrom = coroutineDispatcher;
        }
        if ((i & 16) != 0) {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "");
            coroutineDispatcherFrom2 = ExecutorsKt.from(executorServiceNewSingleThreadExecutor);
        } else {
            coroutineDispatcherFrom2 = coroutineDispatcher2;
        }
        if ((i & 32) != 0) {
            ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor2, "");
            coroutineDispatcherFrom3 = ExecutorsKt.from(executorServiceNewSingleThreadExecutor2);
        } else {
            coroutineDispatcherFrom3 = coroutineDispatcher3;
        }
        if ((i & 64) != 0) {
            ExecutorService executorServiceNewSingleThreadExecutor3 = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor3, "");
            coroutineDispatcherFrom4 = ExecutorsKt.from(executorServiceNewSingleThreadExecutor3);
        } else {
            coroutineDispatcherFrom4 = coroutineDispatcher4;
        }
        this(c5244Kg, c5241Kd, CoroutineScope, coroutineDispatcherFrom, coroutineDispatcherFrom2, coroutineDispatcherFrom3, coroutineDispatcherFrom4);
    }

    public final Storage fIwbmz() {
        Storage storage = this.fetchVPNInfo;
        if (storage != null) {
            return storage;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final Storage fetchVPNInfo() {
        Storage storage = this.gEmmrt;
        if (storage != null) {
            return storage;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final MJ isConnected() {
        MJ mj = this.valueOf;
        if (mj != null) {
            return mj;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final MG AkhnZx() {
        MG mg = this.AhwBna;
        if (mg != null) {
            return mg;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JZ(@NotNull C5244Kg c5244Kg) {
        this(c5244Kg, new C5241Kd(), null, null, null, null, null, 124, null);
        Intrinsics.checkNotNullParameter(c5244Kg, "");
    }

    public C5260Kw AEQbTJ() {
        C5260Kw c5260Kw = new C5260Kw();
        c5260Kw.OLrzqt(this);
        return c5260Kw;
    }

    public ME OLrzqt() {
        java.lang.String strFetchVPNInfo = this.copydefault.fetchVPNInfo();
        java.lang.String strORxRYg = this.copydefault.ORxRYg();
        MM mmIsConnected = this.copydefault.isConnected();
        Logger logger = this.AkhnZx;
        return new ME(strFetchVPNInfo, strORxRYg, null, mmIsConnected, new java.io.File("/tmp/amplitude-identity/" + this.copydefault.fetchVPNInfo()), "amplitude-identity-" + this.copydefault.fetchVPNInfo(), logger, 4, null);
    }

    public final void AEQbTJ(@NotNull ME me2) {
        Intrinsics.checkNotNullParameter(me2, "");
        this.AhwBna = MG.Companion.EZpvd(me2);
        KH kh = new KH(this.ejfBZ);
        AkhnZx().KWHzl().copydefault(kh);
        if (AkhnZx().KWHzl().OLrzqt()) {
            kh.EZpvd(AkhnZx().KWHzl().KWHzl(), IdentityUpdateType.Initialized);
        }
    }

    public Deferred<java.lang.Boolean> EZpvd() {
        return BuildersKt.async(this.OLrzqt, this.EZpvd, CoroutineStart.LAZY, new Amplitude$build$built$1(this, this, null));
    }

    public static /* synthetic */ java.lang.Object EZpvd(JZ jz, ME me2, Continuation<? super Unit> continuation) {
        jz.AEQbTJ(me2);
        C5278Lo.Companion.OLrzqt(jz.copydefault.fetchVPNInfo()).KWHzl().AEQbTJ(EventChannel.EVENT, new KI(jz));
        jz.copydefault(jz.new Application());
        jz.copydefault(new KD());
        jz.copydefault(new KC());
        return Unit.INSTANCE;
    }

    public static final class Application extends KE {
        public Application() {
        }

        @Override // o.KE
        public void AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            JZ.this.KWHzl(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.JZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JZ track$default(JZ jz, C5242Ke c5242Ke, C5247Kj c5247Kj, yHO yho, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
        if ((i & 2) != 0) {
            c5247Kj = null;
        }
        if ((i & 4) != 0) {
            yho = null;
        }
        return jz.AEQbTJ(c5242Ke, c5247Kj, yho);
    }

    public final JZ AEQbTJ(@NotNull C5242Ke c5242Ke, C5247Kj c5247Kj, yHO<? super C5242Ke, ? super java.lang.Integer, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        if (c5247Kj != null) {
            c5242Ke.EZpvd(c5247Kj);
        }
        if (yho != null) {
            c5242Ke.AEQbTJ(yho);
        }
        OLrzqt(c5242Ke);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.JZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JZ track$default(JZ jz, java.lang.String str, java.util.Map map, C5247Kj c5247Kj, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            c5247Kj = null;
        }
        return jz.EZpvd(str, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map, c5247Kj);
    }

    public final JZ EZpvd(@NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, C5247Kj c5247Kj) {
        Intrinsics.checkNotNullParameter(str, "");
        C5242Ke c5242Ke = new C5242Ke();
        c5242Ke.OLrzqt(str);
        c5242Ke.AEQbTJ(map != null ? C56424yEw.isConnected(map) : null);
        if (c5247Kj != null) {
            c5242Ke.EZpvd(c5247Kj);
        }
        OLrzqt(c5242Ke);
        return this;
    }

    public static /* synthetic */ JZ identify$default(JZ jz, java.util.Map map, C5247Kj c5247Kj, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: identify");
        }
        if ((i & 2) != 0) {
            c5247Kj = null;
        }
        return jz.AEQbTJ((java.util.Map<java.lang.String, ? extends java.lang.Object>) map, c5247Kj);
    }

    public final JZ AEQbTJ(java.util.Map<java.lang.String, ? extends java.lang.Object> map, C5247Kj c5247Kj) {
        return OLrzqt(EZpvd(map), c5247Kj);
    }

    public static /* synthetic */ JZ identify$default(JZ jz, C5250Km c5250Km, C5247Kj c5247Kj, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: identify");
        }
        if ((i & 2) != 0) {
            c5247Kj = null;
        }
        return jz.OLrzqt(c5250Km, c5247Kj);
    }

    public final JZ OLrzqt(@NotNull C5250Km c5250Km, C5247Kj c5247Kj) {
        Intrinsics.checkNotNullParameter(c5250Km, "");
        C5249Kl c5249Kl = new C5249Kl();
        c5249Kl.EZpvd(c5250Km.EZpvd());
        if (c5247Kj != null) {
            c5249Kl.EZpvd(c5247Kj);
            java.lang.String strRcXXUw = c5247Kj.RcXXUw();
            if (strRcXXUw != null) {
                AEQbTJ(strRcXXUw);
            }
            java.lang.String strEjfBZ = c5247Kj.ejfBZ();
            if (strEjfBZ != null) {
                OLrzqt(strEjfBZ);
            }
        }
        OLrzqt(c5249Kl);
        return this;
    }

    public final JZ AEQbTJ(java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, this.EZpvd, null, new Amplitude$setUserId$1(this, str, null), 2, null);
        return this;
    }

    public final java.lang.String getFieldNames() {
        if (this.AhwBna != null) {
            return AkhnZx().KWHzl().KWHzl().EZpvd();
        }
        return null;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AkhnZx().KWHzl().EZpvd().AEQbTJ(str).AEQbTJ();
    }

    public final JZ OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, this.EZpvd, null, new Amplitude$setDeviceId$1(this, str, null), 2, null);
        return this;
    }

    public final java.lang.String AhwBna() {
        if (this.AhwBna != null) {
            return AkhnZx().KWHzl().KWHzl().OLrzqt();
        }
        return null;
    }

    public static /* synthetic */ JZ groupIdentify$default(JZ jz, java.lang.String str, java.lang.String str2, java.util.Map map, C5247Kj c5247Kj, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: groupIdentify");
        }
        if ((i & 8) != 0) {
            c5247Kj = null;
        }
        return jz.OLrzqt(str, str2, map, c5247Kj);
    }

    public final JZ OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map, C5247Kj c5247Kj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return KWHzl(str, str2, EZpvd(map), c5247Kj);
    }

    public static /* synthetic */ JZ groupIdentify$default(JZ jz, java.lang.String str, java.lang.String str2, C5250Km c5250Km, C5247Kj c5247Kj, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: groupIdentify");
        }
        if ((i & 8) != 0) {
            c5247Kj = null;
        }
        return jz.KWHzl(str, str2, c5250Km, c5247Kj);
    }

    public final JZ KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull C5250Km c5250Km, C5247Kj c5247Kj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c5250Km, "");
        C5248Kk c5248Kk = new C5248Kk();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str, str2);
        c5248Kk.copydefault(linkedHashMap);
        c5248Kk.OLrzqt(c5250Km.EZpvd());
        if (c5247Kj != null) {
            c5248Kk.EZpvd(c5247Kj);
        }
        OLrzqt(c5248Kk);
        return this;
    }

    public static /* synthetic */ JZ setGroup$default(JZ jz, java.lang.String str, java.lang.String str2, C5247Kj c5247Kj, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setGroup");
        }
        if ((i & 4) != 0) {
            c5247Kj = null;
        }
        return jz.OLrzqt(str, str2, c5247Kj);
    }

    public final JZ OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, C5247Kj c5247Kj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C5250Km c5250KmAEQbTJ = new C5250Km().AEQbTJ(str, str2);
        C5249Kl c5249Kl = new C5249Kl();
        c5249Kl.copydefault(C56424yEw.djBIcL(C56390yDp.OLrzqt(str, str2)));
        c5249Kl.EZpvd(c5250KmAEQbTJ.EZpvd());
        track$default(this, c5249Kl, c5247Kj, (yHO) null, 4, (java.lang.Object) null);
        return this;
    }

    public static /* synthetic */ JZ setGroup$default(JZ jz, java.lang.String str, java.lang.String[] strArr, C5247Kj c5247Kj, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setGroup");
        }
        if ((i & 4) != 0) {
            c5247Kj = null;
        }
        return jz.KWHzl(str, strArr, c5247Kj);
    }

    public final JZ KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String[] strArr, C5247Kj c5247Kj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        C5250Km c5250KmCopydefault = new C5250Km().copydefault(str, strArr);
        C5249Kl c5249Kl = new C5249Kl();
        c5249Kl.copydefault(C56424yEw.djBIcL(C56390yDp.OLrzqt(str, strArr)));
        c5249Kl.EZpvd(c5250KmCopydefault.EZpvd());
        track$default(this, c5249Kl, c5247Kj, (yHO) null, 4, (java.lang.Object) null);
        return this;
    }

    public static /* synthetic */ JZ revenue$default(JZ jz, C5254Kq c5254Kq, C5247Kj c5247Kj, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: revenue");
        }
        if ((i & 2) != 0) {
            c5247Kj = null;
        }
        return jz.AEQbTJ(c5254Kq, c5247Kj);
    }

    public final JZ AEQbTJ(@NotNull C5254Kq c5254Kq, C5247Kj c5247Kj) {
        Intrinsics.checkNotNullParameter(c5254Kq, "");
        if (!c5254Kq.copydefault()) {
            this.AkhnZx.KWHzl("Invalid revenue object, missing required fields");
            return this;
        }
        C5251Kn c5251KnAEQbTJ = c5254Kq.AEQbTJ();
        if (c5247Kj != null) {
            c5251KnAEQbTJ.EZpvd(c5247Kj);
        }
        EZpvd(c5251KnAEQbTJ);
        return this;
    }

    public final JZ EZpvd(@NotNull C5251Kn c5251Kn) {
        Intrinsics.checkNotNullParameter(c5251Kn, "");
        OLrzqt(c5251Kn);
        return this;
    }

    public final void OLrzqt(C5242Ke c5242Ke) {
        if (this.copydefault.hDKMBd()) {
            this.AkhnZx.AEQbTJ("Skip event for opt out config.");
            return;
        }
        if (c5242Ke.RJOkX() == null) {
            c5242Ke.copydefault(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        this.AkhnZx.OLrzqt("Logged event with type: " + c5242Ke.copydefault());
        this.fJNWhG.copydefault(c5242Ke);
    }

    public final JZ copydefault(@NotNull com.amplitude.core.platform.Plugin plugin) {
        Intrinsics.checkNotNullParameter(plugin, "");
        if (plugin instanceof AbstractC5258Ku) {
            this.ejfBZ.EZpvd((AbstractC5258Ku) plugin, this);
        } else {
            this.fJNWhG.KWHzl(plugin);
        }
        return this;
    }

    public final void gEmmrt() {
        this.fJNWhG.copydefault(new Function1<com.amplitude.core.platform.Plugin, Unit>() { // from class: com.amplitude.core.Amplitude$flush$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Plugin plugin) {
                invoke2(plugin);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Plugin plugin) {
                Intrinsics.checkNotNullParameter(plugin, "");
                InterfaceC5256Ks interfaceC5256Ks = plugin instanceof InterfaceC5256Ks ? (InterfaceC5256Ks) plugin : null;
                if (interfaceC5256Ks != null) {
                    interfaceC5256Ks.KWHzl();
                }
            }
        });
    }

    public final C5250Km EZpvd(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        C5250Km c5250Km = new C5250Km();
        if (map != null) {
            for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                java.lang.Object value = entry.getValue();
                if (value != null) {
                    c5250Km.OLrzqt(entry.getKey(), value);
                }
            }
        }
        return c5250Km;
    }
}
