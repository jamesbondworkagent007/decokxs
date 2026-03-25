package com.okinc.okimcore.feature.message.repository.local.inhouseim.reactionemoji;

import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDetail;
import com.okinc.okimcore.model.room.inhouseim.EmojiReactionEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface EmojiReactionDao {

    /* JADX INFO: renamed from: com.okinc.okimcore.feature.message.repository.local.inhouseim.reactionemoji.EmojiReactionDao$updateReactionsInTransaction$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TaskDescription.KWHzl(null, null, null, this);
        }
    }

    Object deleteAllForMessage(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    Object getMessageReactionDetails(@NotNull String str, @NotNull Continuation<? super List<ReactionDetail>> continuation);

    Object getMessageReactionPrivateChatDetails(@NotNull String str, @NotNull Continuation<? super List<ReactionDetail>> continuation);

    Object getReactionsForMessage(@NotNull String str, @NotNull Continuation<? super List<EmojiReactionEntity>> continuation);

    Object insertAll(@NotNull List<EmojiReactionEntity> list, @NotNull Continuation<? super Unit> continuation);

    Object updateReactionsInTransaction(@NotNull String str, @NotNull List<EmojiReactionEntity> list, @NotNull Continuation<? super Boolean> continuation);

    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object KWHzl(@NotNull EmojiReactionDao emojiReactionDao, @NotNull String str, @NotNull List<EmojiReactionEntity> list, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
            AnonymousClass1 anonymousClass1;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i = anonymousClass1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(continuation);
                }
            }
            Object obj = anonymousClass1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = anonymousClass1.label;
            boolean z = true;
            try {
            } catch (Exception e) {
                C44124sEe.imLogSync$default("Reaction Transaction => failed", e, null, 4, null);
                z = false;
            }
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                anonymousClass1.L$0 = emojiReactionDao;
                anonymousClass1.L$1 = list;
                anonymousClass1.label = 1;
                if (emojiReactionDao.deleteAllForMessage(str, anonymousClass1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return C56443yFo.KWHzl(z);
                }
                list = (List) anonymousClass1.L$1;
                emojiReactionDao = (EmojiReactionDao) anonymousClass1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            if (!list.isEmpty()) {
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                if (emojiReactionDao.insertAll(list, anonymousClass1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return C56443yFo.KWHzl(z);
        }
    }
}
