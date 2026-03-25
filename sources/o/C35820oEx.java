package o;

import com.okinc.im.imui.messageV2.model.SendMessageRequest;
import com.okinc.im.usecase.message.SendMultipleMessageUseCase$execute$2;
import com.okinc.okimcore.model.exception.BeingBlockedException;
import com.okinc.okimcore.model.exception.ConversationNotFoundException;
import com.okinc.okimcore.model.exception.EmptyInputTextException;
import com.okinc.okimcore.model.exception.MissingMediaPathException;
import com.okinc.okimcore.model.exception.NotAllowToSendLinkException;
import com.okinc.okimcore.model.exception.ReferenceMessageNotFoundException;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35820oEx {
    public final oEA KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C35820oEx(@NotNull oEA oea, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(oea, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = oea;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<SendMessageRequest> list, @NotNull Continuation<? super java.util.List<OKMessage>> continuation) throws ReferenceMessageNotFoundException, ConversationNotFoundException, EmptyInputTextException, MissingMediaPathException, NotAllowToSendLinkException, BeingBlockedException {
        return BuildersKt.withContext(this.OLrzqt, new SendMultipleMessageUseCase$execute$2(list, this, null), continuation);
    }
}
