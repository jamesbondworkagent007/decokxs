package o;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.core.widget.SortTextView;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.unify_trade.biz.CountDownInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kKq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27985kKq {
    public static final C27985kKq OLrzqt = new C27985kKq();

    private C27985kKq() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [26=11] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.util.ArrayList<kotlin.Pair<CoinQuote, MarketDataSource>> EZpvd(java.lang.String str, @NotNull java.util.ArrayList<kotlin.Pair<CoinQuote, MarketDataSource>> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (str != null) {
            switch (str.hashCode()) {
                case -1858767985:
                    if (str.equals("price_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new ComponentCallbacks2());
                    }
                    break;
                case -1339918127:
                    if (str.equals("name_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new ComponentCallbacks());
                    }
                    break;
                case -713692905:
                    if (str.equals("turnover_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new ClipData());
                    }
                    break;
                case -417290646:
                    if (str.equals("volume_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new ComponentName());
                    }
                    break;
                case -379411751:
                    if (str.equals("name_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new AssistContent());
                    }
                    break;
                case -97421190:
                    if (str.equals("coins_new_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new ContextWrapper());
                    }
                    break;
                case 56431059:
                    if (str.equals("turnover_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new PictureInPictureParams());
                    }
                    break;
                case 220531922:
                    if (str.equals("applies_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new BroadcastReceiver());
                    }
                    break;
                case 363662008:
                    if (str.equals("applies_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new VoiceInteractor());
                    }
                    break;
                case 1780803424:
                    if (str.equals("volume_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new Context());
                    }
                    break;
                case 1959155803:
                    if (str.equals("price_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new TaskStackBuilder());
                    }
                    break;
            }
        }
        return (!C33129mqd.OLrzqt((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "name_descending_sort") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "name_ascending_sort")) ? new java.util.ArrayList<>(arrayList) : new java.util.ArrayList<>((java.util.List) new C41577qtT().copydefault(C56390yDp.OLrzqt(arrayList, new Function1() { // from class: o.kKw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27985kKq.OLrzqt((kotlin.Pair) obj);
            }
        })));
    }

    public static final CountDownInfo OLrzqt(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String instId = ((MarketDataSource) pair.getSecond()).getInstId();
        if (instId != null) {
            return xUD.AEQbTJ(instId, ((MarketDataSource) pair.getSecond()).getInstType());
        }
        return null;
    }

    /* JADX INFO: renamed from: o.kKq$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((CoinQuote) t).getPriceNumber()), java.lang.Double.valueOf(((CoinQuote) t2).getPriceNumber()));
        }
    }

    /* JADX INFO: renamed from: o.kKq$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((CoinQuote) t).getBaseCurrency(), ((CoinQuote) t2).getBaseCurrency());
        }
    }

    /* JADX INFO: renamed from: o.kKq$AssistContent */
    public static final class AssistContent<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketDataSource) ((kotlin.Pair) t).getSecond()).getBaseSymbol(), ((MarketDataSource) ((kotlin.Pair) t2).getSecond()).getBaseSymbol());
        }
    }

    /* JADX INFO: renamed from: o.kKq$ComponentName */
    public static final class ComponentName<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketDataSource) ((kotlin.Pair) t).getSecond()).getSortVolume(), ((MarketDataSource) ((kotlin.Pair) t2).getSecond()).getSortVolume());
        }
    }

    /* JADX INFO: renamed from: o.kKq$ContentResolver */
    public static final class ContentResolver<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((qWH) t).AEQbTJ(), ((qWH) t2).AEQbTJ());
        }
    }

    /* JADX INFO: renamed from: o.kKq$Dialog */
    public static final class Dialog<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((CoinQuote) t).getVolumeNumber()), java.lang.Double.valueOf(((CoinQuote) t2).getVolumeNumber()));
        }
    }

    /* JADX INFO: renamed from: o.kKq$DialogInterface */
    public static final class DialogInterface<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((qWH) t).OLrzqt(), ((qWH) t2).OLrzqt());
        }
    }

    /* JADX INFO: renamed from: o.kKq$Intent */
    public static final class Intent<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((qWH) t).AYXKKw(), ((qWH) t2).AYXKKw());
        }
    }

    /* JADX INFO: renamed from: o.kKq$PictureInPictureParams */
    public static final class PictureInPictureParams<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketDataSource) ((kotlin.Pair) t).getSecond()).getSortTurnover(), ((MarketDataSource) ((kotlin.Pair) t2).getSecond()).getSortTurnover());
        }
    }

    /* JADX INFO: renamed from: o.kKq$ServiceConnection */
    public static final class ServiceConnection<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((qWH) t).fetchVPNInfo(), ((qWH) t2).fetchVPNInfo());
        }
    }

    /* JADX INFO: renamed from: o.kKq$SharedPreferences */
    public static final class SharedPreferences<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((qWH) t).fetchVPNInfo(), ((qWH) t2).fetchVPNInfo());
        }
    }

    /* JADX INFO: renamed from: o.kKq$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((CoinQuote) t).getTurnoverNumber()), java.lang.Double.valueOf(((CoinQuote) t2).getTurnoverNumber()));
        }
    }

    /* JADX INFO: renamed from: o.kKq$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((CoinQuote) t).getChangePercent()), java.lang.Double.valueOf(((CoinQuote) t2).getChangePercent()));
        }
    }

    /* JADX INFO: renamed from: o.kKq$TaskStackBuilder */
    public static final class TaskStackBuilder<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((MarketDataSource) ((kotlin.Pair) t).getSecond()).getTickerPrice())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((MarketDataSource) ((kotlin.Pair) t2).getSecond()).getTickerPrice())));
        }
    }

    /* JADX INFO: renamed from: o.kKq$VoiceInteractor */
    public static final class VoiceInteractor<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            kotlin.Pair<java.lang.Double, java.lang.String> priceLimit = ((MarketDataSource) ((kotlin.Pair) t).getSecond()).getPriceLimit();
            java.lang.Double first = priceLimit != null ? priceLimit.getFirst() : null;
            kotlin.Pair<java.lang.Double, java.lang.String> priceLimit2 = ((MarketDataSource) ((kotlin.Pair) t2).getSecond()).getPriceLimit();
            return yET.KWHzl(first, priceLimit2 != null ? priceLimit2.getFirst() : null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [113=10] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.util.ArrayList<CoinQuote> OLrzqt(java.lang.String str, @NotNull java.util.ArrayList<CoinQuote> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (str != null) {
            switch (str.hashCode()) {
                case -1858767985:
                    if (str.equals("price_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new LoaderManager());
                    }
                    break;
                case -1339918127:
                    if (str.equals("name_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new FragmentManager());
                    }
                    break;
                case -713692905:
                    if (str.equals("turnover_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new PendingIntent());
                    }
                    break;
                case -417290646:
                    if (str.equals("volume_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new Dialog());
                    }
                    break;
                case -379411751:
                    if (str.equals("name_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new Application());
                    }
                    break;
                case 56431059:
                    if (str.equals("turnover_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new StateListAnimator());
                    }
                    break;
                case 220531922:
                    if (str.equals("applies_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new Fragment());
                    }
                    break;
                case 363662008:
                    if (str.equals("applies_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new TaskDescription());
                    }
                    break;
                case 1780803424:
                    if (str.equals("volume_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new SharedElementCallback());
                    }
                    break;
                case 1959155803:
                    if (str.equals("price_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new Activity());
                    }
                    break;
            }
        }
        return (!C33129mqd.OLrzqt((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "name_descending_sort") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "name_ascending_sort")) ? new java.util.ArrayList<>(arrayList) : new java.util.ArrayList<>((java.util.List) new C41577qtT().copydefault(C56390yDp.OLrzqt(arrayList, new Function1() { // from class: o.kKs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27985kKq.KWHzl((CoinQuote) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: o.kKq$ApplicationInfo */
    public static final class ApplicationInfo<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((qWH) t2).OLrzqt(), ((qWH) t).OLrzqt());
        }
    }

    /* JADX INFO: renamed from: o.kKq$BroadcastReceiver */
    public static final class BroadcastReceiver<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            kotlin.Pair<java.lang.Double, java.lang.String> priceLimit = ((MarketDataSource) ((kotlin.Pair) t2).getSecond()).getPriceLimit();
            java.lang.Double first = priceLimit != null ? priceLimit.getFirst() : null;
            kotlin.Pair<java.lang.Double, java.lang.String> priceLimit2 = ((MarketDataSource) ((kotlin.Pair) t).getSecond()).getPriceLimit();
            return yET.KWHzl(first, priceLimit2 != null ? priceLimit2.getFirst() : null);
        }
    }

    /* JADX INFO: renamed from: o.kKq$ClipData */
    public static final class ClipData<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketDataSource) ((kotlin.Pair) t2).getSecond()).getSortTurnover(), ((MarketDataSource) ((kotlin.Pair) t).getSecond()).getSortTurnover());
        }
    }

    /* JADX INFO: renamed from: o.kKq$ComponentCallbacks */
    public static final class ComponentCallbacks<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketDataSource) ((kotlin.Pair) t2).getSecond()).getBaseSymbol(), ((MarketDataSource) ((kotlin.Pair) t).getSecond()).getBaseSymbol());
        }
    }

    /* JADX INFO: renamed from: o.kKq$ComponentCallbacks2 */
    public static final class ComponentCallbacks2<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((MarketDataSource) ((kotlin.Pair) t2).getSecond()).getTickerPrice())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((MarketDataSource) ((kotlin.Pair) t).getSecond()).getTickerPrice())));
        }
    }

    /* JADX INFO: renamed from: o.kKq$Context */
    public static final class Context<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketDataSource) ((kotlin.Pair) t2).getSecond()).getSortVolume(), ((MarketDataSource) ((kotlin.Pair) t).getSecond()).getSortVolume());
        }
    }

    /* JADX INFO: renamed from: o.kKq$ContextWrapper */
    public static final class ContextWrapper<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.String listTime = ((MarketDataSource) ((kotlin.Pair) t2).getSecond()).getListTime();
            java.lang.Long lValueOf = listTime != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(listTime)) : null;
            java.lang.String listTime2 = ((MarketDataSource) ((kotlin.Pair) t).getSecond()).getListTime();
            return yET.KWHzl(lValueOf, listTime2 != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(listTime2)) : null);
        }
    }

    /* JADX INFO: renamed from: o.kKq$Fragment */
    public static final class Fragment<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((CoinQuote) t2).getChangePercent()), java.lang.Double.valueOf(((CoinQuote) t).getChangePercent()));
        }
    }

    /* JADX INFO: renamed from: o.kKq$FragmentManager */
    public static final class FragmentManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((CoinQuote) t2).getBaseCurrency(), ((CoinQuote) t).getBaseCurrency());
        }
    }

    /* JADX INFO: renamed from: o.kKq$IntentFilter */
    public static final class IntentFilter<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((qWH) t2).AYXKKw(), ((qWH) t).AYXKKw());
        }
    }

    /* JADX INFO: renamed from: o.kKq$IntentSender */
    public static final class IntentSender<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((qWH) t2).AEQbTJ(), ((qWH) t).AEQbTJ());
        }
    }

    /* JADX INFO: renamed from: o.kKq$LoaderManager */
    public static final class LoaderManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((CoinQuote) t2).getPriceNumber()), java.lang.Double.valueOf(((CoinQuote) t).getPriceNumber()));
        }
    }

    /* JADX INFO: renamed from: o.kKq$PackageItemInfo */
    public static final class PackageItemInfo<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((qWH) t2).fetchVPNInfo(), ((qWH) t).fetchVPNInfo());
        }
    }

    /* JADX INFO: renamed from: o.kKq$PackageManager */
    public static final class PackageManager<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((qWH) t2).fetchVPNInfo(), ((qWH) t).fetchVPNInfo());
        }
    }

    /* JADX INFO: renamed from: o.kKq$PendingIntent */
    public static final class PendingIntent<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((CoinQuote) t2).getTurnoverNumber()), java.lang.Double.valueOf(((CoinQuote) t).getTurnoverNumber()));
        }
    }

    /* JADX INFO: renamed from: o.kKq$SharedElementCallback */
    public static final class SharedElementCallback<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((CoinQuote) t2).getVolumeNumber()), java.lang.Double.valueOf(((CoinQuote) t).getVolumeNumber()));
        }
    }

    public static final CountDownInfo KWHzl(CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return xUD.AEQbTJ(coinQuote.getInstId(), coinQuote.getInstType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [194=10] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.util.ArrayList<qWH> copydefault(java.lang.String str, @NotNull java.util.ArrayList<qWH> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (str != null) {
            switch (str.hashCode()) {
                case -1858767985:
                    if (str.equals("price_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new IntentFilter());
                    }
                    break;
                case -1339918127:
                    if (str.equals("name_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new ApplicationInfo());
                    }
                    break;
                case -713692905:
                    if (str.equals("turnover_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new PackageManager());
                    }
                    break;
                case -417290646:
                    if (str.equals("volume_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new ServiceConnection());
                    }
                    break;
                case -379411751:
                    if (str.equals("name_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new DialogInterface());
                    }
                    break;
                case 56431059:
                    if (str.equals("turnover_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new SharedPreferences());
                    }
                    break;
                case 220531922:
                    if (str.equals("applies_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new IntentSender());
                    }
                    break;
                case 363662008:
                    if (str.equals("applies_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new ContentResolver());
                    }
                    break;
                case 1780803424:
                    if (str.equals("volume_descending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new PackageItemInfo());
                    }
                    break;
                case 1959155803:
                    if (str.equals("price_ascending_sort") && arrayList.size() > 1) {
                        C56407yEf.copydefault(arrayList, new Intent());
                    }
                    break;
            }
        }
        return (!C33129mqd.OLrzqt((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "name_descending_sort") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "name_ascending_sort")) ? new java.util.ArrayList<>(arrayList) : new java.util.ArrayList<>((java.util.List) new C41577qtT().copydefault(C56390yDp.OLrzqt(arrayList, new Function1() { // from class: o.kKt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27985kKq.KWHzl((qWH) obj);
            }
        })));
    }

    public static final CountDownInfo KWHzl(qWH qwh) {
        Intrinsics.checkNotNullParameter(qwh, "");
        if (!(qwh instanceof qWC)) {
            return null;
        }
        qWC qwc = (qWC) qwh;
        return xUD.AEQbTJ(qwc.KWHzl().getInstId(), qwc.KWHzl().getInstType());
    }

    /* JADX INFO: renamed from: o.kKq$ActionBar */
    public static final class ActionBar {
        public static final java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public static final int KWHzl;
        public static final ActionBar copydefault = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
            return EZpvd;
        }

        private ActionBar() {
        }

        static {
            SortTextView.SortType sortType = SortTextView.SortType.NONE;
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("0" + sortType.ordinal(), "");
            SortTextView.SortType sortType2 = SortTextView.SortType.UP;
            kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt("0" + sortType2.ordinal(), "name_ascending_sort");
            SortTextView.SortType sortType3 = SortTextView.SortType.DOWN;
            EZpvd = C56424yEw.gEmmrt(pairOLrzqt, pairOLrzqt2, C56390yDp.OLrzqt("0" + sortType3.ordinal(), "name_descending_sort"), C56390yDp.OLrzqt("1" + sortType.ordinal(), ""), C56390yDp.OLrzqt("1" + sortType2.ordinal(), "price_ascending_sort"), C56390yDp.OLrzqt("1" + sortType3.ordinal(), "price_descending_sort"), C56390yDp.OLrzqt("2" + sortType.ordinal(), ""), C56390yDp.OLrzqt("2" + sortType2.ordinal(), "applies_ascending_sort"), C56390yDp.OLrzqt("2" + sortType3.ordinal(), "applies_descending_sort"), C56390yDp.OLrzqt("3" + sortType.ordinal(), ""), C56390yDp.OLrzqt("3" + sortType2.ordinal(), "turnover_ascending_sort"), C56390yDp.OLrzqt("3" + sortType3.ordinal(), "turnover_descending_sort"));
            KWHzl = 8;
        }

        public final java.lang.String OLrzqt(int i) {
            if (Intrinsics.EZpvd((java.lang.Object) "Turnover", (java.lang.Object) C42955rgF.copydefault.OLrzqt())) {
                if (SortTextView.SortType.UP.ordinal() == i) {
                    return "turnover_ascending_sort";
                }
                if (SortTextView.SortType.DOWN.ordinal() == i) {
                    return "turnover_descending_sort";
                }
            } else {
                if (SortTextView.SortType.UP.ordinal() == i) {
                    return "volume_ascending_sort";
                }
                if (SortTextView.SortType.DOWN.ordinal() == i) {
                    return "volume_descending_sort";
                }
            }
            return "";
        }
    }
}
