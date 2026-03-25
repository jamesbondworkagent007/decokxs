package o;

import androidx.camera.video.AudioStats;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC41655qus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41452qrA extends AbstractC49400uno<Triple<? extends DexSortByEnum, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41655qus>>, java.util.List<? extends InterfaceC41655qus>> {
    public final CoroutineDispatcher KWHzl;

    /* JADX INFO: renamed from: o.qrA$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DexSortByEnum.values().length];
            try {
                iArr[DexSortByEnum.PRICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DexSortByEnum.CHANGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DexSortByEnum.TURNOVER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[DexSortByEnum.MARKET_CAP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[SortOrder.values().length];
            try {
                iArr2[SortOrder.ASC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[SortOrder.DESC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[SortOrder.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return OLrzqt((Triple<? extends DexSortByEnum, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41655qus>>) obj, (Continuation<? super java.util.List<? extends InterfaceC41655qus>>) continuation);
    }

    @yCM
    public C41452qrA(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
    }

    public java.lang.Object OLrzqt(@NotNull Triple<? extends DexSortByEnum, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41655qus>> triple, @NotNull Continuation<? super java.util.List<? extends InterfaceC41655qus>> continuation) {
        DexSortByEnum dexSortByEnumComponent1 = triple.component1();
        SortOrder sortOrderComponent2 = triple.component2();
        java.util.List<? extends InterfaceC41655qus> listComponent3 = triple.component3();
        C41434qqj.KWHzl.AEQbTJ("SortDexVosUseCase", "sort dex vos, [sortBy: " + dexSortByEnumComponent1 + ", sortOrder: " + sortOrderComponent2 + ", list size: " + listComponent3.size() + "]");
        if (listComponent3.isEmpty()) {
            return listComponent3;
        }
        java.lang.String str = dexSortByEnumComponent1 + "_" + sortOrderComponent2;
        int i = StateListAnimator.KWHzl[dexSortByEnumComponent1.ordinal()];
        if (i == 1) {
            int i2 = StateListAnimator.EZpvd[sortOrderComponent2.ordinal()];
            if (i2 == 1) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new TaskDescription());
            } else if (i2 == 2) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new Application());
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 2) {
            int i3 = StateListAnimator.EZpvd[sortOrderComponent2.ordinal()];
            if (i3 == 1) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new Activity());
            } else if (i3 == 2) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new ActionBar());
            } else if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 3) {
            int i4 = StateListAnimator.EZpvd[sortOrderComponent2.ordinal()];
            if (i4 == 1) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new Fragment());
            } else if (i4 == 2) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new LoaderManager());
            } else if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 4) {
            int i5 = StateListAnimator.EZpvd[sortOrderComponent2.ordinal()];
            if (i5 == 1) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new PendingIntent());
            } else if (i5 == 2) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new FragmentManager());
            } else if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return OLrzqt(listComponent3, str);
    }

    /* JADX INFO: renamed from: o.qrA$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dKWHzl = ((InterfaceC41655qus) t).KWHzl();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dKWHzl != null ? dKWHzl.doubleValue() : 0.0d;
            java.lang.Double dKWHzl2 = ((InterfaceC41655qus) t2).KWHzl();
            if (dKWHzl2 != null) {
                dDoubleValue = dKWHzl2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    /* JADX INFO: renamed from: o.qrA$Fragment */
    public static final class Fragment<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalValues = ((InterfaceC41655qus) t).values();
            if (bigDecimalValues == null) {
                bigDecimalValues = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalValues2 = ((InterfaceC41655qus) t2).values();
            if (bigDecimalValues2 == null) {
                bigDecimalValues2 = BigDecimal.ZERO;
            }
            return yET.KWHzl(bigDecimalValues, bigDecimalValues2);
        }
    }

    /* JADX INFO: renamed from: o.qrA$PendingIntent */
    public static final class PendingIntent<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalAhwBna = ((InterfaceC41655qus) t).AhwBna();
            if (bigDecimalAhwBna == null) {
                bigDecimalAhwBna = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalAhwBna2 = ((InterfaceC41655qus) t2).AhwBna();
            if (bigDecimalAhwBna2 == null) {
                bigDecimalAhwBna2 = BigDecimal.ZERO;
            }
            return yET.KWHzl(bigDecimalAhwBna, bigDecimalAhwBna2);
        }
    }

    /* JADX INFO: renamed from: o.qrA$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dDjBIcL = ((InterfaceC41655qus) t).djBIcL();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dDjBIcL != null ? dDjBIcL.doubleValue() : 0.0d;
            java.lang.Double dDjBIcL2 = ((InterfaceC41655qus) t2).djBIcL();
            if (dDjBIcL2 != null) {
                dDoubleValue = dDjBIcL2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    /* JADX INFO: renamed from: o.qrA$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dKWHzl = ((InterfaceC41655qus) t2).KWHzl();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dKWHzl != null ? dKWHzl.doubleValue() : 0.0d;
            java.lang.Double dKWHzl2 = ((InterfaceC41655qus) t).KWHzl();
            if (dKWHzl2 != null) {
                dDoubleValue = dKWHzl2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    /* JADX INFO: renamed from: o.qrA$Application */
    public static final class Application<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dDjBIcL = ((InterfaceC41655qus) t2).djBIcL();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dDjBIcL != null ? dDjBIcL.doubleValue() : 0.0d;
            java.lang.Double dDjBIcL2 = ((InterfaceC41655qus) t).djBIcL();
            if (dDjBIcL2 != null) {
                dDoubleValue = dDjBIcL2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    /* JADX INFO: renamed from: o.qrA$FragmentManager */
    public static final class FragmentManager<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalAhwBna = ((InterfaceC41655qus) t2).AhwBna();
            if (bigDecimalAhwBna == null) {
                bigDecimalAhwBna = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalAhwBna2 = ((InterfaceC41655qus) t).AhwBna();
            if (bigDecimalAhwBna2 == null) {
                bigDecimalAhwBna2 = BigDecimal.ZERO;
            }
            return yET.KWHzl(bigDecimalAhwBna, bigDecimalAhwBna2);
        }
    }

    /* JADX INFO: renamed from: o.qrA$LoaderManager */
    public static final class LoaderManager<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalValues = ((InterfaceC41655qus) t2).values();
            if (bigDecimalValues == null) {
                bigDecimalValues = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalValues2 = ((InterfaceC41655qus) t).values();
            if (bigDecimalValues2 == null) {
                bigDecimalValues2 = BigDecimal.ZERO;
            }
            return yET.KWHzl(bigDecimalValues, bigDecimalValues2);
        }
    }

    private final java.util.List<InterfaceC41655qus> OLrzqt(java.util.List<? extends InterfaceC41655qus> list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (InterfaceC41655qus interfaceC41655qusOnCopy$default : list) {
            if (!Intrinsics.EZpvd(interfaceC41655qusOnCopy$default.isConnected(), (java.lang.Object) str)) {
                interfaceC41655qusOnCopy$default = InterfaceC41655qus.ActionBar.onCopy$default(interfaceC41655qusOnCopy$default, null, null, null, null, str, 15, null);
            }
            arrayList.add(interfaceC41655qusOnCopy$default);
        }
        return arrayList;
    }
}
