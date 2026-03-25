package o;

import com.amplitude.core.events.IdentifyOperation;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5250Km {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final java.util.Set<java.lang.String> EZpvd = new LinkedHashSet();
    public final java.util.Map<java.lang.String, java.lang.Object> copydefault = new LinkedHashMap();

    public final java.util.Map<java.lang.String, java.lang.Object> EZpvd() {
        java.util.Map<java.lang.String, java.lang.Object> mapIsConnected;
        synchronized (this) {
            mapIsConnected = C56424yEw.isConnected(this.copydefault);
            for (Map.Entry<java.lang.String, java.lang.Object> entry : mapIsConnected.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value instanceof java.util.Map) {
                    mapIsConnected.put(key, C56424yEw.isConnected((java.util.Map) value));
                }
            }
        }
        return mapIsConnected;
    }

    public final C5250Km AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd(IdentifyOperation.SET, str, str2);
        return this;
    }

    public final C5250Km copydefault(@NotNull java.lang.String str, @NotNull java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        EZpvd(IdentifyOperation.SET, str, strArr);
        return this;
    }

    public final C5250Km OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        EZpvd(IdentifyOperation.SET, str, obj);
        return this;
    }

    public final void EZpvd(IdentifyOperation identifyOperation, java.lang.String str, java.lang.Object obj) {
        synchronized (this) {
            if (str.length() == 0) {
                C5238Ka.Companion.OLrzqt().KWHzl("Attempting to perform operation " + identifyOperation.getOperationType() + " with a null or empty string property, ignoring");
                return;
            }
            if (obj == null) {
                C5238Ka.Companion.OLrzqt().KWHzl("Attempting to perform operation " + identifyOperation.getOperationType() + " with null value for property " + str + ", ignoring");
                return;
            }
            if (this.copydefault.containsKey(IdentifyOperation.CLEAR_ALL.getOperationType())) {
                C5238Ka.Companion.OLrzqt().KWHzl("This Identify already contains a $clearAll operation, ignoring operation %s");
                return;
            }
            if (this.EZpvd.contains(str)) {
                C5238Ka.Companion.OLrzqt().KWHzl("Already used property " + str + " in previous operation, ignoring operation " + identifyOperation.getOperationType());
                return;
            }
            if (!this.copydefault.containsKey(identifyOperation.getOperationType())) {
                this.copydefault.put(identifyOperation.getOperationType(), new LinkedHashMap());
            }
            java.lang.Object obj2 = this.copydefault.get(identifyOperation.getOperationType());
            Intrinsics.copydefault(obj2, "");
            C56532yIw.AEQbTJ(obj2).put(str, obj);
            this.EZpvd.add(str);
        }
    }

    /* JADX INFO: renamed from: o.Km$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Km.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
