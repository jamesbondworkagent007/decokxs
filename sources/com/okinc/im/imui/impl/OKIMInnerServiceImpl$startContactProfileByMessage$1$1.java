package com.okinc.im.imui.impl;

import androidx.fragment.app.FragmentManager;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractActivityC33041mov;
import o.C33129mqd;
import o.C35626nys;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44177sGd;
import o.sDZ;

/* JADX INFO: loaded from: classes18.dex */
public final class OKIMInnerServiceImpl$startContactProfileByMessage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ String $contactId;
    final /* synthetic */ String $memberOfGroup;
    final /* synthetic */ OKMessage $message;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMInnerServiceImpl$startContactProfileByMessage$1$1(String str, String str2, AbstractActivityC33041mov abstractActivityC33041mov, OKMessage oKMessage, Continuation<? super OKIMInnerServiceImpl$startContactProfileByMessage$1$1> continuation) {
        super(2, continuation);
        this.$contactId = str;
        this.$memberOfGroup = str2;
        this.$activity = abstractActivityC33041mov;
        this.$message = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKIMInnerServiceImpl$startContactProfileByMessage$1$1 oKIMInnerServiceImpl$startContactProfileByMessage$1$1 = new OKIMInnerServiceImpl$startContactProfileByMessage$1$1(this.$contactId, this.$memberOfGroup, this.$activity, this.$message, continuation);
        oKIMInnerServiceImpl$startContactProfileByMessage$1$1.L$0 = obj;
        return oKIMInnerServiceImpl$startContactProfileByMessage$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMInnerServiceImpl$startContactProfileByMessage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Throwable th;
        CoroutineScope coroutineScope2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            try {
                InterfaceC44177sGd interfaceC44177sGdAEQbTJ = sDZ.AEQbTJ.AhwBna().AEQbTJ();
                String str = this.$contactId;
                String str2 = this.$memberOfGroup;
                this.L$0 = coroutineScope3;
                this.label = 1;
                Object objEZpvd = interfaceC44177sGdAEQbTJ.EZpvd(str, str2, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                coroutineScope2 = coroutineScope3;
                obj = objEZpvd;
                CoroutineScope coroutineScope4 = coroutineScope2;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, Dispatchers.getMain(), null, new AnonymousClass1(this.$activity, (RelationInfo) obj, this.$memberOfGroup, this.$message, null), 2, null);
            } catch (Throwable th2) {
                coroutineScope = coroutineScope3;
                th = th2;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass2(th, null), 2, null);
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                coroutineScope2 = coroutineScope;
                try {
                    CoroutineScope coroutineScope42 = coroutineScope2;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope42, Dispatchers.getMain(), null, new AnonymousClass1(this.$activity, (RelationInfo) obj, this.$memberOfGroup, this.$message, null), 2, null);
                } catch (Throwable th3) {
                    th = th3;
                    coroutineScope = coroutineScope2;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass2(th, null), 2, null);
                }
            } catch (Throwable th4) {
                th = th4;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass2(th, null), 2, null);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.impl.OKIMInnerServiceImpl$startContactProfileByMessage$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AbstractActivityC33041mov $activity;
        final /* synthetic */ String $memberOfGroup;
        final /* synthetic */ OKMessage $message;
        final /* synthetic */ RelationInfo $relationInfo;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractActivityC33041mov abstractActivityC33041mov, RelationInfo relationInfo, String str, OKMessage oKMessage, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = abstractActivityC33041mov;
            this.$relationInfo = relationInfo;
            this.$memberOfGroup = str;
            this.$message = oKMessage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activity, this.$relationInfo, this.$memberOfGroup, this.$message, continuation);
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
                C35626nys.ActionBar actionBar = C35626nys.Companion;
                FragmentManager supportFragmentManager = this.$activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                actionBar.EZpvd(supportFragmentManager, ChatOrigin.MESSAGE_AVATAR.getValue(), "", this.$relationInfo, null, this.$memberOfGroup, false, this.$message.getTargetId());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.impl.OKIMInnerServiceImpl$startContactProfileByMessage$1$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Throwable $throwable;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Throwable th, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$throwable = th;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$throwable, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String message;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (C33129mqd.OLrzqt((CharSequence) this.$throwable.getMessage()) && (message = this.$throwable.getMessage()) != null) {
                    C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
