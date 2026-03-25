package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59968zsx {
    public static final <T> T EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return (T) java.lang.Class.forName(Intrinsics.KWHzl("org.kethereum.crypto.impl.", str)).newInstance();
        } catch (java.lang.ClassNotFoundException unused) {
            throw new java.lang.RuntimeException("There is not implementation found for " + str + " - you need to either depend on crypto_impl_spongycastle or crypto_impl_bouncycastle");
        }
    }
}
