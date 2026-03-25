package com.okinc.core.ok_app.modeswitch.liteSubMode;

import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC33240msi;
import o.C33070mpX;
import o.C33160mrH;
import o.C33302mtr;
import o.C33383mvS;
import o.C43251rlk;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC33233msb;

/* JADX INFO: loaded from: classes23.dex */
public final class ModeSwitchCardFragment$initView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C33383mvS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeSwitchCardFragment$initView$2(C33383mvS c33383mvS, Continuation<? super ModeSwitchCardFragment$initView$2> continuation) {
        super(2, continuation);
        this.this$0 = c33383mvS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModeSwitchCardFragment$initView$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModeSwitchCardFragment$initView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.core.ok_app.modeswitch.liteSubMode.ModeSwitchCardFragment$initView$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C33383mvS this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C33383mvS c33383mvS, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c33383mvS;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                StateFlow<AbstractC33240msi> stateFlowKWHzl = ((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).KWHzl();
                final C33383mvS c33383mvS = this.this$0;
                FlowCollector<? super AbstractC33240msi> flowCollector = new FlowCollector() { // from class: com.okinc.core.ok_app.modeswitch.liteSubMode.ModeSwitchCardFragment.initView.2.1.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(AbstractC33240msi abstractC33240msi, Continuation<? super Unit> continuation) {
                        C33302mtr c33302mtr = null;
                        if (abstractC33240msi instanceof AbstractC33240msi.Activity) {
                            C33302mtr c33302mtr2 = c33383mvS.KWHzl;
                            if (c33302mtr2 == null) {
                                Intrinsics.gEmmrt("");
                                c33302mtr2 = null;
                            }
                            c33302mtr2.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.AhwBna));
                            C33302mtr c33302mtr3 = c33383mvS.KWHzl;
                            if (c33302mtr3 == null) {
                                Intrinsics.gEmmrt("");
                                c33302mtr3 = null;
                            }
                            c33302mtr3.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.copydefault));
                            C33302mtr c33302mtr4 = c33383mvS.KWHzl;
                            if (c33302mtr4 == null) {
                                Intrinsics.gEmmrt("");
                                c33302mtr4 = null;
                            }
                            c33302mtr4.OLrzqt.setImageResource(C52761wXj.TaskDescription.getPostValueLengthLimit);
                        } else if (abstractC33240msi instanceof AbstractC33240msi.ActionBar) {
                            C33302mtr c33302mtr5 = c33383mvS.KWHzl;
                            if (c33302mtr5 == null) {
                                Intrinsics.gEmmrt("");
                                c33302mtr5 = null;
                            }
                            c33302mtr5.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.KWHzl));
                            C33302mtr c33302mtr6 = c33383mvS.KWHzl;
                            if (c33302mtr6 == null) {
                                Intrinsics.gEmmrt("");
                                c33302mtr6 = null;
                            }
                            c33302mtr6.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.OLrzqt));
                            C33302mtr c33302mtr7 = c33383mvS.KWHzl;
                            if (c33302mtr7 == null) {
                                Intrinsics.gEmmrt("");
                                c33302mtr7 = null;
                            }
                            c33302mtr7.OLrzqt.setImageResource(C52761wXj.TaskDescription.OFhtUX);
                        } else if (!(abstractC33240msi instanceof AbstractC33240msi.Application) && Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.LoaderManager.EZpvd)) {
                            C33302mtr c33302mtr8 = c33383mvS.KWHzl;
                            if (c33302mtr8 == null) {
                                Intrinsics.gEmmrt("");
                                c33302mtr8 = null;
                            }
                            c33302mtr8.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.valueOf));
                            C33302mtr c33302mtr9 = c33383mvS.KWHzl;
                            if (c33302mtr9 == null) {
                                Intrinsics.gEmmrt("");
                                c33302mtr9 = null;
                            }
                            c33302mtr9.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.EZpvd));
                            C33302mtr c33302mtr10 = c33383mvS.KWHzl;
                            if (c33302mtr10 == null) {
                                Intrinsics.gEmmrt("");
                                c33302mtr10 = null;
                            }
                            c33302mtr10.OLrzqt.setImageResource(C52761wXj.TaskDescription.QOLQEE);
                        }
                        C33383mvS c33383mvS2 = c33383mvS;
                        C33302mtr c33302mtr11 = c33383mvS2.KWHzl;
                        if (c33302mtr11 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            c33302mtr = c33302mtr11;
                        }
                        LinearLayout root = c33302mtr.getRoot();
                        Intrinsics.checkNotNullExpressionValue(root, "");
                        c33383mvS2.OLrzqt(root);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C33383mvS c33383mvS = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c33383mvS, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c33383mvS, state, anonymousClass1, this) == objCopydefault) {
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
