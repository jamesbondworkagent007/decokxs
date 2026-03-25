package com.reown.android.internal.common.model;

import com.reown.foundation.common.model.Key;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SymmetricKey implements Key {
    public final String keyAsHex;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SymmetricKey m7238boximpl(String str) {
        return new SymmetricKey(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m7239constructorimpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7240equalsimpl(String str, Object obj) {
        return (obj instanceof SymmetricKey) && Intrinsics.EZpvd((Object) str, (Object) ((SymmetricKey) obj).m7245unboximpl());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7241equalsimpl0(String str, String str2) {
        return Intrinsics.EZpvd((Object) str, (Object) str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7243hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7244toStringimpl(String str) {
        return "SymmetricKey(keyAsHex=" + str + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        return m7240equalsimpl(this.keyAsHex, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.foundation.common.model.Key
    public String getKeyAsHex() {
        return this.keyAsHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return m7243hashCodeimpl(this.keyAsHex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return m7244toStringimpl(this.keyAsHex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m7245unboximpl() {
        return this.keyAsHex;
    }

    @Override // com.reown.foundation.common.model.Key
    public byte[] getKeyAsBytes() {
        return Key.DefaultImpls.getKeyAsBytes(this);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.reown.android.internal.common.model.SymmetricKey.box-impl(java.lang.String):com.reown.android.internal.common.model.SymmetricKey] */
    public /* synthetic */ SymmetricKey(String str) {
        this.keyAsHex = str;
    }

    /* JADX INFO: renamed from: getKeyAsBytes-impl, reason: not valid java name */
    public static byte[] m7242getKeyAsBytesimpl(String str) {
        return m7238boximpl(str).getKeyAsBytes();
    }
}
