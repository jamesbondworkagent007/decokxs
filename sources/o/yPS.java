package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yPS extends AbstractC56718yPt implements yPQ {
    public final InterfaceC59187zcM AwvSrB;
    public final InterfaceC59180zcF DTwDnp;
    public final InterfaceC56690yOs gHZMYf;
    public InterfaceC56656yNl sSMYrx;
    public static final /* synthetic */ yJA<java.lang.Object>[] EZpvd = {C56524yIo.copydefault(new PropertyReference1Impl(yPS.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0))};
    public static final Activity AxsJAY = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 o.zcM)
  (r2v0 o.yOs)
  (r3v0 o.yNl)
  (r4v0 o.yPQ)
  (r5v0 o.yOL)
  (r6v0 kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind)
  (r7v0 o.yOo)
 A[MD:(o.zcM, o.yOs, o.yNl, o.yPQ, o.yOL, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, o.yOo):void (m)] call: o.yPS.<init>(o.zcM, o.yOs, o.yNl, o.yPQ, o.yOL, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, o.yOo):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ yPS(InterfaceC59187zcM interfaceC59187zcM, InterfaceC56690yOs interfaceC56690yOs, InterfaceC56656yNl interfaceC56656yNl, yPQ ypq, yOL yol, CallableMemberDescriptor.Kind kind, InterfaceC56686yOo interfaceC56686yOo, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC59187zcM, interfaceC56690yOs, interfaceC56656yNl, ypq, yol, kind, interfaceC56686yOo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC56690yOs OcIXYQ() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yPQ
    public InterfaceC56656yNl ejfBZ() {
        return this.sSMYrx;
    }

    public yPS(InterfaceC59187zcM interfaceC59187zcM, InterfaceC56690yOs interfaceC56690yOs, InterfaceC56656yNl interfaceC56656yNl, yPQ ypq, yOL yol, CallableMemberDescriptor.Kind kind, InterfaceC56686yOo interfaceC56686yOo) {
        super(interfaceC56690yOs, ypq, yol, C56938yXx.valueOf, kind, interfaceC56686yOo);
        this.AwvSrB = interfaceC59187zcM;
        this.gHZMYf = interfaceC56690yOs;
        KWHzl(OcIXYQ().hDKMBd());
        this.DTwDnp = interfaceC59187zcM.copydefault(new yPO(this, interfaceC56656yNl));
        this.sSMYrx = interfaceC56656yNl;
    }

    public static final yPS OLrzqt(yPS yps, InterfaceC56656yNl interfaceC56656yNl) {
        InterfaceC59187zcM interfaceC59187zcM = yps.AwvSrB;
        InterfaceC56690yOs interfaceC56690yOsOcIXYQ = yps.OcIXYQ();
        yOL yolCopydefault = interfaceC56656yNl.copydefault();
        CallableMemberDescriptor.Kind kindBW_ = interfaceC56656yNl.bW_();
        Intrinsics.checkNotNullExpressionValue(kindBW_, "");
        InterfaceC56686yOo interfaceC56686yOoFARcdN = yps.OcIXYQ().fARcdN();
        Intrinsics.checkNotNullExpressionValue(interfaceC56686yOoFARcdN, "");
        yPS yps2 = new yPS(interfaceC59187zcM, interfaceC56690yOsOcIXYQ, interfaceC56656yNl, yps, yolCopydefault, kindBW_, interfaceC56686yOoFARcdN);
        TypeSubstitutor typeSubstitutorAEQbTJ = AxsJAY.AEQbTJ(yps.OcIXYQ());
        if (typeSubstitutorAEQbTJ == null) {
            return null;
        }
        InterfaceC56679yOh interfaceC56679yOhAEQbTJ = interfaceC56656yNl.AEQbTJ();
        InterfaceC56679yOh interfaceC56679yOhKWHzl = interfaceC56679yOhAEQbTJ != null ? interfaceC56679yOhAEQbTJ.KWHzl(typeSubstitutorAEQbTJ) : null;
        java.util.List<InterfaceC56679yOh> listOLrzqt = interfaceC56656yNl.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(listOLrzqt, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC56679yOh) it.next()).KWHzl(typeSubstitutorAEQbTJ));
        }
        yps2.AEQbTJ(null, interfaceC56679yOhKWHzl, arrayList, yps.OcIXYQ().AkhnZx(), yps.fetchVPNInfo(), yps.gEmmrt(), Modality.FINAL, yps.OcIXYQ().getNewProxyInstance());
        return yps2;
    }

    @Override // o.InterfaceC56660yNp
    public boolean getFieldNames() {
        return ejfBZ().getFieldNames();
    }

    /* JADX DEBUG: Method merged with bridge method: AYXKKw()Lo/yNu; */
    /* JADX DEBUG: Method merged with bridge method: AuCTel()Lo/yNo; */
    @Override // o.InterfaceC56660yNp
    /* JADX INFO: renamed from: gHZMYf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC56690yOs AuCTel() {
        return OcIXYQ();
    }

    @Override // o.InterfaceC56660yNp
    public InterfaceC56658yNn fIwbmz() {
        InterfaceC56658yNn interfaceC56658yNnFIwbmz = ejfBZ().fIwbmz();
        Intrinsics.checkNotNullExpressionValue(interfaceC56658yNnFIwbmz, "");
        return interfaceC56658yNnFIwbmz;
    }

    @Override // o.AbstractC56718yPt, o.InterfaceC56657yNm
    public AbstractC59233zdF gEmmrt() {
        AbstractC59233zdF abstractC59233zdFGEmmrt = super.gEmmrt();
        Intrinsics.copydefault(abstractC59233zdFGEmmrt);
        return abstractC59233zdFGEmmrt;
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Lo/yNm; */
    /* JADX DEBUG: Method merged with bridge method: DbNXlk()Lo/yNt; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    /* JADX DEBUG: Method merged with bridge method: fJNWhG()Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    /* JADX DEBUG: Method merged with bridge method: iwGUEr()Lo/yNG; */
    @Override // o.AbstractC56718yPt, o.yNG
    /* JADX INFO: renamed from: zuBGHE, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public yPQ bT_() {
        yNG yngIwGUEr = super.bT_();
        Intrinsics.copydefault(yngIwGUEr, "");
        return (yPQ) yngIwGUEr;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNv; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNp; */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNG; */
    @Override // o.AbstractC56718yPt, o.yNG
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public yPQ KWHzl(@NotNull TypeSubstitutor typeSubstitutor) {
        Intrinsics.checkNotNullParameter(typeSubstitutor, "");
        yNG yngOLrzqt = super.KWHzl(typeSubstitutor);
        Intrinsics.copydefault(yngOLrzqt, "");
        yPS yps = (yPS) yngOLrzqt;
        TypeSubstitutor typeSubstitutorOLrzqt = TypeSubstitutor.OLrzqt(yps.gEmmrt());
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorOLrzqt, "");
        InterfaceC56656yNl interfaceC56656yNlEZpvd = ejfBZ().ejfBZ().EZpvd(typeSubstitutorOLrzqt);
        if (interfaceC56656yNlEZpvd == null) {
            return null;
        }
        yps.sSMYrx = interfaceC56656yNlEZpvd;
        return yps;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/yNu;Lkotlin/reflect/jvm/internal/impl/descriptors/Modality;Lo/yNC;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Z)Lo/yNG; */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/yNu;Lkotlin/reflect/jvm/internal/impl/descriptors/Modality;Lo/yNC;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    @Override // o.AbstractC56718yPt, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public yPQ OLrzqt(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull Modality modality, @NotNull yNC ync, @NotNull CallableMemberDescriptor.Kind kind, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(modality, "");
        Intrinsics.checkNotNullParameter(ync, "");
        Intrinsics.checkNotNullParameter(kind, "");
        yNG yngAEQbTJ = sSMYrx().AEQbTJ(interfaceC56665yNu).copydefault(modality).copydefault(ync).copydefault(kind).KWHzl(z).AEQbTJ();
        Intrinsics.copydefault(yngAEQbTJ, "");
        return (yPQ) yngAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/yNu;Lo/yNG;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Lo/yXu;Lo/yOL;Lo/yOo;)Lo/yPt; */
    @Override // o.AbstractC56718yPt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public yPS KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu, yNG yng, @NotNull CallableMemberDescriptor.Kind kind, C56935yXu c56935yXu, @NotNull yOL yol, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(kind, "");
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind != kind2) {
            CallableMemberDescriptor.Kind kind3 = CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return new yPS(this.AwvSrB, OcIXYQ(), ejfBZ(), this, yol, kind2, interfaceC56686yOo);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yPS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final TypeSubstitutor AEQbTJ(InterfaceC56690yOs interfaceC56690yOs) {
            if (interfaceC56690yOs.AEQbTJ() == null) {
                return null;
            }
            return TypeSubstitutor.OLrzqt(interfaceC56690yOs.valueOf());
        }

        public final yPQ OLrzqt(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull InterfaceC56690yOs interfaceC56690yOs, @NotNull InterfaceC56656yNl interfaceC56656yNl) {
            InterfaceC56656yNl interfaceC56656yNlEZpvd;
            java.util.List<InterfaceC56679yOh> listAhwBna;
            Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
            Intrinsics.checkNotNullParameter(interfaceC56690yOs, "");
            Intrinsics.checkNotNullParameter(interfaceC56656yNl, "");
            TypeSubstitutor typeSubstitutorAEQbTJ = AEQbTJ(interfaceC56690yOs);
            if (typeSubstitutorAEQbTJ == null || (interfaceC56656yNlEZpvd = interfaceC56656yNl.EZpvd(typeSubstitutorAEQbTJ)) == null) {
                return null;
            }
            yOL yolCopydefault = interfaceC56656yNl.copydefault();
            CallableMemberDescriptor.Kind kindBW_ = interfaceC56656yNl.bW_();
            Intrinsics.checkNotNullExpressionValue(kindBW_, "");
            InterfaceC56686yOo interfaceC56686yOoFARcdN = interfaceC56690yOs.fARcdN();
            Intrinsics.checkNotNullExpressionValue(interfaceC56686yOoFARcdN, "");
            yPS yps = new yPS(interfaceC59187zcM, interfaceC56690yOs, interfaceC56656yNlEZpvd, null, yolCopydefault, kindBW_, interfaceC56686yOoFARcdN, null);
            java.util.List<InterfaceC56695yOx> listOLrzqt = AbstractC56718yPt.OLrzqt(yps, interfaceC56656yNl.fetchVPNInfo(), typeSubstitutorAEQbTJ);
            if (listOLrzqt == null) {
                return null;
            }
            AbstractC59242zdO abstractC59242zdOKWHzl = C59278zdy.KWHzl(interfaceC56656yNlEZpvd.gEmmrt().AkhnZx());
            AbstractC59242zdO abstractC59242zdOBQ_ = interfaceC56690yOs.bQ_();
            Intrinsics.checkNotNullExpressionValue(abstractC59242zdOBQ_, "");
            AbstractC59242zdO abstractC59242zdOAEQbTJ = C59245zdR.AEQbTJ(abstractC59242zdOKWHzl, abstractC59242zdOBQ_);
            InterfaceC56679yOh interfaceC56679yOhAEQbTJ = interfaceC56656yNl.AEQbTJ();
            InterfaceC56679yOh interfaceC56679yOhCopydefault = interfaceC56679yOhAEQbTJ != null ? yYI.copydefault(yps, typeSubstitutorAEQbTJ.AEQbTJ(interfaceC56679yOhAEQbTJ.uzCIH(), Variance.INVARIANT), yOL.KWHzl.OLrzqt()) : null;
            InterfaceC56658yNn interfaceC56658yNnAEQbTJ = interfaceC56690yOs.AEQbTJ();
            if (interfaceC56658yNnAEQbTJ != null) {
                java.util.List<InterfaceC56679yOh> listOLrzqt2 = interfaceC56656yNl.OLrzqt();
                Intrinsics.checkNotNullExpressionValue(listOLrzqt2, "");
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt2, 10));
                int i = 0;
                for (java.lang.Object obj : listOLrzqt2) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    InterfaceC56679yOh interfaceC56679yOh = (InterfaceC56679yOh) obj;
                    AbstractC59233zdF abstractC59233zdFAEQbTJ = typeSubstitutorAEQbTJ.AEQbTJ(interfaceC56679yOh.uzCIH(), Variance.INVARIANT);
                    InterfaceC59070zaB interfaceC59070zaBKWHzl = interfaceC56679yOh.KWHzl();
                    Intrinsics.copydefault(interfaceC59070zaBKWHzl, "");
                    arrayList.add(yYI.EZpvd(interfaceC56658yNnAEQbTJ, abstractC59233zdFAEQbTJ, ((InterfaceC59119zay) interfaceC59070zaBKWHzl).EZpvd(), yOL.KWHzl.OLrzqt(), i));
                    i++;
                }
                listAhwBna = arrayList;
            } else {
                listAhwBna = yDY.AhwBna();
            }
            yps.AEQbTJ(interfaceC56679yOhCopydefault, null, listAhwBna, interfaceC56690yOs.AkhnZx(), listOLrzqt, abstractC59242zdOAEQbTJ, Modality.FINAL, interfaceC56690yOs.getNewProxyInstance());
            return yps;
        }
    }
}
