package com.okinc.okex.campaign.usecase;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.campaign.bean.Campaign;
import com.okinc.okex.campaign.bean.CampaignStatus;
import com.okinc.okex.campaign.bean.RecentCampaignResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C44788sdY;
import o.C44848sef;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC44921sfz;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class GetRecentCampaignsUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C44848sef.StateListAnimator>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44848sef this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRecentCampaignsUseCase$invoke$2(C44848sef c44848sef, Continuation<? super GetRecentCampaignsUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c44848sef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetRecentCampaignsUseCase$invoke$2 getRecentCampaignsUseCase$invoke$2 = new GetRecentCampaignsUseCase$invoke$2(this.this$0, continuation);
        getRecentCampaignsUseCase$invoke$2.L$0 = obj;
        return getRecentCampaignsUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C44848sef.StateListAnimator>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<C44848sef.StateListAnimator>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<C44848sef.StateListAnimator>> continuation) {
        return ((GetRecentCampaignsUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred[] deferredArr = {BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null)};
            this.label = 1;
            obj = AwaitKt.awaitAll(deferredArr, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) list.get(0);
        AbstractC43419rot abstractC43419rot2 = (AbstractC43419rot) list.get(1);
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            Result.Application application = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd((Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl())));
        }
        if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
            Result.Application application2 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd((Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot2).KWHzl())));
        }
        RecentCampaignResponse recentCampaignResponse = (RecentCampaignResponse) abstractC43419rot.copydefault();
        List<Campaign> campaigns = recentCampaignResponse != null ? recentCampaignResponse.getCampaigns() : null;
        if (campaigns == null) {
            campaigns = yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(campaigns, 10));
        Iterator<T> it = campaigns.iterator();
        while (it.hasNext()) {
            arrayList.add(C44788sdY.EZpvd((Campaign) it.next(), CampaignStatus.ONGOING));
        }
        RecentCampaignResponse recentCampaignResponse2 = (RecentCampaignResponse) abstractC43419rot2.copydefault();
        List<Campaign> campaigns2 = recentCampaignResponse2 != null ? recentCampaignResponse2.getCampaigns() : null;
        if (campaigns2 == null) {
            campaigns2 = yDY.AhwBna();
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(campaigns2, 10));
        Iterator<T> it2 = campaigns2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C44788sdY.EZpvd((Campaign) it2.next(), CampaignStatus.ENDED));
        }
        Result.Application application3 = Result.Companion;
        return Result.m7376boximpl(Result.m7377constructorimpl(new C44848sef.StateListAnimator(false, arrayList, arrayList2)));
    }

    /* JADX INFO: renamed from: com.okinc.okex.campaign.usecase.GetRecentCampaignsUseCase$invoke$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends RecentCampaignResponse, ? extends OKServerException>>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C44848sef this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C44848sef c44848sef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c44848sef;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends RecentCampaignResponse, ? extends OKServerException>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<RecentCampaignResponse, OKServerException>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<RecentCampaignResponse, OKServerException>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    InterfaceC44921sfz interfaceC44921sfz = this.this$0.EZpvd;
                    CampaignStatus campaignStatus = CampaignStatus.ONGOING;
                    this.label = 1;
                    obj = interfaceC44921sfz.copydefault(campaignStatus, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                ResponseData responseData = (ResponseData) obj;
                if (responseData.getCode() == 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            } catch (Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.okex.campaign.usecase.GetRecentCampaignsUseCase$invoke$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends RecentCampaignResponse, ? extends OKServerException>>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C44848sef this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C44848sef c44848sef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c44848sef;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends RecentCampaignResponse, ? extends OKServerException>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<RecentCampaignResponse, OKServerException>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<RecentCampaignResponse, OKServerException>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    InterfaceC44921sfz interfaceC44921sfz = this.this$0.EZpvd;
                    CampaignStatus campaignStatus = CampaignStatus.ENDED;
                    this.label = 1;
                    obj = interfaceC44921sfz.copydefault(campaignStatus, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                ResponseData responseData = (ResponseData) obj;
                if (responseData.getCode() == 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            } catch (Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
    }
}
