package o;

import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface sIW {
    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super C44458sQo> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, long j, java.lang.String str2, java.lang.Boolean bool, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num, @NotNull Continuation<? super GroupAnnouncementInfo> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super Unit> continuation);
}
