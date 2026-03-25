package com.reown.android.internal.common.model;

import com.reown.android.internal.utils.CoreValidator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class AccountId {
    public final String value;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.reown.android.internal.common.model.AccountId.<init>(java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AccountId m7210boximpl(String str) {
        return new AccountId(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m7211constructorimpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7212equalsimpl(String str, Object obj) {
        return (obj instanceof AccountId) && Intrinsics.EZpvd((Object) str, (Object) ((AccountId) obj).m7217unboximpl());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7213equalsimpl0(String str, String str2) {
        return Intrinsics.EZpvd((Object) str, (Object) str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7214hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7216toStringimpl(String str) {
        return "AccountId(value=" + str + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        return m7212equalsimpl(this.value, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return m7214hashCodeimpl(this.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return m7216toStringimpl(this.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m7217unboximpl() {
        return this.value;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.reown.android.internal.common.model.AccountId.box-impl(java.lang.String):com.reown.android.internal.common.model.AccountId] */
    public /* synthetic */ AccountId(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m7215isValidimpl(String str) {
        return CoreValidator.INSTANCE.isAccountIdCAIP10Compliant(str);
    }

    /* JADX INFO: renamed from: address-impl, reason: not valid java name */
    public static final String m7209addressimpl(String str) {
        return (String) CollectionsKt___CollectionsKt.AubY(StringsKt__StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null));
    }
}
