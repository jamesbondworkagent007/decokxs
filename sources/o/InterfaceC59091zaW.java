package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59091zaW {
    AbstractC59233zdF OLrzqt(@NotNull ProtoBuf.Type type, @NotNull java.lang.String str, @NotNull AbstractC59242zdO abstractC59242zdO, @NotNull AbstractC59242zdO abstractC59242zdO2);

    /* JADX INFO: renamed from: o.zaW$ActionBar */
    public static final class ActionBar implements InterfaceC59091zaW {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
        }

        @Override // o.InterfaceC59091zaW
        public AbstractC59233zdF OLrzqt(@NotNull ProtoBuf.Type type, @NotNull java.lang.String str, @NotNull AbstractC59242zdO abstractC59242zdO, @NotNull AbstractC59242zdO abstractC59242zdO2) {
            Intrinsics.checkNotNullParameter(type, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
            Intrinsics.checkNotNullParameter(abstractC59242zdO2, "");
            throw new java.lang.IllegalArgumentException("This method should not be used.");
        }
    }
}
