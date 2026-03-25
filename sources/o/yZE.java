package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$declaresOrInheritsDefaultValue$2;
import kotlin.sequences.Sequence;
import o.AbstractC59287zeG;
import o.AbstractC59362zfc;
import o.C59431zgs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yZE {
    public static final C56935yXu copydefault;

    static {
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ("value");
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        copydefault = c56935yXuAEQbTJ;
    }

    public static final C56930yXp valueOf(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        C56930yXp c56930yXpAEQbTJ = yYH.AEQbTJ(interfaceC56665yNu);
        Intrinsics.checkNotNullExpressionValue(c56930yXpAEQbTJ, "");
        return c56930yXpAEQbTJ;
    }

    public static final C56933yXs EZpvd(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        C56933yXs c56933yXsGEmmrt = yYH.gEmmrt(interfaceC56665yNu);
        Intrinsics.checkNotNullExpressionValue(c56933yXsGEmmrt, "");
        return c56933yXsGEmmrt;
    }

    public static final yNP AhwBna(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        yNP ynpOLrzqt = yYH.OLrzqt(interfaceC56665yNu);
        Intrinsics.checkNotNullExpressionValue(ynpOLrzqt, "");
        return ynpOLrzqt;
    }

    public static final InterfaceC56658yNn EZpvd(@NotNull yNP ynp, @NotNull C56933yXs c56933yXs, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        c56933yXs.AEQbTJ();
        InterfaceC56663yNs interfaceC56663yNsEZpvd = ynp.copydefault(c56933yXs.EZpvd()).EZpvd().EZpvd(c56933yXs.OLrzqt(), yqv);
        if (interfaceC56663yNsEZpvd instanceof InterfaceC56658yNn) {
            return (InterfaceC56658yNn) interfaceC56663yNsEZpvd;
        }
        return null;
    }

    public static final C56929yXo EZpvd(InterfaceC56663yNs interfaceC56663yNs) {
        InterfaceC56665yNu interfaceC56665yNuAYXKKw;
        C56929yXo c56929yXoEZpvd;
        if (interfaceC56663yNs != null && (interfaceC56665yNuAYXKKw = interfaceC56663yNs.AuCTel()) != null) {
            if (interfaceC56665yNuAYXKKw instanceof yNW) {
                C56933yXs c56933yXsKWHzl = ((yNW) interfaceC56665yNuAYXKKw).KWHzl();
                C56935yXu c56935yXuBR_ = interfaceC56663yNs.bR_();
                Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                return new C56929yXo(c56933yXsKWHzl, c56935yXuBR_);
            }
            if ((interfaceC56665yNuAYXKKw instanceof InterfaceC56659yNo) && (c56929yXoEZpvd = EZpvd((InterfaceC56663yNs) interfaceC56665yNuAYXKKw)) != null) {
                C56935yXu c56935yXuBR_2 = interfaceC56663yNs.bR_();
                Intrinsics.checkNotNullExpressionValue(c56935yXuBR_2, "");
                return c56929yXoEZpvd.EZpvd(c56935yXuBR_2);
            }
        }
        return null;
    }

    public static final InterfaceC56658yNn copydefault(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        for (AbstractC59233zdF abstractC59233zdF : interfaceC56658yNn.bQ_().djBIcL().bV_()) {
            if (!AbstractC56640yMw.KWHzl(abstractC59233zdF)) {
                InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdF.djBIcL().OLrzqt();
                if (yYH.AkhnZx(interfaceC56663yNsKWHzl)) {
                    Intrinsics.copydefault(interfaceC56663yNsKWHzl, "");
                    return (InterfaceC56658yNn) interfaceC56663yNsKWHzl;
                }
            }
        }
        return null;
    }

    public static final AbstractC56640yMw AEQbTJ(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        return AhwBna(interfaceC56665yNu).AEQbTJ();
    }

    public static final boolean copydefault(@NotNull InterfaceC56695yOx interfaceC56695yOx) {
        Intrinsics.checkNotNullParameter(interfaceC56695yOx, "");
        java.lang.Boolean boolCopydefault = C59431zgs.copydefault(C56402yEa.EZpvd(interfaceC56695yOx), yZN.KWHzl, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(boolCopydefault, "");
        return boolCopydefault.booleanValue();
    }

    public static final java.lang.Iterable OLrzqt(InterfaceC56695yOx interfaceC56695yOx) {
        java.util.Collection<InterfaceC56695yOx> collectionValueOf = interfaceC56695yOx.valueOf();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collectionValueOf, 10));
        java.util.Iterator<T> it = collectionValueOf.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC56695yOx) it.next()).DbNXlk());
        }
        return arrayList;
    }

    public static final InterfaceC56665yNu OLrzqt(InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        return interfaceC56665yNu.AuCTel();
    }

    public static final Sequence<InterfaceC56665yNu> djBIcL(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        return C59405zgS.EZpvd(interfaceC56665yNu, (Function1<? super InterfaceC56665yNu, ? extends InterfaceC56665yNu>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) yZK.OLrzqt));
    }

    public static final Sequence<InterfaceC56665yNu> AYXKKw(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        return C59467zhb.copydefault(djBIcL(interfaceC56665yNu), 1);
    }

    public static final CallableMemberDescriptor AEQbTJ(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        if (!(callableMemberDescriptor instanceof InterfaceC56677yOf)) {
            return callableMemberDescriptor;
        }
        InterfaceC56676yOe interfaceC56676yOeFIwbmz = ((InterfaceC56677yOf) callableMemberDescriptor).fIwbmz();
        Intrinsics.checkNotNullExpressionValue(interfaceC56676yOeFIwbmz, "");
        return interfaceC56676yOeFIwbmz;
    }

    public static final C56933yXs KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        C56930yXp c56930yXpValueOf = valueOf(interfaceC56665yNu);
        if (!c56930yXpValueOf.copydefault()) {
            c56930yXpValueOf = null;
        }
        if (c56930yXpValueOf != null) {
            return c56930yXpValueOf.djBIcL();
        }
        return null;
    }

    public static /* synthetic */ CallableMemberDescriptor firstOverridden$default(CallableMemberDescriptor callableMemberDescriptor, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return KWHzl(callableMemberDescriptor, z, function1);
    }

    public static final CallableMemberDescriptor KWHzl(@NotNull CallableMemberDescriptor callableMemberDescriptor, boolean z, @NotNull Function1<? super CallableMemberDescriptor, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return (CallableMemberDescriptor) C59431zgs.AEQbTJ(C56402yEa.EZpvd(callableMemberDescriptor), new yZM(z), new TaskDescription(new Ref.ObjectRef(), function1));
    }

    public static final java.lang.Iterable KWHzl(boolean z, CallableMemberDescriptor callableMemberDescriptor) {
        java.util.Collection<? extends CallableMemberDescriptor> collectionValueOf;
        if (z) {
            callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.iwGUEr() : null;
        }
        return (callableMemberDescriptor == null || (collectionValueOf = callableMemberDescriptor.valueOf()) == null) ? yDY.AhwBna() : collectionValueOf;
    }

    public static final class TaskDescription extends C59431zgs.StateListAnimator<CallableMemberDescriptor, CallableMemberDescriptor> {
        public final /* synthetic */ Ref.ObjectRef<CallableMemberDescriptor> OLrzqt;
        public final /* synthetic */ Function1<CallableMemberDescriptor, java.lang.Boolean> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Ref.ObjectRef<CallableMemberDescriptor> objectRef, Function1<? super CallableMemberDescriptor, java.lang.Boolean> function1) {
            this.OLrzqt = objectRef;
            this.copydefault = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Z */
        @Override // o.C59431zgs.StateListAnimator, o.C59431zgs.Activity
        public boolean EZpvd(CallableMemberDescriptor callableMemberDescriptor) {
            Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
            return this.OLrzqt.element == null;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C59431zgs.StateListAnimator, o.C59431zgs.Activity
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(CallableMemberDescriptor callableMemberDescriptor) {
            Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
            if (this.OLrzqt.element == null && this.copydefault.invoke(callableMemberDescriptor).booleanValue()) {
                this.OLrzqt.element = callableMemberDescriptor;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
        @Override // o.C59431zgs.Activity
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public CallableMemberDescriptor OLrzqt() {
            return this.OLrzqt.element;
        }
    }

    public static final Sequence<CallableMemberDescriptor> OLrzqt(@NotNull CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        if (z) {
            callableMemberDescriptor = callableMemberDescriptor.iwGUEr();
        }
        Sequence sequenceEZpvd = C59405zgS.EZpvd((java.lang.Object[]) new CallableMemberDescriptor[]{callableMemberDescriptor});
        java.util.Collection<? extends CallableMemberDescriptor> collectionValueOf = callableMemberDescriptor.valueOf();
        Intrinsics.checkNotNullExpressionValue(collectionValueOf, "");
        return C59467zhb.EZpvd(sequenceEZpvd, C59467zhb.isConnected(CollectionsKt___CollectionsKt.QVAiDq(collectionValueOf), new yZJ(z)));
    }

    public static final Sequence copydefault(boolean z, CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.copydefault(callableMemberDescriptor);
        return OLrzqt(callableMemberDescriptor, z);
    }

    public static final InterfaceC56658yNn OLrzqt(@NotNull yOJ yoj) {
        Intrinsics.checkNotNullParameter(yoj, "");
        InterfaceC56663yNs interfaceC56663yNsKWHzl = yoj.AEQbTJ().djBIcL().OLrzqt();
        if (interfaceC56663yNsKWHzl instanceof InterfaceC56658yNn) {
            return (InterfaceC56658yNn) interfaceC56663yNsKWHzl;
        }
        return null;
    }

    public static final AbstractC59287zeG OLrzqt(@NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        C59296zeP c59296zeP = (C59296zeP) ynp.OLrzqt(C59286zeF.EZpvd());
        AbstractC59362zfc abstractC59362zfc = c59296zeP != null ? (AbstractC59362zfc) c59296zeP.AEQbTJ() : null;
        return abstractC59362zfc instanceof AbstractC59362zfc.TaskDescription ? ((AbstractC59362zfc.TaskDescription) abstractC59362zfc).OLrzqt() : AbstractC59287zeG.TaskDescription.KWHzl;
    }

    public static final boolean copydefault(@NotNull yNP ynp) {
        AbstractC59362zfc abstractC59362zfc;
        Intrinsics.checkNotNullParameter(ynp, "");
        C59296zeP c59296zeP = (C59296zeP) ynp.OLrzqt(C59286zeF.EZpvd());
        return (c59296zeP == null || (abstractC59362zfc = (AbstractC59362zfc) c59296zeP.AEQbTJ()) == null || !abstractC59362zfc.EZpvd()) ? false : true;
    }

    public static final yNL<AbstractC59242zdO> EZpvd(InterfaceC56658yNn interfaceC56658yNn) {
        yOA<AbstractC59242zdO> yoaIwGUEr = interfaceC56658yNn != null ? interfaceC56658yNn.iwGUEr() : null;
        if (yoaIwGUEr instanceof yNL) {
            return (yNL) yoaIwGUEr;
        }
        return null;
    }

    public static final yNR<AbstractC59242zdO> KWHzl(InterfaceC56658yNn interfaceC56658yNn) {
        yOA<AbstractC59242zdO> yoaIwGUEr = interfaceC56658yNn != null ? interfaceC56658yNn.iwGUEr() : null;
        if (yoaIwGUEr instanceof yNR) {
            return (yNR) yoaIwGUEr;
        }
        return null;
    }
}
