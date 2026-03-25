package com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.HoldFundingFeeViewModel;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC49408unw;
import o.AbstractC49411unz;
import o.C25878jJs;
import o.C25882jJw;
import o.C25907jKu;
import o.InterfaceC49371unL;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class HoldFundingFeeViewModel extends AbstractC49411unz<TaskDescription> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final C25878jJs KWHzl;
    public final C25882jJw copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25882jJw EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25878jJs OLrzqt() {
        return this.KWHzl;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.HoldFundingFeeViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public HoldFundingFeeViewModel(@NotNull C25878jJs c25878jJs, @NotNull C25882jJw c25882jJw) {
        super(new TaskDescription(null, null, null, 7, null));
        Intrinsics.checkNotNullParameter(c25878jJs, "");
        Intrinsics.checkNotNullParameter(c25882jJw, "");
        this.KWHzl = c25878jJs;
        this.copydefault = c25882jJw;
    }

    public static final class TaskDescription extends AbstractC49408unw<TaskDescription> {
        public String AEQbTJ;
        public String EZpvd;
        public InterfaceC49371unL<? extends List<C25907jKu>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.HoldFundingFeeViewModel$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, InterfaceC49371unL interfaceC49371unL, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC49371unL = taskDescription.copydefault;
            }
            if ((i & 2) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i & 4) != 0) {
                str2 = taskDescription.AEQbTJ;
            }
            return taskDescription.copydefault(interfaceC49371unL, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull InterfaceC49371unL<? extends List<C25907jKu>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.copydefault = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends java.util.List<o.jKu>>, o.unL<java.util.List<o.jKu>> */
        public final InterfaceC49371unL<List<C25907jKu>> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull InterfaceC49371unL<? extends List<C25907jKu>> interfaceC49371unL, @NotNull String str, String str2) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(interfaceC49371unL, str, str2);
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
            return Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) taskDescription.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            String str = this.AEQbTJ;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HoldFundingFeeUiState(holdFundInfo=" + this.copydefault + ", sortType=" + this.EZpvd + ", currentAccountUid=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0008: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:30) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r2v0 o.unL))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(o.unL<? extends java.util.List<o.jKu>>, java.lang.String, java.lang.String):void (m)] (LINE:29) call: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.HoldFundingFeeViewModel.TaskDescription.<init>(o.unL, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ TaskDescription(InterfaceC49371unL interfaceC49371unL, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL, (i & 2) != 0 ? "2" : str, (i & 4) != 0 ? null : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull InterfaceC49371unL<? extends List<C25907jKu>> interfaceC49371unL, @NotNull String str, String str2) {
            super(new Function1() { // from class: o.jKy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return HoldFundingFeeViewModel.TaskDescription.copydefault((HoldFundingFeeViewModel.TaskDescription) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = interfaceC49371unL;
            this.EZpvd = str;
            this.AEQbTJ = str2;
        }

        public static final TaskDescription copydefault(TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            return copy$default(taskDescription, null, null, null, 7, null);
        }
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HoldFundingFeeViewModel$setAccountUid$1(this, str, null), 3, null);
    }

    public static /* synthetic */ void loadData$default(HoldFundingFeeViewModel holdFundingFeeViewModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "2";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        holdFundingFeeViewModel.copydefault(str, str2);
    }

    public final void copydefault(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HoldFundingFeeViewModel$loadData$1(this, str, str2, null), 3, null);
    }
}
