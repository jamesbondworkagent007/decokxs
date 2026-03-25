package o;

import android.os.Build;
import com.google.android.material.navigation.NavigationBarView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mtX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33282mtX extends AbstractC43215rlA implements InterfaceC33338mua {
    public final java.lang.String AEQbTJ;
    public final int EZpvd;
    public Reference<android.content.Context> KWHzl;
    public final InterfaceC33214msI copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC33214msI djBIcL() {
        return this.copydefault;
    }

    public C33282mtX(@NotNull java.lang.String str, int i, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str2;
        this.EZpvd = i;
        InterfaceC33213msH interfaceC33213msHAEQbTJ = C33267mtI.OLrzqt.AEQbTJ(str);
        this.copydefault = interfaceC33213msHAEQbTJ != null ? interfaceC33213msHAEQbTJ.KWHzl() : null;
    }

    @Override // o.InterfaceC33338mua
    public int KWHzl() {
        if (djBIcL() instanceof InterfaceC33211msF) {
            InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
            Intrinsics.copydefault(interfaceC33214msIDjBIcL, "");
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((InterfaceC33211msF) interfaceC33214msIDjBIcL).AhwBna());
            if (numValueOf.intValue() == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return this.EZpvd;
    }

    @Override // o.AbstractC43215rlA
    public void onInit(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onInit(context);
        this.KWHzl = new WeakReference(context);
    }

    @Override // o.InterfaceC33338mua
    public boolean EZpvd() {
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            return interfaceC33214msIDjBIcL.EZpvd();
        }
        return false;
    }

    @Override // o.InterfaceC33338mua
    public java.lang.String OLrzqt() {
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            return interfaceC33214msIDjBIcL.OLrzqt();
        }
        return null;
    }

    @Override // o.InterfaceC33338mua
    public void copydefault(@NotNull InterfaceC33215msJ interfaceC33215msJ) {
        Intrinsics.checkNotNullParameter(interfaceC33215msJ, "");
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            interfaceC33214msIDjBIcL.copydefault(interfaceC33215msJ);
        }
    }

    @Override // o.InterfaceC33338mua
    public boolean KWHzl(android.content.Intent intent) {
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            return interfaceC33214msIDjBIcL.KWHzl(intent);
        }
        return false;
    }

    @Override // o.InterfaceC33338mua
    public void AEQbTJ(android.content.Intent intent) {
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            interfaceC33214msIDjBIcL.copydefault(intent);
        }
    }

    @Override // o.InterfaceC33338mua
    public android.view.MenuItem KWHzl(@NotNull NavigationBarView navigationBarView) {
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL == null) {
            return null;
        }
        android.view.MenuItem menuItemCopydefault = interfaceC33214msIDjBIcL.copydefault(navigationBarView);
        if (Build.VERSION.SDK_INT < 26) {
            return menuItemCopydefault;
        }
        menuItemCopydefault.setContentDescription(this.AEQbTJ);
        return menuItemCopydefault;
    }

    @Override // o.InterfaceC33338mua
    public void AEQbTJ(@NotNull NavigationBarView navigationBarView) {
        Intrinsics.checkNotNullParameter(navigationBarView, "");
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            interfaceC33214msIDjBIcL.EZpvd(navigationBarView);
        }
    }

    @Override // o.InterfaceC33338mua
    public boolean AhwBna() {
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            return interfaceC33214msIDjBIcL.gEmmrt();
        }
        return false;
    }

    @Override // o.InterfaceC33338mua
    public androidx.fragment.app.Fragment copydefault(android.content.Intent intent) {
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            return interfaceC33214msIDjBIcL.EZpvd(intent);
        }
        return null;
    }

    @Override // o.InterfaceC33338mua
    public java.lang.String copydefault() {
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            return interfaceC33214msIDjBIcL.KWHzl();
        }
        return null;
    }

    @Override // o.InterfaceC33338mua
    public java.lang.String AEQbTJ() {
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            return interfaceC33214msIDjBIcL.AEQbTJ();
        }
        return null;
    }

    @Override // o.InterfaceC33212msG
    public void OLrzqt(java.lang.String str, java.lang.String str2) {
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            interfaceC33214msIDjBIcL.OLrzqt(str, str2);
        }
    }

    @Override // o.InterfaceC33338mua
    public InterfaceC33217msL valueOf() {
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            return interfaceC33214msIDjBIcL.AYXKKw();
        }
        return null;
    }

    @Override // o.InterfaceC33338mua
    public InterfaceC33217msL AYXKKw() {
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            return interfaceC33214msIDjBIcL.copydefault();
        }
        return null;
    }

    @Override // o.InterfaceC33338mua
    public void OLrzqt(@NotNull InterfaceC33218msM interfaceC33218msM) {
        Intrinsics.checkNotNullParameter(interfaceC33218msM, "");
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            interfaceC33214msIDjBIcL.AEQbTJ(interfaceC33218msM);
        }
    }

    @Override // o.InterfaceC33338mua
    public void gEmmrt() {
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            interfaceC33214msIDjBIcL.djBIcL();
        }
    }

    @Override // o.InterfaceC33338mua
    public void OLrzqt(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        InterfaceC33214msI interfaceC33214msIDjBIcL = djBIcL();
        if (interfaceC33214msIDjBIcL != null) {
            interfaceC33214msIDjBIcL.copydefault(view);
        }
    }
}
