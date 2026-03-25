package o;

import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bHh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8702bHh {
    java.lang.String EZpvd();

    java.lang.String KWHzl();

    java.lang.String OLrzqt();

    java.lang.String copydefault();

    /* JADX INFO: renamed from: o.bHh$ActionBar */
    public static final class ActionBar {
        public static java.lang.String copydefault(@NotNull InterfaceC8702bHh interfaceC8702bHh) {
            return C54862xYb.convertToBigIntegerString$default(interfaceC8702bHh.EZpvd(), true, (RoundingMode) null, 2, (java.lang.Object) null);
        }

        public static java.lang.String OLrzqt(@NotNull InterfaceC8702bHh interfaceC8702bHh) {
            return C54862xYb.convertToBigIntegerString$default(interfaceC8702bHh.KWHzl(), true, (RoundingMode) null, 2, (java.lang.Object) null);
        }
    }
}
