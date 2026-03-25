package o;

import com.okinc.kline.news.data.vo.KlineFlashVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oXw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36332oXw extends C59534zip {
    public C36332oXw(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        register(KlineFlashVo.class, new C36334oXy());
        register(C36328oXs.class, new C36333oXx(function0));
    }
}
