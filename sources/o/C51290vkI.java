package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vkI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51290vkI {
    public final android.content.Context AEQbTJ;
    public final java.lang.String KWHzl;

    public C51290vkI(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = context;
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [23=6] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final AbstractC51292vkK KWHzl() {
        java.lang.String str = this.KWHzl;
        switch (str.hashCode()) {
            case -1831183611:
                if (str.equals("spot_dca")) {
                    return new C51335vlA(this.AEQbTJ);
                }
                break;
            case -1402017003:
                if (str.equals("contract_dca")) {
                    return new C51303vkV(this.AEQbTJ, null, 0, 6, null);
                }
                break;
            case -1216369070:
                if (str.equals("smart_portfolio")) {
                    return new C51378vlr(this.AEQbTJ);
                }
                break;
            case -512749997:
                if (str.equals("contract_grid")) {
                    return new C51367vlg(this.AEQbTJ);
                }
                break;
            case 3181382:
                if (str.equals("grid")) {
                    return new C51336vlB(this.AEQbTJ, null, 0, 6, null);
                }
                break;
            case 1165749981:
                if (str.equals("recurring")) {
                    return new C51375vlo(this.AEQbTJ);
                }
                break;
        }
        return new C51298vkQ(this.AEQbTJ);
    }
}
