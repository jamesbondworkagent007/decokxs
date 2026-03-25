package o;

import com.okinc.oklive.domain.model.TokenType;

/* JADX INFO: loaded from: classes24.dex */
public final class sWr {
    public static final sWr EZpvd = new sWr();

    private sWr() {
    }

    public final java.lang.String copydefault(TokenType tokenType) {
        return tokenType == TokenType.CEDEFI ? "cedifi" : "cefi";
    }
}
