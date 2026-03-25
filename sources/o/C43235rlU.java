package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43235rlU implements InterfaceC43309rmp {
    public static final Application Companion = new Application(null);
    public static final java.util.Map<java.lang.Class<? extends java.lang.Object>, InterfaceComponentCallbacks2C43266rlz> copydefault = new LinkedHashMap();
    public final InterfaceComponentCallbacks2C43266rlz EZpvd;
    public final InterfaceC43309rmp OLrzqt;

    public C43235rlU(@NotNull InterfaceC43309rmp interfaceC43309rmp, @NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
        Intrinsics.checkNotNullParameter(interfaceC43309rmp, "");
        Intrinsics.checkNotNullParameter(interfaceComponentCallbacks2C43266rlz, "");
        this.OLrzqt = interfaceC43309rmp;
        this.EZpvd = interfaceComponentCallbacks2C43266rlz;
    }

    /* JADX INFO: renamed from: o.rlU$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rlU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
