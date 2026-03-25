package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import o.AbstractC59281zeA;
import o.AbstractC59287zeG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59328zev {
    public static /* synthetic */ TypeCheckerState createClassicTypeCheckerState$default(boolean z, boolean z2, InterfaceC59282zeB interfaceC59282zeB, AbstractC59281zeA abstractC59281zeA, AbstractC59287zeG abstractC59287zeG, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            interfaceC59282zeB = C59295zeO.copydefault;
        }
        if ((i & 8) != 0) {
            abstractC59281zeA = AbstractC59281zeA.Application.copydefault;
        }
        if ((i & 16) != 0) {
            abstractC59287zeG = AbstractC59287zeG.TaskDescription.KWHzl;
        }
        return EZpvd(z, z2, interfaceC59282zeB, abstractC59281zeA, abstractC59287zeG);
    }

    public static final TypeCheckerState EZpvd(boolean z, boolean z2, @NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull AbstractC59281zeA abstractC59281zeA, @NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(interfaceC59282zeB, "");
        Intrinsics.checkNotNullParameter(abstractC59281zeA, "");
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return new TypeCheckerState(z, z2, true, interfaceC59282zeB, abstractC59281zeA, abstractC59287zeG);
    }
}
