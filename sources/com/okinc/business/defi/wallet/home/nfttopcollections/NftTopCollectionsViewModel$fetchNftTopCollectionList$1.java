package com.okinc.business.defi.wallet.home.nfttopcollections;

import com.okinc.business.defi.biz.net.bean.NftCollection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C18142fcn;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC13827dZt;

/* JADX INFO: loaded from: classes5.dex */
public final class NftTopCollectionsViewModel$fetchNftTopCollectionList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $manual;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C18142fcn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NftTopCollectionsViewModel$fetchNftTopCollectionList$1(boolean z, C18142fcn c18142fcn, Continuation<? super NftTopCollectionsViewModel$fetchNftTopCollectionList$1> continuation) {
        super(2, continuation);
        this.$manual = z;
        this.this$0 = c18142fcn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NftTopCollectionsViewModel$fetchNftTopCollectionList$1 nftTopCollectionsViewModel$fetchNftTopCollectionList$1 = new NftTopCollectionsViewModel$fetchNftTopCollectionList$1(this.$manual, this.this$0, continuation);
        nftTopCollectionsViewModel$fetchNftTopCollectionList$1.L$0 = obj;
        return nftTopCollectionsViewModel$fetchNftTopCollectionList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NftTopCollectionsViewModel$fetchNftTopCollectionList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Job jobLaunch$default;
        Object obj2;
        List list;
        Object value2;
        Object value3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (this.$manual) {
                MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, new InterfaceC13827dZt.StateListAnimator(((InterfaceC13827dZt) value).copydefault())));
                jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new NftTopCollectionsViewModel$fetchNftTopCollectionList$1$nftProjects$job$1(null), 3, null);
                C18142fcn c18142fcn = this.this$0;
                this.L$0 = jobLaunch$default;
                this.label = 1;
                obj = c18142fcn.OLrzqt((Continuation<? super List<NftCollection>>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                this.L$0 = obj;
                this.label = 2;
                if (jobLaunch$default.join(this) != objCopydefault) {
                }
            } else {
                C18142fcn c18142fcn2 = this.this$0;
                this.label = 3;
                obj = c18142fcn2.OLrzqt((Continuation<? super List<NftCollection>>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                list = (List) obj;
            }
        } else if (i == 1) {
            jobLaunch$default = (Job) this.L$0;
            C56391yDq.AEQbTJ(obj);
            this.L$0 = obj;
            this.label = 2;
            if (jobLaunch$default.join(this) != objCopydefault) {
                return objCopydefault;
            }
            obj2 = obj;
            list = (List) obj2;
        } else if (i == 2) {
            obj2 = this.L$0;
            C56391yDq.AEQbTJ(obj);
            list = (List) obj2;
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            list = (List) obj;
        }
        if (list != null) {
            MutableStateFlow mutableStateFlow2 = this.this$0.OLrzqt;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, new InterfaceC13827dZt.ActionBar(list)));
        } else {
            MutableStateFlow mutableStateFlow3 = this.this$0.OLrzqt;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, new InterfaceC13827dZt.Application(((InterfaceC13827dZt) value2).copydefault())));
        }
        return Unit.INSTANCE;
    }
}
