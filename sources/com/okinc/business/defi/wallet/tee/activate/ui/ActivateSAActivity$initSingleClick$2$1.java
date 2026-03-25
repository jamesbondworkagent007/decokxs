package com.okinc.business.defi.wallet.tee.activate.ui;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.activate.model.NotificationStateType;
import com.okinc.business.defi.wallet.tee.activate.model.ViewDataChanged;
import com.okinc.business.defi.wallet.tee.activate.model.ViewDataReady;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel;
import com.okinc.business.defi.wallet.tee.common.model.TeeCommand;
import com.okinc.business.defi.wallet.tee.common.model.TeeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC17792fSl;
import o.C14461dlr;
import o.C17922fXg;
import o.C32866mlf;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.dTH;

/* JADX INFO: loaded from: classes18.dex */
public final class ActivateSAActivity$initSingleClick$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17792fSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAActivity$initSingleClick$2$1(ActivityC17792fSl activityC17792fSl, Continuation<? super ActivateSAActivity$initSingleClick$2$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC17792fSl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateSAActivity$initSingleClick$2$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAActivity$initSingleClick$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC17792fSl activityC17792fSl = this.this$0;
            ActivateSAViewModel activateSAViewModelAEQbTJ = activityC17792fSl.AEQbTJ();
            this.label = 1;
            objCopydefault = activityC17792fSl.copydefault(activateSAViewModelAEQbTJ, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        ActivityC17792fSl activityC17792fSl2 = this.this$0;
        ActivateSAViewModel.Application application = (ActivateSAViewModel.Application) objCopydefault;
        if (application.OLrzqt() instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL<ViewDataChanged> interfaceC49371unLOLrzqt = application.OLrzqt();
            Intrinsics.copydefault(interfaceC49371unLOLrzqt, "");
            ViewDataReady viewDataReady = ((ViewDataChanged) ((InterfaceC49371unL.Activity) interfaceC49371unLOLrzqt).copydefault()).getViewDataReady();
            dTH dthOLrzqt = C17922fXg.OLrzqt(viewDataReady.getWallet());
            if (dthOLrzqt instanceof dTH.FragmentManager) {
                if (viewDataReady.getWaringInfo() != null) {
                    activityC17792fSl2.copydefault(NotificationStateType.Other, viewDataReady.getWallet().AkhnZx(), true);
                } else {
                    C32866mlf.onEvent$default("Web3WalletEnableSmartAccountPage_Button_EnableButton_Click", (TrackChannel[]) null, new Application(application, activityC17792fSl2), 1, (Object) null);
                    FragmentManager supportFragmentManager = activityC17792fSl2.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    new C14461dlr(supportFragmentManager, "activeSA", new TaskDescription(application, activityC17792fSl2, viewDataReady), null, null, false, 56, null).EZpvd();
                }
            } else if (dthOLrzqt instanceof dTH.Activity) {
                activityC17792fSl2.copydefault(NotificationStateType.Other, viewDataReady.getWallet().AkhnZx(), true);
            } else if (dthOLrzqt instanceof dTH.Application) {
                activityC17792fSl2.EZpvd(application.EZpvd(), application.copydefault());
            }
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ ActivityC17792fSl EZpvd;
        public final /* synthetic */ ActivateSAViewModel.Application OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(ActivateSAViewModel.Application application, ActivityC17792fSl activityC17792fSl) {
            this.OLrzqt = application;
            this.EZpvd = activityC17792fSl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "web3wallet_smartaccount_renew_days", C33129mqd.gEmmrt(Integer.valueOf(this.OLrzqt.EZpvd())), false, 4, null);
            eventParamsList.put("path_source", this.EZpvd.AYXKKw(), true);
        }
    }

    public static final class TaskDescription implements Function1<String, Unit> {
        public final /* synthetic */ ViewDataReady EZpvd;
        public final /* synthetic */ ActivityC17792fSl KWHzl;
        public final /* synthetic */ ActivateSAViewModel.Application copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ActivateSAViewModel.Application application, ActivityC17792fSl activityC17792fSl, ViewDataReady viewDataReady) {
            this.copydefault = application;
            this.KWHzl = activityC17792fSl;
            this.EZpvd = viewDataReady;
        }

        public final void copydefault(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.KWHzl.AEQbTJ().AEQbTJ(str, new ActivateTeeModel(this.EZpvd.getTeeMetaData().getSupportChainIndexList(), jCurrentTimeMillis, jCurrentTimeMillis + (((long) this.copydefault.EZpvd()) * this.KWHzl.copydefault), this.copydefault.copydefault(), TeeType.PRIVATE_TEE, TeeCommand.UPGRADE_TEE), this.EZpvd.getWallet());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(String str) {
            copydefault(str);
            return Unit.INSTANCE;
        }
    }
}
