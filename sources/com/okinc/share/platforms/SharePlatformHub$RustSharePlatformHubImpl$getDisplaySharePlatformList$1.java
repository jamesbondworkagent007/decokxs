package com.okinc.share.platforms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import o.APJ;
import o.APK;
import o.C33129mqd;
import o.C48889ueG;
import o.C49129uii;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class SharePlatformHub$RustSharePlatformHubImpl$getDisplaySharePlatformList$1 extends SuspendLambda implements Function2<ProducerScope<? super List<? extends SharePlatform>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ APJ $rustShareConfig;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C49129uii.ActionBar this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePlatformHub$RustSharePlatformHubImpl$getDisplaySharePlatformList$1(C49129uii.ActionBar actionBar, APJ apj, Continuation<? super SharePlatformHub$RustSharePlatformHubImpl$getDisplaySharePlatformList$1> continuation) {
        super(2, continuation);
        this.this$0 = actionBar;
        this.$rustShareConfig = apj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SharePlatformHub$RustSharePlatformHubImpl$getDisplaySharePlatformList$1 sharePlatformHub$RustSharePlatformHubImpl$getDisplaySharePlatformList$1 = new SharePlatformHub$RustSharePlatformHubImpl$getDisplaySharePlatformList$1(this.this$0, this.$rustShareConfig, continuation);
        sharePlatformHub$RustSharePlatformHubImpl$getDisplaySharePlatformList$1.L$0 = obj;
        return sharePlatformHub$RustSharePlatformHubImpl$getDisplaySharePlatformList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super List<? extends SharePlatform>> producerScope, Continuation<? super Unit> continuation) {
        return ((SharePlatformHub$RustSharePlatformHubImpl$getDisplaySharePlatformList$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5 A[LOOP:0: B:30:0x00af->B:32:0x00b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProducerScope producerScope;
        ArrayList arrayList;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            producerScope = (ProducerScope) this.L$0;
            APK apk = this.this$0.copydefault;
            APJ apj = this.$rustShareConfig;
            this.L$0 = producerScope;
            this.label = 1;
            obj = apk.EZpvd(apj, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    producerScope = (ProducerScope) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    APK apk2 = this.this$0.copydefault;
                    APJ apj2 = this.$rustShareConfig;
                    this.L$0 = producerScope;
                    this.label = 3;
                    obj = apk2.KWHzl(apj2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    List list = (List) obj;
                    arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    this.L$0 = null;
                    this.label = 4;
                    if (producerScope.send(arrayList, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                producerScope = (ProducerScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                List list2 = (List) obj;
                arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(C48889ueG.KWHzl.KWHzl((uniffi.growth.SharePlatform) it.next()));
                }
                this.L$0 = null;
                this.label = 4;
                if (producerScope.send(arrayList, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        List list3 = (List) obj;
        if (C33129mqd.KWHzl((Collection) list3)) {
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C48889ueG.KWHzl.KWHzl((uniffi.growth.SharePlatform) it2.next()));
            }
            this.L$0 = producerScope;
            this.label = 2;
            if (producerScope.send(arrayList2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        APK apk22 = this.this$0.copydefault;
        APJ apj22 = this.$rustShareConfig;
        this.L$0 = producerScope;
        this.label = 3;
        obj = apk22.KWHzl(apj22, this);
        if (obj == objCopydefault) {
        }
        List list22 = (List) obj;
        arrayList = new ArrayList(C56403yEb.AYXKKw(list22, 10));
        it = list22.iterator();
        while (it.hasNext()) {
        }
        this.L$0 = null;
        this.label = 4;
        if (producerScope.send(arrayList, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
