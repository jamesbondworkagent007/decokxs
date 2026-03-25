package com.reown.sign.di;

import com.reown.android.internal.common.di.DatabaseConfigKt;
import com.reown.sign.SignDatabase;
import com.reown.sign.di.StorageModuleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C60060zuj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class StorageModuleKt$storageModule$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $dbName;
    public final /* synthetic */ SignDatabase $signDatabase;
    public final /* synthetic */ C60060zuj $this_single;
    public int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageModuleKt$storageModule$1$1$1$1(SignDatabase signDatabase, C60060zuj c60060zuj, String str, Continuation<? super StorageModuleKt$storageModule$1$1$1$1> continuation) {
        super(2, continuation);
        this.$signDatabase = signDatabase;
        this.$this_single = c60060zuj;
        this.$dbName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new StorageModuleKt$storageModule$1$1$1$1(this.$signDatabase, this.$this_single, this.$dbName, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StorageModuleKt$storageModule$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                this.$signDatabase.getSessionDaoQueries().lastInsertedRow().executeAsOneOrNull();
            } catch (Exception unused) {
                DatabaseConfigKt.deleteDatabase(this.$this_single, this.$dbName);
                StorageModuleKt.AnonymousClass1.invoke$createSignDB(this.$this_single, this.$dbName);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
