package com.okinc.kline.ui.arb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
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
import o.C33070mpX;
import o.C35964oKf;
import o.C39014pkM;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43033rhe;
import o.InterfaceC43036rhh;
import o.ViewOnClickListenerC38981pjg;
import o.ViewOnClickListenerC54939xaY;

/* JADX INFO: loaded from: classes8.dex */
public final class ArbMarketKlinePortraitFragment$onClick$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ViewOnClickListenerC38981pjg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArbMarketKlinePortraitFragment$onClick$3(ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg, Continuation<? super ArbMarketKlinePortraitFragment$onClick$3> continuation) {
        super(2, continuation);
        this.this$0 = viewOnClickListenerC38981pjg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ArbMarketKlinePortraitFragment$onClick$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ArbMarketKlinePortraitFragment$onClick$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String selectInstId;
        ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg;
        MarketArbCoinInfo marketArbCoinInfoCopydefault;
        String selectInstType;
        int iAuCTel;
        Object objCreatePriceRemind$default;
        MarketArbCoinInfo marketArbCoinInfoCopydefault2;
        InterfaceC43033rhe interfaceC43033rhe;
        String tLocalPrice;
        String tPriceNoTh;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketArbCoinInfo marketArbCoinInfoCopydefault3 = this.this$0.copydefault();
            if (marketArbCoinInfoCopydefault3 != null && (selectInstId = marketArbCoinInfoCopydefault3.getSelectInstId()) != null && (marketArbCoinInfoCopydefault = (viewOnClickListenerC38981pjg = this.this$0).copydefault()) != null && (selectInstType = marketArbCoinInfoCopydefault.getSelectInstType()) != null) {
                MarketArbCoinInfo marketArbCoinInfoCopydefault4 = viewOnClickListenerC38981pjg.copydefault();
                if (marketArbCoinInfoCopydefault4 == null || marketArbCoinInfoCopydefault4.isSelectLeft()) {
                    C39014pkM c39014pkMKWHzl = viewOnClickListenerC38981pjg.KWHzl();
                    if (c39014pkMKWHzl != null) {
                        iAuCTel = c39014pkMKWHzl.AuCTel();
                        if (iAuCTel >= 30) {
                            Context context = viewOnClickListenerC38981pjg.getContext();
                            if (context != null) {
                                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35964oKf.Fragment.apHBvG));
                                viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C35964oKf.Fragment.gdwsGQ), new View.OnClickListener() { // from class: o.pjC
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view) {
                                        viewOnClickListenerC54939xaY.dismiss();
                                    }
                                });
                                viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C35964oKf.Fragment.HJWChPdNQGVJ), new View.OnClickListener() { // from class: o.pjE
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view) {
                                        viewOnClickListenerC54939xaY.dismiss();
                                    }
                                });
                                viewOnClickListenerC54939xaY.show();
                            }
                        }
                    }
                    InterfaceC43036rhh interfaceC43036rhhAEQbTJ = ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).AEQbTJ();
                    FragmentManager childFragmentManager = viewOnClickListenerC38981pjg.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    this.L$0 = viewOnClickListenerC38981pjg;
                    this.label = 1;
                    objCreatePriceRemind$default = InterfaceC43036rhh.TaskDescription.createPriceRemind$default(interfaceC43036rhhAEQbTJ, selectInstId, selectInstType, 1, null, childFragmentManager, this, 8, null);
                    if (objCreatePriceRemind$default == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    C39014pkM c39014pkMEZpvd = viewOnClickListenerC38981pjg.EZpvd();
                    if (c39014pkMEZpvd != null) {
                        iAuCTel = c39014pkMEZpvd.AuCTel();
                        if (iAuCTel >= 30) {
                        }
                    }
                    InterfaceC43036rhh interfaceC43036rhhAEQbTJ2 = ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).AEQbTJ();
                    FragmentManager childFragmentManager2 = viewOnClickListenerC38981pjg.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                    this.L$0 = viewOnClickListenerC38981pjg;
                    this.label = 1;
                    objCreatePriceRemind$default = InterfaceC43036rhh.TaskDescription.createPriceRemind$default(interfaceC43036rhhAEQbTJ2, selectInstId, selectInstType, 1, null, childFragmentManager2, this, 8, null);
                    if (objCreatePriceRemind$default == objCopydefault) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg2 = (ViewOnClickListenerC38981pjg) this.L$0;
        C56391yDq.AEQbTJ(obj);
        viewOnClickListenerC38981pjg = viewOnClickListenerC38981pjg2;
        objCreatePriceRemind$default = obj;
        if (((Boolean) objCreatePriceRemind$default).booleanValue() && (marketArbCoinInfoCopydefault2 = viewOnClickListenerC38981pjg.copydefault()) != null) {
            TextView textView = viewOnClickListenerC38981pjg.UeEOUB;
            String strValueOf = String.valueOf(textView != null ? textView.getText() : null);
            String selectInstType2 = marketArbCoinInfoCopydefault2.getSelectInstType();
            String selectInstId2 = marketArbCoinInfoCopydefault2.getSelectInstId();
            MarketTopInfo marketTopInfo = viewOnClickListenerC38981pjg.QVAiDq;
            String str = (marketTopInfo == null || (tPriceNoTh = marketTopInfo.getTPriceNoTh()) == null) ? "" : tPriceNoTh;
            MarketTopInfo marketTopInfo2 = viewOnClickListenerC38981pjg.QVAiDq;
            String str2 = (marketTopInfo2 == null || (tLocalPrice = marketTopInfo2.getTLocalPrice()) == null) ? "" : tLocalPrice;
            String simpleName = ActivityC38834pgs.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            UnifiedPriceRemind unifiedPriceRemind = new UnifiedPriceRemind(strValueOf, selectInstType2, selectInstId2, str, str2, simpleName, (String) null, 1, 64, (DefaultConstructorMarker) null);
            Activity activity = viewOnClickListenerC38981pjg.EZpvd;
            if (activity != null && (interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class)) != null) {
                InterfaceC43033rhe.StateListAnimator.gotoAllPriceRemindActivity$default(interfaceC43033rhe, activity, unifiedPriceRemind, null, 4, null);
            }
        }
        return Unit.INSTANCE;
    }
}
