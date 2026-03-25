package o;

import com.amplifyframework.core.model.ModelIdentifier;
import okio.Utf8;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Token;
import org.jsoup.parser.TokeniserState;

/* JADX INFO: renamed from: o.zsi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C59953zsi {
    public Token.TaskDescription AEQbTJ;
    public ParseErrorList AhwBna;
    public Token.Fragment DbNXlk;
    public Token.StateListAnimator EZpvd;
    public java.lang.StringBuilder OLrzqt;
    public Token copydefault;
    public Token.Dialog djBIcL;
    public C59950zsf valueOf;
    public TokeniserState AkhnZx = TokeniserState.Data;
    public boolean AYXKKw = false;
    public java.lang.StringBuilder KWHzl = new java.lang.StringBuilder();
    public boolean gEmmrt = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ() {
        this.gEmmrt = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(TokeniserState tokeniserState) {
        this.AkhnZx = tokeniserState;
    }

    public C59953zsi(C59950zsf c59950zsf, ParseErrorList parseErrorList) {
        this.valueOf = c59950zsf;
        this.AhwBna = parseErrorList;
    }

    public Token gEmmrt() {
        if (!this.gEmmrt) {
            KWHzl("Self closing flag not acknowledged");
            this.gEmmrt = true;
        }
        while (!this.AYXKKw) {
            this.AkhnZx.read(this, this.valueOf);
        }
        if (this.KWHzl.length() <= 0) {
            this.AYXKKw = false;
            return this.copydefault;
        }
        java.lang.String string = this.KWHzl.toString();
        java.lang.StringBuilder sb = this.KWHzl;
        sb.delete(0, sb.length());
        return new Token.Activity(string);
    }

    public void KWHzl(Token token) {
        C59912zrU.EZpvd(this.AYXKKw, "There is an unread token pending!");
        this.copydefault = token;
        this.AYXKKw = true;
        Token.TokenType tokenType = token.copydefault;
        if (tokenType == Token.TokenType.StartTag) {
            Token.Dialog dialog = (Token.Dialog) token;
            this.djBIcL = dialog;
            if (dialog.EZpvd) {
                this.gEmmrt = false;
                return;
            }
            return;
        }
        if (tokenType != Token.TokenType.EndTag || ((Token.Application) token).AEQbTJ == null) {
            return;
        }
        KWHzl("Attributes incorrectly present on end tag");
    }

    public void copydefault(java.lang.String str) {
        this.KWHzl.append(str);
    }

    public void OLrzqt(char[] cArr) {
        this.KWHzl.append(cArr);
    }

    public void OLrzqt(char c) {
        this.KWHzl.append(c);
    }

    public void EZpvd(TokeniserState tokeniserState) {
        this.valueOf.copydefault();
        this.AkhnZx = tokeniserState;
    }

    public char[] EZpvd(java.lang.Character ch, boolean z) {
        int iIntValue;
        if (this.valueOf.AhwBna()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.valueOf.valueOf()) || this.valueOf.copydefault('\t', '\n', '\r', '\f', ' ', '<', '&')) {
            return null;
        }
        this.valueOf.djBIcL();
        if (this.valueOf.OLrzqt(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)) {
            boolean zCopydefault = this.valueOf.copydefault("X");
            C59950zsf c59950zsf = this.valueOf;
            java.lang.String strKWHzl = zCopydefault ? c59950zsf.KWHzl() : c59950zsf.EZpvd();
            if (strKWHzl.length() == 0) {
                AEQbTJ("numeric reference with no numerals");
                this.valueOf.AkhnZx();
                return null;
            }
            if (!this.valueOf.OLrzqt(";")) {
                AEQbTJ("missing semicolon");
            }
            try {
                iIntValue = java.lang.Integer.valueOf(strKWHzl, zCopydefault ? 16 : 10).intValue();
            } catch (java.lang.NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                AEQbTJ("character outside of valid range");
                return new char[]{Utf8.REPLACEMENT_CHARACTER};
            }
            return java.lang.Character.toChars(iIntValue);
        }
        java.lang.String strGEmmrt = this.valueOf.gEmmrt();
        boolean zAEQbTJ = this.valueOf.AEQbTJ(';');
        if (!Entities.AEQbTJ(strGEmmrt) && (!Entities.EZpvd(strGEmmrt) || !zAEQbTJ)) {
            this.valueOf.AkhnZx();
            if (zAEQbTJ) {
                AEQbTJ(java.lang.String.format("invalid named referenece '%s'", strGEmmrt));
            }
            return null;
        }
        if (z && (this.valueOf.DbNXlk() || this.valueOf.isConnected() || this.valueOf.copydefault('=', '-', '_'))) {
            this.valueOf.AkhnZx();
            return null;
        }
        if (!this.valueOf.OLrzqt(";")) {
            AEQbTJ("missing semicolon");
        }
        return new char[]{Entities.KWHzl(strGEmmrt).charValue()};
    }

    public Token.Fragment AEQbTJ(boolean z) {
        Token.Fragment dialog = z ? new Token.Dialog() : new Token.Application();
        this.DbNXlk = dialog;
        return dialog;
    }

    public void AYXKKw() {
        this.DbNXlk.fetchVPNInfo();
        KWHzl(this.DbNXlk);
    }

    public void OLrzqt() {
        this.AEQbTJ = new Token.TaskDescription();
    }

    public void djBIcL() {
        KWHzl(this.AEQbTJ);
    }

    public void EZpvd() {
        this.EZpvd = new Token.StateListAnimator();
    }

    public void valueOf() {
        KWHzl(this.EZpvd);
    }

    public void copydefault() {
        this.OLrzqt = new java.lang.StringBuilder();
    }

    public boolean AhwBna() {
        Token.Dialog dialog = this.djBIcL;
        if (dialog == null) {
            return false;
        }
        return this.DbNXlk.AhwBna.equals(dialog.AhwBna);
    }

    public java.lang.String KWHzl() {
        return this.djBIcL.AhwBna;
    }

    public void OLrzqt(TokeniserState tokeniserState) {
        if (this.AhwBna.canAddError()) {
            this.AhwBna.add(new C59947zsc(this.valueOf.fetchVPNInfo(), "Unexpected character '%s' in input state [%s]", java.lang.Character.valueOf(this.valueOf.valueOf()), tokeniserState));
        }
    }

    public void AEQbTJ(TokeniserState tokeniserState) {
        if (this.AhwBna.canAddError()) {
            this.AhwBna.add(new C59947zsc(this.valueOf.fetchVPNInfo(), "Unexpectedly reached end of file (EOF) in input state [%s]", tokeniserState));
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        if (this.AhwBna.canAddError()) {
            this.AhwBna.add(new C59947zsc(this.valueOf.fetchVPNInfo(), "Invalid character reference: %s", str));
        }
    }

    public final void KWHzl(java.lang.String str) {
        if (this.AhwBna.canAddError()) {
            this.AhwBna.add(new C59947zsc(this.valueOf.fetchVPNInfo(), str));
        }
    }
}
