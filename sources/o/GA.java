package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.slf4j.event.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class GA implements InterfaceC5146Gm {
    public static final boolean OLrzqt;
    public static final GA copydefault = new GA();

    private GA() {
    }

    static {
        boolean z;
        try {
            C60099zvg.OLrzqt("version_check").OLrzqt(Level.DEBUG);
            z = true;
        } catch (java.lang.NoSuchMethodError unused) {
            C60099zvg.AEQbTJ((java.lang.Class<?>) GA.class).warn("falling back to SLF4J 1.x compatible binding");
            z = false;
        }
        OLrzqt = z;
    }

    @Override // o.InterfaceC5146Gm
    public InterfaceC5148Go OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC60100zvh interfaceC60100zvhOLrzqt = C60099zvg.OLrzqt(str);
        if (OLrzqt) {
            Intrinsics.copydefault(interfaceC60100zvhOLrzqt);
            return new C5156Gw(interfaceC60100zvhOLrzqt);
        }
        Intrinsics.copydefault(interfaceC60100zvhOLrzqt);
        return new C5155Gv(interfaceC60100zvhOLrzqt);
    }
}
