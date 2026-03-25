package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface DW {

    public interface Application {

        public interface ActionBar {
            void EZpvd(int i);
        }

        int EZpvd();

        Function1<ActionBar, Unit> OLrzqt();
    }

    <R> java.lang.Object KWHzl(@NotNull InterfaceC5093El<? super R> interfaceC5093El, @NotNull Function1<? super Continuation<? super R>, ? extends java.lang.Object> function1, @NotNull Continuation<? super DQ<? extends R>> continuation);

    Application copydefault();
}
