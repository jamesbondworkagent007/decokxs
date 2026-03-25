package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import o.InterfaceC56685yOn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59224zcx extends yOX {
    public final ProtoBuf.TypeParameter DbNXlk;
    public final C59129zbH djBIcL;
    public final C59087zaS fetchVPNInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/yOL; */
    @Override // o.yOH, o.yOB
    /* JADX INFO: renamed from: AuCTel, reason: merged with bridge method [inline-methods] */
    public C59129zbH copydefault() {
        return this.djBIcL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C59224zcx(@NotNull C59087zaS c59087zaS, @NotNull ProtoBuf.TypeParameter typeParameter, int i) {
        Intrinsics.checkNotNullParameter(c59087zaS, "");
        Intrinsics.checkNotNullParameter(typeParameter, "");
        InterfaceC59187zcM interfaceC59187zcMValueOf = c59087zaS.valueOf();
        InterfaceC56665yNu interfaceC56665yNuKWHzl = c59087zaS.KWHzl();
        yOL yolOLrzqt = yOL.KWHzl.OLrzqt();
        C56935yXu c56935yXuOLrzqt = C59160zbm.OLrzqt(c59087zaS.copydefault(), typeParameter.getName());
        C59168zbu c59168zbu = C59168zbu.copydefault;
        ProtoBuf.TypeParameter.Variance variance = typeParameter.getVariance();
        Intrinsics.checkNotNullExpressionValue(variance, "");
        super(interfaceC59187zcMValueOf, interfaceC56665yNuKWHzl, yolOLrzqt, c56935yXuOLrzqt, c59168zbu.KWHzl(variance), typeParameter.getReified(), i, InterfaceC56686yOo.copydefault, InterfaceC56685yOn.Activity.KWHzl);
        this.fetchVPNInfo = c59087zaS;
        this.DbNXlk = typeParameter;
        this.djBIcL = new C59129zbH(c59087zaS.valueOf(), new C59223zcw(this));
    }

    public static final java.util.List EZpvd(C59224zcx c59224zcx) {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c59224zcx.fetchVPNInfo.EZpvd().copydefault().EZpvd(c59224zcx.DbNXlk, c59224zcx.fetchVPNInfo.copydefault()));
    }

    @Override // o.AbstractC56704yPf
    public java.util.List<AbstractC59233zdF> AkhnZx() {
        java.util.List<ProtoBuf.Type> listEZpvd = yWU.EZpvd(this.DbNXlk, this.fetchVPNInfo.gEmmrt());
        if (listEZpvd.isEmpty()) {
            return C56402yEa.EZpvd(yZE.AEQbTJ(this).AuCTel());
        }
        C59165zbr c59165zbrAYXKKw = this.fetchVPNInfo.AYXKKw();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            arrayList.add(c59165zbrAYXKKw.OLrzqt((ProtoBuf.Type) it.next()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/zdF;)V */
    @Override // o.AbstractC56704yPf
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.Void copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        throw new java.lang.IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
