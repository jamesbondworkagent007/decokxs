package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.FA;
import o.FD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FI {
    public FD AEQbTJ;
    public final FK KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FK KWHzl() {
        return this.KWHzl;
    }

    public FI(@NotNull FK fk) {
        Intrinsics.checkNotNullParameter(fk, "");
        this.KWHzl = fk;
        this.AEQbTJ = FD.Application.EZpvd;
    }

    public final boolean AEQbTJ() {
        return Intrinsics.EZpvd(this.AEQbTJ, FD.ActionBar.AEQbTJ);
    }

    public final FA EZpvd() {
        FD fd = this.AEQbTJ;
        FD fd2 = FD.ActionBar.AEQbTJ;
        if (Intrinsics.EZpvd(fd, fd2)) {
            return null;
        }
        if (fd instanceof FD.TaskDescription.Activity) {
            FD.TaskDescription.Activity activity = (FD.TaskDescription.Activity) fd;
            FD.TaskDescription.C0803TaskDescription c0803TaskDescriptionKWHzl = activity.KWHzl();
            if (c0803TaskDescriptionKWHzl != null) {
                fd2 = c0803TaskDescriptionKWHzl;
            }
            this.AEQbTJ = fd2;
            return new FA.StateListAnimator(fd.EZpvd(), activity.copydefault());
        }
        if (fd instanceof FD.TaskDescription.C0803TaskDescription) {
            if (this.KWHzl.OLrzqt("<") && !this.KWHzl.OLrzqt("<![CDATA[")) {
                return AhwBna();
            }
            return valueOf();
        }
        if (Intrinsics.EZpvd(fd, FD.Application.EZpvd)) {
            fetchVPNInfo();
            this.AEQbTJ = FD.Activity.OLrzqt;
            return EZpvd();
        }
        if (!Intrinsics.EZpvd(fd, FD.Activity.OLrzqt)) {
            throw new NoWhenBranchMatchedException();
        }
        AkhnZx();
        return AhwBna();
    }

    public final kotlin.Pair<FA.Application, java.lang.String> copydefault() {
        FA.Application applicationDjBIcL = djBIcL();
        AkhnZx();
        char cEZpvd = this.KWHzl.EZpvd("trying to read attribute equals");
        if (cEZpvd != '=') {
            java.lang.String str = "Unexpected '" + cEZpvd + "' while trying to read attribute equals";
            FK fkKWHzl = KWHzl();
            int iMax = java.lang.Math.max(0, fkKWHzl.copydefault - 3);
            int iMin = java.lang.Math.min(fkKWHzl.KWHzl - 1, fkKWHzl.copydefault + 3);
            java.lang.String strSubstring = fkKWHzl.EZpvd.substring(iMax, iMin + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            throw new DeserializationException(str + '\n' + ("At offset " + fkKWHzl.copydefault + " (showing range " + iMax + '-' + iMin + "):\n" + FH.OLrzqt.replace(strSubstring, "·") + '\n' + (C59449zhJ.copydefault(" ", fkKWHzl.copydefault - iMax) + '^')));
        }
        AkhnZx();
        return C56390yDp.OLrzqt(applicationDjBIcL, AYXKKw());
    }

    public final java.lang.String OLrzqt() {
        java.lang.String strAEQbTJ = this.KWHzl.AEQbTJ("]]>", "trying to read CDATA content");
        this.KWHzl.OLrzqt(3, "trying to read end of CATA");
        return strAEQbTJ;
    }

    public final FA.Application djBIcL() {
        return KWHzl(this.KWHzl.OLrzqt());
    }

    public final java.lang.String AYXKKw() {
        char cEZpvd = this.KWHzl.EZpvd("trying to read attribute value");
        if (cEZpvd != '\'' && cEZpvd != '\"') {
            java.lang.String str = "Unexpected '" + cEZpvd + "' while trying to read attribute value";
            FK fkKWHzl = KWHzl();
            int iMax = java.lang.Math.max(0, fkKWHzl.copydefault - 3);
            int iMin = java.lang.Math.min(fkKWHzl.KWHzl - 1, fkKWHzl.copydefault + 3);
            java.lang.String strSubstring = fkKWHzl.EZpvd.substring(iMax, iMin + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            throw new DeserializationException(str + '\n' + ("At offset " + fkKWHzl.copydefault + " (showing range " + iMax + '-' + iMin + "):\n" + FH.OLrzqt.replace(strSubstring, "·") + '\n' + (C59449zhJ.copydefault(" ", fkKWHzl.copydefault - iMax) + '^')));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            char cEZpvd2 = this.KWHzl.EZpvd("trying to read a string");
            if (cEZpvd2 == '&') {
                sb.append(gEmmrt());
            } else {
                if (cEZpvd2 == '<') {
                    FK fkKWHzl2 = KWHzl();
                    int iMax2 = java.lang.Math.max(0, fkKWHzl2.copydefault - 3);
                    int iMin2 = java.lang.Math.min(fkKWHzl2.KWHzl - 1, fkKWHzl2.copydefault + 3);
                    java.lang.String strSubstring2 = fkKWHzl2.EZpvd.substring(iMax2, iMin2 + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    throw new DeserializationException("Unexpected '<' while trying to read a string\n" + ("At offset " + fkKWHzl2.copydefault + " (showing range " + iMax2 + '-' + iMin2 + "):\n" + FH.OLrzqt.replace(strSubstring2, "·") + '\n' + (C59449zhJ.copydefault(" ", fkKWHzl2.copydefault - iMax2) + '^')));
                }
                if (cEZpvd2 == cEZpvd) {
                    java.lang.String string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    return string;
                }
                sb.append(cEZpvd2);
            }
        }
    }

    public final char[] gEmmrt() {
        java.lang.String strAEQbTJ = this.KWHzl.AEQbTJ(";", "trying to read a char/entity reference");
        this.KWHzl.OLrzqt(1, "trying to read the end of a char/entity reference");
        MatchResult matchResultMatchEntire = FP.OLrzqt.matchEntire(strAEQbTJ);
        if (matchResultMatchEntire != null) {
            return C5160Ha.EZpvd(yHZ.copydefault, java.lang.Integer.parseInt(matchResultMatchEntire.OLrzqt().get(1)));
        }
        MatchResult matchResultMatchEntire2 = FP.EZpvd.matchEntire(strAEQbTJ);
        if (matchResultMatchEntire2 != null) {
            return C5160Ha.EZpvd(yHZ.copydefault, java.lang.Integer.parseInt(matchResultMatchEntire2.OLrzqt().get(1), CharsKt__CharJVMKt.checkRadix(16)));
        }
        java.lang.Object obj = FP.copydefault.get(strAEQbTJ);
        if (obj == null) {
            java.lang.String str = "Unknown reference '" + strAEQbTJ + '\'';
            FK fkKWHzl = KWHzl();
            int iMax = java.lang.Math.max(0, fkKWHzl.copydefault - 3);
            int iMin = java.lang.Math.min(fkKWHzl.KWHzl - 1, fkKWHzl.copydefault + 3);
            java.lang.String strSubstring = fkKWHzl.EZpvd.substring(iMax, iMin + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            throw new DeserializationException(str + '\n' + ("At offset " + fkKWHzl.copydefault + " (showing range " + iMax + '-' + iMin + "):\n" + FH.OLrzqt.replace(strSubstring, "·") + '\n' + (C59449zhJ.copydefault(" ", fkKWHzl.copydefault - iMax) + '^')));
        }
        return (char[]) obj;
    }

    public final FA AhwBna() {
        boolean z;
        FD c0803TaskDescription;
        char cEZpvd = this.KWHzl.EZpvd("looking for the start of a tag");
        if (cEZpvd != '<') {
            java.lang.String str = "Unexpected character '" + cEZpvd + "' while looking for the start of a tag";
            FK fkKWHzl = KWHzl();
            int iMax = java.lang.Math.max(0, fkKWHzl.copydefault - 3);
            int iMin = java.lang.Math.min(fkKWHzl.KWHzl - 1, fkKWHzl.copydefault + 3);
            java.lang.String strSubstring = fkKWHzl.EZpvd.substring(iMax, iMin + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            throw new DeserializationException(str + '\n' + ("At offset " + fkKWHzl.copydefault + " (showing range " + iMax + '-' + iMin + "):\n" + FH.OLrzqt.replace(strSubstring, "·") + '\n' + (C59449zhJ.copydefault(" ", fkKWHzl.copydefault - iMax) + '^')));
        }
        if (this.KWHzl.AEQbTJ("!--")) {
            isConnected();
            FA faEZpvd = EZpvd();
            Intrinsics.copydefault(faEZpvd);
            return faEZpvd;
        }
        if (this.KWHzl.AEQbTJ("/")) {
            FD fd = this.AEQbTJ;
            Intrinsics.copydefault(fd, "");
            FD.TaskDescription.C0803TaskDescription c0803TaskDescription2 = (FD.TaskDescription.C0803TaskDescription) fd;
            FA.Application applicationOLrzqt = c0803TaskDescription2.OLrzqt();
            FA.Application applicationDjBIcL = djBIcL();
            if (!Intrinsics.EZpvd(applicationDjBIcL, applicationOLrzqt)) {
                java.lang.String str2 = "Unexpected '/" + applicationDjBIcL + "' tag while looking for '/" + applicationOLrzqt + "' tag";
                FK fkKWHzl2 = KWHzl();
                int iMax2 = java.lang.Math.max(0, fkKWHzl2.copydefault - 3);
                int iMin2 = java.lang.Math.min(fkKWHzl2.KWHzl - 1, fkKWHzl2.copydefault + 3);
                java.lang.String strSubstring2 = fkKWHzl2.EZpvd.substring(iMax2, iMin2 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                throw new DeserializationException(str2 + '\n' + ("At offset " + fkKWHzl2.copydefault + " (showing range " + iMax2 + '-' + iMin2 + "):\n" + FH.OLrzqt.replace(strSubstring2, "·") + '\n' + (C59449zhJ.copydefault(" ", fkKWHzl2.copydefault - iMax2) + '^')));
            }
            AkhnZx();
            char cEZpvd2 = this.KWHzl.EZpvd("looking for the end of a tag");
            if (cEZpvd2 != '>') {
                java.lang.String str3 = "Unexpected character '" + cEZpvd2 + "' while looking for the end of a tag";
                FK fkKWHzl3 = KWHzl();
                int iMax3 = java.lang.Math.max(0, fkKWHzl3.copydefault - 3);
                int iMin3 = java.lang.Math.min(fkKWHzl3.KWHzl - 1, fkKWHzl3.copydefault + 3);
                java.lang.String strSubstring3 = fkKWHzl3.EZpvd.substring(iMax3, iMin3 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                throw new DeserializationException(str3 + '\n' + ("At offset " + fkKWHzl3.copydefault + " (showing range " + iMax3 + '-' + iMin3 + "):\n" + FH.OLrzqt.replace(strSubstring3, "·") + '\n' + (C59449zhJ.copydefault(" ", fkKWHzl3.copydefault - iMax3) + '^')));
            }
            FD fdCopydefault = c0803TaskDescription2.copydefault();
            if (fdCopydefault == null) {
                fdCopydefault = FD.ActionBar.AEQbTJ;
            }
            this.AEQbTJ = fdCopydefault;
            return new FA.StateListAnimator(c0803TaskDescription2.EZpvd(), applicationDjBIcL);
        }
        FD fd2 = this.AEQbTJ;
        FD.TaskDescription.C0803TaskDescription c0803TaskDescription3 = fd2 instanceof FD.TaskDescription.C0803TaskDescription ? (FD.TaskDescription.C0803TaskDescription) fd2 : null;
        FD.TaskDescription.C0803TaskDescription c0803TaskDescriptionCopy$default = c0803TaskDescription3 != null ? FD.TaskDescription.C0803TaskDescription.copy$default(c0803TaskDescription3, null, null, true, 3, null) : null;
        FA.Application applicationDjBIcL2 = djBIcL();
        AkhnZx();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            char cEZpvd3 = this.KWHzl.EZpvd("looking for the end of a tag");
            if (cEZpvd3 != '/') {
                if (cEZpvd3 == '>') {
                    z = false;
                    break;
                }
                this.KWHzl.KWHzl(1, "looking for the beginning of an attribute");
                kotlin.Pair<FA.Application, java.lang.String> pairCopydefault = copydefault();
                linkedHashMap.put(pairCopydefault.getFirst(), pairCopydefault.getSecond());
                AkhnZx();
            } else {
                z = true;
                break;
            }
        }
        kotlin.Pair pairEZpvd = FP.EZpvd((java.util.Map<FA.Application, java.lang.String>) linkedHashMap);
        java.util.Map map = (java.util.Map) pairEZpvd.component1();
        java.util.List list = (java.util.List) pairEZpvd.component2();
        if (z) {
            if (this.KWHzl.EZpvd("looking for the end of a tag") == '>') {
                c0803TaskDescription = new FD.TaskDescription.Activity(applicationDjBIcL2, c0803TaskDescriptionCopy$default);
            } else {
                FK fkKWHzl4 = KWHzl();
                int iMax4 = java.lang.Math.max(0, fkKWHzl4.copydefault - 3);
                int iMin4 = java.lang.Math.min(fkKWHzl4.KWHzl - 1, fkKWHzl4.copydefault + 3);
                java.lang.String strSubstring4 = fkKWHzl4.EZpvd.substring(iMax4, iMin4 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
                throw new DeserializationException("Unexpected characters while looking for the end of a tag\n" + ("At offset " + fkKWHzl4.copydefault + " (showing range " + iMax4 + '-' + iMin4 + "):\n" + FH.OLrzqt.replace(strSubstring4, "·") + '\n' + (C59449zhJ.copydefault(" ", fkKWHzl4.copydefault - iMax4) + '^')));
            }
        } else {
            c0803TaskDescription = new FD.TaskDescription.C0803TaskDescription(applicationDjBIcL2, c0803TaskDescriptionCopy$default, false);
        }
        this.AEQbTJ = c0803TaskDescription;
        return new FA.ActionBar(c0803TaskDescription.EZpvd(), applicationDjBIcL2, map, list);
    }

    public final FA valueOf() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = true;
        while (true) {
            char cEZpvd = this.KWHzl.EZpvd("reading text node");
            if (cEZpvd == ' ' || cEZpvd == '\t' || cEZpvd == '\r' || cEZpvd == '\n') {
                sb.append(cEZpvd);
            } else {
                if (cEZpvd == '<') {
                    if (!this.KWHzl.AEQbTJ("!--")) {
                        if (!this.KWHzl.AEQbTJ("![CDATA[")) {
                            break;
                        }
                        sb.append(OLrzqt());
                    } else {
                        isConnected();
                    }
                } else if (cEZpvd == '&') {
                    sb.append(gEmmrt());
                } else {
                    sb.append(cEZpvd);
                }
                z = false;
            }
        }
        this.KWHzl.KWHzl(1, "looking for the beginning of a tag");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        FD fd = this.AEQbTJ;
        Intrinsics.copydefault(fd, "");
        FD.TaskDescription.C0803TaskDescription c0803TaskDescription = (FD.TaskDescription.C0803TaskDescription) fd;
        boolean zAEQbTJ = c0803TaskDescription.AEQbTJ();
        boolean zOLrzqt = this.KWHzl.OLrzqt("</");
        FD.TaskDescription.C0803TaskDescription c0803TaskDescriptionCopy$default = FD.TaskDescription.C0803TaskDescription.copy$default(c0803TaskDescription, null, null, true, 3, null);
        this.AEQbTJ = c0803TaskDescriptionCopy$default;
        if (z && (zAEQbTJ || !zOLrzqt)) {
            FA faEZpvd = EZpvd();
            Intrinsics.copydefault(faEZpvd);
            return faEZpvd;
        }
        return new FA.Dialog(c0803TaskDescriptionCopy$default.EZpvd(), string);
    }

    public final void isConnected() {
        this.KWHzl.KWHzl("-->", "looking for the end of a comment");
    }

    public final void fetchVPNInfo() {
        AkhnZx();
        while (this.KWHzl.AEQbTJ("<?")) {
            this.KWHzl.KWHzl();
            AkhnZx();
            while (!this.KWHzl.AEQbTJ("?>")) {
                copydefault();
                AkhnZx();
            }
            AkhnZx();
        }
    }

    public final void AkhnZx() {
        this.KWHzl.EZpvd();
    }

    public final FA.Application KWHzl(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new char[]{AbstractJsonLexerKt.COLON}, false, 0, 6, (java.lang.Object) null);
        if (!(listSplit$default instanceof java.util.Collection) || !listSplit$default.isEmpty()) {
            java.util.Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                if (((java.lang.String) it.next()).length() == 0) {
                    java.lang.String str2 = "Cannot understand qualified name '" + str + '\'';
                    FK fkKWHzl = KWHzl();
                    int iMax = java.lang.Math.max(0, fkKWHzl.copydefault - 3);
                    int iMin = java.lang.Math.min(fkKWHzl.KWHzl - 1, fkKWHzl.copydefault + 3);
                    java.lang.String strSubstring = fkKWHzl.EZpvd.substring(iMax, iMin + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    throw new DeserializationException(str2 + '\n' + ("At offset " + fkKWHzl.copydefault + " (showing range " + iMax + '-' + iMin + "):\n" + FH.OLrzqt.replace(strSubstring, "·") + '\n' + (C59449zhJ.copydefault(" ", fkKWHzl.copydefault - iMax) + '^')));
                }
            }
        }
        int size = listSplit$default.size();
        if (size == 1) {
            return new FA.Application((java.lang.String) listSplit$default.get(0), null, 2, null);
        }
        if (size == 2) {
            return new FA.Application((java.lang.String) listSplit$default.get(1), (java.lang.String) listSplit$default.get(0));
        }
        java.lang.String str3 = "Cannot understand qualified name '" + str + '\'';
        FK fkKWHzl2 = KWHzl();
        int iMax2 = java.lang.Math.max(0, fkKWHzl2.copydefault - 3);
        int iMin2 = java.lang.Math.min(fkKWHzl2.KWHzl - 1, fkKWHzl2.copydefault + 3);
        java.lang.String strSubstring2 = fkKWHzl2.EZpvd.substring(iMax2, iMin2 + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        throw new DeserializationException(str3 + '\n' + ("At offset " + fkKWHzl2.copydefault + " (showing range " + iMax2 + '-' + iMin2 + "):\n" + FH.OLrzqt.replace(strSubstring2, "·") + '\n' + (C59449zhJ.copydefault(" ", fkKWHzl2.copydefault - iMax2) + '^')));
    }
}
