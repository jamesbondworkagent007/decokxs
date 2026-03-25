package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.net.responsebean.content.CommunityPostFeedResponse;
import com.okinc.crcore.coreapi.repository.IContentRepository;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31769mDf;
import o.mBT;

/* JADX INFO: loaded from: classes23.dex */
public final class CRContentRepository$getFeed$4 extends SuspendLambda implements Function1<Continuation<? super ResponseData<CommunityPostFeedResponse>>, Object> {
    final /* synthetic */ String $cursor;
    final /* synthetic */ String $group;
    final /* synthetic */ String $queryName;
    final /* synthetic */ Integer $size;
    final /* synthetic */ IContentRepository.TimelineType $type;
    int label;
    final /* synthetic */ mBT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRContentRepository$getFeed$4(IContentRepository.TimelineType timelineType, String str, mBT mbt, String str2, Integer num, String str3, Continuation<? super CRContentRepository$getFeed$4> continuation) {
        super(1, continuation);
        this.$type = timelineType;
        this.$queryName = str;
        this.this$0 = mbt;
        this.$cursor = str2;
        this.$size = num;
        this.$group = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CRContentRepository$getFeed$4(this.$type, this.$queryName, this.this$0, this.$cursor, this.$size, this.$group, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<CommunityPostFeedResponse>> continuation) {
        return ((CRContentRepository$getFeed$4) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return (ResponseData) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return (ResponseData) obj;
        }
        C56391yDq.AEQbTJ(obj);
        if (this.$type != IContentRepository.TimelineType.ALL || this.$queryName != null) {
            InterfaceC31769mDf interfaceC31769mDf = this.this$0.AEQbTJ;
            int value = this.$type.getValue();
            String str = this.$queryName;
            String str2 = this.$cursor;
            Integer num = this.$size;
            String string = num != null ? num.toString() : null;
            String str3 = this.$group;
            this.label = 2;
            obj = interfaceC31769mDf.AEQbTJ(value, str, str2, string, str3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (ResponseData) obj;
        }
        InterfaceC31769mDf interfaceC31769mDf2 = this.this$0.AEQbTJ;
        String str4 = this.$cursor;
        Integer num2 = this.$size;
        String string2 = num2 != null ? num2.toString() : null;
        this.label = 1;
        obj = interfaceC31769mDf2.OLrzqt(str4, string2, null, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        return (ResponseData) obj;
    }
}
