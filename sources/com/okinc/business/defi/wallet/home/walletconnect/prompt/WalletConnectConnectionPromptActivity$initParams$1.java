package com.okinc.business.defi.wallet.home.walletconnect.prompt;

import android.app.Application;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.reown.android.Core;
import com.reown.android.CoreClient;
import com.reown.android.CoreInterface;
import com.reown.android.relay.ConnectionType;
import com.reown.android.relay.NetworkClientTimeout;
import com.reown.android.relay.RelayConnectionInterface;
import com.reown.walletkit.client.Wallet;
import com.reown.walletkit.client.WalletKit;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.ActivityC18357fgq;
import o.C13754dXa;
import o.C13982dcp;
import o.C32979mnm;
import o.C34703nhO;
import o.C43386roM;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.C59449zhJ;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletConnectConnectionPromptActivity$initParams$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Application $application;
    final /* synthetic */ int $connectType;
    final /* synthetic */ int $initState;
    final /* synthetic */ String $topic;
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ ActivityC18357fgq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletConnectConnectionPromptActivity$initParams$1(ActivityC18357fgq activityC18357fgq, int i, String str, String str2, int i2, Application application, Continuation<? super WalletConnectConnectionPromptActivity$initParams$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC18357fgq;
        this.$initState = i;
        this.$topic = str;
        this.$walletId = str2;
        this.$connectType = i2;
        this.$application = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletConnectConnectionPromptActivity$initParams$1(this.this$0, this.$initState, this.$topic, this.$walletId, this.$connectType, this.$application, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletConnectConnectionPromptActivity$initParams$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$initState, this.$topic, this.$walletId, this.$connectType, this.$application, null);
                this.label = 1;
                if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Throwable th) {
            pUU.AEQbTJ(this.this$0.getTAG(), "Unable to initialize wallet connect", th);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.walletconnect.prompt.WalletConnectConnectionPromptActivity$initParams$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Application $application;
        final /* synthetic */ int $connectType;
        final /* synthetic */ int $initState;
        final /* synthetic */ String $topic;
        final /* synthetic */ String $walletId;
        Object L$0;
        int label;
        final /* synthetic */ ActivityC18357fgq this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC18357fgq activityC18357fgq, int i, String str, String str2, int i2, Application application, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC18357fgq;
            this.$initState = i;
            this.$topic = str;
            this.$walletId = str2;
            this.$connectType = i2;
            this.$application = application;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$initState, this.$topic, this.$walletId, this.$connectType, this.$application, continuation);
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
                Application application = this.$application;
                this.L$0 = application;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
                cancellableContinuationImpl.initCancellability();
                C13982dcp c13982dcp = C13982dcp.AEQbTJ;
                pUU.KWHzl("WalletConnectV2Manager", "checkInit    isInitialized:" + C13982dcp.fetchVPNInfo);
                if (C13982dcp.fetchVPNInfo.get()) {
                    if (cancellableContinuationImpl.isActive()) {
                        Result.Application application2 = Result.Companion;
                        cancellableContinuationImpl.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
                    }
                } else {
                    pUU.KWHzl("WalletConnectV2Manager", "initWC");
                    CoreClient coreClient = CoreClient.INSTANCE;
                    String str = C34703nhO.copydefault() ? "7f235442ef83a2d6f345f9fdbae72783" : "aef737a395c3d77d0df683f9ed219cde";
                    ConnectionType connectionType = ConnectionType.AUTOMATIC;
                    String string = application.getString(C13754dXa.FragmentManager.NRYds);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    String string2 = application.getString(C13754dXa.FragmentManager.ibnZAm);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    CoreInterface.DefaultImpls.initialize$default((CoreInterface) coreClient, application, str, new Core.Model.AppMetaData(string, string2, application.getString(C13754dXa.FragmentManager.ONJgbh) + "?version=" + C59449zhJ.replace$default(C32979mnm.EZpvd.EZpvd(), "beta", "", false, 4, (Object) null), yDY.copydefault(C43386roM.EZpvd.EZpvd() + application.getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21)), "okx://wallet/wallet/home", null, false, null, 224, null), connectionType, (RelayConnectionInterface) null, (String) null, NetworkClientTimeout.Companion.getDefaultTimeout(), false, (Function1) new TaskDescription(cancellableContinuationImpl), 48, (Object) null);
                    WalletKit walletKit = WalletKit.INSTANCE;
                    walletKit.initialize(new Wallet.Params.Init(coreClient), new ActionBar(cancellableContinuationImpl), new StateListAnimator(cancellableContinuationImpl));
                    coreClient.setDelegate(C13982dcp.copydefault);
                    walletKit.setWalletDelegate(C13982dcp.AkhnZx);
                }
                Object result = cancellableContinuationImpl.getResult();
                if (result == C56442yFn.copydefault()) {
                    C56447yFs.copydefault(this);
                }
                if (result == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            this.this$0.copydefault().OLrzqt(this.$initState, this.$topic, WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).gEmmrt(this.$topic), this.$walletId, this.$connectType);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.walletconnect.prompt.WalletConnectConnectionPromptActivity$initParams$1$1$TaskDescription */
        public static final class TaskDescription implements Function1<Core.Model.Error, Unit> {
            public final /* synthetic */ CancellableContinuation KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(CancellableContinuation cancellableContinuation) {
                this.KWHzl = cancellableContinuation;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Core.Model.Error error) {
                KWHzl(error);
                return Unit.INSTANCE;
            }

            public final void KWHzl(Core.Model.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                Throwable throwable = error.getThrowable();
                if (this.KWHzl.isActive()) {
                    CancellableContinuation cancellableContinuation = this.KWHzl;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(throwable)));
                }
                pUU.AEQbTJ("WalletConnectV2Manager", "initWC  CoreClient initialize", error.getThrowable());
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.walletconnect.prompt.WalletConnectConnectionPromptActivity$initParams$1$1$ActionBar */
        public static final class ActionBar implements Function0<Unit> {
            public final /* synthetic */ CancellableContinuation KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(CancellableContinuation cancellableContinuation) {
                this.KWHzl = cancellableContinuation;
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ Unit invoke() {
                EZpvd();
                return Unit.INSTANCE;
            }

            public final void EZpvd() {
                pUU.copydefault("WalletConnectV2Manager", "initWC  WalletKit initialize   success");
                C13982dcp.fetchVPNInfo.set(true);
                if (this.KWHzl.isActive()) {
                    CancellableContinuation cancellableContinuation = this.KWHzl;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
                }
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.walletconnect.prompt.WalletConnectConnectionPromptActivity$initParams$1$1$StateListAnimator */
        public static final class StateListAnimator implements Function1<Wallet.Model.Error, Unit> {
            public final /* synthetic */ CancellableContinuation EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(CancellableContinuation cancellableContinuation) {
                this.EZpvd = cancellableContinuation;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
                KWHzl(error);
                return Unit.INSTANCE;
            }

            public final void KWHzl(Wallet.Model.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                C13982dcp.fetchVPNInfo.set(false);
                Throwable throwable = error.getThrowable();
                if (this.EZpvd.isActive()) {
                    CancellableContinuation cancellableContinuation = this.EZpvd;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(throwable)));
                }
                pUU.AEQbTJ("WalletConnectV2Manager", "initWC  WalletKit initialize", error.getThrowable());
            }
        }
    }
}
