package com.okinc.buysell.ui.bsc.cryptolist;

import com.okinc.buysell.util.PaymentLogger;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31656lzd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lyE;
import o.mHA;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class CryptoListBottomSheetViewModel$loadDataForSell$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $selectedCurrencyString;
    final /* synthetic */ boolean $shouldGetAvailableChannel;
    final /* synthetic */ long $startTime;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ CryptoListBottomSheetViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoListBottomSheetViewModel$loadDataForSell$1(long j, CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel, String str, boolean z, Continuation<? super CryptoListBottomSheetViewModel$loadDataForSell$1> continuation) {
        super(2, continuation);
        this.$startTime = j;
        this.this$0 = cryptoListBottomSheetViewModel;
        this.$selectedCurrencyString = str;
        this.$shouldGetAvailableChannel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoListBottomSheetViewModel$loadDataForSell$1(this.$startTime, this.this$0, this.$selectedCurrencyString, this.$shouldGetAvailableChannel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoListBottomSheetViewModel$loadDataForSell$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v25, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9 A[Catch: Exception -> 0x0141, TryCatch #0 {Exception -> 0x0141, blocks: (B:7:0x001f, B:25:0x00ad, B:26:0x00d3, B:28:0x00d9, B:30:0x00e6, B:37:0x00f2, B:38:0x00f5, B:40:0x00fb, B:42:0x0116, B:12:0x0030, B:19:0x007b, B:21:0x0089, B:15:0x0062), top: B:51:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb A[Catch: Exception -> 0x0141, TryCatch #0 {Exception -> 0x0141, blocks: (B:7:0x001f, B:25:0x00ad, B:26:0x00d3, B:28:0x00d9, B:30:0x00e6, B:37:0x00f2, B:38:0x00f5, B:40:0x00fb, B:42:0x0116, B:12:0x0030, B:19:0x007b, B:21:0x0089, B:15:0x0062), top: B:51:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116 A[Catch: Exception -> 0x0141, TRY_LEAVE, TryCatch #0 {Exception -> 0x0141, blocks: (B:7:0x001f, B:25:0x00ad, B:26:0x00d3, B:28:0x00d9, B:30:0x00e6, B:37:0x00f2, B:38:0x00f5, B:40:0x00fb, B:42:0x0116, B:12:0x0030, B:19:0x007b, B:21:0x0089, B:15:0x0062), top: B:51:0x0009 }] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        AbstractC43419rot abstractC43419rot;
        AbstractC43419rot abstractC43419rot2;
        boolean z;
        long j;
        List<CurrencyToken> list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            mHA.OLrzqt.OLrzqt(this.this$0.fetchVPNInfo, C56443yFo.KWHzl(true));
            this.this$0.KWHzl(false);
            PaymentLogger paymentLogger = PaymentLogger.EZpvd;
            PaymentLogger.Type type = PaymentLogger.Type.BSC_SELL;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            paymentLogger.AEQbTJ(type, message);
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PaymentLogger.EZpvd.EZpvd(PaymentLogger.Type.BSC_SELL, "cryptoList2: " + (System.currentTimeMillis() - this.$startTime));
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = yDY.AhwBna();
            C31656lzd c31656lzd = this.this$0.AuCTelauCTel;
            String str = this.$selectedCurrencyString;
            this.L$0 = objectRef2;
            this.label = 1;
            Object sellCryptoList$default = C31656lzd.getSellCryptoList$default(c31656lzd, str, false, this, 2, null);
            if (sellCryptoList$default == objCopydefault) {
                return objCopydefault;
            }
            objectRef = objectRef2;
            obj = sellCryptoList$default;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                j = this.J$0;
                List<CurrencyToken> list2 = (List) this.L$2;
                abstractC43419rot2 = (AbstractC43419rot) this.L$1;
                objectRef = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list = list2;
                PaymentLogger.EZpvd.EZpvd(PaymentLogger.Type.BSC_SELL, "cryptoList3: " + (System.currentTimeMillis() - j));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((CurrencyToken) obj2).getChannelAvailable()) {
                        arrayList.add(obj2);
                    }
                }
                if (z) {
                    arrayList = null;
                }
                objectRef.element = arrayList != null ? list : arrayList;
                abstractC43419rot = abstractC43419rot2;
                CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    mHA.OLrzqt.OLrzqt(cryptoListBottomSheetViewModel.gEmmrt, objectRef.element);
                    PaymentLogger.EZpvd.EZpvd(PaymentLogger.Type.BSC_SELL, "cryptoList4: " + (System.currentTimeMillis() - this.$startTime));
                    return Unit.INSTANCE;
                }
                mHA.OLrzqt.OLrzqt(cryptoListBottomSheetViewModel.fetchVPNInfo, C56443yFo.KWHzl(true));
                cryptoListBottomSheetViewModel.KWHzl(false);
                return Unit.INSTANCE;
            }
            Ref.ObjectRef objectRef3 = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objectRef = objectRef3;
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel2 = this.this$0;
        String str2 = this.$selectedCurrencyString;
        long j2 = this.$startTime;
        boolean z2 = this.$shouldGetAvailableChannel;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            List<CurrencyToken> list3 = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            lyE lye = cryptoListBottomSheetViewModel2.values;
            this.L$0 = objectRef;
            this.L$1 = abstractC43419rot;
            this.L$2 = list3;
            this.J$0 = j2;
            this.Z$0 = z2;
            this.label = 2;
            if (lye.copydefault(str2, list3, this) == objCopydefault) {
                return objCopydefault;
            }
            abstractC43419rot2 = abstractC43419rot;
            z = z2;
            j = j2;
            list = list3;
            PaymentLogger.EZpvd.EZpvd(PaymentLogger.Type.BSC_SELL, "cryptoList3: " + (System.currentTimeMillis() - j));
            ArrayList arrayList2 = new ArrayList();
            while (r5.hasNext()) {
            }
            if (z) {
            }
            objectRef.element = arrayList2 != null ? list : arrayList2;
            abstractC43419rot = abstractC43419rot2;
        }
        CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
    }
}
