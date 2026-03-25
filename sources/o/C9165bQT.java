package o;

import kotlin.jvm.internal.Intrinsics;
import o.C9215bRQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bQT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9165bQT extends C9215bRQ {
    public final C9745bbQ AEQbTJ;
    public final boolean AYXKKw;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public boolean djBIcL;
    public final boolean gEmmrt;
    public final java.lang.CharSequence valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9745bbQ KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9165bQT(int i, @NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull C9215bRQ.ActionBar actionBar, @NotNull C9215bRQ.Activity activity, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, @NotNull java.lang.String str5, boolean z2, C9745bbQ c9745bbQ, @NotNull java.lang.String str6, @NotNull java.lang.String str7, boolean z3, @NotNull java.lang.String str8, java.lang.CharSequence charSequence) {
        super(i, c10854bwM, str, str3, str4, str2, actionBar, activity, false, 256, null);
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.gEmmrt = z;
        this.copydefault = str5;
        this.AYXKKw = z2;
        this.AEQbTJ = c9745bbQ;
        this.EZpvd = str6;
        this.OLrzqt = str7;
        this.djBIcL = z3;
        this.KWHzl = str8;
        this.valueOf = charSequence;
    }
}
