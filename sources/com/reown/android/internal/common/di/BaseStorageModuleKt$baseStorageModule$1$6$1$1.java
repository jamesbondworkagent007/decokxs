package com.reown.android.internal.common.di;

import com.reown.android.internal.common.di.BaseStorageModuleKt;
import com.reown.android.sdk.core.AndroidCoreDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.C60060zuj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BaseStorageModuleKt$baseStorageModule$1$6$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ AndroidCoreDatabase $database;
    public final /* synthetic */ C60060zuj $this_single;
    public int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseStorageModuleKt$baseStorageModule$1$6$1$1(AndroidCoreDatabase androidCoreDatabase, C60060zuj c60060zuj, Continuation<? super BaseStorageModuleKt$baseStorageModule$1$6$1$1> continuation) {
        super(2, continuation);
        this.$database = androidCoreDatabase;
        this.$this_single = c60060zuj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new BaseStorageModuleKt$baseStorageModule$1$6$1$1(this.$database, this.$this_single, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseStorageModuleKt$baseStorageModule$1$6$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                this.$database.getJsonRpcHistoryQueries().selectLastInsertedRowId().executeAsOneOrNull();
            } catch (Exception unused) {
                C60060zuj c60060zuj = this.$this_single;
                DatabaseConfigKt.deleteDatabase(c60060zuj, ((DatabaseConfig) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(DatabaseConfig.class), null, null)).getANDROID_CORE_DB_NAME());
                BaseStorageModuleKt.AnonymousClass1.invoke$createCoreDB(this.$this_single);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
