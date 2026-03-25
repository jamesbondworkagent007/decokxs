package o;

import com.okinc.core.util.SPUtils;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qCw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39925qCw implements InterfaceC39921qCs<java.lang.String> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public java.util.ArrayList<java.lang.String> copydefault = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<java.lang.String> EZpvd() {
        return this.copydefault;
    }

    public C39925qCw() {
        java.util.ArrayList arrayList = SPUtils.getArrayList("trade_search_history_key", java.lang.String.class);
        arrayList = arrayList == null ? new java.util.ArrayList() : arrayList;
        if (arrayList.size() != 0) {
            this.copydefault.addAll(arrayList);
        }
    }

    /* JADX INFO: renamed from: o.qCw$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qCw.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!this.copydefault.contains(str)) {
            this.copydefault.add(0, str);
        } else {
            this.copydefault.remove(str);
            this.copydefault.add(0, str);
        }
        KWHzl();
    }

    public void OLrzqt() {
        this.copydefault.clear();
        SPUtils.put("trade_search_history_key", this.copydefault);
    }

    public void KWHzl() {
        SPUtils.put("trade_search_history_key", CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) this.copydefault, 40));
    }

    public final void KWHzl(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (this.copydefault.isEmpty()) {
            for (java.lang.String str : list) {
                if (!this.copydefault.contains(str)) {
                    this.copydefault.add(str);
                }
            }
            SPUtils.put("trade_search_history_key", CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) this.copydefault, 40));
        }
    }
}
