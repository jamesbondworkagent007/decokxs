package o;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.okinc.modular.deeplinkv2.LinkSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.meU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC32484meU {
    public static final Activity Companion = Activity.AEQbTJ;

    java.lang.String AEQbTJ();

    java.lang.String AYXKKw();

    InterfaceC44099sDh AhwBna();

    java.util.Map<java.lang.String, java.lang.Integer> AkhnZx();

    boolean AuCTel();

    int DbNXlk();

    java.lang.String EZpvd();

    void EZpvd(@NotNull android.content.Context context, @NotNull Glide glide, @NotNull Registry registry);

    boolean KWHzl();

    boolean OLrzqt();

    void copydefault(@NotNull AppCompatActivity appCompatActivity, @NotNull java.lang.String str, @NotNull LinkSource linkSource);

    boolean copydefault();

    java.lang.String djBIcL();

    java.lang.String ejfBZ();

    boolean fARcdN();

    java.lang.String fIwbmz();

    boolean fJNWhG();

    boolean fetchVPNInfo();

    boolean gEmmrt();

    boolean isConnected();

    void iwGUEr();

    void uzCIH();

    boolean valueOf();

    boolean values();

    /* JADX INFO: renamed from: o.meU$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity AEQbTJ = new Activity();
        public static InterfaceC32484meU OLrzqt;

        private Activity() {
        }

        public final void OLrzqt(@NotNull InterfaceC32484meU interfaceC32484meU) {
            Intrinsics.checkNotNullParameter(interfaceC32484meU, "");
            if (OLrzqt != null) {
                throw new java.lang.IllegalStateException("AppConfig instance is already initialized");
            }
            OLrzqt = interfaceC32484meU;
        }

        public final InterfaceC32484meU KWHzl() {
            InterfaceC32484meU interfaceC32484meU = OLrzqt;
            if (interfaceC32484meU != null) {
                return interfaceC32484meU;
            }
            throw new java.lang.IllegalStateException("AppConfig instance is not initialized");
        }
    }
}
