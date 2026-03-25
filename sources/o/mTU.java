package o;

import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mTU {
    public static final mTU OLrzqt = new mTU();

    private mTU() {
    }

    public static /* synthetic */ java.lang.String getTokenPrice$default(mTU mtu, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return mtu.OLrzqt(str, z);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0 || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
            return "--";
        }
        java.lang.String strOLrzqt = mRJ.AEQbTJ.OLrzqt(str, (252 & 1) != 0 ? false : false, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
        if (z) {
            return strOLrzqt;
        }
        return "≈" + strOLrzqt;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return mRJ.AEQbTJ.OLrzqt(str, (252 & 1) != 0 ? false : false, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return mRJ.AEQbTJ.OLrzqt(str, (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return mRJ.AEQbTJ.OLrzqt(str, (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0 || C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            return "--";
        }
        return mRJ.AEQbTJ.OLrzqt(str, (252 & 1) != 0 ? false : false, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return "--";
        }
        return mRJ.AEQbTJ.OLrzqt(str, (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
    }
}
