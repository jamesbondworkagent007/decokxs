package com.amplitude.android.utilities;

import com.amplitude.core.Storage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultEventUtils$trackAppUpdatedInstalledEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentBuild;
    final /* synthetic */ String $currentVersion;
    final /* synthetic */ Storage $storage;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultEventUtils$trackAppUpdatedInstalledEvent$1(Storage storage, String str, String str2, Continuation<? super DefaultEventUtils$trackAppUpdatedInstalledEvent$1> continuation) {
        super(2, continuation);
        this.$storage = storage;
        this.$currentVersion = str;
        this.$currentBuild = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new DefaultEventUtils$trackAppUpdatedInstalledEvent$1(this.$storage, this.$currentVersion, this.$currentBuild, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultEventUtils$trackAppUpdatedInstalledEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Storage storage = this.$storage;
            Storage.Constants constants = Storage.Constants.APP_VERSION;
            String str = this.$currentVersion;
            Intrinsics.checkNotNullExpressionValue(str, "");
            this.label = 1;
            if (storage.EZpvd(constants, str, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        Storage storage2 = this.$storage;
        Storage.Constants constants2 = Storage.Constants.APP_BUILD;
        String str2 = this.$currentBuild;
        this.label = 2;
        if (storage2.EZpvd(constants2, str2, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
