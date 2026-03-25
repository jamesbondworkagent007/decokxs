package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;

/* JADX INFO: renamed from: o.pDx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37874pDx {
    public static final C37874pDx EZpvd = new C37874pDx();

    private C37874pDx() {
    }

    public static /* synthetic */ java.lang.String getTitleByIdAndType$default(C37874pDx c37874pDx, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return c37874pDx.EZpvd(str, str2, z, z2);
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        return C48914uef.getTitleByIdAndType$default(C48914uef.EZpvd, str, str2, z, z2, null, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
    }

    public static /* synthetic */ java.lang.String getIdNameByIdAndType$default(C37874pDx c37874pDx, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c37874pDx.copydefault(str, str2, z);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, boolean z) {
        return C48914uef.EZpvd.EZpvd(str, str2, z);
    }

    public static /* synthetic */ java.lang.String getTypeNameByIdAndType$default(C37874pDx c37874pDx, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return c37874pDx.OLrzqt(str, str2, z, z2);
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        return C48914uef.EZpvd.AEQbTJ(str, str2, z, z2);
    }
}
