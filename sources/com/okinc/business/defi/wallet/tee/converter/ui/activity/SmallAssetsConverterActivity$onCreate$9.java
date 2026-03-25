package com.okinc.business.defi.wallet.tee.converter.ui.activity;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC17837fUc;
import o.C16434ejp;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterActivity$onCreate$9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17837fUc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallAssetsConverterActivity$onCreate$9(ActivityC17837fUc activityC17837fUc, Continuation<? super SmallAssetsConverterActivity$onCreate$9> continuation) {
        super(2, continuation);
        this.this$0 = activityC17837fUc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmallAssetsConverterActivity$onCreate$9(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmallAssetsConverterActivity$onCreate$9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$onCreate$9$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ ActivityC17837fUc this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC17837fUc activityC17837fUc, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC17837fUc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C16434ejp c16434ejp = null;
                if (this.Z$0) {
                    C16434ejp c16434ejp2 = this.this$0.valueOf;
                    if (c16434ejp2 == null) {
                        Intrinsics.gEmmrt("");
                        c16434ejp2 = null;
                    }
                    c16434ejp2.copydefault.setVisibility(0);
                    ConstraintSet constraintSet = new ConstraintSet();
                    ActivityC17837fUc activityC17837fUc = this.this$0;
                    C16434ejp c16434ejp3 = activityC17837fUc.valueOf;
                    if (c16434ejp3 == null) {
                        Intrinsics.gEmmrt("");
                        c16434ejp3 = null;
                    }
                    constraintSet.clone(c16434ejp3.fJNWhG);
                    C16434ejp c16434ejp4 = activityC17837fUc.valueOf;
                    if (c16434ejp4 == null) {
                        Intrinsics.gEmmrt("");
                        c16434ejp4 = null;
                    }
                    constraintSet.clear(c16434ejp4.copydefault.getId(), 3);
                    C16434ejp c16434ejp5 = activityC17837fUc.valueOf;
                    if (c16434ejp5 == null) {
                        Intrinsics.gEmmrt("");
                        c16434ejp5 = null;
                    }
                    constraintSet.clear(c16434ejp5.copydefault.getId(), 4);
                    C16434ejp c16434ejp6 = activityC17837fUc.valueOf;
                    if (c16434ejp6 == null) {
                        Intrinsics.gEmmrt("");
                        c16434ejp6 = null;
                    }
                    constraintSet.clear(c16434ejp6.copydefault.getId(), 7);
                    C16434ejp c16434ejp7 = activityC17837fUc.valueOf;
                    if (c16434ejp7 == null) {
                        Intrinsics.gEmmrt("");
                        c16434ejp7 = null;
                    }
                    TextView textView = c16434ejp7.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    if (textView.getVisibility() == 8) {
                        C16434ejp c16434ejp8 = activityC17837fUc.valueOf;
                        if (c16434ejp8 == null) {
                            Intrinsics.gEmmrt("");
                            c16434ejp8 = null;
                        }
                        constraintSet.connect(c16434ejp8.copydefault.getId(), 3, 0, 3);
                        C16434ejp c16434ejp9 = activityC17837fUc.valueOf;
                        if (c16434ejp9 == null) {
                            Intrinsics.gEmmrt("");
                            c16434ejp9 = null;
                        }
                        constraintSet.connect(c16434ejp9.copydefault.getId(), 4, 0, 4);
                        C16434ejp c16434ejp10 = activityC17837fUc.valueOf;
                        if (c16434ejp10 == null) {
                            Intrinsics.gEmmrt("");
                            c16434ejp10 = null;
                        }
                        constraintSet.connect(c16434ejp10.copydefault.getId(), 7, 0, 7, activityC17837fUc.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ejfBZ));
                    } else {
                        C16434ejp c16434ejp11 = activityC17837fUc.valueOf;
                        if (c16434ejp11 == null) {
                            Intrinsics.gEmmrt("");
                            c16434ejp11 = null;
                        }
                        int id = c16434ejp11.copydefault.getId();
                        C16434ejp c16434ejp12 = activityC17837fUc.valueOf;
                        if (c16434ejp12 == null) {
                            Intrinsics.gEmmrt("");
                            c16434ejp12 = null;
                        }
                        constraintSet.connect(id, 3, c16434ejp12.AEQbTJ.getId(), 3);
                        C16434ejp c16434ejp13 = activityC17837fUc.valueOf;
                        if (c16434ejp13 == null) {
                            Intrinsics.gEmmrt("");
                            c16434ejp13 = null;
                        }
                        int id2 = c16434ejp13.copydefault.getId();
                        C16434ejp c16434ejp14 = activityC17837fUc.valueOf;
                        if (c16434ejp14 == null) {
                            Intrinsics.gEmmrt("");
                            c16434ejp14 = null;
                        }
                        constraintSet.connect(id2, 4, c16434ejp14.AEQbTJ.getId(), 4);
                        C16434ejp c16434ejp15 = activityC17837fUc.valueOf;
                        if (c16434ejp15 == null) {
                            Intrinsics.gEmmrt("");
                            c16434ejp15 = null;
                        }
                        int id3 = c16434ejp15.copydefault.getId();
                        C16434ejp c16434ejp16 = activityC17837fUc.valueOf;
                        if (c16434ejp16 == null) {
                            Intrinsics.gEmmrt("");
                            c16434ejp16 = null;
                        }
                        constraintSet.connect(id3, 7, c16434ejp16.AEQbTJ.getId(), 6, activityC17837fUc.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fJNWhG));
                    }
                    C16434ejp c16434ejp17 = activityC17837fUc.valueOf;
                    if (c16434ejp17 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c16434ejp = c16434ejp17;
                    }
                    constraintSet.applyTo(c16434ejp.fJNWhG);
                } else {
                    C16434ejp c16434ejp18 = this.this$0.valueOf;
                    if (c16434ejp18 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c16434ejp = c16434ejp18;
                    }
                    c16434ejp.copydefault.setVisibility(4);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Boolean> stateFlowDbNXlk = this.this$0.AYXKKw().DbNXlk();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowDbNXlk, anonymousClass1, this) == objCopydefault) {
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
