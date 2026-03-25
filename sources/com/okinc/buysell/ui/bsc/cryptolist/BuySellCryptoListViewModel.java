package com.okinc.buysell.ui.bsc.cryptolist;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment;
import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import com.okinc.buysell.view.cryptolist.SearchHistoryItem;
import com.okinc.core.util.SPUtils;
import com.okinc.crcore.shared.net.responsebean.bsc.DefaultCurrencyBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okex.lite.home.bean.LiteUserResidenceType;
import com.okinc.okex.lite_market_api.bean.DexPriceRequestData;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CryptoListModel;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.oksearch.analytics.FuzzySearchEventProperty;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.oksearch.analytics.FuzzySearchEventTracker;
import com.okinc.okuser.data.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.function.Predicate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.YieldKt;
import o.AbstractC31905mIg;
import o.AbstractC43419rot;
import o.C30327lUg;
import o.C30350lVc;
import o.C31354lsT;
import o.C31656lzd;
import o.C31943mJr;
import o.C32989mnw;
import o.C33129mqd;
import o.C43251rlk;
import o.C47216tlp;
import o.C47222tlv;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56407yEf;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC31670lzr;
import o.InterfaceC31767mDd;
import o.InterfaceC47278tmy;
import o.InterfaceC56445yFq;
import o.lUY;
import o.lyD;
import o.lyR;
import o.mHA;
import o.mHQ;
import o.pUU;
import o.sxC;
import o.sxD;
import o.yCM;
import o.yDY;
import o.yEE;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellCryptoListViewModel extends C31943mJr {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<C32989mnw<List<CryptoListItem>>> AEQbTJ;
    public final MutableLiveData<C32989mnw<Boolean>> AYXKKw;
    public final MutableLiveData<C32989mnw<List<CryptoListItem>>> AhwBna;
    public final sxC AkhnZx;
    public boolean AuCTel;
    public final InterfaceC47278tmy AubY;
    public List<? extends CryptoListItem> DbNXlk;
    public final MutableLiveData<C32989mnw<List<CryptoListItem>>> KWHzl;
    public final MutableLiveData<C32989mnw<List<CryptoListItem>>> OLrzqt;
    public final MutableLiveData<C32989mnw<List<SearchHistoryItem>>> copydefault;
    public final lyD djBIcL;
    public boolean ejfBZ;
    public final InterfaceC31767mDd fARcdN;
    public boolean fIwbmz;
    public BuySellCryptoListFragment.Companion.ListType fJNWhG;
    public final lyR fetchVPNInfo;
    public TaskDescription gEmmrt;
    public String getFieldNames;
    public Job getNewProxyInstance;
    public final C31656lzd hDKMBd;
    public final sxD isConnected;
    public long iwGUEr;
    public Activity uzCIH;
    public final MutableLiveData<C32989mnw<AbstractC31905mIg>> valueOf;
    public List<? extends CryptoListItem> values;
    public List<? extends CryptoListItem> wlaJM;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ApiTask.values().length];
            try {
                iArr[ApiTask.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTask.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTask.UK_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[SearchApiTask.values().length];
            try {
                iArr2[SearchApiTask.CEFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SearchApiTask.DEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            EZpvd = iArr2;
            int[] iArr3 = new int[BuySellCryptoListFragment.Companion.ListType.values().length];
            try {
                iArr3[BuySellCryptoListFragment.Companion.ListType.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[BuySellCryptoListFragment.Companion.ListType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            copydefault = iArr3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.gEmmrt = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AuCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellCryptoListFragment.Companion.ListType AhwBna() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> DbNXlk() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.fIwbmz = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<List<CryptoListItem>>> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull BuySellCryptoListFragment.Companion.ListType listType) {
        Intrinsics.checkNotNullParameter(listType, "");
        this.fJNWhG = listType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.uzCIH = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.ejfBZ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<List<CryptoListItem>>> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<List<CryptoListItem>>> djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<List<CryptoListItem>>> fetchVPNInfo() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Activity gEmmrt() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<List<SearchHistoryItem>>> valueOf() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<AbstractC31905mIg>> values() {
        return this.valueOf;
    }

    @yCM
    public BuySellCryptoListViewModel(@NotNull lyR lyr, @NotNull lyD lyd, @NotNull C31656lzd c31656lzd, @NotNull InterfaceC31767mDd interfaceC31767mDd, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(lyr, "");
        Intrinsics.checkNotNullParameter(lyd, "");
        Intrinsics.checkNotNullParameter(c31656lzd, "");
        Intrinsics.checkNotNullParameter(interfaceC31767mDd, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.fetchVPNInfo = lyr;
        this.djBIcL = lyd;
        this.hDKMBd = c31656lzd;
        this.fARcdN = interfaceC31767mDd;
        this.AubY = interfaceC47278tmy;
        this.valueOf = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
        this.fJNWhG = BuySellCryptoListFragment.Companion.ListType.BUY;
        this.uzCIH = new Activity(null, null, false, false, 15, null);
        this.gEmmrt = new TaskDescription(AudioStats.AUDIO_AMPLITUDE_NONE, null, null, false, 15, null);
        this.getFieldNames = "";
        this.values = yDY.AhwBna();
        this.wlaJM = yDY.AhwBna();
        this.DbNXlk = yDY.AhwBna();
        this.AkhnZx = ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AEQbTJ();
        this.isConnected = ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).OLrzqt();
    }

    public static final class Activity {
        public String AEQbTJ;
        public boolean EZpvd;
        public String KWHzl;
        public boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, null, false, false, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, String str, String str2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = activity.KWHzl;
            }
            if ((i & 4) != 0) {
                z = activity.EZpvd;
            }
            if ((i & 8) != 0) {
                z2 = activity.OLrzqt;
            }
            return activity.AEQbTJ(str, str2, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(str, str2, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) activity.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) activity.KWHzl) && this.EZpvd == activity.EZpvd && this.OLrzqt == activity.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SellParams(selectedToken=" + this.AEQbTJ + ", selectedCurrency=" + this.KWHzl + ", hasVerificationStatus=" + this.EZpvd + ", onlyStableCoinEnabled=" + this.OLrzqt + ")";
        }

        public Activity(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.EZpvd = z;
            this.OLrzqt = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:114) call: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel.Activity.<init>(java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
        public /* synthetic */ Activity(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
        }
    }

    public static final class Application<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Long.valueOf(((SearchHistoryItem) t2).getTimeStamp()), Long.valueOf(((SearchHistoryItem) t).getTimeStamp()));
        }
    }

    public static final class TaskDescription {
        public boolean AEQbTJ;
        public String EZpvd;
        public String OLrzqt;
        public double copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(AudioStats.AUDIO_AMPLITUDE_NONE, null, null, false, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, double d, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                d = taskDescription.copydefault;
            }
            double d2 = d;
            if ((i & 2) != 0) {
                str = taskDescription.OLrzqt;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = taskDescription.EZpvd;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                z = taskDescription.AEQbTJ;
            }
            return taskDescription.AEQbTJ(d2, str3, str4, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(double d, @NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskDescription(d, str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(double d) {
            this.copydefault = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Double.compare(this.copydefault, taskDescription.copydefault) == 0 && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) taskDescription.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) taskDescription.EZpvd) && this.AEQbTJ == taskDescription.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Double.hashCode(this.copydefault) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BuyParams(usdRate=" + this.copydefault + ", selectedToken=" + this.OLrzqt + ", selectedCurrency=" + this.EZpvd + ", onlyStableCoinSupported=" + this.AEQbTJ + ")";
        }

        public TaskDescription(double d, @NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = d;
            this.OLrzqt = str;
            this.EZpvd = str2;
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:double:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1.0d double) : (r7v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(double, java.lang.String, java.lang.String, boolean):void (m)] (LINE:122) call: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel.TaskDescription.<init>(double, java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ TaskDescription(double d, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 1.0d : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ApiTask {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ApiTask[] $VALUES;
        public static final ApiTask BUY = new ApiTask("BUY", 0);
        public static final ApiTask SELL = new ApiTask("SELL", 1);
        public static final ApiTask UK_WARNING = new ApiTask("UK_WARNING", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ApiTask[] $values() {
            return new ApiTask[]{BUY, SELL, UK_WARNING};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ApiTask> getEntries() {
            return $ENTRIES;
        }

        private ApiTask(String str, int i) {
        }

        static {
            ApiTask[] apiTaskArr$values = $values();
            $VALUES = apiTaskArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(apiTaskArr$values);
        }

        public static ApiTask valueOf(String str) {
            return (ApiTask) Enum.valueOf(ApiTask.class, str);
        }

        public static ApiTask[] values() {
            return (ApiTask[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SearchApiTask {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SearchApiTask[] $VALUES;
        public static final SearchApiTask CEFI = new SearchApiTask("CEFI", 0);
        public static final SearchApiTask DEX = new SearchApiTask("DEX", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SearchApiTask[] $values() {
            return new SearchApiTask[]{CEFI, DEX};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SearchApiTask> getEntries() {
            return $ENTRIES;
        }

        private SearchApiTask(String str, int i) {
        }

        static {
            SearchApiTask[] searchApiTaskArr$values = $values();
            $VALUES = searchApiTaskArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(searchApiTaskArr$values);
        }

        public static SearchApiTask valueOf(String str) {
            return (SearchApiTask) Enum.valueOf(SearchApiTask.class, str);
        }

        public static SearchApiTask[] values() {
            return (SearchApiTask[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SearchHistoryOperation {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SearchHistoryOperation[] $VALUES;
        public static final SearchHistoryOperation ADD = new SearchHistoryOperation("ADD", 0);
        public static final SearchHistoryOperation REMOVE = new SearchHistoryOperation("REMOVE", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SearchHistoryOperation[] $values() {
            return new SearchHistoryOperation[]{ADD, REMOVE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SearchHistoryOperation> getEntries() {
            return $ENTRIES;
        }

        private SearchHistoryOperation(String str, int i) {
        }

        static {
            SearchHistoryOperation[] searchHistoryOperationArr$values = $values();
            $VALUES = searchHistoryOperationArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(searchHistoryOperationArr$values);
        }

        public static SearchHistoryOperation valueOf(String str) {
            return (SearchHistoryOperation) Enum.valueOf(SearchHistoryOperation.class, str);
        }

        public static SearchHistoryOperation[] values() {
            return (SearchHistoryOperation[]) $VALUES.clone();
        }
    }

    public final void copydefault(boolean z, boolean z2, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuySellCryptoListViewModel$loadData$1(this, z, z2, lifecycleOwner, null), 3, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x0051 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x0025 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r12v4, resolved type: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5 A[Catch: Exception -> 0x0051, TryCatch #1 {Exception -> 0x0051, blocks: (B:13:0x0033, B:49:0x00f0, B:51:0x00f5, B:55:0x010c, B:18:0x004d, B:32:0x008c, B:34:0x0093, B:36:0x00a2, B:38:0x00ae, B:39:0x00b7, B:44:0x00df, B:40:0x00c1, B:42:0x00cd, B:43:0x00d6), top: B:68:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v10, types: [com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(List<? extends ApiTask> list, boolean z, boolean z2, LifecycleOwner lifecycleOwner, Continuation<? super Unit> continuation) throws Throwable {
        BuySellCryptoListViewModel$load$1 buySellCryptoListViewModel$load$1;
        BuySellCryptoListViewModel buySellCryptoListViewModel;
        AbstractC43419rot abstractC43419rot;
        AbstractC43419rot abstractC43419rot2;
        BuySellCryptoListViewModel buySellCryptoListViewModel2;
        if (continuation instanceof BuySellCryptoListViewModel$load$1) {
            buySellCryptoListViewModel$load$1 = (BuySellCryptoListViewModel$load$1) continuation;
            int i = buySellCryptoListViewModel$load$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                buySellCryptoListViewModel$load$1.label = i - Integer.MIN_VALUE;
            } else {
                buySellCryptoListViewModel$load$1 = new BuySellCryptoListViewModel$load$1(this, continuation);
            }
        }
        Object objInvoke$default = buySellCryptoListViewModel$load$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = buySellCryptoListViewModel$load$1.label;
        try {
        } catch (Exception e) {
            e = e;
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objInvoke$default);
            if (z != 0) {
                mHA.OLrzqt.OLrzqt(this.valueOf, AbstractC31905mIg.Activity.EZpvd);
            }
            if (!z2) {
                mHA.OLrzqt.OLrzqt(this.valueOf, new AbstractC31905mIg.TaskDescription("No network connection", null, null, 6, null));
                return Unit.INSTANCE;
            }
            try {
                lyR lyr = this.fetchVPNInfo;
                buySellCryptoListViewModel$load$1.L$0 = this;
                buySellCryptoListViewModel$load$1.L$1 = list;
                buySellCryptoListViewModel$load$1.L$2 = lifecycleOwner;
                buySellCryptoListViewModel$load$1.label = 1;
                objInvoke$default = lyR.invoke$default(lyr, null, buySellCryptoListViewModel$load$1, 1, null);
                if (objInvoke$default == objCopydefault) {
                    return objCopydefault;
                }
                buySellCryptoListViewModel = this;
            } catch (Exception e2) {
                e = e2;
                z = this;
                pUU.copydefault(z.getClass().getSimpleName(), "loadData error: " + e.getMessage());
                mHA mha = mHA.OLrzqt;
                MutableLiveData<C32989mnw<AbstractC31905mIg>> mutableLiveData = z.valueOf;
                String message = e.getMessage();
                mha.OLrzqt(mutableLiveData, new AbstractC31905mIg.TaskDescription(message == null ? "" : message, null, null, 6, null));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC43419rot2 = (AbstractC43419rot) buySellCryptoListViewModel$load$1.L$1;
                BuySellCryptoListViewModel buySellCryptoListViewModel3 = (BuySellCryptoListViewModel) buySellCryptoListViewModel$load$1.L$0;
                C56391yDq.AEQbTJ(objInvoke$default);
                buySellCryptoListViewModel2 = buySellCryptoListViewModel3;
                abstractC43419rot = abstractC43419rot2;
                z = buySellCryptoListViewModel2;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                    mHA mha2 = mHA.OLrzqt;
                    MutableLiveData<C32989mnw<AbstractC31905mIg>> mutableLiveData2 = z.valueOf;
                    String message2 = oKServerException.getMessage();
                    mha2.OLrzqt(mutableLiveData2, new AbstractC31905mIg.TaskDescription(message2 == null ? "" : message2, null, null, 6, null));
                }
                return Unit.INSTANCE;
            }
            lifecycleOwner = (LifecycleOwner) buySellCryptoListViewModel$load$1.L$2;
            list = (List) buySellCryptoListViewModel$load$1.L$1;
            BuySellCryptoListViewModel buySellCryptoListViewModel4 = (BuySellCryptoListViewModel) buySellCryptoListViewModel$load$1.L$0;
            C56391yDq.AEQbTJ(objInvoke$default);
            buySellCryptoListViewModel = buySellCryptoListViewModel4;
        }
        abstractC43419rot = (AbstractC43419rot) objInvoke$default;
        z = buySellCryptoListViewModel;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            DefaultCurrencyBean defaultCurrencyBean = (DefaultCurrencyBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            if (buySellCryptoListViewModel.fJNWhG == BuySellCryptoListFragment.Companion.ListType.BUY) {
                if (!C33129mqd.OLrzqt((CharSequence) buySellCryptoListViewModel.gEmmrt.EZpvd())) {
                    buySellCryptoListViewModel.gEmmrt.OLrzqt(defaultCurrencyBean.getBuy());
                }
                buySellCryptoListViewModel.gEmmrt.OLrzqt(defaultCurrencyBean.getOnlyStableCoinSupported());
            } else {
                if (!C33129mqd.OLrzqt((CharSequence) buySellCryptoListViewModel.uzCIH.OLrzqt())) {
                    buySellCryptoListViewModel.uzCIH.EZpvd(defaultCurrencyBean.getSell());
                }
                buySellCryptoListViewModel.uzCIH.AEQbTJ(defaultCurrencyBean.getOnlyStableCoinSupported());
            }
            buySellCryptoListViewModel$load$1.L$0 = buySellCryptoListViewModel;
            buySellCryptoListViewModel$load$1.L$1 = abstractC43419rot;
            buySellCryptoListViewModel$load$1.L$2 = null;
            buySellCryptoListViewModel$load$1.label = 2;
            if (buySellCryptoListViewModel.copydefault(list, lifecycleOwner, buySellCryptoListViewModel$load$1) == objCopydefault) {
                return objCopydefault;
            }
            abstractC43419rot2 = abstractC43419rot;
            buySellCryptoListViewModel2 = buySellCryptoListViewModel;
            abstractC43419rot = abstractC43419rot2;
            z = buySellCryptoListViewModel2;
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(List<? extends ApiTask> list, LifecycleOwner lifecycleOwner, Continuation<? super Unit> continuation) throws Throwable {
        BuySellCryptoListViewModel$fetchCryptoListData$1 buySellCryptoListViewModel$fetchCryptoListData$1;
        BuySellCryptoListViewModel buySellCryptoListViewModel;
        Iterable iterable;
        LifecycleOwner lifecycleOwner2;
        Object next;
        if (continuation instanceof BuySellCryptoListViewModel$fetchCryptoListData$1) {
            buySellCryptoListViewModel$fetchCryptoListData$1 = (BuySellCryptoListViewModel$fetchCryptoListData$1) continuation;
            int i = buySellCryptoListViewModel$fetchCryptoListData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                buySellCryptoListViewModel$fetchCryptoListData$1.label = i - Integer.MIN_VALUE;
            } else {
                buySellCryptoListViewModel$fetchCryptoListData$1 = new BuySellCryptoListViewModel$fetchCryptoListData$1(this, continuation);
            }
        }
        Object objAwaitAll = buySellCryptoListViewModel$fetchCryptoListData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = buySellCryptoListViewModel$fetchCryptoListData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwaitAll);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(obj, BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new BuySellCryptoListViewModel$fetchCryptoListData$asyncTasks$1$1((ApiTask) obj, this, null), 3, null));
            }
            Set setKeySet = linkedHashMap.keySet();
            Collection collectionValues = linkedHashMap.values();
            buySellCryptoListViewModel$fetchCryptoListData$1.L$0 = this;
            buySellCryptoListViewModel$fetchCryptoListData$1.L$1 = lifecycleOwner;
            buySellCryptoListViewModel$fetchCryptoListData$1.L$2 = setKeySet;
            buySellCryptoListViewModel$fetchCryptoListData$1.label = 1;
            objAwaitAll = AwaitKt.awaitAll(collectionValues, buySellCryptoListViewModel$fetchCryptoListData$1);
            if (objAwaitAll == objCopydefault) {
                return objCopydefault;
            }
            buySellCryptoListViewModel = this;
            iterable = setKeySet;
            lifecycleOwner2 = lifecycleOwner;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iterable = (Iterable) buySellCryptoListViewModel$fetchCryptoListData$1.L$2;
            lifecycleOwner2 = (LifecycleOwner) buySellCryptoListViewModel$fetchCryptoListData$1.L$1;
            buySellCryptoListViewModel = (BuySellCryptoListViewModel) buySellCryptoListViewModel$fetchCryptoListData$1.L$0;
            C56391yDq.AEQbTJ(objAwaitAll);
        }
        for (Pair pair : CollectionsKt___CollectionsKt.values(iterable, (Iterable) objAwaitAll)) {
            ApiTask apiTask = (ApiTask) pair.component1();
            Object objComponent2 = pair.component2();
            int i3 = StateListAnimator.AEQbTJ[apiTask.ordinal()];
            if (i3 == 1) {
                AbstractC43419rot abstractC43419rot = objComponent2 instanceof AbstractC43419rot ? (AbstractC43419rot) objComponent2 : null;
                if (abstractC43419rot != null) {
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                        CryptoListModel cryptoListModel = (CryptoListModel) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                        buySellCryptoListViewModel.values = lUY.KWHzl(cryptoListModel.getBuyCryptoList(), CollectionsKt___CollectionsKt.OqFWZa(buySellCryptoListViewModel.values));
                        TaskDescription taskDescription = buySellCryptoListViewModel.gEmmrt;
                        Iterator<T> it = cryptoListModel.getBuyCurrencyList().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.EZpvd((Object) ((BuySellCurrency) next).getCurrency(), (Object) buySellCryptoListViewModel.gEmmrt.EZpvd())) {
                                break;
                            }
                        }
                        BuySellCurrency buySellCurrency = (BuySellCurrency) next;
                        taskDescription.KWHzl(buySellCurrency != null ? buySellCurrency.getUsdRate() : 1.0d);
                        List<? extends CryptoListItem> list2 = buySellCryptoListViewModel.values;
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((CryptoListItem) it2.next()).getCryptoId());
                        }
                        buySellCryptoListViewModel.copydefault(arrayList);
                        mHA.OLrzqt.OLrzqt(buySellCryptoListViewModel.OLrzqt, buySellCryptoListViewModel.values);
                        buySellCryptoListViewModel.OLrzqt(lifecycleOwner2);
                    }
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                        OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                        if (!(oKServerException instanceof OKServerException)) {
                            oKServerException = null;
                        }
                        if (oKServerException == null) {
                            oKServerException = new OKServerException(0, null, null, null, 15, null);
                        }
                        mHA mha = mHA.OLrzqt;
                        MutableLiveData<C32989mnw<AbstractC31905mIg>> mutableLiveData = buySellCryptoListViewModel.valueOf;
                        String message = oKServerException.getMessage();
                        mha.OLrzqt(mutableLiveData, new AbstractC31905mIg.TaskDescription(message == null ? "" : message, null, null, 6, null));
                    }
                }
            } else if (i3 == 2) {
                AbstractC43419rot abstractC43419rot2 = objComponent2 instanceof AbstractC43419rot ? (AbstractC43419rot) objComponent2 : null;
                if (abstractC43419rot2 != null) {
                    if (abstractC43419rot2 instanceof AbstractC43419rot.StateListAnimator) {
                        List list3 = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot2).KWHzl();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list3) {
                            if (((CurrencyToken) obj2).getChannelAvailable()) {
                                arrayList2.add(obj2);
                            }
                        }
                        if (!buySellCryptoListViewModel.uzCIH.AEQbTJ()) {
                            arrayList2 = null;
                        }
                        if (arrayList2 != null) {
                            list3 = arrayList2;
                        }
                        List<CryptoListItem> listCopydefault = lUY.copydefault(list3, buySellCryptoListViewModel.uzCIH.OLrzqt(), buySellCryptoListViewModel.uzCIH.copydefault());
                        buySellCryptoListViewModel.wlaJM = listCopydefault;
                        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                        Iterator<T> it3 = listCopydefault.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((CryptoListItem) it3.next()).getCryptoId());
                        }
                        buySellCryptoListViewModel.copydefault(arrayList3);
                        mHA.OLrzqt.OLrzqt(buySellCryptoListViewModel.AhwBna, buySellCryptoListViewModel.wlaJM);
                    }
                    if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                        OKServerException oKServerException2 = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot2).KWHzl();
                        mHA mha2 = mHA.OLrzqt;
                        MutableLiveData<C32989mnw<AbstractC31905mIg>> mutableLiveData2 = buySellCryptoListViewModel.valueOf;
                        String message2 = oKServerException2.getMessage();
                        mha2.OLrzqt(mutableLiveData2, new AbstractC31905mIg.TaskDescription(message2 == null ? "" : message2, null, null, 6, null));
                    }
                }
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.copydefault(objComponent2, "");
                mHA.OLrzqt.OLrzqt(buySellCryptoListViewModel.AYXKKw, C56443yFo.KWHzl(((LiteUserResidenceType) objComponent2) == LiteUserResidenceType.REQUIRING_WARNING));
            }
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(LifecycleOwner lifecycleOwner) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (CryptoListItem cryptoListItem : this.values) {
            if (cryptoListItem instanceof CryptoListItem.BuyDexListItem) {
                CryptoListItem.BuyDexListItem buyDexListItem = (CryptoListItem.BuyDexListItem) cryptoListItem;
                linkedHashSet2.add(new DexPriceRequestData(buyDexListItem.AEQbTJ().getDexInfo().getChainIndex(), buyDexListItem.AEQbTJ().getDexInfo().getTokenAddress()));
            } else {
                linkedHashSet.add(cryptoListItem.getCryptoId());
            }
        }
        KWHzl(linkedHashSet, lifecycleOwner);
        copydefault(linkedHashSet2, lifecycleOwner);
    }

    public final void AEQbTJ(LifecycleOwner lifecycleOwner) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (CryptoListItem cryptoListItem : this.DbNXlk) {
            if (cryptoListItem instanceof CryptoListItem.BuyDexListItem) {
                CryptoListItem.BuyDexListItem buyDexListItem = (CryptoListItem.BuyDexListItem) cryptoListItem;
                linkedHashSet2.add(new DexPriceRequestData(buyDexListItem.AEQbTJ().getDexInfo().getChainIndex(), buyDexListItem.AEQbTJ().getDexInfo().getTokenAddress()));
            } else {
                linkedHashSet.add(cryptoListItem.getCryptoId());
            }
        }
        if (!linkedHashSet.isEmpty()) {
            AEQbTJ(linkedHashSet, lifecycleOwner);
        }
        if (!linkedHashSet2.isEmpty()) {
            OLrzqt(linkedHashSet2, lifecycleOwner);
        }
    }

    public final void OLrzqt(Set<DexPriceRequestData> set, LifecycleOwner lifecycleOwner) {
        this.isConnected.copydefault();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuySellCryptoListViewModel$fetchDexLivePriceForSearch$1(sxD.Application.subscribeDexPriceData$default(this.isConnected, lifecycleOwner, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(set), 0L, 4, null), this, null), 3, null);
    }

    public final void AEQbTJ(Set<String> set, LifecycleOwner lifecycleOwner) {
        this.AkhnZx.KWHzl();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuySellCryptoListViewModel$fetchCefiTokensLivePriceForSearch$1(sxC.TaskDescription.httpThenSubscribeFairPriceData$default(this.AkhnZx, lifecycleOwner, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(set), false, this.gEmmrt.EZpvd(), 0L, 20, null), this, null), 3, null);
    }

    public final void copydefault(Set<DexPriceRequestData> set, LifecycleOwner lifecycleOwner) {
        this.isConnected.copydefault();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuySellCryptoListViewModel$fetchDexLivePriceForPopularList$1(sxD.Application.subscribeDexPriceData$default(this.isConnected, lifecycleOwner, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(set), 0L, 4, null), this, null), 3, null);
    }

    public final void KWHzl(Set<String> set, LifecycleOwner lifecycleOwner) {
        this.AkhnZx.KWHzl();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuySellCryptoListViewModel$fetchCefiTokensLivePriceForPopularList$1(sxC.TaskDescription.httpThenSubscribeFairPriceData$default(this.AkhnZx, lifecycleOwner, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(set), false, this.gEmmrt.EZpvd(), 0L, 20, null), this, null), 3, null);
    }

    public final void copydefault(List<String> list) {
        ArrayList<SearchHistoryItem.HistoryDexItem> arrayList;
        Pair<String, String> pairAYXKKw = AYXKKw();
        String strComponent1 = pairAYXKKw.component1();
        String strComponent2 = pairAYXKKw.component2();
        ArrayList arrayList2 = SPUtils.getArrayList(KWHzl(strComponent1), SearchHistoryItem.HistoryTokenItem.class);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            SearchHistoryItem.HistoryTokenItem historyTokenItem = (SearchHistoryItem.HistoryTokenItem) obj;
            Intrinsics.copydefault(historyTokenItem);
            if (AEQbTJ(historyTokenItem)) {
                arrayList3.add(obj);
            }
        }
        ArrayList<SearchHistoryItem.HistoryTokenItem> arrayList4 = new ArrayList<>(arrayList3);
        if (!this.ejfBZ) {
            arrayList = new ArrayList<>();
        } else {
            Iterable arrayList5 = SPUtils.getArrayList(KWHzl(strComponent2), SearchHistoryItem.HistoryDexItem.class);
            if (arrayList5 == null) {
                arrayList5 = yDY.AhwBna();
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : arrayList5) {
                SearchHistoryItem.HistoryDexItem historyDexItem = (SearchHistoryItem.HistoryDexItem) obj2;
                Intrinsics.copydefault(historyDexItem);
                if (KWHzl(historyDexItem)) {
                    arrayList6.add(obj2);
                }
            }
            arrayList = new ArrayList<>(arrayList6);
        }
        List<SearchHistoryItem> listAEQbTJ = AEQbTJ(arrayList4, arrayList);
        ArrayList arrayList7 = new ArrayList();
        for (SearchHistoryItem searchHistoryItem : listAEQbTJ) {
            if (this.fJNWhG == BuySellCryptoListFragment.Companion.ListType.BUY) {
                if ((searchHistoryItem instanceof SearchHistoryItem.HistoryTokenItem) && !list.contains(((SearchHistoryItem.HistoryTokenItem) searchHistoryItem).getCryptoId())) {
                    KWHzl(searchHistoryItem, SearchHistoryOperation.REMOVE);
                } else {
                    arrayList7.add(searchHistoryItem);
                }
            } else if (!list.contains(searchHistoryItem.getCryptoId())) {
                KWHzl(searchHistoryItem, SearchHistoryOperation.REMOVE);
            } else {
                arrayList7.add(searchHistoryItem);
            }
        }
        mHA.OLrzqt.OLrzqt(this.copydefault, arrayList7);
    }

    public final void KWHzl(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (this.fJNWhG == BuySellCryptoListFragment.Companion.ListType.SELL) {
            return;
        }
        if (this.AuCTel) {
            AEQbTJ(lifecycleOwner);
        } else {
            OLrzqt(lifecycleOwner);
        }
    }

    public final void KWHzl(@NotNull String str, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.isConnected.copydefault();
        this.AkhnZx.KWHzl();
        this.getFieldNames = str;
        this.DbNXlk = yDY.AhwBna();
        if (this.iwGUEr == 0) {
            this.iwGUEr = System.currentTimeMillis();
        }
        if (!C33129mqd.OLrzqt((CharSequence) str)) {
            this.AuCTel = false;
            mHA mha = mHA.OLrzqt;
            MutableLiveData<C32989mnw<List<SearchHistoryItem>>> mutableLiveData = this.copydefault;
            List listAhwBna = (List) mha.AEQbTJ(valueOf());
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            mha.OLrzqt(mutableLiveData, listAhwBna);
            if (this.fJNWhG == BuySellCryptoListFragment.Companion.ListType.BUY) {
                mha.OLrzqt(this.OLrzqt, this.values);
                OLrzqt(lifecycleOwner);
                return;
            } else {
                mha.OLrzqt(this.AhwBna, this.wlaJM);
                return;
            }
        }
        this.AuCTel = true;
        this.fIwbmz = true;
        AEQbTJ(str, lifecycleOwner);
    }

    public final void AEQbTJ(String str, LifecycleOwner lifecycleOwner) {
        if (this.ejfBZ) {
            if (this.fJNWhG == BuySellCryptoListFragment.Companion.ListType.BUY) {
                mHA mha = mHA.OLrzqt;
                mha.OLrzqt(this.AEQbTJ, yDY.AhwBna());
                mha.OLrzqt(this.valueOf, AbstractC31905mIg.Activity.EZpvd);
                Job job = this.getNewProxyInstance;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.getNewProxyInstance = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuySellCryptoListViewModel$fuzzySearch$1(this, str, lifecycleOwner, null), 3, null);
                return;
            }
            EZpvd(str);
            return;
        }
        BuySellCryptoListFragment.Companion.ListType listType = this.fJNWhG;
        BuySellCryptoListFragment.Companion.ListType listType2 = BuySellCryptoListFragment.Companion.ListType.BUY;
        List<? extends CryptoListItem> listSearchAndSortItems$default = C47222tlv.searchAndSortItems$default(C47222tlv.KWHzl, str, listType == listType2 ? this.values : this.wlaJM, FuzzySearchEventSourceEnum.OKPAYMENTS_COIN.getSource(), false, 8, null);
        if (this.fJNWhG == listType2) {
            this.DbNXlk = listSearchAndSortItems$default;
            if (!listSearchAndSortItems$default.isEmpty()) {
                AEQbTJ(lifecycleOwner);
                return;
            } else {
                mHA.OLrzqt.OLrzqt(this.AEQbTJ, listSearchAndSortItems$default);
                return;
            }
        }
        mHA.OLrzqt.OLrzqt(this.KWHzl, listSearchAndSortItems$default);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v15, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v24, types: [T, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(String str, LifecycleOwner lifecycleOwner, Continuation<? super Unit> continuation) throws Throwable {
        BuySellCryptoListViewModel$searchCedefiForBuy$1 buySellCryptoListViewModel$searchCedefiForBuy$1;
        Set setKeySet;
        BuySellCryptoListViewModel buySellCryptoListViewModel;
        Object obj;
        LifecycleOwner lifecycleOwner2;
        LifecycleOwner lifecycleOwner3;
        BuySellCryptoListViewModel buySellCryptoListViewModel2;
        String str2 = str;
        if (continuation instanceof BuySellCryptoListViewModel$searchCedefiForBuy$1) {
            buySellCryptoListViewModel$searchCedefiForBuy$1 = (BuySellCryptoListViewModel$searchCedefiForBuy$1) continuation;
            int i = buySellCryptoListViewModel$searchCedefiForBuy$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                buySellCryptoListViewModel$searchCedefiForBuy$1.label = i - Integer.MIN_VALUE;
            } else {
                buySellCryptoListViewModel$searchCedefiForBuy$1 = new BuySellCryptoListViewModel$searchCedefiForBuy$1(this, continuation);
            }
        }
        Object obj2 = buySellCryptoListViewModel$searchCedefiForBuy$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = buySellCryptoListViewModel$searchCedefiForBuy$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            List listGEmmrt = yDY.gEmmrt(SearchApiTask.CEFI, SearchApiTask.DEX);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listGEmmrt, 10)), 16));
            for (Object obj3 : listGEmmrt) {
                linkedHashMap.put(obj3, BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new BuySellCryptoListViewModel$searchCedefiForBuy$asyncTasks$1$1((SearchApiTask) obj3, this, str2, null), 3, null));
            }
            setKeySet = linkedHashMap.keySet();
            Collection collectionValues = linkedHashMap.values();
            buySellCryptoListViewModel$searchCedefiForBuy$1.L$0 = this;
            buySellCryptoListViewModel$searchCedefiForBuy$1.L$1 = str2;
            buySellCryptoListViewModel$searchCedefiForBuy$1.L$2 = lifecycleOwner;
            buySellCryptoListViewModel$searchCedefiForBuy$1.L$3 = setKeySet;
            buySellCryptoListViewModel$searchCedefiForBuy$1.label = 1;
            Object objAwaitAll = AwaitKt.awaitAll(collectionValues, buySellCryptoListViewModel$searchCedefiForBuy$1);
            if (objAwaitAll == objCopydefault) {
                return objCopydefault;
            }
            buySellCryptoListViewModel = this;
            obj = objAwaitAll;
            lifecycleOwner2 = lifecycleOwner;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleOwner3 = (LifecycleOwner) buySellCryptoListViewModel$searchCedefiForBuy$1.L$1;
                buySellCryptoListViewModel2 = (BuySellCryptoListViewModel) buySellCryptoListViewModel$searchCedefiForBuy$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                if (!(!buySellCryptoListViewModel2.DbNXlk.isEmpty())) {
                    buySellCryptoListViewModel2.AEQbTJ(lifecycleOwner3);
                } else {
                    mHA.OLrzqt.OLrzqt(buySellCryptoListViewModel2.AEQbTJ, buySellCryptoListViewModel2.DbNXlk);
                }
                return Unit.INSTANCE;
            }
            Iterable iterable = (Iterable) buySellCryptoListViewModel$searchCedefiForBuy$1.L$3;
            lifecycleOwner2 = (LifecycleOwner) buySellCryptoListViewModel$searchCedefiForBuy$1.L$2;
            String str3 = (String) buySellCryptoListViewModel$searchCedefiForBuy$1.L$1;
            buySellCryptoListViewModel = (BuySellCryptoListViewModel) buySellCryptoListViewModel$searchCedefiForBuy$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            setKeySet = iterable;
            str2 = str3;
            obj = obj2;
        }
        List<Pair> listValues = CollectionsKt___CollectionsKt.values(setKeySet, (Iterable) obj);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = yDY.AhwBna();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = yDY.AhwBna();
        for (Pair pair : listValues) {
            SearchApiTask searchApiTask = (SearchApiTask) pair.component1();
            AbstractC43419rot abstractC43419rot = (AbstractC43419rot) pair.component2();
            int i3 = StateListAnimator.EZpvd[searchApiTask.ordinal()];
            if (i3 == 1) {
                if (!(abstractC43419rot instanceof AbstractC43419rot)) {
                    abstractC43419rot = null;
                }
                if (abstractC43419rot != null) {
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                        objectRef.element = lUY.KWHzl(((CryptoListModel) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getBuyCryptoList(), yEE.copydefault());
                    }
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    }
                }
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    if (!(abstractC43419rot instanceof AbstractC43419rot)) {
                        abstractC43419rot = null;
                    }
                    if (abstractC43419rot != null) {
                        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                            objectRef2.element = lUY.KWHzl((List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
                        }
                        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                        }
                    }
                }
            }
        }
        buySellCryptoListViewModel.DbNXlk = C47216tlp.EZpvd(str2, (List) objectRef.element, (List) objectRef2.element, C30327lUg.OLrzqt(), FuzzySearchEventSourceEnum.BSC_CEDEFI_COIN.getSource());
        buySellCryptoListViewModel$searchCedefiForBuy$1.L$0 = buySellCryptoListViewModel;
        buySellCryptoListViewModel$searchCedefiForBuy$1.L$1 = lifecycleOwner2;
        buySellCryptoListViewModel$searchCedefiForBuy$1.L$2 = null;
        buySellCryptoListViewModel$searchCedefiForBuy$1.L$3 = null;
        buySellCryptoListViewModel$searchCedefiForBuy$1.label = 2;
        if (YieldKt.yield(buySellCryptoListViewModel$searchCedefiForBuy$1) == objCopydefault) {
            return objCopydefault;
        }
        lifecycleOwner3 = lifecycleOwner2;
        buySellCryptoListViewModel2 = buySellCryptoListViewModel;
        if (!(!buySellCryptoListViewModel2.DbNXlk.isEmpty())) {
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(String str) {
        mHA.OLrzqt.OLrzqt(this.KWHzl, C47222tlv.searchAndSortItems$default(C47222tlv.KWHzl, str, this.wlaJM, FuzzySearchEventSourceEnum.BSC_CEDEFI_COIN.getSource(), false, 8, null));
    }

    public final SearchHistoryItem AEQbTJ(@NotNull CurrencyToken currencyToken) {
        Intrinsics.checkNotNullParameter(currencyToken, "");
        if (this.fJNWhG == BuySellCryptoListFragment.Companion.ListType.BUY) {
            if (C33129mqd.OLrzqt((CharSequence) currencyToken.getDexInfo().getUniqueId())) {
                return new SearchHistoryItem.HistoryDexItem(currencyToken.getDexInfo().getUniqueId(), currencyToken.getSymbol(), "", "", System.currentTimeMillis(), currencyToken);
            }
            return new SearchHistoryItem.HistoryTokenItem(currencyToken.getCurrency(), currencyToken.getCurrencyName(), "", "", System.currentTimeMillis(), currencyToken);
        }
        if (C33129mqd.OLrzqt((CharSequence) currencyToken.getDexInfo().getUniqueId())) {
            return new SearchHistoryItem.HistoryDexItem(currencyToken.getDexInfo().getUniqueId(), currencyToken.getSymbol(), "", "", System.currentTimeMillis(), currencyToken);
        }
        return new SearchHistoryItem.HistoryTokenItem(currencyToken.getCurrency(), currencyToken.getCurrencyName(), "", "", System.currentTimeMillis(), currencyToken);
    }

    public static /* synthetic */ void addOrRemoveSearchHistories$default(BuySellCryptoListViewModel buySellCryptoListViewModel, SearchHistoryItem searchHistoryItem, SearchHistoryOperation searchHistoryOperation, int i, Object obj) {
        if ((i & 2) != 0) {
            searchHistoryOperation = SearchHistoryOperation.ADD;
        }
        buySellCryptoListViewModel.KWHzl(searchHistoryItem, searchHistoryOperation);
    }

    public final void KWHzl(@NotNull final SearchHistoryItem searchHistoryItem, @NotNull SearchHistoryOperation searchHistoryOperation) {
        Intrinsics.checkNotNullParameter(searchHistoryItem, "");
        Intrinsics.checkNotNullParameter(searchHistoryOperation, "");
        Pair<String, String> pairAYXKKw = AYXKKw();
        String strComponent1 = pairAYXKKw.component1();
        String strComponent2 = pairAYXKKw.component2();
        if (searchHistoryItem instanceof SearchHistoryItem.HistoryTokenItem) {
            ArrayList arrayList = SPUtils.getArrayList(KWHzl(strComponent1), SearchHistoryItem.HistoryTokenItem.class);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                SearchHistoryItem.HistoryTokenItem historyTokenItem = (SearchHistoryItem.HistoryTokenItem) obj;
                Intrinsics.copydefault(historyTokenItem);
                if (AEQbTJ(historyTokenItem)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            final Function1 function1 = new Function1() { // from class: o.lDX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(BuySellCryptoListViewModel.KWHzl(searchHistoryItem, (SearchHistoryItem.HistoryTokenItem) obj2));
                }
            };
            arrayList3.removeIf(new Predicate() { // from class: o.lDW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj2) {
                    return BuySellCryptoListViewModel.OLrzqt(function1, obj2);
                }
            });
            if (arrayList3.size() >= 20) {
                arrayList3.remove(yDY.AuCTel(arrayList3));
            }
            if (searchHistoryOperation == SearchHistoryOperation.ADD) {
                SearchHistoryItem.HistoryTokenItem historyTokenItem2 = (SearchHistoryItem.HistoryTokenItem) searchHistoryItem;
                arrayList3.add(0, new SearchHistoryItem.HistoryTokenItem(historyTokenItem2.getCryptoId(), historyTokenItem2.getCryptoName(), historyTokenItem2.getPrimary(), historyTokenItem2.getSecondary(), System.currentTimeMillis(), historyTokenItem2.getCurrencyToken()));
            }
            SPUtils.put(KWHzl(strComponent1), arrayList3);
            return;
        }
        if (!(searchHistoryItem instanceof SearchHistoryItem.HistoryDexItem)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList4 = SPUtils.getArrayList(KWHzl(strComponent2), SearchHistoryItem.HistoryDexItem.class);
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            SearchHistoryItem.HistoryDexItem historyDexItem = (SearchHistoryItem.HistoryDexItem) obj2;
            Intrinsics.copydefault(historyDexItem);
            if (KWHzl(historyDexItem)) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList(arrayList5);
        final Function1 function12 = new Function1() { // from class: o.lDY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return java.lang.Boolean.valueOf(BuySellCryptoListViewModel.KWHzl(searchHistoryItem, (SearchHistoryItem.HistoryDexItem) obj3));
            }
        };
        arrayList6.removeIf(new Predicate() { // from class: o.lEe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj3) {
                return BuySellCryptoListViewModel.AEQbTJ(function12, obj3);
            }
        });
        if (arrayList6.size() >= 20) {
            arrayList6.remove(yDY.AuCTel(arrayList6));
        }
        if (searchHistoryOperation == SearchHistoryOperation.ADD) {
            SearchHistoryItem.HistoryDexItem historyDexItem2 = (SearchHistoryItem.HistoryDexItem) searchHistoryItem;
            arrayList6.add(0, new SearchHistoryItem.HistoryDexItem(historyDexItem2.getCryptoId(), historyDexItem2.getCryptoName(), historyDexItem2.getPrimary(), historyDexItem2.getSecondary(), System.currentTimeMillis(), historyDexItem2.getCurrencyToken()));
        }
        SPUtils.put(KWHzl(strComponent2), arrayList6);
    }

    public static final boolean OLrzqt(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean KWHzl(SearchHistoryItem searchHistoryItem, SearchHistoryItem.HistoryTokenItem historyTokenItem) {
        return Intrinsics.EZpvd((Object) historyTokenItem.getCryptoId(), (Object) ((SearchHistoryItem.HistoryTokenItem) searchHistoryItem).getCryptoId());
    }

    public static final boolean AEQbTJ(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean KWHzl(SearchHistoryItem searchHistoryItem, SearchHistoryItem.HistoryDexItem historyDexItem) {
        return Intrinsics.EZpvd((Object) historyDexItem.getCryptoId(), (Object) ((SearchHistoryItem.HistoryDexItem) searchHistoryItem).getCryptoId());
    }

    public final void EZpvd() {
        Pair<String, String> pairAYXKKw = AYXKKw();
        String strComponent1 = pairAYXKKw.component1();
        String strComponent2 = pairAYXKKw.component2();
        SPUtils.put(KWHzl(strComponent1), new ArrayList());
        SPUtils.put(KWHzl(strComponent2), new ArrayList());
    }

    public final void AEQbTJ() {
        this.AkhnZx.KWHzl();
        this.isConnected.copydefault();
    }

    public final Pair<String, String> AYXKKw() {
        if (this.fJNWhG == BuySellCryptoListFragment.Companion.ListType.BUY) {
            return C56390yDp.OLrzqt("BuyHistoryToken_v1", "BuyHistoryDex_v1");
        }
        return C56390yDp.OLrzqt("SellHistoryToken_v1", "SellHistoryDex_v1");
    }

    public final boolean AEQbTJ(SearchHistoryItem.HistoryTokenItem historyTokenItem) {
        return historyTokenItem.getTimeStamp() != 0 || C33129mqd.OLrzqt((CharSequence) historyTokenItem.getCryptoId()) || C33129mqd.OLrzqt((CharSequence) historyTokenItem.getCurrencyToken().getIcon()) || C33129mqd.OLrzqt((CharSequence) historyTokenItem.getCryptoName());
    }

    public final boolean KWHzl(SearchHistoryItem.HistoryDexItem historyDexItem) {
        return historyDexItem.getTimeStamp() != 0 || C33129mqd.OLrzqt((CharSequence) historyDexItem.getCryptoId()) || C33129mqd.OLrzqt((CharSequence) historyDexItem.getCryptoName()) || C33129mqd.OLrzqt((CharSequence) historyDexItem.getCurrencyToken().getIcon()) || C33129mqd.OLrzqt((CharSequence) historyDexItem.getCurrencyToken().getDexInfo().getChainIndex()) || C33129mqd.OLrzqt((CharSequence) historyDexItem.getCurrencyToken().getDexInfo().getTokenAddress());
    }

    public final String KWHzl(String str) {
        String uid;
        User userOLrzqt = this.AubY.OLrzqt();
        if (userOLrzqt == null || (uid = userOLrzqt.getUid()) == null) {
            uid = "";
        }
        return mHQ.KWHzl.AEQbTJ(uid) + "_" + str;
    }

    public final List<SearchHistoryItem> AEQbTJ(ArrayList<SearchHistoryItem.HistoryTokenItem> arrayList, ArrayList<SearchHistoryItem.HistoryDexItem> arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        if (arrayList3.size() > 1) {
            C56407yEf.copydefault(arrayList3, new Application());
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList3, 20));
    }

    public static /* synthetic */ void trackFuzzySearchCryptoClickEvent$default(BuySellCryptoListViewModel buySellCryptoListViewModel, CryptoListItem cryptoListItem, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        buySellCryptoListViewModel.AEQbTJ(cryptoListItem, i, z);
    }

    public final void AEQbTJ(CryptoListItem cryptoListItem, int i, boolean z) {
        String value;
        String value2;
        if (this.ejfBZ) {
            FuzzySearchEventTracker fuzzySearchEventTracker = FuzzySearchEventTracker.EZpvd;
            String source = FuzzySearchEventSourceEnum.BSC_CEDEFI_COIN.getSource();
            String str = this.getFieldNames;
            String strGEmmrt = C33129mqd.gEmmrt(cryptoListItem != null ? cryptoListItem.getPrimary() : null);
            String strGEmmrt2 = C33129mqd.gEmmrt(cryptoListItem != null ? cryptoListItem.getSecondary() : null);
            String strGEmmrt3 = C33129mqd.gEmmrt(cryptoListItem != null ? Double.valueOf(cryptoListItem.getPrimarySimilarity()) : null);
            String strGEmmrt4 = C33129mqd.gEmmrt(cryptoListItem != null ? Double.valueOf(cryptoListItem.getSecondarySimilarity()) : null);
            String strGEmmrt5 = C33129mqd.gEmmrt(Integer.valueOf(i));
            if (z) {
                value = FuzzySearchEventProperty.TokenType.DEX.getValue();
            } else {
                value = FuzzySearchEventProperty.TokenType.CEX.getValue();
            }
            String str2 = value;
            if (this.fJNWhG == BuySellCryptoListFragment.Companion.ListType.BUY) {
                value2 = FuzzySearchEventProperty.Flow.BUY.getValue();
            } else {
                value2 = FuzzySearchEventProperty.Flow.SELL.getValue();
            }
            fuzzySearchEventTracker.EZpvd(source, str, strGEmmrt, strGEmmrt2, strGEmmrt3, strGEmmrt4, strGEmmrt5, str2, value2);
            return;
        }
        FuzzySearchEventTracker.EZpvd.KWHzl(FuzzySearchEventSourceEnum.OKPAYMENTS_COIN.getSource(), this.getFieldNames, C33129mqd.gEmmrt(cryptoListItem != null ? cryptoListItem.getPrimary() : null), C33129mqd.gEmmrt(cryptoListItem != null ? cryptoListItem.getSecondary() : null), C33129mqd.gEmmrt(cryptoListItem != null ? Double.valueOf(cryptoListItem.getPrimarySimilarity()) : null), C33129mqd.gEmmrt(cryptoListItem != null ? Double.valueOf(cryptoListItem.getSecondarySimilarity()) : null), C33129mqd.gEmmrt(Integer.valueOf(i)));
    }

    public final void EZpvd(@NotNull String str, @NotNull C30350lVc c30350lVc, boolean z) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c30350lVc, "");
        C31354lsT c31354lsT = C31354lsT.KWHzl;
        int i = StateListAnimator.copydefault[this.fJNWhG.ordinal()];
        if (i == 1) {
            str2 = "buy";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "sell";
        }
        c30350lVc.AEQbTJ(this.getFieldNames);
        String strGEmmrt = C33129mqd.gEmmrt(Long.valueOf(System.currentTimeMillis() - this.iwGUEr));
        if (!Boolean.valueOf(z && this.iwGUEr != 0).booleanValue()) {
            strGEmmrt = null;
        }
        c30350lVc.copydefault(strGEmmrt != null ? strGEmmrt : "");
        Unit unit = Unit.INSTANCE;
        c31354lsT.KWHzl("SimpleTrade_BuyCryptoPop_Button_Click", str, str2, c30350lVc);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
