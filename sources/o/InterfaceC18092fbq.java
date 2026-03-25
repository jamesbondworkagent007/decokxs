package o;

import com.okinc.business.defi.biz.net.bean.RecommendedInvestment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18092fbq {

    /* JADX INFO: renamed from: o.fbq$TaskDescription */
    public static final class TaskDescription implements InterfaceC18092fbq {
        public final RecommendedInvestment EZpvd;

        public TaskDescription(@NotNull RecommendedInvestment recommendedInvestment) {
            Intrinsics.checkNotNullParameter(recommendedInvestment, "");
            this.EZpvd = recommendedInvestment;
        }
    }

    /* JADX INFO: renamed from: o.fbq$Application */
    public static final class Application implements InterfaceC18092fbq {
        public static final Application KWHzl = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.fbq$ActionBar */
    public static final class ActionBar implements InterfaceC18092fbq {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
        }
    }
}
