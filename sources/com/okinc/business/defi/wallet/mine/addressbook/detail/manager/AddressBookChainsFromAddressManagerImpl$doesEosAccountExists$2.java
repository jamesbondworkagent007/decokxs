package com.okinc.business.defi.wallet.mine.addressbook.detail.manager;

import com.okinc.business.defi.biz.net.bean.EosAccountResp;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC43419rot;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C18733fnv;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressBookChainsFromAddressManagerImpl$doesEosAccountExists$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends Boolean, ? extends Unit>>, Object> {
    final /* synthetic */ String $address;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C18733fnv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressBookChainsFromAddressManagerImpl$doesEosAccountExists$2(C18733fnv c18733fnv, String str, Continuation<? super AddressBookChainsFromAddressManagerImpl$doesEosAccountExists$2> continuation) {
        super(2, continuation);
        this.this$0 = c18733fnv;
        this.$address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressBookChainsFromAddressManagerImpl$doesEosAccountExists$2(this.this$0, this.$address, continuation);
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
        return ((AddressBookChainsFromAddressManagerImpl$doesEosAccountExists$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C18733fnv c18733fnv;
        String str;
        ResponseData responseData;
        EosAccountResp eosAccountResp;
        String ownerKey;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            c18733fnv = this.this$0;
            str = this.$address;
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = c18733fnv.copydefault.copydefault(false);
            this.L$0 = c18733fnv;
            this.L$1 = str;
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
                if (responseData.getCode() == 0 || responseData.getData() == null || (eosAccountResp = (EosAccountResp) responseData.getData()) == null || (ownerKey = eosAccountResp.getOwnerKey()) == null || !C33129mqd.OLrzqt((CharSequence) ownerKey)) {
                    z = false;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
                Object obj2 = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
                if (!Result.m7384isSuccessimpl(objM7377constructorimpl) && obj2 != null) {
                    return new AbstractC43419rot.StateListAnimator(obj2);
                }
                Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                return new AbstractC43419rot.ActionBar(Unit.INSTANCE);
            }
            str = (String) this.L$1;
            c18733fnv = (C18733fnv) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
        AbstractC58185ywX<ResponseData<EosAccountResp>> abstractC58185ywXAEQbTJ = c18733fnv.AEQbTJ.AEQbTJ(abstractC12782ctV.USBtdM(), abstractC12782ctV.aUsmxb(), abstractC12782ctV.DbNXlk(), str);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = AwaitKt.awaitFirst(abstractC58185ywXAEQbTJ, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        responseData = (ResponseData) obj;
        if (responseData.getCode() == 0) {
            z = false;
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        return new AbstractC43419rot.ActionBar(Unit.INSTANCE);
    }
}
