package o;

import androidx.camera.video.AudioStats;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.SwapInstrument;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC41638qub;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41476qrY extends AbstractC49400uno<Quartet<? extends CategoryGroupVo, ? extends SortBy, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41638qub>>, java.util.List<? extends InterfaceC41638qub>> {
    private static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final C41577qtT<InterfaceC41638qub> copydefault;

    /* JADX INFO: renamed from: o.qrY$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;
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
            KWHzl = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((Quartet<CategoryGroupVo, ? extends SortBy, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41638qub>>) obj, (Continuation<? super java.util.List<? extends InterfaceC41638qub>>) continuation);
    }

    @yCM
    public C41476qrY(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41577qtT<InterfaceC41638qub> c41577qtT) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41577qtT, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = c41577qtT;
    }

    /* JADX INFO: renamed from: o.qrY$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qrY.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.Object KWHzl(@NotNull Quartet<CategoryGroupVo, ? extends SortBy, ? extends SortOrder, ? extends java.util.List<? extends InterfaceC41638qub>> quartet, @NotNull Continuation<? super java.util.List<? extends InterfaceC41638qub>> continuation) {
        CategoryGroupVo categoryGroupVoComponent1 = quartet.component1();
        SortBy sortByComponent2 = quartet.component2();
        SortOrder sortOrderComponent3 = quartet.component3();
        java.util.List<? extends InterfaceC41638qub> listComponent4 = quartet.component4();
        C41434qqj.KWHzl.AEQbTJ("SortFuturesVosUseCase", "sort futures vos, sortBy=" + sortByComponent2 + ", sortOrder=" + sortOrderComponent3 + ", voListSize=" + listComponent4.size());
        if (listComponent4.isEmpty()) {
            return listComponent4;
        }
        java.lang.String str = sortByComponent2 + "_" + sortOrderComponent3;
        if (categoryGroupVoComponent1.fetchVPNInfo() && (sortByComponent2 == SortBy.NONE || sortOrderComponent3 == SortOrder.NONE)) {
            java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new AssistContent());
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            java.util.Iterator it = listEZpvd.iterator();
            while (it.hasNext()) {
                arrayList.add(InterfaceC41638qub.ActionBar.onCopy$default((InterfaceC41638qub) it.next(), null, null, null, null, null, str, null, 95, null));
            }
            return arrayList;
        }
        switch (Application.EZpvd[sortByComponent2.ordinal()]) {
            case 1:
                int i = Application.KWHzl[sortOrderComponent3.ordinal()];
                if (i == 1) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new StateListAnimator());
                } else if (i == 2) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new TaskDescription());
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                break;
            case 2:
                int i2 = Application.KWHzl[sortOrderComponent3.ordinal()];
                if (i2 == 1) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new LoaderManager());
                } else if (i2 == 2) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new PendingIntent());
                } else if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                break;
            case 3:
                int i3 = Application.KWHzl[sortOrderComponent3.ordinal()];
                if (i3 == 1) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new FragmentManager());
                } else if (i3 == 2) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new Dialog());
                } else if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                break;
            case 4:
                int i4 = Application.KWHzl[sortOrderComponent3.ordinal()];
                if (i4 == 1) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new Fragment());
                } else if (i4 == 2) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new SharedElementCallback());
                } else if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                break;
            case 5:
                int i5 = Application.KWHzl[sortOrderComponent3.ordinal()];
                if (i5 == 1) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new VoiceInteractor());
                } else if (i5 == 2) {
                    listComponent4 = CollectionsKt___CollectionsKt.EZpvd(listComponent4, new ActionBar());
                } else if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                break;
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        java.util.List<InterfaceC41638qub> listOLrzqt = OLrzqt(listComponent4);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it2 = listOLrzqt.iterator();
        while (it2.hasNext()) {
            arrayList2.add(InterfaceC41638qub.ActionBar.onCopy$default((InterfaceC41638qub) it2.next(), null, null, null, null, null, str, null, 95, null));
        }
        return arrayList2;
    }

    public static final CountDownInfo AEQbTJ(InterfaceC41638qub interfaceC41638qub) {
        Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
        return interfaceC41638qub.values().getCountDownInfo();
    }

    private final java.util.List<InterfaceC41638qub> OLrzqt(java.util.List<? extends InterfaceC41638qub> list) {
        return (java.util.List) this.copydefault.copydefault(C56390yDp.OLrzqt(list, new Function1() { // from class: o.qsh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41476qrY.AEQbTJ((InterfaceC41638qub) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o.qrY$Fragment */
    public static final class Fragment<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dAhwBna = ((InterfaceC41638qub) t).AhwBna();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dAhwBna != null ? dAhwBna.doubleValue() : 0.0d;
            java.lang.Double dAhwBna2 = ((InterfaceC41638qub) t2).AhwBna();
            if (dAhwBna2 != null) {
                dDoubleValue = dAhwBna2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    /* JADX INFO: renamed from: o.qrY$FragmentManager */
    public static final class FragmentManager<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalFARcdN = ((InterfaceC41638qub) t).fARcdN();
            if (bigDecimalFARcdN == null) {
                bigDecimalFARcdN = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalFARcdN2 = ((InterfaceC41638qub) t2).fARcdN();
            if (bigDecimalFARcdN2 == null) {
                bigDecimalFARcdN2 = BigDecimal.ZERO;
            }
            return yET.KWHzl(bigDecimalFARcdN, bigDecimalFARcdN2);
        }
    }

    /* JADX INFO: renamed from: o.qrY$LoaderManager */
    public static final class LoaderManager<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalAuCTel = ((InterfaceC41638qub) t).AuCTel();
            if (bigDecimalAuCTel == null) {
                bigDecimalAuCTel = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalAuCTel2 = ((InterfaceC41638qub) t2).AuCTel();
            if (bigDecimalAuCTel2 == null) {
                bigDecimalAuCTel2 = BigDecimal.ZERO;
            }
            return yET.KWHzl(bigDecimalAuCTel, bigDecimalAuCTel2);
        }
    }

    /* JADX INFO: renamed from: o.qrY$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((InterfaceC41638qub) t).djBIcL(), ((InterfaceC41638qub) t2).djBIcL());
        }
    }

    /* JADX INFO: renamed from: o.qrY$VoiceInteractor */
    public static final class VoiceInteractor<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dKWHzl = ((InterfaceC41638qub) t).KWHzl();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dKWHzl != null ? dKWHzl.doubleValue() : 0.0d;
            java.lang.Double dKWHzl2 = ((InterfaceC41638qub) t2).KWHzl();
            if (dKWHzl2 != null) {
                dDoubleValue = dKWHzl2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    /* JADX INFO: renamed from: o.qrY$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dKWHzl = ((InterfaceC41638qub) t2).KWHzl();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dKWHzl != null ? dKWHzl.doubleValue() : 0.0d;
            java.lang.Double dKWHzl2 = ((InterfaceC41638qub) t).KWHzl();
            if (dKWHzl2 != null) {
                dDoubleValue = dKWHzl2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    /* JADX INFO: renamed from: o.qrY$AssistContent */
    public static final class AssistContent<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BizInstrument bizInstrumentValues = ((InterfaceC41638qub) t2).values();
            SwapInstrument swapInstrument = bizInstrumentValues instanceof SwapInstrument ? (SwapInstrument) bizInstrumentValues : null;
            long jValueOf = C33129mqd.valueOf(swapInstrument != null ? swapInstrument.getListTime() : null);
            BizInstrument bizInstrumentValues2 = ((InterfaceC41638qub) t).values();
            SwapInstrument swapInstrument2 = bizInstrumentValues2 instanceof SwapInstrument ? (SwapInstrument) bizInstrumentValues2 : null;
            return yET.KWHzl(java.lang.Long.valueOf(jValueOf), java.lang.Long.valueOf(C33129mqd.valueOf(swapInstrument2 != null ? swapInstrument2.getListTime() : null)));
        }
    }

    /* JADX INFO: renamed from: o.qrY$Dialog */
    public static final class Dialog<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalFARcdN = ((InterfaceC41638qub) t2).fARcdN();
            if (bigDecimalFARcdN == null) {
                bigDecimalFARcdN = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalFARcdN2 = ((InterfaceC41638qub) t).fARcdN();
            if (bigDecimalFARcdN2 == null) {
                bigDecimalFARcdN2 = BigDecimal.ZERO;
            }
            return yET.KWHzl(bigDecimalFARcdN, bigDecimalFARcdN2);
        }
    }

    /* JADX INFO: renamed from: o.qrY$PendingIntent */
    public static final class PendingIntent<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalAuCTel = ((InterfaceC41638qub) t2).AuCTel();
            if (bigDecimalAuCTel == null) {
                bigDecimalAuCTel = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalAuCTel2 = ((InterfaceC41638qub) t).AuCTel();
            if (bigDecimalAuCTel2 == null) {
                bigDecimalAuCTel2 = BigDecimal.ZERO;
            }
            return yET.KWHzl(bigDecimalAuCTel, bigDecimalAuCTel2);
        }
    }

    /* JADX INFO: renamed from: o.qrY$SharedElementCallback */
    public static final class SharedElementCallback<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Double dAhwBna = ((InterfaceC41638qub) t2).AhwBna();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dAhwBna != null ? dAhwBna.doubleValue() : 0.0d;
            java.lang.Double dAhwBna2 = ((InterfaceC41638qub) t).AhwBna();
            if (dAhwBna2 != null) {
                dDoubleValue = dAhwBna2.doubleValue();
            }
            return yET.KWHzl(java.lang.Double.valueOf(dDoubleValue2), java.lang.Double.valueOf(dDoubleValue));
        }
    }

    /* JADX INFO: renamed from: o.qrY$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((InterfaceC41638qub) t2).djBIcL(), ((InterfaceC41638qub) t).djBIcL());
        }
    }
}
