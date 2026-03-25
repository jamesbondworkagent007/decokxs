package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import o.C56929yXo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ySZ extends yPE {
    public static final /* synthetic */ yJA<java.lang.Object>[] OLrzqt = {C56524yIo.copydefault(new PropertyReference1Impl(ySZ.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(ySZ.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0))};
    public final yOL AEQbTJ;
    public final InterfaceC56840yUg AhwBna;
    public final C56805ySz AkhnZx;
    public final InterfaceC59182zcH<java.util.List<C56933yXs>> DbNXlk;
    public final InterfaceC59182zcH djBIcL;
    public final InterfaceC59182zcH fetchVPNInfo;
    public final C56921yXg isConnected;
    public final C56794ySo valueOf;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yOH, o.yOB
    public yOL copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lo/zad; */
    @Override // o.yNW
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public C56805ySz AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ySZ(@NotNull C56794ySo c56794ySo, @NotNull InterfaceC56840yUg interfaceC56840yUg) {
        super(c56794ySo.AEQbTJ(), interfaceC56840yUg.OLrzqt());
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(interfaceC56840yUg, "");
        this.AhwBna = interfaceC56840yUg;
        C56794ySo c56794ySoChildForClassOrPackage$default = C56784ySe.childForClassOrPackage$default(c56794ySo, this, null, 0, 6, null);
        this.valueOf = c56794ySoChildForClassOrPackage$default;
        this.isConnected = C59432zgt.EZpvd(c56794ySo.copydefault().KWHzl().KWHzl().OLrzqt());
        this.djBIcL = c56794ySoChildForClassOrPackage$default.EZpvd().KWHzl(new C56808yTb(this));
        this.AkhnZx = new C56805ySz(c56794ySoChildForClassOrPackage$default, interfaceC56840yUg, this);
        this.DbNXlk = c56794ySoChildForClassOrPackage$default.EZpvd().EZpvd(new ySX(this), yDY.AhwBna());
        this.AEQbTJ = c56794ySoChildForClassOrPackage$default.copydefault().AYXKKw().OLrzqt() ? yOL.KWHzl.OLrzqt() : C56795ySp.OLrzqt(c56794ySoChildForClassOrPackage$default, interfaceC56840yUg);
        this.fetchVPNInfo = c56794ySoChildForClassOrPackage$default.EZpvd().KWHzl(new ySY(this));
    }

    public final java.util.Map<java.lang.String, InterfaceC56893yWf> AhwBna() {
        return (java.util.Map) C59183zcI.AEQbTJ(this.djBIcL, this, OLrzqt[0]);
    }

    public static final java.util.Map OLrzqt(ySZ ysz) {
        java.util.List<java.lang.String> listCopydefault = ysz.valueOf.copydefault().isConnected().copydefault(ysz.KWHzl().KWHzl());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : listCopydefault) {
            C56929yXo.ActionBar actionBar = C56929yXo.AEQbTJ;
            C56933yXs c56933yXsOLrzqt = yZQ.copydefault(str).OLrzqt();
            Intrinsics.checkNotNullExpressionValue(c56933yXsOLrzqt, "");
            InterfaceC56893yWf interfaceC56893yWfOLrzqt = yVZ.OLrzqt(ysz.valueOf.copydefault().valueOf(), actionBar.KWHzl(c56933yXsOLrzqt), ysz.isConnected);
            kotlin.Pair pairOLrzqt = interfaceC56893yWfOLrzqt != null ? C56390yDp.OLrzqt(str, interfaceC56893yWfOLrzqt) : null;
            if (pairOLrzqt != null) {
                arrayList.add(pairOLrzqt);
            }
        }
        return C56424yEw.copydefault(arrayList);
    }

    public static final java.util.List djBIcL(ySZ ysz) {
        java.util.Collection<InterfaceC56840yUg> collectionCopydefault = ysz.AhwBna.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collectionCopydefault, 10));
        java.util.Iterator<T> it = collectionCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC56840yUg) it.next()).OLrzqt());
        }
        return arrayList;
    }

    public final java.util.List<C56933yXs> valueOf() {
        return this.DbNXlk.invoke();
    }

    public final InterfaceC56658yNn OLrzqt(@NotNull yTT ytt) {
        Intrinsics.checkNotNullParameter(ytt, "");
        return this.AkhnZx.OLrzqt().AEQbTJ(ytt);
    }

    public static final java.util.HashMap KWHzl(ySZ ysz) {
        java.util.HashMap map = new java.util.HashMap();
        for (Map.Entry<java.lang.String, InterfaceC56893yWf> entry : ysz.AhwBna().entrySet()) {
            java.lang.String key = entry.getKey();
            InterfaceC56893yWf value = entry.getValue();
            yZQ yzqCopydefault = yZQ.copydefault(key);
            Intrinsics.checkNotNullExpressionValue(yzqCopydefault, "");
            KotlinClassHeader kotlinClassHeaderEZpvd = value.EZpvd();
            int i = StateListAnimator.KWHzl[kotlinClassHeaderEZpvd.KWHzl().ordinal()];
            if (i == 1) {
                java.lang.String strAEQbTJ = kotlinClassHeaderEZpvd.AEQbTJ();
                if (strAEQbTJ != null) {
                    map.put(yzqCopydefault, yZQ.copydefault(strAEQbTJ));
                }
            } else if (i == 2) {
                map.put(yzqCopydefault, yzqCopydefault);
            }
        }
        return map;
    }

    @Override // o.yPE, o.AbstractC56711yPm
    public java.lang.String toString() {
        return "Lazy Java package fragment: " + KWHzl() + " of module " + this.valueOf.copydefault().fetchVPNInfo();
    }

    @Override // o.yPE, o.AbstractC56709yPk, o.InterfaceC56664yNt
    public InterfaceC56686yOo fARcdN() {
        return new C56892yWe(this);
    }
}
