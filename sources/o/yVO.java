package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yVO {
    public C59083zaO AhwBna;
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public static final java.util.Set<KotlinClassHeader.Kind> KWHzl = yED.AEQbTJ(KotlinClassHeader.Kind.CLASS);
    public static final java.util.Set<KotlinClassHeader.Kind> djBIcL = yEE.AhwBna(KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
    public static final C56921yXg OLrzqt = new C56921yXg(1, 1, 2);
    public static final C56921yXg EZpvd = new C56921yXg(1, 1, 11);
    public static final C56921yXg copydefault = new C56921yXg(1, 1, 13);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull C59083zaO c59083zaO) {
        Intrinsics.checkNotNullParameter(c59083zaO, "");
        this.AhwBna = c59083zaO;
    }

    public final C59083zaO KWHzl() {
        C59083zaO c59083zaO = this.AhwBna;
        if (c59083zaO != null) {
            return c59083zaO;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C56921yXg copydefault() {
        return C59432zgt.EZpvd(KWHzl().OLrzqt());
    }

    public final void EZpvd(@NotNull yVP yvp) {
        Intrinsics.checkNotNullParameter(yvp, "");
        EZpvd(yvp.KWHzl());
    }

    public final boolean AhwBna() {
        return KWHzl().OLrzqt().copydefault();
    }

    public final InterfaceC56658yNn AhwBna(@NotNull InterfaceC56893yWf interfaceC56893yWf) {
        Intrinsics.checkNotNullParameter(interfaceC56893yWf, "");
        C59078zaJ c59078zaJEZpvd = EZpvd(interfaceC56893yWf);
        if (c59078zaJEZpvd == null) {
            return null;
        }
        return KWHzl().KWHzl().OLrzqt(interfaceC56893yWf.KWHzl(), c59078zaJEZpvd);
    }

    public final C59078zaJ EZpvd(@NotNull InterfaceC56893yWf interfaceC56893yWf) {
        java.lang.String[] strArrAhwBna;
        kotlin.Pair<C56926yXl, ProtoBuf.Class> pairEZpvd;
        Intrinsics.checkNotNullParameter(interfaceC56893yWf, "");
        java.lang.String[] strArrKWHzl = KWHzl(interfaceC56893yWf, KWHzl);
        if (strArrKWHzl == null || (strArrAhwBna = interfaceC56893yWf.EZpvd().AhwBna()) == null) {
            return null;
        }
        try {
            try {
                pairEZpvd = C56928yXn.EZpvd(strArrKWHzl, strArrAhwBna);
            } catch (InvalidProtocolBufferException e) {
                throw new java.lang.IllegalStateException("Could not read data from " + interfaceC56893yWf.OLrzqt(), e);
            }
        } catch (java.lang.Throwable th) {
            if (AhwBna() || interfaceC56893yWf.EZpvd().EZpvd().EZpvd(copydefault())) {
                throw th;
            }
            pairEZpvd = null;
        }
        if (pairEZpvd == null) {
            return null;
        }
        return new C59078zaJ(pairEZpvd.component1(), pairEZpvd.component2(), interfaceC56893yWf.EZpvd().EZpvd(), new C56891yWd(interfaceC56893yWf, OLrzqt(interfaceC56893yWf), KWHzl(interfaceC56893yWf), copydefault(interfaceC56893yWf)));
    }

    public final InterfaceC59098zad EZpvd(@NotNull yNW ynw, @NotNull InterfaceC56893yWf interfaceC56893yWf) {
        kotlin.Pair<C56926yXl, ProtoBuf.Package> pairCopydefault;
        Intrinsics.checkNotNullParameter(ynw, "");
        Intrinsics.checkNotNullParameter(interfaceC56893yWf, "");
        java.lang.String[] strArrKWHzl = KWHzl(interfaceC56893yWf, djBIcL);
        if (strArrKWHzl == null) {
            return null;
        }
        java.lang.String[] strArrAhwBna = interfaceC56893yWf.EZpvd().AhwBna();
        try {
            if (strArrAhwBna == null) {
                return null;
            }
            try {
                pairCopydefault = C56928yXn.copydefault(strArrKWHzl, strArrAhwBna);
            } catch (InvalidProtocolBufferException e) {
                throw new java.lang.IllegalStateException("Could not read data from " + interfaceC56893yWf.OLrzqt(), e);
            }
        } catch (java.lang.Throwable th) {
            if (AhwBna() || interfaceC56893yWf.EZpvd().EZpvd().EZpvd(copydefault())) {
                throw th;
            }
            pairCopydefault = null;
        }
        if (pairCopydefault == null) {
            return null;
        }
        C56926yXl c56926yXlComponent1 = pairCopydefault.component1();
        ProtoBuf.Package packageComponent2 = pairCopydefault.component2();
        yVS yvs = new yVS(interfaceC56893yWf, packageComponent2, c56926yXlComponent1, OLrzqt(interfaceC56893yWf), KWHzl(interfaceC56893yWf), copydefault(interfaceC56893yWf));
        return new C59216zcp(ynw, packageComponent2, c56926yXlComponent1, interfaceC56893yWf.EZpvd().EZpvd(), yvs, KWHzl(), "scope for " + yvs + " in " + ynw, yVV.OLrzqt);
    }

    public static final java.util.Collection AEQbTJ() {
        return yDY.AhwBna();
    }

    public final C59153zbf<C56921yXg> OLrzqt(InterfaceC56893yWf interfaceC56893yWf) {
        if (AhwBna() || interfaceC56893yWf.EZpvd().EZpvd().EZpvd(copydefault())) {
            return null;
        }
        return new C59153zbf<>(interfaceC56893yWf.EZpvd().EZpvd(), C56921yXg.KWHzl, copydefault(), copydefault().AEQbTJ(interfaceC56893yWf.EZpvd().EZpvd().EZpvd()), interfaceC56893yWf.OLrzqt(), interfaceC56893yWf.KWHzl());
    }

    public final boolean KWHzl(InterfaceC56893yWf interfaceC56893yWf) {
        return (KWHzl().OLrzqt().KWHzl() && (interfaceC56893yWf.EZpvd().valueOf() || Intrinsics.EZpvd(interfaceC56893yWf.EZpvd().EZpvd(), OLrzqt))) || AEQbTJ(interfaceC56893yWf);
    }

    public final boolean AEQbTJ(InterfaceC56893yWf interfaceC56893yWf) {
        return !KWHzl().OLrzqt().AYXKKw() && interfaceC56893yWf.EZpvd().valueOf() && Intrinsics.EZpvd(interfaceC56893yWf.EZpvd().EZpvd(), EZpvd);
    }

    public final DeserializedContainerAbiStability copydefault(InterfaceC56893yWf interfaceC56893yWf) {
        return KWHzl().OLrzqt().AEQbTJ() ? DeserializedContainerAbiStability.STABLE : interfaceC56893yWf.EZpvd().AYXKKw() ? DeserializedContainerAbiStability.UNSTABLE : DeserializedContainerAbiStability.STABLE;
    }

    public final java.lang.String[] KWHzl(InterfaceC56893yWf interfaceC56893yWf, java.util.Set<? extends KotlinClassHeader.Kind> set) {
        KotlinClassHeader kotlinClassHeaderEZpvd = interfaceC56893yWf.EZpvd();
        java.lang.String[] strArrCopydefault = kotlinClassHeaderEZpvd.copydefault();
        if (strArrCopydefault == null) {
            strArrCopydefault = kotlinClassHeaderEZpvd.OLrzqt();
        }
        if (strArrCopydefault == null || !set.contains(kotlinClassHeaderEZpvd.KWHzl())) {
            return null;
        }
        return strArrCopydefault;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yVO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C56921yXg KWHzl() {
            return yVO.copydefault;
        }
    }
}
