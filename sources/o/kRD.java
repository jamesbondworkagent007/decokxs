package o;

import com.okinc.business.trade.features.home.advanced.usecase.AdvancedPricingTokensUseCase$getLimitOrderByList$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedPricingTokensUseCase$getLimitOrderByListIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedPricingTokensUseCase$getOrderTypes$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedPricingTokensUseCase$getOrderTypesgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedPricingTokensUseCase$getPricingTokens$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedPricingTokensUseCase$getPricingTokens0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.ui.cefi.data.PricingTokensRequest;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.UIPricingToken;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kRD {
    public final C30789lhl AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC25414iwK KWHzl;
    public final C28196kSl OLrzqt;
    public final kQA copydefault;

    @yCM
    public kRD(@NotNull kQA kqa, @NotNull C28196kSl c28196kSl, @NotNull C30789lhl c30789lhl, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kqa, "");
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(c30789lhl, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = kqa;
        this.OLrzqt = c28196kSl;
        this.AEQbTJ = c30789lhl;
        this.KWHzl = interfaceC25414iwK;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.util.List<UIPricingToken>>> continuation) {
        AdvancedPricingTokensUseCase$getPricingTokens$1 advancedPricingTokensUseCase$getPricingTokens$1;
        kRD krd;
        java.lang.String str3;
        java.lang.String str4;
        kRD krd2;
        java.lang.Object objM7386unboximpl;
        if (continuation instanceof AdvancedPricingTokensUseCase$getPricingTokens$1) {
            advancedPricingTokensUseCase$getPricingTokens$1 = (AdvancedPricingTokensUseCase$getPricingTokens$1) continuation;
            int i = advancedPricingTokensUseCase$getPricingTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedPricingTokensUseCase$getPricingTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedPricingTokensUseCase$getPricingTokens$1 = new AdvancedPricingTokensUseCase$getPricingTokens$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = advancedPricingTokensUseCase$getPricingTokens$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedPricingTokensUseCase$getPricingTokens$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C28196kSl c28196kSl = this.OLrzqt;
            advancedPricingTokensUseCase$getPricingTokens$1.L$0 = this;
            advancedPricingTokensUseCase$getPricingTokens$1.L$1 = str;
            advancedPricingTokensUseCase$getPricingTokens$1.L$2 = str2;
            advancedPricingTokensUseCase$getPricingTokens$1.label = 1;
            objOLrzqt = c28196kSl.OLrzqt(advancedPricingTokensUseCase$getPricingTokens$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            krd = this;
        } else if (i2 == 1) {
            str2 = (java.lang.String) advancedPricingTokensUseCase$getPricingTokens$1.L$2;
            str = (java.lang.String) advancedPricingTokensUseCase$getPricingTokens$1.L$1;
            krd = (kRD) advancedPricingTokensUseCase$getPricingTokens$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                krd2 = (kRD) advancedPricingTokensUseCase$getPricingTokens$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                objM7386unboximpl = ((Result) objOLrzqt).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    return Result.m7377constructorimpl(objM7386unboximpl);
                }
                try {
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(krd2.AEQbTJ.OLrzqt((java.util.List) objM7386unboximpl));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            }
            str4 = (java.lang.String) advancedPricingTokensUseCase$getPricingTokens$1.L$3;
            str2 = (java.lang.String) advancedPricingTokensUseCase$getPricingTokens$1.L$2;
            java.lang.String str5 = (java.lang.String) advancedPricingTokensUseCase$getPricingTokens$1.L$1;
            kRD krd3 = (kRD) advancedPricingTokensUseCase$getPricingTokens$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            str3 = str5;
            krd = krd3;
            PricingTokensRequest pricingTokensRequest = new PricingTokensRequest(str3, str2, str4, (java.lang.String) objOLrzqt);
            CoroutineDispatcher coroutineDispatcher = krd.EZpvd;
            AdvancedPricingTokensUseCase$getPricingTokens0E7RQCE$$inlined$dexRunCatching$1 advancedPricingTokensUseCase$getPricingTokens0E7RQCE$$inlined$dexRunCatching$1 = new AdvancedPricingTokensUseCase$getPricingTokens0E7RQCE$$inlined$dexRunCatching$1(null, krd, pricingTokensRequest);
            advancedPricingTokensUseCase$getPricingTokens$1.L$0 = krd;
            advancedPricingTokensUseCase$getPricingTokens$1.L$1 = null;
            advancedPricingTokensUseCase$getPricingTokens$1.L$2 = null;
            advancedPricingTokensUseCase$getPricingTokens$1.L$3 = null;
            advancedPricingTokensUseCase$getPricingTokens$1.label = 3;
            objOLrzqt = BuildersKt.withContext(coroutineDispatcher, advancedPricingTokensUseCase$getPricingTokens0E7RQCE$$inlined$dexRunCatching$1, advancedPricingTokensUseCase$getPricingTokens$1);
            if (objOLrzqt != objCopydefault) {
                return objCopydefault;
            }
            krd2 = krd;
            objM7386unboximpl = ((Result) objOLrzqt).m7386unboximpl();
            if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            }
        }
        java.lang.String str6 = (java.lang.String) objOLrzqt;
        C28196kSl c28196kSl2 = krd.OLrzqt;
        advancedPricingTokensUseCase$getPricingTokens$1.L$0 = krd;
        advancedPricingTokensUseCase$getPricingTokens$1.L$1 = str;
        advancedPricingTokensUseCase$getPricingTokens$1.L$2 = str2;
        advancedPricingTokensUseCase$getPricingTokens$1.L$3 = str6;
        advancedPricingTokensUseCase$getPricingTokens$1.label = 2;
        java.lang.Object objCopydefault2 = c28196kSl2.copydefault(advancedPricingTokensUseCase$getPricingTokens$1);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        str3 = str;
        str4 = str6;
        objOLrzqt = objCopydefault2;
        PricingTokensRequest pricingTokensRequest2 = new PricingTokensRequest(str3, str2, str4, (java.lang.String) objOLrzqt);
        CoroutineDispatcher coroutineDispatcher2 = krd.EZpvd;
        AdvancedPricingTokensUseCase$getPricingTokens0E7RQCE$$inlined$dexRunCatching$1 advancedPricingTokensUseCase$getPricingTokens0E7RQCE$$inlined$dexRunCatching$12 = new AdvancedPricingTokensUseCase$getPricingTokens0E7RQCE$$inlined$dexRunCatching$1(null, krd, pricingTokensRequest2);
        advancedPricingTokensUseCase$getPricingTokens$1.L$0 = krd;
        advancedPricingTokensUseCase$getPricingTokens$1.L$1 = null;
        advancedPricingTokensUseCase$getPricingTokens$1.L$2 = null;
        advancedPricingTokensUseCase$getPricingTokens$1.L$3 = null;
        advancedPricingTokensUseCase$getPricingTokens$1.label = 3;
        objOLrzqt = BuildersKt.withContext(coroutineDispatcher2, advancedPricingTokensUseCase$getPricingTokens0E7RQCE$$inlined$dexRunCatching$12, advancedPricingTokensUseCase$getPricingTokens$1);
        if (objOLrzqt != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Result<? extends java.util.List<C55276xgr>>> continuation) {
        AdvancedPricingTokensUseCase$getLimitOrderByList$1 advancedPricingTokensUseCase$getLimitOrderByList$1;
        if (continuation instanceof AdvancedPricingTokensUseCase$getLimitOrderByList$1) {
            advancedPricingTokensUseCase$getLimitOrderByList$1 = (AdvancedPricingTokensUseCase$getLimitOrderByList$1) continuation;
            int i = advancedPricingTokensUseCase$getLimitOrderByList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedPricingTokensUseCase$getLimitOrderByList$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedPricingTokensUseCase$getLimitOrderByList$1 = new AdvancedPricingTokensUseCase$getLimitOrderByList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedPricingTokensUseCase$getLimitOrderByList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedPricingTokensUseCase$getLimitOrderByList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            AdvancedPricingTokensUseCase$getLimitOrderByListIoAF18A$$inlined$dexRunCatching$1 advancedPricingTokensUseCase$getLimitOrderByListIoAF18A$$inlined$dexRunCatching$1 = new AdvancedPricingTokensUseCase$getLimitOrderByListIoAF18A$$inlined$dexRunCatching$1(null);
            advancedPricingTokensUseCase$getLimitOrderByList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedPricingTokensUseCase$getLimitOrderByListIoAF18A$$inlined$dexRunCatching$1, advancedPricingTokensUseCase$getLimitOrderByList$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: getOrderTypes-gIAlu-s$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8648getOrderTypesgIAlus$default(kRD krd, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return krd.OLrzqt(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(boolean z, @NotNull Continuation<? super Result<? extends java.util.List<C55276xgr>>> continuation) {
        AdvancedPricingTokensUseCase$getOrderTypes$1 advancedPricingTokensUseCase$getOrderTypes$1;
        if (continuation instanceof AdvancedPricingTokensUseCase$getOrderTypes$1) {
            advancedPricingTokensUseCase$getOrderTypes$1 = (AdvancedPricingTokensUseCase$getOrderTypes$1) continuation;
            int i = advancedPricingTokensUseCase$getOrderTypes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedPricingTokensUseCase$getOrderTypes$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedPricingTokensUseCase$getOrderTypes$1 = new AdvancedPricingTokensUseCase$getOrderTypes$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedPricingTokensUseCase$getOrderTypes$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedPricingTokensUseCase$getOrderTypes$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            AdvancedPricingTokensUseCase$getOrderTypesgIAlus$$inlined$dexRunCatching$1 advancedPricingTokensUseCase$getOrderTypesgIAlus$$inlined$dexRunCatching$1 = new AdvancedPricingTokensUseCase$getOrderTypesgIAlus$$inlined$dexRunCatching$1(null, this, z);
            advancedPricingTokensUseCase$getOrderTypes$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedPricingTokensUseCase$getOrderTypesgIAlus$$inlined$dexRunCatching$1, advancedPricingTokensUseCase$getOrderTypes$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
