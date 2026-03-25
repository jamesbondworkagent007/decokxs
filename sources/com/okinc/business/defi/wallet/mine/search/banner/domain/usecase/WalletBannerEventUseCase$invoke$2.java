package com.okinc.business.defi.wallet.mine.search.banner.domain.usecase;

import com.okinc.business.defi.wallet.mine.search.banner.data.model.WalletBannerEventData;
import com.okinc.business.defi.wallet.mine.search.banner.data.model.WalletBannerEventItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C18927fre;
import o.C18928frf;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC18926frd;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBannerEventUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends C18927fre>>>, Object> {
    int label;
    final /* synthetic */ C18928frf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBannerEventUseCase$invoke$2(C18928frf c18928frf, Continuation<? super WalletBannerEventUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c18928frf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletBannerEventUseCase$invoke$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends C18927fre>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<C18927fre>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<C18927fre>>> continuation) {
        return ((WalletBannerEventUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Collection collectionAhwBna;
        List<WalletBannerEventItem> items;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC18926frd interfaceC18926frd = this.this$0.copydefault;
            this.label = 1;
            obj = interfaceC18926frd.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            WalletBannerEventData walletBannerEventData = (WalletBannerEventData) CollectionsKt___CollectionsKt.firstOrNull((List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
            if (walletBannerEventData == null || (items = walletBannerEventData.getItems()) == null) {
                collectionAhwBna = yDY.AhwBna();
            } else {
                collectionAhwBna = new ArrayList(C56403yEb.AYXKKw(items, 10));
                for (WalletBannerEventItem walletBannerEventItem : items) {
                    String title = walletBannerEventItem.getTitle();
                    String str = title == null ? "" : title;
                    String reward = walletBannerEventItem.getReward();
                    String str2 = reward == null ? "" : reward;
                    String endTime = walletBannerEventItem.getEndTime();
                    String str3 = endTime == null ? "" : endTime;
                    String appJoinLink = walletBannerEventItem.getAppJoinLink();
                    String str4 = appJoinLink == null ? "" : appJoinLink;
                    String appBgImg = walletBannerEventItem.getAppBgImg();
                    String str5 = appBgImg == null ? "" : appBgImg;
                    String appBgNightImg = walletBannerEventItem.getAppBgNightImg();
                    String str6 = appBgNightImg == null ? "" : appBgNightImg;
                    String token = walletBannerEventItem.getToken();
                    collectionAhwBna.add(new C18927fre(str, str2, str3, str4, str5, str6, token == null ? "" : token));
                }
            }
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(collectionAhwBna);
        } else {
            if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd((Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
