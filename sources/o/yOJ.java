package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface yOJ {
    AbstractC59233zdF AEQbTJ();

    InterfaceC56686yOo EZpvd();

    C56933yXs KWHzl();

    java.util.Map<C56935yXu, AbstractC56975yZg<?>> OLrzqt();

    public static final class ActionBar {
        public static C56933yXs AEQbTJ(@NotNull yOJ yoj) {
            InterfaceC56658yNn interfaceC56658yNnOLrzqt = yZE.OLrzqt(yoj);
            if (interfaceC56658yNnOLrzqt == null) {
                return null;
            }
            if (C59370zfk.KWHzl(interfaceC56658yNnOLrzqt)) {
                interfaceC56658yNnOLrzqt = null;
            }
            if (interfaceC56658yNnOLrzqt != null) {
                return yZE.KWHzl((InterfaceC56665yNu) interfaceC56658yNnOLrzqt);
            }
            return null;
        }
    }
}
