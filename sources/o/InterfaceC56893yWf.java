package o;

import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yWf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56893yWf {

    /* JADX INFO: renamed from: o.yWf$ActionBar */
    public interface ActionBar extends TaskDescription {
        Application OLrzqt(int i, @NotNull C56929yXo c56929yXo, @NotNull InterfaceC56686yOo interfaceC56686yOo);
    }

    /* JADX INFO: renamed from: o.yWf$Activity */
    public interface Activity {
        void AEQbTJ(@NotNull C56929yXo c56929yXo, @NotNull C56935yXu c56935yXu);

        Application KWHzl(@NotNull C56929yXo c56929yXo);

        void KWHzl();

        void OLrzqt(java.lang.Object obj);

        void OLrzqt(@NotNull C56977yZi c56977yZi);
    }

    /* JADX INFO: renamed from: o.yWf$Application */
    public interface Application {
        void AEQbTJ(C56935yXu c56935yXu, java.lang.Object obj);

        void AEQbTJ(C56935yXu c56935yXu, @NotNull C56977yZi c56977yZi);

        Activity EZpvd(C56935yXu c56935yXu);

        Application KWHzl(C56935yXu c56935yXu, @NotNull C56929yXo c56929yXo);

        void OLrzqt(C56935yXu c56935yXu, @NotNull C56929yXo c56929yXo, @NotNull C56935yXu c56935yXu2);

        void copydefault();
    }

    /* JADX INFO: renamed from: o.yWf$StateListAnimator */
    public interface StateListAnimator {
        TaskDescription EZpvd(@NotNull C56935yXu c56935yXu, @NotNull java.lang.String str, java.lang.Object obj);

        ActionBar OLrzqt(@NotNull C56935yXu c56935yXu, @NotNull java.lang.String str);
    }

    /* JADX INFO: renamed from: o.yWf$TaskDescription */
    public interface TaskDescription {
        void EZpvd();

        Application copydefault(@NotNull C56929yXo c56929yXo, @NotNull InterfaceC56686yOo interfaceC56686yOo);
    }

    KotlinClassHeader EZpvd();

    C56929yXo KWHzl();

    void KWHzl(@NotNull StateListAnimator stateListAnimator, byte[] bArr);

    void KWHzl(@NotNull TaskDescription taskDescription, byte[] bArr);

    java.lang.String OLrzqt();
}
