package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.kethereum.crypto.LinuxSecureRandom;

/* JADX INFO: renamed from: o.zsy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59969zsy {
    public static final C59969zsy EZpvd;
    public static final java.security.SecureRandom KWHzl;
    public static final InterfaceC56387yDm copydefault;

    private C59969zsy() {
    }

    static {
        C59969zsy c59969zsy = new C59969zsy();
        EZpvd = c59969zsy;
        copydefault = C56392yDr.copydefault(new Function0<java.lang.Boolean>() { // from class: org.kethereum.crypto.SecureRandomUtils$isAndroidRuntime$2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                String property = System.getProperty("java.runtime.name");
                return Boolean.valueOf(property != null && Intrinsics.EZpvd((Object) property, (Object) "Android Runtime"));
            }
        });
        if (c59969zsy.KWHzl()) {
            new LinuxSecureRandom();
        }
        KWHzl = new java.security.SecureRandom();
    }

    public final boolean KWHzl() {
        return ((java.lang.Boolean) copydefault.getValue()).booleanValue();
    }
}
