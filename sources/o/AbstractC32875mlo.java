package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.components.track.common.whitelist.RemoteInterceptor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mlo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC32875mlo extends AbstractC32806mkY {
    public ConcurrentHashMap<java.lang.String, InterfaceC32874mln> DbNXlk;
    public final CopyOnWriteArrayList<InterfaceC32904mmQ> djBIcL;
    public final CopyOnWriteArrayList<InterfaceC32904mmQ> fetchVPNInfo;
    public final C32931mmr gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public final CopyOnWriteArraySet<InterfaceC32870mlj> values;
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC32875mlo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC32904mmQ> values() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:o.yDm:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yDm:0x0009: INVOKE 
  (wrap:kotlin.jvm.functions.Function0:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:20) call: o.mlt.<init>():void type: CONSTRUCTOR)
 STATIC call: o.yDr.copydefault(kotlin.jvm.functions.Function0):o.yDm A[MD:<T>:(kotlin.jvm.functions.Function0<? extends T>):o.yDm<T> (m), WRAPPED] (LINE:20)) : (r1v0 o.yDm))
  (wrap:o.mmr:?: TERNARY null = ((wrap:int:0x000d: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.mmr:0x0013: INVOKE (wrap:o.mmr$TaskDescription:0x0011: SGET  A[WRAPPED] (LINE:23) o.mmr.Companion o.mmr$TaskDescription) VIRTUAL call: o.mmr.TaskDescription.AEQbTJ():o.mmr A[MD:():o.mmr (m), WRAPPED] (LINE:23)) : (r2v0 o.mmr))
 A[MD:(o.yDm<? extends o.mmQ>, o.mmr):void (m)] (LINE:19) call: o.mlo.<init>(o.yDm, o.mmr):void type: THIS */
    public /* synthetic */ AbstractC32875mlo(InterfaceC56387yDm interfaceC56387yDm, C32931mmr c32931mmr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56392yDr.copydefault(new Function0() { // from class: o.mlt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC32875mlo.djBIcL();
            }
        }) : interfaceC56387yDm, (i & 2) != 0 ? C32931mmr.Companion.AEQbTJ() : c32931mmr);
    }

    public static final C32898mmK djBIcL() {
        return new C32898mmK(0.0f, 1, null);
    }

    public AbstractC32875mlo(@NotNull InterfaceC56387yDm<? extends InterfaceC32904mmQ> interfaceC56387yDm, @NotNull C32931mmr c32931mmr) {
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        Intrinsics.checkNotNullParameter(c32931mmr, "");
        this.gEmmrt = c32931mmr;
        this.DbNXlk = new ConcurrentHashMap<>();
        this.djBIcL = new CopyOnWriteArrayList<>();
        this.values = new CopyOnWriteArraySet<>();
        this.fetchVPNInfo = new CopyOnWriteArrayList<>();
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.mls
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC32875mlo.AhwBna();
            }
        });
        this.valueOf = interfaceC56387yDm;
    }

    public final C32903mmP DbNXlk() {
        return (C32903mmP) this.isConnected.getValue();
    }

    public static final C32903mmP AhwBna() {
        return new C32903mmP();
    }

    public final InterfaceC32904mmQ fetchVPNInfo() {
        return (InterfaceC32904mmQ) this.valueOf.getValue();
    }

    @Override // o.InterfaceC32874mln
    public TrackChannel fJNWhG() {
        return TrackChannel.All;
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull InterfaceC32874mln interfaceC32874mln) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC32874mln, "");
        this.DbNXlk.put(str, interfaceC32874mln);
        pUU.KWHzl("Analytics.Event", "putTracker:" + str);
    }

    @Override // o.AbstractC32806mkY
    public void KWHzl(@NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        copydefault(new Function2() { // from class: o.mlp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC32875mlo.copydefault(context, (java.lang.String) obj, (InterfaceC32874mln) obj2);
            }
        });
    }

    public static final Unit copydefault(android.content.Context context, java.lang.String str, InterfaceC32874mln interfaceC32874mln) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC32874mln, "");
        interfaceC32874mln.EZpvd(context);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC32874mln
    public void onEvent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String[] strArrValueOf = valueOf();
        OLrzqt(str, (java.lang.String[]) java.util.Arrays.copyOf(strArrValueOf, strArrValueOf.length));
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        copydefault(str, new EventParamsList(), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    @Override // o.InterfaceC32874mln
    public void copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String[] strArrValueOf = valueOf();
        AEQbTJ(str, map, (java.lang.String[]) java.util.Arrays.copyOf(strArrValueOf, strArrValueOf.length));
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map, @NotNull final java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        pUU.KWHzl("Analytics.Event", "action:" + str);
        pUX.OLrzqt.KWHzl(java.lang.String.valueOf(str));
        uzCIH().OLrzqt("onEvent2", new Function0() { // from class: o.mlm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC32875mlo.OLrzqt(this.AEQbTJ, strArr, map, str);
            }
        });
    }

    public static final Unit OLrzqt(AbstractC32875mlo abstractC32875mlo, java.lang.String[] strArr, java.util.Map map, java.lang.String str) {
        java.util.List<InterfaceC32904mmQ> listAYXKKw = abstractC32875mlo.AYXKKw();
        for (java.lang.String str2 : strArr) {
            InterfaceC32874mln interfaceC32874mln = abstractC32875mlo.DbNXlk.get(str2);
            if (interfaceC32874mln != null) {
                if (interfaceC32874mln.hDKMBd()) {
                    java.util.Map<java.lang.String, java.lang.String> mapIsConnected = C56424yEw.isConnected(map);
                    CopyOnWriteArraySet<InterfaceC32870mlj> copyOnWriteArraySet = abstractC32875mlo.values;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : copyOnWriteArraySet) {
                        if (((InterfaceC32870mlj) obj).copydefault(interfaceC32874mln)) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC32870mlj) it.next()).copydefault(interfaceC32874mln, str, mapIsConnected);
                    }
                    abstractC32875mlo.gEmmrt.copydefault(str, interfaceC32874mln, abstractC32875mlo.values, mapIsConnected);
                    C32900mmM c32900mmM = new C32900mmM(str, mapIsConnected, null, 4, null);
                    new C32901mmN(interfaceC32874mln, c32900mmM, listAYXKKw, 0).AEQbTJ(c32900mmM);
                } else {
                    pUU.valueOf("Analytics.Event", "onEvent(), but " + interfaceC32874mln + " is not init.");
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC32874mln
    public void copydefault(@NotNull java.lang.String str, @NotNull EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String[] strArrValueOf = valueOf();
        copydefault(str, eventParamsList, (java.lang.String[]) java.util.Arrays.copyOf(strArrValueOf, strArrValueOf.length));
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final EventParamsList eventParamsList, @NotNull final java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        pUU.KWHzl("Analytics.Event", "action:" + str);
        pUX.OLrzqt.KWHzl(java.lang.String.valueOf(str));
        uzCIH().OLrzqt("onEvent1", new Function0() { // from class: o.mlq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC32875mlo.OLrzqt(this.KWHzl, strArr, eventParamsList, str);
            }
        });
    }

    public static final Unit OLrzqt(AbstractC32875mlo abstractC32875mlo, java.lang.String[] strArr, EventParamsList eventParamsList, java.lang.String str) {
        java.util.List<InterfaceC32904mmQ> listAYXKKw = abstractC32875mlo.AYXKKw();
        for (java.lang.String str2 : strArr) {
            InterfaceC32874mln interfaceC32874mln = abstractC32875mlo.DbNXlk.get(str2);
            if (interfaceC32874mln != null) {
                if (interfaceC32874mln.hDKMBd()) {
                    EventParamsList eventParamsList2 = new EventParamsList(eventParamsList);
                    CopyOnWriteArraySet<InterfaceC32870mlj> copyOnWriteArraySet = abstractC32875mlo.values;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : copyOnWriteArraySet) {
                        if (((InterfaceC32870mlj) obj).copydefault(interfaceC32874mln)) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC32870mlj) it.next()).KWHzl(interfaceC32874mln, str, eventParamsList2);
                    }
                    abstractC32875mlo.gEmmrt.copydefault(str, interfaceC32874mln, abstractC32875mlo.values, eventParamsList2);
                    C32900mmM c32900mmM = new C32900mmM(str, null, eventParamsList2, 2, null);
                    new C32901mmN(interfaceC32874mln, c32900mmM, listAYXKKw, 0).AEQbTJ(c32900mmM);
                } else {
                    pUU.valueOf("Analytics.Event", "onEvent(), but " + interfaceC32874mln + " is not init");
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String[] valueOf() {
        java.util.Set<java.lang.String> setKeySet = this.DbNXlk.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        return (java.lang.String[]) setKeySet.toArray(new java.lang.String[0]);
    }

    public static /* synthetic */ void addLogEventInterceptor$default(AbstractC32875mlo abstractC32875mlo, InterfaceC32904mmQ interfaceC32904mmQ, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addLogEventInterceptor");
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        abstractC32875mlo.AEQbTJ(interfaceC32904mmQ, i);
    }

    public final void AEQbTJ(@NotNull InterfaceC32904mmQ interfaceC32904mmQ, int i) {
        Intrinsics.checkNotNullParameter(interfaceC32904mmQ, "");
        if (i > this.djBIcL.size() || i < 0) {
            this.djBIcL.add(interfaceC32904mmQ);
        } else {
            this.djBIcL.add(i, interfaceC32904mmQ);
        }
    }

    public final void KWHzl(@NotNull InterfaceC32904mmQ interfaceC32904mmQ) {
        Intrinsics.checkNotNullParameter(interfaceC32904mmQ, "");
        this.djBIcL.remove(interfaceC32904mmQ);
    }

    public final void EZpvd(@NotNull InterfaceC32870mlj interfaceC32870mlj) {
        Intrinsics.checkNotNullParameter(interfaceC32870mlj, "");
        this.values.add(interfaceC32870mlj);
    }

    public final InterfaceC32874mln EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.DbNXlk.get(str);
    }

    public final void copydefault(@NotNull RemoteInterceptor remoteInterceptor) {
        Intrinsics.checkNotNullParameter(remoteInterceptor, "");
        this.fetchVPNInfo.add(remoteInterceptor);
    }

    public final java.util.List<InterfaceC32904mmQ> AYXKKw() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(fetchVPNInfo());
        arrayList.addAll(this.fetchVPNInfo);
        arrayList.addAll(this.djBIcL);
        arrayList.add(DbNXlk());
        return arrayList;
    }

    /* JADX INFO: renamed from: o.mlo$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mlo.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void copydefault(Function2<? super java.lang.String, ? super InterfaceC32874mln, Unit> function2) {
        for (Map.Entry<java.lang.String, InterfaceC32874mln> entry : this.DbNXlk.entrySet()) {
            function2.invoke(entry.getKey(), entry.getValue());
        }
    }
}
