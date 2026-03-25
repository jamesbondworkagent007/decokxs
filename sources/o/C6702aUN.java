package o;

import o.C58013ytK;

/* JADX INFO: renamed from: o.aUN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6702aUN implements C58013ytK.ActionBar {
    @Override // o.C58013ytK.ActionBar
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(str2, objArr);
        }
        pUU.OLrzqt(str, str2);
    }

    @Override // o.C58013ytK.ActionBar
    public void EZpvd(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(str2, objArr);
        }
        pUU.KWHzl(str, str2);
    }

    @Override // o.C58013ytK.ActionBar
    public void KWHzl(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(str2, objArr);
        }
        pUU.valueOf(str, str2);
    }

    @Override // o.C58013ytK.ActionBar
    public void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(str2, objArr);
        }
        pUU.EZpvd(str, str2);
    }

    @Override // o.C58013ytK.ActionBar
    public void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(str2, objArr);
        }
        pUU.copydefault(str, str2);
    }

    @Override // o.C58013ytK.ActionBar
    public void copydefault(java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        pUU.copydefault(str, str2 + "  " + android.util.Log.getStackTraceString(th));
    }
}
