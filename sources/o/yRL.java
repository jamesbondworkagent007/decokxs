package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yRL implements InterfaceC56787ySh {
    public static final /* synthetic */ yJA<java.lang.Object>[] AEQbTJ = {C56524yIo.copydefault(new PropertyReference1Impl(yRL.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};
    public final InterfaceC59182zcH AhwBna;
    public final InterfaceC56686yOo EZpvd;
    public final C56933yXs KWHzl;
    public final boolean OLrzqt;
    public final yTN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yOJ
    public InterfaceC56686yOo EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yOJ
    public C56933yXs KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yTN copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56787ySh
    public boolean valueOf() {
        return this.OLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yRL(@NotNull C56794ySo c56794ySo, yTO yto, @NotNull C56933yXs c56933yXs) {
        InterfaceC56686yOo interfaceC56686yOoKWHzl;
        boolean z;
        java.util.Collection<yTN> collectionCopydefault;
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        this.KWHzl = c56933yXs;
        if (yto == null || (interfaceC56686yOoKWHzl = c56794ySo.copydefault().AuCTel().KWHzl(yto)) == null) {
            interfaceC56686yOoKWHzl = InterfaceC56686yOo.copydefault;
            Intrinsics.checkNotNullExpressionValue(interfaceC56686yOoKWHzl, "");
        }
        this.EZpvd = interfaceC56686yOoKWHzl;
        this.AhwBna = c56794ySo.EZpvd().KWHzl(new yRK(c56794ySo, this));
        this.copydefault = (yto == null || (collectionCopydefault = yto.copydefault()) == null) ? null : (yTN) CollectionsKt___CollectionsKt.RcXXUw(collectionCopydefault);
        if (yto != null) {
            z = yto.EZpvd();
        }
        this.OLrzqt = z;
    }

    public static final AbstractC59242zdO copydefault(C56794ySo c56794ySo, yRL yrl) {
        AbstractC59242zdO abstractC59242zdOBQ_ = c56794ySo.AEQbTJ().AEQbTJ().OLrzqt(yrl.KWHzl()).bQ_();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOBQ_, "");
        return abstractC59242zdOBQ_;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lo/zdF; */
    @Override // o.yOJ
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public AbstractC59242zdO AEQbTJ() {
        return (AbstractC59242zdO) C59183zcI.AEQbTJ(this.AhwBna, this, AEQbTJ[0]);
    }

    @Override // o.yOJ
    public java.util.Map<C56935yXu, AbstractC56975yZg<?>> OLrzqt() {
        return C56424yEw.KWHzl();
    }
}
