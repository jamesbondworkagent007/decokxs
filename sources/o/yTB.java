package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yTB extends AbstractC59325zes {
    public static final C56829yTw AEQbTJ;
    public static final Activity EZpvd = new Activity(null);
    public static final C56829yTw KWHzl;
    public final yTE OLrzqt;
    public final C59320zen copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yTB() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // o.AbstractC59325zes
    public boolean EZpvd() {
        return false;
    }

    public yTB(C59320zen c59320zen) {
        yTE yte = new yTE();
        this.OLrzqt = yte;
        if (c59320zen == null) {
            c59320zen = new C59320zen(yte, null, 2, 0 == true ? 1 : 0);
        }
        this.copydefault = c59320zen;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.zen:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.zen) : (r1v0 o.zen))
 A[MD:(o.zen):void (m)] (LINE:18) call: o.yTB.<init>(o.zen):void type: THIS */
    public /* synthetic */ yTB(C59320zen c59320zen, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c59320zen);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/zdF;)Lo/zek; */
    @Override // o.AbstractC59325zes
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C59323zeq copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return new C59323zeq(eraseType$default(this, abstractC59233zdF, null, 2, null));
    }

    public static /* synthetic */ AbstractC59233zdF eraseType$default(yTB ytb, AbstractC59233zdF abstractC59233zdF, C56829yTw c56829yTw, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c56829yTw = new C56829yTw(TypeUsage.COMMON, null, false, false, null, null, 62, null);
        }
        return ytb.KWHzl(abstractC59233zdF, c56829yTw);
    }

    public final AbstractC59233zdF KWHzl(AbstractC59233zdF abstractC59233zdF, C56829yTw c56829yTw) {
        InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdF.djBIcL().OLrzqt();
        if (interfaceC56663yNsKWHzl instanceof InterfaceC56691yOt) {
            return KWHzl(this.copydefault.AEQbTJ((InterfaceC56691yOt) interfaceC56663yNsKWHzl, c56829yTw.OLrzqt(true)), c56829yTw);
        }
        if (interfaceC56663yNsKWHzl instanceof InterfaceC56658yNn) {
            InterfaceC56663yNs interfaceC56663yNsKWHzl2 = C59278zdy.OLrzqt(abstractC59233zdF).djBIcL().OLrzqt();
            if (!(interfaceC56663yNsKWHzl2 instanceof InterfaceC56658yNn)) {
                throw new java.lang.IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC56663yNsKWHzl2 + "\" while for lower it's \"" + interfaceC56663yNsKWHzl + '\"').toString());
            }
            kotlin.Pair<AbstractC59242zdO, java.lang.Boolean> pairKWHzl = KWHzl(C59278zdy.KWHzl(abstractC59233zdF), (InterfaceC56658yNn) interfaceC56663yNsKWHzl, KWHzl);
            AbstractC59242zdO abstractC59242zdOComponent1 = pairKWHzl.component1();
            boolean zBooleanValue = pairKWHzl.component2().booleanValue();
            kotlin.Pair<AbstractC59242zdO, java.lang.Boolean> pairKWHzl2 = KWHzl(C59278zdy.OLrzqt(abstractC59233zdF), (InterfaceC56658yNn) interfaceC56663yNsKWHzl2, AEQbTJ);
            AbstractC59242zdO abstractC59242zdOComponent12 = pairKWHzl2.component1();
            boolean zBooleanValue2 = pairKWHzl2.component2().booleanValue();
            if (zBooleanValue || zBooleanValue2) {
                return new yTI(abstractC59242zdOComponent1, abstractC59242zdOComponent12);
            }
            return C59231zdD.copydefault(abstractC59242zdOComponent1, abstractC59242zdOComponent12);
        }
        throw new java.lang.IllegalStateException(("Unexpected declaration kind: " + interfaceC56663yNsKWHzl).toString());
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.zdr.computeProjection$default(o.zdr, o.yOt, o.zdu, o.zen, o.zdF, int, java.lang.Object):o.zek */
    public final kotlin.Pair<AbstractC59242zdO, java.lang.Boolean> KWHzl(AbstractC59242zdO abstractC59242zdO, InterfaceC56658yNn interfaceC56658yNn, C56829yTw c56829yTw) {
        if (abstractC59242zdO.djBIcL().copydefault().isEmpty()) {
            return C56390yDp.OLrzqt(abstractC59242zdO, java.lang.Boolean.FALSE);
        }
        if (AbstractC56640yMw.OLrzqt(abstractC59242zdO)) {
            InterfaceC59317zek interfaceC59317zek = abstractC59242zdO.bY_().get(0);
            Variance varianceEZpvd = interfaceC59317zek.EZpvd();
            AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
            return C56390yDp.OLrzqt(C59231zdD.simpleType$default(abstractC59242zdO.bX_(), abstractC59242zdO.djBIcL(), C56402yEa.EZpvd(new C59323zeq(varianceEZpvd, KWHzl(abstractC59233zdFOLrzqt, c56829yTw))), abstractC59242zdO.AEQbTJ(), (AbstractC59287zeG) null, 16, (java.lang.Object) null), java.lang.Boolean.FALSE);
        }
        if (C59238zdK.AEQbTJ(abstractC59242zdO)) {
            return C56390yDp.OLrzqt(C59370zfk.EZpvd(ErrorTypeKind.ERROR_RAW_TYPE, abstractC59242zdO.djBIcL().toString()), java.lang.Boolean.FALSE);
        }
        InterfaceC59098zad interfaceC59098zadCopydefault = interfaceC56658yNn.copydefault(this);
        Intrinsics.checkNotNullExpressionValue(interfaceC59098zadCopydefault, "");
        C59308zeb c59308zebBX_ = abstractC59242zdO.bX_();
        InterfaceC59315zei interfaceC59315zeiFJNWhG = interfaceC56658yNn.fJNWhG();
        Intrinsics.checkNotNullExpressionValue(interfaceC59315zeiFJNWhG, "");
        java.util.List<InterfaceC56691yOt> listCopydefault = interfaceC56658yNn.fJNWhG().copydefault();
        Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (InterfaceC56691yOt interfaceC56691yOt : listCopydefault) {
            yTE yte = this.OLrzqt;
            Intrinsics.copydefault(interfaceC56691yOt);
            arrayList.add(C59271zdr.computeProjection$default(yte, interfaceC56691yOt, c56829yTw, this.copydefault, null, 8, null));
        }
        return C56390yDp.OLrzqt(C59231zdD.KWHzl(c59308zebBX_, interfaceC59315zeiFJNWhG, arrayList, abstractC59242zdO.AEQbTJ(), interfaceC59098zadCopydefault, new yTJ(interfaceC56658yNn, this, abstractC59242zdO, c56829yTw)), java.lang.Boolean.TRUE);
    }

    public static final AbstractC59242zdO AEQbTJ(InterfaceC56658yNn interfaceC56658yNn, yTB ytb, AbstractC59242zdO abstractC59242zdO, C56829yTw c56829yTw, AbstractC59287zeG abstractC59287zeG) {
        InterfaceC56658yNn interfaceC56658yNnKWHzl;
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        C56929yXo c56929yXoEZpvd = yZE.EZpvd((InterfaceC56663yNs) interfaceC56658yNn);
        if (c56929yXoEZpvd == null || (interfaceC56658yNnKWHzl = abstractC59287zeG.KWHzl(c56929yXoEZpvd)) == null || Intrinsics.EZpvd(interfaceC56658yNnKWHzl, interfaceC56658yNn)) {
            return null;
        }
        return ytb.KWHzl(abstractC59242zdO, interfaceC56658yNnKWHzl, c56829yTw).getFirst();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yTB.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yTy.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage, boolean, boolean, o.yOt, int, java.lang.Object):o.yTw */
    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        KWHzl = C56831yTy.toAttributes$default(typeUsage, false, true, null, 5, null).KWHzl(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        AEQbTJ = C56831yTy.toAttributes$default(typeUsage, false, true, null, 5, null).KWHzl(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }
}
