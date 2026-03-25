package o;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yLN {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void KWHzl(int i) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static abstract class TaskDescription<T> {
        public static final java.lang.Object AEQbTJ = new java.lang.Object() { // from class: o.yLN.TaskDescription.5
        };

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.Object EZpvd(T t) {
            return t == null ? AEQbTJ : t;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        public T copydefault(java.lang.Object obj) {
            if (obj == AEQbTJ) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();

        public final T KWHzl(java.lang.Object obj, java.lang.Object obj2) {
            return invoke();
        }
    }

    public static class ActionBar<T> extends TaskDescription<T> implements Function0<T> {
        public final Function0<T> KWHzl;
        public volatile SoftReference<java.lang.Object> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void EZpvd(int i) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        public ActionBar(T t, @NotNull Function0<T> function0) {
            if (function0 == null) {
                EZpvd(0);
            }
            this.OLrzqt = null;
            this.KWHzl = function0;
            if (t != null) {
                this.OLrzqt = new SoftReference<>(EZpvd(t));
            }
        }

        @Override // o.yLN.TaskDescription, kotlin.jvm.functions.Function0
        public T invoke() {
            java.lang.Object obj;
            SoftReference<java.lang.Object> softReference = this.OLrzqt;
            if (softReference != null && (obj = softReference.get()) != null) {
                return copydefault(obj);
            }
            T tInvoke = this.KWHzl.invoke();
            this.OLrzqt = new SoftReference<>(EZpvd(tInvoke));
            return tInvoke;
        }
    }

    public static <T> ActionBar<T> copydefault(T t, @NotNull Function0<T> function0) {
        if (function0 == null) {
            KWHzl(0);
        }
        return new ActionBar<>(t, function0);
    }

    public static <T> ActionBar<T> copydefault(@NotNull Function0<T> function0) {
        if (function0 == null) {
            KWHzl(1);
        }
        return copydefault(null, function0);
    }
}
