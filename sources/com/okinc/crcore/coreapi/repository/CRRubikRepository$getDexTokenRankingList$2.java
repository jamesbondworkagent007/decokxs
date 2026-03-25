package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.net.responsebean.DexTokenResponseBean;
import com.okinc.crcore.coreapi.repository.CRRubikRepository$getDexTokenRankingList$2;
import com.okinc.crcore.shared.net.responsebean.DexTokenBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31747mCk;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC31771mDh;
import o.mAY;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class CRRubikRepository$getDexTokenRankingList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends DexTokenBean>, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $chainIds;
    final /* synthetic */ boolean $desc;
    final /* synthetic */ int $pageSize;
    final /* synthetic */ String $periodType;
    final /* synthetic */ String $rankBy;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31747mCk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRRubikRepository$getDexTokenRankingList$2(C31747mCk c31747mCk, String str, String str2, String str3, int i, boolean z, Continuation<? super CRRubikRepository$getDexTokenRankingList$2> continuation) {
        super(2, continuation);
        this.this$0 = c31747mCk;
        this.$chainIds = str;
        this.$rankBy = str2;
        this.$periodType = str3;
        this.$pageSize = i;
        this.$desc = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRRubikRepository$getDexTokenRankingList$2 cRRubikRepository$getDexTokenRankingList$2 = new CRRubikRepository$getDexTokenRankingList$2(this.this$0, this.$chainIds, this.$rankBy, this.$periodType, this.$pageSize, this.$desc, continuation);
        cRRubikRepository$getDexTokenRankingList$2.L$0 = obj;
        return cRRubikRepository$getDexTokenRankingList$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends DexTokenBean>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<DexTokenBean>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<DexTokenBean>, OKServerException>> continuation) {
        return ((CRRubikRepository$getDexTokenRankingList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        Object dexTokenRankingList$default;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31747mCk c31747mCk = this.this$0;
                String str = this.$chainIds;
                String str2 = this.$rankBy;
                String str3 = this.$periodType;
                int i2 = this.$pageSize;
                boolean z = this.$desc;
                InterfaceC31771mDh interfaceC31771mDh = c31747mCk.OLrzqt;
                this.label = 1;
                dexTokenRankingList$default = InterfaceC31771mDh.Application.getDexTokenRankingList$default(interfaceC31771mDh, str, str2, str3, i2, z, null, this, 32, null);
                if (dexTokenRankingList$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                dexTokenRankingList$default = obj;
            }
            responseData = (ResponseData) dexTokenRankingList$default;
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mCC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return CRRubikRepository$getDexTokenRankingList$2.invokeSuspend$lambda$2((java.util.List) obj2);
                }
            });
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mCC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRRubikRepository$getDexTokenRankingList$2.invokeSuspend$lambda$2((java.util.List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$2(List list) {
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(DexTokenBean.Companion.KWHzl((DexTokenResponseBean) it.next()));
        }
        return arrayList;
    }
}
