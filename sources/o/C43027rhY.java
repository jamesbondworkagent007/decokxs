package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43027rhY implements InterfaceC60050zuZ {
    public final java.lang.StringBuilder KWHzl = new java.lang.StringBuilder();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60050zuZ
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.InterfaceC60050zuZ
    public java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C59449zhJ.endsWith$default(str, ".lua", false, 2, null)) {
            str = str.substring(0, str.length() - 4);
            Intrinsics.checkNotNullExpressionValue(str, "");
        }
        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "..", false, 2, (java.lang.Object) null)) {
            return C60048zuX.OLrzqt(str, '.', java.io.File.separatorChar) + ".lua";
        }
        return str + ".lua";
    }

    @Override // o.InterfaceC60050zuZ
    public java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C59449zhJ.startsWith$default(str, C43039rhk.EZpvd(), false, 2, null)) {
            C7791aqW c7791aqWAEQbTJ = C7788aqT.AEQbTJ();
            java.lang.String strAEQbTJ = c7791aqWAEQbTJ != null ? c7791aqWAEQbTJ.AEQbTJ(C7326ahi.OLrzqt(), str) : null;
            if (C6800aWH.copydefault(strAEQbTJ)) {
                C7870arw.KWHzl("[FrameworkResourceFinder]", str + " -> " + strAEQbTJ);
                return strAEQbTJ;
            }
            java.lang.StringBuilder sb = this.KWHzl;
            sb.append("file ");
            sb.append(strAEQbTJ);
            sb.append(" not exists.");
        }
        return null;
    }

    @Override // o.InterfaceC60050zuZ
    public byte[] OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C59449zhJ.startsWith$default(str, C43039rhk.EZpvd(), false, 2, null)) {
            return null;
        }
        java.lang.String str2 = "oklua.bundle/" + str;
        C7870arw.KWHzl("[FrameworkResourceFinder]", str + " -> file://android_asset/" + str2);
        return EZpvd(str2);
    }

    private final byte[] EZpvd(java.lang.String str) {
        java.lang.Throwable th;
        java.io.InputStream inputStreamOpen;
        try {
            inputStreamOpen = C7326ahi.OLrzqt().getAssets().open(str);
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStreamOpen = null;
        }
        try {
            int iAvailable = inputStreamOpen.available();
            byte[] bArr = new byte[iAvailable];
            if (inputStreamOpen.read(bArr) == iAvailable) {
                return bArr;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                java.lang.StringBuilder sb = this.KWHzl;
                sb.append("\tAnd ");
                sb.append(th.toString());
            } finally {
                C7866ars.AEQbTJ((java.io.Closeable) inputStreamOpen);
            }
        }
        return null;
    }

    @Override // o.InterfaceC60050zuZ
    public java.lang.String copydefault() {
        if (this.KWHzl.length() == 0) {
            return null;
        }
        return "MAFRF: " + ((java.lang.Object) this.KWHzl);
    }
}
