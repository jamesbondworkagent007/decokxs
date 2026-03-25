package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AssistContent;
import o.ComponentCallbacks2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface PackageManager extends java.io.Closeable {
    IntentSender<ComponentCallbacks2.Application> AEQbTJ();

    IntentSender<java.lang.Long> AEQbTJ(java.lang.Integer num, @NotNull java.lang.String str, int i, Function1<? super Configuration, Unit> function1);

    void AEQbTJ(@NotNull java.lang.String[] strArr, @NotNull AssistContent.TaskDescription taskDescription);

    void EZpvd(@NotNull java.lang.String... strArr);

    ComponentCallbacks2.Application OLrzqt();

    <R> IntentSender<R> OLrzqt(java.lang.Integer num, @NotNull java.lang.String str, @NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1, int i, Function1<? super Configuration, Unit> function12);

    void OLrzqt(@NotNull java.lang.String[] strArr, @NotNull AssistContent.TaskDescription taskDescription);

    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.PackageManager */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IntentSender executeQuery$default(PackageManager packageManager, java.lang.Integer num, java.lang.String str, Function1 function1, int i, Function1 function12, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeQuery");
            }
            if ((i2 & 16) != 0) {
                function12 = null;
            }
            return packageManager.OLrzqt(num, str, function1, i, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.PackageManager */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IntentSender execute$default(PackageManager packageManager, java.lang.Integer num, java.lang.String str, int i, Function1 function1, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            }
            if ((i2 & 8) != 0) {
                function1 = null;
            }
            return packageManager.AEQbTJ(num, str, i, function1);
        }
    }
}
