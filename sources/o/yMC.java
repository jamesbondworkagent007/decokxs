package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yMC {
    public static final /* synthetic */ yJA<java.lang.Object>[] KWHzl = {C56524yIo.copydefault(new PropertyReference1Impl(yMC.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(yMC.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(yMC.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(yMC.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(yMC.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(yMC.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(yMC.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(yMC.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0))};
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final ActionBar AEQbTJ;
    public final ActionBar AYXKKw;
    public final ActionBar AhwBna;
    public final yNO DbNXlk;
    public final ActionBar EZpvd;
    public final ActionBar copydefault;
    public final ActionBar djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final ActionBar gEmmrt;
    public final ActionBar valueOf;

    public yMC(@NotNull yNP ynp, @NotNull yNO yno) {
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(yno, "");
        this.DbNXlk = yno;
        this.fetchVPNInfo = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new yME(ynp));
        this.AEQbTJ = new ActionBar(1);
        this.gEmmrt = new ActionBar(1);
        this.valueOf = new ActionBar(1);
        this.AYXKKw = new ActionBar(2);
        this.djBIcL = new ActionBar(3);
        this.EZpvd = new ActionBar(1);
        this.copydefault = new ActionBar(2);
        this.AhwBna = new ActionBar(3);
    }

    public final InterfaceC59098zad OLrzqt() {
        return (InterfaceC59098zad) this.fetchVPNInfo.getValue();
    }

    public static final InterfaceC59098zad OLrzqt(yNP ynp) {
        return ynp.copydefault(yMB.getNewProxyInstance).EZpvd();
    }

    public final InterfaceC56658yNn OLrzqt(java.lang.String str, int i) {
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(str);
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        InterfaceC56663yNs interfaceC56663yNsEZpvd = OLrzqt().EZpvd(c56935yXuAEQbTJ, NoLookupLocation.FROM_REFLECTION);
        InterfaceC56658yNn interfaceC56658yNn = interfaceC56663yNsEZpvd instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsEZpvd : null;
        return interfaceC56658yNn == null ? this.DbNXlk.OLrzqt(new C56929yXo(yMB.getNewProxyInstance, c56935yXuAEQbTJ), C56402yEa.EZpvd(java.lang.Integer.valueOf(i))) : interfaceC56658yNn;
    }

    public static final class ActionBar {
        public final int copydefault;

        public ActionBar(int i) {
            this.copydefault = i;
        }

        public final InterfaceC56658yNn KWHzl(@NotNull yMC ymc, @NotNull yJA<?> yja) {
            Intrinsics.checkNotNullParameter(ymc, "");
            Intrinsics.checkNotNullParameter(yja, "");
            return ymc.OLrzqt(C59428zgp.EZpvd(yja.getName()), this.copydefault);
        }
    }

    public final InterfaceC56658yNn AEQbTJ() {
        return this.AEQbTJ.KWHzl(this, KWHzl[0]);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yMC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AbstractC59233zdF EZpvd(@NotNull yNP ynp) {
            Intrinsics.checkNotNullParameter(ynp, "");
            InterfaceC56658yNn interfaceC56658yNnCopydefault = yNE.copydefault(ynp, yMB.Application.DTwDnp);
            if (interfaceC56658yNnCopydefault == null) {
                return null;
            }
            C59308zeb c59308zebCopydefault = C59308zeb.OLrzqt.copydefault();
            java.util.List<InterfaceC56691yOt> listCopydefault = interfaceC56658yNnCopydefault.fJNWhG().copydefault();
            Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
            java.lang.Object objGHZMYf = CollectionsKt___CollectionsKt.gHZMYf(listCopydefault);
            Intrinsics.checkNotNullExpressionValue(objGHZMYf, "");
            return C59231zdD.KWHzl(c59308zebCopydefault, interfaceC56658yNnCopydefault, C56402yEa.EZpvd(new C59250zdW((InterfaceC56691yOt) objGHZMYf)));
        }
    }
}
