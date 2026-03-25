package o;

import androidx.camera.video.AudioStats;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC41642quf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41511qsG extends AbstractC49400uno<Triple<? extends SortBy, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41642quf>>, java.util.List<? extends InterfaceC41642quf>> {
    private static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher EZpvd;

    /* JADX INFO: renamed from: o.qsG$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SortBy.values().length];
            try {
                iArr[SortBy.NAME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SortBy.PRICE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SortBy.CHANGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[SortOrder.values().length];
            try {
                iArr2[SortOrder.ASC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[SortOrder.DESC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[SortOrder.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C41511qsG(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.qsG$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsG.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull Triple<? extends SortBy, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41642quf>> triple, @NotNull Continuation<? super java.util.List<? extends InterfaceC41642quf>> continuation) {
        SortBy sortByComponent1 = triple.component1();
        SortOrder sortOrderComponent2 = triple.component2();
        java.util.List<? extends InterfaceC41642quf> listComponent3 = triple.component3();
        C41434qqj.KWHzl.AEQbTJ("SortOptionsVosUseCase", "sort options vos, sortBy=" + sortByComponent1 + ", sortOrder=" + sortOrderComponent2 + ", voListSize=" + listComponent3.size());
        if (listComponent3.isEmpty()) {
            return listComponent3;
        }
        java.lang.String str = sortByComponent1 + "_" + sortOrderComponent2;
        int i = ActionBar.EZpvd[sortByComponent1.ordinal()];
        if (i == 1) {
            int i2 = ActionBar.OLrzqt[sortOrderComponent2.ordinal()];
            if (i2 == 1) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new TaskDescription());
            } else if (i2 == 2) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new Application());
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 2) {
            int i3 = ActionBar.OLrzqt[sortOrderComponent2.ordinal()];
            if (i3 == 1) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new StateListAnimator());
            } else if (i3 == 2) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new Fragment());
            } else if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 3) {
            int i4 = ActionBar.OLrzqt[sortOrderComponent2.ordinal()];
            if (i4 == 1) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new FragmentManager());
            } else if (i4 == 2) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new PendingIntent());
            } else if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i5 = ActionBar.OLrzqt[sortOrderComponent2.ordinal()];
            if (i5 == 1) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new LoaderManager());
            } else if (i5 == 2) {
                listComponent3 = CollectionsKt___CollectionsKt.EZpvd(listComponent3, new Dialog());
            } else if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listComponent3, 10));
        java.util.Iterator<T> it = listComponent3.iterator();
        while (it.hasNext()) {
            arrayList.add(InterfaceC41642quf.TaskDescription.onCopy$default((InterfaceC41642quf) it.next(), null, null, str, 3, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.qsG$FragmentManager */
    public static final class FragmentManager<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dKWHzl = ((InterfaceC41642quf) t).KWHzl();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dKWHzl != null ? dKWHzl.doubleValue() : 0.0d;
            java.lang.Double dKWHzl2 = ((InterfaceC41642quf) t2).KWHzl();
            if (dKWHzl2 != null) {
                dDoubleValue = dKWHzl2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    /* JADX INFO: renamed from: o.qsG$LoaderManager */
    public static final class LoaderManager<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((InterfaceC41642quf) t).OLrzqt().getStk())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((InterfaceC41642quf) t2).OLrzqt().getStk())));
        }
    }

    /* JADX INFO: renamed from: o.qsG$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dCopydefault = ((InterfaceC41642quf) t).copydefault();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dCopydefault != null ? dCopydefault.doubleValue() : 0.0d;
            java.lang.Double dCopydefault2 = ((InterfaceC41642quf) t2).copydefault();
            if (dCopydefault2 != null) {
                dDoubleValue = dCopydefault2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    /* JADX INFO: renamed from: o.qsG$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((InterfaceC41642quf) t).OLrzqt().getStk(), ((InterfaceC41642quf) t2).OLrzqt().getStk());
        }
    }

    /* JADX INFO: renamed from: o.qsG$Application */
    public static final class Application<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((InterfaceC41642quf) t2).OLrzqt().getStk(), ((InterfaceC41642quf) t).OLrzqt().getStk());
        }
    }

    /* JADX INFO: renamed from: o.qsG$Dialog */
    public static final class Dialog<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((InterfaceC41642quf) t2).OLrzqt().getStk())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((InterfaceC41642quf) t).OLrzqt().getStk())));
        }
    }

    /* JADX INFO: renamed from: o.qsG$Fragment */
    public static final class Fragment<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dCopydefault = ((InterfaceC41642quf) t2).copydefault();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dCopydefault != null ? dCopydefault.doubleValue() : 0.0d;
            java.lang.Double dCopydefault2 = ((InterfaceC41642quf) t).copydefault();
            if (dCopydefault2 != null) {
                dDoubleValue = dCopydefault2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    /* JADX INFO: renamed from: o.qsG$PendingIntent */
    public static final class PendingIntent<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dKWHzl = ((InterfaceC41642quf) t2).KWHzl();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dKWHzl != null ? dKWHzl.doubleValue() : 0.0d;
            java.lang.Double dKWHzl2 = ((InterfaceC41642quf) t).KWHzl();
            if (dKWHzl2 != null) {
                dDoubleValue = dKWHzl2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }
}
