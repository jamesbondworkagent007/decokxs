package com.okinc.buysell.ui.bsc.cryptolist;

import android.graphics.drawable.Drawable;
import com.okinc.buysell.util.PaymentLogger;
import com.okinc.okpaymentapi.data.remote.model.experience.CryptoListModel;
import com.okinc.okpaymentapi.data.remote.model.management.BalanceAccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lyD;
import o.lyE;
import o.mHA;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class CryptoListBottomSheetViewModel$loadDataForBuy$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ CryptoListBottomSheetViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoListBottomSheetViewModel$loadDataForBuy$1(long j, CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel, Continuation<? super CryptoListBottomSheetViewModel$loadDataForBuy$1> continuation) {
        super(2, continuation);
        this.$startTime = j;
        this.this$0 = cryptoListBottomSheetViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoListBottomSheetViewModel$loadDataForBuy$1(this.$startTime, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoListBottomSheetViewModel$loadDataForBuy$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:7:0x0020, B:24:0x00c2, B:25:0x00e8, B:27:0x00ee, B:29:0x0115, B:12:0x0031, B:18:0x0076, B:20:0x0080, B:15:0x0064), top: B:43:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115 A[Catch: Exception -> 0x0140, TRY_LEAVE, TryCatch #0 {Exception -> 0x0140, blocks: (B:7:0x0020, B:24:0x00c2, B:25:0x00e8, B:27:0x00ee, B:29:0x0115, B:12:0x0031, B:18:0x0076, B:20:0x0080, B:15:0x0064), top: B:43:0x000a }] */
    /* JADX WARN: Type inference failed for: r4v10, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Object objCopydefault;
        AbstractC43419rot abstractC43419rot;
        CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel;
        CryptoListModel cryptoListModel;
        Ref.ObjectRef objectRef2;
        AbstractC43419rot abstractC43419rot2;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            C55328xhq c55328xhq = C55328xhq.OLrzqt;
            String message = e.getMessage();
            C55328xhq.show$default(c55328xhq, message == null ? "" : message, (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
            mHA mha = mHA.OLrzqt;
            mha.OLrzqt(this.this$0.fetchVPNInfo, C56443yFo.KWHzl(true));
            mha.OLrzqt(this.this$0.AhwBna, C56443yFo.KWHzl(false));
            this.this$0.KWHzl(false);
            PaymentLogger paymentLogger = PaymentLogger.EZpvd;
            PaymentLogger.Type type = PaymentLogger.Type.BSC_BUY;
            String message2 = e.getMessage();
            paymentLogger.AEQbTJ(type, message2 != null ? message2 : "");
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PaymentLogger.EZpvd.EZpvd(PaymentLogger.Type.BSC_BUY, "cryptoList2: " + (System.currentTimeMillis() - this.$startTime));
            objectRef = new Ref.ObjectRef();
            objectRef.element = yDY.AhwBna();
            lyD lyd = this.this$0.AkhnZx;
            this.L$0 = objectRef;
            this.label = 1;
            objCopydefault = lyd.copydefault(5, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cryptoListModel = (CryptoListModel) this.L$3;
                abstractC43419rot2 = (AbstractC43419rot) this.L$2;
                cryptoListBottomSheetViewModel = (CryptoListBottomSheetViewModel) this.L$1;
                objectRef2 = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef2.element = cryptoListModel.getBuyCryptoList();
                mHA.OLrzqt.OLrzqt(cryptoListBottomSheetViewModel.AhwBna, C56443yFo.KWHzl(Intrinsics.EZpvd((Object) cryptoListModel.getBalanceAccountType(), (Object) BalanceAccountType.TRADING.getValue())));
                Ref.ObjectRef objectRef3 = objectRef2;
                abstractC43419rot = abstractC43419rot2;
                objectRef = objectRef3;
                CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel2 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    mHA.OLrzqt.OLrzqt(cryptoListBottomSheetViewModel2.gEmmrt, objectRef.element);
                    PaymentLogger.EZpvd.EZpvd(PaymentLogger.Type.BSC_BUY, "cryptoList5: " + (System.currentTimeMillis() - this.$startTime));
                    return Unit.INSTANCE;
                }
                mHA mha2 = mHA.OLrzqt;
                mha2.OLrzqt(cryptoListBottomSheetViewModel2.fetchVPNInfo, C56443yFo.KWHzl(true));
                mha2.OLrzqt(cryptoListBottomSheetViewModel2.AhwBna, C56443yFo.KWHzl(false));
                cryptoListBottomSheetViewModel2.KWHzl(false);
                return Unit.INSTANCE;
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        abstractC43419rot = (AbstractC43419rot) objCopydefault;
        long j = this.$startTime;
        CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            CryptoListModel cryptoListModel2 = (CryptoListModel) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            PaymentLogger.EZpvd.EZpvd(PaymentLogger.Type.BSC_BUY, "cryptoList4: " + (System.currentTimeMillis() - j));
            lyE lye = cryptoListBottomSheetViewModel3.values;
            this.L$0 = objectRef;
            this.L$1 = cryptoListBottomSheetViewModel3;
            this.L$2 = abstractC43419rot;
            this.L$3 = cryptoListModel2;
            this.label = 2;
            if (lye.copydefault(cryptoListModel2, this) == objCopydefault2) {
                return objCopydefault2;
            }
            cryptoListBottomSheetViewModel = cryptoListBottomSheetViewModel3;
            cryptoListModel = cryptoListModel2;
            objectRef2 = objectRef;
            abstractC43419rot2 = abstractC43419rot;
            objectRef2.element = cryptoListModel.getBuyCryptoList();
            mHA.OLrzqt.OLrzqt(cryptoListBottomSheetViewModel.AhwBna, C56443yFo.KWHzl(Intrinsics.EZpvd((Object) cryptoListModel.getBalanceAccountType(), (Object) BalanceAccountType.TRADING.getValue())));
            Ref.ObjectRef objectRef32 = objectRef2;
            abstractC43419rot = abstractC43419rot2;
            objectRef = objectRef32;
        }
        CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel22 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
    }
}
