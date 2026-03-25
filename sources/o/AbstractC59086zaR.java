package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59086zaR extends AbstractC59088zaT {
    public final InterfaceC59145zbX AhwBna;
    public final yWT DbNXlk;
    public InterfaceC59098zad OLrzqt;
    public final C59159zbl djBIcL;
    public final yWQ isConnected;
    public ProtoBuf.PackageFragment valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: djBIcL()Lo/zaN; */
    @Override // o.AbstractC59088zaT
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public C59159zbl djBIcL() {
        return this.djBIcL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC59086zaR(@NotNull C56933yXs c56933yXs, @NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull yNP ynp, @NotNull ProtoBuf.PackageFragment packageFragment, @NotNull yWQ ywq, InterfaceC59145zbX interfaceC59145zbX) {
        super(c56933yXs, interfaceC59187zcM, ynp);
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(packageFragment, "");
        Intrinsics.checkNotNullParameter(ywq, "");
        this.isConnected = ywq;
        this.AhwBna = interfaceC59145zbX;
        ProtoBuf.StringTable strings = packageFragment.getStrings();
        Intrinsics.checkNotNullExpressionValue(strings, "");
        ProtoBuf.QualifiedNameTable qualifiedNames = packageFragment.getQualifiedNames();
        Intrinsics.checkNotNullExpressionValue(qualifiedNames, "");
        yWT ywt = new yWT(strings, qualifiedNames);
        this.DbNXlk = ywt;
        this.djBIcL = new C59159zbl(packageFragment, ywt, ywq, new C59092zaX(this));
        this.valueOf = packageFragment;
    }

    public static final InterfaceC56686yOo copydefault(AbstractC59086zaR abstractC59086zaR, C56929yXo c56929yXo) {
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        InterfaceC59145zbX interfaceC59145zbX = abstractC59086zaR.AhwBna;
        if (interfaceC59145zbX != null) {
            return interfaceC59145zbX;
        }
        InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
        Intrinsics.checkNotNullExpressionValue(interfaceC56686yOo, "");
        return interfaceC56686yOo;
    }

    @Override // o.AbstractC59088zaT
    public void OLrzqt(@NotNull C59083zaO c59083zaO) {
        Intrinsics.checkNotNullParameter(c59083zaO, "");
        ProtoBuf.PackageFragment packageFragment = this.valueOf;
        if (packageFragment == null) {
            throw new java.lang.IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        this.valueOf = null;
        ProtoBuf.Package r5 = packageFragment.getPackage();
        Intrinsics.checkNotNullExpressionValue(r5, "");
        this.OLrzqt = new C59216zcp(this, r5, this.DbNXlk, this.isConnected, this.AhwBna, c59083zaO, "scope of " + this, new C59093zaY(this));
    }

    public static final java.util.Collection OLrzqt(AbstractC59086zaR abstractC59086zaR) {
        java.util.Collection<C56929yXo> collectionCopydefault = abstractC59086zaR.djBIcL().copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionCopydefault) {
            C56929yXo c56929yXo = (C56929yXo) obj;
            if (!c56929yXo.valueOf() && !C59081zaM.AEQbTJ.KWHzl().contains(c56929yXo)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C56929yXo) it.next()).AYXKKw());
        }
        return arrayList2;
    }

    @Override // o.yNW
    public InterfaceC59098zad AEQbTJ() {
        InterfaceC59098zad interfaceC59098zad = this.OLrzqt;
        if (interfaceC59098zad != null) {
            return interfaceC59098zad;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
