package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mlU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC32855mlU {
    public static final TaskDescription Companion = TaskDescription.EZpvd;

    void copydefault(@NotNull java.lang.Throwable th, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.String str2);

    /* JADX INFO: renamed from: o.mlU$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription EZpvd = new TaskDescription();
        public static Function0<? extends InterfaceC32855mlU> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(@NotNull Function0<? extends InterfaceC32855mlU> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            copydefault = function0;
        }

        private TaskDescription() {
        }

        public final InterfaceC32855mlU AEQbTJ() {
            Function0<? extends InterfaceC32855mlU> function0 = copydefault;
            if (function0 != null) {
                return function0.invoke();
            }
            return null;
        }
    }
}
