package com.reown.android.internal.common.storage.push_messages;

import android.database.sqlite.SQLiteException;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.sdk.storage.data.dao.PushMessageQueries;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class PushMessagesRepository {
    public final MutableStateFlow<Boolean> _arePushNotificationsEnabled;
    public final StateFlow<Boolean> arePushNotificationsEnabled;
    public final List<Integer> notificationTags;
    public final PushMessageQueries pushMessageQueries;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> getArePushNotificationsEnabled() {
        return this.arePushNotificationsEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getNotificationTags() {
        return this.notificationTags;
    }

    public PushMessagesRepository(@NotNull PushMessageQueries pushMessageQueries) {
        Intrinsics.checkNotNullParameter(pushMessageQueries, "");
        this.pushMessageQueries = pushMessageQueries;
        this.notificationTags = yDY.gEmmrt(Integer.valueOf(Tags.SESSION_PROPOSE.getId()), Integer.valueOf(Tags.SESSION_REQUEST.getId()), Integer.valueOf(Tags.NOTIFY_MESSAGE.getId()), Integer.valueOf(Tags.SESSION_AUTHENTICATE.getId()));
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._arePushNotificationsEnabled = MutableStateFlow;
        this.arePushNotificationsEnabled = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void enablePushNotifications() {
        this._arePushNotificationsEnabled.setValue(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.push_messages.PushMessagesRepository$insertPushMessage$2, reason: invalid class name and case insensitive filesystem */
    public static final class C18042 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $blob;
        public final /* synthetic */ String $id;
        public final /* synthetic */ int $tag;
        public final /* synthetic */ String $topic;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18042(String str, String str2, String str3, int i, Continuation<? super C18042> continuation) {
            super(2, continuation);
            this.$id = str;
            this.$topic = str2;
            this.$blob = str3;
            this.$tag = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PushMessagesRepository.this.new C18042(this.$id, this.$topic, this.$blob, this.$tag, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18042) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                PushMessagesRepository.this.pushMessageQueries.upsertMessage(this.$id, this.$topic, this.$blob, this.$tag);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object insertPushMessage(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull Continuation<? super Unit> continuation) throws SQLiteException {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C18042(str, str2, str3, i, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.push_messages.PushMessagesRepository$doesPushMessageExist$2, reason: invalid class name and case insensitive filesystem */
    public static final class C18032 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public final /* synthetic */ String $id;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18032(String str, Continuation<? super C18032> continuation) {
            super(2, continuation);
            this.$id = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PushMessagesRepository.this.new C18032(this.$id, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C18032) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Boolean boolExecuteAsOneOrNull = PushMessagesRepository.this.pushMessageQueries.doesMessagesExistsByRequestId(this.$id).executeAsOneOrNull();
                return C56443yFo.KWHzl(boolExecuteAsOneOrNull != null ? boolExecuteAsOneOrNull.booleanValue() : false);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object doesPushMessageExist(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) throws SQLiteException {
        return BuildersKt.withContext(Dispatchers.getIO(), new C18032(str, null), continuation);
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.push_messages.PushMessagesRepository$deletePushMessagesByTopic$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $topic;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$topic = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PushMessagesRepository.this.new AnonymousClass2(this.$topic, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                PushMessagesRepository.this.pushMessageQueries.deleteMessageByTopic(this.$topic);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object deletePushMessagesByTopic(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws SQLiteException {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
