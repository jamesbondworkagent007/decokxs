package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.dapp.bean.DappSearchResultBean;
import com.okinc.dapp.bean.FeedsParamBean;
import com.okinc.dapp.bean.KOLProfileParamsBean;
import com.okinc.dapp.bean.VibeFeedsParamsBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface xWA extends InterfaceC43295rmb {
    public static final Application Companion = Application.copydefault;

    AbstractC32996moC AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num);

    void AEQbTJ(@NotNull android.content.Context context);

    void AEQbTJ(@NotNull java.util.List<DappSearchResultBean> list, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    androidx.fragment.app.Fragment EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, int i);

    androidx.fragment.app.Fragment EZpvd(@NotNull KOLProfileParamsBean kOLProfileParamsBean);

    void EZpvd(@NotNull android.content.Context context);

    boolean EZpvd();

    void KWHzl(@NotNull android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num);

    boolean KWHzl();

    int OLrzqt();

    void OLrzqt(@NotNull android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num);

    void OLrzqt(@NotNull java.lang.String str, @NotNull android.content.Context context);

    androidx.fragment.app.Fragment copydefault(@NotNull FeedsParamBean feedsParamBean);

    void copydefault(@NotNull android.content.Context context);

    void copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull VibeFeedsParamsBean vibeFeedsParamsBean);

    boolean copydefault(@NotNull java.lang.String str);

    public static final class Application {
        public static final /* synthetic */ Application copydefault = new Application();

        private Application() {
        }
    }

    public static final class StateListAnimator {
        public static /* synthetic */ AbstractC32996moC getDAppTabHomeFragment$default(xWA xwa, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDAppTabHomeFragment");
            }
            if ((i & 1) != 0) {
                fragmentManager = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return xwa.AEQbTJ(fragmentManager, num);
        }

        public static /* synthetic */ void openDappPage$default(xWA xwa, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openDappPage");
            }
            if ((i & 2) != 0) {
                fragmentManager = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            xwa.OLrzqt(context, fragmentManager, num);
        }

        public static /* synthetic */ void openWebTabManagePage$default(xWA xwa, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openWebTabManagePage");
            }
            if ((i & 2) != 0) {
                fragmentManager = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            xwa.KWHzl(context, fragmentManager, num);
        }
    }
}
