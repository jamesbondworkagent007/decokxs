package com.okinc.components.track.common.whitelist;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParam$$serializer;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.components.track.common.whitelist.RemoteInterceptor;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC56429yFa;
import o.C32867mlg;
import o.C32900mmM;
import o.C56424yEw;
import o.InterfaceC32874mln;
import o.InterfaceC32889mmB;
import o.InterfaceC32892mmE;
import o.InterfaceC32904mmQ;
import o.InterfaceC32938mmy;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RemoteInterceptor implements InterfaceC32904mmQ, InterfaceC32892mmE, InterfaceC32889mmB {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final Mutex AEQbTJ;
    public InterfaceC32938mmy AYXKKw;
    public final AtomicBoolean EZpvd;
    public final TrackChannel KWHzl;
    public final CoroutineScope OLrzqt;
    public Map<String, String> djBIcL;
    public final File gEmmrt;
    public final InterfaceC32874mln valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32889mmB
    public void AEQbTJ(@NotNull InterfaceC32938mmy interfaceC32938mmy) {
        Intrinsics.checkNotNullParameter(interfaceC32938mmy, "");
        this.AYXKKw = interfaceC32938mmy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32889mmB
    public void KWHzl() {
        this.AYXKKw = null;
    }

    public final void OLrzqt(Function0<String> function0) {
    }

    public RemoteInterceptor(@NotNull String str, @NotNull InterfaceC32874mln interfaceC32874mln, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC32874mln, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.valueOf = interfaceC32874mln;
        TrackChannel trackChannelFJNWhG = interfaceC32874mln.fJNWhG();
        this.KWHzl = trackChannelFJNWhG;
        this.EZpvd = new AtomicBoolean(false);
        this.djBIcL = C56424yEw.KWHzl();
        this.gEmmrt = new File(str, trackChannelFJNWhG.getLowerTrackerName() + ".record");
        this.AEQbTJ = MutexKt.Mutex$default(false, 1, null);
        this.OLrzqt = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatcher).plus(new ActionBar(CoroutineExceptionHandler.Key)));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 o.mln)
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getIO():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:37)) : (r3v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(java.lang.String, o.mln, kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:34) call: com.okinc.components.track.common.whitelist.RemoteInterceptor.<init>(java.lang.String, o.mln, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ RemoteInterceptor(String str, InterfaceC32874mln interfaceC32874mln, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC32874mln, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.track.common.whitelist.RemoteInterceptor.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final class ActionBar extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public ActionBar(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
            pUU.copydefault("RemoteInterceptor", "CoroutineExceptionHandler", th);
        }
    }

    public final Job OLrzqt(ReportCache reportCache) {
        return BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, null, null, new RemoteInterceptor$addWaitForReport$1(this, reportCache, null), 3, null);
    }

    @Override // o.InterfaceC32892mmE
    public void copydefault(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.djBIcL = map;
        this.valueOf.AEQbTJ(map);
        this.EZpvd.set(true);
        copydefault();
    }

    public final Job copydefault() {
        return BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, null, null, new RemoteInterceptor$reportCachedEvents$1(this, null), 3, null);
    }

    public final void EZpvd(ReportCache reportCache) {
        final String strAEQbTJ = reportCache.AEQbTJ();
        final Map<String, String> mapOLrzqt = reportCache.OLrzqt();
        List<EventParam> listCopydefault = reportCache.copydefault();
        final EventParamsList eventParamsList = listCopydefault != null ? new EventParamsList(listCopydefault) : null;
        OLrzqt(new Function0() { // from class: o.mmG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RemoteInterceptor.OLrzqt(this.KWHzl, strAEQbTJ, mapOLrzqt, eventParamsList);
            }
        });
        if (reportCache.AYXKKw() != null) {
            this.valueOf.copydefault(reportCache.EZpvd(), reportCache.AYXKKw());
        } else if (reportCache.AhwBna() != null) {
            this.valueOf.copydefault(reportCache.EZpvd(), new EventParamsList(reportCache.AhwBna()));
        } else {
            this.valueOf.onEvent(reportCache.EZpvd());
        }
        AEQbTJ(true, strAEQbTJ, mapOLrzqt, eventParamsList, this.valueOf.fJNWhG());
    }

    public static final String OLrzqt(RemoteInterceptor remoteInterceptor, String str, Map map, EventParamsList eventParamsList) {
        return remoteInterceptor.KWHzl.name() + ": whitelist [" + str + "]\n[" + map + "]\n[" + eventParamsList + "]";
    }

    @Override // o.InterfaceC32904mmQ
    public void AEQbTJ(@NotNull InterfaceC32904mmQ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        TrackChannel trackChannelFJNWhG = stateListAnimator.OLrzqt().fJNWhG();
        C32900mmM c32900mmMKWHzl = stateListAnimator.KWHzl();
        if (trackChannelFJNWhG != this.KWHzl) {
            stateListAnimator.AEQbTJ(c32900mmMKWHzl);
            return;
        }
        String strOLrzqt = c32900mmMKWHzl.OLrzqt();
        EventParamsList eventParamsListAEQbTJ = c32900mmMKWHzl.AEQbTJ();
        Map<String, String> mapKWHzl = c32900mmMKWHzl.KWHzl();
        boolean z = this.EZpvd.get();
        if (!z) {
            OLrzqt(new ReportCache(strOLrzqt, mapKWHzl, eventParamsListAEQbTJ));
        } else if (this.djBIcL.containsKey(strOLrzqt)) {
            stateListAnimator.AEQbTJ(c32900mmMKWHzl);
        }
        AEQbTJ(z, strOLrzqt, mapKWHzl, eventParamsListAEQbTJ, trackChannelFJNWhG);
    }

    public final void AEQbTJ(boolean z, final String str, final Map<String, String> map, EventParamsList eventParamsList, final TrackChannel trackChannel) {
        InterfaceC32938mmy interfaceC32938mmy = this.AYXKKw;
        if (interfaceC32938mmy == null) {
            return;
        }
        if (map == null) {
            map = eventParamsList != null ? C32867mlg.KWHzl.AEQbTJ(eventParamsList) : null;
            if (map == null) {
                map = C56424yEw.KWHzl();
            }
        }
        try {
            if (!z) {
                OLrzqt(new Function0() { // from class: o.mmC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return RemoteInterceptor.OLrzqt(trackChannel, str, map);
                    }
                });
                interfaceC32938mmy.AEQbTJ(trackChannel.name(), KWHzl(str), str, map);
            } else if (this.djBIcL.containsKey(str)) {
                OLrzqt(new Function0() { // from class: o.mmF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return RemoteInterceptor.AEQbTJ(trackChannel, str, map);
                    }
                });
                interfaceC32938mmy.copydefault(trackChannel.name(), KWHzl(str), str, map);
            } else {
                OLrzqt(new Function0() { // from class: o.mmD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return RemoteInterceptor.AhwBna(trackChannel, str, map);
                    }
                });
                interfaceC32938mmy.EZpvd(trackChannel.name(), KWHzl(str), str, map);
            }
        } catch (Exception e) {
            pUU.copydefault("RemoteInterceptor", "Exception", e);
        }
    }

    public static final String OLrzqt(TrackChannel trackChannel, String str, Map map) {
        return trackChannel + ": record [" + str + "]\n[" + map + "]";
    }

    public static final String AEQbTJ(TrackChannel trackChannel, String str, Map map) {
        return trackChannel + ": whitelist [" + str + "]\n[" + map + "]";
    }

    public static final String AhwBna(TrackChannel trackChannel, String str, Map map) {
        return trackChannel + ": intercept [" + str + "]\n[" + map + "]";
    }

    public final String KWHzl(String str) {
        String str2 = this.djBIcL.get(str);
        return str2 == null ? "" : str2;
    }

    @Serializable
    public static final class ReportCache {
        public static final KSerializer<Object>[] $childSerializers;
        public final String event;
        public final List<EventParam> list;
        public final Map<String, String> map;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.components.track.common.whitelist.RemoteInterceptor$ReportCache */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ReportCache copy$default(ReportCache reportCache, String str, Map map, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reportCache.event;
            }
            if ((i & 2) != 0) {
                map = reportCache.map;
            }
            if ((i & 4) != 0) {
                list = reportCache.list;
            }
            return reportCache.AEQbTJ(str, map, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ReportCache AEQbTJ(@NotNull String str, Map<String, String> map, List<EventParam> list) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ReportCache(str, map, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.event;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> AYXKKw() {
            return this.map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<EventParam> AhwBna() {
            return this.list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.event;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> OLrzqt() {
            return this.map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<EventParam> copydefault() {
            return this.list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReportCache)) {
                return false;
            }
            ReportCache reportCache = (ReportCache) obj;
            return Intrinsics.EZpvd((Object) this.event, (Object) reportCache.event) && Intrinsics.EZpvd(this.map, reportCache.map) && Intrinsics.EZpvd(this.list, reportCache.list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.event.hashCode();
            Map<String, String> map = this.map;
            int iHashCode2 = map == null ? 0 : map.hashCode();
            List<EventParam> list = this.list;
            return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ReportCache(event=" + this.event + ", map=" + this.map + ", list=" + this.list + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.track.common.whitelist.RemoteInterceptor.ReportCache.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ReportCache> serializer() {
                return RemoteInterceptor$ReportCache$$serializer.INSTANCE;
            }
        }

        static {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            $childSerializers = new KSerializer[]{null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), new ArrayListSerializer(EventParam$$serializer.INSTANCE)};
        }

        public /* synthetic */ ReportCache(int i, String str, Map map, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, RemoteInterceptor$ReportCache$$serializer.INSTANCE.getDescriptor());
            }
            this.event = str;
            if ((i & 2) == 0) {
                this.map = null;
            } else {
                this.map = map;
            }
            if ((i & 4) == 0) {
                this.list = null;
            } else {
                this.list = list;
            }
        }

        public static final /* synthetic */ void OLrzqt(ReportCache reportCache, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 0, reportCache.event);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || reportCache.map != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], reportCache.map);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && reportCache.list == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], reportCache.list);
        }

        public ReportCache(@NotNull String str, Map<String, String> map, List<EventParam> list) {
            Intrinsics.checkNotNullParameter(str, "");
            this.event = str;
            this.map = map;
            this.list = list;
        }
    }
}
