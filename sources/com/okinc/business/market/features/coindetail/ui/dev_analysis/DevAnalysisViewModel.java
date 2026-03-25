package com.okinc.business.market.features.coindetail.ui.dev_analysis;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.jNT;
import o.jOU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DevAnalysisViewModel extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final MutableStateFlow<jOU> AEQbTJ;
    public final StateFlow<jOU> AYXKKw;
    public final jNT EZpvd;
    public final CoroutineDispatcher KWHzl;
    public StateListAnimator copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<jOU> KWHzl() {
        return this.AYXKKw;
    }

    @yCM
    public DevAnalysisViewModel(@NotNull jNT jnt, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(jnt, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = jnt;
        this.KWHzl = coroutineDispatcher;
        MutableStateFlow<jOU> MutableStateFlow = StateFlowKt.MutableStateFlow(jOU.Application.AEQbTJ);
        this.AEQbTJ = MutableStateFlow;
        this.AYXKKw = MutableStateFlow;
        this.copydefault = new StateListAnimator(0, 0, false, 0, null, null, 63, null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.coindetail.ui.dev_analysis.DevAnalysisViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static /* synthetic */ void loadData$default(DevAnalysisViewModel devAnalysisViewModel, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 1;
        }
        if ((i3 & 8) != 0) {
            i2 = 10;
        }
        devAnalysisViewModel.KWHzl(str, str2, i, i2);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.copydefault.gEmmrt()) {
            return;
        }
        this.copydefault.KWHzl(str, str2);
        this.AEQbTJ.setValue(jOU.Application.AEQbTJ);
        this.copydefault.OLrzqt(true);
        copydefault(str, str2, i, i2, true);
    }

    public final void AEQbTJ() {
        if (this.copydefault.OLrzqt()) {
            this.copydefault.OLrzqt(true);
            copydefault(this.copydefault.KWHzl(), this.copydefault.EZpvd(), this.copydefault.AEQbTJ() + 1, this.copydefault.copydefault(), false);
        }
    }

    public final void copydefault(String str, String str2, int i, int i2, boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.KWHzl, null, new DevAnalysisViewModel$fetchData$1(this, str, str2, i, i2, z, null), 2, null);
    }

    public final boolean OLrzqt() {
        return this.copydefault.OLrzqt();
    }

    public static final class StateListAnimator {
        public boolean AEQbTJ;
        public String EZpvd;
        public int KWHzl;
        public String OLrzqt;
        public final int copydefault;
        public int gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(0, 0, false, 0, null, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, int i2, boolean z, int i3, String str, String str2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = stateListAnimator.KWHzl;
            }
            if ((i4 & 2) != 0) {
                i2 = stateListAnimator.gEmmrt;
            }
            int i5 = i2;
            if ((i4 & 4) != 0) {
                z = stateListAnimator.AEQbTJ;
            }
            boolean z2 = z;
            if ((i4 & 8) != 0) {
                i3 = stateListAnimator.copydefault;
            }
            int i6 = i3;
            if ((i4 & 16) != 0) {
                str = stateListAnimator.EZpvd;
            }
            String str3 = str;
            if ((i4 & 32) != 0) {
                str2 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.OLrzqt(i, i5, z2, i6, str3, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
            this.KWHzl = 1;
            this.gEmmrt = 1;
            this.AEQbTJ = false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(int i, int i2, boolean z, int i3, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(i, i2, z, i3, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(int i, int i2) {
            this.KWHzl = i;
            this.gEmmrt = i2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.KWHzl < this.gEmmrt && !this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.KWHzl == stateListAnimator.KWHzl && this.gEmmrt == stateListAnimator.gEmmrt && this.AEQbTJ == stateListAnimator.AEQbTJ && this.copydefault == stateListAnimator.copydefault && Intrinsics.EZpvd((Object) this.EZpvd, (Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((Integer.hashCode(this.KWHzl) * 31) + Integer.hashCode(this.gEmmrt)) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Integer.hashCode(this.copydefault)) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PaginationState(currentPage=" + this.KWHzl + ", totalPages=" + this.gEmmrt + ", isLoadingMore=" + this.AEQbTJ + ", pageSize=" + this.copydefault + ", chainId=" + this.EZpvd + ", tokenContractAddress=" + this.OLrzqt + ")";
        }

        public StateListAnimator(int i, int i2, boolean z, int i3, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = i;
            this.gEmmrt = i2;
            this.AEQbTJ = z;
            this.copydefault = i3;
            this.EZpvd = str;
            this.OLrzqt = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r5v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r6v0 int) : (1 int))
  (wrap:boolean:0x0013: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:int:0x001a: TERNARY null = ((wrap:int:0x0014: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r8v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
 A[MD:(int, int, boolean, int, java.lang.String, java.lang.String):void (m)] (LINE:124) call: com.okinc.business.market.features.coindetail.ui.dev_analysis.DevAnalysisViewModel.StateListAnimator.<init>(int, int, boolean, int, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(int i, int i2, boolean z, int i3, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 1 : i, (i4 & 2) == 0 ? i2 : 1, (i4 & 4) != 0 ? false : z, (i4 & 8) != 0 ? 10 : i3, (i4 & 16) != 0 ? "" : str, (i4 & 32) != 0 ? "" : str2);
        }
    }
}
