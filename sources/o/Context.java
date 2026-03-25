package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AssetManager;
import o.C56391yDq;
import o.C56442yFn;
import o.IntentSender;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Context {
    public static /* synthetic */ java.lang.Object awaitQuery$default(PackageManager packageManager, java.lang.Integer num, java.lang.String str, Function2 function2, int i, Function1 function1, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        return EZpvd(packageManager, num, str, function2, i, function1, continuation);
    }

    public static final <R> java.lang.Object EZpvd(@NotNull PackageManager packageManager, java.lang.Integer num, @NotNull java.lang.String str, @NotNull final Function2<? super AssetManager, ? super Continuation<? super R>, ? extends java.lang.Object> function2, int i, Function1<? super Configuration, Unit> function1, @NotNull Continuation<? super R> continuation) {
        return packageManager.OLrzqt(num, str, new Function1<AssetManager, IntentSender<R>>() { // from class: app.cash.sqldelight.async.coroutines.DriverExtensionsKt$awaitQuery$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super o.AssetManager, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX INFO: renamed from: app.cash.sqldelight.async.coroutines.DriverExtensionsKt$awaitQuery$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super R>, Object> {
                final /* synthetic */ AssetManager $it;
                final /* synthetic */ Function2<AssetManager, Continuation<? super R>, Object> $mapper;
                int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super o.AssetManager, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(Function2<? super AssetManager, ? super Continuation<? super R>, ? extends Object> function2, AssetManager assetManager, Continuation<? super AnonymousClass1> continuation) {
                    super(1, continuation);
                    this.$mapper = function2;
                    this.$it = assetManager;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.$mapper, this.$it, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Continuation<? super R> continuation) {
                    return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        Function2<AssetManager, Continuation<? super R>, Object> function2 = this.$mapper;
                        AssetManager assetManager = this.$it;
                        this.label = 1;
                        obj = function2.invoke(assetManager, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                    }
                    return obj;
                }
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final IntentSender<R> invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                return IntentSender.ActionBar.copydefault(IntentSender.ActionBar.AEQbTJ(new AnonymousClass1(function2, assetManager, null)));
            }
        }, i, function1).copydefault(continuation);
    }

    public static /* synthetic */ java.lang.Object await$default(PackageManager packageManager, java.lang.Integer num, java.lang.String str, int i, Function1 function1, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        return OLrzqt(packageManager, num, str, i, function1, continuation);
    }

    public static final java.lang.Object OLrzqt(@NotNull PackageManager packageManager, java.lang.Integer num, @NotNull java.lang.String str, int i, Function1<? super Configuration, Unit> function1, @NotNull Continuation<? super java.lang.Long> continuation) {
        return packageManager.AEQbTJ(num, str, i, function1).copydefault(continuation);
    }
}
