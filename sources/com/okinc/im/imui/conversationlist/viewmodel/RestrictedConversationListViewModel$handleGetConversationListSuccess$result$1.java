package com.okinc.im.imui.conversationlist.viewmodel;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.nGE;

/* JADX INFO: loaded from: classes8.dex */
public final class RestrictedConversationListViewModel$handleGetConversationListSuccess$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<nGE>>, Object> {
    final /* synthetic */ List<OKConversation> $list;
    int label;
    final /* synthetic */ RestrictedConversationListViewModel this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestrictedConversationListViewModel$handleGetConversationListSuccess$result$1(RestrictedConversationListViewModel restrictedConversationListViewModel, List<OKConversation> list, Continuation<? super RestrictedConversationListViewModel$handleGetConversationListSuccess$result$1> continuation) {
        super(2, continuation);
        this.this$0 = restrictedConversationListViewModel;
        this.$list = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RestrictedConversationListViewModel$handleGetConversationListSuccess$result$1(this.this$0, this.$list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<nGE>> continuation) {
        return ((RestrictedConversationListViewModel$handleGetConversationListSuccess$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            RestrictedConversationListViewModel restrictedConversationListViewModel = this.this$0;
            List<OKConversation> list = this.$list;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (TaskDescription.KWHzl[((OKConversation) obj2).getConversationType().ordinal()] != 1 || restrictedConversationListViewModel.zLjUOn()) {
                    arrayList.add(obj2);
                }
            }
            return restrictedConversationListViewModel.EZpvd(arrayList);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
