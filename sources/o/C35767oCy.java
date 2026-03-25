package o;

import com.okinc.im.imui.chatsettings.model.ChatSettingsResult;
import com.okinc.im.usecase.chatsettings.FetchChatSettingsUseCase$getPrivacySettings$1;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35767oCy {
    public final InterfaceC35180nqU EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C35767oCy(InterfaceC35180nqU interfaceC35180nqU, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC35180nqU;
        this.copydefault = coroutineDispatcher;
    }

    public final Flow<Result<ChatSettingsResult>> KWHzl() {
        return FlowKt.flow(new FetchChatSettingsUseCase$getPrivacySettings$1(this, null));
    }
}
