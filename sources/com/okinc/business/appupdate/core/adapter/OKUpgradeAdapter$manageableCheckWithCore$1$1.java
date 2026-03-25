package com.okinc.business.appupdate.core.adapter;

import com.okinc.business.appupdate.update.AppUpdateConfigResp;
import com.okinc.business.appupdate.update.AppUpdateInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import uniffi.upgrade.CheckResult;
import uniffi.upgrade.CheckUpgradeInfo;
import uniffi.upgrade.UpgradeCore;
import uniffi.upgrade.UpgradeException;

/* JADX INFO: loaded from: classes3.dex */
public final class OKUpgradeAdapter$manageableCheckWithCore$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, AppUpdateInfo, Unit> $ifShowCallback;
    final /* synthetic */ boolean $triggerInBackground;
    final /* synthetic */ UpgradeCore $upgradeCore;
    int label;
    final /* synthetic */ OKUpgradeAdapter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.okinc.business.appupdate.update.AppUpdateInfo, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OKUpgradeAdapter$manageableCheckWithCore$1$1(OKUpgradeAdapter oKUpgradeAdapter, boolean z, UpgradeCore upgradeCore, Function2<? super Boolean, ? super AppUpdateInfo, Unit> function2, Continuation<? super OKUpgradeAdapter$manageableCheckWithCore$1$1> continuation) {
        super(2, continuation);
        this.this$0 = oKUpgradeAdapter;
        this.$triggerInBackground = z;
        this.$upgradeCore = upgradeCore;
        this.$ifShowCallback = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKUpgradeAdapter$manageableCheckWithCore$1$1(this.this$0, this.$triggerInBackground, this.$upgradeCore, this.$ifShowCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKUpgradeAdapter$manageableCheckWithCore$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (UpgradeException.General e) {
            pUU.valueOf("OKUpgradeAdapter", "Upgrade exception in manageableCheckWithCore: " + e.getMessage());
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$triggerInBackground, this.$ifShowCallback, null);
            this.label = 3;
            if (BuildersKt.withContext(main, anonymousClass2, this) == objCopydefault) {
                return objCopydefault;
            }
        } catch (Exception e2) {
            pUU.copydefault("OKUpgradeAdapter", "Exception in manageableCheckWithCore: " + e2.getMessage());
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$triggerInBackground, this.$ifShowCallback, null);
            this.label = 4;
            if (BuildersKt.withContext(main2, anonymousClass3, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CheckUpgradeInfo upgradeInfo = this.this$0.getUpgradeInfo(this.$triggerInBackground);
            UpgradeCore upgradeCore = this.$upgradeCore;
            this.label = 1;
            obj = upgradeCore.checkUpgradeAsync(upgradeInfo, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        CheckResult checkResult = (CheckResult) obj;
        OKUpgradeAdapter oKUpgradeAdapter = this.this$0;
        oKUpgradeAdapter.mCachedUpdateResp = oKUpgradeAdapter.parseUpgradeResponse(checkResult.getServerInfo());
        MainCoroutineDispatcher main3 = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, checkResult, this.$ifShowCallback, this.$upgradeCore, null);
        this.label = 2;
        if (BuildersKt.withContext(main3, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.appupdate.core.adapter.OKUpgradeAdapter$manageableCheckWithCore$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Boolean, AppUpdateInfo, Unit> $ifShowCallback;
        final /* synthetic */ CheckResult $result;
        final /* synthetic */ UpgradeCore $upgradeCore;
        int label;
        final /* synthetic */ OKUpgradeAdapter this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.okinc.business.appupdate.update.AppUpdateInfo, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(OKUpgradeAdapter oKUpgradeAdapter, CheckResult checkResult, Function2<? super Boolean, ? super AppUpdateInfo, Unit> function2, UpgradeCore upgradeCore, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = oKUpgradeAdapter;
            this.$result = checkResult;
            this.$ifShowCallback = function2;
            this.$upgradeCore = upgradeCore;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$result, this.$ifShowCallback, this.$upgradeCore, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean zNeedShowUpdate = this.this$0.needShowUpdate(this.$result.getCanShow());
                Function2<Boolean, AppUpdateInfo, Unit> function2 = this.$ifShowCallback;
                Boolean boolKWHzl = C56443yFo.KWHzl(zNeedShowUpdate);
                AppUpdateConfigResp appUpdateConfigResp = this.this$0.mCachedUpdateResp;
                function2.invoke(boolKWHzl, appUpdateConfigResp != null ? appUpdateConfigResp.getAppUpdateInfo() : null);
                this.$upgradeCore.setPopedFlag();
                AppUpdateConfigResp.Companion.setNewVersionShowedToday$OKUpgrade_ok_upgrade();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.appupdate.core.adapter.OKUpgradeAdapter$manageableCheckWithCore$1$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Boolean, AppUpdateInfo, Unit> $ifShowCallback;
        final /* synthetic */ boolean $triggerInBackground;
        int label;
        final /* synthetic */ OKUpgradeAdapter this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.okinc.business.appupdate.update.AppUpdateInfo, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(OKUpgradeAdapter oKUpgradeAdapter, boolean z, Function2<? super Boolean, ? super AppUpdateInfo, Unit> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = oKUpgradeAdapter;
            this.$triggerInBackground = z;
            this.$ifShowCallback = function2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$triggerInBackground, this.$ifShowCallback, continuation);
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
                this.this$0.delegateToLegacyManageableCheck(this.$triggerInBackground, this.$ifShowCallback);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.appupdate.core.adapter.OKUpgradeAdapter$manageableCheckWithCore$1$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Boolean, AppUpdateInfo, Unit> $ifShowCallback;
        final /* synthetic */ boolean $triggerInBackground;
        int label;
        final /* synthetic */ OKUpgradeAdapter this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.okinc.business.appupdate.update.AppUpdateInfo, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(OKUpgradeAdapter oKUpgradeAdapter, boolean z, Function2<? super Boolean, ? super AppUpdateInfo, Unit> function2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = oKUpgradeAdapter;
            this.$triggerInBackground = z;
            this.$ifShowCallback = function2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$triggerInBackground, this.$ifShowCallback, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.delegateToLegacyManageableCheck(this.$triggerInBackground, this.$ifShowCallback);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
