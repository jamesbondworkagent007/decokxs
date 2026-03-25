package o;

import com.okinc.kline.data.KlineTimeAnchorType;
import com.okinc.kline.library.data.DataSource;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oYq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36353oYq implements InterfaceC49405unt<StateListAnimator, kotlin.Pair<? extends java.lang.Integer, ? extends java.lang.Float>> {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.oYt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C36353oYq.AEQbTJ();
        }
    });

    /* JADX INFO: renamed from: o.oYq$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[KlineTimeAnchorType.values().length];
            try {
                iArr[KlineTimeAnchorType.AnchorCenter.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[KlineTimeAnchorType.AnchorLeft.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    @yCM
    public C36353oYq() {
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/Object; */
    public kotlin.Pair<java.lang.Integer, java.lang.Float> EZpvd(@NotNull StateListAnimator stateListAnimator) {
        return (kotlin.Pair) InterfaceC49405unt.Activity.EZpvd(this, stateListAnimator);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX INFO: renamed from: o.oYq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oYq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C36246oUr AEQbTJ() {
        return C36246oUr.copydefault();
    }

    private final C36246oUr copydefault() {
        return (C36246oUr) this.OLrzqt.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public kotlin.Pair<java.lang.Integer, java.lang.Float> AEQbTJ(@NotNull StateListAnimator stateListAnimator) {
        com.okinc.kline.library.data.DataSource dataSource;
        float fAEQbTJ;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        oWN own = copydefault().DCJXGO().get("ds0");
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        if (own != null && (dataSource = copydefault().sSMYrx().get("ds0")) != null) {
            DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList = dataSource.AEQbTJ;
            if (dataArrayList == null || dataArrayList.isEmpty()) {
                return C56390yDp.OLrzqt(0, fValueOf);
            }
            int iOLrzqt = OLrzqt(dataArrayList, stateListAnimator.AEQbTJ(), stateListAnimator.KWHzl());
            int i = TaskDescription.copydefault[stateListAnimator.EZpvd().ordinal()];
            if (i == 1) {
                fAEQbTJ = AEQbTJ(dataArrayList, iOLrzqt, own);
            } else if (i == 2) {
                fAEQbTJ = copydefault(dataArrayList, iOLrzqt, own);
            } else {
                fAEQbTJ = OLrzqt(dataArrayList, iOLrzqt, own);
            }
            return C56390yDp.OLrzqt(java.lang.Integer.valueOf(iOLrzqt), java.lang.Float.valueOf(fAEQbTJ));
        }
        return C56390yDp.OLrzqt(0, fValueOf);
    }

    public final float AEQbTJ(DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList, int i, oWN own) {
        if (dataArrayList.size() == 1) {
            C33566myq c33566myq = C33566myq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(copydefault().AubY(), "");
            return c33566myq.EZpvd(r6) / 2.0f;
        }
        if (i == dataArrayList.size()) {
            C33566myq c33566myq2 = C33566myq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(copydefault().AubY(), "");
            return ((-c33566myq2.EZpvd(r6)) / 2) + (own.AhwBna() / 2);
        }
        float size = dataArrayList.size() - i;
        float fAhwBna = own.AhwBna();
        C33566myq c33566myq3 = C33566myq.EZpvd;
        Intrinsics.checkNotNullExpressionValue(copydefault().AubY(), "");
        return ((size * fAhwBna) - (c33566myq3.EZpvd(r3) / 2)) - (own.AhwBna() / 2);
    }

    public final float copydefault(DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList, int i, oWN own) {
        if (dataArrayList.size() == 1) {
            return own.AhwBna();
        }
        if (i == dataArrayList.size()) {
            C33566myq c33566myq = C33566myq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(copydefault().AubY(), "");
            return ((-c33566myq.EZpvd(r5)) + (own.AhwBna() * 2)) - own.fetchVPNInfo();
        }
        float size = dataArrayList.size() - i;
        float fAhwBna = own.AhwBna();
        C33566myq c33566myq2 = C33566myq.EZpvd;
        Intrinsics.checkNotNullExpressionValue(copydefault().AubY(), "");
        float fEZpvd = ((size * fAhwBna) - c33566myq2.EZpvd(r2)) - own.fetchVPNInfo();
        return (fEZpvd >= 0.0f || copydefault().zLjUOn().isScreenChange()) ? fEZpvd : fEZpvd + own.AhwBna();
    }

    public final float OLrzqt(DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList, int i, oWN own) {
        if (dataArrayList.size() == 1) {
            return 0.0f;
        }
        if (i == dataArrayList.size()) {
            return -own.AhwBna();
        }
        return ((dataArrayList.size() - i) - 1) * own.AhwBna();
    }

    public final int OLrzqt(java.util.List<? extends DataSource.StateListAnimator> list, long j, boolean z) {
        int i = 0;
        if (j < ((DataSource.StateListAnimator) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).AhwBna()) {
            return 0;
        }
        if (j >= ((DataSource.StateListAnimator) CollectionsKt___CollectionsKt.AubY(list)).AhwBna()) {
            if (z) {
                return list.size() - 1;
            }
            return list.size();
        }
        int size = list.size() - 1;
        while (i < size) {
            int i2 = (i + size) / 2;
            long jAhwBna = list.get(i2).AhwBna();
            int i3 = i2 + 1;
            long jAhwBna2 = i3 < list.size() ? list.get(i3).AhwBna() : jAhwBna;
            if (jAhwBna <= j && j < jAhwBna2) {
                return i2;
            }
            if (j < jAhwBna) {
                size = i2;
            } else {
                i = i3;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: o.oYq$StateListAnimator */
    public static final class StateListAnimator {
        public final boolean AEQbTJ;
        public final long EZpvd;
        public final KlineTimeAnchorType OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, long j, boolean z, KlineTimeAnchorType klineTimeAnchorType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.AEQbTJ;
            }
            if ((i & 4) != 0) {
                klineTimeAnchorType = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.copydefault(j, z, klineTimeAnchorType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final KlineTimeAnchorType EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(long j, boolean z, @NotNull KlineTimeAnchorType klineTimeAnchorType) {
            Intrinsics.checkNotNullParameter(klineTimeAnchorType, "");
            return new StateListAnimator(j, z, klineTimeAnchorType);
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
            return this.EZpvd == stateListAnimator.EZpvd && this.AEQbTJ == stateListAnimator.AEQbTJ && this.OLrzqt == stateListAnimator.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Long.hashCode(this.EZpvd) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(selectTime=" + this.EZpvd + ", isJumpDirectly=" + this.AEQbTJ + ", anchorType=" + this.OLrzqt + ")";
        }

        public StateListAnimator(long j, boolean z, @NotNull KlineTimeAnchorType klineTimeAnchorType) {
            Intrinsics.checkNotNullParameter(klineTimeAnchorType, "");
            this.EZpvd = j;
            this.AEQbTJ = z;
            this.OLrzqt = klineTimeAnchorType;
        }
    }
}
