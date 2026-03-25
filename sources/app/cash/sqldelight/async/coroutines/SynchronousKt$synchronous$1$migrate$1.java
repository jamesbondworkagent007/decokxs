package app.cash.sqldelight.async.coroutines;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.ColorStateList;
import o.IntentSender;
import o.PackageManager;
import o.SharedPreferences;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class SynchronousKt$synchronous$1$migrate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SharedPreferences[] $callbacks;
    final /* synthetic */ PackageManager $driver;
    final /* synthetic */ long $newVersion;
    final /* synthetic */ long $oldVersion;
    final /* synthetic */ ColorStateList<IntentSender.ActionBar<Unit>> $this_synchronous;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronousKt$synchronous$1$migrate$1(ColorStateList<IntentSender.ActionBar<Unit>> colorStateList, PackageManager packageManager, long j, long j2, SharedPreferences[] sharedPreferencesArr, Continuation<? super SynchronousKt$synchronous$1$migrate$1> continuation) {
        super(2, continuation);
        this.$this_synchronous = colorStateList;
        this.$driver = packageManager;
        this.$oldVersion = j;
        this.$newVersion = j2;
        this.$callbacks = sharedPreferencesArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new SynchronousKt$synchronous$1$migrate$1(this.$this_synchronous, this.$driver, this.$oldVersion, this.$newVersion, this.$callbacks, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SynchronousKt$synchronous$1$migrate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ColorStateList<IntentSender.ActionBar<Unit>> colorStateList = this.$this_synchronous;
            PackageManager packageManager = this.$driver;
            long j = this.$oldVersion;
            long j2 = this.$newVersion;
            SharedPreferences[] sharedPreferencesArr = this.$callbacks;
            Function1 function1KWHzl = ((IntentSender.ActionBar) colorStateList.migrate(packageManager, j, j2, (SharedPreferences[]) Arrays.copyOf(sharedPreferencesArr, sharedPreferencesArr.length))).KWHzl();
            this.label = 1;
            if (IntentSender.ActionBar.copydefault(function1KWHzl, (Continuation) this) == objCopydefault) {
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
}
