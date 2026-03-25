package com.okinc.im.usecase.emojilist;

import com.okinc.core.util.SPUtils;
import com.okinc.im.imui.messageV2.model.RecentlyEmojiList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes23.dex */
public final class GetRecentlyEmojiListUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RecentlyEmojiList>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetRecentlyEmojiListUseCase$execute$2(Continuation<? super GetRecentlyEmojiListUseCase$execute$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetRecentlyEmojiListUseCase$execute$2(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RecentlyEmojiList> continuation) {
        return ((GetRecentlyEmojiListUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            RecentlyEmojiList recentlyEmojiList = new RecentlyEmojiList();
            List list = (List) SPUtils.getObject("emoji_use_most", List.class);
            ArrayList arrayList = null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    Double d = obj2 instanceof Double ? (Double) obj2 : null;
                    Integer numAEQbTJ = d != null ? C56443yFo.AEQbTJ((int) d.doubleValue()) : null;
                    if (numAEQbTJ != null) {
                        arrayList2.add(numAEQbTJ);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    recentlyEmojiList.addEmoji(((Number) it.next()).intValue());
                }
            }
            return recentlyEmojiList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
