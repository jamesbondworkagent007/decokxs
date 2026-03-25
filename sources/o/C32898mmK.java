package o;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC32904mmQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32898mmK implements InterfaceC32904mmQ {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final ConcurrentHashMap<java.lang.String, java.lang.Long> EZpvd;
    public final float KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C32898mmK() {
        this(0.0f, 1, null);
    }

    public C32898mmK(float f) {
        this.KWHzl = f;
        this.EZpvd = new ConcurrentHashMap<>();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1.0f float) : (r1v0 float))
 A[MD:(float):void (m)] (LINE:9) call: o.mmK.<init>(float):void type: THIS */
    public /* synthetic */ C32898mmK(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f);
    }

    @Override // o.InterfaceC32904mmQ
    public void AEQbTJ(@NotNull InterfaceC32904mmQ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C32900mmM c32900mmMKWHzl = stateListAnimator.KWHzl();
        if (EZpvd(c32900mmMKWHzl.OLrzqt())) {
            stateListAnimator.AEQbTJ(c32900mmMKWHzl);
            return;
        }
        java.lang.String strOLrzqt = c32900mmMKWHzl.OLrzqt();
        java.lang.String str = stateListAnimator.OLrzqt().fJNWhG().getTrackerName() + ":" + strOLrzqt;
        java.lang.Long l = this.EZpvd.get(str);
        long jElapsedRealtimeNanos = (long) (android.os.SystemClock.elapsedRealtimeNanos() / 1000000.0d);
        if (l == null || jElapsedRealtimeNanos - l.longValue() < 0 || ((jElapsedRealtimeNanos - l.longValue()) / ((long) 1000)) * this.KWHzl >= 1.0f) {
            this.EZpvd.put(str, java.lang.Long.valueOf(jElapsedRealtimeNanos));
            stateListAnimator.AEQbTJ(c32900mmMKWHzl);
        }
        AEQbTJ(jElapsedRealtimeNanos);
    }

    public final void AEQbTJ(long j) {
        java.util.Iterator<Map.Entry<java.lang.String, java.lang.Long>> it = this.EZpvd.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<java.lang.String, java.lang.Long> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            Map.Entry<java.lang.String, java.lang.Long> entry = next;
            java.lang.Long value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (j - value.longValue() >= 0) {
                Intrinsics.checkNotNullExpressionValue(entry.getValue(), "");
                if (((j - r1.longValue()) / ((long) 1000)) * this.KWHzl > 1.0f) {
                }
            }
            it.remove();
        }
    }

    public final boolean EZpvd(java.lang.String str) {
        try {
            Function0<JsonObject> function0AYXKKw = C32864mld.OLrzqt.AYXKKw();
            JsonObject jsonObjectInvoke = function0AYXKKw != null ? function0AYXKKw.invoke() : null;
            JsonElement jsonElement = jsonObjectInvoke != null ? jsonObjectInvoke.get("whiteList") : null;
            JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
            JsonArray asJsonArray = jsonArray != null ? jsonArray.getAsJsonArray() : null;
            if (asJsonArray == null) {
                return false;
            }
            java.util.Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) it.next().getAsString())) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o.mmK$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mmK.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
