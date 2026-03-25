package com.okinc.im.imui.contacts.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C35861oGk;
import o.C35864oGn;
import o.C37721ozF;
import o.C44157sFk;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class EditRelationViewModel extends ViewModel {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final MutableStateFlow<StateListAnimator> AEQbTJ;
    public final SavedStateHandle AYXKKw;
    public final String AhwBna;
    public final MutableSharedFlow<TaskDescription> EZpvd;
    public final SharedFlow<TaskDescription> KWHzl;
    public final C35864oGn copydefault;
    public final String djBIcL;
    public final StateFlow<StateListAnimator> gEmmrt;
    public final C35861oGk valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StateListAnimator> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<TaskDescription> copydefault() {
        return this.KWHzl;
    }

    @yCM
    public EditRelationViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C35864oGn c35864oGn, @NotNull C35861oGk c35861oGk) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c35864oGn, "");
        Intrinsics.checkNotNullParameter(c35861oGk, "");
        this.AYXKKw = savedStateHandle;
        this.copydefault = c35864oGn;
        this.valueOf = c35861oGk;
        this.djBIcL = (String) savedStateHandle.get("ARG_RELATION_ID");
        this.AhwBna = (String) savedStateHandle.get("ARG_GROUP_ID");
        MutableStateFlow<StateListAnimator> MutableStateFlow = StateFlowKt.MutableStateFlow(new StateListAnimator("", "", "", false, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        this.AEQbTJ = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<TaskDescription> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.EZpvd = mutableSharedFlowAEQbTJ;
        this.KWHzl = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.contacts.viewmodel.EditRelationViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final int KWHzl() {
        return C44157sFk.AEQbTJ() ? 50 : 20;
    }

    public final void OLrzqt() {
        String str = this.djBIcL;
        if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EditRelationViewModel$loadInitialData$1(this, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EditRelationViewModel$loadInitialData$2(this, null), 3, null);
        }
    }

    public final void valueOf() {
        StateListAnimator value = this.AEQbTJ.getValue();
        String str = this.djBIcL;
        if (str != null && value.KWHzl()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EditRelationViewModel$onSaveClicked$1(this, str, value, null), 3, null);
        }
    }

    public static final class StateListAnimator {
        public final String AEQbTJ;
        public final boolean EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final boolean copydefault;
        public final String gEmmrt;
        public final String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, null, null, false, false, null, null, 127, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.valueOf;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = stateListAnimator.AEQbTJ;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                z = stateListAnimator.copydefault;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = stateListAnimator.EZpvd;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                str4 = stateListAnimator.gEmmrt;
            }
            String str8 = str4;
            if ((i & 64) != 0) {
                str5 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.EZpvd(str, str6, str7, z3, z4, str8, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new StateListAnimator(str, str2, str3, z, z2, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((Object) this.valueOf, (Object) stateListAnimator.valueOf) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) stateListAnimator.AEQbTJ) && this.copydefault == stateListAnimator.copydefault && this.EZpvd == stateListAnimator.EZpvd && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) stateListAnimator.gEmmrt) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.valueOf.hashCode();
            int iHashCode3 = this.AEQbTJ.hashCode();
            int iHashCode4 = Boolean.hashCode(this.copydefault);
            int iHashCode5 = Boolean.hashCode(this.EZpvd);
            String str = this.gEmmrt;
            int iHashCode6 = str == null ? 0 : str.hashCode();
            String str2 = this.OLrzqt;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EditRelationUiState(alias=" + this.KWHzl + ", originalAlias=" + this.valueOf + ", nickName=" + this.AEQbTJ + ", isLoading=" + this.copydefault + ", isSaveEnabled=" + this.EZpvd + ", successMessage=" + this.gEmmrt + ", errorMessage=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.KWHzl = str;
            this.valueOf = str2;
            this.AEQbTJ = str3;
            this.copydefault = z;
            this.EZpvd = z2;
            this.gEmmrt = str4;
            this.OLrzqt = str5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String):void (m)] (LINE:151) call: com.okinc.im.imui.contacts.viewmodel.EditRelationViewModel.StateListAnimator.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.contacts.viewmodel.EditRelationViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Application extends TaskDescription {
            public static final Application EZpvd = new Application();

            private Application() {
                super(null);
            }
        }

        private TaskDescription() {
        }

        public static final class ActionBar extends TaskDescription {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.copydefault;
                }
                return actionBar.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ActionBar(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((ActionBar) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SaveError(message=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.contacts.viewmodel.EditRelationViewModel$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0403TaskDescription extends TaskDescription {
            public final String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0403TaskDescription copy$default(C0403TaskDescription c0403TaskDescription, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0403TaskDescription.EZpvd;
                }
                return c0403TaskDescription.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0403TaskDescription OLrzqt(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0403TaskDescription(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0403TaskDescription) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((C0403TaskDescription) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "LoadError(message=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0403TaskDescription(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }
    }

    public final void OLrzqt(@NotNull String str) {
        StateListAnimator value;
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<StateListAnimator> mutableStateFlow = this.AEQbTJ;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, StateListAnimator.copy$default(value, str, null, null, false, !Intrinsics.EZpvd((Object) StringsKt__StringsKt.hDKMBd((CharSequence) str).toString(), (Object) StringsKt__StringsKt.hDKMBd((CharSequence) r2.AEQbTJ()).toString()), null, null, WalletImportError.ERROR_CODE_AA_CREATE_KEY, null)));
    }

    public final void AEQbTJ() {
        StateListAnimator value;
        MutableStateFlow<StateListAnimator> mutableStateFlow = this.AEQbTJ;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, StateListAnimator.copy$default(value, null, null, null, false, false, null, null, 31, null)));
    }
}
