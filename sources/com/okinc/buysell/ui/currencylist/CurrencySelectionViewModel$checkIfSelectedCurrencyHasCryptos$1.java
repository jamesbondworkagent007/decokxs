package com.okinc.buysell.ui.currencylist;

import com.okinc.okpaymentapi.data.remote.model.experience.CryptoListModel;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.management.BalanceAccountType;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31656lzd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lyD;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class CurrencySelectionViewModel$checkIfSelectedCurrencyHasCryptos$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    final /* synthetic */ String $selectedCurrency;
    final /* synthetic */ TradeType $tradeType;
    int label;
    final /* synthetic */ CurrencySelectionViewModel this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencySelectionViewModel$checkIfSelectedCurrencyHasCryptos$1(TradeType tradeType, CurrencySelectionViewModel currencySelectionViewModel, String str, Continuation<? super CurrencySelectionViewModel$checkIfSelectedCurrencyHasCryptos$1> continuation) {
        super(2, continuation);
        this.$tradeType = tradeType;
        this.this$0 = currencySelectionViewModel;
        this.$selectedCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurrencySelectionViewModel$checkIfSelectedCurrencyHasCryptos$1(this.$tradeType, this.this$0, this.$selectedCurrency, continuation);
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
        return ((CurrencySelectionViewModel$checkIfSelectedCurrencyHasCryptos$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        AbstractC43419rot abstractC43419rot2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                CurrencySelectionViewModel currencySelectionViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    CryptoListModel cryptoListModel = (CryptoListModel) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    mHA mha = mHA.OLrzqt;
                    mha.OLrzqt(currencySelectionViewModel.djBIcL, C56443yFo.KWHzl(true ^ cryptoListModel.getBuyCryptoList().isEmpty()));
                    mha.OLrzqt(currencySelectionViewModel.gEmmrt, C56443yFo.KWHzl(Intrinsics.EZpvd((Object) cryptoListModel.getBalanceAccountType(), (Object) BalanceAccountType.TRADING.getValue())));
                }
                CurrencySelectionViewModel currencySelectionViewModel2 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    return abstractC43419rot;
                }
                mHA mha2 = mHA.OLrzqt;
                mha2.OLrzqt(currencySelectionViewModel2.djBIcL, C56443yFo.KWHzl(false));
                mha2.OLrzqt(currencySelectionViewModel2.gEmmrt, C56443yFo.KWHzl(false));
                return abstractC43419rot;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            abstractC43419rot2 = (AbstractC43419rot) obj;
            CurrencySelectionViewModel currencySelectionViewModel3 = this.this$0;
            String str = this.$selectedCurrency;
            if (abstractC43419rot2 instanceof AbstractC43419rot.StateListAnimator) {
                List list = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot2).KWHzl();
                boolean zIsEmpty = true ^ list.isEmpty();
                if (currencySelectionViewModel3.AkhnZx().length() > 0 && zIsEmpty) {
                    if ((list instanceof Collection) && list.isEmpty()) {
                        mHA.OLrzqt.OLrzqt(currencySelectionViewModel3.isConnected, new Pair(str, currencySelectionViewModel3.AkhnZx()));
                        currencySelectionViewModel3.copydefault(((CurrencyToken) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getCurrency());
                    } else {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.EZpvd((Object) ((CurrencyToken) it.next()).getCurrency(), (Object) currencySelectionViewModel3.AkhnZx())) {
                                break;
                            }
                        }
                        mHA.OLrzqt.OLrzqt(currencySelectionViewModel3.isConnected, new Pair(str, currencySelectionViewModel3.AkhnZx()));
                        currencySelectionViewModel3.copydefault(((CurrencyToken) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getCurrency());
                    }
                }
                mHA.OLrzqt.OLrzqt(currencySelectionViewModel3.djBIcL, C56443yFo.KWHzl(zIsEmpty));
            }
            CurrencySelectionViewModel currencySelectionViewModel4 = this.this$0;
            if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                return abstractC43419rot2;
            }
            mHA.OLrzqt.OLrzqt(currencySelectionViewModel4.djBIcL, C56443yFo.KWHzl(false));
            return abstractC43419rot2;
        }
        C56391yDq.AEQbTJ(obj);
        int i2 = ActionBar.KWHzl[this.$tradeType.ordinal()];
        if (i2 == 1) {
            lyD lyd = this.this$0.DbNXlk;
            this.label = 1;
            obj = lyd.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            abstractC43419rot = (AbstractC43419rot) obj;
            CurrencySelectionViewModel currencySelectionViewModel5 = this.this$0;
            if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            }
            CurrencySelectionViewModel currencySelectionViewModel22 = this.this$0;
            if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            }
        } else if (i2 == 2) {
            C31656lzd c31656lzd = this.this$0.ejfBZ;
            String str2 = this.$selectedCurrency;
            this.label = 2;
            obj = C31656lzd.getSellCryptoList$default(c31656lzd, str2, false, this, 2, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            abstractC43419rot2 = (AbstractC43419rot) obj;
            CurrencySelectionViewModel currencySelectionViewModel32 = this.this$0;
            String str3 = this.$selectedCurrency;
            if (abstractC43419rot2 instanceof AbstractC43419rot.StateListAnimator) {
            }
            CurrencySelectionViewModel currencySelectionViewModel42 = this.this$0;
            if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
            }
        } else {
            mHA mha3 = mHA.OLrzqt;
            mha3.OLrzqt(this.this$0.djBIcL, C56443yFo.KWHzl(false));
            mha3.OLrzqt(this.this$0.gEmmrt, C56443yFo.KWHzl(false));
            return Unit.INSTANCE;
        }
    }
}
