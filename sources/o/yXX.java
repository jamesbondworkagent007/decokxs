package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;
import o.yXY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yXX {
    public static final StateListAnimator AEQbTJ;
    public static final yXX AYXKKw;
    public static final yXX AhwBna;
    public static final yXX AkhnZx;
    public static final yXX EZpvd;
    public static final yXX KWHzl;
    public static final yXX OLrzqt;
    public static final yXX copydefault;
    public static final yXX djBIcL;
    public static final yXX gEmmrt;
    public static final yXX isConnected;
    public static final yXX valueOf;

    public abstract java.lang.String EZpvd(@NotNull C56935yXu c56935yXu, boolean z);

    public abstract java.lang.String KWHzl(@NotNull AbstractC59233zdF abstractC59233zdF);

    public abstract java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull AbstractC56640yMw abstractC56640yMw);

    public abstract java.lang.String OLrzqt(@NotNull yOJ yoj, AnnotationUseSiteTarget annotationUseSiteTarget);

    public abstract java.lang.String OLrzqt(@NotNull InterfaceC59317zek interfaceC59317zek);

    public abstract java.lang.String copydefault(@NotNull InterfaceC56665yNu interfaceC56665yNu);

    public abstract java.lang.String copydefault(@NotNull C56930yXp c56930yXp);

    public final yXX OLrzqt(@NotNull Function1<? super InterfaceC56959yYr, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.copydefault(this, "");
        C56963yYv c56963yYvKWHzl = ((C56949yYh) this).uzCIH().KWHzl();
        function1.invoke(c56963yYvKWHzl);
        c56963yYvKWHzl.dvKsVJ();
        return new C56949yYh(c56963yYvKWHzl);
    }

    public static /* synthetic */ java.lang.String renderAnnotation$default(yXX yxx, yOJ yoj, AnnotationUseSiteTarget annotationUseSiteTarget, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        return yxx.OLrzqt(yoj, annotationUseSiteTarget);
    }

    public interface ActionBar {
        void KWHzl(int i, @NotNull java.lang.StringBuilder sb);

        void KWHzl(@NotNull InterfaceC56695yOx interfaceC56695yOx, int i, int i2, @NotNull java.lang.StringBuilder sb);

        void OLrzqt(@NotNull InterfaceC56695yOx interfaceC56695yOx, int i, int i2, @NotNull java.lang.StringBuilder sb);

        void copydefault(int i, @NotNull java.lang.StringBuilder sb);

        public static final class Application implements ActionBar {
            public static final Application AEQbTJ = new Application();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yXX.ActionBar
            public void OLrzqt(@NotNull InterfaceC56695yOx interfaceC56695yOx, int i, int i2, @NotNull java.lang.StringBuilder sb) {
                Intrinsics.checkNotNullParameter(interfaceC56695yOx, "");
                Intrinsics.checkNotNullParameter(sb, "");
            }

            private Application() {
            }

            @Override // o.yXX.ActionBar
            public void copydefault(int i, @NotNull java.lang.StringBuilder sb) {
                Intrinsics.checkNotNullParameter(sb, "");
                sb.append("(");
            }

            @Override // o.yXX.ActionBar
            public void KWHzl(int i, @NotNull java.lang.StringBuilder sb) {
                Intrinsics.checkNotNullParameter(sb, "");
                sb.append(")");
            }

            @Override // o.yXX.ActionBar
            public void KWHzl(@NotNull InterfaceC56695yOx interfaceC56695yOx, int i, int i2, @NotNull java.lang.StringBuilder sb) {
                Intrinsics.checkNotNullParameter(interfaceC56695yOx, "");
                Intrinsics.checkNotNullParameter(sb, "");
                if (i != i2 - 1) {
                    sb.append(", ");
                }
            }
        }
    }

    public static final class StateListAnimator {

        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ClassKind.values().length];
                try {
                    iArr[ClassKind.CLASS.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ClassKind.INTERFACE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClassKind.ENUM_CLASS.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClassKind.OBJECT.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[ClassKind.ENUM_ENTRY.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yXX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final yXX AEQbTJ(@NotNull Function1<? super InterfaceC56959yYr, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            C56963yYv c56963yYv = new C56963yYv();
            function1.invoke(c56963yYv);
            c56963yYv.dvKsVJ();
            return new C56949yYh(c56963yYv);
        }

        public final java.lang.String EZpvd(@NotNull InterfaceC56659yNo interfaceC56659yNo) {
            Intrinsics.checkNotNullParameter(interfaceC56659yNo, "");
            if (interfaceC56659yNo instanceof InterfaceC56690yOs) {
                return "typealias";
            }
            if (interfaceC56659yNo instanceof InterfaceC56658yNn) {
                InterfaceC56658yNn interfaceC56658yNn = (InterfaceC56658yNn) interfaceC56659yNo;
                if (interfaceC56658yNn.AuCTelauCTel()) {
                    return "companion object";
                }
                switch (TaskDescription.OLrzqt[interfaceC56658yNn.DbNXlk().ordinal()]) {
                    case 1:
                        return "class";
                    case 2:
                        return "interface";
                    case 3:
                        return "enum class";
                    case 4:
                        return "object";
                    case 5:
                        return "annotation class";
                    case 6:
                        return "enum entry";
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            throw new java.lang.AssertionError("Unexpected classifier: " + interfaceC56659yNo);
        }
    }

    static {
        StateListAnimator stateListAnimator = new StateListAnimator(null);
        AEQbTJ = stateListAnimator;
        isConnected = stateListAnimator.AEQbTJ(C56942yYa.EZpvd);
        KWHzl = stateListAnimator.AEQbTJ(C56943yYb.OLrzqt);
        OLrzqt = stateListAnimator.AEQbTJ(C56948yYg.copydefault);
        copydefault = stateListAnimator.AEQbTJ(C56946yYe.AEQbTJ);
        EZpvd = stateListAnimator.AEQbTJ(C56945yYd.OLrzqt);
        valueOf = stateListAnimator.AEQbTJ(C56944yYc.OLrzqt);
        gEmmrt = stateListAnimator.AEQbTJ(C56953yYl.EZpvd);
        AYXKKw = stateListAnimator.AEQbTJ(C56951yYj.OLrzqt);
        AkhnZx = stateListAnimator.AEQbTJ(C56952yYk.EZpvd);
        djBIcL = stateListAnimator.AEQbTJ(C56950yYi.AEQbTJ);
        AhwBna = stateListAnimator.AEQbTJ(C56947yYf.KWHzl);
    }

    public static final Unit DbNXlk(InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        interfaceC56959yYr.OLrzqt(yEE.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        interfaceC56959yYr.AYXKKw(false);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        interfaceC56959yYr.AYXKKw(false);
        interfaceC56959yYr.OLrzqt(yEE.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        interfaceC56959yYr.AYXKKw(false);
        interfaceC56959yYr.OLrzqt(yEE.copydefault());
        interfaceC56959yYr.AhwBna(true);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        interfaceC56959yYr.OLrzqt(yEE.copydefault());
        interfaceC56959yYr.EZpvd(yXY.Application.OLrzqt);
        interfaceC56959yYr.copydefault(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        interfaceC56959yYr.AYXKKw(false);
        interfaceC56959yYr.OLrzqt(yEE.copydefault());
        interfaceC56959yYr.EZpvd(yXY.Application.OLrzqt);
        interfaceC56959yYr.djBIcL(true);
        interfaceC56959yYr.copydefault(ParameterNameRenderingPolicy.NONE);
        interfaceC56959yYr.KWHzl(true);
        interfaceC56959yYr.AEQbTJ(true);
        interfaceC56959yYr.AhwBna(true);
        interfaceC56959yYr.EZpvd(true);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        interfaceC56959yYr.OLrzqt(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        interfaceC56959yYr.OLrzqt(DescriptorRendererModifier.ALL);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        interfaceC56959yYr.EZpvd(yXY.Application.OLrzqt);
        interfaceC56959yYr.copydefault(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        interfaceC56959yYr.OLrzqt(true);
        interfaceC56959yYr.EZpvd(yXY.StateListAnimator.OLrzqt);
        interfaceC56959yYr.OLrzqt(DescriptorRendererModifier.ALL);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        interfaceC56959yYr.OLrzqt(RenderingFormat.HTML);
        interfaceC56959yYr.OLrzqt(DescriptorRendererModifier.ALL);
        return Unit.INSTANCE;
    }
}
