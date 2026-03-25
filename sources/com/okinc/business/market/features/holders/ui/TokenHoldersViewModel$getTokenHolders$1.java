package com.okinc.business.market.features.holders.ui;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C26211jWa;
import o.C26287jYw;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.jYC;
import o.jYD;
import o.jYL;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenHoldersViewModel$getTokenHolders$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ TokenHoldersViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenHoldersViewModel$getTokenHolders$1(TokenHoldersViewModel tokenHoldersViewModel, String str, String str2, Continuation<? super TokenHoldersViewModel$getTokenHolders$1> continuation) {
        super(2, continuation);
        this.this$0 = tokenHoldersViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenHoldersViewModel$getTokenHolders$1(this.this$0, this.$chainId, this.$tokenContractAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenHoldersViewModel$getTokenHolders$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0197  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        AbstractC43419rot abstractC43419rot;
        ArrayList arrayList;
        MutableStateFlow mutableStateFlow;
        Object objAEQbTJ;
        jYC jyc;
        List list;
        C26211jWa c26211jWa;
        String str;
        List<HolderDetailModel> listOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jYD jyd = this.this$0.DbNXlk;
            Integer num = this.this$0.fARcdN;
            String str2 = this.this$0.gEmmrt;
            String strCopydefault = this.this$0.gEmmrt().copydefault();
            String str3 = this.$chainId;
            String str4 = this.$tokenContractAddress;
            this.label = 1;
            objKWHzl = jyd.KWHzl(str3, str4, str2, strCopydefault, num, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MutableStateFlow mutableStateFlow2 = (MutableStateFlow) this.L$5;
                C26211jWa c26211jWa2 = (C26211jWa) this.L$4;
                String str5 = (String) this.L$3;
                List list2 = (List) this.L$2;
                jYC jyc2 = (jYC) this.L$1;
                abstractC43419rot = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c26211jWa = c26211jWa2;
                str = str5;
                list = list2;
                jyc = jyc2;
                mutableStateFlow = mutableStateFlow2;
                objAEQbTJ = obj;
                mutableStateFlow.setValue(new jYL.Activity(jyc, str, c26211jWa, list, ((Boolean) objAEQbTJ).booleanValue()));
                TokenHoldersViewModel tokenHoldersViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    tokenHoldersViewModel.copydefault.setValue(jYL.Application.copydefault);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        abstractC43419rot = (AbstractC43419rot) objKWHzl;
        TokenHoldersViewModel tokenHoldersViewModel2 = this.this$0;
        String str6 = this.$chainId;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            C26287jYw c26287jYw = (C26287jYw) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            if (c26287jYw == null || (listOLrzqt = c26287jYw.OLrzqt()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                for (HolderDetailModel holderDetailModelEZpvd : listOLrzqt) {
                    if (tokenHoldersViewModel2.AuCTel.isEmpty()) {
                        List<HolderDetailModel> listOLrzqt2 = c26287jYw.OLrzqt();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listOLrzqt2, 10)), 16));
                        for (HolderDetailModel holderDetailModel : listOLrzqt2) {
                            linkedHashMap.put(holderDetailModel.valueOf(), C56443yFo.AEQbTJ(holderDetailModel.fARcdN()));
                        }
                        tokenHoldersViewModel2.AuCTel = linkedHashMap;
                    }
                    if (c26287jYw.OLrzqt().size() != tokenHoldersViewModel2.AuCTel.size()) {
                        holderDetailModelEZpvd = holderDetailModelEZpvd.EZpvd((268402687 & 1) != 0 ? holderDetailModelEZpvd.uzCIH : tokenHoldersViewModel2.KWHzl(holderDetailModelEZpvd.valueOf()), (268402687 & 2) != 0 ? holderDetailModelEZpvd.AEQbTJ : null, (268402687 & 4) != 0 ? holderDetailModelEZpvd.wlaJM : null, (268402687 & 8) != 0 ? holderDetailModelEZpvd.DbNXlk : null, (268402687 & 16) != 0 ? holderDetailModelEZpvd.AYXKKw : null, (268402687 & 32) != 0 ? holderDetailModelEZpvd.isConnected : null, (268402687 & 64) != 0 ? holderDetailModelEZpvd.AkhnZx : null, (268402687 & 128) != 0 ? holderDetailModelEZpvd.AhwBna : null, (268402687 & 256) != 0 ? holderDetailModelEZpvd.gEmmrt : null, (268402687 & 512) != 0 ? holderDetailModelEZpvd.djBIcL : null, (268402687 & 1024) != 0 ? holderDetailModelEZpvd.valueOf : null, (268402687 & 2048) != 0 ? holderDetailModelEZpvd.fJNWhG : false, (268402687 & 4096) != 0 ? holderDetailModelEZpvd.ejfBZ : false, (268402687 & 8192) != 0 ? holderDetailModelEZpvd.iwGUEr : null, (268402687 & 16384) != 0 ? holderDetailModelEZpvd.OLrzqt : null, (268402687 & 32768) != 0 ? holderDetailModelEZpvd.AuCTel : false, (268402687 & 65536) != 0 ? holderDetailModelEZpvd.KWHzl : null, (268402687 & 131072) != 0 ? holderDetailModelEZpvd.hDKMBd : null, (268402687 & 262144) != 0 ? holderDetailModelEZpvd.getNewProxyInstance : null, (268402687 & 524288) != 0 ? holderDetailModelEZpvd.AubY : null, (268402687 & 1048576) != 0 ? holderDetailModelEZpvd.zLjUOn : null, (268402687 & 2097152) != 0 ? holderDetailModelEZpvd.fIwbmz : null, (268402687 & 4194304) != 0 ? holderDetailModelEZpvd.fARcdN : null, (268402687 & 8388608) != 0 ? holderDetailModelEZpvd.fetchVPNInfo : null, (268402687 & 16777216) != 0 ? holderDetailModelEZpvd.values : null, (268402687 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? holderDetailModelEZpvd.getFieldNames : null, (268402687 & 67108864) != 0 ? holderDetailModelEZpvd.copydefault : null, (268402687 & 134217728) != 0 ? holderDetailModelEZpvd.EZpvd : null);
                    }
                    arrayList.add(holderDetailModelEZpvd);
                }
            }
            mutableStateFlow = tokenHoldersViewModel2.copydefault;
            jYC jycKWHzl = c26287jYw != null ? c26287jYw.KWHzl() : null;
            List listAhwBna = arrayList == null ? yDY.AhwBna() : arrayList;
            String str7 = tokenHoldersViewModel2.gEmmrt;
            C26211jWa c26211jWaGEmmrt = tokenHoldersViewModel2.gEmmrt();
            this.L$0 = abstractC43419rot;
            this.L$1 = jycKWHzl;
            this.L$2 = listAhwBna;
            this.L$3 = str7;
            this.L$4 = c26211jWaGEmmrt;
            this.L$5 = mutableStateFlow;
            this.label = 2;
            objAEQbTJ = tokenHoldersViewModel2.AEQbTJ(str6, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            jyc = jycKWHzl;
            list = listAhwBna;
            c26211jWa = c26211jWaGEmmrt;
            str = str7;
            mutableStateFlow.setValue(new jYL.Activity(jyc, str, c26211jWa, list, ((Boolean) objAEQbTJ).booleanValue()));
        }
        TokenHoldersViewModel tokenHoldersViewModel3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
