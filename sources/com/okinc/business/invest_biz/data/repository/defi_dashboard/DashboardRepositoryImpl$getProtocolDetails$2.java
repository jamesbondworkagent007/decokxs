package com.okinc.business.invest_biz.data.repository.defi_dashboard;

import com.okinc.business.invest_biz.data.bean.response.DashboardProtocolDetailsResponse;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolDetailsParams;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolParams;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.internal.ArrayListSerializer;
import o.C33489mxS;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.iBL;
import o.iDM;
import o.iDV;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardRepositoryImpl$getProtocolDetails$2 extends SuspendLambda implements Function1<Continuation<? super iDV>, Object> {
    final /* synthetic */ String $accountIdParam;
    final /* synthetic */ String $address;
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ ProtocolDetailsParams $params;
    int label;
    final /* synthetic */ iDM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardRepositoryImpl$getProtocolDetails$2(iDM idm, String str, String str2, ProtocolDetailsParams protocolDetailsParams, String str3, Continuation<? super DashboardRepositoryImpl$getProtocolDetails$2> continuation) {
        super(1, continuation);
        this.this$0 = idm;
        this.$cacheKey = str;
        this.$accountIdParam = str2;
        this.$params = protocolDetailsParams;
        this.$address = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DashboardRepositoryImpl$getProtocolDetails$2(this.this$0, this.$cacheKey, this.$accountIdParam, this.$params, this.$address, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super iDV> continuation) {
        return ((DashboardRepositoryImpl$getProtocolDetails$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iDV idvCopydefault = this.this$0.djBIcL.copydefault(this.$cacheKey);
            if (idvCopydefault != null) {
                BuildersKt__Builders_commonKt.launch$default(this.this$0.EZpvd, null, null, new AnonymousClass1(this.this$0, this.$accountIdParam, this.$params, this.$address, this.$cacheKey, null), 3, null);
                return idvCopydefault;
            }
            iDM idm = this.this$0;
            String str = this.$accountIdParam;
            ProtocolDetailsParams protocolDetailsParams = this.$params;
            String str2 = this.$address;
            String str3 = this.$cacheKey;
            this.label = 1;
            obj = invokeSuspend$fetchAndCacheFromServer(idm, str, protocolDetailsParams, str2, str3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object invokeSuspend$fetchAndCacheFromServer(iDM idm, String str, ProtocolDetailsParams protocolDetailsParams, String str2, String str3, Continuation<? super iDV> continuation) throws Throwable {
        DashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$1 dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$1;
        if (continuation instanceof DashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$1) {
            dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$1 = (DashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$1) continuation;
            int i = dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$1.label = i - Integer.MIN_VALUE;
            } else {
                dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$1 = new DashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$1(continuation);
            }
        }
        DashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$1 dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$12 = dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$1;
        Object protocolDetails$default = dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(protocolDetails$default);
            InterfaceC25472ixP interfaceC25472ixPOLrzqt = idm.OLrzqt.OLrzqt();
            String strKWHzl = C33489mxS.KWHzl.KWHzl(new ArrayListSerializer(ProtocolParams.Companion.serializer()), protocolDetailsParams.OLrzqt());
            dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$12.L$0 = idm;
            dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$12.L$1 = str3;
            dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$12.label = 1;
            protocolDetails$default = InterfaceC25472ixP.getProtocolDetails$default(interfaceC25472ixPOLrzqt, null, str, strKWHzl, str2, dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$12, 1, null);
            if (protocolDetails$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$12.L$1;
            idm = (iDM) dashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$12.L$0;
            C56391yDq.AEQbTJ(protocolDetails$default);
        }
        List list = (List) iBL.unwrapResponseData$default((ResponseData) protocolDetails$default, null, 1, null);
        DashboardProtocolDetailsResponse dashboardProtocolDetailsResponse = list != null ? (DashboardProtocolDetailsResponse) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
        Intrinsics.copydefault(dashboardProtocolDetailsResponse);
        iDV idvEZpvd = idm.AYXKKw.EZpvd(dashboardProtocolDetailsResponse);
        idm.djBIcL.KWHzl(str3, idvEZpvd);
        return idvEZpvd;
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.data.repository.defi_dashboard.DashboardRepositoryImpl$getProtocolDetails$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountIdParam;
        final /* synthetic */ String $address;
        final /* synthetic */ String $cacheKey;
        final /* synthetic */ ProtocolDetailsParams $params;
        int label;
        final /* synthetic */ iDM this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(iDM idm, String str, ProtocolDetailsParams protocolDetailsParams, String str2, String str3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = idm;
            this.$accountIdParam = str;
            this.$params = protocolDetailsParams;
            this.$address = str2;
            this.$cacheKey = str3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$accountIdParam, this.$params, this.$address, this.$cacheKey, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    iDM idm = this.this$0;
                    String str = this.$accountIdParam;
                    ProtocolDetailsParams protocolDetailsParams = this.$params;
                    String str2 = this.$address;
                    String str3 = this.$cacheKey;
                    this.label = 1;
                    if (DashboardRepositoryImpl$getProtocolDetails$2.invokeSuspend$fetchAndCacheFromServer(idm, str, protocolDetailsParams, str2, str3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }
}
