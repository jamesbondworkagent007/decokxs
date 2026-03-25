package o;

import android.location.Location;
import androidx.exifinterface.media.ExifInterface;
import com.amplitude.core.platform.Plugin;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class JE implements com.amplitude.core.platform.Plugin {
    public static final Application Companion = new Application(null);
    public static final java.util.Set<java.lang.String> OLrzqt = yEE.AhwBna("", "9774d56d682e549c", "unknown", "000000000000000", "Android", "DEFACE", "00000000-0000-0000-0000-000000000000");
    public JY EZpvd;
    public final Plugin.Type KWHzl = Plugin.Type.Before;
    public JZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public void AEQbTJ(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        this.copydefault = jz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public Plugin.Type EZpvd() {
        return this.KWHzl;
    }

    public JZ OLrzqt() {
        JZ jz = this.copydefault;
        if (jz != null) {
            return jz;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // com.amplitude.core.platform.Plugin
    public void KWHzl(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        super.KWHzl(jz);
        C5244Kg c5244KgDjBIcL = jz.djBIcL();
        Intrinsics.copydefault(c5244KgDjBIcL, "");
        C5216Je c5216Je = (C5216Je) c5244KgDjBIcL;
        this.EZpvd = new JY(c5216Je.copydefault(), c5216Je.fJNWhG(), c5216Je.AwvSrB().AEQbTJ());
        EZpvd(c5216Je);
    }

    @Override // com.amplitude.core.platform.Plugin
    public C5242Ke EZpvd(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        AEQbTJ(c5242Ke);
        return c5242Ke;
    }

    public final void EZpvd(@NotNull C5216Je c5216Je) {
        Intrinsics.checkNotNullParameter(c5216Je, "");
        java.lang.String strOLrzqt = c5216Je.OLrzqt();
        if (strOLrzqt != null) {
            copydefault(strOLrzqt);
            return;
        }
        java.lang.String strKWHzl = OLrzqt().ejfBZ().KWHzl();
        JY jy = null;
        if (strKWHzl == null || !Companion.KWHzl(strKWHzl) || C59449zhJ.endsWith$default(strKWHzl, ExifInterface.LATITUDE_SOUTH, false, 2, null)) {
            if (!c5216Je.getFieldNames() && c5216Je.AxsJAY()) {
                JY jy2 = this.EZpvd;
                if (jy2 == null) {
                    Intrinsics.gEmmrt("");
                    jy2 = null;
                }
                if (!jy2.AuCTel()) {
                    JY jy3 = this.EZpvd;
                    if (jy3 == null) {
                        Intrinsics.gEmmrt("");
                        jy3 = null;
                    }
                    java.lang.String strEZpvd = jy3.EZpvd();
                    if (strEZpvd != null && Companion.KWHzl(strEZpvd)) {
                        copydefault(strEZpvd);
                        return;
                    }
                }
            }
            if (c5216Je.gHZMYf()) {
                JY jy4 = this.EZpvd;
                if (jy4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    jy = jy4;
                }
                java.lang.String strAEQbTJ = jy.AEQbTJ();
                if (strAEQbTJ != null && Companion.KWHzl(strAEQbTJ)) {
                    copydefault(strAEQbTJ + 'S');
                    return;
                }
            }
            copydefault(JY.Companion.EZpvd() + 'R');
        }
    }

    public final void AEQbTJ(C5242Ke c5242Ke) {
        C5246Ki c5246KiValues;
        C5253Kp c5253KpUzCIH;
        java.lang.String newProxyInstance;
        C5244Kg c5244KgDjBIcL = OLrzqt().djBIcL();
        Intrinsics.copydefault(c5244KgDjBIcL, "");
        C5216Je c5216Je = (C5216Je) c5244KgDjBIcL;
        if (c5242Ke.RJOkX() == null) {
            c5242Ke.copydefault(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            Unit unit = Unit.INSTANCE;
        }
        if (c5242Ke.AubY() == null) {
            c5242Ke.fIwbmz(UUID.randomUUID().toString());
            Unit unit2 = Unit.INSTANCE;
        }
        if (c5242Ke.wlaJM() == null) {
            c5242Ke.AuCTel("amplitude-analytics-android/1.20.2");
            Unit unit3 = Unit.INSTANCE;
        }
        if (c5242Ke.RcXXUw() == null) {
            c5242Ke.wlaJM(OLrzqt().ejfBZ().copydefault());
            Unit unit4 = Unit.INSTANCE;
        }
        if (c5242Ke.ejfBZ() == null) {
            c5242Ke.values(OLrzqt().ejfBZ().KWHzl());
            Unit unit5 = Unit.INSTANCE;
        }
        C5218Jg c5218JgAwvSrB = c5216Je.AwvSrB();
        if (c5216Je.EZpvd()) {
            c5218JgAwvSrB.copydefault(C5218Jg.Companion.EZpvd());
        }
        JY jy = null;
        if (c5218JgAwvSrB.isConnected()) {
            JY jy2 = this.EZpvd;
            if (jy2 == null) {
                Intrinsics.gEmmrt("");
                jy2 = null;
            }
            c5242Ke.AuCTelauCTel(jy2.fetchVPNInfo());
        }
        if (c5218JgAwvSrB.fetchVPNInfo()) {
            JY jy3 = this.EZpvd;
            if (jy3 == null) {
                Intrinsics.gEmmrt("");
                jy3 = null;
            }
            c5242Ke.uzCIH(jy3.values());
        }
        if (c5218JgAwvSrB.AkhnZx()) {
            JY jy4 = this.EZpvd;
            if (jy4 == null) {
                Intrinsics.gEmmrt("");
                jy4 = null;
            }
            c5242Ke.hDKMBd(jy4.AkhnZx());
        }
        if (c5218JgAwvSrB.AhwBna()) {
            JY jy5 = this.EZpvd;
            if (jy5 == null) {
                Intrinsics.gEmmrt("");
                jy5 = null;
            }
            c5242Ke.djBIcL(jy5.copydefault());
        }
        if (c5218JgAwvSrB.djBIcL()) {
            JY jy6 = this.EZpvd;
            if (jy6 == null) {
                Intrinsics.gEmmrt("");
                jy6 = null;
            }
            c5242Ke.isConnected(jy6.djBIcL());
        }
        if (c5218JgAwvSrB.AYXKKw()) {
            JY jy7 = this.EZpvd;
            if (jy7 == null) {
                Intrinsics.gEmmrt("");
                jy7 = null;
            }
            c5242Ke.fetchVPNInfo(jy7.valueOf());
        }
        if (c5218JgAwvSrB.copydefault()) {
            JY jy8 = this.EZpvd;
            if (jy8 == null) {
                Intrinsics.gEmmrt("");
                jy8 = null;
            }
            c5242Ke.AhwBna(jy8.KWHzl());
        }
        if (c5218JgAwvSrB.valueOf() && c5242Ke.AuCTelauCTel() == null) {
            c5242Ke.ejfBZ("$remote");
            Unit unit6 = Unit.INSTANCE;
        }
        if (c5218JgAwvSrB.EZpvd() && c5242Ke.AuCTelauCTel() != "$remote") {
            JY jy9 = this.EZpvd;
            if (jy9 == null) {
                Intrinsics.gEmmrt("");
                jy9 = null;
            }
            c5242Ke.gEmmrt(jy9.AYXKKw());
        }
        if (c5218JgAwvSrB.gEmmrt()) {
            JY jy10 = this.EZpvd;
            if (jy10 == null) {
                Intrinsics.gEmmrt("");
                jy10 = null;
            }
            c5242Ke.fJNWhG(jy10.AhwBna());
        }
        if (c5218JgAwvSrB.values()) {
            c5242Ke.iwGUEr("Android");
        }
        if (c5218JgAwvSrB.DbNXlk()) {
            JY jy11 = this.EZpvd;
            if (jy11 == null) {
                Intrinsics.gEmmrt("");
                jy11 = null;
            }
            Location locationIsConnected = jy11.isConnected();
            if (locationIsConnected != null) {
                c5242Ke.OLrzqt(java.lang.Double.valueOf(locationIsConnected.getLatitude()));
                c5242Ke.AEQbTJ(java.lang.Double.valueOf(locationIsConnected.getLongitude()));
            }
        }
        if (c5218JgAwvSrB.AEQbTJ()) {
            JY jy12 = this.EZpvd;
            if (jy12 == null) {
                Intrinsics.gEmmrt("");
                jy12 = null;
            }
            java.lang.String strEZpvd = jy12.EZpvd();
            if (strEZpvd != null) {
                c5242Ke.copydefault(strEZpvd);
            }
        }
        if (c5218JgAwvSrB.KWHzl()) {
            JY jy13 = this.EZpvd;
            if (jy13 == null) {
                Intrinsics.gEmmrt("");
            } else {
                jy = jy13;
            }
            java.lang.String strAEQbTJ = jy.AEQbTJ();
            if (strAEQbTJ != null) {
                c5242Ke.AEQbTJ(strAEQbTJ);
            }
        }
        if (c5242Ke.AxsJAY() == null && (newProxyInstance = OLrzqt().djBIcL().getNewProxyInstance()) != null) {
            c5242Ke.getFieldNames(newProxyInstance);
            Unit unit7 = Unit.INSTANCE;
        }
        if (c5242Ke.ORxRYg() == null && (c5253KpUzCIH = OLrzqt().djBIcL().uzCIH()) != null) {
            c5242Ke.copydefault(c5253KpUzCIH.AEQbTJ());
            Unit unit8 = Unit.INSTANCE;
        }
        if (c5242Ke.zsXlph() != null || (c5246KiValues = OLrzqt().djBIcL().values()) == null) {
            return;
        }
        c5242Ke.copydefault(c5246KiValues.copydefault());
        Unit unit9 = Unit.INSTANCE;
    }

    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt().OLrzqt(str);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.JE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final boolean KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return (str.length() == 0 || JE.OLrzqt.contains(str)) ? false : true;
        }
    }
}
