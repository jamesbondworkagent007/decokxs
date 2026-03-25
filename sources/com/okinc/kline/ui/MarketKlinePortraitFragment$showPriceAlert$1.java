package com.okinc.kline.ui;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.market.common.biz_spot.bean.UnifiedPriceRemind;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC38834pgs;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43033rhe;
import o.InterfaceC43036rhh;
import o.ViewOnClickListenerC38857phO;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketKlinePortraitFragment$showPriceAlert$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ViewOnClickListenerC38857phO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketKlinePortraitFragment$showPriceAlert$1(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, Continuation<? super MarketKlinePortraitFragment$showPriceAlert$1> continuation) {
        super(2, continuation);
        this.this$0 = viewOnClickListenerC38857phO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketKlinePortraitFragment$showPriceAlert$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketKlinePortraitFragment$showPriceAlert$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ViewOnClickListenerC38857phO viewOnClickListenerC38857phO;
        String strFIwbmz;
        Object objCreatePriceRemind$default;
        InterfaceC43033rhe interfaceC43033rhe;
        String tLocalPrice;
        String tPriceNoTh;
        String instrumentId;
        String instrumentType;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String strEjfBZ = this.this$0.ejfBZ();
            if (strEjfBZ != null && (strFIwbmz = (viewOnClickListenerC38857phO = this.this$0).fIwbmz()) != null) {
                InterfaceC43036rhh interfaceC43036rhhAEQbTJ = ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).AEQbTJ();
                FragmentManager childFragmentManager = viewOnClickListenerC38857phO.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                this.L$0 = viewOnClickListenerC38857phO;
                this.label = 1;
                objCreatePriceRemind$default = InterfaceC43036rhh.TaskDescription.createPriceRemind$default(interfaceC43036rhhAEQbTJ, strEjfBZ, strFIwbmz, 1, null, childFragmentManager, this, 8, null);
                if (objCreatePriceRemind$default == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ViewOnClickListenerC38857phO viewOnClickListenerC38857phO2 = (ViewOnClickListenerC38857phO) this.L$0;
        C56391yDq.AEQbTJ(obj);
        viewOnClickListenerC38857phO = viewOnClickListenerC38857phO2;
        objCreatePriceRemind$default = obj;
        if (((Boolean) objCreatePriceRemind$default).booleanValue() && viewOnClickListenerC38857phO.fARcdN() != null) {
            String strAEQbTJ = viewOnClickListenerC38857phO.AEQbTJ(false);
            MarketCoinInfo marketCoinInfoFARcdN = viewOnClickListenerC38857phO.fARcdN();
            String str = (marketCoinInfoFARcdN == null || (instrumentType = marketCoinInfoFARcdN.getInstrumentType()) == null) ? "" : instrumentType;
            MarketCoinInfo marketCoinInfoFARcdN2 = viewOnClickListenerC38857phO.fARcdN();
            String str2 = (marketCoinInfoFARcdN2 == null || (instrumentId = marketCoinInfoFARcdN2.getInstrumentId()) == null) ? "" : instrumentId;
            MarketTopInfo marketTopInfo = viewOnClickListenerC38857phO.gkJEwt;
            String str3 = (marketTopInfo == null || (tPriceNoTh = marketTopInfo.getTPriceNoTh()) == null) ? "" : tPriceNoTh;
            MarketTopInfo marketTopInfo2 = viewOnClickListenerC38857phO.gkJEwt;
            String str4 = (marketTopInfo2 == null || (tLocalPrice = marketTopInfo2.getTLocalPrice()) == null) ? "" : tLocalPrice;
            String simpleName = ActivityC38834pgs.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            UnifiedPriceRemind unifiedPriceRemind = new UnifiedPriceRemind(strAEQbTJ, str, str2, str3, str4, simpleName, (String) null, 1, 64, (DefaultConstructorMarker) null);
            Activity activity = viewOnClickListenerC38857phO.AkhnZx;
            if (activity != null && (interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class)) != null) {
                InterfaceC43033rhe.StateListAnimator.gotoAllPriceRemindActivity$default(interfaceC43033rhe, activity, unifiedPriceRemind, null, 4, null);
            }
        }
        return Unit.INSTANCE;
    }
}
