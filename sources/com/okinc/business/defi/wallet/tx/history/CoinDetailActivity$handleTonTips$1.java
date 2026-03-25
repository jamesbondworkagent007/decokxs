package com.okinc.business.defi.wallet.tx.history;

import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.biz.net.bean.OfflineAssetDetailResp;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.uilab.banner.OKAlertBanner;
import java.util.Date;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC16250egQ;
import o.AbstractC43419rot;
import o.ActivityC21325gxd;
import o.C10854bwM;
import o.C13754dXa;
import o.C13934dbu;
import o.C33069mpW;
import o.C33129mqd;
import o.C55296xhK;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.pTA;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class CoinDetailActivity$handleTonTips$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C10854bwM $coinMeta;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ ActivityC21325gxd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailActivity$handleTonTips$1(C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV, ActivityC21325gxd activityC21325gxd, Continuation<? super CoinDetailActivity$handleTonTips$1> continuation) {
        super(2, continuation);
        this.$coinMeta = c10854bwM;
        this.$wallet = abstractC12782ctV;
        this.this$0 = activityC21325gxd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinDetailActivity$handleTonTips$1(this.$coinMeta, this.$wallet, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinDetailActivity$handleTonTips$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ OKAlertBanner AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, OKAlertBanner oKAlertBanner) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = oKAlertBanner;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Intrinsics.copydefault(this.AEQbTJ);
                this.AEQbTJ.setVisibility(8);
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbu = new C13934dbu();
            long jAhwBna = this.$coinMeta.AhwBna();
            String strEZpvd = this.$wallet.EZpvd(this.$coinMeta.fetchVPNInfo());
            this.label = 1;
            obj = c13934dbu.OLrzqt(jAhwBna, strEZpvd, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        ActivityC21325gxd activityC21325gxd = this.this$0;
        AbstractC12782ctV abstractC12782ctV = this.$wallet;
        C10854bwM c10854bwM = this.$coinMeta;
        AbstractC16250egQ abstractC16250egQ = null;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            OfflineAssetDetailResp offlineAssetDetailResp = (OfflineAssetDetailResp) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            Integer status = offlineAssetDetailResp.getStatus();
            if (status != null && status.intValue() == 1) {
                AbstractC16250egQ abstractC16250egQ2 = activityC21325gxd.fetchVPNInfo;
                if (abstractC16250egQ2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ2 = null;
                }
                OKAlertBanner oKAlertBanner = abstractC16250egQ2.copydefault;
                Intrinsics.copydefault(oKAlertBanner);
                oKAlertBanner.setVisibility(0);
                int i2 = C13754dXa.FragmentManager.iSpHlg;
                Pair[] pairArr = new Pair[3];
                String offlineAmount = offlineAssetDetailResp.getOfflineAmount();
                if (offlineAmount == null) {
                    offlineAmount = "";
                }
                pairArr[0] = C56390yDp.OLrzqt("num", offlineAmount);
                pairArr[1] = C56390yDp.OLrzqt("token", c10854bwM.fJNWhG());
                pairArr[2] = C56390yDp.OLrzqt(CrashHianalyticsData.TIME, pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(offlineAssetDetailResp.getExpiredAt())), null, 1, null));
                oKAlertBanner.setMessage(C33069mpW.KWHzl(activityC21325gxd, i2, (Map<String, ? extends Object>) C56424yEw.gEmmrt(pairArr)));
                ImageView imageViewOLrzqt = oKAlertBanner.OLrzqt();
                imageViewOLrzqt.setOnClickListener(new ActionBar(imageViewOLrzqt, 1000L, oKAlertBanner));
            } else {
                pUU.copydefault("TonOfflineInfo", "status is " + offlineAssetDetailResp.getStatus());
                AbstractC16250egQ abstractC16250egQ3 = activityC21325gxd.fetchVPNInfo;
                if (abstractC16250egQ3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ3 = null;
                }
                OKAlertBanner oKAlertBanner2 = abstractC16250egQ3.copydefault;
                Intrinsics.checkNotNullExpressionValue(oKAlertBanner2, "");
                oKAlertBanner2.setVisibility(8);
                activityC21325gxd.KWHzl(abstractC12782ctV, c10854bwM);
            }
        }
        ActivityC21325gxd activityC21325gxd2 = this.this$0;
        AbstractC12782ctV abstractC12782ctV2 = this.$wallet;
        C10854bwM c10854bwM2 = this.$coinMeta;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            pUU.copydefault("TonOfflineInfo", "get offline asset error: " + ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage());
            AbstractC16250egQ abstractC16250egQ4 = activityC21325gxd2.fetchVPNInfo;
            if (abstractC16250egQ4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ4;
            }
            OKAlertBanner oKAlertBanner3 = abstractC16250egQ.copydefault;
            Intrinsics.checkNotNullExpressionValue(oKAlertBanner3, "");
            oKAlertBanner3.setVisibility(8);
            activityC21325gxd2.KWHzl(abstractC12782ctV2, c10854bwM2);
        }
        return Unit.INSTANCE;
    }
}
