package com.okinc.business.defi.biz.net.loader;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC13915dbb;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletLoader$evm5792QueryTx$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends String, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $dapp;
    final /* synthetic */ String $id;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C13934dbu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoader$evm5792QueryTx$2(C13934dbu c13934dbu, String str, String str2, Continuation<? super WalletLoader$evm5792QueryTx$2> continuation) {
        super(2, continuation);
        this.this$0 = c13934dbu;
        this.$dapp = str;
        this.$id = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletLoader$evm5792QueryTx$2 walletLoader$evm5792QueryTx$2 = new WalletLoader$evm5792QueryTx$2(this.this$0, this.$dapp, this.$id, continuation);
        walletLoader$evm5792QueryTx$2.L$0 = obj;
        return walletLoader$evm5792QueryTx$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends String, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<String, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<String, OKServerException>> continuation) {
        return ((WalletLoader$evm5792QueryTx$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C13934dbu c13934dbu = this.this$0;
                String str = this.$dapp;
                String str2 = this.$id;
                InterfaceC13915dbb interfaceC13915dbbEZpvd = c13934dbu.EZpvd();
                this.label = 1;
                obj = InterfaceC13915dbb.Application.evm5792QueryTx$default(interfaceC13915dbbEZpvd, str, str2, null, this, 4, null);
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
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            return new AbstractC43419rot.StateListAnimator(Json.Default.encodeToString(JsonElement.Companion.serializer(), (JsonElement) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()));
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) actionBar).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }
}
