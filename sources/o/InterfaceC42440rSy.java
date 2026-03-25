package o;

import com.okinc.kyc.api.biz.callback.ExtParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rSy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC42440rSy extends InterfaceC43217rlC {
    java.lang.String KWHzl();

    java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull pHD phd, java.lang.Integer num, ExtParams extParams, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull pHD phd, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull pHD phd, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super Unit> continuation);
}
