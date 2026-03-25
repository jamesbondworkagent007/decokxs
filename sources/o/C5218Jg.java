package o;

import com.appsflyer.AdRevenueScheme;
import com.engagelab.privates.push.constants.MTPushConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5218Jg {
    public java.util.Set<java.lang.String> copydefault = new java.util.HashSet();
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final java.lang.String AEQbTJ = C5218Jg.class.getName();
    public static final java.lang.String[] EZpvd = {"city", AdRevenueScheme.COUNTRY, "dma", "ip_address", "lat_lng", "region"};
    public static final java.lang.String[] OLrzqt = {"adid", "city", "ip_address", "lat_lng"};

    public final boolean AEQbTJ() {
        return AEQbTJ("adid");
    }

    public final boolean KWHzl() {
        return AEQbTJ("app_set_id");
    }

    public final boolean copydefault() {
        return AEQbTJ("carrier");
    }

    public final boolean EZpvd() {
        return AEQbTJ(AdRevenueScheme.COUNTRY);
    }

    public final boolean AhwBna() {
        return AEQbTJ("device_brand");
    }

    public final boolean djBIcL() {
        return AEQbTJ("device_manufacturer");
    }

    public final boolean AYXKKw() {
        return AEQbTJ("device_model");
    }

    public final boolean valueOf() {
        return AEQbTJ("ip_address");
    }

    public final boolean gEmmrt() {
        return AEQbTJ("language");
    }

    public final boolean DbNXlk() {
        return AEQbTJ("lat_lng");
    }

    public final boolean fetchVPNInfo() {
        return AEQbTJ("os_name");
    }

    public final boolean AkhnZx() {
        return AEQbTJ("os_version");
    }

    public final boolean values() {
        return AEQbTJ(MTPushConstants.PlatformNode.KEY_PLATFORM);
    }

    public final boolean isConnected() {
        return AEQbTJ("version_name");
    }

    public final void OLrzqt(java.lang.String str) {
        this.copydefault.add(str);
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return !this.copydefault.contains(str);
    }

    public final C5218Jg copydefault(@NotNull C5218Jg c5218Jg) {
        Intrinsics.checkNotNullParameter(c5218Jg, "");
        java.util.Iterator<java.lang.String> it = c5218Jg.copydefault.iterator();
        while (it.hasNext()) {
            OLrzqt(it.next());
        }
        return this;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.EZpvd(C5218Jg.class, obj.getClass())) {
            return Intrinsics.EZpvd(((C5218Jg) obj).copydefault, this.copydefault);
        }
        return false;
    }

    /* JADX INFO: renamed from: o.Jg$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Jg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C5218Jg EZpvd() {
            C5218Jg c5218Jg = new C5218Jg();
            for (java.lang.String str : C5218Jg.OLrzqt) {
                c5218Jg.OLrzqt(str);
            }
            return c5218Jg;
        }
    }
}
