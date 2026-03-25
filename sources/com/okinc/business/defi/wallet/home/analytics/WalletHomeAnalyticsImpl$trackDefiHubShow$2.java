package com.okinc.business.defi.wallet.home.analytics;

import com.okinc.business.defi.biz.database.extra.bean.ReferralInfoBean;
import com.okinc.business.defi.common.track.AnalyticsEvent;
import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.business.defi.wallet.home.analytics.WalletHomeAnalyticsImpl$trackDefiHubShow$2;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C14557dnh;
import o.C14564dno;
import o.C17922fXg;
import o.C32935mmv;
import o.C56391yDq;
import o.C56442yFn;
import o.dTH;
import o.dTU;
import o.eZY;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletHomeAnalyticsImpl$trackDefiHubShow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AbstractC12782ctV> $walletList;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ eZY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.ctV> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletHomeAnalyticsImpl$trackDefiHubShow$2(eZY ezy, List<? extends AbstractC12782ctV> list, Continuation<? super WalletHomeAnalyticsImpl$trackDefiHubShow$2> continuation) {
        super(2, continuation);
        this.this$0 = ezy;
        this.$walletList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletHomeAnalyticsImpl$trackDefiHubShow$2(this.this$0, this.$walletList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletHomeAnalyticsImpl$trackDefiHubShow$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        eZY ezy;
        List<AbstractC12782ctV> list;
        String str;
        String strDbNXlk;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$1;
                ezy = (eZY) this.L$0;
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                ezy = this.this$0;
                List<AbstractC12782ctV> list2 = this.$walletList;
                Result.Application application = Result.Companion;
                ReferralManager referralManager = ezy.OLrzqt;
                this.L$0 = ezy;
                this.L$1 = list2;
                this.label = 1;
                if (referralManager.valueOf(this) == objCopydefault) {
                    return objCopydefault;
                }
                list = list2;
            }
            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: o.fab
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ((AbstractC12782ctV) obj2).DbNXlk();
                }
            }, 30, null);
            AbstractC12782ctV abstractC12782ctV = null;
            for (AbstractC12782ctV abstractC12782ctV2 : list) {
                if (abstractC12782ctV2.zuWLRA()) {
                    abstractC12782ctV = abstractC12782ctV2;
                }
            }
            ReferralInfoBean referralInfoBeanGEmmrt = (abstractC12782ctV == null || (strDbNXlk = abstractC12782ctV.DbNXlk()) == null) ? null : ezy.OLrzqt.gEmmrt(strDbNXlk);
            C14557dnh.StateListAnimator stateListAnimator = C14557dnh.StateListAnimator.copydefault;
            int size = list.size();
            String str2 = (String) C32935mmv.KWHzl.get("channel_id");
            String strDbNXlk2 = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
            dTH dthOLrzqt = abstractC12782ctV != null ? C17922fXg.OLrzqt(abstractC12782ctV) : null;
            if (dthOLrzqt instanceof dTH.FragmentManager) {
                str = "not_sa";
            } else if (dthOLrzqt instanceof dTH.Application) {
                str = "disable";
            } else {
                str = dthOLrzqt instanceof dTH.Activity ? "active" : "";
            }
            final AnalyticsEvent analyticsEventEZpvd = C14564dno.EZpvd(stateListAnimator, size, strJoinToString$default, str2, strDbNXlk2, str, referralInfoBeanGEmmrt != null ? referralInfoBeanGEmmrt.getReferralCode() : null);
            String name = analyticsEventEZpvd.getName();
            TrackChannel[] trackChannel = analyticsEventEZpvd.getTrackChannel();
            dTU.OLrzqt(name, (TrackChannel[]) Arrays.copyOf(trackChannel, trackChannel.length), new Function1() { // from class: o.fac
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return WalletHomeAnalyticsImpl$trackDefiHubShow$2.invokeSuspend$lambda$4$lambda$3$lambda$2(analyticsEventEZpvd, (EventParamsList) obj2);
                }
            });
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4$lambda$3$lambda$2(AnalyticsEvent analyticsEvent, EventParamsList eventParamsList) {
        analyticsEvent.getParams();
        return Unit.INSTANCE;
    }
}
