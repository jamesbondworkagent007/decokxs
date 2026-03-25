package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.LinkedList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.nodes.Document;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Token;
import org.jsoup.parser.TokeniserState;

/* JADX INFO: renamed from: o.zsg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C59951zsg extends AbstractC59954zsj {
    public C59946zsb AEQbTJ;
    public HtmlTreeBuilderState AhwBna;
    public C59946zsb copydefault;
    public C59946zsb djBIcL;
    public HtmlTreeBuilderState values;
    public boolean KWHzl = false;
    public DescendableLinkedList<C59946zsb> OLrzqt = new DescendableLinkedList<>();
    public java.util.List<Token.Activity> valueOf = new java.util.ArrayList();
    public boolean gEmmrt = true;
    public boolean EZpvd = false;
    public boolean AYXKKw = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void DbNXlk(C59946zsb c59946zsb) {
        this.djBIcL = c59946zsb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.values = htmlTreeBuilderState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59946zsb djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fARcdN() {
        this.AhwBna = this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HtmlTreeBuilderState fJNWhG() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<Token.Activity> fetchVPNInfo() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59946zsb gEmmrt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HtmlTreeBuilderState getNewProxyInstance() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DescendableLinkedList<C59946zsb> isConnected() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void isConnected(C59946zsb c59946zsb) {
        this.copydefault = c59946zsb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Document valueOf() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean values() {
        return this.EZpvd;
    }

    @Override // o.AbstractC59954zsj
    public Document EZpvd(java.lang.String str, java.lang.String str2, ParseErrorList parseErrorList) {
        this.values = HtmlTreeBuilderState.Initial;
        return super.EZpvd(str, str2, parseErrorList);
    }

    public java.util.List<AbstractC59916zrY> OLrzqt(java.lang.String str, C59946zsb c59946zsb, java.lang.String str2, ParseErrorList parseErrorList) {
        C59946zsb c59946zsb2;
        this.values = HtmlTreeBuilderState.Initial;
        AEQbTJ(str, str2, parseErrorList);
        this.AEQbTJ = c59946zsb;
        this.AYXKKw = true;
        if (c59946zsb != null) {
            if (c59946zsb.fJNWhG() != null) {
                this.isConnected.KWHzl(c59946zsb.fJNWhG().AYXKKw());
            }
            java.lang.String strIsConnected = c59946zsb.isConnected();
            if (C59910zrS.AEQbTJ(strIsConnected, "title", "textarea")) {
                this.ejfBZ.KWHzl(TokeniserState.Rcdata);
            } else if (C59910zrS.AEQbTJ(strIsConnected, "iframe", "noembed", "noframes", TtmlNode.TAG_STYLE, "xmp")) {
                this.ejfBZ.KWHzl(TokeniserState.Rawtext);
            } else if (strIsConnected.equals("script")) {
                this.ejfBZ.KWHzl(TokeniserState.ScriptData);
            } else if (!strIsConnected.equals("noscript") && strIsConnected.equals("plaintext")) {
                this.ejfBZ.KWHzl(TokeniserState.Data);
            } else {
                this.ejfBZ.KWHzl(TokeniserState.Data);
            }
            c59946zsb2 = new C59946zsb(C59949zse.EZpvd("html"), str2);
            this.isConnected.KWHzl(c59946zsb2);
            this.fIwbmz.push(c59946zsb2);
            hDKMBd();
        } else {
            c59946zsb2 = null;
        }
        iwGUEr();
        if (c59946zsb != null) {
            return c59946zsb2.fARcdN();
        }
        return this.isConnected.fARcdN();
    }

    @Override // o.AbstractC59954zsj
    public boolean OLrzqt(Token token) {
        this.fetchVPNInfo = token;
        return this.values.process(token, this);
    }

    public boolean EZpvd(Token token, HtmlTreeBuilderState htmlTreeBuilderState) {
        this.fetchVPNInfo = token;
        return htmlTreeBuilderState.process(token, this);
    }

    public void EZpvd(C59946zsb c59946zsb) {
        if (this.KWHzl) {
            return;
        }
        java.lang.String strOLrzqt = c59946zsb.OLrzqt("href");
        if (strOLrzqt.length() != 0) {
            this.DbNXlk = strOLrzqt;
            this.KWHzl = true;
            this.isConnected.gEmmrt(strOLrzqt);
        }
    }

    public void KWHzl(HtmlTreeBuilderState htmlTreeBuilderState) {
        if (this.AkhnZx.canAddError()) {
            this.AkhnZx.add(new C59947zsc(this.AuCTel.fetchVPNInfo(), "Unexpected token [%s] when in state [%s]", this.fetchVPNInfo.DbNXlk(), htmlTreeBuilderState));
        }
    }

    public C59946zsb copydefault(Token.Dialog dialog) {
        if (dialog.fIwbmz()) {
            C59946zsb c59946zsbKWHzl = KWHzl(dialog);
            this.fIwbmz.add(c59946zsbKWHzl);
            this.ejfBZ.KWHzl(new Token.Application(c59946zsbKWHzl.isConnected()));
            return c59946zsbKWHzl;
        }
        C59946zsb c59946zsb = new C59946zsb(C59949zse.EZpvd(dialog.AuCTel()), this.DbNXlk, dialog.AEQbTJ);
        KWHzl(c59946zsb);
        return c59946zsb;
    }

    public C59946zsb djBIcL(java.lang.String str) {
        C59946zsb c59946zsb = new C59946zsb(C59949zse.EZpvd(str), this.DbNXlk);
        KWHzl(c59946zsb);
        return c59946zsb;
    }

    public void KWHzl(C59946zsb c59946zsb) {
        AEQbTJ((AbstractC59916zrY) c59946zsb);
        this.fIwbmz.add(c59946zsb);
    }

    public C59946zsb KWHzl(Token.Dialog dialog) {
        C59949zse c59949zseEZpvd = C59949zse.EZpvd(dialog.AuCTel());
        C59946zsb c59946zsb = new C59946zsb(c59949zseEZpvd, this.DbNXlk, dialog.AEQbTJ);
        AEQbTJ((AbstractC59916zrY) c59946zsb);
        if (dialog.fIwbmz()) {
            if (c59949zseEZpvd.OLrzqt()) {
                if (c59949zseEZpvd.EZpvd()) {
                    this.ejfBZ.AEQbTJ();
                }
            } else {
                c59949zseEZpvd.djBIcL();
                this.ejfBZ.AEQbTJ();
            }
        }
        return c59946zsb;
    }

    public void OLrzqt(Token.TaskDescription taskDescription) {
        AEQbTJ(new C59914zrW(taskDescription.isConnected(), this.DbNXlk));
    }

    public void AEQbTJ(Token.Activity activity) {
        AbstractC59916zrY c59917zrZ;
        if (C59910zrS.AEQbTJ(uzCIH().isConnected(), "script", TtmlNode.TAG_STYLE)) {
            c59917zrZ = new C59915zrX(activity.values(), this.DbNXlk);
        } else {
            c59917zrZ = new C59917zrZ(activity.values(), this.DbNXlk);
        }
        uzCIH().KWHzl(c59917zrZ);
    }

    public final void AEQbTJ(AbstractC59916zrY abstractC59916zrY) {
        if (this.fIwbmz.size() == 0) {
            this.isConnected.KWHzl(abstractC59916zrY);
        } else if (values()) {
            copydefault(abstractC59916zrY);
        } else {
            uzCIH().KWHzl(abstractC59916zrY);
        }
    }

    public C59946zsb fIwbmz() {
        if (this.fIwbmz.peekLast().copydefault().equals("td") && !this.values.name().equals("InCell")) {
            C59912zrU.EZpvd(true, "pop td not in cell");
        }
        if (this.fIwbmz.peekLast().copydefault().equals("html")) {
            C59912zrU.EZpvd(true, "popping html!");
        }
        return this.fIwbmz.pollLast();
    }

    public void AYXKKw(C59946zsb c59946zsb) {
        this.fIwbmz.add(c59946zsb);
    }

    public boolean AhwBna(C59946zsb c59946zsb) {
        return AEQbTJ(this.fIwbmz, c59946zsb);
    }

    public final boolean AEQbTJ(DescendableLinkedList<C59946zsb> descendableLinkedList, C59946zsb c59946zsb) {
        java.util.Iterator<C59946zsb> itDescendingIterator = descendableLinkedList.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (itDescendingIterator.next() == c59946zsb) {
                return true;
            }
        }
        return false;
    }

    public C59946zsb copydefault(java.lang.String str) {
        java.util.Iterator<C59946zsb> itDescendingIterator = this.fIwbmz.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            C59946zsb next = itDescendingIterator.next();
            if (next.copydefault().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public boolean djBIcL(C59946zsb c59946zsb) {
        java.util.Iterator<C59946zsb> itDescendingIterator = this.fIwbmz.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (itDescendingIterator.next() == c59946zsb) {
                itDescendingIterator.remove();
                return true;
            }
        }
        return false;
    }

    public void DbNXlk(java.lang.String str) {
        java.util.Iterator<C59946zsb> itDescendingIterator = this.fIwbmz.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (itDescendingIterator.next().copydefault().equals(str)) {
                itDescendingIterator.remove();
                return;
            }
            itDescendingIterator.remove();
        }
    }

    public void OLrzqt(java.lang.String... strArr) {
        java.util.Iterator<C59946zsb> itDescendingIterator = this.fIwbmz.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (C59910zrS.AEQbTJ(itDescendingIterator.next().copydefault(), strArr)) {
                itDescendingIterator.remove();
                return;
            }
            itDescendingIterator.remove();
        }
    }

    public void AYXKKw(java.lang.String str) {
        java.util.Iterator<C59946zsb> itDescendingIterator = this.fIwbmz.descendingIterator();
        while (itDescendingIterator.hasNext() && !itDescendingIterator.next().copydefault().equals(str)) {
            itDescendingIterator.remove();
        }
    }

    public void copydefault() {
        AEQbTJ("table");
    }

    public void AEQbTJ() {
        AEQbTJ("tbody", "tfoot", "thead");
    }

    public void KWHzl() {
        AEQbTJ("tr");
    }

    public final void AEQbTJ(java.lang.String... strArr) {
        java.util.Iterator<C59946zsb> itDescendingIterator = this.fIwbmz.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            C59946zsb next = itDescendingIterator.next();
            if (C59910zrS.AEQbTJ(next.copydefault(), strArr) || next.copydefault().equals("html")) {
                return;
            } else {
                itDescendingIterator.remove();
            }
        }
    }

    public C59946zsb copydefault(C59946zsb c59946zsb) {
        java.util.Iterator<C59946zsb> itDescendingIterator = this.fIwbmz.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (itDescendingIterator.next() == c59946zsb) {
                return itDescendingIterator.next();
            }
        }
        return null;
    }

    public void OLrzqt(C59946zsb c59946zsb, C59946zsb c59946zsb2) {
        int iLastIndexOf = this.fIwbmz.lastIndexOf(c59946zsb);
        C59912zrU.KWHzl(iLastIndexOf != -1);
        this.fIwbmz.add(iLastIndexOf + 1, c59946zsb2);
    }

    public void AEQbTJ(C59946zsb c59946zsb, C59946zsb c59946zsb2) {
        OLrzqt(this.fIwbmz, c59946zsb, c59946zsb2);
    }

    public final void OLrzqt(LinkedList<C59946zsb> linkedList, C59946zsb c59946zsb, C59946zsb c59946zsb2) {
        int iLastIndexOf = linkedList.lastIndexOf(c59946zsb);
        C59912zrU.KWHzl(iLastIndexOf != -1);
        linkedList.remove(iLastIndexOf);
        linkedList.add(iLastIndexOf, c59946zsb2);
    }

    public void hDKMBd() {
        java.util.Iterator<C59946zsb> itDescendingIterator = this.fIwbmz.descendingIterator();
        boolean z = false;
        while (itDescendingIterator.hasNext()) {
            C59946zsb next = itDescendingIterator.next();
            if (!itDescendingIterator.hasNext()) {
                next = this.AEQbTJ;
                z = true;
            }
            java.lang.String strCopydefault = next.copydefault();
            if ("select".equals(strCopydefault)) {
                OLrzqt(HtmlTreeBuilderState.InSelect);
                return;
            }
            if ("td".equals(strCopydefault) || ("td".equals(strCopydefault) && !z)) {
                OLrzqt(HtmlTreeBuilderState.InCell);
                return;
            }
            if ("tr".equals(strCopydefault)) {
                OLrzqt(HtmlTreeBuilderState.InRow);
                return;
            }
            if ("tbody".equals(strCopydefault) || "thead".equals(strCopydefault) || "tfoot".equals(strCopydefault)) {
                OLrzqt(HtmlTreeBuilderState.InTableBody);
                return;
            }
            if ("caption".equals(strCopydefault)) {
                OLrzqt(HtmlTreeBuilderState.InCaption);
                return;
            }
            if ("colgroup".equals(strCopydefault)) {
                OLrzqt(HtmlTreeBuilderState.InColumnGroup);
                return;
            }
            if ("table".equals(strCopydefault)) {
                OLrzqt(HtmlTreeBuilderState.InTable);
                return;
            }
            if (TtmlNode.TAG_HEAD.equals(strCopydefault)) {
                OLrzqt(HtmlTreeBuilderState.InBody);
                return;
            }
            if ("body".equals(strCopydefault)) {
                OLrzqt(HtmlTreeBuilderState.InBody);
                return;
            }
            if ("frameset".equals(strCopydefault)) {
                OLrzqt(HtmlTreeBuilderState.InFrameset);
                return;
            } else if ("html".equals(strCopydefault)) {
                OLrzqt(HtmlTreeBuilderState.BeforeHead);
                return;
            } else if (z) {
                OLrzqt(HtmlTreeBuilderState.InBody);
                return;
            }
        }
    }

    public final boolean copydefault(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2) {
        return KWHzl(new java.lang.String[]{str}, strArr, strArr2);
    }

    public final boolean KWHzl(java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String[] strArr3) {
        java.util.Iterator<C59946zsb> itDescendingIterator = this.fIwbmz.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            java.lang.String strCopydefault = itDescendingIterator.next().copydefault();
            if (C59910zrS.AEQbTJ(strCopydefault, strArr)) {
                return true;
            }
            if (C59910zrS.AEQbTJ(strCopydefault, strArr2)) {
                return false;
            }
            if (strArr3 != null && C59910zrS.AEQbTJ(strCopydefault, strArr3)) {
                return false;
            }
        }
        C59912zrU.KWHzl("Should not be reachable");
        return false;
    }

    public boolean KWHzl(java.lang.String[] strArr) {
        return KWHzl(strArr, new java.lang.String[]{"applet", "caption", "html", "table", "td", "th", "marquee", "object"}, null);
    }

    public boolean AhwBna(java.lang.String str) {
        return OLrzqt(str, (java.lang.String[]) null);
    }

    public boolean OLrzqt(java.lang.String str, java.lang.String[] strArr) {
        return copydefault(str, new java.lang.String[]{"applet", "caption", "html", "table", "td", "th", "marquee", "object"}, strArr);
    }

    public boolean AEQbTJ(java.lang.String str) {
        return OLrzqt(str, new java.lang.String[]{"ol", "ul"});
    }

    public boolean KWHzl(java.lang.String str) {
        return OLrzqt(str, new java.lang.String[]{"button"});
    }

    public boolean gEmmrt(java.lang.String str) {
        return copydefault(str, new java.lang.String[]{"html", "table"}, null);
    }

    public boolean valueOf(java.lang.String str) {
        java.util.Iterator<C59946zsb> itDescendingIterator = this.fIwbmz.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            java.lang.String strCopydefault = itDescendingIterator.next().copydefault();
            if (strCopydefault.equals(str)) {
                return true;
            }
            if (!C59910zrS.AEQbTJ(strCopydefault, "optgroup", "option")) {
                return false;
            }
        }
        C59912zrU.KWHzl("Should not be reachable");
        return false;
    }

    public void AuCTel() {
        this.valueOf = new java.util.ArrayList();
    }

    public void OLrzqt(java.lang.String str) {
        while (str != null && !uzCIH().copydefault().equals(str) && C59910zrS.AEQbTJ(uzCIH().copydefault(), "dd", "dt", "li", "option", "optgroup", TtmlNode.TAG_P, "rp", "rt")) {
            fIwbmz();
        }
    }

    public void AhwBna() {
        OLrzqt((java.lang.String) null);
    }

    public boolean AEQbTJ(C59946zsb c59946zsb) {
        return C59910zrS.AEQbTJ(c59946zsb.copydefault(), WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "applet", OtcExtraKeys.AREA, "article", "aside", TtmlNode.RUBY_BASE, "basefont", "bgsound", "blockquote", "body", TtmlNode.TAG_BR, "button", "caption", TtmlNode.CENTER, "col", "colgroup", "command", "dd", "details", "dir", TtmlNode.TAG_DIV, "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", TypedValues.AttributesType.S_FRAME, "frameset", "h1", "h2", "h3", "h4", "h5", "h6", TtmlNode.TAG_HEAD, "header", "hgroup", "hr", "html", "iframe", "img", Web3SecurityTrackEvent.VALUE_INPUT, "isindex", "li", "link", "listing", "marquee", "menu", "meta", OtcRouteConst.MAIN_ROUTE_NAV, "noembed", "noframes", "noscript", "object", "ol", TtmlNode.TAG_P, "param", "plaintext", "pre", "script", "section", "select", TtmlNode.TAG_STYLE, "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp");
    }

    public void valueOf(C59946zsb c59946zsb) {
        C59946zsb next;
        java.util.Iterator<C59946zsb> itDescendingIterator = this.OLrzqt.descendingIterator();
        int i = 0;
        while (true) {
            if (!itDescendingIterator.hasNext() || (next = itDescendingIterator.next()) == null) {
                break;
            }
            if (KWHzl(c59946zsb, next)) {
                i++;
            }
            if (i == 3) {
                itDescendingIterator.remove();
                break;
            }
        }
        this.OLrzqt.add(c59946zsb);
    }

    public final boolean KWHzl(C59946zsb c59946zsb, C59946zsb c59946zsb2) {
        return c59946zsb.copydefault().equals(c59946zsb2.copydefault()) && c59946zsb.DbNXlk().equals(c59946zsb2.DbNXlk());
    }

    /* JADX DEBUG: Duplicate block (B:16:0x003f) to fix multi-entry loop: BACK_EDGE: B:20:0x006e -> B:16:0x003f */
    public void ejfBZ() {
        int size = this.OLrzqt.size();
        if (size == 0 || this.OLrzqt.getLast() == null || AhwBna(this.OLrzqt.getLast())) {
            return;
        }
        C59946zsb last = this.OLrzqt.getLast();
        boolean z = true;
        int i = size - 1;
        int i2 = i;
        while (i2 != 0) {
            i2--;
            last = this.OLrzqt.get(i2);
            if (last == null || AhwBna(last)) {
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i2++;
                last = this.OLrzqt.get(i2);
            }
            C59912zrU.KWHzl(last);
            C59946zsb c59946zsbDjBIcL = djBIcL(last.copydefault());
            c59946zsbDjBIcL.DbNXlk().AEQbTJ(last.DbNXlk());
            this.OLrzqt.add(i2, c59946zsbDjBIcL);
            this.OLrzqt.remove(i2 + 1);
            if (i2 == i) {
                return;
            } else {
                z = false;
            }
        }
    }

    public void EZpvd() {
        while (!this.OLrzqt.isEmpty()) {
            C59946zsb c59946zsbPeekLast = this.OLrzqt.peekLast();
            this.OLrzqt.removeLast();
            if (c59946zsbPeekLast == null) {
                return;
            }
        }
    }

    public void gEmmrt(C59946zsb c59946zsb) {
        java.util.Iterator<C59946zsb> itDescendingIterator = this.OLrzqt.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (itDescendingIterator.next() == c59946zsb) {
                itDescendingIterator.remove();
                return;
            }
        }
    }

    public boolean OLrzqt(C59946zsb c59946zsb) {
        return AEQbTJ(this.OLrzqt, c59946zsb);
    }

    public C59946zsb EZpvd(java.lang.String str) {
        C59946zsb next;
        java.util.Iterator<C59946zsb> itDescendingIterator = this.OLrzqt.descendingIterator();
        while (itDescendingIterator.hasNext() && (next = itDescendingIterator.next()) != null) {
            if (next.copydefault().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public void copydefault(C59946zsb c59946zsb, C59946zsb c59946zsb2) {
        OLrzqt(this.OLrzqt, c59946zsb, c59946zsb2);
    }

    public void DbNXlk() {
        this.OLrzqt.add(null);
    }

    public void copydefault(AbstractC59916zrY abstractC59916zrY) {
        C59946zsb c59946zsbCopydefault;
        C59946zsb c59946zsbCopydefault2 = copydefault("table");
        boolean z = false;
        if (c59946zsbCopydefault2 != null) {
            if (c59946zsbCopydefault2.AhwBna() != null) {
                c59946zsbCopydefault = c59946zsbCopydefault2.AhwBna();
                z = true;
            } else {
                c59946zsbCopydefault = copydefault(c59946zsbCopydefault2);
            }
        } else {
            c59946zsbCopydefault = this.fIwbmz.get(0);
        }
        if (z) {
            C59912zrU.KWHzl(c59946zsbCopydefault2);
            c59946zsbCopydefault2.AEQbTJ(abstractC59916zrY);
        } else {
            c59946zsbCopydefault.KWHzl(abstractC59916zrY);
        }
    }

    public java.lang.String toString() {
        return "TreeBuilder{currentToken=" + this.fetchVPNInfo + ", state=" + this.values + ", currentElement=" + uzCIH() + AbstractJsonLexerKt.END_OBJ;
    }
}
