package o;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yFg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56435yFg extends CoroutineContext.Element {
    public static final Application AEQbTJ = Application.EZpvd;

    <T> Continuation<T> interceptContinuation(@NotNull Continuation<? super T> continuation);

    void releaseInterceptedContinuation(@NotNull Continuation<?> continuation);

    /* JADX INFO: renamed from: o.yFg$Application */
    public static final class Application implements CoroutineContext.TaskDescription<InterfaceC56435yFg> {
        public static final /* synthetic */ Application EZpvd = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.yFg$TaskDescription */
    public static final class TaskDescription {
        public static <E extends CoroutineContext.Element> E KWHzl(@NotNull InterfaceC56435yFg interfaceC56435yFg, @NotNull CoroutineContext.TaskDescription<E> taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            if (taskDescription instanceof AbstractC56432yFd) {
                AbstractC56432yFd abstractC56432yFd = (AbstractC56432yFd) taskDescription;
                if (!abstractC56432yFd.isSubKey$kotlin_stdlib(interfaceC56435yFg.getKey())) {
                    return null;
                }
                E e = (E) abstractC56432yFd.tryCast$kotlin_stdlib(interfaceC56435yFg);
                if (e instanceof CoroutineContext.Element) {
                    return e;
                }
                return null;
            }
            if (InterfaceC56435yFg.AEQbTJ != taskDescription) {
                return null;
            }
            Intrinsics.copydefault(interfaceC56435yFg, "");
            return interfaceC56435yFg;
        }

        public static CoroutineContext EZpvd(@NotNull InterfaceC56435yFg interfaceC56435yFg, @NotNull CoroutineContext.TaskDescription<?> taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            if (!(taskDescription instanceof AbstractC56432yFd)) {
                return InterfaceC56435yFg.AEQbTJ == taskDescription ? EmptyCoroutineContext.INSTANCE : interfaceC56435yFg;
            }
            AbstractC56432yFd abstractC56432yFd = (AbstractC56432yFd) taskDescription;
            return (!abstractC56432yFd.isSubKey$kotlin_stdlib(interfaceC56435yFg.getKey()) || abstractC56432yFd.tryCast$kotlin_stdlib(interfaceC56435yFg) == null) ? interfaceC56435yFg : EmptyCoroutineContext.INSTANCE;
        }
    }
}
