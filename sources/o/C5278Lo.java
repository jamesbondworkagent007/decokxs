package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Lo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5278Lo {
    public final InterfaceC5277Ln AEQbTJ = new C5280Lq();
    public static final Application Companion = new Application(null);
    public static final java.lang.Object copydefault = new java.lang.Object();
    public static final java.util.Map<java.lang.String, C5278Lo> KWHzl = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC5277Ln KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.Lo$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Lo.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C5278Lo OLrzqt(@NotNull java.lang.String str) {
            C5278Lo c5278Lo;
            Intrinsics.checkNotNullParameter(str, "");
            synchronized (C5278Lo.copydefault) {
                java.util.Map map = C5278Lo.KWHzl;
                java.lang.Object c5278Lo2 = map.get(str);
                if (c5278Lo2 == null) {
                    c5278Lo2 = new C5278Lo();
                    map.put(str, c5278Lo2);
                }
                c5278Lo = (C5278Lo) c5278Lo2;
            }
            return c5278Lo;
        }
    }
}
