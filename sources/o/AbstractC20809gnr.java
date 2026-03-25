package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gnr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC20809gnr extends AbstractC33073mpa {
    public InterfaceC58217yxC KWHzl;
    public TransactionInfo OLrzqt;
    public java.util.ArrayList<java.lang.Integer> valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final MutableLiveData<ActionBar> AhwBna = new MutableLiveData<>();
    public final MutableLiveData<C20863gos> EZpvd = new MutableLiveData<>();
    public java.lang.String djBIcL = "";
    public java.lang.String copydefault = "";

    public abstract void AEQbTJ(@NotNull WalletCurrencyBean walletCurrencyBean);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58217yxC AkhnZx() {
        return this.KWHzl;
    }

    public abstract java.lang.String AuCTel();

    public abstract boolean AuCTelauCTel();

    public abstract java.lang.String DbNXlk();

    public abstract void EZpvd(@NotNull LifecycleOwner lifecycleOwner, Function0<Unit> function0);

    public abstract void EZpvd(java.lang.String str);

    public abstract void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, TransactionInfo transactionInfo, @NotNull java.lang.String str6, int i, java.lang.String str7, java.lang.String str8, int i2, @NotNull java.lang.String str9, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo, java.lang.String str10, java.lang.Integer num, java.lang.Long l, java.lang.String str11, boolean z, java.util.ArrayList<java.lang.Integer> arrayList);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(InterfaceC58217yxC interfaceC58217yxC) {
        this.KWHzl = interfaceC58217yxC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.util.ArrayList<java.lang.Integer> arrayList) {
        this.valueOf = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(TransactionInfo transactionInfo) {
        this.OLrzqt = transactionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    public abstract void copydefault(boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C20863gos> ejfBZ() {
        return this.EZpvd;
    }

    public abstract java.lang.String fARcdN();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionInfo fIwbmz() {
        return this.OLrzqt;
    }

    public abstract int fetchVPNInfo();

    public abstract java.lang.Double getFieldNames();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ActionBar> getNewProxyInstance() {
        return this.AhwBna;
    }

    public abstract java.lang.String isConnected();

    public abstract boolean iwGUEr();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.Integer> uzCIH() {
        return this.valueOf;
    }

    public abstract C10854bwM valueOf();

    public abstract void valueOf(java.lang.String str);

    public abstract int values();

    /* JADX INFO: renamed from: o.gnr$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gnr.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void AEQbTJ(int i, boolean z, int i2) {
        this.AhwBna.setValue(new ActionBar(i, z, i2));
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        AhwBna();
        this.EZpvd.setValue(null);
    }

    public void AhwBna() {
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final AbstractC8664bGw<?, ?> fJNWhG() {
        C20863gos value = this.EZpvd.getValue();
        if (value != null) {
            return value.EZpvd();
        }
        return null;
    }

    public final java.lang.String gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54862xYb.convertToString$default(C54862xYb.OLrzqt(C54862xYb.OLrzqt(str, isConnected()), getFieldNames()), false, null, null, 7, null);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54862xYb.convertToString$default(C54862xYb.divB$default(C54862xYb.divB$default(str, getFieldNames(), 0, null, 6, null), isConnected(), 0, null, 6, null), false, null, null, 7, null);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        C10854bwM c10854bwMFHqPtx;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        return (abstractC8664bGwFJNWhG == null || (c10854bwMFHqPtx = abstractC8664bGwFJNWhG.fHqPtx()) == null || !c10854bwMFHqPtx.DarRvM()) ? C54880xYt.formatValuation$default(pTB.OLrzqt((java.lang.Object) str), 0, 0, null, null, null, null, false, 63, null) : "";
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54870xYj.OLrzqt(str, (249 & 1) != 0 ? 0 : 0, fetchVPNInfo(), null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gnr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initUIUpdateListener$default(AbstractC20809gnr abstractC20809gnr, LifecycleOwner lifecycleOwner, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initUIUpdateListener");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        abstractC20809gnr.EZpvd(lifecycleOwner, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r23v0, resolved type: o.gnr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initTransaction$default(AbstractC20809gnr abstractC20809gnr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, TransactionInfo transactionInfo, java.lang.String str6, int i, java.lang.String str7, java.lang.String str8, int i2, java.lang.String str9, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo, java.lang.String str10, java.lang.Integer num, java.lang.Long l, java.lang.String str11, boolean z, java.util.ArrayList arrayList, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initTransaction");
        }
        abstractC20809gnr.EZpvd(str, str2, str3, str4, str5, transactionInfo, str6, i, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? null : str8, i2, (i3 & 2048) != 0 ? "" : str9, txToastCheckBizAndPayloadInfo, str10, (i3 & 16384) != 0 ? null : num, (32768 & i3) != 0 ? null : l, (65536 & i3) != 0 ? null : str11, (131072 & i3) != 0 ? false : z, (i3 & 262144) != 0 ? null : arrayList);
    }

    /* JADX INFO: renamed from: o.gnr$ActionBar */
    public static final class ActionBar {
        public final int EZpvd;
        public final boolean OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, boolean z, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = actionBar.copydefault;
            }
            if ((i3 & 2) != 0) {
                z = actionBar.OLrzqt;
            }
            if ((i3 & 4) != 0) {
                i2 = actionBar.EZpvd;
            }
            return actionBar.copydefault(i, z, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(int i, boolean z, int i2) {
            return new ActionBar(i, z, i2);
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
            return this.copydefault == actionBar.copydefault && this.OLrzqt == actionBar.OLrzqt && this.EZpvd == actionBar.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.copydefault) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UIUpdateData(updateType=" + this.copydefault + ", isLoading=" + this.OLrzqt + ", feeChangeType=" + this.EZpvd + ")";
        }

        public ActionBar(int i, boolean z, int i2) {
            this.copydefault = i;
            this.OLrzqt = z;
            this.EZpvd = i2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o.bCW] */
    public final boolean hDKMBd() {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        return abstractC8664bGwFJNWhG != null && abstractC8664bGwFJNWhG.QKudOq().djBIcL() == abstractC8664bGwFJNWhG.fHqPtx().AhwBna();
    }

    public final boolean AEQbTJ() {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG;
        C8497bDo c8497bDoUlJrfe;
        C8497bDo c8497bDoUlJrfe2;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG2 = fJNWhG();
        return (abstractC8664bGwFJNWhG2 == null || (c8497bDoUlJrfe2 = abstractC8664bGwFJNWhG2.UlJrfe()) == null || !c8497bDoUlJrfe2.AEQbTJ(C56524yIo.AEQbTJ(C9784bcC.class))) && ((abstractC8664bGwFJNWhG = fJNWhG()) == null || (c8497bDoUlJrfe = abstractC8664bGwFJNWhG.UlJrfe()) == null || !c8497bDoUlJrfe.AEQbTJ(C56524yIo.AEQbTJ(C9826bcs.class)));
    }

    public final boolean EZpvd() {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG;
        C8497bDo c8497bDoUlJrfe;
        C8497bDo c8497bDoUlJrfe2;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG2 = fJNWhG();
        return (abstractC8664bGwFJNWhG2 == null || (c8497bDoUlJrfe2 = abstractC8664bGwFJNWhG2.UlJrfe()) == null || !c8497bDoUlJrfe2.AEQbTJ(C56524yIo.AEQbTJ(C9808bca.class))) && ((abstractC8664bGwFJNWhG = fJNWhG()) == null || (c8497bDoUlJrfe = abstractC8664bGwFJNWhG.UlJrfe()) == null || !c8497bDoUlJrfe.AEQbTJ(C56524yIo.AEQbTJ(C9828bcu.class)));
    }

    public final boolean OLrzqt() {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG;
        C8497bDo c8497bDoUlJrfe;
        C8497bDo c8497bDoUlJrfe2;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG2 = fJNWhG();
        return (abstractC8664bGwFJNWhG2 == null || (c8497bDoUlJrfe2 = abstractC8664bGwFJNWhG2.UlJrfe()) == null || !c8497bDoUlJrfe2.AEQbTJ(C56524yIo.AEQbTJ(C9754bbZ.class))) && ((abstractC8664bGwFJNWhG = fJNWhG()) == null || (c8497bDoUlJrfe = abstractC8664bGwFJNWhG.UlJrfe()) == null || !c8497bDoUlJrfe.AEQbTJ(C56524yIo.AEQbTJ(C9829bcv.class)));
    }

    public final boolean copydefault() {
        C8497bDo c8497bDoUlJrfe;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        return !((abstractC8664bGwFJNWhG == null || (c8497bDoUlJrfe = abstractC8664bGwFJNWhG.UlJrfe()) == null) ? false : c8497bDoUlJrfe.AEQbTJ(C56524yIo.AEQbTJ(C9811bcd.class)));
    }

    public final boolean gEmmrt() {
        C8497bDo c8497bDoUlJrfe;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        return !((abstractC8664bGwFJNWhG == null || (c8497bDoUlJrfe = abstractC8664bGwFJNWhG.UlJrfe()) == null) ? false : c8497bDoUlJrfe.AEQbTJ(C56524yIo.AEQbTJ(C9879bds.class)));
    }

    public final boolean AYXKKw() {
        C8497bDo c8497bDoUlJrfe;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        return !((abstractC8664bGwFJNWhG == null || (c8497bDoUlJrfe = abstractC8664bGwFJNWhG.UlJrfe()) == null) ? false : c8497bDoUlJrfe.AEQbTJ(C56524yIo.AEQbTJ(C9878bdr.class)));
    }

    public final boolean KWHzl() {
        C8497bDo c8497bDoUlJrfe;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        return !((abstractC8664bGwFJNWhG == null || (c8497bDoUlJrfe = abstractC8664bGwFJNWhG.UlJrfe()) == null) ? false : c8497bDoUlJrfe.AEQbTJ(C56524yIo.AEQbTJ(C9867bdg.class)));
    }

    public final boolean zsXlph() {
        return C43453rpa.AEQbTJ.KWHzl(C9678baC.Companion.AEQbTJ());
    }
}
