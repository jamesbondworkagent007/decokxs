package com.okinc.business.market.features.meme.ui;

import com.okinc.business.market.features.meme.domain.model.ConfigInfoData;
import com.okinc.business.market.features.meme.domain.model.MemeTabType;
import com.okinc.business.market.features.meme.domain.model.RankInfoData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28696kfe;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28637keY;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeActivityViewModelV2$firstLoad$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $loadAllTab;
    int label;
    final /* synthetic */ MemeActivityViewModelV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeActivityViewModelV2$firstLoad$1(MemeActivityViewModelV2 memeActivityViewModelV2, boolean z, Continuation<? super MemeActivityViewModelV2$firstLoad$1> continuation) {
        super(2, continuation);
        this.this$0 = memeActivityViewModelV2;
        this.$loadAllTab = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeActivityViewModelV2$firstLoad$1(this.this$0, this.$loadAllTab, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeActivityViewModelV2$firstLoad$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        String maxTokenCount;
        int iAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MemePumpUseCase memePumpUseCase = this.this$0.values;
            this.label = 1;
            objOLrzqt = memePumpUseCase.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objOLrzqt;
        MemeActivityViewModelV2 memeActivityViewModelV2 = this.this$0;
        boolean z2 = this.$loadAllTab;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            ConfigInfoData configInfoData = (ConfigInfoData) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            List<RankInfoData> rankInfos = configInfoData.getRankInfos();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(rankInfos, 10));
            int i2 = 0;
            for (Object obj2 : rankInfos) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                arrayList.add(new C28696kfe(i2 == 0 ? z : false, false, i2, ((RankInfoData) obj2).getRankName(), MemeTabType.Companion.AEQbTJ(i2)));
                i2++;
                z = true;
            }
            InterfaceC28637keY.Activity activity = new InterfaceC28637keY.Activity(arrayList, configInfoData);
            RankInfoData rankInfoData = (RankInfoData) CollectionsKt___CollectionsKt.firstOrNull(configInfoData.getRankInfos());
            if (rankInfoData != null && (maxTokenCount = rankInfoData.getMaxTokenCount()) != null && (iAhwBna = C33129mqd.AhwBna(maxTokenCount)) != 0) {
                memeActivityViewModelV2.djBIcL = iAhwBna;
            }
            memeActivityViewModelV2.AEQbTJ.setValue(activity);
            memeActivityViewModelV2.EZpvd(configInfoData, activity.EZpvd());
            if (z2) {
                memeActivityViewModelV2.copydefault(activity);
            }
        }
        MemeActivityViewModelV2 memeActivityViewModelV22 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            memeActivityViewModelV22.AEQbTJ.setValue(InterfaceC28637keY.TaskDescription.KWHzl);
        }
        return Unit.INSTANCE;
    }
}
