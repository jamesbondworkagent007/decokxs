package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BizResp;
import com.okinc.unify_trade.biz.CoinWatchInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xQb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC54646xQb implements InterfaceC54647xQc {
    public static final Activity Companion = new Activity(null);
    public static final int ejfBZ = 8;
    public static final java.lang.String uzCIH = xPX.AEQbTJ.KWHzl();
    public final ConcurrentHashMap<java.lang.String, WatchListData> AuCTelauCTel;
    public Function1<? super java.util.ArrayList<MarketDataSource>, Unit> AubY;
    public Function1<? super java.lang.Integer, Unit> getFieldNames;
    public final C58216yxB getNewProxyInstance;
    public Function1<? super java.lang.String, Unit> hDKMBd;
    public final InterfaceC54647xQc iwGUEr;
    public final InterfaceC56387yDm zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC54646xQb() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public java.util.ArrayList<WatchListData> AEQbTJ(@NotNull java.util.List<WatchListData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return this.iwGUEr.AEQbTJ(list);
    }

    public void AEQbTJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public void AEQbTJ(@NotNull BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        this.iwGUEr.AEQbTJ(bizInstrument, mutableLiveData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public void AEQbTJ(@NotNull BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData, boolean z) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        this.iwGUEr.AEQbTJ(bizInstrument, mutableLiveData, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public void AEQbTJ(@NotNull WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        this.iwGUEr.AEQbTJ(watchListData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public void AEQbTJ(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.iwGUEr.AEQbTJ(function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<java.lang.String, WatchListData> AuCTel() {
        return this.AuCTelauCTel;
    }

    public void EZpvd(int i, int i2) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public boolean EZpvd(@NotNull WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        return this.iwGUEr.EZpvd(watchListData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.getFieldNames = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public void OLrzqt(@NotNull WatchListData watchListData, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        this.iwGUEr.OLrzqt(watchListData, mutableLiveData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public void OLrzqt(@NotNull WatchListData watchListData, MutableLiveData<BizResp> mutableLiveData, boolean z) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        this.iwGUEr.OLrzqt(watchListData, mutableLiveData, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public void OLrzqt(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.iwGUEr.OLrzqt(function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public void OLrzqt(boolean z) {
        this.iwGUEr.OLrzqt(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public boolean OLrzqt(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        return this.iwGUEr.OLrzqt(bizInstrument);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public boolean OLrzqt(@NotNull java.lang.String str, @NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        return this.iwGUEr.OLrzqt(str, bizInstrument);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public void bH_() {
        this.iwGUEr.bH_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public boolean bI_() {
        return this.iwGUEr.bI_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public void copydefault(@NotNull BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        this.iwGUEr.copydefault(bizInstrument, mutableLiveData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull Function1<? super java.util.ArrayList<MarketDataSource>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AubY = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fARcdN() {
        this.AubY = null;
        this.hDKMBd = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<java.lang.String, Unit> fIwbmz() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.okinc.tradeapi.bean.MarketDataSource>, kotlin.Unit>, kotlin.jvm.functions.Function1<java.util.ArrayList<com.okinc.tradeapi.bean.MarketDataSource>, kotlin.Unit> */
    public final Function1<java.util.ArrayList<MarketDataSource>, Unit> fJNWhG() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void gEmmrt(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.hDKMBd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC54647xQc values() {
        return this.iwGUEr;
    }

    public AbstractC54646xQb(@NotNull InterfaceC54647xQc interfaceC54647xQc) {
        Intrinsics.checkNotNullParameter(interfaceC54647xQc, "");
        this.iwGUEr = interfaceC54647xQc;
        this.getNewProxyInstance = new C58216yxB();
        this.AuCTelauCTel = new ConcurrentHashMap<>();
        this.zsXlph = C56392yDr.copydefault(new Function0() { // from class: o.xQa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC54646xQb.KWHzl();
            }
        });
        interfaceC54647xQc.OLrzqt(new Function0() { // from class: o.xPZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC54646xQb.OLrzqt(this.AEQbTJ);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.xQc:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.xQc:0x0006: INVOKE (wrap:o.qVD:0x0004: SGET  A[WRAPPED] (LINE:19) o.qVD.AEQbTJ o.qVD) VIRTUAL call: o.qVD.OLrzqt():o.xQc A[MD:():o.xQc (m), WRAPPED] (LINE:19)) : (r1v0 o.xQc))
 A[MD:(o.xQc):void (m)] (LINE:19) call: o.xQb.<init>(o.xQc):void type: THIS */
    public /* synthetic */ AbstractC54646xQb(InterfaceC54647xQc interfaceC54647xQc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? qVD.AEQbTJ.OLrzqt() : interfaceC54647xQc);
    }

    /* JADX INFO: renamed from: o.xQb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xQb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.String EZpvd() {
            return AbstractC54646xQb.uzCIH;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C56131xwy KWHzl() {
        return new C56131xwy();
    }

    public static final Unit OLrzqt(AbstractC54646xQb abstractC54646xQb) {
        Function1<? super java.lang.Integer, Unit> function1 = abstractC54646xQb.getFieldNames;
        if (function1 != null) {
            function1.invoke(-1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.xQb$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketDataSource) t).getSortTurnover(), ((MarketDataSource) t2).getSortTurnover());
        }
    }

    /* JADX INFO: renamed from: o.xQb$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            kotlin.Pair<java.lang.Double, java.lang.String> priceLimit = ((MarketDataSource) t).getPriceLimit();
            java.lang.Double first = priceLimit != null ? priceLimit.getFirst() : null;
            kotlin.Pair<java.lang.Double, java.lang.String> priceLimit2 = ((MarketDataSource) t2).getPriceLimit();
            return yET.KWHzl(first, priceLimit2 != null ? priceLimit2.getFirst() : null);
        }
    }

    /* JADX INFO: renamed from: o.xQb$Dialog */
    public static final class Dialog<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketDataSource) t).getSortCcyVolume(), ((MarketDataSource) t2).getSortCcyVolume());
        }
    }

    /* JADX INFO: renamed from: o.xQb$Fragment */
    public static final class Fragment<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketDataSource) t).getSortVolume(), ((MarketDataSource) t2).getSortVolume());
        }
    }

    /* JADX INFO: renamed from: o.xQb$SharedElementCallback */
    public static final class SharedElementCallback<T> implements java.util.Comparator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            long jValueOf;
            MarketDataSource marketDataSource = (MarketDataSource) t;
            AbstractC54646xQb abstractC54646xQb = AbstractC54646xQb.this;
            java.lang.String instId = marketDataSource.getInstId();
            if (instId == null) {
                instId = "";
            }
            CountDownInfo countDownInfoKWHzl = abstractC54646xQb.KWHzl(instId, marketDataSource.getInstType());
            CountDownType showType = countDownInfoKWHzl != null ? countDownInfoKWHzl.getShowType() : null;
            CountDownType countDownType = CountDownType.SHOW_EXPECT;
            long jValueOf2 = Long.MAX_VALUE;
            if (showType == countDownType) {
                jValueOf = Long.MAX_VALUE;
            } else {
                jValueOf = C33129mqd.valueOf(countDownInfoKWHzl != null ? countDownInfoKWHzl.getWaitOnlineTime() : null);
            }
            MarketDataSource marketDataSource2 = (MarketDataSource) t2;
            AbstractC54646xQb abstractC54646xQb2 = AbstractC54646xQb.this;
            java.lang.String instId2 = marketDataSource2.getInstId();
            CountDownInfo countDownInfoKWHzl2 = abstractC54646xQb2.KWHzl(instId2 != null ? instId2 : "", marketDataSource2.getInstType());
            if ((countDownInfoKWHzl2 != null ? countDownInfoKWHzl2.getShowType() : null) != countDownType) {
                jValueOf2 = C33129mqd.valueOf(countDownInfoKWHzl2 != null ? countDownInfoKWHzl2.getWaitOnlineTime() : null);
            }
            return yET.KWHzl(java.lang.Long.valueOf(jValueOf), java.lang.Long.valueOf(jValueOf2));
        }
    }

    /* JADX INFO: renamed from: o.xQb$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketDataSource) t).getBaseSymbol(), ((MarketDataSource) t2).getBaseSymbol());
        }
    }

    /* JADX INFO: renamed from: o.xQb$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((MarketDataSource) t).getTickerPrice())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((MarketDataSource) t2).getTickerPrice())));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [118=13] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.util.ArrayList<MarketDataSource> EZpvd(@NotNull java.util.ArrayList<MarketDataSource> arrayList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (str != null) {
            switch (str.hashCode()) {
                case -1858767985:
                    if (str.equals("price_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new LoaderManager());
                    }
                    break;
                case -1723673392:
                    if (str.equals("volume_ccy_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new Dialog());
                    }
                    break;
                case -1339918127:
                    if (str.equals("name_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new FragmentManager());
                    }
                    break;
                case -713692905:
                    if (str.equals("turnover_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new PictureInPictureParams());
                    }
                    break;
                case -417290646:
                    if (str.equals("volume_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new Fragment());
                    }
                    break;
                case -379411751:
                    if (str.equals("name_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new StateListAnimator());
                    }
                    break;
                case -97421190:
                    if (str.equals("coins_new_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new TaskStackBuilder());
                    }
                    break;
                case -62356038:
                    if (str.equals("volume_ccy_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new VoiceInteractor());
                    }
                    break;
                case 56431059:
                    if (str.equals("turnover_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new ActionBar());
                    }
                    break;
                case 220531922:
                    if (str.equals("applies_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new PendingIntent());
                    }
                    break;
                case 363662008:
                    if (str.equals("applies_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new Application());
                    }
                    break;
                case 1780803424:
                    if (str.equals("volume_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new AssistContent());
                    }
                    break;
                case 1959155803:
                    if (str.equals("price_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new TaskDescription());
                    }
                    break;
            }
        }
        return OLrzqt(arrayList);
    }

    /* JADX INFO: renamed from: o.xQb$AssistContent */
    public static final class AssistContent<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketDataSource) t2).getSortVolume(), ((MarketDataSource) t).getSortVolume());
        }
    }

    /* JADX INFO: renamed from: o.xQb$FragmentManager */
    public static final class FragmentManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketDataSource) t2).getBaseSymbol(), ((MarketDataSource) t).getBaseSymbol());
        }
    }

    /* JADX INFO: renamed from: o.xQb$LoaderManager */
    public static final class LoaderManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((MarketDataSource) t2).getTickerPrice())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((MarketDataSource) t).getTickerPrice())));
        }
    }

    /* JADX INFO: renamed from: o.xQb$PendingIntent */
    public static final class PendingIntent<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            kotlin.Pair<java.lang.Double, java.lang.String> priceLimit = ((MarketDataSource) t2).getPriceLimit();
            java.lang.Double first = priceLimit != null ? priceLimit.getFirst() : null;
            kotlin.Pair<java.lang.Double, java.lang.String> priceLimit2 = ((MarketDataSource) t).getPriceLimit();
            return yET.KWHzl(first, priceLimit2 != null ? priceLimit2.getFirst() : null);
        }
    }

    /* JADX INFO: renamed from: o.xQb$PictureInPictureParams */
    public static final class PictureInPictureParams<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketDataSource) t2).getSortTurnover(), ((MarketDataSource) t).getSortTurnover());
        }
    }

    /* JADX INFO: renamed from: o.xQb$TaskStackBuilder */
    public static final class TaskStackBuilder<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.String listTime = ((MarketDataSource) t2).getListTime();
            java.lang.Long lValueOf = listTime != null ? java.lang.Long.valueOf(C33129mqd.valueOf(listTime)) : null;
            java.lang.String listTime2 = ((MarketDataSource) t).getListTime();
            return yET.KWHzl(lValueOf, listTime2 != null ? java.lang.Long.valueOf(C33129mqd.valueOf(listTime2)) : null);
        }
    }

    /* JADX INFO: renamed from: o.xQb$VoiceInteractor */
    public static final class VoiceInteractor<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketDataSource) t2).getSortCcyVolume(), ((MarketDataSource) t).getSortCcyVolume());
        }
    }

    public final CountDownInfo KWHzl(java.lang.String str, java.lang.String str2) {
        BizInstrument bizInstrumentAEQbTJ;
        CountDownInfo countDownInfo;
        if ((!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SPOT") && !Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP")) || (bizInstrumentAEQbTJ = AEQbTJ(str, str2, false)) == null || (countDownInfo = bizInstrumentAEQbTJ.getCountDownInfo()) == null) {
            return null;
        }
        if (!countDownInfo.countDownTimeExpire() || countDownInfo.getShowType() == CountDownType.SHOW_EXPECT) {
            return countDownInfo;
        }
        return null;
    }

    public void valueOf() {
        this.AubY = null;
        this.getNewProxyInstance.dispose();
        this.iwGUEr.bH_();
        bH_();
    }

    public final BizInstrument KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CoinWatchInstrument(str, "COIN");
    }

    public final BizInstrument AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "COIN") ? new CoinWatchInstrument(str, str2) : xUD.getWatchMarketInstrument$default(str2, str, null, null, false, 28, null);
    }

    public final java.util.ArrayList<MarketDataSource> OLrzqt(@NotNull java.util.ArrayList<MarketDataSource> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            MarketDataSource marketDataSource = (MarketDataSource) obj;
            java.lang.String instId = marketDataSource.getInstId();
            if (instId == null) {
                instId = "";
            }
            if (KWHzl(instId, marketDataSource.getInstType()) != null) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        kotlin.Pair pair = new kotlin.Pair(arrayList2, arrayList3);
        java.util.List list = (java.util.List) pair.component1();
        return new java.util.ArrayList<>(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.EZpvd(list, new SharedElementCallback()), (java.lang.Iterable) pair.component2()));
    }
}
