package o;

import com.immomo.mls.utils.ScriptLoadException;

/* JADX INFO: renamed from: o.arP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7837arP implements InterfaceC7295ahD {
    public java.io.PrintStream OLrzqt = null;
    public C7832arK copydefault;

    @Override // o.InterfaceC7295ahD
    public void EZpvd(java.lang.String str, ScriptLoadException scriptLoadException) {
    }

    public C7832arK KWHzl() {
        return new C7832arK();
    }

    @Override // o.InterfaceC7295ahD
    public void copydefault(java.lang.String str) {
        if (C7326ahi.EZpvd) {
            if (this.copydefault == null) {
                this.copydefault = KWHzl();
            }
            this.copydefault.KWHzl(str);
            C7870arw.KWHzl("[MiniApp]", "onStartLoadScript", str);
        }
    }

    @Override // o.InterfaceC7295ahD
    public void AEQbTJ(java.lang.String str) {
        if (C7326ahi.EZpvd) {
            this.copydefault.djBIcL();
            C7870arw.KWHzl("[MiniApp]", "onGlobalPrepared", str);
        }
    }

    @Override // o.InterfaceC7295ahD
    public void KWHzl(java.lang.String str) {
        if (C7326ahi.EZpvd) {
            this.copydefault.KWHzl();
        }
    }

    @Override // o.InterfaceC7295ahD
    public void copydefault(java.lang.String str, C8016auk c8016auk) {
        if (C7326ahi.EZpvd) {
            C7832arK c7832arK = this.copydefault;
            if (c7832arK != null) {
                c7832arK.AEQbTJ(c8016auk);
            }
            C7870arw.KWHzl("[MiniApp]", "onScriptLoaded", str);
        }
    }

    @Override // o.InterfaceC7295ahD
    public void EZpvd(java.lang.String str) {
        if (C7326ahi.EZpvd) {
            this.copydefault.copydefault();
            C7870arw.KWHzl("[MiniApp]", "onScriptCompiled", str);
        }
    }

    @Override // o.InterfaceC7295ahD
    public void OLrzqt(java.lang.String str) {
        if (C7326ahi.EZpvd) {
            this.copydefault.valueOf();
        }
    }

    @Override // o.InterfaceC7295ahD
    public void AEQbTJ(java.lang.String str, boolean z) {
        if (C7326ahi.EZpvd) {
            this.copydefault.copydefault(z);
            this.copydefault.EZpvd(this.OLrzqt);
        }
    }
}
