package com.okinc.business.market.market.fragment.watchlist;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$onUserActionEnd$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.List;
import java.util.Objects;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32866mlf;
import o.C33129mqd;
import o.C56391yDq;
import o.C56404yEc;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC55701xos;
import o.kIH;
import o.qTA;
import o.xTS;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListNewQuoteFragment$onUserActionEnd$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<?> $data;
    int label;
    final /* synthetic */ kIH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListNewQuoteFragment$onUserActionEnd$1(kIH kih, List<?> list, Continuation<? super WatchListNewQuoteFragment$onUserActionEnd$1> continuation) {
        super(2, continuation);
        this.this$0 = kih;
        this.$data = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchListNewQuoteFragment$onUserActionEnd$1(this.this$0, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchListNewQuoteFragment$onUserActionEnd$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        int iIntValue;
        xTS xtsKWHzl;
        List<WatchListData> listOLrzqt;
        xTS xtsKWHzl2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<?> list = this.$data;
            kIH kih = this.this$0;
            try {
                Result.Application application = Result.Companion;
                Unit unit = null;
                List<CoinQuote> listOLrzqt2 = list != null ? C56404yEc.OLrzqt((Iterable<?>) list, CoinQuote.class) : null;
                kih.getTAG();
                Objects.toString(listOLrzqt2 != null ? C56443yFo.AEQbTJ(listOLrzqt2.size()) : null);
                boolean zEZpvd = Intrinsics.EZpvd((Object) kih.fJNWhG, (Object) "ANY");
                CoinQuote coinQuoteAhwBna = kih.AhwBna();
                if (coinQuoteAhwBna == null) {
                    iIntValue = -1;
                    xtsKWHzl = kih.fARcdN.KWHzl();
                    if (xtsKWHzl != null && (listOLrzqt = xtsKWHzl.OLrzqt(listOLrzqt2, !zEZpvd)) != null && (xtsKWHzl2 = kih.fARcdN.KWHzl()) != null) {
                        xtsKWHzl2.AEQbTJ(listOLrzqt, (InterfaceC55701xos<Unit>) new StateListAnimator(kih, iIntValue), true);
                        unit = Unit.INSTANCE;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(unit);
                } else {
                    xTS xtsKWHzl3 = kih.fARcdN.KWHzl();
                    Integer numAEQbTJ = xtsKWHzl3 != null ? C56443yFo.AEQbTJ(xtsKWHzl3.AEQbTJ(coinQuoteAhwBna)) : null;
                    if (numAEQbTJ != null) {
                        iIntValue = numAEQbTJ.intValue();
                    }
                    xtsKWHzl = kih.fARcdN.KWHzl();
                    if (xtsKWHzl != null) {
                        xtsKWHzl2.AEQbTJ(listOLrzqt, (InterfaceC55701xos<Unit>) new StateListAnimator(kih, iIntValue), true);
                        unit = Unit.INSTANCE;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(unit);
                }
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            this.this$0.KWHzl(false);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final class StateListAnimator implements InterfaceC55701xos<Unit> {
        public final /* synthetic */ kIH AEQbTJ;
        public final /* synthetic */ int copydefault;

        public StateListAnimator(kIH kih, int i) {
            this.AEQbTJ = kih;
            this.copydefault = i;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void EZpvd(boolean z, Unit unit, Exception exc) {
            final int iIntValue;
            int i;
            CoinQuote coinQuoteAhwBna = this.AEQbTJ.AhwBna();
            if (coinQuoteAhwBna == null) {
                iIntValue = -1;
            } else {
                xTS xtsKWHzl = this.AEQbTJ.fARcdN.KWHzl();
                Integer numValueOf = xtsKWHzl != null ? Integer.valueOf(xtsKWHzl.AEQbTJ(coinQuoteAhwBna)) : null;
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                }
            }
            if (iIntValue <= -1 || (i = this.copydefault) <= -1 || i == iIntValue || this.AEQbTJ.AhwBna() == null) {
                return;
            }
            final kIH kih = this.AEQbTJ;
            final int i2 = this.copydefault;
            C32866mlf.onEvent$default("DiscoverPage_Favorites_Token_Drag", (TrackChannel[]) null, new Function1() { // from class: o.kIQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WatchListNewQuoteFragment$onUserActionEnd$1.StateListAnimator.EZpvd(kih, i2, iIntValue, (EventParamsList) obj);
                }
            }, 1, (Object) null);
        }

        public static final Unit EZpvd(kIH kih, int i, int i2, EventParamsList eventParamsList) {
            String instId;
            String instType;
            String strAEQbTJ;
            String str = "";
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            CoinQuote coinQuoteAhwBna = kih.AhwBna();
            if (coinQuoteAhwBna == null || (instId = coinQuoteAhwBna.getInstId()) == null) {
                instId = "";
            }
            eventParamsList.put("token_pair", instId, false);
            CoinQuote coinQuoteAhwBna2 = kih.AhwBna();
            if (coinQuoteAhwBna2 != null && (instType = coinQuoteAhwBna2.getInstType()) != null && (strAEQbTJ = qTA.AEQbTJ(instType)) != null) {
                str = strAEQbTJ;
            }
            eventParamsList.put("biz_type", str, true);
            eventParamsList.put("from_position", C33129mqd.gEmmrt(Integer.valueOf(i)), false);
            eventParamsList.put("to_position", C33129mqd.gEmmrt(Integer.valueOf(i2)), true);
            return Unit.INSTANCE;
        }
    }
}
