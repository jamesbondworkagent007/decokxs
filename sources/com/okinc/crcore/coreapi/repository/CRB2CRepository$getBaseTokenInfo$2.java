package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.net.responsebean.dex.DexBaseTokenResponse;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getBaseTokenInfo$2;
import com.okinc.crcore.shared.net.responsebean.DexBaseTokenBean;
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
import o.C31731mBv;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC31770mDg;
import o.mAY;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class CRB2CRepository$getBaseTokenInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends DexBaseTokenBean>, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $baseTokenAddress;
    final /* synthetic */ String $chainIndex;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31731mBv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRB2CRepository$getBaseTokenInfo$2(C31731mBv c31731mBv, String str, String str2, Continuation<? super CRB2CRepository$getBaseTokenInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = c31731mBv;
        this.$chainIndex = str;
        this.$baseTokenAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRB2CRepository$getBaseTokenInfo$2 cRB2CRepository$getBaseTokenInfo$2 = new CRB2CRepository$getBaseTokenInfo$2(this.this$0, this.$chainIndex, this.$baseTokenAddress, continuation);
        cRB2CRepository$getBaseTokenInfo$2.L$0 = obj;
        return cRB2CRepository$getBaseTokenInfo$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends DexBaseTokenBean>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<DexBaseTokenBean>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<DexBaseTokenBean>, OKServerException>> continuation) {
        return ((CRB2CRepository$getBaseTokenInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31731mBv c31731mBv = this.this$0;
                String str = this.$chainIndex;
                String str2 = this.$baseTokenAddress;
                InterfaceC31770mDg interfaceC31770mDg = c31731mBv.copydefault;
                this.label = 1;
                obj = interfaceC31770mDg.OLrzqt(str, str2, this);
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
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        return mAY.OLrzqt(actionBar, new Function1() { // from class: o.mBA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRB2CRepository$getBaseTokenInfo$2.invokeSuspend$lambda$2((java.util.List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$2(List list) {
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(DexBaseTokenBean.Companion.KWHzl((DexBaseTokenResponse) it.next()));
        }
        return arrayList;
    }
}
