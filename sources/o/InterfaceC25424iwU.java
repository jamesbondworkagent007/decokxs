package o;

import com.okinc.business.invest_api.bean.DeFiApyDataInfoData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25424iwU extends InterfaceC43216rlB {
    DeFiApyDataInfoData AEQbTJ(long j);

    void AEQbTJ();

    DeFiApyDataInfoData EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, @NotNull java.util.List<java.lang.Long> list2);

    boolean EZpvd(@NotNull java.lang.String str);

    DeFiApyDataInfoData OLrzqt(@NotNull java.util.List<java.lang.Long> list);

    SharedFlow<Unit> OLrzqt();

    AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> OLrzqt(@NotNull java.util.List<java.lang.Long> list, @NotNull java.util.List<java.lang.Long> list2);

    java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation);

    void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull android.content.Context context, @NotNull java.util.List<DeFiApyDataInfoData> list);
}
