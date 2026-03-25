package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56969yZa extends AbstractC56986yZr<java.lang.Character> {
    public C56969yZa(char c) {
        super(java.lang.Character.valueOf(c));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/yNP;)Lo/zdF; */
    @Override // o.AbstractC56975yZg
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AbstractC59242zdO OLrzqt(@NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        AbstractC59242zdO abstractC59242zdOFetchVPNInfo = ynp.AEQbTJ().fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOFetchVPNInfo, "");
        return abstractC59242zdOFetchVPNInfo;
    }

    @Override // o.AbstractC56975yZg
    public java.lang.String toString() {
        char cCharValue = KWHzl().charValue();
        java.lang.String str = java.lang.String.format("\\u%04X ('%s')", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(cCharValue), AEQbTJ(KWHzl().charValue())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String AEQbTJ(char c) {
        switch (c) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
            default:
                return KWHzl(c) ? java.lang.String.valueOf(c) : "?";
            case '\f':
                return "\\f";
            case '\r':
                return "\\r";
        }
    }

    public final boolean KWHzl(char c) {
        byte type = (byte) java.lang.Character.getType(c);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }
}
