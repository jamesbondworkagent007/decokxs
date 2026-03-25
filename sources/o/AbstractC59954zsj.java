package o;

import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Token;

/* JADX INFO: renamed from: o.zsj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC59954zsj {
    public ParseErrorList AkhnZx;
    public C59950zsf AuCTel;
    public java.lang.String DbNXlk;
    public C59953zsi ejfBZ;
    public DescendableLinkedList<C59946zsb> fIwbmz;
    public Token fetchVPNInfo;
    public Document isConnected;

    public abstract boolean OLrzqt(Token token);

    public void AEQbTJ(java.lang.String str, java.lang.String str2, ParseErrorList parseErrorList) {
        C59912zrU.EZpvd(str, "String input must not be null");
        C59912zrU.EZpvd(str2, "BaseURI must not be null");
        this.isConnected = new Document(str2);
        C59950zsf c59950zsf = new C59950zsf(str);
        this.AuCTel = c59950zsf;
        this.AkhnZx = parseErrorList;
        this.ejfBZ = new C59953zsi(c59950zsf, parseErrorList);
        this.fIwbmz = new DescendableLinkedList<>();
        this.DbNXlk = str2;
    }

    public Document EZpvd(java.lang.String str, java.lang.String str2, ParseErrorList parseErrorList) {
        AEQbTJ(str, str2, parseErrorList);
        iwGUEr();
        return this.isConnected;
    }

    public void iwGUEr() {
        Token tokenGEmmrt;
        do {
            tokenGEmmrt = this.ejfBZ.gEmmrt();
            OLrzqt(tokenGEmmrt);
        } while (tokenGEmmrt.copydefault != Token.TokenType.EOF);
    }

    public C59946zsb uzCIH() {
        return this.fIwbmz.getLast();
    }
}
