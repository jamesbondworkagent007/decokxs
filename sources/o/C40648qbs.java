package o;

import android.view.View;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qbs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40648qbs extends AbstractC40515qYs<StateListAnimator, C42797rdG> {
    public DexPeriodEnum EZpvd;

    /* JADX INFO: renamed from: o.qbs$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DexPeriodEnum.values().length];
            try {
                iArr[DexPeriodEnum.FIVE_MINUTES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DexPeriodEnum.ONE_HOUR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DexPeriodEnum.FOUR_HOURS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[DexPeriodEnum.HOUR_24.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[DexPeriodEnum.ONE_DAY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexPeriodEnum KWHzl() {
        return this.EZpvd;
    }

    public C40648qbs(@NotNull DexPeriodEnum dexPeriodEnum) {
        Intrinsics.checkNotNullParameter(dexPeriodEnum, "");
        this.EZpvd = dexPeriodEnum;
        java.util.List<DexPeriodEnum> listEZpvd = DexPeriodEnum.Companion.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (DexPeriodEnum dexPeriodEnum2 : listEZpvd) {
            arrayList.add(new StateListAnimator(dexPeriodEnum2, this.EZpvd == dexPeriodEnum2));
        }
        submitList(arrayList);
    }

    /* JADX INFO: renamed from: o.qbs$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC40516qYt {
        public final boolean EZpvd;
        public final DexPeriodEnum OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, DexPeriodEnum dexPeriodEnum, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dexPeriodEnum = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.EZpvd;
            }
            return stateListAnimator.OLrzqt(dexPeriodEnum, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DexPeriodEnum EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull DexPeriodEnum dexPeriodEnum, boolean z) {
            Intrinsics.checkNotNullParameter(dexPeriodEnum, "");
            return new StateListAnimator(dexPeriodEnum, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.OLrzqt == stateListAnimator.OLrzqt && this.EZpvd == stateListAnimator.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SelectablePeriodVo(vo=" + this.OLrzqt + ", isSelected=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull DexPeriodEnum dexPeriodEnum, boolean z) {
            Intrinsics.checkNotNullParameter(dexPeriodEnum, "");
            this.OLrzqt = dexPeriodEnum;
            this.EZpvd = z;
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof StateListAnimator) && this.OLrzqt == ((StateListAnimator) interfaceC40516qYt).OLrzqt;
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return Intrinsics.EZpvd(this, interfaceC40516qYt);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42797rdG AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42797rdG c42797rdGCopydefault = C42797rdG.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42797rdGCopydefault, "");
        return c42797rdGCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C42797rdG c42797rdG, int i, @NotNull final StateListAnimator stateListAnimator) {
        int i2;
        Intrinsics.checkNotNullParameter(c42797rdG, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        int i3 = TaskDescription.KWHzl[stateListAnimator.EZpvd().ordinal()];
        if (i3 == 1) {
            i2 = qZH.PendingIntent.fGQ;
        } else if (i3 == 2) {
            i2 = qZH.PendingIntent.zzQwtT;
        } else if (i3 == 3) {
            i2 = qZH.PendingIntent.gwwfep;
        } else if (i3 == 4) {
            i2 = qZH.PendingIntent.gtdfxv;
        } else {
            if (i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = qZH.PendingIntent.iCPUKe;
        }
        c42797rdG.EZpvd.setText(i2);
        c42797rdG.EZpvd.setSelected(stateListAnimator.copydefault());
        c42797rdG.EZpvd.setEnabled(true);
        c42797rdG.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.qbr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C40648qbs.KWHzl(this.EZpvd, stateListAnimator, view);
            }
        });
    }

    public static final void KWHzl(C40648qbs c40648qbs, StateListAnimator stateListAnimator, android.view.View view) {
        c40648qbs.EZpvd = stateListAnimator.EZpvd();
        java.util.List<StateListAnimator> listOLrzqt = c40648qbs.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (StateListAnimator stateListAnimator2 : listOLrzqt) {
            arrayList.add(StateListAnimator.copy$default(stateListAnimator2, null, c40648qbs.EZpvd == stateListAnimator2.EZpvd(), 1, null));
        }
        c40648qbs.submitList(arrayList);
    }
}
