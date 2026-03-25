package o;

import com.okinc.im.imui.messageV2.model.SendMessageRequest;
import com.okinc.im.usecase.message.SendMessageUseCase$execute$2;
import com.okinc.okimcore.model.exception.BeingBlockedException;
import com.okinc.okimcore.model.exception.ConversationNotFoundException;
import com.okinc.okimcore.model.exception.EmptyInputTextException;
import com.okinc.okimcore.model.exception.MissingMediaPathException;
import com.okinc.okimcore.model.exception.NotAllowToSendLinkException;
import com.okinc.okimcore.model.exception.ReferenceMessageNotFoundException;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEA {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final C35805oEi AEQbTJ;
    public final oEB AYXKKw;
    public final C35817oEu AhwBna;
    public final C35842oFs KWHzl;
    public final oCE OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final oDI djBIcL;
    public final C35857oGg gEmmrt;
    public final C35815oEs valueOf;

    @yCM
    public oEA(@NotNull oCE oce, @NotNull oDI odi, @NotNull C35857oGg c35857oGg, @NotNull C35805oEi c35805oEi, @NotNull C35842oFs c35842oFs, @NotNull oEB oeb, @NotNull C35817oEu c35817oEu, @NotNull C35815oEs c35815oEs, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(oce, "");
        Intrinsics.checkNotNullParameter(odi, "");
        Intrinsics.checkNotNullParameter(c35857oGg, "");
        Intrinsics.checkNotNullParameter(c35805oEi, "");
        Intrinsics.checkNotNullParameter(c35842oFs, "");
        Intrinsics.checkNotNullParameter(oeb, "");
        Intrinsics.checkNotNullParameter(c35817oEu, "");
        Intrinsics.checkNotNullParameter(c35815oEs, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = oce;
        this.djBIcL = odi;
        this.gEmmrt = c35857oGg;
        this.AEQbTJ = c35805oEi;
        this.KWHzl = c35842oFs;
        this.AYXKKw = oeb;
        this.AhwBna = c35817oEu;
        this.valueOf = c35815oEs;
        this.copydefault = coroutineDispatcher;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEA.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull SendMessageRequest sendMessageRequest, @NotNull Continuation<? super OKMessage> continuation) throws ReferenceMessageNotFoundException, ConversationNotFoundException, EmptyInputTextException, MissingMediaPathException, NotAllowToSendLinkException, BeingBlockedException {
        return BuildersKt.withContext(this.copydefault, new SendMessageUseCase$execute$2(sendMessageRequest, this, null), continuation);
    }
}
