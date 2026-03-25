package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.tx.OkTransactionPreparationResult;
import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12623cqV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gna, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20792gna extends AbstractC33073mpa {
    public TransactionInfo EZpvd;
    public InterfaceC58217yxC copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final MutableLiveData<Triple<java.lang.Integer, java.lang.Boolean, java.lang.Integer>> valueOf = new MutableLiveData<>();
    public final MutableLiveData<OkTransactionPreparationResult> AhwBna = new MutableLiveData<>();
    public boolean KWHzl = true;
    public java.lang.String AYXKKw = "";
    public java.lang.String OLrzqt = "";
    public java.lang.String gEmmrt = "0";
    public final C12623cqV.Activity djBIcL = new Activity();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58217yxC AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(TransactionInfo transactionInfo) {
        this.EZpvd = transactionInfo;
    }

    public abstract void AEQbTJ(java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionInfo AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Triple<java.lang.Integer, java.lang.Boolean, java.lang.Integer>> AkhnZx() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str) {
        if (str == null) {
            str = "0";
        }
        this.gEmmrt = str;
    }

    public abstract void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, TransactionInfo transactionInfo, @NotNull java.lang.String str6, @NotNull TransactionType transactionType, java.lang.String str7, java.lang.String str8, int i, @NotNull java.lang.String str9, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo, java.lang.String str10, java.lang.String str11, java.lang.String str12);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(InterfaceC58217yxC interfaceC58217yxC) {
        this.copydefault = interfaceC58217yxC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    public abstract java.lang.String djBIcL();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<OkTransactionPreparationResult> valueOf() {
        return this.AhwBna;
    }

    /* JADX INFO: renamed from: o.gna$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gna.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.gna$Activity */
    public static final class Activity extends C12623cqV.Activity {
        public Activity() {
        }

        @Override // o.C12623cqV.Activity
        public void OLrzqt() {
            if (AbstractC20792gna.this.fetchVPNInfo()) {
                AbstractC20792gna abstractC20792gna = AbstractC20792gna.this;
                C12623cqV c12623cqVEZpvd = abstractC20792gna.EZpvd();
                abstractC20792gna.KWHzl(c12623cqVEZpvd != null ? c12623cqVEZpvd.KWHzl(AbstractC20792gna.this.djBIcL()) : null);
            } else {
                AbstractC12609cqH abstractC12609cqHGEmmrt = AbstractC20792gna.this.gEmmrt();
                if (abstractC12609cqHGEmmrt != null && abstractC12609cqHGEmmrt.wlaJM()) {
                    AbstractC20792gna abstractC20792gna2 = AbstractC20792gna.this;
                    C12623cqV c12623cqVEZpvd2 = abstractC20792gna2.EZpvd();
                    abstractC20792gna2.KWHzl(c12623cqVEZpvd2 != null ? c12623cqVEZpvd2.KWHzl(AbstractC20792gna.this.djBIcL()) : null);
                } else {
                    AbstractC20792gna abstractC20792gna3 = AbstractC20792gna.this;
                    C12623cqV c12623cqVEZpvd3 = abstractC20792gna3.EZpvd();
                    abstractC20792gna3.AEQbTJ(c12623cqVEZpvd3 != null ? c12623cqVEZpvd3.OLrzqt(AbstractC20792gna.this.AYXKKw()) : null);
                }
            }
            AbstractC20792gna.this.KWHzl(1, false, 0);
        }
    }

    public final void KWHzl(int i, boolean z, int i2) {
        this.valueOf.setValue(new Triple<>(java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i2)));
    }

    public void isConnected() {
        C12623cqV c12623cqVEZpvd = EZpvd();
        if (c12623cqVEZpvd != null) {
            c12623cqVEZpvd.AhwBna();
        }
        C12623cqV c12623cqVEZpvd2 = EZpvd();
        if (c12623cqVEZpvd2 != null) {
            c12623cqVEZpvd2.KWHzl(this.djBIcL);
        }
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        copydefault();
        this.AhwBna.setValue(null);
    }

    public void copydefault() {
        C12623cqV c12623cqVEZpvd = EZpvd();
        if (c12623cqVEZpvd != null) {
            c12623cqVEZpvd.gEmmrt();
        }
        C12623cqV c12623cqVEZpvd2 = EZpvd();
        if (c12623cqVEZpvd2 != null) {
            c12623cqVEZpvd2.copydefault(this.djBIcL);
        }
        InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final AbstractC12609cqH gEmmrt() {
        OkTransactionPreparationResult value = this.AhwBna.getValue();
        if (value != null) {
            return value.getMTransaction();
        }
        return null;
    }

    public final C12623cqV EZpvd() {
        OkTransactionPreparationResult value = this.AhwBna.getValue();
        if (value != null) {
            return value.getCalculator();
        }
        return null;
    }

    public final int OLrzqt() {
        C12623cqV c12623cqVEZpvd = EZpvd();
        if (c12623cqVEZpvd != null) {
            return c12623cqVEZpvd.OLrzqt();
        }
        return 0;
    }

    public final int KWHzl() {
        C12623cqV c12623cqVEZpvd = EZpvd();
        if (c12623cqVEZpvd != null) {
            return c12623cqVEZpvd.KWHzl();
        }
        return 0;
    }

    public final boolean values() {
        C12623cqV c12623cqVEZpvd = EZpvd();
        return c12623cqVEZpvd != null && c12623cqVEZpvd.AYXKKw();
    }

    public static /* synthetic */ void initTransaction$default(AbstractC20792gna abstractC20792gna, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, TransactionInfo transactionInfo, java.lang.String str6, TransactionType transactionType, java.lang.String str7, java.lang.String str8, int i, java.lang.String str9, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo, java.lang.String str10, java.lang.String str11, java.lang.String str12, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initTransaction");
        }
        abstractC20792gna.KWHzl(str, str2, str3, str4, str5, transactionInfo, str6, transactionType, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? null : str8, i, (i2 & 2048) != 0 ? "" : str9, txToastCheckBizAndPayloadInfo, str10, (i2 & 16384) != 0 ? null : str11, (i2 & 32768) != 0 ? null : str12);
    }
}
