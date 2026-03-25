package o;

import com.immomo.mls.utils.ERROR;
import com.immomo.mls.utils.ScriptLoadException;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.lang.ref.WeakReference;
import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.ahZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7317ahZ implements InterfaceC7305ahN {
    public C7844arW AEQbTJ;
    public long AhwBna;
    public java.lang.String EZpvd;
    public int KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String gEmmrt;
    public final java.lang.Object valueOf = "ScriptReader" + hashCode();
    public boolean copydefault = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7305ahN
    public java.lang.Object EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7305ahN
    public java.lang.String KWHzl() {
        java.lang.String str = this.OLrzqt;
        return str == null ? "0" : str;
    }

    public C7317ahZ(java.lang.String str) {
        this.gEmmrt = str;
        AEQbTJ();
    }

    public void AEQbTJ() {
        C7844arW c7844arW = new C7844arW(this.gEmmrt);
        this.AEQbTJ = c7844arW;
        this.EZpvd = c7844arW.OLrzqt();
    }

    @Override // o.InterfaceC7305ahN
    public void AEQbTJ(C7919ass c7919ass) {
        this.KWHzl = c7919ass.EZpvd;
        java.lang.String str = c7919ass.OLrzqt;
        Globals globals = c7919ass.copydefault;
        InterfaceC7915aso interfaceC7915aso = c7919ass.AEQbTJ;
        this.AhwBna = c7919ass.AYXKKw;
        if (C7326ahi.EZpvd) {
            C7873arz.AEQbTJ(globals);
        }
        C7844arW c7844arW = str == null ? this.AEQbTJ : new C7844arW(str);
        globals.isConnected();
        globals.AEQbTJ(C7323ahf.values().EZpvd(this.KWHzl, c7844arW));
        if (C7914asn.EZpvd(this.KWHzl, 256)) {
            globals.AEQbTJ(new C43027rhY());
        }
        C7838arQ.EZpvd(this.gEmmrt);
        KWHzl(c7844arW, interfaceC7915aso);
    }

    public void KWHzl(C7844arW c7844arW, InterfaceC7915aso interfaceC7915aso) {
        boolean z = C7914asn.EZpvd(this.KWHzl, 1) && !C7914asn.EZpvd(this.KWHzl, 2);
        if (c7844arW.fetchVPNInfo() && z) {
            AEQbTJ(c7844arW, interfaceC7915aso, z);
            return;
        }
        try {
            C8016auk c8016aukCopydefault = copydefault(c7844arW);
            if (c8016aukCopydefault != null) {
                KWHzl(interfaceC7915aso, c8016aukCopydefault);
            } else {
                AEQbTJ(c7844arW, interfaceC7915aso, z);
            }
        } catch (ScriptLoadException e) {
            EZpvd(interfaceC7915aso, c7844arW, e);
        }
    }

    public void AEQbTJ(C7844arW c7844arW, InterfaceC7915aso interfaceC7915aso, boolean z) {
        java.lang.Runnable runnableEZpvd;
        if (c7844arW.fetchVPNInfo()) {
            runnableEZpvd = copydefault(c7844arW, interfaceC7915aso, z);
        } else {
            runnableEZpvd = EZpvd(c7844arW, interfaceC7915aso, z);
        }
        if (runnableEZpvd == null) {
            EZpvd(interfaceC7915aso, c7844arW, new ScriptLoadException(ERROR.FILE_NOT_FOUND, new java.io.FileNotFoundException(c7844arW.toString())));
        } else {
            AEQbTJ(runnableEZpvd);
        }
    }

    public void AEQbTJ(@androidx.annotation.NonNull java.lang.Runnable runnable) {
        C7323ahf.isConnected().AEQbTJ(EZpvd(), runnable);
    }

    public java.lang.Runnable copydefault(C7844arW c7844arW, InterfaceC7915aso interfaceC7915aso, boolean z) {
        return new ActionBar(c7844arW, interfaceC7915aso, z);
    }

    public java.lang.Runnable EZpvd(C7844arW c7844arW, InterfaceC7915aso interfaceC7915aso, boolean z) {
        if (c7844arW.AhwBna()) {
            return new StateListAnimator(c7844arW, interfaceC7915aso, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: o.ahZ$StateListAnimator */
    public class StateListAnimator extends TaskDescription {
        public StateListAnimator(C7844arW c7844arW, InterfaceC7915aso interfaceC7915aso, boolean z) {
            super(c7844arW, interfaceC7915aso, z);
        }

        @Override // o.C7317ahZ.TaskDescription
        public void EZpvd() throws ScriptLoadException {
            if (C7317ahZ.KWHzl(this.valueOf)) {
                return;
            }
            EZpvd(this.valueOf.KWHzl(), this.AEQbTJ, this.copydefault);
        }

        public void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) throws ScriptLoadException {
            java.io.InputStream inputStreamOpen = null;
            try {
                try {
                    inputStreamOpen = C7326ahi.OLrzqt().getAssets().open(str);
                    KWHzl();
                    OLrzqt(inputStreamOpen, str, str2, str3);
                } catch (ScriptLoadException e) {
                    throw e;
                } catch (java.lang.Exception e2) {
                    throw new ScriptLoadException(ERROR.UNKNOWN_ERROR, e2);
                }
            } finally {
                C7866ars.AEQbTJ((java.io.Closeable) inputStreamOpen);
            }
        }

        public void OLrzqt(java.io.InputStream inputStream, java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
            java.lang.String str4;
            if (C7864arq.AEQbTJ(str, ".zip")) {
                C7864arq.KWHzl(str2, inputStream);
                return;
            }
            java.lang.String str5 = java.io.File.separator;
            if (!str2.endsWith(str5)) {
                str4 = str2 + str5 + str3;
            } else {
                str4 = str2 + str3;
            }
            if (C7864arq.OLrzqt(inputStream, str4)) {
                return;
            }
            throw new java.lang.IllegalStateException("copy assets file " + str + " to target " + str4 + " failed!");
        }
    }

    /* JADX INFO: renamed from: o.ahZ$ActionBar */
    public class ActionBar extends TaskDescription {
        public ActionBar(C7844arW c7844arW, InterfaceC7915aso interfaceC7915aso, boolean z) {
            super(c7844arW, interfaceC7915aso, z);
        }

        @Override // o.C7317ahZ.TaskDescription
        public void EZpvd() throws ScriptLoadException {
            C7323ahf.AhwBna().KWHzl(this.valueOf.gEmmrt(), this.AEQbTJ, this.copydefault, null, null, null, C7317ahZ.this.AhwBna);
        }
    }

    /* JADX INFO: renamed from: o.ahZ$TaskDescription */
    public abstract class TaskDescription implements java.lang.Runnable {
        public java.lang.String AEQbTJ;
        public final WeakReference<InterfaceC7915aso> EZpvd;
        public final boolean KWHzl;
        public long OLrzqt = valueOf();
        public java.lang.String copydefault;
        public final C7844arW valueOf;

        public abstract void EZpvd() throws ScriptLoadException;

        public TaskDescription(C7844arW c7844arW, InterfaceC7915aso interfaceC7915aso, boolean z) {
            this.EZpvd = new WeakReference<>(interfaceC7915aso);
            this.KWHzl = z;
            this.valueOf = c7844arW;
            AYXKKw();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.EZpvd.get() == null || C7317ahZ.this.copydefault || copydefault()) {
                return;
            }
            OLrzqt();
            if (copydefault()) {
                return;
            }
            try {
                EZpvd();
                if (copydefault() || this.EZpvd.get() == null) {
                    return;
                }
                C7317ahZ c7317ahZ = C7317ahZ.this;
                if (c7317ahZ.copydefault) {
                    return;
                } else {
                    c7317ahZ.KWHzl(this.EZpvd.get(), AEQbTJ());
                }
            } catch (ScriptLoadException e) {
                C7317ahZ.this.EZpvd(this.EZpvd.get(), this.valueOf, e);
            }
            this.EZpvd.clear();
        }

        public void AYXKKw() {
            java.lang.String[] strArrEZpvd = C7317ahZ.this.EZpvd(this.valueOf);
            this.AEQbTJ = strArrEZpvd[0];
            this.copydefault = strArrEZpvd[1];
        }

        public void OLrzqt() {
            if (this.KWHzl) {
                try {
                    C7864arq.EZpvd(this.AEQbTJ);
                } catch (java.lang.Throwable th) {
                    C7870arw.AEQbTJ(th, new java.lang.Object[0]);
                }
            }
        }

        public C8016auk AEQbTJ() throws ScriptLoadException {
            if (C7317ahZ.KWHzl(this.valueOf)) {
                return C7317ahZ.this.OLrzqt(this.valueOf);
            }
            java.lang.String strKWHzl = C7317ahZ.this.KWHzl(this.AEQbTJ, this.copydefault);
            if (strKWHzl == null) {
                throw new ScriptLoadException(ERROR.UNKNOWN_ERROR, new java.lang.IllegalStateException(java.lang.String.format("can not find %s from path: %s", this.copydefault, this.AEQbTJ)));
            }
            return C7317ahZ.this.copydefault(this.valueOf.toString(), strKWHzl);
        }

        public boolean copydefault() {
            try {
                KWHzl();
                return false;
            } catch (ScriptLoadException e) {
                C7317ahZ.this.EZpvd(this.EZpvd.get(), this.valueOf, e);
                return true;
            }
        }

        public void KWHzl() throws ScriptLoadException {
            if (C7317ahZ.this.AhwBna == 0) {
                return;
            }
            if (valueOf() - this.OLrzqt > C7317ahZ.this.AhwBna) {
                throw new ScriptLoadException(ERROR.TIMEOUT, null);
            }
        }

        public long valueOf() {
            return java.lang.System.currentTimeMillis();
        }
    }

    public C8016auk copydefault(C7844arW c7844arW) throws ScriptLoadException {
        if (KWHzl(c7844arW)) {
            return OLrzqt(c7844arW);
        }
        java.lang.String[] strArrEZpvd = EZpvd(c7844arW);
        java.lang.String strKWHzl = KWHzl(strArrEZpvd[0], strArrEZpvd[1]);
        if (strKWHzl == null) {
            return null;
        }
        return copydefault(c7844arW.toString(), strKWHzl);
    }

    public C8016auk copydefault(java.lang.String str, java.lang.String str2) throws ScriptLoadException {
        java.io.File file = new java.io.File(str2);
        C8016auk c8016auk = new C8016auk(str, file.getParent());
        c8016auk.EZpvd(C7873arz.copydefault(file));
        c8016auk.EZpvd(18);
        return c8016auk;
    }

    public C8016auk OLrzqt(C7844arW c7844arW) throws ScriptLoadException {
        C8016auk c8016auk = new C8016auk(c7844arW.toString(), C7836arO.AEQbTJ(c7844arW.gEmmrt()));
        c8016auk.EZpvd(C7873arz.KWHzl(c7844arW));
        c8016auk.EZpvd(20);
        return c8016auk;
    }

    public java.lang.String KWHzl(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2) {
        InterfaceC7307ahP interfaceC7307ahPFARcdN;
        if (!C7914asn.EZpvd(this.KWHzl, 8) && (interfaceC7307ahPFARcdN = C7323ahf.fARcdN()) != null) {
            str = interfaceC7307ahPFARcdN.copydefault(str);
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            return null;
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            if (str2.endsWith(".lua")) {
                java.io.File file2 = new java.io.File(file, str2);
                if (file2.exists()) {
                    return file2.getAbsolutePath();
                }
                file = file2;
            }
            if (!str2.contains(JwtUtilsKt.JWT_DELIMITER)) {
                str2 = str2 + JwtUtilsKt.JWT_DELIMITER;
            }
            java.lang.String[] list = file.list();
            if (list != null && list.length != 0) {
                int length = list.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        java.lang.String str3 = list[i];
                        if (str3 != null && str3.startsWith(str2)) {
                            file = new java.io.File(file, str3);
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            } else {
                return null;
            }
        }
        if (file.exists() && file.isFile()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public java.lang.String[] EZpvd(C7844arW c7844arW) {
        java.lang.String absolutePath;
        java.lang.String strSubstring;
        if (c7844arW.AhwBna()) {
            absolutePath = new java.io.File(C7864arq.copydefault(), "android_asset" + java.io.File.separator + C7864arq.djBIcL(c7844arW.gEmmrt())).getAbsolutePath();
        } else {
            if (c7844arW.DbNXlk()) {
                java.io.File file = new java.io.File(c7844arW.gEmmrt());
                return new java.lang.String[]{file.getParent(), file.getName()};
            }
            absolutePath = new java.io.File(C7864arq.copydefault(), C7864arq.djBIcL(c7844arW.gEmmrt())).getAbsolutePath();
        }
        int iLastIndexOf = absolutePath.lastIndexOf(java.io.File.separatorChar);
        if (iLastIndexOf >= 0) {
            strSubstring = absolutePath.substring(iLastIndexOf + 1);
            absolutePath = absolutePath.substring(0, iLastIndexOf);
        } else {
            strSubstring = absolutePath;
        }
        java.lang.String strOLrzqt = c7844arW.OLrzqt();
        if (!absolutePath.endsWith(strSubstring) || !AEQbTJ(strOLrzqt, strSubstring)) {
            int iIndexOf = strSubstring.indexOf(46);
            if (iIndexOf > 0) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            absolutePath = absolutePath + java.io.File.separator + strSubstring;
        }
        return new java.lang.String[]{absolutePath, strOLrzqt};
    }

    public static boolean AEQbTJ(java.lang.String str, java.lang.String str2) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf > 0) {
            str = str.substring(0, iLastIndexOf);
        }
        int iLastIndexOf2 = str2.lastIndexOf(46);
        if (iLastIndexOf2 > 0) {
            str2 = str2.substring(0, iLastIndexOf2);
        }
        return str.equals(str2);
    }

    public static boolean KWHzl(C7844arW c7844arW) {
        java.lang.String strGEmmrt = c7844arW.gEmmrt();
        return c7844arW.AhwBna() && !android.text.TextUtils.isEmpty(strGEmmrt) && C7864arq.AEQbTJ(strGEmmrt, ".lua");
    }

    public void EZpvd(InterfaceC7915aso interfaceC7915aso, C7844arW c7844arW, ScriptLoadException scriptLoadException) {
        this.OLrzqt = c7844arW.fetchVPNInfo() ? "ScriptLoadException:Online" : "ScriptLoadException:Local";
        if (interfaceC7915aso != null) {
            interfaceC7915aso.AEQbTJ(scriptLoadException);
        }
    }

    public void KWHzl(InterfaceC7915aso interfaceC7915aso, C8016auk c8016auk) {
        if (interfaceC7915aso != null) {
            interfaceC7915aso.KWHzl(c8016auk);
        }
    }
}
