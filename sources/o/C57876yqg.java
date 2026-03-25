package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yqg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57876yqg {
    public InterfaceC57889yqt AEQbTJ;
    public final C57877yqh EZpvd;
    public final InterfaceC57738yoA KWHzl;
    public final InterfaceC57827ypk OLrzqt;

    public C57876yqg(@NotNull InterfaceC57738yoA interfaceC57738yoA, @NotNull InterfaceC57827ypk interfaceC57827ypk, InterfaceC57833ypq interfaceC57833ypq, InterfaceC57757yoT interfaceC57757yoT) {
        Intrinsics.checkNotNullParameter(interfaceC57738yoA, "");
        Intrinsics.checkNotNullParameter(interfaceC57827ypk, "");
        this.KWHzl = interfaceC57738yoA;
        this.OLrzqt = interfaceC57827ypk;
        Intrinsics.copydefault(interfaceC57833ypq);
        Intrinsics.copydefault(interfaceC57757yoT);
        this.EZpvd = new C57877yqh(interfaceC57738yoA, interfaceC57833ypq, interfaceC57757yoT);
    }

    public final InterfaceC57889yqt OLrzqt() {
        return this.AEQbTJ != null ? KWHzl() : AEQbTJ();
    }

    public final InterfaceC57889yqt KWHzl() {
        if (!this.EZpvd.EZpvd()) {
            InterfaceC57889yqt interfaceC57889yqt = this.AEQbTJ;
            if (interfaceC57889yqt instanceof C57880yqk) {
                Intrinsics.copydefault(interfaceC57889yqt);
                return interfaceC57889yqt;
            }
        }
        if (this.EZpvd.EZpvd()) {
            InterfaceC57889yqt interfaceC57889yqt2 = this.AEQbTJ;
            if (interfaceC57889yqt2 instanceof C57882yqm) {
                Intrinsics.copydefault(interfaceC57889yqt2);
                return interfaceC57889yqt2;
            }
        }
        return AEQbTJ();
    }

    public final AbstractC57881yql AEQbTJ() {
        if (this.EZpvd.EZpvd()) {
            return new C57882yqm(this.KWHzl, this.EZpvd, new C57884yqo(this.OLrzqt));
        }
        return new C57880yqk(this.KWHzl, this.EZpvd, new C57883yqn(this.OLrzqt));
    }
}
