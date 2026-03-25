package com.reown.sign.storage.link_mode;

import android.database.sqlite.SQLiteException;
import com.reown.sign.storage.data.dao.linkmode.LinkModeDaoQueries;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class LinkModeStorageRepository {
    public final LinkModeDaoQueries linkModeDaoQueries;

    public LinkModeStorageRepository(@NotNull LinkModeDaoQueries linkModeDaoQueries) {
        Intrinsics.checkNotNullParameter(linkModeDaoQueries, "");
        this.linkModeDaoQueries = linkModeDaoQueries;
    }

    /* JADX INFO: renamed from: com.reown.sign.storage.link_mode.LinkModeStorageRepository$insert$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $appLink;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$appLink = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return LinkModeStorageRepository.this.new AnonymousClass2(this.$appLink, continuation);
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
                LinkModeStorageRepository.this.linkModeDaoQueries.insertOrIgnore(this.$appLink);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final /* synthetic */ Object insert(String str, Continuation continuation) throws SQLiteException {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.reown.sign.storage.link_mode.LinkModeStorageRepository$isEnabled$2, reason: invalid class name and case insensitive filesystem */
    public static final class C20262 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public final /* synthetic */ String $appLink;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20262(String str, Continuation<? super C20262> continuation) {
            super(2, continuation);
            this.$appLink = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return LinkModeStorageRepository.this.new C20262(this.$appLink, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C20262) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                return C56443yFo.KWHzl(LinkModeStorageRepository.this.linkModeDaoQueries.isEnabled(this.$appLink).executeAsOneOrNull() != null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final /* synthetic */ Object isEnabled(String str, Continuation continuation) throws SQLiteException {
        return BuildersKt.withContext(Dispatchers.getIO(), new C20262(str, null), continuation);
    }
}
