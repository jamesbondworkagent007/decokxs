package com.reown.android.internal.common.signing.cacao;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Issuer {
    public static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String ISS_DELIMITER = ":";

    @Deprecated
    public static final int ISS_POSITION_OF_ADDRESS = 4;

    @Deprecated
    public static final int ISS_POSITION_OF_NAMESPACE = 2;

    @Deprecated
    public static final int ISS_POSITION_OF_REFERENCE = 3;
    public final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Issuer copy$default(Issuer issuer, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = issuer.value;
        }
        return issuer.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Issuer copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Issuer(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Issuer) && Intrinsics.EZpvd((Object) this.value, (Object) ((Issuer) obj).value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.value.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Issuer(value=" + this.value + ")";
    }

    public Issuer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    public final String getChainId() {
        return StringsKt__StringsKt.split$default((CharSequence) this.value, new String[]{":"}, false, 0, 6, (Object) null).get(2) + ":" + StringsKt__StringsKt.split$default((CharSequence) this.value, new String[]{":"}, false, 0, 6, (Object) null).get(3);
    }

    public final String getChainIdReference() {
        return (String) StringsKt__StringsKt.split$default((CharSequence) this.value, new String[]{":"}, false, 0, 6, (Object) null).get(3);
    }

    public final String getAddress() {
        return (String) StringsKt__StringsKt.split$default((CharSequence) this.value, new String[]{":"}, false, 0, 6, (Object) null).get(4);
    }

    public final String getNamespace() {
        return (String) StringsKt__StringsKt.split$default((CharSequence) this.value, new String[]{":"}, false, 0, 6, (Object) null).get(2);
    }

    public final String getAccountId() {
        return getChainId() + ":" + getAddress();
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.internal.common.signing.cacao.Issuer.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }
}
