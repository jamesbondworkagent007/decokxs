package o;

import com.okinc.im.impl.InhouseIMAudioCallMessageSender$sendCallMessage$1;
import com.okinc.im.impl.InhouseIMAudioCallMessageSender$sendCallMessage$2;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKIMStartVoiceCallMessage;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C35340ntV {
    public static final int OLrzqt = sHU.KWHzl;
    public final sHU copydefault;

    @yCM
    public C35340ntV(@NotNull sHU shu) {
        Intrinsics.checkNotNullParameter(shu, "");
        this.copydefault = shu;
    }

    public final OKMessage copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return OKMessage.Companion.AEQbTJ(str, OKConversationType.PRIVATE, new OKIMStartVoiceCallMessage(2, 1, null, C44157sFk.copydefault(C44157sFk.gEmmrt()), null, 4, null));
    }

    public final OKMessage EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return OKMessage.Companion.AEQbTJ(str, OKConversationType.PRIVATE, new OKIMStartVoiceCallMessage(2, 4, null, str2, null, 4, null));
    }

    public final OKMessage EZpvd(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return OKMessage.Companion.AEQbTJ(str, OKConversationType.PRIVATE, new OKIMStartVoiceCallMessage(2, 7, null, C44157sFk.copydefault(C44157sFk.gEmmrt()), java.lang.Integer.valueOf(i), 4, null));
    }

    public static /* synthetic */ OKMessage callCompletedMessage$default(C35340ntV c35340ntV, java.lang.String str, java.lang.String str2, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        return c35340ntV.AEQbTJ(str, str2, l);
    }

    public final OKMessage AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return OKMessage.Companion.AEQbTJ(str, OKConversationType.PRIVATE, new OKIMStartVoiceCallMessage(2, 8, l, str2, null));
    }

    public final OKMessage AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = 2;
        return OKMessage.Companion.AEQbTJ(str, OKConversationType.PRIVATE, new OKIMStartVoiceCallMessage(i, i, null, C44157sFk.copydefault(C44157sFk.gEmmrt()), null, 4, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull OKMessage oKMessage, @NotNull Continuation<? super OKMessage> continuation) throws java.lang.Throwable {
        InhouseIMAudioCallMessageSender$sendCallMessage$1 inhouseIMAudioCallMessageSender$sendCallMessage$1;
        if (continuation instanceof InhouseIMAudioCallMessageSender$sendCallMessage$1) {
            inhouseIMAudioCallMessageSender$sendCallMessage$1 = (InhouseIMAudioCallMessageSender$sendCallMessage$1) continuation;
            int i = inhouseIMAudioCallMessageSender$sendCallMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inhouseIMAudioCallMessageSender$sendCallMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                inhouseIMAudioCallMessageSender$sendCallMessage$1 = new InhouseIMAudioCallMessageSender$sendCallMessage$1(this, continuation);
            }
        }
        java.lang.Object obj = inhouseIMAudioCallMessageSender$sendCallMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inhouseIMAudioCallMessageSender$sendCallMessage$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            OKMessage oKMessage2 = (OKMessage) inhouseIMAudioCallMessageSender$sendCallMessage$1.L$0;
            C56391yDq.AEQbTJ(obj);
            return oKMessage2;
        }
        C56391yDq.AEQbTJ(obj);
        Flow flowOnEach = FlowKt.onEach(this.copydefault.AkhnZx().KWHzl(oKMessage), new InhouseIMAudioCallMessageSender$sendCallMessage$2(null));
        inhouseIMAudioCallMessageSender$sendCallMessage$1.L$0 = oKMessage;
        inhouseIMAudioCallMessageSender$sendCallMessage$1.label = 1;
        return FlowKt.collect(flowOnEach, inhouseIMAudioCallMessageSender$sendCallMessage$1) == objCopydefault ? objCopydefault : oKMessage;
    }
}
