package com.okinc.buysell.ui.bsc.cryptolist;

import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31656lzd;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31670lzr;
import o.lyD;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellCryptoListViewModel$fetchCryptoListData$asyncTasks$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    final /* synthetic */ BuySellCryptoListViewModel.ApiTask $apiTask;
    int label;
    final /* synthetic */ BuySellCryptoListViewModel this$0;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BuySellCryptoListViewModel.ApiTask.values().length];
            try {
                iArr[BuySellCryptoListViewModel.ApiTask.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BuySellCryptoListViewModel.ApiTask.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BuySellCryptoListViewModel.ApiTask.UK_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuySellCryptoListViewModel$fetchCryptoListData$asyncTasks$1$1(BuySellCryptoListViewModel.ApiTask apiTask, BuySellCryptoListViewModel buySellCryptoListViewModel, Continuation<? super BuySellCryptoListViewModel$fetchCryptoListData$asyncTasks$1$1> continuation) {
        super(2, continuation);
        this.$apiTask = apiTask;
        this.this$0 = buySellCryptoListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuySellCryptoListViewModel$fetchCryptoListData$asyncTasks$1$1(this.$apiTask, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, (Continuation<Object>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return ((BuySellCryptoListViewModel$fetchCryptoListData$asyncTasks$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return (AbstractC43419rot) obj;
            }
            if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                return (AbstractC43419rot) obj;
            }
            if (i == 3) {
                C56391yDq.AEQbTJ(obj);
                return (AbstractC43419rot) obj;
            }
            if (i == 4) {
                C56391yDq.AEQbTJ(obj);
                return (AbstractC43419rot) obj;
            }
            if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return obj;
        }
        C56391yDq.AEQbTJ(obj);
        int i2 = ActionBar.OLrzqt[this.$apiTask.ordinal()];
        if (i2 == 1) {
            if (this.this$0.isConnected()) {
                lyD lyd = this.this$0.djBIcL;
                this.label = 1;
                obj = lyd.AEQbTJ(300, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                return (AbstractC43419rot) obj;
            }
            lyD lyd2 = this.this$0.djBIcL;
            this.label = 2;
            obj = lyd2.copydefault(300, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (AbstractC43419rot) obj;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
            this.label = 5;
            Object objEZpvd = interfaceC31670lzr.EZpvd(this);
            return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
        }
        if (this.this$0.isConnected()) {
            C31656lzd c31656lzd = this.this$0.hDKMBd;
            String strOLrzqt = this.this$0.gEmmrt().OLrzqt();
            this.label = 3;
            obj = c31656lzd.EZpvd(strOLrzqt, true, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (AbstractC43419rot) obj;
        }
        C31656lzd c31656lzd2 = this.this$0.hDKMBd;
        String strOLrzqt2 = this.this$0.gEmmrt().OLrzqt();
        this.label = 4;
        obj = c31656lzd2.copydefault(strOLrzqt2, true, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        return (AbstractC43419rot) obj;
    }
}
