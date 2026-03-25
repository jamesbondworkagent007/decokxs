package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletBackupBean;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletShareBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dkI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC14373dkI {
    AbstractC58260yxt<java.lang.String> AEQbTJ(@NotNull MPCWalletShareBean mPCWalletShareBean, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Function2<? super MPCWalletShareBean, ? super java.lang.String, Unit> function2);

    AbstractC58260yxt<java.util.ArrayList<java.lang.String>> OLrzqt();

    void OLrzqt(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Function1<? super C9697baV, Unit> function1);

    AbstractC58260yxt<ResponseData<MPCWalletBackupBean>> copydefault(@NotNull java.lang.String str);

    void copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    void copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2);

    void copydefault(@NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Function2<? super MPCWalletShareBean, ? super java.lang.String, Unit> function2);
}
