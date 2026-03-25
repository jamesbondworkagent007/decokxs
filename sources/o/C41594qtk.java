package o;

import androidx.camera.video.AudioStats;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.unify_trade.biz.CountDownInfo;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41641que;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41594qtk implements InterfaceC49405unt<Quartet<? extends CategoryGroupVo, ? extends SortBy, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41641que>>, java.util.List<? extends InterfaceC41641que>> {
    private static final ActionBar Companion = new ActionBar(null);
    public final C41577qtT<InterfaceC41641que> EZpvd;

    /* JADX INFO: renamed from: o.qtk$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

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
            KWHzl = iArr;
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

    @yCM
    public C41594qtk(@NotNull C41577qtT<InterfaceC41641que> c41577qtT) {
        Intrinsics.checkNotNullParameter(c41577qtT, "");
        this.EZpvd = c41577qtT;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC49405unt
    public /* synthetic */ java.util.List<? extends InterfaceC41641que> AEQbTJ(Quartet<? extends CategoryGroupVo, ? extends SortBy, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41641que>> quartet) {
        return KWHzl((Quartet<CategoryGroupVo, ? extends SortBy, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41641que>>) quartet);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public java.util.List<InterfaceC41641que> EZpvd(@NotNull Quartet<CategoryGroupVo, ? extends SortBy, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41641que>> quartet) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, quartet);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX INFO: renamed from: o.qtk$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qtk.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.util.List<InterfaceC41641que> KWHzl(@NotNull Quartet<CategoryGroupVo, ? extends SortBy, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41641que>> quartet) {
        Intrinsics.checkNotNullParameter(quartet, "");
        CategoryGroupVo categoryGroupVoComponent1 = quartet.component1();
        SortBy sortByComponent2 = quartet.component2();
        SortOrder sortOrderComponent3 = quartet.component3();
        java.util.List<InterfaceC41641que> listEZpvd = (java.util.List) quartet.component4();
        C41434qqj.KWHzl.AEQbTJ("SortSpotVosUseCase", "sort spot vos, sortBy=" + sortByComponent2 + ", sortOrder=" + sortOrderComponent3 + ", voListSize=" + listEZpvd.size());
        if (listEZpvd.isEmpty()) {
            return listEZpvd;
        }
        java.lang.String str = sortByComponent2 + "_" + sortOrderComponent3;
        if (categoryGroupVoComponent1.fetchVPNInfo() && (sortByComponent2 == SortBy.NONE || sortOrderComponent3 == SortOrder.NONE)) {
            return KWHzl(CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new SharedElementCallback()), str);
        }
        switch (StateListAnimator.KWHzl[sortByComponent2.ordinal()]) {
            case 1:
                int i = StateListAnimator.AEQbTJ[sortOrderComponent3.ordinal()];
                if (i == 1) {
                    listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new Activity());
                } else if (i == 2) {
                    listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new Application());
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                break;
            case 2:
                int i2 = StateListAnimator.AEQbTJ[sortOrderComponent3.ordinal()];
                if (i2 == 1) {
                    listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new FragmentManager());
                } else if (i2 == 2) {
                    listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new Dialog());
                } else if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                break;
            case 3:
                int i3 = StateListAnimator.AEQbTJ[sortOrderComponent3.ordinal()];
                if (i3 == 1) {
                    listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new PendingIntent());
                } else if (i3 == 2) {
                    listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new Fragment());
                } else if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                break;
            case 4:
                int i4 = StateListAnimator.AEQbTJ[sortOrderComponent3.ordinal()];
                if (i4 == 1) {
                    listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new LoaderManager());
                } else if (i4 == 2) {
                    listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new PictureInPictureParams());
                } else if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                break;
            case 5:
                int i5 = StateListAnimator.AEQbTJ[sortOrderComponent3.ordinal()];
                if (i5 == 1) {
                    listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new TaskStackBuilder());
                } else if (i5 == 2) {
                    listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listEZpvd, new TaskDescription());
                } else if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                break;
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return KWHzl(EZpvd((java.util.List<? extends InterfaceC41641que>) listEZpvd), str);
    }

    public static final CountDownInfo KWHzl(InterfaceC41641que interfaceC41641que) {
        Intrinsics.checkNotNullParameter(interfaceC41641que, "");
        return interfaceC41641que.values().getCountDownInfo();
    }

    public final java.util.List<InterfaceC41641que> EZpvd(java.util.List<? extends InterfaceC41641que> list) {
        return (java.util.List) this.EZpvd.copydefault(C56390yDp.OLrzqt(list, new Function1() { // from class: o.qth
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41594qtk.KWHzl((InterfaceC41641que) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o.qtk$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((InterfaceC41641que) t).AYXKKw(), ((InterfaceC41641que) t2).AYXKKw());
        }
    }

    /* JADX INFO: renamed from: o.qtk$FragmentManager */
    public static final class FragmentManager<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalFIwbmz = ((InterfaceC41641que) t).fIwbmz();
            if (bigDecimalFIwbmz == null) {
                bigDecimalFIwbmz = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalFIwbmz2 = ((InterfaceC41641que) t2).fIwbmz();
            if (bigDecimalFIwbmz2 == null) {
                bigDecimalFIwbmz2 = BigDecimal.ZERO;
            }
            return yET.KWHzl(bigDecimalFIwbmz, bigDecimalFIwbmz2);
        }
    }

    /* JADX INFO: renamed from: o.qtk$LoaderManager */
    public static final class LoaderManager<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dDjBIcL = ((InterfaceC41641que) t).djBIcL();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dDjBIcL != null ? dDjBIcL.doubleValue() : 0.0d;
            java.lang.Double dDjBIcL2 = ((InterfaceC41641que) t2).djBIcL();
            if (dDjBIcL2 != null) {
                dDoubleValue = dDjBIcL2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    /* JADX INFO: renamed from: o.qtk$PendingIntent */
    public static final class PendingIntent<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalFJNWhG = ((InterfaceC41641que) t).fJNWhG();
            if (bigDecimalFJNWhG == null) {
                bigDecimalFJNWhG = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalFJNWhG2 = ((InterfaceC41641que) t2).fJNWhG();
            if (bigDecimalFJNWhG2 == null) {
                bigDecimalFJNWhG2 = BigDecimal.ZERO;
            }
            return yET.KWHzl(bigDecimalFJNWhG, bigDecimalFJNWhG2);
        }
    }

    /* JADX INFO: renamed from: o.qtk$TaskStackBuilder */
    public static final class TaskStackBuilder<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dKWHzl = ((InterfaceC41641que) t).KWHzl();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dKWHzl != null ? dKWHzl.doubleValue() : 0.0d;
            java.lang.Double dKWHzl2 = ((InterfaceC41641que) t2).KWHzl();
            if (dKWHzl2 != null) {
                dDoubleValue = dKWHzl2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    public final java.util.List<InterfaceC41641que> KWHzl(java.util.List<? extends InterfaceC41641que> list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (InterfaceC41641que interfaceC41641queOnCopy$default : list) {
            if (!Intrinsics.EZpvd(interfaceC41641queOnCopy$default.ejfBZ(), (java.lang.Object) str)) {
                interfaceC41641queOnCopy$default = InterfaceC41641que.Application.onCopy$default(interfaceC41641queOnCopy$default, null, null, null, null, null, str, null, 95, null);
            }
            arrayList.add(interfaceC41641queOnCopy$default);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.qtk$Application */
    public static final class Application<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((InterfaceC41641que) t2).AYXKKw(), ((InterfaceC41641que) t).AYXKKw());
        }
    }

    /* JADX INFO: renamed from: o.qtk$Dialog */
    public static final class Dialog<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalFIwbmz = ((InterfaceC41641que) t2).fIwbmz();
            if (bigDecimalFIwbmz == null) {
                bigDecimalFIwbmz = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalFIwbmz2 = ((InterfaceC41641que) t).fIwbmz();
            if (bigDecimalFIwbmz2 == null) {
                bigDecimalFIwbmz2 = BigDecimal.ZERO;
            }
            return yET.KWHzl(bigDecimalFIwbmz, bigDecimalFIwbmz2);
        }
    }

    /* JADX INFO: renamed from: o.qtk$Fragment */
    public static final class Fragment<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalFJNWhG = ((InterfaceC41641que) t2).fJNWhG();
            if (bigDecimalFJNWhG == null) {
                bigDecimalFJNWhG = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalFJNWhG2 = ((InterfaceC41641que) t).fJNWhG();
            if (bigDecimalFJNWhG2 == null) {
                bigDecimalFJNWhG2 = BigDecimal.ZERO;
            }
            return yET.KWHzl(bigDecimalFJNWhG, bigDecimalFJNWhG2);
        }
    }

    /* JADX INFO: renamed from: o.qtk$PictureInPictureParams */
    public static final class PictureInPictureParams<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dDjBIcL = ((InterfaceC41641que) t2).djBIcL();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dDjBIcL != null ? dDjBIcL.doubleValue() : 0.0d;
            java.lang.Double dDjBIcL2 = ((InterfaceC41641que) t).djBIcL();
            if (dDjBIcL2 != null) {
                dDoubleValue = dDjBIcL2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    /* JADX INFO: renamed from: o.qtk$SharedElementCallback */
    public static final class SharedElementCallback<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(((InterfaceC41641que) t2).values().getListTime())), java.lang.Long.valueOf(C33129mqd.valueOf(((InterfaceC41641que) t).values().getListTime())));
        }
    }

    /* JADX INFO: renamed from: o.qtk$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dKWHzl = ((InterfaceC41641que) t2).KWHzl();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dKWHzl != null ? dKWHzl.doubleValue() : 0.0d;
            java.lang.Double dKWHzl2 = ((InterfaceC41641que) t).KWHzl();
            if (dKWHzl2 != null) {
                dDoubleValue = dKWHzl2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }
}
