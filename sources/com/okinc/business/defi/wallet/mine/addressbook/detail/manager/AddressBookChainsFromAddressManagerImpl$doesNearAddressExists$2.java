package com.okinc.business.defi.wallet.mine.addressbook.detail.manager;

import com.okinc.business.defi.biz.net.bean.CheckAddressResp;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC43419rot;
import o.AbstractC58185ywX;
import o.C10854bwM;
import o.C10954byG;
import o.C18733fnv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressBookChainsFromAddressManagerImpl$doesNearAddressExists$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends Boolean, ? extends Unit>>, Object> {
    final /* synthetic */ String $address;
    int label;
    final /* synthetic */ C18733fnv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressBookChainsFromAddressManagerImpl$doesNearAddressExists$2(C18733fnv c18733fnv, String str, Continuation<? super AddressBookChainsFromAddressManagerImpl$doesNearAddressExists$2> continuation) {
        super(2, continuation);
        this.this$0 = c18733fnv;
        this.$address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressBookChainsFromAddressManagerImpl$doesNearAddressExists$2(this.this$0, this.$address, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends Boolean, ? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<Boolean, Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<Boolean, Unit>> continuation) {
        return ((AddressBookChainsFromAddressManagerImpl$doesNearAddressExists$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean zEZpvd = false;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C18733fnv c18733fnv = this.this$0;
            String str = this.$address;
            Result.Application application2 = Result.Companion;
            C10854bwM c10854bwMAuCTel = C10954byG.EZpvd.valueOf().AuCTel();
            if (c10854bwMAuCTel != null) {
                AbstractC58185ywX<ResponseData<CheckAddressResp>> abstractC58185ywXOLrzqt = c18733fnv.AEQbTJ.OLrzqt(c10854bwMAuCTel.AhwBna(), str);
                this.label = 1;
                obj = AwaitKt.awaitFirst(abstractC58185ywXOLrzqt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(zEZpvd));
            Object obj2 = !Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
            if (!Result.m7384isSuccessimpl(objM7377constructorimpl) && obj2 != null) {
                return new AbstractC43419rot.StateListAnimator(obj2);
            }
            Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            return new AbstractC43419rot.ActionBar(Unit.INSTANCE);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        ResponseData responseData = (ResponseData) obj;
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            return new AbstractC43419rot.StateListAnimator(C56443yFo.KWHzl(false));
        }
        CheckAddressResp checkAddressResp = (CheckAddressResp) responseData.getData();
        if (checkAddressResp != null) {
            zEZpvd = Intrinsics.EZpvd(checkAddressResp.getRes(), C56443yFo.KWHzl(true));
        }
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(zEZpvd));
        if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        return new AbstractC43419rot.ActionBar(Unit.INSTANCE);
    }
}
