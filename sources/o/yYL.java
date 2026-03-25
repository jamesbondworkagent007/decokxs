package o;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import o.InterfaceC59282zeB;
import o.InterfaceC59284zeD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yYL implements InterfaceC59282zeB {
    public final AbstractC59287zeG AEQbTJ;
    public final AbstractC59281zeA EZpvd;
    public final InterfaceC59284zeD.TaskDescription KWHzl;
    public final java.util.Map<InterfaceC59315zei, InterfaceC59315zei> OLrzqt;
    public final Function2<AbstractC59233zdF, AbstractC59233zdF, java.lang.Boolean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59384zfy
    public java.util.List<InterfaceC59380zfu> KWHzl(InterfaceC59381zfv interfaceC59381zfv, InterfaceC59385zfz interfaceC59385zfz) {
        Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
        Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<o.zei, ? extends o.zei> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super o.zdF, ? super o.zdF, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public yYL(java.util.Map<InterfaceC59315zei, ? extends InterfaceC59315zei> map, @NotNull InterfaceC59284zeD.TaskDescription taskDescription, @NotNull AbstractC59287zeG abstractC59287zeG, @NotNull AbstractC59281zeA abstractC59281zeA, Function2<? super AbstractC59233zdF, ? super AbstractC59233zdF, java.lang.Boolean> function2) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        Intrinsics.checkNotNullParameter(abstractC59281zeA, "");
        this.OLrzqt = map;
        this.KWHzl = taskDescription;
        this.AEQbTJ = abstractC59287zeG;
        this.EZpvd = abstractC59281zeA;
        this.copydefault = function2;
    }

    @Override // o.InterfaceC59384zfy
    public int AEQbTJ(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        return InterfaceC59282zeB.Application.copydefault(this, interfaceC59382zfw);
    }

    @Override // o.InterfaceC59324zer
    public PrimitiveType AEQbTJ(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.AEQbTJ(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59384zfy
    public TypeVariance AEQbTJ(@NotNull InterfaceC59334zfA interfaceC59334zfA) {
        return InterfaceC59282zeB.Application.KWHzl(this, interfaceC59334zfA);
    }

    @Override // o.InterfaceC59384zfy
    public TypeVariance AEQbTJ(@NotNull InterfaceC59383zfx interfaceC59383zfx) {
        return InterfaceC59282zeB.Application.copydefault(this, interfaceC59383zfx);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59376zfq AEQbTJ(@NotNull InterfaceC59374zfo interfaceC59374zfo) {
        return InterfaceC59282zeB.Application.AEQbTJ((InterfaceC59282zeB) this, interfaceC59374zfo);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/zfv;Z)Lo/zfv; */
    @Override // o.InterfaceC59384zfy
    /* JADX INFO: renamed from: AEQbTJ */
    public InterfaceC59380zfu copydefault(@NotNull InterfaceC59381zfv interfaceC59381zfv, boolean z) {
        return InterfaceC59282zeB.Application.copydefault((InterfaceC59282zeB) this, interfaceC59381zfv, z);
    }

    @Override // o.InterfaceC59338zfE
    public boolean AEQbTJ() {
        return InterfaceC59282zeB.Application.copydefault(this);
    }

    @Override // o.InterfaceC59384zfy
    public boolean AEQbTJ(@NotNull InterfaceC59377zfr interfaceC59377zfr) {
        return InterfaceC59282zeB.Application.EZpvd((InterfaceC59282zeB) this, interfaceC59377zfr);
    }

    @Override // o.InterfaceC59337zfD
    public boolean AEQbTJ(@NotNull InterfaceC59381zfv interfaceC59381zfv, @NotNull InterfaceC59381zfv interfaceC59381zfv2) {
        return InterfaceC59282zeB.Application.EZpvd(this, interfaceC59381zfv, interfaceC59381zfv2);
    }

    @Override // o.InterfaceC59384zfy
    public java.util.List<InterfaceC59334zfA> AYXKKw(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        return InterfaceC59282zeB.Application.KWHzl(this, interfaceC59382zfw);
    }

    @Override // o.InterfaceC59282zeB, o.InterfaceC59384zfy
    public boolean AYXKKw(@NotNull InterfaceC59381zfv interfaceC59381zfv) {
        return InterfaceC59282zeB.Application.AEQbTJ((InterfaceC59282zeB) this, interfaceC59381zfv);
    }

    @Override // o.InterfaceC59384zfy
    public boolean AYXKKw(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.AhwBna(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59384zfy
    public boolean AhwBna(@NotNull InterfaceC59381zfv interfaceC59381zfv) {
        return InterfaceC59282zeB.Application.copydefault((InterfaceC59282zeB) this, interfaceC59381zfv);
    }

    @Override // o.InterfaceC59384zfy
    public boolean AhwBna(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.AYXKKw(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59384zfy
    public int AkhnZx(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.AkhnZx(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59384zfy
    public java.util.Collection<InterfaceC59382zfw> AkhnZx(@NotNull InterfaceC59381zfv interfaceC59381zfv) {
        return InterfaceC59282zeB.Application.AhwBna((InterfaceC59282zeB) this, interfaceC59381zfv);
    }

    @Override // o.InterfaceC59384zfy
    public boolean AkhnZx(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        return InterfaceC59282zeB.Application.AYXKKw(this, interfaceC59382zfw);
    }

    @Override // o.InterfaceC59384zfy
    public java.util.Collection<InterfaceC59382zfw> AuCTel(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.fJNWhG(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59384zfy
    public boolean DbNXlk(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.DbNXlk(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59384zfy
    public java.util.List<InterfaceC59383zfx> EZpvd(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.EZpvd(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59334zfA EZpvd(@NotNull InterfaceC59371zfl interfaceC59371zfl) {
        return InterfaceC59282zeB.Application.EZpvd((InterfaceC59282zeB) this, interfaceC59371zfl);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59378zfs EZpvd(@NotNull InterfaceC59381zfv interfaceC59381zfv) {
        return InterfaceC59282zeB.Application.OLrzqt((InterfaceC59282zeB) this, interfaceC59381zfv);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/zfo;)Lo/zfv; */
    @Override // o.InterfaceC59384zfy
    /* JADX INFO: renamed from: EZpvd */
    public InterfaceC59380zfu OLrzqt(@NotNull InterfaceC59374zfo interfaceC59374zfo) {
        return InterfaceC59282zeB.Application.KWHzl((InterfaceC59282zeB) this, interfaceC59374zfo);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/zfw;)Lo/zfv; */
    @Override // o.InterfaceC59384zfy
    /* JADX INFO: renamed from: EZpvd */
    public InterfaceC59380zfu OLrzqt(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        return InterfaceC59282zeB.Application.OLrzqt(this, interfaceC59382zfw);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59382zfw EZpvd(@NotNull InterfaceC59382zfw interfaceC59382zfw, boolean z) {
        return InterfaceC59282zeB.Application.copydefault(this, interfaceC59382zfw, z);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59383zfx EZpvd(@NotNull InterfaceC59385zfz interfaceC59385zfz, int i) {
        return InterfaceC59282zeB.Application.OLrzqt(this, interfaceC59385zfz, i);
    }

    @Override // o.InterfaceC59282zeB, o.InterfaceC59384zfy
    public boolean EZpvd(@NotNull InterfaceC59334zfA interfaceC59334zfA) {
        return InterfaceC59282zeB.Application.EZpvd(this, interfaceC59334zfA);
    }

    @Override // o.InterfaceC59384zfy
    public boolean EZpvd(@NotNull InterfaceC59377zfr interfaceC59377zfr) {
        return InterfaceC59282zeB.Application.copydefault((InterfaceC59282zeB) this, interfaceC59377zfr);
    }

    @Override // o.InterfaceC59384zfy
    public boolean EZpvd(@NotNull InterfaceC59380zfu interfaceC59380zfu) {
        return InterfaceC59282zeB.Application.AEQbTJ((InterfaceC59282zeB) this, interfaceC59380zfu);
    }

    @Override // o.InterfaceC59384zfy
    public CaptureStatus KWHzl(@NotNull InterfaceC59377zfr interfaceC59377zfr) {
        return InterfaceC59282zeB.Application.AEQbTJ((InterfaceC59282zeB) this, interfaceC59377zfr);
    }

    @Override // o.InterfaceC59324zer
    public C56930yXp KWHzl(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.OLrzqt(this, interfaceC59385zfz);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/zfv;Lkotlin/reflect/jvm/internal/impl/types/model/CaptureStatus;)Lo/zfv; */
    @Override // o.InterfaceC59384zfy
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AbstractC59242zdO OLrzqt(@NotNull InterfaceC59381zfv interfaceC59381zfv, @NotNull CaptureStatus captureStatus) {
        return InterfaceC59282zeB.Application.EZpvd(this, interfaceC59381zfv, captureStatus);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59373zfn KWHzl(@NotNull InterfaceC59381zfv interfaceC59381zfv) {
        return InterfaceC59282zeB.Application.EZpvd((InterfaceC59282zeB) this, interfaceC59381zfv);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59374zfo KWHzl(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        return InterfaceC59282zeB.Application.EZpvd(this, interfaceC59382zfw);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59380zfu KWHzl(@NotNull InterfaceC59373zfn interfaceC59373zfn) {
        return InterfaceC59282zeB.Application.KWHzl((InterfaceC59282zeB) this, interfaceC59373zfn);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/zfo;)Lo/zfv; */
    @Override // o.InterfaceC59384zfy
    /* JADX INFO: renamed from: KWHzl */
    public InterfaceC59380zfu copydefault(@NotNull InterfaceC59374zfo interfaceC59374zfo) {
        return InterfaceC59282zeB.Application.EZpvd((InterfaceC59282zeB) this, interfaceC59374zfo);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59382zfw KWHzl(@NotNull java.util.Collection<? extends InterfaceC59382zfw> collection) {
        return InterfaceC59282zeB.Application.AEQbTJ(this, collection);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59382zfw KWHzl(@NotNull InterfaceC59382zfw interfaceC59382zfw, boolean z) {
        return InterfaceC59282zeB.Application.EZpvd(this, interfaceC59382zfw, z);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59383zfx KWHzl(@NotNull InterfaceC59339zfF interfaceC59339zfF) {
        return InterfaceC59282zeB.Application.KWHzl((InterfaceC59282zeB) this, interfaceC59339zfF);
    }

    @Override // o.InterfaceC59384zfy
    public boolean KWHzl(@NotNull InterfaceC59383zfx interfaceC59383zfx, InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.EZpvd(this, interfaceC59383zfx, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59324zer
    public PrimitiveType OLrzqt(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.KWHzl(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59371zfl OLrzqt(@NotNull InterfaceC59377zfr interfaceC59377zfr) {
        return InterfaceC59282zeB.Application.KWHzl((InterfaceC59282zeB) this, interfaceC59377zfr);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59382zfw OLrzqt(@NotNull InterfaceC59334zfA interfaceC59334zfA) {
        return InterfaceC59282zeB.Application.copydefault(this, interfaceC59334zfA);
    }

    @Override // o.InterfaceC59324zer
    public InterfaceC59382zfw OLrzqt(@NotNull InterfaceC59383zfx interfaceC59383zfx) {
        return InterfaceC59282zeB.Application.EZpvd(this, interfaceC59383zfx);
    }

    @Override // o.InterfaceC59324zer
    public boolean OLrzqt(@NotNull InterfaceC59382zfw interfaceC59382zfw, @NotNull C56933yXs c56933yXs) {
        return InterfaceC59282zeB.Application.OLrzqt(this, interfaceC59382zfw, c56933yXs);
    }

    @Override // o.InterfaceC59384zfy
    public java.util.List<InterfaceC59382zfw> copydefault(@NotNull InterfaceC59383zfx interfaceC59383zfx) {
        return InterfaceC59282zeB.Application.AEQbTJ(this, interfaceC59383zfx);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59334zfA copydefault(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        return InterfaceC59282zeB.Application.AEQbTJ(this, interfaceC59382zfw);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59334zfA copydefault(@NotNull InterfaceC59382zfw interfaceC59382zfw, int i) {
        return InterfaceC59282zeB.Application.EZpvd(this, interfaceC59382zfw, i);
    }

    @Override // o.InterfaceC59282zeB, o.InterfaceC59384zfy
    public InterfaceC59377zfr copydefault(@NotNull InterfaceC59380zfu interfaceC59380zfu) {
        return InterfaceC59282zeB.Application.OLrzqt((InterfaceC59282zeB) this, interfaceC59380zfu);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59382zfw copydefault(@NotNull InterfaceC59377zfr interfaceC59377zfr) {
        return InterfaceC59282zeB.Application.OLrzqt((InterfaceC59282zeB) this, interfaceC59377zfr);
    }

    @Override // o.InterfaceC59282zeB
    public InterfaceC59382zfw copydefault(@NotNull InterfaceC59381zfv interfaceC59381zfv, @NotNull InterfaceC59381zfv interfaceC59381zfv2) {
        return InterfaceC59282zeB.Application.copydefault(this, interfaceC59381zfv, interfaceC59381zfv2);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59383zfx copydefault(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.copydefault(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59324zer
    public InterfaceC59382zfw djBIcL(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        return InterfaceC59282zeB.Application.valueOf(this, interfaceC59382zfw);
    }

    @Override // o.InterfaceC59324zer
    public boolean djBIcL(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.valueOf(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59384zfy
    public boolean ejfBZ(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        return InterfaceC59282zeB.Application.DbNXlk(this, interfaceC59382zfw);
    }

    @Override // o.InterfaceC59384zfy
    public boolean fARcdN(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        return InterfaceC59282zeB.Application.values(this, interfaceC59382zfw);
    }

    @Override // o.InterfaceC59384zfy
    public boolean fIwbmz(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        return InterfaceC59282zeB.Application.AhwBna(this, interfaceC59382zfw);
    }

    @Override // o.InterfaceC59282zeB, o.InterfaceC59384zfy
    public InterfaceC59385zfz fetchVPNInfo(@NotNull InterfaceC59381zfv interfaceC59381zfv) {
        return InterfaceC59282zeB.Application.AYXKKw((InterfaceC59282zeB) this, interfaceC59381zfv);
    }

    @Override // o.InterfaceC59324zer
    public boolean fetchVPNInfo(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.fetchVPNInfo(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59384zfy
    public boolean gEmmrt(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.gEmmrt(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59384zfy
    public boolean isConnected(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        return InterfaceC59282zeB.Application.gEmmrt(this, interfaceC59382zfw);
    }

    @Override // o.InterfaceC59384zfy
    public boolean isConnected(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.values(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59384zfy
    public boolean valueOf(@NotNull InterfaceC59381zfv interfaceC59381zfv) {
        return InterfaceC59282zeB.Application.KWHzl((InterfaceC59282zeB) this, interfaceC59381zfv);
    }

    @Override // o.InterfaceC59384zfy
    public boolean valueOf(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.djBIcL(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59384zfy
    public TypeCheckerState.ActionBar values(@NotNull InterfaceC59381zfv interfaceC59381zfv) {
        return InterfaceC59282zeB.Application.valueOf((InterfaceC59282zeB) this, interfaceC59381zfv);
    }

    @Override // o.InterfaceC59384zfy
    public boolean values(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        return InterfaceC59282zeB.Application.djBIcL(this, interfaceC59382zfw);
    }

    @Override // o.InterfaceC59384zfy
    public boolean values(@NotNull InterfaceC59385zfz interfaceC59385zfz) {
        return InterfaceC59282zeB.Application.isConnected(this, interfaceC59385zfz);
    }

    @Override // o.InterfaceC59384zfy
    public boolean copydefault(@NotNull InterfaceC59385zfz interfaceC59385zfz, @NotNull InterfaceC59385zfz interfaceC59385zfz2) {
        Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
        Intrinsics.checkNotNullParameter(interfaceC59385zfz2, "");
        if (!(interfaceC59385zfz instanceof InterfaceC59315zei)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (interfaceC59385zfz2 instanceof InterfaceC59315zei) {
            return InterfaceC59282zeB.Application.AEQbTJ(this, interfaceC59385zfz, interfaceC59385zfz2) || OLrzqt((InterfaceC59315zei) interfaceC59385zfz, (InterfaceC59315zei) interfaceC59385zfz2);
        }
        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
    }

    public TypeCheckerState OLrzqt(boolean z, boolean z2) {
        if (this.copydefault == null) {
            return C59328zev.EZpvd(z, z2, this, this.EZpvd, this.AEQbTJ);
        }
        return new Application(z, z2, this, this.EZpvd, this.AEQbTJ);
    }

    public static final class Application extends TypeCheckerState {
        public final /* synthetic */ yYL AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(boolean z, boolean z2, yYL yyl, AbstractC59281zeA abstractC59281zeA, AbstractC59287zeG abstractC59287zeG) {
            super(z, z2, true, yyl, abstractC59281zeA, abstractC59287zeG);
            this.AEQbTJ = yyl;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState
        public boolean OLrzqt(InterfaceC59382zfw interfaceC59382zfw, InterfaceC59382zfw interfaceC59382zfw2) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            Intrinsics.checkNotNullParameter(interfaceC59382zfw2, "");
            if (!(interfaceC59382zfw instanceof AbstractC59233zdF)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (interfaceC59382zfw2 instanceof AbstractC59233zdF) {
                return ((java.lang.Boolean) this.AEQbTJ.copydefault.invoke(interfaceC59382zfw, interfaceC59382zfw2)).booleanValue();
            }
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // o.InterfaceC59324zer
    public InterfaceC59382zfw uzCIH(InterfaceC59382zfw interfaceC59382zfw) {
        InterfaceC59381zfv interfaceC59381zfvCopydefault;
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        InterfaceC59381zfv interfaceC59381zfvOLrzqt = OLrzqt(interfaceC59382zfw);
        return (interfaceC59381zfvOLrzqt == null || (interfaceC59381zfvCopydefault = copydefault(interfaceC59381zfvOLrzqt, true)) == null) ? interfaceC59382zfw : interfaceC59381zfvCopydefault;
    }

    public final boolean OLrzqt(InterfaceC59315zei interfaceC59315zei, InterfaceC59315zei interfaceC59315zei2) {
        if (this.KWHzl.AEQbTJ(interfaceC59315zei, interfaceC59315zei2)) {
            return true;
        }
        java.util.Map<InterfaceC59315zei, InterfaceC59315zei> map = this.OLrzqt;
        if (map == null) {
            return false;
        }
        InterfaceC59315zei interfaceC59315zei3 = map.get(interfaceC59315zei);
        InterfaceC59315zei interfaceC59315zei4 = this.OLrzqt.get(interfaceC59315zei2);
        if (interfaceC59315zei3 == null || !Intrinsics.EZpvd(interfaceC59315zei3, interfaceC59315zei2)) {
            return interfaceC59315zei4 != null && Intrinsics.EZpvd(interfaceC59315zei4, interfaceC59315zei);
        }
        return true;
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59377zfr OLrzqt(InterfaceC59381zfv interfaceC59381zfv) {
        Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
        return copydefault(djBIcL(interfaceC59381zfv));
    }

    @Override // o.InterfaceC59384zfy
    public boolean valueOf(InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        InterfaceC59381zfv interfaceC59381zfvOLrzqt = OLrzqt(interfaceC59382zfw);
        return (interfaceC59381zfvOLrzqt != null ? OLrzqt(interfaceC59381zfvOLrzqt) : null) != null;
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59380zfu djBIcL(InterfaceC59381zfv interfaceC59381zfv) {
        InterfaceC59380zfu interfaceC59380zfuKWHzl;
        Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
        InterfaceC59373zfn interfaceC59373zfnKWHzl = KWHzl(interfaceC59381zfv);
        return (interfaceC59373zfnKWHzl == null || (interfaceC59380zfuKWHzl = KWHzl(interfaceC59373zfnKWHzl)) == null) ? (InterfaceC59380zfu) interfaceC59381zfv : interfaceC59380zfuKWHzl;
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59382zfw hDKMBd(InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        return KWHzl(interfaceC59382zfw, false);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59334zfA KWHzl(InterfaceC59381zfv interfaceC59381zfv, int i) {
        Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
        if (i < 0 || i >= AEQbTJ((InterfaceC59382zfw) interfaceC59381zfv)) {
            return null;
        }
        return copydefault(interfaceC59381zfv, i);
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59381zfv fJNWhG(InterfaceC59382zfw interfaceC59382zfw) {
        InterfaceC59381zfv interfaceC59381zfvCopydefault;
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        InterfaceC59374zfo interfaceC59374zfoKWHzl = KWHzl(interfaceC59382zfw);
        if (interfaceC59374zfoKWHzl != null && (interfaceC59381zfvCopydefault = copydefault(interfaceC59374zfoKWHzl)) != null) {
            return interfaceC59381zfvCopydefault;
        }
        InterfaceC59381zfv interfaceC59381zfvOLrzqt = OLrzqt(interfaceC59382zfw);
        Intrinsics.copydefault(interfaceC59381zfvOLrzqt);
        return interfaceC59381zfvOLrzqt;
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59381zfv getNewProxyInstance(InterfaceC59382zfw interfaceC59382zfw) {
        InterfaceC59381zfv interfaceC59381zfvOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        InterfaceC59374zfo interfaceC59374zfoKWHzl = KWHzl(interfaceC59382zfw);
        if (interfaceC59374zfoKWHzl != null && (interfaceC59381zfvOLrzqt = OLrzqt(interfaceC59374zfoKWHzl)) != null) {
            return interfaceC59381zfvOLrzqt;
        }
        InterfaceC59381zfv interfaceC59381zfvOLrzqt2 = OLrzqt(interfaceC59382zfw);
        Intrinsics.copydefault(interfaceC59381zfvOLrzqt2);
        return interfaceC59381zfvOLrzqt2;
    }

    @Override // o.InterfaceC59384zfy
    public boolean DbNXlk(InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        return !Intrinsics.EZpvd(fetchVPNInfo(fJNWhG(interfaceC59382zfw)), fetchVPNInfo(getNewProxyInstance(interfaceC59382zfw)));
    }

    @Override // o.InterfaceC59384zfy
    public boolean fetchVPNInfo(InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        InterfaceC59374zfo interfaceC59374zfoKWHzl = KWHzl(interfaceC59382zfw);
        return (interfaceC59374zfoKWHzl != null ? AEQbTJ(interfaceC59374zfoKWHzl) : null) != null;
    }

    @Override // o.InterfaceC59384zfy
    public boolean AhwBna(InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        InterfaceC59381zfv interfaceC59381zfvOLrzqt = OLrzqt(interfaceC59382zfw);
        return (interfaceC59381zfvOLrzqt != null ? KWHzl(interfaceC59381zfvOLrzqt) : null) != null;
    }

    @Override // o.InterfaceC59384zfy
    public boolean copydefault(InterfaceC59381zfv interfaceC59381zfv) {
        Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
        return KWHzl(interfaceC59381zfv) != null;
    }

    @Override // o.InterfaceC59384zfy
    public boolean gEmmrt(InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        return values((InterfaceC59382zfw) fJNWhG(interfaceC59382zfw)) != values((InterfaceC59382zfw) getNewProxyInstance(interfaceC59382zfw));
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59385zfz iwGUEr(InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        InterfaceC59381zfv interfaceC59381zfvOLrzqt = OLrzqt(interfaceC59382zfw);
        if (interfaceC59381zfvOLrzqt == null) {
            interfaceC59381zfvOLrzqt = fJNWhG(interfaceC59382zfw);
        }
        return fetchVPNInfo(interfaceC59381zfvOLrzqt);
    }

    @Override // o.InterfaceC59384zfy
    public boolean AuCTel(InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        return values(iwGUEr(interfaceC59382zfw)) && !fIwbmz(interfaceC59382zfw);
    }

    @Override // o.InterfaceC59384zfy
    public boolean AEQbTJ(InterfaceC59381zfv interfaceC59381zfv) {
        Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
        return valueOf(fetchVPNInfo(interfaceC59381zfv));
    }

    @Override // o.InterfaceC59384zfy
    public boolean gEmmrt(InterfaceC59381zfv interfaceC59381zfv) {
        Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
        return isConnected(fetchVPNInfo(interfaceC59381zfv));
    }

    @Override // o.InterfaceC59384zfy
    public InterfaceC59334zfA EZpvd(InterfaceC59378zfs interfaceC59378zfs, int i) {
        Intrinsics.checkNotNullParameter(interfaceC59378zfs, "");
        if (interfaceC59378zfs instanceof InterfaceC59380zfu) {
            return copydefault((InterfaceC59382zfw) interfaceC59378zfs, i);
        }
        if (interfaceC59378zfs instanceof ArgumentList) {
            InterfaceC59334zfA interfaceC59334zfA = ((ArgumentList) interfaceC59378zfs).get(i);
            Intrinsics.checkNotNullExpressionValue(interfaceC59334zfA, "");
            return interfaceC59334zfA;
        }
        throw new java.lang.IllegalStateException(("unknown type argument list type: " + interfaceC59378zfs + ", " + C56524yIo.AEQbTJ(interfaceC59378zfs.getClass())).toString());
    }

    @Override // o.InterfaceC59384zfy
    public int AEQbTJ(InterfaceC59378zfs interfaceC59378zfs) {
        Intrinsics.checkNotNullParameter(interfaceC59378zfs, "");
        if (interfaceC59378zfs instanceof InterfaceC59381zfv) {
            return AEQbTJ((InterfaceC59382zfw) interfaceC59378zfs);
        }
        if (interfaceC59378zfs instanceof ArgumentList) {
            return ((ArgumentList) interfaceC59378zfs).size();
        }
        throw new java.lang.IllegalStateException(("unknown type argument list type: " + interfaceC59378zfs + ", " + C56524yIo.AEQbTJ(interfaceC59378zfs.getClass())).toString());
    }
}
