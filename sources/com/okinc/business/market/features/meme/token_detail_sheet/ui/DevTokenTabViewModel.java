package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C28727kgI;
import o.InterfaceC28796khY;
import o.InterfaceC28856kif;
import o.jNT;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class DevTokenTabViewModel extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final C28727kgI AYXKKw;
    public final StateFlow<InterfaceC28796khY> AhwBna;
    public final MutableStateFlow<InterfaceC28856kif> EZpvd;
    public final MutableStateFlow<InterfaceC28796khY> OLrzqt;
    public final jNT copydefault;
    public Activity djBIcL;
    public final StateFlow<InterfaceC28856kif> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28856kif> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28796khY> OLrzqt() {
        return this.AhwBna;
    }

    @yCM
    public DevTokenTabViewModel(@NotNull jNT jnt, @NotNull C28727kgI c28727kgI, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(jnt, "");
        Intrinsics.checkNotNullParameter(c28727kgI, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = jnt;
        this.AYXKKw = c28727kgI;
        this.AEQbTJ = coroutineDispatcher;
        MutableStateFlow<InterfaceC28856kif> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC28856kif.Application.AEQbTJ);
        this.EZpvd = MutableStateFlow;
        this.gEmmrt = MutableStateFlow;
        MutableStateFlow<InterfaceC28796khY> MutableStateFlow2 = StateFlowKt.MutableStateFlow(InterfaceC28796khY.Activity.OLrzqt);
        this.OLrzqt = MutableStateFlow2;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow2);
        this.djBIcL = new Activity(0, 0, false, 0, null, null, 63, null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.token_detail_sheet.ui.DevTokenTabViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static /* synthetic */ void loadData$default(DevTokenTabViewModel devTokenTabViewModel, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            str3 = "";
        }
        String str4 = str3;
        if ((i3 & 8) != 0) {
            i = 1;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = 10;
        }
        devTokenTabViewModel.OLrzqt(str, str2, str4, i4, i2);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (this.djBIcL.valueOf()) {
            return;
        }
        this.djBIcL.AEQbTJ(str, str2);
        this.EZpvd.setValue(InterfaceC28856kif.Application.AEQbTJ);
        this.djBIcL.OLrzqt(true);
        KWHzl(str, str2, i, i2, true);
        if (str3.length() > 0) {
            KWHzl(str, str2, str3);
        }
    }

    private final void KWHzl(String str, String str2, String str3) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DevTokenTabViewModel$fetchHolderInfo$1(this, str, str2, str3, null), 3, null);
    }

    public final void copydefault() {
        if (this.djBIcL.AEQbTJ()) {
            this.djBIcL.OLrzqt(true);
            KWHzl(this.djBIcL.EZpvd(), this.djBIcL.OLrzqt(), this.djBIcL.KWHzl() + 1, this.djBIcL.copydefault(), false);
        }
    }

    private final void KWHzl(String str, String str2, int i, int i2, boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DevTokenTabViewModel$fetchData$1(this, str, str2, i, i2, z, null), 3, null);
    }

    public final boolean EZpvd() {
        return this.djBIcL.AEQbTJ();
    }

    public static final class Activity {
        public String AEQbTJ;
        public int AhwBna;
        public int EZpvd;
        public String KWHzl;
        public final int OLrzqt;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(0, 0, false, 0, null, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, int i2, boolean z, int i3, String str, String str2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = activity.EZpvd;
            }
            if ((i4 & 2) != 0) {
                i2 = activity.AhwBna;
            }
            int i5 = i2;
            if ((i4 & 4) != 0) {
                z = activity.copydefault;
            }
            boolean z2 = z;
            if ((i4 & 8) != 0) {
                i3 = activity.OLrzqt;
            }
            int i6 = i3;
            if ((i4 & 16) != 0) {
                str = activity.AEQbTJ;
            }
            String str3 = str;
            if ((i4 & 32) != 0) {
                str2 = activity.KWHzl;
            }
            return activity.KWHzl(i, i5, z2, i6, str3, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.EZpvd = 1;
            this.AhwBna = 1;
            this.copydefault = false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.EZpvd < this.AhwBna && !this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(int i, int i2, boolean z, int i3, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(i, i2, z, i3, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.copydefault = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(int i, int i2) {
            this.EZpvd = i;
            this.AhwBna = i2;
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
            return this.EZpvd == activity.EZpvd && this.AhwBna == activity.AhwBna && this.copydefault == activity.copydefault && this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) activity.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((Integer.hashCode(this.EZpvd) * 31) + Integer.hashCode(this.AhwBna)) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.OLrzqt)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PaginationState(currentPage=" + this.EZpvd + ", totalPages=" + this.AhwBna + ", isLoadingMore=" + this.copydefault + ", pageSize=" + this.OLrzqt + ", chainId=" + this.AEQbTJ + ", tokenContractAddress=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.copydefault;
        }

        public Activity(int i, int i2, boolean z, int i3, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = i;
            this.AhwBna = i2;
            this.copydefault = z;
            this.OLrzqt = i3;
            this.AEQbTJ = str;
            this.KWHzl = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r5v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r6v0 int) : (1 int))
  (wrap:boolean:0x0013: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:int:0x001a: TERNARY null = ((wrap:int:0x0014: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r8v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
 A[MD:(int, int, boolean, int, java.lang.String, java.lang.String):void (m)] (LINE:168) call: com.okinc.business.market.features.meme.token_detail_sheet.ui.DevTokenTabViewModel.Activity.<init>(int, int, boolean, int, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Activity(int i, int i2, boolean z, int i3, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 1 : i, (i4 & 2) == 0 ? i2 : 1, (i4 & 4) != 0 ? false : z, (i4 & 8) != 0 ? 10 : i3, (i4 & 16) != 0 ? "" : str, (i4 & 32) != 0 ? "" : str2);
        }
    }
}
