package com.okinc.okex.deeplink;

import android.content.Context;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.okex.deeplink.ChatbotOkAssistantDeeplinkHandler$handleDeeplink$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC45197slJ;
import o.C45193slF;
import o.C56391yDq;
import o.C56442yFn;
import o.C6805aWM;

/* JADX INFO: loaded from: classes10.dex */
public final class ChatbotOkAssistantDeeplinkHandler$handleDeeplink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $contextualParams;
    final /* synthetic */ Map<String, String> $extras;
    final /* synthetic */ String $okaChatbotMessage;
    final /* synthetic */ String $okaFrom;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatbotOkAssistantDeeplinkHandler$handleDeeplink$1(Context context, String str, String str2, String str3, Map<String, String> map, Continuation<? super ChatbotOkAssistantDeeplinkHandler$handleDeeplink$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$okaFrom = str;
        this.$okaChatbotMessage = str2;
        this.$contextualParams = str3;
        this.$extras = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatbotOkAssistantDeeplinkHandler$handleDeeplink$1(this.$context, this.$okaFrom, this.$okaChatbotMessage, this.$contextualParams, this.$extras, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatbotOkAssistantDeeplinkHandler$handleDeeplink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45193slF c45193slF = C45193slF.copydefault;
            final String str = this.$okaFrom;
            final String str2 = this.$okaChatbotMessage;
            final String str3 = this.$contextualParams;
            final Map<String, String> map = this.$extras;
            AbstractC45197slJ.StateListAnimator stateListAnimatorOLrzqt = c45193slF.OLrzqt(C6805aWM.OLrzqt(new Function1() { // from class: o.sqA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ChatbotOkAssistantDeeplinkHandler$handleDeeplink$1.invokeSuspend$lambda$0(str, str2, str3, map, (ChatBotRequest) obj2);
                }
            }));
            Context context = this.$context;
            this.label = 1;
            if (c45193slF.copydefault(context, stateListAnimatorOLrzqt, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(String str, String str2, String str3, Map map, ChatBotRequest chatBotRequest) {
        chatBotRequest.setOkaFrom(str);
        chatBotRequest.setOkaChatbotMessage(str2);
        chatBotRequest.setContextualParams(str3);
        chatBotRequest.getExtraParams().putAll(map);
        return Unit.INSTANCE;
    }
}
