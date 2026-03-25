package o;

import android.view.ViewGroup;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import o.C57869yqZ;

/* JADX INFO: renamed from: o.yrx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57946yrx extends android.widget.RelativeLayout implements InterfaceC57935yrm {
    public C57940yrr AuCTelauCTel;
    public android.view.View wlaJM;
    public InterfaceC57935yrm zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57935yrm
    public android.view.View copydefault() {
        android.view.View view = this.wlaJM;
        return view == null ? this : view;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC57946yrx(@androidx.annotation.NonNull android.view.View view) {
        this(view, view instanceof InterfaceC57935yrm ? (InterfaceC57935yrm) view : null);
    }

    public AbstractC57946yrx(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable InterfaceC57935yrm interfaceC57935yrm) {
        super(view.getContext(), null, 0);
        this.wlaJM = view;
        this.zsXlph = interfaceC57935yrm;
        if ((this instanceof C57944yrv) && (interfaceC57935yrm instanceof InterfaceC57933yrk) && interfaceC57935yrm.KWHzl() == C57940yrr.EZpvd) {
            interfaceC57935yrm.copydefault().setScaleY(-1.0f);
            return;
        }
        if (this instanceof C57942yrt) {
            InterfaceC57935yrm interfaceC57935yrm2 = this.zsXlph;
            if ((interfaceC57935yrm2 instanceof InterfaceC57927yre) && interfaceC57935yrm2.KWHzl() == C57940yrr.EZpvd) {
                interfaceC57935yrm.copydefault().setScaleY(-1.0f);
            }
        }
    }

    public AbstractC57946yrx(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        return (obj instanceof InterfaceC57935yrm) && copydefault() == ((InterfaceC57935yrm) obj).copydefault();
    }

    public int EZpvd(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, boolean z) {
        InterfaceC57935yrm interfaceC57935yrm = this.zsXlph;
        if (interfaceC57935yrm == null || interfaceC57935yrm == this) {
            return 0;
        }
        return interfaceC57935yrm.EZpvd(interfaceC57934yrl, z);
    }

    public void setPrimaryColors(@androidx.annotation.ColorInt int... iArr) {
        InterfaceC57935yrm interfaceC57935yrm = this.zsXlph;
        if (interfaceC57935yrm == null || interfaceC57935yrm == this) {
            return;
        }
        interfaceC57935yrm.setPrimaryColors(iArr);
    }

    @Override // o.InterfaceC57935yrm
    public C57940yrr KWHzl() {
        int i;
        C57940yrr c57940yrr = this.AuCTelauCTel;
        if (c57940yrr != null) {
            return c57940yrr;
        }
        InterfaceC57935yrm interfaceC57935yrm = this.zsXlph;
        if (interfaceC57935yrm != null && interfaceC57935yrm != this) {
            return interfaceC57935yrm.KWHzl();
        }
        android.view.View view = this.wlaJM;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C57869yqZ.Application) {
                C57940yrr c57940yrr2 = ((C57869yqZ.Application) layoutParams).AEQbTJ;
                this.AuCTelauCTel = c57940yrr2;
                if (c57940yrr2 != null) {
                    return c57940yrr2;
                }
            }
            if (layoutParams != null && ((i = layoutParams.height) == 0 || i == -1)) {
                for (C57940yrr c57940yrr3 : C57940yrr.djBIcL) {
                    if (c57940yrr3.AhwBna) {
                        this.AuCTelauCTel = c57940yrr3;
                        return c57940yrr3;
                    }
                }
            }
        }
        C57940yrr c57940yrr4 = C57940yrr.KWHzl;
        this.AuCTelauCTel = c57940yrr4;
        return c57940yrr4;
    }

    public void EZpvd(@androidx.annotation.NonNull InterfaceC57931yri interfaceC57931yri, int i, int i2) {
        InterfaceC57935yrm interfaceC57935yrm = this.zsXlph;
        if (interfaceC57935yrm != null && interfaceC57935yrm != this) {
            interfaceC57935yrm.EZpvd(interfaceC57931yri, i, i2);
            return;
        }
        android.view.View view = this.wlaJM;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C57869yqZ.Application) {
                interfaceC57931yri.AEQbTJ(this, ((C57869yqZ.Application) layoutParams).EZpvd);
            }
        }
    }

    public boolean gEmmrt() {
        InterfaceC57935yrm interfaceC57935yrm = this.zsXlph;
        return (interfaceC57935yrm == null || interfaceC57935yrm == this || !interfaceC57935yrm.gEmmrt()) ? false : true;
    }

    public void OLrzqt(float f, int i, int i2) {
        InterfaceC57935yrm interfaceC57935yrm = this.zsXlph;
        if (interfaceC57935yrm == null || interfaceC57935yrm == this) {
            return;
        }
        interfaceC57935yrm.OLrzqt(f, i, i2);
    }

    public void copydefault(boolean z, float f, int i, int i2, int i3) {
        InterfaceC57935yrm interfaceC57935yrm = this.zsXlph;
        if (interfaceC57935yrm == null || interfaceC57935yrm == this) {
            return;
        }
        interfaceC57935yrm.copydefault(z, f, i, i2, i3);
    }

    public void OLrzqt(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, int i, int i2) {
        InterfaceC57935yrm interfaceC57935yrm = this.zsXlph;
        if (interfaceC57935yrm == null || interfaceC57935yrm == this) {
            return;
        }
        interfaceC57935yrm.OLrzqt(interfaceC57934yrl, i, i2);
    }

    public void KWHzl(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, int i, int i2) {
        InterfaceC57935yrm interfaceC57935yrm = this.zsXlph;
        if (interfaceC57935yrm == null || interfaceC57935yrm == this) {
            return;
        }
        interfaceC57935yrm.KWHzl(interfaceC57934yrl, i, i2);
    }

    public void OLrzqt(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, @androidx.annotation.NonNull RefreshState refreshState, @androidx.annotation.NonNull RefreshState refreshState2) {
        InterfaceC57935yrm interfaceC57935yrm = this.zsXlph;
        if (interfaceC57935yrm == null || interfaceC57935yrm == this) {
            return;
        }
        if ((this instanceof C57944yrv) && (interfaceC57935yrm instanceof InterfaceC57933yrk)) {
            if (refreshState.isFooter) {
                refreshState = refreshState.toHeader();
            }
            if (refreshState2.isFooter) {
                refreshState2 = refreshState2.toHeader();
            }
        } else if ((this instanceof C57942yrt) && (interfaceC57935yrm instanceof InterfaceC57927yre)) {
            if (refreshState.isHeader) {
                refreshState = refreshState.toFooter();
            }
            if (refreshState2.isHeader) {
                refreshState2 = refreshState2.toFooter();
            }
        }
        InterfaceC57935yrm interfaceC57935yrm2 = this.zsXlph;
        if (interfaceC57935yrm2 != null) {
            interfaceC57935yrm2.OLrzqt(interfaceC57934yrl, refreshState, refreshState2);
        }
    }

    public boolean AEQbTJ(boolean z) {
        InterfaceC57935yrm interfaceC57935yrm = this.zsXlph;
        return (interfaceC57935yrm instanceof InterfaceC57927yre) && ((InterfaceC57927yre) interfaceC57935yrm).AEQbTJ(z);
    }
}
