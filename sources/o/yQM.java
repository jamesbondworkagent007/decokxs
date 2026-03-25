package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yQM extends yQN implements InterfaceC56842yUi {
    public final java.lang.Class<?> AEQbTJ;
    public final boolean EZpvd;
    public final java.util.Collection<yTO> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yTM
    public java.util.Collection<yTO> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yTM
    public boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/reflect/Type; */
    @Override // o.yQN
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.Class<?> OLrzqt() {
        return this.AEQbTJ;
    }

    public yQM(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        this.AEQbTJ = cls;
        this.copydefault = yDY.AhwBna();
    }

    @Override // o.InterfaceC56842yUi
    public PrimitiveType copydefault() {
        if (Intrinsics.EZpvd(OLrzqt(), java.lang.Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get(OLrzqt().getName()).getPrimitiveType();
    }
}
