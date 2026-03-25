package com.okinc.planet.mlnservice;

import android.view.ViewGroup;
import com.okinc.planet.utils.PublishPreCheck;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o.C46355tRg;
import o.C46388tSm;
import o.C55284xgz;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;
import o.tQP;
import o.tQQ;
import o.tQS;
import o.wYK;
import org.luaj.vm2.LuaFunction;

/* JADX INFO: loaded from: classes24.dex */
public final class MLNPlanetBridge$checkPublisherEnable$1$dialog$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewGroup $anchorView;
    final /* synthetic */ LuaFunction $callback;
    final /* synthetic */ wYK $checkBox;
    final /* synthetic */ PublishPreCheck $checkPublicRules;
    final /* synthetic */ ViewOnClickListenerC54939xaY $this_apply;
    int label;
    final /* synthetic */ MLNPlanetBridge this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MLNPlanetBridge$checkPublisherEnable$1$dialog$1$1$1(wYK wyk, LuaFunction luaFunction, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, PublishPreCheck publishPreCheck, ViewGroup viewGroup, MLNPlanetBridge mLNPlanetBridge, Continuation<? super MLNPlanetBridge$checkPublisherEnable$1$dialog$1$1$1> continuation) {
        super(2, continuation);
        this.$checkBox = wyk;
        this.$callback = luaFunction;
        this.$this_apply = viewOnClickListenerC54939xaY;
        this.$checkPublicRules = publishPreCheck;
        this.$anchorView = viewGroup;
        this.this$0 = mLNPlanetBridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MLNPlanetBridge$checkPublisherEnable$1$dialog$1$1$1(this.$checkBox, this.$callback, this.$this_apply, this.$checkPublicRules, this.$anchorView, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MLNPlanetBridge$checkPublisherEnable$1$dialog$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C46355tRg c46355tRg = new C46355tRg(new tQQ(new TaskDescription().OLrzqt(), Dispatchers.getIO()));
            boolean zIsChecked = this.$checkBox.isChecked();
            this.label = 1;
            obj = c46355tRg.EZpvd(zIsChecked, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
            LuaFunction luaFunction = this.$callback;
            if (luaFunction != null) {
                luaFunction.KWHzl(true);
            }
            this.$this_apply.dismiss();
        } else {
            String description = this.$checkPublicRules.getDescription();
            ViewGroup viewGroup = this.$anchorView;
            if (viewGroup != null) {
                MLNPlanetBridge mLNPlanetBridge = this.this$0;
                C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(viewGroup, description);
                if (c55284xgzKWHzl != null) {
                    c55284xgzKWHzl.valueOf(mLNPlanetBridge.KWHzl());
                    c55284xgzKWHzl.isConnected(1);
                    c55284xgzKWHzl.djBIcL(0);
                    c55284xgzKWHzl.AEQbTJ(description);
                    c55284xgzKWHzl.hDKMBd();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements tQS {
        public tQP OLrzqt() {
            return tQS.TaskDescription.EZpvd(this);
        }
    }

    /* JADX INFO: renamed from: com.okinc.planet.mlnservice.MLNPlanetBridge$checkPublisherEnable$1$dialog$1$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
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
                C46388tSm c46388tSmKWHzl = C46388tSm.Companion.KWHzl();
                this.label = 1;
                if (c46388tSmKWHzl.KWHzl(this) == objCopydefault) {
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
}
