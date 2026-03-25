package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5215Jd {

    /* JADX INFO: renamed from: o.Jd$Application */
    public interface Application {
        Application EZpvd(java.lang.String str);

        Application copydefault(java.lang.String str);

        Application copydefault(@NotNull java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> map);

        void copydefault();
    }

    C5213Jb AEQbTJ();

    void EZpvd(@NotNull Function1<? super C5213Jb, Unit> function1);

    void OLrzqt(@NotNull C5213Jb c5213Jb);

    Application copydefault();

    void copydefault(@NotNull Function1<? super C5213Jb, Unit> function1);
}
