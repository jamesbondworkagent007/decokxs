package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import o.InterfaceC56695yOx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yPP extends yPT implements InterfaceC56695yOx {
    public static final Activity AEQbTJ = new Activity(null);
    public final AbstractC59233zdF AhwBna;
    public final int EZpvd;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final InterfaceC56695yOx djBIcL;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final yPP OLrzqt(@NotNull InterfaceC56657yNm interfaceC56657yNm, InterfaceC56695yOx interfaceC56695yOx, int i, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, @NotNull AbstractC59233zdF abstractC59233zdF, boolean z, boolean z2, boolean z3, AbstractC59233zdF abstractC59233zdF2, @NotNull InterfaceC56686yOo interfaceC56686yOo, Function0<? extends java.util.List<? extends yOC>> function0) {
        return AEQbTJ.copydefault(interfaceC56657yNm, interfaceC56695yOx, i, yol, c56935yXu, abstractC59233zdF, z, z2, z3, abstractC59233zdF2, interfaceC56686yOo, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56695yOx
    public boolean AuCTel() {
        return this.valueOf;
    }

    @Override // o.yOC
    public boolean AubY() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56695yOx
    public AbstractC59233zdF ejfBZ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56695yOx
    public boolean fIwbmz() {
        return this.copydefault;
    }

    public java.lang.Void fJNWhG() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56695yOx
    public int isConnected() {
        return this.EZpvd;
    }

    @Override // o.yOC
    public boolean AuCTelauCTel() {
        return InterfaceC56695yOx.StateListAnimator.OLrzqt(this);
    }

    @Override // o.yOC
    public /* synthetic */ AbstractC56975yZg iwGUEr() {
        return (AbstractC56975yZg) fJNWhG();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yPP(@NotNull InterfaceC56657yNm interfaceC56657yNm, InterfaceC56695yOx interfaceC56695yOx, int i, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, @NotNull AbstractC59233zdF abstractC59233zdF, boolean z, boolean z2, boolean z3, AbstractC59233zdF abstractC59233zdF2, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        super(interfaceC56657yNm, yol, c56935yXu, abstractC59233zdF, interfaceC56686yOo);
        Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
        this.EZpvd = i;
        this.OLrzqt = z;
        this.copydefault = z2;
        this.valueOf = z3;
        this.AhwBna = abstractC59233zdF2;
        this.djBIcL = interfaceC56695yOx == null ? this : interfaceC56695yOx;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yPP.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final yPP copydefault(@NotNull InterfaceC56657yNm interfaceC56657yNm, InterfaceC56695yOx interfaceC56695yOx, int i, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, @NotNull AbstractC59233zdF abstractC59233zdF, boolean z, boolean z2, boolean z3, AbstractC59233zdF abstractC59233zdF2, @NotNull InterfaceC56686yOo interfaceC56686yOo, Function0<? extends java.util.List<? extends yOC>> function0) {
            Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
            Intrinsics.checkNotNullParameter(yol, "");
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
            Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
            if (function0 == null) {
                return new yPP(interfaceC56657yNm, interfaceC56695yOx, i, yol, c56935yXu, abstractC59233zdF, z, z2, z3, abstractC59233zdF2, interfaceC56686yOo);
            }
            return new Application(interfaceC56657yNm, interfaceC56695yOx, i, yol, c56935yXu, abstractC59233zdF, z, z2, z3, abstractC59233zdF2, interfaceC56686yOo, function0);
        }
    }

    public static final class Application extends yPP {
        public final InterfaceC56387yDm DbNXlk;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull InterfaceC56657yNm interfaceC56657yNm, InterfaceC56695yOx interfaceC56695yOx, int i, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, @NotNull AbstractC59233zdF abstractC59233zdF, boolean z, boolean z2, boolean z3, AbstractC59233zdF abstractC59233zdF2, @NotNull InterfaceC56686yOo interfaceC56686yOo, @NotNull Function0<? extends java.util.List<? extends yOC>> function0) {
            super(interfaceC56657yNm, interfaceC56695yOx, i, yol, c56935yXu, abstractC59233zdF, z, z2, z3, abstractC59233zdF2, interfaceC56686yOo);
            Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
            Intrinsics.checkNotNullParameter(yol, "");
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
            Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
            Intrinsics.checkNotNullParameter(function0, "");
            this.DbNXlk = C56392yDr.copydefault(function0);
        }

        public final java.util.List<yOC> getFieldNames() {
            return (java.util.List) this.DbNXlk.getValue();
        }

        @Override // o.yPP, o.InterfaceC56695yOx
        public InterfaceC56695yOx AEQbTJ(@NotNull InterfaceC56657yNm interfaceC56657yNm, @NotNull C56935yXu c56935yXu, int i) {
            Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            yOL yolCopydefault = copydefault();
            Intrinsics.checkNotNullExpressionValue(yolCopydefault, "");
            AbstractC59233zdF abstractC59233zdFUzCIH = uzCIH();
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
            boolean zEZpvd = EZpvd();
            boolean zFIwbmz = fIwbmz();
            boolean zAuCTel = AuCTel();
            AbstractC59233zdF abstractC59233zdFEjfBZ = ejfBZ();
            InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
            Intrinsics.checkNotNullExpressionValue(interfaceC56686yOo, "");
            return new Application(interfaceC56657yNm, null, i, yolCopydefault, c56935yXu, abstractC59233zdFUzCIH, zEZpvd, zFIwbmz, zAuCTel, abstractC59233zdFEjfBZ, interfaceC56686yOo, new yPX(this));
        }

        public static final java.util.List copydefault(Application application) {
            return application.getFieldNames();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AYXKKw()Lo/yNu; */
    @Override // o.AbstractC56709yPk, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC56657yNm AYXKKw() {
        InterfaceC56665yNu interfaceC56665yNuAYXKKw = super.AYXKKw();
        Intrinsics.copydefault(interfaceC56665yNuAYXKKw, "");
        return (InterfaceC56657yNm) interfaceC56665yNuAYXKKw;
    }

    @Override // o.InterfaceC56695yOx
    public boolean EZpvd() {
        if (this.OLrzqt) {
            InterfaceC56657yNm interfaceC56657yNmAYXKKw = AYXKKw();
            Intrinsics.copydefault(interfaceC56657yNmAYXKKw, "");
            if (((CallableMemberDescriptor) interfaceC56657yNmAYXKKw).bW_().isReal()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Lo/yNm; */
    /* JADX DEBUG: Method merged with bridge method: AwvSrB()Lo/yOC; */
    /* JADX DEBUG: Method merged with bridge method: DbNXlk()Lo/yNt; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    @Override // o.yPT, o.AbstractC56709yPk, o.AbstractC56711yPm, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: DbNXlk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC56695yOx bT_() {
        InterfaceC56695yOx interfaceC56695yOx = this.djBIcL;
        return interfaceC56695yOx == this ? this : interfaceC56695yOx.DbNXlk();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNv; */
    /* JADX DEBUG: Method merged with bridge method: copydefault(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yOC; */
    @Override // o.yOC
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC56695yOx copydefault(@NotNull TypeSubstitutor typeSubstitutor) {
        Intrinsics.checkNotNullParameter(typeSubstitutor, "");
        if (typeSubstitutor.EZpvd()) {
            return this;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(@NotNull InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        Intrinsics.checkNotNullParameter(interfaceC56667yNw, "");
        return interfaceC56667yNw.KWHzl(this, d);
    }

    @Override // o.InterfaceC56695yOx
    public InterfaceC56695yOx AEQbTJ(@NotNull InterfaceC56657yNm interfaceC56657yNm, @NotNull C56935yXu c56935yXu, int i) {
        Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        yOL yolCopydefault = copydefault();
        Intrinsics.checkNotNullExpressionValue(yolCopydefault, "");
        AbstractC59233zdF abstractC59233zdFUzCIH = uzCIH();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
        boolean zEZpvd = EZpvd();
        boolean zFIwbmz = fIwbmz();
        boolean zAuCTel = AuCTel();
        AbstractC59233zdF abstractC59233zdFEjfBZ = ejfBZ();
        InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
        Intrinsics.checkNotNullExpressionValue(interfaceC56686yOo, "");
        return new yPP(interfaceC56657yNm, null, i, yolCopydefault, c56935yXu, abstractC59233zdFUzCIH, zEZpvd, zFIwbmz, zAuCTel, abstractC59233zdFEjfBZ, interfaceC56686yOo);
    }

    @Override // o.InterfaceC56668yNx
    public yNC getNewProxyInstance() {
        yNC ync = C56669yNy.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(ync, "");
        return ync;
    }

    @Override // o.yPT, o.InterfaceC56657yNm
    public java.util.Collection<InterfaceC56695yOx> valueOf() {
        java.util.Collection<? extends InterfaceC56657yNm> collectionValueOf = AYXKKw().valueOf();
        Intrinsics.checkNotNullExpressionValue(collectionValueOf, "");
        java.util.Collection<? extends InterfaceC56657yNm> collection = collectionValueOf;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC56657yNm) it.next()).fetchVPNInfo().get(isConnected()));
        }
        return arrayList;
    }
}
