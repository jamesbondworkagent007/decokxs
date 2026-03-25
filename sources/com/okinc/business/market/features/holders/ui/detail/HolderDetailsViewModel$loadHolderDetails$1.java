package com.okinc.business.market.features.holders.ui.detail;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C26287jYw;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.jYD;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderDetailsViewModel$loadHolderDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HolderDetailsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderDetailsViewModel$loadHolderDetails$1(HolderDetailsViewModel holderDetailsViewModel, Continuation<? super HolderDetailsViewModel$loadHolderDetails$1> continuation) {
        super(2, continuation);
        this.this$0 = holderDetailsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HolderDetailsViewModel$loadHolderDetails$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HolderDetailsViewModel$loadHolderDetails$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        C26287jYw c26287jYw;
        List<HolderDetailModel> listOLrzqt;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jYD jyd = this.this$0.ejfBZ;
            String strAEQbTJ = this.this$0.EZpvd().AEQbTJ();
            String strValueOf = this.this$0.EZpvd().valueOf();
            String strKWHzl = this.this$0.EZpvd().KWHzl();
            Integer numAEQbTJ = C56443yFo.AEQbTJ(1);
            this.label = 1;
            objKWHzl = jyd.KWHzl(strAEQbTJ, strValueOf, strKWHzl, "", numAEQbTJ, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objKWHzl;
        HolderDetailsViewModel holderDetailsViewModel = this.this$0;
        if ((abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) && (c26287jYw = (C26287jYw) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()) != null && (listOLrzqt = c26287jYw.OLrzqt()) != null) {
            Iterator<T> it = listOLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C33129mqd.OLrzqt(((HolderDetailModel) next).valueOf(), holderDetailsViewModel.EZpvd().KWHzl())) {
                    break;
                }
            }
            HolderDetailModel holderDetailModel = (HolderDetailModel) next;
            if (holderDetailModel != null) {
                holderDetailsViewModel.copydefault.setValue(holderDetailModel.EZpvd((268402687 & 1) != 0 ? holderDetailModel.uzCIH : 0, (268402687 & 2) != 0 ? holderDetailModel.AEQbTJ : null, (268402687 & 4) != 0 ? holderDetailModel.wlaJM : null, (268402687 & 8) != 0 ? holderDetailModel.DbNXlk : null, (268402687 & 16) != 0 ? holderDetailModel.AYXKKw : null, (268402687 & 32) != 0 ? holderDetailModel.isConnected : null, (268402687 & 64) != 0 ? holderDetailModel.AkhnZx : null, (268402687 & 128) != 0 ? holderDetailModel.AhwBna : null, (268402687 & 256) != 0 ? holderDetailModel.gEmmrt : null, (268402687 & 512) != 0 ? holderDetailModel.djBIcL : null, (268402687 & 1024) != 0 ? holderDetailModel.valueOf : null, (268402687 & 2048) != 0 ? holderDetailModel.fJNWhG : false, (268402687 & 4096) != 0 ? holderDetailModel.ejfBZ : false, (268402687 & 8192) != 0 ? holderDetailModel.iwGUEr : null, (268402687 & 16384) != 0 ? holderDetailModel.OLrzqt : null, (268402687 & 32768) != 0 ? holderDetailModel.AuCTel : false, (268402687 & 65536) != 0 ? holderDetailModel.KWHzl : holderDetailsViewModel.EZpvd().EZpvd(), (268402687 & 131072) != 0 ? holderDetailModel.hDKMBd : null, (268402687 & 262144) != 0 ? holderDetailModel.getNewProxyInstance : null, (268402687 & 524288) != 0 ? holderDetailModel.AubY : null, (268402687 & 1048576) != 0 ? holderDetailModel.zLjUOn : null, (268402687 & 2097152) != 0 ? holderDetailModel.fIwbmz : null, (268402687 & 4194304) != 0 ? holderDetailModel.fARcdN : null, (268402687 & 8388608) != 0 ? holderDetailModel.fetchVPNInfo : null, (268402687 & 16777216) != 0 ? holderDetailModel.values : null, (268402687 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? holderDetailModel.getFieldNames : null, (268402687 & 67108864) != 0 ? holderDetailModel.copydefault : null, (268402687 & 134217728) != 0 ? holderDetailModel.EZpvd : null));
            }
        }
        HolderDetailsViewModel holderDetailsViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            MutableStateFlow mutableStateFlow = holderDetailsViewModel2.copydefault;
            String strKWHzl2 = holderDetailsViewModel2.EZpvd().KWHzl();
            String strValueOf2 = holderDetailsViewModel2.EZpvd().valueOf();
            String strAEQbTJ2 = holderDetailsViewModel2.EZpvd().AEQbTJ();
            mutableStateFlow.setValue(new HolderDetailModel(holderDetailsViewModel2.EZpvd().AYXKKw(), strAEQbTJ2, strValueOf2, strKWHzl2, null, null, null, null, null, null, null, false, false, holderDetailsViewModel2.EZpvd().copydefault(), null, holderDetailsViewModel2.EZpvd().DbNXlk(), holderDetailsViewModel2.EZpvd().EZpvd(), null, null, null, null, null, null, null, null, null, null, null, 268328944, null));
        }
        return Unit.INSTANCE;
    }
}
