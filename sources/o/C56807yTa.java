package o;

import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import o.InterfaceC56764yRl;
import o.InterfaceC56888yWa;
import o.ySA;
import o.yZU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yTa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56807yTa extends AbstractC56832yTz {
    public final InterfaceC59180zcF<java.util.Set<java.lang.String>> AEQbTJ;
    public final InterfaceC56840yUg EZpvd;
    public final ySZ KWHzl;
    public final InterfaceC59179zcE<ActionBar, InterfaceC56658yNn> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC56812yTf
    public void AEQbTJ(@NotNull java.util.Collection<InterfaceC56687yOp> collection, @NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: values()Lo/yNu; */
    @Override // o.AbstractC56812yTf
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public ySZ values() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56807yTa(@NotNull C56794ySo c56794ySo, @NotNull InterfaceC56840yUg interfaceC56840yUg, @NotNull ySZ ysz) {
        super(c56794ySo);
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(interfaceC56840yUg, "");
        Intrinsics.checkNotNullParameter(ysz, "");
        this.EZpvd = interfaceC56840yUg;
        this.KWHzl = ysz;
        this.AEQbTJ = c56794ySo.EZpvd().copydefault(new C56811yTe(c56794ySo, this));
        this.OLrzqt = c56794ySo.EZpvd().OLrzqt(new C56810yTd(this, c56794ySo));
    }

    public static final java.util.Set KWHzl(C56794ySo c56794ySo, C56807yTa c56807yTa) {
        return c56794ySo.copydefault().copydefault().AEQbTJ(c56807yTa.values().KWHzl());
    }

    public final C56921yXg KWHzl() {
        return C59432zgt.EZpvd(fetchVPNInfo().copydefault().KWHzl().KWHzl().OLrzqt());
    }

    public static final InterfaceC56658yNn copydefault(C56807yTa c56807yTa, C56794ySo c56794ySo, ActionBar actionBar) {
        InterfaceC56888yWa.Application applicationCopydefault;
        Intrinsics.checkNotNullParameter(actionBar, "");
        C56929yXo c56929yXo = new C56929yXo(c56807yTa.values().KWHzl(), actionBar.copydefault());
        if (actionBar.KWHzl() != null) {
            applicationCopydefault = c56794ySo.copydefault().valueOf().EZpvd(actionBar.KWHzl(), c56807yTa.KWHzl());
        } else {
            applicationCopydefault = c56794ySo.copydefault().valueOf().copydefault(c56929yXo, c56807yTa.KWHzl());
        }
        InterfaceC56893yWf interfaceC56893yWfAEQbTJ = applicationCopydefault != null ? applicationCopydefault.AEQbTJ() : null;
        C56929yXo c56929yXoKWHzl = interfaceC56893yWfAEQbTJ != null ? interfaceC56893yWfAEQbTJ.KWHzl() : null;
        if (c56929yXoKWHzl != null && (c56929yXoKWHzl.valueOf() || c56929yXoKWHzl.AhwBna())) {
            return null;
        }
        StateListAnimator stateListAnimatorEZpvd = c56807yTa.EZpvd(interfaceC56893yWfAEQbTJ);
        if (stateListAnimatorEZpvd instanceof StateListAnimator.Activity) {
            return ((StateListAnimator.Activity) stateListAnimatorEZpvd).EZpvd();
        }
        if (stateListAnimatorEZpvd instanceof StateListAnimator.C1005StateListAnimator) {
            return null;
        }
        if (!(stateListAnimatorEZpvd instanceof StateListAnimator.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        yTT yttKWHzl = actionBar.KWHzl();
        if (yttKWHzl == null) {
            InterfaceC56764yRl interfaceC56764yRlCopydefault = c56794ySo.copydefault().copydefault();
            InterfaceC56888yWa.Application.StateListAnimator stateListAnimator = applicationCopydefault instanceof InterfaceC56888yWa.Application.StateListAnimator ? (InterfaceC56888yWa.Application.StateListAnimator) applicationCopydefault : null;
            yttKWHzl = interfaceC56764yRlCopydefault.EZpvd(new InterfaceC56764yRl.TaskDescription(c56929yXo, stateListAnimator != null ? stateListAnimator.copydefault() : null, null, 4, null));
        }
        yTT ytt = yttKWHzl;
        if ((ytt != null ? ytt.AkhnZx() : null) == LightClassOriginKind.BINARY) {
            throw new java.lang.IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + ytt + "\nClassId: " + c56929yXo + "\nfindKotlinClass(JavaClass) = " + yVZ.KWHzl(c56794ySo.copydefault().valueOf(), ytt, c56807yTa.KWHzl()) + "\nfindKotlinClass(ClassId) = " + yVZ.OLrzqt(c56794ySo.copydefault().valueOf(), c56929yXo, c56807yTa.KWHzl()) + '\n');
        }
        C56933yXs c56933yXsValueOf = ytt != null ? ytt.valueOf() : null;
        if (c56933yXsValueOf == null || c56933yXsValueOf.AEQbTJ() || !Intrinsics.EZpvd(c56933yXsValueOf.EZpvd(), c56807yTa.values().KWHzl())) {
            return null;
        }
        ySE yse = new ySE(c56794ySo, c56807yTa.values(), ytt, null, 8, null);
        c56794ySo.copydefault().EZpvd().OLrzqt(yse);
        return yse;
    }

    /* JADX INFO: renamed from: o.yTa$StateListAnimator */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yTa.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.yTa$StateListAnimator$Activity */
        public static final class Activity extends StateListAnimator {
            public final InterfaceC56658yNn AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InterfaceC56658yNn EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
                super(null);
                Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
                this.AEQbTJ = interfaceC56658yNn;
            }
        }

        private StateListAnimator() {
        }

        /* JADX INFO: renamed from: o.yTa$StateListAnimator$ActionBar */
        public static final class ActionBar extends StateListAnimator {
            public static final ActionBar OLrzqt = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.yTa$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C1005StateListAnimator extends StateListAnimator {
            public static final C1005StateListAnimator AEQbTJ = new C1005StateListAnimator();

            private C1005StateListAnimator() {
                super(null);
            }
        }
    }

    public final StateListAnimator EZpvd(InterfaceC56893yWf interfaceC56893yWf) {
        if (interfaceC56893yWf == null) {
            return StateListAnimator.ActionBar.OLrzqt;
        }
        if (interfaceC56893yWf.EZpvd().KWHzl() == KotlinClassHeader.Kind.CLASS) {
            InterfaceC56658yNn interfaceC56658yNnAhwBna = fetchVPNInfo().copydefault().KWHzl().AhwBna(interfaceC56893yWf);
            return interfaceC56658yNnAhwBna != null ? new StateListAnimator.Activity(interfaceC56658yNnAhwBna) : StateListAnimator.ActionBar.OLrzqt;
        }
        return StateListAnimator.C1005StateListAnimator.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.yTa$ActionBar */
    public static final class ActionBar {
        public final C56935yXu AEQbTJ;
        public final yTT OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final yTT KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C56935yXu copydefault() {
            return this.AEQbTJ;
        }

        public ActionBar(@NotNull C56935yXu c56935yXu, yTT ytt) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            this.AEQbTJ = c56935yXu;
            this.OLrzqt = ytt;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.AEQbTJ, ((ActionBar) obj).AEQbTJ);
        }

        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/yXu;Lo/yQV;)Lo/yNs; */
    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC56658yNn EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return KWHzl(c56935yXu, (yTT) null);
    }

    public final InterfaceC56658yNn KWHzl(C56935yXu c56935yXu, yTT ytt) {
        if (!C56938yXx.gEmmrt.EZpvd(c56935yXu)) {
            return null;
        }
        java.util.Set<java.lang.String> setInvoke = this.AEQbTJ.invoke();
        if (ytt != null || setInvoke == null || setInvoke.contains(c56935yXu.AEQbTJ())) {
            return this.OLrzqt.invoke(new ActionBar(c56935yXu, ytt));
        }
        return null;
    }

    public final InterfaceC56658yNn AEQbTJ(@NotNull yTT ytt) {
        Intrinsics.checkNotNullParameter(ytt, "");
        return KWHzl(ytt.fIwbmz(), ytt);
    }

    @Override // o.AbstractC56812yTf, o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Collection<InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return yDY.AhwBna();
    }

    @Override // o.AbstractC56812yTf
    public ySA OLrzqt() {
        return ySA.StateListAnimator.AEQbTJ;
    }

    @Override // o.AbstractC56812yTf
    public java.util.Set<C56935yXu> OLrzqt(@NotNull yZU yzu, Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        if (!yzu.EZpvd(yZU.AYXKKw.AEQbTJ())) {
            return yEE.copydefault();
        }
        java.util.Set<java.lang.String> setInvoke = this.AEQbTJ.invoke();
        if (setInvoke != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator<T> it = setInvoke.iterator();
            while (it.hasNext()) {
                hashSet.add(C56935yXu.AEQbTJ((java.lang.String) it.next()));
            }
            return hashSet;
        }
        InterfaceC56840yUg interfaceC56840yUg = this.EZpvd;
        if (function1 == null) {
            function1 = C59430zgr.copydefault();
        }
        java.util.Collection<yTT> collectionKWHzl = interfaceC56840yUg.KWHzl(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (yTT ytt : collectionKWHzl) {
            C56935yXu c56935yXuFIwbmz = ytt.AkhnZx() == LightClassOriginKind.SOURCE ? null : ytt.fIwbmz();
            if (c56935yXuFIwbmz != null) {
                linkedHashSet.add(c56935yXuFIwbmz);
            }
        }
        return linkedHashSet;
    }

    @Override // o.AbstractC56812yTf
    public java.util.Set<C56935yXu> EZpvd(@NotNull yZU yzu, Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        return yEE.copydefault();
    }

    @Override // o.AbstractC56812yTf
    public java.util.Set<C56935yXu> AEQbTJ(@NotNull yZU yzu, Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        return yEE.copydefault();
    }

    @Override // o.AbstractC56812yTf, o.AbstractC59100zaf, o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56665yNu> copydefault(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        yZU.Application application = yZU.AYXKKw;
        if (!yzu.EZpvd(application.AEQbTJ() | application.OLrzqt())) {
            return yDY.AhwBna();
        }
        java.util.Collection<InterfaceC56665yNu> collectionInvoke = isConnected().invoke();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionInvoke) {
            InterfaceC56665yNu interfaceC56665yNu = (InterfaceC56665yNu) obj;
            if (interfaceC56665yNu instanceof InterfaceC56658yNn) {
                C56935yXu c56935yXuBR_ = ((InterfaceC56658yNn) interfaceC56665yNu).bR_();
                Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                if (function1.invoke(c56935yXuBR_).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
