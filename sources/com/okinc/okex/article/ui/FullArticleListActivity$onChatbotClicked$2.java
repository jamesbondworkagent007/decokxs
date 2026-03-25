package com.okinc.okex.article.ui;

import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.okex.article.ui.FullArticleListActivity;
import com.okinc.okex.article.ui.FullArticleListActivity$onChatbotClicked$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45193slF;
import o.C56391yDq;
import o.C56442yFn;
import o.C6805aWM;

/* JADX INFO: loaded from: classes10.dex */
public final class FullArticleListActivity$onChatbotClicked$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $slug;
    int label;
    final /* synthetic */ FullArticleListActivity this$0;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FullArticleListActivity.FullArticleListRequest.FullArticleListSource.values().length];
            try {
                iArr[FullArticleListActivity.FullArticleListRequest.FullArticleListSource.FAQS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullArticleListActivity$onChatbotClicked$2(FullArticleListActivity fullArticleListActivity, String str, Continuation<? super FullArticleListActivity$onChatbotClicked$2> continuation) {
        super(2, continuation);
        this.this$0 = fullArticleListActivity;
        this.$slug = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FullArticleListActivity$onChatbotClicked$2(this.this$0, this.$slug, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FullArticleListActivity$onChatbotClicked$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45193slF c45193slF = C45193slF.copydefault;
            final FullArticleListActivity fullArticleListActivity = this.this$0;
            final String str = this.$slug;
            ChatBotRequest chatBotRequestOLrzqt = C6805aWM.OLrzqt(new Function1() { // from class: o.sdt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return FullArticleListActivity$onChatbotClicked$2.invokeSuspend$lambda$0(fullArticleListActivity, str, (ChatBotRequest) obj2);
                }
            });
            this.label = 1;
            if (c45193slF.EZpvd(fullArticleListActivity, chatBotRequestOLrzqt, this) == objCopydefault) {
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
    public static final Unit invokeSuspend$lambda$0(FullArticleListActivity fullArticleListActivity, String str, ChatBotRequest chatBotRequest) {
        String str2;
        if (StateListAnimator.copydefault[fullArticleListActivity.fJNWhG().ordinal()] == 1) {
            str2 = "cg_all-topics_" + str;
        } else {
            str2 = "cg_hot-topics_" + str;
        }
        chatBotRequest.setOkaFrom(str2);
        return Unit.INSTANCE;
    }
}
