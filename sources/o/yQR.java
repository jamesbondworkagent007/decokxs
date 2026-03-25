package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface yQR {
    void AEQbTJ(@NotNull java.lang.String str, @NotNull Position position, @NotNull java.lang.String str2, @NotNull ScopeKind scopeKind, @NotNull java.lang.String str3);

    boolean OLrzqt();

    public static final class ActionBar implements yQR {
        public static final ActionBar EZpvd = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.yQR
        public void AEQbTJ(@NotNull java.lang.String str, @NotNull Position position, @NotNull java.lang.String str2, @NotNull ScopeKind scopeKind, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(position, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(scopeKind, "");
            Intrinsics.checkNotNullParameter(str3, "");
        }

        @Override // o.yQR
        public boolean OLrzqt() {
            return false;
        }

        private ActionBar() {
        }
    }
}
