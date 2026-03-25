package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uLx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48287uLx {
    public final java.util.List<java.util.List<InterfaceC48286uLw>> KWHzl = new java.util.ArrayList();
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.util.List<InterfaceC48286uLw>> copydefault() {
        return this.KWHzl;
    }

    public final C48284uLu AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C48284uLu(str).EZpvd(str2);
    }

    public static /* synthetic */ InterfaceC48286uLw toMetricItem$default(C48287uLx c48287uLx, java.lang.Object obj, boolean z, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c48287uLx.EZpvd(obj, z);
    }

    public final InterfaceC48286uLw EZpvd(java.lang.Object obj, boolean z) {
        if (obj instanceof InterfaceC48286uLw) {
            if (z && (obj instanceof C48283uLt)) {
                C48283uLt c48283uLt = (C48283uLt) obj;
                Alignment.Horizontal horizontalAEQbTJ = c48283uLt.AEQbTJ();
                Alignment.Companion companion = Alignment.Companion;
                if (Intrinsics.EZpvd(horizontalAEQbTJ, companion.getStart())) {
                    return c48283uLt.EZpvd((1983 & 1) != 0 ? c48283uLt.KWHzl : null, (1983 & 2) != 0 ? c48283uLt.AEQbTJ : null, (1983 & 4) != 0 ? c48283uLt.AhwBna : null, (1983 & 8) != 0 ? c48283uLt.fetchVPNInfo : null, (1983 & 16) != 0 ? c48283uLt.valueOf : null, (1983 & 32) != 0 ? c48283uLt.djBIcL : null, (1983 & 64) != 0 ? c48283uLt.copydefault : companion.getEnd(), (1983 & 128) != 0 ? c48283uLt.gEmmrt : null, (1983 & 256) != 0 ? c48283uLt.EZpvd : null, (1983 & 512) != 0 ? c48283uLt.AYXKKw : null, (1983 & 1024) != 0 ? c48283uLt.OLrzqt : null);
                }
            }
            return (InterfaceC48286uLw) obj;
        }
        if (obj instanceof C48284uLu) {
            if (z) {
                C48284uLu c48284uLu = (C48284uLu) obj;
                if (!c48284uLu.OLrzqt()) {
                    C48284uLu c48284uLuEZpvd = c48284uLu.EZpvd(C48282uLs.KWHzl);
                    int i = this.OLrzqt;
                    this.OLrzqt = i + 1;
                    return c48284uLuEZpvd.OLrzqt("metric_" + i);
                }
            }
            int i2 = this.OLrzqt;
            this.OLrzqt = i2 + 1;
            return ((C48284uLu) obj).OLrzqt("metric_" + i2);
        }
        int i3 = this.OLrzqt;
        this.OLrzqt = i3 + 1;
        return new C48285uLv("spacer_" + i3);
    }

    public final InterfaceC48286uLw KWHzl() {
        int i = this.OLrzqt;
        this.OLrzqt = i + 1;
        return new C48285uLv("spacer_" + i);
    }

    public final InterfaceC48286uLw OLrzqt(@NotNull yHT<? super RowScope, ? super Modifier, ? super Composer, ? super java.lang.Integer, Unit> yht) {
        Intrinsics.checkNotNullParameter(yht, "");
        int i = this.OLrzqt;
        this.OLrzqt = i + 1;
        return new C48279uLp(ContentMetadata.KEY_CUSTOM_PREFIX + i, yht);
    }

    public final void KWHzl(@NotNull C48284uLu c48284uLu, @NotNull C48284uLu c48284uLu2) {
        Intrinsics.checkNotNullParameter(c48284uLu, "");
        Intrinsics.checkNotNullParameter(c48284uLu2, "");
        java.util.List<java.util.List<InterfaceC48286uLw>> list = this.KWHzl;
        C48284uLu c48284uLuCopydefault = c48284uLu.copydefault();
        int i = this.OLrzqt;
        this.OLrzqt = i + 1;
        C48283uLt c48283uLtOLrzqt = c48284uLuCopydefault.OLrzqt("essential_left_" + i);
        C48284uLu c48284uLuEZpvd = c48284uLu2.copydefault().EZpvd(C48282uLs.KWHzl);
        int i2 = this.OLrzqt;
        this.OLrzqt = i2 + 1;
        list.add(yDY.gEmmrt(c48283uLtOLrzqt, c48284uLuEZpvd.OLrzqt("essential_right_" + i2)));
    }

    public final void KWHzl(@NotNull java.lang.Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(EZpvd(objArr[i], objArr.length == 3 && i2 == 2));
            i++;
            i2++;
        }
        this.KWHzl.add(arrayList);
    }
}
