package o;

import com.okinc.business.defi.biz.net.bean.AddressAssetResp;
import com.okinc.business.defi.wallet.hardware.HardwareWalletDerivationPath;
import com.okinc.business.defi.wallet.hardware.HardwareWalletSelectedAddressRepoImpl$generateDerivationPath$2;
import com.okinc.business.defi.wallet.hardware.HardwareWalletSelectedAddressRepoImpl$getAddress$2;
import com.okinc.business.defi.wallet.hardware.HardwareWalletSelectedAddressRepoImpl$getAddressFromLedger$2;
import com.okinc.business.defi.wallet.hardware.HardwareWalletSelectedAddressRepoImpl$getDerivePath$2;
import com.okinc.dimodule.DispatcherProvider;
import com.okinc.wallet.core.other.DerivePath;
import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eFx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15372eFx implements InterfaceC15373eFy {
    public final C10948byA AEQbTJ;
    public final InterfaceC57036yao EZpvd;
    public final C13934dbu KWHzl;
    public final xYW OLrzqt;
    public final DispatcherProvider copydefault;

    public C15372eFx(@NotNull C10948byA c10948byA, InterfaceC57036yao interfaceC57036yao, @NotNull C13934dbu c13934dbu, @NotNull xYW xyw, @NotNull DispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(xyw, "");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "");
        this.AEQbTJ = c10948byA;
        this.EZpvd = interfaceC57036yao;
        this.KWHzl = c13934dbu;
        this.OLrzqt = xyw;
        this.copydefault = dispatcherProvider;
    }

    @Override // o.InterfaceC15373eFy
    public java.lang.Object KWHzl(long j, @NotNull Continuation<? super C10854bwM> continuation) {
        return this.AEQbTJ.copydefault(j);
    }

    @Override // o.InterfaceC15373eFy
    public java.lang.Object AEQbTJ(@NotNull C10854bwM c10854bwM, @NotNull Continuation<? super java.util.ArrayList<HardwareWalletDerivationPath>> continuation) {
        return BuildersKt.withContext(this.copydefault.AEQbTJ(), new HardwareWalletSelectedAddressRepoImpl$generateDerivationPath$2(c10854bwM, null), continuation);
    }

    @Override // o.InterfaceC15373eFy
    public java.lang.Object KWHzl(@NotNull java.util.List<DerivePath> list, C10854bwM c10854bwM, @NotNull Continuation<? super java.util.List<eFI>> continuation) {
        return BuildersKt.withContext(this.copydefault.AEQbTJ(), new HardwareWalletSelectedAddressRepoImpl$getAddressFromLedger$2(c10854bwM, this, list, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull C10854bwM c10854bwM, @NotNull java.util.List<eFI> list, @NotNull Continuation<? super java.util.List<AddressAssetResp>> continuation) {
        pUU.OLrzqt(">>>ledger getAmount thread:" + java.lang.Thread.currentThread() + " addressAndAssetInfoList:" + list.size());
        C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        C13934dbu c13934dbu = this.KWHzl;
        long jAhwBna = c10854bwM.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((eFI) it.next()).copydefault().getAddress());
        }
        C33024moe.KWHzl(C32962mnV.unwrapResponseData$default(c13934dbu.AEQbTJ(jAhwBna, arrayList), (Function1) null, 1, (java.lang.Object) null)).AEQbTJ(new InterfaceC58227yxM(new Activity(c56434yFf)) { // from class: o.eFx.StateListAnimator
            public final /* synthetic */ Function1 AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                Intrinsics.checkNotNullParameter(function1, "");
                this.AEQbTJ = function1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final /* synthetic */ void accept(java.lang.Object obj) {
                this.AEQbTJ.invoke(obj);
            }
        }, new InterfaceC58227yxM(new Application(c56434yFf)) { // from class: o.eFx.StateListAnimator
            public final /* synthetic */ Function1 AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                Intrinsics.checkNotNullParameter(function1, "");
                this.AEQbTJ = function1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final /* synthetic */ void accept(java.lang.Object obj) {
                this.AEQbTJ.invoke(obj);
            }
        });
        java.lang.Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }

    /* JADX INFO: renamed from: o.eFx$Activity */
    public static final class Activity implements Function1<java.util.List<? extends AddressAssetResp>, Unit> {
        public final /* synthetic */ Continuation<java.util.List<AddressAssetResp>> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super java.util.List<com.okinc.business.defi.biz.net.bean.AddressAssetResp>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(Continuation<? super java.util.List<AddressAssetResp>> continuation) {
            this.AEQbTJ = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.util.List<? extends AddressAssetResp> list) {
            AEQbTJ(list);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(java.util.List<AddressAssetResp> list) {
            pUU.OLrzqt(">>>ledger getAmount thread:" + java.lang.Thread.currentThread() + " size:" + list.size() + " - with:" + list);
            Continuation<java.util.List<AddressAssetResp>> continuation = this.AEQbTJ;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(list));
        }
    }

    /* JADX INFO: renamed from: o.eFx$Application */
    public static final class Application implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ Continuation<java.util.List<AddressAssetResp>> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super java.util.List<com.okinc.business.defi.biz.net.bean.AddressAssetResp>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Continuation<? super java.util.List<AddressAssetResp>> continuation) {
            this.AEQbTJ = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            OLrzqt(th);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.lang.Throwable th) {
            pUU.copydefault(">>>ledger getAmount error thread:" + java.lang.Thread.currentThread() + " with:" + th);
            Continuation<java.util.List<AddressAssetResp>> continuation = this.AEQbTJ;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(yDY.AhwBna()));
        }
    }

    public final java.lang.Object AEQbTJ(InterfaceC57036yao interfaceC57036yao, @NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, int i, boolean z, boolean z2, @NotNull Continuation<? super ActionBar> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new HardwareWalletSelectedAddressRepoImpl$getAddress$2(c10854bwM, interfaceC57036yao, str, z, z2, i, null), continuation);
    }

    @Override // o.InterfaceC15373eFy
    public java.lang.Object AEQbTJ(long j, @NotNull java.util.List<java.lang.Integer> list, int i, int i2, @NotNull Continuation<? super java.util.List<DerivePath>> continuation) {
        return BuildersKt.withContext(this.copydefault.AEQbTJ(), new HardwareWalletSelectedAddressRepoImpl$getDerivePath$2(j, list, i, i2, this, null), continuation);
    }

    /* JADX INFO: renamed from: o.eFx$ActionBar */
    public static final class ActionBar {
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final LedgerError OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, LedgerError ledgerError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.KWHzl;
            }
            if ((i & 4) != 0) {
                ledgerError = actionBar.OLrzqt;
            }
            return actionBar.AEQbTJ(str, str2, ledgerError);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, LedgerError ledgerError) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(str, str2, ledgerError);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LedgerError copydefault() {
            return this.OLrzqt;
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && this.OLrzqt == actionBar.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            LedgerError ledgerError = this.OLrzqt;
            return (((iHashCode * 31) + iHashCode2) * 31) + (ledgerError == null ? 0 : ledgerError.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LedgerAddressResult(publicKey=" + this.EZpvd + ", address=" + this.KWHzl + ", error=" + this.OLrzqt + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, LedgerError ledgerError) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.KWHzl = str2;
            this.OLrzqt = ledgerError;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (r4v0 com.okinc.wallet.hardware.api.ledger.model.LedgerError)
 A[MD:(java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.ledger.model.LedgerError):void (m)] (LINE:396) call: o.eFx.ActionBar.<init>(java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.ledger.model.LedgerError):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, java.lang.String str2, LedgerError ledgerError, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, ledgerError);
        }
    }
}
