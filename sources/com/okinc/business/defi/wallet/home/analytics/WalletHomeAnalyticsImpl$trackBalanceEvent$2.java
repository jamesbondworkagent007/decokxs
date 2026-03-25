package com.okinc.business.defi.wallet.home.analytics;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.okinc.business.defi.biz.database.extra.bean.ReferralInfoBean;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.common.track.AnalyticsEvent;
import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.business.defi.wallet.home.analytics.WalletHomeAnalyticsImpl$trackBalanceEvent$2;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C10594brR;
import o.C14557dnh;
import o.C14564dno;
import o.C14669dpn;
import o.C32935mmv;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.dTU;
import o.eZY;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletHomeAnalyticsImpl$trackBalanceEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ eZY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletHomeAnalyticsImpl$trackBalanceEvent$2(eZY ezy, AbstractC12782ctV abstractC12782ctV, Continuation<? super WalletHomeAnalyticsImpl$trackBalanceEvent$2> continuation) {
        super(2, continuation);
        this.this$0 = ezy;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletHomeAnalyticsImpl$trackBalanceEvent$2(this.this$0, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletHomeAnalyticsImpl$trackBalanceEvent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        eZY ezy;
        AbstractC12782ctV abstractC12782ctV;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC12782ctV = (AbstractC12782ctV) this.L$1;
                ezy = (eZY) this.L$0;
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                ezy = this.this$0;
                AbstractC12782ctV abstractC12782ctV2 = this.$wallet;
                Result.Application application = Result.Companion;
                ReferralManager referralManager = ezy.OLrzqt;
                this.L$0 = ezy;
                this.L$1 = abstractC12782ctV2;
                this.label = 1;
                if (referralManager.valueOf(this) == objCopydefault) {
                    return objCopydefault;
                }
                abstractC12782ctV = abstractC12782ctV2;
            }
            ReferralInfoBean referralInfoBeanGEmmrt = ezy.OLrzqt.gEmmrt(abstractC12782ctV.DbNXlk());
            JsonArray jsonArray = new JsonArray();
            for (C10594brR c10594brR : abstractC12782ctV.OxVOHk()) {
                if (C33129mqd.AEQbTJ(c10594brR.values(), C56443yFo.AEQbTJ(0))) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("chain_id", String.valueOf(c10594brR.fetchVPNInfo().DbNXlk()));
                    jsonObject.addProperty("main_token_symbol", c10594brR.fetchVPNInfo().ejfBZ());
                    jsonObject.addProperty("main_token_amount", c10594brR.AYXKKw());
                    jsonArray.add(jsonObject);
                }
            }
            String strAEQbTJ = abstractC12782ctV.AEQbTJ("all", false);
            String strDCJXGO = abstractC12782ctV.DCJXGO();
            String strKWHzl = abstractC12782ctV.KWHzl(true, false);
            C14557dnh.StateListAnimator stateListAnimator = C14557dnh.StateListAnimator.copydefault;
            String strDbNXlk = abstractC12782ctV.DbNXlk();
            String strCopydefault = C14669dpn.OLrzqt.copydefault(abstractC12782ctV);
            String str = abstractC12782ctV.getFieldNames() ? "aa" : TxToastCheckRes.EOA_ADDRESS_TYPE;
            String strAEQbTJ2 = abstractC12782ctV.AEQbTJ("all", true);
            String str2 = (String) C32935mmv.KWHzl.get("channel_id");
            String str3 = str2 == null ? "" : str2;
            String string = jsonArray.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            final AnalyticsEvent analyticsEventCopydefault = C14564dno.copydefault(stateListAnimator, strDbNXlk, strAEQbTJ, strDCJXGO, strKWHzl, strCopydefault, str, strAEQbTJ2, str3, string, referralInfoBeanGEmmrt != null ? referralInfoBeanGEmmrt.getReferralCode() : null);
            String name = analyticsEventCopydefault.getName();
            TrackChannel[] trackChannel = analyticsEventCopydefault.getTrackChannel();
            dTU.OLrzqt(name, (TrackChannel[]) Arrays.copyOf(trackChannel, trackChannel.length), new Function1() { // from class: o.eZW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return WalletHomeAnalyticsImpl$trackBalanceEvent$2.invokeSuspend$lambda$4$lambda$3$lambda$2(analyticsEventCopydefault, (EventParamsList) obj2);
                }
            });
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("wallet trackBalanceEvent error: " + thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4$lambda$3$lambda$2(AnalyticsEvent analyticsEvent, EventParamsList eventParamsList) {
        analyticsEvent.getParams();
        return Unit.INSTANCE;
    }
}
