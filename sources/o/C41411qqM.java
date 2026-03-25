package o;

import androidx.camera.video.AudioStats;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.trade.arch.util.Quartet;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC41583qtZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41411qqM extends AbstractC49400uno<Quartet<? extends CategoryGroupVo, ? extends SortBy, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41583qtZ>>, java.util.List<? extends InterfaceC41583qtZ>> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher copydefault;

    /* JADX INFO: renamed from: o.qqM$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SortBy.values().length];
            try {
                iArr[SortBy.NAME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SortBy.VOLUME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SortBy.TURNOVER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SortBy.PRICE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[SortBy.CHANGE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[SortBy.NONE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[SortOrder.values().length];
            try {
                iArr2[SortOrder.ASC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[SortOrder.DESC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[SortOrder.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C41411qqM(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.qqM$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qqM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull Quartet<CategoryGroupVo, ? extends SortBy, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41583qtZ>> quartet, @NotNull Continuation<? super java.util.List<? extends InterfaceC41583qtZ>> continuation) {
        CategoryGroupVo categoryGroupVoComponent1 = quartet.component1();
        SortBy sortByComponent2 = quartet.component2();
        SortOrder sortOrderComponent3 = quartet.component3();
        java.util.List<? extends InterfaceC41583qtZ> listComponent4 = quartet.component4();
        if (listComponent4.isEmpty()) {
            C41434qqj.w$default(C41434qqj.KWHzl, "SortCoinVosUseCase", "sort coin vos input is empty", null, 4, null);
            return listComponent4;
        }
        java.lang.String str = sortByComponent2 + "_" + sortOrderComponent3;
        C41434qqj.KWHzl.AEQbTJ("SortCoinVosUseCase", "sort coin vos input [size: " + listComponent4.size() + ", category: " + categoryGroupVoComponent1 + ", sortBy: " + sortByComponent2 + ", sortOrder: " + sortOrderComponent3 + "]");
        if (categoryGroupVoComponent1.fetchVPNInfo() && (sortByComponent2 == SortBy.NONE || sortOrderComponent3 == SortOrder.NONE)) {
            java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new FragmentManager());
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            java.util.Iterator it = listEZpvd.iterator();
            while (it.hasNext()) {
                arrayList.add(InterfaceC41583qtZ.Activity.onCopy$default((InterfaceC41583qtZ) it.next(), null, null, str, 3, null));
            }
            return arrayList;
        }
        switch (Application.EZpvd[sortByComponent2.ordinal()]) {
            case 1:
                int i = Application.AEQbTJ[sortOrderComponent3.ordinal()];
                if (i == 1) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new Activity());
                } else if (i == 2) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new ActionBar());
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                break;
            case 2:
            case 3:
            case 6:
                break;
            case 4:
                int i2 = Application.AEQbTJ[sortOrderComponent3.ordinal()];
                if (i2 == 1) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new TaskDescription());
                } else if (i2 == 2) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new Dialog());
                } else if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                break;
            case 5:
                int i3 = Application.AEQbTJ[sortOrderComponent3.ordinal()];
                if (i3 == 1) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new LoaderManager());
                } else if (i3 == 2) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new PendingIntent());
                } else if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listComponent4, 10));
        java.util.Iterator<T> it2 = listComponent4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(InterfaceC41583qtZ.Activity.onCopy$default((InterfaceC41583qtZ) it2.next(), null, null, str, 3, null));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: o.qqM$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((InterfaceC41583qtZ) t).EZpvd(), ((InterfaceC41583qtZ) t2).EZpvd());
        }
    }

    /* JADX INFO: renamed from: o.qqM$LoaderManager */
    public static final class LoaderManager<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dCopydefault = ((InterfaceC41583qtZ) t).copydefault();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dCopydefault != null ? dCopydefault.doubleValue() : 0.0d;
            java.lang.Double dCopydefault2 = ((InterfaceC41583qtZ) t2).copydefault();
            if (dCopydefault2 != null) {
                dDoubleValue = dCopydefault2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    /* JADX INFO: renamed from: o.qqM$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalKWHzl = ((InterfaceC41583qtZ) t).KWHzl();
            if (bigDecimalKWHzl == null) {
                bigDecimalKWHzl = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalKWHzl2 = ((InterfaceC41583qtZ) t2).KWHzl();
            if (bigDecimalKWHzl2 == null) {
                bigDecimalKWHzl2 = BigDecimal.ZERO;
            }
            return yET.KWHzl(bigDecimalKWHzl, bigDecimalKWHzl2);
        }
    }

    /* JADX INFO: renamed from: o.qqM$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((InterfaceC41583qtZ) t2).EZpvd(), ((InterfaceC41583qtZ) t).EZpvd());
        }
    }

    /* JADX INFO: renamed from: o.qqM$Dialog */
    public static final class Dialog<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalKWHzl = ((InterfaceC41583qtZ) t2).KWHzl();
            if (bigDecimalKWHzl == null) {
                bigDecimalKWHzl = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalKWHzl2 = ((InterfaceC41583qtZ) t).KWHzl();
            if (bigDecimalKWHzl2 == null) {
                bigDecimalKWHzl2 = BigDecimal.ZERO;
            }
            return yET.KWHzl(bigDecimalKWHzl, bigDecimalKWHzl2);
        }
    }

    /* JADX INFO: renamed from: o.qqM$FragmentManager */
    public static final class FragmentManager<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(((InterfaceC41583qtZ) t2).djBIcL().getListTime())), java.lang.Long.valueOf(C33129mqd.valueOf(((InterfaceC41583qtZ) t).djBIcL().getListTime())));
        }
    }

    /* JADX INFO: renamed from: o.qqM$PendingIntent */
    public static final class PendingIntent<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dCopydefault = ((InterfaceC41583qtZ) t2).copydefault();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dCopydefault != null ? dCopydefault.doubleValue() : 0.0d;
            java.lang.Double dCopydefault2 = ((InterfaceC41583qtZ) t).copydefault();
            if (dCopydefault2 != null) {
                dDoubleValue = dCopydefault2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }
}
