package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C56524yIo;
import o.C60053zuc;
import o.C60060zuj;
import o.InterfaceC59997ztZ;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: renamed from: o.zty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60022zty {
    public final C60059zui EZpvd = new C60059zui(this);
    public final C60056zuf copydefault = new C60056zuf(this);
    public final C60057zug AEQbTJ = new C60057zug(this);
    public final C59984ztM KWHzl = new C59984ztM(this);
    public AbstractC59987ztP OLrzqt = new C59988ztQ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60059zui EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC59987ztP KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60056zuf OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60057zug copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull AbstractC59987ztP abstractC59987ztP) {
        Intrinsics.checkNotNullParameter(abstractC59987ztP, "");
        this.OLrzqt = abstractC59987ztP;
    }

    public static /* synthetic */ InterfaceC56387yDm inject$default(C60022zty c60022zty, final InterfaceC59997ztZ interfaceC59997ztZ, LazyThreadSafetyMode lazyThreadSafetyMode, final Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = C60071zuu.OLrzqt.EZpvd();
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "");
        final C60060zuj c60060zujOLrzqt = c60022zty.EZpvd().OLrzqt();
        Intrinsics.OLrzqt();
        return C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<T>() { // from class: org.koin.core.Koin$inject$$inlined$inject$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                C60060zuj c60060zuj = c60060zujOLrzqt;
                InterfaceC59997ztZ interfaceC59997ztZ2 = interfaceC59997ztZ;
                Function0<? extends C60053zuc> function02 = function0;
                Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), interfaceC59997ztZ2, function02);
            }
        });
    }

    public static /* synthetic */ InterfaceC56387yDm injectOrNull$default(C60022zty c60022zty, final InterfaceC59997ztZ interfaceC59997ztZ, LazyThreadSafetyMode lazyThreadSafetyMode, final Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = C60071zuu.OLrzqt.EZpvd();
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "");
        final C60060zuj c60060zujOLrzqt = c60022zty.EZpvd().OLrzqt();
        Intrinsics.OLrzqt();
        return C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<T>() { // from class: org.koin.core.Koin$injectOrNull$$inlined$injectOrNull$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                C60060zuj c60060zuj = c60060zujOLrzqt;
                InterfaceC59997ztZ interfaceC59997ztZ2 = interfaceC59997ztZ;
                Function0<? extends C60053zuc> function02 = function0;
                Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) c60060zuj.KWHzl(C56524yIo.AEQbTJ(Object.class), interfaceC59997ztZ2, function02);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: o.zuj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object get$default(C60022zty c60022zty, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        C60060zuj c60060zujOLrzqt = c60022zty.EZpvd().OLrzqt();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return c60060zujOLrzqt.AEQbTJ(C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: o.zuj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object getOrNull$default(C60022zty c60022zty, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        C60060zuj c60060zujOLrzqt = c60022zty.EZpvd().OLrzqt();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return c60060zujOLrzqt.KWHzl(C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.zty */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object get$default(C60022zty c60022zty, InterfaceC56551yJo interfaceC56551yJo, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return c60022zty.EZpvd(interfaceC56551yJo, interfaceC59997ztZ, function0);
    }

    public final <T> T EZpvd(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo, InterfaceC59997ztZ interfaceC59997ztZ, Function0<? extends C60053zuc> function0) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        return (T) this.EZpvd.OLrzqt().AEQbTJ(interfaceC56551yJo, interfaceC59997ztZ, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.zty */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object getOrNull$default(C60022zty c60022zty, InterfaceC56551yJo interfaceC56551yJo, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return c60022zty.copydefault((InterfaceC56551yJo<?>) interfaceC56551yJo, interfaceC59997ztZ, (Function0<? extends C60053zuc>) function0);
    }

    public final <T> T copydefault(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo, InterfaceC59997ztZ interfaceC59997ztZ, Function0<? extends C60053zuc> function0) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        return (T) this.EZpvd.OLrzqt().KWHzl(interfaceC56551yJo, interfaceC59997ztZ, function0);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.zuf.saveMapping$default(o.zuf, boolean, java.lang.String, o.ztK, boolean, int, java.lang.Object):void */
    public static /* synthetic */ void declare$default(C60022zty c60022zty, final java.lang.Object obj, InterfaceC59997ztZ interfaceC59997ztZ, java.util.List list, boolean z, int i, java.lang.Object obj2) {
        InterfaceC59997ztZ interfaceC59997ztZ2 = (i & 2) != 0 ? null : interfaceC59997ztZ;
        java.util.List listAhwBna = (i & 4) != 0 ? yDY.AhwBna() : list;
        boolean z2 = (i & 8) != 0 ? true : z;
        Intrinsics.checkNotNullParameter(listAhwBna, "");
        C60056zuf c60056zufOLrzqt = c60022zty.OLrzqt();
        InterfaceC59997ztZ interfaceC59997ztZCopydefault = c60056zufOLrzqt.KWHzl().EZpvd().OLrzqt().copydefault();
        Kind kind = Kind.Scoped;
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, T> function2 = new Function2<C60060zuj, C60053zuc, T>() { // from class: org.koin.core.Koin$declare$$inlined$declareRootInstance$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final T invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                return (T) obj;
            }
        };
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C59978ztG c59978ztG = new C59978ztG(interfaceC59997ztZCopydefault, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ2, function2, kind, listAhwBna);
        C59990ztS c59990ztS = new C59990ztS(c59978ztG);
        C60056zuf.saveMapping$default(c60056zufOLrzqt, z2, C59977ztF.EZpvd(c59978ztG.EZpvd(), c59978ztG.OLrzqt(), c59978ztG.copydefault()), c59990ztS, false, 8, null);
        java.util.Iterator<T> it = c59978ztG.valueOf().iterator();
        while (it.hasNext()) {
            C60056zuf.saveMapping$default(c60056zufOLrzqt, z2, C59977ztF.EZpvd((InterfaceC56551yJo) it.next(), c59978ztG.OLrzqt(), c59978ztG.copydefault()), c59990ztS, false, 8, null);
        }
    }

    public static /* synthetic */ C60060zuj createScope$default(C60022zty c60022zty, java.lang.String str, InterfaceC59997ztZ interfaceC59997ztZ, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return c60022zty.OLrzqt(str, interfaceC59997ztZ, obj);
    }

    public final C60060zuj OLrzqt(@NotNull java.lang.String str, @NotNull InterfaceC59997ztZ interfaceC59997ztZ, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ, "");
        return this.EZpvd.EZpvd(str, interfaceC59997ztZ, obj);
    }

    public static /* synthetic */ C60060zuj createScope$default(C60022zty c60022zty, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return c60022zty.EZpvd().EZpvd(str, new C60054zud(C56524yIo.AEQbTJ(java.lang.Object.class)), obj);
    }

    public static /* synthetic */ C60060zuj createScope$default(C60022zty c60022zty, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = C60071zuu.OLrzqt.KWHzl();
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return c60022zty.EZpvd().EZpvd(str, new C60054zud(C56524yIo.AEQbTJ(java.lang.Object.class)), null);
    }

    public static /* synthetic */ C60060zuj getOrCreateScope$default(C60022zty c60022zty, java.lang.String str, InterfaceC59997ztZ interfaceC59997ztZ, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return c60022zty.AEQbTJ(str, interfaceC59997ztZ, obj);
    }

    public final C60060zuj AEQbTJ(@NotNull java.lang.String str, @NotNull InterfaceC59997ztZ interfaceC59997ztZ, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ, "");
        C60060zuj c60060zujCopydefault = this.EZpvd.copydefault(str);
        return c60060zujCopydefault == null ? OLrzqt(str, interfaceC59997ztZ, obj) : c60060zujCopydefault;
    }

    public final C60060zuj OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.copydefault(str);
    }

    public static /* synthetic */ void loadModules$default(C60022zty c60022zty, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c60022zty.copydefault((java.util.List<C59991ztT>) list, z, z2);
    }

    public final void copydefault(@NotNull java.util.List<C59991ztT> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Set<C59991ztT> setCopydefault = C59995ztX.copydefault(list);
        this.copydefault.OLrzqt(setCopydefault, z);
        this.EZpvd.copydefault(setCopydefault);
        if (z2) {
            AEQbTJ();
        }
    }

    public final void AEQbTJ() {
        this.OLrzqt.EZpvd("Create eager instances ...");
        long jCopydefault = C60072zuv.OLrzqt.copydefault();
        this.copydefault.OLrzqt();
        double dDoubleValue = ((java.lang.Number) new kotlin.Pair(Unit.INSTANCE, java.lang.Double.valueOf((r0.copydefault() - jCopydefault) / 1000000.0d)).getSecond()).doubleValue();
        this.OLrzqt.EZpvd("Created eager instances in " + dDoubleValue + " ms");
    }
}
