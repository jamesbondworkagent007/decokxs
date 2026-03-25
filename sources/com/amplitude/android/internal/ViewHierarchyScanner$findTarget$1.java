package com.amplitude.android.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.amplitude.android.internal.ViewTarget;
import com.amplitude.common.Logger;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C5220Ji;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC5234Jw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class ViewHierarchyScanner$findTarget$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ViewTarget>, Object> {
    final /* synthetic */ Logger $logger;
    final /* synthetic */ Pair<Float, Float> $targetPosition;
    final /* synthetic */ ViewTarget.Type $targetType;
    final /* synthetic */ View $this_findTarget;
    final /* synthetic */ List<InterfaceC5234Jw> $viewTargetLocators;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends o.Jw> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewHierarchyScanner$findTarget$1(View view, Logger logger, Pair<Float, Float> pair, ViewTarget.Type type, List<? extends InterfaceC5234Jw> list, Continuation<? super ViewHierarchyScanner$findTarget$1> continuation) {
        super(2, continuation);
        this.$this_findTarget = view;
        this.$logger = logger;
        this.$targetPosition = pair;
        this.$targetType = type;
        this.$viewTargetLocators = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new ViewHierarchyScanner$findTarget$1(this.$this_findTarget, this.$logger, this.$targetPosition, this.$targetType, this.$viewTargetLocators, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super ViewTarget> continuation) {
        return ((ViewHierarchyScanner$findTarget$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Looper mainLooper;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Handler handler = this.$this_findTarget.getHandler();
            if ((handler == null || (mainLooper = handler.getLooper()) == null) && (mainLooper = Looper.getMainLooper()) == null) {
                this.$logger.EZpvd("Unable to get main looper");
                return null;
            }
            if (Intrinsics.EZpvd(mainLooper.getThread(), Thread.currentThread())) {
                return C5220Ji.OLrzqt.KWHzl(this.$this_findTarget, this.$targetPosition, this.$targetType, this.$viewTargetLocators, this.$logger);
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_findTarget, this.$targetPosition, this.$targetType, this.$viewTargetLocators, this.$logger, null);
            this.label = 1;
            obj = BuildersKt.withContext(main, anonymousClass1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return (ViewTarget) obj;
    }

    /* JADX INFO: renamed from: com.amplitude.android.internal.ViewHierarchyScanner$findTarget$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ViewTarget>, Object> {
        final /* synthetic */ Logger $logger;
        final /* synthetic */ Pair<Float, Float> $targetPosition;
        final /* synthetic */ ViewTarget.Type $targetType;
        final /* synthetic */ View $this_findTarget;
        final /* synthetic */ List<InterfaceC5234Jw> $viewTargetLocators;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends o.Jw> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(View view, Pair<Float, Float> pair, ViewTarget.Type type, List<? extends InterfaceC5234Jw> list, Logger logger, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_findTarget = view;
            this.$targetPosition = pair;
            this.$targetType = type;
            this.$viewTargetLocators = list;
            this.$logger = logger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_findTarget, this.$targetPosition, this.$targetType, this.$viewTargetLocators, this.$logger, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super ViewTarget> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                return C5220Ji.OLrzqt.KWHzl(this.$this_findTarget, this.$targetPosition, this.$targetType, this.$viewTargetLocators, this.$logger);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
