package com.okinc.lifecycle.impl.serviceImpl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.okinc.lifecycle.impl.serviceImpl.LifecycleLinkServiceAbs$processLink$1;
import com.okinc.modular.deeplinkv2.LinkSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC38168pOt;
import o.AbstractC43238rlX;
import o.C33129mqd;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43294rma;
import o.InterfaceC8108awX;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class LifecycleLinkServiceAbs$processLink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppCompatActivity $activity;
    final /* synthetic */ String $link;
    final /* synthetic */ LinkSource $linkSource;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC38168pOt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleLinkServiceAbs$processLink$1(AbstractC38168pOt abstractC38168pOt, AppCompatActivity appCompatActivity, String str, LinkSource linkSource, Continuation<? super LifecycleLinkServiceAbs$processLink$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC38168pOt;
        this.$activity = appCompatActivity;
        this.$link = str;
        this.$linkSource = linkSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LifecycleLinkServiceAbs$processLink$1(this.this$0, this.$activity, this.$link, this.$linkSource, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LifecycleLinkServiceAbs$processLink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentActivity fragmentActivity;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC38168pOt abstractC38168pOt = this.this$0;
            AppCompatActivity appCompatActivity = this.$activity;
            this.label = 1;
            obj = abstractC38168pOt.EZpvd(appCompatActivity, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fragmentActivity = (FragmentActivity) this.L$0;
                C56391yDq.AEQbTJ(obj);
                ((InterfaceC8108awX) C43251rlk.copydefault(InterfaceC8108awX.class)).AEQbTJ(fragmentActivity);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        FragmentActivity fragmentActivity2 = (FragmentActivity) obj;
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$link, fragmentActivity2, this.$linkSource, this.$activity, this.this$0, null);
        this.L$0 = fragmentActivity2;
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        fragmentActivity = fragmentActivity2;
        ((InterfaceC8108awX) C43251rlk.copydefault(InterfaceC8108awX.class)).AEQbTJ(fragmentActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.lifecycle.impl.serviceImpl.LifecycleLinkServiceAbs$processLink$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $act;
        final /* synthetic */ AppCompatActivity $activity;
        final /* synthetic */ String $link;
        final /* synthetic */ LinkSource $linkSource;
        int label;
        final /* synthetic */ AbstractC38168pOt this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, FragmentActivity fragmentActivity, LinkSource linkSource, AppCompatActivity appCompatActivity, AbstractC38168pOt abstractC38168pOt, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$link = str;
            this.$act = fragmentActivity;
            this.$linkSource = linkSource;
            this.$activity = appCompatActivity;
            this.this$0 = abstractC38168pOt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$link, this.$act, this.$linkSource, this.$activity, this.this$0, continuation);
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
                if (C33129mqd.OLrzqt((CharSequence) this.$link)) {
                    InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                    final FragmentActivity fragmentActivity = this.$act;
                    final String str = this.$link;
                    final LinkSource linkSource = this.$linkSource;
                    final AbstractC38168pOt abstractC38168pOt = this.this$0;
                    final AppCompatActivity appCompatActivity = this.$activity;
                    InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivity, str, null, linkSource, false, new Function1() { // from class: o.pOq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return LifecycleLinkServiceAbs$processLink$1.AnonymousClass1.invokeSuspend$lambda$0(abstractC38168pOt, str, linkSource, fragmentActivity, appCompatActivity, (AbstractC43238rlX) obj2);
                        }
                    }, 20, null);
                }
                if (!Intrinsics.EZpvd(this.$act, this.$activity) && !this.$activity.isFinishing()) {
                    this.$activity.finish();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(AbstractC38168pOt abstractC38168pOt, String str, LinkSource linkSource, FragmentActivity fragmentActivity, AppCompatActivity appCompatActivity, AbstractC43238rlX abstractC43238rlX) {
            pUU.KWHzl(abstractC38168pOt.EZpvd(), "Completed processing url - " + str + " from source - " + linkSource.getSource());
            if (Intrinsics.EZpvd(fragmentActivity, appCompatActivity) && !appCompatActivity.isFinishing()) {
                appCompatActivity.finish();
            }
            return Unit.INSTANCE;
        }
    }
}
