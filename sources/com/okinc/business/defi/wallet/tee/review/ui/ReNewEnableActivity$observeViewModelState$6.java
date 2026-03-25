package com.okinc.business.defi.wallet.tee.review.ui;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.appupdate.api.AppUpdateService;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$6;
import com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel;
import com.okinc.business.dex.api.bean.OrderListParams;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC14702dqT;
import o.C13754dXa;
import o.C14703dqU;
import o.C17877fVp;
import o.C32866mlf;
import o.C33070mpX;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;
import o.dTQ;
import o.fVU;
import o.gKO;

/* JADX INFO: loaded from: classes18.dex */
public final class ReNewEnableActivity$observeViewModelState$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fVU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReNewEnableActivity$observeViewModelState$6(fVU fvu, Continuation<? super ReNewEnableActivity$observeViewModelState$6> continuation) {
        super(2, continuation);
        this.this$0 = fvu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReNewEnableActivity$observeViewModelState$6(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReNewEnableActivity$observeViewModelState$6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$6$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ReNewEnableViewModel.ActionBar, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fVU this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fVU fvu, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fvu;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReNewEnableViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(actionBar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                final ReNewEnableViewModel.ActionBar actionBar = (ReNewEnableViewModel.ActionBar) this.L$0;
                if (actionBar instanceof ReNewEnableViewModel.ActionBar.TaskDescription) {
                    this.this$0.dismissLoadingWithLogo();
                    if (((AppUpdateService) C43251rlk.copydefault(AppUpdateService.class)).hasNewVersion()) {
                        C32866mlf.onEvent$default("Web3WalletSmartAccountTEEStatusPage_OldVersionPopUp_PopUp_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                        C17877fVp c17877fVpOLrzqt = C17877fVp.Companion.OLrzqt();
                        fVU fvu = this.this$0;
                        ReNewEnableViewModel.ActionBar.TaskDescription taskDescription = (ReNewEnableViewModel.ActionBar.TaskDescription) actionBar;
                        String strOLrzqt = taskDescription.OLrzqt();
                        String strAEQbTJ = taskDescription.AEQbTJ();
                        final fVU fvu2 = this.this$0;
                        Function1<? super ViewOnClickListenerC54939xaY, Unit> function1 = new Function1() { // from class: o.fWn
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$6.AnonymousClass1.invokeSuspend$lambda$0(fvu2, (ViewOnClickListenerC54939xaY) obj2);
                            }
                        };
                        final fVU fvu3 = this.this$0;
                        c17877fVpOLrzqt.OLrzqt(fvu, strOLrzqt, strAEQbTJ, function1, new Function1() { // from class: o.fWx
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$6.AnonymousClass1.invokeSuspend$lambda$1(fvu3, actionBar, (ViewOnClickListenerC54939xaY) obj2);
                            }
                        }, new Function1() { // from class: o.fWt
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$6.AnonymousClass1.invokeSuspend$lambda$2((ViewOnClickListenerC54939xaY) obj2);
                            }
                        });
                    } else {
                        C17877fVp c17877fVpOLrzqt2 = C17877fVp.Companion.OLrzqt();
                        fVU fvu4 = this.this$0;
                        ReNewEnableViewModel.ActionBar.TaskDescription taskDescription2 = (ReNewEnableViewModel.ActionBar.TaskDescription) actionBar;
                        String strOLrzqt2 = taskDescription2.OLrzqt();
                        String strAEQbTJ2 = taskDescription2.AEQbTJ();
                        final fVU fvu5 = this.this$0;
                        c17877fVpOLrzqt2.KWHzl(fvu4, strOLrzqt2, strAEQbTJ2, new Function1() { // from class: o.fWu
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$6.AnonymousClass1.invokeSuspend$lambda$3(fvu5, actionBar, (ViewOnClickListenerC54939xaY) obj2);
                            }
                        }, new Function1() { // from class: o.fWv
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$6.AnonymousClass1.invokeSuspend$lambda$4((ViewOnClickListenerC54939xaY) obj2);
                            }
                        });
                    }
                } else if (actionBar instanceof ReNewEnableViewModel.ActionBar.C0320ActionBar) {
                    this.this$0.dismissLoadingWithLogo();
                    if (((AppUpdateService) C43251rlk.copydefault(AppUpdateService.class)).hasNewVersion()) {
                        C32866mlf.onEvent$default("Web3WalletSmartAccountTEEStatusPage_OldVersionPopUp_PopUp_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                        C17877fVp c17877fVpOLrzqt3 = C17877fVp.Companion.OLrzqt();
                        fVU fvu6 = this.this$0;
                        String strCopydefault = ((ReNewEnableViewModel.ActionBar.C0320ActionBar) actionBar).copydefault();
                        final fVU fvu7 = this.this$0;
                        Function1<? super ViewOnClickListenerC54939xaY, Unit> function12 = new Function1() { // from class: o.fWw
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$6.AnonymousClass1.invokeSuspend$lambda$5(fvu7, (ViewOnClickListenerC54939xaY) obj2);
                            }
                        };
                        final fVU fvu8 = this.this$0;
                        c17877fVpOLrzqt3.KWHzl(fvu6, strCopydefault, function12, new Function1() { // from class: o.fWm
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$6.AnonymousClass1.invokeSuspend$lambda$6(fvu8, actionBar, (ViewOnClickListenerC54939xaY) obj2);
                            }
                        }, new Function1() { // from class: o.fWk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$6.AnonymousClass1.invokeSuspend$lambda$7((ViewOnClickListenerC54939xaY) obj2);
                            }
                        });
                    } else {
                        C17877fVp c17877fVpOLrzqt4 = C17877fVp.Companion.OLrzqt();
                        fVU fvu9 = this.this$0;
                        String strCopydefault2 = ((ReNewEnableViewModel.ActionBar.C0320ActionBar) actionBar).copydefault();
                        final fVU fvu10 = this.this$0;
                        c17877fVpOLrzqt4.EZpvd(fvu9, strCopydefault2, new Function1() { // from class: o.fWq
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$6.AnonymousClass1.invokeSuspend$lambda$8(fvu10, actionBar, (ViewOnClickListenerC54939xaY) obj2);
                            }
                        }, new Function1() { // from class: o.fWp
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$6.AnonymousClass1.invokeSuspend$lambda$9((ViewOnClickListenerC54939xaY) obj2);
                            }
                        });
                    }
                } else if (actionBar instanceof ReNewEnableViewModel.ActionBar.Activity) {
                    C32866mlf.onEvent$default("Web3WalletSmartAccountTEEStatusPage_ReactiveSuspendedOrdersButton_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                    this.this$0.dismissLoadingWithLogo();
                    if (this.this$0.KWHzl()) {
                        dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
                        if (dtq != null && dtq.OLrzqt(this.this$0.djBIcL)) {
                            AbstractC14702dqT abstractC14702dqTKWHzl = C14703dqU.Companion.KWHzl();
                            fVU fvu11 = this.this$0;
                            abstractC14702dqTKWHzl.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivityExternalSyntheticLambda2));
                            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractC14702dqTKWHzl), null, null, new ReNewEnableActivity$observeViewModelState$6$1$11$1(abstractC14702dqTKWHzl, fvu11, actionBar, null), 3, null);
                            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                            abstractC14702dqTKWHzl.show(supportFragmentManager, "DefiCreateWalletLoadingDFragment");
                        } else {
                            C17877fVp c17877fVpOLrzqt5 = C17877fVp.Companion.OLrzqt();
                            fVU fvu12 = this.this$0;
                            String strEZpvd = ((ReNewEnableViewModel.ActionBar.Activity) actionBar).EZpvd();
                            final fVU fvu13 = this.this$0;
                            Function1<? super ViewOnClickListenerC54939xaY, Unit> function13 = new Function1() { // from class: o.fWj
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return ReNewEnableActivity$observeViewModelState$6.AnonymousClass1.invokeSuspend$lambda$11(fvu13, (ViewOnClickListenerC54939xaY) obj2);
                                }
                            };
                            final fVU fvu14 = this.this$0;
                            c17877fVpOLrzqt5.copydefault(fvu12, strEZpvd, function13, new Function1() { // from class: o.fWo
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return ReNewEnableActivity$observeViewModelState$6.AnonymousClass1.invokeSuspend$lambda$12(fvu14, (ViewOnClickListenerC54939xaY) obj2);
                                }
                            });
                        }
                    } else {
                        C17877fVp c17877fVpOLrzqt6 = C17877fVp.Companion.OLrzqt();
                        fVU fvu15 = this.this$0;
                        String strEZpvd2 = ((ReNewEnableViewModel.ActionBar.Activity) actionBar).EZpvd();
                        final fVU fvu16 = this.this$0;
                        Function1<? super ViewOnClickListenerC54939xaY, Unit> function14 = new Function1() { // from class: o.fWs
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$6.AnonymousClass1.invokeSuspend$lambda$13(fvu16, (ViewOnClickListenerC54939xaY) obj2);
                            }
                        };
                        final fVU fvu17 = this.this$0;
                        c17877fVpOLrzqt6.copydefault(fvu15, strEZpvd2, function14, new Function1() { // from class: o.fWr
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$6.AnonymousClass1.invokeSuspend$lambda$14(fvu17, (ViewOnClickListenerC54939xaY) obj2);
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(fVU fvu, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            ((AppUpdateService) C43251rlk.copydefault(AppUpdateService.class)).checkUpdate(fvu, false);
            viewOnClickListenerC54939xaY.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(fVU fvu, ReNewEnableViewModel.ActionBar actionBar, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            fvu.gEmmrt().KWHzl(((ReNewEnableViewModel.ActionBar.TaskDescription) actionBar).KWHzl(), actionBar);
            viewOnClickListenerC54939xaY.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(fVU fvu, ReNewEnableViewModel.ActionBar actionBar, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            fvu.gEmmrt().KWHzl(((ReNewEnableViewModel.ActionBar.TaskDescription) actionBar).KWHzl(), actionBar);
            viewOnClickListenerC54939xaY.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            viewOnClickListenerC54939xaY.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$5(fVU fvu, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            ((AppUpdateService) C43251rlk.copydefault(AppUpdateService.class)).checkUpdate(fvu, false);
            viewOnClickListenerC54939xaY.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$6(fVU fvu, ReNewEnableViewModel.ActionBar actionBar, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            fvu.gEmmrt().KWHzl(((ReNewEnableViewModel.ActionBar.C0320ActionBar) actionBar).KWHzl(), actionBar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$7(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$8(fVU fvu, ReNewEnableViewModel.ActionBar actionBar, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            fvu.gEmmrt().KWHzl(((ReNewEnableViewModel.ActionBar.C0320ActionBar) actionBar).KWHzl(), actionBar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$9(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$11(fVU fvu, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            viewOnClickListenerC54939xaY.dismiss();
            fvu.finish();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$12(fVU fvu, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            ((gKO) C43251rlk.copydefault(gKO.class)).OLrzqt(fvu, new OrderListParams(OrderListParams.Page.OpenOrder, null, 2, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$13(fVU fvu, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            viewOnClickListenerC54939xaY.dismiss();
            fvu.finish();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$14(fVU fvu, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            ((gKO) C43251rlk.copydefault(gKO.class)).OLrzqt(fvu, new OrderListParams(OrderListParams.Page.OpenOrder, null, 2, null));
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<ReNewEnableViewModel.ActionBar> stateFlowDjBIcL = this.this$0.gEmmrt().djBIcL();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowDjBIcL, anonymousClass1, this) == objCopydefault) {
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
