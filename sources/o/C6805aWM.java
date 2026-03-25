package o;

import com.okinc.biz.bean.ChatBotRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aWM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6805aWM {
    public static final ChatBotRequest OLrzqt(@NotNull Function1<? super ChatBotRequest, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        ChatBotRequest chatBotRequest = new ChatBotRequest();
        function1.invoke(chatBotRequest);
        return chatBotRequest;
    }
}
