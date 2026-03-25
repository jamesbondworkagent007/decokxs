package o;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface xWJ extends InterfaceC43217rlC {
    java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.String> continuation);

    void AEQbTJ(@NotNull android.content.Context context, Function0<Unit> function0, Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1);

    boolean AYXKKw();

    java.lang.String AhwBna();

    void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager);

    int copydefault();

    void copydefault(@NotNull android.content.Context context, int i);

    void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function0<Unit> function0);

    void copydefault(boolean z);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Application {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xWJ */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void routeUpdateLanguage$default(xWJ xwj, android.content.Context context, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeUpdateLanguage");
            }
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            xwj.AEQbTJ(context, function0, function1);
        }
    }
}
