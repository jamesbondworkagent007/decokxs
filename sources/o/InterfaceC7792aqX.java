package o;

import o.AbstractC48864udi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aqX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7792aqX {
    void copydefault(@NotNull android.content.Context context, boolean z, AbstractC48864udi.Application application);

    /* JADX INFO: renamed from: o.aqX$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ void requestMlnHotReload$default(InterfaceC7792aqX interfaceC7792aqX, android.content.Context context, boolean z, AbstractC48864udi.Application application, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestMlnHotReload");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                application = null;
            }
            interfaceC7792aqX.copydefault(context, z, application);
        }
    }
}
