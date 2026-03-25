package com.okinc.cruilib.compose.library.reorderable;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import com.okinc.cruilib.compose.library.reorderable.ProgrammaticScroller;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C56391yDq;
import o.C56442yFn;
import o.mEF;

/* JADX INFO: loaded from: classes23.dex */
public final class ProgrammaticScroller$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProgrammaticScroller.ProgrammaticScrollDirection $direction;
    final /* synthetic */ Function0<LazyListItemInfo> $draggingItemProvider;
    final /* synthetic */ float $multipliedScrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProgrammaticScroller this$0;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ProgrammaticScroller.ProgrammaticScrollDirection.values().length];
            try {
                iArr[ProgrammaticScroller.ProgrammaticScrollDirection.BACKWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProgrammaticScroller.ProgrammaticScrollDirection.FORWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.LazyListItemInfo> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProgrammaticScroller$start$1(ProgrammaticScroller programmaticScroller, ProgrammaticScroller.ProgrammaticScrollDirection programmaticScrollDirection, float f, Function0<? extends LazyListItemInfo> function0, Continuation<? super ProgrammaticScroller$start$1> continuation) {
        super(2, continuation);
        this.this$0 = programmaticScroller;
        this.$direction = programmaticScrollDirection;
        this.$multipliedScrollOffset = f;
        this.$draggingItemProvider = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProgrammaticScroller$start$1 programmaticScroller$start$1 = new ProgrammaticScroller$start$1(this.this$0, this.$direction, this.$multipliedScrollOffset, this.$draggingItemProvider, continuation);
        programmaticScroller$start$1.L$0 = obj;
        return programmaticScroller$start$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProgrammaticScroller$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        LazyListItemInfo lazyListItemInfo;
        float f;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Object obj2 = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Exception unused) {
            }
        }
        while (this.this$0.AEQbTJ(this.$direction)) {
            int i2 = ActionBar.AEQbTJ[this.$direction.ordinal()];
            if (i2 == 1) {
                f = -this.$multipliedScrollOffset;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = this.$multipliedScrollOffset;
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, f, 100L, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, this.$draggingItemProvider, this.$direction, null), 3, null);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.delay(100L, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        LazyListItemInfo lazyListItemInfoInvoke = this.$draggingItemProvider.invoke();
        if (lazyListItemInfoInvoke != null) {
            ProgrammaticScroller programmaticScroller = this.this$0;
            ProgrammaticScroller.ProgrammaticScrollDirection programmaticScrollDirection = this.$direction;
            float offset = lazyListItemInfoInvoke.getOffset() + ((Number) programmaticScroller.AEQbTJ.invoke()).floatValue();
            float size = lazyListItemInfoInvoke.getSize() + offset;
            Pair pairOLrzqt = mEF.OLrzqt(programmaticScroller.AhwBna.getLayoutInfo(), programmaticScroller.copydefault, programmaticScroller.OLrzqt);
            int iIntValue = ((Number) pairOLrzqt.component1()).intValue();
            int iIntValue2 = ((Number) pairOLrzqt.component2()).intValue();
            boolean z = offset <= ((float) iIntValue) && size < ((float) (lazyListItemInfoInvoke.getOffset() + lazyListItemInfoInvoke.getSize()));
            boolean z2 = size >= ((float) iIntValue2) && offset > ((float) lazyListItemInfoInvoke.getOffset());
            if (!programmaticScroller.AEQbTJ(programmaticScrollDirection) && (z || z2)) {
                if (!z) {
                    List<LazyListItemInfo> visibleItemsInfo = programmaticScroller.AhwBna.getLayoutInfo().getVisibleItemsInfo();
                    ListIterator<LazyListItemInfo> listIterator = visibleItemsInfo.listIterator(visibleItemsInfo.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        LazyListItemInfo lazyListItemInfoPrevious = listIterator.previous();
                        LazyListItemInfo lazyListItemInfo2 = lazyListItemInfoPrevious;
                        if (lazyListItemInfo2.getOffset() + lazyListItemInfo2.getSize() < size && lazyListItemInfoInvoke.getIndex() != lazyListItemInfo2.getIndex() && programmaticScroller.valueOf.contains(lazyListItemInfo2.getKey()) && lazyListItemInfo2.getOffset() >= iIntValue && lazyListItemInfo2.getOffset() + lazyListItemInfo2.getSize() <= iIntValue2) {
                            obj2 = lazyListItemInfoPrevious;
                            break;
                        }
                    }
                    lazyListItemInfo = (LazyListItemInfo) obj2;
                } else {
                    Iterator<T> it = programmaticScroller.AhwBna.getLayoutInfo().getVisibleItemsInfo().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        LazyListItemInfo lazyListItemInfo3 = (LazyListItemInfo) next;
                        if (lazyListItemInfo3.getOffset() > offset && lazyListItemInfoInvoke.getIndex() != lazyListItemInfo3.getIndex() && programmaticScroller.valueOf.contains(lazyListItemInfo3.getKey()) && lazyListItemInfo3.getOffset() >= iIntValue && lazyListItemInfo3.getOffset() + lazyListItemInfo3.getSize() <= iIntValue2) {
                            obj2 = next;
                            break;
                        }
                    }
                    lazyListItemInfo = (LazyListItemInfo) obj2;
                }
                if (lazyListItemInfo != null) {
                    programmaticScroller.AYXKKw.invoke(lazyListItemInfoInvoke, lazyListItemInfo);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.cruilib.compose.library.reorderable.ProgrammaticScroller$start$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $diff;
        final /* synthetic */ long $duration;
        int label;
        final /* synthetic */ ProgrammaticScroller this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProgrammaticScroller programmaticScroller, float f, long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = programmaticScroller;
            this.$diff = f;
            this.$duration = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$diff, this.$duration, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                LazyListState lazyListState = this.this$0.AhwBna;
                float f = this.$diff;
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default((int) this.$duration, 0, EasingKt.getLinearEasing(), 2, null);
                this.label = 1;
                if (ScrollExtensionsKt.animateScrollBy(lazyListState, f, tweenSpecTween$default, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.cruilib.compose.library.reorderable.ProgrammaticScroller$start$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProgrammaticScroller.ProgrammaticScrollDirection $direction;
        final /* synthetic */ Function0<LazyListItemInfo> $draggingItemProvider;
        int label;
        final /* synthetic */ ProgrammaticScroller this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.LazyListItemInfo> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ProgrammaticScroller programmaticScroller, Function0<? extends LazyListItemInfo> function0, ProgrammaticScroller.ProgrammaticScrollDirection programmaticScrollDirection, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = programmaticScroller;
            this.$draggingItemProvider = function0;
            this.$direction = programmaticScrollDirection;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$draggingItemProvider, this.$direction, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.EZpvd((Function0<? extends LazyListItemInfo>) this.$draggingItemProvider, this.$direction);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
