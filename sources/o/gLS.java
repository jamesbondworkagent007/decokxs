package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.network.okg.response.ResponseData;
import kotlinx.coroutines.flow.StateFlow;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface gLS {
    InterfaceC9738bbJ AEQbTJ();

    long EZpvd();

    java.lang.String EZpvd(@NotNull java.lang.String str, int i);

    AbstractC58260yxt<ResponseData<C9748bbT>> EZpvd(@NotNull SignDataArgs<?> signDataArgs, boolean z, @NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9740bbL.TaskDescription taskDescription);

    boolean KWHzl();

    boolean KWHzl(long j);

    boolean OLrzqt();

    java.util.Map<java.lang.Long, dTM> copydefault(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list);

    StateFlow<dTH> copydefault();

    dTM copydefault(@NotNull java.lang.String str, long j);
}
