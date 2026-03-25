package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.repository.CRRubikRepository$getSimpleCategoryList$2;
import com.okinc.crcore.shared.net.responsebean.SimpleCategoriesBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
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
import o.C56442yFn;
import o.InterfaceC31771mDh;
import o.mAY;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class CRRubikRepository$getSimpleCategoryList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends SimpleCategoriesBean>, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $fiat;
    final /* synthetic */ String $interval;
    final /* synthetic */ String $size;
    final /* synthetic */ String $sortBy;
    final /* synthetic */ String $timezone;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31747mCk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRRubikRepository$getSimpleCategoryList$2(C31747mCk c31747mCk, String str, String str2, String str3, String str4, String str5, Continuation<? super CRRubikRepository$getSimpleCategoryList$2> continuation) {
        super(2, continuation);
        this.this$0 = c31747mCk;
        this.$interval = str;
        this.$size = str2;
        this.$sortBy = str3;
        this.$timezone = str4;
        this.$fiat = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRRubikRepository$getSimpleCategoryList$2 cRRubikRepository$getSimpleCategoryList$2 = new CRRubikRepository$getSimpleCategoryList$2(this.this$0, this.$interval, this.$size, this.$sortBy, this.$timezone, this.$fiat, continuation);
        cRRubikRepository$getSimpleCategoryList$2.L$0 = obj;
        return cRRubikRepository$getSimpleCategoryList$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends SimpleCategoriesBean>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<SimpleCategoriesBean>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<SimpleCategoriesBean>, OKServerException>> continuation) {
        return ((CRRubikRepository$getSimpleCategoryList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31747mCk c31747mCk = this.this$0;
                String str = this.$interval;
                String str2 = this.$size;
                String str3 = this.$sortBy;
                String str4 = this.$timezone;
                String str5 = this.$fiat;
                InterfaceC31771mDh interfaceC31771mDh = c31747mCk.OLrzqt;
                this.label = 1;
                obj = interfaceC31771mDh.EZpvd(str, str2, str3, str4, str5, this);
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
        return mAY.OLrzqt(actionBar, new Function1() { // from class: o.mCT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRRubikRepository$getSimpleCategoryList$2.invokeSuspend$lambda$1((java.util.List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$1(List list) {
        return SimpleCategoriesBean.Companion.EZpvd(list);
    }
}
