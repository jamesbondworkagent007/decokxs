package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.hardware.HardwareWalletDerivationPath;
import com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressViewModel$initTrigger$1;
import com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressViewModel$loadMore$1;
import com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressViewModel$observer$2;
import com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressViewModel$updateDerivationPath$1;
import com.okinc.business.defi.wallet.metricsmonitor.CreateOrImportType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eEX extends AbstractC33073mpa {
    public int AEQbTJ;
    public final SavedStateHandle AYXKKw;
    public final C13124czt AhwBna;
    public long EZpvd;
    public final MutableStateFlow<java.lang.Integer> KWHzl;
    public final InterfaceC15373eFy OLrzqt;
    public final MutableSharedFlow<HardwareWalletDerivationPath> copydefault;
    public eFJ djBIcL;
    public eFI gEmmrt;
    public final MutableStateFlow<ActionBar> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ActionBar> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull eFI efi) {
        Intrinsics.checkNotNullParameter(efi, "");
        this.gEmmrt = efi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull eFJ efj) {
        Intrinsics.checkNotNullParameter(efj, "");
        this.djBIcL = efj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final eFI copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final eFJ djBIcL() {
        return this.djBIcL;
    }

    public eEX(@NotNull C13124czt c13124czt, @NotNull InterfaceC15373eFy interfaceC15373eFy, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(c13124czt, "");
        Intrinsics.checkNotNullParameter(interfaceC15373eFy, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AhwBna = c13124czt;
        this.OLrzqt = interfaceC15373eFy;
        this.AYXKKw = savedStateHandle;
        java.lang.Long l = (java.lang.Long) savedStateHandle.get("generalChainId");
        this.EZpvd = l != null ? l.longValue() : -1L;
        this.copydefault = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = StateFlowKt.MutableStateFlow(0);
        this.valueOf = StateFlowKt.MutableStateFlow(new ActionBar(true, false, false, null, null, null, null, false, false, null, 1022, null));
        pUU.OLrzqt(">>>ledger CustomTokenViewModel init generalChainId:" + this.EZpvd);
        fetchVPNInfo();
        valueOf();
    }

    private final void valueOf() {
        pUU.OLrzqt(">>>ledger initTrigger");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HardwareWalletSelectAddressViewModel$initTrigger$1(this, null), 3, null);
    }

    public final void gEmmrt() {
        if (AYXKKw()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HardwareWalletSelectAddressViewModel$loadMore$1(this, null), 3, null);
        } else {
            C55326xho.toastWithFailedIcon$default(DbNXlk(C13754dXa.FragmentManager.MediaSessionCompatApi23), 0, 1, (java.lang.Object) null);
        }
    }

    public final void KWHzl(@NotNull HardwareWalletDerivationPath hardwareWalletDerivationPath) {
        Intrinsics.checkNotNullParameter(hardwareWalletDerivationPath, "");
        if (AYXKKw()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HardwareWalletSelectAddressViewModel$updateDerivationPath$1(this, hardwareWalletDerivationPath, null), 3, null);
        } else {
            C55326xho.toastWithFailedIcon$default(DbNXlk(C13754dXa.FragmentManager.MediaSessionCompatApi23), 0, 1, (java.lang.Object) null);
        }
    }

    public final boolean AYXKKw() {
        InterfaceC57036yao interfaceC57036yaoAEQbTJ = C57032yak.AEQbTJ.AEQbTJ();
        return (interfaceC57036yaoAEQbTJ != null ? interfaceC57036yaoAEQbTJ.OLrzqt() : null) != null;
    }

    public final java.util.ArrayList<HardwareWalletDerivationPath> OLrzqt() {
        return this.valueOf.getValue().copydefault();
    }

    public final HardwareWalletDerivationPath KWHzl() {
        return this.valueOf.getValue().AEQbTJ();
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AhwBna.copydefault(str, WalletType.HardwareWallet, CreateOrImportType.IMPORT_WALLET, str2);
    }

    public static final class ActionBar {
        public final HardwareWalletDerivationPath AEQbTJ;
        public final boolean AYXKKw;
        public final boolean AhwBna;
        public final java.util.List<eFJ> EZpvd;
        public final java.util.ArrayList<HardwareWalletDerivationPath> KWHzl;
        public final java.util.List<eFI> OLrzqt;
        public final java.lang.Throwable copydefault;
        public final boolean djBIcL;
        public final boolean gEmmrt;
        public final boolean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: o.eEX$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, boolean z2, boolean z3, java.util.ArrayList arrayList, HardwareWalletDerivationPath hardwareWalletDerivationPath, java.util.List list, java.lang.Throwable th, boolean z4, boolean z5, java.util.List list2, int i, java.lang.Object obj) {
            return actionBar.AEQbTJ((i & 1) != 0 ? actionBar.AYXKKw : z, (i & 2) != 0 ? actionBar.djBIcL : z2, (i & 4) != 0 ? actionBar.AhwBna : z3, (i & 8) != 0 ? actionBar.KWHzl : arrayList, (i & 16) != 0 ? actionBar.AEQbTJ : hardwareWalletDerivationPath, (i & 32) != 0 ? actionBar.OLrzqt : list, (i & 64) != 0 ? actionBar.copydefault : th, (i & 128) != 0 ? actionBar.valueOf : z4, (i & 256) != 0 ? actionBar.gEmmrt : z5, (i & 512) != 0 ? actionBar.EZpvd : list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HardwareWalletDerivationPath AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(boolean z, boolean z2, boolean z3, @NotNull java.util.ArrayList<HardwareWalletDerivationPath> arrayList, HardwareWalletDerivationPath hardwareWalletDerivationPath, @NotNull java.util.List<eFI> list, java.lang.Throwable th, boolean z4, boolean z5, @NotNull java.util.List<eFJ> list2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new ActionBar(z, z2, z3, arrayList, hardwareWalletDerivationPath, list, th, z4, z5, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<eFI> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<eFJ> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<HardwareWalletDerivationPath> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.AYXKKw == actionBar.AYXKKw && this.djBIcL == actionBar.djBIcL && this.AhwBna == actionBar.AhwBna && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && this.valueOf == actionBar.valueOf && this.gEmmrt == actionBar.gEmmrt && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.AYXKKw);
            int iHashCode2 = java.lang.Boolean.hashCode(this.djBIcL);
            int iHashCode3 = java.lang.Boolean.hashCode(this.AhwBna);
            int iHashCode4 = this.KWHzl.hashCode();
            HardwareWalletDerivationPath hardwareWalletDerivationPath = this.AEQbTJ;
            int iHashCode5 = hardwareWalletDerivationPath == null ? 0 : hardwareWalletDerivationPath.hashCode();
            int iHashCode6 = this.OLrzqt.hashCode();
            java.lang.Throwable th = this.copydefault;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (th != null ? th.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HardwareWalletSelectedAddressUiState(isLoading=" + this.AYXKKw + ", isLoadingMore=" + this.djBIcL + ", isSupportDerivation=" + this.AhwBna + ", derivationListForSelection=" + this.KWHzl + ", derivationPathSelected=" + this.AEQbTJ + ", chainAddressList=" + this.OLrzqt + ", error=" + this.copydefault + ", resetPos=" + this.valueOf + ", isSupportUTXO=" + this.gEmmrt + ", chainAddressGroup=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.djBIcL;
        }

        public ActionBar(boolean z, boolean z2, boolean z3, @NotNull java.util.ArrayList<HardwareWalletDerivationPath> arrayList, HardwareWalletDerivationPath hardwareWalletDerivationPath, @NotNull java.util.List<eFI> list, java.lang.Throwable th, boolean z4, boolean z5, @NotNull java.util.List<eFJ> list2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.AYXKKw = z;
            this.djBIcL = z2;
            this.AhwBna = z3;
            this.KWHzl = arrayList;
            this.AEQbTJ = hardwareWalletDerivationPath;
            this.OLrzqt = list;
            this.copydefault = th;
            this.valueOf = z4;
            this.gEmmrt = z5;
            this.EZpvd = list2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0064: CONSTRUCTOR 
  (r11v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0011: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0017: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:289) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r14v0 java.util.ArrayList))
  (wrap:com.okinc.business.defi.wallet.hardware.HardwareWalletDerivationPath:?: TERNARY null = ((wrap:int:0x001c: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.wallet.hardware.HardwareWalletDerivationPath) : (r15v0 com.okinc.business.defi.wallet.hardware.HardwareWalletDerivationPath))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:291) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r16v0 java.util.List))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0030: ARITH (r21v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.Throwable) : (null java.lang.Throwable))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r21v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 boolean) : false)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0046: ARITH (r21v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:296) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r20v0 java.util.List))
 A[MD:(boolean, boolean, boolean, java.util.ArrayList<com.okinc.business.defi.wallet.hardware.HardwareWalletDerivationPath>, com.okinc.business.defi.wallet.hardware.HardwareWalletDerivationPath, java.util.List<o.eFI>, java.lang.Throwable, boolean, boolean, java.util.List<o.eFJ>):void (m)] (LINE:285) call: o.eEX.ActionBar.<init>(boolean, boolean, boolean, java.util.ArrayList, com.okinc.business.defi.wallet.hardware.HardwareWalletDerivationPath, java.util.List, java.lang.Throwable, boolean, boolean, java.util.List):void type: THIS */
        public /* synthetic */ ActionBar(boolean z, boolean z2, boolean z3, java.util.ArrayList arrayList, HardwareWalletDerivationPath hardwareWalletDerivationPath, java.util.List list, java.lang.Throwable th, boolean z4, boolean z5, java.util.List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? new java.util.ArrayList() : arrayList, (i & 16) != 0 ? null : hardwareWalletDerivationPath, (i & 32) != 0 ? new java.util.ArrayList() : list, (i & 64) == 0 ? th : null, (i & 128) != 0 ? false : z4, (i & 256) == 0 ? z5 : false, (i & 512) != 0 ? new java.util.ArrayList() : list2);
        }
    }

    private final void fetchVPNInfo() {
        ActionBar value;
        MutableStateFlow<ActionBar> mutableStateFlow = this.valueOf;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ActionBar.copy$default(value, true, false, false, null, null, null, null, false, false, null, 1022, null)));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HardwareWalletSelectAddressViewModel$observer$2(this, null), 3, null);
    }
}
