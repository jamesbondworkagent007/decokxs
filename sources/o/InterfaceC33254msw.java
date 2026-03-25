package o;

import com.okinc.core.ok_app.api.bean.AccessibilityServiceInfoDetails;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.msw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC33254msw extends InterfaceC43295rmb {
    java.lang.String AEQbTJ();

    boolean EZpvd();

    java.lang.Object KWHzl(@NotNull JsonObject jsonObject, @NotNull Continuation<? super Result<Unit>> continuation);

    void KWHzl(@NotNull android.app.Activity activity);

    void KWHzl(@NotNull java.util.List<AccessibilityServiceInfoDetails> list);

    void OLrzqt();

    void OLrzqt(@NotNull android.content.Context context);

    void copydefault();
}
