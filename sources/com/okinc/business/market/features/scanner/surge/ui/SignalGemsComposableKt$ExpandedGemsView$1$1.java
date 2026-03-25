package com.okinc.business.market.features.scanner.surge.ui;

import android.view.ViewParent;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalGemsComposableKt$ExpandedGemsView$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<ViewParent> $allParents;
    final /* synthetic */ ViewPager2 $parentViewPager2;
    final /* synthetic */ int $touchSlop;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalGemsComposableKt$ExpandedGemsView$1$1(List<ViewParent> list, int i, ViewPager2 viewPager2, Continuation<? super SignalGemsComposableKt$ExpandedGemsView$1$1> continuation) {
        super(2, continuation);
        this.$allParents = list;
        this.$touchSlop = i;
        this.$parentViewPager2 = viewPager2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SignalGemsComposableKt$ExpandedGemsView$1$1 signalGemsComposableKt$ExpandedGemsView$1$1 = new SignalGemsComposableKt$ExpandedGemsView$1$1(this.$allParents, this.$touchSlop, this.$parentViewPager2, continuation);
        signalGemsComposableKt$ExpandedGemsView$1$1.L$0 = obj;
        return signalGemsComposableKt$ExpandedGemsView$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((SignalGemsComposableKt$ExpandedGemsView$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.scanner.surge.ui.SignalGemsComposableKt$ExpandedGemsView$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<ViewParent> $allParents;
        final /* synthetic */ ViewPager2 $parentViewPager2;
        final /* synthetic */ int $touchSlop;
        float F$0;
        float F$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.okinc.business.market.features.scanner.surge.ui.SignalGemsComposableKt$ExpandedGemsView$1$1$1$StateListAnimator */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[DragDirection.values().length];
                try {
                    iArr[DragDirection.Horizontal.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DragDirection.Undecided.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DragDirection.Vertical.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                KWHzl = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<ViewParent> list, int i, ViewPager2 viewPager2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$allParents = list;
            this.$touchSlop = i;
            this.$parentViewPager2 = viewPager2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$allParents, this.$touchSlop, this.$parentViewPager2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Path cross not found for [B:43:0x00dc, B:55:0x0104], limit reached: 84 */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0097 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0099 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001b, B:25:0x0089, B:28:0x0099, B:30:0x009f, B:32:0x00bd, B:38:0x00cc, B:39:0x00cf, B:41:0x00d2, B:46:0x00e1, B:48:0x00e5, B:49:0x00e8, B:50:0x00ee, B:22:0x0077, B:52:0x00f4, B:53:0x00fe, B:54:0x0103, B:55:0x0104, B:57:0x0108, B:58:0x010b, B:59:0x0111, B:61:0x0117), top: B:80:0x001b }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bd A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001b, B:25:0x0089, B:28:0x0099, B:30:0x009f, B:32:0x00bd, B:38:0x00cc, B:39:0x00cf, B:41:0x00d2, B:46:0x00e1, B:48:0x00e5, B:49:0x00e8, B:50:0x00ee, B:22:0x0077, B:52:0x00f4, B:53:0x00fe, B:54:0x0103, B:55:0x0104, B:57:0x0108, B:58:0x010b, B:59:0x0111, B:61:0x0117), top: B:80:0x001b }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0108 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001b, B:25:0x0089, B:28:0x0099, B:30:0x009f, B:32:0x00bd, B:38:0x00cc, B:39:0x00cf, B:41:0x00d2, B:46:0x00e1, B:48:0x00e5, B:49:0x00e8, B:50:0x00ee, B:22:0x0077, B:52:0x00f4, B:53:0x00fe, B:54:0x0103, B:55:0x0104, B:57:0x0108, B:58:0x010b, B:59:0x0111, B:61:0x0117), top: B:80:0x001b }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0117 A[Catch: all -> 0x001f, LOOP:2: B:59:0x0111->B:61:0x0117, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001b, B:25:0x0089, B:28:0x0099, B:30:0x009f, B:32:0x00bd, B:38:0x00cc, B:39:0x00cf, B:41:0x00d2, B:46:0x00e1, B:48:0x00e5, B:49:0x00e8, B:50:0x00ee, B:22:0x0077, B:52:0x00f4, B:53:0x00fe, B:54:0x0103, B:55:0x0104, B:57:0x0108, B:58:0x010b, B:59:0x0111, B:61:0x0117), top: B:80:0x001b }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0125 A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0134 A[DONT_GENERATE, LOOP:0: B:67:0x012e->B:69:0x0134, LOOP_END] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0086 -> B:25:0x0089). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            AwaitPointerEventScope awaitPointerEventScope;
            float fM2910getXimpl;
            DragDirection dragDirection;
            AwaitPointerEventScope awaitPointerEventScope2;
            float f;
            PointerInputChange pointerInputChange;
            ViewPager2 viewPager2;
            Iterator<T> it;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f = this.F$1;
                    fM2910getXimpl = this.F$0;
                    dragDirection = (DragDirection) this.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        pointerInputChange = (PointerInputChange) CollectionsKt___CollectionsKt.firstOrNull(((PointerEvent) obj).getChanges());
                        if (pointerInputChange != null && pointerInputChange.getPressed()) {
                            float fAbs = Math.abs(Offset.m2910getXimpl(pointerInputChange.m4267getPositionF1C5BW0()) - fM2910getXimpl);
                            float fAbs2 = Math.abs(Offset.m2911getYimpl(pointerInputChange.m4267getPositionF1C5BW0()) - f);
                            if (dragDirection == DragDirection.Undecided) {
                                float f2 = this.$touchSlop;
                                if (fAbs > f2 || fAbs2 > f2) {
                                    dragDirection = fAbs > fAbs2 ? DragDirection.Horizontal : DragDirection.Vertical;
                                }
                            }
                            int i2 = StateListAnimator.KWHzl[dragDirection.ordinal()];
                            if (i2 != 1 || i2 == 2) {
                                viewPager2 = this.$parentViewPager2;
                                if (viewPager2 != null) {
                                    viewPager2.setUserInputEnabled(false);
                                }
                                it = this.$allParents.iterator();
                                while (it.hasNext()) {
                                    ((ViewParent) it.next()).requestDisallowInterceptTouchEvent(true);
                                }
                            } else {
                                if (i2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ViewPager2 viewPager22 = this.$parentViewPager2;
                                if (viewPager22 != null) {
                                    viewPager22.setUserInputEnabled(true);
                                }
                                Iterator<T> it2 = this.$allParents.iterator();
                                while (it2.hasNext()) {
                                    ((ViewParent) it2.next()).requestDisallowInterceptTouchEvent(false);
                                }
                            }
                            this.L$0 = awaitPointerEventScope2;
                            this.L$1 = dragDirection;
                            this.F$0 = fM2910getXimpl;
                            this.F$1 = f;
                            this.label = 2;
                            obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, this, 1, null);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            pointerInputChange = (PointerInputChange) CollectionsKt___CollectionsKt.firstOrNull(((PointerEvent) obj).getChanges());
                            if (pointerInputChange != null) {
                                float fAbs3 = Math.abs(Offset.m2910getXimpl(pointerInputChange.m4267getPositionF1C5BW0()) - fM2910getXimpl);
                                float fAbs22 = Math.abs(Offset.m2911getYimpl(pointerInputChange.m4267getPositionF1C5BW0()) - f);
                                if (dragDirection == DragDirection.Undecided) {
                                }
                                int i22 = StateListAnimator.KWHzl[dragDirection.ordinal()];
                                if (i22 != 1) {
                                }
                                viewPager2 = this.$parentViewPager2;
                                if (viewPager2 != null) {
                                }
                                it = this.$allParents.iterator();
                                while (it.hasNext()) {
                                }
                                this.L$0 = awaitPointerEventScope2;
                                this.L$1 = dragDirection;
                                this.F$0 = fM2910getXimpl;
                                this.F$1 = f;
                                this.label = 2;
                                obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, this, 1, null);
                                if (obj == objCopydefault) {
                                }
                                pointerInputChange = (PointerInputChange) CollectionsKt___CollectionsKt.firstOrNull(((PointerEvent) obj).getChanges());
                                if (pointerInputChange != null) {
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    } finally {
                        ViewPager2 viewPager23 = this.$parentViewPager2;
                        if (viewPager23 != null) {
                            viewPager23.setUserInputEnabled(true);
                        }
                        Iterator<T> it3 = this.$allParents.iterator();
                        while (it3.hasNext()) {
                            ((ViewParent) it3.next()).requestDisallowInterceptTouchEvent(false);
                        }
                    }
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
            fM2910getXimpl = Offset.m2910getXimpl(pointerInputChange2.m4267getPositionF1C5BW0());
            float fM2911getYimpl = Offset.m2911getYimpl(pointerInputChange2.m4267getPositionF1C5BW0());
            dragDirection = DragDirection.Undecided;
            Iterator<T> it4 = this.$allParents.iterator();
            while (it4.hasNext()) {
                ((ViewParent) it4.next()).requestDisallowInterceptTouchEvent(true);
            }
            awaitPointerEventScope2 = awaitPointerEventScope;
            f = fM2911getYimpl;
            this.L$0 = awaitPointerEventScope2;
            this.L$1 = dragDirection;
            this.F$0 = fM2910getXimpl;
            this.F$1 = f;
            this.label = 2;
            obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, this, 1, null);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$allParents, this.$touchSlop, this.$parentViewPager2, null);
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
