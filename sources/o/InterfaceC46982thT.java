package o;

import com.okinc.okrisk.OKRiskLibrarySource;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.thT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC46982thT {
    public static final Application Companion = Application.AEQbTJ;

    C47001thm AhwBna();

    void OLrzqt(@NotNull android.app.Application application);

    void OLrzqt(@NotNull OKRiskLibrarySource oKRiskLibrarySource, InterfaceC47027tiL interfaceC47027tiL, java.lang.String str, CoroutineScope coroutineScope);

    void copydefault(@NotNull OKRiskLibrarySource oKRiskLibrarySource, CoroutineScope coroutineScope);

    /* JADX INFO: renamed from: o.thT$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ void profile$default(InterfaceC46982thT interfaceC46982thT, OKRiskLibrarySource oKRiskLibrarySource, InterfaceC47027tiL interfaceC47027tiL, java.lang.String str, CoroutineScope coroutineScope, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: profile");
            }
            if ((i & 2) != 0) {
                interfaceC47027tiL = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                coroutineScope = null;
            }
            interfaceC46982thT.OLrzqt(oKRiskLibrarySource, interfaceC47027tiL, str, coroutineScope);
        }

        public static /* synthetic */ void profileBiometric$default(InterfaceC46982thT interfaceC46982thT, OKRiskLibrarySource oKRiskLibrarySource, CoroutineScope coroutineScope, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: profileBiometric");
            }
            if ((i & 2) != 0) {
                coroutineScope = null;
            }
            interfaceC46982thT.copydefault(oKRiskLibrarySource, coroutineScope);
        }
    }

    /* JADX INFO: renamed from: o.thT$Application */
    public static final class Application {
        public static final /* synthetic */ Application AEQbTJ = new Application();

        private Application() {
        }
    }
}
