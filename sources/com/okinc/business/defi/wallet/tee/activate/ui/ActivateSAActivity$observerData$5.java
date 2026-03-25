package com.okinc.business.defi.wallet.tee.activate.ui;

import com.okinc.business.appupdate.api.AppUpdateService;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$observerData$5;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel;
import com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel;
import com.okinc.business.dex.api.bean.OrderListParams;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC17792fSl;
import o.C17877fVp;
import o.C32866mlf;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;
import o.gKO;

/* JADX INFO: loaded from: classes18.dex */
public final class ActivateSAActivity$observerData$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17792fSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAActivity$observerData$5(ActivityC17792fSl activityC17792fSl, Continuation<? super ActivateSAActivity$observerData$5> continuation) {
        super(2, continuation);
        this.this$0 = activityC17792fSl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateSAActivity$observerData$5(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAActivity$observerData$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$observerData$5$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ReNewEnableViewModel.ActionBar, Continuation<? super Unit>, Object> {
        int I$0;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC17792fSl this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC17792fSl activityC17792fSl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC17792fSl;
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

        /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            final ReNewEnableViewModel.ActionBar actionBar;
            final int i;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = this.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                ReNewEnableViewModel.ActionBar actionBar2 = (ReNewEnableViewModel.ActionBar) this.L$0;
                ActivityC17792fSl activityC17792fSl = this.this$0;
                ActivateSAViewModel activateSAViewModelAEQbTJ = activityC17792fSl.AEQbTJ();
                this.L$0 = actionBar2;
                this.label = 1;
                Object objCopydefault2 = activityC17792fSl.copydefault(activateSAViewModelAEQbTJ, this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                actionBar = actionBar2;
                obj = objCopydefault2;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    actionBar = (ReNewEnableViewModel.ActionBar) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    final boolean zCopydefault = ((ActivateSAViewModel.Application) obj).copydefault();
                    if (!(actionBar instanceof ReNewEnableViewModel.ActionBar.TaskDescription)) {
                        this.this$0.dismissLoadingWithLogo();
                        if (((AppUpdateService) C43251rlk.copydefault(AppUpdateService.class)).hasNewVersion()) {
                            C32866mlf.onEvent$default("Web3WalletSmartAccountTEEStatusPage_OldVersionPopUp_PopUp_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                            C17877fVp c17877fVpOLrzqt = C17877fVp.Companion.OLrzqt();
                            ActivityC17792fSl activityC17792fSl2 = this.this$0;
                            ReNewEnableViewModel.ActionBar.TaskDescription taskDescription = (ReNewEnableViewModel.ActionBar.TaskDescription) actionBar;
                            String strOLrzqt = taskDescription.OLrzqt();
                            String strAEQbTJ = taskDescription.AEQbTJ();
                            final ActivityC17792fSl activityC17792fSl3 = this.this$0;
                            Function1<? super ViewOnClickListenerC54939xaY, Unit> function1 = new Function1() { // from class: o.fSv
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return ActivateSAActivity$observerData$5.AnonymousClass1.invokeSuspend$lambda$0(activityC17792fSl3, (ViewOnClickListenerC54939xaY) obj2);
                                }
                            };
                            final ActivityC17792fSl activityC17792fSl4 = this.this$0;
                            c17877fVpOLrzqt.OLrzqt(activityC17792fSl2, strOLrzqt, strAEQbTJ, function1, new Function1() { // from class: o.fSz
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return ActivateSAActivity$observerData$5.AnonymousClass1.invokeSuspend$lambda$1(activityC17792fSl4, actionBar, i, zCopydefault, (ViewOnClickListenerC54939xaY) obj2);
                                }
                            }, new Function1() { // from class: o.fSw
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return ActivateSAActivity$observerData$5.AnonymousClass1.invokeSuspend$lambda$2((ViewOnClickListenerC54939xaY) obj2);
                                }
                            });
                        } else {
                            C17877fVp c17877fVpOLrzqt2 = C17877fVp.Companion.OLrzqt();
                            ActivityC17792fSl activityC17792fSl5 = this.this$0;
                            ReNewEnableViewModel.ActionBar.TaskDescription taskDescription2 = (ReNewEnableViewModel.ActionBar.TaskDescription) actionBar;
                            String strOLrzqt2 = taskDescription2.OLrzqt();
                            String strAEQbTJ2 = taskDescription2.AEQbTJ();
                            final ActivityC17792fSl activityC17792fSl6 = this.this$0;
                            c17877fVpOLrzqt2.KWHzl(activityC17792fSl5, strOLrzqt2, strAEQbTJ2, new Function1() { // from class: o.fSD
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return ActivateSAActivity$observerData$5.AnonymousClass1.invokeSuspend$lambda$3(activityC17792fSl6, actionBar, i, zCopydefault, (ViewOnClickListenerC54939xaY) obj2);
                                }
                            }, new Function1() { // from class: o.fSF
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return ActivateSAActivity$observerData$5.AnonymousClass1.invokeSuspend$lambda$4((ViewOnClickListenerC54939xaY) obj2);
                                }
                            });
                        }
                    } else if (actionBar instanceof ReNewEnableViewModel.ActionBar.C0320ActionBar) {
                        this.this$0.dismissLoadingWithLogo();
                        if (((AppUpdateService) C43251rlk.copydefault(AppUpdateService.class)).hasNewVersion()) {
                            C32866mlf.onEvent$default("Web3WalletSmartAccountTEEStatusPage_OldVersionPopUp_PopUp_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                            C17877fVp c17877fVpOLrzqt3 = C17877fVp.Companion.OLrzqt();
                            ActivityC17792fSl activityC17792fSl7 = this.this$0;
                            String strCopydefault = ((ReNewEnableViewModel.ActionBar.C0320ActionBar) actionBar).copydefault();
                            final ActivityC17792fSl activityC17792fSl8 = this.this$0;
                            Function1<? super ViewOnClickListenerC54939xaY, Unit> function12 = new Function1() { // from class: o.fSB
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return ActivateSAActivity$observerData$5.AnonymousClass1.invokeSuspend$lambda$5(activityC17792fSl8, (ViewOnClickListenerC54939xaY) obj2);
                                }
                            };
                            final ActivityC17792fSl activityC17792fSl9 = this.this$0;
                            c17877fVpOLrzqt3.KWHzl(activityC17792fSl7, strCopydefault, function12, new Function1() { // from class: o.fSC
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return ActivateSAActivity$observerData$5.AnonymousClass1.invokeSuspend$lambda$6(activityC17792fSl9, actionBar, i, zCopydefault, (ViewOnClickListenerC54939xaY) obj2);
                                }
                            }, new Function1() { // from class: o.fSE
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return ActivateSAActivity$observerData$5.AnonymousClass1.invokeSuspend$lambda$7((ViewOnClickListenerC54939xaY) obj2);
                                }
                            });
                        } else {
                            C17877fVp c17877fVpOLrzqt4 = C17877fVp.Companion.OLrzqt();
                            ActivityC17792fSl activityC17792fSl10 = this.this$0;
                            String strCopydefault2 = ((ReNewEnableViewModel.ActionBar.C0320ActionBar) actionBar).copydefault();
                            final ActivityC17792fSl activityC17792fSl11 = this.this$0;
                            c17877fVpOLrzqt4.EZpvd(activityC17792fSl10, strCopydefault2, new Function1() { // from class: o.fSx
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return ActivateSAActivity$observerData$5.AnonymousClass1.invokeSuspend$lambda$8(activityC17792fSl11, actionBar, i, zCopydefault, (ViewOnClickListenerC54939xaY) obj2);
                                }
                            }, new Function1() { // from class: o.fSA
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return ActivateSAActivity$observerData$5.AnonymousClass1.invokeSuspend$lambda$9((ViewOnClickListenerC54939xaY) obj2);
                                }
                            });
                        }
                    } else if (actionBar instanceof ReNewEnableViewModel.ActionBar.Activity) {
                        C32866mlf.onEvent$default("Web3WalletSmartAccountTEEStatusPage_ReactiveSuspendedOrdersButton_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                        this.this$0.dismissLoadingWithLogo();
                        C17877fVp c17877fVpOLrzqt5 = C17877fVp.Companion.OLrzqt();
                        ActivityC17792fSl activityC17792fSl12 = this.this$0;
                        String strEZpvd = ((ReNewEnableViewModel.ActionBar.Activity) actionBar).EZpvd();
                        final ActivityC17792fSl activityC17792fSl13 = this.this$0;
                        Function1<? super ViewOnClickListenerC54939xaY, Unit> function13 = new Function1() { // from class: o.fSt
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ActivateSAActivity$observerData$5.AnonymousClass1.invokeSuspend$lambda$10(activityC17792fSl13, (ViewOnClickListenerC54939xaY) obj2);
                            }
                        };
                        final ActivityC17792fSl activityC17792fSl14 = this.this$0;
                        c17877fVpOLrzqt5.copydefault(activityC17792fSl12, strEZpvd, function13, new Function1() { // from class: o.fSy
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ActivateSAActivity$observerData$5.AnonymousClass1.invokeSuspend$lambda$11(activityC17792fSl14, (ViewOnClickListenerC54939xaY) obj2);
                            }
                        });
                    }
                    return Unit.INSTANCE;
                }
                actionBar = (ReNewEnableViewModel.ActionBar) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            int iEZpvd = ((ActivateSAViewModel.Application) obj).EZpvd();
            ActivityC17792fSl activityC17792fSl15 = this.this$0;
            ActivateSAViewModel activateSAViewModelAEQbTJ2 = activityC17792fSl15.AEQbTJ();
            this.L$0 = actionBar;
            this.I$0 = iEZpvd;
            this.label = 2;
            Object objCopydefault3 = activityC17792fSl15.copydefault(activateSAViewModelAEQbTJ2, this);
            if (objCopydefault3 == objCopydefault) {
                return objCopydefault;
            }
            i = iEZpvd;
            obj = objCopydefault3;
            final boolean zCopydefault2 = ((ActivateSAViewModel.Application) obj).copydefault();
            if (!(actionBar instanceof ReNewEnableViewModel.ActionBar.TaskDescription)) {
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(ActivityC17792fSl activityC17792fSl, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            ((AppUpdateService) C43251rlk.copydefault(AppUpdateService.class)).checkUpdate(activityC17792fSl, false);
            viewOnClickListenerC54939xaY.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(ActivityC17792fSl activityC17792fSl, ReNewEnableViewModel.ActionBar actionBar, int i, boolean z, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            activityC17792fSl.KWHzl().KWHzl(((ReNewEnableViewModel.ActionBar.TaskDescription) actionBar).KWHzl(), actionBar, i, z);
            viewOnClickListenerC54939xaY.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(ActivityC17792fSl activityC17792fSl, ReNewEnableViewModel.ActionBar actionBar, int i, boolean z, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            activityC17792fSl.KWHzl().KWHzl(((ReNewEnableViewModel.ActionBar.TaskDescription) actionBar).KWHzl(), actionBar, i, z);
            viewOnClickListenerC54939xaY.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            viewOnClickListenerC54939xaY.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$5(ActivityC17792fSl activityC17792fSl, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            ((AppUpdateService) C43251rlk.copydefault(AppUpdateService.class)).checkUpdate(activityC17792fSl, false);
            viewOnClickListenerC54939xaY.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$6(ActivityC17792fSl activityC17792fSl, ReNewEnableViewModel.ActionBar actionBar, int i, boolean z, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            activityC17792fSl.KWHzl().KWHzl(((ReNewEnableViewModel.ActionBar.C0320ActionBar) actionBar).KWHzl(), actionBar, i, z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$7(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$8(ActivityC17792fSl activityC17792fSl, ReNewEnableViewModel.ActionBar actionBar, int i, boolean z, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            activityC17792fSl.KWHzl().KWHzl(((ReNewEnableViewModel.ActionBar.C0320ActionBar) actionBar).KWHzl(), actionBar, i, z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$9(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$10(ActivityC17792fSl activityC17792fSl, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            viewOnClickListenerC54939xaY.dismiss();
            activityC17792fSl.finish();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$11(ActivityC17792fSl activityC17792fSl, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            ((gKO) C43251rlk.copydefault(gKO.class)).OLrzqt(activityC17792fSl, new OrderListParams(OrderListParams.Page.OpenOrder, null, 2, null));
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<ReNewEnableViewModel.ActionBar> stateFlowAEQbTJ = this.this$0.KWHzl().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
