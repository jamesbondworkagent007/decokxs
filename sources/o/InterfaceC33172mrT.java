package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mrT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC33172mrT extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull android.content.Context context, java.lang.String str, android.os.Bundle bundle);

    void copydefault(@NotNull android.content.Context context, @NotNull android.os.Bundle bundle);

    /* JADX INFO: renamed from: o.mrT$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ void routeMain$default(InterfaceC33172mrT interfaceC33172mrT, android.content.Context context, java.lang.String str, android.os.Bundle bundle, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeMain");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            interfaceC33172mrT.AEQbTJ(context, str, bundle);
        }
    }
}
