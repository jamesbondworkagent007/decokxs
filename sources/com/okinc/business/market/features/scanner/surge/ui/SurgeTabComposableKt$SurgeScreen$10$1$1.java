package com.okinc.business.market.features.scanner.surge.ui;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class SurgeTabComposableKt$SurgeScreen$10$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewPager2 $parentViewPager2;
    final /* synthetic */ int $touchSlop;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeTabComposableKt$SurgeScreen$10$1$1(ViewPager2 viewPager2, int i, Continuation<? super SurgeTabComposableKt$SurgeScreen$10$1$1> continuation) {
        super(2, continuation);
        this.$parentViewPager2 = viewPager2;
        this.$touchSlop = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SurgeTabComposableKt$SurgeScreen$10$1$1 surgeTabComposableKt$SurgeScreen$10$1$1 = new SurgeTabComposableKt$SurgeScreen$10$1$1(this.$parentViewPager2, this.$touchSlop, continuation);
        surgeTabComposableKt$SurgeScreen$10$1$1.L$0 = obj;
        return surgeTabComposableKt$SurgeScreen$10$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((SurgeTabComposableKt$SurgeScreen$10$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.scanner.surge.ui.SurgeTabComposableKt$SurgeScreen$10$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ViewPager2 $parentViewPager2;
        final /* synthetic */ int $touchSlop;
        float F$0;
        float F$1;
        int I$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewPager2 viewPager2, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$parentViewPager2 = viewPager2;
            this.$touchSlop = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$parentViewPager2, this.$touchSlop, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009d A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:7:0x0019, B:32:0x008e, B:35:0x009d, B:29:0x007b, B:38:0x00a5, B:42:0x00ca, B:48:0x00d5), top: B:59:0x0019 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a5 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:7:0x0019, B:32:0x008e, B:35:0x009d, B:29:0x007b, B:38:0x00a5, B:42:0x00ca, B:48:0x00d5), top: B:59:0x0019 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00de A[DONT_GENERATE] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008b -> B:32:0x008e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            int i;
            float f;
            float f2;
            PointerInputChange pointerInputChange;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = this.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                PointerEventPass pointerEventPass = PointerEventPass.Initial;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    f2 = this.F$1;
                    f = this.F$0;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        pointerInputChange = (PointerInputChange) CollectionsKt___CollectionsKt.firstOrNull(((PointerEvent) obj).getChanges());
                        if (pointerInputChange != null && pointerInputChange.getPressed()) {
                            if (i == 0) {
                                float fAbs = Math.abs(Offset.m2910getXimpl(pointerInputChange.m4267getPositionF1C5BW0()) - f);
                                float fAbs2 = Math.abs(Offset.m2911getYimpl(pointerInputChange.m4267getPositionF1C5BW0()) - f2);
                                float f3 = this.$touchSlop;
                                if (fAbs > f3 || fAbs2 > f3) {
                                    ViewPager2 viewPager2 = this.$parentViewPager2;
                                    if (viewPager2 != null) {
                                        viewPager2.setUserInputEnabled(fAbs > fAbs2);
                                    }
                                    i = 1;
                                }
                            }
                            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                            this.L$0 = awaitPointerEventScope2;
                            this.F$0 = f;
                            this.F$1 = f2;
                            this.I$0 = i;
                            this.label = 2;
                            obj = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, this);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            pointerInputChange = (PointerInputChange) CollectionsKt___CollectionsKt.firstOrNull(((PointerEvent) obj).getChanges());
                            if (pointerInputChange != null) {
                                if (i == 0) {
                                }
                                PointerEventPass pointerEventPass22 = PointerEventPass.Initial;
                                this.L$0 = awaitPointerEventScope2;
                                this.F$0 = f;
                                this.F$1 = f2;
                                this.I$0 = i;
                                this.label = 2;
                                obj = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass22, this);
                                if (obj == objCopydefault) {
                                }
                                pointerInputChange = (PointerInputChange) CollectionsKt___CollectionsKt.firstOrNull(((PointerEvent) obj).getChanges());
                                if (pointerInputChange != null) {
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    } finally {
                        ViewPager2 viewPager22 = this.$parentViewPager2;
                        if (viewPager22 != null) {
                            viewPager22.setUserInputEnabled(true);
                        }
                    }
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            PointerInputChange pointerInputChange2 = (PointerInputChange) CollectionsKt___CollectionsKt.firstOrNull(((PointerEvent) obj).getChanges());
            if (pointerInputChange2 == null) {
                return Unit.INSTANCE;
            }
            if (!pointerInputChange2.getPressed()) {
                return Unit.INSTANCE;
            }
            float fM2910getXimpl = Offset.m2910getXimpl(pointerInputChange2.m4267getPositionF1C5BW0());
            float fM2911getYimpl = Offset.m2911getYimpl(pointerInputChange2.m4267getPositionF1C5BW0());
            ViewPager2 viewPager23 = this.$parentViewPager2;
            if (viewPager23 != null) {
                viewPager23.setUserInputEnabled(false);
            }
            awaitPointerEventScope2 = awaitPointerEventScope;
            i = 0;
            f = fM2910getXimpl;
            f2 = fM2911getYimpl;
            PointerEventPass pointerEventPass222 = PointerEventPass.Initial;
            this.L$0 = awaitPointerEventScope2;
            this.F$0 = f;
            this.F$1 = f2;
            this.I$0 = i;
            this.label = 2;
            obj = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass222, this);
            if (obj == objCopydefault) {
            }
            pointerInputChange = (PointerInputChange) CollectionsKt___CollectionsKt.firstOrNull(((PointerEvent) obj).getChanges());
            if (pointerInputChange != null) {
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$parentViewPager2, this.$touchSlop, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == objCopydefault) {
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
