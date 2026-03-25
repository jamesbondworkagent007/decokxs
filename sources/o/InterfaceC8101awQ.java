package o;

import com.okinc.account.api.model.banner.Margin;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.awQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8101awQ extends InterfaceC43217rlC {
    AbstractC8099awO OLrzqt(boolean z, @NotNull Margin margin);

    void copydefault(@NotNull android.widget.ImageView imageView, boolean z, Function1<? super java.lang.Boolean, Unit> function1);

    /* JADX INFO: renamed from: o.awQ$Activity */
    public static final class Activity {
        public static /* synthetic */ AbstractC8099awO provideAlertBanner$default(InterfaceC8101awQ interfaceC8101awQ, boolean z, Margin margin, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: provideAlertBanner");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                margin = new Margin(24, 0, 24, 8);
            }
            return interfaceC8101awQ.OLrzqt(z, margin);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.awQ */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void loadUserAvatar$default(InterfaceC8101awQ interfaceC8101awQ, android.widget.ImageView imageView, boolean z, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadUserAvatar");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            interfaceC8101awQ.copydefault(imageView, z, function1);
        }
    }
}
