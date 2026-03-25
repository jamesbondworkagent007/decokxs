package com.okinc.business.defi.wallet.tee.activate.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.activate.model.ViewDataChanged;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC12782ctV;
import o.AbstractC17786fSf;
import o.AbstractC49408unw;
import o.AbstractC49411unz;
import o.C12827cuN;
import o.C17833fTz;
import o.InterfaceC49371unL;
import o.fTB;
import o.fTS;
import o.fVJ;
import o.yCM;
import o.yDY;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivateSAViewModel extends AbstractC49411unz<Application> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final fTS AEQbTJ;
    public final C12827cuN AhwBna;
    public final fTB EZpvd;
    public final C17833fTz KWHzl;
    public final StateFlow<ActivateTeeGuideModel> OLrzqt;
    public final SavedStateHandle djBIcL;
    public final fVJ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ActivateTeeGuideModel> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public ActivateSAViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull fTB ftb, @NotNull C12827cuN c12827cuN, @NotNull fVJ fvj, @NotNull fTS fts, @NotNull C17833fTz c17833fTz) {
        super(new Application(null, null, 0, false, null, null, 63, null));
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(ftb, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(fvj, "");
        Intrinsics.checkNotNullParameter(fts, "");
        Intrinsics.checkNotNullParameter(c17833fTz, "");
        this.djBIcL = savedStateHandle;
        this.EZpvd = ftb;
        this.AhwBna = c12827cuN;
        this.valueOf = fvj;
        this.AEQbTJ = fts;
        this.KWHzl = c17833fTz;
        this.OLrzqt = savedStateHandle.getStateFlow("tee_account_info", new ActivateTeeGuideModel("", false, false, (String) null, 0, 0, 0, "", WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null));
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final class Application extends AbstractC49408unw<Application> {
        public boolean AEQbTJ;
        public InterfaceC49371unL<ViewDataChanged> EZpvd;
        public InterfaceC49371unL<? extends AbstractC17786fSf> KWHzl;
        public int OLrzqt;
        public List<Integer> copydefault;
        public String djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, null, 0, false, null, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, int i, boolean z, List list, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                interfaceC49371unL = application.EZpvd;
            }
            if ((i2 & 2) != 0) {
                interfaceC49371unL2 = application.KWHzl;
            }
            InterfaceC49371unL interfaceC49371unL3 = interfaceC49371unL2;
            if ((i2 & 4) != 0) {
                i = application.OLrzqt;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                z = application.AEQbTJ;
            }
            boolean z2 = z;
            if ((i2 & 16) != 0) {
                list = application.copydefault;
            }
            List list2 = list;
            if ((i2 & 32) != 0) {
                str = application.djBIcL;
            }
            return application.copydefault(interfaceC49371unL, interfaceC49371unL3, i3, z2, list2, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Integer> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(int i) {
            this.OLrzqt = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull List<Integer> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull InterfaceC49371unL<? extends AbstractC17786fSf> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.KWHzl = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends o.fSf>, o.unL<o.fSf> */
        public final InterfaceC49371unL<AbstractC17786fSf> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull InterfaceC49371unL<ViewDataChanged> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.EZpvd = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<ViewDataChanged> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull InterfaceC49371unL<ViewDataChanged> interfaceC49371unL, @NotNull InterfaceC49371unL<? extends AbstractC17786fSf> interfaceC49371unL2, int i, boolean z, @NotNull List<Integer> list, @NotNull String str) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(interfaceC49371unL, interfaceC49371unL2, i, z, list, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && this.OLrzqt == application.OLrzqt && this.AEQbTJ == application.AEQbTJ && Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) application.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + Integer.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UiState(uiStateVariant=" + this.EZpvd + ", activateTeeStateVariant=" + this.KWHzl + ", selectedExpireTime=" + this.OLrzqt + ", autoRenew=" + this.AEQbTJ + ", expirePeriodDayList=" + this.copydefault + ", walletName=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004e: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0008: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:59) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r5v0 o.unL))
  (wrap:o.unL:0x0014: TERNARY null = ((wrap:int:0x000b: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0011: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:60) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r6v0 o.unL))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (15 int) : (r7v0 int))
  (wrap:boolean:0x0023: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.util.List:0x003f: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x003b: INVOKE 
  (wrap:java.lang.Integer[]:0x0037: FILLED_NEW_ARRAY (7 int), (15 int), (30 int) A[WRAPPED] (LINE:63) elemType: java.lang.Integer)
 STATIC call: o.yDY.gEmmrt(java.lang.Object[]):java.util.List A[MD:<T>:(T[]):java.util.List<T> VARARG (m), VARARG_CALL, WRAPPED] (LINE:63)) : (r9v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
 A[MD:(o.unL<com.okinc.business.defi.wallet.tee.activate.model.ViewDataChanged>, o.unL<? extends o.fSf>, int, boolean, java.util.List<java.lang.Integer>, java.lang.String):void (m)] (LINE:58) call: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel.Application.<init>(o.unL, o.unL, int, boolean, java.util.List, java.lang.String):void type: THIS */
        public /* synthetic */ Application(InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, int i, boolean z, List list, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL, (i2 & 2) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL2, (i2 & 4) != 0 ? 15 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? yDY.gEmmrt(7, 15, 30) : list, (i2 & 32) != 0 ? "" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull InterfaceC49371unL<ViewDataChanged> interfaceC49371unL, @NotNull InterfaceC49371unL<? extends AbstractC17786fSf> interfaceC49371unL2, int i, boolean z, @NotNull List<Integer> list, @NotNull String str) {
            super(new Function1() { // from class: o.fTI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivateSAViewModel.Application.copydefault((ActivateSAViewModel.Application) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = interfaceC49371unL;
            this.KWHzl = interfaceC49371unL2;
            this.OLrzqt = i;
            this.AEQbTJ = z;
            this.copydefault = list;
            this.djBIcL = str;
        }

        public static final Application copydefault(Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            return copy$default(application, null, null, 0, false, null, null, 63, null);
        }
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ActivateSAViewModel$updateSelectedAnotherAccount$1(this, str, null), 3, null);
    }

    public final void KWHzl(boolean z) {
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ActivateSAViewModel$loadData$1(this, z, null), 3, null), "loadData");
    }

    public final void AEQbTJ(int i, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ActivateSAViewModel$updateExpirePeriodDay$1(this, i, z, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull ActivateTeeModel activateTeeModel, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(activateTeeModel, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ActivateSAViewModel$activateTee$1(this, abstractC12782ctV, activateTeeModel, str, null), 3, null), "activateTee");
    }
}
