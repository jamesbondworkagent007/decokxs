package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import me.relex.circleindicator.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FK {
    public final java.lang.String EZpvd;
    public final int KWHzl;
    public int copydefault;

    public FK(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.KWHzl = str.length();
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C59449zhJ.startsWith$default(this.EZpvd, str, this.copydefault, false, 4, null)) {
            return false;
        }
        this.copydefault += str.length();
        return true;
    }

    public final void KWHzl() {
        char cCharAt;
        while (true) {
            int i = this.copydefault;
            if (i >= this.KWHzl || (cCharAt = this.EZpvd.charAt(i)) == ' ' || cCharAt == '\r' || cCharAt == '\n' || cCharAt == '\t') {
                return;
            } else {
                this.copydefault++;
            }
        }
    }

    public final void EZpvd() {
        while (true) {
            int i = this.copydefault;
            if (i >= this.KWHzl) {
                return;
            }
            char cCharAt = this.EZpvd.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\r' && cCharAt != '\n' && cCharAt != '\t') {
                return;
            } else {
                this.copydefault++;
            }
        }
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) AEQbTJ(java.lang.Math.min(str.length(), this.KWHzl - this.copydefault)), (java.lang.Object) str);
    }

    public final char EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = this.copydefault;
        int i2 = i + 1;
        if (i2 <= this.KWHzl) {
            java.lang.String str2 = this.EZpvd;
            this.copydefault = i2;
            return str2.charAt(i);
        }
        java.lang.String str3 = "Unexpected end-of-doc while " + str;
        int iMax = java.lang.Math.max(0, this.copydefault - 3);
        int iMin = java.lang.Math.min(this.KWHzl - 1, this.copydefault + 3);
        java.lang.String strSubstring = this.EZpvd.substring(iMax, iMin + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        throw new DeserializationException(str3 + '\n' + ("At offset " + this.copydefault + " (showing range " + iMax + '-' + iMin + "):\n" + FH.OLrzqt.replace(strSubstring, "·") + '\n' + (C59449zhJ.copydefault(" ", this.copydefault - iMax) + '^')));
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) this.EZpvd, str, this.copydefault, false, 4, (java.lang.Object) null);
        if (iIndexOf$default < 0) {
            java.lang.String str3 = "Unexpected end-of-doc while " + str2;
            int iMax = java.lang.Math.max(0, this.copydefault - 3);
            int iMin = java.lang.Math.min(this.KWHzl - 1, this.copydefault + 3);
            java.lang.String strSubstring = this.EZpvd.substring(iMax, iMin + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            throw new DeserializationException(str3 + '\n' + ("At offset " + this.copydefault + " (showing range " + iMax + '-' + iMin + "):\n" + FH.OLrzqt.replace(strSubstring, "·") + '\n' + (C59449zhJ.copydefault(" ", this.copydefault - iMax) + '^')));
        }
        int length = iIndexOf$default + str.length();
        java.lang.String strCopydefault = copydefault(length);
        this.copydefault = length;
        return strCopydefault;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) this.EZpvd, str, this.copydefault, false, 4, (java.lang.Object) null);
        if (iIndexOf$default < 0) {
            java.lang.String str3 = "Unexpected end-of-doc while " + str2;
            int iMax = java.lang.Math.max(0, this.copydefault - 3);
            int iMin = java.lang.Math.min(this.KWHzl - 1, this.copydefault + 3);
            java.lang.String strSubstring = this.EZpvd.substring(iMax, iMin + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            throw new DeserializationException(str3 + '\n' + ("At offset " + this.copydefault + " (showing range " + iMax + '-' + iMin + "):\n" + FH.OLrzqt.replace(strSubstring, "·") + '\n' + (C59449zhJ.copydefault(" ", this.copydefault - iMax) + '^')));
        }
        java.lang.String strCopydefault = copydefault(iIndexOf$default);
        this.copydefault = iIndexOf$default;
        return strCopydefault;
    }

    public final java.lang.String OLrzqt() {
        char c;
        char cCharAt = this.EZpvd.charAt(this.copydefault);
        int iCopydefault = Intrinsics.copydefault(97, (int) cCharAt);
        int i = BuildConfig.VERSION_CODE;
        int i2 = 90;
        if ((iCopydefault > 0 || Intrinsics.copydefault((int) cCharAt, 122) > 0) && ((Intrinsics.copydefault(65, (int) cCharAt) > 0 || Intrinsics.copydefault((int) cCharAt, 90) > 0) && cCharAt != ':' && cCharAt != '_' && ((Intrinsics.copydefault(192, (int) cCharAt) > 0 || Intrinsics.copydefault((int) cCharAt, BuildConfig.VERSION_CODE) > 0) && ((Intrinsics.copydefault(216, (int) cCharAt) > 0 || Intrinsics.copydefault((int) cCharAt, 246) > 0) && ((Intrinsics.copydefault(248, (int) cCharAt) > 0 || Intrinsics.copydefault((int) cCharAt, 767) > 0) && ((Intrinsics.copydefault(880, (int) cCharAt) > 0 || Intrinsics.copydefault((int) cCharAt, 893) > 0) && ((Intrinsics.copydefault(895, (int) cCharAt) > 0 || Intrinsics.copydefault((int) cCharAt, 8191) > 0) && ((Intrinsics.copydefault(8204, (int) cCharAt) > 0 || Intrinsics.copydefault((int) cCharAt, 8205) > 0) && ((Intrinsics.copydefault(8304, (int) cCharAt) > 0 || Intrinsics.copydefault((int) cCharAt, 8591) > 0) && ((Intrinsics.copydefault(11264, (int) cCharAt) > 0 || Intrinsics.copydefault((int) cCharAt, 12271) > 0) && (Intrinsics.copydefault(12289, (int) cCharAt) > 0 || Intrinsics.copydefault((int) cCharAt, 55295) > 0))))))))))) {
            java.lang.String str = "Found '" + cCharAt + "' but expected a valid XML start name character";
            int iMax = java.lang.Math.max(0, this.copydefault - 3);
            int iMin = java.lang.Math.min(this.KWHzl - 1, this.copydefault + 3);
            java.lang.String strSubstring = this.EZpvd.substring(iMax, iMin + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            throw new DeserializationException(str + '\n' + ("At offset " + this.copydefault + " (showing range " + iMax + '-' + iMin + "):\n" + FH.OLrzqt.replace(strSubstring, "·") + '\n' + (C59449zhJ.copydefault(" ", this.copydefault - iMax) + '^')));
        }
        int i3 = this.copydefault + 1;
        while (i3 < this.KWHzl) {
            char cCharAt2 = this.EZpvd.charAt(i3);
            if ((Intrinsics.copydefault(97, (int) cCharAt2) > 0 || Intrinsics.copydefault((int) cCharAt2, 122) > 0) && ((Intrinsics.copydefault(65, (int) cCharAt2) > 0 || Intrinsics.copydefault((int) cCharAt2, i2) > 0) && !((Intrinsics.copydefault(48, (int) cCharAt2) <= 0 && Intrinsics.copydefault((int) cCharAt2, 57) <= 0) || cCharAt2 == ':' || cCharAt2 == '-' || cCharAt2 == '.' || cCharAt2 == '_' || cCharAt2 == 183 || ((Intrinsics.copydefault(192, (int) cCharAt2) <= 0 && Intrinsics.copydefault((int) cCharAt2, i) <= 0) || ((Intrinsics.copydefault(216, (int) cCharAt2) <= 0 && Intrinsics.copydefault((int) cCharAt2, 246) <= 0) || ((Intrinsics.copydefault(248, (int) cCharAt2) <= 0 && Intrinsics.copydefault((int) cCharAt2, 767) <= 0) || (Intrinsics.copydefault(768, (int) cCharAt2) <= 0 && Intrinsics.copydefault((int) cCharAt2, 879) <= 0))))))) {
                if (Intrinsics.copydefault(880, (int) cCharAt2) <= 0) {
                    c = 893;
                    if (Intrinsics.copydefault((int) cCharAt2, 893) <= 0) {
                        continue;
                    }
                } else {
                    c = 893;
                }
                if ((Intrinsics.copydefault(895, (int) cCharAt2) > 0 || Intrinsics.copydefault((int) cCharAt2, 8191) > 0) && ((Intrinsics.copydefault(8204, (int) cCharAt2) > 0 || Intrinsics.copydefault((int) cCharAt2, 8205) > 0) && ((Intrinsics.copydefault(8255, (int) cCharAt2) > 0 || Intrinsics.copydefault((int) cCharAt2, 8256) > 0) && ((Intrinsics.copydefault(8304, (int) cCharAt2) > 0 || Intrinsics.copydefault((int) cCharAt2, 8591) > 0) && ((Intrinsics.copydefault(11264, (int) cCharAt2) > 0 || Intrinsics.copydefault((int) cCharAt2, 12271) > 0) && (Intrinsics.copydefault(12289, (int) cCharAt2) > 0 || Intrinsics.copydefault((int) cCharAt2, 55295) > 0)))))) {
                    break;
                }
            } else {
                c = 893;
            }
            i3++;
            i = BuildConfig.VERSION_CODE;
            i2 = 90;
        }
        java.lang.String strCopydefault = copydefault(i3);
        this.copydefault = i3;
        return strCopydefault;
    }

    public final java.lang.String copydefault(int i) {
        java.lang.String strSubstring = this.EZpvd.substring(this.copydefault, i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final java.lang.String AEQbTJ(int i) {
        return copydefault(this.copydefault + i);
    }

    public final void OLrzqt(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i2 = this.copydefault + i;
        if (i2 <= this.KWHzl) {
            this.copydefault = i2;
            return;
        }
        java.lang.String str2 = "Unexpected end-of-doc while " + str;
        int iMax = java.lang.Math.max(0, this.copydefault - 3);
        int iMin = java.lang.Math.min(this.KWHzl - 1, this.copydefault + 3);
        java.lang.String strSubstring = this.EZpvd.substring(iMax, iMin + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        throw new DeserializationException(str2 + '\n' + ("At offset " + this.copydefault + " (showing range " + iMax + '-' + iMin + "):\n" + FH.OLrzqt.replace(strSubstring, "·") + '\n' + (C59449zhJ.copydefault(" ", this.copydefault - iMax) + '^')));
    }

    public final void KWHzl(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i2 = this.copydefault;
        if ((-i) + i2 <= this.KWHzl) {
            this.copydefault = i2 - i;
            return;
        }
        java.lang.String str2 = "Unexpected end-of-doc while " + str;
        int iMax = java.lang.Math.max(0, this.copydefault - 3);
        int iMin = java.lang.Math.min(this.KWHzl - 1, this.copydefault + 3);
        java.lang.String strSubstring = this.EZpvd.substring(iMax, iMin + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        throw new DeserializationException(str2 + '\n' + ("At offset " + this.copydefault + " (showing range " + iMax + '-' + iMin + "):\n" + FH.OLrzqt.replace(strSubstring, "·") + '\n' + (C59449zhJ.copydefault(" ", this.copydefault - iMax) + '^')));
    }
}
