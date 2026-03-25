package com.okinc.ok_kyc_core.domain.usecase;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UrlVendorResultResp;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43702ruK;

/* JADX INFO: loaded from: classes23.dex */
public final class GetUrlVendorUseCase$getUrlVendorResult$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<UrlVendorResultResp>>, Object> {
    final /* synthetic */ Map<String, String> $param;
    final /* synthetic */ String $url;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUrlVendorUseCase$getUrlVendorResult$2$1(String str, Map<String, String> map, Continuation<? super GetUrlVendorUseCase$getUrlVendorResult$2$1> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$param = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetUrlVendorUseCase$getUrlVendorResult$2$1(this.$url, this.$param, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<UrlVendorResultResp>> continuation) {
        return ((GetUrlVendorUseCase$getUrlVendorResult$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ruK.Activity.getInstance$default(o.ruK$Activity, java.lang.String, java.util.HashMap, int, java.lang.Object):o.ruK */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC43702ruK instance$default = InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null);
            String str = this.$url;
            Map<String, String> map = this.$param;
            if (map == null) {
                map = new HashMap<>();
            }
            this.label = 1;
            obj = instance$default.AEQbTJ(str, map, this);
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
        return new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getMsg(), responseData.getData(), responseData.getMsg());
    }
}
