package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43222rlH implements InterfaceC43220rlF {
    public static final Application Companion = new Application(null);
    public static final java.util.Map<java.lang.String, InterfaceComponentCallbacks2C43266rlz> copydefault = new LinkedHashMap();
    public final InterfaceComponentCallbacks2C43266rlz EZpvd;
    public final InterfaceC43220rlF KWHzl;

    /* JADX INFO: renamed from: o.rlH$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rlH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final InterfaceComponentCallbacks2C43266rlz AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return (InterfaceComponentCallbacks2C43266rlz) C43222rlH.copydefault.get(str + "_" + str2);
        }
    }

    public C43222rlH(@NotNull InterfaceC43220rlF interfaceC43220rlF, @NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
        Intrinsics.checkNotNullParameter(interfaceC43220rlF, "");
        Intrinsics.checkNotNullParameter(interfaceComponentCallbacks2C43266rlz, "");
        this.KWHzl = interfaceC43220rlF;
        this.EZpvd = interfaceComponentCallbacks2C43266rlz;
    }

    @Override // o.InterfaceC43220rlF
    public <T, R> void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC56387yDm<? extends InterfaceC43218rlD<? super T, ? extends R>> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        java.lang.String str3 = str + "_" + str2;
        if (copydefault(this.EZpvd, str3)) {
            this.KWHzl.AEQbTJ(str, str2, interfaceC56387yDm);
            copydefault.put(str3, this.EZpvd);
        }
    }

    public final boolean copydefault(InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz, java.lang.String str) {
        boolean zContains;
        java.util.List<java.lang.String> sites = interfaceComponentCallbacks2C43266rlz.getSites();
        if (sites == null || sites.isEmpty()) {
            zContains = !copydefault.containsKey(str);
        } else {
            java.util.List<java.lang.String> sites2 = interfaceComponentCallbacks2C43266rlz.getSites();
            Intrinsics.copydefault(sites2);
            zContains = sites2.contains(C43246rlf.OLrzqt.AhwBna());
        }
        if (zContains) {
            pUU.EZpvd("Module", "[" + interfaceComponentCallbacks2C43266rlz.getClass().getSimpleName() + "] register custom: " + str);
        }
        return zContains;
    }
}
