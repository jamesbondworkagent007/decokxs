package o;

import androidx.camera.video.AudioStats;
import com.immomo.mls.fun.constants.SafeAreaConstants;
import com.immomo.mls.fun.globals.UDLuaView;
import com.immomo.mls.fun.ud.UDSafeAreaRect;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.akQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7467akQ implements SafeAreaConstants {
    public android.content.Context AEQbTJ;
    public int EZpvd = 0;
    public InterfaceC7552alw KWHzl = C7323ahf.DbNXlk();
    public int[] OLrzqt = new int[4];
    public UDSafeAreaRect copydefault;

    public C7467akQ(android.content.Context context) {
        this.AEQbTJ = context;
    }

    public void copydefault(UDLuaView uDLuaView) {
        EZpvd(this.EZpvd, uDLuaView);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    public void EZpvd(int i, UDLuaView uDLuaView) {
        int iValueOf;
        if (uDLuaView == null) {
            return;
        }
        this.EZpvd = i;
        boolean z = this.copydefault != null;
        boolean zKWHzl = this.KWHzl.KWHzl(this.AEQbTJ);
        this.OLrzqt[0] = uDLuaView.sSMYrx();
        this.OLrzqt[1] = uDLuaView.OcIXYQ();
        this.OLrzqt[2] = uDLuaView.AxsJAY();
        this.OLrzqt[3] = uDLuaView.AwvSrB();
        if ((i & 1) == 1) {
            int[] iArr = this.OLrzqt;
            iArr[0] = z ? iArr[0] + this.copydefault.EZpvd().left : iArr[0];
        }
        if ((i & 2) == 2) {
            int[] iArr2 = this.OLrzqt;
            if (zKWHzl) {
                iValueOf = iArr2[1] + (z ? this.copydefault.EZpvd().top : C7857arj.valueOf(this.AEQbTJ));
            } else {
                iValueOf = iArr2[1];
            }
            iArr2[1] = iValueOf;
        }
        if ((i & 4) == 4) {
            int[] iArr3 = this.OLrzqt;
            iArr3[2] = z ? iArr3[2] + this.copydefault.EZpvd().right : iArr3[2];
        }
        if ((i & 8) == 8) {
            int[] iArr4 = this.OLrzqt;
            iArr4[3] = z ? iArr4[3] + this.copydefault.EZpvd().bottom : iArr4[3];
        }
        C7392aiv c7392aiv = (C7392aiv) uDLuaView.f_();
        int[] iArr5 = this.OLrzqt;
        c7392aiv.setPaddingRelative(iArr5[0], iArr5[1], iArr5[2], iArr5[3]);
    }

    public LuaValue[] KWHzl() {
        double dValueOf;
        if (this.KWHzl.KWHzl(this.AEQbTJ)) {
            UDSafeAreaRect uDSafeAreaRect = this.copydefault;
            dValueOf = uDSafeAreaRect != null ? uDSafeAreaRect.EZpvd().top : C7857arj.valueOf(this.AEQbTJ);
        } else {
            dValueOf = AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        return LuaValue.rNumber(dValueOf);
    }

    public LuaValue[] AEQbTJ() {
        return LuaValue.rNumber(this.copydefault != null ? r0.EZpvd().bottom : AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    public LuaValue[] EZpvd() {
        return LuaValue.rNumber(this.copydefault != null ? r0.EZpvd().left : AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    public LuaValue[] copydefault() {
        return LuaValue.rNumber(this.copydefault != null ? r0.EZpvd().right : AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    public void KWHzl(UDSafeAreaRect uDSafeAreaRect, UDLuaView uDLuaView) {
        this.copydefault = uDSafeAreaRect;
        copydefault(uDLuaView);
    }
}
