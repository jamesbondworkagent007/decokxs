package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C22828hmi implements InterfaceC22824hme {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final MutableLiveData<java.lang.String> AEQbTJ;
    public final MutableLiveData<java.lang.String> AYXKKw;
    public java.lang.String AhwBna;
    public MutableLiveData<DexMultiTokenInfoBean> AkhnZx;
    public C22397heb DbNXlk;
    public MutableLiveData<DexMultiTokenInfoBean> EZpvd;
    public volatile boolean KWHzl;
    public final C23314hvr<java.lang.Integer> OLrzqt;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22824hme
    public LiveData<DexMultiTokenInfoBean> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22824hme
    public LiveData<DexMultiTokenInfoBean> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22824hme
    public void KWHzl(C22397heb c22397heb) {
        this.DbNXlk = c22397heb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22824hme
    public java.lang.String OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22824hme
    public MutableLiveData<java.lang.String> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22824hme
    public C22397heb djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22824hme
    public LiveData<java.lang.String> gEmmrt() {
        return this.AYXKKw;
    }

    public C22828hmi(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
        this.EZpvd = new MutableLiveData<>();
        this.AkhnZx = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        this.OLrzqt = new C23314hvr<>();
        this.djBIcL = "";
        this.AhwBna = "";
        this.KWHzl = true;
        this.gEmmrt = "";
    }

    /* JADX INFO: renamed from: o.hmi$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hmi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC22824hme
    public DexMultiTokenInfoBean AEQbTJ() {
        return C23317hvu.EZpvd();
    }

    @Override // o.InterfaceC22824hme
    public void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z) {
        this.EZpvd.setValue(dexMultiTokenInfoBean);
        if (C22372heC.EZpvd(this.valueOf)) {
            return;
        }
        C23317hvu.copydefault(dexMultiTokenInfoBean);
    }

    @Override // o.InterfaceC22824hme
    public void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z) {
        this.AkhnZx.setValue(dexMultiTokenInfoBean);
        if (this.KWHzl && dexMultiTokenInfoBean != null) {
            copydefault(dexMultiTokenInfoBean.getUniqueId());
            this.KWHzl = false;
        }
        if (C22372heC.EZpvd(this.valueOf)) {
            return;
        }
        C23317hvu.EZpvd(dexMultiTokenInfoBean);
    }

    @Override // o.InterfaceC22824hme
    public java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return ((InterfaceC9850bdP) C43251rlk.copydefault(InterfaceC9850bdP.class)).EZpvd(str, C33129mqd.AhwBna(str2));
    }

    @Override // o.InterfaceC22824hme
    public boolean AYXKKw() {
        if (valueOf()) {
            java.lang.String str = this.AhwBna;
            DexMultiTokenInfoBean value = EZpvd().getValue();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (value != null ? value.getUniqueId() : null))) {
                return true;
            }
        }
        return false;
    }

    public boolean valueOf() {
        DexMultiTokenInfoBean value = KWHzl().getValue();
        java.lang.String chainId = value != null ? value.getChainId() : null;
        return !Intrinsics.EZpvd((java.lang.Object) chainId, (java.lang.Object) (EZpvd().getValue() != null ? r2.getChainId() : null));
    }

    @Override // o.InterfaceC22824hme
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw.setValue(str);
    }

    @Override // o.InterfaceC22824hme
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.setValue(str);
    }
}
