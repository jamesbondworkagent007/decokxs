package com.reown.foundation.common.model;

import com.reown.foundation.common.model.Key;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class PublicKey implements Key {
    private final String keyAsHex;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PublicKey m7316boximpl(String str) {
        return new PublicKey(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m7317constructorimpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7318equalsimpl(String str, Object obj) {
        return (obj instanceof PublicKey) && Intrinsics.EZpvd((Object) str, (Object) ((PublicKey) obj).m7323unboximpl());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7319equalsimpl0(String str, String str2) {
        return Intrinsics.EZpvd((Object) str, (Object) str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7321hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7322toStringimpl(String str) {
        return "PublicKey(keyAsHex=" + str + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        return m7318equalsimpl(this.keyAsHex, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.foundation.common.model.Key
    public String getKeyAsHex() {
        return this.keyAsHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return m7321hashCodeimpl(this.keyAsHex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return m7322toStringimpl(this.keyAsHex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m7323unboximpl() {
        return this.keyAsHex;
    }

    @Override // com.reown.foundation.common.model.Key
    public byte[] getKeyAsBytes() {
        return Key.DefaultImpls.getKeyAsBytes(this);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.reown.foundation.common.model.PublicKey.box-impl(java.lang.String):com.reown.foundation.common.model.PublicKey] */
    private /* synthetic */ PublicKey(String str) {
        this.keyAsHex = str;
    }

    /* JADX INFO: renamed from: getKeyAsBytes-impl, reason: not valid java name */
    public static byte[] m7320getKeyAsBytesimpl(String str) {
        return m7316boximpl(str).getKeyAsBytes();
    }
}
