package o;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;
import org.koin.core.error.DefinitionOverrideException;

/* JADX INFO: renamed from: o.ztX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59995ztX {
    public static final void AEQbTJ(@NotNull AbstractC59982ztK<?> abstractC59982ztK, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC59982ztK, "");
        Intrinsics.checkNotNullParameter(str, "");
        throw new DefinitionOverrideException("Already existing definition for " + abstractC59982ztK.OLrzqt() + " at " + str);
    }

    public static /* synthetic */ C59990ztS _singleInstanceFactory$default(InterfaceC59997ztZ interfaceC59997ztZ, Function2 function2, InterfaceC59997ztZ interfaceC59997ztZ2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        InterfaceC59997ztZ interfaceC59997ztZ3 = interfaceC59997ztZ;
        if ((i & 4) != 0) {
            interfaceC59997ztZ2 = C60059zui.KWHzl.KWHzl();
        }
        InterfaceC59997ztZ interfaceC59997ztZ4 = interfaceC59997ztZ2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ4, "");
        Kind kind = Kind.Singleton;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new C59990ztS(new C59978ztG(interfaceC59997ztZ4, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ3, function2, kind, listAhwBna));
    }

    public static /* synthetic */ C59981ztJ _factoryInstanceFactory$default(InterfaceC59997ztZ interfaceC59997ztZ, Function2 function2, InterfaceC59997ztZ interfaceC59997ztZ2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        InterfaceC59997ztZ interfaceC59997ztZ3 = interfaceC59997ztZ;
        if ((i & 4) != 0) {
            interfaceC59997ztZ2 = C60059zui.KWHzl.KWHzl();
        }
        InterfaceC59997ztZ interfaceC59997ztZ4 = interfaceC59997ztZ2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ4, "");
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new C59981ztJ(new C59978ztG(interfaceC59997ztZ4, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ3, function2, kind, listAhwBna));
    }

    public static /* synthetic */ C59989ztR _scopedInstanceFactory$default(InterfaceC59997ztZ interfaceC59997ztZ, Function2 function2, InterfaceC59997ztZ interfaceC59997ztZ2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ2, "");
        Kind kind = Kind.Scoped;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new C59989ztR(new C59978ztG(interfaceC59997ztZ2, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, function2, kind, listAhwBna));
    }

    public static final java.util.Set<C59991ztT> copydefault(@NotNull java.util.List<C59991ztT> list) {
        Intrinsics.checkNotNullParameter(list, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AEQbTJ(list, linkedHashSet);
        return linkedHashSet;
    }

    public static final void AEQbTJ(java.util.List<C59991ztT> list, java.util.Set<C59991ztT> set) {
        for (C59991ztT c59991ztT : list) {
            set.add(c59991ztT);
            AEQbTJ(c59991ztT.AEQbTJ(), set);
        }
    }
}
