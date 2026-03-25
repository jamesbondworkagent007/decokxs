package o;

import com.okinc.okimcore.channel.inhouse.impl.InHouseIMClearImpl$deleteConversation$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sEg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44126sEg implements InterfaceC44282sKa {
    public final InterfaceC44301sKt EZpvd;
    public final sHU copydefault;

    public C44126sEg(@NotNull sHU shu, @NotNull InterfaceC44301sKt interfaceC44301sKt) {
        Intrinsics.checkNotNullParameter(shu, "");
        Intrinsics.checkNotNullParameter(interfaceC44301sKt, "");
        this.copydefault = shu;
        this.EZpvd = interfaceC44301sKt;
    }

    @Override // o.InterfaceC44282sKa
    public java.lang.Object KWHzl(@NotNull OKConversation oKConversation, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.copydefault.OLrzqt().copydefault(oKConversation.getTargetId(), continuation);
    }

    @Override // o.InterfaceC44282sKa
    public java.lang.Object KWHzl(@NotNull OKMessage oKMessage, java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.String targetId = oKMessage.getTargetId();
        long seq = oKMessage.getSeq();
        OKConversationType conversationType = oKMessage.getConversationType();
        OKMessageContent content = oKMessage.getContent();
        if (content == null) {
            C44124sEe.imLogRecallReceipt$default(targetId, "[" + seq + "], recall message with no message content, content=" + content, null, 4, null);
            return Unit.INSTANCE;
        }
        java.lang.Object objKWHzl = this.EZpvd.KWHzl(targetId, seq, conversationType, content, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44282sKa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull OKConversation oKConversation, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InHouseIMClearImpl$deleteConversation$1 inHouseIMClearImpl$deleteConversation$1;
        if (continuation instanceof InHouseIMClearImpl$deleteConversation$1) {
            inHouseIMClearImpl$deleteConversation$1 = (InHouseIMClearImpl$deleteConversation$1) continuation;
            int i = inHouseIMClearImpl$deleteConversation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMClearImpl$deleteConversation$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMClearImpl$deleteConversation$1 = new InHouseIMClearImpl$deleteConversation$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMClearImpl$deleteConversation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMClearImpl$deleteConversation$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            sGI sgiOLrzqt = this.copydefault.OLrzqt();
            java.lang.String targetId = oKConversation.getTargetId();
            InGroupStatus inGroupStatus = InGroupStatus.NOT_IN_GROUP;
            inHouseIMClearImpl$deleteConversation$1.L$0 = oKConversation;
            inHouseIMClearImpl$deleteConversation$1.label = 1;
            if (sgiOLrzqt.OLrzqt(targetId, inGroupStatus, inHouseIMClearImpl$deleteConversation$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oKConversation = (OKConversation) inHouseIMClearImpl$deleteConversation$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        sDZ.AEQbTJ.AYXKKw().AEQbTJ(oKConversation);
        return Unit.INSTANCE;
    }
}
