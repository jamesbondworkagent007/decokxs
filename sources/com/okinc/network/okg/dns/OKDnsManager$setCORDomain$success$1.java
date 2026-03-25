package com.okinc.network.okg.dns;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C43372rnz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class OKDnsManager$setCORDomain$success$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $httpHost;
    final /* synthetic */ String $userSite;
    final /* synthetic */ String $wsDexHost;
    final /* synthetic */ String $wsv5Host;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKDnsManager$setCORDomain$success$1(String str, String str2, String str3, String str4, Continuation<? super OKDnsManager$setCORDomain$success$1> continuation) {
        super(2, continuation);
        this.$userSite = str;
        this.$httpHost = str2;
        this.$wsv5Host = str3;
        this.$wsDexHost = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKDnsManager$setCORDomain$success$1(this.$userSite, this.$httpHost, this.$wsv5Host, this.$wsDexHost, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((OKDnsManager$setCORDomain$success$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("OKDnsManager", "setCORDomain, start. userSite:" + this.$userSite + ", httpHost:" + this.$httpHost + ", wsv5Host:" + this.$wsv5Host + ", wsDexHost:" + this.$wsDexHost);
            C43372rnz c43372rnz = C43372rnz.copydefault;
            c43372rnz.OLrzqt(this.$userSite, this.$httpHost, this.$wsv5Host, this.$wsDexHost);
            c43372rnz.gEmmrt().KWHzl(this.$userSite, this.$httpHost, this.$wsv5Host, this.$wsDexHost);
            c43372rnz.gEmmrt().AEQbTJ();
            c43372rnz.gEmmrt().KWHzl(0L);
            if (c43372rnz.AkhnZx().AEQbTJ(this.$userSite)) {
                c43372rnz.AkhnZx().KWHzl(this.$userSite);
            }
            if (c43372rnz.gEmmrt(this.$userSite)) {
                return C56443yFo.KWHzl(true);
            }
            MutableSharedFlow<String> mutableSharedFlowIsConnected = c43372rnz.isConnected();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$userSite, null);
            this.label = 1;
            if (FlowKt.first(mutableSharedFlowIsConnected, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return C56443yFo.KWHzl(true);
    }

    /* JADX INFO: renamed from: com.okinc.network.okg.dns.OKDnsManager$setCORDomain$success$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $userSite;
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$userSite = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$userSite, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                String str = (String) this.L$0;
                boolean z = Intrinsics.EZpvd((Object) str, (Object) this.$userSite) && C43372rnz.copydefault.gEmmrt(this.$userSite);
                pUU.EZpvd("OKDnsManager", "setCORDomain, dohUpdateFlow received:" + str + ". expected:" + this.$userSite + ", result:" + z);
                return C56443yFo.KWHzl(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
