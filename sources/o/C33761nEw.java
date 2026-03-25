package o;

import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.imui.conversationlist.ConversationInitializer$initConversation$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.RelationSourceType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC36599odx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nEw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C33761nEw {
    public final oCJ EZpvd;

    @yCM
    public C33761nEw(@NotNull oCJ ocj) {
        Intrinsics.checkNotNullParameter(ocj, "");
        this.EZpvd = ocj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, ChatOrigin chatOrigin, java.lang.String str3, @NotNull Continuation<? super AbstractC36599odx> continuation) {
        ConversationInitializer$initConversation$1 conversationInitializer$initConversation$1;
        if (continuation instanceof ConversationInitializer$initConversation$1) {
            conversationInitializer$initConversation$1 = (ConversationInitializer$initConversation$1) continuation;
            int i = conversationInitializer$initConversation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationInitializer$initConversation$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationInitializer$initConversation$1 = new ConversationInitializer$initConversation$1(this, continuation);
            }
        }
        ConversationInitializer$initConversation$1 conversationInitializer$initConversation$12 = conversationInitializer$initConversation$1;
        java.lang.Object objAEQbTJ = conversationInitializer$initConversation$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationInitializer$initConversation$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                RelationSourceType relationSourceTypeAEQbTJ = chatOrigin != null ? C35182nqW.AEQbTJ(chatOrigin) : null;
                oCJ ocj = this.EZpvd;
                conversationInitializer$initConversation$12.label = 1;
                objAEQbTJ = ocj.AEQbTJ(str, str2, relationSourceTypeAEQbTJ, str3, conversationInitializer$initConversation$12);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            return new AbstractC36599odx.Application((OKConversation) objAEQbTJ);
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            return new AbstractC36599odx.Activity(message);
        }
    }
}
