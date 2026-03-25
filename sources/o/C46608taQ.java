package o;

import com.okinc.okmarket.home.NewCoinInfo;
import com.okinc.okmarket.home.data.po.BannerListItem;
import com.okinc.okmarket.home.data.po.BannerType;
import com.okinc.okmarket.home.data.po.NewCoinData;
import com.okinc.okmarket.home.data.po.OkpData;
import com.okinc.okmarket.home.domain.usecase.GetCountingBannerUseCase$onExecute$1;
import com.okinc.okmarket.home.ui.model.BannerClickType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.taQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46608taQ extends AbstractC49400uno<Unit, kotlin.Pair<? extends NewCoinInfo, ? extends java.util.List<? extends C46684tbn>>> {
    public final CoroutineDispatcher EZpvd;
    public final C46597taF KWHzl;

    /* JADX INFO: renamed from: o.taQ$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BannerType.values().length];
            try {
                iArr[BannerType.NEW_COIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BannerType.OKP_BANNER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C46608taQ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C46597taF c46597taF) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c46597taF, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = c46597taF;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super kotlin.Pair<NewCoinInfo, ? extends java.util.List<C46684tbn>>> continuation) throws java.lang.Throwable {
        GetCountingBannerUseCase$onExecute$1 getCountingBannerUseCase$onExecute$1;
        C46608taQ c46608taQ;
        if (continuation instanceof GetCountingBannerUseCase$onExecute$1) {
            getCountingBannerUseCase$onExecute$1 = (GetCountingBannerUseCase$onExecute$1) continuation;
            int i = getCountingBannerUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCountingBannerUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getCountingBannerUseCase$onExecute$1 = new GetCountingBannerUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getCountingBannerUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getCountingBannerUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C46597taF c46597taF = this.KWHzl;
            getCountingBannerUseCase$onExecute$1.L$0 = this;
            getCountingBannerUseCase$onExecute$1.label = 1;
            objEZpvd = c46597taF.EZpvd(getCountingBannerUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c46608taQ = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c46608taQ = (C46608taQ) getCountingBannerUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        NewCoinInfo newCoinInfo = (NewCoinInfo) objEZpvd;
        java.util.List<BannerListItem> bannerList = newCoinInfo != null ? newCoinInfo.getBannerList() : null;
        if (!C27563jxZ.OLrzqt.djBIcL()) {
            return new kotlin.Pair(newCoinInfo, yDY.AhwBna());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (bannerList != null) {
            java.util.Iterator<T> it = bannerList.iterator();
            while (it.hasNext()) {
                C46684tbn c46684tbnOLrzqt = c46608taQ.OLrzqt((BannerListItem) it.next());
                if (c46684tbnOLrzqt != null) {
                    arrayList.add(c46684tbnOLrzqt);
                }
            }
        }
        int i3 = 0;
        for (java.lang.Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            arrayList.set(i3, C46684tbn.copy$default((C46684tbn) obj, null, null, null, null, null, 0L, null, null, null, false, false, java.lang.String.valueOf(i4), null, null, null, null, 63487, null));
            i3 = i4;
        }
        return new kotlin.Pair(newCoinInfo, arrayList);
    }

    public final C46684tbn OLrzqt(BannerListItem bannerListItem) {
        C46684tbn c46684tbnKWHzl;
        int i = TaskDescription.EZpvd[bannerListItem.getType().ordinal()];
        if (i == 1) {
            NewCoinData newCoinData = bannerListItem.getNewCoinData();
            if (newCoinData == null || (c46684tbnKWHzl = KWHzl(newCoinData)) == null) {
                return null;
            }
            return C46684tbn.copy$default(c46684tbnKWHzl, null, null, null, null, null, 0L, null, null, null, false, false, null, null, null, null, null, 65535, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        OkpData okpData = bannerListItem.getOkpData();
        if (okpData == null) {
            return null;
        }
        return KWHzl(okpData);
    }

    public final C46684tbn KWHzl(NewCoinData newCoinData) {
        java.lang.String instType;
        java.lang.String instId = newCoinData.getInstId();
        if (instId == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) instId) || (instType = newCoinData.getInstType()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) instType)) {
            return null;
        }
        java.lang.String titleByIdAndType$default = C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, newCoinData.getInstId(), newCoinData.getInstType(), false, false, false, 12, null);
        java.util.List listEZpvd = Intrinsics.EZpvd((java.lang.Object) newCoinData.getInstType(), (java.lang.Object) "SWAP") ? C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ)) : null;
        java.lang.Boolean canTrade = newCoinData.getCanTrade();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.String strAYXKKw = Intrinsics.EZpvd(canTrade, bool) ? C33070mpX.AYXKKw(qZH.PendingIntent.dvImUD) : "";
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(qZH.PendingIntent.fLIjIY);
        java.lang.String icon = newCoinData.getIcon();
        java.lang.String str = icon == null ? "" : icon;
        long jValueOf = C33129mqd.valueOf(newCoinData.getOnlineTs());
        java.lang.String instId2 = newCoinData.getInstId();
        java.lang.String instType2 = newCoinData.getInstType();
        java.lang.Boolean canTrade2 = newCoinData.getCanTrade();
        return new C46684tbn(strAYXKKw, titleByIdAndType$default, listEZpvd, strAYXKKw2, str, jValueOf, newCoinData.getWaitOnlineTime(), instId2, instType2, canTrade2 != null ? canTrade2.booleanValue() : false, false, "", Intrinsics.EZpvd(newCoinData.getCanTrade(), bool) ? BannerClickType.TRADE : BannerClickType.KLINE, null, null, BannerType.NEW_COIN, 16384, null);
    }

    public final C46684tbn KWHzl(OkpData okpData) {
        java.lang.String title = okpData.getTitle();
        if (title == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) title)) {
            return null;
        }
        java.lang.String iconDark = C33492mxV.OLrzqt() ? okpData.getIconDark() : okpData.getIconLight();
        java.lang.String title2 = okpData.getTitle();
        java.lang.String subtitle = okpData.getSubtitle();
        return new C46684tbn("", title2, null, subtitle == null ? "" : subtitle, iconDark == null ? "" : iconDark, 0L, null, "", "", false, false, "", BannerClickType.DEEPLINK, okpData.getHref(), okpData.getOkpId(), BannerType.OKP_BANNER);
    }
}
