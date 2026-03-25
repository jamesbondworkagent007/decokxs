package com.okinc.buysell.ui.bsc;

import android.graphics.drawable.Drawable;
import com.okinc.buysell.analytics.GrafanaProperty;
import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.crcore.shared.net.responsebean.DexBaseTokenBean;
import com.okinc.crcore.shared.net.responsebean.bsc.DexTradeStatusCheckBean;
import com.okinc.crcore.shared.net.responsebean.bsc.TradeSuggestionBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.experience.DexInfo;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.AbstractC43419rot;
import o.C31351lsQ;
import o.C31353lsS;
import o.C31667lzo;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31668lzp;
import o.mHA;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseBuySellViewModel$getTradeSuggestionDataForDexToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Deferred<AbstractC43419rot<?, ?>>> $asyncTasks;
    final /* synthetic */ CurrencyToken $baseCurrencyToken;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ BaseBuySellViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBuySellViewModel$getTradeSuggestionDataForDexToken$1(List<Deferred<AbstractC43419rot<?, ?>>> list, BaseBuySellViewModel baseBuySellViewModel, CurrencyToken currencyToken, Continuation<? super BaseBuySellViewModel$getTradeSuggestionDataForDexToken$1> continuation) {
        super(2, continuation);
        this.$asyncTasks = list;
        this.this$0 = baseBuySellViewModel;
        this.$baseCurrencyToken = currencyToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseBuySellViewModel$getTradeSuggestionDataForDexToken$1(this.$asyncTasks, this.this$0, this.$baseCurrencyToken, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseBuySellViewModel$getTradeSuggestionDataForDexToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026a  */
    /* JADX WARN: Type inference failed for: r12v12, types: [T, com.okinc.crcore.shared.net.responsebean.bsc.DexTradeStatusCheckBean] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAwaitAll;
        Ref.ObjectRef objectRef;
        Object objAEQbTJ;
        DexTradeStatusCheckBean dexTradeStatusCheckBean;
        BaseBuySellViewModel baseBuySellViewModel;
        DexBaseTokenBean dexBaseTokenBean;
        TradeSuggestionBean tradeSuggestionBean;
        boolean zBooleanValue;
        BaseBuySellViewModel.Companion.DexTradeStatus dexTradeStatusKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<Deferred<AbstractC43419rot<?, ?>>> list = this.$asyncTasks;
            this.label = 1;
            objAwaitAll = AwaitKt.awaitAll(list, this);
            if (objAwaitAll == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dexTradeStatusCheckBean = (DexTradeStatusCheckBean) this.L$2;
                baseBuySellViewModel = (BaseBuySellViewModel) this.L$1;
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef2;
                objAEQbTJ = obj;
                zBooleanValue = ((Boolean) objAEQbTJ).booleanValue();
                pUU.OLrzqt("isPasskeyCompatible, " + zBooleanValue);
                if (zBooleanValue) {
                    baseBuySellViewModel.OcIXYQ = new BaseBuySellViewModel.Companion.ActionBar(C33070mpX.AYXKKw(C31351lsQ.Activity.fXHmeK), BaseBuySellViewModel.Companion.DexTradeStatus.PASSKEY_INCOMPATIBLE);
                } else {
                    if (Intrinsics.EZpvd((Object) dexTradeStatusCheckBean.getErrorCode(), (Object) BaseBuySellViewModel.Companion.DexTradeStatus.INVALID_DEX_TOKEN.getCode())) {
                        dexTradeStatusKWHzl = BaseBuySellViewModel.Companion.DexTradeStatus.NO_ERROR;
                    } else {
                        dexTradeStatusKWHzl = BaseBuySellViewModel.Companion.DexTradeStatus.Companion.KWHzl(dexTradeStatusCheckBean.getErrorCode());
                    }
                    baseBuySellViewModel.OcIXYQ = new BaseBuySellViewModel.Companion.ActionBar(C33129mqd.gEmmrt(dexTradeStatusCheckBean.getErrorMessage()), dexTradeStatusKWHzl);
                }
                if (baseBuySellViewModel.fIwbmz().copydefault() != BaseBuySellViewModel.Companion.DexTradeStatus.NO_ERROR) {
                    if (baseBuySellViewModel.flVtFt() == TradeType.BUY) {
                        mHA.OLrzqt.KWHzl(baseBuySellViewModel.valueOf);
                    } else {
                        mHA.OLrzqt.KWHzl(baseBuySellViewModel.values);
                    }
                }
                new C31353lsS().copydefault(GrafanaProperty.Page.DEX_TRADE_STATUS_BSC.getType()).EZpvd();
                tradeSuggestionBean = (TradeSuggestionBean) objectRef.element;
                if (tradeSuggestionBean != null) {
                    BaseBuySellViewModel baseBuySellViewModel2 = this.this$0;
                    CurrencyToken currencyToken = this.$baseCurrencyToken;
                    baseBuySellViewModel2.OLrzqt(tradeSuggestionBean.getBaseCurrency().getDexInfoBean());
                    baseBuySellViewModel2.iRxXKY = baseBuySellViewModel2.dNCPSb() && tradeSuggestionBean.getMultipleCurrencyEnabled();
                    baseBuySellViewModel2.wlaJM = C31667lzo.AEQbTJ(tradeSuggestionBean);
                    baseBuySellViewModel2.OLrzqt(tradeSuggestionBean);
                    baseBuySellViewModel2.gEmmrt(C31667lzo.AEQbTJ(tradeSuggestionBean, currencyToken.getCurrency()));
                    baseBuySellViewModel2.djBIcL(false);
                    baseBuySellViewModel2.AEQbTJ(tradeSuggestionBean);
                }
                if (this.this$0.flVtFt() != TradeType.BUY) {
                    mHA.OLrzqt.KWHzl(this.this$0.getFieldNames);
                } else {
                    mHA.OLrzqt.KWHzl(this.this$0.zsXlph);
                }
                this.this$0.AEQbTJ(false);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objAwaitAll = obj;
        }
        objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        BaseBuySellViewModel baseBuySellViewModel3 = this.this$0;
        int i2 = 0;
        for (Object obj2 : (List) objAwaitAll) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj2;
            if (i2 == 0) {
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    Object objKWHzl = ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    objectRef.element = objKWHzl instanceof TradeSuggestionBean ? (TradeSuggestionBean) objKWHzl : 0;
                }
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    Object objKWHzl2 = ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                    baseBuySellViewModel3.KWHzl(new DexInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, false, (String) null, 65535, (DefaultConstructorMarker) null));
                    OKServerException oKServerException = objKWHzl2 instanceof OKServerException ? (OKServerException) objKWHzl2 : null;
                    if (oKServerException != null) {
                        C55326xho.toast$default(oKServerException.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                        mHA.OLrzqt.OLrzqt(baseBuySellViewModel3.AuCTel, C56443yFo.KWHzl(true));
                    }
                }
            } else if (i2 == 1) {
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    Object objKWHzl3 = ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    objectRef3.element = objKWHzl3 instanceof DexTradeStatusCheckBean ? (DexTradeStatusCheckBean) objKWHzl3 : 0;
                }
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    Object objKWHzl4 = ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                    if ((objKWHzl4 instanceof OKServerException) && !Intrinsics.EZpvd((Object) String.valueOf(((OKServerException) objKWHzl4).getCode()), (Object) BaseBuySellViewModel.Companion.DexTradeStatus.DEX_FEATURE_NOT_AVAILABLE.getCode())) {
                        objectRef3.element = new DexTradeStatusCheckBean(BaseBuySellViewModel.Companion.DexTradeStatus.UNKNOWN.getCode(), C33070mpX.AYXKKw(C31351lsQ.Activity.gGvvIC));
                    }
                }
            } else if (i2 == 2) {
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    Object objKWHzl5 = ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    List list2 = objKWHzl5 instanceof List ? (List) objKWHzl5 : null;
                    if (list2 != null && (dexBaseTokenBean = (DexBaseTokenBean) CollectionsKt___CollectionsKt.AkhnZx(list2, 0)) != null) {
                        baseBuySellViewModel3.gEmmrt(dexBaseTokenBean.getDecimals());
                    }
                }
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                    pUU.OLrzqt("getBaseTokenInfo failed");
                }
            }
            i2++;
        }
        DexTradeStatusCheckBean dexTradeStatusCheckBean2 = (DexTradeStatusCheckBean) objectRef3.element;
        if (dexTradeStatusCheckBean2 != null) {
            BaseBuySellViewModel baseBuySellViewModel4 = this.this$0;
            InterfaceC31668lzp interfaceC31668lzp = (InterfaceC31668lzp) C43251rlk.copydefault(InterfaceC31668lzp.class);
            this.L$0 = objectRef;
            this.L$1 = baseBuySellViewModel4;
            this.L$2 = dexTradeStatusCheckBean2;
            this.label = 2;
            objAEQbTJ = interfaceC31668lzp.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            dexTradeStatusCheckBean = dexTradeStatusCheckBean2;
            baseBuySellViewModel = baseBuySellViewModel4;
            zBooleanValue = ((Boolean) objAEQbTJ).booleanValue();
            pUU.OLrzqt("isPasskeyCompatible, " + zBooleanValue);
            if (zBooleanValue) {
            }
            if (baseBuySellViewModel.fIwbmz().copydefault() != BaseBuySellViewModel.Companion.DexTradeStatus.NO_ERROR) {
            }
            new C31353lsS().copydefault(GrafanaProperty.Page.DEX_TRADE_STATUS_BSC.getType()).EZpvd();
        }
        tradeSuggestionBean = (TradeSuggestionBean) objectRef.element;
        if (tradeSuggestionBean != null) {
        }
        if (this.this$0.flVtFt() != TradeType.BUY) {
        }
        this.this$0.AEQbTJ(false);
        return Unit.INSTANCE;
    }
}
