package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43026rhX implements InterfaceC60050zuZ {
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public final java.lang.StringBuilder OLrzqt;
    public final C7844arW copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60050zuZ
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    public C43026rhX(@NotNull C7844arW c7844arW) {
        Intrinsics.checkNotNullParameter(c7844arW, "");
        this.copydefault = c7844arW;
        this.OLrzqt = new java.lang.StringBuilder();
        if (c7844arW.AhwBna()) {
            java.lang.String strKWHzl = c7844arW.KWHzl();
            this.KWHzl = strKWHzl;
            Intrinsics.copydefault((java.lang.Object) strKWHzl);
            java.lang.String str = java.io.File.separator;
            Intrinsics.checkNotNullExpressionValue(str, "");
            int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) strKWHzl, str, 0, false, 6, (java.lang.Object) null);
            if (iLastIndexOf$default >= 0) {
                java.lang.String str2 = this.KWHzl;
                Intrinsics.copydefault((java.lang.Object) str2);
                int i = iLastIndexOf$default + 1;
                java.lang.String strSubstring = str2.substring(i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                if (StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strSubstring, '.', 0, false, 6, (java.lang.Object) null) > 0) {
                    java.lang.String str3 = this.KWHzl;
                    Intrinsics.copydefault((java.lang.Object) str3);
                    java.lang.String strSubstring2 = str3.substring(0, i);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    this.KWHzl = strSubstring2;
                    return;
                }
                return;
            }
            return;
        }
        java.lang.String strKWHzl2 = C7836arO.KWHzl(c7844arW.gEmmrt());
        this.EZpvd = strKWHzl2;
        Intrinsics.copydefault((java.lang.Object) strKWHzl2);
        java.lang.String str4 = java.io.File.separator;
        Intrinsics.checkNotNullExpressionValue(str4, "");
        if (C59449zhJ.endsWith$default(strKWHzl2, str4, false, 2, null)) {
            return;
        }
        this.EZpvd = this.EZpvd + str4;
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
        if (this.copydefault.AhwBna()) {
            return null;
        }
        java.lang.String str2 = this.EZpvd + str;
        if (C6800aWH.copydefault(str2)) {
            return str2;
        }
        java.lang.StringBuilder sb = this.OLrzqt;
        sb.append("file ");
        sb.append(str2);
        sb.append(" not exists.");
        return null;
    }

    @Override // o.InterfaceC60050zuZ
    public byte[] OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (android.text.TextUtils.isEmpty(this.KWHzl)) {
            return null;
        }
        java.lang.String strKWHzl = C7864arq.KWHzl(this.KWHzl, str);
        Intrinsics.copydefault((java.lang.Object) strKWHzl);
        return EZpvd(strKWHzl);
    }

    private final byte[] EZpvd(java.lang.String str) {
        java.io.InputStream inputStreamOpen;
        try {
            inputStreamOpen = C7326ahi.OLrzqt().getAssets().open(str);
        } catch (java.lang.Throwable th) {
            th = th;
            inputStreamOpen = null;
        }
        try {
            int iAvailable = inputStreamOpen.available();
            byte[] bArr = new byte[iAvailable];
            if (inputStreamOpen.read(bArr) == iAvailable) {
                C7870arw.KWHzl("[MiniAppResourceFinder]", "read from assets: " + str);
                return bArr;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            try {
                java.lang.StringBuilder sb = this.OLrzqt;
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
        if (this.OLrzqt.length() == 0) {
            return null;
        }
        return "MARF: " + ((java.lang.Object) this.OLrzqt);
    }
}
