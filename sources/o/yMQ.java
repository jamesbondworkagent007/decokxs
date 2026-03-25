package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yMQ implements yOY {
    public static final C56929yXo OLrzqt;
    public static final C56935yXu copydefault;
    public final InterfaceC59182zcH AYXKKw;
    public final yNP djBIcL;
    public final Function1<yNP, InterfaceC56665yNu> valueOf;
    public static final /* synthetic */ yJA<java.lang.Object>[] EZpvd = {C56524yIo.copydefault(new PropertyReference1Impl(yMQ.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public static final C56933yXs KWHzl = yMB.AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.yNP, ? extends o.yNu> */
    /* JADX WARN: Multi-variable type inference failed */
    public yMQ(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull yNP ynp, @NotNull Function1<? super yNP, ? extends InterfaceC56665yNu> function1) {
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL = ynp;
        this.valueOf = function1;
        this.AYXKKw = interfaceC59187zcM.KWHzl(new yMR(this, interfaceC59187zcM));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 o.zcM)
  (r2v0 o.yNP)
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0004: SGET  A[WRAPPED] (LINE:22) o.yMS.AEQbTJ o.yMS) : (r3v0 kotlin.jvm.functions.Function1))
 A[MD:(o.zcM, o.yNP, kotlin.jvm.functions.Function1<? super o.yNP, ? extends o.yNu>):void (m)] (LINE:19) call: o.yMQ.<init>(o.zcM, o.yNP, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ yMQ(InterfaceC59187zcM interfaceC59187zcM, yNP ynp, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC59187zcM, ynp, (i & 4) != 0 ? yMS.AEQbTJ : function1);
    }

    public static final InterfaceC56634yMq EZpvd(yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        java.util.List<yNW> listAEQbTJ = ynp.copydefault(KWHzl).AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAEQbTJ) {
            if (obj instanceof InterfaceC56634yMq) {
                arrayList.add(obj);
            }
        }
        return (InterfaceC56634yMq) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
    }

    static {
        C56930yXp c56930yXp = yMB.Application.fJNWhG;
        copydefault = c56930yXp.valueOf();
        OLrzqt = C56929yXo.AEQbTJ.KWHzl(c56930yXp.djBIcL());
    }

    public final C56706yPh KWHzl() {
        return (C56706yPh) C59183zcI.AEQbTJ(this.AYXKKw, this, EZpvd[0]);
    }

    public static final C56706yPh OLrzqt(yMQ ymq, InterfaceC59187zcM interfaceC59187zcM) {
        C56706yPh c56706yPh = new C56706yPh(ymq.valueOf.invoke(ymq.djBIcL), copydefault, Modality.ABSTRACT, ClassKind.INTERFACE, C56402yEa.EZpvd(ymq.djBIcL.AEQbTJ().AhwBna()), InterfaceC56686yOo.copydefault, false, interfaceC59187zcM);
        c56706yPh.OLrzqt(new yMK(interfaceC59187zcM, c56706yPh), yEE.copydefault(), null);
        return c56706yPh;
    }

    @Override // o.yOY
    public boolean KWHzl(@NotNull C56933yXs c56933yXs, @NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return Intrinsics.EZpvd(c56935yXu, copydefault) && Intrinsics.EZpvd(c56933yXs, KWHzl);
    }

    @Override // o.yOY
    public InterfaceC56658yNn KWHzl(@NotNull C56929yXo c56929yXo) {
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        if (Intrinsics.EZpvd(c56929yXo, OLrzqt)) {
            return KWHzl();
        }
        return null;
    }

    @Override // o.yOY
    public java.util.Collection<InterfaceC56658yNn> AEQbTJ(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return Intrinsics.EZpvd(c56933yXs, KWHzl) ? yED.AEQbTJ(KWHzl()) : yEE.copydefault();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yMQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C56929yXo AEQbTJ() {
            return yMQ.OLrzqt;
        }
    }
}
