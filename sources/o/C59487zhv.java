package o;

import kotlin.text.Regex;

/* JADX INFO: renamed from: o.zhv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59487zhv {
    public static final C59487zhv EZpvd = new C59487zhv();
    public static final Regex KWHzl;

    private C59487zhv() {
    }

    static {
        java.lang.String str = "[eE][+-]?(\\p{Digit}+)";
        KWHzl = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }
}
