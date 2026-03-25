package o;

import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface xPY extends InterfaceC54647xQc {
    void EZpvd(@NotNull java.util.List<C40453qWk> list);

    void KWHzl(@NotNull Function1<? super java.util.List<WatchListData>, Unit> function1);

    void copydefault(@NotNull java.util.List<WatchListData> list, @NotNull Function1<? super Result<Unit>, Unit> function1);
}
