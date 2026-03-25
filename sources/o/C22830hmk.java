package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C22830hmk implements InterfaceC22824hme {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public C22397heb AkhnZx;
    public MutableLiveData<DexMultiTokenInfoBean> copydefault = new MutableLiveData<>();
    public MutableLiveData<DexMultiTokenInfoBean> fetchVPNInfo = new MutableLiveData<>();
    public final MutableLiveData<java.lang.String> valueOf = new MutableLiveData<>();
    public final C23314hvr<java.lang.Integer> EZpvd = new C23314hvr<>();
    public java.lang.String gEmmrt = "";
    public java.lang.String AhwBna = "";
    public final MutableLiveData<java.lang.String> AEQbTJ = new MutableLiveData<>();
    public java.lang.String djBIcL = "";
    public Triple<java.lang.Integer, DexMultiTokenInfoBean, DexMultiTokenInfoBean> OLrzqt = new Triple<>(-1, null, null);
    public C25293itw AYXKKw = new C25293itw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25293itw AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22824hme
    public LiveData<DexMultiTokenInfoBean> EZpvd() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22824hme
    public LiveData<DexMultiTokenInfoBean> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22824hme
    public void KWHzl(C22397heb c22397heb) {
        this.AkhnZx = c22397heb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22824hme
    public java.lang.String OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22824hme
    public MutableLiveData<java.lang.String> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22824hme
    public C22397heb djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22824hme
    public LiveData<java.lang.String> gEmmrt() {
        return this.valueOf;
    }

    /* JADX INFO: renamed from: o.hmk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hmk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC22824hme
    public DexMultiTokenInfoBean AEQbTJ() {
        return C23317hvu.KWHzl();
    }

    public DexMultiTokenInfoBean valueOf() {
        return C23317hvu.fIwbmz();
    }

    @Override // o.InterfaceC22824hme
    public void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z) {
        this.copydefault.setValue(dexMultiTokenInfoBean);
        C23317hvu.djBIcL(dexMultiTokenInfoBean);
    }

    @Override // o.InterfaceC22824hme
    public void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z) {
        this.fetchVPNInfo.setValue(dexMultiTokenInfoBean);
        C23317hvu.AhwBna(dexMultiTokenInfoBean);
    }

    @Override // o.InterfaceC22824hme
    public java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return ((InterfaceC9850bdP) C43251rlk.copydefault(InterfaceC9850bdP.class)).EZpvd(str, C33129mqd.AhwBna(str2));
    }

    @Override // o.InterfaceC22824hme
    public boolean AYXKKw() {
        if (values()) {
            java.lang.String str = this.AhwBna;
            DexMultiTokenInfoBean value = EZpvd().getValue();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (value != null ? value.getUniqueId() : null))) {
                return true;
            }
        }
        return false;
    }

    public boolean values() {
        DexMultiTokenInfoBean value = KWHzl().getValue();
        java.lang.String chainId = value != null ? value.getChainId() : null;
        return !Intrinsics.EZpvd((java.lang.Object) chainId, (java.lang.Object) (EZpvd().getValue() != null ? r2.getChainId() : null));
    }

    @Override // o.InterfaceC22824hme
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.setValue(str);
    }

    @Override // o.InterfaceC22824hme
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.setValue(str);
    }
}
