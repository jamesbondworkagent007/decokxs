package o;

import app.cash.sqldelight.async.coroutines.QueryExtensionsKt$awaitAsOne$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AssetManager;
import o.C56391yDq;
import o.C56442yFn;
import o.IntentSender;
import o.PictureInPictureParams;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Intent {
    public static final <T> java.lang.Object EZpvd(@NotNull final PictureInPictureParams<? extends T> pictureInPictureParams, @NotNull Continuation<? super java.util.List<? extends T>> continuation) {
        return pictureInPictureParams.execute(new Function1<AssetManager, IntentSender<java.util.List<T>>>() { // from class: app.cash.sqldelight.async.coroutines.QueryExtensionsKt$awaitAsList$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.PictureInPictureParams<? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final IntentSender<List<T>> invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                IntentSender<Boolean> intentSenderKWHzl = assetManager.KWHzl();
                ArrayList arrayList = new ArrayList();
                if (intentSenderKWHzl instanceof IntentSender.ActionBar) {
                    return IntentSender.ActionBar.copydefault(IntentSender.ActionBar.AEQbTJ(new AnonymousClass1(intentSenderKWHzl, arrayList, pictureInPictureParams, assetManager, null)));
                }
                if (intentSenderKWHzl instanceof IntentSender.Activity) {
                    if (!intentSenderKWHzl.copydefault().booleanValue()) {
                        return IntentSender.Activity.EZpvd(IntentSender.Activity.copydefault(arrayList));
                    }
                    arrayList.add(pictureInPictureParams.getMapper().invoke(assetManager));
                    while (assetManager.KWHzl().copydefault().booleanValue()) {
                        arrayList.add(pictureInPictureParams.getMapper().invoke(assetManager));
                    }
                    return IntentSender.Activity.EZpvd(IntentSender.Activity.copydefault(arrayList));
                }
                throw new NoWhenBranchMatchedException();
            }

            /* JADX INFO: renamed from: app.cash.sqldelight.async.coroutines.QueryExtensionsKt$awaitAsList$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super List<T>>, Object> {
                final /* synthetic */ AssetManager $cursor;
                final /* synthetic */ IntentSender<Boolean> $first;
                final /* synthetic */ List<T> $result;
                final /* synthetic */ PictureInPictureParams<T> $this_awaitAsList;
                int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.PictureInPictureParams<? extends T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(IntentSender<Boolean> intentSender, List<T> list, PictureInPictureParams<? extends T> pictureInPictureParams, AssetManager assetManager, Continuation<? super AnonymousClass1> continuation) {
                    super(1, continuation);
                    this.$first = intentSender;
                    this.$result = list;
                    this.$this_awaitAsList = pictureInPictureParams;
                    this.$cursor = assetManager;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.$first, this.$result, this.$this_awaitAsList, this.$cursor, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Continuation<? super List<T>> continuation) {
                    return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:19:0x0054). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        IntentSender<Boolean> intentSender = this.$first;
                        this.label = 1;
                        obj = intentSender.copydefault(this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (i == 1) {
                        C56391yDq.AEQbTJ(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        if (((Boolean) obj).booleanValue()) {
                            this.$result.add(this.$this_awaitAsList.getMapper().invoke(this.$cursor));
                            IntentSender<Boolean> intentSenderKWHzl = this.$cursor.KWHzl();
                            this.label = 2;
                            obj = intentSenderKWHzl.copydefault(this);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            if (((Boolean) obj).booleanValue()) {
                                return this.$result;
                            }
                        }
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        return this.$result;
                    }
                    this.$result.add(this.$this_awaitAsList.getMapper().invoke(this.$cursor));
                    IntentSender<Boolean> intentSenderKWHzl2 = this.$cursor.KWHzl();
                    this.label = 2;
                    obj = intentSenderKWHzl2.copydefault(this);
                    if (obj == objCopydefault) {
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
            }
        }).copydefault(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object AEQbTJ(@NotNull PictureInPictureParams<? extends T> pictureInPictureParams, @NotNull Continuation<? super T> continuation) throws java.lang.Throwable {
        QueryExtensionsKt$awaitAsOne$1 queryExtensionsKt$awaitAsOne$1;
        if (continuation instanceof QueryExtensionsKt$awaitAsOne$1) {
            queryExtensionsKt$awaitAsOne$1 = (QueryExtensionsKt$awaitAsOne$1) continuation;
            int i = queryExtensionsKt$awaitAsOne$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                queryExtensionsKt$awaitAsOne$1.label = i - Integer.MIN_VALUE;
            } else {
                queryExtensionsKt$awaitAsOne$1 = new QueryExtensionsKt$awaitAsOne$1(continuation);
            }
        }
        java.lang.Object objKWHzl = queryExtensionsKt$awaitAsOne$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = queryExtensionsKt$awaitAsOne$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            queryExtensionsKt$awaitAsOne$1.L$0 = pictureInPictureParams;
            queryExtensionsKt$awaitAsOne$1.label = 1;
            objKWHzl = KWHzl(pictureInPictureParams, queryExtensionsKt$awaitAsOne$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pictureInPictureParams = (PictureInPictureParams) queryExtensionsKt$awaitAsOne$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        if (objKWHzl != null) {
            return objKWHzl;
        }
        throw new java.lang.NullPointerException("ResultSet returned null for " + pictureInPictureParams);
    }

    public static final <T> java.lang.Object KWHzl(@NotNull final PictureInPictureParams<? extends T> pictureInPictureParams, @NotNull Continuation<? super T> continuation) {
        return pictureInPictureParams.execute(new Function1<AssetManager, IntentSender<T>>() { // from class: app.cash.sqldelight.async.coroutines.QueryExtensionsKt$awaitAsOneOrNull$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.PictureInPictureParams<? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final IntentSender<T> invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                IntentSender<Boolean> intentSenderKWHzl = assetManager.KWHzl();
                if (intentSenderKWHzl instanceof IntentSender.ActionBar) {
                    return IntentSender.ActionBar.copydefault(IntentSender.ActionBar.AEQbTJ(new AnonymousClass1(intentSenderKWHzl, pictureInPictureParams, assetManager, null)));
                }
                if (intentSenderKWHzl instanceof IntentSender.Activity) {
                    if (!intentSenderKWHzl.copydefault().booleanValue()) {
                        return IntentSender.Activity.EZpvd(IntentSender.Activity.copydefault((Object) null));
                    }
                    T tInvoke = pictureInPictureParams.getMapper().invoke(assetManager);
                    boolean zBooleanValue = assetManager.KWHzl().copydefault().booleanValue();
                    PictureInPictureParams<T> pictureInPictureParams2 = pictureInPictureParams;
                    if (!(!zBooleanValue)) {
                        throw new IllegalStateException(("ResultSet returned more than 1 row for " + pictureInPictureParams2).toString());
                    }
                    return IntentSender.Activity.EZpvd(IntentSender.Activity.copydefault(tInvoke));
                }
                throw new NoWhenBranchMatchedException();
            }

            /* JADX INFO: renamed from: app.cash.sqldelight.async.coroutines.QueryExtensionsKt$awaitAsOneOrNull$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super T>, Object> {
                final /* synthetic */ AssetManager $cursor;
                final /* synthetic */ IntentSender<Boolean> $next;
                final /* synthetic */ PictureInPictureParams<T> $this_awaitAsOneOrNull;
                Object L$0;
                int label;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.PictureInPictureParams<? extends T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(IntentSender<Boolean> intentSender, PictureInPictureParams<? extends T> pictureInPictureParams, AssetManager assetManager, Continuation<? super AnonymousClass1> continuation) {
                    super(1, continuation);
                    this.$next = intentSender;
                    this.$this_awaitAsOneOrNull = pictureInPictureParams;
                    this.$cursor = assetManager;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.$next, this.$this_awaitAsOneOrNull, this.$cursor, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Continuation<? super T> continuation) {
                    return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object obj2;
                    boolean zBooleanValue;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        IntentSender<Boolean> intentSender = this.$next;
                        this.label = 1;
                        obj = intentSender.copydefault(this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj2 = this.L$0;
                            C56391yDq.AEQbTJ(obj);
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            PictureInPictureParams<T> pictureInPictureParams = this.$this_awaitAsOneOrNull;
                            if (!(!zBooleanValue)) {
                                return obj2;
                            }
                            throw new IllegalStateException(("ResultSet returned more than 1 row for " + pictureInPictureParams).toString());
                        }
                        C56391yDq.AEQbTJ(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        return null;
                    }
                    T tInvoke = this.$this_awaitAsOneOrNull.getMapper().invoke(this.$cursor);
                    IntentSender<Boolean> intentSenderKWHzl = this.$cursor.KWHzl();
                    this.L$0 = tInvoke;
                    this.label = 2;
                    Object objCopydefault2 = intentSenderKWHzl.copydefault(this);
                    if (objCopydefault2 == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = tInvoke;
                    obj = objCopydefault2;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    PictureInPictureParams<T> pictureInPictureParams2 = this.$this_awaitAsOneOrNull;
                    if (!(!zBooleanValue)) {
                    }
                }
            }
        }).copydefault(continuation);
    }
}
