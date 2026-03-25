package o;

import android.graphics.PointF;

/* JADX INFO: renamed from: o.yrw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57945yrw implements InterfaceC57932yrj {
    public boolean EZpvd = true;
    public PointF KWHzl;
    public InterfaceC57932yrj copydefault;

    @Override // o.InterfaceC57932yrj
    public boolean EZpvd(android.view.View view) {
        InterfaceC57932yrj interfaceC57932yrj = this.copydefault;
        if (interfaceC57932yrj != null) {
            return interfaceC57932yrj.EZpvd(view);
        }
        return InterpolatorC57905yrI.OLrzqt(view, this.KWHzl);
    }

    @Override // o.InterfaceC57932yrj
    public boolean copydefault(android.view.View view) {
        InterfaceC57932yrj interfaceC57932yrj = this.copydefault;
        if (interfaceC57932yrj != null) {
            return interfaceC57932yrj.copydefault(view);
        }
        return InterpolatorC57905yrI.copydefault(view, this.KWHzl, this.EZpvd);
    }
}
