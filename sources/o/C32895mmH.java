package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.common.whitelist.WhiteListController$assertWhitelistResponseAsync$1;
import com.okinc.components.track.common.whitelist.WhiteListController$loadWhiteListIfNotLoading$1;
import com.okinc.components.track.common.whitelist.WhiteListController$saveWhitelistLocallyAsync$1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32895mmH implements InterfaceC54816xWj {
    public Job AhwBna;
    public final java.util.Map<TrackChannel, InterfaceC32892mmE> EZpvd;
    public final InterfaceC6941aYq KWHzl;
    public final CoroutineScope copydefault;
    public final java.io.File valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public static final InterfaceC56387yDm<Json> OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.mmI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32895mmH.AhwBna();
        }
    });

    public C32895mmH(@NotNull java.lang.String str, @NotNull InterfaceC6941aYq interfaceC6941aYq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC6941aYq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC6941aYq;
        this.valueOf = new java.io.File(str, "track.whitelist");
        this.EZpvd = new LinkedHashMap();
        this.copydefault = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher).plus(new Activity(CoroutineExceptionHandler.Key)));
    }

    /* JADX INFO: renamed from: o.mmH$Activity */
    public static final class Activity extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public Activity(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull java.lang.Throwable th) {
            pUU.copydefault("WhiteListController", "CoroutineExceptionHandler", th);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 o.aYq)
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getIO():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:47)) : (r3v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(java.lang.String, o.aYq, kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:44) call: o.mmH.<init>(java.lang.String, o.aYq, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ C32895mmH(java.lang.String str, InterfaceC6941aYq interfaceC6941aYq, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC6941aYq, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final void KWHzl(@NotNull TrackChannel trackChannel, @NotNull InterfaceC32892mmE interfaceC32892mmE) {
        Intrinsics.checkNotNullParameter(trackChannel, "");
        Intrinsics.checkNotNullParameter(interfaceC32892mmE, "");
        this.EZpvd.put(trackChannel, interfaceC32892mmE);
    }

    @Override // o.InterfaceC54816xWj
    public void copydefault() {
        if (this.AhwBna == null) {
            valueOf();
        }
    }

    @Override // o.InterfaceC54816xWj
    public void KWHzl() {
        valueOf();
    }

    public final void valueOf() {
        Job job = this.AhwBna;
        if (job == null || !job.isActive()) {
            this.AhwBna = BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new WhiteListController$loadWhiteListIfNotLoading$1(this, null), 3, null);
        }
    }

    public final Deferred<Unit> copydefault(JsonElement jsonElement) {
        return BuildersKt__Builders_commonKt.async$default(this.copydefault, null, null, new WhiteListController$assertWhitelistResponseAsync$1(jsonElement, null), 3, null);
    }

    public final Job OLrzqt(JsonElement jsonElement) {
        return BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new WhiteListController$saveWhitelistLocallyAsync$1(this, jsonElement, null), 3, null);
    }

    public final java.util.Map<java.lang.String, java.lang.String> copydefault(TrackChannel trackChannel, JsonObject jsonObject) {
        java.lang.String contentOrNull;
        java.lang.String contentOrNull2;
        java.util.Map<java.lang.String, java.lang.String> mapIsConnected = C56424yEw.isConnected(Companion.copydefault(trackChannel));
        java.lang.String lowerTrackerName = trackChannel.getLowerTrackerName();
        java.lang.Object obj = (JsonElement) jsonObject.get((java.lang.Object) lowerTrackerName);
        if (!(obj instanceof JsonArray)) {
            if (obj instanceof JsonObject) {
                for (Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    JsonElement jsonElement = (JsonElement) entry.getValue();
                    JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
                    if (jsonArray != null) {
                        for (JsonElement jsonElement2 : jsonArray) {
                            JsonPrimitive jsonPrimitive = jsonElement2 instanceof JsonPrimitive ? (JsonPrimitive) jsonElement2 : null;
                            if (jsonPrimitive != null && (contentOrNull = JsonElementKt.getContentOrNull(jsonPrimitive)) != null) {
                                mapIsConnected.put(contentOrNull, str);
                            }
                        }
                    }
                }
            }
        } else {
            for (JsonElement jsonElement3 : (java.lang.Iterable) obj) {
                JsonPrimitive jsonPrimitive2 = jsonElement3 instanceof JsonPrimitive ? (JsonPrimitive) jsonElement3 : null;
                if (jsonPrimitive2 != null && (contentOrNull2 = JsonElementKt.getContentOrNull(jsonPrimitive2)) != null) {
                    mapIsConnected.put(contentOrNull2, lowerTrackerName);
                }
            }
        }
        return mapIsConnected;
    }

    /* JADX INFO: renamed from: o.mmH$TaskDescription */
    public static final class TaskDescription {

        /* JADX INFO: renamed from: o.mmH$TaskDescription$Activity */
        /* JADX INFO: loaded from: classes15.dex */
        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TrackChannel.values().length];
                try {
                    iArr[TrackChannel.Appsflyer.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mmH.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final Json AEQbTJ() {
            return (Json) C32895mmH.OLrzqt.getValue();
        }

        public final java.util.Map<java.lang.String, java.lang.String> copydefault(@NotNull TrackChannel trackChannel) {
            java.util.List<java.lang.String> listAhwBna;
            Intrinsics.checkNotNullParameter(trackChannel, "");
            if (Activity.AEQbTJ[trackChannel.ordinal()] == 1) {
                listAhwBna = OLrzqt();
            } else {
                listAhwBna = yDY.AhwBna();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listAhwBna, 10)), 16));
            for (java.lang.Object obj : listAhwBna) {
                linkedHashMap.put(obj, trackChannel.getLowerTrackerName());
            }
            return linkedHashMap;
        }

        public final java.util.List<java.lang.String> OLrzqt() {
            return yDY.gEmmrt("install", "user_register", "app_startup", "Web3AddWalletSuccess_Full_Api_Success", "install_lite", "user_register_lite", "app_startup_lite");
        }

        public final java.lang.String AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String absolutePath = context.getFilesDir().getAbsolutePath();
            java.lang.String str = java.io.File.separator;
            return absolutePath + str + "track" + str;
        }
    }

    public static final Json AhwBna() {
        return JsonKt.Json$default(null, new Function1() { // from class: o.mmL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32895mmH.OLrzqt((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(false);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setUseArrayPolymorphism(true);
        return Unit.INSTANCE;
    }
}
