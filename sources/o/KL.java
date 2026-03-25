package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KL {
    public static final Application Companion = new Application(null);
    public java.util.List<java.lang.String> AEQbTJ;
    public java.util.Set<java.lang.String> EZpvd;

    public KL() {
        java.util.Set<java.lang.String> setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.checkNotNullExpressionValue(setSynchronizedSet, "");
        this.EZpvd = setSynchronizedSet;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.KL.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.AEQbTJ == null) {
            this.AEQbTJ = Collections.synchronizedList(new java.util.ArrayList());
        }
        java.util.List<java.lang.String> list = this.AEQbTJ;
        if (list != null) {
            list.add(str);
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.add(str);
        while (this.EZpvd.size() > 10) {
            java.util.Set<java.lang.String> set = this.EZpvd;
            set.remove(CollectionsKt___CollectionsKt.dNCPSb(set));
        }
    }

    public final boolean KWHzl() {
        java.util.List<java.lang.String> list = this.AEQbTJ;
        if (list != null) {
            Intrinsics.copydefault(list);
            if (!list.isEmpty()) {
                return true;
            }
        }
        return this.EZpvd.isEmpty() ^ true;
    }

    public final java.lang.String EZpvd() {
        if (!KWHzl()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.List<java.lang.String> list = this.AEQbTJ;
        if (list != null) {
            Intrinsics.copydefault(list);
            if (!list.isEmpty()) {
                java.util.List<java.lang.String> list2 = this.AEQbTJ;
                Intrinsics.copydefault(list2);
                linkedHashMap.put("malformed_events", list2);
            }
        }
        if (!this.EZpvd.isEmpty()) {
            linkedHashMap.put("error_logs", CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.EZpvd));
        }
        java.lang.String strValueOf = java.lang.String.valueOf(C5264La.OLrzqt(linkedHashMap));
        java.util.List<java.lang.String> list3 = this.AEQbTJ;
        if (list3 != null) {
            list3.clear();
        }
        this.EZpvd.clear();
        return strValueOf;
    }
}
